package org.cep.rulesengine.model;

import org.cep.rulesengine.interpreter.EvaluationContext;
import org.cep.rulesengine.interpreter.Property;
import org.cep.rulesengine.interpreter.PropertySet;
import org.cep.rulesengine.interpreter.RuleEvaluationException;

/**
 * Represents a statement to allow a block of code to be executed repeatedly for
 * some iteration. Includes a counter to allow the code inside the loop to know
 * about the number of iterations. The for loop in rule language is a
 * three-parameter loop control expression that consists of an initializer,
 * a loop-test, and a counting expression.
 *
 * <tt>
 * for (int i = 0; i < 10; i++) {
 * doSomething
 * }
 * </tt>
 *
 * @author A. Rodriguez
 */
public class ForStatement extends RuleStatement {

    /**
     * The loop control expression, typically an integer variable assignment.
     */
    public RuleVariable var;

    /**
     * The loop test.
     */
    public RuleCondition loopTest;

    /**
     * The counting expression that is evaluated at the end of each loop iteration.
     */
    public CountingExpression counter;

    /**
     * Creates a new ForStatement with the given for loop parameters.
     */
    public ForStatement(RuleVariable var, RuleCondition loopTest,
                        CountingExpression counter) {
        this.var = var;
        this.loopTest = loopTest;
        this.counter = counter;
    }

    /**
     * Evaluates the ForStatement.
     */
    public boolean evaluate(EvaluationContext context)
            throws RuleEvaluationException {

        PropertySet propSet = new PropertySet();
        Property prop = new Property("count", var.getValue());
        propSet.add(prop);
        context.setMetaProperties(propSet);

        while (loopTest.evaluate(context)) {

            RuleSubStatements statements = super.statements;
            RulePartIterator it = statements.iterator();
            while (it.hasNext()) {
                RuleStatement statement = (RuleStatement) it.next();
                statement.evaluate(context);
            }

            // increment loop counter by 1
            prop.setPropertyValue(counter.evaluate(context));

            // pass i into context for subsequent statements to see
            context.getMetaProperties().set(prop);

        }

        return true;

    }

}