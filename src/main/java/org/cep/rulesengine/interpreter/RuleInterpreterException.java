package org.cep.rulesengine.interpreter;

import org.cep.rulesengine.RuleException;

/**
 * Thrown in cases where rule interpretation fails.
 *
 * @author A. Rodriguez
 */
public class RuleInterpreterException extends RuleException {

    public RuleInterpreterException(String message) {
        super(message);
    }

}
