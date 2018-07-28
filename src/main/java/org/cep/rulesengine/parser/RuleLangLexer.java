// $ANTLR 3.2 Sep 23, 2009 14:05:07 /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g 2018-07-27 21:41:50
 package org.cep.rulesengine.parser; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class RuleLangLexer extends Lexer {
    public static final int TIMEROLL=31;
    public static final int LT=13;
    public static final int STAR=19;
    public static final int HR=36;
    public static final int LTEQ=14;
    public static final int AND=8;
    public static final int ID=9;
    public static final int LEAF=30;
    public static final int EOF=-1;
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

    public RuleLangLexer() {;} 
    public RuleLangLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public RuleLangLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g"; }

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:9:7: ( '{' )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:9:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:10:7: ( '}' )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:10:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:11:7: ( 'for' )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:11:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:12:7: ( '\\'' )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:12:9: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:224:2: ( 'if' )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:225:3: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:229:2: ( 'then' )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:230:3: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "LOOKUP"
    public final void mLOOKUP() throws RecognitionException {
        try {
            int _type = LOOKUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:234:2: ( 'lookup' )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:235:3: 'lookup'
            {
            match("lookup"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOOKUP"

    // $ANTLR start "THIS"
    public final void mTHIS() throws RecognitionException {
        try {
            int _type = THIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:239:2: ( 'this' )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:240:3: 'this'
            {
            match("this"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THIS"

    // $ANTLR start "CTD"
    public final void mCTD() throws RecognitionException {
        try {
            int _type = CTD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:244:2: ( 'ctd' )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:245:3: 'ctd'
            {
            match("ctd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CTD"

    // $ANTLR start "CRITERIA"
    public final void mCRITERIA() throws RecognitionException {
        try {
            int _type = CRITERIA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:249:2: ( 'criteria' )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:250:3: 'criteria'
            {
            match("criteria"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CRITERIA"

    // $ANTLR start "NAMEVAL"
    public final void mNAMEVAL() throws RecognitionException {
        try {
            int _type = NAMEVAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:254:2: ( 'nameval' )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:255:3: 'nameval'
            {
            match("nameval"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NAMEVAL"

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:259:2: ( 'name' )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:260:3: 'name'
            {
            match("name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NAME"

    // $ANTLR start "VAL"
    public final void mVAL() throws RecognitionException {
        try {
            int _type = VAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:264:2: ( 'val' )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:265:3: 'val'
            {
            match("val"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAL"

    // $ANTLR start "LEAF"
    public final void mLEAF() throws RecognitionException {
        try {
            int _type = LEAF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:269:2: ( 'leaf' )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:270:3: 'leaf'
            {
            match("leaf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEAF"

    // $ANTLR start "TIMEROLL"
    public final void mTIMEROLL() throws RecognitionException {
        try {
            int _type = TIMEROLL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:274:2: ( 'timeroll' )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:275:3: 'timeroll'
            {
            match("timeroll"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIMEROLL"

    // $ANTLR start "LITERAL"
    public final void mLITERAL() throws RecognitionException {
        try {
            int _type = LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:279:2: ( 'literal' )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:280:3: 'literal'
            {
            match("literal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LITERAL"

    // $ANTLR start "ROOT"
    public final void mROOT() throws RecognitionException {
        try {
            int _type = ROOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:284:2: ( 'root' )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:285:3: 'root'
            {
            match("root"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ROOT"

    // $ANTLR start "SEC"
    public final void mSEC() throws RecognitionException {
        try {
            int _type = SEC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:289:2: ( 's' )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:290:3: 's'
            {
            match('s'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEC"

    // $ANTLR start "MIN"
    public final void mMIN() throws RecognitionException {
        try {
            int _type = MIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:294:2: ( 'm' )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:295:3: 'm'
            {
            match('m'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MIN"

    // $ANTLR start "HR"
    public final void mHR() throws RecognitionException {
        try {
            int _type = HR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:299:2: ( 'h' )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:300:3: 'h'
            {
            match('h'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HR"

    // $ANTLR start "ACTION"
    public final void mACTION() throws RecognitionException {
        try {
            int _type = ACTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:304:2: ( 'action' )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:305:3: 'action'
            {
            match("action"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ACTION"

    // $ANTLR start "ARGS"
    public final void mARGS() throws RecognitionException {
        try {
            int _type = ARGS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:309:2: ( 'args' )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:310:3: 'args'
            {
            match("args"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ARGS"

    // $ANTLR start "ARG"
    public final void mARG() throws RecognitionException {
        try {
            int _type = ARG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:314:2: ( 'arg' )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:315:3: 'arg'
            {
            match("arg"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ARG"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:319:2: ( ( '0' .. '9' )+ )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:320:3: ( '0' .. '9' )+
            {
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:320:3: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:320:4: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:324:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '@' | ':' | '_' )+ )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:325:3: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '@' | ':' | '_' )+
            {
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:325:3: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '@' | ':' | '_' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<=':')||(LA2_0>='@' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<=':')||(input.LA(1)>='@' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:329:2: ( '.' )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:330:3: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:334:5: ( ';' )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:335:6: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:339:5: ( ',' )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:339:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:342:5: ( '&&' )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:343:3: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:346:4: ( '||' )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:347:3: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:351:5: ( '+' )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:352:6: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:356:2: ( '-' )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:357:3: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:361:2: ( '*' )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:362:3: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "SLASH"
    public final void mSLASH() throws RecognitionException {
        try {
            int _type = SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:366:2: ( '/' )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:367:3: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SLASH"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:371:2: ( '(' )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:372:3: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:376:2: ( ')' )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:377:3: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "EQL"
    public final void mEQL() throws RecognitionException {
        try {
            int _type = EQL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:381:2: ( '=' )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:382:3: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQL"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:385:2: ( '==' )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:386:3: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "BANGEQ"
    public final void mBANGEQ() throws RecognitionException {
        try {
            int _type = BANGEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:390:2: ( '!=' )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:391:3: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BANGEQ"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:395:2: ( '<' )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:396:3: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:400:2: ( '>' )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:401:3: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "LTEQ"
    public final void mLTEQ() throws RecognitionException {
        try {
            int _type = LTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:405:2: ( '<=' )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:406:3: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LTEQ"

    // $ANTLR start "GTEQ"
    public final void mGTEQ() throws RecognitionException {
        try {
            int _type = GTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:410:2: ( '>=' )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:411:3: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GTEQ"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:415:2: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:416:3: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:8: ( T__44 | T__45 | T__46 | T__47 | IF | THEN | LOOKUP | THIS | CTD | CRITERIA | NAMEVAL | NAME | VAL | LEAF | TIMEROLL | LITERAL | ROOT | SEC | MIN | HR | ACTION | ARGS | ARG | INT | ID | DOT | SEMI | COMMA | AND | OR | PLUS | MINUS | STAR | SLASH | LPAREN | RPAREN | EQL | EQ | BANGEQ | LT | GT | LTEQ | GTEQ | WS )
        int alt3=44;
        alt3 = dfa3.predict(input);
        switch (alt3) {
            case 1 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:10: T__44
                {
                mT__44(); 

                }
                break;
            case 2 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:16: T__45
                {
                mT__45(); 

                }
                break;
            case 3 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:22: T__46
                {
                mT__46(); 

                }
                break;
            case 4 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:28: T__47
                {
                mT__47(); 

                }
                break;
            case 5 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:34: IF
                {
                mIF(); 

                }
                break;
            case 6 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:37: THEN
                {
                mTHEN(); 

                }
                break;
            case 7 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:42: LOOKUP
                {
                mLOOKUP(); 

                }
                break;
            case 8 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:49: THIS
                {
                mTHIS(); 

                }
                break;
            case 9 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:54: CTD
                {
                mCTD(); 

                }
                break;
            case 10 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:58: CRITERIA
                {
                mCRITERIA(); 

                }
                break;
            case 11 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:67: NAMEVAL
                {
                mNAMEVAL(); 

                }
                break;
            case 12 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:75: NAME
                {
                mNAME(); 

                }
                break;
            case 13 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:80: VAL
                {
                mVAL(); 

                }
                break;
            case 14 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:84: LEAF
                {
                mLEAF(); 

                }
                break;
            case 15 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:89: TIMEROLL
                {
                mTIMEROLL(); 

                }
                break;
            case 16 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:98: LITERAL
                {
                mLITERAL(); 

                }
                break;
            case 17 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:106: ROOT
                {
                mROOT(); 

                }
                break;
            case 18 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:111: SEC
                {
                mSEC(); 

                }
                break;
            case 19 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:115: MIN
                {
                mMIN(); 

                }
                break;
            case 20 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:119: HR
                {
                mHR(); 

                }
                break;
            case 21 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:122: ACTION
                {
                mACTION(); 

                }
                break;
            case 22 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:129: ARGS
                {
                mARGS(); 

                }
                break;
            case 23 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:134: ARG
                {
                mARG(); 

                }
                break;
            case 24 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:138: INT
                {
                mINT(); 

                }
                break;
            case 25 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:142: ID
                {
                mID(); 

                }
                break;
            case 26 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:145: DOT
                {
                mDOT(); 

                }
                break;
            case 27 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:149: SEMI
                {
                mSEMI(); 

                }
                break;
            case 28 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:154: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 29 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:160: AND
                {
                mAND(); 

                }
                break;
            case 30 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:164: OR
                {
                mOR(); 

                }
                break;
            case 31 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:167: PLUS
                {
                mPLUS(); 

                }
                break;
            case 32 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:172: MINUS
                {
                mMINUS(); 

                }
                break;
            case 33 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:178: STAR
                {
                mSTAR(); 

                }
                break;
            case 34 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:183: SLASH
                {
                mSLASH(); 

                }
                break;
            case 35 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:189: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 36 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:196: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 37 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:203: EQL
                {
                mEQL(); 

                }
                break;
            case 38 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:207: EQ
                {
                mEQ(); 

                }
                break;
            case 39 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:210: BANGEQ
                {
                mBANGEQ(); 

                }
                break;
            case 40 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:217: LT
                {
                mLT(); 

                }
                break;
            case 41 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:220: GT
                {
                mGT(); 

                }
                break;
            case 42 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:223: LTEQ
                {
                mLTEQ(); 

                }
                break;
            case 43 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:228: GTEQ
                {
                mGTEQ(); 

                }
                break;
            case 44 :
                // /Users/arodriguez/Downloads/Projects/rules_engine/src/main/java/org/cep/rulesengine/parser/RuleLang.g:1:233: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\3\uffff\1\21\1\uffff\7\21\1\56\1\57\1\60\1\21\1\63\14\uffff\1\65"+
        "\1\uffff\1\67\1\71\1\uffff\1\21\1\73\12\21\3\uffff\2\21\7\uffff"+
        "\1\111\1\uffff\6\21\1\120\2\21\1\123\2\21\1\127\1\uffff\1\130\1"+
        "\131\2\21\1\134\1\21\1\uffff\1\21\1\140\1\uffff\1\141\1\21\1\143"+
        "\3\uffff\2\21\1\uffff\3\21\2\uffff\1\21\1\uffff\1\21\1\153\3\21"+
        "\1\157\1\21\1\uffff\1\161\1\21\1\163\1\uffff\1\164\1\uffff\1\165"+
        "\3\uffff";
    static final String DFA3_eofS =
        "\166\uffff";
    static final String DFA3_minS =
        "\1\11\2\uffff\1\157\1\uffff\1\146\1\150\1\145\1\162\2\141\1\157"+
        "\3\60\1\143\1\60\14\uffff\1\75\1\uffff\2\75\1\uffff\1\162\1\60\1"+
        "\145\1\155\1\157\1\141\1\164\1\144\1\151\1\155\1\154\1\157\3\uffff"+
        "\1\164\1\147\7\uffff\1\60\1\uffff\1\156\1\163\1\145\1\153\1\146"+
        "\1\145\1\60\1\164\1\145\1\60\1\164\1\151\1\60\1\uffff\2\60\1\162"+
        "\1\165\1\60\1\162\1\uffff\1\145\1\60\1\uffff\1\60\1\157\1\60\3\uffff"+
        "\1\157\1\160\1\uffff\1\141\1\162\1\141\2\uffff\1\156\1\uffff\1\154"+
        "\1\60\1\154\1\151\1\154\1\60\1\154\1\uffff\1\60\1\141\1\60\1\uffff"+
        "\1\60\1\uffff\1\60\3\uffff";
    static final String DFA3_maxS =
        "\1\175\2\uffff\1\157\1\uffff\1\146\1\151\1\157\1\164\2\141\1\157"+
        "\3\172\1\162\1\172\14\uffff\1\75\1\uffff\2\75\1\uffff\1\162\1\172"+
        "\1\151\1\155\1\157\1\141\1\164\1\144\1\151\1\155\1\154\1\157\3\uffff"+
        "\1\164\1\147\7\uffff\1\172\1\uffff\1\156\1\163\1\145\1\153\1\146"+
        "\1\145\1\172\1\164\1\145\1\172\1\164\1\151\1\172\1\uffff\2\172\1"+
        "\162\1\165\1\172\1\162\1\uffff\1\145\1\172\1\uffff\1\172\1\157\1"+
        "\172\3\uffff\1\157\1\160\1\uffff\1\141\1\162\1\141\2\uffff\1\156"+
        "\1\uffff\1\154\1\172\1\154\1\151\1\154\1\172\1\154\1\uffff\1\172"+
        "\1\141\1\172\1\uffff\1\172\1\uffff\1\172\3\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\14\uffff\1\31\1\32\1\33\1\34\1\35\1"+
        "\36\1\37\1\40\1\41\1\42\1\43\1\44\1\uffff\1\47\2\uffff\1\54\14\uffff"+
        "\1\22\1\23\1\24\2\uffff\1\30\1\46\1\45\1\52\1\50\1\53\1\51\1\uffff"+
        "\1\5\15\uffff\1\3\6\uffff\1\11\2\uffff\1\15\3\uffff\1\27\1\6\1\10"+
        "\2\uffff\1\16\3\uffff\1\14\1\21\1\uffff\1\26\7\uffff\1\7\3\uffff"+
        "\1\25\1\uffff\1\20\1\uffff\1\13\1\17\1\12";
    static final String DFA3_specialS =
        "\166\uffff}>";
    static final String[] DFA3_transitionS = {
            "\2\41\2\uffff\1\41\22\uffff\1\41\1\36\4\uffff\1\25\1\4\1\33"+
            "\1\34\1\31\1\27\1\24\1\30\1\22\1\32\12\20\1\21\1\23\1\37\1\35"+
            "\1\40\1\uffff\33\21\4\uffff\1\21\1\uffff\1\17\1\21\1\10\2\21"+
            "\1\3\1\21\1\16\1\5\2\21\1\7\1\15\1\11\3\21\1\13\1\14\1\6\1\21"+
            "\1\12\4\21\1\1\1\26\1\2",
            "",
            "",
            "\1\42",
            "",
            "\1\43",
            "\1\44\1\45",
            "\1\47\3\uffff\1\50\5\uffff\1\46",
            "\1\52\1\uffff\1\51",
            "\1\53",
            "\1\54",
            "\1\55",
            "\13\21\5\uffff\33\21\4\uffff\1\21\1\uffff\32\21",
            "\13\21\5\uffff\33\21\4\uffff\1\21\1\uffff\32\21",
            "\13\21\5\uffff\33\21\4\uffff\1\21\1\uffff\32\21",
            "\1\61\16\uffff\1\62",
            "\12\20\1\21\5\uffff\33\21\4\uffff\1\21\1\uffff\32\21",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\64",
            "",
            "\1\66",
            "\1\70",
            "",
            "\1\72",
            "\13\21\5\uffff\33\21\4\uffff\1\21\1\uffff\32\21",
            "\1\74\3\uffff\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "",
            "",
            "",
            "\1\107",
            "\1\110",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\13\21\5\uffff\33\21\4\uffff\1\21\1\uffff\32\21",
            "",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\13\21\5\uffff\33\21\4\uffff\1\21\1\uffff\32\21",
            "\1\121",
            "\1\122",
            "\13\21\5\uffff\33\21\4\uffff\1\21\1\uffff\32\21",
            "\1\124",
            "\1\125",
            "\13\21\5\uffff\33\21\4\uffff\1\21\1\uffff\22\21\1\126\7\21",
            "",
            "\13\21\5\uffff\33\21\4\uffff\1\21\1\uffff\32\21",
            "\13\21\5\uffff\33\21\4\uffff\1\21\1\uffff\32\21",
            "\1\132",
            "\1\133",
            "\13\21\5\uffff\33\21\4\uffff\1\21\1\uffff\32\21",
            "\1\135",
            "",
            "\1\136",
            "\13\21\5\uffff\33\21\4\uffff\1\21\1\uffff\25\21\1\137\4\21",
            "",
            "\13\21\5\uffff\33\21\4\uffff\1\21\1\uffff\32\21",
            "\1\142",
            "\13\21\5\uffff\33\21\4\uffff\1\21\1\uffff\32\21",
            "",
            "",
            "",
            "\1\144",
            "\1\145",
            "",
            "\1\146",
            "\1\147",
            "\1\150",
            "",
            "",
            "\1\151",
            "",
            "\1\152",
            "\13\21\5\uffff\33\21\4\uffff\1\21\1\uffff\32\21",
            "\1\154",
            "\1\155",
            "\1\156",
            "\13\21\5\uffff\33\21\4\uffff\1\21\1\uffff\32\21",
            "\1\160",
            "",
            "\13\21\5\uffff\33\21\4\uffff\1\21\1\uffff\32\21",
            "\1\162",
            "\13\21\5\uffff\33\21\4\uffff\1\21\1\uffff\32\21",
            "",
            "\13\21\5\uffff\33\21\4\uffff\1\21\1\uffff\32\21",
            "",
            "\13\21\5\uffff\33\21\4\uffff\1\21\1\uffff\32\21",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__44 | T__45 | T__46 | T__47 | IF | THEN | LOOKUP | THIS | CTD | CRITERIA | NAMEVAL | NAME | VAL | LEAF | TIMEROLL | LITERAL | ROOT | SEC | MIN | HR | ACTION | ARGS | ARG | INT | ID | DOT | SEMI | COMMA | AND | OR | PLUS | MINUS | STAR | SLASH | LPAREN | RPAREN | EQL | EQ | BANGEQ | LT | GT | LTEQ | GTEQ | WS );";
        }
    }
 

}