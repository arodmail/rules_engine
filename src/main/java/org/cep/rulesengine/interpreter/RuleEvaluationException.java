package org.cep.rulesengine.interpreter;

/**
 * Thrown in cases where rule evaluation fails.
 *
 * @author A. Rodriguez
 */
public class RuleEvaluationException extends Exception {

    /**
     * Creates a new RuleEvaluationException with the given message.
     */
    public RuleEvaluationException(String message) {
        super(message);
    }

    private static final long serialVersionUID = -6982029352128514248L;

}
