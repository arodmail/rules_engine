// $ANTLR 3.2 Sep 23, 2009 14:05:07 /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g 2018-07-27 21:41:50

	package org.cep.rulesengine.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

/** 
 * Recognizes and builds trees for the Rule Language. 
 * Results in RuleLangParser.java, RuleLangLexer.java,
 * and the token definition file RuleLang.tokens used by
 * the tree grammar to ensure token types are the same.
*/
public class RuleLangParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IF", "LPAREN", "OR", "RPAREN", "AND", "ID", "EQ", "BANGEQ", "GT", "LT", "LTEQ", "GTEQ", "INT", "PLUS", "SLASH", "STAR", "MINUS", "LOOKUP", "THIS", "DOT", "THEN", "CTD", "CRITERIA", "NAMEVAL", "NAME", "VAL", "LEAF", "TIMEROLL", "LITERAL", "ROOT", "SEC", "MIN", "HR", "ACTION", "ARGS", "ARG", "SEMI", "COMMA", "EQL", "WS", "'{'", "'}'", "'for'", "'\\''"
    };
    public static final int TIMEROLL=31;
    public static final int LT=13;
    public static final int STAR=19;
    public static final int HR=36;
    public static final int LTEQ=14;
    public static final int ID=9;
    public static final int AND=8;
    public static final int EOF=-1;
    public static final int LEAF=30;
    public static final int ACTION=37;
    public static final int LPAREN=5;
    public static final int IF=4;
    public static final int RPAREN=7;
    public static final int NAME=28;
    public static final int SLASH=18;
    public static final int THEN=24;
    public static final int ARG=39;
    public static final int SEC=34;
    public static final int COMMA=41;
    public static final int THIS=22;
    public static final int ARGS=38;
    public static final int BANGEQ=11;
    public static final int VAL=29;
    public static final int PLUS=17;
    public static final int NAMEVAL=27;
    public static final int CTD=25;
    public static final int EQ=10;
    public static final int DOT=23;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int LITERAL=32;
    public static final int INT=16;
    public static final int MIN=35;
    public static final int GTEQ=15;
    public static final int MINUS=20;
    public static final int SEMI=40;
    public static final int ROOT=33;
    public static final int LOOKUP=21;
    public static final int WS=43;
    public static final int OR=6;
    public static final int CRITERIA=26;
    public static final int GT=12;
    public static final int EQL=42;

    // delegates
    // delegators


        public RuleLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public RuleLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return RuleLangParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g"; }



    	public String getErrorMessage(RecognitionException e, String[] tokenNames) {
    		List stack = getRuleInvocationStack(e, this.getClass().getName());
    		String msg = null;
    		if ( e instanceof NoViableAltException ) {
    			NoViableAltException nvae = (NoViableAltException)e;
    			msg = " no viable alt; token="+e.token+
    			" (decision="+nvae.decisionNumber+
    			" state "+nvae.stateNumber+")"+
    			" decision=<<"+nvae.grammarDecisionDescription+">>";
    		} else {
    			msg = super.getErrorMessage(e, tokenNames);
    		}
    		return stack+" "+msg;
    	}
    	
    public String getTokenErrorDisplay(Token t) {
    		return t.toString();
    	}



    public static class rule_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rule"
    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:45:1: rule : ( statement )+ -> ( ^( ROOT statement ) )+ ;
    public final RuleLangParser.rule_return rule() throws RecognitionException {
        RuleLangParser.rule_return retval = new RuleLangParser.rule_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleLangParser.statement_return statement1 = null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:46:2: ( ( statement )+ -> ( ^( ROOT statement ) )+ )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:47:3: ( statement )+
            {
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:47:3: ( statement )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IF) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:47:4: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_rule61);
            	    statement1=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);



            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 47:16: -> ( ^( ROOT statement ) )+
            {
                if ( !(stream_statement.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_statement.hasNext() ) {
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:47:19: ^( ROOT statement )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ROOT, "ROOT"), root_1);

                    adaptor.addChild(root_1, stream_statement.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_statement.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rule"

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:50:1: statement : ( ( IF condition '{' action '}' )+ -> ( ^( IF condition ^( THEN action ) ) )* | ( IF predicate '{' action '}' )+ -> ( ^( IF predicate ^( THEN action ) ) )* );
    public final RuleLangParser.statement_return statement() throws RecognitionException {
        RuleLangParser.statement_return retval = new RuleLangParser.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF2=null;
        Token char_literal4=null;
        Token char_literal6=null;
        Token IF7=null;
        Token char_literal9=null;
        Token char_literal11=null;
        RuleLangParser.condition_return condition3 = null;

        RuleLangParser.action_return action5 = null;

        RuleLangParser.predicate_return predicate8 = null;

        RuleLangParser.action_return action10 = null;


        Object IF2_tree=null;
        Object char_literal4_tree=null;
        Object char_literal6_tree=null;
        Object IF7_tree=null;
        Object char_literal9_tree=null;
        Object char_literal11_tree=null;
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"rule predicate");
        RewriteRuleSubtreeStream stream_action=new RewriteRuleSubtreeStream(adaptor,"rule action");
        try {
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:51:2: ( ( IF condition '{' action '}' )+ -> ( ^( IF condition ^( THEN action ) ) )* | ( IF predicate '{' action '}' )+ -> ( ^( IF predicate ^( THEN action ) ) )* )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:52:3: ( IF condition '{' action '}' )+
                    {
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:52:3: ( IF condition '{' action '}' )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==IF) ) {
                            int LA2_2 = input.LA(2);

                            if ( (synpred2_RuleLang()) ) {
                                alt2=1;
                            }


                        }


                        switch (alt2) {
                    	case 1 :
                    	    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:52:4: IF condition '{' action '}'
                    	    {
                    	    IF2=(Token)match(input,IF,FOLLOW_IF_in_statement86); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_IF.add(IF2);

                    	    pushFollow(FOLLOW_condition_in_statement88);
                    	    condition3=condition();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_condition.add(condition3.getTree());
                    	    char_literal4=(Token)match(input,44,FOLLOW_44_in_statement90); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_44.add(char_literal4);

                    	    pushFollow(FOLLOW_action_in_statement92);
                    	    action5=action();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_action.add(action5.getTree());
                    	    char_literal6=(Token)match(input,45,FOLLOW_45_in_statement94); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_45.add(char_literal6);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);



                    // AST REWRITE
                    // elements: action, IF, condition
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 53:7: -> ( ^( IF condition ^( THEN action ) ) )*
                    {
                        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:53:10: ( ^( IF condition ^( THEN action ) ) )*
                        while ( stream_action.hasNext()||stream_IF.hasNext()||stream_condition.hasNext() ) {
                            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:53:10: ^( IF condition ^( THEN action ) )
                            {
                            Object root_1 = (Object)adaptor.nil();
                            root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                            adaptor.addChild(root_1, stream_condition.nextTree());
                            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:53:25: ^( THEN action )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(THEN, "THEN"), root_2);

                            adaptor.addChild(root_2, stream_action.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                            adaptor.addChild(root_0, root_1);
                            }

                        }
                        stream_action.reset();
                        stream_IF.reset();
                        stream_condition.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:55:3: ( IF predicate '{' action '}' )+
                    {
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:55:3: ( IF predicate '{' action '}' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==IF) ) {
                            int LA3_2 = input.LA(2);

                            if ( (synpred4_RuleLang()) ) {
                                alt3=1;
                            }


                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:55:4: IF predicate '{' action '}'
                    	    {
                    	    IF7=(Token)match(input,IF,FOLLOW_IF_in_statement126); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_IF.add(IF7);

                    	    pushFollow(FOLLOW_predicate_in_statement128);
                    	    predicate8=predicate();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_predicate.add(predicate8.getTree());
                    	    char_literal9=(Token)match(input,44,FOLLOW_44_in_statement130); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_44.add(char_literal9);

                    	    pushFollow(FOLLOW_action_in_statement132);
                    	    action10=action();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_action.add(action10.getTree());
                    	    char_literal11=(Token)match(input,45,FOLLOW_45_in_statement134); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_45.add(char_literal11);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);



                    // AST REWRITE
                    // elements: action, IF, predicate
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 56:7: -> ( ^( IF predicate ^( THEN action ) ) )*
                    {
                        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:56:10: ( ^( IF predicate ^( THEN action ) ) )*
                        while ( stream_action.hasNext()||stream_IF.hasNext()||stream_predicate.hasNext() ) {
                            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:56:10: ^( IF predicate ^( THEN action ) )
                            {
                            Object root_1 = (Object)adaptor.nil();
                            root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                            adaptor.addChild(root_1, stream_predicate.nextTree());
                            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:56:25: ^( THEN action )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(THEN, "THEN"), root_2);

                            adaptor.addChild(root_2, stream_action.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                            adaptor.addChild(root_0, root_1);
                            }

                        }
                        stream_action.reset();
                        stream_IF.reset();
                        stream_predicate.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class predicate_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "predicate"
    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:59:1: predicate options {backtrack=true; } : ( LPAREN condition ( OR condition )+ ( predicate )? RPAREN -> ^( OR ( condition )+ ( predicate )? ) | LPAREN condition ( AND condition )+ ( predicate )? RPAREN -> ^( AND ( condition )+ ( predicate )? ) | ( OR ( predicate )* condition )+ -> ^( OR ( predicate )? ( condition )+ ) | ( AND ( predicate )* condition )+ -> ^( AND ( predicate )? ( condition )+ ) );
    public final RuleLangParser.predicate_return predicate() throws RecognitionException {
        RuleLangParser.predicate_return retval = new RuleLangParser.predicate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN12=null;
        Token OR14=null;
        Token RPAREN17=null;
        Token LPAREN18=null;
        Token AND20=null;
        Token RPAREN23=null;
        Token OR24=null;
        Token AND27=null;
        RuleLangParser.condition_return condition13 = null;

        RuleLangParser.condition_return condition15 = null;

        RuleLangParser.predicate_return predicate16 = null;

        RuleLangParser.condition_return condition19 = null;

        RuleLangParser.condition_return condition21 = null;

        RuleLangParser.predicate_return predicate22 = null;

        RuleLangParser.predicate_return predicate25 = null;

        RuleLangParser.condition_return condition26 = null;

        RuleLangParser.predicate_return predicate28 = null;

        RuleLangParser.condition_return condition29 = null;


        Object LPAREN12_tree=null;
        Object OR14_tree=null;
        Object RPAREN17_tree=null;
        Object LPAREN18_tree=null;
        Object AND20_tree=null;
        Object RPAREN23_tree=null;
        Object OR24_tree=null;
        Object AND27_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_OR=new RewriteRuleTokenStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"rule predicate");
        try {
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:60:2: ( LPAREN condition ( OR condition )+ ( predicate )? RPAREN -> ^( OR ( condition )+ ( predicate )? ) | LPAREN condition ( AND condition )+ ( predicate )? RPAREN -> ^( AND ( condition )+ ( predicate )? ) | ( OR ( predicate )* condition )+ -> ^( OR ( predicate )? ( condition )+ ) | ( AND ( predicate )* condition )+ -> ^( AND ( predicate )? ( condition )+ ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                int LA13_1 = input.LA(2);

                if ( (synpred7_RuleLang()) ) {
                    alt13=1;
                }
                else if ( (synpred10_RuleLang()) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
                }
                break;
            case OR:
                {
                alt13=3;
                }
                break;
            case AND:
                {
                alt13=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:61:9: LPAREN condition ( OR condition )+ ( predicate )? RPAREN
                    {
                    LPAREN12=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_predicate187); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN12);

                    pushFollow(FOLLOW_condition_in_predicate189);
                    condition13=condition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_condition.add(condition13.getTree());
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:61:26: ( OR condition )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==OR) ) {
                            int LA5_2 = input.LA(2);

                            if ( (synpred5_RuleLang()) ) {
                                alt5=1;
                            }


                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:61:27: OR condition
                    	    {
                    	    OR14=(Token)match(input,OR,FOLLOW_OR_in_predicate192); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_OR.add(OR14);

                    	    pushFollow(FOLLOW_condition_in_predicate194);
                    	    condition15=condition();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_condition.add(condition15.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:61:42: ( predicate )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>=LPAREN && LA6_0<=OR)||LA6_0==AND) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:0:0: predicate
                            {
                            pushFollow(FOLLOW_predicate_in_predicate198);
                            predicate16=predicate();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_predicate.add(predicate16.getTree());

                            }
                            break;

                    }

                    RPAREN17=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_predicate201); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN17);



                    // AST REWRITE
                    // elements: predicate, condition, OR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 62:13: -> ^( OR ( condition )+ ( predicate )? )
                    {
                        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:62:16: ^( OR ( condition )+ ( predicate )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        if ( !(stream_condition.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_condition.hasNext() ) {
                            adaptor.addChild(root_1, stream_condition.nextTree());

                        }
                        stream_condition.reset();
                        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:62:32: ( predicate )?
                        if ( stream_predicate.hasNext() ) {
                            adaptor.addChild(root_1, stream_predicate.nextTree());

                        }
                        stream_predicate.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:64:9: LPAREN condition ( AND condition )+ ( predicate )? RPAREN
                    {
                    LPAREN18=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_predicate248); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN18);

                    pushFollow(FOLLOW_condition_in_predicate250);
                    condition19=condition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_condition.add(condition19.getTree());
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:64:26: ( AND condition )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==AND) ) {
                            int LA7_3 = input.LA(2);

                            if ( (synpred8_RuleLang()) ) {
                                alt7=1;
                            }


                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:64:27: AND condition
                    	    {
                    	    AND20=(Token)match(input,AND,FOLLOW_AND_in_predicate253); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_AND.add(AND20);

                    	    pushFollow(FOLLOW_condition_in_predicate255);
                    	    condition21=condition();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_condition.add(condition21.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:64:43: ( predicate )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0>=LPAREN && LA8_0<=OR)||LA8_0==AND) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:0:0: predicate
                            {
                            pushFollow(FOLLOW_predicate_in_predicate259);
                            predicate22=predicate();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_predicate.add(predicate22.getTree());

                            }
                            break;

                    }

                    RPAREN23=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_predicate262); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN23);



                    // AST REWRITE
                    // elements: predicate, AND, condition
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 65:13: -> ^( AND ( condition )+ ( predicate )? )
                    {
                        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:65:16: ^( AND ( condition )+ ( predicate )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_1);

                        if ( !(stream_condition.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_condition.hasNext() ) {
                            adaptor.addChild(root_1, stream_condition.nextTree());

                        }
                        stream_condition.reset();
                        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:65:33: ( predicate )?
                        if ( stream_predicate.hasNext() ) {
                            adaptor.addChild(root_1, stream_predicate.nextTree());

                        }
                        stream_predicate.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:67:9: ( OR ( predicate )* condition )+
                    {
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:67:9: ( OR ( predicate )* condition )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==OR) ) {
                            int LA10_2 = input.LA(2);

                            if ( (synpred12_RuleLang()) ) {
                                alt10=1;
                            }


                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:67:10: OR ( predicate )* condition
                    	    {
                    	    OR24=(Token)match(input,OR,FOLLOW_OR_in_predicate308); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_OR.add(OR24);

                    	    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:67:13: ( predicate )*
                    	    loop9:
                    	    do {
                    	        int alt9=2;
                    	        alt9 = dfa9.predict(input);
                    	        switch (alt9) {
                    	    	case 1 :
                    	    	    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:0:0: predicate
                    	    	    {
                    	    	    pushFollow(FOLLOW_predicate_in_predicate310);
                    	    	    predicate25=predicate();

                    	    	    state._fsp--;
                    	    	    if (state.failed) return retval;
                    	    	    if ( state.backtracking==0 ) stream_predicate.add(predicate25.getTree());

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop9;
                    	        }
                    	    } while (true);

                    	    pushFollow(FOLLOW_condition_in_predicate313);
                    	    condition26=condition();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_condition.add(condition26.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);



                    // AST REWRITE
                    // elements: predicate, condition, OR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 68:13: -> ^( OR ( predicate )? ( condition )+ )
                    {
                        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:68:16: ^( OR ( predicate )? ( condition )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

                        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:68:21: ( predicate )?
                        if ( stream_predicate.hasNext() ) {
                            adaptor.addChild(root_1, stream_predicate.nextTree());

                        }
                        stream_predicate.reset();
                        if ( !(stream_condition.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_condition.hasNext() ) {
                            adaptor.addChild(root_1, stream_condition.nextTree());

                        }
                        stream_condition.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:70:3: ( AND ( predicate )* condition )+
                    {
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:70:3: ( AND ( predicate )* condition )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==AND) ) {
                            int LA12_2 = input.LA(2);

                            if ( (synpred15_RuleLang()) ) {
                                alt12=1;
                            }


                        }


                        switch (alt12) {
                    	case 1 :
                    	    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:70:4: AND ( predicate )* condition
                    	    {
                    	    AND27=(Token)match(input,AND,FOLLOW_AND_in_predicate350); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_AND.add(AND27);

                    	    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:70:8: ( predicate )*
                    	    loop11:
                    	    do {
                    	        int alt11=2;
                    	        alt11 = dfa11.predict(input);
                    	        switch (alt11) {
                    	    	case 1 :
                    	    	    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:0:0: predicate
                    	    	    {
                    	    	    pushFollow(FOLLOW_predicate_in_predicate352);
                    	    	    predicate28=predicate();

                    	    	    state._fsp--;
                    	    	    if (state.failed) return retval;
                    	    	    if ( state.backtracking==0 ) stream_predicate.add(predicate28.getTree());

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop11;
                    	        }
                    	    } while (true);

                    	    pushFollow(FOLLOW_condition_in_predicate355);
                    	    condition29=condition();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_condition.add(condition29.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);



                    // AST REWRITE
                    // elements: predicate, AND, condition
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 71:7: -> ^( AND ( predicate )? ( condition )+ )
                    {
                        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:71:10: ^( AND ( predicate )? ( condition )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_1);

                        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:71:16: ( predicate )?
                        if ( stream_predicate.hasNext() ) {
                            adaptor.addChild(root_1, stream_predicate.nextTree());

                        }
                        stream_predicate.reset();
                        if ( !(stream_condition.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_condition.hasNext() ) {
                            adaptor.addChild(root_1, stream_condition.nextTree());

                        }
                        stream_condition.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "predicate"

    public static class forstatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forstatement"
    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:74:1: forstatement : 'for' '(' (varDecl= variableDeclarator ) ';' ( operandExpression ) ';' (counter= operandExpression ) ')' statement -> ^( 'for' $varDecl operandExpression $counter ( statement )* ) ;
    public final RuleLangParser.forstatement_return forstatement() throws RecognitionException {
        RuleLangParser.forstatement_return retval = new RuleLangParser.forstatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal30=null;
        Token char_literal31=null;
        Token char_literal32=null;
        Token char_literal34=null;
        Token char_literal35=null;
        RuleLangParser.variableDeclarator_return varDecl = null;

        RuleLangParser.operandExpression_return counter = null;

        RuleLangParser.operandExpression_return operandExpression33 = null;

        RuleLangParser.statement_return statement36 = null;


        Object string_literal30_tree=null;
        Object char_literal31_tree=null;
        Object char_literal32_tree=null;
        Object char_literal34_tree=null;
        Object char_literal35_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_variableDeclarator=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarator");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_operandExpression=new RewriteRuleSubtreeStream(adaptor,"rule operandExpression");
        try {
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:75:5: ( 'for' '(' (varDecl= variableDeclarator ) ';' ( operandExpression ) ';' (counter= operandExpression ) ')' statement -> ^( 'for' $varDecl operandExpression $counter ( statement )* ) )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:76:9: 'for' '(' (varDecl= variableDeclarator ) ';' ( operandExpression ) ';' (counter= operandExpression ) ')' statement
            {
            string_literal30=(Token)match(input,46,FOLLOW_46_in_forstatement400); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_46.add(string_literal30);

            char_literal31=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_forstatement402); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(char_literal31);

            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:76:19: (varDecl= variableDeclarator )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:76:20: varDecl= variableDeclarator
            {
            pushFollow(FOLLOW_variableDeclarator_in_forstatement407);
            varDecl=variableDeclarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclarator.add(varDecl.getTree());

            }

            char_literal32=(Token)match(input,SEMI,FOLLOW_SEMI_in_forstatement410); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(char_literal32);

            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:77:19: ( operandExpression )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:77:20: operandExpression
            {
            pushFollow(FOLLOW_operandExpression_in_forstatement432);
            operandExpression33=operandExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_operandExpression.add(operandExpression33.getTree());

            }

            char_literal34=(Token)match(input,SEMI,FOLLOW_SEMI_in_forstatement435); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(char_literal34);

            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:78:19: (counter= operandExpression )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:78:20: counter= operandExpression
            {
            pushFollow(FOLLOW_operandExpression_in_forstatement459);
            counter=operandExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_operandExpression.add(counter.getTree());

            }

            char_literal35=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_forstatement477); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(char_literal35);

            pushFollow(FOLLOW_statement_in_forstatement479);
            statement36=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement36.getTree());


            // AST REWRITE
            // elements: 46, operandExpression, counter, statement, varDecl
            // token labels: 
            // rule labels: retval, counter, varDecl
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_counter=new RewriteRuleSubtreeStream(adaptor,"rule counter",counter!=null?counter.tree:null);
            RewriteRuleSubtreeStream stream_varDecl=new RewriteRuleSubtreeStream(adaptor,"rule varDecl",varDecl!=null?varDecl.tree:null);

            root_0 = (Object)adaptor.nil();
            // 80:9: -> ^( 'for' $varDecl operandExpression $counter ( statement )* )
            {
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:80:12: ^( 'for' $varDecl operandExpression $counter ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_46.nextNode(), root_1);

                adaptor.addChild(root_1, stream_varDecl.nextTree());
                adaptor.addChild(root_1, stream_operandExpression.nextTree());
                adaptor.addChild(root_1, stream_counter.nextTree());
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:80:56: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "forstatement"

    public static class variableDeclarator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableDeclarator"
    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:83:1: variableDeclarator : ID ( '=' ( operand | ruleExpression ) )? -> ^( EQL ID ( operand )* ( ruleExpression )* ) ;
    public final RuleLangParser.variableDeclarator_return variableDeclarator() throws RecognitionException {
        RuleLangParser.variableDeclarator_return retval = new RuleLangParser.variableDeclarator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID37=null;
        Token char_literal38=null;
        RuleLangParser.operand_return operand39 = null;

        RuleLangParser.ruleExpression_return ruleExpression40 = null;


        Object ID37_tree=null;
        Object char_literal38_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_EQL=new RewriteRuleTokenStream(adaptor,"token EQL");
        RewriteRuleSubtreeStream stream_ruleExpression=new RewriteRuleSubtreeStream(adaptor,"rule ruleExpression");
        RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");
        try {
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:84:5: ( ID ( '=' ( operand | ruleExpression ) )? -> ^( EQL ID ( operand )* ( ruleExpression )* ) )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:84:9: ID ( '=' ( operand | ruleExpression ) )?
            {
            ID37=(Token)match(input,ID,FOLLOW_ID_in_variableDeclarator524); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID37);

            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:85:9: ( '=' ( operand | ruleExpression ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==EQL) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:85:10: '=' ( operand | ruleExpression )
                    {
                    char_literal38=(Token)match(input,EQL,FOLLOW_EQL_in_variableDeclarator535); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQL.add(char_literal38);

                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:85:14: ( operand | ruleExpression )
                    int alt14=2;
                    switch ( input.LA(1) ) {
                    case INT:
                    case 47:
                        {
                        alt14=1;
                        }
                        break;
                    case THIS:
                        {
                        int LA14_2 = input.LA(2);

                        if ( (LA14_2==DOT) ) {
                            int LA14_5 = input.LA(3);

                            if ( (LA14_5==ID) ) {
                                int LA14_6 = input.LA(4);

                                if ( (LA14_6==PLUS||LA14_6==MINUS) ) {
                                    alt14=2;
                                }
                                else if ( (LA14_6==SEMI) ) {
                                    alt14=1;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 14, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 14, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case ID:
                        {
                        int LA14_3 = input.LA(2);

                        if ( (LA14_3==PLUS||LA14_3==MINUS) ) {
                            alt14=2;
                        }
                        else if ( (LA14_3==SEMI) ) {
                            alt14=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LPAREN:
                    case LOOKUP:
                        {
                        alt14=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }

                    switch (alt14) {
                        case 1 :
                            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:85:15: operand
                            {
                            pushFollow(FOLLOW_operand_in_variableDeclarator538);
                            operand39=operand();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_operand.add(operand39.getTree());

                            }
                            break;
                        case 2 :
                            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:85:25: ruleExpression
                            {
                            pushFollow(FOLLOW_ruleExpression_in_variableDeclarator542);
                            ruleExpression40=ruleExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_ruleExpression.add(ruleExpression40.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }



            // AST REWRITE
            // elements: ID, operand, ruleExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 87:9: -> ^( EQL ID ( operand )* ( ruleExpression )* )
            {
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:87:12: ^( EQL ID ( operand )* ( ruleExpression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQL, "EQL"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:87:21: ( operand )*
                while ( stream_operand.hasNext() ) {
                    adaptor.addChild(root_1, stream_operand.nextTree());

                }
                stream_operand.reset();
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:87:30: ( ruleExpression )*
                while ( stream_ruleExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_ruleExpression.nextTree());

                }
                stream_ruleExpression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variableDeclarator"

    public static class condition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condition"
    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:97:1: condition options {backtrack=true; } : ( equalityCondition | inequalityCondition | greaterThanCondition | lessThanCondition | greaterThanOrEqualCondition | lessThanOrEqualCondition );
    public final RuleLangParser.condition_return condition() throws RecognitionException {
        RuleLangParser.condition_return retval = new RuleLangParser.condition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleLangParser.equalityCondition_return equalityCondition41 = null;

        RuleLangParser.inequalityCondition_return inequalityCondition42 = null;

        RuleLangParser.greaterThanCondition_return greaterThanCondition43 = null;

        RuleLangParser.lessThanCondition_return lessThanCondition44 = null;

        RuleLangParser.greaterThanOrEqualCondition_return greaterThanOrEqualCondition45 = null;

        RuleLangParser.lessThanOrEqualCondition_return lessThanOrEqualCondition46 = null;



        try {
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:98:2: ( equalityCondition | inequalityCondition | greaterThanCondition | lessThanCondition | greaterThanOrEqualCondition | lessThanOrEqualCondition )
            int alt16=6;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==LPAREN) ) {
                int LA16_1 = input.LA(2);

                if ( (synpred18_RuleLang()) ) {
                    alt16=1;
                }
                else if ( (synpred19_RuleLang()) ) {
                    alt16=2;
                }
                else if ( (synpred20_RuleLang()) ) {
                    alt16=3;
                }
                else if ( (synpred21_RuleLang()) ) {
                    alt16=4;
                }
                else if ( (synpred22_RuleLang()) ) {
                    alt16=5;
                }
                else if ( (true) ) {
                    alt16=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:99:3: equalityCondition
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_equalityCondition_in_condition611);
                    equalityCondition41=equalityCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityCondition41.getTree());

                    }
                    break;
                case 2 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:100:5: inequalityCondition
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_inequalityCondition_in_condition618);
                    inequalityCondition42=inequalityCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, inequalityCondition42.getTree());

                    }
                    break;
                case 3 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:101:5: greaterThanCondition
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_greaterThanCondition_in_condition625);
                    greaterThanCondition43=greaterThanCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, greaterThanCondition43.getTree());

                    }
                    break;
                case 4 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:102:5: lessThanCondition
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lessThanCondition_in_condition632);
                    lessThanCondition44=lessThanCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lessThanCondition44.getTree());

                    }
                    break;
                case 5 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:103:5: greaterThanOrEqualCondition
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_greaterThanOrEqualCondition_in_condition638);
                    greaterThanOrEqualCondition45=greaterThanOrEqualCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, greaterThanOrEqualCondition45.getTree());

                    }
                    break;
                case 6 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:104:5: lessThanOrEqualCondition
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lessThanOrEqualCondition_in_condition645);
                    lessThanOrEqualCondition46=lessThanOrEqualCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lessThanOrEqualCondition46.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "condition"

    public static class equalityCondition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityCondition"
    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:107:1: equalityCondition : LPAREN ( operand | ruleExpression ) EQ ( operand | ruleExpression ) RPAREN -> ^( EQ ( operand )* ( ruleExpression )* ) ;
    public final RuleLangParser.equalityCondition_return equalityCondition() throws RecognitionException {
        RuleLangParser.equalityCondition_return retval = new RuleLangParser.equalityCondition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN47=null;
        Token EQ50=null;
        Token RPAREN53=null;
        RuleLangParser.operand_return operand48 = null;

        RuleLangParser.ruleExpression_return ruleExpression49 = null;

        RuleLangParser.operand_return operand51 = null;

        RuleLangParser.ruleExpression_return ruleExpression52 = null;


        Object LPAREN47_tree=null;
        Object EQ50_tree=null;
        Object RPAREN53_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_ruleExpression=new RewriteRuleSubtreeStream(adaptor,"rule ruleExpression");
        RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");
        try {
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:108:2: ( LPAREN ( operand | ruleExpression ) EQ ( operand | ruleExpression ) RPAREN -> ^( EQ ( operand )* ( ruleExpression )* ) )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:109:3: LPAREN ( operand | ruleExpression ) EQ ( operand | ruleExpression ) RPAREN
            {
            LPAREN47=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_equalityCondition659); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN47);

            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:109:10: ( operand | ruleExpression )
            int alt17=2;
            switch ( input.LA(1) ) {
            case INT:
            case 47:
                {
                alt17=1;
                }
                break;
            case THIS:
                {
                int LA17_2 = input.LA(2);

                if ( (LA17_2==DOT) ) {
                    int LA17_5 = input.LA(3);

                    if ( (LA17_5==ID) ) {
                        int LA17_6 = input.LA(4);

                        if ( (LA17_6==EQ) ) {
                            alt17=1;
                        }
                        else if ( (LA17_6==PLUS||LA17_6==MINUS) ) {
                            alt17=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 17, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 5, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA17_3 = input.LA(2);

                if ( (LA17_3==PLUS||LA17_3==MINUS) ) {
                    alt17=2;
                }
                else if ( (LA17_3==EQ) ) {
                    alt17=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 3, input);

                    throw nvae;
                }
                }
                break;
            case LPAREN:
            case LOOKUP:
                {
                alt17=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:109:11: operand
                    {
                    pushFollow(FOLLOW_operand_in_equalityCondition662);
                    operand48=operand();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_operand.add(operand48.getTree());

                    }
                    break;
                case 2 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:109:21: ruleExpression
                    {
                    pushFollow(FOLLOW_ruleExpression_in_equalityCondition666);
                    ruleExpression49=ruleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ruleExpression.add(ruleExpression49.getTree());

                    }
                    break;

            }

            EQ50=(Token)match(input,EQ,FOLLOW_EQ_in_equalityCondition669); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EQ.add(EQ50);

            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:109:40: ( operand | ruleExpression )
            int alt18=2;
            switch ( input.LA(1) ) {
            case INT:
            case 47:
                {
                alt18=1;
                }
                break;
            case THIS:
                {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==DOT) ) {
                    int LA18_5 = input.LA(3);

                    if ( (LA18_5==ID) ) {
                        int LA18_6 = input.LA(4);

                        if ( (LA18_6==PLUS||LA18_6==MINUS) ) {
                            alt18=2;
                        }
                        else if ( (LA18_6==RPAREN) ) {
                            alt18=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 5, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 2, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA18_3 = input.LA(2);

                if ( (LA18_3==PLUS||LA18_3==MINUS) ) {
                    alt18=2;
                }
                else if ( (LA18_3==RPAREN) ) {
                    alt18=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 3, input);

                    throw nvae;
                }
                }
                break;
            case LPAREN:
            case LOOKUP:
                {
                alt18=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:109:41: operand
                    {
                    pushFollow(FOLLOW_operand_in_equalityCondition672);
                    operand51=operand();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_operand.add(operand51.getTree());

                    }
                    break;
                case 2 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:109:51: ruleExpression
                    {
                    pushFollow(FOLLOW_ruleExpression_in_equalityCondition676);
                    ruleExpression52=ruleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ruleExpression.add(ruleExpression52.getTree());

                    }
                    break;

            }

            RPAREN53=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_equalityCondition679); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN53);



            // AST REWRITE
            // elements: EQ, ruleExpression, operand
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 110:4: -> ^( EQ ( operand )* ( ruleExpression )* )
            {
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:110:7: ^( EQ ( operand )* ( ruleExpression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_EQ.nextNode(), root_1);

                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:110:12: ( operand )*
                while ( stream_operand.hasNext() ) {
                    adaptor.addChild(root_1, stream_operand.nextTree());

                }
                stream_operand.reset();
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:110:21: ( ruleExpression )*
                while ( stream_ruleExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_ruleExpression.nextTree());

                }
                stream_ruleExpression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "equalityCondition"

    public static class inequalityCondition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inequalityCondition"
    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:113:1: inequalityCondition : LPAREN ( operand | ruleExpression ) BANGEQ ( operand | ruleExpression ) RPAREN -> ^( BANGEQ ( operand )* ( ruleExpression )* ) ;
    public final RuleLangParser.inequalityCondition_return inequalityCondition() throws RecognitionException {
        RuleLangParser.inequalityCondition_return retval = new RuleLangParser.inequalityCondition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN54=null;
        Token BANGEQ57=null;
        Token RPAREN60=null;
        RuleLangParser.operand_return operand55 = null;

        RuleLangParser.ruleExpression_return ruleExpression56 = null;

        RuleLangParser.operand_return operand58 = null;

        RuleLangParser.ruleExpression_return ruleExpression59 = null;


        Object LPAREN54_tree=null;
        Object BANGEQ57_tree=null;
        Object RPAREN60_tree=null;
        RewriteRuleTokenStream stream_BANGEQ=new RewriteRuleTokenStream(adaptor,"token BANGEQ");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_ruleExpression=new RewriteRuleSubtreeStream(adaptor,"rule ruleExpression");
        RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");
        try {
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:114:2: ( LPAREN ( operand | ruleExpression ) BANGEQ ( operand | ruleExpression ) RPAREN -> ^( BANGEQ ( operand )* ( ruleExpression )* ) )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:115:3: LPAREN ( operand | ruleExpression ) BANGEQ ( operand | ruleExpression ) RPAREN
            {
            LPAREN54=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_inequalityCondition709); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN54);

            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:115:10: ( operand | ruleExpression )
            int alt19=2;
            switch ( input.LA(1) ) {
            case INT:
            case 47:
                {
                alt19=1;
                }
                break;
            case THIS:
                {
                int LA19_2 = input.LA(2);

                if ( (LA19_2==DOT) ) {
                    int LA19_5 = input.LA(3);

                    if ( (LA19_5==ID) ) {
                        int LA19_6 = input.LA(4);

                        if ( (LA19_6==BANGEQ) ) {
                            alt19=1;
                        }
                        else if ( (LA19_6==PLUS||LA19_6==MINUS) ) {
                            alt19=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 5, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 2, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA19_3 = input.LA(2);

                if ( (LA19_3==PLUS||LA19_3==MINUS) ) {
                    alt19=2;
                }
                else if ( (LA19_3==BANGEQ) ) {
                    alt19=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 3, input);

                    throw nvae;
                }
                }
                break;
            case LPAREN:
            case LOOKUP:
                {
                alt19=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:115:11: operand
                    {
                    pushFollow(FOLLOW_operand_in_inequalityCondition712);
                    operand55=operand();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_operand.add(operand55.getTree());

                    }
                    break;
                case 2 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:115:21: ruleExpression
                    {
                    pushFollow(FOLLOW_ruleExpression_in_inequalityCondition716);
                    ruleExpression56=ruleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ruleExpression.add(ruleExpression56.getTree());

                    }
                    break;

            }

            BANGEQ57=(Token)match(input,BANGEQ,FOLLOW_BANGEQ_in_inequalityCondition719); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BANGEQ.add(BANGEQ57);

            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:115:44: ( operand | ruleExpression )
            int alt20=2;
            switch ( input.LA(1) ) {
            case INT:
            case 47:
                {
                alt20=1;
                }
                break;
            case THIS:
                {
                int LA20_2 = input.LA(2);

                if ( (LA20_2==DOT) ) {
                    int LA20_5 = input.LA(3);

                    if ( (LA20_5==ID) ) {
                        int LA20_6 = input.LA(4);

                        if ( (LA20_6==PLUS||LA20_6==MINUS) ) {
                            alt20=2;
                        }
                        else if ( (LA20_6==RPAREN) ) {
                            alt20=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 5, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 2, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA20_3 = input.LA(2);

                if ( (LA20_3==PLUS||LA20_3==MINUS) ) {
                    alt20=2;
                }
                else if ( (LA20_3==RPAREN) ) {
                    alt20=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 3, input);

                    throw nvae;
                }
                }
                break;
            case LPAREN:
            case LOOKUP:
                {
                alt20=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:115:45: operand
                    {
                    pushFollow(FOLLOW_operand_in_inequalityCondition722);
                    operand58=operand();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_operand.add(operand58.getTree());

                    }
                    break;
                case 2 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:115:55: ruleExpression
                    {
                    pushFollow(FOLLOW_ruleExpression_in_inequalityCondition726);
                    ruleExpression59=ruleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ruleExpression.add(ruleExpression59.getTree());

                    }
                    break;

            }

            RPAREN60=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_inequalityCondition729); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN60);



            // AST REWRITE
            // elements: ruleExpression, operand, BANGEQ
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 116:4: -> ^( BANGEQ ( operand )* ( ruleExpression )* )
            {
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:116:7: ^( BANGEQ ( operand )* ( ruleExpression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_BANGEQ.nextNode(), root_1);

                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:116:16: ( operand )*
                while ( stream_operand.hasNext() ) {
                    adaptor.addChild(root_1, stream_operand.nextTree());

                }
                stream_operand.reset();
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:116:25: ( ruleExpression )*
                while ( stream_ruleExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_ruleExpression.nextTree());

                }
                stream_ruleExpression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "inequalityCondition"

    public static class greaterThanCondition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "greaterThanCondition"
    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:119:1: greaterThanCondition : LPAREN ( operand | ruleExpression ) GT ( operand | ruleExpression ) RPAREN -> ^( GT ( operand )* ( ruleExpression )* ) ;
    public final RuleLangParser.greaterThanCondition_return greaterThanCondition() throws RecognitionException {
        RuleLangParser.greaterThanCondition_return retval = new RuleLangParser.greaterThanCondition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN61=null;
        Token GT64=null;
        Token RPAREN67=null;
        RuleLangParser.operand_return operand62 = null;

        RuleLangParser.ruleExpression_return ruleExpression63 = null;

        RuleLangParser.operand_return operand65 = null;

        RuleLangParser.ruleExpression_return ruleExpression66 = null;


        Object LPAREN61_tree=null;
        Object GT64_tree=null;
        Object RPAREN67_tree=null;
        RewriteRuleTokenStream stream_GT=new RewriteRuleTokenStream(adaptor,"token GT");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_ruleExpression=new RewriteRuleSubtreeStream(adaptor,"rule ruleExpression");
        RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");
        try {
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:120:2: ( LPAREN ( operand | ruleExpression ) GT ( operand | ruleExpression ) RPAREN -> ^( GT ( operand )* ( ruleExpression )* ) )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:121:3: LPAREN ( operand | ruleExpression ) GT ( operand | ruleExpression ) RPAREN
            {
            LPAREN61=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_greaterThanCondition758); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN61);

            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:121:10: ( operand | ruleExpression )
            int alt21=2;
            switch ( input.LA(1) ) {
            case INT:
            case 47:
                {
                alt21=1;
                }
                break;
            case THIS:
                {
                int LA21_2 = input.LA(2);

                if ( (LA21_2==DOT) ) {
                    int LA21_5 = input.LA(3);

                    if ( (LA21_5==ID) ) {
                        int LA21_6 = input.LA(4);

                        if ( (LA21_6==PLUS||LA21_6==MINUS) ) {
                            alt21=2;
                        }
                        else if ( (LA21_6==GT) ) {
                            alt21=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 21, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 5, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 2, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA21_3 = input.LA(2);

                if ( (LA21_3==GT) ) {
                    alt21=1;
                }
                else if ( (LA21_3==PLUS||LA21_3==MINUS) ) {
                    alt21=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 3, input);

                    throw nvae;
                }
                }
                break;
            case LPAREN:
            case LOOKUP:
                {
                alt21=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:121:11: operand
                    {
                    pushFollow(FOLLOW_operand_in_greaterThanCondition761);
                    operand62=operand();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_operand.add(operand62.getTree());

                    }
                    break;
                case 2 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:121:21: ruleExpression
                    {
                    pushFollow(FOLLOW_ruleExpression_in_greaterThanCondition765);
                    ruleExpression63=ruleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ruleExpression.add(ruleExpression63.getTree());

                    }
                    break;

            }

            GT64=(Token)match(input,GT,FOLLOW_GT_in_greaterThanCondition768); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_GT.add(GT64);

            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:121:40: ( operand | ruleExpression )
            int alt22=2;
            switch ( input.LA(1) ) {
            case INT:
            case 47:
                {
                alt22=1;
                }
                break;
            case THIS:
                {
                int LA22_2 = input.LA(2);

                if ( (LA22_2==DOT) ) {
                    int LA22_5 = input.LA(3);

                    if ( (LA22_5==ID) ) {
                        int LA22_6 = input.LA(4);

                        if ( (LA22_6==RPAREN) ) {
                            alt22=1;
                        }
                        else if ( (LA22_6==PLUS||LA22_6==MINUS) ) {
                            alt22=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 22, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 5, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 2, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA22_3 = input.LA(2);

                if ( (LA22_3==RPAREN) ) {
                    alt22=1;
                }
                else if ( (LA22_3==PLUS||LA22_3==MINUS) ) {
                    alt22=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 3, input);

                    throw nvae;
                }
                }
                break;
            case LPAREN:
            case LOOKUP:
                {
                alt22=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:121:41: operand
                    {
                    pushFollow(FOLLOW_operand_in_greaterThanCondition771);
                    operand65=operand();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_operand.add(operand65.getTree());

                    }
                    break;
                case 2 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:121:51: ruleExpression
                    {
                    pushFollow(FOLLOW_ruleExpression_in_greaterThanCondition775);
                    ruleExpression66=ruleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ruleExpression.add(ruleExpression66.getTree());

                    }
                    break;

            }

            RPAREN67=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_greaterThanCondition778); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN67);



            // AST REWRITE
            // elements: ruleExpression, GT, operand
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 122:4: -> ^( GT ( operand )* ( ruleExpression )* )
            {
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:122:7: ^( GT ( operand )* ( ruleExpression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_GT.nextNode(), root_1);

                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:122:12: ( operand )*
                while ( stream_operand.hasNext() ) {
                    adaptor.addChild(root_1, stream_operand.nextTree());

                }
                stream_operand.reset();
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:122:21: ( ruleExpression )*
                while ( stream_ruleExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_ruleExpression.nextTree());

                }
                stream_ruleExpression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "greaterThanCondition"

    public static class lessThanCondition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lessThanCondition"
    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:125:1: lessThanCondition : LPAREN ( operand | ruleExpression ) LT ( operand | ruleExpression ) RPAREN -> ^( LT ( operand )* ( ruleExpression )* ) ;
    public final RuleLangParser.lessThanCondition_return lessThanCondition() throws RecognitionException {
        RuleLangParser.lessThanCondition_return retval = new RuleLangParser.lessThanCondition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN68=null;
        Token LT71=null;
        Token RPAREN74=null;
        RuleLangParser.operand_return operand69 = null;

        RuleLangParser.ruleExpression_return ruleExpression70 = null;

        RuleLangParser.operand_return operand72 = null;

        RuleLangParser.ruleExpression_return ruleExpression73 = null;


        Object LPAREN68_tree=null;
        Object LT71_tree=null;
        Object RPAREN74_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_ruleExpression=new RewriteRuleSubtreeStream(adaptor,"rule ruleExpression");
        RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");
        try {
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:126:2: ( LPAREN ( operand | ruleExpression ) LT ( operand | ruleExpression ) RPAREN -> ^( LT ( operand )* ( ruleExpression )* ) )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:127:3: LPAREN ( operand | ruleExpression ) LT ( operand | ruleExpression ) RPAREN
            {
            LPAREN68=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_lessThanCondition808); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN68);

            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:127:10: ( operand | ruleExpression )
            int alt23=2;
            switch ( input.LA(1) ) {
            case INT:
            case 47:
                {
                alt23=1;
                }
                break;
            case THIS:
                {
                int LA23_2 = input.LA(2);

                if ( (LA23_2==DOT) ) {
                    int LA23_5 = input.LA(3);

                    if ( (LA23_5==ID) ) {
                        int LA23_6 = input.LA(4);

                        if ( (LA23_6==LT) ) {
                            alt23=1;
                        }
                        else if ( (LA23_6==PLUS||LA23_6==MINUS) ) {
                            alt23=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 23, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 5, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 2, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA23_3 = input.LA(2);

                if ( (LA23_3==LT) ) {
                    alt23=1;
                }
                else if ( (LA23_3==PLUS||LA23_3==MINUS) ) {
                    alt23=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 3, input);

                    throw nvae;
                }
                }
                break;
            case LPAREN:
            case LOOKUP:
                {
                alt23=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:127:11: operand
                    {
                    pushFollow(FOLLOW_operand_in_lessThanCondition811);
                    operand69=operand();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_operand.add(operand69.getTree());

                    }
                    break;
                case 2 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:127:21: ruleExpression
                    {
                    pushFollow(FOLLOW_ruleExpression_in_lessThanCondition815);
                    ruleExpression70=ruleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ruleExpression.add(ruleExpression70.getTree());

                    }
                    break;

            }

            LT71=(Token)match(input,LT,FOLLOW_LT_in_lessThanCondition818); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LT.add(LT71);

            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:127:40: ( operand | ruleExpression )
            int alt24=2;
            switch ( input.LA(1) ) {
            case INT:
            case 47:
                {
                alt24=1;
                }
                break;
            case THIS:
                {
                int LA24_2 = input.LA(2);

                if ( (LA24_2==DOT) ) {
                    int LA24_5 = input.LA(3);

                    if ( (LA24_5==ID) ) {
                        int LA24_6 = input.LA(4);

                        if ( (LA24_6==RPAREN) ) {
                            alt24=1;
                        }
                        else if ( (LA24_6==PLUS||LA24_6==MINUS) ) {
                            alt24=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 24, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 5, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 2, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA24_3 = input.LA(2);

                if ( (LA24_3==RPAREN) ) {
                    alt24=1;
                }
                else if ( (LA24_3==PLUS||LA24_3==MINUS) ) {
                    alt24=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 3, input);

                    throw nvae;
                }
                }
                break;
            case LPAREN:
            case LOOKUP:
                {
                alt24=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:127:41: operand
                    {
                    pushFollow(FOLLOW_operand_in_lessThanCondition821);
                    operand72=operand();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_operand.add(operand72.getTree());

                    }
                    break;
                case 2 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:127:51: ruleExpression
                    {
                    pushFollow(FOLLOW_ruleExpression_in_lessThanCondition825);
                    ruleExpression73=ruleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ruleExpression.add(ruleExpression73.getTree());

                    }
                    break;

            }

            RPAREN74=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_lessThanCondition828); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN74);



            // AST REWRITE
            // elements: ruleExpression, LT, operand
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 128:4: -> ^( LT ( operand )* ( ruleExpression )* )
            {
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:128:7: ^( LT ( operand )* ( ruleExpression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_LT.nextNode(), root_1);

                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:128:12: ( operand )*
                while ( stream_operand.hasNext() ) {
                    adaptor.addChild(root_1, stream_operand.nextTree());

                }
                stream_operand.reset();
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:128:21: ( ruleExpression )*
                while ( stream_ruleExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_ruleExpression.nextTree());

                }
                stream_ruleExpression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lessThanCondition"

    public static class lessThanOrEqualCondition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lessThanOrEqualCondition"
    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:131:1: lessThanOrEqualCondition : LPAREN ( operand | ruleExpression ) LTEQ ( operand | ruleExpression ) RPAREN -> ^( LTEQ ( operand )* ( ruleExpression )* ) ;
    public final RuleLangParser.lessThanOrEqualCondition_return lessThanOrEqualCondition() throws RecognitionException {
        RuleLangParser.lessThanOrEqualCondition_return retval = new RuleLangParser.lessThanOrEqualCondition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN75=null;
        Token LTEQ78=null;
        Token RPAREN81=null;
        RuleLangParser.operand_return operand76 = null;

        RuleLangParser.ruleExpression_return ruleExpression77 = null;

        RuleLangParser.operand_return operand79 = null;

        RuleLangParser.ruleExpression_return ruleExpression80 = null;


        Object LPAREN75_tree=null;
        Object LTEQ78_tree=null;
        Object RPAREN81_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_LTEQ=new RewriteRuleTokenStream(adaptor,"token LTEQ");
        RewriteRuleSubtreeStream stream_ruleExpression=new RewriteRuleSubtreeStream(adaptor,"rule ruleExpression");
        RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");
        try {
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:132:2: ( LPAREN ( operand | ruleExpression ) LTEQ ( operand | ruleExpression ) RPAREN -> ^( LTEQ ( operand )* ( ruleExpression )* ) )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:133:3: LPAREN ( operand | ruleExpression ) LTEQ ( operand | ruleExpression ) RPAREN
            {
            LPAREN75=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_lessThanOrEqualCondition857); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN75);

            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:133:10: ( operand | ruleExpression )
            int alt25=2;
            switch ( input.LA(1) ) {
            case INT:
            case 47:
                {
                alt25=1;
                }
                break;
            case THIS:
                {
                int LA25_2 = input.LA(2);

                if ( (LA25_2==DOT) ) {
                    int LA25_5 = input.LA(3);

                    if ( (LA25_5==ID) ) {
                        int LA25_6 = input.LA(4);

                        if ( (LA25_6==PLUS||LA25_6==MINUS) ) {
                            alt25=2;
                        }
                        else if ( (LA25_6==LTEQ) ) {
                            alt25=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 25, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 5, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 2, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA25_3 = input.LA(2);

                if ( (LA25_3==PLUS||LA25_3==MINUS) ) {
                    alt25=2;
                }
                else if ( (LA25_3==LTEQ) ) {
                    alt25=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 3, input);

                    throw nvae;
                }
                }
                break;
            case LPAREN:
            case LOOKUP:
                {
                alt25=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:133:11: operand
                    {
                    pushFollow(FOLLOW_operand_in_lessThanOrEqualCondition860);
                    operand76=operand();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_operand.add(operand76.getTree());

                    }
                    break;
                case 2 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:133:21: ruleExpression
                    {
                    pushFollow(FOLLOW_ruleExpression_in_lessThanOrEqualCondition864);
                    ruleExpression77=ruleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ruleExpression.add(ruleExpression77.getTree());

                    }
                    break;

            }

            LTEQ78=(Token)match(input,LTEQ,FOLLOW_LTEQ_in_lessThanOrEqualCondition867); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LTEQ.add(LTEQ78);

            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:133:42: ( operand | ruleExpression )
            int alt26=2;
            switch ( input.LA(1) ) {
            case INT:
            case 47:
                {
                alt26=1;
                }
                break;
            case THIS:
                {
                int LA26_2 = input.LA(2);

                if ( (LA26_2==DOT) ) {
                    int LA26_5 = input.LA(3);

                    if ( (LA26_5==ID) ) {
                        int LA26_6 = input.LA(4);

                        if ( (LA26_6==PLUS||LA26_6==MINUS) ) {
                            alt26=2;
                        }
                        else if ( (LA26_6==RPAREN) ) {
                            alt26=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 26, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 5, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 2, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA26_3 = input.LA(2);

                if ( (LA26_3==PLUS||LA26_3==MINUS) ) {
                    alt26=2;
                }
                else if ( (LA26_3==RPAREN) ) {
                    alt26=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 3, input);

                    throw nvae;
                }
                }
                break;
            case LPAREN:
            case LOOKUP:
                {
                alt26=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:133:43: operand
                    {
                    pushFollow(FOLLOW_operand_in_lessThanOrEqualCondition870);
                    operand79=operand();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_operand.add(operand79.getTree());

                    }
                    break;
                case 2 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:133:53: ruleExpression
                    {
                    pushFollow(FOLLOW_ruleExpression_in_lessThanOrEqualCondition874);
                    ruleExpression80=ruleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ruleExpression.add(ruleExpression80.getTree());

                    }
                    break;

            }

            RPAREN81=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_lessThanOrEqualCondition877); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN81);



            // AST REWRITE
            // elements: ruleExpression, operand, LTEQ
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 134:4: -> ^( LTEQ ( operand )* ( ruleExpression )* )
            {
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:134:7: ^( LTEQ ( operand )* ( ruleExpression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_LTEQ.nextNode(), root_1);

                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:134:14: ( operand )*
                while ( stream_operand.hasNext() ) {
                    adaptor.addChild(root_1, stream_operand.nextTree());

                }
                stream_operand.reset();
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:134:23: ( ruleExpression )*
                while ( stream_ruleExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_ruleExpression.nextTree());

                }
                stream_ruleExpression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lessThanOrEqualCondition"

    public static class greaterThanOrEqualCondition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "greaterThanOrEqualCondition"
    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:137:1: greaterThanOrEqualCondition : LPAREN ( operand | ruleExpression ) GTEQ ( operand | ruleExpression ) RPAREN -> ^( GTEQ ( operand )* ( ruleExpression )* ) ;
    public final RuleLangParser.greaterThanOrEqualCondition_return greaterThanOrEqualCondition() throws RecognitionException {
        RuleLangParser.greaterThanOrEqualCondition_return retval = new RuleLangParser.greaterThanOrEqualCondition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN82=null;
        Token GTEQ85=null;
        Token RPAREN88=null;
        RuleLangParser.operand_return operand83 = null;

        RuleLangParser.ruleExpression_return ruleExpression84 = null;

        RuleLangParser.operand_return operand86 = null;

        RuleLangParser.ruleExpression_return ruleExpression87 = null;


        Object LPAREN82_tree=null;
        Object GTEQ85_tree=null;
        Object RPAREN88_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_GTEQ=new RewriteRuleTokenStream(adaptor,"token GTEQ");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_ruleExpression=new RewriteRuleSubtreeStream(adaptor,"rule ruleExpression");
        RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");
        try {
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:138:2: ( LPAREN ( operand | ruleExpression ) GTEQ ( operand | ruleExpression ) RPAREN -> ^( GTEQ ( operand )* ( ruleExpression )* ) )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:139:3: LPAREN ( operand | ruleExpression ) GTEQ ( operand | ruleExpression ) RPAREN
            {
            LPAREN82=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_greaterThanOrEqualCondition907); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN82);

            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:139:10: ( operand | ruleExpression )
            int alt27=2;
            switch ( input.LA(1) ) {
            case INT:
            case 47:
                {
                alt27=1;
                }
                break;
            case THIS:
                {
                int LA27_2 = input.LA(2);

                if ( (LA27_2==DOT) ) {
                    int LA27_5 = input.LA(3);

                    if ( (LA27_5==ID) ) {
                        int LA27_6 = input.LA(4);

                        if ( (LA27_6==PLUS||LA27_6==MINUS) ) {
                            alt27=2;
                        }
                        else if ( (LA27_6==GTEQ) ) {
                            alt27=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 27, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 5, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 2, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA27_3 = input.LA(2);

                if ( (LA27_3==PLUS||LA27_3==MINUS) ) {
                    alt27=2;
                }
                else if ( (LA27_3==GTEQ) ) {
                    alt27=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 3, input);

                    throw nvae;
                }
                }
                break;
            case LPAREN:
            case LOOKUP:
                {
                alt27=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:139:11: operand
                    {
                    pushFollow(FOLLOW_operand_in_greaterThanOrEqualCondition910);
                    operand83=operand();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_operand.add(operand83.getTree());

                    }
                    break;
                case 2 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:139:21: ruleExpression
                    {
                    pushFollow(FOLLOW_ruleExpression_in_greaterThanOrEqualCondition914);
                    ruleExpression84=ruleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ruleExpression.add(ruleExpression84.getTree());

                    }
                    break;

            }

            GTEQ85=(Token)match(input,GTEQ,FOLLOW_GTEQ_in_greaterThanOrEqualCondition917); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_GTEQ.add(GTEQ85);

            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:139:42: ( operand | ruleExpression )
            int alt28=2;
            switch ( input.LA(1) ) {
            case INT:
            case 47:
                {
                alt28=1;
                }
                break;
            case THIS:
                {
                int LA28_2 = input.LA(2);

                if ( (LA28_2==DOT) ) {
                    int LA28_5 = input.LA(3);

                    if ( (LA28_5==ID) ) {
                        int LA28_6 = input.LA(4);

                        if ( (LA28_6==PLUS||LA28_6==MINUS) ) {
                            alt28=2;
                        }
                        else if ( (LA28_6==RPAREN) ) {
                            alt28=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 28, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 5, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 2, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA28_3 = input.LA(2);

                if ( (LA28_3==PLUS||LA28_3==MINUS) ) {
                    alt28=2;
                }
                else if ( (LA28_3==RPAREN) ) {
                    alt28=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 3, input);

                    throw nvae;
                }
                }
                break;
            case LPAREN:
            case LOOKUP:
                {
                alt28=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:139:43: operand
                    {
                    pushFollow(FOLLOW_operand_in_greaterThanOrEqualCondition920);
                    operand86=operand();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_operand.add(operand86.getTree());

                    }
                    break;
                case 2 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:139:53: ruleExpression
                    {
                    pushFollow(FOLLOW_ruleExpression_in_greaterThanOrEqualCondition924);
                    ruleExpression87=ruleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ruleExpression.add(ruleExpression87.getTree());

                    }
                    break;

            }

            RPAREN88=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_greaterThanOrEqualCondition927); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN88);



            // AST REWRITE
            // elements: operand, GTEQ, ruleExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 140:4: -> ^( GTEQ ( operand )* ( ruleExpression )* )
            {
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:140:7: ^( GTEQ ( operand )* ( ruleExpression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_GTEQ.nextNode(), root_1);

                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:140:14: ( operand )*
                while ( stream_operand.hasNext() ) {
                    adaptor.addChild(root_1, stream_operand.nextTree());

                }
                stream_operand.reset();
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:140:23: ( ruleExpression )*
                while ( stream_ruleExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_ruleExpression.nextTree());

                }
                stream_ruleExpression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "greaterThanOrEqualCondition"

    public static class operand_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operand"
    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:143:1: operand : ( valueLiteral | thisDotValue | ID | INT ) ;
    public final RuleLangParser.operand_return operand() throws RecognitionException {
        RuleLangParser.operand_return retval = new RuleLangParser.operand_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID91=null;
        Token INT92=null;
        RuleLangParser.valueLiteral_return valueLiteral89 = null;

        RuleLangParser.thisDotValue_return thisDotValue90 = null;


        Object ID91_tree=null;
        Object INT92_tree=null;

        try {
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:144:2: ( ( valueLiteral | thisDotValue | ID | INT ) )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:145:3: ( valueLiteral | thisDotValue | ID | INT )
            {
            root_0 = (Object)adaptor.nil();

            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:145:3: ( valueLiteral | thisDotValue | ID | INT )
            int alt29=4;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt29=1;
                }
                break;
            case THIS:
                {
                alt29=2;
                }
                break;
            case ID:
                {
                alt29=3;
                }
                break;
            case INT:
                {
                alt29=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:145:4: valueLiteral
                    {
                    pushFollow(FOLLOW_valueLiteral_in_operand958);
                    valueLiteral89=valueLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, valueLiteral89.getTree());

                    }
                    break;
                case 2 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:145:19: thisDotValue
                    {
                    pushFollow(FOLLOW_thisDotValue_in_operand962);
                    thisDotValue90=thisDotValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, thisDotValue90.getTree());

                    }
                    break;
                case 3 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:145:34: ID
                    {
                    ID91=(Token)match(input,ID,FOLLOW_ID_in_operand966); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID91_tree = (Object)adaptor.create(ID91);
                    adaptor.addChild(root_0, ID91_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:145:39: INT
                    {
                    INT92=(Token)match(input,INT,FOLLOW_INT_in_operand970); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT92_tree = (Object)adaptor.create(INT92);
                    adaptor.addChild(root_0, INT92_tree);
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operand"

    public static class operandExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operandExpression"
    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:149:1: operandExpression : ( LPAREN ( thisDotValue | ID )* ( PLUS ID )+ ( operandExpression )* RPAREN -> ^( PLUS ( thisDotValue )* ( ID )* ( operandExpression )* ) | LPAREN ( thisDotValue | ID )* ( SLASH ID )+ ( operandExpression )* RPAREN -> ^( SLASH ( thisDotValue )* ( ID )* ( operandExpression )* ) | LPAREN ( thisDotValue | ID )* ( STAR ID )+ ( operandExpression )* RPAREN -> ^( STAR ( thisDotValue )* ( ID )* ( operandExpression )* ) | LPAREN ( thisDotValue | ID )* ( MINUS ID )+ ( operandExpression )* RPAREN -> ^( MINUS ( thisDotValue )* ( ID )* ( operandExpression )* ) );
    public final RuleLangParser.operandExpression_return operandExpression() throws RecognitionException {
        RuleLangParser.operandExpression_return retval = new RuleLangParser.operandExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN93=null;
        Token ID95=null;
        Token PLUS96=null;
        Token ID97=null;
        Token RPAREN99=null;
        Token LPAREN100=null;
        Token ID102=null;
        Token SLASH103=null;
        Token ID104=null;
        Token RPAREN106=null;
        Token LPAREN107=null;
        Token ID109=null;
        Token STAR110=null;
        Token ID111=null;
        Token RPAREN113=null;
        Token LPAREN114=null;
        Token ID116=null;
        Token MINUS117=null;
        Token ID118=null;
        Token RPAREN120=null;
        RuleLangParser.thisDotValue_return thisDotValue94 = null;

        RuleLangParser.operandExpression_return operandExpression98 = null;

        RuleLangParser.thisDotValue_return thisDotValue101 = null;

        RuleLangParser.operandExpression_return operandExpression105 = null;

        RuleLangParser.thisDotValue_return thisDotValue108 = null;

        RuleLangParser.operandExpression_return operandExpression112 = null;

        RuleLangParser.thisDotValue_return thisDotValue115 = null;

        RuleLangParser.operandExpression_return operandExpression119 = null;


        Object LPAREN93_tree=null;
        Object ID95_tree=null;
        Object PLUS96_tree=null;
        Object ID97_tree=null;
        Object RPAREN99_tree=null;
        Object LPAREN100_tree=null;
        Object ID102_tree=null;
        Object SLASH103_tree=null;
        Object ID104_tree=null;
        Object RPAREN106_tree=null;
        Object LPAREN107_tree=null;
        Object ID109_tree=null;
        Object STAR110_tree=null;
        Object ID111_tree=null;
        Object RPAREN113_tree=null;
        Object LPAREN114_tree=null;
        Object ID116_tree=null;
        Object MINUS117_tree=null;
        Object ID118_tree=null;
        Object RPAREN120_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleTokenStream stream_SLASH=new RewriteRuleTokenStream(adaptor,"token SLASH");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_thisDotValue=new RewriteRuleSubtreeStream(adaptor,"rule thisDotValue");
        RewriteRuleSubtreeStream stream_operandExpression=new RewriteRuleSubtreeStream(adaptor,"rule operandExpression");
        try {
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:150:2: ( LPAREN ( thisDotValue | ID )* ( PLUS ID )+ ( operandExpression )* RPAREN -> ^( PLUS ( thisDotValue )* ( ID )* ( operandExpression )* ) | LPAREN ( thisDotValue | ID )* ( SLASH ID )+ ( operandExpression )* RPAREN -> ^( SLASH ( thisDotValue )* ( ID )* ( operandExpression )* ) | LPAREN ( thisDotValue | ID )* ( STAR ID )+ ( operandExpression )* RPAREN -> ^( STAR ( thisDotValue )* ( ID )* ( operandExpression )* ) | LPAREN ( thisDotValue | ID )* ( MINUS ID )+ ( operandExpression )* RPAREN -> ^( MINUS ( thisDotValue )* ( ID )* ( operandExpression )* ) )
            int alt42=4;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:151:3: LPAREN ( thisDotValue | ID )* ( PLUS ID )+ ( operandExpression )* RPAREN
                    {
                    LPAREN93=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operandExpression985); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN93);

                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:151:10: ( thisDotValue | ID )*
                    loop30:
                    do {
                        int alt30=3;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==THIS) ) {
                            alt30=1;
                        }
                        else if ( (LA30_0==ID) ) {
                            alt30=2;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:151:11: thisDotValue
                    	    {
                    	    pushFollow(FOLLOW_thisDotValue_in_operandExpression988);
                    	    thisDotValue94=thisDotValue();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_thisDotValue.add(thisDotValue94.getTree());

                    	    }
                    	    break;
                    	case 2 :
                    	    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:151:26: ID
                    	    {
                    	    ID95=(Token)match(input,ID,FOLLOW_ID_in_operandExpression992); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ID.add(ID95);


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:151:31: ( PLUS ID )+
                    int cnt31=0;
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==PLUS) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:151:32: PLUS ID
                    	    {
                    	    PLUS96=(Token)match(input,PLUS,FOLLOW_PLUS_in_operandExpression997); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_PLUS.add(PLUS96);

                    	    ID97=(Token)match(input,ID,FOLLOW_ID_in_operandExpression999); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ID.add(ID97);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt31 >= 1 ) break loop31;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(31, input);
                                throw eee;
                        }
                        cnt31++;
                    } while (true);

                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:151:42: ( operandExpression )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==LPAREN) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:0:0: operandExpression
                    	    {
                    	    pushFollow(FOLLOW_operandExpression_in_operandExpression1003);
                    	    operandExpression98=operandExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_operandExpression.add(operandExpression98.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    RPAREN99=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operandExpression1006); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN99);



                    // AST REWRITE
                    // elements: operandExpression, ID, PLUS, thisDotValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 152:4: -> ^( PLUS ( thisDotValue )* ( ID )* ( operandExpression )* )
                    {
                        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:152:7: ^( PLUS ( thisDotValue )* ( ID )* ( operandExpression )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_PLUS.nextNode(), root_1);

                        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:152:14: ( thisDotValue )*
                        while ( stream_thisDotValue.hasNext() ) {
                            adaptor.addChild(root_1, stream_thisDotValue.nextTree());

                        }
                        stream_thisDotValue.reset();
                        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:152:28: ( ID )*
                        while ( stream_ID.hasNext() ) {
                            adaptor.addChild(root_1, stream_ID.nextNode());

                        }
                        stream_ID.reset();
                        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:152:32: ( operandExpression )*
                        while ( stream_operandExpression.hasNext() ) {
                            adaptor.addChild(root_1, stream_operandExpression.nextTree());

                        }
                        stream_operandExpression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:154:3: LPAREN ( thisDotValue | ID )* ( SLASH ID )+ ( operandExpression )* RPAREN
                    {
                    LPAREN100=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operandExpression1032); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN100);

                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:154:10: ( thisDotValue | ID )*
                    loop33:
                    do {
                        int alt33=3;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==THIS) ) {
                            alt33=1;
                        }
                        else if ( (LA33_0==ID) ) {
                            alt33=2;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:154:11: thisDotValue
                    	    {
                    	    pushFollow(FOLLOW_thisDotValue_in_operandExpression1035);
                    	    thisDotValue101=thisDotValue();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_thisDotValue.add(thisDotValue101.getTree());

                    	    }
                    	    break;
                    	case 2 :
                    	    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:154:26: ID
                    	    {
                    	    ID102=(Token)match(input,ID,FOLLOW_ID_in_operandExpression1039); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ID.add(ID102);


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:154:31: ( SLASH ID )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==SLASH) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:154:32: SLASH ID
                    	    {
                    	    SLASH103=(Token)match(input,SLASH,FOLLOW_SLASH_in_operandExpression1044); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_SLASH.add(SLASH103);

                    	    ID104=(Token)match(input,ID,FOLLOW_ID_in_operandExpression1046); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ID.add(ID104);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt34 >= 1 ) break loop34;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(34, input);
                                throw eee;
                        }
                        cnt34++;
                    } while (true);

                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:154:43: ( operandExpression )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==LPAREN) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:0:0: operandExpression
                    	    {
                    	    pushFollow(FOLLOW_operandExpression_in_operandExpression1050);
                    	    operandExpression105=operandExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_operandExpression.add(operandExpression105.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    RPAREN106=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operandExpression1053); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN106);



                    // AST REWRITE
                    // elements: ID, thisDotValue, SLASH, operandExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 155:4: -> ^( SLASH ( thisDotValue )* ( ID )* ( operandExpression )* )
                    {
                        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:155:7: ^( SLASH ( thisDotValue )* ( ID )* ( operandExpression )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_SLASH.nextNode(), root_1);

                        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:155:15: ( thisDotValue )*
                        while ( stream_thisDotValue.hasNext() ) {
                            adaptor.addChild(root_1, stream_thisDotValue.nextTree());

                        }
                        stream_thisDotValue.reset();
                        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:155:29: ( ID )*
                        while ( stream_ID.hasNext() ) {
                            adaptor.addChild(root_1, stream_ID.nextNode());

                        }
                        stream_ID.reset();
                        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:155:33: ( operandExpression )*
                        while ( stream_operandExpression.hasNext() ) {
                            adaptor.addChild(root_1, stream_operandExpression.nextTree());

                        }
                        stream_operandExpression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:157:3: LPAREN ( thisDotValue | ID )* ( STAR ID )+ ( operandExpression )* RPAREN
                    {
                    LPAREN107=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operandExpression1079); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN107);

                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:157:10: ( thisDotValue | ID )*
                    loop36:
                    do {
                        int alt36=3;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==THIS) ) {
                            alt36=1;
                        }
                        else if ( (LA36_0==ID) ) {
                            alt36=2;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:157:11: thisDotValue
                    	    {
                    	    pushFollow(FOLLOW_thisDotValue_in_operandExpression1082);
                    	    thisDotValue108=thisDotValue();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_thisDotValue.add(thisDotValue108.getTree());

                    	    }
                    	    break;
                    	case 2 :
                    	    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:157:26: ID
                    	    {
                    	    ID109=(Token)match(input,ID,FOLLOW_ID_in_operandExpression1086); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ID.add(ID109);


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:157:31: ( STAR ID )+
                    int cnt37=0;
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==STAR) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:157:32: STAR ID
                    	    {
                    	    STAR110=(Token)match(input,STAR,FOLLOW_STAR_in_operandExpression1091); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_STAR.add(STAR110);

                    	    ID111=(Token)match(input,ID,FOLLOW_ID_in_operandExpression1093); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ID.add(ID111);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt37 >= 1 ) break loop37;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(37, input);
                                throw eee;
                        }
                        cnt37++;
                    } while (true);

                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:157:42: ( operandExpression )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==LPAREN) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:0:0: operandExpression
                    	    {
                    	    pushFollow(FOLLOW_operandExpression_in_operandExpression1097);
                    	    operandExpression112=operandExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_operandExpression.add(operandExpression112.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    RPAREN113=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operandExpression1100); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN113);



                    // AST REWRITE
                    // elements: thisDotValue, STAR, ID, operandExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 158:4: -> ^( STAR ( thisDotValue )* ( ID )* ( operandExpression )* )
                    {
                        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:158:7: ^( STAR ( thisDotValue )* ( ID )* ( operandExpression )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_STAR.nextNode(), root_1);

                        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:158:14: ( thisDotValue )*
                        while ( stream_thisDotValue.hasNext() ) {
                            adaptor.addChild(root_1, stream_thisDotValue.nextTree());

                        }
                        stream_thisDotValue.reset();
                        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:158:28: ( ID )*
                        while ( stream_ID.hasNext() ) {
                            adaptor.addChild(root_1, stream_ID.nextNode());

                        }
                        stream_ID.reset();
                        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:158:32: ( operandExpression )*
                        while ( stream_operandExpression.hasNext() ) {
                            adaptor.addChild(root_1, stream_operandExpression.nextTree());

                        }
                        stream_operandExpression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:160:3: LPAREN ( thisDotValue | ID )* ( MINUS ID )+ ( operandExpression )* RPAREN
                    {
                    LPAREN114=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operandExpression1126); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN114);

                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:160:10: ( thisDotValue | ID )*
                    loop39:
                    do {
                        int alt39=3;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==THIS) ) {
                            alt39=1;
                        }
                        else if ( (LA39_0==ID) ) {
                            alt39=2;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:160:11: thisDotValue
                    	    {
                    	    pushFollow(FOLLOW_thisDotValue_in_operandExpression1129);
                    	    thisDotValue115=thisDotValue();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_thisDotValue.add(thisDotValue115.getTree());

                    	    }
                    	    break;
                    	case 2 :
                    	    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:160:26: ID
                    	    {
                    	    ID116=(Token)match(input,ID,FOLLOW_ID_in_operandExpression1133); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ID.add(ID116);


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:160:31: ( MINUS ID )+
                    int cnt40=0;
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==MINUS) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:160:32: MINUS ID
                    	    {
                    	    MINUS117=(Token)match(input,MINUS,FOLLOW_MINUS_in_operandExpression1138); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_MINUS.add(MINUS117);

                    	    ID118=(Token)match(input,ID,FOLLOW_ID_in_operandExpression1140); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ID.add(ID118);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt40 >= 1 ) break loop40;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(40, input);
                                throw eee;
                        }
                        cnt40++;
                    } while (true);

                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:160:43: ( operandExpression )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==LPAREN) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:0:0: operandExpression
                    	    {
                    	    pushFollow(FOLLOW_operandExpression_in_operandExpression1144);
                    	    operandExpression119=operandExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_operandExpression.add(operandExpression119.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    RPAREN120=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operandExpression1147); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN120);



                    // AST REWRITE
                    // elements: MINUS, thisDotValue, operandExpression, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 161:4: -> ^( MINUS ( thisDotValue )* ( ID )* ( operandExpression )* )
                    {
                        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:161:7: ^( MINUS ( thisDotValue )* ( ID )* ( operandExpression )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_MINUS.nextNode(), root_1);

                        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:161:15: ( thisDotValue )*
                        while ( stream_thisDotValue.hasNext() ) {
                            adaptor.addChild(root_1, stream_thisDotValue.nextTree());

                        }
                        stream_thisDotValue.reset();
                        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:161:29: ( ID )*
                        while ( stream_ID.hasNext() ) {
                            adaptor.addChild(root_1, stream_ID.nextNode());

                        }
                        stream_ID.reset();
                        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:161:33: ( operandExpression )*
                        while ( stream_operandExpression.hasNext() ) {
                            adaptor.addChild(root_1, stream_operandExpression.nextTree());

                        }
                        stream_operandExpression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operandExpression"

    public static class ruleExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ruleExpression"
    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:164:1: ruleExpression : ( lookupExpression | timeRollExpressionPlus | timeRollExpressionMinus | operandExpression ) ;
    public final RuleLangParser.ruleExpression_return ruleExpression() throws RecognitionException {
        RuleLangParser.ruleExpression_return retval = new RuleLangParser.ruleExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleLangParser.lookupExpression_return lookupExpression121 = null;

        RuleLangParser.timeRollExpressionPlus_return timeRollExpressionPlus122 = null;

        RuleLangParser.timeRollExpressionMinus_return timeRollExpressionMinus123 = null;

        RuleLangParser.operandExpression_return operandExpression124 = null;



        try {
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:165:2: ( ( lookupExpression | timeRollExpressionPlus | timeRollExpressionMinus | operandExpression ) )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:166:4: ( lookupExpression | timeRollExpressionPlus | timeRollExpressionMinus | operandExpression )
            {
            root_0 = (Object)adaptor.nil();

            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:166:4: ( lookupExpression | timeRollExpressionPlus | timeRollExpressionMinus | operandExpression )
            int alt43=4;
            switch ( input.LA(1) ) {
            case LOOKUP:
                {
                alt43=1;
                }
                break;
            case THIS:
                {
                int LA43_2 = input.LA(2);

                if ( (LA43_2==DOT) ) {
                    int LA43_5 = input.LA(3);

                    if ( (LA43_5==ID) ) {
                        int LA43_8 = input.LA(4);

                        if ( (LA43_8==MINUS) ) {
                            alt43=3;
                        }
                        else if ( (LA43_8==PLUS) ) {
                            alt43=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 43, 8, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 5, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 2, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA43_3 = input.LA(2);

                if ( (LA43_3==PLUS) ) {
                    alt43=2;
                }
                else if ( (LA43_3==MINUS) ) {
                    alt43=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 3, input);

                    throw nvae;
                }
                }
                break;
            case LPAREN:
                {
                alt43=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:166:5: lookupExpression
                    {
                    pushFollow(FOLLOW_lookupExpression_in_ruleExpression1181);
                    lookupExpression121=lookupExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lookupExpression121.getTree());

                    }
                    break;
                case 2 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:166:24: timeRollExpressionPlus
                    {
                    pushFollow(FOLLOW_timeRollExpressionPlus_in_ruleExpression1185);
                    timeRollExpressionPlus122=timeRollExpressionPlus();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeRollExpressionPlus122.getTree());

                    }
                    break;
                case 3 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:166:49: timeRollExpressionMinus
                    {
                    pushFollow(FOLLOW_timeRollExpressionMinus_in_ruleExpression1189);
                    timeRollExpressionMinus123=timeRollExpressionMinus();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeRollExpressionMinus123.getTree());

                    }
                    break;
                case 4 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:166:75: operandExpression
                    {
                    pushFollow(FOLLOW_operandExpression_in_ruleExpression1193);
                    operandExpression124=operandExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, operandExpression124.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ruleExpression"

    public static class timeRollExpressionPlus_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "timeRollExpressionPlus"
    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:169:1: timeRollExpressionPlus : ( thisDotValue | ID ) PLUS ID -> ^( TIMEROLL ^( PLUS ( thisDotValue )* ( ID )* ) ) ;
    public final RuleLangParser.timeRollExpressionPlus_return timeRollExpressionPlus() throws RecognitionException {
        RuleLangParser.timeRollExpressionPlus_return retval = new RuleLangParser.timeRollExpressionPlus_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID126=null;
        Token PLUS127=null;
        Token ID128=null;
        RuleLangParser.thisDotValue_return thisDotValue125 = null;


        Object ID126_tree=null;
        Object PLUS127_tree=null;
        Object ID128_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_thisDotValue=new RewriteRuleSubtreeStream(adaptor,"rule thisDotValue");
        try {
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:170:2: ( ( thisDotValue | ID ) PLUS ID -> ^( TIMEROLL ^( PLUS ( thisDotValue )* ( ID )* ) ) )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:171:3: ( thisDotValue | ID ) PLUS ID
            {
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:171:3: ( thisDotValue | ID )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==THIS) ) {
                alt44=1;
            }
            else if ( (LA44_0==ID) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:171:4: thisDotValue
                    {
                    pushFollow(FOLLOW_thisDotValue_in_timeRollExpressionPlus1211);
                    thisDotValue125=thisDotValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_thisDotValue.add(thisDotValue125.getTree());

                    }
                    break;
                case 2 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:171:19: ID
                    {
                    ID126=(Token)match(input,ID,FOLLOW_ID_in_timeRollExpressionPlus1215); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID126);


                    }
                    break;

            }

            PLUS127=(Token)match(input,PLUS,FOLLOW_PLUS_in_timeRollExpressionPlus1218); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PLUS.add(PLUS127);

            ID128=(Token)match(input,ID,FOLLOW_ID_in_timeRollExpressionPlus1220); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID128);



            // AST REWRITE
            // elements: ID, PLUS, thisDotValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 172:4: -> ^( TIMEROLL ^( PLUS ( thisDotValue )* ( ID )* ) )
            {
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:172:7: ^( TIMEROLL ^( PLUS ( thisDotValue )* ( ID )* ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TIMEROLL, "TIMEROLL"), root_1);

                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:172:18: ^( PLUS ( thisDotValue )* ( ID )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_PLUS.nextNode(), root_2);

                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:172:25: ( thisDotValue )*
                while ( stream_thisDotValue.hasNext() ) {
                    adaptor.addChild(root_2, stream_thisDotValue.nextTree());

                }
                stream_thisDotValue.reset();
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:172:39: ( ID )*
                while ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_2, stream_ID.nextNode());

                }
                stream_ID.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "timeRollExpressionPlus"

    public static class timeRollExpressionMinus_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "timeRollExpressionMinus"
    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:175:1: timeRollExpressionMinus : ( thisDotValue | ID ) MINUS ID -> ^( TIMEROLL ^( MINUS ( thisDotValue )* ( ID )* ) ) ;
    public final RuleLangParser.timeRollExpressionMinus_return timeRollExpressionMinus() throws RecognitionException {
        RuleLangParser.timeRollExpressionMinus_return retval = new RuleLangParser.timeRollExpressionMinus_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID130=null;
        Token MINUS131=null;
        Token ID132=null;
        RuleLangParser.thisDotValue_return thisDotValue129 = null;


        Object ID130_tree=null;
        Object MINUS131_tree=null;
        Object ID132_tree=null;
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_thisDotValue=new RewriteRuleSubtreeStream(adaptor,"rule thisDotValue");
        try {
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:176:2: ( ( thisDotValue | ID ) MINUS ID -> ^( TIMEROLL ^( MINUS ( thisDotValue )* ( ID )* ) ) )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:177:3: ( thisDotValue | ID ) MINUS ID
            {
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:177:3: ( thisDotValue | ID )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==THIS) ) {
                alt45=1;
            }
            else if ( (LA45_0==ID) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:177:4: thisDotValue
                    {
                    pushFollow(FOLLOW_thisDotValue_in_timeRollExpressionMinus1254);
                    thisDotValue129=thisDotValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_thisDotValue.add(thisDotValue129.getTree());

                    }
                    break;
                case 2 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:177:19: ID
                    {
                    ID130=(Token)match(input,ID,FOLLOW_ID_in_timeRollExpressionMinus1258); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID130);


                    }
                    break;

            }

            MINUS131=(Token)match(input,MINUS,FOLLOW_MINUS_in_timeRollExpressionMinus1261); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MINUS.add(MINUS131);

            ID132=(Token)match(input,ID,FOLLOW_ID_in_timeRollExpressionMinus1263); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID132);



            // AST REWRITE
            // elements: ID, thisDotValue, MINUS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 178:4: -> ^( TIMEROLL ^( MINUS ( thisDotValue )* ( ID )* ) )
            {
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:178:7: ^( TIMEROLL ^( MINUS ( thisDotValue )* ( ID )* ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TIMEROLL, "TIMEROLL"), root_1);

                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:178:18: ^( MINUS ( thisDotValue )* ( ID )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_MINUS.nextNode(), root_2);

                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:178:26: ( thisDotValue )*
                while ( stream_thisDotValue.hasNext() ) {
                    adaptor.addChild(root_2, stream_thisDotValue.nextTree());

                }
                stream_thisDotValue.reset();
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:178:40: ( ID )*
                while ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_2, stream_ID.nextNode());

                }
                stream_ID.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "timeRollExpressionMinus"

    public static class lookupExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lookupExpression"
    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:181:1: lookupExpression : LOOKUP dotValue ( dotPropertyValuePair )* ( dotValue )? -> ^( LOOKUP ^( CTD dotValue ) ( dotPropertyValuePair )* ( ^( LEAF dotValue ) )? ) ;
    public final RuleLangParser.lookupExpression_return lookupExpression() throws RecognitionException {
        RuleLangParser.lookupExpression_return retval = new RuleLangParser.lookupExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOOKUP133=null;
        RuleLangParser.dotValue_return dotValue134 = null;

        RuleLangParser.dotPropertyValuePair_return dotPropertyValuePair135 = null;

        RuleLangParser.dotValue_return dotValue136 = null;


        Object LOOKUP133_tree=null;
        RewriteRuleTokenStream stream_LOOKUP=new RewriteRuleTokenStream(adaptor,"token LOOKUP");
        RewriteRuleSubtreeStream stream_dotPropertyValuePair=new RewriteRuleSubtreeStream(adaptor,"rule dotPropertyValuePair");
        RewriteRuleSubtreeStream stream_dotValue=new RewriteRuleSubtreeStream(adaptor,"rule dotValue");
        try {
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:182:2: ( LOOKUP dotValue ( dotPropertyValuePair )* ( dotValue )? -> ^( LOOKUP ^( CTD dotValue ) ( dotPropertyValuePair )* ( ^( LEAF dotValue ) )? ) )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:183:3: LOOKUP dotValue ( dotPropertyValuePair )* ( dotValue )?
            {
            LOOKUP133=(Token)match(input,LOOKUP,FOLLOW_LOOKUP_in_lookupExpression1298); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LOOKUP.add(LOOKUP133);

            pushFollow(FOLLOW_dotValue_in_lookupExpression1300);
            dotValue134=dotValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_dotValue.add(dotValue134.getTree());
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:183:19: ( dotPropertyValuePair )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==DOT) ) {
                    int LA46_1 = input.LA(2);

                    if ( (LA46_1==ID) ) {
                        int LA46_3 = input.LA(3);

                        if ( (LA46_3==LPAREN) ) {
                            alt46=1;
                        }


                    }


                }


                switch (alt46) {
            	case 1 :
            	    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:0:0: dotPropertyValuePair
            	    {
            	    pushFollow(FOLLOW_dotPropertyValuePair_in_lookupExpression1302);
            	    dotPropertyValuePair135=dotPropertyValuePair();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_dotPropertyValuePair.add(dotPropertyValuePair135.getTree());

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:183:41: ( dotValue )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==DOT) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:0:0: dotValue
                    {
                    pushFollow(FOLLOW_dotValue_in_lookupExpression1305);
                    dotValue136=dotValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dotValue.add(dotValue136.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: dotValue, LOOKUP, dotValue, dotPropertyValuePair
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 184:4: -> ^( LOOKUP ^( CTD dotValue ) ( dotPropertyValuePair )* ( ^( LEAF dotValue ) )? )
            {
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:184:7: ^( LOOKUP ^( CTD dotValue ) ( dotPropertyValuePair )* ( ^( LEAF dotValue ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_LOOKUP.nextNode(), root_1);

                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:184:16: ^( CTD dotValue )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CTD, "CTD"), root_2);

                adaptor.addChild(root_2, stream_dotValue.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:184:32: ( dotPropertyValuePair )*
                while ( stream_dotPropertyValuePair.hasNext() ) {
                    adaptor.addChild(root_1, stream_dotPropertyValuePair.nextTree());

                }
                stream_dotPropertyValuePair.reset();
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:184:54: ( ^( LEAF dotValue ) )?
                if ( stream_dotValue.hasNext() ) {
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:184:54: ^( LEAF dotValue )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(LEAF, "LEAF"), root_2);

                    adaptor.addChild(root_2, stream_dotValue.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_dotValue.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lookupExpression"

    public static class dotPropertyValuePair_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dotPropertyValuePair"
    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:187:1: dotPropertyValuePair : dotValue ( LPAREN ( ID | INT | valueLiteral ) RPAREN ) -> ( ^( NAMEVAL ^( NAME dotValue ) ^( VAL ( ID )? ( INT )? ( valueLiteral )? ) ) )+ ;
    public final RuleLangParser.dotPropertyValuePair_return dotPropertyValuePair() throws RecognitionException {
        RuleLangParser.dotPropertyValuePair_return retval = new RuleLangParser.dotPropertyValuePair_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN138=null;
        Token ID139=null;
        Token INT140=null;
        Token RPAREN142=null;
        RuleLangParser.dotValue_return dotValue137 = null;

        RuleLangParser.valueLiteral_return valueLiteral141 = null;


        Object LPAREN138_tree=null;
        Object ID139_tree=null;
        Object INT140_tree=null;
        Object RPAREN142_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_valueLiteral=new RewriteRuleSubtreeStream(adaptor,"rule valueLiteral");
        RewriteRuleSubtreeStream stream_dotValue=new RewriteRuleSubtreeStream(adaptor,"rule dotValue");
        try {
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:188:2: ( dotValue ( LPAREN ( ID | INT | valueLiteral ) RPAREN ) -> ( ^( NAMEVAL ^( NAME dotValue ) ^( VAL ( ID )? ( INT )? ( valueLiteral )? ) ) )+ )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:189:3: dotValue ( LPAREN ( ID | INT | valueLiteral ) RPAREN )
            {
            pushFollow(FOLLOW_dotValue_in_dotPropertyValuePair1346);
            dotValue137=dotValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_dotValue.add(dotValue137.getTree());
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:189:12: ( LPAREN ( ID | INT | valueLiteral ) RPAREN )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:189:13: LPAREN ( ID | INT | valueLiteral ) RPAREN
            {
            LPAREN138=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dotPropertyValuePair1349); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN138);

            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:189:20: ( ID | INT | valueLiteral )
            int alt48=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt48=1;
                }
                break;
            case INT:
                {
                alt48=2;
                }
                break;
            case 47:
                {
                alt48=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:189:21: ID
                    {
                    ID139=(Token)match(input,ID,FOLLOW_ID_in_dotPropertyValuePair1352); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID139);


                    }
                    break;
                case 2 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:189:26: INT
                    {
                    INT140=(Token)match(input,INT,FOLLOW_INT_in_dotPropertyValuePair1356); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT.add(INT140);


                    }
                    break;
                case 3 :
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:189:32: valueLiteral
                    {
                    pushFollow(FOLLOW_valueLiteral_in_dotPropertyValuePair1360);
                    valueLiteral141=valueLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_valueLiteral.add(valueLiteral141.getTree());

                    }
                    break;

            }

            RPAREN142=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dotPropertyValuePair1363); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN142);


            }



            // AST REWRITE
            // elements: dotValue, ID, valueLiteral, INT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 190:4: -> ( ^( NAMEVAL ^( NAME dotValue ) ^( VAL ( ID )? ( INT )? ( valueLiteral )? ) ) )+
            {
                if ( !(stream_dotValue.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_dotValue.hasNext() ) {
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:190:7: ^( NAMEVAL ^( NAME dotValue ) ^( VAL ( ID )? ( INT )? ( valueLiteral )? ) )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NAMEVAL, "NAMEVAL"), root_1);

                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:190:17: ^( NAME dotValue )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(NAME, "NAME"), root_2);

                    adaptor.addChild(root_2, stream_dotValue.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:190:34: ^( VAL ( ID )? ( INT )? ( valueLiteral )? )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAL, "VAL"), root_2);

                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:190:40: ( ID )?
                    if ( stream_ID.hasNext() ) {
                        adaptor.addChild(root_2, stream_ID.nextNode());

                    }
                    stream_ID.reset();
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:190:44: ( INT )?
                    if ( stream_INT.hasNext() ) {
                        adaptor.addChild(root_2, stream_INT.nextNode());

                    }
                    stream_INT.reset();
                    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:190:49: ( valueLiteral )?
                    if ( stream_valueLiteral.hasNext() ) {
                        adaptor.addChild(root_2, stream_valueLiteral.nextTree());

                    }
                    stream_valueLiteral.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_dotValue.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "dotPropertyValuePair"

    public static class thisDotValue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "thisDotValue"
    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:193:1: thisDotValue : THIS dotValue ;
    public final RuleLangParser.thisDotValue_return thisDotValue() throws RecognitionException {
        RuleLangParser.thisDotValue_return retval = new RuleLangParser.thisDotValue_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THIS143=null;
        RuleLangParser.dotValue_return dotValue144 = null;


        Object THIS143_tree=null;

        try {
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:194:2: ( THIS dotValue )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:195:3: THIS dotValue
            {
            root_0 = (Object)adaptor.nil();

            THIS143=(Token)match(input,THIS,FOLLOW_THIS_in_thisDotValue1408); if (state.failed) return retval;
            pushFollow(FOLLOW_dotValue_in_thisDotValue1411);
            dotValue144=dotValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, dotValue144.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "thisDotValue"

    public static class dotValue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dotValue"
    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:198:1: dotValue : DOT ID ;
    public final RuleLangParser.dotValue_return dotValue() throws RecognitionException {
        RuleLangParser.dotValue_return retval = new RuleLangParser.dotValue_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT145=null;
        Token ID146=null;

        Object DOT145_tree=null;
        Object ID146_tree=null;

        try {
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:199:2: ( DOT ID )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:200:3: DOT ID
            {
            root_0 = (Object)adaptor.nil();

            DOT145=(Token)match(input,DOT,FOLLOW_DOT_in_dotValue1425); if (state.failed) return retval;
            ID146=(Token)match(input,ID,FOLLOW_ID_in_dotValue1428); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID146_tree = (Object)adaptor.create(ID146);
            adaptor.addChild(root_0, ID146_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "dotValue"

    public static class valueLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "valueLiteral"
    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:203:1: valueLiteral : '\\'' ( ID ( DOT ID )* ) '\\'' -> ^( LITERAL ID ( DOT ID )* ) ;
    public final RuleLangParser.valueLiteral_return valueLiteral() throws RecognitionException {
        RuleLangParser.valueLiteral_return retval = new RuleLangParser.valueLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal147=null;
        Token ID148=null;
        Token DOT149=null;
        Token ID150=null;
        Token char_literal151=null;

        Object char_literal147_tree=null;
        Object ID148_tree=null;
        Object DOT149_tree=null;
        Object ID150_tree=null;
        Object char_literal151_tree=null;
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");

        try {
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:204:2: ( '\\'' ( ID ( DOT ID )* ) '\\'' -> ^( LITERAL ID ( DOT ID )* ) )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:205:3: '\\'' ( ID ( DOT ID )* ) '\\''
            {
            char_literal147=(Token)match(input,47,FOLLOW_47_in_valueLiteral1442); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_47.add(char_literal147);

            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:205:8: ( ID ( DOT ID )* )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:205:9: ID ( DOT ID )*
            {
            ID148=(Token)match(input,ID,FOLLOW_ID_in_valueLiteral1445); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID148);

            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:205:12: ( DOT ID )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==DOT) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:205:13: DOT ID
            	    {
            	    DOT149=(Token)match(input,DOT,FOLLOW_DOT_in_valueLiteral1448); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT149);

            	    ID150=(Token)match(input,ID,FOLLOW_ID_in_valueLiteral1450); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ID.add(ID150);


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }

            char_literal151=(Token)match(input,47,FOLLOW_47_in_valueLiteral1455); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_47.add(char_literal151);



            // AST REWRITE
            // elements: ID, ID, DOT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 206:4: -> ^( LITERAL ID ( DOT ID )* )
            {
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:206:7: ^( LITERAL ID ( DOT ID )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LITERAL, "LITERAL"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:206:20: ( DOT ID )*
                while ( stream_ID.hasNext()||stream_DOT.hasNext() ) {
                    adaptor.addChild(root_1, stream_DOT.nextNode());
                    adaptor.addChild(root_1, stream_ID.nextNode());

                }
                stream_ID.reset();
                stream_DOT.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "valueLiteral"

    public static class action_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "action"
    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:209:1: action : ID LPAREN actionParameters RPAREN -> ^( ACTION ID ^( ARGS actionParameters ) ) ;
    public final RuleLangParser.action_return action() throws RecognitionException {
        RuleLangParser.action_return retval = new RuleLangParser.action_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID152=null;
        Token LPAREN153=null;
        Token RPAREN155=null;
        RuleLangParser.actionParameters_return actionParameters154 = null;


        Object ID152_tree=null;
        Object LPAREN153_tree=null;
        Object RPAREN155_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_actionParameters=new RewriteRuleSubtreeStream(adaptor,"rule actionParameters");
        try {
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:210:2: ( ID LPAREN actionParameters RPAREN -> ^( ACTION ID ^( ARGS actionParameters ) ) )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:211:3: ID LPAREN actionParameters RPAREN
            {
            ID152=(Token)match(input,ID,FOLLOW_ID_in_action1489); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID152);

            LPAREN153=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_action1491); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN153);

            pushFollow(FOLLOW_actionParameters_in_action1493);
            actionParameters154=actionParameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_actionParameters.add(actionParameters154.getTree());
            RPAREN155=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_action1495); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN155);



            // AST REWRITE
            // elements: ID, actionParameters
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 212:4: -> ^( ACTION ID ^( ARGS actionParameters ) )
            {
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:212:7: ^( ACTION ID ^( ARGS actionParameters ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ACTION, "ACTION"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:212:19: ^( ARGS actionParameters )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGS, "ARGS"), root_2);

                adaptor.addChild(root_2, stream_actionParameters.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "action"

    public static class actionParameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actionParameters"
    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:215:1: actionParameters : valueLiteral ( ',' valueLiteral )* -> ( valueLiteral )* ;
    public final RuleLangParser.actionParameters_return actionParameters() throws RecognitionException {
        RuleLangParser.actionParameters_return retval = new RuleLangParser.actionParameters_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal157=null;
        RuleLangParser.valueLiteral_return valueLiteral156 = null;

        RuleLangParser.valueLiteral_return valueLiteral158 = null;


        Object char_literal157_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_valueLiteral=new RewriteRuleSubtreeStream(adaptor,"rule valueLiteral");
        try {
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:216:2: ( valueLiteral ( ',' valueLiteral )* -> ( valueLiteral )* )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:217:3: valueLiteral ( ',' valueLiteral )*
            {
            pushFollow(FOLLOW_valueLiteral_in_actionParameters1527);
            valueLiteral156=valueLiteral();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_valueLiteral.add(valueLiteral156.getTree());
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:217:16: ( ',' valueLiteral )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==COMMA) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:217:17: ',' valueLiteral
            	    {
            	    char_literal157=(Token)match(input,COMMA,FOLLOW_COMMA_in_actionParameters1530); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal157);

            	    pushFollow(FOLLOW_valueLiteral_in_actionParameters1532);
            	    valueLiteral158=valueLiteral();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_valueLiteral.add(valueLiteral158.getTree());

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);



            // AST REWRITE
            // elements: valueLiteral
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 218:4: -> ( valueLiteral )*
            {
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:218:7: ( valueLiteral )*
                while ( stream_valueLiteral.hasNext() ) {
                    adaptor.addChild(root_0, stream_valueLiteral.nextTree());

                }
                stream_valueLiteral.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "actionParameters"

    // $ANTLR start synpred2_RuleLang
    public final void synpred2_RuleLang_fragment() throws RecognitionException {   
        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:52:4: ( IF condition '{' action '}' )
        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:52:4: IF condition '{' action '}'
        {
        match(input,IF,FOLLOW_IF_in_synpred2_RuleLang86); if (state.failed) return ;
        pushFollow(FOLLOW_condition_in_synpred2_RuleLang88);
        condition();

        state._fsp--;
        if (state.failed) return ;
        match(input,44,FOLLOW_44_in_synpred2_RuleLang90); if (state.failed) return ;
        pushFollow(FOLLOW_action_in_synpred2_RuleLang92);
        action();

        state._fsp--;
        if (state.failed) return ;
        match(input,45,FOLLOW_45_in_synpred2_RuleLang94); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_RuleLang

    // $ANTLR start synpred4_RuleLang
    public final void synpred4_RuleLang_fragment() throws RecognitionException {   
        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:55:4: ( IF predicate '{' action '}' )
        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:55:4: IF predicate '{' action '}'
        {
        match(input,IF,FOLLOW_IF_in_synpred4_RuleLang126); if (state.failed) return ;
        pushFollow(FOLLOW_predicate_in_synpred4_RuleLang128);
        predicate();

        state._fsp--;
        if (state.failed) return ;
        match(input,44,FOLLOW_44_in_synpred4_RuleLang130); if (state.failed) return ;
        pushFollow(FOLLOW_action_in_synpred4_RuleLang132);
        action();

        state._fsp--;
        if (state.failed) return ;
        match(input,45,FOLLOW_45_in_synpred4_RuleLang134); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_RuleLang

    // $ANTLR start synpred5_RuleLang
    public final void synpred5_RuleLang_fragment() throws RecognitionException {   
        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:61:27: ( OR condition )
        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:61:27: OR condition
        {
        match(input,OR,FOLLOW_OR_in_synpred5_RuleLang192); if (state.failed) return ;
        pushFollow(FOLLOW_condition_in_synpred5_RuleLang194);
        condition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_RuleLang

    // $ANTLR start synpred7_RuleLang
    public final void synpred7_RuleLang_fragment() throws RecognitionException {   
        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:61:9: ( LPAREN condition ( OR condition )+ ( predicate )? RPAREN )
        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:61:9: LPAREN condition ( OR condition )+ ( predicate )? RPAREN
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred7_RuleLang187); if (state.failed) return ;
        pushFollow(FOLLOW_condition_in_synpred7_RuleLang189);
        condition();

        state._fsp--;
        if (state.failed) return ;
        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:61:26: ( OR condition )+
        int cnt52=0;
        loop52:
        do {
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==OR) ) {
                int LA52_2 = input.LA(2);

                if ( (synpred5_RuleLang()) ) {
                    alt52=1;
                }


            }


            switch (alt52) {
        	case 1 :
        	    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:61:27: OR condition
        	    {
        	    match(input,OR,FOLLOW_OR_in_synpred7_RuleLang192); if (state.failed) return ;
        	    pushFollow(FOLLOW_condition_in_synpred7_RuleLang194);
        	    condition();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt52 >= 1 ) break loop52;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(52, input);
                    throw eee;
            }
            cnt52++;
        } while (true);

        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:61:42: ( predicate )?
        int alt53=2;
        int LA53_0 = input.LA(1);

        if ( ((LA53_0>=LPAREN && LA53_0<=OR)||LA53_0==AND) ) {
            alt53=1;
        }
        switch (alt53) {
            case 1 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:0:0: predicate
                {
                pushFollow(FOLLOW_predicate_in_synpred7_RuleLang198);
                predicate();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred7_RuleLang201); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_RuleLang

    // $ANTLR start synpred8_RuleLang
    public final void synpred8_RuleLang_fragment() throws RecognitionException {   
        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:64:27: ( AND condition )
        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:64:27: AND condition
        {
        match(input,AND,FOLLOW_AND_in_synpred8_RuleLang253); if (state.failed) return ;
        pushFollow(FOLLOW_condition_in_synpred8_RuleLang255);
        condition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_RuleLang

    // $ANTLR start synpred10_RuleLang
    public final void synpred10_RuleLang_fragment() throws RecognitionException {   
        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:64:9: ( LPAREN condition ( AND condition )+ ( predicate )? RPAREN )
        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:64:9: LPAREN condition ( AND condition )+ ( predicate )? RPAREN
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred10_RuleLang248); if (state.failed) return ;
        pushFollow(FOLLOW_condition_in_synpred10_RuleLang250);
        condition();

        state._fsp--;
        if (state.failed) return ;
        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:64:26: ( AND condition )+
        int cnt54=0;
        loop54:
        do {
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==AND) ) {
                int LA54_3 = input.LA(2);

                if ( (synpred8_RuleLang()) ) {
                    alt54=1;
                }


            }


            switch (alt54) {
        	case 1 :
        	    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:64:27: AND condition
        	    {
        	    match(input,AND,FOLLOW_AND_in_synpred10_RuleLang253); if (state.failed) return ;
        	    pushFollow(FOLLOW_condition_in_synpred10_RuleLang255);
        	    condition();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt54 >= 1 ) break loop54;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(54, input);
                    throw eee;
            }
            cnt54++;
        } while (true);

        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:64:43: ( predicate )?
        int alt55=2;
        int LA55_0 = input.LA(1);

        if ( ((LA55_0>=LPAREN && LA55_0<=OR)||LA55_0==AND) ) {
            alt55=1;
        }
        switch (alt55) {
            case 1 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:0:0: predicate
                {
                pushFollow(FOLLOW_predicate_in_synpred10_RuleLang259);
                predicate();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred10_RuleLang262); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_RuleLang

    // $ANTLR start synpred12_RuleLang
    public final void synpred12_RuleLang_fragment() throws RecognitionException {   
        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:67:10: ( OR ( predicate )* condition )
        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:67:10: OR ( predicate )* condition
        {
        match(input,OR,FOLLOW_OR_in_synpred12_RuleLang308); if (state.failed) return ;
        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:67:13: ( predicate )*
        loop56:
        do {
            int alt56=2;
            alt56 = dfa56.predict(input);
            switch (alt56) {
        	case 1 :
        	    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:0:0: predicate
        	    {
        	    pushFollow(FOLLOW_predicate_in_synpred12_RuleLang310);
        	    predicate();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop56;
            }
        } while (true);

        pushFollow(FOLLOW_condition_in_synpred12_RuleLang313);
        condition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_RuleLang

    // $ANTLR start synpred15_RuleLang
    public final void synpred15_RuleLang_fragment() throws RecognitionException {   
        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:70:4: ( AND ( predicate )* condition )
        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:70:4: AND ( predicate )* condition
        {
        match(input,AND,FOLLOW_AND_in_synpred15_RuleLang350); if (state.failed) return ;
        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:70:8: ( predicate )*
        loop59:
        do {
            int alt59=2;
            alt59 = dfa59.predict(input);
            switch (alt59) {
        	case 1 :
        	    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:0:0: predicate
        	    {
        	    pushFollow(FOLLOW_predicate_in_synpred15_RuleLang352);
        	    predicate();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop59;
            }
        } while (true);

        pushFollow(FOLLOW_condition_in_synpred15_RuleLang355);
        condition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_RuleLang

    // $ANTLR start synpred18_RuleLang
    public final void synpred18_RuleLang_fragment() throws RecognitionException {   
        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:99:3: ( equalityCondition )
        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:99:3: equalityCondition
        {
        pushFollow(FOLLOW_equalityCondition_in_synpred18_RuleLang611);
        equalityCondition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_RuleLang

    // $ANTLR start synpred19_RuleLang
    public final void synpred19_RuleLang_fragment() throws RecognitionException {   
        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:100:5: ( inequalityCondition )
        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:100:5: inequalityCondition
        {
        pushFollow(FOLLOW_inequalityCondition_in_synpred19_RuleLang618);
        inequalityCondition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_RuleLang

    // $ANTLR start synpred20_RuleLang
    public final void synpred20_RuleLang_fragment() throws RecognitionException {   
        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:101:5: ( greaterThanCondition )
        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:101:5: greaterThanCondition
        {
        pushFollow(FOLLOW_greaterThanCondition_in_synpred20_RuleLang625);
        greaterThanCondition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_RuleLang

    // $ANTLR start synpred21_RuleLang
    public final void synpred21_RuleLang_fragment() throws RecognitionException {   
        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:102:5: ( lessThanCondition )
        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:102:5: lessThanCondition
        {
        pushFollow(FOLLOW_lessThanCondition_in_synpred21_RuleLang632);
        lessThanCondition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_RuleLang

    // $ANTLR start synpred22_RuleLang
    public final void synpred22_RuleLang_fragment() throws RecognitionException {   
        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:103:5: ( greaterThanOrEqualCondition )
        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:103:5: greaterThanOrEqualCondition
        {
        pushFollow(FOLLOW_greaterThanOrEqualCondition_in_synpred22_RuleLang638);
        greaterThanOrEqualCondition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_RuleLang

    // Delegated rules

    public final boolean synpred21_RuleLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_RuleLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_RuleLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_RuleLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_RuleLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_RuleLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_RuleLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_RuleLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_RuleLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_RuleLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_RuleLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_RuleLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_RuleLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_RuleLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_RuleLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_RuleLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_RuleLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_RuleLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_RuleLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_RuleLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_RuleLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_RuleLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_RuleLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_RuleLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_RuleLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_RuleLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA59 dfa59 = new DFA59(this);
    static final String DFA4_eotS =
        "\16\uffff";
    static final String DFA4_eofS =
        "\16\uffff";
    static final String DFA4_minS =
        "\1\4\2\5\1\uffff\1\5\1\uffff\1\27\5\11\2\5";
    static final String DFA4_maxS =
        "\1\4\1\10\1\57\1\uffff\1\57\1\uffff\1\27\1\26\3\11\1\26\1\21\1\24";
    static final String DFA4_acceptS =
        "\3\uffff\1\2\1\uffff\1\1\10\uffff";
    static final String DFA4_specialS =
        "\16\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1",
            "\1\2\1\3\1\uffff\1\3",
            "\1\4\3\uffff\1\5\6\uffff\1\5\4\uffff\2\5\30\uffff\1\5",
            "",
            "\1\3\3\uffff\1\7\6\uffff\1\3\4\5\1\3\1\6\30\uffff\1\3",
            "",
            "\1\10",
            "\1\5\6\3\1\uffff\1\11\2\5\1\12\1\uffff\1\5",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\5\6\3\1\uffff\1\11\2\5\1\12\1\uffff\1\5",
            "\1\5\1\uffff\1\5\2\uffff\6\3\1\uffff\1\5",
            "\1\5\1\uffff\1\5\2\uffff\6\3\4\uffff\1\5"
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "50:1: statement : ( ( IF condition '{' action '}' )+ -> ( ^( IF condition ^( THEN action ) ) )* | ( IF predicate '{' action '}' )+ -> ( ^( IF predicate ^( THEN action ) ) )* );";
        }
    }
    static final String DFA9_eotS =
        "\15\uffff";
    static final String DFA9_eofS =
        "\15\uffff";
    static final String DFA9_minS =
        "\2\5\1\uffff\1\5\1\uffff\1\27\5\11\2\5";
    static final String DFA9_maxS =
        "\1\10\1\57\1\uffff\1\57\1\uffff\1\27\1\26\3\11\1\26\1\24\1\21";
    static final String DFA9_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\10\uffff";
    static final String DFA9_specialS =
        "\15\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1\1\2\1\uffff\1\2",
            "\1\3\3\uffff\1\4\6\uffff\1\4\4\uffff\2\4\30\uffff\1\4",
            "",
            "\1\2\3\uffff\1\6\6\uffff\1\2\4\4\1\2\1\5\30\uffff\1\2",
            "",
            "\1\7",
            "\1\4\6\2\1\uffff\1\11\2\4\1\10\1\uffff\1\4",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\4\6\2\1\uffff\1\11\2\4\1\10\1\uffff\1\4",
            "\1\4\1\uffff\1\4\2\uffff\6\2\4\uffff\1\4",
            "\1\4\1\uffff\1\4\2\uffff\6\2\1\uffff\1\4"
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "()* loopback of 67:13: ( predicate )*";
        }
    }
    static final String DFA11_eotS =
        "\15\uffff";
    static final String DFA11_eofS =
        "\15\uffff";
    static final String DFA11_minS =
        "\2\5\2\uffff\1\5\1\27\5\11\2\5";
    static final String DFA11_maxS =
        "\1\10\1\57\2\uffff\1\57\1\27\1\26\3\11\1\26\1\21\1\24";
    static final String DFA11_acceptS =
        "\2\uffff\1\1\1\2\11\uffff";
    static final String DFA11_specialS =
        "\15\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\1\1\2\1\uffff\1\2",
            "\1\4\3\uffff\1\3\6\uffff\1\3\4\uffff\2\3\30\uffff\1\3",
            "",
            "",
            "\1\2\3\uffff\1\6\6\uffff\1\2\4\3\1\2\1\5\30\uffff\1\2",
            "\1\7",
            "\1\3\6\2\1\uffff\1\10\2\3\1\11\1\uffff\1\3",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\3\6\2\1\uffff\1\10\2\3\1\11\1\uffff\1\3",
            "\1\3\1\uffff\1\3\2\uffff\6\2\1\uffff\1\3",
            "\1\3\1\uffff\1\3\2\uffff\6\2\4\uffff\1\3"
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "()* loopback of 70:8: ( predicate )*";
        }
    }
    static final String DFA42_eotS =
        "\12\uffff";
    static final String DFA42_eofS =
        "\12\uffff";
    static final String DFA42_minS =
        "\1\5\1\11\1\27\1\11\4\uffff\2\11";
    static final String DFA42_maxS =
        "\1\5\1\26\1\27\1\26\4\uffff\1\11\1\26";
    static final String DFA42_acceptS =
        "\4\uffff\1\4\1\1\1\2\1\3\2\uffff";
    static final String DFA42_specialS =
        "\12\uffff}>";
    static final String[] DFA42_transitionS = {
            "\1\1",
            "\1\3\7\uffff\1\5\1\6\1\7\1\4\1\uffff\1\2",
            "\1\10",
            "\1\3\7\uffff\1\5\1\6\1\7\1\4\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "\1\11",
            "\1\3\7\uffff\1\5\1\6\1\7\1\4\1\uffff\1\2"
    };

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "149:1: operandExpression : ( LPAREN ( thisDotValue | ID )* ( PLUS ID )+ ( operandExpression )* RPAREN -> ^( PLUS ( thisDotValue )* ( ID )* ( operandExpression )* ) | LPAREN ( thisDotValue | ID )* ( SLASH ID )+ ( operandExpression )* RPAREN -> ^( SLASH ( thisDotValue )* ( ID )* ( operandExpression )* ) | LPAREN ( thisDotValue | ID )* ( STAR ID )+ ( operandExpression )* RPAREN -> ^( STAR ( thisDotValue )* ( ID )* ( operandExpression )* ) | LPAREN ( thisDotValue | ID )* ( MINUS ID )+ ( operandExpression )* RPAREN -> ^( MINUS ( thisDotValue )* ( ID )* ( operandExpression )* ) );";
        }
    }
    static final String DFA56_eotS =
        "\15\uffff";
    static final String DFA56_eofS =
        "\15\uffff";
    static final String DFA56_minS =
        "\2\5\2\uffff\1\5\1\27\5\11\2\5";
    static final String DFA56_maxS =
        "\1\10\1\57\2\uffff\1\57\1\27\1\26\3\11\1\26\1\24\1\21";
    static final String DFA56_acceptS =
        "\2\uffff\1\1\1\2\11\uffff";
    static final String DFA56_specialS =
        "\15\uffff}>";
    static final String[] DFA56_transitionS = {
            "\1\1\1\2\1\uffff\1\2",
            "\1\4\3\uffff\1\3\6\uffff\1\3\4\uffff\2\3\30\uffff\1\3",
            "",
            "",
            "\1\2\3\uffff\1\6\6\uffff\1\2\4\3\1\2\1\5\30\uffff\1\2",
            "\1\7",
            "\1\3\6\2\1\uffff\1\11\2\3\1\10\1\uffff\1\3",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\3\6\2\1\uffff\1\11\2\3\1\10\1\uffff\1\3",
            "\1\3\1\uffff\1\3\2\uffff\6\2\4\uffff\1\3",
            "\1\3\1\uffff\1\3\2\uffff\6\2\1\uffff\1\3"
    };

    static final short[] DFA56_eot = DFA.unpackEncodedString(DFA56_eotS);
    static final short[] DFA56_eof = DFA.unpackEncodedString(DFA56_eofS);
    static final char[] DFA56_min = DFA.unpackEncodedStringToUnsignedChars(DFA56_minS);
    static final char[] DFA56_max = DFA.unpackEncodedStringToUnsignedChars(DFA56_maxS);
    static final short[] DFA56_accept = DFA.unpackEncodedString(DFA56_acceptS);
    static final short[] DFA56_special = DFA.unpackEncodedString(DFA56_specialS);
    static final short[][] DFA56_transition;

    static {
        int numStates = DFA56_transitionS.length;
        DFA56_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA56_transition[i] = DFA.unpackEncodedString(DFA56_transitionS[i]);
        }
    }

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = DFA56_eot;
            this.eof = DFA56_eof;
            this.min = DFA56_min;
            this.max = DFA56_max;
            this.accept = DFA56_accept;
            this.special = DFA56_special;
            this.transition = DFA56_transition;
        }
        public String getDescription() {
            return "()* loopback of 67:13: ( predicate )*";
        }
    }
    static final String DFA59_eotS =
        "\15\uffff";
    static final String DFA59_eofS =
        "\15\uffff";
    static final String DFA59_minS =
        "\2\5\2\uffff\1\5\1\27\5\11\2\5";
    static final String DFA59_maxS =
        "\1\10\1\57\2\uffff\1\57\1\27\1\26\3\11\1\26\1\21\1\24";
    static final String DFA59_acceptS =
        "\2\uffff\1\1\1\2\11\uffff";
    static final String DFA59_specialS =
        "\15\uffff}>";
    static final String[] DFA59_transitionS = {
            "\1\1\1\2\1\uffff\1\2",
            "\1\4\3\uffff\1\3\6\uffff\1\3\4\uffff\2\3\30\uffff\1\3",
            "",
            "",
            "\1\2\3\uffff\1\6\6\uffff\1\2\4\3\1\2\1\5\30\uffff\1\2",
            "\1\7",
            "\1\3\6\2\1\uffff\1\10\2\3\1\11\1\uffff\1\3",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\3\6\2\1\uffff\1\10\2\3\1\11\1\uffff\1\3",
            "\1\3\1\uffff\1\3\2\uffff\6\2\1\uffff\1\3",
            "\1\3\1\uffff\1\3\2\uffff\6\2\4\uffff\1\3"
    };

    static final short[] DFA59_eot = DFA.unpackEncodedString(DFA59_eotS);
    static final short[] DFA59_eof = DFA.unpackEncodedString(DFA59_eofS);
    static final char[] DFA59_min = DFA.unpackEncodedStringToUnsignedChars(DFA59_minS);
    static final char[] DFA59_max = DFA.unpackEncodedStringToUnsignedChars(DFA59_maxS);
    static final short[] DFA59_accept = DFA.unpackEncodedString(DFA59_acceptS);
    static final short[] DFA59_special = DFA.unpackEncodedString(DFA59_specialS);
    static final short[][] DFA59_transition;

    static {
        int numStates = DFA59_transitionS.length;
        DFA59_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA59_transition[i] = DFA.unpackEncodedString(DFA59_transitionS[i]);
        }
    }

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = DFA59_eot;
            this.eof = DFA59_eof;
            this.min = DFA59_min;
            this.max = DFA59_max;
            this.accept = DFA59_accept;
            this.special = DFA59_special;
            this.transition = DFA59_transition;
        }
        public String getDescription() {
            return "()* loopback of 70:8: ( predicate )*";
        }
    }
 

    public static final BitSet FOLLOW_statement_in_rule61 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_IF_in_statement86 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_condition_in_statement88 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_statement90 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_action_in_statement92 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_statement94 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_IF_in_statement126 = new BitSet(new long[]{0x0000000000000160L});
    public static final BitSet FOLLOW_predicate_in_statement128 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_statement130 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_action_in_statement132 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_statement134 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_LPAREN_in_predicate187 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_condition_in_predicate189 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OR_in_predicate192 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_condition_in_predicate194 = new BitSet(new long[]{0x00000000000001E0L});
    public static final BitSet FOLLOW_predicate_in_predicate198 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RPAREN_in_predicate201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_predicate248 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_condition_in_predicate250 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_AND_in_predicate253 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_condition_in_predicate255 = new BitSet(new long[]{0x00000000000001E0L});
    public static final BitSet FOLLOW_predicate_in_predicate259 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RPAREN_in_predicate262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_predicate308 = new BitSet(new long[]{0x0000000000000160L});
    public static final BitSet FOLLOW_predicate_in_predicate310 = new BitSet(new long[]{0x0000000000000160L});
    public static final BitSet FOLLOW_condition_in_predicate313 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AND_in_predicate350 = new BitSet(new long[]{0x0000000000000160L});
    public static final BitSet FOLLOW_predicate_in_predicate352 = new BitSet(new long[]{0x0000000000000160L});
    public static final BitSet FOLLOW_condition_in_predicate355 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_46_in_forstatement400 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_forstatement402 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_variableDeclarator_in_forstatement407 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_SEMI_in_forstatement410 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_operandExpression_in_forstatement432 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_SEMI_in_forstatement435 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_operandExpression_in_forstatement459 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RPAREN_in_forstatement477 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_statement_in_forstatement479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variableDeclarator524 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_EQL_in_variableDeclarator535 = new BitSet(new long[]{0x0000800000610220L});
    public static final BitSet FOLLOW_operand_in_variableDeclarator538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_variableDeclarator542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityCondition_in_condition611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inequalityCondition_in_condition618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_greaterThanCondition_in_condition625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lessThanCondition_in_condition632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_greaterThanOrEqualCondition_in_condition638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lessThanOrEqualCondition_in_condition645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_equalityCondition659 = new BitSet(new long[]{0x0000800000610220L});
    public static final BitSet FOLLOW_operand_in_equalityCondition662 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleExpression_in_equalityCondition666 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQ_in_equalityCondition669 = new BitSet(new long[]{0x0000800000610220L});
    public static final BitSet FOLLOW_operand_in_equalityCondition672 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleExpression_in_equalityCondition676 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RPAREN_in_equalityCondition679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_inequalityCondition709 = new BitSet(new long[]{0x0000800000610220L});
    public static final BitSet FOLLOW_operand_in_inequalityCondition712 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleExpression_in_inequalityCondition716 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_BANGEQ_in_inequalityCondition719 = new BitSet(new long[]{0x0000800000610220L});
    public static final BitSet FOLLOW_operand_in_inequalityCondition722 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleExpression_in_inequalityCondition726 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RPAREN_in_inequalityCondition729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_greaterThanCondition758 = new BitSet(new long[]{0x0000800000610220L});
    public static final BitSet FOLLOW_operand_in_greaterThanCondition761 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleExpression_in_greaterThanCondition765 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_GT_in_greaterThanCondition768 = new BitSet(new long[]{0x0000800000610220L});
    public static final BitSet FOLLOW_operand_in_greaterThanCondition771 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleExpression_in_greaterThanCondition775 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RPAREN_in_greaterThanCondition778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_lessThanCondition808 = new BitSet(new long[]{0x0000800000610220L});
    public static final BitSet FOLLOW_operand_in_lessThanCondition811 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleExpression_in_lessThanCondition815 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LT_in_lessThanCondition818 = new BitSet(new long[]{0x0000800000610220L});
    public static final BitSet FOLLOW_operand_in_lessThanCondition821 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleExpression_in_lessThanCondition825 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RPAREN_in_lessThanCondition828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_lessThanOrEqualCondition857 = new BitSet(new long[]{0x0000800000610220L});
    public static final BitSet FOLLOW_operand_in_lessThanOrEqualCondition860 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleExpression_in_lessThanOrEqualCondition864 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LTEQ_in_lessThanOrEqualCondition867 = new BitSet(new long[]{0x0000800000610220L});
    public static final BitSet FOLLOW_operand_in_lessThanOrEqualCondition870 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleExpression_in_lessThanOrEqualCondition874 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RPAREN_in_lessThanOrEqualCondition877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_greaterThanOrEqualCondition907 = new BitSet(new long[]{0x0000800000610220L});
    public static final BitSet FOLLOW_operand_in_greaterThanOrEqualCondition910 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleExpression_in_greaterThanOrEqualCondition914 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_GTEQ_in_greaterThanOrEqualCondition917 = new BitSet(new long[]{0x0000800000610220L});
    public static final BitSet FOLLOW_operand_in_greaterThanOrEqualCondition920 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleExpression_in_greaterThanOrEqualCondition924 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RPAREN_in_greaterThanOrEqualCondition927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_valueLiteral_in_operand958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_thisDotValue_in_operand962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_operand966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_operand970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_operandExpression985 = new BitSet(new long[]{0x0000000000420200L});
    public static final BitSet FOLLOW_thisDotValue_in_operandExpression988 = new BitSet(new long[]{0x0000000000420200L});
    public static final BitSet FOLLOW_ID_in_operandExpression992 = new BitSet(new long[]{0x0000000000420200L});
    public static final BitSet FOLLOW_PLUS_in_operandExpression997 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_operandExpression999 = new BitSet(new long[]{0x00000000000200A0L});
    public static final BitSet FOLLOW_operandExpression_in_operandExpression1003 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_RPAREN_in_operandExpression1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_operandExpression1032 = new BitSet(new long[]{0x0000000000440200L});
    public static final BitSet FOLLOW_thisDotValue_in_operandExpression1035 = new BitSet(new long[]{0x0000000000440200L});
    public static final BitSet FOLLOW_ID_in_operandExpression1039 = new BitSet(new long[]{0x0000000000440200L});
    public static final BitSet FOLLOW_SLASH_in_operandExpression1044 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_operandExpression1046 = new BitSet(new long[]{0x00000000000400A0L});
    public static final BitSet FOLLOW_operandExpression_in_operandExpression1050 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_RPAREN_in_operandExpression1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_operandExpression1079 = new BitSet(new long[]{0x0000000000480200L});
    public static final BitSet FOLLOW_thisDotValue_in_operandExpression1082 = new BitSet(new long[]{0x0000000000480200L});
    public static final BitSet FOLLOW_ID_in_operandExpression1086 = new BitSet(new long[]{0x0000000000480200L});
    public static final BitSet FOLLOW_STAR_in_operandExpression1091 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_operandExpression1093 = new BitSet(new long[]{0x00000000000800A0L});
    public static final BitSet FOLLOW_operandExpression_in_operandExpression1097 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_RPAREN_in_operandExpression1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_operandExpression1126 = new BitSet(new long[]{0x0000000000500200L});
    public static final BitSet FOLLOW_thisDotValue_in_operandExpression1129 = new BitSet(new long[]{0x0000000000500200L});
    public static final BitSet FOLLOW_ID_in_operandExpression1133 = new BitSet(new long[]{0x0000000000500200L});
    public static final BitSet FOLLOW_MINUS_in_operandExpression1138 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_operandExpression1140 = new BitSet(new long[]{0x00000000001000A0L});
    public static final BitSet FOLLOW_operandExpression_in_operandExpression1144 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_RPAREN_in_operandExpression1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lookupExpression_in_ruleExpression1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeRollExpressionPlus_in_ruleExpression1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeRollExpressionMinus_in_ruleExpression1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operandExpression_in_ruleExpression1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_thisDotValue_in_timeRollExpressionPlus1211 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_timeRollExpressionPlus1215 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_PLUS_in_timeRollExpressionPlus1218 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_timeRollExpressionPlus1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_thisDotValue_in_timeRollExpressionMinus1254 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_timeRollExpressionMinus1258 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_MINUS_in_timeRollExpressionMinus1261 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_timeRollExpressionMinus1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOOKUP_in_lookupExpression1298 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_dotValue_in_lookupExpression1300 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_dotPropertyValuePair_in_lookupExpression1302 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_dotValue_in_lookupExpression1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotValue_in_dotPropertyValuePair1346 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_dotPropertyValuePair1349 = new BitSet(new long[]{0x0000800000010200L});
    public static final BitSet FOLLOW_ID_in_dotPropertyValuePair1352 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_INT_in_dotPropertyValuePair1356 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_valueLiteral_in_dotPropertyValuePair1360 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RPAREN_in_dotPropertyValuePair1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_thisDotValue1408 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_dotValue_in_thisDotValue1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_dotValue1425 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_dotValue1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_valueLiteral1442 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_valueLiteral1445 = new BitSet(new long[]{0x0000800000800000L});
    public static final BitSet FOLLOW_DOT_in_valueLiteral1448 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_valueLiteral1450 = new BitSet(new long[]{0x0000800000800000L});
    public static final BitSet FOLLOW_47_in_valueLiteral1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_action1489 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_action1491 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_actionParameters_in_action1493 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RPAREN_in_action1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_valueLiteral_in_actionParameters1527 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_COMMA_in_actionParameters1530 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_valueLiteral_in_actionParameters1532 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_IF_in_synpred2_RuleLang86 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_condition_in_synpred2_RuleLang88 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_synpred2_RuleLang90 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_action_in_synpred2_RuleLang92 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_synpred2_RuleLang94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred4_RuleLang126 = new BitSet(new long[]{0x0000000000000160L});
    public static final BitSet FOLLOW_predicate_in_synpred4_RuleLang128 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_synpred4_RuleLang130 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_action_in_synpred4_RuleLang132 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_synpred4_RuleLang134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_synpred5_RuleLang192 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_condition_in_synpred5_RuleLang194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred7_RuleLang187 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_condition_in_synpred7_RuleLang189 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OR_in_synpred7_RuleLang192 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_condition_in_synpred7_RuleLang194 = new BitSet(new long[]{0x00000000000001E0L});
    public static final BitSet FOLLOW_predicate_in_synpred7_RuleLang198 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RPAREN_in_synpred7_RuleLang201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_synpred8_RuleLang253 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_condition_in_synpred8_RuleLang255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred10_RuleLang248 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_condition_in_synpred10_RuleLang250 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_AND_in_synpred10_RuleLang253 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_condition_in_synpred10_RuleLang255 = new BitSet(new long[]{0x00000000000001E0L});
    public static final BitSet FOLLOW_predicate_in_synpred10_RuleLang259 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RPAREN_in_synpred10_RuleLang262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_synpred12_RuleLang308 = new BitSet(new long[]{0x0000000000000160L});
    public static final BitSet FOLLOW_predicate_in_synpred12_RuleLang310 = new BitSet(new long[]{0x0000000000000160L});
    public static final BitSet FOLLOW_condition_in_synpred12_RuleLang313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_synpred15_RuleLang350 = new BitSet(new long[]{0x0000000000000160L});
    public static final BitSet FOLLOW_predicate_in_synpred15_RuleLang352 = new BitSet(new long[]{0x0000000000000160L});
    public static final BitSet FOLLOW_condition_in_synpred15_RuleLang355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityCondition_in_synpred18_RuleLang611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inequalityCondition_in_synpred19_RuleLang618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_greaterThanCondition_in_synpred20_RuleLang625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lessThanCondition_in_synpred21_RuleLang632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_greaterThanOrEqualCondition_in_synpred22_RuleLang638 = new BitSet(new long[]{0x0000000000000002L});

}