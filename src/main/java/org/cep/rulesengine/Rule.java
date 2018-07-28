package org.cep.rulesengine;

import org.cep.rulesengine.interpreter.Property;
import org.cep.rulesengine.interpreter.PropertySet;

import java.util.ArrayList;
import java.util.List;

/**
 * Holder for Rule properties, including meta-data.
 *
 * @author A. Rodriguez
 */
public class Rule {

    private String ruleName;
    private String ruleTarget;
    private String ruleDescription;
    private String ruleStatementString;
    private String ruleStatus;
    private String ruleMetaDataXml;

    public List<Property> metaProperties = new ArrayList<Property>();

    /**
     * @return the ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    /**
     * @param ruleName the ruleName to set
     */
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * @return the ruleTarget
     */
    public String getRuleTarget() {
        return ruleTarget;
    }

    /**
     * @param ruleTarget the ruleTarget to set
     */
    public void setRuleTarget(String ruleTarget) {
        this.ruleTarget = ruleTarget;
    }

    /**
     * @return the ruleDescription
     */
    public String getRuleDescription() {
        return ruleDescription;
    }

    /**
     * @param ruleDescription the ruleDescription to set
     */
    public void setRuleDescription(String ruleDescription) {
        this.ruleDescription = ruleDescription;
    }

    /**
     * @return the ruleStatementString
     */
    public String getRuleStatementString() {
        return ruleStatementString;
    }

    /**
     * @param ruleStatementString the ruleStatementString to set
     */
    public void setRuleStatementString(String ruleStatementString) {
        this.ruleStatementString = ruleStatementString;
    }

    /**
     * @return the ruleStatus
     */
    public String getRuleStatus() {
        return ruleStatus;
    }

    /**
     * @param ruleStatus the ruleStatus to set
     */
    public void setRuleStatus(String ruleStatus) {
        this.ruleStatus = ruleStatus;
    }

    /**
     * Returns the meta-property value named by propertyName.
     */
    public String getMetaProperty(String propertyName) {
        String result = "";
        for (Property metaProp : this.metaProperties) {
            if (metaProp.getPropertyName().equals(propertyName)) {
                result = metaProp.getPropertyValue().toString();
                break;
            }
        }
        return result;
    }

    public PropertySet getMetaProperties() {
        PropertySet set = new PropertySet();
        for (Property prop : this.metaProperties) {
            set.add(prop);
        }
        return set;
    }

    /**
     * Sets the meta-properties for this Rule.
     */
    public void setMetaProperties(List<Property> metaProps) {
        this.metaProperties = metaProps;
    }

    /**
     * @return the ruleMetaDataXml
     */
    public String getRuleMetaDataXml() {
        return ruleMetaDataXml;
    }

    /**
     * @param ruleMetaDataXml the ruleMetaDataXml to set
     */
    public void setRuleMetaDataXml(String ruleMetaDataXml) {
        this.ruleMetaDataXml = ruleMetaDataXml;
    }

    /**
     * Returns a String representation of this Rule (for debug).
     */
    public String toString() {
        StringBuffer buff = new StringBuffer();
        buff.append(this.ruleName + "\n");
        buff.append(this.ruleTarget + "\n");
        buff.append(this.ruleStatus + "\n");
        buff.append(this.ruleStatementString + "\n");
        if (ruleDescription != null)
            buff.append(this.ruleDescription + "\n");
        if (ruleMetaDataXml != null)
            buff.append(this.ruleMetaDataXml + "\n");

        return buff.toString();
    }

}
