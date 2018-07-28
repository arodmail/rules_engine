package org.cep.rulesengine.model;

import org.cep.rulesengine.interpreter.EvaluationContext;
import org.cep.rulesengine.interpreter.RuleEvaluationException;

/**
 * Base class for all RuleExpression
 *
 * @author A. Rodriguez
 */
public abstract class RuleExpression {

    /**
     * Returns the result of evaluating the expression.
     */
    public Object evaluate(EvaluationContext context)
            throws RuleEvaluationException {
        return null;
    }

}
