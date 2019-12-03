package hu.bme.mit.temalab.railmap.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import hu.bme.mit.temalab.railmap.services.RailLinesMapGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRailLinesMapParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'top'", "'straight'", "'divergent'", "'standard gauge'", "'narrow gauge'", "'broad gauge'", "'rail-map'", "'station'", "';'", "'with'", "'tracks'", "'connection'", "'from'", "'to'", "'in'", "'segments'", "'turnout'", "'track'", "'.'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRailLinesMapParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRailLinesMapParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRailLinesMapParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRailLinesMap.g"; }


    	private RailLinesMapGrammarAccess grammarAccess;

    	public void setGrammarAccess(RailLinesMapGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleRailLineMap"
    // InternalRailLinesMap.g:53:1: entryRuleRailLineMap : ruleRailLineMap EOF ;
    public final void entryRuleRailLineMap() throws RecognitionException {
        try {
            // InternalRailLinesMap.g:54:1: ( ruleRailLineMap EOF )
            // InternalRailLinesMap.g:55:1: ruleRailLineMap EOF
            {
             before(grammarAccess.getRailLineMapRule()); 
            pushFollow(FOLLOW_1);
            ruleRailLineMap();

            state._fsp--;

             after(grammarAccess.getRailLineMapRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRailLineMap"


    // $ANTLR start "ruleRailLineMap"
    // InternalRailLinesMap.g:62:1: ruleRailLineMap : ( ( rule__RailLineMap__Group__0 ) ) ;
    public final void ruleRailLineMap() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:66:2: ( ( ( rule__RailLineMap__Group__0 ) ) )
            // InternalRailLinesMap.g:67:2: ( ( rule__RailLineMap__Group__0 ) )
            {
            // InternalRailLinesMap.g:67:2: ( ( rule__RailLineMap__Group__0 ) )
            // InternalRailLinesMap.g:68:3: ( rule__RailLineMap__Group__0 )
            {
             before(grammarAccess.getRailLineMapAccess().getGroup()); 
            // InternalRailLinesMap.g:69:3: ( rule__RailLineMap__Group__0 )
            // InternalRailLinesMap.g:69:4: rule__RailLineMap__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RailLineMap__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRailLineMapAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRailLineMap"


    // $ANTLR start "entryRuleStation"
    // InternalRailLinesMap.g:78:1: entryRuleStation : ruleStation EOF ;
    public final void entryRuleStation() throws RecognitionException {
        try {
            // InternalRailLinesMap.g:79:1: ( ruleStation EOF )
            // InternalRailLinesMap.g:80:1: ruleStation EOF
            {
             before(grammarAccess.getStationRule()); 
            pushFollow(FOLLOW_1);
            ruleStation();

            state._fsp--;

             after(grammarAccess.getStationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStation"


    // $ANTLR start "ruleStation"
    // InternalRailLinesMap.g:87:1: ruleStation : ( ( rule__Station__Group__0 ) ) ;
    public final void ruleStation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:91:2: ( ( ( rule__Station__Group__0 ) ) )
            // InternalRailLinesMap.g:92:2: ( ( rule__Station__Group__0 ) )
            {
            // InternalRailLinesMap.g:92:2: ( ( rule__Station__Group__0 ) )
            // InternalRailLinesMap.g:93:3: ( rule__Station__Group__0 )
            {
             before(grammarAccess.getStationAccess().getGroup()); 
            // InternalRailLinesMap.g:94:3: ( rule__Station__Group__0 )
            // InternalRailLinesMap.g:94:4: rule__Station__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Station__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStation"


    // $ANTLR start "entryRuleConnection"
    // InternalRailLinesMap.g:103:1: entryRuleConnection : ruleConnection EOF ;
    public final void entryRuleConnection() throws RecognitionException {
        try {
            // InternalRailLinesMap.g:104:1: ( ruleConnection EOF )
            // InternalRailLinesMap.g:105:1: ruleConnection EOF
            {
             before(grammarAccess.getConnectionRule()); 
            pushFollow(FOLLOW_1);
            ruleConnection();

            state._fsp--;

             after(grammarAccess.getConnectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConnection"


    // $ANTLR start "ruleConnection"
    // InternalRailLinesMap.g:112:1: ruleConnection : ( ( rule__Connection__Group__0 ) ) ;
    public final void ruleConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:116:2: ( ( ( rule__Connection__Group__0 ) ) )
            // InternalRailLinesMap.g:117:2: ( ( rule__Connection__Group__0 ) )
            {
            // InternalRailLinesMap.g:117:2: ( ( rule__Connection__Group__0 ) )
            // InternalRailLinesMap.g:118:3: ( rule__Connection__Group__0 )
            {
             before(grammarAccess.getConnectionAccess().getGroup()); 
            // InternalRailLinesMap.g:119:3: ( rule__Connection__Group__0 )
            // InternalRailLinesMap.g:119:4: rule__Connection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Connection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnection"


    // $ANTLR start "entryRuleTurnout"
    // InternalRailLinesMap.g:128:1: entryRuleTurnout : ruleTurnout EOF ;
    public final void entryRuleTurnout() throws RecognitionException {
        try {
            // InternalRailLinesMap.g:129:1: ( ruleTurnout EOF )
            // InternalRailLinesMap.g:130:1: ruleTurnout EOF
            {
             before(grammarAccess.getTurnoutRule()); 
            pushFollow(FOLLOW_1);
            ruleTurnout();

            state._fsp--;

             after(grammarAccess.getTurnoutRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTurnout"


    // $ANTLR start "ruleTurnout"
    // InternalRailLinesMap.g:137:1: ruleTurnout : ( ( rule__Turnout__Group__0 ) ) ;
    public final void ruleTurnout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:141:2: ( ( ( rule__Turnout__Group__0 ) ) )
            // InternalRailLinesMap.g:142:2: ( ( rule__Turnout__Group__0 ) )
            {
            // InternalRailLinesMap.g:142:2: ( ( rule__Turnout__Group__0 ) )
            // InternalRailLinesMap.g:143:3: ( rule__Turnout__Group__0 )
            {
             before(grammarAccess.getTurnoutAccess().getGroup()); 
            // InternalRailLinesMap.g:144:3: ( rule__Turnout__Group__0 )
            // InternalRailLinesMap.g:144:4: rule__Turnout__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Turnout__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTurnoutAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTurnout"


    // $ANTLR start "entryRuleLocation"
    // InternalRailLinesMap.g:153:1: entryRuleLocation : ruleLocation EOF ;
    public final void entryRuleLocation() throws RecognitionException {
        try {
            // InternalRailLinesMap.g:154:1: ( ruleLocation EOF )
            // InternalRailLinesMap.g:155:1: ruleLocation EOF
            {
             before(grammarAccess.getLocationRule()); 
            pushFollow(FOLLOW_1);
            ruleLocation();

            state._fsp--;

             after(grammarAccess.getLocationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLocation"


    // $ANTLR start "ruleLocation"
    // InternalRailLinesMap.g:162:1: ruleLocation : ( ( rule__Location__Alternatives ) ) ;
    public final void ruleLocation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:166:2: ( ( ( rule__Location__Alternatives ) ) )
            // InternalRailLinesMap.g:167:2: ( ( rule__Location__Alternatives ) )
            {
            // InternalRailLinesMap.g:167:2: ( ( rule__Location__Alternatives ) )
            // InternalRailLinesMap.g:168:3: ( rule__Location__Alternatives )
            {
             before(grammarAccess.getLocationAccess().getAlternatives()); 
            // InternalRailLinesMap.g:169:3: ( rule__Location__Alternatives )
            // InternalRailLinesMap.g:169:4: rule__Location__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Location__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocation"


    // $ANTLR start "entryRuleStationTrackLocation"
    // InternalRailLinesMap.g:178:1: entryRuleStationTrackLocation : ruleStationTrackLocation EOF ;
    public final void entryRuleStationTrackLocation() throws RecognitionException {
        try {
            // InternalRailLinesMap.g:179:1: ( ruleStationTrackLocation EOF )
            // InternalRailLinesMap.g:180:1: ruleStationTrackLocation EOF
            {
             before(grammarAccess.getStationTrackLocationRule()); 
            pushFollow(FOLLOW_1);
            ruleStationTrackLocation();

            state._fsp--;

             after(grammarAccess.getStationTrackLocationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStationTrackLocation"


    // $ANTLR start "ruleStationTrackLocation"
    // InternalRailLinesMap.g:187:1: ruleStationTrackLocation : ( ( rule__StationTrackLocation__Group__0 ) ) ;
    public final void ruleStationTrackLocation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:191:2: ( ( ( rule__StationTrackLocation__Group__0 ) ) )
            // InternalRailLinesMap.g:192:2: ( ( rule__StationTrackLocation__Group__0 ) )
            {
            // InternalRailLinesMap.g:192:2: ( ( rule__StationTrackLocation__Group__0 ) )
            // InternalRailLinesMap.g:193:3: ( rule__StationTrackLocation__Group__0 )
            {
             before(grammarAccess.getStationTrackLocationAccess().getGroup()); 
            // InternalRailLinesMap.g:194:3: ( rule__StationTrackLocation__Group__0 )
            // InternalRailLinesMap.g:194:4: rule__StationTrackLocation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StationTrackLocation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStationTrackLocationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStationTrackLocation"


    // $ANTLR start "entryRuleTurnoutEndLocation"
    // InternalRailLinesMap.g:203:1: entryRuleTurnoutEndLocation : ruleTurnoutEndLocation EOF ;
    public final void entryRuleTurnoutEndLocation() throws RecognitionException {
        try {
            // InternalRailLinesMap.g:204:1: ( ruleTurnoutEndLocation EOF )
            // InternalRailLinesMap.g:205:1: ruleTurnoutEndLocation EOF
            {
             before(grammarAccess.getTurnoutEndLocationRule()); 
            pushFollow(FOLLOW_1);
            ruleTurnoutEndLocation();

            state._fsp--;

             after(grammarAccess.getTurnoutEndLocationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTurnoutEndLocation"


    // $ANTLR start "ruleTurnoutEndLocation"
    // InternalRailLinesMap.g:212:1: ruleTurnoutEndLocation : ( ( rule__TurnoutEndLocation__Group__0 ) ) ;
    public final void ruleTurnoutEndLocation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:216:2: ( ( ( rule__TurnoutEndLocation__Group__0 ) ) )
            // InternalRailLinesMap.g:217:2: ( ( rule__TurnoutEndLocation__Group__0 ) )
            {
            // InternalRailLinesMap.g:217:2: ( ( rule__TurnoutEndLocation__Group__0 ) )
            // InternalRailLinesMap.g:218:3: ( rule__TurnoutEndLocation__Group__0 )
            {
             before(grammarAccess.getTurnoutEndLocationAccess().getGroup()); 
            // InternalRailLinesMap.g:219:3: ( rule__TurnoutEndLocation__Group__0 )
            // InternalRailLinesMap.g:219:4: rule__TurnoutEndLocation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TurnoutEndLocation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTurnoutEndLocationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTurnoutEndLocation"


    // $ANTLR start "ruleTurnoutEnd"
    // InternalRailLinesMap.g:228:1: ruleTurnoutEnd : ( ( rule__TurnoutEnd__Alternatives ) ) ;
    public final void ruleTurnoutEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:232:1: ( ( ( rule__TurnoutEnd__Alternatives ) ) )
            // InternalRailLinesMap.g:233:2: ( ( rule__TurnoutEnd__Alternatives ) )
            {
            // InternalRailLinesMap.g:233:2: ( ( rule__TurnoutEnd__Alternatives ) )
            // InternalRailLinesMap.g:234:3: ( rule__TurnoutEnd__Alternatives )
            {
             before(grammarAccess.getTurnoutEndAccess().getAlternatives()); 
            // InternalRailLinesMap.g:235:3: ( rule__TurnoutEnd__Alternatives )
            // InternalRailLinesMap.g:235:4: rule__TurnoutEnd__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TurnoutEnd__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTurnoutEndAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTurnoutEnd"


    // $ANTLR start "ruleGauge"
    // InternalRailLinesMap.g:244:1: ruleGauge : ( ( rule__Gauge__Alternatives ) ) ;
    public final void ruleGauge() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:248:1: ( ( ( rule__Gauge__Alternatives ) ) )
            // InternalRailLinesMap.g:249:2: ( ( rule__Gauge__Alternatives ) )
            {
            // InternalRailLinesMap.g:249:2: ( ( rule__Gauge__Alternatives ) )
            // InternalRailLinesMap.g:250:3: ( rule__Gauge__Alternatives )
            {
             before(grammarAccess.getGaugeAccess().getAlternatives()); 
            // InternalRailLinesMap.g:251:3: ( rule__Gauge__Alternatives )
            // InternalRailLinesMap.g:251:4: rule__Gauge__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Gauge__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGaugeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGauge"


    // $ANTLR start "rule__RailLineMap__Alternatives_2"
    // InternalRailLinesMap.g:259:1: rule__RailLineMap__Alternatives_2 : ( ( ( rule__RailLineMap__StationsAssignment_2_0 ) ) | ( ( rule__RailLineMap__TurnoutsAssignment_2_1 ) ) | ( ( rule__RailLineMap__ConnectionsAssignment_2_2 ) ) );
    public final void rule__RailLineMap__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:263:1: ( ( ( rule__RailLineMap__StationsAssignment_2_0 ) ) | ( ( rule__RailLineMap__TurnoutsAssignment_2_1 ) ) | ( ( rule__RailLineMap__ConnectionsAssignment_2_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt1=1;
                }
                break;
            case 27:
                {
                alt1=2;
                }
                break;
            case 22:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalRailLinesMap.g:264:2: ( ( rule__RailLineMap__StationsAssignment_2_0 ) )
                    {
                    // InternalRailLinesMap.g:264:2: ( ( rule__RailLineMap__StationsAssignment_2_0 ) )
                    // InternalRailLinesMap.g:265:3: ( rule__RailLineMap__StationsAssignment_2_0 )
                    {
                     before(grammarAccess.getRailLineMapAccess().getStationsAssignment_2_0()); 
                    // InternalRailLinesMap.g:266:3: ( rule__RailLineMap__StationsAssignment_2_0 )
                    // InternalRailLinesMap.g:266:4: rule__RailLineMap__StationsAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RailLineMap__StationsAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRailLineMapAccess().getStationsAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailLinesMap.g:270:2: ( ( rule__RailLineMap__TurnoutsAssignment_2_1 ) )
                    {
                    // InternalRailLinesMap.g:270:2: ( ( rule__RailLineMap__TurnoutsAssignment_2_1 ) )
                    // InternalRailLinesMap.g:271:3: ( rule__RailLineMap__TurnoutsAssignment_2_1 )
                    {
                     before(grammarAccess.getRailLineMapAccess().getTurnoutsAssignment_2_1()); 
                    // InternalRailLinesMap.g:272:3: ( rule__RailLineMap__TurnoutsAssignment_2_1 )
                    // InternalRailLinesMap.g:272:4: rule__RailLineMap__TurnoutsAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RailLineMap__TurnoutsAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRailLineMapAccess().getTurnoutsAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRailLinesMap.g:276:2: ( ( rule__RailLineMap__ConnectionsAssignment_2_2 ) )
                    {
                    // InternalRailLinesMap.g:276:2: ( ( rule__RailLineMap__ConnectionsAssignment_2_2 ) )
                    // InternalRailLinesMap.g:277:3: ( rule__RailLineMap__ConnectionsAssignment_2_2 )
                    {
                     before(grammarAccess.getRailLineMapAccess().getConnectionsAssignment_2_2()); 
                    // InternalRailLinesMap.g:278:3: ( rule__RailLineMap__ConnectionsAssignment_2_2 )
                    // InternalRailLinesMap.g:278:4: rule__RailLineMap__ConnectionsAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__RailLineMap__ConnectionsAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getRailLineMapAccess().getConnectionsAssignment_2_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RailLineMap__Alternatives_2"


    // $ANTLR start "rule__Location__Alternatives"
    // InternalRailLinesMap.g:286:1: rule__Location__Alternatives : ( ( ruleStationTrackLocation ) | ( ruleTurnoutEndLocation ) );
    public final void rule__Location__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:290:1: ( ( ruleStationTrackLocation ) | ( ruleTurnoutEndLocation ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==29) ) {
                    alt2=2;
                }
                else if ( (LA2_1==28) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalRailLinesMap.g:291:2: ( ruleStationTrackLocation )
                    {
                    // InternalRailLinesMap.g:291:2: ( ruleStationTrackLocation )
                    // InternalRailLinesMap.g:292:3: ruleStationTrackLocation
                    {
                     before(grammarAccess.getLocationAccess().getStationTrackLocationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStationTrackLocation();

                    state._fsp--;

                     after(grammarAccess.getLocationAccess().getStationTrackLocationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailLinesMap.g:297:2: ( ruleTurnoutEndLocation )
                    {
                    // InternalRailLinesMap.g:297:2: ( ruleTurnoutEndLocation )
                    // InternalRailLinesMap.g:298:3: ruleTurnoutEndLocation
                    {
                     before(grammarAccess.getLocationAccess().getTurnoutEndLocationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTurnoutEndLocation();

                    state._fsp--;

                     after(grammarAccess.getLocationAccess().getTurnoutEndLocationParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Alternatives"


    // $ANTLR start "rule__TurnoutEnd__Alternatives"
    // InternalRailLinesMap.g:307:1: rule__TurnoutEnd__Alternatives : ( ( ( 'top' ) ) | ( ( 'straight' ) ) | ( ( 'divergent' ) ) );
    public final void rule__TurnoutEnd__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:311:1: ( ( ( 'top' ) ) | ( ( 'straight' ) ) | ( ( 'divergent' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalRailLinesMap.g:312:2: ( ( 'top' ) )
                    {
                    // InternalRailLinesMap.g:312:2: ( ( 'top' ) )
                    // InternalRailLinesMap.g:313:3: ( 'top' )
                    {
                     before(grammarAccess.getTurnoutEndAccess().getTOPEnumLiteralDeclaration_0()); 
                    // InternalRailLinesMap.g:314:3: ( 'top' )
                    // InternalRailLinesMap.g:314:4: 'top'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTurnoutEndAccess().getTOPEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailLinesMap.g:318:2: ( ( 'straight' ) )
                    {
                    // InternalRailLinesMap.g:318:2: ( ( 'straight' ) )
                    // InternalRailLinesMap.g:319:3: ( 'straight' )
                    {
                     before(grammarAccess.getTurnoutEndAccess().getSTRAIGHTEnumLiteralDeclaration_1()); 
                    // InternalRailLinesMap.g:320:3: ( 'straight' )
                    // InternalRailLinesMap.g:320:4: 'straight'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTurnoutEndAccess().getSTRAIGHTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRailLinesMap.g:324:2: ( ( 'divergent' ) )
                    {
                    // InternalRailLinesMap.g:324:2: ( ( 'divergent' ) )
                    // InternalRailLinesMap.g:325:3: ( 'divergent' )
                    {
                     before(grammarAccess.getTurnoutEndAccess().getDIVERGENTEnumLiteralDeclaration_2()); 
                    // InternalRailLinesMap.g:326:3: ( 'divergent' )
                    // InternalRailLinesMap.g:326:4: 'divergent'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTurnoutEndAccess().getDIVERGENTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnoutEnd__Alternatives"


    // $ANTLR start "rule__Gauge__Alternatives"
    // InternalRailLinesMap.g:334:1: rule__Gauge__Alternatives : ( ( ( 'standard gauge' ) ) | ( ( 'narrow gauge' ) ) | ( ( 'broad gauge' ) ) );
    public final void rule__Gauge__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:338:1: ( ( ( 'standard gauge' ) ) | ( ( 'narrow gauge' ) ) | ( ( 'broad gauge' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalRailLinesMap.g:339:2: ( ( 'standard gauge' ) )
                    {
                    // InternalRailLinesMap.g:339:2: ( ( 'standard gauge' ) )
                    // InternalRailLinesMap.g:340:3: ( 'standard gauge' )
                    {
                     before(grammarAccess.getGaugeAccess().getSTANDARDEnumLiteralDeclaration_0()); 
                    // InternalRailLinesMap.g:341:3: ( 'standard gauge' )
                    // InternalRailLinesMap.g:341:4: 'standard gauge'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getGaugeAccess().getSTANDARDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailLinesMap.g:345:2: ( ( 'narrow gauge' ) )
                    {
                    // InternalRailLinesMap.g:345:2: ( ( 'narrow gauge' ) )
                    // InternalRailLinesMap.g:346:3: ( 'narrow gauge' )
                    {
                     before(grammarAccess.getGaugeAccess().getNARROWEnumLiteralDeclaration_1()); 
                    // InternalRailLinesMap.g:347:3: ( 'narrow gauge' )
                    // InternalRailLinesMap.g:347:4: 'narrow gauge'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getGaugeAccess().getNARROWEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRailLinesMap.g:351:2: ( ( 'broad gauge' ) )
                    {
                    // InternalRailLinesMap.g:351:2: ( ( 'broad gauge' ) )
                    // InternalRailLinesMap.g:352:3: ( 'broad gauge' )
                    {
                     before(grammarAccess.getGaugeAccess().getBROADEnumLiteralDeclaration_2()); 
                    // InternalRailLinesMap.g:353:3: ( 'broad gauge' )
                    // InternalRailLinesMap.g:353:4: 'broad gauge'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getGaugeAccess().getBROADEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gauge__Alternatives"


    // $ANTLR start "rule__RailLineMap__Group__0"
    // InternalRailLinesMap.g:361:1: rule__RailLineMap__Group__0 : rule__RailLineMap__Group__0__Impl rule__RailLineMap__Group__1 ;
    public final void rule__RailLineMap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:365:1: ( rule__RailLineMap__Group__0__Impl rule__RailLineMap__Group__1 )
            // InternalRailLinesMap.g:366:2: rule__RailLineMap__Group__0__Impl rule__RailLineMap__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RailLineMap__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RailLineMap__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RailLineMap__Group__0"


    // $ANTLR start "rule__RailLineMap__Group__0__Impl"
    // InternalRailLinesMap.g:373:1: rule__RailLineMap__Group__0__Impl : ( 'rail-map' ) ;
    public final void rule__RailLineMap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:377:1: ( ( 'rail-map' ) )
            // InternalRailLinesMap.g:378:1: ( 'rail-map' )
            {
            // InternalRailLinesMap.g:378:1: ( 'rail-map' )
            // InternalRailLinesMap.g:379:2: 'rail-map'
            {
             before(grammarAccess.getRailLineMapAccess().getRailMapKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRailLineMapAccess().getRailMapKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RailLineMap__Group__0__Impl"


    // $ANTLR start "rule__RailLineMap__Group__1"
    // InternalRailLinesMap.g:388:1: rule__RailLineMap__Group__1 : rule__RailLineMap__Group__1__Impl rule__RailLineMap__Group__2 ;
    public final void rule__RailLineMap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:392:1: ( rule__RailLineMap__Group__1__Impl rule__RailLineMap__Group__2 )
            // InternalRailLinesMap.g:393:2: rule__RailLineMap__Group__1__Impl rule__RailLineMap__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RailLineMap__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RailLineMap__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RailLineMap__Group__1"


    // $ANTLR start "rule__RailLineMap__Group__1__Impl"
    // InternalRailLinesMap.g:400:1: rule__RailLineMap__Group__1__Impl : ( ( rule__RailLineMap__MapNameAssignment_1 ) ) ;
    public final void rule__RailLineMap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:404:1: ( ( ( rule__RailLineMap__MapNameAssignment_1 ) ) )
            // InternalRailLinesMap.g:405:1: ( ( rule__RailLineMap__MapNameAssignment_1 ) )
            {
            // InternalRailLinesMap.g:405:1: ( ( rule__RailLineMap__MapNameAssignment_1 ) )
            // InternalRailLinesMap.g:406:2: ( rule__RailLineMap__MapNameAssignment_1 )
            {
             before(grammarAccess.getRailLineMapAccess().getMapNameAssignment_1()); 
            // InternalRailLinesMap.g:407:2: ( rule__RailLineMap__MapNameAssignment_1 )
            // InternalRailLinesMap.g:407:3: rule__RailLineMap__MapNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RailLineMap__MapNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRailLineMapAccess().getMapNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RailLineMap__Group__1__Impl"


    // $ANTLR start "rule__RailLineMap__Group__2"
    // InternalRailLinesMap.g:415:1: rule__RailLineMap__Group__2 : rule__RailLineMap__Group__2__Impl ;
    public final void rule__RailLineMap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:419:1: ( rule__RailLineMap__Group__2__Impl )
            // InternalRailLinesMap.g:420:2: rule__RailLineMap__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RailLineMap__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RailLineMap__Group__2"


    // $ANTLR start "rule__RailLineMap__Group__2__Impl"
    // InternalRailLinesMap.g:426:1: rule__RailLineMap__Group__2__Impl : ( ( rule__RailLineMap__Alternatives_2 )* ) ;
    public final void rule__RailLineMap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:430:1: ( ( ( rule__RailLineMap__Alternatives_2 )* ) )
            // InternalRailLinesMap.g:431:1: ( ( rule__RailLineMap__Alternatives_2 )* )
            {
            // InternalRailLinesMap.g:431:1: ( ( rule__RailLineMap__Alternatives_2 )* )
            // InternalRailLinesMap.g:432:2: ( rule__RailLineMap__Alternatives_2 )*
            {
             before(grammarAccess.getRailLineMapAccess().getAlternatives_2()); 
            // InternalRailLinesMap.g:433:2: ( rule__RailLineMap__Alternatives_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18||LA5_0==22||LA5_0==27) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRailLinesMap.g:433:3: rule__RailLineMap__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__RailLineMap__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getRailLineMapAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RailLineMap__Group__2__Impl"


    // $ANTLR start "rule__Station__Group__0"
    // InternalRailLinesMap.g:442:1: rule__Station__Group__0 : rule__Station__Group__0__Impl rule__Station__Group__1 ;
    public final void rule__Station__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:446:1: ( rule__Station__Group__0__Impl rule__Station__Group__1 )
            // InternalRailLinesMap.g:447:2: rule__Station__Group__0__Impl rule__Station__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Station__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Station__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group__0"


    // $ANTLR start "rule__Station__Group__0__Impl"
    // InternalRailLinesMap.g:454:1: rule__Station__Group__0__Impl : ( 'station' ) ;
    public final void rule__Station__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:458:1: ( ( 'station' ) )
            // InternalRailLinesMap.g:459:1: ( 'station' )
            {
            // InternalRailLinesMap.g:459:1: ( 'station' )
            // InternalRailLinesMap.g:460:2: 'station'
            {
             before(grammarAccess.getStationAccess().getStationKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getStationAccess().getStationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group__0__Impl"


    // $ANTLR start "rule__Station__Group__1"
    // InternalRailLinesMap.g:469:1: rule__Station__Group__1 : rule__Station__Group__1__Impl rule__Station__Group__2 ;
    public final void rule__Station__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:473:1: ( rule__Station__Group__1__Impl rule__Station__Group__2 )
            // InternalRailLinesMap.g:474:2: rule__Station__Group__1__Impl rule__Station__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Station__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Station__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group__1"


    // $ANTLR start "rule__Station__Group__1__Impl"
    // InternalRailLinesMap.g:481:1: rule__Station__Group__1__Impl : ( ( rule__Station__NameAssignment_1 ) ) ;
    public final void rule__Station__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:485:1: ( ( ( rule__Station__NameAssignment_1 ) ) )
            // InternalRailLinesMap.g:486:1: ( ( rule__Station__NameAssignment_1 ) )
            {
            // InternalRailLinesMap.g:486:1: ( ( rule__Station__NameAssignment_1 ) )
            // InternalRailLinesMap.g:487:2: ( rule__Station__NameAssignment_1 )
            {
             before(grammarAccess.getStationAccess().getNameAssignment_1()); 
            // InternalRailLinesMap.g:488:2: ( rule__Station__NameAssignment_1 )
            // InternalRailLinesMap.g:488:3: rule__Station__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Station__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group__1__Impl"


    // $ANTLR start "rule__Station__Group__2"
    // InternalRailLinesMap.g:496:1: rule__Station__Group__2 : rule__Station__Group__2__Impl rule__Station__Group__3 ;
    public final void rule__Station__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:500:1: ( rule__Station__Group__2__Impl rule__Station__Group__3 )
            // InternalRailLinesMap.g:501:2: rule__Station__Group__2__Impl rule__Station__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Station__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Station__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group__2"


    // $ANTLR start "rule__Station__Group__2__Impl"
    // InternalRailLinesMap.g:508:1: rule__Station__Group__2__Impl : ( ( rule__Station__Group_2__0 )? ) ;
    public final void rule__Station__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:512:1: ( ( ( rule__Station__Group_2__0 )? ) )
            // InternalRailLinesMap.g:513:1: ( ( rule__Station__Group_2__0 )? )
            {
            // InternalRailLinesMap.g:513:1: ( ( rule__Station__Group_2__0 )? )
            // InternalRailLinesMap.g:514:2: ( rule__Station__Group_2__0 )?
            {
             before(grammarAccess.getStationAccess().getGroup_2()); 
            // InternalRailLinesMap.g:515:2: ( rule__Station__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRailLinesMap.g:515:3: rule__Station__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Station__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group__2__Impl"


    // $ANTLR start "rule__Station__Group__3"
    // InternalRailLinesMap.g:523:1: rule__Station__Group__3 : rule__Station__Group__3__Impl ;
    public final void rule__Station__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:527:1: ( rule__Station__Group__3__Impl )
            // InternalRailLinesMap.g:528:2: rule__Station__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Station__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group__3"


    // $ANTLR start "rule__Station__Group__3__Impl"
    // InternalRailLinesMap.g:534:1: rule__Station__Group__3__Impl : ( ';' ) ;
    public final void rule__Station__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:538:1: ( ( ';' ) )
            // InternalRailLinesMap.g:539:1: ( ';' )
            {
            // InternalRailLinesMap.g:539:1: ( ';' )
            // InternalRailLinesMap.g:540:2: ';'
            {
             before(grammarAccess.getStationAccess().getSemicolonKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getStationAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group__3__Impl"


    // $ANTLR start "rule__Station__Group_2__0"
    // InternalRailLinesMap.g:550:1: rule__Station__Group_2__0 : rule__Station__Group_2__0__Impl rule__Station__Group_2__1 ;
    public final void rule__Station__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:554:1: ( rule__Station__Group_2__0__Impl rule__Station__Group_2__1 )
            // InternalRailLinesMap.g:555:2: rule__Station__Group_2__0__Impl rule__Station__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Station__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Station__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_2__0"


    // $ANTLR start "rule__Station__Group_2__0__Impl"
    // InternalRailLinesMap.g:562:1: rule__Station__Group_2__0__Impl : ( 'with' ) ;
    public final void rule__Station__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:566:1: ( ( 'with' ) )
            // InternalRailLinesMap.g:567:1: ( 'with' )
            {
            // InternalRailLinesMap.g:567:1: ( 'with' )
            // InternalRailLinesMap.g:568:2: 'with'
            {
             before(grammarAccess.getStationAccess().getWithKeyword_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getStationAccess().getWithKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_2__0__Impl"


    // $ANTLR start "rule__Station__Group_2__1"
    // InternalRailLinesMap.g:577:1: rule__Station__Group_2__1 : rule__Station__Group_2__1__Impl rule__Station__Group_2__2 ;
    public final void rule__Station__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:581:1: ( rule__Station__Group_2__1__Impl rule__Station__Group_2__2 )
            // InternalRailLinesMap.g:582:2: rule__Station__Group_2__1__Impl rule__Station__Group_2__2
            {
            pushFollow(FOLLOW_9);
            rule__Station__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Station__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_2__1"


    // $ANTLR start "rule__Station__Group_2__1__Impl"
    // InternalRailLinesMap.g:589:1: rule__Station__Group_2__1__Impl : ( ( rule__Station__TracksAssignment_2_1 ) ) ;
    public final void rule__Station__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:593:1: ( ( ( rule__Station__TracksAssignment_2_1 ) ) )
            // InternalRailLinesMap.g:594:1: ( ( rule__Station__TracksAssignment_2_1 ) )
            {
            // InternalRailLinesMap.g:594:1: ( ( rule__Station__TracksAssignment_2_1 ) )
            // InternalRailLinesMap.g:595:2: ( rule__Station__TracksAssignment_2_1 )
            {
             before(grammarAccess.getStationAccess().getTracksAssignment_2_1()); 
            // InternalRailLinesMap.g:596:2: ( rule__Station__TracksAssignment_2_1 )
            // InternalRailLinesMap.g:596:3: rule__Station__TracksAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Station__TracksAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStationAccess().getTracksAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_2__1__Impl"


    // $ANTLR start "rule__Station__Group_2__2"
    // InternalRailLinesMap.g:604:1: rule__Station__Group_2__2 : rule__Station__Group_2__2__Impl ;
    public final void rule__Station__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:608:1: ( rule__Station__Group_2__2__Impl )
            // InternalRailLinesMap.g:609:2: rule__Station__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Station__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_2__2"


    // $ANTLR start "rule__Station__Group_2__2__Impl"
    // InternalRailLinesMap.g:615:1: rule__Station__Group_2__2__Impl : ( 'tracks' ) ;
    public final void rule__Station__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:619:1: ( ( 'tracks' ) )
            // InternalRailLinesMap.g:620:1: ( 'tracks' )
            {
            // InternalRailLinesMap.g:620:1: ( 'tracks' )
            // InternalRailLinesMap.g:621:2: 'tracks'
            {
             before(grammarAccess.getStationAccess().getTracksKeyword_2_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getStationAccess().getTracksKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_2__2__Impl"


    // $ANTLR start "rule__Connection__Group__0"
    // InternalRailLinesMap.g:631:1: rule__Connection__Group__0 : rule__Connection__Group__0__Impl rule__Connection__Group__1 ;
    public final void rule__Connection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:635:1: ( rule__Connection__Group__0__Impl rule__Connection__Group__1 )
            // InternalRailLinesMap.g:636:2: rule__Connection__Group__0__Impl rule__Connection__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Connection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__0"


    // $ANTLR start "rule__Connection__Group__0__Impl"
    // InternalRailLinesMap.g:643:1: rule__Connection__Group__0__Impl : ( 'connection' ) ;
    public final void rule__Connection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:647:1: ( ( 'connection' ) )
            // InternalRailLinesMap.g:648:1: ( 'connection' )
            {
            // InternalRailLinesMap.g:648:1: ( 'connection' )
            // InternalRailLinesMap.g:649:2: 'connection'
            {
             before(grammarAccess.getConnectionAccess().getConnectionKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getConnectionAccess().getConnectionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__0__Impl"


    // $ANTLR start "rule__Connection__Group__1"
    // InternalRailLinesMap.g:658:1: rule__Connection__Group__1 : rule__Connection__Group__1__Impl rule__Connection__Group__2 ;
    public final void rule__Connection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:662:1: ( rule__Connection__Group__1__Impl rule__Connection__Group__2 )
            // InternalRailLinesMap.g:663:2: rule__Connection__Group__1__Impl rule__Connection__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Connection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__1"


    // $ANTLR start "rule__Connection__Group__1__Impl"
    // InternalRailLinesMap.g:670:1: rule__Connection__Group__1__Impl : ( 'from' ) ;
    public final void rule__Connection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:674:1: ( ( 'from' ) )
            // InternalRailLinesMap.g:675:1: ( 'from' )
            {
            // InternalRailLinesMap.g:675:1: ( 'from' )
            // InternalRailLinesMap.g:676:2: 'from'
            {
             before(grammarAccess.getConnectionAccess().getFromKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getConnectionAccess().getFromKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__1__Impl"


    // $ANTLR start "rule__Connection__Group__2"
    // InternalRailLinesMap.g:685:1: rule__Connection__Group__2 : rule__Connection__Group__2__Impl rule__Connection__Group__3 ;
    public final void rule__Connection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:689:1: ( rule__Connection__Group__2__Impl rule__Connection__Group__3 )
            // InternalRailLinesMap.g:690:2: rule__Connection__Group__2__Impl rule__Connection__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Connection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__2"


    // $ANTLR start "rule__Connection__Group__2__Impl"
    // InternalRailLinesMap.g:697:1: rule__Connection__Group__2__Impl : ( ( rule__Connection__SrcAssignment_2 ) ) ;
    public final void rule__Connection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:701:1: ( ( ( rule__Connection__SrcAssignment_2 ) ) )
            // InternalRailLinesMap.g:702:1: ( ( rule__Connection__SrcAssignment_2 ) )
            {
            // InternalRailLinesMap.g:702:1: ( ( rule__Connection__SrcAssignment_2 ) )
            // InternalRailLinesMap.g:703:2: ( rule__Connection__SrcAssignment_2 )
            {
             before(grammarAccess.getConnectionAccess().getSrcAssignment_2()); 
            // InternalRailLinesMap.g:704:2: ( rule__Connection__SrcAssignment_2 )
            // InternalRailLinesMap.g:704:3: rule__Connection__SrcAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Connection__SrcAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getSrcAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__2__Impl"


    // $ANTLR start "rule__Connection__Group__3"
    // InternalRailLinesMap.g:712:1: rule__Connection__Group__3 : rule__Connection__Group__3__Impl rule__Connection__Group__4 ;
    public final void rule__Connection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:716:1: ( rule__Connection__Group__3__Impl rule__Connection__Group__4 )
            // InternalRailLinesMap.g:717:2: rule__Connection__Group__3__Impl rule__Connection__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Connection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connection__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__3"


    // $ANTLR start "rule__Connection__Group__3__Impl"
    // InternalRailLinesMap.g:724:1: rule__Connection__Group__3__Impl : ( 'to' ) ;
    public final void rule__Connection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:728:1: ( ( 'to' ) )
            // InternalRailLinesMap.g:729:1: ( 'to' )
            {
            // InternalRailLinesMap.g:729:1: ( 'to' )
            // InternalRailLinesMap.g:730:2: 'to'
            {
             before(grammarAccess.getConnectionAccess().getToKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getConnectionAccess().getToKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__3__Impl"


    // $ANTLR start "rule__Connection__Group__4"
    // InternalRailLinesMap.g:739:1: rule__Connection__Group__4 : rule__Connection__Group__4__Impl rule__Connection__Group__5 ;
    public final void rule__Connection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:743:1: ( rule__Connection__Group__4__Impl rule__Connection__Group__5 )
            // InternalRailLinesMap.g:744:2: rule__Connection__Group__4__Impl rule__Connection__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Connection__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connection__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__4"


    // $ANTLR start "rule__Connection__Group__4__Impl"
    // InternalRailLinesMap.g:751:1: rule__Connection__Group__4__Impl : ( ( rule__Connection__DstAssignment_4 ) ) ;
    public final void rule__Connection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:755:1: ( ( ( rule__Connection__DstAssignment_4 ) ) )
            // InternalRailLinesMap.g:756:1: ( ( rule__Connection__DstAssignment_4 ) )
            {
            // InternalRailLinesMap.g:756:1: ( ( rule__Connection__DstAssignment_4 ) )
            // InternalRailLinesMap.g:757:2: ( rule__Connection__DstAssignment_4 )
            {
             before(grammarAccess.getConnectionAccess().getDstAssignment_4()); 
            // InternalRailLinesMap.g:758:2: ( rule__Connection__DstAssignment_4 )
            // InternalRailLinesMap.g:758:3: rule__Connection__DstAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Connection__DstAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getDstAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__4__Impl"


    // $ANTLR start "rule__Connection__Group__5"
    // InternalRailLinesMap.g:766:1: rule__Connection__Group__5 : rule__Connection__Group__5__Impl rule__Connection__Group__6 ;
    public final void rule__Connection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:770:1: ( rule__Connection__Group__5__Impl rule__Connection__Group__6 )
            // InternalRailLinesMap.g:771:2: rule__Connection__Group__5__Impl rule__Connection__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Connection__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connection__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__5"


    // $ANTLR start "rule__Connection__Group__5__Impl"
    // InternalRailLinesMap.g:778:1: rule__Connection__Group__5__Impl : ( 'in' ) ;
    public final void rule__Connection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:782:1: ( ( 'in' ) )
            // InternalRailLinesMap.g:783:1: ( 'in' )
            {
            // InternalRailLinesMap.g:783:1: ( 'in' )
            // InternalRailLinesMap.g:784:2: 'in'
            {
             before(grammarAccess.getConnectionAccess().getInKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getConnectionAccess().getInKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__5__Impl"


    // $ANTLR start "rule__Connection__Group__6"
    // InternalRailLinesMap.g:793:1: rule__Connection__Group__6 : rule__Connection__Group__6__Impl rule__Connection__Group__7 ;
    public final void rule__Connection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:797:1: ( rule__Connection__Group__6__Impl rule__Connection__Group__7 )
            // InternalRailLinesMap.g:798:2: rule__Connection__Group__6__Impl rule__Connection__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__Connection__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connection__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__6"


    // $ANTLR start "rule__Connection__Group__6__Impl"
    // InternalRailLinesMap.g:805:1: rule__Connection__Group__6__Impl : ( ( rule__Connection__LengthAssignment_6 ) ) ;
    public final void rule__Connection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:809:1: ( ( ( rule__Connection__LengthAssignment_6 ) ) )
            // InternalRailLinesMap.g:810:1: ( ( rule__Connection__LengthAssignment_6 ) )
            {
            // InternalRailLinesMap.g:810:1: ( ( rule__Connection__LengthAssignment_6 ) )
            // InternalRailLinesMap.g:811:2: ( rule__Connection__LengthAssignment_6 )
            {
             before(grammarAccess.getConnectionAccess().getLengthAssignment_6()); 
            // InternalRailLinesMap.g:812:2: ( rule__Connection__LengthAssignment_6 )
            // InternalRailLinesMap.g:812:3: rule__Connection__LengthAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Connection__LengthAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getLengthAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__6__Impl"


    // $ANTLR start "rule__Connection__Group__7"
    // InternalRailLinesMap.g:820:1: rule__Connection__Group__7 : rule__Connection__Group__7__Impl rule__Connection__Group__8 ;
    public final void rule__Connection__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:824:1: ( rule__Connection__Group__7__Impl rule__Connection__Group__8 )
            // InternalRailLinesMap.g:825:2: rule__Connection__Group__7__Impl rule__Connection__Group__8
            {
            pushFollow(FOLLOW_14);
            rule__Connection__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connection__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__7"


    // $ANTLR start "rule__Connection__Group__7__Impl"
    // InternalRailLinesMap.g:832:1: rule__Connection__Group__7__Impl : ( 'segments' ) ;
    public final void rule__Connection__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:836:1: ( ( 'segments' ) )
            // InternalRailLinesMap.g:837:1: ( 'segments' )
            {
            // InternalRailLinesMap.g:837:1: ( 'segments' )
            // InternalRailLinesMap.g:838:2: 'segments'
            {
             before(grammarAccess.getConnectionAccess().getSegmentsKeyword_7()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getConnectionAccess().getSegmentsKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__7__Impl"


    // $ANTLR start "rule__Connection__Group__8"
    // InternalRailLinesMap.g:847:1: rule__Connection__Group__8 : rule__Connection__Group__8__Impl rule__Connection__Group__9 ;
    public final void rule__Connection__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:851:1: ( rule__Connection__Group__8__Impl rule__Connection__Group__9 )
            // InternalRailLinesMap.g:852:2: rule__Connection__Group__8__Impl rule__Connection__Group__9
            {
            pushFollow(FOLLOW_14);
            rule__Connection__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connection__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__8"


    // $ANTLR start "rule__Connection__Group__8__Impl"
    // InternalRailLinesMap.g:859:1: rule__Connection__Group__8__Impl : ( ( rule__Connection__GaugeAssignment_8 )? ) ;
    public final void rule__Connection__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:863:1: ( ( ( rule__Connection__GaugeAssignment_8 )? ) )
            // InternalRailLinesMap.g:864:1: ( ( rule__Connection__GaugeAssignment_8 )? )
            {
            // InternalRailLinesMap.g:864:1: ( ( rule__Connection__GaugeAssignment_8 )? )
            // InternalRailLinesMap.g:865:2: ( rule__Connection__GaugeAssignment_8 )?
            {
             before(grammarAccess.getConnectionAccess().getGaugeAssignment_8()); 
            // InternalRailLinesMap.g:866:2: ( rule__Connection__GaugeAssignment_8 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=14 && LA7_0<=16)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRailLinesMap.g:866:3: rule__Connection__GaugeAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__Connection__GaugeAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectionAccess().getGaugeAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__8__Impl"


    // $ANTLR start "rule__Connection__Group__9"
    // InternalRailLinesMap.g:874:1: rule__Connection__Group__9 : rule__Connection__Group__9__Impl ;
    public final void rule__Connection__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:878:1: ( rule__Connection__Group__9__Impl )
            // InternalRailLinesMap.g:879:2: rule__Connection__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connection__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__9"


    // $ANTLR start "rule__Connection__Group__9__Impl"
    // InternalRailLinesMap.g:885:1: rule__Connection__Group__9__Impl : ( ';' ) ;
    public final void rule__Connection__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:889:1: ( ( ';' ) )
            // InternalRailLinesMap.g:890:1: ( ';' )
            {
            // InternalRailLinesMap.g:890:1: ( ';' )
            // InternalRailLinesMap.g:891:2: ';'
            {
             before(grammarAccess.getConnectionAccess().getSemicolonKeyword_9()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getConnectionAccess().getSemicolonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__9__Impl"


    // $ANTLR start "rule__Turnout__Group__0"
    // InternalRailLinesMap.g:901:1: rule__Turnout__Group__0 : rule__Turnout__Group__0__Impl rule__Turnout__Group__1 ;
    public final void rule__Turnout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:905:1: ( rule__Turnout__Group__0__Impl rule__Turnout__Group__1 )
            // InternalRailLinesMap.g:906:2: rule__Turnout__Group__0__Impl rule__Turnout__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Turnout__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Turnout__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turnout__Group__0"


    // $ANTLR start "rule__Turnout__Group__0__Impl"
    // InternalRailLinesMap.g:913:1: rule__Turnout__Group__0__Impl : ( 'turnout' ) ;
    public final void rule__Turnout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:917:1: ( ( 'turnout' ) )
            // InternalRailLinesMap.g:918:1: ( 'turnout' )
            {
            // InternalRailLinesMap.g:918:1: ( 'turnout' )
            // InternalRailLinesMap.g:919:2: 'turnout'
            {
             before(grammarAccess.getTurnoutAccess().getTurnoutKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTurnoutAccess().getTurnoutKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turnout__Group__0__Impl"


    // $ANTLR start "rule__Turnout__Group__1"
    // InternalRailLinesMap.g:928:1: rule__Turnout__Group__1 : rule__Turnout__Group__1__Impl rule__Turnout__Group__2 ;
    public final void rule__Turnout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:932:1: ( rule__Turnout__Group__1__Impl rule__Turnout__Group__2 )
            // InternalRailLinesMap.g:933:2: rule__Turnout__Group__1__Impl rule__Turnout__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Turnout__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Turnout__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turnout__Group__1"


    // $ANTLR start "rule__Turnout__Group__1__Impl"
    // InternalRailLinesMap.g:940:1: rule__Turnout__Group__1__Impl : ( ( rule__Turnout__NameAssignment_1 ) ) ;
    public final void rule__Turnout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:944:1: ( ( ( rule__Turnout__NameAssignment_1 ) ) )
            // InternalRailLinesMap.g:945:1: ( ( rule__Turnout__NameAssignment_1 ) )
            {
            // InternalRailLinesMap.g:945:1: ( ( rule__Turnout__NameAssignment_1 ) )
            // InternalRailLinesMap.g:946:2: ( rule__Turnout__NameAssignment_1 )
            {
             before(grammarAccess.getTurnoutAccess().getNameAssignment_1()); 
            // InternalRailLinesMap.g:947:2: ( rule__Turnout__NameAssignment_1 )
            // InternalRailLinesMap.g:947:3: rule__Turnout__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Turnout__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTurnoutAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turnout__Group__1__Impl"


    // $ANTLR start "rule__Turnout__Group__2"
    // InternalRailLinesMap.g:955:1: rule__Turnout__Group__2 : rule__Turnout__Group__2__Impl ;
    public final void rule__Turnout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:959:1: ( rule__Turnout__Group__2__Impl )
            // InternalRailLinesMap.g:960:2: rule__Turnout__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Turnout__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turnout__Group__2"


    // $ANTLR start "rule__Turnout__Group__2__Impl"
    // InternalRailLinesMap.g:966:1: rule__Turnout__Group__2__Impl : ( ';' ) ;
    public final void rule__Turnout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:970:1: ( ( ';' ) )
            // InternalRailLinesMap.g:971:1: ( ';' )
            {
            // InternalRailLinesMap.g:971:1: ( ';' )
            // InternalRailLinesMap.g:972:2: ';'
            {
             before(grammarAccess.getTurnoutAccess().getSemicolonKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTurnoutAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turnout__Group__2__Impl"


    // $ANTLR start "rule__StationTrackLocation__Group__0"
    // InternalRailLinesMap.g:982:1: rule__StationTrackLocation__Group__0 : rule__StationTrackLocation__Group__0__Impl rule__StationTrackLocation__Group__1 ;
    public final void rule__StationTrackLocation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:986:1: ( rule__StationTrackLocation__Group__0__Impl rule__StationTrackLocation__Group__1 )
            // InternalRailLinesMap.g:987:2: rule__StationTrackLocation__Group__0__Impl rule__StationTrackLocation__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__StationTrackLocation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StationTrackLocation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StationTrackLocation__Group__0"


    // $ANTLR start "rule__StationTrackLocation__Group__0__Impl"
    // InternalRailLinesMap.g:994:1: rule__StationTrackLocation__Group__0__Impl : ( ( rule__StationTrackLocation__StationAssignment_0 ) ) ;
    public final void rule__StationTrackLocation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:998:1: ( ( ( rule__StationTrackLocation__StationAssignment_0 ) ) )
            // InternalRailLinesMap.g:999:1: ( ( rule__StationTrackLocation__StationAssignment_0 ) )
            {
            // InternalRailLinesMap.g:999:1: ( ( rule__StationTrackLocation__StationAssignment_0 ) )
            // InternalRailLinesMap.g:1000:2: ( rule__StationTrackLocation__StationAssignment_0 )
            {
             before(grammarAccess.getStationTrackLocationAccess().getStationAssignment_0()); 
            // InternalRailLinesMap.g:1001:2: ( rule__StationTrackLocation__StationAssignment_0 )
            // InternalRailLinesMap.g:1001:3: rule__StationTrackLocation__StationAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__StationTrackLocation__StationAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStationTrackLocationAccess().getStationAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StationTrackLocation__Group__0__Impl"


    // $ANTLR start "rule__StationTrackLocation__Group__1"
    // InternalRailLinesMap.g:1009:1: rule__StationTrackLocation__Group__1 : rule__StationTrackLocation__Group__1__Impl rule__StationTrackLocation__Group__2 ;
    public final void rule__StationTrackLocation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:1013:1: ( rule__StationTrackLocation__Group__1__Impl rule__StationTrackLocation__Group__2 )
            // InternalRailLinesMap.g:1014:2: rule__StationTrackLocation__Group__1__Impl rule__StationTrackLocation__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__StationTrackLocation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StationTrackLocation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StationTrackLocation__Group__1"


    // $ANTLR start "rule__StationTrackLocation__Group__1__Impl"
    // InternalRailLinesMap.g:1021:1: rule__StationTrackLocation__Group__1__Impl : ( 'track' ) ;
    public final void rule__StationTrackLocation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:1025:1: ( ( 'track' ) )
            // InternalRailLinesMap.g:1026:1: ( 'track' )
            {
            // InternalRailLinesMap.g:1026:1: ( 'track' )
            // InternalRailLinesMap.g:1027:2: 'track'
            {
             before(grammarAccess.getStationTrackLocationAccess().getTrackKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getStationTrackLocationAccess().getTrackKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StationTrackLocation__Group__1__Impl"


    // $ANTLR start "rule__StationTrackLocation__Group__2"
    // InternalRailLinesMap.g:1036:1: rule__StationTrackLocation__Group__2 : rule__StationTrackLocation__Group__2__Impl ;
    public final void rule__StationTrackLocation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:1040:1: ( rule__StationTrackLocation__Group__2__Impl )
            // InternalRailLinesMap.g:1041:2: rule__StationTrackLocation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StationTrackLocation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StationTrackLocation__Group__2"


    // $ANTLR start "rule__StationTrackLocation__Group__2__Impl"
    // InternalRailLinesMap.g:1047:1: rule__StationTrackLocation__Group__2__Impl : ( ( rule__StationTrackLocation__TrackAssignment_2 ) ) ;
    public final void rule__StationTrackLocation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:1051:1: ( ( ( rule__StationTrackLocation__TrackAssignment_2 ) ) )
            // InternalRailLinesMap.g:1052:1: ( ( rule__StationTrackLocation__TrackAssignment_2 ) )
            {
            // InternalRailLinesMap.g:1052:1: ( ( rule__StationTrackLocation__TrackAssignment_2 ) )
            // InternalRailLinesMap.g:1053:2: ( rule__StationTrackLocation__TrackAssignment_2 )
            {
             before(grammarAccess.getStationTrackLocationAccess().getTrackAssignment_2()); 
            // InternalRailLinesMap.g:1054:2: ( rule__StationTrackLocation__TrackAssignment_2 )
            // InternalRailLinesMap.g:1054:3: rule__StationTrackLocation__TrackAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StationTrackLocation__TrackAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStationTrackLocationAccess().getTrackAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StationTrackLocation__Group__2__Impl"


    // $ANTLR start "rule__TurnoutEndLocation__Group__0"
    // InternalRailLinesMap.g:1063:1: rule__TurnoutEndLocation__Group__0 : rule__TurnoutEndLocation__Group__0__Impl rule__TurnoutEndLocation__Group__1 ;
    public final void rule__TurnoutEndLocation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:1067:1: ( rule__TurnoutEndLocation__Group__0__Impl rule__TurnoutEndLocation__Group__1 )
            // InternalRailLinesMap.g:1068:2: rule__TurnoutEndLocation__Group__0__Impl rule__TurnoutEndLocation__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__TurnoutEndLocation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnoutEndLocation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnoutEndLocation__Group__0"


    // $ANTLR start "rule__TurnoutEndLocation__Group__0__Impl"
    // InternalRailLinesMap.g:1075:1: rule__TurnoutEndLocation__Group__0__Impl : ( ( rule__TurnoutEndLocation__TurnoutAssignment_0 ) ) ;
    public final void rule__TurnoutEndLocation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:1079:1: ( ( ( rule__TurnoutEndLocation__TurnoutAssignment_0 ) ) )
            // InternalRailLinesMap.g:1080:1: ( ( rule__TurnoutEndLocation__TurnoutAssignment_0 ) )
            {
            // InternalRailLinesMap.g:1080:1: ( ( rule__TurnoutEndLocation__TurnoutAssignment_0 ) )
            // InternalRailLinesMap.g:1081:2: ( rule__TurnoutEndLocation__TurnoutAssignment_0 )
            {
             before(grammarAccess.getTurnoutEndLocationAccess().getTurnoutAssignment_0()); 
            // InternalRailLinesMap.g:1082:2: ( rule__TurnoutEndLocation__TurnoutAssignment_0 )
            // InternalRailLinesMap.g:1082:3: rule__TurnoutEndLocation__TurnoutAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TurnoutEndLocation__TurnoutAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTurnoutEndLocationAccess().getTurnoutAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnoutEndLocation__Group__0__Impl"


    // $ANTLR start "rule__TurnoutEndLocation__Group__1"
    // InternalRailLinesMap.g:1090:1: rule__TurnoutEndLocation__Group__1 : rule__TurnoutEndLocation__Group__1__Impl rule__TurnoutEndLocation__Group__2 ;
    public final void rule__TurnoutEndLocation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:1094:1: ( rule__TurnoutEndLocation__Group__1__Impl rule__TurnoutEndLocation__Group__2 )
            // InternalRailLinesMap.g:1095:2: rule__TurnoutEndLocation__Group__1__Impl rule__TurnoutEndLocation__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__TurnoutEndLocation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnoutEndLocation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnoutEndLocation__Group__1"


    // $ANTLR start "rule__TurnoutEndLocation__Group__1__Impl"
    // InternalRailLinesMap.g:1102:1: rule__TurnoutEndLocation__Group__1__Impl : ( '.' ) ;
    public final void rule__TurnoutEndLocation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:1106:1: ( ( '.' ) )
            // InternalRailLinesMap.g:1107:1: ( '.' )
            {
            // InternalRailLinesMap.g:1107:1: ( '.' )
            // InternalRailLinesMap.g:1108:2: '.'
            {
             before(grammarAccess.getTurnoutEndLocationAccess().getFullStopKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTurnoutEndLocationAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnoutEndLocation__Group__1__Impl"


    // $ANTLR start "rule__TurnoutEndLocation__Group__2"
    // InternalRailLinesMap.g:1117:1: rule__TurnoutEndLocation__Group__2 : rule__TurnoutEndLocation__Group__2__Impl ;
    public final void rule__TurnoutEndLocation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:1121:1: ( rule__TurnoutEndLocation__Group__2__Impl )
            // InternalRailLinesMap.g:1122:2: rule__TurnoutEndLocation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TurnoutEndLocation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnoutEndLocation__Group__2"


    // $ANTLR start "rule__TurnoutEndLocation__Group__2__Impl"
    // InternalRailLinesMap.g:1128:1: rule__TurnoutEndLocation__Group__2__Impl : ( ( rule__TurnoutEndLocation__EndAssignment_2 ) ) ;
    public final void rule__TurnoutEndLocation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:1132:1: ( ( ( rule__TurnoutEndLocation__EndAssignment_2 ) ) )
            // InternalRailLinesMap.g:1133:1: ( ( rule__TurnoutEndLocation__EndAssignment_2 ) )
            {
            // InternalRailLinesMap.g:1133:1: ( ( rule__TurnoutEndLocation__EndAssignment_2 ) )
            // InternalRailLinesMap.g:1134:2: ( rule__TurnoutEndLocation__EndAssignment_2 )
            {
             before(grammarAccess.getTurnoutEndLocationAccess().getEndAssignment_2()); 
            // InternalRailLinesMap.g:1135:2: ( rule__TurnoutEndLocation__EndAssignment_2 )
            // InternalRailLinesMap.g:1135:3: rule__TurnoutEndLocation__EndAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TurnoutEndLocation__EndAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTurnoutEndLocationAccess().getEndAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnoutEndLocation__Group__2__Impl"


    // $ANTLR start "rule__RailLineMap__MapNameAssignment_1"
    // InternalRailLinesMap.g:1144:1: rule__RailLineMap__MapNameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__RailLineMap__MapNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:1148:1: ( ( RULE_STRING ) )
            // InternalRailLinesMap.g:1149:2: ( RULE_STRING )
            {
            // InternalRailLinesMap.g:1149:2: ( RULE_STRING )
            // InternalRailLinesMap.g:1150:3: RULE_STRING
            {
             before(grammarAccess.getRailLineMapAccess().getMapNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRailLineMapAccess().getMapNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RailLineMap__MapNameAssignment_1"


    // $ANTLR start "rule__RailLineMap__StationsAssignment_2_0"
    // InternalRailLinesMap.g:1159:1: rule__RailLineMap__StationsAssignment_2_0 : ( ruleStation ) ;
    public final void rule__RailLineMap__StationsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:1163:1: ( ( ruleStation ) )
            // InternalRailLinesMap.g:1164:2: ( ruleStation )
            {
            // InternalRailLinesMap.g:1164:2: ( ruleStation )
            // InternalRailLinesMap.g:1165:3: ruleStation
            {
             before(grammarAccess.getRailLineMapAccess().getStationsStationParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStation();

            state._fsp--;

             after(grammarAccess.getRailLineMapAccess().getStationsStationParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RailLineMap__StationsAssignment_2_0"


    // $ANTLR start "rule__RailLineMap__TurnoutsAssignment_2_1"
    // InternalRailLinesMap.g:1174:1: rule__RailLineMap__TurnoutsAssignment_2_1 : ( ruleTurnout ) ;
    public final void rule__RailLineMap__TurnoutsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:1178:1: ( ( ruleTurnout ) )
            // InternalRailLinesMap.g:1179:2: ( ruleTurnout )
            {
            // InternalRailLinesMap.g:1179:2: ( ruleTurnout )
            // InternalRailLinesMap.g:1180:3: ruleTurnout
            {
             before(grammarAccess.getRailLineMapAccess().getTurnoutsTurnoutParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTurnout();

            state._fsp--;

             after(grammarAccess.getRailLineMapAccess().getTurnoutsTurnoutParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RailLineMap__TurnoutsAssignment_2_1"


    // $ANTLR start "rule__RailLineMap__ConnectionsAssignment_2_2"
    // InternalRailLinesMap.g:1189:1: rule__RailLineMap__ConnectionsAssignment_2_2 : ( ruleConnection ) ;
    public final void rule__RailLineMap__ConnectionsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:1193:1: ( ( ruleConnection ) )
            // InternalRailLinesMap.g:1194:2: ( ruleConnection )
            {
            // InternalRailLinesMap.g:1194:2: ( ruleConnection )
            // InternalRailLinesMap.g:1195:3: ruleConnection
            {
             before(grammarAccess.getRailLineMapAccess().getConnectionsConnectionParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConnection();

            state._fsp--;

             after(grammarAccess.getRailLineMapAccess().getConnectionsConnectionParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RailLineMap__ConnectionsAssignment_2_2"


    // $ANTLR start "rule__Station__NameAssignment_1"
    // InternalRailLinesMap.g:1204:1: rule__Station__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Station__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:1208:1: ( ( RULE_ID ) )
            // InternalRailLinesMap.g:1209:2: ( RULE_ID )
            {
            // InternalRailLinesMap.g:1209:2: ( RULE_ID )
            // InternalRailLinesMap.g:1210:3: RULE_ID
            {
             before(grammarAccess.getStationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__NameAssignment_1"


    // $ANTLR start "rule__Station__TracksAssignment_2_1"
    // InternalRailLinesMap.g:1219:1: rule__Station__TracksAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Station__TracksAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:1223:1: ( ( RULE_INT ) )
            // InternalRailLinesMap.g:1224:2: ( RULE_INT )
            {
            // InternalRailLinesMap.g:1224:2: ( RULE_INT )
            // InternalRailLinesMap.g:1225:3: RULE_INT
            {
             before(grammarAccess.getStationAccess().getTracksINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getStationAccess().getTracksINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__TracksAssignment_2_1"


    // $ANTLR start "rule__Connection__SrcAssignment_2"
    // InternalRailLinesMap.g:1234:1: rule__Connection__SrcAssignment_2 : ( ruleLocation ) ;
    public final void rule__Connection__SrcAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:1238:1: ( ( ruleLocation ) )
            // InternalRailLinesMap.g:1239:2: ( ruleLocation )
            {
            // InternalRailLinesMap.g:1239:2: ( ruleLocation )
            // InternalRailLinesMap.g:1240:3: ruleLocation
            {
             before(grammarAccess.getConnectionAccess().getSrcLocationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLocation();

            state._fsp--;

             after(grammarAccess.getConnectionAccess().getSrcLocationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__SrcAssignment_2"


    // $ANTLR start "rule__Connection__DstAssignment_4"
    // InternalRailLinesMap.g:1249:1: rule__Connection__DstAssignment_4 : ( ruleLocation ) ;
    public final void rule__Connection__DstAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:1253:1: ( ( ruleLocation ) )
            // InternalRailLinesMap.g:1254:2: ( ruleLocation )
            {
            // InternalRailLinesMap.g:1254:2: ( ruleLocation )
            // InternalRailLinesMap.g:1255:3: ruleLocation
            {
             before(grammarAccess.getConnectionAccess().getDstLocationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLocation();

            state._fsp--;

             after(grammarAccess.getConnectionAccess().getDstLocationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__DstAssignment_4"


    // $ANTLR start "rule__Connection__LengthAssignment_6"
    // InternalRailLinesMap.g:1264:1: rule__Connection__LengthAssignment_6 : ( RULE_INT ) ;
    public final void rule__Connection__LengthAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:1268:1: ( ( RULE_INT ) )
            // InternalRailLinesMap.g:1269:2: ( RULE_INT )
            {
            // InternalRailLinesMap.g:1269:2: ( RULE_INT )
            // InternalRailLinesMap.g:1270:3: RULE_INT
            {
             before(grammarAccess.getConnectionAccess().getLengthINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getConnectionAccess().getLengthINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__LengthAssignment_6"


    // $ANTLR start "rule__Connection__GaugeAssignment_8"
    // InternalRailLinesMap.g:1279:1: rule__Connection__GaugeAssignment_8 : ( ruleGauge ) ;
    public final void rule__Connection__GaugeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:1283:1: ( ( ruleGauge ) )
            // InternalRailLinesMap.g:1284:2: ( ruleGauge )
            {
            // InternalRailLinesMap.g:1284:2: ( ruleGauge )
            // InternalRailLinesMap.g:1285:3: ruleGauge
            {
             before(grammarAccess.getConnectionAccess().getGaugeGaugeEnumRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleGauge();

            state._fsp--;

             after(grammarAccess.getConnectionAccess().getGaugeGaugeEnumRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__GaugeAssignment_8"


    // $ANTLR start "rule__Turnout__NameAssignment_1"
    // InternalRailLinesMap.g:1294:1: rule__Turnout__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Turnout__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:1298:1: ( ( RULE_ID ) )
            // InternalRailLinesMap.g:1299:2: ( RULE_ID )
            {
            // InternalRailLinesMap.g:1299:2: ( RULE_ID )
            // InternalRailLinesMap.g:1300:3: RULE_ID
            {
             before(grammarAccess.getTurnoutAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTurnoutAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turnout__NameAssignment_1"


    // $ANTLR start "rule__StationTrackLocation__StationAssignment_0"
    // InternalRailLinesMap.g:1309:1: rule__StationTrackLocation__StationAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__StationTrackLocation__StationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:1313:1: ( ( ( RULE_ID ) ) )
            // InternalRailLinesMap.g:1314:2: ( ( RULE_ID ) )
            {
            // InternalRailLinesMap.g:1314:2: ( ( RULE_ID ) )
            // InternalRailLinesMap.g:1315:3: ( RULE_ID )
            {
             before(grammarAccess.getStationTrackLocationAccess().getStationStationCrossReference_0_0()); 
            // InternalRailLinesMap.g:1316:3: ( RULE_ID )
            // InternalRailLinesMap.g:1317:4: RULE_ID
            {
             before(grammarAccess.getStationTrackLocationAccess().getStationStationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStationTrackLocationAccess().getStationStationIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getStationTrackLocationAccess().getStationStationCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StationTrackLocation__StationAssignment_0"


    // $ANTLR start "rule__StationTrackLocation__TrackAssignment_2"
    // InternalRailLinesMap.g:1328:1: rule__StationTrackLocation__TrackAssignment_2 : ( RULE_INT ) ;
    public final void rule__StationTrackLocation__TrackAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:1332:1: ( ( RULE_INT ) )
            // InternalRailLinesMap.g:1333:2: ( RULE_INT )
            {
            // InternalRailLinesMap.g:1333:2: ( RULE_INT )
            // InternalRailLinesMap.g:1334:3: RULE_INT
            {
             before(grammarAccess.getStationTrackLocationAccess().getTrackINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getStationTrackLocationAccess().getTrackINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StationTrackLocation__TrackAssignment_2"


    // $ANTLR start "rule__TurnoutEndLocation__TurnoutAssignment_0"
    // InternalRailLinesMap.g:1343:1: rule__TurnoutEndLocation__TurnoutAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__TurnoutEndLocation__TurnoutAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:1347:1: ( ( ( RULE_ID ) ) )
            // InternalRailLinesMap.g:1348:2: ( ( RULE_ID ) )
            {
            // InternalRailLinesMap.g:1348:2: ( ( RULE_ID ) )
            // InternalRailLinesMap.g:1349:3: ( RULE_ID )
            {
             before(grammarAccess.getTurnoutEndLocationAccess().getTurnoutTurnoutCrossReference_0_0()); 
            // InternalRailLinesMap.g:1350:3: ( RULE_ID )
            // InternalRailLinesMap.g:1351:4: RULE_ID
            {
             before(grammarAccess.getTurnoutEndLocationAccess().getTurnoutTurnoutIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTurnoutEndLocationAccess().getTurnoutTurnoutIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTurnoutEndLocationAccess().getTurnoutTurnoutCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnoutEndLocation__TurnoutAssignment_0"


    // $ANTLR start "rule__TurnoutEndLocation__EndAssignment_2"
    // InternalRailLinesMap.g:1362:1: rule__TurnoutEndLocation__EndAssignment_2 : ( ruleTurnoutEnd ) ;
    public final void rule__TurnoutEndLocation__EndAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailLinesMap.g:1366:1: ( ( ruleTurnoutEnd ) )
            // InternalRailLinesMap.g:1367:2: ( ruleTurnoutEnd )
            {
            // InternalRailLinesMap.g:1367:2: ( ruleTurnoutEnd )
            // InternalRailLinesMap.g:1368:3: ruleTurnoutEnd
            {
             before(grammarAccess.getTurnoutEndLocationAccess().getEndTurnoutEndEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTurnoutEnd();

            state._fsp--;

             after(grammarAccess.getTurnoutEndLocationAccess().getEndTurnoutEndEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnoutEndLocation__EndAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000008440000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000008440002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000009C000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000003800L});

}