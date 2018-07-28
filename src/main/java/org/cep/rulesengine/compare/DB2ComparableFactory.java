package org.cep.rulesengine.compare;

import java.math.BigInteger;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * A ComparableFactory suitable for use within the engine. Provides a syntax
 * name to Java Comparable mapping. Used to obtain a Comparable to perform syntax
 * sensitive comparisons between property values.
 *
 * @author A. Rodriguez
 */
public class DB2ComparableFactory implements ComparableFactory {

    /**
     * Maps DB2 datatype names to Java Comparables.
     */
    private static Map<String, NameClassPair> map = new HashMap<String, NameClassPair>(12);

    static final String VARCHAR = "varchar";
    static final String CHAR = "char";
    static final String TIMESTAMP = "timestamp";
    static final String SMALLINT = "smallint";
    static final String INTEGER = "integer";
    static final String DECIMAL = "decimal";
    static final String REAL = "real";
    static final String BIGINT = "bigint";
    static final String DOUBLE = "double";
    static final String CLOB = "clob";
    static final String DATE = "date";
    static final String TIMESTAMP_FORMAT = "yyyy-MM-dd-HH.mm.ss.SSS";
    static final String DATE_FORMAT = "yyyy-MM-dd";

    /**
     * Creates and initializes the factory.
     */
    public DB2ComparableFactory() {
        map.put(VARCHAR, createClsPair(VARCHAR, String.class));
        map.put(CHAR, createClsPair(CHAR, String.class));
        map.put(TIMESTAMP, createClsPair(TIMESTAMP, Calendar.class));
        map.put(SMALLINT, createClsPair(SMALLINT, Integer.class));
        map.put(INTEGER, createClsPair(INTEGER, Integer.class));
        map.put(DECIMAL, createClsPair(DECIMAL, Double.class));
        map.put(REAL, createClsPair(REAL, Float.class));
        map.put(BIGINT, createClsPair(BIGINT, BigInteger.class));
        map.put(DOUBLE, createClsPair(DOUBLE, Double.class));
        map.put(CLOB, createClsPair(CLOB, String.class));
        map.put(DATE, createClsPair(DATE, Calendar.class));
    }

    /**
     * Returns a NameClassPair for the given arguments.
     */
    private NameClassPair createClsPair(String name, Class<?> cls) {
        return new NameClassPair(name, cls);
    }

    /**
     * Returns the syntax name for the property name given.
     */
    public String getSyntaxFromPropertyName(String property) {
        return "";
    }

    /**
     * Returns the syntax name for the content type and property name given.
     */
    public String getSyntaxFromContentTypeAndPropertyName(String contentType,
                                                          String property) {
        try {
            /*
			ContentTypeDefinition contentTypeDef =
				ContentTypeDefinitionManager.getInstance().getEventType(contentType);
			int dataType = contentTypeDef.getTable().getColumn(property).getDataType();
			String db2Syntax = GeneralUtility.getJDBCTypeAsString(dataType);
			return db2Syntax;
            */
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * Holder object for a Name/Class pair. Name is a syntax name and
     * Class is a Class that implements the Comparable interface.
     */
    private class NameClassPair {
        String name;
        Class<?> cls;

        public NameClassPair(String name, Class<?> cls) {
            this.name = name;
            this.cls = cls;
        }
    }

    /**
     * Returns Comparable for the syntax name given.
     */
    public Class<?> getComparableFromSyntaxName(String syntaxName) {
        Iterator<?> it = map.keySet().iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            NameClassPair nacp = (NameClassPair) map.get(key);
            if (nacp.name.equalsIgnoreCase(syntaxName))
                return nacp.cls;
        }
        return String.class;
    }
}
