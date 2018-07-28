package org.cep.rulesengine.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.antlr.stringtemplate.StringTemplate;
import org.cep.rulesengine.Event;
import org.cep.rulesengine.compare.DB2ComparableFactory;
import org.cep.rulesengine.compare.PropertyComparator;
import org.cep.rulesengine.interpreter.EvaluationContext;
import org.cep.rulesengine.interpreter.Property;
import org.cep.rulesengine.interpreter.PropertySet;
import org.cep.rulesengine.interpreter.RuleEvaluationException;

/**
 * LookupExpression is the model representation of an expression in rule language
 * that is a reference to content in the database, including lookup criteria.
 * LookupExpression evaluates to a ArrayList<Event> of size >= 0.
 * Lookup expressions are parsed into two parts: a content type name, and a
 * List<PropertyValuePair>. This model representation of a lookup expression is
 * intended to provide member variables to hold these parts for use by the
 * lookup expression evaluation algorithms.
 * <p>
 * Examples:
 * <p>
 * A Lookup Expression that evaluates to a result set. If the result set size is >= 1,
 * it contains Event whose content_type property is 'alerts_external'.
 *
 * <code>lookup.alerts_external</code>
 * <p>
 * A Lookup Expression that evaluates to a result set. If the result set size is >= 1,
 * it contains Event whose content_type property is 'alerts_external' and
 * identity property is 'objectremoval'.
 *
 * <code>lookup.alerts_external.identity('objectremoval')</code>
 * <p>
 * A Lookup Expression with leaf that evaluates to a result set. If the result
 * set size is >=1, it contains Event whose content_type property is
 * "alerts_external", identity property is "objectremoval", and view_id
 * property is 103.
 *
 * <code>lookup.alerts_external.identity('objectremoval').view_id(103).alertStart</code>
 *
 * @author A. Rodriguez
 */
public class LookupExpression extends RuleExpression {

    /**
     * The content type to lookup
     */
    String contentType = "";

    /**
     * Leaf value
     */
    String leafValue = "";

    /**
     * An ordered list of property/value pairs to match
     */
    List<PropertyValuePair> propValuePairs = new ArrayList<PropertyValuePair>();


    /**
     * Lookup results
     */
    List<Event> lookupResults = new ArrayList<Event>();

    /**
     * StringTemplate specifications for SQL select statements
     */
    private String templateSpec = "SELECT * ";
    private String templateSpec1 = "SELECT $propValuePairs: {$it.property$}; separator=\", \"$ ";
    private String templateSpec2 = "FROM $type$ WHERE $propValuePairs: {$it.property$ = $it.value$}; separator=\" AND \"$";
    private String templateSpec3 = templateSpec1 + templateSpec2;
    private String templateSpec4 = " ORDER BY $sortColumn$ $sortOrder$ FETCH FIRST 1 ROW ONLY OPTIMIZE FOR 1 ROW WITH UR";

    public static final String ALLOW_MULTIPLE = "allow_multiple";
    public static final String SORT_ORDER = "sort_order";
    public static final String ASC = "asc";
    public static final String DESC = "desc";
    public static final String SORT_BY = "sort_by";

    /**
     * Sets the content type for this LookupExpression.
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * Add a property/value pair to this LookupExpression.
     */
    public void addPropertyValuePair(String property, String value) {
        PropertyValuePair propValuePair = new PropertyValuePair(property, value);
        this.propValuePairs.add(propValuePair);
    }

    /**
     * Add a property/value pair to this LookupExpression.
     */
    public void addPropertyValuePair(PropertyValuePair propValuePair) {
        this.propValuePairs.add(propValuePair);
    }

    /**
     * Sets the leaf value for this LookupExpression
     */
    public void setLeafValue(String leafValue) {
        this.leafValue = leafValue;
    }

    /**
     * Returns the result of evaluating the expression.
     */
    public List<Event> evaluate(EvaluationContext context)
            throws RuleEvaluationException {

        // there are 3 possible evaluation algorithms:

        // 1) filtered base
        // 2) compound lookup
        // 3) constrained compound lookup

        return compoundLookup(context);
    }

    /**
     * An implementation of a filtered base lookup algorithm. This algorithm is
     * potentially expensive and slow running for very large results sets, but
     * provides a simple filtering mechanism for small ones.
     */
    public List<Event> filteredBaseLookup(EvaluationContext context)
            throws RuleEvaluationException {

        List<Event> result = new ArrayList<Event>();

        // prepare SQL statement
        StringBuffer sqlStatement = new StringBuffer("SELECT * FROM ");
        sqlStatement.append(contentType);

        Statement stmt = null;
        ResultSet srs = null;

        // execute the SQL statement
        try {
            Connection conn = null;
            conn.setReadOnly(true);
            conn.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
            stmt = conn.createStatement();
            srs = stmt.executeQuery(sqlStatement.toString());

            // filter the results by PropertyValuePairs
            result = filterBaseResults(context, srs);

        } catch (SQLException sqle) {
            throw new RuleEvaluationException(sqle.getMessage());
        } catch (Exception sqle) {
            throw new RuleEvaluationException(sqle.getMessage());
        } finally {
        }

        return result;
    }

    /**
     * Extracts matching items from the given base resultSet using List<PropertyValuePair>
     * as matching criteria.
     */
    private List<Event> filterBaseResults(EvaluationContext context, ResultSet resultSet) {

        List<Event> events = convertToEvents(context, resultSet);
        List<Event> result = new ArrayList<Event>();

        // apply propVal filter to the base result
        for (PropertyValuePair propVal : this.propValuePairs) {

            for (Event event : events) {

                DB2ComparableFactory comparableFactory = new DB2ComparableFactory();
                PropertyComparator comparator = new PropertyComparator(comparableFactory);

                Property a = new Property(propVal.getProperty(), propVal.getValue());
                Property b = new Property(propVal.getProperty(), event.getProperty(propVal.getProperty()));

                if (comparator.compare(a, b) == 0) { // the factory + the comparator compare syntaxes
                    result.add(event);
                }
            }
        }

        return result;
    }

    /**
     * Traverses the given ResultSet and converts each row into a populated Event.
     * Returns an ArrayList<Event>.
     */
    private List<Event> convertToEvents(EvaluationContext context, ResultSet resultSet) {

        List<Event> events = new ArrayList<Event>();

        try {
            //ContentTypeDefinition contentTypeDef =
            //	ContentTypeDefinitionManager.getInstance().getEventType(this.contentType);
            //ImmutableArray<String> columnNames = contentTypeDef.getTable().getColumnNames();
            ResultSetMetaData metaData = resultSet.getMetaData();

            PropertySet metaProps = context.getMetaProperties();
            String allowMultiple = (String) metaProps.get(ALLOW_MULTIPLE).getPropertyValue();

            if (allowMultiple != null && allowMultiple.equals("true")) {
                while (resultSet.next()) {
                    Event event = new Event();
                    event.setEventType(this.contentType);

                    // set Event properties (the DAO does it this way)
					/*
					for (int i = 0; i < columnNames.length(); i++) {
						int outboundType = 
							contentTypeDef.getTable().getColumn(columnNames.get(i)).getOutboundValueType();
						event.setProperty(columnNames.get(i),
								GeneralUtility.formatResultSetValue(metaData, resultSet, i+1, outboundType));
					}
					*/
                    events.add(event);
                }

            } else {

                // default allow_multiple is false, use the first one out
                for (int p = 0; p < 1; p++) { // one loop
                    resultSet.next(); // move cursor to first record
                    Event event = new Event();
                    event.setEventType(this.contentType);

                    // set Event properties (the DAO does it this way)
					/*
					for (int i = 0; i < columnNames.length(); i++) {
						int outboundType = 
							contentTypeDef.getTable().getColumn(columnNames.get(i)).getOutboundValueType();
						event.setProperty(columnNames.get(i),
								GeneralUtility.formatResultSetValue(metaData, resultSet, i+1, outboundType));
					}
					*/
                    events.add(event);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception me) {
            me.printStackTrace();
        }

        return events;
    }

    /**
     * An implementation of the compound lookup algorithm. Generates a
     * SQL statement that contains the constraints defined in PropertyValuePairs.
     */
    public List<Event> compoundLookup(EvaluationContext context)
            throws RuleEvaluationException {

        List<Event> result = new ArrayList<Event>();

        Statement stmt = null;
        ResultSet srs = null;

        try {
            //ContentTypeDefinition contentTypeDef =
            //	ContentTypeDefinitionManager.getInstance().getEventType(this.contentType);
            //String tableName = contentTypeDef.getTable().getName();

            String sqlStatement = "";
            if (!leafValue.equals("")) {
                //sqlStatement = getSqlStatementWithLeaf(tableName);
            } else {
                StringTemplate sqlTemplate = new StringTemplate(templateSpec3);
                //sqlTemplate.setAttribute("type", tableName);
                sqlTemplate.setAttribute("propValuePairs", this.propValuePairs);
                sqlStatement = sqlTemplate.toString();
            }

            String allowMultiple =
                    (String) context.getMetaProperties().get(ALLOW_MULTIPLE).getPropertyValue();

            if (allowMultiple == null || allowMultiple.equals("false")) {
                // add sort order and sort by to the query, optimize for 1 row

                StringTemplate sqlTemplateSortOpt = new StringTemplate(templateSpec4);

                String sortColumn =
                        (String) context.getMetaProperties().get(SORT_BY).getPropertyValue();

                String sortOrder =
                        (String) context.getMetaProperties().get(SORT_ORDER).getPropertyValue();

                if (sortColumn != null) {
                    sqlTemplateSortOpt.setAttribute("sortColumn", sortColumn);
                    if (sortOrder != null) {
                        sqlTemplateSortOpt.setAttribute("sortOrder", sortOrder);
                    } else {
                        sqlTemplateSortOpt.setAttribute("sortOrder", ASC); // LIFO default
                    }
                    sqlStatement += sqlTemplateSortOpt.toString();
                }

            }

            // execute the SQL statement
            Connection conn = null;
            conn.setReadOnly(true);
            conn.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
            stmt = conn.createStatement();
            srs = stmt.executeQuery(sqlStatement);

            result = convertToEvents(context, srs);

        } catch (SQLException sqle) {
            throw new RuleEvaluationException(sqle.getMessage());
        } catch (Exception sqle) {
            throw new RuleEvaluationException(sqle.getMessage());
        } finally {
        }

        return result;
    }

    /**
     * If the LookupExpression has a leaf, returns a SQL statement that includes the leaf.
     */
    public String getSqlStatementWithLeaf(String tableName) {

        StringTemplate sqlTemplate = new StringTemplate(templateSpec);
        sqlTemplate.setAttribute("type", tableName);
        sqlTemplate.setAttribute("propValuePairs", this.propValuePairs);
        String sqlStatement = sqlTemplate.toString();

        //sqlStatement += ", " + leafValue + " ";

        StringTemplate sqlTemplate2 = new StringTemplate(templateSpec2);
        sqlTemplate2.setAttribute("type", tableName);
        sqlTemplate2.setAttribute("propValuePairs", this.propValuePairs);
        sqlStatement += sqlTemplate2.toString();

        //sqlStatement += " AND " + leafValue + " IS NOT NULL";

        return sqlStatement;
    }

    /**
     * Returns the results of the lookup.
     */
    public List<Event> getLookupResults() {
        return this.lookupResults;
    }

    /**
     * Returns a String representation of this LookupExpression.
     */
    public String toString() {
        StringBuffer buff = new StringBuffer();
        buff.append("lookup." + contentType);
        for (PropertyValuePair propVal : this.propValuePairs) {
            buff.append("." + propVal.property + "(" + propVal.value + ")");
        }
        buff.append("." + this.leafValue);
        return buff.toString();
    }

}
