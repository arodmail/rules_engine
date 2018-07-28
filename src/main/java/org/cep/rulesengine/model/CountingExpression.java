package org.cep.rulesengine.model;

import org.cep.rulesengine.interpreter.EvaluationContext;

/**
 * A counter. Used to increment to decrement a value by one.
 *
 * @author A. Rodriguez
 */
public class CountingExpression extends RuleExpression {

    /**
     * Used to count up.
     */
    private static final int UP = 1;

    /**
     * Used to count down.
     */
    private static final int DOWN = 2;

    /**
     * Plus-plus
     */
    private static final String PLUSPLUS = "++";

    /**
     * Minus-minus
     */
    private static final String MINUSMINUS = "--";

    /**
     * Counts up by default;
     */
    private int type = 1;

    /**
     * The RuleVariable to increment or decrement.
     */
    private RuleVariable var;

    /**
     * Creates a new CountingExpression.
     */
    public CountingExpression(RuleVariable var, String counterType) {
        if (counterType.equals(PLUSPLUS)) type = UP;
        if (counterType.equals(MINUSMINUS)) type = DOWN;
    }

    /**
     * Evaluates the counter expression by incrementing or decrementing the
     * expression's RuleVariable by one.
     */
    public Object evaluate(EvaluationContext context) {

        Integer val = (Integer) var.getValue(); // assume an int
        if (type == UP)
            val = val++;
        if (type == DOWN)
            val = val--;

        var.setValue(val);
        return val;

    }

}