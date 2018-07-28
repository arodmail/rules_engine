package org.cep.rulesengine.parser;

import java.util.List;
import java.util.Vector;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.TreeAdaptor;
import org.cep.rulesengine.model.RuleStatement;

/**
 * Test suite to parse various flavors of Rule statements.  
 */
public class TestRig {
	
	public static void main(String args[]) {
		
		List<String> rules = new Vector<String>();
		rules.add("if (type == 'tripwirespace') { sendMail('email@us.ibm.com') }");
		rules.add("if (this.type != 'tripwire') { sendMail('admin@ibm.com') }");
		rules.add("if (this.count >= 10) { sendMail('admin@ibm.com') }");
		rules.add("if (this.count <= 10) { sendMail('admin@ibm.com') }");
		rules.add("if (this.time > '2010:05:16:12:00:05') { sendMail('admin@ibm.com') }");
		rules.add("if (this.time < '2010:05:16:12:00:05') { sendMail('admin@ibm.com') }");
		rules.add("if ( (this.type == 'tripwire') && (this.flavor == 'vanilla') ) { sendMail('admin@ibm.com', 'host', 'subject') }");
		rules.add("if ( (this.type == 'tripwire') || (this.count == 10) ) { sendMail('admin@ibm.com', 'host', 'subject') }");
		rules.add("if ('2010:05:16:06:30:20' >= lookup.alerts_external.identity('objectremoval').view_id(103).alertStart) { sendMail('admin@us.ibm.com') }");
		rules.add("if (this.alertStart >= lookup.alerts_external.identity('objectremoval').view_id(103).alertStart) { sendMail('admin@us.ibm.com') }");
		rules.add("if ( (this.type == 'tripwire') && (this.flavor == 'vanilla') && (this.count == 100) ) { sendMail('admin@ibm.com', 'host', 'subject') }");
		
		rules.add("if ( (this.class == 'Speeding') && (this.view_id == 1001) " +
		          "&& (this.alertstart - 15s >= lookup.alerts_external.class('Tripwire').view(1002).alertstart) ) " +
		          "{ sendMail('admin@us.ibm.com') }");

		rules.add("if ( (type == 'tripwire') && (height == 400) ) { sendMail('admin@us.ibm.com', 'host') } " +
				  "if ( (color == 'blue') || (size == 100) ) { sendMail('admin@us.ibm.com') } " +
				  "if ( (speed == 'slow') && (width < 300) ) { sendMail('admin@us.ibm.com', 'subject') }");

		rules.add("if ( (this.class == 'Tripwire') && (this.identity == 'StamfordTrainStation') && (this.view_id == 2002) " +
				"&& (this.alertstart - 15s >= lookup.alerts_external.class('Tripwire').identity('StamfordTrainStation').view(1002).alertstart) )" +
				"{ sendMail('arodmail@gmail.com') }");

		for (String rule: rules) {
			testRuleStatement(rule);
		}
	
	}

	
	public static void testRuleStatement(String ruleStatement) {
        System.out.println(ruleStatement.toString() + "\n");

        RuleLangLexer lex = new RuleLangLexer(new ANTLRStringStream(ruleStatement));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        RuleLangParser parser = new RuleLangParser(tokens, null);
                
        final TreeAdaptor adaptor = new CommonTreeAdaptor() {
        	public Object create(Token payload) {
        		return new CommonTree(payload);
        	}
        }; 
        
        // hook the adaptor to the parser, so that the parser knows what to use 
        // to create the tree
        parser.setTreeAdaptor(adaptor);
        
        //build an AST (a 2 dimensional rule)
        try {
			Object tree = parser.rule().getTree();			
			CommonTree statementAST = (CommonTree)tree;
			
			CommonTreeNodeStream nodes = new CommonTreeNodeStream(statementAST);						
			RuleTreeWalker walker = new RuleTreeWalker(nodes);
			
			walker.rule();

			RuleStatement statement = walker.getStatement();
			
			System.out.println(statement.toString() + "\n");
						
        } catch (RecognitionException e) {
			System.err.println("Invalid rule syntax " 
					+ ruleStatement + "Error: " + e.getMessage());
        }
	}

    /**
     * The tree is organized in arrays of children and children can have arrays 
     * of children. This is a simple recursive procedure to walk the tree. This 
     * is also the stage at which AST nodes should be mapped into (translated to)
     * the evaluation model.
     */
    public static void printTree(CommonTree t, int indent) {
		StringBuffer sb = new StringBuffer(indent);
    	if ( t != null ) {
    		for ( int i = 0; i < indent; i++ )
    			sb = sb.append("   ");
    		for ( int i = 0; i < t.getChildCount(); i++ ) {
    			System.out.println(sb.toString() + t.getChild(i).toString());
    			printTree((CommonTree)t.getChild(i), indent+1);
    		}
    	}
    }


}
