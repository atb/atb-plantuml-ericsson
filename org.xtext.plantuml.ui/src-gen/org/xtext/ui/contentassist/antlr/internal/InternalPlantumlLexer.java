package org.xtext.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPlantumlLexer extends Lexer {
    public static final int RULE_SL_COMMENT=5;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int RULE_ID=6;
    public static final int RULE_WS=8;
    public static final int RULE_ANY_OTHER=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=4;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalPlantumlLexer() {;} 
    public InternalPlantumlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPlantumlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g"; }

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:11:7: ( '.' )
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:11:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:12:7: ( '@startuml' )
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:12:9: '@startuml'
            {
            match("@startuml"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:13:7: ( '@enduml' )
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:13:9: '@enduml'
            {
            match("@enduml"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:14:7: ( ':' )
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:14:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:15:7: ( '-' )
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:15:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:16:7: ( '>' )
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:16:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:17:7: ( '<' )
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:17:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:18:7: ( 'x' )
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:18:9: 'x'
            {
            match('x'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:19:7: ( '\\\\' )
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:19:9: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:20:7: ( '/' )
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:20:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:21:7: ( '\\\\\\\\' )
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:21:9: '\\\\\\\\'
            {
            match("\\\\"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:22:7: ( 'o' )
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:22:9: 'o'
            {
            match('o'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:23:7: ( '|' )
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:23:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:24:7: ( 'actor' )
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:24:9: 'actor'
            {
            match("actor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:25:7: ( 'boundary' )
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:25:9: 'boundary'
            {
            match("boundary"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:26:7: ( 'control' )
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:26:9: 'control'
            {
            match("control"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:27:7: ( 'entity' )
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:27:9: 'entity'
            {
            match("entity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:28:7: ( 'database' )
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:28:9: 'database'
            {
            match("database"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:29:7: ( 'autonumber' )
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:29:9: 'autonumber'
            {
            match("autonumber"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:3728:17: ( '/\\'' ( options {greedy=false; } : . )* '\\'/' )
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:3728:19: '/\\'' ( options {greedy=false; } : . )* '\\'/'
            {
            match("/'"); 

            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:3728:25: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\'') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='/') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='.')||(LA1_1>='0' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='&')||(LA1_0>='(' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:3728:53: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match("'/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:3730:17: ( '\\'' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:3730:19: '\\'' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('\''); 
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:3730:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:3730:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:3730:40: ( ( '\\r' )? '\\n' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\n'||LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:3730:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:3730:41: ( '\\r' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='\r') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:3730:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:3732:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:3732:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:3732:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:3732:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:3732:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:3734:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:3734:12: ( '0' .. '9' )+
            {
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:3734:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:3734:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:3736:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:3736:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:3736:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\t' && LA8_0<='\n')||LA8_0=='\r'||LA8_0==' ') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:3738:16: ( . )
            // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:3738:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_WS | RULE_ANY_OTHER )
        int alt9=25;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:1:10: T__10
                {
                mT__10(); 

                }
                break;
            case 2 :
                // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:1:16: T__11
                {
                mT__11(); 

                }
                break;
            case 3 :
                // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:1:22: T__12
                {
                mT__12(); 

                }
                break;
            case 4 :
                // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:1:28: T__13
                {
                mT__13(); 

                }
                break;
            case 5 :
                // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:1:34: T__14
                {
                mT__14(); 

                }
                break;
            case 6 :
                // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:1:40: T__15
                {
                mT__15(); 

                }
                break;
            case 7 :
                // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:1:46: T__16
                {
                mT__16(); 

                }
                break;
            case 8 :
                // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:1:52: T__17
                {
                mT__17(); 

                }
                break;
            case 9 :
                // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:1:58: T__18
                {
                mT__18(); 

                }
                break;
            case 10 :
                // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:1:64: T__19
                {
                mT__19(); 

                }
                break;
            case 11 :
                // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:1:70: T__20
                {
                mT__20(); 

                }
                break;
            case 12 :
                // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:1:76: T__21
                {
                mT__21(); 

                }
                break;
            case 13 :
                // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:1:82: T__22
                {
                mT__22(); 

                }
                break;
            case 14 :
                // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:1:88: T__23
                {
                mT__23(); 

                }
                break;
            case 15 :
                // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:1:94: T__24
                {
                mT__24(); 

                }
                break;
            case 16 :
                // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:1:100: T__25
                {
                mT__25(); 

                }
                break;
            case 17 :
                // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:1:106: T__26
                {
                mT__26(); 

                }
                break;
            case 18 :
                // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:1:112: T__27
                {
                mT__27(); 

                }
                break;
            case 19 :
                // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:1:118: T__28
                {
                mT__28(); 

                }
                break;
            case 20 :
                // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:1:124: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 21 :
                // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:1:140: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 22 :
                // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:1:156: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 23 :
                // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:1:164: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 24 :
                // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:1:173: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 25 :
                // ../org.xtext.plantuml.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalPlantuml.g:1:181: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\2\uffff\1\26\4\uffff\1\36\1\41\1\43\1\44\1\uffff\5\37\1\uffff"+
        "\1\26\23\uffff\6\37\3\uffff\14\37\1\101\5\37\1\uffff\3\37\1\112"+
        "\3\37\1\116\1\uffff\2\37\1\121\1\uffff\1\122\1\37\2\uffff\1\124"+
        "\1\uffff";
    static final String DFA9_eofS =
        "\125\uffff";
    static final String DFA9_minS =
        "\1\0\1\uffff\1\145\4\uffff\1\60\1\134\1\47\1\60\1\uffff\1\143\2"+
        "\157\1\156\1\141\1\uffff\1\101\23\uffff\2\164\1\165\1\156\2\164"+
        "\3\uffff\2\157\1\156\1\164\1\151\1\141\1\162\1\156\1\144\1\162\1"+
        "\164\1\142\1\60\1\165\1\141\1\157\1\171\1\141\1\uffff\1\155\1\162"+
        "\1\154\1\60\1\163\1\142\1\171\1\60\1\uffff\2\145\1\60\1\uffff\1"+
        "\60\1\162\2\uffff\1\60\1\uffff";
    static final String DFA9_maxS =
        "\1\uffff\1\uffff\1\163\4\uffff\1\172\1\134\1\47\1\172\1\uffff\1"+
        "\165\2\157\1\156\1\141\1\uffff\1\172\23\uffff\2\164\1\165\1\156"+
        "\2\164\3\uffff\2\157\1\156\1\164\1\151\1\141\1\162\1\156\1\144\1"+
        "\162\1\164\1\142\1\172\1\165\1\141\1\157\1\171\1\141\1\uffff\1\155"+
        "\1\162\1\154\1\172\1\163\1\142\1\171\1\172\1\uffff\2\145\1\172\1"+
        "\uffff\1\172\1\162\2\uffff\1\172\1\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\1\5\1\6\1\7\4\uffff\1\15\5\uffff\1\25"+
        "\1\uffff\1\26\1\27\1\30\1\31\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1"+
        "\26\1\13\1\11\1\24\1\12\1\14\1\15\6\uffff\1\25\1\27\1\30\22\uffff"+
        "\1\16\10\uffff\1\21\3\uffff\1\20\2\uffff\1\17\1\22\1\uffff\1\23";
    static final String DFA9_specialS =
        "\1\0\124\uffff}>";
    static final String[] DFA9_transitionS = {
            "\11\26\2\25\2\26\1\25\22\26\1\25\6\26\1\21\5\26\1\4\1\1\1\11"+
            "\12\24\1\3\1\26\1\6\1\26\1\5\1\26\1\2\32\23\1\26\1\10\1\26\1"+
            "\22\1\23\1\26\1\14\1\15\1\16\1\20\1\17\11\23\1\12\10\23\1\7"+
            "\2\23\1\26\1\13\uff83\26",
            "",
            "\1\31\15\uffff\1\30",
            "",
            "",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\40",
            "\1\42",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\46\21\uffff\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "",
            "\32\37\4\uffff\1\37\1\uffff\32\37",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "",
            "",
            "",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "",
            "\1\107",
            "\1\110",
            "\1\111",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\113",
            "\1\114",
            "\1\115",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\117",
            "\1\120",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\123",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            ""
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
            return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_0 = input.LA(1);

                        s = -1;
                        if ( (LA9_0=='.') ) {s = 1;}

                        else if ( (LA9_0=='@') ) {s = 2;}

                        else if ( (LA9_0==':') ) {s = 3;}

                        else if ( (LA9_0=='-') ) {s = 4;}

                        else if ( (LA9_0=='>') ) {s = 5;}

                        else if ( (LA9_0=='<') ) {s = 6;}

                        else if ( (LA9_0=='x') ) {s = 7;}

                        else if ( (LA9_0=='\\') ) {s = 8;}

                        else if ( (LA9_0=='/') ) {s = 9;}

                        else if ( (LA9_0=='o') ) {s = 10;}

                        else if ( (LA9_0=='|') ) {s = 11;}

                        else if ( (LA9_0=='a') ) {s = 12;}

                        else if ( (LA9_0=='b') ) {s = 13;}

                        else if ( (LA9_0=='c') ) {s = 14;}

                        else if ( (LA9_0=='e') ) {s = 15;}

                        else if ( (LA9_0=='d') ) {s = 16;}

                        else if ( (LA9_0=='\'') ) {s = 17;}

                        else if ( (LA9_0=='^') ) {s = 18;}

                        else if ( ((LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='f' && LA9_0<='n')||(LA9_0>='p' && LA9_0<='w')||(LA9_0>='y' && LA9_0<='z')) ) {s = 19;}

                        else if ( ((LA9_0>='0' && LA9_0<='9')) ) {s = 20;}

                        else if ( ((LA9_0>='\t' && LA9_0<='\n')||LA9_0=='\r'||LA9_0==' ') ) {s = 21;}

                        else if ( ((LA9_0>='\u0000' && LA9_0<='\b')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\u001F')||(LA9_0>='!' && LA9_0<='&')||(LA9_0>='(' && LA9_0<=',')||LA9_0==';'||LA9_0=='='||LA9_0=='?'||LA9_0=='['||LA9_0==']'||LA9_0=='`'||LA9_0=='{'||(LA9_0>='}' && LA9_0<='\uFFFF')) ) {s = 22;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}