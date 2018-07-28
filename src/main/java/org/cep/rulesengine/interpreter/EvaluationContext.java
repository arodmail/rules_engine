package org.cep.rulesengine.interpreter;

/**
 * An EvaluationContext is an input into RuleInterpreter.interpret().
 * The context should contain the Properties of a Content Item.
 * An EvaluationContext tells the interpreter what to evaluate, or the context
 * against which to evaluate the constraints in the conditions in a rule.
 *
 * @author A. Rodriguez
 */
public interface EvaluationContext {

    /**
     * Returns the EvaluationContext PropertySet.
     *
     * @return the PropertySet in this EvaluationContext.
     */
    public PropertySet getPropertySet();

    /**
     * Assigns a PropertySet to the EvaluationContext.
     *
     * @param properties the PropertySet to assign to this
     *                   EvaluationContext.
     */
    public void setPropertySet(PropertySet properties);

    /**
     * Assigns a PropertySet to the EvaluationContext that holds meta-data used
     * at evaluation time.
     *
     * @return PropertySet the PropertySet to get from this
     * EvaluationContext.
     */
    public PropertySet getMetaProperties();

    /**
     * Assigns a PropertySet to the EvaluationContext to hold meta-data used at
     * evaluation time.
     *
     * @param metaProps the PropertySet to assign to this
     *                  EvaluationContext.
     */
    public void setMetaProperties(PropertySet metaProps);

    /**
     * Sets the content type for this EvaluationContext
     *
     * @param contentType the name of a CTD
     */
    public void setContentType(String contentType);

    /**
     * Gets the content type for this EvaluationContext
     *
     * @return contentType the name of a CTD
     */
    public String getContentType();

}

