package org.cep.rulesengine.model;

import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.cep.rulesengine.Event;
import org.cep.rulesengine.RuleExecutionException;
import org.cep.rulesengine.interpreter.EvaluationContext;
import org.cep.rulesengine.interpreter.Property;

/**
 * An Action used to send email. In a rule, the send mail action is referenced as:
 * <tt>sendMail('to')</tt> or <tt>sendMail()</tt>. If no argument is given, then
 * email is sent to the address specified in rule meta-data properties. In the absence
 * of a 'to' as an argument to the sendMail() action in a rule, as well as in rule
 * meta-data properties, email is sent to the AdminEmail as specified in
 * config_tab.
 *
 * @author A. Rodriguez
 */
public class MailAction extends RuleAction {

    public static final String MAIL_HOST = "mailhost";
    public static final String MAIL_TO = "mailto";
    public static final String MAIL_FROM = "mailfrom";
    public static final String MAIL_SUBJECT = "mailsubject";

    String host, from, to, subject;

    /**
     * Creates a new MailAction.
     */
    public MailAction(List<String> args) {
        super(args);
        if (args.size() > 0) {
            to = args.get(0);
        }
    }

    /**
     * Sends an email using the JavaMail API.
     */
    public boolean execute(EvaluationContext context, List<Event> args)
            throws RuleExecutionException {

        setMailProperties(context);

        // Get system properties
        Properties props = System.getProperties();

        // Setup mail server
        props.put("mail.smtp.host", host);

        // Get session
        Session session = Session.getDefaultInstance(props, null);

        // Define message
        MimeMessage message = new MimeMessage(session);

        try {
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(to));
            message.setSubject(subject);
            message.setText("Rule Action Executed");

            // Send message
            Transport.send(message);

        } catch (AddressException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        return true;
    }

    /**
     * Sets up mail properties, using rule meta-data first, then system properties.
     */
    private void setMailProperties(EvaluationContext context) {
        this.host = getMailProperty(context, MAIL_HOST, "");
        this.from = getMailProperty(context, MAIL_FROM, "");
        this.to = getMailProperty(context, MAIL_TO, "");
        this.subject = getMailProperty(context, MAIL_SUBJECT, "");
    }

    // returns a mail property
    private String getMailProperty(EvaluationContext context, String propertyName,
                                   String sysPropName) {
        Property prop = context.getMetaProperties().get(propertyName);
        if (prop != null) return (String) prop.getPropertyValue();
        else return sysPropName;
    }

    /**
     * Returns a String representation of this MailAction.
     */
    public String toString() {
        StringBuffer buff = new StringBuffer();
        buff.append(super.getActionName() + "(" + super.getArgs() + ")");
        return buff.toString();
    }

}