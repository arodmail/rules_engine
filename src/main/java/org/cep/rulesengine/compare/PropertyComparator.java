package org.cep.rulesengine.compare;

import org.cep.rulesengine.interpreter.Property;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Provides a comparison function for {@link Property}.
 * <p>
 * This Comparator can be used in two ways: if the syntax is known (available),
 * use the two-argument constructor; otherwise, the single-argument constructor
 * is useful if the property value may be treated (compared) strictly as a
 * String to determine if the properties being compared are equal or not.
 * <p>
 * For example:
 *
 * <blockquote>
 *
 * <pre>
 * PropertyComparator comparator1 = new PropertyComparator(prop1);
 *
 * PropertyComparator comparator2 = new PropertyComparator(prop2);
 *
 * boolean result = comparator1.equals(comparator2);
 * if (result)
 *     System.out.println(&quot;prop1 is equal to prop2&quot;);
 *
 * </pre>
 *
 * </blockquote>
 * <p>
 * The result above is true if the String value of <tt>prop1</tt> is equal to
 * the String value of</tt>prop2</tt>.
 *
 * @author A. Rodriguez
 */
public class PropertyComparator {

    /**
     * The base Property to compare.
     */
    public Property prop1 = null;

    /**
     * The syntax of the Property to compare.
     */
    public String syntax = "";

    private ComparableFactory comparableFactory;

    /**
     * Creates a Comparator for Property whose <tt>value</tt> may be compared
     * using <tt>String.compareTo()</tt>.
     *
     * @param prop Property to compare.
     */
    public PropertyComparator(Property prop) {
        this.prop1 = prop;
    }

    /**
     * Creates a Comparator that maps the given syntax to a Java class. If the
     * mapped Java class implements <tt>java.lang.Comparable</tt>, this
     * Comparator's <tt>compare()</tt> behaves like the comparable Object's
     * <tt>compareTo()</tt> and returns its <tt>int</tt>. Otherwise, the
     * Property being compared are converted to <tt>String</tt>s and the
     * comparison function in this Comparator's <tt>equals()</tt> and
     * <tt>compare()</tt> behaves like <tt>String.compareTo()</tt>.
     *
     * @param syntax the Property syntax.
     */
    public PropertyComparator(String syntax) {
        this.syntax = syntax;
    }

    /**
     * Creates a Comparator that maps the given syntax to a Java class. If the
     * mapped Java class implements <tt>java.lang.Comparable</tt>, this
     * Comparator's <tt>compare()</tt> behaves like the comparable Object's
     * <tt>compareTo()</tt> and returns its <tt>int</tt>. Otherwise, the
     * Property being compared are converted to <tt>String</tt>s and the
     * comparison function in this Comparator's <tt>equals()</tt> and
     * <tt>compare()</tt> behaves like <tt>String.compareTo()</tt>.
     *
     * @param syntax  the property syntax, e.g., varchar, datetime.
     * @param factory ComparableFactory that provides a mapping between a syntax and
     *                a Java Comparable.
     */
    public PropertyComparator(String syntax, ComparableFactory factory) {
        this.syntax = syntax;
        this.comparableFactory = factory;
    }

    /**
     * Creates a Comparator that maps the given syntax to a Java class. If the
     * mapped Java class implements <tt>java.lang.Comparable</tt>, this
     * Comparator's <tt>compare()</tt> behaves like the comparable Object's
     * <tt>compareTo()</tt> and returns its <tt>int</tt>. Otherwise, the
     * Property being compared are converted to <tt>String</tt>s and the
     * comparison function in this Comparator's <tt>equals()</tt> and
     * <tt>compare()</tt> behaves like <tt>String.compareTo()</tt>.
     *
     * @param factory ComparableFactory that provides a mapping between a syntax and
     *                a Java Comparable.
     */
    public PropertyComparator(ComparableFactory factory) {
        this.comparableFactory = factory;
    }

    /**
     * Creates a Comparator that maps the given LDAP syntax OID to a Java class.
     * If the mapped Java class implements <tt>java.lang.Comparable</tt>, this
     * Comparator's <tt>compare()</tt> behaves like the comparable Object's
     * <tt>compareTo()</tt> and returns its <tt>int</tt>. Otherwise, the
     * AttributeValue being compared are converted to <tt>String</tt>s and the
     * comparison function in this Comparator's <tt>equals()</tt> and
     * <tt>compare()</tt> behaves like <tt>String.compareTo()</tt>.
     *
     * @param prop   AttributeValue to compare.
     * @param syntax the attribute's LDAP syntax OID.
     */
    public PropertyComparator(Property prop, String syntax) {
        this(syntax);
        this.prop1 = prop;
    }

    /**
     * Compares its two arguments for order. Returns -1 if <tt>prop1</tt> is
     * "less than" <tt>prop2</tt>, 0 if <tt>prop1</tt> and <tt>prop2</tt> are
     * "equal" or 1 if <tt>prop1</tt> is "greater than" <tt>prop2</tt>.
     *
     * @param prop1 the first Property to be compared.
     * @param prop1 the second Property to be compared.
     * @return -1, 0, or 1 if <tt>prop1</tt> is less than, equal to or greater
     * than <tt>prop2</tt>.
     * @throws ClassCastException if either <tt>prop1</tt> or <tt>prop2</tt> are not instance
     *                            of Property.
     */
    public int compare(Object prop1, Object prop2) throws ClassCastException {

        if (!(prop1 instanceof Property) || !(prop2 instanceof Property)) {
            throw new ClassCastException("Unexpected argument type(s): "
                    + "Expected common.AttributeValue.");
        } else {

            this.prop1 = (Property) prop1;
            Property b = (Property) prop2;

            if (this.comparableFactory != null & syntax.equals("")) {
                syntax = this.comparableFactory.getSyntaxFromPropertyName(b
                        .getPropertyName());
            }
            if (syntax.equals("")) {
                // 2. String comparison
                return compareAsString(b);
            } else {
                if (syntax.equals(DB2ComparableFactory.TIMESTAMP)
                        || syntax.equals(DB2ComparableFactory.DATE)) {
                    // 3. Datetime comparison
                    return compareAsDateTime(b);
                } else {
                    // 4. Other syntax comparison
                    try {
                        return compareSyntax(b);
                    } catch (Exception e) {
                        return -1;
                    }
                }
            }
        }
    }

    /**
     * Returns the result of <tt>a.compareTo(b)</tt> if a and b are timestamps or
     * dates.
     */
    private int compareAsDateTime(Property b) {
        int result = -1;
        SimpleDateFormat format =
                new SimpleDateFormat(DB2ComparableFactory.TIMESTAMP_FORMAT);
        GregorianCalendar calendar1 = new GregorianCalendar();
        GregorianCalendar calendar2 = new GregorianCalendar();

        String dateTimeValue1 = (String) this.prop1.getPropertyValue();
        String dateTimeValue2 = (String) b.getPropertyValue();

        try {
            Date parsed1 = format.parse(dropMillis(dateTimeValue1));
            Date parsed2 = format.parse(dropMillis(dateTimeValue2));
            calendar1.setTime(parsed1);
            calendar2.setTime(parsed2);

            result = calendar1.compareTo(calendar2);
        } catch (ParseException e) {
            //TODO: date format
        }
        return result;
    }

    // removes (zeroes-out) any millisecond and microsecond value in the date time value
    private String dropMillis(String dateTimeValue) {
        return dateTimeValue.substring(0, dateTimeValue.lastIndexOf('.')) + ".000000";
    }

    /**
     * Returns the result of <tt>a.compareTo(b)</tt>.
     */
    private int compareAsString(Property b) {
        String value1 = this.prop1.getPropertyValue().toString();
        String value2 = b.getPropertyValue().toString();
        // return value1.compareToIgnoreCase(value2);
        // TBD if default is case insensitive
        return value1.compareTo(value2);
    }

    /**
     * Behaves like <tt>compareTo()</tt> on the mapped "comparable" class for
     * the syntax used in this Comparator's constructor.
     */
    @SuppressWarnings("unchecked")
    private int compareSyntax(Property b) throws NoSuchMethodException,
            InstantiationException, IllegalAccessException,
            InvocationTargetException {
        int result = 0;
        Class<?> cls;
        if (comparableFactory != null)
            cls = (Class<?>) comparableFactory
                    .getComparableFromSyntaxName(syntax);
        else
            cls = String.class; // treat as String
        if (cls != null) {
            Class<?>[] argTypes = {String.class};

            Object o1 = this.prop1.getPropertyValue();
            Object o2 = b.getPropertyValue();
            if (o1 instanceof byte[]) {
                try {
                    o1 = new String((byte[]) o1, "UTF-8");
                } catch (UnsupportedEncodingException uee) {
                }
            }
            if (o2 instanceof byte[]) {
                try {
                    o2 = new String((byte[]) o2, "UTF-8");
                } catch (UnsupportedEncodingException uee) {
                }
            }
            Object[] args1 = {o1};
            Object[] args2 = {o2};
            try {
                Constructor<?> constructor = cls.getConstructor(argTypes);

                // create instances of the mapped Class
                Object obj1 = constructor.newInstance(args1);
                Object obj2 = constructor.newInstance(args2);
                Comparable compA = (Comparable) obj1;
                Comparable compB = (Comparable) obj2;
                result = compA.compareTo(compB);

            } catch (Exception iae) {
                // see if property value
                // implements Comparable
                Comparable compA = (Comparable) o1;
                Comparable compB = (Comparable) o2;
                result = compA.compareTo(compB);
            }

            if (result != 0) {
                return result;
            }
        }
        return result;
    }
}
