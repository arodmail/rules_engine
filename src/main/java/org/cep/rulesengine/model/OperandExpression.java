package org.cep.rulesengine.model;

import org.cep.rulesengine.interpreter.EvaluationContext;
import org.cep.rulesengine.interpreter.RuleEvaluationException;

import java.util.ArrayList;

/**
 * Consists of two operands separated by an operator. Does basic arithmetic. Is recursive.
 *
 * @author A. Rodriguez
 */
public class OperandExpression extends RuleExpression {

    ArrayList<OperandExpression> operandExpressions = new ArrayList<OperandExpression>();

    public static final String MINUS = "-";
    public static final String PLUS = "+";
    public static final String PROD = "*";
    public static final String DIV = "/";

    public String operator = "";

    /**
     * Returns the result of evaluating the expression.
     *
     * @throws RuleEvaluationException
     */
    public Object evaluate(EvaluationContext context)
            throws RuleEvaluationException {
        return null;
    }

    /**
     * Sets the operator for this OperandExpression. One of MINUS, PLUS, PROD, or DIV.
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

}
