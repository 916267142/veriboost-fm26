// Generated from org/batfish/grammar/cumulus_interfaces/CumulusInterfacesParser.g4 by ANTLR 4.7.2
package org.batfish.grammar.cumulus_interfaces;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CumulusInterfacesParser extends org.batfish.grammar.cumulus_interfaces.parsing.CumulusInterfacesBaseParser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TEXT=1, WORD=2, ADD=3, ADDRESS=4, ADDRESS_VIRTUAL=5, ALIAS=6, AUTO=7, 
		BOND_LACP_BYPASS_ALLOW=8, BOND_LACP_RATE=9, BOND_MASTER=10, BOND_MIIMON=11, 
		BOND_MIN_LINKS=12, BOND_MODE=13, BOND_SLAVES=14, BOND_XMIT_HASH_POLICY=15, 
		BRIDGE_PORTS=16, BRIDGE_ACCESS=17, BRIDGE_ARP_ND_SUPPRESS=18, BRIDGE_LEARNING=19, 
		BRIDGE_PVID=20, BRIDGE_VIDS=21, BRIDGE_VLAN_AWARE=22, CLAG_ID=23, CLAGD_VXLAN_ANYCAST_IP=24, 
		CLAGD_BACKUP_IP=25, CLAGD_PEER_IP=26, CLAGD_PRIORITY=27, CLAGD_SYS_MAC=28, 
		DASH=29, DEV=30, DHCP=31, GATEWAY=32, HWADDRESS=33, IFACE=34, INTERFACE=35, 
		INET=36, IP=37, LINK=38, LINK_LOCAL=39, LINK_SPEED=40, LINK_AUTONEG=41, 
		LOOPBACK=42, MANUAL=43, MTU=44, OFF=45, ON=46, MSTPCTL_BPDUGUARD=47, MSTPCTL_PORTADMINEDGE=48, 
		MSTPCTL_PORTBPDUFILTER=49, NO=50, POST_UP=51, ROUTE=52, SET=53, STATIC=54, 
		VIA=55, VLAN_ID=56, VLAN_RAW_DEVICE=57, VRF=58, VRF_TABLE=59, VXLAN_ID=60, 
		VXLAN_LOCAL_TUNNEL_IP=61, YES=62, BLANK_LINE=63, COMMENT_LINE=64, IP_ADDRESS=65, 
		IPV6_ADDRESS=66, IP_PREFIX=67, IPV6_PREFIX=68, MAC_ADDRESS=69, NEWLINE=70, 
		NUMBER=71, WS=72, M_DropUntilNewline_NonNewline=73, M_LineText_WS=74, 
		M_Word_WS=75, M_Words_WS=76;
	public static final int
		RULE_cumulus_interfaces_configuration = 0, RULE_statement = 1, RULE_s_auto = 2, 
		RULE_s_iface = 3, RULE_si_inet = 4, RULE_si_no_inet = 5, RULE_i_property = 6, 
		RULE_i_address = 7, RULE_i_address_virtual = 8, RULE_i_alias = 9, RULE_i_bond_lacp_bypass_allow = 10, 
		RULE_i_bond_lacp_rate = 11, RULE_i_bond_master = 12, RULE_i_bond_miimon = 13, 
		RULE_i_bond_min_links = 14, RULE_i_bond_mode = 15, RULE_i_bond_slaves = 16, 
		RULE_i_bond_xmit_hash_policy = 17, RULE_i_bridge_access = 18, RULE_i_bridge_arp_nd_suppress = 19, 
		RULE_i_bridge_learning = 20, RULE_i_bridge_ports = 21, RULE_i_bridge_pvid = 22, 
		RULE_i_bridge_vids = 23, RULE_i_bridge_vlan_aware = 24, RULE_i_clag_id = 25, 
		RULE_i_clagd_backup_ip = 26, RULE_i_clagd_peer_ip = 27, RULE_i_clagd_priority = 28, 
		RULE_i_clagd_sys_mac = 29, RULE_i_clagd_vxlan_anycast_ip = 30, RULE_i_gateway = 31, 
		RULE_i_hwaddress = 32, RULE_i_link_speed = 33, RULE_i_link_autoneg = 34, 
		RULE_i_mstpctl_bpduguard = 35, RULE_i_mstpctl_portadminedge = 36, RULE_i_mstpctl_portbpdufilter = 37, 
		RULE_i_mtu = 38, RULE_i_post_up = 39, RULE_ipu_ip = 40, RULE_ipui_link = 41, 
		RULE_ipuil_set = 42, RULE_ipui_route = 43, RULE_ipuir_add = 44, RULE_i_vlan_id = 45, 
		RULE_i_vlan_raw_device = 46, RULE_i_vrf = 47, RULE_i_vrf_table = 48, RULE_i_vxlan_id = 49, 
		RULE_i_vxlan_local_tunnel_ip = 50, RULE_interface_name = 51, RULE_number = 52, 
		RULE_number_or_range = 53, RULE_address = 54, RULE_prefix = 55, RULE_interface_address = 56, 
		RULE_address6 = 57, RULE_prefix6 = 58, RULE_interface_address6 = 59, RULE_vlan_id = 60, 
		RULE_vrf_name = 61, RULE_vrf_table_name = 62, RULE_null_rest_of_line = 63;
	private static String[] makeRuleNames() {
		return new String[] {
			"cumulus_interfaces_configuration", "statement", "s_auto", "s_iface", 
			"si_inet", "si_no_inet", "i_property", "i_address", "i_address_virtual", 
			"i_alias", "i_bond_lacp_bypass_allow", "i_bond_lacp_rate", "i_bond_master", 
			"i_bond_miimon", "i_bond_min_links", "i_bond_mode", "i_bond_slaves", 
			"i_bond_xmit_hash_policy", "i_bridge_access", "i_bridge_arp_nd_suppress", 
			"i_bridge_learning", "i_bridge_ports", "i_bridge_pvid", "i_bridge_vids", 
			"i_bridge_vlan_aware", "i_clag_id", "i_clagd_backup_ip", "i_clagd_peer_ip", 
			"i_clagd_priority", "i_clagd_sys_mac", "i_clagd_vxlan_anycast_ip", "i_gateway", 
			"i_hwaddress", "i_link_speed", "i_link_autoneg", "i_mstpctl_bpduguard", 
			"i_mstpctl_portadminedge", "i_mstpctl_portbpdufilter", "i_mtu", "i_post_up", 
			"ipu_ip", "ipui_link", "ipuil_set", "ipui_route", "ipuir_add", "i_vlan_id", 
			"i_vlan_raw_device", "i_vrf", "i_vrf_table", "i_vxlan_id", "i_vxlan_local_tunnel_ip", 
			"interface_name", "number", "number_or_range", "address", "prefix", "interface_address", 
			"address6", "prefix6", "interface_address6", "vlan_id", "vrf_name", "vrf_table_name", 
			"null_rest_of_line"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'add'", "'address'", "'address-virtual'", "'alias'", 
			"'auto'", "'bond-lacp-bypass-allow'", "'bond-lacp-rate'", "'bond-master'", 
			"'bond-miimon'", "'bond-min-links'", "'bond-mode'", "'bond-slaves'", 
			"'bond-xmit-hash-policy'", "'bridge-ports'", "'bridge-access'", "'bridge-arp-nd-suppress'", 
			"'bridge-learning'", "'bridge-pvid'", "'bridge-vids'", "'bridge-vlan-aware'", 
			"'clag-id'", "'clagd-vxlan-anycast-ip'", "'clagd-backup-ip'", "'clagd-peer-ip'", 
			"'clagd-priority'", "'clagd-sys-mac'", "'-'", "'dev'", "'dhcp'", "'gateway'", 
			"'hwaddress'", "'iface'", "'interface'", "'inet'", "'ip'", "'link'", 
			"'linklocal'", "'link-speed'", "'link-autoneg'", "'loopback'", "'manual'", 
			"'mtu'", "'off'", "'on'", "'mstpctl-bpduguard'", "'mstpctl-portadminedge'", 
			"'mstpctl-portbpdufilter'", "'no'", "'post-up'", "'route'", "'set'", 
			"'static'", "'via'", "'vlan-id'", "'vlan-raw-device'", "'vrf'", "'vrf-table'", 
			"'vxlan-id'", "'vxlan-local-tunnelip'", "'yes'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TEXT", "WORD", "ADD", "ADDRESS", "ADDRESS_VIRTUAL", "ALIAS", "AUTO", 
			"BOND_LACP_BYPASS_ALLOW", "BOND_LACP_RATE", "BOND_MASTER", "BOND_MIIMON", 
			"BOND_MIN_LINKS", "BOND_MODE", "BOND_SLAVES", "BOND_XMIT_HASH_POLICY", 
			"BRIDGE_PORTS", "BRIDGE_ACCESS", "BRIDGE_ARP_ND_SUPPRESS", "BRIDGE_LEARNING", 
			"BRIDGE_PVID", "BRIDGE_VIDS", "BRIDGE_VLAN_AWARE", "CLAG_ID", "CLAGD_VXLAN_ANYCAST_IP", 
			"CLAGD_BACKUP_IP", "CLAGD_PEER_IP", "CLAGD_PRIORITY", "CLAGD_SYS_MAC", 
			"DASH", "DEV", "DHCP", "GATEWAY", "HWADDRESS", "IFACE", "INTERFACE", 
			"INET", "IP", "LINK", "LINK_LOCAL", "LINK_SPEED", "LINK_AUTONEG", "LOOPBACK", 
			"MANUAL", "MTU", "OFF", "ON", "MSTPCTL_BPDUGUARD", "MSTPCTL_PORTADMINEDGE", 
			"MSTPCTL_PORTBPDUFILTER", "NO", "POST_UP", "ROUTE", "SET", "STATIC", 
			"VIA", "VLAN_ID", "VLAN_RAW_DEVICE", "VRF", "VRF_TABLE", "VXLAN_ID", 
			"VXLAN_LOCAL_TUNNEL_IP", "YES", "BLANK_LINE", "COMMENT_LINE", "IP_ADDRESS", 
			"IPV6_ADDRESS", "IP_PREFIX", "IPV6_PREFIX", "MAC_ADDRESS", "NEWLINE", 
			"NUMBER", "WS", "M_DropUntilNewline_NonNewline", "M_LineText_WS", "M_Word_WS", 
			"M_Words_WS"
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
	public String getGrammarFileName() { return "CumulusInterfacesParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CumulusInterfacesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Cumulus_interfaces_configurationContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CumulusInterfacesParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Cumulus_interfaces_configurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cumulus_interfaces_configuration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterCumulus_interfaces_configuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitCumulus_interfaces_configuration(this);
		}
	}

	public final Cumulus_interfaces_configurationContext cumulus_interfaces_configuration() throws RecognitionException {
		Cumulus_interfaces_configurationContext _localctx = new Cumulus_interfaces_configurationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cumulus_interfaces_configuration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AUTO) | (1L << IFACE) | (1L << INTERFACE))) != 0)) {
				{
				{
				setState(128);
				statement();
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
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
		public S_autoContext s_auto() {
			return getRuleContext(S_autoContext.class,0);
		}
		public S_ifaceContext s_iface() {
			return getRuleContext(S_ifaceContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AUTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				s_auto();
				}
				break;
			case IFACE:
			case INTERFACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				s_iface();
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

	public static class S_autoContext extends ParserRuleContext {
		public TerminalNode AUTO() { return getToken(CumulusInterfacesParser.AUTO, 0); }
		public Interface_nameContext interface_name() {
			return getRuleContext(Interface_nameContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public S_autoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_auto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterS_auto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitS_auto(this);
		}
	}

	public final S_autoContext s_auto() throws RecognitionException {
		S_autoContext _localctx = new S_autoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_s_auto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(AUTO);
			setState(141);
			interface_name();
			setState(142);
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

	public static class S_ifaceContext extends ParserRuleContext {
		public Interface_nameContext interface_name() {
			return getRuleContext(Interface_nameContext.class,0);
		}
		public TerminalNode IFACE() { return getToken(CumulusInterfacesParser.IFACE, 0); }
		public TerminalNode INTERFACE() { return getToken(CumulusInterfacesParser.INTERFACE, 0); }
		public Si_inetContext si_inet() {
			return getRuleContext(Si_inetContext.class,0);
		}
		public Si_no_inetContext si_no_inet() {
			return getRuleContext(Si_no_inetContext.class,0);
		}
		public S_ifaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_iface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterS_iface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitS_iface(this);
		}
	}

	public final S_ifaceContext s_iface() throws RecognitionException {
		S_ifaceContext _localctx = new S_ifaceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_s_iface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_la = _input.LA(1);
			if ( !(_la==IFACE || _la==INTERFACE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(145);
			interface_name();
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INET:
				{
				setState(146);
				si_inet();
				}
				break;
			case NEWLINE:
				{
				setState(147);
				si_no_inet();
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

	public static class Si_inetContext extends ParserRuleContext {
		public TerminalNode INET() { return getToken(CumulusInterfacesParser.INET, 0); }
		public TerminalNode LOOPBACK() { return getToken(CumulusInterfacesParser.LOOPBACK, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public TerminalNode DHCP() { return getToken(CumulusInterfacesParser.DHCP, 0); }
		public TerminalNode MANUAL() { return getToken(CumulusInterfacesParser.MANUAL, 0); }
		public TerminalNode STATIC() { return getToken(CumulusInterfacesParser.STATIC, 0); }
		public List<I_propertyContext> i_property() {
			return getRuleContexts(I_propertyContext.class);
		}
		public I_propertyContext i_property(int i) {
			return getRuleContext(I_propertyContext.class,i);
		}
		public Si_inetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si_inet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterSi_inet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitSi_inet(this);
		}
	}

	public final Si_inetContext si_inet() throws RecognitionException {
		Si_inetContext _localctx = new Si_inetContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_si_inet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(INET);
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOOPBACK:
				{
				setState(151);
				match(LOOPBACK);
				setState(152);
				match(NEWLINE);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADDRESS) | (1L << ADDRESS_VIRTUAL) | (1L << ALIAS) | (1L << BOND_LACP_BYPASS_ALLOW) | (1L << BOND_LACP_RATE) | (1L << BOND_MASTER) | (1L << BOND_MIIMON) | (1L << BOND_MIN_LINKS) | (1L << BOND_MODE) | (1L << BOND_SLAVES) | (1L << BOND_XMIT_HASH_POLICY) | (1L << BRIDGE_PORTS) | (1L << BRIDGE_ACCESS) | (1L << BRIDGE_ARP_ND_SUPPRESS) | (1L << BRIDGE_LEARNING) | (1L << BRIDGE_PVID) | (1L << BRIDGE_VIDS) | (1L << BRIDGE_VLAN_AWARE) | (1L << CLAG_ID) | (1L << CLAGD_VXLAN_ANYCAST_IP) | (1L << CLAGD_BACKUP_IP) | (1L << CLAGD_PEER_IP) | (1L << CLAGD_PRIORITY) | (1L << CLAGD_SYS_MAC) | (1L << GATEWAY) | (1L << HWADDRESS) | (1L << IP) | (1L << LINK_SPEED) | (1L << LINK_AUTONEG) | (1L << MTU) | (1L << MSTPCTL_BPDUGUARD) | (1L << MSTPCTL_PORTADMINEDGE) | (1L << MSTPCTL_PORTBPDUFILTER) | (1L << POST_UP) | (1L << VLAN_ID) | (1L << VLAN_RAW_DEVICE) | (1L << VRF) | (1L << VRF_TABLE) | (1L << VXLAN_ID) | (1L << VXLAN_LOCAL_TUNNEL_IP))) != 0)) {
					{
					{
					setState(153);
					i_property();
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case DHCP:
				{
				setState(159);
				match(DHCP);
				setState(160);
				match(NEWLINE);
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADDRESS) | (1L << ADDRESS_VIRTUAL) | (1L << ALIAS) | (1L << BOND_LACP_BYPASS_ALLOW) | (1L << BOND_LACP_RATE) | (1L << BOND_MASTER) | (1L << BOND_MIIMON) | (1L << BOND_MIN_LINKS) | (1L << BOND_MODE) | (1L << BOND_SLAVES) | (1L << BOND_XMIT_HASH_POLICY) | (1L << BRIDGE_PORTS) | (1L << BRIDGE_ACCESS) | (1L << BRIDGE_ARP_ND_SUPPRESS) | (1L << BRIDGE_LEARNING) | (1L << BRIDGE_PVID) | (1L << BRIDGE_VIDS) | (1L << BRIDGE_VLAN_AWARE) | (1L << CLAG_ID) | (1L << CLAGD_VXLAN_ANYCAST_IP) | (1L << CLAGD_BACKUP_IP) | (1L << CLAGD_PEER_IP) | (1L << CLAGD_PRIORITY) | (1L << CLAGD_SYS_MAC) | (1L << GATEWAY) | (1L << HWADDRESS) | (1L << IP) | (1L << LINK_SPEED) | (1L << LINK_AUTONEG) | (1L << MTU) | (1L << MSTPCTL_BPDUGUARD) | (1L << MSTPCTL_PORTADMINEDGE) | (1L << MSTPCTL_PORTBPDUFILTER) | (1L << POST_UP) | (1L << VLAN_ID) | (1L << VLAN_RAW_DEVICE) | (1L << VRF) | (1L << VRF_TABLE) | (1L << VXLAN_ID) | (1L << VXLAN_LOCAL_TUNNEL_IP))) != 0)) {
					{
					{
					setState(161);
					i_property();
					}
					}
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case MANUAL:
				{
				setState(167);
				match(MANUAL);
				setState(168);
				match(NEWLINE);
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADDRESS) | (1L << ADDRESS_VIRTUAL) | (1L << ALIAS) | (1L << BOND_LACP_BYPASS_ALLOW) | (1L << BOND_LACP_RATE) | (1L << BOND_MASTER) | (1L << BOND_MIIMON) | (1L << BOND_MIN_LINKS) | (1L << BOND_MODE) | (1L << BOND_SLAVES) | (1L << BOND_XMIT_HASH_POLICY) | (1L << BRIDGE_PORTS) | (1L << BRIDGE_ACCESS) | (1L << BRIDGE_ARP_ND_SUPPRESS) | (1L << BRIDGE_LEARNING) | (1L << BRIDGE_PVID) | (1L << BRIDGE_VIDS) | (1L << BRIDGE_VLAN_AWARE) | (1L << CLAG_ID) | (1L << CLAGD_VXLAN_ANYCAST_IP) | (1L << CLAGD_BACKUP_IP) | (1L << CLAGD_PEER_IP) | (1L << CLAGD_PRIORITY) | (1L << CLAGD_SYS_MAC) | (1L << GATEWAY) | (1L << HWADDRESS) | (1L << IP) | (1L << LINK_SPEED) | (1L << LINK_AUTONEG) | (1L << MTU) | (1L << MSTPCTL_BPDUGUARD) | (1L << MSTPCTL_PORTADMINEDGE) | (1L << MSTPCTL_PORTBPDUFILTER) | (1L << POST_UP) | (1L << VLAN_ID) | (1L << VLAN_RAW_DEVICE) | (1L << VRF) | (1L << VRF_TABLE) | (1L << VXLAN_ID) | (1L << VXLAN_LOCAL_TUNNEL_IP))) != 0)) {
					{
					{
					setState(169);
					i_property();
					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STATIC:
				{
				setState(175);
				match(STATIC);
				setState(176);
				match(NEWLINE);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADDRESS) | (1L << ADDRESS_VIRTUAL) | (1L << ALIAS) | (1L << BOND_LACP_BYPASS_ALLOW) | (1L << BOND_LACP_RATE) | (1L << BOND_MASTER) | (1L << BOND_MIIMON) | (1L << BOND_MIN_LINKS) | (1L << BOND_MODE) | (1L << BOND_SLAVES) | (1L << BOND_XMIT_HASH_POLICY) | (1L << BRIDGE_PORTS) | (1L << BRIDGE_ACCESS) | (1L << BRIDGE_ARP_ND_SUPPRESS) | (1L << BRIDGE_LEARNING) | (1L << BRIDGE_PVID) | (1L << BRIDGE_VIDS) | (1L << BRIDGE_VLAN_AWARE) | (1L << CLAG_ID) | (1L << CLAGD_VXLAN_ANYCAST_IP) | (1L << CLAGD_BACKUP_IP) | (1L << CLAGD_PEER_IP) | (1L << CLAGD_PRIORITY) | (1L << CLAGD_SYS_MAC) | (1L << GATEWAY) | (1L << HWADDRESS) | (1L << IP) | (1L << LINK_SPEED) | (1L << LINK_AUTONEG) | (1L << MTU) | (1L << MSTPCTL_BPDUGUARD) | (1L << MSTPCTL_PORTADMINEDGE) | (1L << MSTPCTL_PORTBPDUFILTER) | (1L << POST_UP) | (1L << VLAN_ID) | (1L << VLAN_RAW_DEVICE) | (1L << VRF) | (1L << VRF_TABLE) | (1L << VXLAN_ID) | (1L << VXLAN_LOCAL_TUNNEL_IP))) != 0)) {
					{
					{
					setState(177);
					i_property();
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Si_no_inetContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public List<I_propertyContext> i_property() {
			return getRuleContexts(I_propertyContext.class);
		}
		public I_propertyContext i_property(int i) {
			return getRuleContext(I_propertyContext.class,i);
		}
		public Si_no_inetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si_no_inet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterSi_no_inet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitSi_no_inet(this);
		}
	}

	public final Si_no_inetContext si_no_inet() throws RecognitionException {
		Si_no_inetContext _localctx = new Si_no_inetContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_si_no_inet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(NEWLINE);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADDRESS) | (1L << ADDRESS_VIRTUAL) | (1L << ALIAS) | (1L << BOND_LACP_BYPASS_ALLOW) | (1L << BOND_LACP_RATE) | (1L << BOND_MASTER) | (1L << BOND_MIIMON) | (1L << BOND_MIN_LINKS) | (1L << BOND_MODE) | (1L << BOND_SLAVES) | (1L << BOND_XMIT_HASH_POLICY) | (1L << BRIDGE_PORTS) | (1L << BRIDGE_ACCESS) | (1L << BRIDGE_ARP_ND_SUPPRESS) | (1L << BRIDGE_LEARNING) | (1L << BRIDGE_PVID) | (1L << BRIDGE_VIDS) | (1L << BRIDGE_VLAN_AWARE) | (1L << CLAG_ID) | (1L << CLAGD_VXLAN_ANYCAST_IP) | (1L << CLAGD_BACKUP_IP) | (1L << CLAGD_PEER_IP) | (1L << CLAGD_PRIORITY) | (1L << CLAGD_SYS_MAC) | (1L << GATEWAY) | (1L << HWADDRESS) | (1L << IP) | (1L << LINK_SPEED) | (1L << LINK_AUTONEG) | (1L << MTU) | (1L << MSTPCTL_BPDUGUARD) | (1L << MSTPCTL_PORTADMINEDGE) | (1L << MSTPCTL_PORTBPDUFILTER) | (1L << POST_UP) | (1L << VLAN_ID) | (1L << VLAN_RAW_DEVICE) | (1L << VRF) | (1L << VRF_TABLE) | (1L << VXLAN_ID) | (1L << VXLAN_LOCAL_TUNNEL_IP))) != 0)) {
				{
				{
				setState(186);
				i_property();
				}
				}
				setState(191);
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

	public static class I_propertyContext extends ParserRuleContext {
		public I_addressContext i_address() {
			return getRuleContext(I_addressContext.class,0);
		}
		public I_address_virtualContext i_address_virtual() {
			return getRuleContext(I_address_virtualContext.class,0);
		}
		public I_aliasContext i_alias() {
			return getRuleContext(I_aliasContext.class,0);
		}
		public I_bond_lacp_bypass_allowContext i_bond_lacp_bypass_allow() {
			return getRuleContext(I_bond_lacp_bypass_allowContext.class,0);
		}
		public I_bond_lacp_rateContext i_bond_lacp_rate() {
			return getRuleContext(I_bond_lacp_rateContext.class,0);
		}
		public I_bond_masterContext i_bond_master() {
			return getRuleContext(I_bond_masterContext.class,0);
		}
		public I_bond_miimonContext i_bond_miimon() {
			return getRuleContext(I_bond_miimonContext.class,0);
		}
		public I_bond_min_linksContext i_bond_min_links() {
			return getRuleContext(I_bond_min_linksContext.class,0);
		}
		public I_bond_modeContext i_bond_mode() {
			return getRuleContext(I_bond_modeContext.class,0);
		}
		public I_bond_slavesContext i_bond_slaves() {
			return getRuleContext(I_bond_slavesContext.class,0);
		}
		public I_bond_xmit_hash_policyContext i_bond_xmit_hash_policy() {
			return getRuleContext(I_bond_xmit_hash_policyContext.class,0);
		}
		public I_bridge_accessContext i_bridge_access() {
			return getRuleContext(I_bridge_accessContext.class,0);
		}
		public I_bridge_arp_nd_suppressContext i_bridge_arp_nd_suppress() {
			return getRuleContext(I_bridge_arp_nd_suppressContext.class,0);
		}
		public I_bridge_learningContext i_bridge_learning() {
			return getRuleContext(I_bridge_learningContext.class,0);
		}
		public I_bridge_portsContext i_bridge_ports() {
			return getRuleContext(I_bridge_portsContext.class,0);
		}
		public I_bridge_pvidContext i_bridge_pvid() {
			return getRuleContext(I_bridge_pvidContext.class,0);
		}
		public I_bridge_vidsContext i_bridge_vids() {
			return getRuleContext(I_bridge_vidsContext.class,0);
		}
		public I_bridge_vlan_awareContext i_bridge_vlan_aware() {
			return getRuleContext(I_bridge_vlan_awareContext.class,0);
		}
		public I_clag_idContext i_clag_id() {
			return getRuleContext(I_clag_idContext.class,0);
		}
		public I_clagd_backup_ipContext i_clagd_backup_ip() {
			return getRuleContext(I_clagd_backup_ipContext.class,0);
		}
		public I_clagd_peer_ipContext i_clagd_peer_ip() {
			return getRuleContext(I_clagd_peer_ipContext.class,0);
		}
		public I_clagd_priorityContext i_clagd_priority() {
			return getRuleContext(I_clagd_priorityContext.class,0);
		}
		public I_clagd_sys_macContext i_clagd_sys_mac() {
			return getRuleContext(I_clagd_sys_macContext.class,0);
		}
		public I_clagd_vxlan_anycast_ipContext i_clagd_vxlan_anycast_ip() {
			return getRuleContext(I_clagd_vxlan_anycast_ipContext.class,0);
		}
		public I_gatewayContext i_gateway() {
			return getRuleContext(I_gatewayContext.class,0);
		}
		public I_hwaddressContext i_hwaddress() {
			return getRuleContext(I_hwaddressContext.class,0);
		}
		public I_link_speedContext i_link_speed() {
			return getRuleContext(I_link_speedContext.class,0);
		}
		public I_link_autonegContext i_link_autoneg() {
			return getRuleContext(I_link_autonegContext.class,0);
		}
		public I_mstpctl_bpduguardContext i_mstpctl_bpduguard() {
			return getRuleContext(I_mstpctl_bpduguardContext.class,0);
		}
		public I_mstpctl_portadminedgeContext i_mstpctl_portadminedge() {
			return getRuleContext(I_mstpctl_portadminedgeContext.class,0);
		}
		public I_mstpctl_portbpdufilterContext i_mstpctl_portbpdufilter() {
			return getRuleContext(I_mstpctl_portbpdufilterContext.class,0);
		}
		public I_mtuContext i_mtu() {
			return getRuleContext(I_mtuContext.class,0);
		}
		public I_post_upContext i_post_up() {
			return getRuleContext(I_post_upContext.class,0);
		}
		public I_vlan_idContext i_vlan_id() {
			return getRuleContext(I_vlan_idContext.class,0);
		}
		public I_vlan_raw_deviceContext i_vlan_raw_device() {
			return getRuleContext(I_vlan_raw_deviceContext.class,0);
		}
		public I_vrfContext i_vrf() {
			return getRuleContext(I_vrfContext.class,0);
		}
		public I_vrf_tableContext i_vrf_table() {
			return getRuleContext(I_vrf_tableContext.class,0);
		}
		public I_vxlan_idContext i_vxlan_id() {
			return getRuleContext(I_vxlan_idContext.class,0);
		}
		public I_vxlan_local_tunnel_ipContext i_vxlan_local_tunnel_ip() {
			return getRuleContext(I_vxlan_local_tunnel_ipContext.class,0);
		}
		public I_propertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterI_property(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitI_property(this);
		}
	}

	public final I_propertyContext i_property() throws RecognitionException {
		I_propertyContext _localctx = new I_propertyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_i_property);
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADDRESS:
			case IP:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				i_address();
				}
				break;
			case ADDRESS_VIRTUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				i_address_virtual();
				}
				break;
			case ALIAS:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				i_alias();
				}
				break;
			case BOND_LACP_BYPASS_ALLOW:
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				i_bond_lacp_bypass_allow();
				}
				break;
			case BOND_LACP_RATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(196);
				i_bond_lacp_rate();
				}
				break;
			case BOND_MASTER:
				enterOuterAlt(_localctx, 6);
				{
				setState(197);
				i_bond_master();
				}
				break;
			case BOND_MIIMON:
				enterOuterAlt(_localctx, 7);
				{
				setState(198);
				i_bond_miimon();
				}
				break;
			case BOND_MIN_LINKS:
				enterOuterAlt(_localctx, 8);
				{
				setState(199);
				i_bond_min_links();
				}
				break;
			case BOND_MODE:
				enterOuterAlt(_localctx, 9);
				{
				setState(200);
				i_bond_mode();
				}
				break;
			case BOND_SLAVES:
				enterOuterAlt(_localctx, 10);
				{
				setState(201);
				i_bond_slaves();
				}
				break;
			case BOND_XMIT_HASH_POLICY:
				enterOuterAlt(_localctx, 11);
				{
				setState(202);
				i_bond_xmit_hash_policy();
				}
				break;
			case BRIDGE_ACCESS:
				enterOuterAlt(_localctx, 12);
				{
				setState(203);
				i_bridge_access();
				}
				break;
			case BRIDGE_ARP_ND_SUPPRESS:
				enterOuterAlt(_localctx, 13);
				{
				setState(204);
				i_bridge_arp_nd_suppress();
				}
				break;
			case BRIDGE_LEARNING:
				enterOuterAlt(_localctx, 14);
				{
				setState(205);
				i_bridge_learning();
				}
				break;
			case BRIDGE_PORTS:
				enterOuterAlt(_localctx, 15);
				{
				setState(206);
				i_bridge_ports();
				}
				break;
			case BRIDGE_PVID:
				enterOuterAlt(_localctx, 16);
				{
				setState(207);
				i_bridge_pvid();
				}
				break;
			case BRIDGE_VIDS:
				enterOuterAlt(_localctx, 17);
				{
				setState(208);
				i_bridge_vids();
				}
				break;
			case BRIDGE_VLAN_AWARE:
				enterOuterAlt(_localctx, 18);
				{
				setState(209);
				i_bridge_vlan_aware();
				}
				break;
			case CLAG_ID:
				enterOuterAlt(_localctx, 19);
				{
				setState(210);
				i_clag_id();
				}
				break;
			case CLAGD_BACKUP_IP:
				enterOuterAlt(_localctx, 20);
				{
				setState(211);
				i_clagd_backup_ip();
				}
				break;
			case CLAGD_PEER_IP:
				enterOuterAlt(_localctx, 21);
				{
				setState(212);
				i_clagd_peer_ip();
				}
				break;
			case CLAGD_PRIORITY:
				enterOuterAlt(_localctx, 22);
				{
				setState(213);
				i_clagd_priority();
				}
				break;
			case CLAGD_SYS_MAC:
				enterOuterAlt(_localctx, 23);
				{
				setState(214);
				i_clagd_sys_mac();
				}
				break;
			case CLAGD_VXLAN_ANYCAST_IP:
				enterOuterAlt(_localctx, 24);
				{
				setState(215);
				i_clagd_vxlan_anycast_ip();
				}
				break;
			case GATEWAY:
				enterOuterAlt(_localctx, 25);
				{
				setState(216);
				i_gateway();
				}
				break;
			case HWADDRESS:
				enterOuterAlt(_localctx, 26);
				{
				setState(217);
				i_hwaddress();
				}
				break;
			case LINK_SPEED:
				enterOuterAlt(_localctx, 27);
				{
				setState(218);
				i_link_speed();
				}
				break;
			case LINK_AUTONEG:
				enterOuterAlt(_localctx, 28);
				{
				setState(219);
				i_link_autoneg();
				}
				break;
			case MSTPCTL_BPDUGUARD:
				enterOuterAlt(_localctx, 29);
				{
				setState(220);
				i_mstpctl_bpduguard();
				}
				break;
			case MSTPCTL_PORTADMINEDGE:
				enterOuterAlt(_localctx, 30);
				{
				setState(221);
				i_mstpctl_portadminedge();
				}
				break;
			case MSTPCTL_PORTBPDUFILTER:
				enterOuterAlt(_localctx, 31);
				{
				setState(222);
				i_mstpctl_portbpdufilter();
				}
				break;
			case MTU:
				enterOuterAlt(_localctx, 32);
				{
				setState(223);
				i_mtu();
				}
				break;
			case POST_UP:
				enterOuterAlt(_localctx, 33);
				{
				setState(224);
				i_post_up();
				}
				break;
			case VLAN_ID:
				enterOuterAlt(_localctx, 34);
				{
				setState(225);
				i_vlan_id();
				}
				break;
			case VLAN_RAW_DEVICE:
				enterOuterAlt(_localctx, 35);
				{
				setState(226);
				i_vlan_raw_device();
				}
				break;
			case VRF:
				enterOuterAlt(_localctx, 36);
				{
				setState(227);
				i_vrf();
				}
				break;
			case VRF_TABLE:
				enterOuterAlt(_localctx, 37);
				{
				setState(228);
				i_vrf_table();
				}
				break;
			case VXLAN_ID:
				enterOuterAlt(_localctx, 38);
				{
				setState(229);
				i_vxlan_id();
				}
				break;
			case VXLAN_LOCAL_TUNNEL_IP:
				enterOuterAlt(_localctx, 39);
				{
				setState(230);
				i_vxlan_local_tunnel_ip();
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

	public static class I_addressContext extends ParserRuleContext {
		public Interface_addressContext v4;
		public Interface_address6Context v6;
		public TerminalNode ADDRESS() { return getToken(CumulusInterfacesParser.ADDRESS, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public TerminalNode IP() { return getToken(CumulusInterfacesParser.IP, 0); }
		public Interface_addressContext interface_address() {
			return getRuleContext(Interface_addressContext.class,0);
		}
		public Interface_address6Context interface_address6() {
			return getRuleContext(Interface_address6Context.class,0);
		}
		public I_addressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterI_address(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitI_address(this);
		}
	}

	public final I_addressContext i_address() throws RecognitionException {
		I_addressContext _localctx = new I_addressContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_i_address);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IP) {
				{
				setState(233);
				match(IP);
				}
			}

			setState(236);
			match(ADDRESS);
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IP_ADDRESS:
			case IP_PREFIX:
				{
				setState(237);
				((I_addressContext)_localctx).v4 = interface_address();
				}
				break;
			case IPV6_ADDRESS:
			case IPV6_PREFIX:
				{
				setState(238);
				((I_addressContext)_localctx).v6 = interface_address6();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(241);
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

	public static class I_address_virtualContext extends ParserRuleContext {
		public Interface_addressContext v4;
		public Interface_address6Context v6;
		public TerminalNode ADDRESS_VIRTUAL() { return getToken(CumulusInterfacesParser.ADDRESS_VIRTUAL, 0); }
		public TerminalNode MAC_ADDRESS() { return getToken(CumulusInterfacesParser.MAC_ADDRESS, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public Interface_addressContext interface_address() {
			return getRuleContext(Interface_addressContext.class,0);
		}
		public Interface_address6Context interface_address6() {
			return getRuleContext(Interface_address6Context.class,0);
		}
		public I_address_virtualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_address_virtual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterI_address_virtual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitI_address_virtual(this);
		}
	}

	public final I_address_virtualContext i_address_virtual() throws RecognitionException {
		I_address_virtualContext _localctx = new I_address_virtualContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_i_address_virtual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(ADDRESS_VIRTUAL);
			setState(244);
			match(MAC_ADDRESS);
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IP_ADDRESS:
			case IP_PREFIX:
				{
				setState(245);
				((I_address_virtualContext)_localctx).v4 = interface_address();
				}
				break;
			case IPV6_ADDRESS:
			case IPV6_PREFIX:
				{
				setState(246);
				((I_address_virtualContext)_localctx).v6 = interface_address6();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(249);
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

	public static class I_aliasContext extends ParserRuleContext {
		public TerminalNode ALIAS() { return getToken(CumulusInterfacesParser.ALIAS, 0); }
		public TerminalNode TEXT() { return getToken(CumulusInterfacesParser.TEXT, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public I_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterI_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitI_alias(this);
		}
	}

	public final I_aliasContext i_alias() throws RecognitionException {
		I_aliasContext _localctx = new I_aliasContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_i_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(ALIAS);
			setState(252);
			match(TEXT);
			setState(253);
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

	public static class I_bond_lacp_bypass_allowContext extends ParserRuleContext {
		public TerminalNode BOND_LACP_BYPASS_ALLOW() { return getToken(CumulusInterfacesParser.BOND_LACP_BYPASS_ALLOW, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public I_bond_lacp_bypass_allowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_bond_lacp_bypass_allow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterI_bond_lacp_bypass_allow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitI_bond_lacp_bypass_allow(this);
		}
	}

	public final I_bond_lacp_bypass_allowContext i_bond_lacp_bypass_allow() throws RecognitionException {
		I_bond_lacp_bypass_allowContext _localctx = new I_bond_lacp_bypass_allowContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_i_bond_lacp_bypass_allow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(BOND_LACP_BYPASS_ALLOW);
			setState(256);
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

	public static class I_bond_lacp_rateContext extends ParserRuleContext {
		public TerminalNode BOND_LACP_RATE() { return getToken(CumulusInterfacesParser.BOND_LACP_RATE, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public I_bond_lacp_rateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_bond_lacp_rate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterI_bond_lacp_rate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitI_bond_lacp_rate(this);
		}
	}

	public final I_bond_lacp_rateContext i_bond_lacp_rate() throws RecognitionException {
		I_bond_lacp_rateContext _localctx = new I_bond_lacp_rateContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_i_bond_lacp_rate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(BOND_LACP_RATE);
			setState(259);
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

	public static class I_bond_masterContext extends ParserRuleContext {
		public TerminalNode BOND_MASTER() { return getToken(CumulusInterfacesParser.BOND_MASTER, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public I_bond_masterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_bond_master; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterI_bond_master(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitI_bond_master(this);
		}
	}

	public final I_bond_masterContext i_bond_master() throws RecognitionException {
		I_bond_masterContext _localctx = new I_bond_masterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_i_bond_master);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(BOND_MASTER);
			setState(262);
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

	public static class I_bond_miimonContext extends ParserRuleContext {
		public TerminalNode BOND_MIIMON() { return getToken(CumulusInterfacesParser.BOND_MIIMON, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public I_bond_miimonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_bond_miimon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterI_bond_miimon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitI_bond_miimon(this);
		}
	}

	public final I_bond_miimonContext i_bond_miimon() throws RecognitionException {
		I_bond_miimonContext _localctx = new I_bond_miimonContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_i_bond_miimon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(BOND_MIIMON);
			setState(265);
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

	public static class I_bond_min_linksContext extends ParserRuleContext {
		public TerminalNode BOND_MIN_LINKS() { return getToken(CumulusInterfacesParser.BOND_MIN_LINKS, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public I_bond_min_linksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_bond_min_links; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterI_bond_min_links(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitI_bond_min_links(this);
		}
	}

	public final I_bond_min_linksContext i_bond_min_links() throws RecognitionException {
		I_bond_min_linksContext _localctx = new I_bond_min_linksContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_i_bond_min_links);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(BOND_MIN_LINKS);
			setState(268);
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

	public static class I_bond_modeContext extends ParserRuleContext {
		public TerminalNode BOND_MODE() { return getToken(CumulusInterfacesParser.BOND_MODE, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public I_bond_modeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_bond_mode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterI_bond_mode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitI_bond_mode(this);
		}
	}

	public final I_bond_modeContext i_bond_mode() throws RecognitionException {
		I_bond_modeContext _localctx = new I_bond_modeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_i_bond_mode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(BOND_MODE);
			setState(271);
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

	public static class I_bond_slavesContext extends ParserRuleContext {
		public TerminalNode BOND_SLAVES() { return getToken(CumulusInterfacesParser.BOND_SLAVES, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public List<Interface_nameContext> interface_name() {
			return getRuleContexts(Interface_nameContext.class);
		}
		public Interface_nameContext interface_name(int i) {
			return getRuleContext(Interface_nameContext.class,i);
		}
		public I_bond_slavesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_bond_slaves; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterI_bond_slaves(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitI_bond_slaves(this);
		}
	}

	public final I_bond_slavesContext i_bond_slaves() throws RecognitionException {
		I_bond_slavesContext _localctx = new I_bond_slavesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_i_bond_slaves);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(BOND_SLAVES);
			setState(275); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(274);
				interface_name();
				}
				}
				setState(277); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(279);
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

	public static class I_bond_xmit_hash_policyContext extends ParserRuleContext {
		public TerminalNode BOND_XMIT_HASH_POLICY() { return getToken(CumulusInterfacesParser.BOND_XMIT_HASH_POLICY, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public I_bond_xmit_hash_policyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_bond_xmit_hash_policy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterI_bond_xmit_hash_policy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitI_bond_xmit_hash_policy(this);
		}
	}

	public final I_bond_xmit_hash_policyContext i_bond_xmit_hash_policy() throws RecognitionException {
		I_bond_xmit_hash_policyContext _localctx = new I_bond_xmit_hash_policyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_i_bond_xmit_hash_policy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(BOND_XMIT_HASH_POLICY);
			setState(282);
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

	public static class I_bridge_accessContext extends ParserRuleContext {
		public TerminalNode BRIDGE_ACCESS() { return getToken(CumulusInterfacesParser.BRIDGE_ACCESS, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public I_bridge_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_bridge_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterI_bridge_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitI_bridge_access(this);
		}
	}

	public final I_bridge_accessContext i_bridge_access() throws RecognitionException {
		I_bridge_accessContext _localctx = new I_bridge_accessContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_i_bridge_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(BRIDGE_ACCESS);
			setState(285);
			number();
			setState(286);
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

	public static class I_bridge_arp_nd_suppressContext extends ParserRuleContext {
		public TerminalNode BRIDGE_ARP_ND_SUPPRESS() { return getToken(CumulusInterfacesParser.BRIDGE_ARP_ND_SUPPRESS, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public I_bridge_arp_nd_suppressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_bridge_arp_nd_suppress; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterI_bridge_arp_nd_suppress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitI_bridge_arp_nd_suppress(this);
		}
	}

	public final I_bridge_arp_nd_suppressContext i_bridge_arp_nd_suppress() throws RecognitionException {
		I_bridge_arp_nd_suppressContext _localctx = new I_bridge_arp_nd_suppressContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_i_bridge_arp_nd_suppress);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(BRIDGE_ARP_ND_SUPPRESS);
			setState(289);
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

	public static class I_bridge_learningContext extends ParserRuleContext {
		public TerminalNode BRIDGE_LEARNING() { return getToken(CumulusInterfacesParser.BRIDGE_LEARNING, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public I_bridge_learningContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_bridge_learning; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterI_bridge_learning(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitI_bridge_learning(this);
		}
	}

	public final I_bridge_learningContext i_bridge_learning() throws RecognitionException {
		I_bridge_learningContext _localctx = new I_bridge_learningContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_i_bridge_learning);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(BRIDGE_LEARNING);
			setState(292);
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

	public static class I_bridge_portsContext extends ParserRuleContext {
		public TerminalNode BRIDGE_PORTS() { return getToken(CumulusInterfacesParser.BRIDGE_PORTS, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public List<Interface_nameContext> interface_name() {
			return getRuleContexts(Interface_nameContext.class);
		}
		public Interface_nameContext interface_name(int i) {
			return getRuleContext(Interface_nameContext.class,i);
		}
		public I_bridge_portsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_bridge_ports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterI_bridge_ports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitI_bridge_ports(this);
		}
	}

	public final I_bridge_portsContext i_bridge_ports() throws RecognitionException {
		I_bridge_portsContext _localctx = new I_bridge_portsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_i_bridge_ports);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(BRIDGE_PORTS);
			setState(296); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(295);
				interface_name();
				}
				}
				setState(298); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(300);
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

	public static class I_bridge_pvidContext extends ParserRuleContext {
		public TerminalNode BRIDGE_PVID() { return getToken(CumulusInterfacesParser.BRIDGE_PVID, 0); }
		public Vlan_idContext vlan_id() {
			return getRuleContext(Vlan_idContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public I_bridge_pvidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_bridge_pvid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterI_bridge_pvid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitI_bridge_pvid(this);
		}
	}

	public final I_bridge_pvidContext i_bridge_pvid() throws RecognitionException {
		I_bridge_pvidContext _localctx = new I_bridge_pvidContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_i_bridge_pvid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(BRIDGE_PVID);
			setState(303);
			vlan_id();
			setState(304);
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

	public static class I_bridge_vidsContext extends ParserRuleContext {
		public TerminalNode BRIDGE_VIDS() { return getToken(CumulusInterfacesParser.BRIDGE_VIDS, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public List<Number_or_rangeContext> number_or_range() {
			return getRuleContexts(Number_or_rangeContext.class);
		}
		public Number_or_rangeContext number_or_range(int i) {
			return getRuleContext(Number_or_rangeContext.class,i);
		}
		public I_bridge_vidsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_bridge_vids; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterI_bridge_vids(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitI_bridge_vids(this);
		}
	}

	public final I_bridge_vidsContext i_bridge_vids() throws RecognitionException {
		I_bridge_vidsContext _localctx = new I_bridge_vidsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_i_bridge_vids);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(BRIDGE_VIDS);
			setState(308); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(307);
				number_or_range();
				}
				}
				setState(310); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(312);
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

	public static class I_bridge_vlan_awareContext extends ParserRuleContext {
		public TerminalNode BRIDGE_VLAN_AWARE() { return getToken(CumulusInterfacesParser.BRIDGE_VLAN_AWARE, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public TerminalNode YES() { return getToken(CumulusInterfacesParser.YES, 0); }
		public TerminalNode NO() { return getToken(CumulusInterfacesParser.NO, 0); }
		public I_bridge_vlan_awareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_bridge_vlan_aware; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterI_bridge_vlan_aware(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitI_bridge_vlan_aware(this);
		}
	}

	public final I_bridge_vlan_awareContext i_bridge_vlan_aware() throws RecognitionException {
		I_bridge_vlan_awareContext _localctx = new I_bridge_vlan_awareContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_i_bridge_vlan_aware);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(BRIDGE_VLAN_AWARE);
			setState(315);
			_la = _input.LA(1);
			if ( !(_la==NO || _la==YES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(316);
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

	public static class I_clag_idContext extends ParserRuleContext {
		public TerminalNode CLAG_ID() { return getToken(CumulusInterfacesParser.CLAG_ID, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public I_clag_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_clag_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterI_clag_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitI_clag_id(this);
		}
	}

	public final I_clag_idContext i_clag_id() throws RecognitionException {
		I_clag_idContext _localctx = new I_clag_idContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_i_clag_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(CLAG_ID);
			setState(319);
			number();
			setState(320);
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

	public static class I_clagd_backup_ipContext extends ParserRuleContext {
		public TerminalNode CLAGD_BACKUP_IP() { return getToken(CumulusInterfacesParser.CLAGD_BACKUP_IP, 0); }
		public AddressContext address() {
			return getRuleContext(AddressContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public TerminalNode VRF() { return getToken(CumulusInterfacesParser.VRF, 0); }
		public Vrf_nameContext vrf_name() {
			return getRuleContext(Vrf_nameContext.class,0);
		}
		public I_clagd_backup_ipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_clagd_backup_ip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterI_clagd_backup_ip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitI_clagd_backup_ip(this);
		}
	}

	public final I_clagd_backup_ipContext i_clagd_backup_ip() throws RecognitionException {
		I_clagd_backup_ipContext _localctx = new I_clagd_backup_ipContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_i_clagd_backup_ip);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(CLAGD_BACKUP_IP);
			setState(323);
			address();
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VRF) {
				{
				setState(324);
				match(VRF);
				setState(325);
				vrf_name();
				}
			}

			setState(328);
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

	public static class I_clagd_peer_ipContext extends ParserRuleContext {
		public TerminalNode CLAGD_PEER_IP() { return getToken(CumulusInterfacesParser.CLAGD_PEER_IP, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public AddressContext address() {
			return getRuleContext(AddressContext.class,0);
		}
		public TerminalNode LINK_LOCAL() { return getToken(CumulusInterfacesParser.LINK_LOCAL, 0); }
		public I_clagd_peer_ipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_clagd_peer_ip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterI_clagd_peer_ip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitI_clagd_peer_ip(this);
		}
	}

	public final I_clagd_peer_ipContext i_clagd_peer_ip() throws RecognitionException {
		I_clagd_peer_ipContext _localctx = new I_clagd_peer_ipContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_i_clagd_peer_ip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(CLAGD_PEER_IP);
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IP_ADDRESS:
				{
				setState(331);
				address();
				}
				break;
			case LINK_LOCAL:
				{
				setState(332);
				match(LINK_LOCAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(335);
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

	public static class I_clagd_priorityContext extends ParserRuleContext {
		public TerminalNode CLAGD_PRIORITY() { return getToken(CumulusInterfacesParser.CLAGD_PRIORITY, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public I_clagd_priorityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_clagd_priority; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterI_clagd_priority(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitI_clagd_priority(this);
		}
	}

	public final I_clagd_priorityContext i_clagd_priority() throws RecognitionException {
		I_clagd_priorityContext _localctx = new I_clagd_priorityContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_i_clagd_priority);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(CLAGD_PRIORITY);
			setState(338);
			number();
			setState(339);
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

	public static class I_clagd_sys_macContext extends ParserRuleContext {
		public TerminalNode CLAGD_SYS_MAC() { return getToken(CumulusInterfacesParser.CLAGD_SYS_MAC, 0); }
		public TerminalNode MAC_ADDRESS() { return getToken(CumulusInterfacesParser.MAC_ADDRESS, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public I_clagd_sys_macContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_clagd_sys_mac; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterI_clagd_sys_mac(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitI_clagd_sys_mac(this);
		}
	}

	public final I_clagd_sys_macContext i_clagd_sys_mac() throws RecognitionException {
		I_clagd_sys_macContext _localctx = new I_clagd_sys_macContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_i_clagd_sys_mac);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(CLAGD_SYS_MAC);
			setState(342);
			match(MAC_ADDRESS);
			setState(343);
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

	public static class I_clagd_vxlan_anycast_ipContext extends ParserRuleContext {
		public TerminalNode CLAGD_VXLAN_ANYCAST_IP() { return getToken(CumulusInterfacesParser.CLAGD_VXLAN_ANYCAST_IP, 0); }
		public AddressContext address() {
			return getRuleContext(AddressContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public I_clagd_vxlan_anycast_ipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_clagd_vxlan_anycast_ip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterI_clagd_vxlan_anycast_ip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitI_clagd_vxlan_anycast_ip(this);
		}
	}

	public final I_clagd_vxlan_anycast_ipContext i_clagd_vxlan_anycast_ip() throws RecognitionException {
		I_clagd_vxlan_anycast_ipContext _localctx = new I_clagd_vxlan_anycast_ipContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_i_clagd_vxlan_anycast_ip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(CLAGD_VXLAN_ANYCAST_IP);
			setState(346);
			address();
			setState(347);
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

	public static class I_gatewayContext extends ParserRuleContext {
		public TerminalNode GATEWAY() { return getToken(CumulusInterfacesParser.GATEWAY, 0); }
		public AddressContext address() {
			return getRuleContext(AddressContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public I_gatewayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_gateway; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterI_gateway(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitI_gateway(this);
		}
	}

	public final I_gatewayContext i_gateway() throws RecognitionException {
		I_gatewayContext _localctx = new I_gatewayContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_i_gateway);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(GATEWAY);
			setState(350);
			address();
			setState(351);
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

	public static class I_hwaddressContext extends ParserRuleContext {
		public TerminalNode HWADDRESS() { return getToken(CumulusInterfacesParser.HWADDRESS, 0); }
		public TerminalNode MAC_ADDRESS() { return getToken(CumulusInterfacesParser.MAC_ADDRESS, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public I_hwaddressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_hwaddress; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterI_hwaddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitI_hwaddress(this);
		}
	}

	public final I_hwaddressContext i_hwaddress() throws RecognitionException {
		I_hwaddressContext _localctx = new I_hwaddressContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_i_hwaddress);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(HWADDRESS);
			setState(354);
			match(MAC_ADDRESS);
			setState(355);
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

	public static class I_link_speedContext extends ParserRuleContext {
		public TerminalNode LINK_SPEED() { return getToken(CumulusInterfacesParser.LINK_SPEED, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public I_link_speedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_link_speed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterI_link_speed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitI_link_speed(this);
		}
	}

	public final I_link_speedContext i_link_speed() throws RecognitionException {
		I_link_speedContext _localctx = new I_link_speedContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_i_link_speed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(LINK_SPEED);
			setState(358);
			number();
			setState(359);
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

	public static class I_link_autonegContext extends ParserRuleContext {
		public TerminalNode LINK_AUTONEG() { return getToken(CumulusInterfacesParser.LINK_AUTONEG, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public TerminalNode ON() { return getToken(CumulusInterfacesParser.ON, 0); }
		public TerminalNode OFF() { return getToken(CumulusInterfacesParser.OFF, 0); }
		public I_link_autonegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_link_autoneg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterI_link_autoneg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitI_link_autoneg(this);
		}
	}

	public final I_link_autonegContext i_link_autoneg() throws RecognitionException {
		I_link_autonegContext _localctx = new I_link_autonegContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_i_link_autoneg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(LINK_AUTONEG);
			setState(362);
			_la = _input.LA(1);
			if ( !(_la==OFF || _la==ON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(363);
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

	public static class I_mstpctl_bpduguardContext extends ParserRuleContext {
		public TerminalNode MSTPCTL_BPDUGUARD() { return getToken(CumulusInterfacesParser.MSTPCTL_BPDUGUARD, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public I_mstpctl_bpduguardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_mstpctl_bpduguard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterI_mstpctl_bpduguard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitI_mstpctl_bpduguard(this);
		}
	}

	public final I_mstpctl_bpduguardContext i_mstpctl_bpduguard() throws RecognitionException {
		I_mstpctl_bpduguardContext _localctx = new I_mstpctl_bpduguardContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_i_mstpctl_bpduguard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(MSTPCTL_BPDUGUARD);
			setState(366);
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

	public static class I_mstpctl_portadminedgeContext extends ParserRuleContext {
		public TerminalNode MSTPCTL_PORTADMINEDGE() { return getToken(CumulusInterfacesParser.MSTPCTL_PORTADMINEDGE, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public I_mstpctl_portadminedgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_mstpctl_portadminedge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterI_mstpctl_portadminedge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitI_mstpctl_portadminedge(this);
		}
	}

	public final I_mstpctl_portadminedgeContext i_mstpctl_portadminedge() throws RecognitionException {
		I_mstpctl_portadminedgeContext _localctx = new I_mstpctl_portadminedgeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_i_mstpctl_portadminedge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(MSTPCTL_PORTADMINEDGE);
			setState(369);
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

	public static class I_mstpctl_portbpdufilterContext extends ParserRuleContext {
		public TerminalNode MSTPCTL_PORTBPDUFILTER() { return getToken(CumulusInterfacesParser.MSTPCTL_PORTBPDUFILTER, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public I_mstpctl_portbpdufilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_mstpctl_portbpdufilter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterI_mstpctl_portbpdufilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitI_mstpctl_portbpdufilter(this);
		}
	}

	public final I_mstpctl_portbpdufilterContext i_mstpctl_portbpdufilter() throws RecognitionException {
		I_mstpctl_portbpdufilterContext _localctx = new I_mstpctl_portbpdufilterContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_i_mstpctl_portbpdufilter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(MSTPCTL_PORTBPDUFILTER);
			setState(372);
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

	public static class I_mtuContext extends ParserRuleContext {
		public TerminalNode MTU() { return getToken(CumulusInterfacesParser.MTU, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public I_mtuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_mtu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterI_mtu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitI_mtu(this);
		}
	}

	public final I_mtuContext i_mtu() throws RecognitionException {
		I_mtuContext _localctx = new I_mtuContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_i_mtu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(MTU);
			setState(375);
			number();
			setState(376);
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

	public static class I_post_upContext extends ParserRuleContext {
		public TerminalNode POST_UP() { return getToken(CumulusInterfacesParser.POST_UP, 0); }
		public Ipu_ipContext ipu_ip() {
			return getRuleContext(Ipu_ipContext.class,0);
		}
		public I_post_upContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_post_up; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterI_post_up(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitI_post_up(this);
		}
	}

	public final I_post_upContext i_post_up() throws RecognitionException {
		I_post_upContext _localctx = new I_post_upContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_i_post_up);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(POST_UP);
			{
			setState(379);
			ipu_ip();
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

	public static class Ipu_ipContext extends ParserRuleContext {
		public TerminalNode IP() { return getToken(CumulusInterfacesParser.IP, 0); }
		public Ipui_linkContext ipui_link() {
			return getRuleContext(Ipui_linkContext.class,0);
		}
		public Ipui_routeContext ipui_route() {
			return getRuleContext(Ipui_routeContext.class,0);
		}
		public Ipu_ipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipu_ip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterIpu_ip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitIpu_ip(this);
		}
	}

	public final Ipu_ipContext ipu_ip() throws RecognitionException {
		Ipu_ipContext _localctx = new Ipu_ipContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_ipu_ip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(IP);
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LINK:
				{
				setState(382);
				ipui_link();
				}
				break;
			case ROUTE:
				{
				setState(383);
				ipui_route();
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

	public static class Ipui_linkContext extends ParserRuleContext {
		public TerminalNode LINK() { return getToken(CumulusInterfacesParser.LINK, 0); }
		public Ipuil_setContext ipuil_set() {
			return getRuleContext(Ipuil_setContext.class,0);
		}
		public Ipui_linkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipui_link; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterIpui_link(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitIpui_link(this);
		}
	}

	public final Ipui_linkContext ipui_link() throws RecognitionException {
		Ipui_linkContext _localctx = new Ipui_linkContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_ipui_link);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(LINK);
			{
			setState(387);
			ipuil_set();
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

	public static class Ipuil_setContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(CumulusInterfacesParser.SET, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public Ipuil_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipuil_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterIpuil_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitIpuil_set(this);
		}
	}

	public final Ipuil_setContext ipuil_set() throws RecognitionException {
		Ipuil_setContext _localctx = new Ipuil_setContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_ipuil_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(SET);
			setState(390);
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

	public static class Ipui_routeContext extends ParserRuleContext {
		public TerminalNode ROUTE() { return getToken(CumulusInterfacesParser.ROUTE, 0); }
		public Ipuir_addContext ipuir_add() {
			return getRuleContext(Ipuir_addContext.class,0);
		}
		public Ipui_routeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipui_route; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterIpui_route(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitIpui_route(this);
		}
	}

	public final Ipui_routeContext ipui_route() throws RecognitionException {
		Ipui_routeContext _localctx = new Ipui_routeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_ipui_route);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(ROUTE);
			{
			setState(393);
			ipuir_add();
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

	public static class Ipuir_addContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(CumulusInterfacesParser.ADD, 0); }
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public List<TerminalNode> VIA() { return getTokens(CumulusInterfacesParser.VIA); }
		public TerminalNode VIA(int i) {
			return getToken(CumulusInterfacesParser.VIA, i);
		}
		public List<AddressContext> address() {
			return getRuleContexts(AddressContext.class);
		}
		public AddressContext address(int i) {
			return getRuleContext(AddressContext.class,i);
		}
		public List<TerminalNode> DEV() { return getTokens(CumulusInterfacesParser.DEV); }
		public TerminalNode DEV(int i) {
			return getToken(CumulusInterfacesParser.DEV, i);
		}
		public List<Interface_nameContext> interface_name() {
			return getRuleContexts(Interface_nameContext.class);
		}
		public Interface_nameContext interface_name(int i) {
			return getRuleContext(Interface_nameContext.class,i);
		}
		public Ipuir_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipuir_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterIpuir_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitIpuir_add(this);
		}
	}

	public final Ipuir_addContext ipuir_add() throws RecognitionException {
		Ipuir_addContext _localctx = new Ipuir_addContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_ipuir_add);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(ADD);
			setState(396);
			prefix();
			setState(401); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(401);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VIA:
					{
					setState(397);
					match(VIA);
					setState(398);
					address();
					}
					break;
				case DEV:
					{
					setState(399);
					match(DEV);
					setState(400);
					interface_name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(403); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DEV || _la==VIA );
			setState(405);
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

	public static class I_vlan_idContext extends ParserRuleContext {
		public TerminalNode VLAN_ID() { return getToken(CumulusInterfacesParser.VLAN_ID, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public I_vlan_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_vlan_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterI_vlan_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitI_vlan_id(this);
		}
	}

	public final I_vlan_idContext i_vlan_id() throws RecognitionException {
		I_vlan_idContext _localctx = new I_vlan_idContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_i_vlan_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(VLAN_ID);
			setState(408);
			number();
			setState(409);
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

	public static class I_vlan_raw_deviceContext extends ParserRuleContext {
		public TerminalNode VLAN_RAW_DEVICE() { return getToken(CumulusInterfacesParser.VLAN_RAW_DEVICE, 0); }
		public Interface_nameContext interface_name() {
			return getRuleContext(Interface_nameContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public I_vlan_raw_deviceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_vlan_raw_device; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterI_vlan_raw_device(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitI_vlan_raw_device(this);
		}
	}

	public final I_vlan_raw_deviceContext i_vlan_raw_device() throws RecognitionException {
		I_vlan_raw_deviceContext _localctx = new I_vlan_raw_deviceContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_i_vlan_raw_device);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(VLAN_RAW_DEVICE);
			setState(412);
			interface_name();
			setState(413);
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

	public static class I_vrfContext extends ParserRuleContext {
		public TerminalNode VRF() { return getToken(CumulusInterfacesParser.VRF, 0); }
		public Vrf_nameContext vrf_name() {
			return getRuleContext(Vrf_nameContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public I_vrfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_vrf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterI_vrf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitI_vrf(this);
		}
	}

	public final I_vrfContext i_vrf() throws RecognitionException {
		I_vrfContext _localctx = new I_vrfContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_i_vrf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(VRF);
			setState(416);
			vrf_name();
			setState(417);
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

	public static class I_vrf_tableContext extends ParserRuleContext {
		public TerminalNode VRF_TABLE() { return getToken(CumulusInterfacesParser.VRF_TABLE, 0); }
		public Vrf_table_nameContext vrf_table_name() {
			return getRuleContext(Vrf_table_nameContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public I_vrf_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_vrf_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterI_vrf_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitI_vrf_table(this);
		}
	}

	public final I_vrf_tableContext i_vrf_table() throws RecognitionException {
		I_vrf_tableContext _localctx = new I_vrf_tableContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_i_vrf_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(VRF_TABLE);
			setState(420);
			vrf_table_name();
			setState(421);
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

	public static class I_vxlan_idContext extends ParserRuleContext {
		public TerminalNode VXLAN_ID() { return getToken(CumulusInterfacesParser.VXLAN_ID, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public I_vxlan_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_vxlan_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterI_vxlan_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitI_vxlan_id(this);
		}
	}

	public final I_vxlan_idContext i_vxlan_id() throws RecognitionException {
		I_vxlan_idContext _localctx = new I_vxlan_idContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_i_vxlan_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(VXLAN_ID);
			setState(424);
			number();
			setState(425);
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

	public static class I_vxlan_local_tunnel_ipContext extends ParserRuleContext {
		public TerminalNode VXLAN_LOCAL_TUNNEL_IP() { return getToken(CumulusInterfacesParser.VXLAN_LOCAL_TUNNEL_IP, 0); }
		public AddressContext address() {
			return getRuleContext(AddressContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CumulusInterfacesParser.NEWLINE, 0); }
		public I_vxlan_local_tunnel_ipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_vxlan_local_tunnel_ip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterI_vxlan_local_tunnel_ip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitI_vxlan_local_tunnel_ip(this);
		}
	}

	public final I_vxlan_local_tunnel_ipContext i_vxlan_local_tunnel_ip() throws RecognitionException {
		I_vxlan_local_tunnel_ipContext _localctx = new I_vxlan_local_tunnel_ipContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_i_vxlan_local_tunnel_ip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(VXLAN_LOCAL_TUNNEL_IP);
			setState(428);
			address();
			setState(429);
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

	public static class Interface_nameContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(CumulusInterfacesParser.WORD, 0); }
		public Interface_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterInterface_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitInterface_name(this);
		}
	}

	public final Interface_nameContext interface_name() throws RecognitionException {
		Interface_nameContext _localctx = new Interface_nameContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_interface_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(WORD);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(CumulusInterfacesParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(NUMBER);
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

	public static class Number_or_rangeContext extends ParserRuleContext {
		public NumberContext lo;
		public NumberContext hi;
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public TerminalNode DASH() { return getToken(CumulusInterfacesParser.DASH, 0); }
		public Number_or_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_or_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterNumber_or_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitNumber_or_range(this);
		}
	}

	public final Number_or_rangeContext number_or_range() throws RecognitionException {
		Number_or_rangeContext _localctx = new Number_or_rangeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_number_or_range);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			((Number_or_rangeContext)_localctx).lo = number();
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DASH) {
				{
				setState(436);
				match(DASH);
				setState(437);
				((Number_or_rangeContext)_localctx).hi = number();
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

	public static class AddressContext extends ParserRuleContext {
		public TerminalNode IP_ADDRESS() { return getToken(CumulusInterfacesParser.IP_ADDRESS, 0); }
		public AddressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterAddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitAddress(this);
		}
	}

	public final AddressContext address() throws RecognitionException {
		AddressContext _localctx = new AddressContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_address);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(IP_ADDRESS);
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

	public static class PrefixContext extends ParserRuleContext {
		public TerminalNode IP_PREFIX() { return getToken(CumulusInterfacesParser.IP_PREFIX, 0); }
		public PrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitPrefix(this);
		}
	}

	public final PrefixContext prefix() throws RecognitionException {
		PrefixContext _localctx = new PrefixContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_prefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
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

	public static class Interface_addressContext extends ParserRuleContext {
		public AddressContext addr_32;
		public PrefixContext addr_mask;
		public AddressContext address() {
			return getRuleContext(AddressContext.class,0);
		}
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public Interface_addressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterInterface_address(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitInterface_address(this);
		}
	}

	public final Interface_addressContext interface_address() throws RecognitionException {
		Interface_addressContext _localctx = new Interface_addressContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_interface_address);
		try {
			setState(446);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IP_ADDRESS:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				((Interface_addressContext)_localctx).addr_32 = address();
				}
				break;
			case IP_PREFIX:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				((Interface_addressContext)_localctx).addr_mask = prefix();
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

	public static class Address6Context extends ParserRuleContext {
		public TerminalNode IPV6_ADDRESS() { return getToken(CumulusInterfacesParser.IPV6_ADDRESS, 0); }
		public Address6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_address6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterAddress6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitAddress6(this);
		}
	}

	public final Address6Context address6() throws RecognitionException {
		Address6Context _localctx = new Address6Context(_ctx, getState());
		enterRule(_localctx, 114, RULE_address6);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
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

	public static class Prefix6Context extends ParserRuleContext {
		public TerminalNode IPV6_PREFIX() { return getToken(CumulusInterfacesParser.IPV6_PREFIX, 0); }
		public Prefix6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterPrefix6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitPrefix6(this);
		}
	}

	public final Prefix6Context prefix6() throws RecognitionException {
		Prefix6Context _localctx = new Prefix6Context(_ctx, getState());
		enterRule(_localctx, 116, RULE_prefix6);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
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

	public static class Interface_address6Context extends ParserRuleContext {
		public Address6Context addr_128;
		public Prefix6Context addr_mask;
		public Address6Context address6() {
			return getRuleContext(Address6Context.class,0);
		}
		public Prefix6Context prefix6() {
			return getRuleContext(Prefix6Context.class,0);
		}
		public Interface_address6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_address6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterInterface_address6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitInterface_address6(this);
		}
	}

	public final Interface_address6Context interface_address6() throws RecognitionException {
		Interface_address6Context _localctx = new Interface_address6Context(_ctx, getState());
		enterRule(_localctx, 118, RULE_interface_address6);
		try {
			setState(454);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IPV6_ADDRESS:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				((Interface_address6Context)_localctx).addr_128 = address6();
				}
				break;
			case IPV6_PREFIX:
				enterOuterAlt(_localctx, 2);
				{
				setState(453);
				((Interface_address6Context)_localctx).addr_mask = prefix6();
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

	public static class Vlan_idContext extends ParserRuleContext {
		public Token v;
		public TerminalNode NUMBER() { return getToken(CumulusInterfacesParser.NUMBER, 0); }
		public Vlan_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vlan_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterVlan_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitVlan_id(this);
		}
	}

	public final Vlan_idContext vlan_id() throws RecognitionException {
		Vlan_idContext _localctx = new Vlan_idContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_vlan_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			((Vlan_idContext)_localctx).v = match(NUMBER);
			setState(457);
			if (!(isVlanId(((Vlan_idContext)_localctx).v))) throw new FailedPredicateException(this, "isVlanId($v)");
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

	public static class Vrf_nameContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(CumulusInterfacesParser.WORD, 0); }
		public Vrf_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vrf_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterVrf_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitVrf_name(this);
		}
	}

	public final Vrf_nameContext vrf_name() throws RecognitionException {
		Vrf_nameContext _localctx = new Vrf_nameContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_vrf_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(WORD);
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

	public static class Vrf_table_nameContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(CumulusInterfacesParser.WORD, 0); }
		public Vrf_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vrf_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterVrf_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitVrf_table_name(this);
		}
	}

	public final Vrf_table_nameContext vrf_table_name() throws RecognitionException {
		Vrf_table_nameContext _localctx = new Vrf_table_nameContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_vrf_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(WORD);
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
		public List<TerminalNode> NEWLINE() { return getTokens(CumulusInterfacesParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CumulusInterfacesParser.NEWLINE, i);
		}
		public Null_rest_of_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_rest_of_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).enterNull_rest_of_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusInterfacesParserListener ) ((CumulusInterfacesParserListener)listener).exitNull_rest_of_line(this);
		}
	}

	public final Null_rest_of_lineContext null_rest_of_line() throws RecognitionException {
		Null_rest_of_lineContext _localctx = new Null_rest_of_lineContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_null_rest_of_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT) | (1L << WORD) | (1L << ADD) | (1L << ADDRESS) | (1L << ADDRESS_VIRTUAL) | (1L << ALIAS) | (1L << AUTO) | (1L << BOND_LACP_BYPASS_ALLOW) | (1L << BOND_LACP_RATE) | (1L << BOND_MASTER) | (1L << BOND_MIIMON) | (1L << BOND_MIN_LINKS) | (1L << BOND_MODE) | (1L << BOND_SLAVES) | (1L << BOND_XMIT_HASH_POLICY) | (1L << BRIDGE_PORTS) | (1L << BRIDGE_ACCESS) | (1L << BRIDGE_ARP_ND_SUPPRESS) | (1L << BRIDGE_LEARNING) | (1L << BRIDGE_PVID) | (1L << BRIDGE_VIDS) | (1L << BRIDGE_VLAN_AWARE) | (1L << CLAG_ID) | (1L << CLAGD_VXLAN_ANYCAST_IP) | (1L << CLAGD_BACKUP_IP) | (1L << CLAGD_PEER_IP) | (1L << CLAGD_PRIORITY) | (1L << CLAGD_SYS_MAC) | (1L << DASH) | (1L << DEV) | (1L << DHCP) | (1L << GATEWAY) | (1L << HWADDRESS) | (1L << IFACE) | (1L << INTERFACE) | (1L << INET) | (1L << IP) | (1L << LINK) | (1L << LINK_LOCAL) | (1L << LINK_SPEED) | (1L << LINK_AUTONEG) | (1L << LOOPBACK) | (1L << MANUAL) | (1L << MTU) | (1L << OFF) | (1L << ON) | (1L << MSTPCTL_BPDUGUARD) | (1L << MSTPCTL_PORTADMINEDGE) | (1L << MSTPCTL_PORTBPDUFILTER) | (1L << NO) | (1L << POST_UP) | (1L << ROUTE) | (1L << SET) | (1L << STATIC) | (1L << VIA) | (1L << VLAN_ID) | (1L << VLAN_RAW_DEVICE) | (1L << VRF) | (1L << VRF_TABLE) | (1L << VXLAN_ID) | (1L << VXLAN_LOCAL_TUNNEL_IP) | (1L << YES) | (1L << BLANK_LINE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (COMMENT_LINE - 64)) | (1L << (IP_ADDRESS - 64)) | (1L << (IPV6_ADDRESS - 64)) | (1L << (IP_PREFIX - 64)) | (1L << (IPV6_PREFIX - 64)) | (1L << (MAC_ADDRESS - 64)) | (1L << (NUMBER - 64)) | (1L << (WS - 64)) | (1L << (M_DropUntilNewline_NonNewline - 64)) | (1L << (M_LineText_WS - 64)) | (1L << (M_Word_WS - 64)) | (1L << (M_Words_WS - 64)))) != 0)) {
				{
				{
				setState(463);
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
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(469);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 60:
			return vlan_id_sempred((Vlan_idContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean vlan_id_sempred(Vlan_idContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return isVlanId(((Vlan_idContext)_localctx).v);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3N\u01da\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\7\2\u0084\n\2\f\2\16\2\u0087\13\2\3\2\3\2"+
		"\3\3\3\3\5\3\u008d\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u0097\n\5\3"+
		"\6\3\6\3\6\3\6\7\6\u009d\n\6\f\6\16\6\u00a0\13\6\3\6\3\6\3\6\7\6\u00a5"+
		"\n\6\f\6\16\6\u00a8\13\6\3\6\3\6\3\6\7\6\u00ad\n\6\f\6\16\6\u00b0\13\6"+
		"\3\6\3\6\3\6\7\6\u00b5\n\6\f\6\16\6\u00b8\13\6\5\6\u00ba\n\6\3\7\3\7\7"+
		"\7\u00be\n\7\f\7\16\7\u00c1\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00ea\n\b\3\t\5\t"+
		"\u00ed\n\t\3\t\3\t\3\t\5\t\u00f2\n\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u00fa"+
		"\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\6\22\u0116\n\22"+
		"\r\22\16\22\u0117\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\27\3\27\6\27\u012b\n\27\r\27\16\27\u012c\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\31\3\31\6\31\u0137\n\31\r\31\16\31\u0138\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\5"+
		"\34\u0149\n\34\3\34\3\34\3\35\3\35\3\35\5\35\u0150\n\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3("+
		"\3(\3)\3)\3)\3*\3*\3*\5*\u0183\n*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3."+
		"\3.\3.\3.\6.\u0194\n.\r.\16.\u0195\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3"+
		"\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3"+
		"\64\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\5\67\u01b9\n\67\38\3"+
		"8\39\39\3:\3:\5:\u01c1\n:\3;\3;\3<\3<\3=\3=\5=\u01c9\n=\3>\3>\3>\3?\3"+
		"?\3@\3@\3A\7A\u01d3\nA\fA\16A\u01d6\13A\3A\3A\3A\2\2B\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj"+
		"lnprtvxz|~\u0080\2\6\3\2$%\4\2\64\64@@\3\2/\60\3\2HH\2\u01d9\2\u0085\3"+
		"\2\2\2\4\u008c\3\2\2\2\6\u008e\3\2\2\2\b\u0092\3\2\2\2\n\u0098\3\2\2\2"+
		"\f\u00bb\3\2\2\2\16\u00e9\3\2\2\2\20\u00ec\3\2\2\2\22\u00f5\3\2\2\2\24"+
		"\u00fd\3\2\2\2\26\u0101\3\2\2\2\30\u0104\3\2\2\2\32\u0107\3\2\2\2\34\u010a"+
		"\3\2\2\2\36\u010d\3\2\2\2 \u0110\3\2\2\2\"\u0113\3\2\2\2$\u011b\3\2\2"+
		"\2&\u011e\3\2\2\2(\u0122\3\2\2\2*\u0125\3\2\2\2,\u0128\3\2\2\2.\u0130"+
		"\3\2\2\2\60\u0134\3\2\2\2\62\u013c\3\2\2\2\64\u0140\3\2\2\2\66\u0144\3"+
		"\2\2\28\u014c\3\2\2\2:\u0153\3\2\2\2<\u0157\3\2\2\2>\u015b\3\2\2\2@\u015f"+
		"\3\2\2\2B\u0163\3\2\2\2D\u0167\3\2\2\2F\u016b\3\2\2\2H\u016f\3\2\2\2J"+
		"\u0172\3\2\2\2L\u0175\3\2\2\2N\u0178\3\2\2\2P\u017c\3\2\2\2R\u017f\3\2"+
		"\2\2T\u0184\3\2\2\2V\u0187\3\2\2\2X\u018a\3\2\2\2Z\u018d\3\2\2\2\\\u0199"+
		"\3\2\2\2^\u019d\3\2\2\2`\u01a1\3\2\2\2b\u01a5\3\2\2\2d\u01a9\3\2\2\2f"+
		"\u01ad\3\2\2\2h\u01b1\3\2\2\2j\u01b3\3\2\2\2l\u01b5\3\2\2\2n\u01ba\3\2"+
		"\2\2p\u01bc\3\2\2\2r\u01c0\3\2\2\2t\u01c2\3\2\2\2v\u01c4\3\2\2\2x\u01c8"+
		"\3\2\2\2z\u01ca\3\2\2\2|\u01cd\3\2\2\2~\u01cf\3\2\2\2\u0080\u01d4\3\2"+
		"\2\2\u0082\u0084\5\4\3\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0088\u0089\7\2\2\3\u0089\3\3\2\2\2\u008a\u008d\5\6\4\2\u008b\u008d"+
		"\5\b\5\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\5\3\2\2\2\u008e"+
		"\u008f\7\t\2\2\u008f\u0090\5h\65\2\u0090\u0091\7H\2\2\u0091\7\3\2\2\2"+
		"\u0092\u0093\t\2\2\2\u0093\u0096\5h\65\2\u0094\u0097\5\n\6\2\u0095\u0097"+
		"\5\f\7\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0097\t\3\2\2\2\u0098"+
		"\u00b9\7&\2\2\u0099\u009a\7,\2\2\u009a\u009e\7H\2\2\u009b\u009d\5\16\b"+
		"\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u00ba\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7!\2\2\u00a2"+
		"\u00a6\7H\2\2\u00a3\u00a5\5\16\b\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2"+
		"\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00ba\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a9\u00aa\7-\2\2\u00aa\u00ae\7H\2\2\u00ab\u00ad\5\16"+
		"\b\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00ba\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\78"+
		"\2\2\u00b2\u00b6\7H\2\2\u00b3\u00b5\5\16\b\2\u00b4\u00b3\3\2\2\2\u00b5"+
		"\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00ba\3\2"+
		"\2\2\u00b8\u00b6\3\2\2\2\u00b9\u0099\3\2\2\2\u00b9\u00a1\3\2\2\2\u00b9"+
		"\u00a9\3\2\2\2\u00b9\u00b1\3\2\2\2\u00ba\13\3\2\2\2\u00bb\u00bf\7H\2\2"+
		"\u00bc\u00be\5\16\b\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd"+
		"\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\r\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2"+
		"\u00ea\5\20\t\2\u00c3\u00ea\5\22\n\2\u00c4\u00ea\5\24\13\2\u00c5\u00ea"+
		"\5\26\f\2\u00c6\u00ea\5\30\r\2\u00c7\u00ea\5\32\16\2\u00c8\u00ea\5\34"+
		"\17\2\u00c9\u00ea\5\36\20\2\u00ca\u00ea\5 \21\2\u00cb\u00ea\5\"\22\2\u00cc"+
		"\u00ea\5$\23\2\u00cd\u00ea\5&\24\2\u00ce\u00ea\5(\25\2\u00cf\u00ea\5*"+
		"\26\2\u00d0\u00ea\5,\27\2\u00d1\u00ea\5.\30\2\u00d2\u00ea\5\60\31\2\u00d3"+
		"\u00ea\5\62\32\2\u00d4\u00ea\5\64\33\2\u00d5\u00ea\5\66\34\2\u00d6\u00ea"+
		"\58\35\2\u00d7\u00ea\5:\36\2\u00d8\u00ea\5<\37\2\u00d9\u00ea\5> \2\u00da"+
		"\u00ea\5@!\2\u00db\u00ea\5B\"\2\u00dc\u00ea\5D#\2\u00dd\u00ea\5F$\2\u00de"+
		"\u00ea\5H%\2\u00df\u00ea\5J&\2\u00e0\u00ea\5L\'\2\u00e1\u00ea\5N(\2\u00e2"+
		"\u00ea\5P)\2\u00e3\u00ea\5\\/\2\u00e4\u00ea\5^\60\2\u00e5\u00ea\5`\61"+
		"\2\u00e6\u00ea\5b\62\2\u00e7\u00ea\5d\63\2\u00e8\u00ea\5f\64\2\u00e9\u00c2"+
		"\3\2\2\2\u00e9\u00c3\3\2\2\2\u00e9\u00c4\3\2\2\2\u00e9\u00c5\3\2\2\2\u00e9"+
		"\u00c6\3\2\2\2\u00e9\u00c7\3\2\2\2\u00e9\u00c8\3\2\2\2\u00e9\u00c9\3\2"+
		"\2\2\u00e9\u00ca\3\2\2\2\u00e9\u00cb\3\2\2\2\u00e9\u00cc\3\2\2\2\u00e9"+
		"\u00cd\3\2\2\2\u00e9\u00ce\3\2\2\2\u00e9\u00cf\3\2\2\2\u00e9\u00d0\3\2"+
		"\2\2\u00e9\u00d1\3\2\2\2\u00e9\u00d2\3\2\2\2\u00e9\u00d3\3\2\2\2\u00e9"+
		"\u00d4\3\2\2\2\u00e9\u00d5\3\2\2\2\u00e9\u00d6\3\2\2\2\u00e9\u00d7\3\2"+
		"\2\2\u00e9\u00d8\3\2\2\2\u00e9\u00d9\3\2\2\2\u00e9\u00da\3\2\2\2\u00e9"+
		"\u00db\3\2\2\2\u00e9\u00dc\3\2\2\2\u00e9\u00dd\3\2\2\2\u00e9\u00de\3\2"+
		"\2\2\u00e9\u00df\3\2\2\2\u00e9\u00e0\3\2\2\2\u00e9\u00e1\3\2\2\2\u00e9"+
		"\u00e2\3\2\2\2\u00e9\u00e3\3\2\2\2\u00e9\u00e4\3\2\2\2\u00e9\u00e5\3\2"+
		"\2\2\u00e9\u00e6\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea"+
		"\17\3\2\2\2\u00eb\u00ed\7\'\2\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2"+
		"\2\u00ed\u00ee\3\2\2\2\u00ee\u00f1\7\6\2\2\u00ef\u00f2\5r:\2\u00f0\u00f2"+
		"\5x=\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f4\7H\2\2\u00f4\21\3\2\2\2\u00f5\u00f6\7\7\2\2\u00f6\u00f9\7G\2\2"+
		"\u00f7\u00fa\5r:\2\u00f8\u00fa\5x=\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3"+
		"\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\7H\2\2\u00fc\23\3\2\2\2\u00fd\u00fe"+
		"\7\b\2\2\u00fe\u00ff\7\3\2\2\u00ff\u0100\7H\2\2\u0100\25\3\2\2\2\u0101"+
		"\u0102\7\n\2\2\u0102\u0103\7H\2\2\u0103\27\3\2\2\2\u0104\u0105\7\13\2"+
		"\2\u0105\u0106\7H\2\2\u0106\31\3\2\2\2\u0107\u0108\7\f\2\2\u0108\u0109"+
		"\7H\2\2\u0109\33\3\2\2\2\u010a\u010b\7\r\2\2\u010b\u010c\7H\2\2\u010c"+
		"\35\3\2\2\2\u010d\u010e\7\16\2\2\u010e\u010f\7H\2\2\u010f\37\3\2\2\2\u0110"+
		"\u0111\7\17\2\2\u0111\u0112\7H\2\2\u0112!\3\2\2\2\u0113\u0115\7\20\2\2"+
		"\u0114\u0116\5h\65\2\u0115\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0115"+
		"\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\7H\2\2\u011a"+
		"#\3\2\2\2\u011b\u011c\7\21\2\2\u011c\u011d\7H\2\2\u011d%\3\2\2\2\u011e"+
		"\u011f\7\23\2\2\u011f\u0120\5j\66\2\u0120\u0121\7H\2\2\u0121\'\3\2\2\2"+
		"\u0122\u0123\7\24\2\2\u0123\u0124\7H\2\2\u0124)\3\2\2\2\u0125\u0126\7"+
		"\25\2\2\u0126\u0127\7H\2\2\u0127+\3\2\2\2\u0128\u012a\7\22\2\2\u0129\u012b"+
		"\5h\65\2\u012a\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012a\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\7H\2\2\u012f-\3\2\2\2\u0130"+
		"\u0131\7\26\2\2\u0131\u0132\5z>\2\u0132\u0133\7H\2\2\u0133/\3\2\2\2\u0134"+
		"\u0136\7\27\2\2\u0135\u0137\5l\67\2\u0136\u0135\3\2\2\2\u0137\u0138\3"+
		"\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u013b\7H\2\2\u013b\61\3\2\2\2\u013c\u013d\7\30\2\2\u013d\u013e\t\3\2"+
		"\2\u013e\u013f\7H\2\2\u013f\63\3\2\2\2\u0140\u0141\7\31\2\2\u0141\u0142"+
		"\5j\66\2\u0142\u0143\7H\2\2\u0143\65\3\2\2\2\u0144\u0145\7\33\2\2\u0145"+
		"\u0148\5n8\2\u0146\u0147\7<\2\2\u0147\u0149\5|?\2\u0148\u0146\3\2\2\2"+
		"\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\7H\2\2\u014b\67\3"+
		"\2\2\2\u014c\u014f\7\34\2\2\u014d\u0150\5n8\2\u014e\u0150\7)\2\2\u014f"+
		"\u014d\3\2\2\2\u014f\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\7H"+
		"\2\2\u01529\3\2\2\2\u0153\u0154\7\35\2\2\u0154\u0155\5j\66\2\u0155\u0156"+
		"\7H\2\2\u0156;\3\2\2\2\u0157\u0158\7\36\2\2\u0158\u0159\7G\2\2\u0159\u015a"+
		"\7H\2\2\u015a=\3\2\2\2\u015b\u015c\7\32\2\2\u015c\u015d\5n8\2\u015d\u015e"+
		"\7H\2\2\u015e?\3\2\2\2\u015f\u0160\7\"\2\2\u0160\u0161\5n8\2\u0161\u0162"+
		"\7H\2\2\u0162A\3\2\2\2\u0163\u0164\7#\2\2\u0164\u0165\7G\2\2\u0165\u0166"+
		"\7H\2\2\u0166C\3\2\2\2\u0167\u0168\7*\2\2\u0168\u0169\5j\66\2\u0169\u016a"+
		"\7H\2\2\u016aE\3\2\2\2\u016b\u016c\7+\2\2\u016c\u016d\t\4\2\2\u016d\u016e"+
		"\7H\2\2\u016eG\3\2\2\2\u016f\u0170\7\61\2\2\u0170\u0171\7H\2\2\u0171I"+
		"\3\2\2\2\u0172\u0173\7\62\2\2\u0173\u0174\7H\2\2\u0174K\3\2\2\2\u0175"+
		"\u0176\7\63\2\2\u0176\u0177\7H\2\2\u0177M\3\2\2\2\u0178\u0179\7.\2\2\u0179"+
		"\u017a\5j\66\2\u017a\u017b\7H\2\2\u017bO\3\2\2\2\u017c\u017d\7\65\2\2"+
		"\u017d\u017e\5R*\2\u017eQ\3\2\2\2\u017f\u0182\7\'\2\2\u0180\u0183\5T+"+
		"\2\u0181\u0183\5X-\2\u0182\u0180\3\2\2\2\u0182\u0181\3\2\2\2\u0183S\3"+
		"\2\2\2\u0184\u0185\7(\2\2\u0185\u0186\5V,\2\u0186U\3\2\2\2\u0187\u0188"+
		"\7\67\2\2\u0188\u0189\7H\2\2\u0189W\3\2\2\2\u018a\u018b\7\66\2\2\u018b"+
		"\u018c\5Z.\2\u018cY\3\2\2\2\u018d\u018e\7\5\2\2\u018e\u0193\5p9\2\u018f"+
		"\u0190\79\2\2\u0190\u0194\5n8\2\u0191\u0192\7 \2\2\u0192\u0194\5h\65\2"+
		"\u0193\u018f\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0193"+
		"\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\7H\2\2\u0198"+
		"[\3\2\2\2\u0199\u019a\7:\2\2\u019a\u019b\5j\66\2\u019b\u019c\7H\2\2\u019c"+
		"]\3\2\2\2\u019d\u019e\7;\2\2\u019e\u019f\5h\65\2\u019f\u01a0\7H\2\2\u01a0"+
		"_\3\2\2\2\u01a1\u01a2\7<\2\2\u01a2\u01a3\5|?\2\u01a3\u01a4\7H\2\2\u01a4"+
		"a\3\2\2\2\u01a5\u01a6\7=\2\2\u01a6\u01a7\5~@\2\u01a7\u01a8\7H\2\2\u01a8"+
		"c\3\2\2\2\u01a9\u01aa\7>\2\2\u01aa\u01ab\5j\66\2\u01ab\u01ac\7H\2\2\u01ac"+
		"e\3\2\2\2\u01ad\u01ae\7?\2\2\u01ae\u01af\5n8\2\u01af\u01b0\7H\2\2\u01b0"+
		"g\3\2\2\2\u01b1\u01b2\7\4\2\2\u01b2i\3\2\2\2\u01b3\u01b4\7I\2\2\u01b4"+
		"k\3\2\2\2\u01b5\u01b8\5j\66\2\u01b6\u01b7\7\37\2\2\u01b7\u01b9\5j\66\2"+
		"\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9m\3\2\2\2\u01ba\u01bb\7"+
		"C\2\2\u01bbo\3\2\2\2\u01bc\u01bd\7E\2\2\u01bdq\3\2\2\2\u01be\u01c1\5n"+
		"8\2\u01bf\u01c1\5p9\2\u01c0\u01be\3\2\2\2\u01c0\u01bf\3\2\2\2\u01c1s\3"+
		"\2\2\2\u01c2\u01c3\7D\2\2\u01c3u\3\2\2\2\u01c4\u01c5\7F\2\2\u01c5w\3\2"+
		"\2\2\u01c6\u01c9\5t;\2\u01c7\u01c9\5v<\2\u01c8\u01c6\3\2\2\2\u01c8\u01c7"+
		"\3\2\2\2\u01c9y\3\2\2\2\u01ca\u01cb\7I\2\2\u01cb\u01cc\6>\2\3\u01cc{\3"+
		"\2\2\2\u01cd\u01ce\7\4\2\2\u01ce}\3\2\2\2\u01cf\u01d0\7\4\2\2\u01d0\177"+
		"\3\2\2\2\u01d1\u01d3\n\5\2\2\u01d2\u01d1\3\2\2\2\u01d3\u01d6\3\2\2\2\u01d4"+
		"\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d7\3\2\2\2\u01d6\u01d4\3\2"+
		"\2\2\u01d7\u01d8\7H\2\2\u01d8\u0081\3\2\2\2\33\u0085\u008c\u0096\u009e"+
		"\u00a6\u00ae\u00b6\u00b9\u00bf\u00e9\u00ec\u00f1\u00f9\u0117\u012c\u0138"+
		"\u0148\u014f\u0182\u0193\u0195\u01b8\u01c0\u01c8\u01d4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}