// Generated from org/batfish/grammar/fortios/FortiosParser.g4 by ANTLR 4.7.2
package org.batfish.grammar.fortios;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FortiosParser extends org.batfish.grammar.fortios.parsing.FortiosBaseParser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		QUOTED_TEXT=1, STR_SEPARATOR=2, UNQUOTED_WORD_CHARS=3, ADMIN=4, ACTION=5, 
		ADDRESS=6, AGGREGATE=7, ALERTMAIL=8, ALIAS=9, ALLOW=10, ALLOW_ROUTING=11, 
		APPEND=12, ASSOCIATED_INTERFACE=13, AUTH=14, BUFFER=15, COLOR=16, COMMENT=17, 
		COMMENTS=18, CONFIG=19, COUNTRY=20, CUSTOM=21, DENY=22, DESCRIPTION=23, 
		DISABLE=24, DOWN=25, DSTADDR=26, DSTINTF=27, EDIT=28, DYNAMIC=29, EMAC_VLAN=30, 
		ENABLE=31, END=32, END_IP=33, FABRIC_OBJECT=34, FIREWALL=35, FORTIGUARD_WF=36, 
		FQDN=37, FTP=38, GEOGRAPHY=39, GLOBAL=40, HOSTNAME=41, HTTP=42, ICAP=43, 
		ICMP=44, ICMP6=45, ICMPCODE=46, ICMPTYPE=47, INTERFACE=48, INTERFACE_SUBNET=49, 
		INTRAZONE=50, IP=51, IPMASK=52, IPRANGE=53, IP_UPPER=54, IPSEC=55, LOOPBACK=56, 
		MAC=57, MAIL=58, MTU=59, MTU_OVERRIDE=60, NAC_QUAR=61, NAME=62, NEXT=63, 
		PHYSICAL=64, POLICY=65, PROTOCOL=66, PROTOCOL_NUMBER=67, REDUNDANT=68, 
		RENAME=69, REPLACEMSG=70, SCTP_PORTRANGE=71, SDN=72, SELECT=73, SERVICE=74, 
		SET=75, SNMP_INDEX=76, SPAM=77, SRCADDR=78, SRCINTF=79, SSLVPN=80, START_IP=81, 
		STATUS=82, SUBNET=83, SUB_TYPE=84, SYSTEM=85, TCP_PORTRANGE=86, TCP_UDP_SCTP=87, 
		TO=88, TRAFFIC_QUOTA=89, TUNNEL=90, TYPE=91, UDP_PORTRANGE=92, UNSET=93, 
		UP=94, UTM=95, VDOM=96, VLAN=97, VRF=98, WEBPROXY=99, WILDCARD=100, WL_MESH=101, 
		ZONE=102, BLANK_LINE=103, COLON=104, HYPHEN=105, COMMENT_LINE=106, DOUBLE_QUOTE=107, 
		SUBNET_MASK=108, IP_ADDRESS=109, IP_PREFIX=110, IPV6_ADDRESS=111, IPV6_PREFIX=112, 
		MAC_ADDRESS_LITERAL=113, NEWLINE=114, SINGLE_QUOTE=115, UINT8=116, UINT16=117, 
		UINT32=118, WS=119, M_Str_LINE_CONTINUATION=120, M_SingleStrValue_LINE_CONTINUATION=121, 
		M_SingleStrValue_WS=122;
	public static final int
		RULE_fortios_configuration = 0, RULE_statement = 1, RULE_s_config = 2, 
		RULE_cf_address = 3, RULE_cfa = 4, RULE_cfa_rename = 5, RULE_cfa_edit = 6, 
		RULE_cfae = 7, RULE_cfa_set_singletons = 8, RULE_cfa_set_allow_routing = 9, 
		RULE_cfa_set_associated_interface = 10, RULE_cfa_set_comment = 11, RULE_cfa_set_end_ip = 12, 
		RULE_cfa_set_interface = 13, RULE_cfa_set_fabric_object = 14, RULE_cfa_set_start_ip = 15, 
		RULE_cfa_set_subnet = 16, RULE_cfa_set_type = 17, RULE_cfa_set_wildcard = 18, 
		RULE_cfa_set_null = 19, RULE_address_type = 20, RULE_address_name = 21, 
		RULE_double_quoted_string = 22, RULE_single_quoted_string = 23, RULE_interface_or_zone_name = 24, 
		RULE_interface_names = 25, RULE_quoted_text = 26, RULE_ip_address = 27, 
		RULE_subnet_mask = 28, RULE_ip_prefix = 29, RULE_ip_address_with_mask_or_prefix = 30, 
		RULE_ip_wildcard = 31, RULE_ipv6_address = 32, RULE_ipv6_prefix = 33, 
		RULE_mac_address_literal = 34, RULE_newline = 35, RULE_null_rest_of_line = 36, 
		RULE_uint8 = 37, RULE_uint16 = 38, RULE_uint32 = 39, RULE_word = 40, RULE_str = 41, 
		RULE_str_content = 42, RULE_enable_or_disable = 43, RULE_up_or_down = 44, 
		RULE_port_range = 45, RULE_allow_or_deny = 46, RULE_c_firewall = 47, RULE_cs_interface = 48, 
		RULE_csi_edit = 49, RULE_csie = 50, RULE_csi_set_singletons = 51, RULE_csi_set_alias = 52, 
		RULE_csi_set_description = 53, RULE_csi_set_ip = 54, RULE_csi_set_mtu = 55, 
		RULE_csi_set_mtu_override = 56, RULE_csi_set_status = 57, RULE_csi_set_type = 58, 
		RULE_csi_set_vdom = 59, RULE_csi_set_vrf = 60, RULE_csi_set_null = 61, 
		RULE_mtu = 62, RULE_vrf = 63, RULE_interface_type = 64, RULE_interface_alias = 65, 
		RULE_interface_name = 66, RULE_cf_policy = 67, RULE_cfp_edit = 68, RULE_cfpe = 69, 
		RULE_cfp_set_singletons = 70, RULE_cfp_set_action = 71, RULE_cfp_set_comments = 72, 
		RULE_cfp_set_name = 73, RULE_cfp_set_status = 74, RULE_cfp_set_lists = 75, 
		RULE_cfp_set_dstaddr = 76, RULE_cfp_set_srcaddr = 77, RULE_cfp_set_service = 78, 
		RULE_cfp_set_dstintf = 79, RULE_cfp_set_srcintf = 80, RULE_cfp_append = 81, 
		RULE_cfp_append_dstaddr = 82, RULE_cfp_append_srcaddr = 83, RULE_cfp_append_service = 84, 
		RULE_cfp_append_dstintf = 85, RULE_cfp_append_srcintf = 86, RULE_policy_name = 87, 
		RULE_policy_status = 88, RULE_policy_number = 89, RULE_policy_action = 90, 
		RULE_address_names = 91, RULE_service_names = 92, RULE_interface_or_zone_names = 93, 
		RULE_cf_service = 94, RULE_cfs_custom = 95, RULE_cfsc = 96, RULE_cfsc_rename = 97, 
		RULE_cfsc_edit = 98, RULE_cfsce = 99, RULE_cfsc_set_singletons = 100, 
		RULE_cfsc_set_comment = 101, RULE_cfsc_set_icmpcode = 102, RULE_cfsc_set_icmptype = 103, 
		RULE_cfsc_set_protocol = 104, RULE_cfsc_set_protocol_number = 105, RULE_cfsc_set_sctp_portrange = 106, 
		RULE_cfsc_set_tcp_portrange = 107, RULE_cfsc_set_udp_portrange = 108, 
		RULE_service_name = 109, RULE_service_protocol = 110, RULE_service_port_ranges = 111, 
		RULE_service_port_range = 112, RULE_ip_protocol_number = 113, RULE_c_system = 114, 
		RULE_cs_global = 115, RULE_csg = 116, RULE_csg_hostname = 117, RULE_device_hostname = 118, 
		RULE_cs_replacemsg = 119, RULE_replacemsg_major_type = 120, RULE_replacemsg_minor_type = 121, 
		RULE_csr = 122, RULE_csr_set_buffer = 123, RULE_csr_unset_buffer = 124, 
		RULE_cs_zone = 125, RULE_csz = 126, RULE_csz_edit = 127, RULE_csz_rename = 128, 
		RULE_csze = 129, RULE_csz_set_singletons = 130, RULE_csz_set_description = 131, 
		RULE_csz_set_intrazone = 132, RULE_csz_set_interface = 133, RULE_csz_append_interface = 134, 
		RULE_zone_name = 135;
	private static String[] makeRuleNames() {
		return new String[] {
			"fortios_configuration", "statement", "s_config", "cf_address", "cfa", 
			"cfa_rename", "cfa_edit", "cfae", "cfa_set_singletons", "cfa_set_allow_routing", 
			"cfa_set_associated_interface", "cfa_set_comment", "cfa_set_end_ip", 
			"cfa_set_interface", "cfa_set_fabric_object", "cfa_set_start_ip", "cfa_set_subnet", 
			"cfa_set_type", "cfa_set_wildcard", "cfa_set_null", "address_type", "address_name", 
			"double_quoted_string", "single_quoted_string", "interface_or_zone_name", 
			"interface_names", "quoted_text", "ip_address", "subnet_mask", "ip_prefix", 
			"ip_address_with_mask_or_prefix", "ip_wildcard", "ipv6_address", "ipv6_prefix", 
			"mac_address_literal", "newline", "null_rest_of_line", "uint8", "uint16", 
			"uint32", "word", "str", "str_content", "enable_or_disable", "up_or_down", 
			"port_range", "allow_or_deny", "c_firewall", "cs_interface", "csi_edit", 
			"csie", "csi_set_singletons", "csi_set_alias", "csi_set_description", 
			"csi_set_ip", "csi_set_mtu", "csi_set_mtu_override", "csi_set_status", 
			"csi_set_type", "csi_set_vdom", "csi_set_vrf", "csi_set_null", "mtu", 
			"vrf", "interface_type", "interface_alias", "interface_name", "cf_policy", 
			"cfp_edit", "cfpe", "cfp_set_singletons", "cfp_set_action", "cfp_set_comments", 
			"cfp_set_name", "cfp_set_status", "cfp_set_lists", "cfp_set_dstaddr", 
			"cfp_set_srcaddr", "cfp_set_service", "cfp_set_dstintf", "cfp_set_srcintf", 
			"cfp_append", "cfp_append_dstaddr", "cfp_append_srcaddr", "cfp_append_service", 
			"cfp_append_dstintf", "cfp_append_srcintf", "policy_name", "policy_status", 
			"policy_number", "policy_action", "address_names", "service_names", "interface_or_zone_names", 
			"cf_service", "cfs_custom", "cfsc", "cfsc_rename", "cfsc_edit", "cfsce", 
			"cfsc_set_singletons", "cfsc_set_comment", "cfsc_set_icmpcode", "cfsc_set_icmptype", 
			"cfsc_set_protocol", "cfsc_set_protocol_number", "cfsc_set_sctp_portrange", 
			"cfsc_set_tcp_portrange", "cfsc_set_udp_portrange", "service_name", "service_protocol", 
			"service_port_ranges", "service_port_range", "ip_protocol_number", "c_system", 
			"cs_global", "csg", "csg_hostname", "device_hostname", "cs_replacemsg", 
			"replacemsg_major_type", "replacemsg_minor_type", "csr", "csr_set_buffer", 
			"csr_unset_buffer", "cs_zone", "csz", "csz_edit", "csz_rename", "csze", 
			"csz_set_singletons", "csz_set_description", "csz_set_intrazone", "csz_set_interface", 
			"csz_append_interface", "zone_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'admin'", "'action'", "'address'", "'aggregate'", 
			"'alertmail'", "'alias'", "'allow'", "'allow-routing'", "'append'", "'associated-interface'", 
			"'auth'", "'buffer'", "'color'", "'comment'", "'comments'", "'config'", 
			"'country'", "'custom'", "'deny'", "'description'", "'disable'", "'down'", 
			"'dstaddr'", "'dstintf'", "'edit'", "'dynamic'", "'emac-vlan'", "'enable'", 
			"'end'", "'end-ip'", "'fabric-object'", "'firewall'", "'fortiguard-wf'", 
			"'fqdn'", "'ftp'", "'geography'", "'global'", "'hostname'", "'http'", 
			"'icap'", "'ICMP'", "'ICMP6'", "'icmpcode'", "'icmptype'", "'interface'", 
			"'interface-subnet'", "'intrazone'", "'ip'", "'ipmask'", "'iprange'", 
			"'IP'", "'ipsec'", "'loopback'", "'mac'", "'mail'", "'mtu'", "'mtu-override'", 
			"'nac-quar'", "'name'", "'next'", "'physical'", "'policy'", "'protocol'", 
			"'protocol-number'", "'redundant'", "'rename'", "'replacemsg'", "'sctp-portrange'", 
			"'sdn'", "'select'", "'service'", "'set'", "'snmp-index'", "'spam'", 
			"'srcaddr'", "'srcintf'", "'sslvpn'", "'start-ip'", "'status'", "'subnet'", 
			"'sub-type'", "'system'", "'tcp-portrange'", "'TCP/UDP/SCTP'", "'to'", 
			"'traffic-quota'", "'tunnel'", "'type'", "'udp-portrange'", "'unset'", 
			"'up'", "'utm'", "'vdom'", "'vlan'", "'vrf'", "'webproxy'", "'wildcard'", 
			"'wl-mesh'", "'zone'", null, "':'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "QUOTED_TEXT", "STR_SEPARATOR", "UNQUOTED_WORD_CHARS", "ADMIN", 
			"ACTION", "ADDRESS", "AGGREGATE", "ALERTMAIL", "ALIAS", "ALLOW", "ALLOW_ROUTING", 
			"APPEND", "ASSOCIATED_INTERFACE", "AUTH", "BUFFER", "COLOR", "COMMENT", 
			"COMMENTS", "CONFIG", "COUNTRY", "CUSTOM", "DENY", "DESCRIPTION", "DISABLE", 
			"DOWN", "DSTADDR", "DSTINTF", "EDIT", "DYNAMIC", "EMAC_VLAN", "ENABLE", 
			"END", "END_IP", "FABRIC_OBJECT", "FIREWALL", "FORTIGUARD_WF", "FQDN", 
			"FTP", "GEOGRAPHY", "GLOBAL", "HOSTNAME", "HTTP", "ICAP", "ICMP", "ICMP6", 
			"ICMPCODE", "ICMPTYPE", "INTERFACE", "INTERFACE_SUBNET", "INTRAZONE", 
			"IP", "IPMASK", "IPRANGE", "IP_UPPER", "IPSEC", "LOOPBACK", "MAC", "MAIL", 
			"MTU", "MTU_OVERRIDE", "NAC_QUAR", "NAME", "NEXT", "PHYSICAL", "POLICY", 
			"PROTOCOL", "PROTOCOL_NUMBER", "REDUNDANT", "RENAME", "REPLACEMSG", "SCTP_PORTRANGE", 
			"SDN", "SELECT", "SERVICE", "SET", "SNMP_INDEX", "SPAM", "SRCADDR", "SRCINTF", 
			"SSLVPN", "START_IP", "STATUS", "SUBNET", "SUB_TYPE", "SYSTEM", "TCP_PORTRANGE", 
			"TCP_UDP_SCTP", "TO", "TRAFFIC_QUOTA", "TUNNEL", "TYPE", "UDP_PORTRANGE", 
			"UNSET", "UP", "UTM", "VDOM", "VLAN", "VRF", "WEBPROXY", "WILDCARD", 
			"WL_MESH", "ZONE", "BLANK_LINE", "COLON", "HYPHEN", "COMMENT_LINE", "DOUBLE_QUOTE", 
			"SUBNET_MASK", "IP_ADDRESS", "IP_PREFIX", "IPV6_ADDRESS", "IPV6_PREFIX", 
			"MAC_ADDRESS_LITERAL", "NEWLINE", "SINGLE_QUOTE", "UINT8", "UINT16", 
			"UINT32", "WS", "M_Str_LINE_CONTINUATION", "M_SingleStrValue_LINE_CONTINUATION", 
			"M_SingleStrValue_WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "FortiosParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FortiosParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Fortios_configurationContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(FortiosParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Fortios_configurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fortios_configuration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterFortios_configuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitFortios_configuration(this);
		}
	}

	public final Fortios_configurationContext fortios_configuration() throws RecognitionException {
		Fortios_configurationContext _localctx = new Fortios_configurationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_fortios_configuration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(272);
				statement();
				}
				}
				setState(275); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CONFIG );
			setState(277);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public S_configContext s_config() {
			return getRuleContext(S_configContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			s_config();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class S_configContext extends ParserRuleContext {
		public TerminalNode CONFIG() { return getToken(FortiosParser.CONFIG, 0); }
		public TerminalNode END() { return getToken(FortiosParser.END, 0); }
		public TerminalNode NEWLINE() { return getToken(FortiosParser.NEWLINE, 0); }
		public C_systemContext c_system() {
			return getRuleContext(C_systemContext.class,0);
		}
		public C_firewallContext c_firewall() {
			return getRuleContext(C_firewallContext.class,0);
		}
		public S_configContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_config; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterS_config(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitS_config(this);
		}
	}

	public final S_configContext s_config() throws RecognitionException {
		S_configContext _localctx = new S_configContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_s_config);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(CONFIG);
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SYSTEM:
				{
				setState(282);
				c_system();
				}
				break;
			case FIREWALL:
				{
				setState(283);
				c_firewall();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(286);
			match(END);
			setState(287);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cf_addressContext extends ParserRuleContext {
		public TerminalNode ADDRESS() { return getToken(FortiosParser.ADDRESS, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public List<CfaContext> cfa() {
			return getRuleContexts(CfaContext.class);
		}
		public CfaContext cfa(int i) {
			return getRuleContext(CfaContext.class,i);
		}
		public Cf_addressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cf_address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCf_address(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCf_address(this);
		}
	}

	public final Cf_addressContext cf_address() throws RecognitionException {
		Cf_addressContext _localctx = new Cf_addressContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cf_address);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(ADDRESS);
			setState(290);
			newline();
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EDIT || _la==RENAME) {
				{
				{
				setState(291);
				cfa();
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CfaContext extends ParserRuleContext {
		public Cfa_editContext cfa_edit() {
			return getRuleContext(Cfa_editContext.class,0);
		}
		public Cfa_renameContext cfa_rename() {
			return getRuleContext(Cfa_renameContext.class,0);
		}
		public CfaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfa(this);
		}
	}

	public final CfaContext cfa() throws RecognitionException {
		CfaContext _localctx = new CfaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cfa);
		try {
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				cfa_edit();
				}
				break;
			case RENAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				cfa_rename();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfa_renameContext extends ParserRuleContext {
		public Address_nameContext current_name;
		public Address_nameContext new_name;
		public TerminalNode RENAME() { return getToken(FortiosParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(FortiosParser.TO, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public List<Address_nameContext> address_name() {
			return getRuleContexts(Address_nameContext.class);
		}
		public Address_nameContext address_name(int i) {
			return getRuleContext(Address_nameContext.class,i);
		}
		public Cfa_renameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfa_rename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfa_rename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfa_rename(this);
		}
	}

	public final Cfa_renameContext cfa_rename() throws RecognitionException {
		Cfa_renameContext _localctx = new Cfa_renameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cfa_rename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(RENAME);
			setState(302);
			((Cfa_renameContext)_localctx).current_name = address_name();
			setState(303);
			match(TO);
			setState(304);
			((Cfa_renameContext)_localctx).new_name = address_name();
			setState(305);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfa_editContext extends ParserRuleContext {
		public TerminalNode EDIT() { return getToken(FortiosParser.EDIT, 0); }
		public Address_nameContext address_name() {
			return getRuleContext(Address_nameContext.class,0);
		}
		public List<NewlineContext> newline() {
			return getRuleContexts(NewlineContext.class);
		}
		public NewlineContext newline(int i) {
			return getRuleContext(NewlineContext.class,i);
		}
		public TerminalNode NEXT() { return getToken(FortiosParser.NEXT, 0); }
		public List<CfaeContext> cfae() {
			return getRuleContexts(CfaeContext.class);
		}
		public CfaeContext cfae(int i) {
			return getRuleContext(CfaeContext.class,i);
		}
		public Cfa_editContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfa_edit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfa_edit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfa_edit(this);
		}
	}

	public final Cfa_editContext cfa_edit() throws RecognitionException {
		Cfa_editContext _localctx = new Cfa_editContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cfa_edit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(EDIT);
			setState(308);
			address_name();
			setState(309);
			newline();
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SET) {
				{
				{
				setState(310);
				cfae();
				}
				}
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(316);
			match(NEXT);
			setState(317);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CfaeContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(FortiosParser.SET, 0); }
		public Cfa_set_singletonsContext cfa_set_singletons() {
			return getRuleContext(Cfa_set_singletonsContext.class,0);
		}
		public CfaeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfae; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfae(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfae(this);
		}
	}

	public final CfaeContext cfae() throws RecognitionException {
		CfaeContext _localctx = new CfaeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cfae);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(SET);
			setState(320);
			cfa_set_singletons();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfa_set_singletonsContext extends ParserRuleContext {
		public Cfa_set_allow_routingContext cfa_set_allow_routing() {
			return getRuleContext(Cfa_set_allow_routingContext.class,0);
		}
		public Cfa_set_associated_interfaceContext cfa_set_associated_interface() {
			return getRuleContext(Cfa_set_associated_interfaceContext.class,0);
		}
		public Cfa_set_commentContext cfa_set_comment() {
			return getRuleContext(Cfa_set_commentContext.class,0);
		}
		public Cfa_set_end_ipContext cfa_set_end_ip() {
			return getRuleContext(Cfa_set_end_ipContext.class,0);
		}
		public Cfa_set_interfaceContext cfa_set_interface() {
			return getRuleContext(Cfa_set_interfaceContext.class,0);
		}
		public Cfa_set_fabric_objectContext cfa_set_fabric_object() {
			return getRuleContext(Cfa_set_fabric_objectContext.class,0);
		}
		public Cfa_set_start_ipContext cfa_set_start_ip() {
			return getRuleContext(Cfa_set_start_ipContext.class,0);
		}
		public Cfa_set_subnetContext cfa_set_subnet() {
			return getRuleContext(Cfa_set_subnetContext.class,0);
		}
		public Cfa_set_typeContext cfa_set_type() {
			return getRuleContext(Cfa_set_typeContext.class,0);
		}
		public Cfa_set_wildcardContext cfa_set_wildcard() {
			return getRuleContext(Cfa_set_wildcardContext.class,0);
		}
		public Cfa_set_nullContext cfa_set_null() {
			return getRuleContext(Cfa_set_nullContext.class,0);
		}
		public Cfa_set_singletonsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfa_set_singletons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfa_set_singletons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfa_set_singletons(this);
		}
	}

	public final Cfa_set_singletonsContext cfa_set_singletons() throws RecognitionException {
		Cfa_set_singletonsContext _localctx = new Cfa_set_singletonsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cfa_set_singletons);
		try {
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALLOW_ROUTING:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				cfa_set_allow_routing();
				}
				break;
			case ASSOCIATED_INTERFACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				cfa_set_associated_interface();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
				cfa_set_comment();
				}
				break;
			case END_IP:
				enterOuterAlt(_localctx, 4);
				{
				setState(325);
				cfa_set_end_ip();
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 5);
				{
				setState(326);
				cfa_set_interface();
				}
				break;
			case FABRIC_OBJECT:
				enterOuterAlt(_localctx, 6);
				{
				setState(327);
				cfa_set_fabric_object();
				}
				break;
			case START_IP:
				enterOuterAlt(_localctx, 7);
				{
				setState(328);
				cfa_set_start_ip();
				}
				break;
			case SUBNET:
				enterOuterAlt(_localctx, 8);
				{
				setState(329);
				cfa_set_subnet();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 9);
				{
				setState(330);
				cfa_set_type();
				}
				break;
			case WILDCARD:
				enterOuterAlt(_localctx, 10);
				{
				setState(331);
				cfa_set_wildcard();
				}
				break;
			case COLOR:
			case COUNTRY:
			case FQDN:
			case SDN:
			case SUB_TYPE:
				enterOuterAlt(_localctx, 11);
				{
				setState(332);
				cfa_set_null();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfa_set_allow_routingContext extends ParserRuleContext {
		public Enable_or_disableContext value;
		public TerminalNode ALLOW_ROUTING() { return getToken(FortiosParser.ALLOW_ROUTING, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Enable_or_disableContext enable_or_disable() {
			return getRuleContext(Enable_or_disableContext.class,0);
		}
		public Cfa_set_allow_routingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfa_set_allow_routing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfa_set_allow_routing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfa_set_allow_routing(this);
		}
	}

	public final Cfa_set_allow_routingContext cfa_set_allow_routing() throws RecognitionException {
		Cfa_set_allow_routingContext _localctx = new Cfa_set_allow_routingContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cfa_set_allow_routing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(ALLOW_ROUTING);
			setState(336);
			((Cfa_set_allow_routingContext)_localctx).value = enable_or_disable();
			setState(337);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfa_set_associated_interfaceContext extends ParserRuleContext {
		public Interface_or_zone_nameContext name;
		public TerminalNode ASSOCIATED_INTERFACE() { return getToken(FortiosParser.ASSOCIATED_INTERFACE, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Interface_or_zone_nameContext interface_or_zone_name() {
			return getRuleContext(Interface_or_zone_nameContext.class,0);
		}
		public Cfa_set_associated_interfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfa_set_associated_interface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfa_set_associated_interface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfa_set_associated_interface(this);
		}
	}

	public final Cfa_set_associated_interfaceContext cfa_set_associated_interface() throws RecognitionException {
		Cfa_set_associated_interfaceContext _localctx = new Cfa_set_associated_interfaceContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cfa_set_associated_interface);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(ASSOCIATED_INTERFACE);
			setState(340);
			((Cfa_set_associated_interfaceContext)_localctx).name = interface_or_zone_name();
			setState(341);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfa_set_commentContext extends ParserRuleContext {
		public StrContext comment;
		public TerminalNode COMMENT() { return getToken(FortiosParser.COMMENT, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public Cfa_set_commentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfa_set_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfa_set_comment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfa_set_comment(this);
		}
	}

	public final Cfa_set_commentContext cfa_set_comment() throws RecognitionException {
		Cfa_set_commentContext _localctx = new Cfa_set_commentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cfa_set_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(COMMENT);
			setState(344);
			((Cfa_set_commentContext)_localctx).comment = str();
			setState(345);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfa_set_end_ipContext extends ParserRuleContext {
		public Ip_addressContext ip;
		public TerminalNode END_IP() { return getToken(FortiosParser.END_IP, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Ip_addressContext ip_address() {
			return getRuleContext(Ip_addressContext.class,0);
		}
		public Cfa_set_end_ipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfa_set_end_ip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfa_set_end_ip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfa_set_end_ip(this);
		}
	}

	public final Cfa_set_end_ipContext cfa_set_end_ip() throws RecognitionException {
		Cfa_set_end_ipContext _localctx = new Cfa_set_end_ipContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cfa_set_end_ip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(END_IP);
			setState(348);
			((Cfa_set_end_ipContext)_localctx).ip = ip_address();
			setState(349);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfa_set_interfaceContext extends ParserRuleContext {
		public Interface_nameContext name;
		public TerminalNode INTERFACE() { return getToken(FortiosParser.INTERFACE, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Interface_nameContext interface_name() {
			return getRuleContext(Interface_nameContext.class,0);
		}
		public Cfa_set_interfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfa_set_interface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfa_set_interface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfa_set_interface(this);
		}
	}

	public final Cfa_set_interfaceContext cfa_set_interface() throws RecognitionException {
		Cfa_set_interfaceContext _localctx = new Cfa_set_interfaceContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cfa_set_interface);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(INTERFACE);
			setState(352);
			((Cfa_set_interfaceContext)_localctx).name = interface_name();
			setState(353);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfa_set_fabric_objectContext extends ParserRuleContext {
		public Enable_or_disableContext value;
		public TerminalNode FABRIC_OBJECT() { return getToken(FortiosParser.FABRIC_OBJECT, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Enable_or_disableContext enable_or_disable() {
			return getRuleContext(Enable_or_disableContext.class,0);
		}
		public Cfa_set_fabric_objectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfa_set_fabric_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfa_set_fabric_object(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfa_set_fabric_object(this);
		}
	}

	public final Cfa_set_fabric_objectContext cfa_set_fabric_object() throws RecognitionException {
		Cfa_set_fabric_objectContext _localctx = new Cfa_set_fabric_objectContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cfa_set_fabric_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(FABRIC_OBJECT);
			setState(356);
			((Cfa_set_fabric_objectContext)_localctx).value = enable_or_disable();
			setState(357);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfa_set_start_ipContext extends ParserRuleContext {
		public Ip_addressContext ip;
		public TerminalNode START_IP() { return getToken(FortiosParser.START_IP, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Ip_addressContext ip_address() {
			return getRuleContext(Ip_addressContext.class,0);
		}
		public Cfa_set_start_ipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfa_set_start_ip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfa_set_start_ip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfa_set_start_ip(this);
		}
	}

	public final Cfa_set_start_ipContext cfa_set_start_ip() throws RecognitionException {
		Cfa_set_start_ipContext _localctx = new Cfa_set_start_ipContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cfa_set_start_ip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(START_IP);
			setState(360);
			((Cfa_set_start_ipContext)_localctx).ip = ip_address();
			setState(361);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfa_set_subnetContext extends ParserRuleContext {
		public Ip_address_with_mask_or_prefixContext subnet;
		public TerminalNode SUBNET() { return getToken(FortiosParser.SUBNET, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Ip_address_with_mask_or_prefixContext ip_address_with_mask_or_prefix() {
			return getRuleContext(Ip_address_with_mask_or_prefixContext.class,0);
		}
		public Cfa_set_subnetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfa_set_subnet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfa_set_subnet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfa_set_subnet(this);
		}
	}

	public final Cfa_set_subnetContext cfa_set_subnet() throws RecognitionException {
		Cfa_set_subnetContext _localctx = new Cfa_set_subnetContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_cfa_set_subnet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(SUBNET);
			setState(364);
			((Cfa_set_subnetContext)_localctx).subnet = ip_address_with_mask_or_prefix();
			setState(365);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfa_set_typeContext extends ParserRuleContext {
		public Address_typeContext type;
		public TerminalNode TYPE() { return getToken(FortiosParser.TYPE, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Address_typeContext address_type() {
			return getRuleContext(Address_typeContext.class,0);
		}
		public Cfa_set_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfa_set_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfa_set_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfa_set_type(this);
		}
	}

	public final Cfa_set_typeContext cfa_set_type() throws RecognitionException {
		Cfa_set_typeContext _localctx = new Cfa_set_typeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cfa_set_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(TYPE);
			setState(368);
			((Cfa_set_typeContext)_localctx).type = address_type();
			setState(369);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfa_set_wildcardContext extends ParserRuleContext {
		public Ip_wildcardContext wildcard;
		public TerminalNode WILDCARD() { return getToken(FortiosParser.WILDCARD, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Ip_wildcardContext ip_wildcard() {
			return getRuleContext(Ip_wildcardContext.class,0);
		}
		public Cfa_set_wildcardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfa_set_wildcard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfa_set_wildcard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfa_set_wildcard(this);
		}
	}

	public final Cfa_set_wildcardContext cfa_set_wildcard() throws RecognitionException {
		Cfa_set_wildcardContext _localctx = new Cfa_set_wildcardContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cfa_set_wildcard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(WILDCARD);
			setState(372);
			((Cfa_set_wildcardContext)_localctx).wildcard = ip_wildcard();
			setState(373);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfa_set_nullContext extends ParserRuleContext {
		public Null_rest_of_lineContext null_rest_of_line() {
			return getRuleContext(Null_rest_of_lineContext.class,0);
		}
		public TerminalNode COLOR() { return getToken(FortiosParser.COLOR, 0); }
		public TerminalNode COUNTRY() { return getToken(FortiosParser.COUNTRY, 0); }
		public TerminalNode FQDN() { return getToken(FortiosParser.FQDN, 0); }
		public TerminalNode SDN() { return getToken(FortiosParser.SDN, 0); }
		public TerminalNode SUB_TYPE() { return getToken(FortiosParser.SUB_TYPE, 0); }
		public Cfa_set_nullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfa_set_null; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfa_set_null(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfa_set_null(this);
		}
	}

	public final Cfa_set_nullContext cfa_set_null() throws RecognitionException {
		Cfa_set_nullContext _localctx = new Cfa_set_nullContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cfa_set_null);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLOR) | (1L << COUNTRY) | (1L << FQDN))) != 0) || _la==SDN || _la==SUB_TYPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(376);
			null_rest_of_line();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Address_typeContext extends ParserRuleContext {
		public TerminalNode IPMASK() { return getToken(FortiosParser.IPMASK, 0); }
		public TerminalNode IPRANGE() { return getToken(FortiosParser.IPRANGE, 0); }
		public TerminalNode FQDN() { return getToken(FortiosParser.FQDN, 0); }
		public TerminalNode GEOGRAPHY() { return getToken(FortiosParser.GEOGRAPHY, 0); }
		public TerminalNode WILDCARD() { return getToken(FortiosParser.WILDCARD, 0); }
		public TerminalNode DYNAMIC() { return getToken(FortiosParser.DYNAMIC, 0); }
		public TerminalNode INTERFACE_SUBNET() { return getToken(FortiosParser.INTERFACE_SUBNET, 0); }
		public TerminalNode MAC() { return getToken(FortiosParser.MAC, 0); }
		public Address_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_address_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterAddress_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitAddress_type(this);
		}
	}

	public final Address_typeContext address_type() throws RecognitionException {
		Address_typeContext _localctx = new Address_typeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_address_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DYNAMIC) | (1L << FQDN) | (1L << GEOGRAPHY) | (1L << INTERFACE_SUBNET) | (1L << IPMASK) | (1L << IPRANGE) | (1L << MAC))) != 0) || _la==WILDCARD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Address_nameContext extends ParserRuleContext {
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public Address_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_address_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterAddress_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitAddress_name(this);
		}
	}

	public final Address_nameContext address_name() throws RecognitionException {
		Address_nameContext _localctx = new Address_nameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_address_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			str();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Double_quoted_stringContext extends ParserRuleContext {
		public Quoted_textContext text;
		public List<TerminalNode> DOUBLE_QUOTE() { return getTokens(FortiosParser.DOUBLE_QUOTE); }
		public TerminalNode DOUBLE_QUOTE(int i) {
			return getToken(FortiosParser.DOUBLE_QUOTE, i);
		}
		public Quoted_textContext quoted_text() {
			return getRuleContext(Quoted_textContext.class,0);
		}
		public Double_quoted_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_quoted_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterDouble_quoted_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitDouble_quoted_string(this);
		}
	}

	public final Double_quoted_stringContext double_quoted_string() throws RecognitionException {
		Double_quoted_stringContext _localctx = new Double_quoted_stringContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_double_quoted_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(DOUBLE_QUOTE);
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUOTED_TEXT) {
				{
				setState(383);
				((Double_quoted_stringContext)_localctx).text = quoted_text();
				}
			}

			setState(386);
			match(DOUBLE_QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_quoted_stringContext extends ParserRuleContext {
		public Quoted_textContext text;
		public List<TerminalNode> SINGLE_QUOTE() { return getTokens(FortiosParser.SINGLE_QUOTE); }
		public TerminalNode SINGLE_QUOTE(int i) {
			return getToken(FortiosParser.SINGLE_QUOTE, i);
		}
		public Quoted_textContext quoted_text() {
			return getRuleContext(Quoted_textContext.class,0);
		}
		public Single_quoted_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_quoted_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterSingle_quoted_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitSingle_quoted_string(this);
		}
	}

	public final Single_quoted_stringContext single_quoted_string() throws RecognitionException {
		Single_quoted_stringContext _localctx = new Single_quoted_stringContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_single_quoted_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(SINGLE_QUOTE);
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUOTED_TEXT) {
				{
				setState(389);
				((Single_quoted_stringContext)_localctx).text = quoted_text();
				}
			}

			setState(392);
			match(SINGLE_QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_or_zone_nameContext extends ParserRuleContext {
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public Interface_or_zone_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_or_zone_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterInterface_or_zone_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitInterface_or_zone_name(this);
		}
	}

	public final Interface_or_zone_nameContext interface_or_zone_name() throws RecognitionException {
		Interface_or_zone_nameContext _localctx = new Interface_or_zone_nameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_interface_or_zone_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			str();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_namesContext extends ParserRuleContext {
		public List<Interface_nameContext> interface_name() {
			return getRuleContexts(Interface_nameContext.class);
		}
		public Interface_nameContext interface_name(int i) {
			return getRuleContext(Interface_nameContext.class,i);
		}
		public Interface_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterInterface_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitInterface_names(this);
		}
	}

	public final Interface_namesContext interface_names() throws RecognitionException {
		Interface_namesContext _localctx = new Interface_namesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_interface_names);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(397); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(396);
					interface_name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(399); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Quoted_textContext extends ParserRuleContext {
		public List<TerminalNode> QUOTED_TEXT() { return getTokens(FortiosParser.QUOTED_TEXT); }
		public TerminalNode QUOTED_TEXT(int i) {
			return getToken(FortiosParser.QUOTED_TEXT, i);
		}
		public Quoted_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quoted_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterQuoted_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitQuoted_text(this);
		}
	}

	public final Quoted_textContext quoted_text() throws RecognitionException {
		Quoted_textContext _localctx = new Quoted_textContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_quoted_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(401);
				match(QUOTED_TEXT);
				}
				}
				setState(404); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==QUOTED_TEXT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ip_addressContext extends ParserRuleContext {
		public TerminalNode IP_ADDRESS() { return getToken(FortiosParser.IP_ADDRESS, 0); }
		public TerminalNode SUBNET_MASK() { return getToken(FortiosParser.SUBNET_MASK, 0); }
		public Ip_addressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ip_address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterIp_address(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitIp_address(this);
		}
	}

	public final Ip_addressContext ip_address() throws RecognitionException {
		Ip_addressContext _localctx = new Ip_addressContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ip_address);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			_la = _input.LA(1);
			if ( !(_la==SUBNET_MASK || _la==IP_ADDRESS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subnet_maskContext extends ParserRuleContext {
		public TerminalNode SUBNET_MASK() { return getToken(FortiosParser.SUBNET_MASK, 0); }
		public Subnet_maskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subnet_mask; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterSubnet_mask(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitSubnet_mask(this);
		}
	}

	public final Subnet_maskContext subnet_mask() throws RecognitionException {
		Subnet_maskContext _localctx = new Subnet_maskContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_subnet_mask);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(SUBNET_MASK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ip_prefixContext extends ParserRuleContext {
		public TerminalNode IP_PREFIX() { return getToken(FortiosParser.IP_PREFIX, 0); }
		public Ip_prefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ip_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterIp_prefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitIp_prefix(this);
		}
	}

	public final Ip_prefixContext ip_prefix() throws RecognitionException {
		Ip_prefixContext _localctx = new Ip_prefixContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ip_prefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(IP_PREFIX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ip_address_with_mask_or_prefixContext extends ParserRuleContext {
		public Ip_addressContext ip_address() {
			return getRuleContext(Ip_addressContext.class,0);
		}
		public Subnet_maskContext subnet_mask() {
			return getRuleContext(Subnet_maskContext.class,0);
		}
		public Ip_prefixContext ip_prefix() {
			return getRuleContext(Ip_prefixContext.class,0);
		}
		public Ip_address_with_mask_or_prefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ip_address_with_mask_or_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterIp_address_with_mask_or_prefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitIp_address_with_mask_or_prefix(this);
		}
	}

	public final Ip_address_with_mask_or_prefixContext ip_address_with_mask_or_prefix() throws RecognitionException {
		Ip_address_with_mask_or_prefixContext _localctx = new Ip_address_with_mask_or_prefixContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ip_address_with_mask_or_prefix);
		try {
			setState(416);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUBNET_MASK:
			case IP_ADDRESS:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				ip_address();
				setState(413);
				subnet_mask();
				}
				break;
			case IP_PREFIX:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				ip_prefix();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ip_wildcardContext extends ParserRuleContext {
		public Ip_addressContext ip;
		public Ip_addressContext mask;
		public List<Ip_addressContext> ip_address() {
			return getRuleContexts(Ip_addressContext.class);
		}
		public Ip_addressContext ip_address(int i) {
			return getRuleContext(Ip_addressContext.class,i);
		}
		public Ip_wildcardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ip_wildcard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterIp_wildcard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitIp_wildcard(this);
		}
	}

	public final Ip_wildcardContext ip_wildcard() throws RecognitionException {
		Ip_wildcardContext _localctx = new Ip_wildcardContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ip_wildcard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			((Ip_wildcardContext)_localctx).ip = ip_address();
			setState(419);
			((Ip_wildcardContext)_localctx).mask = ip_address();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ipv6_addressContext extends ParserRuleContext {
		public TerminalNode IPV6_ADDRESS() { return getToken(FortiosParser.IPV6_ADDRESS, 0); }
		public Ipv6_addressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipv6_address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterIpv6_address(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitIpv6_address(this);
		}
	}

	public final Ipv6_addressContext ipv6_address() throws RecognitionException {
		Ipv6_addressContext _localctx = new Ipv6_addressContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_ipv6_address);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(IPV6_ADDRESS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ipv6_prefixContext extends ParserRuleContext {
		public TerminalNode IPV6_PREFIX() { return getToken(FortiosParser.IPV6_PREFIX, 0); }
		public Ipv6_prefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipv6_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterIpv6_prefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitIpv6_prefix(this);
		}
	}

	public final Ipv6_prefixContext ipv6_prefix() throws RecognitionException {
		Ipv6_prefixContext _localctx = new Ipv6_prefixContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_ipv6_prefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(IPV6_PREFIX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mac_address_literalContext extends ParserRuleContext {
		public TerminalNode MAC_ADDRESS_LITERAL() { return getToken(FortiosParser.MAC_ADDRESS_LITERAL, 0); }
		public Mac_address_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mac_address_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterMac_address_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitMac_address_literal(this);
		}
	}

	public final Mac_address_literalContext mac_address_literal() throws RecognitionException {
		Mac_address_literalContext _localctx = new Mac_address_literalContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_mac_address_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(MAC_ADDRESS_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewlineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(FortiosParser.NEWLINE, 0); }
		public TerminalNode STR_SEPARATOR() { return getToken(FortiosParser.STR_SEPARATOR, 0); }
		public NewlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterNewline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitNewline(this);
		}
	}

	public final NewlineContext newline() throws RecognitionException {
		NewlineContext _localctx = new NewlineContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_newline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STR_SEPARATOR) {
				{
				setState(427);
				match(STR_SEPARATOR);
				}
			}

			setState(430);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_rest_of_lineContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(FortiosParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FortiosParser.NEWLINE, i);
		}
		public Null_rest_of_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_rest_of_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterNull_rest_of_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitNull_rest_of_line(this);
		}
	}

	public final Null_rest_of_lineContext null_rest_of_line() throws RecognitionException {
		Null_rest_of_lineContext _localctx = new Null_rest_of_lineContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_null_rest_of_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUOTED_TEXT) | (1L << STR_SEPARATOR) | (1L << UNQUOTED_WORD_CHARS) | (1L << ADMIN) | (1L << ACTION) | (1L << ADDRESS) | (1L << AGGREGATE) | (1L << ALERTMAIL) | (1L << ALIAS) | (1L << ALLOW) | (1L << ALLOW_ROUTING) | (1L << APPEND) | (1L << ASSOCIATED_INTERFACE) | (1L << AUTH) | (1L << BUFFER) | (1L << COLOR) | (1L << COMMENT) | (1L << COMMENTS) | (1L << CONFIG) | (1L << COUNTRY) | (1L << CUSTOM) | (1L << DENY) | (1L << DESCRIPTION) | (1L << DISABLE) | (1L << DOWN) | (1L << DSTADDR) | (1L << DSTINTF) | (1L << EDIT) | (1L << DYNAMIC) | (1L << EMAC_VLAN) | (1L << ENABLE) | (1L << END) | (1L << END_IP) | (1L << FABRIC_OBJECT) | (1L << FIREWALL) | (1L << FORTIGUARD_WF) | (1L << FQDN) | (1L << FTP) | (1L << GEOGRAPHY) | (1L << GLOBAL) | (1L << HOSTNAME) | (1L << HTTP) | (1L << ICAP) | (1L << ICMP) | (1L << ICMP6) | (1L << ICMPCODE) | (1L << ICMPTYPE) | (1L << INTERFACE) | (1L << INTERFACE_SUBNET) | (1L << INTRAZONE) | (1L << IP) | (1L << IPMASK) | (1L << IPRANGE) | (1L << IP_UPPER) | (1L << IPSEC) | (1L << LOOPBACK) | (1L << MAC) | (1L << MAIL) | (1L << MTU) | (1L << MTU_OVERRIDE) | (1L << NAC_QUAR) | (1L << NAME) | (1L << NEXT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PHYSICAL - 64)) | (1L << (POLICY - 64)) | (1L << (PROTOCOL - 64)) | (1L << (PROTOCOL_NUMBER - 64)) | (1L << (REDUNDANT - 64)) | (1L << (RENAME - 64)) | (1L << (REPLACEMSG - 64)) | (1L << (SCTP_PORTRANGE - 64)) | (1L << (SDN - 64)) | (1L << (SELECT - 64)) | (1L << (SERVICE - 64)) | (1L << (SET - 64)) | (1L << (SNMP_INDEX - 64)) | (1L << (SPAM - 64)) | (1L << (SRCADDR - 64)) | (1L << (SRCINTF - 64)) | (1L << (SSLVPN - 64)) | (1L << (START_IP - 64)) | (1L << (STATUS - 64)) | (1L << (SUBNET - 64)) | (1L << (SUB_TYPE - 64)) | (1L << (SYSTEM - 64)) | (1L << (TCP_PORTRANGE - 64)) | (1L << (TCP_UDP_SCTP - 64)) | (1L << (TO - 64)) | (1L << (TRAFFIC_QUOTA - 64)) | (1L << (TUNNEL - 64)) | (1L << (TYPE - 64)) | (1L << (UDP_PORTRANGE - 64)) | (1L << (UNSET - 64)) | (1L << (UP - 64)) | (1L << (UTM - 64)) | (1L << (VDOM - 64)) | (1L << (VLAN - 64)) | (1L << (VRF - 64)) | (1L << (WEBPROXY - 64)) | (1L << (WILDCARD - 64)) | (1L << (WL_MESH - 64)) | (1L << (ZONE - 64)) | (1L << (BLANK_LINE - 64)) | (1L << (COLON - 64)) | (1L << (HYPHEN - 64)) | (1L << (COMMENT_LINE - 64)) | (1L << (DOUBLE_QUOTE - 64)) | (1L << (SUBNET_MASK - 64)) | (1L << (IP_ADDRESS - 64)) | (1L << (IP_PREFIX - 64)) | (1L << (IPV6_ADDRESS - 64)) | (1L << (IPV6_PREFIX - 64)) | (1L << (MAC_ADDRESS_LITERAL - 64)) | (1L << (SINGLE_QUOTE - 64)) | (1L << (UINT8 - 64)) | (1L << (UINT16 - 64)) | (1L << (UINT32 - 64)) | (1L << (WS - 64)) | (1L << (M_Str_LINE_CONTINUATION - 64)) | (1L << (M_SingleStrValue_LINE_CONTINUATION - 64)) | (1L << (M_SingleStrValue_WS - 64)))) != 0)) {
				{
				{
				setState(432);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(438);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Uint8Context extends ParserRuleContext {
		public TerminalNode UINT8() { return getToken(FortiosParser.UINT8, 0); }
		public Uint8Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uint8; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterUint8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitUint8(this);
		}
	}

	public final Uint8Context uint8() throws RecognitionException {
		Uint8Context _localctx = new Uint8Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_uint8);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(UINT8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Uint16Context extends ParserRuleContext {
		public TerminalNode UINT8() { return getToken(FortiosParser.UINT8, 0); }
		public TerminalNode UINT16() { return getToken(FortiosParser.UINT16, 0); }
		public Uint16Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uint16; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterUint16(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitUint16(this);
		}
	}

	public final Uint16Context uint16() throws RecognitionException {
		Uint16Context _localctx = new Uint16Context(_ctx, getState());
		enterRule(_localctx, 76, RULE_uint16);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			_la = _input.LA(1);
			if ( !(_la==UINT8 || _la==UINT16) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Uint32Context extends ParserRuleContext {
		public TerminalNode UINT8() { return getToken(FortiosParser.UINT8, 0); }
		public TerminalNode UINT16() { return getToken(FortiosParser.UINT16, 0); }
		public TerminalNode UINT32() { return getToken(FortiosParser.UINT32, 0); }
		public Uint32Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uint32; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterUint32(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitUint32(this);
		}
	}

	public final Uint32Context uint32() throws RecognitionException {
		Uint32Context _localctx = new Uint32Context(_ctx, getState());
		enterRule(_localctx, 78, RULE_uint32);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			_la = _input.LA(1);
			if ( !(((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (UINT8 - 116)) | (1L << (UINT16 - 116)) | (1L << (UINT32 - 116)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WordContext extends ParserRuleContext {
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitWord(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_word);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			str();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrContext extends ParserRuleContext {
		public TerminalNode STR_SEPARATOR() { return getToken(FortiosParser.STR_SEPARATOR, 0); }
		public Str_contentContext str_content() {
			return getRuleContext(Str_contentContext.class,0);
		}
		public StrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitStr(this);
		}
	}

	public final StrContext str() throws RecognitionException {
		StrContext _localctx = new StrContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(STR_SEPARATOR);
			setState(449);
			str_content();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Str_contentContext extends ParserRuleContext {
		public List<Double_quoted_stringContext> double_quoted_string() {
			return getRuleContexts(Double_quoted_stringContext.class);
		}
		public Double_quoted_stringContext double_quoted_string(int i) {
			return getRuleContext(Double_quoted_stringContext.class,i);
		}
		public List<Single_quoted_stringContext> single_quoted_string() {
			return getRuleContexts(Single_quoted_stringContext.class);
		}
		public Single_quoted_stringContext single_quoted_string(int i) {
			return getRuleContext(Single_quoted_stringContext.class,i);
		}
		public List<TerminalNode> UNQUOTED_WORD_CHARS() { return getTokens(FortiosParser.UNQUOTED_WORD_CHARS); }
		public TerminalNode UNQUOTED_WORD_CHARS(int i) {
			return getToken(FortiosParser.UNQUOTED_WORD_CHARS, i);
		}
		public Str_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterStr_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitStr_content(this);
		}
	}

	public final Str_contentContext str_content() throws RecognitionException {
		Str_contentContext _localctx = new Str_contentContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_str_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(454);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOUBLE_QUOTE:
					{
					setState(451);
					double_quoted_string();
					}
					break;
				case SINGLE_QUOTE:
					{
					setState(452);
					single_quoted_string();
					}
					break;
				case UNQUOTED_WORD_CHARS:
					{
					setState(453);
					match(UNQUOTED_WORD_CHARS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(456); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==UNQUOTED_WORD_CHARS || _la==DOUBLE_QUOTE || _la==SINGLE_QUOTE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enable_or_disableContext extends ParserRuleContext {
		public TerminalNode ENABLE() { return getToken(FortiosParser.ENABLE, 0); }
		public TerminalNode DISABLE() { return getToken(FortiosParser.DISABLE, 0); }
		public Enable_or_disableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enable_or_disable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterEnable_or_disable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitEnable_or_disable(this);
		}
	}

	public final Enable_or_disableContext enable_or_disable() throws RecognitionException {
		Enable_or_disableContext _localctx = new Enable_or_disableContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_enable_or_disable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			_la = _input.LA(1);
			if ( !(_la==DISABLE || _la==ENABLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Up_or_downContext extends ParserRuleContext {
		public TerminalNode UP() { return getToken(FortiosParser.UP, 0); }
		public TerminalNode DOWN() { return getToken(FortiosParser.DOWN, 0); }
		public Up_or_downContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_up_or_down; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterUp_or_down(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitUp_or_down(this);
		}
	}

	public final Up_or_downContext up_or_down() throws RecognitionException {
		Up_or_downContext _localctx = new Up_or_downContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_up_or_down);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			_la = _input.LA(1);
			if ( !(_la==DOWN || _la==UP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Port_rangeContext extends ParserRuleContext {
		public Uint16Context port_low;
		public Uint16Context port_high;
		public List<Uint16Context> uint16() {
			return getRuleContexts(Uint16Context.class);
		}
		public Uint16Context uint16(int i) {
			return getRuleContext(Uint16Context.class,i);
		}
		public TerminalNode HYPHEN() { return getToken(FortiosParser.HYPHEN, 0); }
		public Port_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_port_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterPort_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitPort_range(this);
		}
	}

	public final Port_rangeContext port_range() throws RecognitionException {
		Port_rangeContext _localctx = new Port_rangeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_port_range);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			((Port_rangeContext)_localctx).port_low = uint16();
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HYPHEN) {
				{
				setState(463);
				match(HYPHEN);
				setState(464);
				((Port_rangeContext)_localctx).port_high = uint16();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Allow_or_denyContext extends ParserRuleContext {
		public TerminalNode ALLOW() { return getToken(FortiosParser.ALLOW, 0); }
		public TerminalNode DENY() { return getToken(FortiosParser.DENY, 0); }
		public Allow_or_denyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allow_or_deny; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterAllow_or_deny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitAllow_or_deny(this);
		}
	}

	public final Allow_or_denyContext allow_or_deny() throws RecognitionException {
		Allow_or_denyContext _localctx = new Allow_or_denyContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_allow_or_deny);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			_la = _input.LA(1);
			if ( !(_la==ALLOW || _la==DENY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class C_firewallContext extends ParserRuleContext {
		public TerminalNode FIREWALL() { return getToken(FortiosParser.FIREWALL, 0); }
		public Cf_addressContext cf_address() {
			return getRuleContext(Cf_addressContext.class,0);
		}
		public Cf_policyContext cf_policy() {
			return getRuleContext(Cf_policyContext.class,0);
		}
		public Cf_serviceContext cf_service() {
			return getRuleContext(Cf_serviceContext.class,0);
		}
		public C_firewallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_firewall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterC_firewall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitC_firewall(this);
		}
	}

	public final C_firewallContext c_firewall() throws RecognitionException {
		C_firewallContext _localctx = new C_firewallContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_c_firewall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(FIREWALL);
			setState(473);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADDRESS:
				{
				setState(470);
				cf_address();
				}
				break;
			case POLICY:
				{
				setState(471);
				cf_policy();
				}
				break;
			case SERVICE:
				{
				setState(472);
				cf_service();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cs_interfaceContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(FortiosParser.INTERFACE, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public List<Csi_editContext> csi_edit() {
			return getRuleContexts(Csi_editContext.class);
		}
		public Csi_editContext csi_edit(int i) {
			return getRuleContext(Csi_editContext.class,i);
		}
		public Cs_interfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cs_interface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCs_interface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCs_interface(this);
		}
	}

	public final Cs_interfaceContext cs_interface() throws RecognitionException {
		Cs_interfaceContext _localctx = new Cs_interfaceContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_cs_interface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(INTERFACE);
			setState(476);
			newline();
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EDIT) {
				{
				{
				setState(477);
				csi_edit();
				}
				}
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Csi_editContext extends ParserRuleContext {
		public TerminalNode EDIT() { return getToken(FortiosParser.EDIT, 0); }
		public Interface_nameContext interface_name() {
			return getRuleContext(Interface_nameContext.class,0);
		}
		public List<NewlineContext> newline() {
			return getRuleContexts(NewlineContext.class);
		}
		public NewlineContext newline(int i) {
			return getRuleContext(NewlineContext.class,i);
		}
		public TerminalNode NEXT() { return getToken(FortiosParser.NEXT, 0); }
		public List<CsieContext> csie() {
			return getRuleContexts(CsieContext.class);
		}
		public CsieContext csie(int i) {
			return getRuleContext(CsieContext.class,i);
		}
		public Csi_editContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csi_edit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCsi_edit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCsi_edit(this);
		}
	}

	public final Csi_editContext csi_edit() throws RecognitionException {
		Csi_editContext _localctx = new Csi_editContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_csi_edit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(EDIT);
			setState(484);
			interface_name();
			setState(485);
			newline();
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SET) {
				{
				{
				setState(486);
				csie();
				}
				}
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(492);
			match(NEXT);
			setState(493);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CsieContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(FortiosParser.SET, 0); }
		public Csi_set_singletonsContext csi_set_singletons() {
			return getRuleContext(Csi_set_singletonsContext.class,0);
		}
		public CsieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCsie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCsie(this);
		}
	}

	public final CsieContext csie() throws RecognitionException {
		CsieContext _localctx = new CsieContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_csie);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(SET);
			setState(496);
			csi_set_singletons();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Csi_set_singletonsContext extends ParserRuleContext {
		public Csi_set_aliasContext csi_set_alias() {
			return getRuleContext(Csi_set_aliasContext.class,0);
		}
		public Csi_set_descriptionContext csi_set_description() {
			return getRuleContext(Csi_set_descriptionContext.class,0);
		}
		public Csi_set_ipContext csi_set_ip() {
			return getRuleContext(Csi_set_ipContext.class,0);
		}
		public Csi_set_mtuContext csi_set_mtu() {
			return getRuleContext(Csi_set_mtuContext.class,0);
		}
		public Csi_set_mtu_overrideContext csi_set_mtu_override() {
			return getRuleContext(Csi_set_mtu_overrideContext.class,0);
		}
		public Csi_set_statusContext csi_set_status() {
			return getRuleContext(Csi_set_statusContext.class,0);
		}
		public Csi_set_typeContext csi_set_type() {
			return getRuleContext(Csi_set_typeContext.class,0);
		}
		public Csi_set_vdomContext csi_set_vdom() {
			return getRuleContext(Csi_set_vdomContext.class,0);
		}
		public Csi_set_vrfContext csi_set_vrf() {
			return getRuleContext(Csi_set_vrfContext.class,0);
		}
		public Csi_set_nullContext csi_set_null() {
			return getRuleContext(Csi_set_nullContext.class,0);
		}
		public Csi_set_singletonsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csi_set_singletons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCsi_set_singletons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCsi_set_singletons(this);
		}
	}

	public final Csi_set_singletonsContext csi_set_singletons() throws RecognitionException {
		Csi_set_singletonsContext _localctx = new Csi_set_singletonsContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_csi_set_singletons);
		try {
			setState(508);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALIAS:
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
				csi_set_alias();
				}
				break;
			case DESCRIPTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(499);
				csi_set_description();
				}
				break;
			case IP:
				enterOuterAlt(_localctx, 3);
				{
				setState(500);
				csi_set_ip();
				}
				break;
			case MTU:
				enterOuterAlt(_localctx, 4);
				{
				setState(501);
				csi_set_mtu();
				}
				break;
			case MTU_OVERRIDE:
				enterOuterAlt(_localctx, 5);
				{
				setState(502);
				csi_set_mtu_override();
				}
				break;
			case STATUS:
				enterOuterAlt(_localctx, 6);
				{
				setState(503);
				csi_set_status();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 7);
				{
				setState(504);
				csi_set_type();
				}
				break;
			case VDOM:
				enterOuterAlt(_localctx, 8);
				{
				setState(505);
				csi_set_vdom();
				}
				break;
			case VRF:
				enterOuterAlt(_localctx, 9);
				{
				setState(506);
				csi_set_vrf();
				}
				break;
			case SNMP_INDEX:
				enterOuterAlt(_localctx, 10);
				{
				setState(507);
				csi_set_null();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Csi_set_aliasContext extends ParserRuleContext {
		public Interface_aliasContext alias;
		public TerminalNode ALIAS() { return getToken(FortiosParser.ALIAS, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Interface_aliasContext interface_alias() {
			return getRuleContext(Interface_aliasContext.class,0);
		}
		public Csi_set_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csi_set_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCsi_set_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCsi_set_alias(this);
		}
	}

	public final Csi_set_aliasContext csi_set_alias() throws RecognitionException {
		Csi_set_aliasContext _localctx = new Csi_set_aliasContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_csi_set_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(ALIAS);
			setState(511);
			((Csi_set_aliasContext)_localctx).alias = interface_alias();
			setState(512);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Csi_set_descriptionContext extends ParserRuleContext {
		public StrContext description;
		public TerminalNode DESCRIPTION() { return getToken(FortiosParser.DESCRIPTION, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public Csi_set_descriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csi_set_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCsi_set_description(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCsi_set_description(this);
		}
	}

	public final Csi_set_descriptionContext csi_set_description() throws RecognitionException {
		Csi_set_descriptionContext _localctx = new Csi_set_descriptionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_csi_set_description);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(DESCRIPTION);
			setState(515);
			((Csi_set_descriptionContext)_localctx).description = str();
			setState(516);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Csi_set_ipContext extends ParserRuleContext {
		public Ip_address_with_mask_or_prefixContext ip;
		public TerminalNode IP() { return getToken(FortiosParser.IP, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Ip_address_with_mask_or_prefixContext ip_address_with_mask_or_prefix() {
			return getRuleContext(Ip_address_with_mask_or_prefixContext.class,0);
		}
		public Csi_set_ipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csi_set_ip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCsi_set_ip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCsi_set_ip(this);
		}
	}

	public final Csi_set_ipContext csi_set_ip() throws RecognitionException {
		Csi_set_ipContext _localctx = new Csi_set_ipContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_csi_set_ip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(IP);
			setState(519);
			((Csi_set_ipContext)_localctx).ip = ip_address_with_mask_or_prefix();
			setState(520);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Csi_set_mtuContext extends ParserRuleContext {
		public MtuContext value;
		public TerminalNode MTU() { return getToken(FortiosParser.MTU, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public MtuContext mtu() {
			return getRuleContext(MtuContext.class,0);
		}
		public Csi_set_mtuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csi_set_mtu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCsi_set_mtu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCsi_set_mtu(this);
		}
	}

	public final Csi_set_mtuContext csi_set_mtu() throws RecognitionException {
		Csi_set_mtuContext _localctx = new Csi_set_mtuContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_csi_set_mtu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(MTU);
			setState(523);
			((Csi_set_mtuContext)_localctx).value = mtu();
			setState(524);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Csi_set_mtu_overrideContext extends ParserRuleContext {
		public Enable_or_disableContext value;
		public TerminalNode MTU_OVERRIDE() { return getToken(FortiosParser.MTU_OVERRIDE, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Enable_or_disableContext enable_or_disable() {
			return getRuleContext(Enable_or_disableContext.class,0);
		}
		public Csi_set_mtu_overrideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csi_set_mtu_override; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCsi_set_mtu_override(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCsi_set_mtu_override(this);
		}
	}

	public final Csi_set_mtu_overrideContext csi_set_mtu_override() throws RecognitionException {
		Csi_set_mtu_overrideContext _localctx = new Csi_set_mtu_overrideContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_csi_set_mtu_override);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(MTU_OVERRIDE);
			setState(527);
			((Csi_set_mtu_overrideContext)_localctx).value = enable_or_disable();
			setState(528);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Csi_set_statusContext extends ParserRuleContext {
		public Up_or_downContext status;
		public TerminalNode STATUS() { return getToken(FortiosParser.STATUS, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Up_or_downContext up_or_down() {
			return getRuleContext(Up_or_downContext.class,0);
		}
		public Csi_set_statusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csi_set_status; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCsi_set_status(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCsi_set_status(this);
		}
	}

	public final Csi_set_statusContext csi_set_status() throws RecognitionException {
		Csi_set_statusContext _localctx = new Csi_set_statusContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_csi_set_status);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(STATUS);
			setState(531);
			((Csi_set_statusContext)_localctx).status = up_or_down();
			setState(532);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Csi_set_typeContext extends ParserRuleContext {
		public Interface_typeContext type;
		public TerminalNode TYPE() { return getToken(FortiosParser.TYPE, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Interface_typeContext interface_type() {
			return getRuleContext(Interface_typeContext.class,0);
		}
		public Csi_set_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csi_set_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCsi_set_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCsi_set_type(this);
		}
	}

	public final Csi_set_typeContext csi_set_type() throws RecognitionException {
		Csi_set_typeContext _localctx = new Csi_set_typeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_csi_set_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(TYPE);
			setState(535);
			((Csi_set_typeContext)_localctx).type = interface_type();
			setState(536);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Csi_set_vdomContext extends ParserRuleContext {
		public StrContext vdom;
		public TerminalNode VDOM() { return getToken(FortiosParser.VDOM, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public Csi_set_vdomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csi_set_vdom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCsi_set_vdom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCsi_set_vdom(this);
		}
	}

	public final Csi_set_vdomContext csi_set_vdom() throws RecognitionException {
		Csi_set_vdomContext _localctx = new Csi_set_vdomContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_csi_set_vdom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(VDOM);
			setState(539);
			((Csi_set_vdomContext)_localctx).vdom = str();
			setState(540);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Csi_set_vrfContext extends ParserRuleContext {
		public VrfContext value;
		public TerminalNode VRF() { return getToken(FortiosParser.VRF, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public VrfContext vrf() {
			return getRuleContext(VrfContext.class,0);
		}
		public Csi_set_vrfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csi_set_vrf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCsi_set_vrf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCsi_set_vrf(this);
		}
	}

	public final Csi_set_vrfContext csi_set_vrf() throws RecognitionException {
		Csi_set_vrfContext _localctx = new Csi_set_vrfContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_csi_set_vrf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(VRF);
			setState(543);
			((Csi_set_vrfContext)_localctx).value = vrf();
			setState(544);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Csi_set_nullContext extends ParserRuleContext {
		public TerminalNode SNMP_INDEX() { return getToken(FortiosParser.SNMP_INDEX, 0); }
		public Null_rest_of_lineContext null_rest_of_line() {
			return getRuleContext(Null_rest_of_lineContext.class,0);
		}
		public Csi_set_nullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csi_set_null; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCsi_set_null(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCsi_set_null(this);
		}
	}

	public final Csi_set_nullContext csi_set_null() throws RecognitionException {
		Csi_set_nullContext _localctx = new Csi_set_nullContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_csi_set_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			match(SNMP_INDEX);
			setState(547);
			null_rest_of_line();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MtuContext extends ParserRuleContext {
		public Uint16Context uint16() {
			return getRuleContext(Uint16Context.class,0);
		}
		public MtuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mtu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterMtu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitMtu(this);
		}
	}

	public final MtuContext mtu() throws RecognitionException {
		MtuContext _localctx = new MtuContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_mtu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			uint16();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VrfContext extends ParserRuleContext {
		public Uint8Context uint8() {
			return getRuleContext(Uint8Context.class,0);
		}
		public VrfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vrf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterVrf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitVrf(this);
		}
	}

	public final VrfContext vrf() throws RecognitionException {
		VrfContext _localctx = new VrfContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_vrf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			uint8();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_typeContext extends ParserRuleContext {
		public TerminalNode AGGREGATE() { return getToken(FortiosParser.AGGREGATE, 0); }
		public TerminalNode EMAC_VLAN() { return getToken(FortiosParser.EMAC_VLAN, 0); }
		public TerminalNode LOOPBACK() { return getToken(FortiosParser.LOOPBACK, 0); }
		public TerminalNode PHYSICAL() { return getToken(FortiosParser.PHYSICAL, 0); }
		public TerminalNode REDUNDANT() { return getToken(FortiosParser.REDUNDANT, 0); }
		public TerminalNode TUNNEL() { return getToken(FortiosParser.TUNNEL, 0); }
		public TerminalNode VLAN() { return getToken(FortiosParser.VLAN, 0); }
		public TerminalNode WL_MESH() { return getToken(FortiosParser.WL_MESH, 0); }
		public Interface_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterInterface_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitInterface_type(this);
		}
	}

	public final Interface_typeContext interface_type() throws RecognitionException {
		Interface_typeContext _localctx = new Interface_typeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_interface_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AGGREGATE) | (1L << EMAC_VLAN) | (1L << LOOPBACK))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PHYSICAL - 64)) | (1L << (REDUNDANT - 64)) | (1L << (TUNNEL - 64)) | (1L << (VLAN - 64)) | (1L << (WL_MESH - 64)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_aliasContext extends ParserRuleContext {
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public Interface_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterInterface_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitInterface_alias(this);
		}
	}

	public final Interface_aliasContext interface_alias() throws RecognitionException {
		Interface_aliasContext _localctx = new Interface_aliasContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_interface_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			str();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_nameContext extends ParserRuleContext {
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public Interface_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterInterface_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitInterface_name(this);
		}
	}

	public final Interface_nameContext interface_name() throws RecognitionException {
		Interface_nameContext _localctx = new Interface_nameContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_interface_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			str();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cf_policyContext extends ParserRuleContext {
		public TerminalNode POLICY() { return getToken(FortiosParser.POLICY, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public List<Cfp_editContext> cfp_edit() {
			return getRuleContexts(Cfp_editContext.class);
		}
		public Cfp_editContext cfp_edit(int i) {
			return getRuleContext(Cfp_editContext.class,i);
		}
		public Cf_policyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cf_policy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCf_policy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCf_policy(this);
		}
	}

	public final Cf_policyContext cf_policy() throws RecognitionException {
		Cf_policyContext _localctx = new Cf_policyContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_cf_policy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			match(POLICY);
			setState(560);
			newline();
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EDIT) {
				{
				{
				setState(561);
				cfp_edit();
				}
				}
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfp_editContext extends ParserRuleContext {
		public TerminalNode EDIT() { return getToken(FortiosParser.EDIT, 0); }
		public Policy_numberContext policy_number() {
			return getRuleContext(Policy_numberContext.class,0);
		}
		public List<NewlineContext> newline() {
			return getRuleContexts(NewlineContext.class);
		}
		public NewlineContext newline(int i) {
			return getRuleContext(NewlineContext.class,i);
		}
		public TerminalNode NEXT() { return getToken(FortiosParser.NEXT, 0); }
		public List<CfpeContext> cfpe() {
			return getRuleContexts(CfpeContext.class);
		}
		public CfpeContext cfpe(int i) {
			return getRuleContext(CfpeContext.class,i);
		}
		public Cfp_editContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfp_edit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfp_edit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfp_edit(this);
		}
	}

	public final Cfp_editContext cfp_edit() throws RecognitionException {
		Cfp_editContext _localctx = new Cfp_editContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_cfp_edit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			match(EDIT);
			setState(568);
			policy_number();
			setState(569);
			newline();
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & ((1L << (APPEND - 12)) | (1L << (SELECT - 12)) | (1L << (SET - 12)))) != 0)) {
				{
				{
				setState(570);
				cfpe();
				}
				}
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(576);
			match(NEXT);
			setState(577);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CfpeContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(FortiosParser.SET, 0); }
		public TerminalNode APPEND() { return getToken(FortiosParser.APPEND, 0); }
		public Cfp_appendContext cfp_append() {
			return getRuleContext(Cfp_appendContext.class,0);
		}
		public TerminalNode SELECT() { return getToken(FortiosParser.SELECT, 0); }
		public Cfp_set_listsContext cfp_set_lists() {
			return getRuleContext(Cfp_set_listsContext.class,0);
		}
		public Cfp_set_singletonsContext cfp_set_singletons() {
			return getRuleContext(Cfp_set_singletonsContext.class,0);
		}
		public CfpeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfpe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfpe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfpe(this);
		}
	}

	public final CfpeContext cfpe() throws RecognitionException {
		CfpeContext _localctx = new CfpeContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_cfpe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				{
				setState(579);
				match(SET);
				setState(582);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ACTION:
				case COMMENTS:
				case NAME:
				case STATUS:
					{
					setState(580);
					cfp_set_singletons();
					}
					break;
				case DSTADDR:
				case DSTINTF:
				case SERVICE:
				case SRCADDR:
				case SRCINTF:
					{
					setState(581);
					cfp_set_lists();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case APPEND:
				{
				setState(584);
				match(APPEND);
				setState(585);
				cfp_append();
				}
				break;
			case SELECT:
				{
				setState(586);
				match(SELECT);
				setState(587);
				cfp_set_lists();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfp_set_singletonsContext extends ParserRuleContext {
		public Cfp_set_actionContext cfp_set_action() {
			return getRuleContext(Cfp_set_actionContext.class,0);
		}
		public Cfp_set_commentsContext cfp_set_comments() {
			return getRuleContext(Cfp_set_commentsContext.class,0);
		}
		public Cfp_set_nameContext cfp_set_name() {
			return getRuleContext(Cfp_set_nameContext.class,0);
		}
		public Cfp_set_statusContext cfp_set_status() {
			return getRuleContext(Cfp_set_statusContext.class,0);
		}
		public Cfp_set_singletonsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfp_set_singletons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfp_set_singletons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfp_set_singletons(this);
		}
	}

	public final Cfp_set_singletonsContext cfp_set_singletons() throws RecognitionException {
		Cfp_set_singletonsContext _localctx = new Cfp_set_singletonsContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_cfp_set_singletons);
		try {
			setState(594);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(590);
				cfp_set_action();
				}
				break;
			case COMMENTS:
				enterOuterAlt(_localctx, 2);
				{
				setState(591);
				cfp_set_comments();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(592);
				cfp_set_name();
				}
				break;
			case STATUS:
				enterOuterAlt(_localctx, 4);
				{
				setState(593);
				cfp_set_status();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfp_set_actionContext extends ParserRuleContext {
		public Policy_actionContext action;
		public TerminalNode ACTION() { return getToken(FortiosParser.ACTION, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Policy_actionContext policy_action() {
			return getRuleContext(Policy_actionContext.class,0);
		}
		public Cfp_set_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfp_set_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfp_set_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfp_set_action(this);
		}
	}

	public final Cfp_set_actionContext cfp_set_action() throws RecognitionException {
		Cfp_set_actionContext _localctx = new Cfp_set_actionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_cfp_set_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			match(ACTION);
			setState(597);
			((Cfp_set_actionContext)_localctx).action = policy_action();
			setState(598);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfp_set_commentsContext extends ParserRuleContext {
		public StrContext comments;
		public TerminalNode COMMENTS() { return getToken(FortiosParser.COMMENTS, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public Cfp_set_commentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfp_set_comments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfp_set_comments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfp_set_comments(this);
		}
	}

	public final Cfp_set_commentsContext cfp_set_comments() throws RecognitionException {
		Cfp_set_commentsContext _localctx = new Cfp_set_commentsContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_cfp_set_comments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(COMMENTS);
			setState(601);
			((Cfp_set_commentsContext)_localctx).comments = str();
			setState(602);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfp_set_nameContext extends ParserRuleContext {
		public Policy_nameContext name;
		public TerminalNode NAME() { return getToken(FortiosParser.NAME, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Policy_nameContext policy_name() {
			return getRuleContext(Policy_nameContext.class,0);
		}
		public Cfp_set_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfp_set_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfp_set_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfp_set_name(this);
		}
	}

	public final Cfp_set_nameContext cfp_set_name() throws RecognitionException {
		Cfp_set_nameContext _localctx = new Cfp_set_nameContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_cfp_set_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(NAME);
			setState(605);
			((Cfp_set_nameContext)_localctx).name = policy_name();
			setState(606);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfp_set_statusContext extends ParserRuleContext {
		public Policy_statusContext status;
		public TerminalNode STATUS() { return getToken(FortiosParser.STATUS, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Policy_statusContext policy_status() {
			return getRuleContext(Policy_statusContext.class,0);
		}
		public Cfp_set_statusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfp_set_status; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfp_set_status(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfp_set_status(this);
		}
	}

	public final Cfp_set_statusContext cfp_set_status() throws RecognitionException {
		Cfp_set_statusContext _localctx = new Cfp_set_statusContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_cfp_set_status);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(STATUS);
			setState(609);
			((Cfp_set_statusContext)_localctx).status = policy_status();
			setState(610);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfp_set_listsContext extends ParserRuleContext {
		public Cfp_set_dstaddrContext cfp_set_dstaddr() {
			return getRuleContext(Cfp_set_dstaddrContext.class,0);
		}
		public Cfp_set_dstintfContext cfp_set_dstintf() {
			return getRuleContext(Cfp_set_dstintfContext.class,0);
		}
		public Cfp_set_serviceContext cfp_set_service() {
			return getRuleContext(Cfp_set_serviceContext.class,0);
		}
		public Cfp_set_srcaddrContext cfp_set_srcaddr() {
			return getRuleContext(Cfp_set_srcaddrContext.class,0);
		}
		public Cfp_set_srcintfContext cfp_set_srcintf() {
			return getRuleContext(Cfp_set_srcintfContext.class,0);
		}
		public Cfp_set_listsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfp_set_lists; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfp_set_lists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfp_set_lists(this);
		}
	}

	public final Cfp_set_listsContext cfp_set_lists() throws RecognitionException {
		Cfp_set_listsContext _localctx = new Cfp_set_listsContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_cfp_set_lists);
		try {
			setState(617);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DSTADDR:
				enterOuterAlt(_localctx, 1);
				{
				setState(612);
				cfp_set_dstaddr();
				}
				break;
			case DSTINTF:
				enterOuterAlt(_localctx, 2);
				{
				setState(613);
				cfp_set_dstintf();
				}
				break;
			case SERVICE:
				enterOuterAlt(_localctx, 3);
				{
				setState(614);
				cfp_set_service();
				}
				break;
			case SRCADDR:
				enterOuterAlt(_localctx, 4);
				{
				setState(615);
				cfp_set_srcaddr();
				}
				break;
			case SRCINTF:
				enterOuterAlt(_localctx, 5);
				{
				setState(616);
				cfp_set_srcintf();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfp_set_dstaddrContext extends ParserRuleContext {
		public Address_namesContext addresses;
		public TerminalNode DSTADDR() { return getToken(FortiosParser.DSTADDR, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Address_namesContext address_names() {
			return getRuleContext(Address_namesContext.class,0);
		}
		public Cfp_set_dstaddrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfp_set_dstaddr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfp_set_dstaddr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfp_set_dstaddr(this);
		}
	}

	public final Cfp_set_dstaddrContext cfp_set_dstaddr() throws RecognitionException {
		Cfp_set_dstaddrContext _localctx = new Cfp_set_dstaddrContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_cfp_set_dstaddr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			match(DSTADDR);
			setState(620);
			((Cfp_set_dstaddrContext)_localctx).addresses = address_names();
			setState(621);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfp_set_srcaddrContext extends ParserRuleContext {
		public Address_namesContext addresses;
		public TerminalNode SRCADDR() { return getToken(FortiosParser.SRCADDR, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Address_namesContext address_names() {
			return getRuleContext(Address_namesContext.class,0);
		}
		public Cfp_set_srcaddrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfp_set_srcaddr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfp_set_srcaddr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfp_set_srcaddr(this);
		}
	}

	public final Cfp_set_srcaddrContext cfp_set_srcaddr() throws RecognitionException {
		Cfp_set_srcaddrContext _localctx = new Cfp_set_srcaddrContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_cfp_set_srcaddr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			match(SRCADDR);
			setState(624);
			((Cfp_set_srcaddrContext)_localctx).addresses = address_names();
			setState(625);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfp_set_serviceContext extends ParserRuleContext {
		public Service_namesContext services;
		public TerminalNode SERVICE() { return getToken(FortiosParser.SERVICE, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Service_namesContext service_names() {
			return getRuleContext(Service_namesContext.class,0);
		}
		public Cfp_set_serviceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfp_set_service; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfp_set_service(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfp_set_service(this);
		}
	}

	public final Cfp_set_serviceContext cfp_set_service() throws RecognitionException {
		Cfp_set_serviceContext _localctx = new Cfp_set_serviceContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_cfp_set_service);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			match(SERVICE);
			setState(628);
			((Cfp_set_serviceContext)_localctx).services = service_names();
			setState(629);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfp_set_dstintfContext extends ParserRuleContext {
		public Interface_or_zone_namesContext interfaces;
		public TerminalNode DSTINTF() { return getToken(FortiosParser.DSTINTF, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Interface_or_zone_namesContext interface_or_zone_names() {
			return getRuleContext(Interface_or_zone_namesContext.class,0);
		}
		public Cfp_set_dstintfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfp_set_dstintf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfp_set_dstintf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfp_set_dstintf(this);
		}
	}

	public final Cfp_set_dstintfContext cfp_set_dstintf() throws RecognitionException {
		Cfp_set_dstintfContext _localctx = new Cfp_set_dstintfContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_cfp_set_dstintf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(DSTINTF);
			setState(632);
			((Cfp_set_dstintfContext)_localctx).interfaces = interface_or_zone_names();
			setState(633);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfp_set_srcintfContext extends ParserRuleContext {
		public Interface_or_zone_namesContext interfaces;
		public TerminalNode SRCINTF() { return getToken(FortiosParser.SRCINTF, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Interface_or_zone_namesContext interface_or_zone_names() {
			return getRuleContext(Interface_or_zone_namesContext.class,0);
		}
		public Cfp_set_srcintfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfp_set_srcintf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfp_set_srcintf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfp_set_srcintf(this);
		}
	}

	public final Cfp_set_srcintfContext cfp_set_srcintf() throws RecognitionException {
		Cfp_set_srcintfContext _localctx = new Cfp_set_srcintfContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_cfp_set_srcintf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			match(SRCINTF);
			setState(636);
			((Cfp_set_srcintfContext)_localctx).interfaces = interface_or_zone_names();
			setState(637);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfp_appendContext extends ParserRuleContext {
		public Cfp_append_dstaddrContext cfp_append_dstaddr() {
			return getRuleContext(Cfp_append_dstaddrContext.class,0);
		}
		public Cfp_append_dstintfContext cfp_append_dstintf() {
			return getRuleContext(Cfp_append_dstintfContext.class,0);
		}
		public Cfp_append_serviceContext cfp_append_service() {
			return getRuleContext(Cfp_append_serviceContext.class,0);
		}
		public Cfp_append_srcaddrContext cfp_append_srcaddr() {
			return getRuleContext(Cfp_append_srcaddrContext.class,0);
		}
		public Cfp_append_srcintfContext cfp_append_srcintf() {
			return getRuleContext(Cfp_append_srcintfContext.class,0);
		}
		public Cfp_appendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfp_append; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfp_append(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfp_append(this);
		}
	}

	public final Cfp_appendContext cfp_append() throws RecognitionException {
		Cfp_appendContext _localctx = new Cfp_appendContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_cfp_append);
		try {
			setState(644);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DSTADDR:
				enterOuterAlt(_localctx, 1);
				{
				setState(639);
				cfp_append_dstaddr();
				}
				break;
			case DSTINTF:
				enterOuterAlt(_localctx, 2);
				{
				setState(640);
				cfp_append_dstintf();
				}
				break;
			case SERVICE:
				enterOuterAlt(_localctx, 3);
				{
				setState(641);
				cfp_append_service();
				}
				break;
			case SRCADDR:
				enterOuterAlt(_localctx, 4);
				{
				setState(642);
				cfp_append_srcaddr();
				}
				break;
			case SRCINTF:
				enterOuterAlt(_localctx, 5);
				{
				setState(643);
				cfp_append_srcintf();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfp_append_dstaddrContext extends ParserRuleContext {
		public Address_namesContext addresses;
		public TerminalNode DSTADDR() { return getToken(FortiosParser.DSTADDR, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Address_namesContext address_names() {
			return getRuleContext(Address_namesContext.class,0);
		}
		public Cfp_append_dstaddrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfp_append_dstaddr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfp_append_dstaddr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfp_append_dstaddr(this);
		}
	}

	public final Cfp_append_dstaddrContext cfp_append_dstaddr() throws RecognitionException {
		Cfp_append_dstaddrContext _localctx = new Cfp_append_dstaddrContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_cfp_append_dstaddr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			match(DSTADDR);
			setState(647);
			((Cfp_append_dstaddrContext)_localctx).addresses = address_names();
			setState(648);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfp_append_srcaddrContext extends ParserRuleContext {
		public Address_namesContext addresses;
		public TerminalNode SRCADDR() { return getToken(FortiosParser.SRCADDR, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Address_namesContext address_names() {
			return getRuleContext(Address_namesContext.class,0);
		}
		public Cfp_append_srcaddrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfp_append_srcaddr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfp_append_srcaddr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfp_append_srcaddr(this);
		}
	}

	public final Cfp_append_srcaddrContext cfp_append_srcaddr() throws RecognitionException {
		Cfp_append_srcaddrContext _localctx = new Cfp_append_srcaddrContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_cfp_append_srcaddr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			match(SRCADDR);
			setState(651);
			((Cfp_append_srcaddrContext)_localctx).addresses = address_names();
			setState(652);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfp_append_serviceContext extends ParserRuleContext {
		public Service_namesContext services;
		public TerminalNode SERVICE() { return getToken(FortiosParser.SERVICE, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Service_namesContext service_names() {
			return getRuleContext(Service_namesContext.class,0);
		}
		public Cfp_append_serviceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfp_append_service; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfp_append_service(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfp_append_service(this);
		}
	}

	public final Cfp_append_serviceContext cfp_append_service() throws RecognitionException {
		Cfp_append_serviceContext _localctx = new Cfp_append_serviceContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_cfp_append_service);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			match(SERVICE);
			setState(655);
			((Cfp_append_serviceContext)_localctx).services = service_names();
			setState(656);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfp_append_dstintfContext extends ParserRuleContext {
		public Interface_or_zone_namesContext interfaces;
		public TerminalNode DSTINTF() { return getToken(FortiosParser.DSTINTF, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Interface_or_zone_namesContext interface_or_zone_names() {
			return getRuleContext(Interface_or_zone_namesContext.class,0);
		}
		public Cfp_append_dstintfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfp_append_dstintf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfp_append_dstintf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfp_append_dstintf(this);
		}
	}

	public final Cfp_append_dstintfContext cfp_append_dstintf() throws RecognitionException {
		Cfp_append_dstintfContext _localctx = new Cfp_append_dstintfContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_cfp_append_dstintf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			match(DSTINTF);
			setState(659);
			((Cfp_append_dstintfContext)_localctx).interfaces = interface_or_zone_names();
			setState(660);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfp_append_srcintfContext extends ParserRuleContext {
		public Interface_or_zone_namesContext interfaces;
		public TerminalNode SRCINTF() { return getToken(FortiosParser.SRCINTF, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Interface_or_zone_namesContext interface_or_zone_names() {
			return getRuleContext(Interface_or_zone_namesContext.class,0);
		}
		public Cfp_append_srcintfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfp_append_srcintf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfp_append_srcintf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfp_append_srcintf(this);
		}
	}

	public final Cfp_append_srcintfContext cfp_append_srcintf() throws RecognitionException {
		Cfp_append_srcintfContext _localctx = new Cfp_append_srcintfContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_cfp_append_srcintf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			match(SRCINTF);
			setState(663);
			((Cfp_append_srcintfContext)_localctx).interfaces = interface_or_zone_names();
			setState(664);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Policy_nameContext extends ParserRuleContext {
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public Policy_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_policy_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterPolicy_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitPolicy_name(this);
		}
	}

	public final Policy_nameContext policy_name() throws RecognitionException {
		Policy_nameContext _localctx = new Policy_nameContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_policy_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			str();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Policy_statusContext extends ParserRuleContext {
		public Enable_or_disableContext enable_or_disable() {
			return getRuleContext(Enable_or_disableContext.class,0);
		}
		public Policy_statusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_policy_status; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterPolicy_status(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitPolicy_status(this);
		}
	}

	public final Policy_statusContext policy_status() throws RecognitionException {
		Policy_statusContext _localctx = new Policy_statusContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_policy_status);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			enable_or_disable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Policy_numberContext extends ParserRuleContext {
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public Policy_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_policy_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterPolicy_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitPolicy_number(this);
		}
	}

	public final Policy_numberContext policy_number() throws RecognitionException {
		Policy_numberContext _localctx = new Policy_numberContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_policy_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			str();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Policy_actionContext extends ParserRuleContext {
		public TerminalNode ALLOW() { return getToken(FortiosParser.ALLOW, 0); }
		public TerminalNode DENY() { return getToken(FortiosParser.DENY, 0); }
		public TerminalNode IPSEC() { return getToken(FortiosParser.IPSEC, 0); }
		public Policy_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_policy_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterPolicy_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitPolicy_action(this);
		}
	}

	public final Policy_actionContext policy_action() throws RecognitionException {
		Policy_actionContext _localctx = new Policy_actionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_policy_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALLOW) | (1L << DENY) | (1L << IPSEC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Address_namesContext extends ParserRuleContext {
		public List<Address_nameContext> address_name() {
			return getRuleContexts(Address_nameContext.class);
		}
		public Address_nameContext address_name(int i) {
			return getRuleContext(Address_nameContext.class,i);
		}
		public Address_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_address_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterAddress_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitAddress_names(this);
		}
	}

	public final Address_namesContext address_names() throws RecognitionException {
		Address_namesContext _localctx = new Address_namesContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_address_names);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(675); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(674);
					address_name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(677); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Service_namesContext extends ParserRuleContext {
		public List<Service_nameContext> service_name() {
			return getRuleContexts(Service_nameContext.class);
		}
		public Service_nameContext service_name(int i) {
			return getRuleContext(Service_nameContext.class,i);
		}
		public Service_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_service_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterService_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitService_names(this);
		}
	}

	public final Service_namesContext service_names() throws RecognitionException {
		Service_namesContext _localctx = new Service_namesContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_service_names);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(680); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(679);
					service_name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(682); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_or_zone_namesContext extends ParserRuleContext {
		public List<Interface_or_zone_nameContext> interface_or_zone_name() {
			return getRuleContexts(Interface_or_zone_nameContext.class);
		}
		public Interface_or_zone_nameContext interface_or_zone_name(int i) {
			return getRuleContext(Interface_or_zone_nameContext.class,i);
		}
		public Interface_or_zone_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_or_zone_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterInterface_or_zone_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitInterface_or_zone_names(this);
		}
	}

	public final Interface_or_zone_namesContext interface_or_zone_names() throws RecognitionException {
		Interface_or_zone_namesContext _localctx = new Interface_or_zone_namesContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_interface_or_zone_names);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(685); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(684);
					interface_or_zone_name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(687); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cf_serviceContext extends ParserRuleContext {
		public TerminalNode SERVICE() { return getToken(FortiosParser.SERVICE, 0); }
		public Cfs_customContext cfs_custom() {
			return getRuleContext(Cfs_customContext.class,0);
		}
		public Cf_serviceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cf_service; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCf_service(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCf_service(this);
		}
	}

	public final Cf_serviceContext cf_service() throws RecognitionException {
		Cf_serviceContext _localctx = new Cf_serviceContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_cf_service);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			match(SERVICE);
			setState(690);
			cfs_custom();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfs_customContext extends ParserRuleContext {
		public TerminalNode CUSTOM() { return getToken(FortiosParser.CUSTOM, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public List<CfscContext> cfsc() {
			return getRuleContexts(CfscContext.class);
		}
		public CfscContext cfsc(int i) {
			return getRuleContext(CfscContext.class,i);
		}
		public Cfs_customContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfs_custom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfs_custom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfs_custom(this);
		}
	}

	public final Cfs_customContext cfs_custom() throws RecognitionException {
		Cfs_customContext _localctx = new Cfs_customContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_cfs_custom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			match(CUSTOM);
			setState(693);
			newline();
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EDIT || _la==RENAME) {
				{
				{
				setState(694);
				cfsc();
				}
				}
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CfscContext extends ParserRuleContext {
		public Cfsc_editContext cfsc_edit() {
			return getRuleContext(Cfsc_editContext.class,0);
		}
		public Cfsc_renameContext cfsc_rename() {
			return getRuleContext(Cfsc_renameContext.class,0);
		}
		public CfscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfsc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfsc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfsc(this);
		}
	}

	public final CfscContext cfsc() throws RecognitionException {
		CfscContext _localctx = new CfscContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_cfsc);
		try {
			setState(702);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(700);
				cfsc_edit();
				}
				break;
			case RENAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(701);
				cfsc_rename();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfsc_renameContext extends ParserRuleContext {
		public Service_nameContext current_name;
		public Service_nameContext new_name;
		public TerminalNode RENAME() { return getToken(FortiosParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(FortiosParser.TO, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public List<Service_nameContext> service_name() {
			return getRuleContexts(Service_nameContext.class);
		}
		public Service_nameContext service_name(int i) {
			return getRuleContext(Service_nameContext.class,i);
		}
		public Cfsc_renameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfsc_rename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfsc_rename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfsc_rename(this);
		}
	}

	public final Cfsc_renameContext cfsc_rename() throws RecognitionException {
		Cfsc_renameContext _localctx = new Cfsc_renameContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_cfsc_rename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			match(RENAME);
			setState(705);
			((Cfsc_renameContext)_localctx).current_name = service_name();
			setState(706);
			match(TO);
			setState(707);
			((Cfsc_renameContext)_localctx).new_name = service_name();
			setState(708);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfsc_editContext extends ParserRuleContext {
		public TerminalNode EDIT() { return getToken(FortiosParser.EDIT, 0); }
		public Service_nameContext service_name() {
			return getRuleContext(Service_nameContext.class,0);
		}
		public List<NewlineContext> newline() {
			return getRuleContexts(NewlineContext.class);
		}
		public NewlineContext newline(int i) {
			return getRuleContext(NewlineContext.class,i);
		}
		public TerminalNode NEXT() { return getToken(FortiosParser.NEXT, 0); }
		public List<CfsceContext> cfsce() {
			return getRuleContexts(CfsceContext.class);
		}
		public CfsceContext cfsce(int i) {
			return getRuleContext(CfsceContext.class,i);
		}
		public Cfsc_editContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfsc_edit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfsc_edit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfsc_edit(this);
		}
	}

	public final Cfsc_editContext cfsc_edit() throws RecognitionException {
		Cfsc_editContext _localctx = new Cfsc_editContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_cfsc_edit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			match(EDIT);
			setState(711);
			service_name();
			setState(712);
			newline();
			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SET) {
				{
				{
				setState(713);
				cfsce();
				}
				}
				setState(718);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(719);
			match(NEXT);
			setState(720);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CfsceContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(FortiosParser.SET, 0); }
		public Cfsc_set_singletonsContext cfsc_set_singletons() {
			return getRuleContext(Cfsc_set_singletonsContext.class,0);
		}
		public CfsceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfsce; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfsce(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfsce(this);
		}
	}

	public final CfsceContext cfsce() throws RecognitionException {
		CfsceContext _localctx = new CfsceContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_cfsce);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			match(SET);
			setState(723);
			cfsc_set_singletons();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfsc_set_singletonsContext extends ParserRuleContext {
		public Cfsc_set_commentContext cfsc_set_comment() {
			return getRuleContext(Cfsc_set_commentContext.class,0);
		}
		public Cfsc_set_icmpcodeContext cfsc_set_icmpcode() {
			return getRuleContext(Cfsc_set_icmpcodeContext.class,0);
		}
		public Cfsc_set_icmptypeContext cfsc_set_icmptype() {
			return getRuleContext(Cfsc_set_icmptypeContext.class,0);
		}
		public Cfsc_set_protocolContext cfsc_set_protocol() {
			return getRuleContext(Cfsc_set_protocolContext.class,0);
		}
		public Cfsc_set_protocol_numberContext cfsc_set_protocol_number() {
			return getRuleContext(Cfsc_set_protocol_numberContext.class,0);
		}
		public Cfsc_set_sctp_portrangeContext cfsc_set_sctp_portrange() {
			return getRuleContext(Cfsc_set_sctp_portrangeContext.class,0);
		}
		public Cfsc_set_tcp_portrangeContext cfsc_set_tcp_portrange() {
			return getRuleContext(Cfsc_set_tcp_portrangeContext.class,0);
		}
		public Cfsc_set_udp_portrangeContext cfsc_set_udp_portrange() {
			return getRuleContext(Cfsc_set_udp_portrangeContext.class,0);
		}
		public Cfsc_set_singletonsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfsc_set_singletons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfsc_set_singletons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfsc_set_singletons(this);
		}
	}

	public final Cfsc_set_singletonsContext cfsc_set_singletons() throws RecognitionException {
		Cfsc_set_singletonsContext _localctx = new Cfsc_set_singletonsContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_cfsc_set_singletons);
		try {
			setState(733);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(725);
				cfsc_set_comment();
				}
				break;
			case ICMPCODE:
				enterOuterAlt(_localctx, 2);
				{
				setState(726);
				cfsc_set_icmpcode();
				}
				break;
			case ICMPTYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(727);
				cfsc_set_icmptype();
				}
				break;
			case PROTOCOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(728);
				cfsc_set_protocol();
				}
				break;
			case PROTOCOL_NUMBER:
				enterOuterAlt(_localctx, 5);
				{
				setState(729);
				cfsc_set_protocol_number();
				}
				break;
			case SCTP_PORTRANGE:
				enterOuterAlt(_localctx, 6);
				{
				setState(730);
				cfsc_set_sctp_portrange();
				}
				break;
			case TCP_PORTRANGE:
				enterOuterAlt(_localctx, 7);
				{
				setState(731);
				cfsc_set_tcp_portrange();
				}
				break;
			case UDP_PORTRANGE:
				enterOuterAlt(_localctx, 8);
				{
				setState(732);
				cfsc_set_udp_portrange();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfsc_set_commentContext extends ParserRuleContext {
		public StrContext comment;
		public TerminalNode COMMENT() { return getToken(FortiosParser.COMMENT, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public Cfsc_set_commentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfsc_set_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfsc_set_comment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfsc_set_comment(this);
		}
	}

	public final Cfsc_set_commentContext cfsc_set_comment() throws RecognitionException {
		Cfsc_set_commentContext _localctx = new Cfsc_set_commentContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_cfsc_set_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			match(COMMENT);
			setState(736);
			((Cfsc_set_commentContext)_localctx).comment = str();
			setState(737);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfsc_set_icmpcodeContext extends ParserRuleContext {
		public Uint8Context code;
		public TerminalNode ICMPCODE() { return getToken(FortiosParser.ICMPCODE, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Uint8Context uint8() {
			return getRuleContext(Uint8Context.class,0);
		}
		public Cfsc_set_icmpcodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfsc_set_icmpcode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfsc_set_icmpcode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfsc_set_icmpcode(this);
		}
	}

	public final Cfsc_set_icmpcodeContext cfsc_set_icmpcode() throws RecognitionException {
		Cfsc_set_icmpcodeContext _localctx = new Cfsc_set_icmpcodeContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_cfsc_set_icmpcode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			match(ICMPCODE);
			setState(740);
			((Cfsc_set_icmpcodeContext)_localctx).code = uint8();
			setState(741);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfsc_set_icmptypeContext extends ParserRuleContext {
		public Uint8Context type;
		public TerminalNode ICMPTYPE() { return getToken(FortiosParser.ICMPTYPE, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Uint8Context uint8() {
			return getRuleContext(Uint8Context.class,0);
		}
		public Cfsc_set_icmptypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfsc_set_icmptype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfsc_set_icmptype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfsc_set_icmptype(this);
		}
	}

	public final Cfsc_set_icmptypeContext cfsc_set_icmptype() throws RecognitionException {
		Cfsc_set_icmptypeContext _localctx = new Cfsc_set_icmptypeContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_cfsc_set_icmptype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			match(ICMPTYPE);
			setState(744);
			((Cfsc_set_icmptypeContext)_localctx).type = uint8();
			setState(745);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfsc_set_protocolContext extends ParserRuleContext {
		public Service_protocolContext protocol;
		public TerminalNode PROTOCOL() { return getToken(FortiosParser.PROTOCOL, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Service_protocolContext service_protocol() {
			return getRuleContext(Service_protocolContext.class,0);
		}
		public Cfsc_set_protocolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfsc_set_protocol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfsc_set_protocol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfsc_set_protocol(this);
		}
	}

	public final Cfsc_set_protocolContext cfsc_set_protocol() throws RecognitionException {
		Cfsc_set_protocolContext _localctx = new Cfsc_set_protocolContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_cfsc_set_protocol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			match(PROTOCOL);
			setState(748);
			((Cfsc_set_protocolContext)_localctx).protocol = service_protocol();
			setState(749);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfsc_set_protocol_numberContext extends ParserRuleContext {
		public Ip_protocol_numberContext number;
		public TerminalNode PROTOCOL_NUMBER() { return getToken(FortiosParser.PROTOCOL_NUMBER, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Ip_protocol_numberContext ip_protocol_number() {
			return getRuleContext(Ip_protocol_numberContext.class,0);
		}
		public Cfsc_set_protocol_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfsc_set_protocol_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfsc_set_protocol_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfsc_set_protocol_number(this);
		}
	}

	public final Cfsc_set_protocol_numberContext cfsc_set_protocol_number() throws RecognitionException {
		Cfsc_set_protocol_numberContext _localctx = new Cfsc_set_protocol_numberContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_cfsc_set_protocol_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			match(PROTOCOL_NUMBER);
			setState(752);
			((Cfsc_set_protocol_numberContext)_localctx).number = ip_protocol_number();
			setState(753);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfsc_set_sctp_portrangeContext extends ParserRuleContext {
		public Service_port_rangesContext value;
		public TerminalNode SCTP_PORTRANGE() { return getToken(FortiosParser.SCTP_PORTRANGE, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Service_port_rangesContext service_port_ranges() {
			return getRuleContext(Service_port_rangesContext.class,0);
		}
		public Cfsc_set_sctp_portrangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfsc_set_sctp_portrange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfsc_set_sctp_portrange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfsc_set_sctp_portrange(this);
		}
	}

	public final Cfsc_set_sctp_portrangeContext cfsc_set_sctp_portrange() throws RecognitionException {
		Cfsc_set_sctp_portrangeContext _localctx = new Cfsc_set_sctp_portrangeContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_cfsc_set_sctp_portrange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			match(SCTP_PORTRANGE);
			setState(756);
			((Cfsc_set_sctp_portrangeContext)_localctx).value = service_port_ranges();
			setState(757);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfsc_set_tcp_portrangeContext extends ParserRuleContext {
		public Service_port_rangesContext value;
		public TerminalNode TCP_PORTRANGE() { return getToken(FortiosParser.TCP_PORTRANGE, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Service_port_rangesContext service_port_ranges() {
			return getRuleContext(Service_port_rangesContext.class,0);
		}
		public Cfsc_set_tcp_portrangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfsc_set_tcp_portrange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfsc_set_tcp_portrange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfsc_set_tcp_portrange(this);
		}
	}

	public final Cfsc_set_tcp_portrangeContext cfsc_set_tcp_portrange() throws RecognitionException {
		Cfsc_set_tcp_portrangeContext _localctx = new Cfsc_set_tcp_portrangeContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_cfsc_set_tcp_portrange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			match(TCP_PORTRANGE);
			setState(760);
			((Cfsc_set_tcp_portrangeContext)_localctx).value = service_port_ranges();
			setState(761);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfsc_set_udp_portrangeContext extends ParserRuleContext {
		public Service_port_rangesContext value;
		public TerminalNode UDP_PORTRANGE() { return getToken(FortiosParser.UDP_PORTRANGE, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Service_port_rangesContext service_port_ranges() {
			return getRuleContext(Service_port_rangesContext.class,0);
		}
		public Cfsc_set_udp_portrangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfsc_set_udp_portrange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCfsc_set_udp_portrange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCfsc_set_udp_portrange(this);
		}
	}

	public final Cfsc_set_udp_portrangeContext cfsc_set_udp_portrange() throws RecognitionException {
		Cfsc_set_udp_portrangeContext _localctx = new Cfsc_set_udp_portrangeContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_cfsc_set_udp_portrange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			match(UDP_PORTRANGE);
			setState(764);
			((Cfsc_set_udp_portrangeContext)_localctx).value = service_port_ranges();
			setState(765);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Service_nameContext extends ParserRuleContext {
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public Service_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_service_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterService_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitService_name(this);
		}
	}

	public final Service_nameContext service_name() throws RecognitionException {
		Service_nameContext _localctx = new Service_nameContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_service_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			str();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Service_protocolContext extends ParserRuleContext {
		public TerminalNode ICMP() { return getToken(FortiosParser.ICMP, 0); }
		public TerminalNode ICMP6() { return getToken(FortiosParser.ICMP6, 0); }
		public TerminalNode IP_UPPER() { return getToken(FortiosParser.IP_UPPER, 0); }
		public TerminalNode TCP_UDP_SCTP() { return getToken(FortiosParser.TCP_UDP_SCTP, 0); }
		public Service_protocolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_service_protocol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterService_protocol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitService_protocol(this);
		}
	}

	public final Service_protocolContext service_protocol() throws RecognitionException {
		Service_protocolContext _localctx = new Service_protocolContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_service_protocol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			_la = _input.LA(1);
			if ( !(((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (ICMP - 44)) | (1L << (ICMP6 - 44)) | (1L << (IP_UPPER - 44)) | (1L << (TCP_UDP_SCTP - 44)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Service_port_rangesContext extends ParserRuleContext {
		public List<Service_port_rangeContext> service_port_range() {
			return getRuleContexts(Service_port_rangeContext.class);
		}
		public Service_port_rangeContext service_port_range(int i) {
			return getRuleContext(Service_port_rangeContext.class,i);
		}
		public Service_port_rangesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_service_port_ranges; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterService_port_ranges(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitService_port_ranges(this);
		}
	}

	public final Service_port_rangesContext service_port_ranges() throws RecognitionException {
		Service_port_rangesContext _localctx = new Service_port_rangesContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_service_port_ranges);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(771);
				service_port_range();
				}
				}
				setState(774); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==UINT8 || _la==UINT16 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Service_port_rangeContext extends ParserRuleContext {
		public Port_rangeContext dst_ports;
		public Port_rangeContext src_ports;
		public List<Port_rangeContext> port_range() {
			return getRuleContexts(Port_rangeContext.class);
		}
		public Port_rangeContext port_range(int i) {
			return getRuleContext(Port_rangeContext.class,i);
		}
		public TerminalNode COLON() { return getToken(FortiosParser.COLON, 0); }
		public Service_port_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_service_port_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterService_port_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitService_port_range(this);
		}
	}

	public final Service_port_rangeContext service_port_range() throws RecognitionException {
		Service_port_rangeContext _localctx = new Service_port_rangeContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_service_port_range);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			((Service_port_rangeContext)_localctx).dst_ports = port_range();
			setState(779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(777);
				match(COLON);
				setState(778);
				((Service_port_rangeContext)_localctx).src_ports = port_range();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ip_protocol_numberContext extends ParserRuleContext {
		public Uint8Context uint8() {
			return getRuleContext(Uint8Context.class,0);
		}
		public Ip_protocol_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ip_protocol_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterIp_protocol_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitIp_protocol_number(this);
		}
	}

	public final Ip_protocol_numberContext ip_protocol_number() throws RecognitionException {
		Ip_protocol_numberContext _localctx = new Ip_protocol_numberContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_ip_protocol_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			uint8();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class C_systemContext extends ParserRuleContext {
		public TerminalNode SYSTEM() { return getToken(FortiosParser.SYSTEM, 0); }
		public Cs_globalContext cs_global() {
			return getRuleContext(Cs_globalContext.class,0);
		}
		public Cs_interfaceContext cs_interface() {
			return getRuleContext(Cs_interfaceContext.class,0);
		}
		public Cs_replacemsgContext cs_replacemsg() {
			return getRuleContext(Cs_replacemsgContext.class,0);
		}
		public Cs_zoneContext cs_zone() {
			return getRuleContext(Cs_zoneContext.class,0);
		}
		public C_systemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_system; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterC_system(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitC_system(this);
		}
	}

	public final C_systemContext c_system() throws RecognitionException {
		C_systemContext _localctx = new C_systemContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_c_system);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			match(SYSTEM);
			setState(788);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GLOBAL:
				{
				setState(784);
				cs_global();
				}
				break;
			case INTERFACE:
				{
				setState(785);
				cs_interface();
				}
				break;
			case REPLACEMSG:
				{
				setState(786);
				cs_replacemsg();
				}
				break;
			case ZONE:
				{
				setState(787);
				cs_zone();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cs_globalContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(FortiosParser.GLOBAL, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public List<CsgContext> csg() {
			return getRuleContexts(CsgContext.class);
		}
		public CsgContext csg(int i) {
			return getRuleContext(CsgContext.class,i);
		}
		public Cs_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cs_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCs_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCs_global(this);
		}
	}

	public final Cs_globalContext cs_global() throws RecognitionException {
		Cs_globalContext _localctx = new Cs_globalContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_cs_global);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			match(GLOBAL);
			setState(791);
			newline();
			setState(795);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SET) {
				{
				{
				setState(792);
				csg();
				}
				}
				setState(797);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CsgContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(FortiosParser.SET, 0); }
		public Csg_hostnameContext csg_hostname() {
			return getRuleContext(Csg_hostnameContext.class,0);
		}
		public CsgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCsg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCsg(this);
		}
	}

	public final CsgContext csg() throws RecognitionException {
		CsgContext _localctx = new CsgContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_csg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			match(SET);
			{
			setState(799);
			csg_hostname();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Csg_hostnameContext extends ParserRuleContext {
		public Device_hostnameContext host;
		public TerminalNode HOSTNAME() { return getToken(FortiosParser.HOSTNAME, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Device_hostnameContext device_hostname() {
			return getRuleContext(Device_hostnameContext.class,0);
		}
		public Csg_hostnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csg_hostname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCsg_hostname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCsg_hostname(this);
		}
	}

	public final Csg_hostnameContext csg_hostname() throws RecognitionException {
		Csg_hostnameContext _localctx = new Csg_hostnameContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_csg_hostname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			match(HOSTNAME);
			setState(802);
			((Csg_hostnameContext)_localctx).host = device_hostname();
			setState(803);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Device_hostnameContext extends ParserRuleContext {
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public Device_hostnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_device_hostname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterDevice_hostname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitDevice_hostname(this);
		}
	}

	public final Device_hostnameContext device_hostname() throws RecognitionException {
		Device_hostnameContext _localctx = new Device_hostnameContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_device_hostname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			str();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cs_replacemsgContext extends ParserRuleContext {
		public Replacemsg_major_typeContext major_type;
		public Replacemsg_minor_typeContext minor_type;
		public TerminalNode REPLACEMSG() { return getToken(FortiosParser.REPLACEMSG, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Replacemsg_major_typeContext replacemsg_major_type() {
			return getRuleContext(Replacemsg_major_typeContext.class,0);
		}
		public Replacemsg_minor_typeContext replacemsg_minor_type() {
			return getRuleContext(Replacemsg_minor_typeContext.class,0);
		}
		public List<CsrContext> csr() {
			return getRuleContexts(CsrContext.class);
		}
		public CsrContext csr(int i) {
			return getRuleContext(CsrContext.class,i);
		}
		public Cs_replacemsgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cs_replacemsg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCs_replacemsg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCs_replacemsg(this);
		}
	}

	public final Cs_replacemsgContext cs_replacemsg() throws RecognitionException {
		Cs_replacemsgContext _localctx = new Cs_replacemsgContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_cs_replacemsg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			match(REPLACEMSG);
			setState(808);
			((Cs_replacemsgContext)_localctx).major_type = replacemsg_major_type();
			setState(809);
			((Cs_replacemsgContext)_localctx).minor_type = replacemsg_minor_type();
			setState(810);
			newline();
			setState(814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SET || _la==UNSET) {
				{
				{
				setState(811);
				csr();
				}
				}
				setState(816);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Replacemsg_major_typeContext extends ParserRuleContext {
		public TerminalNode ADMIN() { return getToken(FortiosParser.ADMIN, 0); }
		public TerminalNode ALERTMAIL() { return getToken(FortiosParser.ALERTMAIL, 0); }
		public TerminalNode AUTH() { return getToken(FortiosParser.AUTH, 0); }
		public TerminalNode FORTIGUARD_WF() { return getToken(FortiosParser.FORTIGUARD_WF, 0); }
		public TerminalNode FTP() { return getToken(FortiosParser.FTP, 0); }
		public TerminalNode HTTP() { return getToken(FortiosParser.HTTP, 0); }
		public TerminalNode ICAP() { return getToken(FortiosParser.ICAP, 0); }
		public TerminalNode MAIL() { return getToken(FortiosParser.MAIL, 0); }
		public TerminalNode NAC_QUAR() { return getToken(FortiosParser.NAC_QUAR, 0); }
		public TerminalNode SPAM() { return getToken(FortiosParser.SPAM, 0); }
		public TerminalNode SSLVPN() { return getToken(FortiosParser.SSLVPN, 0); }
		public TerminalNode TRAFFIC_QUOTA() { return getToken(FortiosParser.TRAFFIC_QUOTA, 0); }
		public TerminalNode UTM() { return getToken(FortiosParser.UTM, 0); }
		public TerminalNode WEBPROXY() { return getToken(FortiosParser.WEBPROXY, 0); }
		public Replacemsg_major_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replacemsg_major_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterReplacemsg_major_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitReplacemsg_major_type(this);
		}
	}

	public final Replacemsg_major_typeContext replacemsg_major_type() throws RecognitionException {
		Replacemsg_major_typeContext _localctx = new Replacemsg_major_typeContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_replacemsg_major_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADMIN) | (1L << ALERTMAIL) | (1L << AUTH) | (1L << FORTIGUARD_WF) | (1L << FTP) | (1L << HTTP) | (1L << ICAP) | (1L << MAIL) | (1L << NAC_QUAR))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (SPAM - 77)) | (1L << (SSLVPN - 77)) | (1L << (TRAFFIC_QUOTA - 77)) | (1L << (UTM - 77)) | (1L << (WEBPROXY - 77)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Replacemsg_minor_typeContext extends ParserRuleContext {
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public Replacemsg_minor_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replacemsg_minor_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterReplacemsg_minor_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitReplacemsg_minor_type(this);
		}
	}

	public final Replacemsg_minor_typeContext replacemsg_minor_type() throws RecognitionException {
		Replacemsg_minor_typeContext _localctx = new Replacemsg_minor_typeContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_replacemsg_minor_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			word();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CsrContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(FortiosParser.SET, 0); }
		public Csr_set_bufferContext csr_set_buffer() {
			return getRuleContext(Csr_set_bufferContext.class,0);
		}
		public TerminalNode UNSET() { return getToken(FortiosParser.UNSET, 0); }
		public Csr_unset_bufferContext csr_unset_buffer() {
			return getRuleContext(Csr_unset_bufferContext.class,0);
		}
		public CsrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCsr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCsr(this);
		}
	}

	public final CsrContext csr() throws RecognitionException {
		CsrContext _localctx = new CsrContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_csr);
		try {
			setState(825);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(821);
				match(SET);
				{
				setState(822);
				csr_set_buffer();
				}
				}
				break;
			case UNSET:
				enterOuterAlt(_localctx, 2);
				{
				setState(823);
				match(UNSET);
				{
				setState(824);
				csr_unset_buffer();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Csr_set_bufferContext extends ParserRuleContext {
		public StrContext buffer;
		public TerminalNode BUFFER() { return getToken(FortiosParser.BUFFER, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public Csr_set_bufferContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csr_set_buffer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCsr_set_buffer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCsr_set_buffer(this);
		}
	}

	public final Csr_set_bufferContext csr_set_buffer() throws RecognitionException {
		Csr_set_bufferContext _localctx = new Csr_set_bufferContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_csr_set_buffer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			match(BUFFER);
			setState(828);
			((Csr_set_bufferContext)_localctx).buffer = str();
			setState(829);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Csr_unset_bufferContext extends ParserRuleContext {
		public TerminalNode BUFFER() { return getToken(FortiosParser.BUFFER, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Csr_unset_bufferContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csr_unset_buffer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCsr_unset_buffer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCsr_unset_buffer(this);
		}
	}

	public final Csr_unset_bufferContext csr_unset_buffer() throws RecognitionException {
		Csr_unset_bufferContext _localctx = new Csr_unset_bufferContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_csr_unset_buffer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			match(BUFFER);
			setState(832);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cs_zoneContext extends ParserRuleContext {
		public TerminalNode ZONE() { return getToken(FortiosParser.ZONE, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public List<Csz_editContext> csz_edit() {
			return getRuleContexts(Csz_editContext.class);
		}
		public Csz_editContext csz_edit(int i) {
			return getRuleContext(Csz_editContext.class,i);
		}
		public Cs_zoneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cs_zone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCs_zone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCs_zone(this);
		}
	}

	public final Cs_zoneContext cs_zone() throws RecognitionException {
		Cs_zoneContext _localctx = new Cs_zoneContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_cs_zone);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			match(ZONE);
			setState(835);
			newline();
			setState(839);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EDIT) {
				{
				{
				setState(836);
				csz_edit();
				}
				}
				setState(841);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CszContext extends ParserRuleContext {
		public Csz_editContext csz_edit() {
			return getRuleContext(Csz_editContext.class,0);
		}
		public Csz_renameContext csz_rename() {
			return getRuleContext(Csz_renameContext.class,0);
		}
		public CszContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCsz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCsz(this);
		}
	}

	public final CszContext csz() throws RecognitionException {
		CszContext _localctx = new CszContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_csz);
		try {
			setState(844);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(842);
				csz_edit();
				}
				break;
			case RENAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(843);
				csz_rename();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Csz_editContext extends ParserRuleContext {
		public TerminalNode EDIT() { return getToken(FortiosParser.EDIT, 0); }
		public Zone_nameContext zone_name() {
			return getRuleContext(Zone_nameContext.class,0);
		}
		public List<NewlineContext> newline() {
			return getRuleContexts(NewlineContext.class);
		}
		public NewlineContext newline(int i) {
			return getRuleContext(NewlineContext.class,i);
		}
		public TerminalNode NEXT() { return getToken(FortiosParser.NEXT, 0); }
		public List<CszeContext> csze() {
			return getRuleContexts(CszeContext.class);
		}
		public CszeContext csze(int i) {
			return getRuleContext(CszeContext.class,i);
		}
		public Csz_editContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csz_edit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCsz_edit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCsz_edit(this);
		}
	}

	public final Csz_editContext csz_edit() throws RecognitionException {
		Csz_editContext _localctx = new Csz_editContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_csz_edit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			match(EDIT);
			setState(847);
			zone_name();
			setState(848);
			newline();
			setState(852);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & ((1L << (APPEND - 12)) | (1L << (SELECT - 12)) | (1L << (SET - 12)))) != 0)) {
				{
				{
				setState(849);
				csze();
				}
				}
				setState(854);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(855);
			match(NEXT);
			setState(856);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Csz_renameContext extends ParserRuleContext {
		public Zone_nameContext current_name;
		public Zone_nameContext new_name;
		public TerminalNode RENAME() { return getToken(FortiosParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(FortiosParser.TO, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public List<Zone_nameContext> zone_name() {
			return getRuleContexts(Zone_nameContext.class);
		}
		public Zone_nameContext zone_name(int i) {
			return getRuleContext(Zone_nameContext.class,i);
		}
		public Csz_renameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csz_rename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCsz_rename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCsz_rename(this);
		}
	}

	public final Csz_renameContext csz_rename() throws RecognitionException {
		Csz_renameContext _localctx = new Csz_renameContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_csz_rename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			match(RENAME);
			setState(859);
			((Csz_renameContext)_localctx).current_name = zone_name();
			setState(860);
			match(TO);
			setState(861);
			((Csz_renameContext)_localctx).new_name = zone_name();
			setState(862);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CszeContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(FortiosParser.SET, 0); }
		public TerminalNode APPEND() { return getToken(FortiosParser.APPEND, 0); }
		public Csz_append_interfaceContext csz_append_interface() {
			return getRuleContext(Csz_append_interfaceContext.class,0);
		}
		public TerminalNode SELECT() { return getToken(FortiosParser.SELECT, 0); }
		public Csz_set_interfaceContext csz_set_interface() {
			return getRuleContext(Csz_set_interfaceContext.class,0);
		}
		public Csz_set_singletonsContext csz_set_singletons() {
			return getRuleContext(Csz_set_singletonsContext.class,0);
		}
		public CszeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csze; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCsze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCsze(this);
		}
	}

	public final CszeContext csze() throws RecognitionException {
		CszeContext _localctx = new CszeContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_csze);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(873);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				{
				setState(864);
				match(SET);
				setState(867);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DESCRIPTION:
				case INTRAZONE:
					{
					setState(865);
					csz_set_singletons();
					}
					break;
				case INTERFACE:
					{
					setState(866);
					csz_set_interface();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case APPEND:
				{
				setState(869);
				match(APPEND);
				setState(870);
				csz_append_interface();
				}
				break;
			case SELECT:
				{
				setState(871);
				match(SELECT);
				setState(872);
				csz_set_interface();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Csz_set_singletonsContext extends ParserRuleContext {
		public Csz_set_descriptionContext csz_set_description() {
			return getRuleContext(Csz_set_descriptionContext.class,0);
		}
		public Csz_set_intrazoneContext csz_set_intrazone() {
			return getRuleContext(Csz_set_intrazoneContext.class,0);
		}
		public Csz_set_singletonsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csz_set_singletons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCsz_set_singletons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCsz_set_singletons(this);
		}
	}

	public final Csz_set_singletonsContext csz_set_singletons() throws RecognitionException {
		Csz_set_singletonsContext _localctx = new Csz_set_singletonsContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_csz_set_singletons);
		try {
			setState(877);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DESCRIPTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(875);
				csz_set_description();
				}
				break;
			case INTRAZONE:
				enterOuterAlt(_localctx, 2);
				{
				setState(876);
				csz_set_intrazone();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Csz_set_descriptionContext extends ParserRuleContext {
		public StrContext description;
		public TerminalNode DESCRIPTION() { return getToken(FortiosParser.DESCRIPTION, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public Csz_set_descriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csz_set_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCsz_set_description(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCsz_set_description(this);
		}
	}

	public final Csz_set_descriptionContext csz_set_description() throws RecognitionException {
		Csz_set_descriptionContext _localctx = new Csz_set_descriptionContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_csz_set_description);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			match(DESCRIPTION);
			setState(880);
			((Csz_set_descriptionContext)_localctx).description = str();
			setState(881);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Csz_set_intrazoneContext extends ParserRuleContext {
		public Allow_or_denyContext value;
		public TerminalNode INTRAZONE() { return getToken(FortiosParser.INTRAZONE, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Allow_or_denyContext allow_or_deny() {
			return getRuleContext(Allow_or_denyContext.class,0);
		}
		public Csz_set_intrazoneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csz_set_intrazone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCsz_set_intrazone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCsz_set_intrazone(this);
		}
	}

	public final Csz_set_intrazoneContext csz_set_intrazone() throws RecognitionException {
		Csz_set_intrazoneContext _localctx = new Csz_set_intrazoneContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_csz_set_intrazone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(883);
			match(INTRAZONE);
			setState(884);
			((Csz_set_intrazoneContext)_localctx).value = allow_or_deny();
			setState(885);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Csz_set_interfaceContext extends ParserRuleContext {
		public Interface_namesContext interfaces;
		public TerminalNode INTERFACE() { return getToken(FortiosParser.INTERFACE, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Interface_namesContext interface_names() {
			return getRuleContext(Interface_namesContext.class,0);
		}
		public Csz_set_interfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csz_set_interface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCsz_set_interface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCsz_set_interface(this);
		}
	}

	public final Csz_set_interfaceContext csz_set_interface() throws RecognitionException {
		Csz_set_interfaceContext _localctx = new Csz_set_interfaceContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_csz_set_interface);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
			match(INTERFACE);
			setState(888);
			((Csz_set_interfaceContext)_localctx).interfaces = interface_names();
			setState(889);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Csz_append_interfaceContext extends ParserRuleContext {
		public Interface_namesContext interfaces;
		public TerminalNode INTERFACE() { return getToken(FortiosParser.INTERFACE, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Interface_namesContext interface_names() {
			return getRuleContext(Interface_namesContext.class,0);
		}
		public Csz_append_interfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csz_append_interface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterCsz_append_interface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitCsz_append_interface(this);
		}
	}

	public final Csz_append_interfaceContext csz_append_interface() throws RecognitionException {
		Csz_append_interfaceContext _localctx = new Csz_append_interfaceContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_csz_append_interface);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(891);
			match(INTERFACE);
			setState(892);
			((Csz_append_interfaceContext)_localctx).interfaces = interface_names();
			setState(893);
			newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Zone_nameContext extends ParserRuleContext {
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public Zone_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zone_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).enterZone_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FortiosParserListener ) ((FortiosParserListener)listener).exitZone_name(this);
		}
	}

	public final Zone_nameContext zone_name() throws RecognitionException {
		Zone_nameContext _localctx = new Zone_nameContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_zone_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(895);
			str();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3|\u0384\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\3\2\6\2\u0114\n\2\r\2\16\2\u0115\3\2\3\2\3\3\3\3\3\4\3\4\3\4\5\4\u011f"+
		"\n\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5\u0127\n\5\f\5\16\5\u012a\13\5\3\6\3\6"+
		"\5\6\u012e\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u013a\n\b\f"+
		"\b\16\b\u013d\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\n\u0150\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\5\30\u0183"+
		"\n\30\3\30\3\30\3\31\3\31\5\31\u0189\n\31\3\31\3\31\3\32\3\32\3\33\6\33"+
		"\u0190\n\33\r\33\16\33\u0191\3\34\6\34\u0195\n\34\r\34\16\34\u0196\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \5 \u01a3\n \3!\3!\3!\3\"\3\"\3#"+
		"\3#\3$\3$\3%\5%\u01af\n%\3%\3%\3&\7&\u01b4\n&\f&\16&\u01b7\13&\3&\3&\3"+
		"\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\6,\u01c9\n,\r,\16,\u01ca\3"+
		"-\3-\3.\3.\3/\3/\3/\5/\u01d4\n/\3\60\3\60\3\61\3\61\3\61\3\61\5\61\u01dc"+
		"\n\61\3\62\3\62\3\62\7\62\u01e1\n\62\f\62\16\62\u01e4\13\62\3\63\3\63"+
		"\3\63\3\63\7\63\u01ea\n\63\f\63\16\63\u01ed\13\63\3\63\3\63\3\63\3\64"+
		"\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u01ff"+
		"\n\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\38\39\39\39\39"+
		"\3:\3:\3:\3:\3;\3;\3;\3;\3<\3<\3<\3<\3=\3=\3=\3=\3>\3>\3>\3>\3?\3?\3?"+
		"\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3E\7E\u0235\nE\fE\16E\u0238\13E\3"+
		"F\3F\3F\3F\7F\u023e\nF\fF\16F\u0241\13F\3F\3F\3F\3G\3G\3G\5G\u0249\nG"+
		"\3G\3G\3G\3G\5G\u024f\nG\3H\3H\3H\3H\5H\u0255\nH\3I\3I\3I\3I\3J\3J\3J"+
		"\3J\3K\3K\3K\3K\3L\3L\3L\3L\3M\3M\3M\3M\3M\5M\u026c\nM\3N\3N\3N\3N\3O"+
		"\3O\3O\3O\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3S\3S\3S\3S\3S\5S\u0287"+
		"\nS\3T\3T\3T\3T\3U\3U\3U\3U\3V\3V\3V\3V\3W\3W\3W\3W\3X\3X\3X\3X\3Y\3Y"+
		"\3Z\3Z\3[\3[\3\\\3\\\3]\6]\u02a6\n]\r]\16]\u02a7\3^\6^\u02ab\n^\r^\16"+
		"^\u02ac\3_\6_\u02b0\n_\r_\16_\u02b1\3`\3`\3`\3a\3a\3a\7a\u02ba\na\fa\16"+
		"a\u02bd\13a\3b\3b\5b\u02c1\nb\3c\3c\3c\3c\3c\3c\3d\3d\3d\3d\7d\u02cd\n"+
		"d\fd\16d\u02d0\13d\3d\3d\3d\3e\3e\3e\3f\3f\3f\3f\3f\3f\3f\3f\5f\u02e0"+
		"\nf\3g\3g\3g\3g\3h\3h\3h\3h\3i\3i\3i\3i\3j\3j\3j\3j\3k\3k\3k\3k\3l\3l"+
		"\3l\3l\3m\3m\3m\3m\3n\3n\3n\3n\3o\3o\3p\3p\3q\6q\u0307\nq\rq\16q\u0308"+
		"\3r\3r\3r\5r\u030e\nr\3s\3s\3t\3t\3t\3t\3t\5t\u0317\nt\3u\3u\3u\7u\u031c"+
		"\nu\fu\16u\u031f\13u\3v\3v\3v\3w\3w\3w\3w\3x\3x\3y\3y\3y\3y\3y\7y\u032f"+
		"\ny\fy\16y\u0332\13y\3z\3z\3{\3{\3|\3|\3|\3|\5|\u033c\n|\3}\3}\3}\3}\3"+
		"~\3~\3~\3\177\3\177\3\177\7\177\u0348\n\177\f\177\16\177\u034b\13\177"+
		"\3\u0080\3\u0080\5\u0080\u034f\n\u0080\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\7\u0081\u0355\n\u0081\f\u0081\16\u0081\u0358\13\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0083\3\u0083"+
		"\3\u0083\5\u0083\u0366\n\u0083\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083"+
		"\u036c\n\u0083\3\u0084\3\u0084\5\u0084\u0370\n\u0084\3\u0085\3\u0085\3"+
		"\u0085\3\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0088\3\u0088\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\2\2\u008a"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec"+
		"\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104"+
		"\u0106\u0108\u010a\u010c\u010e\u0110\2\17\7\2\22\22\26\26\'\'JJVV\t\2"+
		"\37\37\'\'))\63\63\66\67;;ff\3\2no\3\2tt\3\2vw\3\2vx\4\2\32\32!!\4\2\33"+
		"\33``\4\2\f\f\30\30\n\2\t\t  ::BBFF\\\\ccgg\5\2\f\f\30\3099\5\2./88YY"+
		"\17\2\6\6\n\n\20\20&&((,-<<??OORR[[aaee\2\u034e\2\u0113\3\2\2\2\4\u0119"+
		"\3\2\2\2\6\u011b\3\2\2\2\b\u0123\3\2\2\2\n\u012d\3\2\2\2\f\u012f\3\2\2"+
		"\2\16\u0135\3\2\2\2\20\u0141\3\2\2\2\22\u014f\3\2\2\2\24\u0151\3\2\2\2"+
		"\26\u0155\3\2\2\2\30\u0159\3\2\2\2\32\u015d\3\2\2\2\34\u0161\3\2\2\2\36"+
		"\u0165\3\2\2\2 \u0169\3\2\2\2\"\u016d\3\2\2\2$\u0171\3\2\2\2&\u0175\3"+
		"\2\2\2(\u0179\3\2\2\2*\u017c\3\2\2\2,\u017e\3\2\2\2.\u0180\3\2\2\2\60"+
		"\u0186\3\2\2\2\62\u018c\3\2\2\2\64\u018f\3\2\2\2\66\u0194\3\2\2\28\u0198"+
		"\3\2\2\2:\u019a\3\2\2\2<\u019c\3\2\2\2>\u01a2\3\2\2\2@\u01a4\3\2\2\2B"+
		"\u01a7\3\2\2\2D\u01a9\3\2\2\2F\u01ab\3\2\2\2H\u01ae\3\2\2\2J\u01b5\3\2"+
		"\2\2L\u01ba\3\2\2\2N\u01bc\3\2\2\2P\u01be\3\2\2\2R\u01c0\3\2\2\2T\u01c2"+
		"\3\2\2\2V\u01c8\3\2\2\2X\u01cc\3\2\2\2Z\u01ce\3\2\2\2\\\u01d0\3\2\2\2"+
		"^\u01d5\3\2\2\2`\u01d7\3\2\2\2b\u01dd\3\2\2\2d\u01e5\3\2\2\2f\u01f1\3"+
		"\2\2\2h\u01fe\3\2\2\2j\u0200\3\2\2\2l\u0204\3\2\2\2n\u0208\3\2\2\2p\u020c"+
		"\3\2\2\2r\u0210\3\2\2\2t\u0214\3\2\2\2v\u0218\3\2\2\2x\u021c\3\2\2\2z"+
		"\u0220\3\2\2\2|\u0224\3\2\2\2~\u0227\3\2\2\2\u0080\u0229\3\2\2\2\u0082"+
		"\u022b\3\2\2\2\u0084\u022d\3\2\2\2\u0086\u022f\3\2\2\2\u0088\u0231\3\2"+
		"\2\2\u008a\u0239\3\2\2\2\u008c\u024e\3\2\2\2\u008e\u0254\3\2\2\2\u0090"+
		"\u0256\3\2\2\2\u0092\u025a\3\2\2\2\u0094\u025e\3\2\2\2\u0096\u0262\3\2"+
		"\2\2\u0098\u026b\3\2\2\2\u009a\u026d\3\2\2\2\u009c\u0271\3\2\2\2\u009e"+
		"\u0275\3\2\2\2\u00a0\u0279\3\2\2\2\u00a2\u027d\3\2\2\2\u00a4\u0286\3\2"+
		"\2\2\u00a6\u0288\3\2\2\2\u00a8\u028c\3\2\2\2\u00aa\u0290\3\2\2\2\u00ac"+
		"\u0294\3\2\2\2\u00ae\u0298\3\2\2\2\u00b0\u029c\3\2\2\2\u00b2\u029e\3\2"+
		"\2\2\u00b4\u02a0\3\2\2\2\u00b6\u02a2\3\2\2\2\u00b8\u02a5\3\2\2\2\u00ba"+
		"\u02aa\3\2\2\2\u00bc\u02af\3\2\2\2\u00be\u02b3\3\2\2\2\u00c0\u02b6\3\2"+
		"\2\2\u00c2\u02c0\3\2\2\2\u00c4\u02c2\3\2\2\2\u00c6\u02c8\3\2\2\2\u00c8"+
		"\u02d4\3\2\2\2\u00ca\u02df\3\2\2\2\u00cc\u02e1\3\2\2\2\u00ce\u02e5\3\2"+
		"\2\2\u00d0\u02e9\3\2\2\2\u00d2\u02ed\3\2\2\2\u00d4\u02f1\3\2\2\2\u00d6"+
		"\u02f5\3\2\2\2\u00d8\u02f9\3\2\2\2\u00da\u02fd\3\2\2\2\u00dc\u0301\3\2"+
		"\2\2\u00de\u0303\3\2\2\2\u00e0\u0306\3\2\2\2\u00e2\u030a\3\2\2\2\u00e4"+
		"\u030f\3\2\2\2\u00e6\u0311\3\2\2\2\u00e8\u0318\3\2\2\2\u00ea\u0320\3\2"+
		"\2\2\u00ec\u0323\3\2\2\2\u00ee\u0327\3\2\2\2\u00f0\u0329\3\2\2\2\u00f2"+
		"\u0333\3\2\2\2\u00f4\u0335\3\2\2\2\u00f6\u033b\3\2\2\2\u00f8\u033d\3\2"+
		"\2\2\u00fa\u0341\3\2\2\2\u00fc\u0344\3\2\2\2\u00fe\u034e\3\2\2\2\u0100"+
		"\u0350\3\2\2\2\u0102\u035c\3\2\2\2\u0104\u036b\3\2\2\2\u0106\u036f\3\2"+
		"\2\2\u0108\u0371\3\2\2\2\u010a\u0375\3\2\2\2\u010c\u0379\3\2\2\2\u010e"+
		"\u037d\3\2\2\2\u0110\u0381\3\2\2\2\u0112\u0114\5\4\3\2\u0113\u0112\3\2"+
		"\2\2\u0114\u0115\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0118\7\2\2\3\u0118\3\3\2\2\2\u0119\u011a\5\6\4\2"+
		"\u011a\5\3\2\2\2\u011b\u011e\7\25\2\2\u011c\u011f\5\u00e6t\2\u011d\u011f"+
		"\5`\61\2\u011e\u011c\3\2\2\2\u011e\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u0121\7\"\2\2\u0121\u0122\7t\2\2\u0122\7\3\2\2\2\u0123\u0124\7\b\2\2"+
		"\u0124\u0128\5H%\2\u0125\u0127\5\n\6\2\u0126\u0125\3\2\2\2\u0127\u012a"+
		"\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\t\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012b\u012e\5\16\b\2\u012c\u012e\5\f\7\2\u012d\u012b\3"+
		"\2\2\2\u012d\u012c\3\2\2\2\u012e\13\3\2\2\2\u012f\u0130\7G\2\2\u0130\u0131"+
		"\5,\27\2\u0131\u0132\7Z\2\2\u0132\u0133\5,\27\2\u0133\u0134\5H%\2\u0134"+
		"\r\3\2\2\2\u0135\u0136\7\36\2\2\u0136\u0137\5,\27\2\u0137\u013b\5H%\2"+
		"\u0138\u013a\5\20\t\2\u0139\u0138\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139"+
		"\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u013b\3\2\2\2\u013e"+
		"\u013f\7A\2\2\u013f\u0140\5H%\2\u0140\17\3\2\2\2\u0141\u0142\7M\2\2\u0142"+
		"\u0143\5\22\n\2\u0143\21\3\2\2\2\u0144\u0150\5\24\13\2\u0145\u0150\5\26"+
		"\f\2\u0146\u0150\5\30\r\2\u0147\u0150\5\32\16\2\u0148\u0150\5\34\17\2"+
		"\u0149\u0150\5\36\20\2\u014a\u0150\5 \21\2\u014b\u0150\5\"\22\2\u014c"+
		"\u0150\5$\23\2\u014d\u0150\5&\24\2\u014e\u0150\5(\25\2\u014f\u0144\3\2"+
		"\2\2\u014f\u0145\3\2\2\2\u014f\u0146\3\2\2\2\u014f\u0147\3\2\2\2\u014f"+
		"\u0148\3\2\2\2\u014f\u0149\3\2\2\2\u014f\u014a\3\2\2\2\u014f\u014b\3\2"+
		"\2\2\u014f\u014c\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u014e\3\2\2\2\u0150"+
		"\23\3\2\2\2\u0151\u0152\7\r\2\2\u0152\u0153\5X-\2\u0153\u0154\5H%\2\u0154"+
		"\25\3\2\2\2\u0155\u0156\7\17\2\2\u0156\u0157\5\62\32\2\u0157\u0158\5H"+
		"%\2\u0158\27\3\2\2\2\u0159\u015a\7\23\2\2\u015a\u015b\5T+\2\u015b\u015c"+
		"\5H%\2\u015c\31\3\2\2\2\u015d\u015e\7#\2\2\u015e\u015f\58\35\2\u015f\u0160"+
		"\5H%\2\u0160\33\3\2\2\2\u0161\u0162\7\62\2\2\u0162\u0163\5\u0086D\2\u0163"+
		"\u0164\5H%\2\u0164\35\3\2\2\2\u0165\u0166\7$\2\2\u0166\u0167\5X-\2\u0167"+
		"\u0168\5H%\2\u0168\37\3\2\2\2\u0169\u016a\7S\2\2\u016a\u016b\58\35\2\u016b"+
		"\u016c\5H%\2\u016c!\3\2\2\2\u016d\u016e\7U\2\2\u016e\u016f\5> \2\u016f"+
		"\u0170\5H%\2\u0170#\3\2\2\2\u0171\u0172\7]\2\2\u0172\u0173\5*\26\2\u0173"+
		"\u0174\5H%\2\u0174%\3\2\2\2\u0175\u0176\7f\2\2\u0176\u0177\5@!\2\u0177"+
		"\u0178\5H%\2\u0178\'\3\2\2\2\u0179\u017a\t\2\2\2\u017a\u017b\5J&\2\u017b"+
		")\3\2\2\2\u017c\u017d\t\3\2\2\u017d+\3\2\2\2\u017e\u017f\5T+\2\u017f-"+
		"\3\2\2\2\u0180\u0182\7m\2\2\u0181\u0183\5\66\34\2\u0182\u0181\3\2\2\2"+
		"\u0182\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\7m\2\2\u0185/\3\2"+
		"\2\2\u0186\u0188\7u\2\2\u0187\u0189\5\66\34\2\u0188\u0187\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\7u\2\2\u018b\61\3\2\2\2"+
		"\u018c\u018d\5T+\2\u018d\63\3\2\2\2\u018e\u0190\5\u0086D\2\u018f\u018e"+
		"\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192"+
		"\65\3\2\2\2\u0193\u0195\7\3\2\2\u0194\u0193\3\2\2\2\u0195\u0196\3\2\2"+
		"\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\67\3\2\2\2\u0198\u0199"+
		"\t\4\2\2\u01999\3\2\2\2\u019a\u019b\7n\2\2\u019b;\3\2\2\2\u019c\u019d"+
		"\7p\2\2\u019d=\3\2\2\2\u019e\u019f\58\35\2\u019f\u01a0\5:\36\2\u01a0\u01a3"+
		"\3\2\2\2\u01a1\u01a3\5<\37\2\u01a2\u019e\3\2\2\2\u01a2\u01a1\3\2\2\2\u01a3"+
		"?\3\2\2\2\u01a4\u01a5\58\35\2\u01a5\u01a6\58\35\2\u01a6A\3\2\2\2\u01a7"+
		"\u01a8\7q\2\2\u01a8C\3\2\2\2\u01a9\u01aa\7r\2\2\u01aaE\3\2\2\2\u01ab\u01ac"+
		"\7s\2\2\u01acG\3\2\2\2\u01ad\u01af\7\4\2\2\u01ae\u01ad\3\2\2\2\u01ae\u01af"+
		"\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\7t\2\2\u01b1I\3\2\2\2\u01b2\u01b4"+
		"\n\5\2\2\u01b3\u01b2\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5"+
		"\u01b6\3\2\2\2\u01b6\u01b8\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01b9\7t"+
		"\2\2\u01b9K\3\2\2\2\u01ba\u01bb\7v\2\2\u01bbM\3\2\2\2\u01bc\u01bd\t\6"+
		"\2\2\u01bdO\3\2\2\2\u01be\u01bf\t\7\2\2\u01bfQ\3\2\2\2\u01c0\u01c1\5T"+
		"+\2\u01c1S\3\2\2\2\u01c2\u01c3\7\4\2\2\u01c3\u01c4\5V,\2\u01c4U\3\2\2"+
		"\2\u01c5\u01c9\5.\30\2\u01c6\u01c9\5\60\31\2\u01c7\u01c9\7\5\2\2\u01c8"+
		"\u01c5\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c7\3\2\2\2\u01c9\u01ca\3\2"+
		"\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cbW\3\2\2\2\u01cc\u01cd"+
		"\t\b\2\2\u01cdY\3\2\2\2\u01ce\u01cf\t\t\2\2\u01cf[\3\2\2\2\u01d0\u01d3"+
		"\5N(\2\u01d1\u01d2\7k\2\2\u01d2\u01d4\5N(\2\u01d3\u01d1\3\2\2\2\u01d3"+
		"\u01d4\3\2\2\2\u01d4]\3\2\2\2\u01d5\u01d6\t\n\2\2\u01d6_\3\2\2\2\u01d7"+
		"\u01db\7%\2\2\u01d8\u01dc\5\b\5\2\u01d9\u01dc\5\u0088E\2\u01da\u01dc\5"+
		"\u00be`\2\u01db\u01d8\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01da\3\2\2\2"+
		"\u01dca\3\2\2\2\u01dd\u01de\7\62\2\2\u01de\u01e2\5H%\2\u01df\u01e1\5d"+
		"\63\2\u01e0\u01df\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2"+
		"\u01e3\3\2\2\2\u01e3c\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01e6\7\36\2\2"+
		"\u01e6\u01e7\5\u0086D\2\u01e7\u01eb\5H%\2\u01e8\u01ea\5f\64\2\u01e9\u01e8"+
		"\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec"+
		"\u01ee\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01ef\7A\2\2\u01ef\u01f0\5H%"+
		"\2\u01f0e\3\2\2\2\u01f1\u01f2\7M\2\2\u01f2\u01f3\5h\65\2\u01f3g\3\2\2"+
		"\2\u01f4\u01ff\5j\66\2\u01f5\u01ff\5l\67\2\u01f6\u01ff\5n8\2\u01f7\u01ff"+
		"\5p9\2\u01f8\u01ff\5r:\2\u01f9\u01ff\5t;\2\u01fa\u01ff\5v<\2\u01fb\u01ff"+
		"\5x=\2\u01fc\u01ff\5z>\2\u01fd\u01ff\5|?\2\u01fe\u01f4\3\2\2\2\u01fe\u01f5"+
		"\3\2\2\2\u01fe\u01f6\3\2\2\2\u01fe\u01f7\3\2\2\2\u01fe\u01f8\3\2\2\2\u01fe"+
		"\u01f9\3\2\2\2\u01fe\u01fa\3\2\2\2\u01fe\u01fb\3\2\2\2\u01fe\u01fc\3\2"+
		"\2\2\u01fe\u01fd\3\2\2\2\u01ffi\3\2\2\2\u0200\u0201\7\13\2\2\u0201\u0202"+
		"\5\u0084C\2\u0202\u0203\5H%\2\u0203k\3\2\2\2\u0204\u0205\7\31\2\2\u0205"+
		"\u0206\5T+\2\u0206\u0207\5H%\2\u0207m\3\2\2\2\u0208\u0209\7\65\2\2\u0209"+
		"\u020a\5> \2\u020a\u020b\5H%\2\u020bo\3\2\2\2\u020c\u020d\7=\2\2\u020d"+
		"\u020e\5~@\2\u020e\u020f\5H%\2\u020fq\3\2\2\2\u0210\u0211\7>\2\2\u0211"+
		"\u0212\5X-\2\u0212\u0213\5H%\2\u0213s\3\2\2\2\u0214\u0215\7T\2\2\u0215"+
		"\u0216\5Z.\2\u0216\u0217\5H%\2\u0217u\3\2\2\2\u0218\u0219\7]\2\2\u0219"+
		"\u021a\5\u0082B\2\u021a\u021b\5H%\2\u021bw\3\2\2\2\u021c\u021d\7b\2\2"+
		"\u021d\u021e\5T+\2\u021e\u021f\5H%\2\u021fy\3\2\2\2\u0220\u0221\7d\2\2"+
		"\u0221\u0222\5\u0080A\2\u0222\u0223\5H%\2\u0223{\3\2\2\2\u0224\u0225\7"+
		"N\2\2\u0225\u0226\5J&\2\u0226}\3\2\2\2\u0227\u0228\5N(\2\u0228\177\3\2"+
		"\2\2\u0229\u022a\5L\'\2\u022a\u0081\3\2\2\2\u022b\u022c\t\13\2\2\u022c"+
		"\u0083\3\2\2\2\u022d\u022e\5T+\2\u022e\u0085\3\2\2\2\u022f\u0230\5T+\2"+
		"\u0230\u0087\3\2\2\2\u0231\u0232\7C\2\2\u0232\u0236\5H%\2\u0233\u0235"+
		"\5\u008aF\2\u0234\u0233\3\2\2\2\u0235\u0238\3\2\2\2\u0236\u0234\3\2\2"+
		"\2\u0236\u0237\3\2\2\2\u0237\u0089\3\2\2\2\u0238\u0236\3\2\2\2\u0239\u023a"+
		"\7\36\2\2\u023a\u023b\5\u00b4[\2\u023b\u023f\5H%\2\u023c\u023e\5\u008c"+
		"G\2\u023d\u023c\3\2\2\2\u023e\u0241\3\2\2\2\u023f\u023d\3\2\2\2\u023f"+
		"\u0240\3\2\2\2\u0240\u0242\3\2\2\2\u0241\u023f\3\2\2\2\u0242\u0243\7A"+
		"\2\2\u0243\u0244\5H%\2\u0244\u008b\3\2\2\2\u0245\u0248\7M\2\2\u0246\u0249"+
		"\5\u008eH\2\u0247\u0249\5\u0098M\2\u0248\u0246\3\2\2\2\u0248\u0247\3\2"+
		"\2\2\u0249\u024f\3\2\2\2\u024a\u024b\7\16\2\2\u024b\u024f\5\u00a4S\2\u024c"+
		"\u024d\7K\2\2\u024d\u024f\5\u0098M\2\u024e\u0245\3\2\2\2\u024e\u024a\3"+
		"\2\2\2\u024e\u024c\3\2\2\2\u024f\u008d\3\2\2\2\u0250\u0255\5\u0090I\2"+
		"\u0251\u0255\5\u0092J\2\u0252\u0255\5\u0094K\2\u0253\u0255\5\u0096L\2"+
		"\u0254\u0250\3\2\2\2\u0254\u0251\3\2\2\2\u0254\u0252\3\2\2\2\u0254\u0253"+
		"\3\2\2\2\u0255\u008f\3\2\2\2\u0256\u0257\7\7\2\2\u0257\u0258\5\u00b6\\"+
		"\2\u0258\u0259\5H%\2\u0259\u0091\3\2\2\2\u025a\u025b\7\24\2\2\u025b\u025c"+
		"\5T+\2\u025c\u025d\5H%\2\u025d\u0093\3\2\2\2\u025e\u025f\7@\2\2\u025f"+
		"\u0260\5\u00b0Y\2\u0260\u0261\5H%\2\u0261\u0095\3\2\2\2\u0262\u0263\7"+
		"T\2\2\u0263\u0264\5\u00b2Z\2\u0264\u0265\5H%\2\u0265\u0097\3\2\2\2\u0266"+
		"\u026c\5\u009aN\2\u0267\u026c\5\u00a0Q\2\u0268\u026c\5\u009eP\2\u0269"+
		"\u026c\5\u009cO\2\u026a\u026c\5\u00a2R\2\u026b\u0266\3\2\2\2\u026b\u0267"+
		"\3\2\2\2\u026b\u0268\3\2\2\2\u026b\u0269\3\2\2\2\u026b\u026a\3\2\2\2\u026c"+
		"\u0099\3\2\2\2\u026d\u026e\7\34\2\2\u026e\u026f\5\u00b8]\2\u026f\u0270"+
		"\5H%\2\u0270\u009b\3\2\2\2\u0271\u0272\7P\2\2\u0272\u0273\5\u00b8]\2\u0273"+
		"\u0274\5H%\2\u0274\u009d\3\2\2\2\u0275\u0276\7L\2\2\u0276\u0277\5\u00ba"+
		"^\2\u0277\u0278\5H%\2\u0278\u009f\3\2\2\2\u0279\u027a\7\35\2\2\u027a\u027b"+
		"\5\u00bc_\2\u027b\u027c\5H%\2\u027c\u00a1\3\2\2\2\u027d\u027e\7Q\2\2\u027e"+
		"\u027f\5\u00bc_\2\u027f\u0280\5H%\2\u0280\u00a3\3\2\2\2\u0281\u0287\5"+
		"\u00a6T\2\u0282\u0287\5\u00acW\2\u0283\u0287\5\u00aaV\2\u0284\u0287\5"+
		"\u00a8U\2\u0285\u0287\5\u00aeX\2\u0286\u0281\3\2\2\2\u0286\u0282\3\2\2"+
		"\2\u0286\u0283\3\2\2\2\u0286\u0284\3\2\2\2\u0286\u0285\3\2\2\2\u0287\u00a5"+
		"\3\2\2\2\u0288\u0289\7\34\2\2\u0289\u028a\5\u00b8]\2\u028a\u028b\5H%\2"+
		"\u028b\u00a7\3\2\2\2\u028c\u028d\7P\2\2\u028d\u028e\5\u00b8]\2\u028e\u028f"+
		"\5H%\2\u028f\u00a9\3\2\2\2\u0290\u0291\7L\2\2\u0291\u0292\5\u00ba^\2\u0292"+
		"\u0293\5H%\2\u0293\u00ab\3\2\2\2\u0294\u0295\7\35\2\2\u0295\u0296\5\u00bc"+
		"_\2\u0296\u0297\5H%\2\u0297\u00ad\3\2\2\2\u0298\u0299\7Q\2\2\u0299\u029a"+
		"\5\u00bc_\2\u029a\u029b\5H%\2\u029b\u00af\3\2\2\2\u029c\u029d\5T+\2\u029d"+
		"\u00b1\3\2\2\2\u029e\u029f\5X-\2\u029f\u00b3\3\2\2\2\u02a0\u02a1\5T+\2"+
		"\u02a1\u00b5\3\2\2\2\u02a2\u02a3\t\f\2\2\u02a3\u00b7\3\2\2\2\u02a4\u02a6"+
		"\5,\27\2\u02a5\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a7"+
		"\u02a8\3\2\2\2\u02a8\u00b9\3\2\2\2\u02a9\u02ab\5\u00dco\2\u02aa\u02a9"+
		"\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad"+
		"\u00bb\3\2\2\2\u02ae\u02b0\5\62\32\2\u02af\u02ae\3\2\2\2\u02b0\u02b1\3"+
		"\2\2\2\u02b1\u02af\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u00bd\3\2\2\2\u02b3"+
		"\u02b4\7L\2\2\u02b4\u02b5\5\u00c0a\2\u02b5\u00bf\3\2\2\2\u02b6\u02b7\7"+
		"\27\2\2\u02b7\u02bb\5H%\2\u02b8\u02ba\5\u00c2b\2\u02b9\u02b8\3\2\2\2\u02ba"+
		"\u02bd\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u00c1\3\2"+
		"\2\2\u02bd\u02bb\3\2\2\2\u02be\u02c1\5\u00c6d\2\u02bf\u02c1\5\u00c4c\2"+
		"\u02c0\u02be\3\2\2\2\u02c0\u02bf\3\2\2\2\u02c1\u00c3\3\2\2\2\u02c2\u02c3"+
		"\7G\2\2\u02c3\u02c4\5\u00dco\2\u02c4\u02c5\7Z\2\2\u02c5\u02c6\5\u00dc"+
		"o\2\u02c6\u02c7\5H%\2\u02c7\u00c5\3\2\2\2\u02c8\u02c9\7\36\2\2\u02c9\u02ca"+
		"\5\u00dco\2\u02ca\u02ce\5H%\2\u02cb\u02cd\5\u00c8e\2\u02cc\u02cb\3\2\2"+
		"\2\u02cd\u02d0\3\2\2\2\u02ce\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d1"+
		"\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d1\u02d2\7A\2\2\u02d2\u02d3\5H%\2\u02d3"+
		"\u00c7\3\2\2\2\u02d4\u02d5\7M\2\2\u02d5\u02d6\5\u00caf\2\u02d6\u00c9\3"+
		"\2\2\2\u02d7\u02e0\5\u00ccg\2\u02d8\u02e0\5\u00ceh\2\u02d9\u02e0\5\u00d0"+
		"i\2\u02da\u02e0\5\u00d2j\2\u02db\u02e0\5\u00d4k\2\u02dc\u02e0\5\u00d6"+
		"l\2\u02dd\u02e0\5\u00d8m\2\u02de\u02e0\5\u00dan\2\u02df\u02d7\3\2\2\2"+
		"\u02df\u02d8\3\2\2\2\u02df\u02d9\3\2\2\2\u02df\u02da\3\2\2\2\u02df\u02db"+
		"\3\2\2\2\u02df\u02dc\3\2\2\2\u02df\u02dd\3\2\2\2\u02df\u02de\3\2\2\2\u02e0"+
		"\u00cb\3\2\2\2\u02e1\u02e2\7\23\2\2\u02e2\u02e3\5T+\2\u02e3\u02e4\5H%"+
		"\2\u02e4\u00cd\3\2\2\2\u02e5\u02e6\7\60\2\2\u02e6\u02e7\5L\'\2\u02e7\u02e8"+
		"\5H%\2\u02e8\u00cf\3\2\2\2\u02e9\u02ea\7\61\2\2\u02ea\u02eb\5L\'\2\u02eb"+
		"\u02ec\5H%\2\u02ec\u00d1\3\2\2\2\u02ed\u02ee\7D\2\2\u02ee\u02ef\5\u00de"+
		"p\2\u02ef\u02f0\5H%\2\u02f0\u00d3\3\2\2\2\u02f1\u02f2\7E\2\2\u02f2\u02f3"+
		"\5\u00e4s\2\u02f3\u02f4\5H%\2\u02f4\u00d5\3\2\2\2\u02f5\u02f6\7I\2\2\u02f6"+
		"\u02f7\5\u00e0q\2\u02f7\u02f8\5H%\2\u02f8\u00d7\3\2\2\2\u02f9\u02fa\7"+
		"X\2\2\u02fa\u02fb\5\u00e0q\2\u02fb\u02fc\5H%\2\u02fc\u00d9\3\2\2\2\u02fd"+
		"\u02fe\7^\2\2\u02fe\u02ff\5\u00e0q\2\u02ff\u0300\5H%\2\u0300\u00db\3\2"+
		"\2\2\u0301\u0302\5T+\2\u0302\u00dd\3\2\2\2\u0303\u0304\t\r\2\2\u0304\u00df"+
		"\3\2\2\2\u0305\u0307\5\u00e2r\2\u0306\u0305\3\2\2\2\u0307\u0308\3\2\2"+
		"\2\u0308\u0306\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u00e1\3\2\2\2\u030a\u030d"+
		"\5\\/\2\u030b\u030c\7j\2\2\u030c\u030e\5\\/\2\u030d\u030b\3\2\2\2\u030d"+
		"\u030e\3\2\2\2\u030e\u00e3\3\2\2\2\u030f\u0310\5L\'\2\u0310\u00e5\3\2"+
		"\2\2\u0311\u0316\7W\2\2\u0312\u0317\5\u00e8u\2\u0313\u0317\5b\62\2\u0314"+
		"\u0317\5\u00f0y\2\u0315\u0317\5\u00fc\177\2\u0316\u0312\3\2\2\2\u0316"+
		"\u0313\3\2\2\2\u0316\u0314\3\2\2\2\u0316\u0315\3\2\2\2\u0317\u00e7\3\2"+
		"\2\2\u0318\u0319\7*\2\2\u0319\u031d\5H%\2\u031a\u031c\5\u00eav\2\u031b"+
		"\u031a\3\2\2\2\u031c\u031f\3\2\2\2\u031d\u031b\3\2\2\2\u031d\u031e\3\2"+
		"\2\2\u031e\u00e9\3\2\2\2\u031f\u031d\3\2\2\2\u0320\u0321\7M\2\2\u0321"+
		"\u0322\5\u00ecw\2\u0322\u00eb\3\2\2\2\u0323\u0324\7+\2\2\u0324\u0325\5"+
		"\u00eex\2\u0325\u0326\5H%\2\u0326\u00ed\3\2\2\2\u0327\u0328\5T+\2\u0328"+
		"\u00ef\3\2\2\2\u0329\u032a\7H\2\2\u032a\u032b\5\u00f2z\2\u032b\u032c\5"+
		"\u00f4{\2\u032c\u0330\5H%\2\u032d\u032f\5\u00f6|\2\u032e\u032d\3\2\2\2"+
		"\u032f\u0332\3\2\2\2\u0330\u032e\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u00f1"+
		"\3\2\2\2\u0332\u0330\3\2\2\2\u0333\u0334\t\16\2\2\u0334\u00f3\3\2\2\2"+
		"\u0335\u0336\5R*\2\u0336\u00f5\3\2\2\2\u0337\u0338\7M\2\2\u0338\u033c"+
		"\5\u00f8}\2\u0339\u033a\7_\2\2\u033a\u033c\5\u00fa~\2\u033b\u0337\3\2"+
		"\2\2\u033b\u0339\3\2\2\2\u033c\u00f7\3\2\2\2\u033d\u033e\7\21\2\2\u033e"+
		"\u033f\5T+\2\u033f\u0340\5H%\2\u0340\u00f9\3\2\2\2\u0341\u0342\7\21\2"+
		"\2\u0342\u0343\5H%\2\u0343\u00fb\3\2\2\2\u0344\u0345\7h\2\2\u0345\u0349"+
		"\5H%\2\u0346\u0348\5\u0100\u0081\2\u0347\u0346\3\2\2\2\u0348\u034b\3\2"+
		"\2\2\u0349\u0347\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u00fd\3\2\2\2\u034b"+
		"\u0349\3\2\2\2\u034c\u034f\5\u0100\u0081\2\u034d\u034f\5\u0102\u0082\2"+
		"\u034e\u034c\3\2\2\2\u034e\u034d\3\2\2\2\u034f\u00ff\3\2\2\2\u0350\u0351"+
		"\7\36\2\2\u0351\u0352\5\u0110\u0089\2\u0352\u0356\5H%\2\u0353\u0355\5"+
		"\u0104\u0083\2\u0354\u0353\3\2\2\2\u0355\u0358\3\2\2\2\u0356\u0354\3\2"+
		"\2\2\u0356\u0357\3\2\2\2\u0357\u0359\3\2\2\2\u0358\u0356\3\2\2\2\u0359"+
		"\u035a\7A\2\2\u035a\u035b\5H%\2\u035b\u0101\3\2\2\2\u035c\u035d\7G\2\2"+
		"\u035d\u035e\5\u0110\u0089\2\u035e\u035f\7Z\2\2\u035f\u0360\5\u0110\u0089"+
		"\2\u0360\u0361\5H%\2\u0361\u0103\3\2\2\2\u0362\u0365\7M\2\2\u0363\u0366"+
		"\5\u0106\u0084\2\u0364\u0366\5\u010c\u0087\2\u0365\u0363\3\2\2\2\u0365"+
		"\u0364\3\2\2\2\u0366\u036c\3\2\2\2\u0367\u0368\7\16\2\2\u0368\u036c\5"+
		"\u010e\u0088\2\u0369\u036a\7K\2\2\u036a\u036c\5\u010c\u0087\2\u036b\u0362"+
		"\3\2\2\2\u036b\u0367\3\2\2\2\u036b\u0369\3\2\2\2\u036c\u0105\3\2\2\2\u036d"+
		"\u0370\5\u0108\u0085\2\u036e\u0370\5\u010a\u0086\2\u036f\u036d\3\2\2\2"+
		"\u036f\u036e\3\2\2\2\u0370\u0107\3\2\2\2\u0371\u0372\7\31\2\2\u0372\u0373"+
		"\5T+\2\u0373\u0374\5H%\2\u0374\u0109\3\2\2\2\u0375\u0376\7\64\2\2\u0376"+
		"\u0377\5^\60\2\u0377\u0378\5H%\2\u0378\u010b\3\2\2\2\u0379\u037a\7\62"+
		"\2\2\u037a\u037b\5\64\33\2\u037b\u037c\5H%\2\u037c\u010d\3\2\2\2\u037d"+
		"\u037e\7\62\2\2\u037e\u037f\5\64\33\2\u037f\u0380\5H%\2\u0380\u010f\3"+
		"\2\2\2\u0381\u0382\5T+\2\u0382\u0111\3\2\2\2\60\u0115\u011e\u0128\u012d"+
		"\u013b\u014f\u0182\u0188\u0191\u0196\u01a2\u01ae\u01b5\u01c8\u01ca\u01d3"+
		"\u01db\u01e2\u01eb\u01fe\u0236\u023f\u0248\u024e\u0254\u026b\u0286\u02a7"+
		"\u02ac\u02b1\u02bb\u02c0\u02ce\u02df\u0308\u030d\u0316\u031d\u0330\u033b"+
		"\u0349\u034e\u0356\u0365\u036b\u036f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}