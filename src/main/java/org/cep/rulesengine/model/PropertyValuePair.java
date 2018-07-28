package org.cep.rulesengine.model;

/**
 * Holder for a property/value pair.
 *
 * @author A. Rodriguez
 */
public class PropertyValuePair {

    String property = "";
    String value = "";

    /**
     * Creates a new, empty PropertyValuePair.
     */
    public PropertyValuePair() {
    }

    /**
     * Creates a new PropertyValuePair
     */
    public PropertyValuePair(String property, String value) {
        this.property = property;
        this.value = value;
    }

    /**
     * Gets the property
     */
    public String getProperty() {
        return property;
    }

    /**
     * Gets the value
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the property
     */
    public void setProperty(String property) {
        this.property = property;
    }

    /**
     * Sets the value
     */
    public void setValue(String value) {
        this.value = value;
    }

}
