package org.cep.rulesengine;

/**
 * A base Exception for the <tt>rules engine</tt> package.
 *
 * @author A. Rodriguez
 */
public class RuleException extends Exception {

    String message = "";

    public RuleException(String message) {
        this.message = message;
    }

}
