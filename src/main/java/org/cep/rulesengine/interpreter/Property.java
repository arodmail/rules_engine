package org.cep.rulesengine.interpreter;

/**
 * Place-holder object for a content type property.
 *
 *  @author A. Rodriguez
 */
public class Property {

    private String propertyName;
    private Object propertyValue;

    /**
     * Creates a new, empty Property.
     */
    public Property() {
    }

    /**
     * Creates a new Property.
     *
     * @param propertyName  the name of the property.
     * @param propertyValue the property value.
     */
    public Property(String propertyName, Object propertyValue) {
        this.propertyName = propertyName;
        this.propertyValue = propertyValue;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyValue(Object propertyValue) {
        this.propertyValue = propertyValue;
    }

    public Object getPropertyValue() {
        return propertyValue;
    }

    public String toString() {
        return this.propertyName + "=" + this.propertyValue;
    }

}
