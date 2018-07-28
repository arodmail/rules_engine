package org.cep.rulesengine.compare;

/**
 * A ComparableFactory provides a mapping between syntaxes (data types) and
 * Java classes that implement the Comparable interface.
 *
 * @author A. Rodriguez
 */
public interface ComparableFactory {

    /**
     * Returns the Comparable mapped to the syntax name given.
     */
    public Class<?> getComparableFromSyntaxName(String syntaxName);

    /**
     * Returns syntax name for the property name given.
     */
    public String getSyntaxFromPropertyName(String propertyName);

    /**
     * Returns syntax name for the property name given.
     */
    public String getSyntaxFromContentTypeAndPropertyName(String contentType,
                                                          String propertyName);

}
