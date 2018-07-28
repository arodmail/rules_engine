package org.cep.rulesengine.model;

import org.cep.rulesengine.interpreter.EvaluationContext;

/**
 * Represents an assignment expression of the form
 *
 * <tt>var = expression</tt>
 * <p>
 * Stores a value for the result of evaluating a RuleExpression.
 *
 * @author A. Rodriguez
 */
public class AssignmentExpression extends RuleExpression {

    /**
     * The left side of the equals sign in the assignment expression.
     */
    public RuleVariable var;

    /**
     * An expression that evaluates to an Object.
     */
    public RuleExpression expr;

    /**
     * Creates a new AssignmentExpression.
     *
     * @param var  the name of the variable in the expression, this is the
     *             String on the left side of the equals sign.
     * @param expr the expression on the right side of the equals sign.
     */
    public AssignmentExpression(RuleVariable var, RuleExpression expr) {
        this.var = var; // wait to initialize until eval time
        this.expr = expr;
    }

    /**
     * Returns the result of assigning a value to the expression.
     */
    public Object evaluate(EvaluationContext context) {

        try {

            // if null, then assign a value, else, replace (re-assign) the value
            var.setValue(expr.evaluate(context));

        } catch (Exception e) {
            e.printStackTrace();
        }

        return var.getValue();

    }

}