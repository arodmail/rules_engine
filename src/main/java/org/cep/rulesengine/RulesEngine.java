package org.cep.rulesengine;

import java.util.ArrayList;
import java.util.List;

import org.cep.rulesengine.compare.DB2ComparableFactory;
import org.cep.rulesengine.interpreter.CommonEvaluationContext;
import org.cep.rulesengine.interpreter.Property;
import org.cep.rulesengine.interpreter.PropertySet;
import org.cep.rulesengine.interpreter.RuleInterpreter;
import org.cep.rulesengine.model.*;

/**
 * The core class for the rulesengine package.
 *
 * @author A. Rodriguez
 */
public class RulesEngine {

    // known meta-data property names
    private static final String TRUE = "true";
    private static final String ACTIVE = "1";
    private static final String IS_COMPOUND = "is_compound";

    /**
     * Executes Rules that are applicable to the given event.
     *
     * @param event used as the context for executing one or more Rules.
     * @throws RuleExecutionException if any error prevents executing rules.
     */
    public List<Object> executeRules(Object event)
            throws RuleExecutionException {

        Event context;
        if (event instanceof Event) {
            context = (Event) event;
        } else {
            throw new RuleExecutionException("Invalid RuleEngine context. Expecting " +
                    "instance of Event, found " + event.getClass());
        }

        RuleCache cache = RuleCache.getInstance();
        List<Rule> rules = cache.getRulesByTarget(context.getEventType());

        if (!rules.isEmpty()) {

            return processRules(rules, context);

        } else {
            // lookup applicable rules using RuleManager
            RuleManager ruleManager = new RuleManager();
            rules = ruleManager.getApplicableRules(context);

            if (!rules.isEmpty()) {
                // prime the cache
                cache.putAll(rules);

                return processRules(rules, context);

            } else {
                // no applicable rules are found, nothing to do
            }
        }

        return new ArrayList<>(); // empty result

    }

    private List<Object> processRules(List<Rule> rules, Event event)
            throws RuleExecutionException {

        // loop through applicable rules
        for (Rule rule : rules) {

            if (rule.getRuleStatus().equals(ACTIVE)) { // is active

                // for each, invoke the interpreter, passing the event
                // properties as context for rule interpretation
                try {
                    RuleInterpreter interpreter = new RuleInterpreter(rule.getRuleStatementString());

                    // normalize properties for interpretation sequence
                    PropertySet propertySet = new PropertySet();
                    String[] propertyNames = event.getPropertyNames();

                    for (String propertyName : propertyNames) {
                        String propertyValue = event.getProperty(propertyName);
                        propertySet.add(new Property(propertyName, propertyValue));
                    }

                    CommonEvaluationContext evaluationContext = new CommonEvaluationContext(propertySet);
                    evaluationContext.setComparableFactory(new DB2ComparableFactory());
                    evaluationContext.setMetaProperties(rule.getMetaProperties());
                    evaluationContext.getMetaProperties().add(new Property(RuleManager.RULE_NAME, rule.getRuleName()));

                    evaluationContext.setContentType(event.getEventType());

                    // the big moment
                    boolean result = interpreter.interpret(evaluationContext);

                    if (result) {

                        // execute the rule action(s)
                        RuleStatement statement = interpreter.statement;
                        RuleActions actions = statement.getActions();

                        RulePartIterator it = actions.iterator();
                        while (it.hasNext()) {

                            RuleAction action = (RuleAction) it.next();
                            action.execute(evaluationContext, null);
                        }

                        // execute sub-actions
                        actions = statement.getSubActions();

                        it = actions.iterator();
                        while (it.hasNext()) {

                            RuleAction action = (RuleAction) it.next();
                            action.execute(evaluationContext, null);
                        }

                        // if compound alert rule, execute
                        if (rule.getMetaProperty(IS_COMPOUND) != null
                                && rule.getMetaProperty(IS_COMPOUND).equals(TRUE)) {

                            CompoundAlertAction compoundAlertAction = new CompoundAlertAction();
                            List<Event> alertPrimitives = new ArrayList<>();
                            statement.getLookupResults(statement, alertPrimitives);
                            compoundAlertAction.execute(evaluationContext, alertPrimitives);

                        }

                    }

                } catch (Exception e) {
                    throw new RuleExecutionException(e.getMessage());
                }
            }
        }

        return new ArrayList<>();

    }

}
