package org.cep.rulesengine.model;

/**
 * Represents an initialized or uninitialized variable in a rule. Stores a value
 * for the result of evaluating a RuleExpression the variable points to.
 *
 * @author A. Rodriguez
 */
public class RuleVariable extends RuleExpression {

    /**
     * Stores a variable name.
     */
    public String varName = "";

    /**
     * Stores a variable value.
     */
    public Object varVal = null;

    /**
     * Creates a new RuleVariable. Scoping is determined by the variable's parent,
     * which may be a RuleStatement.
     */
    public RuleVariable(String name, Object value) {
        this.varName = name;
        this.varVal = value; // if value is null, the variable is uninitialized
    }

    /**
     * Returns the name of the variable.
     */
    public String getName() {
        return this.varName;
    }

    /**
     * Returns this variable's value;
     */
    public Object getValue() {
        return this.varVal;
    }

    /**
     * Sets the variable's value.
     */
    public void setValue(Object varVal) {
        this.varVal = varVal;
    }

}