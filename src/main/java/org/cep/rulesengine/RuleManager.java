package org.cep.rulesengine;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.cep.rulesengine.interpreter.Property;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * The RuleManager is used as an administrative interface to fetch applicable
 * rules when the rules engine is invoked.
 *
 * @author A. Rodriguez
 */
public class RuleManager {

    public static final String RULE_NAME = "name";
    public static final String RULE_DESCRIPTION = "description";
    public static final String RULE_TARGET = "target";
    public static final String RULE_STATEMENT = "statement";
    public static final String RULE_STATUS = "status";
    public static final String RULE_METADATA = "metadata";

    public static final String PROPERTY = "property";
    public static final String NAME = "name";
    public static final String VALUE = "value";

    /**
     * Returns Rules applicable to the given item
     */
    public List<Rule> getApplicableRules(Event event)
            throws RuleExecutionException {

        List<Rule> result = new ArrayList<Rule>();
        List<Event> results = new ArrayList<>();
        String ruleTarget = event.getEventType();
        try {
            // Query for all Rules applicable to the type of object/item
            for (Event item : results) {

                Rule rule = new Rule();
                rule.setRuleName(item.getProperty(RULE_NAME));
                rule.setRuleDescription(item.getProperty(RULE_DESCRIPTION));
                rule.setRuleTarget(item.getProperty(RULE_TARGET));
                rule.setRuleStatus(item.getProperty(RULE_STATUS));

                String ruleStatement = item.getProperty(RULE_STATEMENT);
                rule.setRuleStatementString(ruleStatement);

                String metaProps = item.getProperty(RULE_METADATA);
                if (metaProps != null && !metaProps.equals("")) {
                    rule.setRuleMetaDataXml(metaProps);
                    rule.setMetaProperties(parseMetaProps(metaProps));
                }
                result.add(rule);
            }

        } catch (Exception e) {
            throw new RuleExecutionException(e.getMessage());
        }

        return result;
    }

    /**
     * Parses a List<Property> from the given metaXML String.
     */
    private List<Property> parseMetaProps(String metaXML) throws RuleExecutionException {
        List<Property> metaProps = new ArrayList<Property>();
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db;
        try {
            db = dbf.newDocumentBuilder();
            Document doc = db.parse(new InputSource(new StringReader(metaXML)));
            NodeList nodeLst = doc.getElementsByTagName(PROPERTY);

            for (int s = 0; s < nodeLst.getLength(); s++) {

                Node fstNode = nodeLst.item(s);
                if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element fstElmnt = (Element) fstNode;
                    String name = getFirstNodeValue(fstElmnt, NAME);
                    String value = getFirstNodeValue(fstElmnt, VALUE);

                    if (name != null && value != null) {
                        metaProps.add(new Property(name, value));
                    }
                }
            }
        } catch (ParserConfigurationException | IOException | SAXException e) {
            throw new RuleExecutionException(e.getMessage());
        }
        return metaProps;
    }

    // returns the node value for the first node named by nodeName.
    private String getFirstNodeValue(Element fstElmnt, String nodeName) {
        NodeList fstNmElmntLst = fstElmnt.getElementsByTagName(nodeName);
        Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
        NodeList fstNm = fstNmElmnt.getChildNodes();
        return fstNm.item(0).getNodeValue();
    }

}
