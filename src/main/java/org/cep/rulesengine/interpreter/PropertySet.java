package org.cep.rulesengine.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * Place-holder object for a set of properties, or all properties of a content item.
 *
 * @author A. Rodriguez
 */
public class PropertySet {

    private List<Property> properties = new ArrayList<Property>();

    /**
     * Creates a new, empty PropertySet;
     */
    public PropertySet() {

    }

    /**
     * Creates a new PropertySet
     *
     * @param properties the properties to put in this PropertySet
     */
    public PropertySet(List<Property> properties) {
        this.properties = properties;
    }

    /**
     * Returns all Property in this PropertySet
     *
     * @return List of Property
     */
    public List<Property> getProperties() {
        return properties;
    }

    /**
     * Sets all Property for this PropertySet
     *
     * @param properties the properties to set
     */
    public void addProperties(List<Property> properties) {
        this.properties = properties;
    }

    /**
     * Sets all Property for this PropertySet
     *
     * @param property the properties to set
     */
    public void add(Property property) {
        this.properties.add(property);
    }

    /**
     * Sets (replaces) a Property in this PropertySet
     *
     * @param property the property to set/replace
     */
    public void set(Property property) {
        for (Property prop : properties) {
            if (prop.getPropertyName().equals(property.getPropertyName())) {
                prop.setPropertyValue(property.getPropertyValue());
            }
        }
    }

    /**
     * Returns the Property value for the <tt>propertyName</tt> specified.
     *
     * @param propertyName a property name
     * @return a property value
     */
    public Property get(String propertyName) {
        for (Property property : properties) {
            if (property.getPropertyName().equals(propertyName)) {
                return property;
            }
        }
        return null;
    }

}
