package hu.bme.mit.temalab.railmap.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import hu.bme.mit.temalab.railmap.services.RailLinesMapGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRailLinesMapParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'rail-map'", "'station'", "'with'", "'tracks'", "';'", "'connection'", "'from'", "'to'", "'in'", "'segments'", "'turnout'", "'track'", "'.'", "'top'", "'straight'", "'divergent'", "'standard gauge'", "'narrow gauge'", "'broad gauge'"
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

        public InternalRailLinesMapParser(TokenStream input, RailLinesMapGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RailLineMap";
       	}

       	@Override
       	protected RailLinesMapGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRailLineMap"
    // InternalRailLinesMap.g:65:1: entryRuleRailLineMap returns [EObject current=null] : iv_ruleRailLineMap= ruleRailLineMap EOF ;
    public final EObject entryRuleRailLineMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRailLineMap = null;


        try {
            // InternalRailLinesMap.g:65:52: (iv_ruleRailLineMap= ruleRailLineMap EOF )
            // InternalRailLinesMap.g:66:2: iv_ruleRailLineMap= ruleRailLineMap EOF
            {
             newCompositeNode(grammarAccess.getRailLineMapRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRailLineMap=ruleRailLineMap();

            state._fsp--;

             current =iv_ruleRailLineMap; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRailLineMap"


    // $ANTLR start "ruleRailLineMap"
    // InternalRailLinesMap.g:72:1: ruleRailLineMap returns [EObject current=null] : (otherlv_0= 'rail-map' ( (lv_mapName_1_0= RULE_STRING ) ) ( ( (lv_stations_2_0= ruleStation ) ) | ( (lv_turnouts_3_0= ruleTurnout ) ) | ( (lv_connections_4_0= ruleConnection ) ) )* ) ;
    public final EObject ruleRailLineMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_mapName_1_0=null;
        EObject lv_stations_2_0 = null;

        EObject lv_turnouts_3_0 = null;

        EObject lv_connections_4_0 = null;



        	enterRule();

        try {
            // InternalRailLinesMap.g:78:2: ( (otherlv_0= 'rail-map' ( (lv_mapName_1_0= RULE_STRING ) ) ( ( (lv_stations_2_0= ruleStation ) ) | ( (lv_turnouts_3_0= ruleTurnout ) ) | ( (lv_connections_4_0= ruleConnection ) ) )* ) )
            // InternalRailLinesMap.g:79:2: (otherlv_0= 'rail-map' ( (lv_mapName_1_0= RULE_STRING ) ) ( ( (lv_stations_2_0= ruleStation ) ) | ( (lv_turnouts_3_0= ruleTurnout ) ) | ( (lv_connections_4_0= ruleConnection ) ) )* )
            {
            // InternalRailLinesMap.g:79:2: (otherlv_0= 'rail-map' ( (lv_mapName_1_0= RULE_STRING ) ) ( ( (lv_stations_2_0= ruleStation ) ) | ( (lv_turnouts_3_0= ruleTurnout ) ) | ( (lv_connections_4_0= ruleConnection ) ) )* )
            // InternalRailLinesMap.g:80:3: otherlv_0= 'rail-map' ( (lv_mapName_1_0= RULE_STRING ) ) ( ( (lv_stations_2_0= ruleStation ) ) | ( (lv_turnouts_3_0= ruleTurnout ) ) | ( (lv_connections_4_0= ruleConnection ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRailLineMapAccess().getRailMapKeyword_0());
            		
            // InternalRailLinesMap.g:84:3: ( (lv_mapName_1_0= RULE_STRING ) )
            // InternalRailLinesMap.g:85:4: (lv_mapName_1_0= RULE_STRING )
            {
            // InternalRailLinesMap.g:85:4: (lv_mapName_1_0= RULE_STRING )
            // InternalRailLinesMap.g:86:5: lv_mapName_1_0= RULE_STRING
            {
            lv_mapName_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_mapName_1_0, grammarAccess.getRailLineMapAccess().getMapNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRailLineMapRule());
            					}
            					setWithLastConsumed(
            						current,
            						"mapName",
            						lv_mapName_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalRailLinesMap.g:102:3: ( ( (lv_stations_2_0= ruleStation ) ) | ( (lv_turnouts_3_0= ruleTurnout ) ) | ( (lv_connections_4_0= ruleConnection ) ) )*
            loop1:
            do {
                int alt1=4;
                switch ( input.LA(1) ) {
                case 12:
                    {
                    alt1=1;
                    }
                    break;
                case 21:
                    {
                    alt1=2;
                    }
                    break;
                case 16:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalRailLinesMap.g:103:4: ( (lv_stations_2_0= ruleStation ) )
            	    {
            	    // InternalRailLinesMap.g:103:4: ( (lv_stations_2_0= ruleStation ) )
            	    // InternalRailLinesMap.g:104:5: (lv_stations_2_0= ruleStation )
            	    {
            	    // InternalRailLinesMap.g:104:5: (lv_stations_2_0= ruleStation )
            	    // InternalRailLinesMap.g:105:6: lv_stations_2_0= ruleStation
            	    {

            	    						newCompositeNode(grammarAccess.getRailLineMapAccess().getStationsStationParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_stations_2_0=ruleStation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRailLineMapRule());
            	    						}
            	    						add(
            	    							current,
            	    							"stations",
            	    							lv_stations_2_0,
            	    							"hu.bme.mit.temalab.railmap.RailLinesMap.Station");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRailLinesMap.g:123:4: ( (lv_turnouts_3_0= ruleTurnout ) )
            	    {
            	    // InternalRailLinesMap.g:123:4: ( (lv_turnouts_3_0= ruleTurnout ) )
            	    // InternalRailLinesMap.g:124:5: (lv_turnouts_3_0= ruleTurnout )
            	    {
            	    // InternalRailLinesMap.g:124:5: (lv_turnouts_3_0= ruleTurnout )
            	    // InternalRailLinesMap.g:125:6: lv_turnouts_3_0= ruleTurnout
            	    {

            	    						newCompositeNode(grammarAccess.getRailLineMapAccess().getTurnoutsTurnoutParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_turnouts_3_0=ruleTurnout();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRailLineMapRule());
            	    						}
            	    						add(
            	    							current,
            	    							"turnouts",
            	    							lv_turnouts_3_0,
            	    							"hu.bme.mit.temalab.railmap.RailLinesMap.Turnout");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRailLinesMap.g:143:4: ( (lv_connections_4_0= ruleConnection ) )
            	    {
            	    // InternalRailLinesMap.g:143:4: ( (lv_connections_4_0= ruleConnection ) )
            	    // InternalRailLinesMap.g:144:5: (lv_connections_4_0= ruleConnection )
            	    {
            	    // InternalRailLinesMap.g:144:5: (lv_connections_4_0= ruleConnection )
            	    // InternalRailLinesMap.g:145:6: lv_connections_4_0= ruleConnection
            	    {

            	    						newCompositeNode(grammarAccess.getRailLineMapAccess().getConnectionsConnectionParserRuleCall_2_2_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_connections_4_0=ruleConnection();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRailLineMapRule());
            	    						}
            	    						add(
            	    							current,
            	    							"connections",
            	    							lv_connections_4_0,
            	    							"hu.bme.mit.temalab.railmap.RailLinesMap.Connection");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRailLineMap"


    // $ANTLR start "entryRuleStation"
    // InternalRailLinesMap.g:167:1: entryRuleStation returns [EObject current=null] : iv_ruleStation= ruleStation EOF ;
    public final EObject entryRuleStation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStation = null;


        try {
            // InternalRailLinesMap.g:167:48: (iv_ruleStation= ruleStation EOF )
            // InternalRailLinesMap.g:168:2: iv_ruleStation= ruleStation EOF
            {
             newCompositeNode(grammarAccess.getStationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStation=ruleStation();

            state._fsp--;

             current =iv_ruleStation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStation"


    // $ANTLR start "ruleStation"
    // InternalRailLinesMap.g:174:1: ruleStation returns [EObject current=null] : (otherlv_0= 'station' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with' ( (lv_tracks_3_0= RULE_INT ) ) otherlv_4= 'tracks' )? otherlv_5= ';' ) ;
    public final EObject ruleStation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_tracks_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalRailLinesMap.g:180:2: ( (otherlv_0= 'station' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with' ( (lv_tracks_3_0= RULE_INT ) ) otherlv_4= 'tracks' )? otherlv_5= ';' ) )
            // InternalRailLinesMap.g:181:2: (otherlv_0= 'station' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with' ( (lv_tracks_3_0= RULE_INT ) ) otherlv_4= 'tracks' )? otherlv_5= ';' )
            {
            // InternalRailLinesMap.g:181:2: (otherlv_0= 'station' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with' ( (lv_tracks_3_0= RULE_INT ) ) otherlv_4= 'tracks' )? otherlv_5= ';' )
            // InternalRailLinesMap.g:182:3: otherlv_0= 'station' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with' ( (lv_tracks_3_0= RULE_INT ) ) otherlv_4= 'tracks' )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getStationAccess().getStationKeyword_0());
            		
            // InternalRailLinesMap.g:186:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRailLinesMap.g:187:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRailLinesMap.g:187:4: (lv_name_1_0= RULE_ID )
            // InternalRailLinesMap.g:188:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRailLinesMap.g:204:3: (otherlv_2= 'with' ( (lv_tracks_3_0= RULE_INT ) ) otherlv_4= 'tracks' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRailLinesMap.g:205:4: otherlv_2= 'with' ( (lv_tracks_3_0= RULE_INT ) ) otherlv_4= 'tracks'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getStationAccess().getWithKeyword_2_0());
                    			
                    // InternalRailLinesMap.g:209:4: ( (lv_tracks_3_0= RULE_INT ) )
                    // InternalRailLinesMap.g:210:5: (lv_tracks_3_0= RULE_INT )
                    {
                    // InternalRailLinesMap.g:210:5: (lv_tracks_3_0= RULE_INT )
                    // InternalRailLinesMap.g:211:6: lv_tracks_3_0= RULE_INT
                    {
                    lv_tracks_3_0=(Token)match(input,RULE_INT,FOLLOW_8); 

                    						newLeafNode(lv_tracks_3_0, grammarAccess.getStationAccess().getTracksINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"tracks",
                    							lv_tracks_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getStationAccess().getTracksKeyword_2_2());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getStationAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStation"


    // $ANTLR start "entryRuleConnection"
    // InternalRailLinesMap.g:240:1: entryRuleConnection returns [EObject current=null] : iv_ruleConnection= ruleConnection EOF ;
    public final EObject entryRuleConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnection = null;


        try {
            // InternalRailLinesMap.g:240:51: (iv_ruleConnection= ruleConnection EOF )
            // InternalRailLinesMap.g:241:2: iv_ruleConnection= ruleConnection EOF
            {
             newCompositeNode(grammarAccess.getConnectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnection=ruleConnection();

            state._fsp--;

             current =iv_ruleConnection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnection"


    // $ANTLR start "ruleConnection"
    // InternalRailLinesMap.g:247:1: ruleConnection returns [EObject current=null] : (otherlv_0= 'connection' otherlv_1= 'from' ( (lv_src_2_0= ruleLocation ) ) otherlv_3= 'to' ( (lv_dst_4_0= ruleLocation ) ) otherlv_5= 'in' ( (lv_length_6_0= RULE_INT ) ) otherlv_7= 'segments' ( (lv_gauge_8_0= ruleGauge ) )? otherlv_9= ';' ) ;
    public final EObject ruleConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_length_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_src_2_0 = null;

        EObject lv_dst_4_0 = null;

        Enumerator lv_gauge_8_0 = null;



        	enterRule();

        try {
            // InternalRailLinesMap.g:253:2: ( (otherlv_0= 'connection' otherlv_1= 'from' ( (lv_src_2_0= ruleLocation ) ) otherlv_3= 'to' ( (lv_dst_4_0= ruleLocation ) ) otherlv_5= 'in' ( (lv_length_6_0= RULE_INT ) ) otherlv_7= 'segments' ( (lv_gauge_8_0= ruleGauge ) )? otherlv_9= ';' ) )
            // InternalRailLinesMap.g:254:2: (otherlv_0= 'connection' otherlv_1= 'from' ( (lv_src_2_0= ruleLocation ) ) otherlv_3= 'to' ( (lv_dst_4_0= ruleLocation ) ) otherlv_5= 'in' ( (lv_length_6_0= RULE_INT ) ) otherlv_7= 'segments' ( (lv_gauge_8_0= ruleGauge ) )? otherlv_9= ';' )
            {
            // InternalRailLinesMap.g:254:2: (otherlv_0= 'connection' otherlv_1= 'from' ( (lv_src_2_0= ruleLocation ) ) otherlv_3= 'to' ( (lv_dst_4_0= ruleLocation ) ) otherlv_5= 'in' ( (lv_length_6_0= RULE_INT ) ) otherlv_7= 'segments' ( (lv_gauge_8_0= ruleGauge ) )? otherlv_9= ';' )
            // InternalRailLinesMap.g:255:3: otherlv_0= 'connection' otherlv_1= 'from' ( (lv_src_2_0= ruleLocation ) ) otherlv_3= 'to' ( (lv_dst_4_0= ruleLocation ) ) otherlv_5= 'in' ( (lv_length_6_0= RULE_INT ) ) otherlv_7= 'segments' ( (lv_gauge_8_0= ruleGauge ) )? otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getConnectionAccess().getConnectionKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getConnectionAccess().getFromKeyword_1());
            		
            // InternalRailLinesMap.g:263:3: ( (lv_src_2_0= ruleLocation ) )
            // InternalRailLinesMap.g:264:4: (lv_src_2_0= ruleLocation )
            {
            // InternalRailLinesMap.g:264:4: (lv_src_2_0= ruleLocation )
            // InternalRailLinesMap.g:265:5: lv_src_2_0= ruleLocation
            {

            					newCompositeNode(grammarAccess.getConnectionAccess().getSrcLocationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_src_2_0=ruleLocation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectionRule());
            					}
            					set(
            						current,
            						"src",
            						lv_src_2_0,
            						"hu.bme.mit.temalab.railmap.RailLinesMap.Location");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getConnectionAccess().getToKeyword_3());
            		
            // InternalRailLinesMap.g:286:3: ( (lv_dst_4_0= ruleLocation ) )
            // InternalRailLinesMap.g:287:4: (lv_dst_4_0= ruleLocation )
            {
            // InternalRailLinesMap.g:287:4: (lv_dst_4_0= ruleLocation )
            // InternalRailLinesMap.g:288:5: lv_dst_4_0= ruleLocation
            {

            					newCompositeNode(grammarAccess.getConnectionAccess().getDstLocationParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
            lv_dst_4_0=ruleLocation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectionRule());
            					}
            					set(
            						current,
            						"dst",
            						lv_dst_4_0,
            						"hu.bme.mit.temalab.railmap.RailLinesMap.Location");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getConnectionAccess().getInKeyword_5());
            		
            // InternalRailLinesMap.g:309:3: ( (lv_length_6_0= RULE_INT ) )
            // InternalRailLinesMap.g:310:4: (lv_length_6_0= RULE_INT )
            {
            // InternalRailLinesMap.g:310:4: (lv_length_6_0= RULE_INT )
            // InternalRailLinesMap.g:311:5: lv_length_6_0= RULE_INT
            {
            lv_length_6_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_length_6_0, grammarAccess.getConnectionAccess().getLengthINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"length",
            						lv_length_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getConnectionAccess().getSegmentsKeyword_7());
            		
            // InternalRailLinesMap.g:331:3: ( (lv_gauge_8_0= ruleGauge ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=27 && LA3_0<=29)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRailLinesMap.g:332:4: (lv_gauge_8_0= ruleGauge )
                    {
                    // InternalRailLinesMap.g:332:4: (lv_gauge_8_0= ruleGauge )
                    // InternalRailLinesMap.g:333:5: lv_gauge_8_0= ruleGauge
                    {

                    					newCompositeNode(grammarAccess.getConnectionAccess().getGaugeGaugeEnumRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_gauge_8_0=ruleGauge();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConnectionRule());
                    					}
                    					set(
                    						current,
                    						"gauge",
                    						lv_gauge_8_0,
                    						"hu.bme.mit.temalab.railmap.RailLinesMap.Gauge");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getConnectionAccess().getSemicolonKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnection"


    // $ANTLR start "entryRuleTurnout"
    // InternalRailLinesMap.g:358:1: entryRuleTurnout returns [EObject current=null] : iv_ruleTurnout= ruleTurnout EOF ;
    public final EObject entryRuleTurnout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnout = null;


        try {
            // InternalRailLinesMap.g:358:48: (iv_ruleTurnout= ruleTurnout EOF )
            // InternalRailLinesMap.g:359:2: iv_ruleTurnout= ruleTurnout EOF
            {
             newCompositeNode(grammarAccess.getTurnoutRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTurnout=ruleTurnout();

            state._fsp--;

             current =iv_ruleTurnout; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTurnout"


    // $ANTLR start "ruleTurnout"
    // InternalRailLinesMap.g:365:1: ruleTurnout returns [EObject current=null] : (otherlv_0= 'turnout' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleTurnout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRailLinesMap.g:371:2: ( (otherlv_0= 'turnout' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalRailLinesMap.g:372:2: (otherlv_0= 'turnout' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalRailLinesMap.g:372:2: (otherlv_0= 'turnout' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalRailLinesMap.g:373:3: otherlv_0= 'turnout' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTurnoutAccess().getTurnoutKeyword_0());
            		
            // InternalRailLinesMap.g:377:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRailLinesMap.g:378:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRailLinesMap.g:378:4: (lv_name_1_0= RULE_ID )
            // InternalRailLinesMap.g:379:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTurnoutAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTurnoutRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getTurnoutAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTurnout"


    // $ANTLR start "entryRuleLocation"
    // InternalRailLinesMap.g:403:1: entryRuleLocation returns [EObject current=null] : iv_ruleLocation= ruleLocation EOF ;
    public final EObject entryRuleLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocation = null;


        try {
            // InternalRailLinesMap.g:403:49: (iv_ruleLocation= ruleLocation EOF )
            // InternalRailLinesMap.g:404:2: iv_ruleLocation= ruleLocation EOF
            {
             newCompositeNode(grammarAccess.getLocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocation=ruleLocation();

            state._fsp--;

             current =iv_ruleLocation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocation"


    // $ANTLR start "ruleLocation"
    // InternalRailLinesMap.g:410:1: ruleLocation returns [EObject current=null] : (this_StationTrackLocation_0= ruleStationTrackLocation | this_TurnoutEndLocation_1= ruleTurnoutEndLocation ) ;
    public final EObject ruleLocation() throws RecognitionException {
        EObject current = null;

        EObject this_StationTrackLocation_0 = null;

        EObject this_TurnoutEndLocation_1 = null;



        	enterRule();

        try {
            // InternalRailLinesMap.g:416:2: ( (this_StationTrackLocation_0= ruleStationTrackLocation | this_TurnoutEndLocation_1= ruleTurnoutEndLocation ) )
            // InternalRailLinesMap.g:417:2: (this_StationTrackLocation_0= ruleStationTrackLocation | this_TurnoutEndLocation_1= ruleTurnoutEndLocation )
            {
            // InternalRailLinesMap.g:417:2: (this_StationTrackLocation_0= ruleStationTrackLocation | this_TurnoutEndLocation_1= ruleTurnoutEndLocation )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==22) ) {
                    alt4=1;
                }
                else if ( (LA4_1==23) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRailLinesMap.g:418:3: this_StationTrackLocation_0= ruleStationTrackLocation
                    {

                    			newCompositeNode(grammarAccess.getLocationAccess().getStationTrackLocationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StationTrackLocation_0=ruleStationTrackLocation();

                    state._fsp--;


                    			current = this_StationTrackLocation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRailLinesMap.g:427:3: this_TurnoutEndLocation_1= ruleTurnoutEndLocation
                    {

                    			newCompositeNode(grammarAccess.getLocationAccess().getTurnoutEndLocationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TurnoutEndLocation_1=ruleTurnoutEndLocation();

                    state._fsp--;


                    			current = this_TurnoutEndLocation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocation"


    // $ANTLR start "entryRuleStationTrackLocation"
    // InternalRailLinesMap.g:439:1: entryRuleStationTrackLocation returns [EObject current=null] : iv_ruleStationTrackLocation= ruleStationTrackLocation EOF ;
    public final EObject entryRuleStationTrackLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStationTrackLocation = null;


        try {
            // InternalRailLinesMap.g:439:61: (iv_ruleStationTrackLocation= ruleStationTrackLocation EOF )
            // InternalRailLinesMap.g:440:2: iv_ruleStationTrackLocation= ruleStationTrackLocation EOF
            {
             newCompositeNode(grammarAccess.getStationTrackLocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStationTrackLocation=ruleStationTrackLocation();

            state._fsp--;

             current =iv_ruleStationTrackLocation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStationTrackLocation"


    // $ANTLR start "ruleStationTrackLocation"
    // InternalRailLinesMap.g:446:1: ruleStationTrackLocation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'track' ( (lv_track_2_0= RULE_INT ) ) ) ;
    public final EObject ruleStationTrackLocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_track_2_0=null;


        	enterRule();

        try {
            // InternalRailLinesMap.g:452:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'track' ( (lv_track_2_0= RULE_INT ) ) ) )
            // InternalRailLinesMap.g:453:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'track' ( (lv_track_2_0= RULE_INT ) ) )
            {
            // InternalRailLinesMap.g:453:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'track' ( (lv_track_2_0= RULE_INT ) ) )
            // InternalRailLinesMap.g:454:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'track' ( (lv_track_2_0= RULE_INT ) )
            {
            // InternalRailLinesMap.g:454:3: ( (otherlv_0= RULE_ID ) )
            // InternalRailLinesMap.g:455:4: (otherlv_0= RULE_ID )
            {
            // InternalRailLinesMap.g:455:4: (otherlv_0= RULE_ID )
            // InternalRailLinesMap.g:456:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStationTrackLocationRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_0, grammarAccess.getStationTrackLocationAccess().getStationStationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getStationTrackLocationAccess().getTrackKeyword_1());
            		
            // InternalRailLinesMap.g:471:3: ( (lv_track_2_0= RULE_INT ) )
            // InternalRailLinesMap.g:472:4: (lv_track_2_0= RULE_INT )
            {
            // InternalRailLinesMap.g:472:4: (lv_track_2_0= RULE_INT )
            // InternalRailLinesMap.g:473:5: lv_track_2_0= RULE_INT
            {
            lv_track_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_track_2_0, grammarAccess.getStationTrackLocationAccess().getTrackINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStationTrackLocationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"track",
            						lv_track_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStationTrackLocation"


    // $ANTLR start "entryRuleTurnoutEndLocation"
    // InternalRailLinesMap.g:493:1: entryRuleTurnoutEndLocation returns [EObject current=null] : iv_ruleTurnoutEndLocation= ruleTurnoutEndLocation EOF ;
    public final EObject entryRuleTurnoutEndLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnoutEndLocation = null;


        try {
            // InternalRailLinesMap.g:493:59: (iv_ruleTurnoutEndLocation= ruleTurnoutEndLocation EOF )
            // InternalRailLinesMap.g:494:2: iv_ruleTurnoutEndLocation= ruleTurnoutEndLocation EOF
            {
             newCompositeNode(grammarAccess.getTurnoutEndLocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTurnoutEndLocation=ruleTurnoutEndLocation();

            state._fsp--;

             current =iv_ruleTurnoutEndLocation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTurnoutEndLocation"


    // $ANTLR start "ruleTurnoutEndLocation"
    // InternalRailLinesMap.g:500:1: ruleTurnoutEndLocation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_end_2_0= ruleTurnoutEnd ) ) ) ;
    public final EObject ruleTurnoutEndLocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_end_2_0 = null;



        	enterRule();

        try {
            // InternalRailLinesMap.g:506:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_end_2_0= ruleTurnoutEnd ) ) ) )
            // InternalRailLinesMap.g:507:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_end_2_0= ruleTurnoutEnd ) ) )
            {
            // InternalRailLinesMap.g:507:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_end_2_0= ruleTurnoutEnd ) ) )
            // InternalRailLinesMap.g:508:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_end_2_0= ruleTurnoutEnd ) )
            {
            // InternalRailLinesMap.g:508:3: ( (otherlv_0= RULE_ID ) )
            // InternalRailLinesMap.g:509:4: (otherlv_0= RULE_ID )
            {
            // InternalRailLinesMap.g:509:4: (otherlv_0= RULE_ID )
            // InternalRailLinesMap.g:510:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTurnoutEndLocationRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_0, grammarAccess.getTurnoutEndLocationAccess().getTurnoutTurnoutCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getTurnoutEndLocationAccess().getFullStopKeyword_1());
            		
            // InternalRailLinesMap.g:525:3: ( (lv_end_2_0= ruleTurnoutEnd ) )
            // InternalRailLinesMap.g:526:4: (lv_end_2_0= ruleTurnoutEnd )
            {
            // InternalRailLinesMap.g:526:4: (lv_end_2_0= ruleTurnoutEnd )
            // InternalRailLinesMap.g:527:5: lv_end_2_0= ruleTurnoutEnd
            {

            					newCompositeNode(grammarAccess.getTurnoutEndLocationAccess().getEndTurnoutEndEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_end_2_0=ruleTurnoutEnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTurnoutEndLocationRule());
            					}
            					set(
            						current,
            						"end",
            						lv_end_2_0,
            						"hu.bme.mit.temalab.railmap.RailLinesMap.TurnoutEnd");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTurnoutEndLocation"


    // $ANTLR start "ruleTurnoutEnd"
    // InternalRailLinesMap.g:548:1: ruleTurnoutEnd returns [Enumerator current=null] : ( (enumLiteral_0= 'top' ) | (enumLiteral_1= 'straight' ) | (enumLiteral_2= 'divergent' ) ) ;
    public final Enumerator ruleTurnoutEnd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRailLinesMap.g:554:2: ( ( (enumLiteral_0= 'top' ) | (enumLiteral_1= 'straight' ) | (enumLiteral_2= 'divergent' ) ) )
            // InternalRailLinesMap.g:555:2: ( (enumLiteral_0= 'top' ) | (enumLiteral_1= 'straight' ) | (enumLiteral_2= 'divergent' ) )
            {
            // InternalRailLinesMap.g:555:2: ( (enumLiteral_0= 'top' ) | (enumLiteral_1= 'straight' ) | (enumLiteral_2= 'divergent' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt5=1;
                }
                break;
            case 25:
                {
                alt5=2;
                }
                break;
            case 26:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalRailLinesMap.g:556:3: (enumLiteral_0= 'top' )
                    {
                    // InternalRailLinesMap.g:556:3: (enumLiteral_0= 'top' )
                    // InternalRailLinesMap.g:557:4: enumLiteral_0= 'top'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getTurnoutEndAccess().getTOPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTurnoutEndAccess().getTOPEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRailLinesMap.g:564:3: (enumLiteral_1= 'straight' )
                    {
                    // InternalRailLinesMap.g:564:3: (enumLiteral_1= 'straight' )
                    // InternalRailLinesMap.g:565:4: enumLiteral_1= 'straight'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getTurnoutEndAccess().getSTRAIGHTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTurnoutEndAccess().getSTRAIGHTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRailLinesMap.g:572:3: (enumLiteral_2= 'divergent' )
                    {
                    // InternalRailLinesMap.g:572:3: (enumLiteral_2= 'divergent' )
                    // InternalRailLinesMap.g:573:4: enumLiteral_2= 'divergent'
                    {
                    enumLiteral_2=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getTurnoutEndAccess().getDIVERGENTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTurnoutEndAccess().getDIVERGENTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTurnoutEnd"


    // $ANTLR start "ruleGauge"
    // InternalRailLinesMap.g:583:1: ruleGauge returns [Enumerator current=null] : ( (enumLiteral_0= 'standard gauge' ) | (enumLiteral_1= 'narrow gauge' ) | (enumLiteral_2= 'broad gauge' ) ) ;
    public final Enumerator ruleGauge() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRailLinesMap.g:589:2: ( ( (enumLiteral_0= 'standard gauge' ) | (enumLiteral_1= 'narrow gauge' ) | (enumLiteral_2= 'broad gauge' ) ) )
            // InternalRailLinesMap.g:590:2: ( (enumLiteral_0= 'standard gauge' ) | (enumLiteral_1= 'narrow gauge' ) | (enumLiteral_2= 'broad gauge' ) )
            {
            // InternalRailLinesMap.g:590:2: ( (enumLiteral_0= 'standard gauge' ) | (enumLiteral_1= 'narrow gauge' ) | (enumLiteral_2= 'broad gauge' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt6=1;
                }
                break;
            case 28:
                {
                alt6=2;
                }
                break;
            case 29:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalRailLinesMap.g:591:3: (enumLiteral_0= 'standard gauge' )
                    {
                    // InternalRailLinesMap.g:591:3: (enumLiteral_0= 'standard gauge' )
                    // InternalRailLinesMap.g:592:4: enumLiteral_0= 'standard gauge'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getGaugeAccess().getSTANDARDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getGaugeAccess().getSTANDARDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRailLinesMap.g:599:3: (enumLiteral_1= 'narrow gauge' )
                    {
                    // InternalRailLinesMap.g:599:3: (enumLiteral_1= 'narrow gauge' )
                    // InternalRailLinesMap.g:600:4: enumLiteral_1= 'narrow gauge'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getGaugeAccess().getNARROWEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getGaugeAccess().getNARROWEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRailLinesMap.g:607:3: (enumLiteral_2= 'broad gauge' )
                    {
                    // InternalRailLinesMap.g:607:3: (enumLiteral_2= 'broad gauge' )
                    // InternalRailLinesMap.g:608:4: enumLiteral_2= 'broad gauge'
                    {
                    enumLiteral_2=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getGaugeAccess().getBROADEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getGaugeAccess().getBROADEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGauge"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000211002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000038008000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000007000000L});

}