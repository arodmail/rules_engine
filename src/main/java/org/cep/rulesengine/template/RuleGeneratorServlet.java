package org.cep.rulesengine.template;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.cep.rulesengine.Event;

/**
 * The RuleGeneratorServlet is a front controller that services HTTP requests
 * to generate Rule Engine rules based on a template. The following HTTP methods
 * and URI-pattern(s) are supported:
 *
 * <pre>
 * GET  /rulegen/
 * GET  /rulegen?template=template_name
 * GET  /rulegen?template=template&parameters=parameter1,parameter2&values=value1,value2
 * </pre>
 * <p>
 * HTTP GET requests are used by clients to retrieve an XML response that includes
 * a generated rule from the template specified on the request URI.
 * <p>
 * The responses to HTTP requests processed by the RuleGeneratorServlet are
 * standard HTTP 200 OK if the processing is successful, and HTTP 200 OK if unsuccessful.
 * <p>
 * If an error occurs while processing the request, for example, in cases
 * where an HTTP GET request URI is incomplete or includes an unexpected combination
 * of parameters, the response code is 200 OK, but the response body will include
 * an error message indicating what went wrong.
 *
 * @author A. Rodriguez
 */
public class RuleGeneratorServlet extends HttpServlet {

    private static final String TEMPLATE = "template";
    private static final String PARAMETERS = "parameters";
    private static final String VALUES = "values";
    private static final String APPLICATOR = "applicator";
    private static final String CDATA_OPEN = "<![CDATA[";
    private static final String CDATA_CLOSE = "]]>";

    /**
     * Generates a response to HTTP GET requests.
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        String responseXML = "";

        String templateName = request.getParameter(TEMPLATE);
        String parameterNames = request.getParameter(PARAMETERS);
        String parameterValues = request.getParameter(VALUES);

        try {
            if ((!hasValue(templateName)) && (!hasValue(parameterNames))
                    && (!hasValue(parameterValues))) {
                responseXML = getAllTemplates();
            } else if ((hasValue(templateName)) && (!hasValue(parameterNames))
                    && (!hasValue(parameterValues))) {
                responseXML = getTemplate(templateName);
            } else if ((hasValue(templateName)) && (hasValue(parameterNames))
                    && (hasValue(parameterValues))) {
                responseXML = genRule(templateName, parameterNames,
                        parameterValues);
            } else {
                responseXML = genError("Unexpected query string. Expected " +
                        "/rulegen?template=template&parameters=parameter1,parameter2&values=value1,value2");
            }

        } catch (Exception me) {
            responseXML = genError(me.getMessage());
        }

        // include "Content-Type" and "Content-Length" response headers
        response.setContentType("application/xml");
        response.setContentLength(responseXML.length());

        PrintWriter writer = response.getWriter();
        writer.write(responseXML.toString());
    }

    /**
     * Returns an XML response that includes all rule templates currently
     * registered.
     */
    private String getAllTemplates() throws Exception {
        // query for templates
        return "";
    }

    /**
     * Slight pre-processing required to un-escape and add CDATA tags to the
     * template value(s).
     */
    private void preProcessTemplateItems(List<Event> items) {
        for (Event item : items) {
            for (String property : item.getPropertyNames()) {
                if (property.equalsIgnoreCase(TEMPLATE)) {
                    item.setProperty(property, cDataTags(item.getProperty(property)));
                }
            }
        }
    }

    // adds CDATA tags to the given value
    private String cDataTags(String value) {
        return CDATA_OPEN + value + CDATA_CLOSE;
    }

    /**
     * Returns a rule template by template name.
     */
    private String getTemplate(String templateName) {
        // query for a single template
        return "";
    }

    /**
     * Returns an XML response that includes a Rule Engine rule generated from the
     * specified parameters.
     */
    private String genRule(String templateName, String parameterNames,
                           String parameterValues) {

        String statement = "";

        // query for items
        List<Event> items = new ArrayList<>();

        if (items.size() > 0) {

            Event item = (Event) items.get(0);

            String applicatorClass = item.getProperty(APPLICATOR);
            String templateSpec = item.getProperty(TEMPLATE);

            statement = generateRuleStatement(applicatorClass, templateSpec,
                    parameterNames, parameterValues);

        } else {
            return genError("Template name " + templateName + " not found.");
        }

        StringBuffer buff = new StringBuffer();
        buff.append("<rsp stat=\"ok\">\n");
        buff.append("<statement>" + CDATA_OPEN + statement + CDATA_CLOSE + "</statement>\n");
        buff.append("</rsp>\n");

        return buff.toString();
    }

    /**
     * Generates a Rule Engine rule generated from the specified parameters.
     */
    @SuppressWarnings("unchecked")
    private String generateRuleStatement(String applicatorClass,
                                         String templateSpec, String parameterNames, String parameterValues) {
        try {
            Class cls = Class.forName(applicatorClass);
            RuleTemplateApplicator applicator = (RuleTemplateApplicator) cls
                    .newInstance();

            return applicator.applyTemplate(templateSpec,
                    toList(parameterNames), toList(parameterValues));

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        } catch (RuleTemplateException e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * Returns a List<String> that contains the tokens in the comma-delimited
     * string argument.
     */
    private List<String> toList(String commaDelim) {
        List<String> result = new ArrayList<String>();
        StringTokenizer tokenizer = new StringTokenizer(commaDelim, ",");
        while (tokenizer.hasMoreTokens()) {
            result.add(tokenizer.nextToken());
        }
        return result;
    }

    /**
     * Generates an error response.
     */
    private String genError(String msg) {
        StringBuilder commonResponse = new StringBuilder();
        commonResponse.append(msg);
        commonResponse.append(500);
        return commonResponse.toString();
    }

    /**
     * Returns true if the String argument is not null and not empty, false
     * otherwise.
     */
    private boolean hasValue(String parameter) {
        return (parameter != null) && (!parameter.trim().equals(""));
    }

}
