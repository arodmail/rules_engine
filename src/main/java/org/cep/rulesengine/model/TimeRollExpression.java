package org.cep.rulesengine.model;

import org.cep.rulesengine.interpreter.EvaluationContext;
import org.cep.rulesengine.interpreter.Property;
import org.cep.rulesengine.interpreter.RuleEvaluationException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * Allows a date/time value to be rolled ahead or back by a date/time part:
 * seconds, minutes or hours.
 *
 * @author A. Rodriguez
 */
public class TimeRollExpression extends OperandExpression {

    String propertyName = "";
    String datePart = "";
    String dateTimeValue = "";
    String rollAmount = "";

    private static final String SECS = "s";
    private static final String MINS = "m";
    private static final String HRS = "h";

    private static final String DATE_FORMAT = "yyyy-MM-dd-HH.mm.ss.SSSSSS";

    /**
     * Creates a new TimeRollExpression from the given dateTimeValue, datePart,
     * and operator.
     */
    public TimeRollExpression(String dateTimeValue, String datePart,
                              String operator, String rollAmount) {
        this.dateTimeValue = dateTimeValue;
        this.datePart = datePart;
        this.rollAmount = rollAmount;
        super.setOperator(operator);
    }

    /**
     * Creates a new TimeRollExpression.
     */
    public TimeRollExpression() {
    }

    /**
     * Returns the result of evaluating the expression.
     */
    public Object evaluate(EvaluationContext context)
            throws RuleEvaluationException {

        setDatePart();

        SimpleDateFormat format = new SimpleDateFormat(DATE_FORMAT);
        GregorianCalendar calendar = new GregorianCalendar(TimeZone.getDefault());

        try {
            // need to check db2 date/time format
            Property prop = context.getPropertySet().get(this.propertyName);
            if (prop != null) {
                dateTimeValue = dropMillis((String) prop.getPropertyValue());
                Date parsed = format.parse(dateTimeValue);
                calendar.setTime(parsed);

                if (datePart.equals(SECS)) {
                    roll(calendar, Calendar.SECOND, rollAmount);
                } else if (datePart.equals(MINS)) {
                    roll(calendar, Calendar.MINUTE, rollAmount);
                } else if (datePart.equals(HRS)) {
                    roll(calendar, Calendar.HOUR_OF_DAY, rollAmount);
                }
                return format.format(calendar.getTime());
            }

        } catch (ParseException e) {
            e.printStackTrace();
            throw new RuleEvaluationException(e.getMessage());
        }

        return "";
    }

    // removes (zeroes-out) any millisecond and microsecond value in the date time value
    private String dropMillis(String dateTimeValue) {
        return dateTimeValue.substring(0, dateTimeValue.lastIndexOf('.')) + ".000000";
    }

    /**
     * Separates the datePart from the rollAmount.
     */
    private void setDatePart() {
        if (this.rollAmount.endsWith(SECS)
                || this.rollAmount.endsWith(MINS)
                || this.rollAmount.endsWith(HRS)) {
            this.datePart = rollAmount.substring(rollAmount.length() - 1, rollAmount.length());
            rollAmount = rollAmount.substring(0, rollAmount.length() - 1);
        }
    }

    /**
     * Rolls forward or back the given Calendar by the rollAmount.
     */
    private void roll(GregorianCalendar calendar, int datePart,
                      String rollAmount) {
        int rollBy = Integer.parseInt(rollAmount);
        if (operator == MINUS) {
            rollBy = -rollBy;
        }
        calendar.add(datePart, rollBy);
    }

    /**
     * Gets the property name.
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * Gets the roll amount.
     */
    public String getRollAmount() {
        return rollAmount;
    }

    /**
     * Sets the property name.
     */
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    /**
     * Sets the roll amount.
     */
    public void setRollAmount(String rollAmount) {
        this.rollAmount = rollAmount;
    }

    /**
     * Returns a String representation of this TimeRollExpression.
     */
    public String toString() {
        StringBuffer buff = new StringBuffer();
        buff.append(this.propertyName);
        buff.append(" " + this.operator + " ");
        buff.append(this.rollAmount);
        return buff.toString();
    }


}
