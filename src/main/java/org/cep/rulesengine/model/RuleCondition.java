package org.cep.rulesengine.model;

import org.cep.rulesengine.Event;
import org.cep.rulesengine.compare.ComparableFactory;
import org.cep.rulesengine.compare.PropertyComparator;
import org.cep.rulesengine.interpreter.CommonEvaluationContext;
import org.cep.rulesengine.interpreter.EvaluationContext;
import org.cep.rulesengine.interpreter.Property;
import org.cep.rulesengine.interpreter.RuleEvaluationException;

import java.util.List;

/**
 * RuleCondition is the abstract base class for all rule condition
 * classes. A RuleCondition object encapsulates the part of a rule that
 * occurs inside a rule statement such as the <tt>(prop1=val1)</tt> part of
 * <tt>( (prop1=val1) & (prop2=val2) )</tt>.
 *
 * @author A. Rodriguez
 */
public abstract class RuleCondition implements RulePart {

    /**
     * The parent RuleStatement or null if this is the topmost statement.
     */
    RuleStatement parent = null;

    private String propertyName = "";
    private String propertyValue = "";

    public RuleExpression leftExpr = null;
    public RuleExpression rightExpr = null;

    /**
     * Creates an empty RuleCondition.
     */
    public RuleCondition() {

    }

    /**
     * Default constructor provided for subclasses. <tt>name</tt> is a property
     * name and <tt>value</tt> is parsed from the right side of the equals sign
     * in a rule as in <tt>(property = value)</tt>.
     */
    public RuleCondition(String name, String value) {
        this.propertyName = name;
        this.propertyValue = value;
    }

    /**
     * Returns true if the constraint in the condition is true relative to the
     * EvaluationContext given. RuleCondition objects evaluate to true for
     * different reasons and must at least provide an implementation of evalute().
     *
     * @param context the properties to evaluate in terms of the
     *                constraint(s) in the rule condition.
     * @return true if the values in EvaluationContext match the constraint(s)
     * in the rule condition.
     * @throws RuleEvaluationException if something happens that prevents
     *                                 evaluating the condition.
     */
    public abstract boolean evaluate(EvaluationContext context)
            throws RuleEvaluationException;

    /**
     * @return the propertyName
     */
    public String getPropertyName() {
        if (!propertyName.equals("")) {
            if (propertyName.startsWith("this."))
                propertyName =
                        propertyName.substring("this.".length(), propertyName.length());
        }
        return propertyName;
    }

    /**
     * @param propertyName the propertyName to set
     */
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    /**
     * @return the propertyValue
     */
    public String getPropertyValue() {
        return propertyValue;
    }

    /**
     * @param propertyValue the propertyValue to set
     */
    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
    }

    /**
     * @return the parent
     */
    public RuleStatement getParent() {
        return parent;
    }

    /**
     * Sets this condition's parent if this is a nested condition.
     *
     * @param parentStatement a RuleStatement reference to this RuleCondition's parent.
     */
    public void setParent(RuleStatement parentStatement) {
        this.parent = parentStatement;
    }

    /**
     * Sets the right or left RuleExpression for this RuleCondition.
     */
    public void addExpression(RuleExpression expr) {
        if (this.propertyName.equals("") && leftExpr == null) {
            leftExpr = expr;
        } else if (rightExpr == null) {
            rightExpr = expr;
        }
    }

    /**
     * Returns a Property for the left operand.
     */
    protected Property getLeftOperandValue(EvaluationContext context)
            throws RuleEvaluationException {

        Property toTest = null;

        if (!getPropertyName().equals("")) {
            // case 1: propertyName on left
            toTest = context.getPropertySet().get(getPropertyName());

        } else if (leftExpr != null) {
            // case 2: RuleExpression on left
            if (leftExpr instanceof TimeRollExpression) {
                String timeRoll = (String) leftExpr.evaluate(context);
                toTest = new Property();
                toTest.setPropertyName(((TimeRollExpression) leftExpr).getPropertyName());
                toTest.setPropertyValue(timeRoll);

            } else if (leftExpr instanceof LookupExpression) {

            }

        } // TODO: the grammar supports several more permutations on the left side

        return toTest;

    }

    /**
     * Returns a Property for the right operand.
     */
    protected Property getRightOperandValue(EvaluationContext context)
            throws RuleEvaluationException {

        Property toMatch = null;

        if (!getPropertyValue().equals("")) {

            toMatch = new Property(getPropertyName(), unquote(getPropertyValue()));

        } else if (rightExpr != null) {
            if (rightExpr instanceof TimeRollExpression) {
                String timeRoll = (String) rightExpr.evaluate(context);
                toMatch = new Property();
                toMatch.setPropertyName(((TimeRollExpression) rightExpr).getPropertyName());
                toMatch.setPropertyValue(timeRoll);
            }

        } // TODO: the grammar supports several more permutations on the right side

        return toMatch;

    }

    /**
     * Evaluates the right lookup expression in this condition.
     */
    protected List<Event> evaluateRightLookupExpression(EvaluationContext context)
            throws RuleEvaluationException {
        if (rightExpr instanceof LookupExpression) {
            LookupExpression lookupExpr = (LookupExpression) rightExpr;
            List<Event> lookupResults = lookupExpr.evaluate(context);
            return lookupResults;
        } else {
            return null;
        }
    }

    /**
     * Evaluates the right lookup expression in this condition.
     */
    protected List<Event> evaluateLeftLookupExpression(EvaluationContext context)
            throws RuleEvaluationException {
        if (leftExpr instanceof LookupExpression) {
            LookupExpression lookupExpr = (LookupExpression) leftExpr;
            List<Event> lookupResults = lookupExpr.evaluate(context);
            return lookupResults;
        } else {
            return null;
        }
    }

    /**
     * Returns a PropertyComparator for the given context and property.
     */
    protected PropertyComparator createComparator(EvaluationContext context,
                                                  Property toTest) {
        String syntax = "";
        ComparableFactory factory = null;
        if (context instanceof CommonEvaluationContext) {
            CommonEvaluationContext commonCtx = (CommonEvaluationContext) context;
            if (commonCtx.getComparableFactory() != null) {
                factory = commonCtx.getComparableFactory();
                syntax =
                        factory.getSyntaxFromContentTypeAndPropertyName(
                                context.getContentType(), toTest.getPropertyName());
            }
        }
        PropertyComparator comp = new PropertyComparator(syntax, factory);
        return comp;
    }

    // removes quotes from literal strings before comparing
    private String unquote(String str) {
        if (str.startsWith("'") && str.endsWith("'"))
            str = str.substring(1, str.length() - 1);
        return str;
    }

    /**
     * Returns a String version of the left operand
     */
    public String getLeftOperandString() {
        String result = "";
        if (!getPropertyName().equals("")) {
            result = (String) getPropertyName();
        } else if (leftExpr != null) {
            result = leftExpr.toString();
        }
        return result;
    }

    /**
     * Returns a String version of the right operand
     */
    public String getRightOperandString() {
        String result = "";
        if (!getPropertyValue().equals("")) {
            result = (String) getPropertyValue();
        } else if (rightExpr != null) {
            result = rightExpr.toString();
        }
        return result;
    }

}
