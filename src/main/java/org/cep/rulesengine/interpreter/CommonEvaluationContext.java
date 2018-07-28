package org.cep.rulesengine.interpreter;

import org.cep.rulesengine.compare.ComparableFactory;

/**
 * A CommonEvaluationContext is an EvaluationContext with a ComparableFactory
 * attached to it. By default, this factory tries to find syntaxes by
 * querying data services and returns a Java Comparable mapped to the
 * syntax which is used as the basis for = <= and >= comparisons during
 * rule evaluation.
 *
 * @see org.cep.rulesengine.compare.ComparableFactory
 *
 * @author A. Rodriguez
 */
public class CommonEvaluationContext implements EvaluationContext {

    /**
     * The context of rule evaluation (what, or whom to evaluate, the evaluatee,
     * so to speak).
     */
    private PropertySet properties;

    /**
     * Meta-data used at evaluation time (in some cases, how to evaluate).
     */
    private PropertySet metaProps;

    /**
     * A factory to create a Comparable, given a syntax name, and to return
     * a syntax oid given an attribute name.
     */
    private ComparableFactory factory;

    /**
     * The name of the content type.
     */
    private String contentType;

    /**
     * Default no-arg constructor.
     */
    public CommonEvaluationContext() {
    }

    /**
     * Creates a CommonEvaluationContext with the PropertySet given.
     *
     * @param properties a PropertySet of a Content Item.
     */
    public CommonEvaluationContext(PropertySet properties) {
        this.properties = properties;
    }

    /**
     * Returns the PropertySet for this EvaluationContext
     */
    public PropertySet getPropertySet() {
        return properties;
    }

    /**
     * Assigns an PropertySet to this EvaluationContext
     */
    public void setPropertySet(PropertySet properties) {
        this.properties = properties;
    }

    /**
     * Assigns a PropertySet to the EvaluationContext that holds meta-data used
     * at evaluation time.
     */
    public PropertySet getMetaProperties() {
        return this.metaProps;
    }

    /**
     * Assigns a PropertySet to the EvaluationContext to hold meta-data used at
     * evaluation time.
     */
    public void setMetaProperties(PropertySet metaProps) {
        this.metaProps = metaProps;
    }


    /**
     * Returns the ComparableFactory assigned to this EvaluationContext.
     */
    public ComparableFactory getComparableFactory() {
        return this.factory;
    }

    /**
     * Assigns a ComparableFactory to this EvaluationContext.
     */
    public void setComparableFactory(ComparableFactory factory) {
        this.factory = factory;
    }


    /**
     * Sets the content type for this EvaluationContext
     *
     * @param contentType the name of a CTD
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * Gets the content type for this EvaluationContext
     *
     * @return contentType the name of a CTD
     */
    public String getContentType() {
        return this.contentType;
    }

}
