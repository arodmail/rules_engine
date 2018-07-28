package org.cep.rulesengine.model;

import org.cep.rulesengine.interpreter.EvaluationContext;
import org.cep.rulesengine.interpreter.RuleEvaluationException;

/**
 * A SingleStatement is a self evaluating object representing a rule made
 * up of one condition (or expression), of the form <tt>if (prop=value) then action</tt>
 * as defined by the rule language grammar. A SingleStatement evaluates to true
 * when its condition or expression is true.
 *
 * @author A. Rodriguez
 */
public class SingleStatement extends RuleStatement {

    /**
     * Default no-arg constructor. Creates an empty SingleStatement (without a
     * RuleCondition).
     */
    public SingleStatement() {
        super();
    }

    /**
     * Creates an SingleStatement with the given RuleCondition.
     *
     * @param condition a {@link RuleCondition} whose constraints must be true
     *                  for this statement to evaluate to true.
     */
    public SingleStatement(RuleCondition condition, RuleAction action) {
        super(new RuleSubConditions(condition), new RuleActions(action));
    }

    /**
     * Returns true if the statement evaluates to true.
     *
     * @param context an EvaluationContext, or what to evaluate.
     * @return true if the property values in the <tt>context</tt> match
     * the constraints in the conditions in this statement.
     */
    public boolean evaluate(EvaluationContext context)
            throws RuleEvaluationException {
        boolean result = false;
        for (int i = 0; i < conditions.size(); i++) {
            RuleCondition condition = conditions.get(i);
            result = condition.evaluate(context);
        }
        return result;
    }

    /**
     * Returns the String representation of an AndStatement.
     */
    public String toString() {
        StringBuffer buff = new StringBuffer();
        buff.append("if");
        buff.append(conditions.toString());
        if (actions.size() > 0) {
            buff.append("{ ");
            buff.append(actions.toString());
            buff.append(" } ");
        }
        return buff.toString();
    }

}
