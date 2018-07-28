package org.cep.rulesengine.model;

import org.cep.rulesengine.Event;
import org.cep.rulesengine.compare.PropertyComparator;
import org.cep.rulesengine.interpreter.EvaluationContext;
import org.cep.rulesengine.interpreter.Property;
import org.cep.rulesengine.interpreter.RuleEvaluationException;

import java.util.List;

/**
 * An EqualCondition object represents one part of rule statement
 * of the form (prop = value) as defined by the rule language grammar.
 * Equality between Properties in an EvaluationContext and the value specified in
 * a rule is determined by a Java class that implements the Comparable interface
 * that is mapped to the syntax of the property being tested for equality.
 * A Comparable guarantees that an apples to apples comparison is made.
 *
 * @author A. Rodriguez
 */
public class EqualCondition extends RuleCondition {

    /**
     * Constructs an empty EqualCondition.
     */
    public EqualCondition() {
    }

    /**
     * Constructs an EqualExpression to test if the property named by
     * <tt>name</tt> is equal to the value <tt>value</tt>.
     */
    public EqualCondition(String name, String value) {
        super(name, value);
    }

    /**
     * Returns true if the <tt>name</tt> Property in <tt>EvaluationContext</tt>
     * is equal to the <tt>value</tt> in this expression.
     *
     * @param context an EvaluationContext
     */
    public boolean evaluate(EvaluationContext context)
            throws RuleEvaluationException {
        boolean result = false;

        Property left = getLeftOperandValue(context);
        if (left != null) {
            PropertyComparator comp = createComparator(context, left);
            Property right = getRightOperandValue(context);
            if (right == null) {
                List<Event> lookupResults = evaluateRightLookupExpression(context);
                if (lookupResults != null) {
                    for (Event item : lookupResults) {
                        right = new Property();
                        LookupExpression lookupExpr = (LookupExpression) super.rightExpr;
                        right.setPropertyName(lookupExpr.leafValue);
                        right.setPropertyValue(item.getProperty(lookupExpr.leafValue));

                        if (comp.compare(left, right) == 0) {
                            // cache matching items in the lookupExpr
                            lookupExpr.lookupResults.add(item);
                            result = true; // at least one successful comparison makes the condition true
                        }
                    }
                }

            } else {
                if (comp.compare(left, right) == 0) {
                    result = true;
                }
            }
        } else {

            // check if right/left are lookup expr
            List<Event> lookupResultsLeft = evaluateLeftLookupExpression(context);
            List<Event> lookupResultsRight = evaluateRightLookupExpression(context);
            if (lookupResultsLeft != null && lookupResultsRight != null) {
                for (Event itemLeft : lookupResultsLeft) {
                    left = new Property();
                    LookupExpression lookupExprLeft = (LookupExpression) super.leftExpr;
                    left.setPropertyName(lookupExprLeft.leafValue);
                    left.setPropertyValue(itemLeft.getProperty(lookupExprLeft.leafValue));

                    PropertyComparator comp = createComparator(context, left);

                    for (Event itemRight : lookupResultsRight) {
                        Property right = new Property();
                        LookupExpression lookupExprRight = (LookupExpression) super.rightExpr;
                        right.setPropertyName(lookupExprRight.leafValue);
                        right.setPropertyValue(itemRight.getProperty(lookupExprRight.leafValue));

                        if (comp.compare(left, right) == 0) {
                            // cache matching items in the lookupExpr
                            lookupExprLeft.lookupResults.add(itemLeft);
                            lookupExprRight.lookupResults.add(itemRight);

                            result = true; // at least one successful comparison makes the condition true
                        }
                    }
                }
            } // else, no match, result is false
        }
        return result;
    }

    /**
     * Returns the String representation of an EqualExpression.
     */
    public String toString() {
        StringBuffer buff = new StringBuffer();
        buff.append(" (" + super.getLeftOperandString() + " == " + super.getRightOperandString() + ") ");
        return buff.toString();
    }

}
