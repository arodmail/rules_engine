package org.cep.rulesengine;

/**
 * Thrown by the RulesEngine if an error prevents executing rules.
 *
 * @author A. Rodriguez
 */
public class RuleExecutionException extends RuleException {

    public RuleExecutionException(String message) {
        super(message);
    }

}
