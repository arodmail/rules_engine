package org.cep.rulesengine.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.cep.rulesengine.Event;
import org.cep.rulesengine.RuleExecutionException;
import org.cep.rulesengine.RuleManager;
import org.cep.rulesengine.interpreter.EvaluationContext;
import org.cep.rulesengine.interpreter.PropertySet;

/**
 * An Action used to create compound alert records.
 *
 * @author A. Rodriguez
 */
public class CompoundAlertAction extends RuleAction {

    private static final String PARENT_CTD = "alerts_external";
    private static final String DETAIL_CTD = "alerts_external_detail";

    // alerts_external_detail fields
    private static final String ALERT_ID = "alert_id";
    private static final String CONTENT_TYPE = "content_type";
    private static final String FEED_ID = "feed_id";
    private static final String TRACKING_ID = "tracking_id";
    private static final String TIMESTAMP = "timestamp";
    private static final String ALERT_START = "alertstart";
    private static final String VIEW_ID = "view_id";

    // alerts_external fields for the parent compound alert record

    private static final String IDENTITY = "identity";
    private static final String CLASS = "class";

    private static final String[] COMPOUND_ALERT_FIELDS = {"alertstart",
            "alertend", "keyframe", "alert_priority", "pre_roll"};

    private static final String IS_VISIBLE = "is_visible";
    private static final String ALERT_TYPE = "alert_type";

    /**
     * Creates an new, empty CompoundAlertAction.
     */
    public CompoundAlertAction() {
        super();
    }

    /**
     * Creates a new CompoundAlertAction.
     */
    public CompoundAlertAction(List<String> args) {
        super(args);
    }

    /**
     * Executes the CompoundAlertAction.
     */
    public boolean execute(EvaluationContext context, List<Event> args)
            throws RuleExecutionException {

        // Create the alerts_external parent record, use this action's execution
        // context as the base
        PropertySet propertySet = context.getPropertySet();
        Event parentCompoundAlert = new Event();
        parentCompoundAlert.setEventType(PARENT_CTD);

        try {
            for (String field : COMPOUND_ALERT_FIELDS) {
                parentCompoundAlert.setProperty(field,
                        (String) propertySet.get(field).getPropertyValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        parentCompoundAlert.setProperty(IDENTITY,
                (String) context.getMetaProperties().get(RuleManager.RULE_NAME).getPropertyValue());
        parentCompoundAlert.setProperty(CLASS, "Compound Alert");

        parentCompoundAlert.setProperty(IS_VISIBLE, "N");
        parentCompoundAlert.setProperty(ALERT_TYPE, "C"); // Composite

        //ContentItemDAO dao = ContentItemDAO.getInstance();
        int result = 0;
        int alertID = -1;

        try {
            //result = dao.persist(parentCompoundAlert, true);
            if (result == 1) {
                alertID = getMaxAlertID();
            }

        } catch (Exception e) {
            throw new RuleExecutionException(e.getMessage());
        }

        // List<Object> is a list of primitive alerts that comprise the
        // compound alert, create detail records from each

        for (Object alert : args) {

            Event alertPrimitive = (Event) alert;
            Event alertDetail = new Event();
            alertDetail.setEventType(DETAIL_CTD);

            alertDetail.setProperty(ALERT_ID, Integer.toString(alertID));
            alertDetail.setProperty(CONTENT_TYPE, PARENT_CTD);
            alertDetail.setProperty(FEED_ID, alertPrimitive.getProperty(VIEW_ID));
            alertDetail.setProperty(TRACKING_ID, alertPrimitive.getProperty(ALERT_ID));
            alertDetail.setProperty(TIMESTAMP, alertPrimitive.getProperty(ALERT_START));

            // commit this primitive, bound to others by a "parent" compound alert id.
            try {
                //dao.t_persist(alertDetail, false);
            } catch (Exception e) {
                throw new RuleExecutionException(e.getMessage());
            }
        }

        // create a detail record for the primary, trigger alert (the context)
        Event alertDetail = new Event();
        alertDetail.setEventType(DETAIL_CTD);

        alertDetail.setProperty(ALERT_ID, Integer.toString(alertID));
        alertDetail.setProperty(CONTENT_TYPE, PARENT_CTD);
        alertDetail.setProperty(FEED_ID, (String) context.getPropertySet().get(VIEW_ID).getPropertyValue());
        alertDetail.setProperty(TRACKING_ID, (String) context.getPropertySet().get(ALERT_ID).getPropertyValue());
        alertDetail.setProperty(TIMESTAMP, (String) context.getPropertySet().get(ALERT_START).getPropertyValue());

        // commit this primitive, bound to others by a "parent" compound alert id.
        try {
            //dao.t_persist(alertDetail, false);
        } catch (Exception e) {
            throw new RuleExecutionException(e.getMessage());
        }

        return true;
    }

    /**
     * Used to lookup the max alert id immediately following an insert.
     */
    private int getMaxAlertID() {
        int maxAlertID = -1;
        Statement stmt = null;
        ResultSet resultSet = null;
        String sqlStatement = "select max(alert_id) as max_id from alerts_external";
        try {
            Connection conn = null;
            conn.setReadOnly(true);
            conn.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
            stmt = conn.createStatement();
            resultSet = stmt.executeQuery(sqlStatement);
            while (resultSet.next()) {
                maxAlertID = resultSet.getInt("max_id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return maxAlertID;
    }

}
