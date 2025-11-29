// Generated from org/batfish/grammar/cumulus_nclu/CumulusNcluParser.g4 by ANTLR 4.7.2
package org.batfish.grammar.cumulus_nclu;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CumulusNcluParser extends org.batfish.grammar.cumulus_nclu.parsing.CumulusNcluBaseParser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ALIAS_BODY=1, EXTRA_CONFIGURATION_FOOTER=2, USERNAME=3, ACCESS=4, ACTIVATE=5, 
		ADD=6, ADDRESS=7, ADDRESS_VIRTUAL=8, ADVERTISE=9, ADVERTISE_ALL_VNI=10, 
		ADVERTISE_DEFAULT_GW=11, AGENTX=12, ALERTS=13, ALIAS=14, ALWAYS_COMPARE_MED=15, 
		ARP_ND_SUPPRESS=16, AS_PATH=17, AUTO=18, AUTONOMOUS_SYSTEM=19, BACKUP_IP=20, 
		BESTPATH=21, BGP=22, BOND=23, BPDUGUARD=24, BRIDGE=25, CLAG=26, COMMIT=27, 
		CONNECTED=28, CRITICAL=29, DATACENTER=30, DEBUGGING=31, DEFAULTS=32, DEL=33, 
		DENY=34, DESCRIPTION=35, DHCP=36, DNS=37, DOT1X=38, EMERGENCIES=39, ERRORS=40, 
		EVPN=41, EXIT_VRF=42, EXTERNAL=43, FORWARD=44, GATEWAY=45, HOSTNAME=46, 
		HWADDRESS=47, IBURST=48, ID=49, INFORMATIONAL=50, INTEGRATED_VTYSH_CONFIG=51, 
		INTERFACE=52, INTERNAL=53, IP=54, IPV4=55, IPV6=56, L2VPN=57, LACP_BYPASS_ALLOW=58, 
		LEARNING=59, LINK=60, LINKLOCAL=61, LO=62, LOCAL_TUNNELIP=63, LOG=64, 
		LOOPBACK=65, MATCH=66, MSEC=67, MTU=68, MULTIPATH_RELAX=69, NAMESERVER=70, 
		ND=71, NEIGHBOR=72, NETWORK=73, NET=74, NO=75, NOTIFICATIONS=76, NTP=77, 
		OFF=78, ON=79, PEER_GROUP=80, PEER_IP=81, PERMIT=82, PORTADMINEDGE=83, 
		PORTAUTOEDGE=84, PORTBPDUFILTER=85, PORTNETWORK=86, PORTRESTROLE=87, PORTS=88, 
		PRIORITY=89, PTP=90, PVID=91, RA_INTERVAL=92, RA_LIFETIME=93, REDISTRIBUTE=94, 
		REMOTE_AS=95, ROUTE=96, ROUTER=97, ROUTE_MAP=98, ROUTE_REFLECTOR_CLIENT=99, 
		ROUTER_ID=100, ROUTING=101, SERVER=102, SERVICE=103, SLAVES=104, SNMP_SERVER=105, 
		SOURCE=106, SPEED=107, STATIC=108, STP=109, SUPPRESS_RA=110, SYS_MAC=111, 
		SYSLOG=112, TIME=113, UNICAST=114, VIDS=115, VLAN=116, VLAN_AWARE=117, 
		VLAN_ID=118, VLAN_RAW_DEVICE=119, VNI=120, VRF=121, VRF_TABLE=122, VXLAN=123, 
		VXLAN_ANYCAST_IP=124, WARNINGS=125, ZONE=126, EXTRA_CONFIGURATION_HEADER=127, 
		COMMA=128, COMMENT_LINE=129, COMMENT_TAIL=130, DASH=131, DEC=132, IP_ADDRESS=133, 
		IP_PREFIX=134, IPV6_ADDRESS=135, IPV6_PREFIX=136, MAC_ADDRESS=137, NEWLINE=138, 
		NUMBERED_WORD=139, WORD=140, WS=141, M_Alias_WS=142, M_Printf_WS=143, 
		M_Printf_EXTRA_CONFIGURATION_FOOTER=144, M_Printf_NEWLINE=145, M_Printf_USERNAME=146;
	public static final int
		RULE_cumulus_nclu_configuration = 0, RULE_statement = 1, RULE_s_extra_configuration = 2, 
		RULE_s_net_add = 3, RULE_a_bond = 4, RULE_bond_bond = 5, RULE_bobo_lacp_bypass_allow = 6, 
		RULE_bobo_slaves = 7, RULE_bond_bridge = 8, RULE_bob_access = 9, RULE_bob_learning = 10, 
		RULE_bob_pvid = 11, RULE_bob_vids = 12, RULE_bond_clag_id = 13, RULE_bond_ip_address = 14, 
		RULE_bond_mtu = 15, RULE_bond_vrf = 16, RULE_a_bridge = 17, RULE_bridge_bridge = 18, 
		RULE_brbr_ports = 19, RULE_brbr_pvid = 20, RULE_brbr_vids = 21, RULE_brbr_vlan_aware = 22, 
		RULE_a_dns = 23, RULE_dns_nameserver = 24, RULE_dn4 = 25, RULE_dn6 = 26, 
		RULE_a_dot1x = 27, RULE_a_hostname = 28, RULE_a_loopback = 29, RULE_l_clag = 30, 
		RULE_lc_vxlan_anycast_ip = 31, RULE_l_ip_address = 32, RULE_l_vxlan = 33, 
		RULE_lv_local_tunnelip = 34, RULE_a_ptp = 35, RULE_a_snmp_server = 36, 
		RULE_a_time = 37, RULE_t_ntp = 38, RULE_tn_server = 39, RULE_tn_source = 40, 
		RULE_t_zone = 41, RULE_a_vlan = 42, RULE_v_alias = 43, RULE_v_hw_address = 44, 
		RULE_v_ip_address = 45, RULE_v_ip_address_virtual = 46, RULE_v_vlan_id = 47, 
		RULE_v_vlan_raw_device = 48, RULE_v_vrf = 49, RULE_a_vrf = 50, RULE_vrf_ip_address = 51, 
		RULE_vrf_vni = 52, RULE_vrf_vrf_table = 53, RULE_a_vxlan = 54, RULE_vx_bridge = 55, 
		RULE_vxb_access = 56, RULE_vxb_arp_nd_suppress = 57, RULE_vxb_learning = 58, 
		RULE_vx_stp = 59, RULE_vxs_bpduguard = 60, RULE_vxs_portbpdufilter = 61, 
		RULE_vx_vxlan = 62, RULE_vxv_id = 63, RULE_vxv_local_tunnelip = 64, RULE_s_net_add_unrecognized = 65, 
		RULE_s_null = 66, RULE_glob = 67, RULE_glob_range_set = 68, RULE_glob_word = 69, 
		RULE_interface_address = 70, RULE_ip_address = 71, RULE_ip_prefix = 72, 
		RULE_ipv6_address = 73, RULE_line_action = 74, RULE_mac_address = 75, 
		RULE_null_rest_of_line = 76, RULE_numbered_word = 77, RULE_range = 78, 
		RULE_range_set = 79, RULE_uint16 = 80, RULE_uint32 = 81, RULE_vlan_id = 82, 
		RULE_vlan_range = 83, RULE_vlan_range_set = 84, RULE_vni_number = 85, 
		RULE_word = 86, RULE_zero = 87, RULE_a_bgp = 88, RULE_b_common = 89, RULE_b_always_compare_med = 90, 
		RULE_b_autonomous_system = 91, RULE_b_bestpath = 92, RULE_bb_aspath_multipath_relax = 93, 
		RULE_b_ipv4_unicast = 94, RULE_bi4_network = 95, RULE_bi4_neighbor = 96, 
		RULE_bi4n_activate = 97, RULE_bi4n_route_reflector_client = 98, RULE_bi4_redistribute_connected = 99, 
		RULE_bi4_redistribute_static = 100, RULE_b_l2vpn = 101, RULE_ble_advertise_all_vni = 102, 
		RULE_ble_advertise_default_gw = 103, RULE_ble_advertise_ipv4_unicast = 104, 
		RULE_ble_neighbor = 105, RULE_blen_activate = 106, RULE_blen_route_reflector_client = 107, 
		RULE_b_neighbor = 108, RULE_bn_interface = 109, RULE_bn_peer = 110, RULE_bn_peer_group = 111, 
		RULE_bnp_description = 112, RULE_bnp_peer_group = 113, RULE_bnp_remote_as = 114, 
		RULE_b_router_id = 115, RULE_b_vrf = 116, RULE_frr_router = 117, RULE_frr_vrf = 118, 
		RULE_frr_exit_vrf = 119, RULE_frrv_ip_route = 120, RULE_frr_username = 121, 
		RULE_frr_null_rest_of_line = 122, RULE_frr_unrecognized = 123, RULE_a_interface = 124, 
		RULE_i_alias = 125, RULE_i_bridge = 126, RULE_ib_access = 127, RULE_ib_pvid = 128, 
		RULE_ib_vids = 129, RULE_i_clag = 130, RULE_ic_backup_ip = 131, RULE_ic_peer_ip = 132, 
		RULE_ic_priority = 133, RULE_ic_sys_mac = 134, RULE_i_ip_address = 135, 
		RULE_i_ipv6 = 136, RULE_i_link_speed = 137, RULE_i_mtu = 138, RULE_iv6_address = 139, 
		RULE_iv6_address_virtual = 140, RULE_iv6_forward = 141, RULE_iv6_gateway = 142, 
		RULE_iv6_nd = 143, RULE_iv6_ra_interval = 144, RULE_iv6_ra_lifetime = 145, 
		RULE_iv6_suppress_ra = 146, RULE_i_vrf = 147, RULE_stp_common = 148, RULE_stp_bpduguard = 149, 
		RULE_stp_portadminedge = 150, RULE_stp_portautoedge = 151, RULE_stp_portbpdufilter = 152, 
		RULE_stp_portnetwork = 153, RULE_stp_portrestrrole = 154, RULE_a_routing = 155, 
		RULE_r_agentx = 156, RULE_r_defaults_datacenter = 157, RULE_r_log = 158, 
		RULE_rl_syslog = 159, RULE_r_route = 160, RULE_r_route_map = 161, RULE_rm_match = 162, 
		RULE_rmm_interface = 163, RULE_r_service_integrated_vtysh_config = 164;
	private static String[] makeRuleNames() {
		return new String[] {
			"cumulus_nclu_configuration", "statement", "s_extra_configuration", "s_net_add", 
			"a_bond", "bond_bond", "bobo_lacp_bypass_allow", "bobo_slaves", "bond_bridge", 
			"bob_access", "bob_learning", "bob_pvid", "bob_vids", "bond_clag_id", 
			"bond_ip_address", "bond_mtu", "bond_vrf", "a_bridge", "bridge_bridge", 
			"brbr_ports", "brbr_pvid", "brbr_vids", "brbr_vlan_aware", "a_dns", "dns_nameserver", 
			"dn4", "dn6", "a_dot1x", "a_hostname", "a_loopback", "l_clag", "lc_vxlan_anycast_ip", 
			"l_ip_address", "l_vxlan", "lv_local_tunnelip", "a_ptp", "a_snmp_server", 
			"a_time", "t_ntp", "tn_server", "tn_source", "t_zone", "a_vlan", "v_alias", 
			"v_hw_address", "v_ip_address", "v_ip_address_virtual", "v_vlan_id", 
			"v_vlan_raw_device", "v_vrf", "a_vrf", "vrf_ip_address", "vrf_vni", "vrf_vrf_table", 
			"a_vxlan", "vx_bridge", "vxb_access", "vxb_arp_nd_suppress", "vxb_learning", 
			"vx_stp", "vxs_bpduguard", "vxs_portbpdufilter", "vx_vxlan", "vxv_id", 
			"vxv_local_tunnelip", "s_net_add_unrecognized", "s_null", "glob", "glob_range_set", 
			"glob_word", "interface_address", "ip_address", "ip_prefix", "ipv6_address", 
			"line_action", "mac_address", "null_rest_of_line", "numbered_word", "range", 
			"range_set", "uint16", "uint32", "vlan_id", "vlan_range", "vlan_range_set", 
			"vni_number", "word", "zero", "a_bgp", "b_common", "b_always_compare_med", 
			"b_autonomous_system", "b_bestpath", "bb_aspath_multipath_relax", "b_ipv4_unicast", 
			"bi4_network", "bi4_neighbor", "bi4n_activate", "bi4n_route_reflector_client", 
			"bi4_redistribute_connected", "bi4_redistribute_static", "b_l2vpn", "ble_advertise_all_vni", 
			"ble_advertise_default_gw", "ble_advertise_ipv4_unicast", "ble_neighbor", 
			"blen_activate", "blen_route_reflector_client", "b_neighbor", "bn_interface", 
			"bn_peer", "bn_peer_group", "bnp_description", "bnp_peer_group", "bnp_remote_as", 
			"b_router_id", "b_vrf", "frr_router", "frr_vrf", "frr_exit_vrf", "frrv_ip_route", 
			"frr_username", "frr_null_rest_of_line", "frr_unrecognized", "a_interface", 
			"i_alias", "i_bridge", "ib_access", "ib_pvid", "ib_vids", "i_clag", "ic_backup_ip", 
			"ic_peer_ip", "ic_priority", "ic_sys_mac", "i_ip_address", "i_ipv6", 
			"i_link_speed", "i_mtu", "iv6_address", "iv6_address_virtual", "iv6_forward", 
			"iv6_gateway", "iv6_nd", "iv6_ra_interval", "iv6_ra_lifetime", "iv6_suppress_ra", 
			"i_vrf", "stp_common", "stp_bpduguard", "stp_portadminedge", "stp_portautoedge", 
			"stp_portbpdufilter", "stp_portnetwork", "stp_portrestrrole", "a_routing", 
			"r_agentx", "r_defaults_datacenter", "r_log", "rl_syslog", "r_route", 
			"r_route_map", "rm_match", "rmm_interface", "r_service_integrated_vtysh_config"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'access'", "'activate'", "'add'", "'address'", 
			"'address-virtual'", "'advertise'", "'advertise-all-vni'", "'advertise-default-gw'", 
			"'agentx'", "'alerts'", "'alias'", "'always-compare-med'", "'arp-nd-suppress'", 
			"'as-path'", "'auto'", "'autonomous-system'", "'backup-ip'", "'bestpath'", 
			"'bgp'", "'bond'", "'bpduguard'", "'bridge'", "'clag'", "'commit'", "'connected'", 
			"'critical'", "'datacenter'", "'debugging'", "'defaults'", "'del'", "'deny'", 
			"'description'", "'dhcp'", "'dns'", "'dot1x'", "'emergencies'", "'errors'", 
			"'evpn'", null, "'external'", "'forward'", "'gateway'", "'hostname'", 
			"'hwaddress'", "'iburst'", "'id'", "'informational'", "'integrated-vtysh-config'", 
			"'interface'", "'internal'", null, "'ipv4'", "'ipv6'", "'l2vpn'", "'lacp-bypass-allow'", 
			"'learning'", "'link'", "'linklocal'", "'lo'", "'local-tunnelip'", "'log'", 
			"'loopback'", "'match'", "'msec'", "'mtu'", "'multipath-relax'", "'nameserver'", 
			"'nd'", "'neighbor'", "'network'", "'net'", "'no'", "'notifications'", 
			"'ntp'", "'off'", "'on'", "'peer-group'", "'peer-ip'", "'permit'", "'portadminedge'", 
			"'portautoedge'", "'portbpdufilter'", "'portnetwork'", "'portrestrole'", 
			"'ports'", "'priority'", "'ptp'", "'pvid'", "'ra-interval'", "'ra-lifetime'", 
			"'redistribute'", "'remote-as'", null, null, "'route-map'", "'route-reflector-client'", 
			"'router-id'", "'routing'", "'server'", "'service'", "'slaves'", "'snmp-server'", 
			"'source'", "'speed'", "'static'", "'stp'", "'suppress-ra'", "'sys-mac'", 
			"'syslog'", "'time'", "'unicast'", "'vids'", "'vlan'", "'vlan-aware'", 
			"'vlan-id'", "'vlan-raw-device'", "'vni'", null, "'vrf-table'", "'vxlan'", 
			"'vxlan-anycast-ip'", "'warnings'", "'zone'", "'sudo sh -c \"printf ''", 
			"','", null, null, "'-'", null, null, null, null, null, null, null, null, 
			null, null, null, null, "'' >> /etc/frr/frr.conf\"'", "'\\n'", "'username'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ALIAS_BODY", "EXTRA_CONFIGURATION_FOOTER", "USERNAME", "ACCESS", 
			"ACTIVATE", "ADD", "ADDRESS", "ADDRESS_VIRTUAL", "ADVERTISE", "ADVERTISE_ALL_VNI", 
			"ADVERTISE_DEFAULT_GW", "AGENTX", "ALERTS", "ALIAS", "ALWAYS_COMPARE_MED", 
			"ARP_ND_SUPPRESS", "AS_PATH", "AUTO", "AUTONOMOUS_SYSTEM", "BACKUP_IP", 
			"BESTPATH", "BGP", "BOND", "BPDUGUARD", "BRIDGE", "CLAG", "COMMIT", "CONNECTED", 
			"CRITICAL", "DATACENTER", "DEBUGGING", "DEFAULTS", "DEL", "DENY", "DESCRIPTION", 
			"DHCP", "DNS", "DOT1X", "EMERGENCIES", "ERRORS", "EVPN", "EXIT_VRF", 
			"EXTERNAL", "FORWARD", "GATEWAY", "HOSTNAME", "HWADDRESS", "IBURST", 
			"ID", "INFORMATIONAL", "INTEGRATED_VTYSH_CONFIG", "INTERFACE", "INTERNAL", 
			"IP", "IPV4", "IPV6", "L2VPN", "LACP_BYPASS_ALLOW", "LEARNING", "LINK", 
			"LINKLOCAL", "LO", "LOCAL_TUNNELIP", "LOG", "LOOPBACK", "MATCH", "MSEC", 
			"MTU", "MULTIPATH_RELAX", "NAMESERVER", "ND", "NEIGHBOR", "NETWORK", 
			"NET", "NO", "NOTIFICATIONS", "NTP", "OFF", "ON", "PEER_GROUP", "PEER_IP", 
			"PERMIT", "PORTADMINEDGE", "PORTAUTOEDGE", "PORTBPDUFILTER", "PORTNETWORK", 
			"PORTRESTROLE", "PORTS", "PRIORITY", "PTP", "PVID", "RA_INTERVAL", "RA_LIFETIME", 
			"REDISTRIBUTE", "REMOTE_AS", "ROUTE", "ROUTER", "ROUTE_MAP", "ROUTE_REFLECTOR_CLIENT", 
			"ROUTER_ID", "ROUTING", "SERVER", "SERVICE", "SLAVES", "SNMP_SERVER", 
			"SOURCE", "SPEED", "STATIC", "STP", "SUPPRESS_RA", "SYS_MAC", "SYSLOG", 
			"TIME", "UNICAST", "VIDS", "VLAN", "VLAN_AWARE", "VLAN_ID", "VLAN_RAW_DEVICE", 
			"VNI", "VRF", "VRF_TABLE", "VXLAN", "VXLAN_ANYCAST_IP", "WARNINGS", "ZONE", 
			"EXTRA_CONFIGURATION_HEADER", "COMMA", "COMMENT_LINE", "COMMENT_TAIL", 
			"DASH", "DEC", "IP_ADDRESS", "IP_PREFIX", "IPV6_ADDRESS", "IPV6_PREFIX", 
			"MAC_ADDRESS", "NEWLINE", "NUMBERED_WORD", "WORD", "WS", "M_Alias_WS", 
			"M_Printf_WS", "M_Printf_EXTRA_CONFIGURATION_FOOTER", "M_Printf_NEWLINE", 
			"M_Printf_USERNAME"
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
	public String getGrammarFileName() { return "CumulusNcluParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CumulusNcluParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Cumulus_nclu_configurationContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CumulusNcluParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CumulusNcluParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CumulusNcluParser.NEWLINE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Cumulus_nclu_configurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cumulus_nclu_configuration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterCumulus_nclu_configuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitCumulus_nclu_configuration(this);
		}
	}

	public final Cumulus_nclu_configurationContext cumulus_nclu_configuration() throws RecognitionException {
		Cumulus_nclu_configurationContext _localctx = new Cumulus_nclu_configurationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cumulus_nclu_configuration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(330);
				match(NEWLINE);
				}
			}

			setState(334); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(333);
				statement();
				}
				}
				setState(336); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NET || _la==EXTRA_CONFIGURATION_HEADER );
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(338);
				match(NEWLINE);
				}
			}

			setState(341);
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
		public S_extra_configurationContext s_extra_configuration() {
			return getRuleContext(S_extra_configurationContext.class,0);
		}
		public S_net_addContext s_net_add() {
			return getRuleContext(S_net_addContext.class,0);
		}
		public S_net_add_unrecognizedContext s_net_add_unrecognized() {
			return getRuleContext(S_net_add_unrecognizedContext.class,0);
		}
		public S_nullContext s_null() {
			return getRuleContext(S_nullContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				s_extra_configuration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				s_net_add();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(345);
				s_net_add_unrecognized();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(346);
				s_null();
				}
				break;
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

	public static class S_extra_configurationContext extends ParserRuleContext {
		public TerminalNode EXTRA_CONFIGURATION_HEADER() { return getToken(CumulusNcluParser.EXTRA_CONFIGURATION_HEADER, 0); }
		public TerminalNode EXTRA_CONFIGURATION_FOOTER() { return getToken(CumulusNcluParser.EXTRA_CONFIGURATION_FOOTER, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Frr_routerContext frr_router() {
			return getRuleContext(Frr_routerContext.class,0);
		}
		public Frr_usernameContext frr_username() {
			return getRuleContext(Frr_usernameContext.class,0);
		}
		public Frr_vrfContext frr_vrf() {
			return getRuleContext(Frr_vrfContext.class,0);
		}
		public Frr_unrecognizedContext frr_unrecognized() {
			return getRuleContext(Frr_unrecognizedContext.class,0);
		}
		public S_extra_configurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_extra_configuration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterS_extra_configuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitS_extra_configuration(this);
		}
	}

	public final S_extra_configurationContext s_extra_configuration() throws RecognitionException {
		S_extra_configurationContext _localctx = new S_extra_configurationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_s_extra_configuration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(EXTRA_CONFIGURATION_HEADER);
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(350);
				frr_router();
				}
				break;
			case 2:
				{
				setState(351);
				frr_username();
				}
				break;
			case 3:
				{
				setState(352);
				frr_vrf();
				}
				break;
			case 4:
				{
				setState(353);
				frr_unrecognized();
				}
				break;
			}
			setState(356);
			match(EXTRA_CONFIGURATION_FOOTER);
			setState(357);
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

	public static class S_net_addContext extends ParserRuleContext {
		public TerminalNode NET() { return getToken(CumulusNcluParser.NET, 0); }
		public TerminalNode ADD() { return getToken(CumulusNcluParser.ADD, 0); }
		public A_bgpContext a_bgp() {
			return getRuleContext(A_bgpContext.class,0);
		}
		public A_bondContext a_bond() {
			return getRuleContext(A_bondContext.class,0);
		}
		public A_bridgeContext a_bridge() {
			return getRuleContext(A_bridgeContext.class,0);
		}
		public A_dnsContext a_dns() {
			return getRuleContext(A_dnsContext.class,0);
		}
		public A_dot1xContext a_dot1x() {
			return getRuleContext(A_dot1xContext.class,0);
		}
		public A_hostnameContext a_hostname() {
			return getRuleContext(A_hostnameContext.class,0);
		}
		public A_interfaceContext a_interface() {
			return getRuleContext(A_interfaceContext.class,0);
		}
		public A_loopbackContext a_loopback() {
			return getRuleContext(A_loopbackContext.class,0);
		}
		public A_ptpContext a_ptp() {
			return getRuleContext(A_ptpContext.class,0);
		}
		public A_routingContext a_routing() {
			return getRuleContext(A_routingContext.class,0);
		}
		public A_snmp_serverContext a_snmp_server() {
			return getRuleContext(A_snmp_serverContext.class,0);
		}
		public A_timeContext a_time() {
			return getRuleContext(A_timeContext.class,0);
		}
		public A_vlanContext a_vlan() {
			return getRuleContext(A_vlanContext.class,0);
		}
		public A_vrfContext a_vrf() {
			return getRuleContext(A_vrfContext.class,0);
		}
		public A_vxlanContext a_vxlan() {
			return getRuleContext(A_vxlanContext.class,0);
		}
		public S_net_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_net_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterS_net_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitS_net_add(this);
		}
	}

	public final S_net_addContext s_net_add() throws RecognitionException {
		S_net_addContext _localctx = new S_net_addContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_s_net_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(NET);
			setState(360);
			match(ADD);
			setState(376);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BGP:
				{
				setState(361);
				a_bgp();
				}
				break;
			case BOND:
				{
				setState(362);
				a_bond();
				}
				break;
			case BRIDGE:
				{
				setState(363);
				a_bridge();
				}
				break;
			case DNS:
				{
				setState(364);
				a_dns();
				}
				break;
			case DOT1X:
				{
				setState(365);
				a_dot1x();
				}
				break;
			case HOSTNAME:
				{
				setState(366);
				a_hostname();
				}
				break;
			case INTERFACE:
				{
				setState(367);
				a_interface();
				}
				break;
			case LOOPBACK:
				{
				setState(368);
				a_loopback();
				}
				break;
			case PTP:
				{
				setState(369);
				a_ptp();
				}
				break;
			case ROUTING:
				{
				setState(370);
				a_routing();
				}
				break;
			case SNMP_SERVER:
				{
				setState(371);
				a_snmp_server();
				}
				break;
			case TIME:
				{
				setState(372);
				a_time();
				}
				break;
			case VLAN:
				{
				setState(373);
				a_vlan();
				}
				break;
			case VRF:
				{
				setState(374);
				a_vrf();
				}
				break;
			case VXLAN:
				{
				setState(375);
				a_vxlan();
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

	public static class A_bondContext extends ParserRuleContext {
		public GlobContext bonds;
		public TerminalNode BOND() { return getToken(CumulusNcluParser.BOND, 0); }
		public GlobContext glob() {
			return getRuleContext(GlobContext.class,0);
		}
		public Bond_bondContext bond_bond() {
			return getRuleContext(Bond_bondContext.class,0);
		}
		public Bond_bridgeContext bond_bridge() {
			return getRuleContext(Bond_bridgeContext.class,0);
		}
		public Bond_clag_idContext bond_clag_id() {
			return getRuleContext(Bond_clag_idContext.class,0);
		}
		public Bond_ip_addressContext bond_ip_address() {
			return getRuleContext(Bond_ip_addressContext.class,0);
		}
		public Bond_mtuContext bond_mtu() {
			return getRuleContext(Bond_mtuContext.class,0);
		}
		public Bond_vrfContext bond_vrf() {
			return getRuleContext(Bond_vrfContext.class,0);
		}
		public Stp_commonContext stp_common() {
			return getRuleContext(Stp_commonContext.class,0);
		}
		public A_bondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_bond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterA_bond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitA_bond(this);
		}
	}

	public final A_bondContext a_bond() throws RecognitionException {
		A_bondContext _localctx = new A_bondContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_a_bond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(BOND);
			setState(379);
			((A_bondContext)_localctx).bonds = glob();
			setState(387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOND:
				{
				setState(380);
				bond_bond();
				}
				break;
			case BRIDGE:
				{
				setState(381);
				bond_bridge();
				}
				break;
			case CLAG:
				{
				setState(382);
				bond_clag_id();
				}
				break;
			case IP:
				{
				setState(383);
				bond_ip_address();
				}
				break;
			case MTU:
				{
				setState(384);
				bond_mtu();
				}
				break;
			case VRF:
				{
				setState(385);
				bond_vrf();
				}
				break;
			case STP:
				{
				setState(386);
				stp_common();
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

	public static class Bond_bondContext extends ParserRuleContext {
		public TerminalNode BOND() { return getToken(CumulusNcluParser.BOND, 0); }
		public Bobo_lacp_bypass_allowContext bobo_lacp_bypass_allow() {
			return getRuleContext(Bobo_lacp_bypass_allowContext.class,0);
		}
		public Bobo_slavesContext bobo_slaves() {
			return getRuleContext(Bobo_slavesContext.class,0);
		}
		public Bond_bondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bond_bond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterBond_bond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitBond_bond(this);
		}
	}

	public final Bond_bondContext bond_bond() throws RecognitionException {
		Bond_bondContext _localctx = new Bond_bondContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bond_bond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(BOND);
			setState(392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LACP_BYPASS_ALLOW:
				{
				setState(390);
				bobo_lacp_bypass_allow();
				}
				break;
			case SLAVES:
				{
				setState(391);
				bobo_slaves();
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

	public static class Bobo_lacp_bypass_allowContext extends ParserRuleContext {
		public TerminalNode LACP_BYPASS_ALLOW() { return getToken(CumulusNcluParser.LACP_BYPASS_ALLOW, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Bobo_lacp_bypass_allowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bobo_lacp_bypass_allow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterBobo_lacp_bypass_allow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitBobo_lacp_bypass_allow(this);
		}
	}

	public final Bobo_lacp_bypass_allowContext bobo_lacp_bypass_allow() throws RecognitionException {
		Bobo_lacp_bypass_allowContext _localctx = new Bobo_lacp_bypass_allowContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bobo_lacp_bypass_allow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(LACP_BYPASS_ALLOW);
			setState(395);
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

	public static class Bobo_slavesContext extends ParserRuleContext {
		public GlobContext slaves;
		public TerminalNode SLAVES() { return getToken(CumulusNcluParser.SLAVES, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public GlobContext glob() {
			return getRuleContext(GlobContext.class,0);
		}
		public Bobo_slavesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bobo_slaves; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterBobo_slaves(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitBobo_slaves(this);
		}
	}

	public final Bobo_slavesContext bobo_slaves() throws RecognitionException {
		Bobo_slavesContext _localctx = new Bobo_slavesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bobo_slaves);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(SLAVES);
			setState(398);
			((Bobo_slavesContext)_localctx).slaves = glob();
			setState(399);
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

	public static class Bond_bridgeContext extends ParserRuleContext {
		public TerminalNode BRIDGE() { return getToken(CumulusNcluParser.BRIDGE, 0); }
		public Bob_accessContext bob_access() {
			return getRuleContext(Bob_accessContext.class,0);
		}
		public Bob_learningContext bob_learning() {
			return getRuleContext(Bob_learningContext.class,0);
		}
		public Bob_pvidContext bob_pvid() {
			return getRuleContext(Bob_pvidContext.class,0);
		}
		public Bob_vidsContext bob_vids() {
			return getRuleContext(Bob_vidsContext.class,0);
		}
		public Bond_bridgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bond_bridge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterBond_bridge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitBond_bridge(this);
		}
	}

	public final Bond_bridgeContext bond_bridge() throws RecognitionException {
		Bond_bridgeContext _localctx = new Bond_bridgeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bond_bridge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(BRIDGE);
			setState(406);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACCESS:
				{
				setState(402);
				bob_access();
				}
				break;
			case LEARNING:
				{
				setState(403);
				bob_learning();
				}
				break;
			case PVID:
				{
				setState(404);
				bob_pvid();
				}
				break;
			case VIDS:
				{
				setState(405);
				bob_vids();
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

	public static class Bob_accessContext extends ParserRuleContext {
		public Vlan_idContext vlan;
		public TerminalNode ACCESS() { return getToken(CumulusNcluParser.ACCESS, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Vlan_idContext vlan_id() {
			return getRuleContext(Vlan_idContext.class,0);
		}
		public Bob_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bob_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterBob_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitBob_access(this);
		}
	}

	public final Bob_accessContext bob_access() throws RecognitionException {
		Bob_accessContext _localctx = new Bob_accessContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bob_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(ACCESS);
			setState(409);
			((Bob_accessContext)_localctx).vlan = vlan_id();
			setState(410);
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

	public static class Bob_learningContext extends ParserRuleContext {
		public TerminalNode LEARNING() { return getToken(CumulusNcluParser.LEARNING, 0); }
		public TerminalNode OFF() { return getToken(CumulusNcluParser.OFF, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Bob_learningContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bob_learning; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterBob_learning(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitBob_learning(this);
		}
	}

	public final Bob_learningContext bob_learning() throws RecognitionException {
		Bob_learningContext _localctx = new Bob_learningContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bob_learning);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(LEARNING);
			setState(413);
			match(OFF);
			setState(414);
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

	public static class Bob_pvidContext extends ParserRuleContext {
		public Vlan_idContext id;
		public TerminalNode PVID() { return getToken(CumulusNcluParser.PVID, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Vlan_idContext vlan_id() {
			return getRuleContext(Vlan_idContext.class,0);
		}
		public Bob_pvidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bob_pvid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterBob_pvid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitBob_pvid(this);
		}
	}

	public final Bob_pvidContext bob_pvid() throws RecognitionException {
		Bob_pvidContext _localctx = new Bob_pvidContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bob_pvid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(PVID);
			setState(417);
			((Bob_pvidContext)_localctx).id = vlan_id();
			setState(418);
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

	public static class Bob_vidsContext extends ParserRuleContext {
		public Vlan_range_setContext vlans;
		public TerminalNode VIDS() { return getToken(CumulusNcluParser.VIDS, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Vlan_range_setContext vlan_range_set() {
			return getRuleContext(Vlan_range_setContext.class,0);
		}
		public Bob_vidsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bob_vids; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterBob_vids(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitBob_vids(this);
		}
	}

	public final Bob_vidsContext bob_vids() throws RecognitionException {
		Bob_vidsContext _localctx = new Bob_vidsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bob_vids);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(VIDS);
			setState(421);
			((Bob_vidsContext)_localctx).vlans = vlan_range_set();
			setState(422);
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

	public static class Bond_clag_idContext extends ParserRuleContext {
		public Uint16Context id;
		public TerminalNode CLAG() { return getToken(CumulusNcluParser.CLAG, 0); }
		public TerminalNode ID() { return getToken(CumulusNcluParser.ID, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Uint16Context uint16() {
			return getRuleContext(Uint16Context.class,0);
		}
		public Bond_clag_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bond_clag_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterBond_clag_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitBond_clag_id(this);
		}
	}

	public final Bond_clag_idContext bond_clag_id() throws RecognitionException {
		Bond_clag_idContext _localctx = new Bond_clag_idContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bond_clag_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(CLAG);
			setState(425);
			match(ID);
			setState(426);
			((Bond_clag_idContext)_localctx).id = uint16();
			setState(427);
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

	public static class Bond_ip_addressContext extends ParserRuleContext {
		public Interface_addressContext address;
		public TerminalNode IP() { return getToken(CumulusNcluParser.IP, 0); }
		public TerminalNode ADDRESS() { return getToken(CumulusNcluParser.ADDRESS, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Interface_addressContext interface_address() {
			return getRuleContext(Interface_addressContext.class,0);
		}
		public Bond_ip_addressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bond_ip_address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterBond_ip_address(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitBond_ip_address(this);
		}
	}

	public final Bond_ip_addressContext bond_ip_address() throws RecognitionException {
		Bond_ip_addressContext _localctx = new Bond_ip_addressContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_bond_ip_address);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(IP);
			setState(430);
			match(ADDRESS);
			setState(431);
			((Bond_ip_addressContext)_localctx).address = interface_address();
			setState(432);
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

	public static class Bond_mtuContext extends ParserRuleContext {
		public Uint16Context mtu;
		public TerminalNode MTU() { return getToken(CumulusNcluParser.MTU, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Uint16Context uint16() {
			return getRuleContext(Uint16Context.class,0);
		}
		public Bond_mtuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bond_mtu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterBond_mtu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitBond_mtu(this);
		}
	}

	public final Bond_mtuContext bond_mtu() throws RecognitionException {
		Bond_mtuContext _localctx = new Bond_mtuContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_bond_mtu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(MTU);
			setState(435);
			((Bond_mtuContext)_localctx).mtu = uint16();
			setState(436);
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

	public static class Bond_vrfContext extends ParserRuleContext {
		public WordContext name;
		public TerminalNode VRF() { return getToken(CumulusNcluParser.VRF, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public Bond_vrfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bond_vrf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterBond_vrf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitBond_vrf(this);
		}
	}

	public final Bond_vrfContext bond_vrf() throws RecognitionException {
		Bond_vrfContext _localctx = new Bond_vrfContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bond_vrf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(VRF);
			setState(439);
			((Bond_vrfContext)_localctx).name = word();
			setState(440);
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

	public static class A_bridgeContext extends ParserRuleContext {
		public TerminalNode BRIDGE() { return getToken(CumulusNcluParser.BRIDGE, 0); }
		public Bridge_bridgeContext bridge_bridge() {
			return getRuleContext(Bridge_bridgeContext.class,0);
		}
		public A_bridgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_bridge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterA_bridge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitA_bridge(this);
		}
	}

	public final A_bridgeContext a_bridge() throws RecognitionException {
		A_bridgeContext _localctx = new A_bridgeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_a_bridge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(BRIDGE);
			setState(443);
			bridge_bridge();
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

	public static class Bridge_bridgeContext extends ParserRuleContext {
		public TerminalNode BRIDGE() { return getToken(CumulusNcluParser.BRIDGE, 0); }
		public Brbr_portsContext brbr_ports() {
			return getRuleContext(Brbr_portsContext.class,0);
		}
		public Brbr_pvidContext brbr_pvid() {
			return getRuleContext(Brbr_pvidContext.class,0);
		}
		public Brbr_vidsContext brbr_vids() {
			return getRuleContext(Brbr_vidsContext.class,0);
		}
		public Brbr_vlan_awareContext brbr_vlan_aware() {
			return getRuleContext(Brbr_vlan_awareContext.class,0);
		}
		public Bridge_bridgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bridge_bridge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterBridge_bridge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitBridge_bridge(this);
		}
	}

	public final Bridge_bridgeContext bridge_bridge() throws RecognitionException {
		Bridge_bridgeContext _localctx = new Bridge_bridgeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_bridge_bridge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(BRIDGE);
			setState(450);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PORTS:
				{
				setState(446);
				brbr_ports();
				}
				break;
			case PVID:
				{
				setState(447);
				brbr_pvid();
				}
				break;
			case VIDS:
				{
				setState(448);
				brbr_vids();
				}
				break;
			case VLAN_AWARE:
				{
				setState(449);
				brbr_vlan_aware();
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

	public static class Brbr_portsContext extends ParserRuleContext {
		public GlobContext ports;
		public TerminalNode PORTS() { return getToken(CumulusNcluParser.PORTS, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public GlobContext glob() {
			return getRuleContext(GlobContext.class,0);
		}
		public Brbr_portsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brbr_ports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterBrbr_ports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitBrbr_ports(this);
		}
	}

	public final Brbr_portsContext brbr_ports() throws RecognitionException {
		Brbr_portsContext _localctx = new Brbr_portsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_brbr_ports);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(PORTS);
			setState(453);
			((Brbr_portsContext)_localctx).ports = glob();
			setState(454);
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

	public static class Brbr_pvidContext extends ParserRuleContext {
		public Vlan_idContext pvid;
		public TerminalNode PVID() { return getToken(CumulusNcluParser.PVID, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Vlan_idContext vlan_id() {
			return getRuleContext(Vlan_idContext.class,0);
		}
		public Brbr_pvidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brbr_pvid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterBrbr_pvid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitBrbr_pvid(this);
		}
	}

	public final Brbr_pvidContext brbr_pvid() throws RecognitionException {
		Brbr_pvidContext _localctx = new Brbr_pvidContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_brbr_pvid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(PVID);
			setState(457);
			((Brbr_pvidContext)_localctx).pvid = vlan_id();
			setState(458);
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

	public static class Brbr_vidsContext extends ParserRuleContext {
		public Range_setContext ids;
		public TerminalNode VIDS() { return getToken(CumulusNcluParser.VIDS, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Range_setContext range_set() {
			return getRuleContext(Range_setContext.class,0);
		}
		public Brbr_vidsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brbr_vids; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterBrbr_vids(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitBrbr_vids(this);
		}
	}

	public final Brbr_vidsContext brbr_vids() throws RecognitionException {
		Brbr_vidsContext _localctx = new Brbr_vidsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_brbr_vids);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(VIDS);
			setState(461);
			((Brbr_vidsContext)_localctx).ids = range_set();
			setState(462);
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

	public static class Brbr_vlan_awareContext extends ParserRuleContext {
		public TerminalNode VLAN_AWARE() { return getToken(CumulusNcluParser.VLAN_AWARE, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Brbr_vlan_awareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brbr_vlan_aware; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterBrbr_vlan_aware(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitBrbr_vlan_aware(this);
		}
	}

	public final Brbr_vlan_awareContext brbr_vlan_aware() throws RecognitionException {
		Brbr_vlan_awareContext _localctx = new Brbr_vlan_awareContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_brbr_vlan_aware);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(VLAN_AWARE);
			setState(465);
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

	public static class A_dnsContext extends ParserRuleContext {
		public TerminalNode DNS() { return getToken(CumulusNcluParser.DNS, 0); }
		public Dns_nameserverContext dns_nameserver() {
			return getRuleContext(Dns_nameserverContext.class,0);
		}
		public A_dnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_dns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterA_dns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitA_dns(this);
		}
	}

	public final A_dnsContext a_dns() throws RecognitionException {
		A_dnsContext _localctx = new A_dnsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_a_dns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(DNS);
			setState(468);
			dns_nameserver();
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

	public static class Dns_nameserverContext extends ParserRuleContext {
		public TerminalNode NAMESERVER() { return getToken(CumulusNcluParser.NAMESERVER, 0); }
		public Dn4Context dn4() {
			return getRuleContext(Dn4Context.class,0);
		}
		public Dn6Context dn6() {
			return getRuleContext(Dn6Context.class,0);
		}
		public Dns_nameserverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dns_nameserver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterDns_nameserver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitDns_nameserver(this);
		}
	}

	public final Dns_nameserverContext dns_nameserver() throws RecognitionException {
		Dns_nameserverContext _localctx = new Dns_nameserverContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_dns_nameserver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(NAMESERVER);
			setState(473);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IPV4:
				{
				setState(471);
				dn4();
				}
				break;
			case IPV6:
				{
				setState(472);
				dn6();
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

	public static class Dn4Context extends ParserRuleContext {
		public Ip_addressContext address;
		public TerminalNode IPV4() { return getToken(CumulusNcluParser.IPV4, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Ip_addressContext ip_address() {
			return getRuleContext(Ip_addressContext.class,0);
		}
		public Dn4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dn4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterDn4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitDn4(this);
		}
	}

	public final Dn4Context dn4() throws RecognitionException {
		Dn4Context _localctx = new Dn4Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_dn4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(IPV4);
			setState(476);
			((Dn4Context)_localctx).address = ip_address();
			setState(477);
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

	public static class Dn6Context extends ParserRuleContext {
		public Ipv6_addressContext address6;
		public TerminalNode IPV6() { return getToken(CumulusNcluParser.IPV6, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Ipv6_addressContext ipv6_address() {
			return getRuleContext(Ipv6_addressContext.class,0);
		}
		public Dn6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dn6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterDn6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitDn6(this);
		}
	}

	public final Dn6Context dn6() throws RecognitionException {
		Dn6Context _localctx = new Dn6Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_dn6);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(IPV6);
			setState(480);
			((Dn6Context)_localctx).address6 = ipv6_address();
			setState(481);
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

	public static class A_dot1xContext extends ParserRuleContext {
		public TerminalNode DOT1X() { return getToken(CumulusNcluParser.DOT1X, 0); }
		public Null_rest_of_lineContext null_rest_of_line() {
			return getRuleContext(Null_rest_of_lineContext.class,0);
		}
		public A_dot1xContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_dot1x; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterA_dot1x(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitA_dot1x(this);
		}
	}

	public final A_dot1xContext a_dot1x() throws RecognitionException {
		A_dot1xContext _localctx = new A_dot1xContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_a_dot1x);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(DOT1X);
			setState(484);
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

	public static class A_hostnameContext extends ParserRuleContext {
		public WordContext hostname;
		public TerminalNode HOSTNAME() { return getToken(CumulusNcluParser.HOSTNAME, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public A_hostnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_hostname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterA_hostname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitA_hostname(this);
		}
	}

	public final A_hostnameContext a_hostname() throws RecognitionException {
		A_hostnameContext _localctx = new A_hostnameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_a_hostname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(HOSTNAME);
			setState(487);
			((A_hostnameContext)_localctx).hostname = word();
			setState(488);
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

	public static class A_loopbackContext extends ParserRuleContext {
		public TerminalNode LOOPBACK() { return getToken(CumulusNcluParser.LOOPBACK, 0); }
		public TerminalNode LO() { return getToken(CumulusNcluParser.LO, 0); }
		public L_clagContext l_clag() {
			return getRuleContext(L_clagContext.class,0);
		}
		public L_ip_addressContext l_ip_address() {
			return getRuleContext(L_ip_addressContext.class,0);
		}
		public L_vxlanContext l_vxlan() {
			return getRuleContext(L_vxlanContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public A_loopbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_loopback; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterA_loopback(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitA_loopback(this);
		}
	}

	public final A_loopbackContext a_loopback() throws RecognitionException {
		A_loopbackContext _localctx = new A_loopbackContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_a_loopback);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(LOOPBACK);
			setState(491);
			match(LO);
			setState(496);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLAG:
				{
				setState(492);
				l_clag();
				}
				break;
			case IP:
				{
				setState(493);
				l_ip_address();
				}
				break;
			case VXLAN:
				{
				setState(494);
				l_vxlan();
				}
				break;
			case NEWLINE:
				{
				setState(495);
				match(NEWLINE);
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

	public static class L_clagContext extends ParserRuleContext {
		public TerminalNode CLAG() { return getToken(CumulusNcluParser.CLAG, 0); }
		public Lc_vxlan_anycast_ipContext lc_vxlan_anycast_ip() {
			return getRuleContext(Lc_vxlan_anycast_ipContext.class,0);
		}
		public L_clagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_clag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterL_clag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitL_clag(this);
		}
	}

	public final L_clagContext l_clag() throws RecognitionException {
		L_clagContext _localctx = new L_clagContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_l_clag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(CLAG);
			setState(499);
			lc_vxlan_anycast_ip();
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

	public static class Lc_vxlan_anycast_ipContext extends ParserRuleContext {
		public Ip_addressContext ip;
		public TerminalNode VXLAN_ANYCAST_IP() { return getToken(CumulusNcluParser.VXLAN_ANYCAST_IP, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Ip_addressContext ip_address() {
			return getRuleContext(Ip_addressContext.class,0);
		}
		public Lc_vxlan_anycast_ipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lc_vxlan_anycast_ip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterLc_vxlan_anycast_ip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitLc_vxlan_anycast_ip(this);
		}
	}

	public final Lc_vxlan_anycast_ipContext lc_vxlan_anycast_ip() throws RecognitionException {
		Lc_vxlan_anycast_ipContext _localctx = new Lc_vxlan_anycast_ipContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_lc_vxlan_anycast_ip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(VXLAN_ANYCAST_IP);
			setState(502);
			((Lc_vxlan_anycast_ipContext)_localctx).ip = ip_address();
			setState(503);
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

	public static class L_ip_addressContext extends ParserRuleContext {
		public Interface_addressContext address;
		public TerminalNode IP() { return getToken(CumulusNcluParser.IP, 0); }
		public TerminalNode ADDRESS() { return getToken(CumulusNcluParser.ADDRESS, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Interface_addressContext interface_address() {
			return getRuleContext(Interface_addressContext.class,0);
		}
		public L_ip_addressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_ip_address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterL_ip_address(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitL_ip_address(this);
		}
	}

	public final L_ip_addressContext l_ip_address() throws RecognitionException {
		L_ip_addressContext _localctx = new L_ip_addressContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_l_ip_address);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(IP);
			setState(506);
			match(ADDRESS);
			setState(507);
			((L_ip_addressContext)_localctx).address = interface_address();
			setState(508);
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

	public static class L_vxlanContext extends ParserRuleContext {
		public TerminalNode VXLAN() { return getToken(CumulusNcluParser.VXLAN, 0); }
		public Lv_local_tunnelipContext lv_local_tunnelip() {
			return getRuleContext(Lv_local_tunnelipContext.class,0);
		}
		public L_vxlanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_vxlan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterL_vxlan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitL_vxlan(this);
		}
	}

	public final L_vxlanContext l_vxlan() throws RecognitionException {
		L_vxlanContext _localctx = new L_vxlanContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_l_vxlan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(VXLAN);
			{
			setState(511);
			lv_local_tunnelip();
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

	public static class Lv_local_tunnelipContext extends ParserRuleContext {
		public Ip_addressContext ip;
		public TerminalNode LOCAL_TUNNELIP() { return getToken(CumulusNcluParser.LOCAL_TUNNELIP, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Ip_addressContext ip_address() {
			return getRuleContext(Ip_addressContext.class,0);
		}
		public Lv_local_tunnelipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lv_local_tunnelip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterLv_local_tunnelip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitLv_local_tunnelip(this);
		}
	}

	public final Lv_local_tunnelipContext lv_local_tunnelip() throws RecognitionException {
		Lv_local_tunnelipContext _localctx = new Lv_local_tunnelipContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_lv_local_tunnelip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			match(LOCAL_TUNNELIP);
			setState(514);
			((Lv_local_tunnelipContext)_localctx).ip = ip_address();
			setState(515);
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

	public static class A_ptpContext extends ParserRuleContext {
		public TerminalNode PTP() { return getToken(CumulusNcluParser.PTP, 0); }
		public Null_rest_of_lineContext null_rest_of_line() {
			return getRuleContext(Null_rest_of_lineContext.class,0);
		}
		public A_ptpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_ptp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterA_ptp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitA_ptp(this);
		}
	}

	public final A_ptpContext a_ptp() throws RecognitionException {
		A_ptpContext _localctx = new A_ptpContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_a_ptp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(PTP);
			setState(518);
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

	public static class A_snmp_serverContext extends ParserRuleContext {
		public TerminalNode SNMP_SERVER() { return getToken(CumulusNcluParser.SNMP_SERVER, 0); }
		public Null_rest_of_lineContext null_rest_of_line() {
			return getRuleContext(Null_rest_of_lineContext.class,0);
		}
		public A_snmp_serverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_snmp_server; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterA_snmp_server(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitA_snmp_server(this);
		}
	}

	public final A_snmp_serverContext a_snmp_server() throws RecognitionException {
		A_snmp_serverContext _localctx = new A_snmp_serverContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_a_snmp_server);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(SNMP_SERVER);
			setState(521);
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

	public static class A_timeContext extends ParserRuleContext {
		public TerminalNode TIME() { return getToken(CumulusNcluParser.TIME, 0); }
		public T_ntpContext t_ntp() {
			return getRuleContext(T_ntpContext.class,0);
		}
		public T_zoneContext t_zone() {
			return getRuleContext(T_zoneContext.class,0);
		}
		public A_timeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterA_time(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitA_time(this);
		}
	}

	public final A_timeContext a_time() throws RecognitionException {
		A_timeContext _localctx = new A_timeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_a_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(TIME);
			setState(526);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NTP:
				{
				setState(524);
				t_ntp();
				}
				break;
			case ZONE:
				{
				setState(525);
				t_zone();
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

	public static class T_ntpContext extends ParserRuleContext {
		public TerminalNode NTP() { return getToken(CumulusNcluParser.NTP, 0); }
		public Tn_serverContext tn_server() {
			return getRuleContext(Tn_serverContext.class,0);
		}
		public Tn_sourceContext tn_source() {
			return getRuleContext(Tn_sourceContext.class,0);
		}
		public T_ntpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_ntp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterT_ntp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitT_ntp(this);
		}
	}

	public final T_ntpContext t_ntp() throws RecognitionException {
		T_ntpContext _localctx = new T_ntpContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_t_ntp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			match(NTP);
			setState(531);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SERVER:
				{
				setState(529);
				tn_server();
				}
				break;
			case SOURCE:
				{
				setState(530);
				tn_source();
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

	public static class Tn_serverContext extends ParserRuleContext {
		public WordContext server;
		public TerminalNode SERVER() { return getToken(CumulusNcluParser.SERVER, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public TerminalNode IBURST() { return getToken(CumulusNcluParser.IBURST, 0); }
		public Tn_serverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tn_server; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterTn_server(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitTn_server(this);
		}
	}

	public final Tn_serverContext tn_server() throws RecognitionException {
		Tn_serverContext _localctx = new Tn_serverContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_tn_server);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			match(SERVER);
			setState(534);
			((Tn_serverContext)_localctx).server = word();
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IBURST) {
				{
				setState(535);
				match(IBURST);
				}
			}

			setState(538);
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

	public static class Tn_sourceContext extends ParserRuleContext {
		public WordContext source;
		public TerminalNode SOURCE() { return getToken(CumulusNcluParser.SOURCE, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public Tn_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tn_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterTn_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitTn_source(this);
		}
	}

	public final Tn_sourceContext tn_source() throws RecognitionException {
		Tn_sourceContext _localctx = new Tn_sourceContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_tn_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(SOURCE);
			setState(541);
			((Tn_sourceContext)_localctx).source = word();
			setState(542);
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

	public static class T_zoneContext extends ParserRuleContext {
		public WordContext zone;
		public TerminalNode ZONE() { return getToken(CumulusNcluParser.ZONE, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public T_zoneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_zone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterT_zone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitT_zone(this);
		}
	}

	public final T_zoneContext t_zone() throws RecognitionException {
		T_zoneContext _localctx = new T_zoneContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_t_zone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(ZONE);
			setState(545);
			((T_zoneContext)_localctx).zone = word();
			setState(546);
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

	public static class A_vlanContext extends ParserRuleContext {
		public Uint16Context suffix;
		public Range_setContext suffixes;
		public TerminalNode VLAN() { return getToken(CumulusNcluParser.VLAN, 0); }
		public V_vlan_idContext v_vlan_id() {
			return getRuleContext(V_vlan_idContext.class,0);
		}
		public Uint16Context uint16() {
			return getRuleContext(Uint16Context.class,0);
		}
		public Range_setContext range_set() {
			return getRuleContext(Range_setContext.class,0);
		}
		public V_aliasContext v_alias() {
			return getRuleContext(V_aliasContext.class,0);
		}
		public V_hw_addressContext v_hw_address() {
			return getRuleContext(V_hw_addressContext.class,0);
		}
		public V_ip_addressContext v_ip_address() {
			return getRuleContext(V_ip_addressContext.class,0);
		}
		public V_ip_address_virtualContext v_ip_address_virtual() {
			return getRuleContext(V_ip_address_virtualContext.class,0);
		}
		public V_vlan_raw_deviceContext v_vlan_raw_device() {
			return getRuleContext(V_vlan_raw_deviceContext.class,0);
		}
		public V_vrfContext v_vrf() {
			return getRuleContext(V_vrfContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public A_vlanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_vlan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterA_vlan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitA_vlan(this);
		}
	}

	public final A_vlanContext a_vlan() throws RecognitionException {
		A_vlanContext _localctx = new A_vlanContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_a_vlan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(VLAN);
			setState(562);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				{
				setState(549);
				((A_vlanContext)_localctx).suffix = uint16();
				setState(550);
				v_vlan_id();
				}
				}
				break;
			case 2:
				{
				{
				setState(552);
				((A_vlanContext)_localctx).suffixes = range_set();
				setState(560);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(553);
					v_alias();
					}
					break;
				case 2:
					{
					setState(554);
					v_hw_address();
					}
					break;
				case 3:
					{
					setState(555);
					v_ip_address();
					}
					break;
				case 4:
					{
					setState(556);
					v_ip_address_virtual();
					}
					break;
				case 5:
					{
					setState(557);
					v_vlan_raw_device();
					}
					break;
				case 6:
					{
					setState(558);
					v_vrf();
					}
					break;
				case 7:
					{
					setState(559);
					match(NEWLINE);
					}
					break;
				}
				}
				}
				break;
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

	public static class V_aliasContext extends ParserRuleContext {
		public Token alias;
		public TerminalNode ALIAS() { return getToken(CumulusNcluParser.ALIAS, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public TerminalNode ALIAS_BODY() { return getToken(CumulusNcluParser.ALIAS_BODY, 0); }
		public V_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterV_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitV_alias(this);
		}
	}

	public final V_aliasContext v_alias() throws RecognitionException {
		V_aliasContext _localctx = new V_aliasContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_v_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			match(ALIAS);
			setState(565);
			((V_aliasContext)_localctx).alias = match(ALIAS_BODY);
			setState(566);
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

	public static class V_hw_addressContext extends ParserRuleContext {
		public Mac_addressContext mac;
		public TerminalNode HWADDRESS() { return getToken(CumulusNcluParser.HWADDRESS, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Mac_addressContext mac_address() {
			return getRuleContext(Mac_addressContext.class,0);
		}
		public V_hw_addressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v_hw_address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterV_hw_address(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitV_hw_address(this);
		}
	}

	public final V_hw_addressContext v_hw_address() throws RecognitionException {
		V_hw_addressContext _localctx = new V_hw_addressContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_v_hw_address);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			match(HWADDRESS);
			setState(569);
			((V_hw_addressContext)_localctx).mac = mac_address();
			setState(570);
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

	public static class V_ip_addressContext extends ParserRuleContext {
		public Interface_addressContext address;
		public TerminalNode IP() { return getToken(CumulusNcluParser.IP, 0); }
		public TerminalNode ADDRESS() { return getToken(CumulusNcluParser.ADDRESS, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Interface_addressContext interface_address() {
			return getRuleContext(Interface_addressContext.class,0);
		}
		public V_ip_addressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v_ip_address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterV_ip_address(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitV_ip_address(this);
		}
	}

	public final V_ip_addressContext v_ip_address() throws RecognitionException {
		V_ip_addressContext _localctx = new V_ip_addressContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_v_ip_address);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			match(IP);
			setState(573);
			match(ADDRESS);
			setState(574);
			((V_ip_addressContext)_localctx).address = interface_address();
			setState(575);
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

	public static class V_ip_address_virtualContext extends ParserRuleContext {
		public Mac_addressContext mac;
		public Interface_addressContext address;
		public TerminalNode IP() { return getToken(CumulusNcluParser.IP, 0); }
		public TerminalNode ADDRESS_VIRTUAL() { return getToken(CumulusNcluParser.ADDRESS_VIRTUAL, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Mac_addressContext mac_address() {
			return getRuleContext(Mac_addressContext.class,0);
		}
		public Interface_addressContext interface_address() {
			return getRuleContext(Interface_addressContext.class,0);
		}
		public V_ip_address_virtualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v_ip_address_virtual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterV_ip_address_virtual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitV_ip_address_virtual(this);
		}
	}

	public final V_ip_address_virtualContext v_ip_address_virtual() throws RecognitionException {
		V_ip_address_virtualContext _localctx = new V_ip_address_virtualContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_v_ip_address_virtual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(IP);
			setState(578);
			match(ADDRESS_VIRTUAL);
			setState(579);
			((V_ip_address_virtualContext)_localctx).mac = mac_address();
			setState(580);
			((V_ip_address_virtualContext)_localctx).address = interface_address();
			setState(581);
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

	public static class V_vlan_idContext extends ParserRuleContext {
		public Vlan_idContext id;
		public TerminalNode VLAN_ID() { return getToken(CumulusNcluParser.VLAN_ID, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Vlan_idContext vlan_id() {
			return getRuleContext(Vlan_idContext.class,0);
		}
		public V_vlan_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v_vlan_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterV_vlan_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitV_vlan_id(this);
		}
	}

	public final V_vlan_idContext v_vlan_id() throws RecognitionException {
		V_vlan_idContext _localctx = new V_vlan_idContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_v_vlan_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(VLAN_ID);
			setState(584);
			((V_vlan_idContext)_localctx).id = vlan_id();
			setState(585);
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

	public static class V_vlan_raw_deviceContext extends ParserRuleContext {
		public Token device;
		public TerminalNode VLAN_RAW_DEVICE() { return getToken(CumulusNcluParser.VLAN_RAW_DEVICE, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public TerminalNode BRIDGE() { return getToken(CumulusNcluParser.BRIDGE, 0); }
		public V_vlan_raw_deviceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v_vlan_raw_device; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterV_vlan_raw_device(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitV_vlan_raw_device(this);
		}
	}

	public final V_vlan_raw_deviceContext v_vlan_raw_device() throws RecognitionException {
		V_vlan_raw_deviceContext _localctx = new V_vlan_raw_deviceContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_v_vlan_raw_device);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(VLAN_RAW_DEVICE);
			setState(588);
			((V_vlan_raw_deviceContext)_localctx).device = match(BRIDGE);
			setState(589);
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

	public static class V_vrfContext extends ParserRuleContext {
		public WordContext name;
		public TerminalNode VRF() { return getToken(CumulusNcluParser.VRF, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public V_vrfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v_vrf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterV_vrf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitV_vrf(this);
		}
	}

	public final V_vrfContext v_vrf() throws RecognitionException {
		V_vrfContext _localctx = new V_vrfContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_v_vrf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(VRF);
			setState(592);
			((V_vrfContext)_localctx).name = word();
			setState(593);
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

	public static class A_vrfContext extends ParserRuleContext {
		public GlobContext names;
		public TerminalNode VRF() { return getToken(CumulusNcluParser.VRF, 0); }
		public GlobContext glob() {
			return getRuleContext(GlobContext.class,0);
		}
		public Vrf_ip_addressContext vrf_ip_address() {
			return getRuleContext(Vrf_ip_addressContext.class,0);
		}
		public Vrf_vniContext vrf_vni() {
			return getRuleContext(Vrf_vniContext.class,0);
		}
		public Vrf_vrf_tableContext vrf_vrf_table() {
			return getRuleContext(Vrf_vrf_tableContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public A_vrfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_vrf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterA_vrf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitA_vrf(this);
		}
	}

	public final A_vrfContext a_vrf() throws RecognitionException {
		A_vrfContext _localctx = new A_vrfContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_a_vrf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			match(VRF);
			setState(596);
			((A_vrfContext)_localctx).names = glob();
			setState(601);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IP:
				{
				setState(597);
				vrf_ip_address();
				}
				break;
			case VNI:
				{
				setState(598);
				vrf_vni();
				}
				break;
			case VRF_TABLE:
				{
				setState(599);
				vrf_vrf_table();
				}
				break;
			case NEWLINE:
				{
				setState(600);
				match(NEWLINE);
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

	public static class Vrf_ip_addressContext extends ParserRuleContext {
		public Interface_addressContext address;
		public TerminalNode IP() { return getToken(CumulusNcluParser.IP, 0); }
		public TerminalNode ADDRESS() { return getToken(CumulusNcluParser.ADDRESS, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Interface_addressContext interface_address() {
			return getRuleContext(Interface_addressContext.class,0);
		}
		public Vrf_ip_addressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vrf_ip_address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterVrf_ip_address(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitVrf_ip_address(this);
		}
	}

	public final Vrf_ip_addressContext vrf_ip_address() throws RecognitionException {
		Vrf_ip_addressContext _localctx = new Vrf_ip_addressContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_vrf_ip_address);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			match(IP);
			setState(604);
			match(ADDRESS);
			setState(605);
			((Vrf_ip_addressContext)_localctx).address = interface_address();
			setState(606);
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

	public static class Vrf_vniContext extends ParserRuleContext {
		public Vni_numberContext vni;
		public TerminalNode VNI() { return getToken(CumulusNcluParser.VNI, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Vni_numberContext vni_number() {
			return getRuleContext(Vni_numberContext.class,0);
		}
		public Vrf_vniContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vrf_vni; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterVrf_vni(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitVrf_vni(this);
		}
	}

	public final Vrf_vniContext vrf_vni() throws RecognitionException {
		Vrf_vniContext _localctx = new Vrf_vniContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_vrf_vni);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(VNI);
			setState(609);
			((Vrf_vniContext)_localctx).vni = vni_number();
			setState(610);
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

	public static class Vrf_vrf_tableContext extends ParserRuleContext {
		public TerminalNode VRF_TABLE() { return getToken(CumulusNcluParser.VRF_TABLE, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public TerminalNode AUTO() { return getToken(CumulusNcluParser.AUTO, 0); }
		public TerminalNode DEC() { return getToken(CumulusNcluParser.DEC, 0); }
		public Vrf_vrf_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vrf_vrf_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterVrf_vrf_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitVrf_vrf_table(this);
		}
	}

	public final Vrf_vrf_tableContext vrf_vrf_table() throws RecognitionException {
		Vrf_vrf_tableContext _localctx = new Vrf_vrf_tableContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_vrf_vrf_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			match(VRF_TABLE);
			setState(613);
			_la = _input.LA(1);
			if ( !(_la==AUTO || _la==DEC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(614);
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

	public static class A_vxlanContext extends ParserRuleContext {
		public GlobContext names;
		public TerminalNode VXLAN() { return getToken(CumulusNcluParser.VXLAN, 0); }
		public GlobContext glob() {
			return getRuleContext(GlobContext.class,0);
		}
		public Vx_bridgeContext vx_bridge() {
			return getRuleContext(Vx_bridgeContext.class,0);
		}
		public Vx_stpContext vx_stp() {
			return getRuleContext(Vx_stpContext.class,0);
		}
		public Vx_vxlanContext vx_vxlan() {
			return getRuleContext(Vx_vxlanContext.class,0);
		}
		public A_vxlanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_vxlan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterA_vxlan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitA_vxlan(this);
		}
	}

	public final A_vxlanContext a_vxlan() throws RecognitionException {
		A_vxlanContext _localctx = new A_vxlanContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_a_vxlan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			match(VXLAN);
			setState(617);
			((A_vxlanContext)_localctx).names = glob();
			setState(621);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BRIDGE:
				{
				setState(618);
				vx_bridge();
				}
				break;
			case STP:
				{
				setState(619);
				vx_stp();
				}
				break;
			case VXLAN:
				{
				setState(620);
				vx_vxlan();
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

	public static class Vx_bridgeContext extends ParserRuleContext {
		public TerminalNode BRIDGE() { return getToken(CumulusNcluParser.BRIDGE, 0); }
		public Vxb_accessContext vxb_access() {
			return getRuleContext(Vxb_accessContext.class,0);
		}
		public Vxb_arp_nd_suppressContext vxb_arp_nd_suppress() {
			return getRuleContext(Vxb_arp_nd_suppressContext.class,0);
		}
		public Vxb_learningContext vxb_learning() {
			return getRuleContext(Vxb_learningContext.class,0);
		}
		public Vx_bridgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vx_bridge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterVx_bridge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitVx_bridge(this);
		}
	}

	public final Vx_bridgeContext vx_bridge() throws RecognitionException {
		Vx_bridgeContext _localctx = new Vx_bridgeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_vx_bridge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			match(BRIDGE);
			setState(627);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACCESS:
				{
				setState(624);
				vxb_access();
				}
				break;
			case ARP_ND_SUPPRESS:
				{
				setState(625);
				vxb_arp_nd_suppress();
				}
				break;
			case LEARNING:
				{
				setState(626);
				vxb_learning();
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

	public static class Vxb_accessContext extends ParserRuleContext {
		public Vlan_idContext vlan;
		public TerminalNode ACCESS() { return getToken(CumulusNcluParser.ACCESS, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Vlan_idContext vlan_id() {
			return getRuleContext(Vlan_idContext.class,0);
		}
		public Vxb_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vxb_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterVxb_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitVxb_access(this);
		}
	}

	public final Vxb_accessContext vxb_access() throws RecognitionException {
		Vxb_accessContext _localctx = new Vxb_accessContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_vxb_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			match(ACCESS);
			setState(630);
			((Vxb_accessContext)_localctx).vlan = vlan_id();
			setState(631);
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

	public static class Vxb_arp_nd_suppressContext extends ParserRuleContext {
		public TerminalNode ARP_ND_SUPPRESS() { return getToken(CumulusNcluParser.ARP_ND_SUPPRESS, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public TerminalNode OFF() { return getToken(CumulusNcluParser.OFF, 0); }
		public TerminalNode ON() { return getToken(CumulusNcluParser.ON, 0); }
		public Vxb_arp_nd_suppressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vxb_arp_nd_suppress; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterVxb_arp_nd_suppress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitVxb_arp_nd_suppress(this);
		}
	}

	public final Vxb_arp_nd_suppressContext vxb_arp_nd_suppress() throws RecognitionException {
		Vxb_arp_nd_suppressContext _localctx = new Vxb_arp_nd_suppressContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_vxb_arp_nd_suppress);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			match(ARP_ND_SUPPRESS);
			setState(634);
			_la = _input.LA(1);
			if ( !(_la==OFF || _la==ON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(635);
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

	public static class Vxb_learningContext extends ParserRuleContext {
		public TerminalNode LEARNING() { return getToken(CumulusNcluParser.LEARNING, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public TerminalNode OFF() { return getToken(CumulusNcluParser.OFF, 0); }
		public TerminalNode ON() { return getToken(CumulusNcluParser.ON, 0); }
		public Vxb_learningContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vxb_learning; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterVxb_learning(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitVxb_learning(this);
		}
	}

	public final Vxb_learningContext vxb_learning() throws RecognitionException {
		Vxb_learningContext _localctx = new Vxb_learningContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_vxb_learning);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			match(LEARNING);
			setState(638);
			_la = _input.LA(1);
			if ( !(_la==OFF || _la==ON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(639);
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

	public static class Vx_stpContext extends ParserRuleContext {
		public TerminalNode STP() { return getToken(CumulusNcluParser.STP, 0); }
		public Vxs_bpduguardContext vxs_bpduguard() {
			return getRuleContext(Vxs_bpduguardContext.class,0);
		}
		public Vxs_portbpdufilterContext vxs_portbpdufilter() {
			return getRuleContext(Vxs_portbpdufilterContext.class,0);
		}
		public Vx_stpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vx_stp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterVx_stp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitVx_stp(this);
		}
	}

	public final Vx_stpContext vx_stp() throws RecognitionException {
		Vx_stpContext _localctx = new Vx_stpContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_vx_stp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			match(STP);
			setState(644);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BPDUGUARD:
				{
				setState(642);
				vxs_bpduguard();
				}
				break;
			case PORTBPDUFILTER:
				{
				setState(643);
				vxs_portbpdufilter();
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

	public static class Vxs_bpduguardContext extends ParserRuleContext {
		public TerminalNode BPDUGUARD() { return getToken(CumulusNcluParser.BPDUGUARD, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Vxs_bpduguardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vxs_bpduguard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterVxs_bpduguard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitVxs_bpduguard(this);
		}
	}

	public final Vxs_bpduguardContext vxs_bpduguard() throws RecognitionException {
		Vxs_bpduguardContext _localctx = new Vxs_bpduguardContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_vxs_bpduguard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			match(BPDUGUARD);
			setState(647);
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

	public static class Vxs_portbpdufilterContext extends ParserRuleContext {
		public TerminalNode PORTBPDUFILTER() { return getToken(CumulusNcluParser.PORTBPDUFILTER, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Vxs_portbpdufilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vxs_portbpdufilter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterVxs_portbpdufilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitVxs_portbpdufilter(this);
		}
	}

	public final Vxs_portbpdufilterContext vxs_portbpdufilter() throws RecognitionException {
		Vxs_portbpdufilterContext _localctx = new Vxs_portbpdufilterContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_vxs_portbpdufilter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			match(PORTBPDUFILTER);
			setState(650);
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

	public static class Vx_vxlanContext extends ParserRuleContext {
		public TerminalNode VXLAN() { return getToken(CumulusNcluParser.VXLAN, 0); }
		public Vxv_idContext vxv_id() {
			return getRuleContext(Vxv_idContext.class,0);
		}
		public Vxv_local_tunnelipContext vxv_local_tunnelip() {
			return getRuleContext(Vxv_local_tunnelipContext.class,0);
		}
		public Vx_vxlanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vx_vxlan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterVx_vxlan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitVx_vxlan(this);
		}
	}

	public final Vx_vxlanContext vx_vxlan() throws RecognitionException {
		Vx_vxlanContext _localctx = new Vx_vxlanContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_vx_vxlan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			match(VXLAN);
			setState(655);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(653);
				vxv_id();
				}
				break;
			case LOCAL_TUNNELIP:
				{
				setState(654);
				vxv_local_tunnelip();
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

	public static class Vxv_idContext extends ParserRuleContext {
		public Vni_numberContext vni;
		public TerminalNode ID() { return getToken(CumulusNcluParser.ID, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Vni_numberContext vni_number() {
			return getRuleContext(Vni_numberContext.class,0);
		}
		public Vxv_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vxv_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterVxv_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitVxv_id(this);
		}
	}

	public final Vxv_idContext vxv_id() throws RecognitionException {
		Vxv_idContext _localctx = new Vxv_idContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_vxv_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			match(ID);
			setState(658);
			((Vxv_idContext)_localctx).vni = vni_number();
			setState(659);
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

	public static class Vxv_local_tunnelipContext extends ParserRuleContext {
		public Ip_addressContext ip;
		public TerminalNode LOCAL_TUNNELIP() { return getToken(CumulusNcluParser.LOCAL_TUNNELIP, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Ip_addressContext ip_address() {
			return getRuleContext(Ip_addressContext.class,0);
		}
		public Vxv_local_tunnelipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vxv_local_tunnelip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterVxv_local_tunnelip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitVxv_local_tunnelip(this);
		}
	}

	public final Vxv_local_tunnelipContext vxv_local_tunnelip() throws RecognitionException {
		Vxv_local_tunnelipContext _localctx = new Vxv_local_tunnelipContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_vxv_local_tunnelip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			match(LOCAL_TUNNELIP);
			setState(662);
			((Vxv_local_tunnelipContext)_localctx).ip = ip_address();
			setState(663);
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

	public static class S_net_add_unrecognizedContext extends ParserRuleContext {
		public TerminalNode NET() { return getToken(CumulusNcluParser.NET, 0); }
		public TerminalNode ADD() { return getToken(CumulusNcluParser.ADD, 0); }
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public Null_rest_of_lineContext null_rest_of_line() {
			return getRuleContext(Null_rest_of_lineContext.class,0);
		}
		public S_net_add_unrecognizedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_net_add_unrecognized; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterS_net_add_unrecognized(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitS_net_add_unrecognized(this);
		}
	}

	public final S_net_add_unrecognizedContext s_net_add_unrecognized() throws RecognitionException {
		S_net_add_unrecognizedContext _localctx = new S_net_add_unrecognizedContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_s_net_add_unrecognized);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(NET);
			setState(666);
			match(ADD);
			setState(667);
			word();
			setState(668);
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

	public static class S_nullContext extends ParserRuleContext {
		public Null_rest_of_lineContext null_rest_of_line() {
			return getRuleContext(Null_rest_of_lineContext.class,0);
		}
		public TerminalNode NET() { return getToken(CumulusNcluParser.NET, 0); }
		public TerminalNode COMMIT() { return getToken(CumulusNcluParser.COMMIT, 0); }
		public TerminalNode DEL() { return getToken(CumulusNcluParser.DEL, 0); }
		public S_nullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_null; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterS_null(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitS_null(this);
		}
	}

	public final S_nullContext s_null() throws RecognitionException {
		S_nullContext _localctx = new S_nullContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_s_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(670);
			match(NET);
			setState(674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(672);
				match(COMMIT);
				}
				break;
			case 3:
				{
				setState(673);
				match(DEL);
				}
				break;
			}
			}
			setState(676);
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

	public static class GlobContext extends ParserRuleContext {
		public List<Glob_range_setContext> glob_range_set() {
			return getRuleContexts(Glob_range_setContext.class);
		}
		public Glob_range_setContext glob_range_set(int i) {
			return getRuleContext(Glob_range_setContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CumulusNcluParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CumulusNcluParser.COMMA, i);
		}
		public GlobContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glob; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterGlob(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitGlob(this);
		}
	}

	public final GlobContext glob() throws RecognitionException {
		GlobContext _localctx = new GlobContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_glob);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			glob_range_set();
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(679);
				match(COMMA);
				setState(680);
				glob_range_set();
				}
				}
				setState(685);
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

	public static class Glob_range_setContext extends ParserRuleContext {
		public Glob_wordContext unnumbered;
		public Numbered_wordContext base_word;
		public Uint32Context first_interval_end;
		public Range_setContext other_numeric_ranges;
		public Glob_wordContext glob_word() {
			return getRuleContext(Glob_wordContext.class,0);
		}
		public Numbered_wordContext numbered_word() {
			return getRuleContext(Numbered_wordContext.class,0);
		}
		public TerminalNode DASH() { return getToken(CumulusNcluParser.DASH, 0); }
		public TerminalNode COMMA() { return getToken(CumulusNcluParser.COMMA, 0); }
		public Uint32Context uint32() {
			return getRuleContext(Uint32Context.class,0);
		}
		public Range_setContext range_set() {
			return getRuleContext(Range_setContext.class,0);
		}
		public Glob_range_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glob_range_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterGlob_range_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitGlob_range_set(this);
		}
	}

	public final Glob_range_setContext glob_range_set() throws RecognitionException {
		Glob_range_setContext _localctx = new Glob_range_setContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_glob_range_set);
		int _la;
		try {
			setState(696);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALIAS_BODY:
			case EXTRA_CONFIGURATION_FOOTER:
			case USERNAME:
			case ACCESS:
			case ACTIVATE:
			case ADD:
			case ADDRESS:
			case ADDRESS_VIRTUAL:
			case ADVERTISE:
			case ADVERTISE_ALL_VNI:
			case ADVERTISE_DEFAULT_GW:
			case AGENTX:
			case ALERTS:
			case ALIAS:
			case ALWAYS_COMPARE_MED:
			case ARP_ND_SUPPRESS:
			case AS_PATH:
			case AUTO:
			case AUTONOMOUS_SYSTEM:
			case BACKUP_IP:
			case BESTPATH:
			case BGP:
			case BOND:
			case BPDUGUARD:
			case BRIDGE:
			case CLAG:
			case COMMIT:
			case CONNECTED:
			case CRITICAL:
			case DATACENTER:
			case DEBUGGING:
			case DEFAULTS:
			case DEL:
			case DENY:
			case DESCRIPTION:
			case DHCP:
			case DNS:
			case DOT1X:
			case EMERGENCIES:
			case ERRORS:
			case EVPN:
			case EXIT_VRF:
			case EXTERNAL:
			case FORWARD:
			case GATEWAY:
			case HOSTNAME:
			case HWADDRESS:
			case IBURST:
			case ID:
			case INFORMATIONAL:
			case INTEGRATED_VTYSH_CONFIG:
			case INTERFACE:
			case INTERNAL:
			case IP:
			case IPV4:
			case IPV6:
			case L2VPN:
			case LACP_BYPASS_ALLOW:
			case LEARNING:
			case LINK:
			case LINKLOCAL:
			case LO:
			case LOCAL_TUNNELIP:
			case LOG:
			case LOOPBACK:
			case MATCH:
			case MSEC:
			case MTU:
			case MULTIPATH_RELAX:
			case NAMESERVER:
			case ND:
			case NEIGHBOR:
			case NETWORK:
			case NET:
			case NO:
			case NOTIFICATIONS:
			case NTP:
			case OFF:
			case ON:
			case PEER_GROUP:
			case PEER_IP:
			case PERMIT:
			case PORTADMINEDGE:
			case PORTAUTOEDGE:
			case PORTBPDUFILTER:
			case PORTNETWORK:
			case PORTRESTROLE:
			case PORTS:
			case PRIORITY:
			case PTP:
			case PVID:
			case RA_INTERVAL:
			case RA_LIFETIME:
			case REDISTRIBUTE:
			case REMOTE_AS:
			case ROUTE:
			case ROUTER:
			case ROUTE_MAP:
			case ROUTE_REFLECTOR_CLIENT:
			case ROUTER_ID:
			case ROUTING:
			case SERVER:
			case SERVICE:
			case SLAVES:
			case SNMP_SERVER:
			case SOURCE:
			case SPEED:
			case STATIC:
			case STP:
			case SUPPRESS_RA:
			case SYS_MAC:
			case SYSLOG:
			case TIME:
			case UNICAST:
			case VIDS:
			case VLAN:
			case VLAN_AWARE:
			case VLAN_ID:
			case VLAN_RAW_DEVICE:
			case VNI:
			case VRF:
			case VRF_TABLE:
			case VXLAN:
			case VXLAN_ANYCAST_IP:
			case WARNINGS:
			case ZONE:
			case EXTRA_CONFIGURATION_HEADER:
			case COMMA:
			case COMMENT_LINE:
			case COMMENT_TAIL:
			case DASH:
			case IP_ADDRESS:
			case IP_PREFIX:
			case IPV6_ADDRESS:
			case IPV6_PREFIX:
			case MAC_ADDRESS:
			case WORD:
			case WS:
			case M_Alias_WS:
			case M_Printf_WS:
			case M_Printf_EXTRA_CONFIGURATION_FOOTER:
			case M_Printf_NEWLINE:
			case M_Printf_USERNAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(686);
				((Glob_range_setContext)_localctx).unnumbered = glob_word();
				}
				break;
			case NUMBERED_WORD:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(687);
				((Glob_range_setContext)_localctx).base_word = numbered_word();
				setState(690);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DASH) {
					{
					setState(688);
					match(DASH);
					setState(689);
					((Glob_range_setContext)_localctx).first_interval_end = uint32();
					}
				}

				setState(694);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(692);
					match(COMMA);
					setState(693);
					((Glob_range_setContext)_localctx).other_numeric_ranges = range_set();
					}
					break;
				}
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

	public static class Glob_wordContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public TerminalNode NUMBERED_WORD() { return getToken(CumulusNcluParser.NUMBERED_WORD, 0); }
		public TerminalNode DEC() { return getToken(CumulusNcluParser.DEC, 0); }
		public Glob_wordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glob_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterGlob_word(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitGlob_word(this);
		}
	}

	public final Glob_wordContext glob_word() throws RecognitionException {
		Glob_wordContext _localctx = new Glob_wordContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_glob_word);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			_la = _input.LA(1);
			if ( _la <= 0 || (((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (DEC - 132)) | (1L << (NEWLINE - 132)) | (1L << (NUMBERED_WORD - 132)))) != 0)) ) {
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

	public static class Interface_addressContext extends ParserRuleContext {
		public TerminalNode IP_PREFIX() { return getToken(CumulusNcluParser.IP_PREFIX, 0); }
		public Interface_addressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterInterface_address(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitInterface_address(this);
		}
	}

	public final Interface_addressContext interface_address() throws RecognitionException {
		Interface_addressContext _localctx = new Interface_addressContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_interface_address);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
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

	public static class Ip_addressContext extends ParserRuleContext {
		public TerminalNode IP_ADDRESS() { return getToken(CumulusNcluParser.IP_ADDRESS, 0); }
		public Ip_addressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ip_address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterIp_address(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitIp_address(this);
		}
	}

	public final Ip_addressContext ip_address() throws RecognitionException {
		Ip_addressContext _localctx = new Ip_addressContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_ip_address);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
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

	public static class Ip_prefixContext extends ParserRuleContext {
		public TerminalNode IP_PREFIX() { return getToken(CumulusNcluParser.IP_PREFIX, 0); }
		public Ip_prefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ip_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterIp_prefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitIp_prefix(this);
		}
	}

	public final Ip_prefixContext ip_prefix() throws RecognitionException {
		Ip_prefixContext _localctx = new Ip_prefixContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_ip_prefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
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

	public static class Ipv6_addressContext extends ParserRuleContext {
		public TerminalNode IPV6_ADDRESS() { return getToken(CumulusNcluParser.IPV6_ADDRESS, 0); }
		public Ipv6_addressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipv6_address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterIpv6_address(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitIpv6_address(this);
		}
	}

	public final Ipv6_addressContext ipv6_address() throws RecognitionException {
		Ipv6_addressContext _localctx = new Ipv6_addressContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_ipv6_address);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
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

	public static class Line_actionContext extends ParserRuleContext {
		public TerminalNode DENY() { return getToken(CumulusNcluParser.DENY, 0); }
		public TerminalNode PERMIT() { return getToken(CumulusNcluParser.PERMIT, 0); }
		public Line_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterLine_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitLine_action(this);
		}
	}

	public final Line_actionContext line_action() throws RecognitionException {
		Line_actionContext _localctx = new Line_actionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_line_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			_la = _input.LA(1);
			if ( !(_la==DENY || _la==PERMIT) ) {
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

	public static class Mac_addressContext extends ParserRuleContext {
		public TerminalNode MAC_ADDRESS() { return getToken(CumulusNcluParser.MAC_ADDRESS, 0); }
		public Mac_addressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mac_address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterMac_address(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitMac_address(this);
		}
	}

	public final Mac_addressContext mac_address() throws RecognitionException {
		Mac_addressContext _localctx = new Mac_addressContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_mac_address);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			match(MAC_ADDRESS);
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
		public List<TerminalNode> NEWLINE() { return getTokens(CumulusNcluParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CumulusNcluParser.NEWLINE, i);
		}
		public Null_rest_of_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_rest_of_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterNull_rest_of_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitNull_rest_of_line(this);
		}
	}

	public final Null_rest_of_lineContext null_rest_of_line() throws RecognitionException {
		Null_rest_of_lineContext _localctx = new Null_rest_of_lineContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_null_rest_of_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALIAS_BODY) | (1L << EXTRA_CONFIGURATION_FOOTER) | (1L << USERNAME) | (1L << ACCESS) | (1L << ACTIVATE) | (1L << ADD) | (1L << ADDRESS) | (1L << ADDRESS_VIRTUAL) | (1L << ADVERTISE) | (1L << ADVERTISE_ALL_VNI) | (1L << ADVERTISE_DEFAULT_GW) | (1L << AGENTX) | (1L << ALERTS) | (1L << ALIAS) | (1L << ALWAYS_COMPARE_MED) | (1L << ARP_ND_SUPPRESS) | (1L << AS_PATH) | (1L << AUTO) | (1L << AUTONOMOUS_SYSTEM) | (1L << BACKUP_IP) | (1L << BESTPATH) | (1L << BGP) | (1L << BOND) | (1L << BPDUGUARD) | (1L << BRIDGE) | (1L << CLAG) | (1L << COMMIT) | (1L << CONNECTED) | (1L << CRITICAL) | (1L << DATACENTER) | (1L << DEBUGGING) | (1L << DEFAULTS) | (1L << DEL) | (1L << DENY) | (1L << DESCRIPTION) | (1L << DHCP) | (1L << DNS) | (1L << DOT1X) | (1L << EMERGENCIES) | (1L << ERRORS) | (1L << EVPN) | (1L << EXIT_VRF) | (1L << EXTERNAL) | (1L << FORWARD) | (1L << GATEWAY) | (1L << HOSTNAME) | (1L << HWADDRESS) | (1L << IBURST) | (1L << ID) | (1L << INFORMATIONAL) | (1L << INTEGRATED_VTYSH_CONFIG) | (1L << INTERFACE) | (1L << INTERNAL) | (1L << IP) | (1L << IPV4) | (1L << IPV6) | (1L << L2VPN) | (1L << LACP_BYPASS_ALLOW) | (1L << LEARNING) | (1L << LINK) | (1L << LINKLOCAL) | (1L << LO) | (1L << LOCAL_TUNNELIP))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LOG - 64)) | (1L << (LOOPBACK - 64)) | (1L << (MATCH - 64)) | (1L << (MSEC - 64)) | (1L << (MTU - 64)) | (1L << (MULTIPATH_RELAX - 64)) | (1L << (NAMESERVER - 64)) | (1L << (ND - 64)) | (1L << (NEIGHBOR - 64)) | (1L << (NETWORK - 64)) | (1L << (NET - 64)) | (1L << (NO - 64)) | (1L << (NOTIFICATIONS - 64)) | (1L << (NTP - 64)) | (1L << (OFF - 64)) | (1L << (ON - 64)) | (1L << (PEER_GROUP - 64)) | (1L << (PEER_IP - 64)) | (1L << (PERMIT - 64)) | (1L << (PORTADMINEDGE - 64)) | (1L << (PORTAUTOEDGE - 64)) | (1L << (PORTBPDUFILTER - 64)) | (1L << (PORTNETWORK - 64)) | (1L << (PORTRESTROLE - 64)) | (1L << (PORTS - 64)) | (1L << (PRIORITY - 64)) | (1L << (PTP - 64)) | (1L << (PVID - 64)) | (1L << (RA_INTERVAL - 64)) | (1L << (RA_LIFETIME - 64)) | (1L << (REDISTRIBUTE - 64)) | (1L << (REMOTE_AS - 64)) | (1L << (ROUTE - 64)) | (1L << (ROUTER - 64)) | (1L << (ROUTE_MAP - 64)) | (1L << (ROUTE_REFLECTOR_CLIENT - 64)) | (1L << (ROUTER_ID - 64)) | (1L << (ROUTING - 64)) | (1L << (SERVER - 64)) | (1L << (SERVICE - 64)) | (1L << (SLAVES - 64)) | (1L << (SNMP_SERVER - 64)) | (1L << (SOURCE - 64)) | (1L << (SPEED - 64)) | (1L << (STATIC - 64)) | (1L << (STP - 64)) | (1L << (SUPPRESS_RA - 64)) | (1L << (SYS_MAC - 64)) | (1L << (SYSLOG - 64)) | (1L << (TIME - 64)) | (1L << (UNICAST - 64)) | (1L << (VIDS - 64)) | (1L << (VLAN - 64)) | (1L << (VLAN_AWARE - 64)) | (1L << (VLAN_ID - 64)) | (1L << (VLAN_RAW_DEVICE - 64)) | (1L << (VNI - 64)) | (1L << (VRF - 64)) | (1L << (VRF_TABLE - 64)) | (1L << (VXLAN - 64)) | (1L << (VXLAN_ANYCAST_IP - 64)) | (1L << (WARNINGS - 64)) | (1L << (ZONE - 64)) | (1L << (EXTRA_CONFIGURATION_HEADER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (COMMA - 128)) | (1L << (COMMENT_LINE - 128)) | (1L << (COMMENT_TAIL - 128)) | (1L << (DASH - 128)) | (1L << (DEC - 128)) | (1L << (IP_ADDRESS - 128)) | (1L << (IP_PREFIX - 128)) | (1L << (IPV6_ADDRESS - 128)) | (1L << (IPV6_PREFIX - 128)) | (1L << (MAC_ADDRESS - 128)) | (1L << (NUMBERED_WORD - 128)) | (1L << (WORD - 128)) | (1L << (WS - 128)) | (1L << (M_Alias_WS - 128)) | (1L << (M_Printf_WS - 128)) | (1L << (M_Printf_EXTRA_CONFIGURATION_FOOTER - 128)) | (1L << (M_Printf_NEWLINE - 128)) | (1L << (M_Printf_USERNAME - 128)))) != 0)) {
				{
				{
				setState(712);
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
				setState(717);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(718);
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

	public static class Numbered_wordContext extends ParserRuleContext {
		public TerminalNode NUMBERED_WORD() { return getToken(CumulusNcluParser.NUMBERED_WORD, 0); }
		public Numbered_wordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numbered_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterNumbered_word(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitNumbered_word(this);
		}
	}

	public final Numbered_wordContext numbered_word() throws RecognitionException {
		Numbered_wordContext _localctx = new Numbered_wordContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_numbered_word);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			match(NUMBERED_WORD);
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

	public static class RangeContext extends ParserRuleContext {
		public Uint32Context low;
		public Uint32Context high;
		public List<Uint32Context> uint32() {
			return getRuleContexts(Uint32Context.class);
		}
		public Uint32Context uint32(int i) {
			return getRuleContext(Uint32Context.class,i);
		}
		public TerminalNode DASH() { return getToken(CumulusNcluParser.DASH, 0); }
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitRange(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_range);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			((RangeContext)_localctx).low = uint32();
			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DASH) {
				{
				setState(723);
				match(DASH);
				setState(724);
				((RangeContext)_localctx).high = uint32();
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

	public static class Range_setContext extends ParserRuleContext {
		public List<RangeContext> range() {
			return getRuleContexts(RangeContext.class);
		}
		public RangeContext range(int i) {
			return getRuleContext(RangeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CumulusNcluParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CumulusNcluParser.COMMA, i);
		}
		public Range_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterRange_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitRange_set(this);
		}
	}

	public final Range_setContext range_set() throws RecognitionException {
		Range_setContext _localctx = new Range_setContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_range_set);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			range();
			setState(732);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(728);
					match(COMMA);
					setState(729);
					range();
					}
					} 
				}
				setState(734);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class Uint16Context extends ParserRuleContext {
		public Token d;
		public TerminalNode DEC() { return getToken(CumulusNcluParser.DEC, 0); }
		public Uint16Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uint16; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterUint16(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitUint16(this);
		}
	}

	public final Uint16Context uint16() throws RecognitionException {
		Uint16Context _localctx = new Uint16Context(_ctx, getState());
		enterRule(_localctx, 160, RULE_uint16);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			((Uint16Context)_localctx).d = match(DEC);
			setState(736);
			if (!(isUint16(((Uint16Context)_localctx).d))) throw new FailedPredicateException(this, "isUint16($d)");
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
		public Token d;
		public TerminalNode DEC() { return getToken(CumulusNcluParser.DEC, 0); }
		public Uint32Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uint32; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterUint32(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitUint32(this);
		}
	}

	public final Uint32Context uint32() throws RecognitionException {
		Uint32Context _localctx = new Uint32Context(_ctx, getState());
		enterRule(_localctx, 162, RULE_uint32);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			((Uint32Context)_localctx).d = match(DEC);
			setState(739);
			if (!(isUint32(((Uint32Context)_localctx).d))) throw new FailedPredicateException(this, "isUint32($d)");
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
		public TerminalNode DEC() { return getToken(CumulusNcluParser.DEC, 0); }
		public Vlan_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vlan_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterVlan_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitVlan_id(this);
		}
	}

	public final Vlan_idContext vlan_id() throws RecognitionException {
		Vlan_idContext _localctx = new Vlan_idContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_vlan_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			((Vlan_idContext)_localctx).v = match(DEC);
			setState(742);
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

	public static class Vlan_rangeContext extends ParserRuleContext {
		public Vlan_idContext low;
		public Vlan_idContext high;
		public List<Vlan_idContext> vlan_id() {
			return getRuleContexts(Vlan_idContext.class);
		}
		public Vlan_idContext vlan_id(int i) {
			return getRuleContext(Vlan_idContext.class,i);
		}
		public TerminalNode DASH() { return getToken(CumulusNcluParser.DASH, 0); }
		public Vlan_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vlan_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterVlan_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitVlan_range(this);
		}
	}

	public final Vlan_rangeContext vlan_range() throws RecognitionException {
		Vlan_rangeContext _localctx = new Vlan_rangeContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_vlan_range);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			((Vlan_rangeContext)_localctx).low = vlan_id();
			setState(747);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DASH) {
				{
				setState(745);
				match(DASH);
				setState(746);
				((Vlan_rangeContext)_localctx).high = vlan_id();
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

	public static class Vlan_range_setContext extends ParserRuleContext {
		public List<Vlan_rangeContext> vlan_range() {
			return getRuleContexts(Vlan_rangeContext.class);
		}
		public Vlan_rangeContext vlan_range(int i) {
			return getRuleContext(Vlan_rangeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CumulusNcluParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CumulusNcluParser.COMMA, i);
		}
		public Vlan_range_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vlan_range_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterVlan_range_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitVlan_range_set(this);
		}
	}

	public final Vlan_range_setContext vlan_range_set() throws RecognitionException {
		Vlan_range_setContext _localctx = new Vlan_range_setContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_vlan_range_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			vlan_range();
			setState(754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(750);
				match(COMMA);
				setState(751);
				vlan_range();
				}
				}
				setState(756);
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

	public static class Vni_numberContext extends ParserRuleContext {
		public Token v;
		public TerminalNode DEC() { return getToken(CumulusNcluParser.DEC, 0); }
		public Vni_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vni_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterVni_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitVni_number(this);
		}
	}

	public final Vni_numberContext vni_number() throws RecognitionException {
		Vni_numberContext _localctx = new Vni_numberContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_vni_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			((Vni_numberContext)_localctx).v = match(DEC);
			setState(758);
			if (!(isVniNumber(((Vni_numberContext)_localctx).v))) throw new FailedPredicateException(this, "isVniNumber($v)");
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
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitWord(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_word);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
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

	public static class ZeroContext extends ParserRuleContext {
		public Token d;
		public TerminalNode DEC() { return getToken(CumulusNcluParser.DEC, 0); }
		public ZeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterZero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitZero(this);
		}
	}

	public final ZeroContext zero() throws RecognitionException {
		ZeroContext _localctx = new ZeroContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_zero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			((ZeroContext)_localctx).d = match(DEC);
			setState(763);
			if (!( isZero(((ZeroContext)_localctx).d) )) throw new FailedPredicateException(this, " isZero($d) ");
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

	public static class A_bgpContext extends ParserRuleContext {
		public TerminalNode BGP() { return getToken(CumulusNcluParser.BGP, 0); }
		public B_commonContext b_common() {
			return getRuleContext(B_commonContext.class,0);
		}
		public B_vrfContext b_vrf() {
			return getRuleContext(B_vrfContext.class,0);
		}
		public A_bgpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_bgp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterA_bgp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitA_bgp(this);
		}
	}

	public final A_bgpContext a_bgp() throws RecognitionException {
		A_bgpContext _localctx = new A_bgpContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_a_bgp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			match(BGP);
			setState(768);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALWAYS_COMPARE_MED:
			case AUTONOMOUS_SYSTEM:
			case BESTPATH:
			case IPV4:
			case L2VPN:
			case NEIGHBOR:
			case ROUTER_ID:
				{
				setState(766);
				b_common();
				}
				break;
			case VRF:
				{
				setState(767);
				b_vrf();
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

	public static class B_commonContext extends ParserRuleContext {
		public B_always_compare_medContext b_always_compare_med() {
			return getRuleContext(B_always_compare_medContext.class,0);
		}
		public B_autonomous_systemContext b_autonomous_system() {
			return getRuleContext(B_autonomous_systemContext.class,0);
		}
		public B_bestpathContext b_bestpath() {
			return getRuleContext(B_bestpathContext.class,0);
		}
		public B_ipv4_unicastContext b_ipv4_unicast() {
			return getRuleContext(B_ipv4_unicastContext.class,0);
		}
		public B_l2vpnContext b_l2vpn() {
			return getRuleContext(B_l2vpnContext.class,0);
		}
		public B_neighborContext b_neighbor() {
			return getRuleContext(B_neighborContext.class,0);
		}
		public B_router_idContext b_router_id() {
			return getRuleContext(B_router_idContext.class,0);
		}
		public B_commonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b_common; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterB_common(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitB_common(this);
		}
	}

	public final B_commonContext b_common() throws RecognitionException {
		B_commonContext _localctx = new B_commonContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_b_common);
		try {
			setState(777);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALWAYS_COMPARE_MED:
				enterOuterAlt(_localctx, 1);
				{
				setState(770);
				b_always_compare_med();
				}
				break;
			case AUTONOMOUS_SYSTEM:
				enterOuterAlt(_localctx, 2);
				{
				setState(771);
				b_autonomous_system();
				}
				break;
			case BESTPATH:
				enterOuterAlt(_localctx, 3);
				{
				setState(772);
				b_bestpath();
				}
				break;
			case IPV4:
				enterOuterAlt(_localctx, 4);
				{
				setState(773);
				b_ipv4_unicast();
				}
				break;
			case L2VPN:
				enterOuterAlt(_localctx, 5);
				{
				setState(774);
				b_l2vpn();
				}
				break;
			case NEIGHBOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(775);
				b_neighbor();
				}
				break;
			case ROUTER_ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(776);
				b_router_id();
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

	public static class B_always_compare_medContext extends ParserRuleContext {
		public TerminalNode ALWAYS_COMPARE_MED() { return getToken(CumulusNcluParser.ALWAYS_COMPARE_MED, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public B_always_compare_medContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b_always_compare_med; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterB_always_compare_med(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitB_always_compare_med(this);
		}
	}

	public final B_always_compare_medContext b_always_compare_med() throws RecognitionException {
		B_always_compare_medContext _localctx = new B_always_compare_medContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_b_always_compare_med);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			match(ALWAYS_COMPARE_MED);
			setState(780);
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

	public static class B_autonomous_systemContext extends ParserRuleContext {
		public Uint32Context as;
		public TerminalNode AUTONOMOUS_SYSTEM() { return getToken(CumulusNcluParser.AUTONOMOUS_SYSTEM, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Uint32Context uint32() {
			return getRuleContext(Uint32Context.class,0);
		}
		public B_autonomous_systemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b_autonomous_system; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterB_autonomous_system(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitB_autonomous_system(this);
		}
	}

	public final B_autonomous_systemContext b_autonomous_system() throws RecognitionException {
		B_autonomous_systemContext _localctx = new B_autonomous_systemContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_b_autonomous_system);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			match(AUTONOMOUS_SYSTEM);
			setState(783);
			((B_autonomous_systemContext)_localctx).as = uint32();
			setState(784);
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

	public static class B_bestpathContext extends ParserRuleContext {
		public TerminalNode BESTPATH() { return getToken(CumulusNcluParser.BESTPATH, 0); }
		public Bb_aspath_multipath_relaxContext bb_aspath_multipath_relax() {
			return getRuleContext(Bb_aspath_multipath_relaxContext.class,0);
		}
		public B_bestpathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b_bestpath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterB_bestpath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitB_bestpath(this);
		}
	}

	public final B_bestpathContext b_bestpath() throws RecognitionException {
		B_bestpathContext _localctx = new B_bestpathContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_b_bestpath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			match(BESTPATH);
			setState(787);
			bb_aspath_multipath_relax();
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

	public static class Bb_aspath_multipath_relaxContext extends ParserRuleContext {
		public TerminalNode AS_PATH() { return getToken(CumulusNcluParser.AS_PATH, 0); }
		public TerminalNode MULTIPATH_RELAX() { return getToken(CumulusNcluParser.MULTIPATH_RELAX, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Bb_aspath_multipath_relaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bb_aspath_multipath_relax; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterBb_aspath_multipath_relax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitBb_aspath_multipath_relax(this);
		}
	}

	public final Bb_aspath_multipath_relaxContext bb_aspath_multipath_relax() throws RecognitionException {
		Bb_aspath_multipath_relaxContext _localctx = new Bb_aspath_multipath_relaxContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_bb_aspath_multipath_relax);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			match(AS_PATH);
			setState(790);
			match(MULTIPATH_RELAX);
			setState(791);
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

	public static class B_ipv4_unicastContext extends ParserRuleContext {
		public TerminalNode IPV4() { return getToken(CumulusNcluParser.IPV4, 0); }
		public TerminalNode UNICAST() { return getToken(CumulusNcluParser.UNICAST, 0); }
		public Bi4_neighborContext bi4_neighbor() {
			return getRuleContext(Bi4_neighborContext.class,0);
		}
		public Bi4_networkContext bi4_network() {
			return getRuleContext(Bi4_networkContext.class,0);
		}
		public Bi4_redistribute_connectedContext bi4_redistribute_connected() {
			return getRuleContext(Bi4_redistribute_connectedContext.class,0);
		}
		public Bi4_redistribute_staticContext bi4_redistribute_static() {
			return getRuleContext(Bi4_redistribute_staticContext.class,0);
		}
		public B_ipv4_unicastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b_ipv4_unicast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterB_ipv4_unicast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitB_ipv4_unicast(this);
		}
	}

	public final B_ipv4_unicastContext b_ipv4_unicast() throws RecognitionException {
		B_ipv4_unicastContext _localctx = new B_ipv4_unicastContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_b_ipv4_unicast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			match(IPV4);
			setState(794);
			match(UNICAST);
			setState(799);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(795);
				bi4_neighbor();
				}
				break;
			case 2:
				{
				setState(796);
				bi4_network();
				}
				break;
			case 3:
				{
				setState(797);
				bi4_redistribute_connected();
				}
				break;
			case 4:
				{
				setState(798);
				bi4_redistribute_static();
				}
				break;
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

	public static class Bi4_networkContext extends ParserRuleContext {
		public Ip_prefixContext network;
		public TerminalNode NETWORK() { return getToken(CumulusNcluParser.NETWORK, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Ip_prefixContext ip_prefix() {
			return getRuleContext(Ip_prefixContext.class,0);
		}
		public Bi4_networkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bi4_network; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterBi4_network(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitBi4_network(this);
		}
	}

	public final Bi4_networkContext bi4_network() throws RecognitionException {
		Bi4_networkContext _localctx = new Bi4_networkContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_bi4_network);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			match(NETWORK);
			setState(802);
			((Bi4_networkContext)_localctx).network = ip_prefix();
			setState(803);
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

	public static class Bi4_neighborContext extends ParserRuleContext {
		public WordContext name;
		public TerminalNode NEIGHBOR() { return getToken(CumulusNcluParser.NEIGHBOR, 0); }
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public Bi4n_activateContext bi4n_activate() {
			return getRuleContext(Bi4n_activateContext.class,0);
		}
		public Bi4n_route_reflector_clientContext bi4n_route_reflector_client() {
			return getRuleContext(Bi4n_route_reflector_clientContext.class,0);
		}
		public Bi4_neighborContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bi4_neighbor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterBi4_neighbor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitBi4_neighbor(this);
		}
	}

	public final Bi4_neighborContext bi4_neighbor() throws RecognitionException {
		Bi4_neighborContext _localctx = new Bi4_neighborContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_bi4_neighbor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			match(NEIGHBOR);
			setState(806);
			((Bi4_neighborContext)_localctx).name = word();
			setState(809);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACTIVATE:
				{
				setState(807);
				bi4n_activate();
				}
				break;
			case ROUTE_REFLECTOR_CLIENT:
				{
				setState(808);
				bi4n_route_reflector_client();
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

	public static class Bi4n_activateContext extends ParserRuleContext {
		public TerminalNode ACTIVATE() { return getToken(CumulusNcluParser.ACTIVATE, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Bi4n_activateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bi4n_activate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterBi4n_activate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitBi4n_activate(this);
		}
	}

	public final Bi4n_activateContext bi4n_activate() throws RecognitionException {
		Bi4n_activateContext _localctx = new Bi4n_activateContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_bi4n_activate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			match(ACTIVATE);
			setState(812);
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

	public static class Bi4n_route_reflector_clientContext extends ParserRuleContext {
		public TerminalNode ROUTE_REFLECTOR_CLIENT() { return getToken(CumulusNcluParser.ROUTE_REFLECTOR_CLIENT, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Bi4n_route_reflector_clientContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bi4n_route_reflector_client; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterBi4n_route_reflector_client(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitBi4n_route_reflector_client(this);
		}
	}

	public final Bi4n_route_reflector_clientContext bi4n_route_reflector_client() throws RecognitionException {
		Bi4n_route_reflector_clientContext _localctx = new Bi4n_route_reflector_clientContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_bi4n_route_reflector_client);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			match(ROUTE_REFLECTOR_CLIENT);
			setState(815);
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

	public static class Bi4_redistribute_connectedContext extends ParserRuleContext {
		public WordContext rm;
		public TerminalNode REDISTRIBUTE() { return getToken(CumulusNcluParser.REDISTRIBUTE, 0); }
		public TerminalNode CONNECTED() { return getToken(CumulusNcluParser.CONNECTED, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public TerminalNode ROUTE_MAP() { return getToken(CumulusNcluParser.ROUTE_MAP, 0); }
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public Bi4_redistribute_connectedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bi4_redistribute_connected; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterBi4_redistribute_connected(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitBi4_redistribute_connected(this);
		}
	}

	public final Bi4_redistribute_connectedContext bi4_redistribute_connected() throws RecognitionException {
		Bi4_redistribute_connectedContext _localctx = new Bi4_redistribute_connectedContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_bi4_redistribute_connected);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			match(REDISTRIBUTE);
			setState(818);
			match(CONNECTED);
			setState(821);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROUTE_MAP) {
				{
				setState(819);
				match(ROUTE_MAP);
				setState(820);
				((Bi4_redistribute_connectedContext)_localctx).rm = word();
				}
			}

			setState(823);
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

	public static class Bi4_redistribute_staticContext extends ParserRuleContext {
		public WordContext rm;
		public TerminalNode REDISTRIBUTE() { return getToken(CumulusNcluParser.REDISTRIBUTE, 0); }
		public TerminalNode STATIC() { return getToken(CumulusNcluParser.STATIC, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public TerminalNode ROUTE_MAP() { return getToken(CumulusNcluParser.ROUTE_MAP, 0); }
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public Bi4_redistribute_staticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bi4_redistribute_static; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterBi4_redistribute_static(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitBi4_redistribute_static(this);
		}
	}

	public final Bi4_redistribute_staticContext bi4_redistribute_static() throws RecognitionException {
		Bi4_redistribute_staticContext _localctx = new Bi4_redistribute_staticContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_bi4_redistribute_static);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			match(REDISTRIBUTE);
			setState(826);
			match(STATIC);
			setState(829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROUTE_MAP) {
				{
				setState(827);
				match(ROUTE_MAP);
				setState(828);
				((Bi4_redistribute_staticContext)_localctx).rm = word();
				}
			}

			setState(831);
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

	public static class B_l2vpnContext extends ParserRuleContext {
		public TerminalNode L2VPN() { return getToken(CumulusNcluParser.L2VPN, 0); }
		public TerminalNode EVPN() { return getToken(CumulusNcluParser.EVPN, 0); }
		public Ble_advertise_all_vniContext ble_advertise_all_vni() {
			return getRuleContext(Ble_advertise_all_vniContext.class,0);
		}
		public Ble_advertise_default_gwContext ble_advertise_default_gw() {
			return getRuleContext(Ble_advertise_default_gwContext.class,0);
		}
		public Ble_advertise_ipv4_unicastContext ble_advertise_ipv4_unicast() {
			return getRuleContext(Ble_advertise_ipv4_unicastContext.class,0);
		}
		public Ble_neighborContext ble_neighbor() {
			return getRuleContext(Ble_neighborContext.class,0);
		}
		public B_l2vpnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b_l2vpn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterB_l2vpn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitB_l2vpn(this);
		}
	}

	public final B_l2vpnContext b_l2vpn() throws RecognitionException {
		B_l2vpnContext _localctx = new B_l2vpnContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_b_l2vpn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			match(L2VPN);
			setState(834);
			match(EVPN);
			setState(839);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADVERTISE_ALL_VNI:
				{
				setState(835);
				ble_advertise_all_vni();
				}
				break;
			case ADVERTISE_DEFAULT_GW:
				{
				setState(836);
				ble_advertise_default_gw();
				}
				break;
			case ADVERTISE:
				{
				setState(837);
				ble_advertise_ipv4_unicast();
				}
				break;
			case NEIGHBOR:
				{
				setState(838);
				ble_neighbor();
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

	public static class Ble_advertise_all_vniContext extends ParserRuleContext {
		public TerminalNode ADVERTISE_ALL_VNI() { return getToken(CumulusNcluParser.ADVERTISE_ALL_VNI, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Ble_advertise_all_vniContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ble_advertise_all_vni; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterBle_advertise_all_vni(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitBle_advertise_all_vni(this);
		}
	}

	public final Ble_advertise_all_vniContext ble_advertise_all_vni() throws RecognitionException {
		Ble_advertise_all_vniContext _localctx = new Ble_advertise_all_vniContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_ble_advertise_all_vni);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			match(ADVERTISE_ALL_VNI);
			setState(842);
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

	public static class Ble_advertise_default_gwContext extends ParserRuleContext {
		public TerminalNode ADVERTISE_DEFAULT_GW() { return getToken(CumulusNcluParser.ADVERTISE_DEFAULT_GW, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Ble_advertise_default_gwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ble_advertise_default_gw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterBle_advertise_default_gw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitBle_advertise_default_gw(this);
		}
	}

	public final Ble_advertise_default_gwContext ble_advertise_default_gw() throws RecognitionException {
		Ble_advertise_default_gwContext _localctx = new Ble_advertise_default_gwContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_ble_advertise_default_gw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			match(ADVERTISE_DEFAULT_GW);
			setState(845);
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

	public static class Ble_advertise_ipv4_unicastContext extends ParserRuleContext {
		public TerminalNode ADVERTISE() { return getToken(CumulusNcluParser.ADVERTISE, 0); }
		public TerminalNode IPV4() { return getToken(CumulusNcluParser.IPV4, 0); }
		public TerminalNode UNICAST() { return getToken(CumulusNcluParser.UNICAST, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Ble_advertise_ipv4_unicastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ble_advertise_ipv4_unicast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterBle_advertise_ipv4_unicast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitBle_advertise_ipv4_unicast(this);
		}
	}

	public final Ble_advertise_ipv4_unicastContext ble_advertise_ipv4_unicast() throws RecognitionException {
		Ble_advertise_ipv4_unicastContext _localctx = new Ble_advertise_ipv4_unicastContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_ble_advertise_ipv4_unicast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			match(ADVERTISE);
			setState(848);
			match(IPV4);
			setState(849);
			match(UNICAST);
			setState(850);
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

	public static class Ble_neighborContext extends ParserRuleContext {
		public WordContext name;
		public TerminalNode NEIGHBOR() { return getToken(CumulusNcluParser.NEIGHBOR, 0); }
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public Blen_activateContext blen_activate() {
			return getRuleContext(Blen_activateContext.class,0);
		}
		public Blen_route_reflector_clientContext blen_route_reflector_client() {
			return getRuleContext(Blen_route_reflector_clientContext.class,0);
		}
		public Ble_neighborContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ble_neighbor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterBle_neighbor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitBle_neighbor(this);
		}
	}

	public final Ble_neighborContext ble_neighbor() throws RecognitionException {
		Ble_neighborContext _localctx = new Ble_neighborContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_ble_neighbor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			match(NEIGHBOR);
			setState(853);
			((Ble_neighborContext)_localctx).name = word();
			setState(856);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACTIVATE:
				{
				setState(854);
				blen_activate();
				}
				break;
			case ROUTE_REFLECTOR_CLIENT:
				{
				setState(855);
				blen_route_reflector_client();
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

	public static class Blen_activateContext extends ParserRuleContext {
		public TerminalNode ACTIVATE() { return getToken(CumulusNcluParser.ACTIVATE, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Blen_activateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blen_activate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterBlen_activate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitBlen_activate(this);
		}
	}

	public final Blen_activateContext blen_activate() throws RecognitionException {
		Blen_activateContext _localctx = new Blen_activateContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_blen_activate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			match(ACTIVATE);
			setState(859);
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

	public static class Blen_route_reflector_clientContext extends ParserRuleContext {
		public TerminalNode ROUTE_REFLECTOR_CLIENT() { return getToken(CumulusNcluParser.ROUTE_REFLECTOR_CLIENT, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Blen_route_reflector_clientContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blen_route_reflector_client; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterBlen_route_reflector_client(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitBlen_route_reflector_client(this);
		}
	}

	public final Blen_route_reflector_clientContext blen_route_reflector_client() throws RecognitionException {
		Blen_route_reflector_clientContext _localctx = new Blen_route_reflector_clientContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_blen_route_reflector_client);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			match(ROUTE_REFLECTOR_CLIENT);
			setState(862);
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

	public static class B_neighborContext extends ParserRuleContext {
		public WordContext name;
		public TerminalNode NEIGHBOR() { return getToken(CumulusNcluParser.NEIGHBOR, 0); }
		public Bn_peer_groupContext bn_peer_group() {
			return getRuleContext(Bn_peer_groupContext.class,0);
		}
		public Bn_interfaceContext bn_interface() {
			return getRuleContext(Bn_interfaceContext.class,0);
		}
		public Bn_peerContext bn_peer() {
			return getRuleContext(Bn_peerContext.class,0);
		}
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public B_neighborContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b_neighbor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterB_neighbor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitB_neighbor(this);
		}
	}

	public final B_neighborContext b_neighbor() throws RecognitionException {
		B_neighborContext _localctx = new B_neighborContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_b_neighbor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			match(NEIGHBOR);
			setState(874);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(865);
				((B_neighborContext)_localctx).name = word();
				setState(866);
				bn_peer_group();
				}
				break;
			case 2:
				{
				setState(868);
				((B_neighborContext)_localctx).name = word();
				setState(869);
				bn_interface();
				}
				break;
			case 3:
				{
				setState(871);
				((B_neighborContext)_localctx).name = word();
				setState(872);
				bn_peer();
				}
				break;
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

	public static class Bn_interfaceContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(CumulusNcluParser.INTERFACE, 0); }
		public Bnp_peer_groupContext bnp_peer_group() {
			return getRuleContext(Bnp_peer_groupContext.class,0);
		}
		public Bnp_remote_asContext bnp_remote_as() {
			return getRuleContext(Bnp_remote_asContext.class,0);
		}
		public Bn_interfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bn_interface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterBn_interface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitBn_interface(this);
		}
	}

	public final Bn_interfaceContext bn_interface() throws RecognitionException {
		Bn_interfaceContext _localctx = new Bn_interfaceContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_bn_interface);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			match(INTERFACE);
			setState(879);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PEER_GROUP:
				{
				setState(877);
				bnp_peer_group();
				}
				break;
			case REMOTE_AS:
				{
				setState(878);
				bnp_remote_as();
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

	public static class Bn_peerContext extends ParserRuleContext {
		public Bnp_descriptionContext bnp_description() {
			return getRuleContext(Bnp_descriptionContext.class,0);
		}
		public Bnp_peer_groupContext bnp_peer_group() {
			return getRuleContext(Bnp_peer_groupContext.class,0);
		}
		public Bnp_remote_asContext bnp_remote_as() {
			return getRuleContext(Bnp_remote_asContext.class,0);
		}
		public Bn_peerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bn_peer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterBn_peer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitBn_peer(this);
		}
	}

	public final Bn_peerContext bn_peer() throws RecognitionException {
		Bn_peerContext _localctx = new Bn_peerContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_bn_peer);
		try {
			setState(884);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DESCRIPTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(881);
				bnp_description();
				}
				break;
			case PEER_GROUP:
				enterOuterAlt(_localctx, 2);
				{
				setState(882);
				bnp_peer_group();
				}
				break;
			case REMOTE_AS:
				enterOuterAlt(_localctx, 3);
				{
				setState(883);
				bnp_remote_as();
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

	public static class Bn_peer_groupContext extends ParserRuleContext {
		public TerminalNode PEER_GROUP() { return getToken(CumulusNcluParser.PEER_GROUP, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Bn_peer_groupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bn_peer_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterBn_peer_group(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitBn_peer_group(this);
		}
	}

	public final Bn_peer_groupContext bn_peer_group() throws RecognitionException {
		Bn_peer_groupContext _localctx = new Bn_peer_groupContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_bn_peer_group);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(886);
			match(PEER_GROUP);
			setState(887);
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

	public static class Bnp_descriptionContext extends ParserRuleContext {
		public Token text;
		public TerminalNode DESCRIPTION() { return getToken(CumulusNcluParser.DESCRIPTION, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CumulusNcluParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CumulusNcluParser.NEWLINE, i);
		}
		public Bnp_descriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bnp_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterBnp_description(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitBnp_description(this);
		}
	}

	public final Bnp_descriptionContext bnp_description() throws RecognitionException {
		Bnp_descriptionContext _localctx = new Bnp_descriptionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_bnp_description);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889);
			match(DESCRIPTION);
			setState(893);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALIAS_BODY) | (1L << EXTRA_CONFIGURATION_FOOTER) | (1L << USERNAME) | (1L << ACCESS) | (1L << ACTIVATE) | (1L << ADD) | (1L << ADDRESS) | (1L << ADDRESS_VIRTUAL) | (1L << ADVERTISE) | (1L << ADVERTISE_ALL_VNI) | (1L << ADVERTISE_DEFAULT_GW) | (1L << AGENTX) | (1L << ALERTS) | (1L << ALIAS) | (1L << ALWAYS_COMPARE_MED) | (1L << ARP_ND_SUPPRESS) | (1L << AS_PATH) | (1L << AUTO) | (1L << AUTONOMOUS_SYSTEM) | (1L << BACKUP_IP) | (1L << BESTPATH) | (1L << BGP) | (1L << BOND) | (1L << BPDUGUARD) | (1L << BRIDGE) | (1L << CLAG) | (1L << COMMIT) | (1L << CONNECTED) | (1L << CRITICAL) | (1L << DATACENTER) | (1L << DEBUGGING) | (1L << DEFAULTS) | (1L << DEL) | (1L << DENY) | (1L << DESCRIPTION) | (1L << DHCP) | (1L << DNS) | (1L << DOT1X) | (1L << EMERGENCIES) | (1L << ERRORS) | (1L << EVPN) | (1L << EXIT_VRF) | (1L << EXTERNAL) | (1L << FORWARD) | (1L << GATEWAY) | (1L << HOSTNAME) | (1L << HWADDRESS) | (1L << IBURST) | (1L << ID) | (1L << INFORMATIONAL) | (1L << INTEGRATED_VTYSH_CONFIG) | (1L << INTERFACE) | (1L << INTERNAL) | (1L << IP) | (1L << IPV4) | (1L << IPV6) | (1L << L2VPN) | (1L << LACP_BYPASS_ALLOW) | (1L << LEARNING) | (1L << LINK) | (1L << LINKLOCAL) | (1L << LO) | (1L << LOCAL_TUNNELIP))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LOG - 64)) | (1L << (LOOPBACK - 64)) | (1L << (MATCH - 64)) | (1L << (MSEC - 64)) | (1L << (MTU - 64)) | (1L << (MULTIPATH_RELAX - 64)) | (1L << (NAMESERVER - 64)) | (1L << (ND - 64)) | (1L << (NEIGHBOR - 64)) | (1L << (NETWORK - 64)) | (1L << (NET - 64)) | (1L << (NO - 64)) | (1L << (NOTIFICATIONS - 64)) | (1L << (NTP - 64)) | (1L << (OFF - 64)) | (1L << (ON - 64)) | (1L << (PEER_GROUP - 64)) | (1L << (PEER_IP - 64)) | (1L << (PERMIT - 64)) | (1L << (PORTADMINEDGE - 64)) | (1L << (PORTAUTOEDGE - 64)) | (1L << (PORTBPDUFILTER - 64)) | (1L << (PORTNETWORK - 64)) | (1L << (PORTRESTROLE - 64)) | (1L << (PORTS - 64)) | (1L << (PRIORITY - 64)) | (1L << (PTP - 64)) | (1L << (PVID - 64)) | (1L << (RA_INTERVAL - 64)) | (1L << (RA_LIFETIME - 64)) | (1L << (REDISTRIBUTE - 64)) | (1L << (REMOTE_AS - 64)) | (1L << (ROUTE - 64)) | (1L << (ROUTER - 64)) | (1L << (ROUTE_MAP - 64)) | (1L << (ROUTE_REFLECTOR_CLIENT - 64)) | (1L << (ROUTER_ID - 64)) | (1L << (ROUTING - 64)) | (1L << (SERVER - 64)) | (1L << (SERVICE - 64)) | (1L << (SLAVES - 64)) | (1L << (SNMP_SERVER - 64)) | (1L << (SOURCE - 64)) | (1L << (SPEED - 64)) | (1L << (STATIC - 64)) | (1L << (STP - 64)) | (1L << (SUPPRESS_RA - 64)) | (1L << (SYS_MAC - 64)) | (1L << (SYSLOG - 64)) | (1L << (TIME - 64)) | (1L << (UNICAST - 64)) | (1L << (VIDS - 64)) | (1L << (VLAN - 64)) | (1L << (VLAN_AWARE - 64)) | (1L << (VLAN_ID - 64)) | (1L << (VLAN_RAW_DEVICE - 64)) | (1L << (VNI - 64)) | (1L << (VRF - 64)) | (1L << (VRF_TABLE - 64)) | (1L << (VXLAN - 64)) | (1L << (VXLAN_ANYCAST_IP - 64)) | (1L << (WARNINGS - 64)) | (1L << (ZONE - 64)) | (1L << (EXTRA_CONFIGURATION_HEADER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (COMMA - 128)) | (1L << (COMMENT_LINE - 128)) | (1L << (COMMENT_TAIL - 128)) | (1L << (DASH - 128)) | (1L << (DEC - 128)) | (1L << (IP_ADDRESS - 128)) | (1L << (IP_PREFIX - 128)) | (1L << (IPV6_ADDRESS - 128)) | (1L << (IPV6_PREFIX - 128)) | (1L << (MAC_ADDRESS - 128)) | (1L << (NUMBERED_WORD - 128)) | (1L << (WORD - 128)) | (1L << (WS - 128)) | (1L << (M_Alias_WS - 128)) | (1L << (M_Printf_WS - 128)) | (1L << (M_Printf_EXTRA_CONFIGURATION_FOOTER - 128)) | (1L << (M_Printf_NEWLINE - 128)) | (1L << (M_Printf_USERNAME - 128)))) != 0)) {
				{
				{
				setState(890);
				((Bnp_descriptionContext)_localctx).text = _input.LT(1);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==NEWLINE) ) {
					((Bnp_descriptionContext)_localctx).text = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(895);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(896);
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

	public static class Bnp_peer_groupContext extends ParserRuleContext {
		public WordContext name;
		public TerminalNode PEER_GROUP() { return getToken(CumulusNcluParser.PEER_GROUP, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public Bnp_peer_groupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bnp_peer_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterBnp_peer_group(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitBnp_peer_group(this);
		}
	}

	public final Bnp_peer_groupContext bnp_peer_group() throws RecognitionException {
		Bnp_peer_groupContext _localctx = new Bnp_peer_groupContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_bnp_peer_group);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
			match(PEER_GROUP);
			setState(899);
			((Bnp_peer_groupContext)_localctx).name = word();
			setState(900);
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

	public static class Bnp_remote_asContext extends ParserRuleContext {
		public Uint32Context as;
		public TerminalNode REMOTE_AS() { return getToken(CumulusNcluParser.REMOTE_AS, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public TerminalNode EXTERNAL() { return getToken(CumulusNcluParser.EXTERNAL, 0); }
		public TerminalNode INTERNAL() { return getToken(CumulusNcluParser.INTERNAL, 0); }
		public Uint32Context uint32() {
			return getRuleContext(Uint32Context.class,0);
		}
		public Bnp_remote_asContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bnp_remote_as; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterBnp_remote_as(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitBnp_remote_as(this);
		}
	}

	public final Bnp_remote_asContext bnp_remote_as() throws RecognitionException {
		Bnp_remote_asContext _localctx = new Bnp_remote_asContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_bnp_remote_as);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			match(REMOTE_AS);
			setState(906);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXTERNAL:
				{
				setState(903);
				match(EXTERNAL);
				}
				break;
			case INTERNAL:
				{
				setState(904);
				match(INTERNAL);
				}
				break;
			case DEC:
				{
				setState(905);
				((Bnp_remote_asContext)_localctx).as = uint32();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(908);
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

	public static class B_router_idContext extends ParserRuleContext {
		public Ip_addressContext id;
		public TerminalNode ROUTER_ID() { return getToken(CumulusNcluParser.ROUTER_ID, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Ip_addressContext ip_address() {
			return getRuleContext(Ip_addressContext.class,0);
		}
		public B_router_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b_router_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterB_router_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitB_router_id(this);
		}
	}

	public final B_router_idContext b_router_id() throws RecognitionException {
		B_router_idContext _localctx = new B_router_idContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_b_router_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			match(ROUTER_ID);
			setState(911);
			((B_router_idContext)_localctx).id = ip_address();
			setState(912);
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

	public static class B_vrfContext extends ParserRuleContext {
		public WordContext name;
		public TerminalNode VRF() { return getToken(CumulusNcluParser.VRF, 0); }
		public B_commonContext b_common() {
			return getRuleContext(B_commonContext.class,0);
		}
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public B_vrfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b_vrf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterB_vrf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitB_vrf(this);
		}
	}

	public final B_vrfContext b_vrf() throws RecognitionException {
		B_vrfContext _localctx = new B_vrfContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_b_vrf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			match(VRF);
			setState(915);
			((B_vrfContext)_localctx).name = word();
			setState(916);
			b_common();
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

	public static class Frr_routerContext extends ParserRuleContext {
		public TerminalNode ROUTER() { return getToken(CumulusNcluParser.ROUTER, 0); }
		public Frr_null_rest_of_lineContext frr_null_rest_of_line() {
			return getRuleContext(Frr_null_rest_of_lineContext.class,0);
		}
		public Frr_routerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frr_router; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterFrr_router(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitFrr_router(this);
		}
	}

	public final Frr_routerContext frr_router() throws RecognitionException {
		Frr_routerContext _localctx = new Frr_routerContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_frr_router);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(918);
			match(ROUTER);
			setState(919);
			frr_null_rest_of_line();
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

	public static class Frr_vrfContext extends ParserRuleContext {
		public WordContext name;
		public TerminalNode VRF() { return getToken(CumulusNcluParser.VRF, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public List<Frrv_ip_routeContext> frrv_ip_route() {
			return getRuleContexts(Frrv_ip_routeContext.class);
		}
		public Frrv_ip_routeContext frrv_ip_route(int i) {
			return getRuleContext(Frrv_ip_routeContext.class,i);
		}
		public Frr_exit_vrfContext frr_exit_vrf() {
			return getRuleContext(Frr_exit_vrfContext.class,0);
		}
		public Frr_vrfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frr_vrf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterFrr_vrf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitFrr_vrf(this);
		}
	}

	public final Frr_vrfContext frr_vrf() throws RecognitionException {
		Frr_vrfContext _localctx = new Frr_vrfContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_frr_vrf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(921);
			match(VRF);
			setState(922);
			((Frr_vrfContext)_localctx).name = word();
			setState(923);
			match(NEWLINE);
			setState(927);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IP) {
				{
				{
				setState(924);
				frrv_ip_route();
				}
				}
				setState(929);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(931);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXIT_VRF) {
				{
				setState(930);
				frr_exit_vrf();
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

	public static class Frr_exit_vrfContext extends ParserRuleContext {
		public TerminalNode EXIT_VRF() { return getToken(CumulusNcluParser.EXIT_VRF, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Frr_exit_vrfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frr_exit_vrf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterFrr_exit_vrf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitFrr_exit_vrf(this);
		}
	}

	public final Frr_exit_vrfContext frr_exit_vrf() throws RecognitionException {
		Frr_exit_vrfContext _localctx = new Frr_exit_vrfContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_frr_exit_vrf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			match(EXIT_VRF);
			setState(934);
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

	public static class Frrv_ip_routeContext extends ParserRuleContext {
		public Ip_prefixContext network;
		public Ip_addressContext nhip;
		public TerminalNode IP() { return getToken(CumulusNcluParser.IP, 0); }
		public TerminalNode ROUTE() { return getToken(CumulusNcluParser.ROUTE, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Ip_prefixContext ip_prefix() {
			return getRuleContext(Ip_prefixContext.class,0);
		}
		public Ip_addressContext ip_address() {
			return getRuleContext(Ip_addressContext.class,0);
		}
		public Frrv_ip_routeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frrv_ip_route; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterFrrv_ip_route(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitFrrv_ip_route(this);
		}
	}

	public final Frrv_ip_routeContext frrv_ip_route() throws RecognitionException {
		Frrv_ip_routeContext _localctx = new Frrv_ip_routeContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_frrv_ip_route);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			match(IP);
			setState(937);
			match(ROUTE);
			setState(938);
			((Frrv_ip_routeContext)_localctx).network = ip_prefix();
			setState(939);
			((Frrv_ip_routeContext)_localctx).nhip = ip_address();
			setState(940);
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

	public static class Frr_usernameContext extends ParserRuleContext {
		public TerminalNode USERNAME() { return getToken(CumulusNcluParser.USERNAME, 0); }
		public Frr_null_rest_of_lineContext frr_null_rest_of_line() {
			return getRuleContext(Frr_null_rest_of_lineContext.class,0);
		}
		public Frr_usernameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frr_username; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterFrr_username(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitFrr_username(this);
		}
	}

	public final Frr_usernameContext frr_username() throws RecognitionException {
		Frr_usernameContext _localctx = new Frr_usernameContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_frr_username);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(942);
			match(USERNAME);
			setState(943);
			frr_null_rest_of_line();
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

	public static class Frr_null_rest_of_lineContext extends ParserRuleContext {
		public List<TerminalNode> EXTRA_CONFIGURATION_FOOTER() { return getTokens(CumulusNcluParser.EXTRA_CONFIGURATION_FOOTER); }
		public TerminalNode EXTRA_CONFIGURATION_FOOTER(int i) {
			return getToken(CumulusNcluParser.EXTRA_CONFIGURATION_FOOTER, i);
		}
		public Frr_null_rest_of_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frr_null_rest_of_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterFrr_null_rest_of_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitFrr_null_rest_of_line(this);
		}
	}

	public final Frr_null_rest_of_lineContext frr_null_rest_of_line() throws RecognitionException {
		Frr_null_rest_of_lineContext _localctx = new Frr_null_rest_of_lineContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_frr_null_rest_of_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(948);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALIAS_BODY) | (1L << USERNAME) | (1L << ACCESS) | (1L << ACTIVATE) | (1L << ADD) | (1L << ADDRESS) | (1L << ADDRESS_VIRTUAL) | (1L << ADVERTISE) | (1L << ADVERTISE_ALL_VNI) | (1L << ADVERTISE_DEFAULT_GW) | (1L << AGENTX) | (1L << ALERTS) | (1L << ALIAS) | (1L << ALWAYS_COMPARE_MED) | (1L << ARP_ND_SUPPRESS) | (1L << AS_PATH) | (1L << AUTO) | (1L << AUTONOMOUS_SYSTEM) | (1L << BACKUP_IP) | (1L << BESTPATH) | (1L << BGP) | (1L << BOND) | (1L << BPDUGUARD) | (1L << BRIDGE) | (1L << CLAG) | (1L << COMMIT) | (1L << CONNECTED) | (1L << CRITICAL) | (1L << DATACENTER) | (1L << DEBUGGING) | (1L << DEFAULTS) | (1L << DEL) | (1L << DENY) | (1L << DESCRIPTION) | (1L << DHCP) | (1L << DNS) | (1L << DOT1X) | (1L << EMERGENCIES) | (1L << ERRORS) | (1L << EVPN) | (1L << EXIT_VRF) | (1L << EXTERNAL) | (1L << FORWARD) | (1L << GATEWAY) | (1L << HOSTNAME) | (1L << HWADDRESS) | (1L << IBURST) | (1L << ID) | (1L << INFORMATIONAL) | (1L << INTEGRATED_VTYSH_CONFIG) | (1L << INTERFACE) | (1L << INTERNAL) | (1L << IP) | (1L << IPV4) | (1L << IPV6) | (1L << L2VPN) | (1L << LACP_BYPASS_ALLOW) | (1L << LEARNING) | (1L << LINK) | (1L << LINKLOCAL) | (1L << LO) | (1L << LOCAL_TUNNELIP))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LOG - 64)) | (1L << (LOOPBACK - 64)) | (1L << (MATCH - 64)) | (1L << (MSEC - 64)) | (1L << (MTU - 64)) | (1L << (MULTIPATH_RELAX - 64)) | (1L << (NAMESERVER - 64)) | (1L << (ND - 64)) | (1L << (NEIGHBOR - 64)) | (1L << (NETWORK - 64)) | (1L << (NET - 64)) | (1L << (NO - 64)) | (1L << (NOTIFICATIONS - 64)) | (1L << (NTP - 64)) | (1L << (OFF - 64)) | (1L << (ON - 64)) | (1L << (PEER_GROUP - 64)) | (1L << (PEER_IP - 64)) | (1L << (PERMIT - 64)) | (1L << (PORTADMINEDGE - 64)) | (1L << (PORTAUTOEDGE - 64)) | (1L << (PORTBPDUFILTER - 64)) | (1L << (PORTNETWORK - 64)) | (1L << (PORTRESTROLE - 64)) | (1L << (PORTS - 64)) | (1L << (PRIORITY - 64)) | (1L << (PTP - 64)) | (1L << (PVID - 64)) | (1L << (RA_INTERVAL - 64)) | (1L << (RA_LIFETIME - 64)) | (1L << (REDISTRIBUTE - 64)) | (1L << (REMOTE_AS - 64)) | (1L << (ROUTE - 64)) | (1L << (ROUTER - 64)) | (1L << (ROUTE_MAP - 64)) | (1L << (ROUTE_REFLECTOR_CLIENT - 64)) | (1L << (ROUTER_ID - 64)) | (1L << (ROUTING - 64)) | (1L << (SERVER - 64)) | (1L << (SERVICE - 64)) | (1L << (SLAVES - 64)) | (1L << (SNMP_SERVER - 64)) | (1L << (SOURCE - 64)) | (1L << (SPEED - 64)) | (1L << (STATIC - 64)) | (1L << (STP - 64)) | (1L << (SUPPRESS_RA - 64)) | (1L << (SYS_MAC - 64)) | (1L << (SYSLOG - 64)) | (1L << (TIME - 64)) | (1L << (UNICAST - 64)) | (1L << (VIDS - 64)) | (1L << (VLAN - 64)) | (1L << (VLAN_AWARE - 64)) | (1L << (VLAN_ID - 64)) | (1L << (VLAN_RAW_DEVICE - 64)) | (1L << (VNI - 64)) | (1L << (VRF - 64)) | (1L << (VRF_TABLE - 64)) | (1L << (VXLAN - 64)) | (1L << (VXLAN_ANYCAST_IP - 64)) | (1L << (WARNINGS - 64)) | (1L << (ZONE - 64)) | (1L << (EXTRA_CONFIGURATION_HEADER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (COMMA - 128)) | (1L << (COMMENT_LINE - 128)) | (1L << (COMMENT_TAIL - 128)) | (1L << (DASH - 128)) | (1L << (DEC - 128)) | (1L << (IP_ADDRESS - 128)) | (1L << (IP_PREFIX - 128)) | (1L << (IPV6_ADDRESS - 128)) | (1L << (IPV6_PREFIX - 128)) | (1L << (MAC_ADDRESS - 128)) | (1L << (NEWLINE - 128)) | (1L << (NUMBERED_WORD - 128)) | (1L << (WORD - 128)) | (1L << (WS - 128)) | (1L << (M_Alias_WS - 128)) | (1L << (M_Printf_WS - 128)) | (1L << (M_Printf_EXTRA_CONFIGURATION_FOOTER - 128)) | (1L << (M_Printf_NEWLINE - 128)) | (1L << (M_Printf_USERNAME - 128)))) != 0)) {
				{
				{
				setState(945);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==EXTRA_CONFIGURATION_FOOTER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(950);
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

	public static class Frr_unrecognizedContext extends ParserRuleContext {
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public Frr_null_rest_of_lineContext frr_null_rest_of_line() {
			return getRuleContext(Frr_null_rest_of_lineContext.class,0);
		}
		public Frr_unrecognizedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frr_unrecognized; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterFrr_unrecognized(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitFrr_unrecognized(this);
		}
	}

	public final Frr_unrecognizedContext frr_unrecognized() throws RecognitionException {
		Frr_unrecognizedContext _localctx = new Frr_unrecognizedContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_frr_unrecognized);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(951);
			word();
			setState(952);
			frr_null_rest_of_line();
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

	public static class A_interfaceContext extends ParserRuleContext {
		public GlobContext interfaces;
		public TerminalNode INTERFACE() { return getToken(CumulusNcluParser.INTERFACE, 0); }
		public GlobContext glob() {
			return getRuleContext(GlobContext.class,0);
		}
		public I_aliasContext i_alias() {
			return getRuleContext(I_aliasContext.class,0);
		}
		public I_bridgeContext i_bridge() {
			return getRuleContext(I_bridgeContext.class,0);
		}
		public I_clagContext i_clag() {
			return getRuleContext(I_clagContext.class,0);
		}
		public I_ip_addressContext i_ip_address() {
			return getRuleContext(I_ip_addressContext.class,0);
		}
		public I_ipv6Context i_ipv6() {
			return getRuleContext(I_ipv6Context.class,0);
		}
		public I_link_speedContext i_link_speed() {
			return getRuleContext(I_link_speedContext.class,0);
		}
		public I_mtuContext i_mtu() {
			return getRuleContext(I_mtuContext.class,0);
		}
		public I_vrfContext i_vrf() {
			return getRuleContext(I_vrfContext.class,0);
		}
		public Stp_commonContext stp_common() {
			return getRuleContext(Stp_commonContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public A_interfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_interface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterA_interface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitA_interface(this);
		}
	}

	public final A_interfaceContext a_interface() throws RecognitionException {
		A_interfaceContext _localctx = new A_interfaceContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_a_interface);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			match(INTERFACE);
			setState(955);
			((A_interfaceContext)_localctx).interfaces = glob();
			setState(966);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALIAS:
				{
				setState(956);
				i_alias();
				}
				break;
			case BRIDGE:
				{
				setState(957);
				i_bridge();
				}
				break;
			case CLAG:
				{
				setState(958);
				i_clag();
				}
				break;
			case IP:
				{
				setState(959);
				i_ip_address();
				}
				break;
			case IPV6:
				{
				setState(960);
				i_ipv6();
				}
				break;
			case LINK:
				{
				setState(961);
				i_link_speed();
				}
				break;
			case MTU:
				{
				setState(962);
				i_mtu();
				}
				break;
			case VRF:
				{
				setState(963);
				i_vrf();
				}
				break;
			case STP:
				{
				setState(964);
				stp_common();
				}
				break;
			case NEWLINE:
				{
				setState(965);
				match(NEWLINE);
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

	public static class I_aliasContext extends ParserRuleContext {
		public TerminalNode ALIAS() { return getToken(CumulusNcluParser.ALIAS, 0); }
		public TerminalNode ALIAS_BODY() { return getToken(CumulusNcluParser.ALIAS_BODY, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public I_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterI_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitI_alias(this);
		}
	}

	public final I_aliasContext i_alias() throws RecognitionException {
		I_aliasContext _localctx = new I_aliasContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_i_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			match(ALIAS);
			setState(969);
			match(ALIAS_BODY);
			setState(970);
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

	public static class I_bridgeContext extends ParserRuleContext {
		public TerminalNode BRIDGE() { return getToken(CumulusNcluParser.BRIDGE, 0); }
		public Ib_accessContext ib_access() {
			return getRuleContext(Ib_accessContext.class,0);
		}
		public Ib_pvidContext ib_pvid() {
			return getRuleContext(Ib_pvidContext.class,0);
		}
		public Ib_vidsContext ib_vids() {
			return getRuleContext(Ib_vidsContext.class,0);
		}
		public I_bridgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_bridge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterI_bridge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitI_bridge(this);
		}
	}

	public final I_bridgeContext i_bridge() throws RecognitionException {
		I_bridgeContext _localctx = new I_bridgeContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_i_bridge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(972);
			match(BRIDGE);
			setState(976);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACCESS:
				{
				setState(973);
				ib_access();
				}
				break;
			case PVID:
				{
				setState(974);
				ib_pvid();
				}
				break;
			case VIDS:
				{
				setState(975);
				ib_vids();
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

	public static class Ib_accessContext extends ParserRuleContext {
		public Vlan_idContext vlan;
		public TerminalNode ACCESS() { return getToken(CumulusNcluParser.ACCESS, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Vlan_idContext vlan_id() {
			return getRuleContext(Vlan_idContext.class,0);
		}
		public Ib_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ib_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterIb_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitIb_access(this);
		}
	}

	public final Ib_accessContext ib_access() throws RecognitionException {
		Ib_accessContext _localctx = new Ib_accessContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_ib_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
			match(ACCESS);
			setState(979);
			((Ib_accessContext)_localctx).vlan = vlan_id();
			setState(980);
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

	public static class Ib_pvidContext extends ParserRuleContext {
		public Vlan_idContext id;
		public TerminalNode PVID() { return getToken(CumulusNcluParser.PVID, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Vlan_idContext vlan_id() {
			return getRuleContext(Vlan_idContext.class,0);
		}
		public Ib_pvidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ib_pvid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterIb_pvid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitIb_pvid(this);
		}
	}

	public final Ib_pvidContext ib_pvid() throws RecognitionException {
		Ib_pvidContext _localctx = new Ib_pvidContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_ib_pvid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(982);
			match(PVID);
			setState(983);
			((Ib_pvidContext)_localctx).id = vlan_id();
			setState(984);
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

	public static class Ib_vidsContext extends ParserRuleContext {
		public Vlan_range_setContext vlans;
		public TerminalNode VIDS() { return getToken(CumulusNcluParser.VIDS, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Vlan_range_setContext vlan_range_set() {
			return getRuleContext(Vlan_range_setContext.class,0);
		}
		public Ib_vidsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ib_vids; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterIb_vids(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitIb_vids(this);
		}
	}

	public final Ib_vidsContext ib_vids() throws RecognitionException {
		Ib_vidsContext _localctx = new Ib_vidsContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_ib_vids);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
			match(VIDS);
			setState(987);
			((Ib_vidsContext)_localctx).vlans = vlan_range_set();
			setState(988);
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

	public static class I_clagContext extends ParserRuleContext {
		public TerminalNode CLAG() { return getToken(CumulusNcluParser.CLAG, 0); }
		public Ic_backup_ipContext ic_backup_ip() {
			return getRuleContext(Ic_backup_ipContext.class,0);
		}
		public Ic_peer_ipContext ic_peer_ip() {
			return getRuleContext(Ic_peer_ipContext.class,0);
		}
		public Ic_priorityContext ic_priority() {
			return getRuleContext(Ic_priorityContext.class,0);
		}
		public Ic_sys_macContext ic_sys_mac() {
			return getRuleContext(Ic_sys_macContext.class,0);
		}
		public I_clagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_clag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterI_clag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitI_clag(this);
		}
	}

	public final I_clagContext i_clag() throws RecognitionException {
		I_clagContext _localctx = new I_clagContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_i_clag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			match(CLAG);
			setState(995);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BACKUP_IP:
				{
				setState(991);
				ic_backup_ip();
				}
				break;
			case PEER_IP:
				{
				setState(992);
				ic_peer_ip();
				}
				break;
			case PRIORITY:
				{
				setState(993);
				ic_priority();
				}
				break;
			case SYS_MAC:
				{
				setState(994);
				ic_sys_mac();
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

	public static class Ic_backup_ipContext extends ParserRuleContext {
		public Ip_addressContext backup_ip;
		public WordContext vrf;
		public TerminalNode BACKUP_IP() { return getToken(CumulusNcluParser.BACKUP_IP, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Ip_addressContext ip_address() {
			return getRuleContext(Ip_addressContext.class,0);
		}
		public TerminalNode VRF() { return getToken(CumulusNcluParser.VRF, 0); }
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public Ic_backup_ipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ic_backup_ip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterIc_backup_ip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitIc_backup_ip(this);
		}
	}

	public final Ic_backup_ipContext ic_backup_ip() throws RecognitionException {
		Ic_backup_ipContext _localctx = new Ic_backup_ipContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_ic_backup_ip);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			match(BACKUP_IP);
			setState(998);
			((Ic_backup_ipContext)_localctx).backup_ip = ip_address();
			setState(1001);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VRF) {
				{
				setState(999);
				match(VRF);
				setState(1000);
				((Ic_backup_ipContext)_localctx).vrf = word();
				}
			}

			setState(1003);
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

	public static class Ic_peer_ipContext extends ParserRuleContext {
		public Ip_addressContext peer_ip;
		public TerminalNode PEER_IP() { return getToken(CumulusNcluParser.PEER_IP, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public TerminalNode LINKLOCAL() { return getToken(CumulusNcluParser.LINKLOCAL, 0); }
		public Ip_addressContext ip_address() {
			return getRuleContext(Ip_addressContext.class,0);
		}
		public Ic_peer_ipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ic_peer_ip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterIc_peer_ip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitIc_peer_ip(this);
		}
	}

	public final Ic_peer_ipContext ic_peer_ip() throws RecognitionException {
		Ic_peer_ipContext _localctx = new Ic_peer_ipContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_ic_peer_ip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1005);
			match(PEER_IP);
			setState(1008);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IP_ADDRESS:
				{
				setState(1006);
				((Ic_peer_ipContext)_localctx).peer_ip = ip_address();
				}
				break;
			case LINKLOCAL:
				{
				setState(1007);
				match(LINKLOCAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1010);
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

	public static class Ic_priorityContext extends ParserRuleContext {
		public Uint16Context priority;
		public TerminalNode PRIORITY() { return getToken(CumulusNcluParser.PRIORITY, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Uint16Context uint16() {
			return getRuleContext(Uint16Context.class,0);
		}
		public Ic_priorityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ic_priority; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterIc_priority(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitIc_priority(this);
		}
	}

	public final Ic_priorityContext ic_priority() throws RecognitionException {
		Ic_priorityContext _localctx = new Ic_priorityContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_ic_priority);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1012);
			match(PRIORITY);
			setState(1013);
			((Ic_priorityContext)_localctx).priority = uint16();
			setState(1014);
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

	public static class Ic_sys_macContext extends ParserRuleContext {
		public Mac_addressContext mac;
		public TerminalNode SYS_MAC() { return getToken(CumulusNcluParser.SYS_MAC, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Mac_addressContext mac_address() {
			return getRuleContext(Mac_addressContext.class,0);
		}
		public Ic_sys_macContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ic_sys_mac; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterIc_sys_mac(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitIc_sys_mac(this);
		}
	}

	public final Ic_sys_macContext ic_sys_mac() throws RecognitionException {
		Ic_sys_macContext _localctx = new Ic_sys_macContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_ic_sys_mac);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1016);
			match(SYS_MAC);
			setState(1017);
			((Ic_sys_macContext)_localctx).mac = mac_address();
			setState(1018);
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

	public static class I_ip_addressContext extends ParserRuleContext {
		public Interface_addressContext address;
		public TerminalNode IP() { return getToken(CumulusNcluParser.IP, 0); }
		public TerminalNode ADDRESS() { return getToken(CumulusNcluParser.ADDRESS, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Interface_addressContext interface_address() {
			return getRuleContext(Interface_addressContext.class,0);
		}
		public I_ip_addressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_ip_address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterI_ip_address(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitI_ip_address(this);
		}
	}

	public final I_ip_addressContext i_ip_address() throws RecognitionException {
		I_ip_addressContext _localctx = new I_ip_addressContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_i_ip_address);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1020);
			match(IP);
			setState(1021);
			match(ADDRESS);
			setState(1022);
			((I_ip_addressContext)_localctx).address = interface_address();
			setState(1023);
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

	public static class I_ipv6Context extends ParserRuleContext {
		public TerminalNode IPV6() { return getToken(CumulusNcluParser.IPV6, 0); }
		public Iv6_addressContext iv6_address() {
			return getRuleContext(Iv6_addressContext.class,0);
		}
		public Iv6_address_virtualContext iv6_address_virtual() {
			return getRuleContext(Iv6_address_virtualContext.class,0);
		}
		public Iv6_forwardContext iv6_forward() {
			return getRuleContext(Iv6_forwardContext.class,0);
		}
		public Iv6_gatewayContext iv6_gateway() {
			return getRuleContext(Iv6_gatewayContext.class,0);
		}
		public Iv6_ndContext iv6_nd() {
			return getRuleContext(Iv6_ndContext.class,0);
		}
		public I_ipv6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_ipv6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterI_ipv6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitI_ipv6(this);
		}
	}

	public final I_ipv6Context i_ipv6() throws RecognitionException {
		I_ipv6Context _localctx = new I_ipv6Context(_ctx, getState());
		enterRule(_localctx, 272, RULE_i_ipv6);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1025);
			match(IPV6);
			setState(1031);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADDRESS:
				{
				setState(1026);
				iv6_address();
				}
				break;
			case ADDRESS_VIRTUAL:
				{
				setState(1027);
				iv6_address_virtual();
				}
				break;
			case FORWARD:
				{
				setState(1028);
				iv6_forward();
				}
				break;
			case GATEWAY:
				{
				setState(1029);
				iv6_gateway();
				}
				break;
			case ND:
				{
				setState(1030);
				iv6_nd();
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

	public static class I_link_speedContext extends ParserRuleContext {
		public Uint32Context speed;
		public TerminalNode LINK() { return getToken(CumulusNcluParser.LINK, 0); }
		public TerminalNode SPEED() { return getToken(CumulusNcluParser.SPEED, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Uint32Context uint32() {
			return getRuleContext(Uint32Context.class,0);
		}
		public I_link_speedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_link_speed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterI_link_speed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitI_link_speed(this);
		}
	}

	public final I_link_speedContext i_link_speed() throws RecognitionException {
		I_link_speedContext _localctx = new I_link_speedContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_i_link_speed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1033);
			match(LINK);
			setState(1034);
			match(SPEED);
			setState(1035);
			((I_link_speedContext)_localctx).speed = uint32();
			setState(1036);
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
		public Uint16Context mtu;
		public TerminalNode MTU() { return getToken(CumulusNcluParser.MTU, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Uint16Context uint16() {
			return getRuleContext(Uint16Context.class,0);
		}
		public I_mtuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_mtu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterI_mtu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitI_mtu(this);
		}
	}

	public final I_mtuContext i_mtu() throws RecognitionException {
		I_mtuContext _localctx = new I_mtuContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_i_mtu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
			match(MTU);
			setState(1039);
			((I_mtuContext)_localctx).mtu = uint16();
			setState(1040);
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

	public static class Iv6_addressContext extends ParserRuleContext {
		public TerminalNode ADDRESS() { return getToken(CumulusNcluParser.ADDRESS, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public TerminalNode IPV6_PREFIX() { return getToken(CumulusNcluParser.IPV6_PREFIX, 0); }
		public TerminalNode DHCP() { return getToken(CumulusNcluParser.DHCP, 0); }
		public Iv6_addressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iv6_address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterIv6_address(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitIv6_address(this);
		}
	}

	public final Iv6_addressContext iv6_address() throws RecognitionException {
		Iv6_addressContext _localctx = new Iv6_addressContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_iv6_address);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1042);
			match(ADDRESS);
			setState(1043);
			_la = _input.LA(1);
			if ( !(_la==DHCP || _la==IPV6_PREFIX) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1044);
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

	public static class Iv6_address_virtualContext extends ParserRuleContext {
		public Token mac;
		public TerminalNode ADDRESS_VIRTUAL() { return getToken(CumulusNcluParser.ADDRESS_VIRTUAL, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public TerminalNode MAC_ADDRESS() { return getToken(CumulusNcluParser.MAC_ADDRESS, 0); }
		public Iv6_address_virtualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iv6_address_virtual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterIv6_address_virtual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitIv6_address_virtual(this);
		}
	}

	public final Iv6_address_virtualContext iv6_address_virtual() throws RecognitionException {
		Iv6_address_virtualContext _localctx = new Iv6_address_virtualContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_iv6_address_virtual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
			match(ADDRESS_VIRTUAL);
			setState(1047);
			((Iv6_address_virtualContext)_localctx).mac = match(MAC_ADDRESS);
			setState(1048);
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

	public static class Iv6_forwardContext extends ParserRuleContext {
		public TerminalNode FORWARD() { return getToken(CumulusNcluParser.FORWARD, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public ZeroContext zero() {
			return getRuleContext(ZeroContext.class,0);
		}
		public TerminalNode NO() { return getToken(CumulusNcluParser.NO, 0); }
		public TerminalNode OFF() { return getToken(CumulusNcluParser.OFF, 0); }
		public Iv6_forwardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iv6_forward; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterIv6_forward(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitIv6_forward(this);
		}
	}

	public final Iv6_forwardContext iv6_forward() throws RecognitionException {
		Iv6_forwardContext _localctx = new Iv6_forwardContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_iv6_forward);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1050);
			match(FORWARD);
			setState(1054);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEC:
				{
				setState(1051);
				zero();
				}
				break;
			case NO:
				{
				setState(1052);
				match(NO);
				}
				break;
			case OFF:
				{
				setState(1053);
				match(OFF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1056);
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

	public static class Iv6_gatewayContext extends ParserRuleContext {
		public TerminalNode GATEWAY() { return getToken(CumulusNcluParser.GATEWAY, 0); }
		public TerminalNode IPV6_ADDRESS() { return getToken(CumulusNcluParser.IPV6_ADDRESS, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Iv6_gatewayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iv6_gateway; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterIv6_gateway(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitIv6_gateway(this);
		}
	}

	public final Iv6_gatewayContext iv6_gateway() throws RecognitionException {
		Iv6_gatewayContext _localctx = new Iv6_gatewayContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_iv6_gateway);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
			match(GATEWAY);
			setState(1059);
			match(IPV6_ADDRESS);
			setState(1060);
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

	public static class Iv6_ndContext extends ParserRuleContext {
		public TerminalNode ND() { return getToken(CumulusNcluParser.ND, 0); }
		public TerminalNode IPV6_PREFIX() { return getToken(CumulusNcluParser.IPV6_PREFIX, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Iv6_ra_intervalContext iv6_ra_interval() {
			return getRuleContext(Iv6_ra_intervalContext.class,0);
		}
		public Iv6_ra_lifetimeContext iv6_ra_lifetime() {
			return getRuleContext(Iv6_ra_lifetimeContext.class,0);
		}
		public Iv6_suppress_raContext iv6_suppress_ra() {
			return getRuleContext(Iv6_suppress_raContext.class,0);
		}
		public Iv6_ndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iv6_nd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterIv6_nd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitIv6_nd(this);
		}
	}

	public final Iv6_ndContext iv6_nd() throws RecognitionException {
		Iv6_ndContext _localctx = new Iv6_ndContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_iv6_nd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1062);
			match(ND);
			setState(1068);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IPV6_PREFIX:
				{
				setState(1063);
				match(IPV6_PREFIX);
				setState(1064);
				match(NEWLINE);
				}
				break;
			case RA_INTERVAL:
				{
				setState(1065);
				iv6_ra_interval();
				}
				break;
			case RA_LIFETIME:
				{
				setState(1066);
				iv6_ra_lifetime();
				}
				break;
			case SUPPRESS_RA:
				{
				setState(1067);
				iv6_suppress_ra();
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

	public static class Iv6_ra_intervalContext extends ParserRuleContext {
		public Uint16Context interval;
		public Uint32Context msecs;
		public TerminalNode RA_INTERVAL() { return getToken(CumulusNcluParser.RA_INTERVAL, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public TerminalNode MSEC() { return getToken(CumulusNcluParser.MSEC, 0); }
		public Uint16Context uint16() {
			return getRuleContext(Uint16Context.class,0);
		}
		public Uint32Context uint32() {
			return getRuleContext(Uint32Context.class,0);
		}
		public Iv6_ra_intervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iv6_ra_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterIv6_ra_interval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitIv6_ra_interval(this);
		}
	}

	public final Iv6_ra_intervalContext iv6_ra_interval() throws RecognitionException {
		Iv6_ra_intervalContext _localctx = new Iv6_ra_intervalContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_iv6_ra_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1070);
			match(RA_INTERVAL);
			setState(1074);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEC:
				{
				setState(1071);
				((Iv6_ra_intervalContext)_localctx).interval = uint16();
				}
				break;
			case MSEC:
				{
				setState(1072);
				match(MSEC);
				setState(1073);
				((Iv6_ra_intervalContext)_localctx).msecs = uint32();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1076);
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

	public static class Iv6_ra_lifetimeContext extends ParserRuleContext {
		public Uint16Context val;
		public TerminalNode RA_LIFETIME() { return getToken(CumulusNcluParser.RA_LIFETIME, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Uint16Context uint16() {
			return getRuleContext(Uint16Context.class,0);
		}
		public Iv6_ra_lifetimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iv6_ra_lifetime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterIv6_ra_lifetime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitIv6_ra_lifetime(this);
		}
	}

	public final Iv6_ra_lifetimeContext iv6_ra_lifetime() throws RecognitionException {
		Iv6_ra_lifetimeContext _localctx = new Iv6_ra_lifetimeContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_iv6_ra_lifetime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
			match(RA_LIFETIME);
			setState(1079);
			((Iv6_ra_lifetimeContext)_localctx).val = uint16();
			setState(1080);
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

	public static class Iv6_suppress_raContext extends ParserRuleContext {
		public TerminalNode SUPPRESS_RA() { return getToken(CumulusNcluParser.SUPPRESS_RA, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Iv6_suppress_raContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iv6_suppress_ra; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterIv6_suppress_ra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitIv6_suppress_ra(this);
		}
	}

	public final Iv6_suppress_raContext iv6_suppress_ra() throws RecognitionException {
		Iv6_suppress_raContext _localctx = new Iv6_suppress_raContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_iv6_suppress_ra);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1082);
			match(SUPPRESS_RA);
			setState(1083);
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
		public WordContext name;
		public TerminalNode VRF() { return getToken(CumulusNcluParser.VRF, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public I_vrfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_vrf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterI_vrf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitI_vrf(this);
		}
	}

	public final I_vrfContext i_vrf() throws RecognitionException {
		I_vrfContext _localctx = new I_vrfContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_i_vrf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085);
			match(VRF);
			setState(1086);
			((I_vrfContext)_localctx).name = word();
			setState(1087);
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

	public static class Stp_commonContext extends ParserRuleContext {
		public TerminalNode STP() { return getToken(CumulusNcluParser.STP, 0); }
		public Stp_bpduguardContext stp_bpduguard() {
			return getRuleContext(Stp_bpduguardContext.class,0);
		}
		public Stp_portadminedgeContext stp_portadminedge() {
			return getRuleContext(Stp_portadminedgeContext.class,0);
		}
		public Stp_portautoedgeContext stp_portautoedge() {
			return getRuleContext(Stp_portautoedgeContext.class,0);
		}
		public Stp_portbpdufilterContext stp_portbpdufilter() {
			return getRuleContext(Stp_portbpdufilterContext.class,0);
		}
		public Stp_portnetworkContext stp_portnetwork() {
			return getRuleContext(Stp_portnetworkContext.class,0);
		}
		public Stp_portrestrroleContext stp_portrestrrole() {
			return getRuleContext(Stp_portrestrroleContext.class,0);
		}
		public Stp_commonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stp_common; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterStp_common(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitStp_common(this);
		}
	}

	public final Stp_commonContext stp_common() throws RecognitionException {
		Stp_commonContext _localctx = new Stp_commonContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_stp_common);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1089);
			match(STP);
			setState(1096);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BPDUGUARD:
				{
				setState(1090);
				stp_bpduguard();
				}
				break;
			case PORTADMINEDGE:
				{
				setState(1091);
				stp_portadminedge();
				}
				break;
			case PORTAUTOEDGE:
				{
				setState(1092);
				stp_portautoedge();
				}
				break;
			case PORTBPDUFILTER:
				{
				setState(1093);
				stp_portbpdufilter();
				}
				break;
			case PORTNETWORK:
				{
				setState(1094);
				stp_portnetwork();
				}
				break;
			case PORTRESTROLE:
				{
				setState(1095);
				stp_portrestrrole();
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

	public static class Stp_bpduguardContext extends ParserRuleContext {
		public TerminalNode BPDUGUARD() { return getToken(CumulusNcluParser.BPDUGUARD, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Stp_bpduguardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stp_bpduguard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterStp_bpduguard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitStp_bpduguard(this);
		}
	}

	public final Stp_bpduguardContext stp_bpduguard() throws RecognitionException {
		Stp_bpduguardContext _localctx = new Stp_bpduguardContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_stp_bpduguard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1098);
			match(BPDUGUARD);
			setState(1099);
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

	public static class Stp_portadminedgeContext extends ParserRuleContext {
		public TerminalNode PORTADMINEDGE() { return getToken(CumulusNcluParser.PORTADMINEDGE, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Stp_portadminedgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stp_portadminedge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterStp_portadminedge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitStp_portadminedge(this);
		}
	}

	public final Stp_portadminedgeContext stp_portadminedge() throws RecognitionException {
		Stp_portadminedgeContext _localctx = new Stp_portadminedgeContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_stp_portadminedge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1101);
			match(PORTADMINEDGE);
			setState(1102);
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

	public static class Stp_portautoedgeContext extends ParserRuleContext {
		public TerminalNode PORTAUTOEDGE() { return getToken(CumulusNcluParser.PORTAUTOEDGE, 0); }
		public TerminalNode NO() { return getToken(CumulusNcluParser.NO, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Stp_portautoedgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stp_portautoedge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterStp_portautoedge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitStp_portautoedge(this);
		}
	}

	public final Stp_portautoedgeContext stp_portautoedge() throws RecognitionException {
		Stp_portautoedgeContext _localctx = new Stp_portautoedgeContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_stp_portautoedge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1104);
			match(PORTAUTOEDGE);
			setState(1105);
			match(NO);
			setState(1106);
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

	public static class Stp_portbpdufilterContext extends ParserRuleContext {
		public TerminalNode PORTBPDUFILTER() { return getToken(CumulusNcluParser.PORTBPDUFILTER, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Stp_portbpdufilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stp_portbpdufilter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterStp_portbpdufilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitStp_portbpdufilter(this);
		}
	}

	public final Stp_portbpdufilterContext stp_portbpdufilter() throws RecognitionException {
		Stp_portbpdufilterContext _localctx = new Stp_portbpdufilterContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_stp_portbpdufilter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1108);
			match(PORTBPDUFILTER);
			setState(1109);
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

	public static class Stp_portnetworkContext extends ParserRuleContext {
		public TerminalNode PORTNETWORK() { return getToken(CumulusNcluParser.PORTNETWORK, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Stp_portnetworkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stp_portnetwork; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterStp_portnetwork(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitStp_portnetwork(this);
		}
	}

	public final Stp_portnetworkContext stp_portnetwork() throws RecognitionException {
		Stp_portnetworkContext _localctx = new Stp_portnetworkContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_stp_portnetwork);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1111);
			match(PORTNETWORK);
			setState(1112);
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

	public static class Stp_portrestrroleContext extends ParserRuleContext {
		public TerminalNode PORTRESTROLE() { return getToken(CumulusNcluParser.PORTRESTROLE, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Stp_portrestrroleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stp_portrestrrole; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterStp_portrestrrole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitStp_portrestrrole(this);
		}
	}

	public final Stp_portrestrroleContext stp_portrestrrole() throws RecognitionException {
		Stp_portrestrroleContext _localctx = new Stp_portrestrroleContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_stp_portrestrrole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1114);
			match(PORTRESTROLE);
			setState(1115);
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

	public static class A_routingContext extends ParserRuleContext {
		public TerminalNode ROUTING() { return getToken(CumulusNcluParser.ROUTING, 0); }
		public R_agentxContext r_agentx() {
			return getRuleContext(R_agentxContext.class,0);
		}
		public R_defaults_datacenterContext r_defaults_datacenter() {
			return getRuleContext(R_defaults_datacenterContext.class,0);
		}
		public R_logContext r_log() {
			return getRuleContext(R_logContext.class,0);
		}
		public R_routeContext r_route() {
			return getRuleContext(R_routeContext.class,0);
		}
		public R_route_mapContext r_route_map() {
			return getRuleContext(R_route_mapContext.class,0);
		}
		public R_service_integrated_vtysh_configContext r_service_integrated_vtysh_config() {
			return getRuleContext(R_service_integrated_vtysh_configContext.class,0);
		}
		public A_routingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_routing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterA_routing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitA_routing(this);
		}
	}

	public final A_routingContext a_routing() throws RecognitionException {
		A_routingContext _localctx = new A_routingContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_a_routing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1117);
			match(ROUTING);
			setState(1124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AGENTX:
				{
				setState(1118);
				r_agentx();
				}
				break;
			case DEFAULTS:
				{
				setState(1119);
				r_defaults_datacenter();
				}
				break;
			case LOG:
				{
				setState(1120);
				r_log();
				}
				break;
			case ROUTE:
				{
				setState(1121);
				r_route();
				}
				break;
			case ROUTE_MAP:
				{
				setState(1122);
				r_route_map();
				}
				break;
			case SERVICE:
				{
				setState(1123);
				r_service_integrated_vtysh_config();
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

	public static class R_agentxContext extends ParserRuleContext {
		public TerminalNode AGENTX() { return getToken(CumulusNcluParser.AGENTX, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public R_agentxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_agentx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterR_agentx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitR_agentx(this);
		}
	}

	public final R_agentxContext r_agentx() throws RecognitionException {
		R_agentxContext _localctx = new R_agentxContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_r_agentx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1126);
			match(AGENTX);
			setState(1127);
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

	public static class R_defaults_datacenterContext extends ParserRuleContext {
		public TerminalNode DEFAULTS() { return getToken(CumulusNcluParser.DEFAULTS, 0); }
		public TerminalNode DATACENTER() { return getToken(CumulusNcluParser.DATACENTER, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public R_defaults_datacenterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_defaults_datacenter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterR_defaults_datacenter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitR_defaults_datacenter(this);
		}
	}

	public final R_defaults_datacenterContext r_defaults_datacenter() throws RecognitionException {
		R_defaults_datacenterContext _localctx = new R_defaults_datacenterContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_r_defaults_datacenter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1129);
			match(DEFAULTS);
			setState(1130);
			match(DATACENTER);
			setState(1131);
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

	public static class R_logContext extends ParserRuleContext {
		public TerminalNode LOG() { return getToken(CumulusNcluParser.LOG, 0); }
		public Rl_syslogContext rl_syslog() {
			return getRuleContext(Rl_syslogContext.class,0);
		}
		public R_logContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_log; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterR_log(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitR_log(this);
		}
	}

	public final R_logContext r_log() throws RecognitionException {
		R_logContext _localctx = new R_logContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_r_log);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1133);
			match(LOG);
			setState(1134);
			rl_syslog();
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

	public static class Rl_syslogContext extends ParserRuleContext {
		public TerminalNode SYSLOG() { return getToken(CumulusNcluParser.SYSLOG, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public TerminalNode ALERTS() { return getToken(CumulusNcluParser.ALERTS, 0); }
		public TerminalNode CRITICAL() { return getToken(CumulusNcluParser.CRITICAL, 0); }
		public TerminalNode DEBUGGING() { return getToken(CumulusNcluParser.DEBUGGING, 0); }
		public TerminalNode EMERGENCIES() { return getToken(CumulusNcluParser.EMERGENCIES, 0); }
		public TerminalNode ERRORS() { return getToken(CumulusNcluParser.ERRORS, 0); }
		public TerminalNode INFORMATIONAL() { return getToken(CumulusNcluParser.INFORMATIONAL, 0); }
		public TerminalNode NOTIFICATIONS() { return getToken(CumulusNcluParser.NOTIFICATIONS, 0); }
		public TerminalNode WARNINGS() { return getToken(CumulusNcluParser.WARNINGS, 0); }
		public Rl_syslogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rl_syslog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterRl_syslog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitRl_syslog(this);
		}
	}

	public final Rl_syslogContext rl_syslog() throws RecognitionException {
		Rl_syslogContext _localctx = new Rl_syslogContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_rl_syslog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1136);
			match(SYSLOG);
			setState(1138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALERTS) | (1L << CRITICAL) | (1L << DEBUGGING) | (1L << EMERGENCIES) | (1L << ERRORS) | (1L << INFORMATIONAL))) != 0) || _la==NOTIFICATIONS || _la==WARNINGS) {
				{
				setState(1137);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALERTS) | (1L << CRITICAL) | (1L << DEBUGGING) | (1L << EMERGENCIES) | (1L << ERRORS) | (1L << INFORMATIONAL))) != 0) || _la==NOTIFICATIONS || _la==WARNINGS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1140);
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

	public static class R_routeContext extends ParserRuleContext {
		public Ip_prefixContext prefix;
		public Ip_addressContext nhip;
		public WordContext iface;
		public TerminalNode ROUTE() { return getToken(CumulusNcluParser.ROUTE, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public Ip_prefixContext ip_prefix() {
			return getRuleContext(Ip_prefixContext.class,0);
		}
		public Ip_addressContext ip_address() {
			return getRuleContext(Ip_addressContext.class,0);
		}
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public R_routeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_route; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterR_route(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitR_route(this);
		}
	}

	public final R_routeContext r_route() throws RecognitionException {
		R_routeContext _localctx = new R_routeContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_r_route);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1142);
			match(ROUTE);
			setState(1143);
			((R_routeContext)_localctx).prefix = ip_prefix();
			setState(1146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(1144);
				((R_routeContext)_localctx).nhip = ip_address();
				}
				break;
			case 2:
				{
				setState(1145);
				((R_routeContext)_localctx).iface = word();
				}
				break;
			}
			setState(1148);
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

	public static class R_route_mapContext extends ParserRuleContext {
		public WordContext name;
		public Line_actionContext action;
		public Uint16Context num;
		public TerminalNode ROUTE_MAP() { return getToken(CumulusNcluParser.ROUTE_MAP, 0); }
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public Line_actionContext line_action() {
			return getRuleContext(Line_actionContext.class,0);
		}
		public Uint16Context uint16() {
			return getRuleContext(Uint16Context.class,0);
		}
		public Rm_matchContext rm_match() {
			return getRuleContext(Rm_matchContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public R_route_mapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_route_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterR_route_map(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitR_route_map(this);
		}
	}

	public final R_route_mapContext r_route_map() throws RecognitionException {
		R_route_mapContext _localctx = new R_route_mapContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_r_route_map);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1150);
			match(ROUTE_MAP);
			setState(1151);
			((R_route_mapContext)_localctx).name = word();
			setState(1152);
			((R_route_mapContext)_localctx).action = line_action();
			setState(1153);
			((R_route_mapContext)_localctx).num = uint16();
			setState(1156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MATCH:
				{
				setState(1154);
				rm_match();
				}
				break;
			case NEWLINE:
				{
				setState(1155);
				match(NEWLINE);
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

	public static class Rm_matchContext extends ParserRuleContext {
		public TerminalNode MATCH() { return getToken(CumulusNcluParser.MATCH, 0); }
		public Rmm_interfaceContext rmm_interface() {
			return getRuleContext(Rmm_interfaceContext.class,0);
		}
		public Rm_matchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rm_match; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterRm_match(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitRm_match(this);
		}
	}

	public final Rm_matchContext rm_match() throws RecognitionException {
		Rm_matchContext _localctx = new Rm_matchContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_rm_match);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1158);
			match(MATCH);
			setState(1159);
			rmm_interface();
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

	public static class Rmm_interfaceContext extends ParserRuleContext {
		public GlobContext interfaces;
		public TerminalNode INTERFACE() { return getToken(CumulusNcluParser.INTERFACE, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public GlobContext glob() {
			return getRuleContext(GlobContext.class,0);
		}
		public Rmm_interfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rmm_interface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterRmm_interface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitRmm_interface(this);
		}
	}

	public final Rmm_interfaceContext rmm_interface() throws RecognitionException {
		Rmm_interfaceContext _localctx = new Rmm_interfaceContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_rmm_interface);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1161);
			match(INTERFACE);
			setState(1162);
			((Rmm_interfaceContext)_localctx).interfaces = glob();
			setState(1163);
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

	public static class R_service_integrated_vtysh_configContext extends ParserRuleContext {
		public TerminalNode SERVICE() { return getToken(CumulusNcluParser.SERVICE, 0); }
		public TerminalNode INTEGRATED_VTYSH_CONFIG() { return getToken(CumulusNcluParser.INTEGRATED_VTYSH_CONFIG, 0); }
		public TerminalNode NEWLINE() { return getToken(CumulusNcluParser.NEWLINE, 0); }
		public R_service_integrated_vtysh_configContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_service_integrated_vtysh_config; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).enterR_service_integrated_vtysh_config(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CumulusNcluParserListener ) ((CumulusNcluParserListener)listener).exitR_service_integrated_vtysh_config(this);
		}
	}

	public final R_service_integrated_vtysh_configContext r_service_integrated_vtysh_config() throws RecognitionException {
		R_service_integrated_vtysh_configContext _localctx = new R_service_integrated_vtysh_configContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_r_service_integrated_vtysh_config);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1165);
			match(SERVICE);
			setState(1166);
			match(INTEGRATED_VTYSH_CONFIG);
			setState(1167);
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
		case 80:
			return uint16_sempred((Uint16Context)_localctx, predIndex);
		case 81:
			return uint32_sempred((Uint32Context)_localctx, predIndex);
		case 82:
			return vlan_id_sempred((Vlan_idContext)_localctx, predIndex);
		case 85:
			return vni_number_sempred((Vni_numberContext)_localctx, predIndex);
		case 87:
			return zero_sempred((ZeroContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean uint16_sempred(Uint16Context _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return isUint16(((Uint16Context)_localctx).d);
		}
		return true;
	}
	private boolean uint32_sempred(Uint32Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return isUint32(((Uint32Context)_localctx).d);
		}
		return true;
	}
	private boolean vlan_id_sempred(Vlan_idContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return isVlanId(((Vlan_idContext)_localctx).v);
		}
		return true;
	}
	private boolean vni_number_sempred(Vni_numberContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return isVniNumber(((Vni_numberContext)_localctx).v);
		}
		return true;
	}
	private boolean zero_sempred(ZeroContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return  isZero(((ZeroContext)_localctx).d) ;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0094\u0494\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
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
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\3\2\5\2\u014e\n\2\3\2\6\2\u0151\n\2\r"+
		"\2\16\2\u0152\3\2\5\2\u0156\n\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\u015e\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\5\4\u0165\n\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u017b\n\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0186\n\6\3\7\3\7\3\7\5\7\u018b\n\7\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u0199\n\n\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\5\24\u01c5\n\24\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\5\32\u01dc\n\32\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u01f3\n\37\3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3"+
		"#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\5\'\u0211\n\'\3(\3("+
		"\3(\5(\u0216\n(\3)\3)\3)\5)\u021b\n)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0233\n,\5,\u0235\n,\3-\3-\3-\3-"+
		"\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3"+
		"\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\5\64\u025c\n\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66"+
		"\3\67\3\67\3\67\3\67\38\38\38\38\38\58\u0270\n8\39\39\39\39\59\u0276\n"+
		"9\3:\3:\3:\3:\3;\3;\3;\3;\3<\3<\3<\3<\3=\3=\3=\5=\u0287\n=\3>\3>\3>\3"+
		"?\3?\3?\3@\3@\3@\5@\u0292\n@\3A\3A\3A\3A\3B\3B\3B\3B\3C\3C\3C\3C\3C\3"+
		"D\3D\3D\3D\5D\u02a5\nD\3D\3D\3E\3E\3E\7E\u02ac\nE\fE\16E\u02af\13E\3F"+
		"\3F\3F\3F\5F\u02b5\nF\3F\3F\5F\u02b9\nF\5F\u02bb\nF\3G\3G\3H\3H\3I\3I"+
		"\3J\3J\3K\3K\3L\3L\3M\3M\3N\7N\u02cc\nN\fN\16N\u02cf\13N\3N\3N\3O\3O\3"+
		"P\3P\3P\5P\u02d8\nP\3Q\3Q\3Q\7Q\u02dd\nQ\fQ\16Q\u02e0\13Q\3R\3R\3R\3S"+
		"\3S\3S\3T\3T\3T\3U\3U\3U\5U\u02ee\nU\3V\3V\3V\7V\u02f3\nV\fV\16V\u02f6"+
		"\13V\3W\3W\3W\3X\3X\3Y\3Y\3Y\3Z\3Z\3Z\5Z\u0303\nZ\3[\3[\3[\3[\3[\3[\3"+
		"[\5[\u030c\n[\3\\\3\\\3\\\3]\3]\3]\3]\3^\3^\3^\3_\3_\3_\3_\3`\3`\3`\3"+
		"`\3`\3`\5`\u0322\n`\3a\3a\3a\3a\3b\3b\3b\3b\5b\u032c\nb\3c\3c\3c\3d\3"+
		"d\3d\3e\3e\3e\3e\5e\u0338\ne\3e\3e\3f\3f\3f\3f\5f\u0340\nf\3f\3f\3g\3"+
		"g\3g\3g\3g\3g\5g\u034a\ng\3h\3h\3h\3i\3i\3i\3j\3j\3j\3j\3j\3k\3k\3k\3"+
		"k\5k\u035b\nk\3l\3l\3l\3m\3m\3m\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\5n\u036d"+
		"\nn\3o\3o\3o\5o\u0372\no\3p\3p\3p\5p\u0377\np\3q\3q\3q\3r\3r\7r\u037e"+
		"\nr\fr\16r\u0381\13r\3r\3r\3s\3s\3s\3s\3t\3t\3t\3t\5t\u038d\nt\3t\3t\3"+
		"u\3u\3u\3u\3v\3v\3v\3v\3w\3w\3w\3x\3x\3x\3x\7x\u03a0\nx\fx\16x\u03a3\13"+
		"x\3x\5x\u03a6\nx\3y\3y\3y\3z\3z\3z\3z\3z\3z\3{\3{\3{\3|\7|\u03b5\n|\f"+
		"|\16|\u03b8\13|\3}\3}\3}\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\5~\u03c9"+
		"\n~\3\177\3\177\3\177\3\177\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u03d3"+
		"\n\u0080\3\u0081\3\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\5\u0084\u03e6\n\u0084\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u03ec\n"+
		"\u0085\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086\5\u0086\u03f3\n\u0086\3"+
		"\u0086\3\u0086\3\u0087\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\5\u008a\u040a\n\u008a\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008e\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\5\u008f\u0421\n\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u042f\n\u0091"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u0435\n\u0092\3\u0092\3\u0092"+
		"\3\u0093\3\u0093\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\5\u0096\u044b\n\u0096\3\u0097\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u009a\3\u009a\3\u009a\3\u009b\3\u009b"+
		"\3\u009b\3\u009c\3\u009c\3\u009c\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d"+
		"\3\u009d\3\u009d\5\u009d\u0467\n\u009d\3\u009e\3\u009e\3\u009e\3\u009f"+
		"\3\u009f\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a1\3\u00a1\5\u00a1"+
		"\u0475\n\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a2\5\u00a2"+
		"\u047d\n\u00a2\3\u00a2\3\u00a2\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\5\u00a3\u0487\n\u00a3\3\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\2\2\u00a7\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6"+
		"\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee"+
		"\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106"+
		"\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e"+
		"\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136"+
		"\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\2\n\4\2\24"+
		"\24\u0086\u0086\3\2PQ\4\2\u0086\u0086\u008c\u008d\4\2$$TT\3\2\u008c\u008c"+
		"\3\2\4\4\4\2&&\u008a\u008a\t\2\17\17\37\37!!)*\64\64NN\177\177\2\u0477"+
		"\2\u014d\3\2\2\2\4\u015d\3\2\2\2\6\u015f\3\2\2\2\b\u0169\3\2\2\2\n\u017c"+
		"\3\2\2\2\f\u0187\3\2\2\2\16\u018c\3\2\2\2\20\u018f\3\2\2\2\22\u0193\3"+
		"\2\2\2\24\u019a\3\2\2\2\26\u019e\3\2\2\2\30\u01a2\3\2\2\2\32\u01a6\3\2"+
		"\2\2\34\u01aa\3\2\2\2\36\u01af\3\2\2\2 \u01b4\3\2\2\2\"\u01b8\3\2\2\2"+
		"$\u01bc\3\2\2\2&\u01bf\3\2\2\2(\u01c6\3\2\2\2*\u01ca\3\2\2\2,\u01ce\3"+
		"\2\2\2.\u01d2\3\2\2\2\60\u01d5\3\2\2\2\62\u01d8\3\2\2\2\64\u01dd\3\2\2"+
		"\2\66\u01e1\3\2\2\28\u01e5\3\2\2\2:\u01e8\3\2\2\2<\u01ec\3\2\2\2>\u01f4"+
		"\3\2\2\2@\u01f7\3\2\2\2B\u01fb\3\2\2\2D\u0200\3\2\2\2F\u0203\3\2\2\2H"+
		"\u0207\3\2\2\2J\u020a\3\2\2\2L\u020d\3\2\2\2N\u0212\3\2\2\2P\u0217\3\2"+
		"\2\2R\u021e\3\2\2\2T\u0222\3\2\2\2V\u0226\3\2\2\2X\u0236\3\2\2\2Z\u023a"+
		"\3\2\2\2\\\u023e\3\2\2\2^\u0243\3\2\2\2`\u0249\3\2\2\2b\u024d\3\2\2\2"+
		"d\u0251\3\2\2\2f\u0255\3\2\2\2h\u025d\3\2\2\2j\u0262\3\2\2\2l\u0266\3"+
		"\2\2\2n\u026a\3\2\2\2p\u0271\3\2\2\2r\u0277\3\2\2\2t\u027b\3\2\2\2v\u027f"+
		"\3\2\2\2x\u0283\3\2\2\2z\u0288\3\2\2\2|\u028b\3\2\2\2~\u028e\3\2\2\2\u0080"+
		"\u0293\3\2\2\2\u0082\u0297\3\2\2\2\u0084\u029b\3\2\2\2\u0086\u02a0\3\2"+
		"\2\2\u0088\u02a8\3\2\2\2\u008a\u02ba\3\2\2\2\u008c\u02bc\3\2\2\2\u008e"+
		"\u02be\3\2\2\2\u0090\u02c0\3\2\2\2\u0092\u02c2\3\2\2\2\u0094\u02c4\3\2"+
		"\2\2\u0096\u02c6\3\2\2\2\u0098\u02c8\3\2\2\2\u009a\u02cd\3\2\2\2\u009c"+
		"\u02d2\3\2\2\2\u009e\u02d4\3\2\2\2\u00a0\u02d9\3\2\2\2\u00a2\u02e1\3\2"+
		"\2\2\u00a4\u02e4\3\2\2\2\u00a6\u02e7\3\2\2\2\u00a8\u02ea\3\2\2\2\u00aa"+
		"\u02ef\3\2\2\2\u00ac\u02f7\3\2\2\2\u00ae\u02fa\3\2\2\2\u00b0\u02fc\3\2"+
		"\2\2\u00b2\u02ff\3\2\2\2\u00b4\u030b\3\2\2\2\u00b6\u030d\3\2\2\2\u00b8"+
		"\u0310\3\2\2\2\u00ba\u0314\3\2\2\2\u00bc\u0317\3\2\2\2\u00be\u031b\3\2"+
		"\2\2\u00c0\u0323\3\2\2\2\u00c2\u0327\3\2\2\2\u00c4\u032d\3\2\2\2\u00c6"+
		"\u0330\3\2\2\2\u00c8\u0333\3\2\2\2\u00ca\u033b\3\2\2\2\u00cc\u0343\3\2"+
		"\2\2\u00ce\u034b\3\2\2\2\u00d0\u034e\3\2\2\2\u00d2\u0351\3\2\2\2\u00d4"+
		"\u0356\3\2\2\2\u00d6\u035c\3\2\2\2\u00d8\u035f\3\2\2\2\u00da\u0362\3\2"+
		"\2\2\u00dc\u036e\3\2\2\2\u00de\u0376\3\2\2\2\u00e0\u0378\3\2\2\2\u00e2"+
		"\u037b\3\2\2\2\u00e4\u0384\3\2\2\2\u00e6\u0388\3\2\2\2\u00e8\u0390\3\2"+
		"\2\2\u00ea\u0394\3\2\2\2\u00ec\u0398\3\2\2\2\u00ee\u039b\3\2\2\2\u00f0"+
		"\u03a7\3\2\2\2\u00f2\u03aa\3\2\2\2\u00f4\u03b0\3\2\2\2\u00f6\u03b6\3\2"+
		"\2\2\u00f8\u03b9\3\2\2\2\u00fa\u03bc\3\2\2\2\u00fc\u03ca\3\2\2\2\u00fe"+
		"\u03ce\3\2\2\2\u0100\u03d4\3\2\2\2\u0102\u03d8\3\2\2\2\u0104\u03dc\3\2"+
		"\2\2\u0106\u03e0\3\2\2\2\u0108\u03e7\3\2\2\2\u010a\u03ef\3\2\2\2\u010c"+
		"\u03f6\3\2\2\2\u010e\u03fa\3\2\2\2\u0110\u03fe\3\2\2\2\u0112\u0403\3\2"+
		"\2\2\u0114\u040b\3\2\2\2\u0116\u0410\3\2\2\2\u0118\u0414\3\2\2\2\u011a"+
		"\u0418\3\2\2\2\u011c\u041c\3\2\2\2\u011e\u0424\3\2\2\2\u0120\u0428\3\2"+
		"\2\2\u0122\u0430\3\2\2\2\u0124\u0438\3\2\2\2\u0126\u043c\3\2\2\2\u0128"+
		"\u043f\3\2\2\2\u012a\u0443\3\2\2\2\u012c\u044c\3\2\2\2\u012e\u044f\3\2"+
		"\2\2\u0130\u0452\3\2\2\2\u0132\u0456\3\2\2\2\u0134\u0459\3\2\2\2\u0136"+
		"\u045c\3\2\2\2\u0138\u045f\3\2\2\2\u013a\u0468\3\2\2\2\u013c\u046b\3\2"+
		"\2\2\u013e\u046f\3\2\2\2\u0140\u0472\3\2\2\2\u0142\u0478\3\2\2\2\u0144"+
		"\u0480\3\2\2\2\u0146\u0488\3\2\2\2\u0148\u048b\3\2\2\2\u014a\u048f\3\2"+
		"\2\2\u014c\u014e\7\u008c\2\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u0150\3\2\2\2\u014f\u0151\5\4\3\2\u0150\u014f\3\2\2\2\u0151\u0152\3\2"+
		"\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154"+
		"\u0156\7\u008c\2\2\u0155\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157"+
		"\3\2\2\2\u0157\u0158\7\2\2\3\u0158\3\3\2\2\2\u0159\u015e\5\6\4\2\u015a"+
		"\u015e\5\b\5\2\u015b\u015e\5\u0084C\2\u015c\u015e\5\u0086D\2\u015d\u0159"+
		"\3\2\2\2\u015d\u015a\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015c\3\2\2\2\u015e"+
		"\5\3\2\2\2\u015f\u0164\7\u0081\2\2\u0160\u0165\5\u00ecw\2\u0161\u0165"+
		"\5\u00f4{\2\u0162\u0165\5\u00eex\2\u0163\u0165\5\u00f8}\2\u0164\u0160"+
		"\3\2\2\2\u0164\u0161\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0163\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u0167\7\4\2\2\u0167\u0168\7\u008c\2\2\u0168\7\3\2"+
		"\2\2\u0169\u016a\7L\2\2\u016a\u017a\7\b\2\2\u016b\u017b\5\u00b2Z\2\u016c"+
		"\u017b\5\n\6\2\u016d\u017b\5$\23\2\u016e\u017b\5\60\31\2\u016f\u017b\5"+
		"8\35\2\u0170\u017b\5:\36\2\u0171\u017b\5\u00fa~\2\u0172\u017b\5<\37\2"+
		"\u0173\u017b\5H%\2\u0174\u017b\5\u0138\u009d\2\u0175\u017b\5J&\2\u0176"+
		"\u017b\5L\'\2\u0177\u017b\5V,\2\u0178\u017b\5f\64\2\u0179\u017b\5n8\2"+
		"\u017a\u016b\3\2\2\2\u017a\u016c\3\2\2\2\u017a\u016d\3\2\2\2\u017a\u016e"+
		"\3\2\2\2\u017a\u016f\3\2\2\2\u017a\u0170\3\2\2\2\u017a\u0171\3\2\2\2\u017a"+
		"\u0172\3\2\2\2\u017a\u0173\3\2\2\2\u017a\u0174\3\2\2\2\u017a\u0175\3\2"+
		"\2\2\u017a\u0176\3\2\2\2\u017a\u0177\3\2\2\2\u017a\u0178\3\2\2\2\u017a"+
		"\u0179\3\2\2\2\u017b\t\3\2\2\2\u017c\u017d\7\31\2\2\u017d\u0185\5\u0088"+
		"E\2\u017e\u0186\5\f\7\2\u017f\u0186\5\22\n\2\u0180\u0186\5\34\17\2\u0181"+
		"\u0186\5\36\20\2\u0182\u0186\5 \21\2\u0183\u0186\5\"\22\2\u0184\u0186"+
		"\5\u012a\u0096\2\u0185\u017e\3\2\2\2\u0185\u017f\3\2\2\2\u0185\u0180\3"+
		"\2\2\2\u0185\u0181\3\2\2\2\u0185\u0182\3\2\2\2\u0185\u0183\3\2\2\2\u0185"+
		"\u0184\3\2\2\2\u0186\13\3\2\2\2\u0187\u018a\7\31\2\2\u0188\u018b\5\16"+
		"\b\2\u0189\u018b\5\20\t\2\u018a\u0188\3\2\2\2\u018a\u0189\3\2\2\2\u018b"+
		"\r\3\2\2\2\u018c\u018d\7<\2\2\u018d\u018e\7\u008c\2\2\u018e\17\3\2\2\2"+
		"\u018f\u0190\7j\2\2\u0190\u0191\5\u0088E\2\u0191\u0192\7\u008c\2\2\u0192"+
		"\21\3\2\2\2\u0193\u0198\7\33\2\2\u0194\u0199\5\24\13\2\u0195\u0199\5\26"+
		"\f\2\u0196\u0199\5\30\r\2\u0197\u0199\5\32\16\2\u0198\u0194\3\2\2\2\u0198"+
		"\u0195\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0197\3\2\2\2\u0199\23\3\2\2"+
		"\2\u019a\u019b\7\6\2\2\u019b\u019c\5\u00a6T\2\u019c\u019d\7\u008c\2\2"+
		"\u019d\25\3\2\2\2\u019e\u019f\7=\2\2\u019f\u01a0\7P\2\2\u01a0\u01a1\7"+
		"\u008c\2\2\u01a1\27\3\2\2\2\u01a2\u01a3\7]\2\2\u01a3\u01a4\5\u00a6T\2"+
		"\u01a4\u01a5\7\u008c\2\2\u01a5\31\3\2\2\2\u01a6\u01a7\7u\2\2\u01a7\u01a8"+
		"\5\u00aaV\2\u01a8\u01a9\7\u008c\2\2\u01a9\33\3\2\2\2\u01aa\u01ab\7\34"+
		"\2\2\u01ab\u01ac\7\63\2\2\u01ac\u01ad\5\u00a2R\2\u01ad\u01ae\7\u008c\2"+
		"\2\u01ae\35\3\2\2\2\u01af\u01b0\78\2\2\u01b0\u01b1\7\t\2\2\u01b1\u01b2"+
		"\5\u008eH\2\u01b2\u01b3\7\u008c\2\2\u01b3\37\3\2\2\2\u01b4\u01b5\7F\2"+
		"\2\u01b5\u01b6\5\u00a2R\2\u01b6\u01b7\7\u008c\2\2\u01b7!\3\2\2\2\u01b8"+
		"\u01b9\7{\2\2\u01b9\u01ba\5\u00aeX\2\u01ba\u01bb\7\u008c\2\2\u01bb#\3"+
		"\2\2\2\u01bc\u01bd\7\33\2\2\u01bd\u01be\5&\24\2\u01be%\3\2\2\2\u01bf\u01c4"+
		"\7\33\2\2\u01c0\u01c5\5(\25\2\u01c1\u01c5\5*\26\2\u01c2\u01c5\5,\27\2"+
		"\u01c3\u01c5\5.\30\2\u01c4\u01c0\3\2\2\2\u01c4\u01c1\3\2\2\2\u01c4\u01c2"+
		"\3\2\2\2\u01c4\u01c3\3\2\2\2\u01c5\'\3\2\2\2\u01c6\u01c7\7Z\2\2\u01c7"+
		"\u01c8\5\u0088E\2\u01c8\u01c9\7\u008c\2\2\u01c9)\3\2\2\2\u01ca\u01cb\7"+
		"]\2\2\u01cb\u01cc\5\u00a6T\2\u01cc\u01cd\7\u008c\2\2\u01cd+\3\2\2\2\u01ce"+
		"\u01cf\7u\2\2\u01cf\u01d0\5\u00a0Q\2\u01d0\u01d1\7\u008c\2\2\u01d1-\3"+
		"\2\2\2\u01d2\u01d3\7w\2\2\u01d3\u01d4\7\u008c\2\2\u01d4/\3\2\2\2\u01d5"+
		"\u01d6\7\'\2\2\u01d6\u01d7\5\62\32\2\u01d7\61\3\2\2\2\u01d8\u01db\7H\2"+
		"\2\u01d9\u01dc\5\64\33\2\u01da\u01dc\5\66\34\2\u01db\u01d9\3\2\2\2\u01db"+
		"\u01da\3\2\2\2\u01dc\63\3\2\2\2\u01dd\u01de\79\2\2\u01de\u01df\5\u0090"+
		"I\2\u01df\u01e0\7\u008c\2\2\u01e0\65\3\2\2\2\u01e1\u01e2\7:\2\2\u01e2"+
		"\u01e3\5\u0094K\2\u01e3\u01e4\7\u008c\2\2\u01e4\67\3\2\2\2\u01e5\u01e6"+
		"\7(\2\2\u01e6\u01e7\5\u009aN\2\u01e79\3\2\2\2\u01e8\u01e9\7\60\2\2\u01e9"+
		"\u01ea\5\u00aeX\2\u01ea\u01eb\7\u008c\2\2\u01eb;\3\2\2\2\u01ec\u01ed\7"+
		"C\2\2\u01ed\u01f2\7@\2\2\u01ee\u01f3\5> \2\u01ef\u01f3\5B\"\2\u01f0\u01f3"+
		"\5D#\2\u01f1\u01f3\7\u008c\2\2\u01f2\u01ee\3\2\2\2\u01f2\u01ef\3\2\2\2"+
		"\u01f2\u01f0\3\2\2\2\u01f2\u01f1\3\2\2\2\u01f3=\3\2\2\2\u01f4\u01f5\7"+
		"\34\2\2\u01f5\u01f6\5@!\2\u01f6?\3\2\2\2\u01f7\u01f8\7~\2\2\u01f8\u01f9"+
		"\5\u0090I\2\u01f9\u01fa\7\u008c\2\2\u01faA\3\2\2\2\u01fb\u01fc\78\2\2"+
		"\u01fc\u01fd\7\t\2\2\u01fd\u01fe\5\u008eH\2\u01fe\u01ff\7\u008c\2\2\u01ff"+
		"C\3\2\2\2\u0200\u0201\7}\2\2\u0201\u0202\5F$\2\u0202E\3\2\2\2\u0203\u0204"+
		"\7A\2\2\u0204\u0205\5\u0090I\2\u0205\u0206\7\u008c\2\2\u0206G\3\2\2\2"+
		"\u0207\u0208\7\\\2\2\u0208\u0209\5\u009aN\2\u0209I\3\2\2\2\u020a\u020b"+
		"\7k\2\2\u020b\u020c\5\u009aN\2\u020cK\3\2\2\2\u020d\u0210\7s\2\2\u020e"+
		"\u0211\5N(\2\u020f\u0211\5T+\2\u0210\u020e\3\2\2\2\u0210\u020f\3\2\2\2"+
		"\u0211M\3\2\2\2\u0212\u0215\7O\2\2\u0213\u0216\5P)\2\u0214\u0216\5R*\2"+
		"\u0215\u0213\3\2\2\2\u0215\u0214\3\2\2\2\u0216O\3\2\2\2\u0217\u0218\7"+
		"h\2\2\u0218\u021a\5\u00aeX\2\u0219\u021b\7\62\2\2\u021a\u0219\3\2\2\2"+
		"\u021a\u021b\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021d\7\u008c\2\2\u021d"+
		"Q\3\2\2\2\u021e\u021f\7l\2\2\u021f\u0220\5\u00aeX\2\u0220\u0221\7\u008c"+
		"\2\2\u0221S\3\2\2\2\u0222\u0223\7\u0080\2\2\u0223\u0224\5\u00aeX\2\u0224"+
		"\u0225\7\u008c\2\2\u0225U\3\2\2\2\u0226\u0234\7v\2\2\u0227\u0228\5\u00a2"+
		"R\2\u0228\u0229\5`\61\2\u0229\u0235\3\2\2\2\u022a\u0232\5\u00a0Q\2\u022b"+
		"\u0233\5X-\2\u022c\u0233\5Z.\2\u022d\u0233\5\\/\2\u022e\u0233\5^\60\2"+
		"\u022f\u0233\5b\62\2\u0230\u0233\5d\63\2\u0231\u0233\7\u008c\2\2\u0232"+
		"\u022b\3\2\2\2\u0232\u022c\3\2\2\2\u0232\u022d\3\2\2\2\u0232\u022e\3\2"+
		"\2\2\u0232\u022f\3\2\2\2\u0232\u0230\3\2\2\2\u0232\u0231\3\2\2\2\u0233"+
		"\u0235\3\2\2\2\u0234\u0227\3\2\2\2\u0234\u022a\3\2\2\2\u0235W\3\2\2\2"+
		"\u0236\u0237\7\20\2\2\u0237\u0238\7\3\2\2\u0238\u0239\7\u008c\2\2\u0239"+
		"Y\3\2\2\2\u023a\u023b\7\61\2\2\u023b\u023c\5\u0098M\2\u023c\u023d\7\u008c"+
		"\2\2\u023d[\3\2\2\2\u023e\u023f\78\2\2\u023f\u0240\7\t\2\2\u0240\u0241"+
		"\5\u008eH\2\u0241\u0242\7\u008c\2\2\u0242]\3\2\2\2\u0243\u0244\78\2\2"+
		"\u0244\u0245\7\n\2\2\u0245\u0246\5\u0098M\2\u0246\u0247\5\u008eH\2\u0247"+
		"\u0248\7\u008c\2\2\u0248_\3\2\2\2\u0249\u024a\7x\2\2\u024a\u024b\5\u00a6"+
		"T\2\u024b\u024c\7\u008c\2\2\u024ca\3\2\2\2\u024d\u024e\7y\2\2\u024e\u024f"+
		"\7\33\2\2\u024f\u0250\7\u008c\2\2\u0250c\3\2\2\2\u0251\u0252\7{\2\2\u0252"+
		"\u0253\5\u00aeX\2\u0253\u0254\7\u008c\2\2\u0254e\3\2\2\2\u0255\u0256\7"+
		"{\2\2\u0256\u025b\5\u0088E\2\u0257\u025c\5h\65\2\u0258\u025c\5j\66\2\u0259"+
		"\u025c\5l\67\2\u025a\u025c\7\u008c\2\2\u025b\u0257\3\2\2\2\u025b\u0258"+
		"\3\2\2\2\u025b\u0259\3\2\2\2\u025b\u025a\3\2\2\2\u025cg\3\2\2\2\u025d"+
		"\u025e\78\2\2\u025e\u025f\7\t\2\2\u025f\u0260\5\u008eH\2\u0260\u0261\7"+
		"\u008c\2\2\u0261i\3\2\2\2\u0262\u0263\7z\2\2\u0263\u0264\5\u00acW\2\u0264"+
		"\u0265\7\u008c\2\2\u0265k\3\2\2\2\u0266\u0267\7|\2\2\u0267\u0268\t\2\2"+
		"\2\u0268\u0269\7\u008c\2\2\u0269m\3\2\2\2\u026a\u026b\7}\2\2\u026b\u026f"+
		"\5\u0088E\2\u026c\u0270\5p9\2\u026d\u0270\5x=\2\u026e\u0270\5~@\2\u026f"+
		"\u026c\3\2\2\2\u026f\u026d\3\2\2\2\u026f\u026e\3\2\2\2\u0270o\3\2\2\2"+
		"\u0271\u0275\7\33\2\2\u0272\u0276\5r:\2\u0273\u0276\5t;\2\u0274\u0276"+
		"\5v<\2\u0275\u0272\3\2\2\2\u0275\u0273\3\2\2\2\u0275\u0274\3\2\2\2\u0276"+
		"q\3\2\2\2\u0277\u0278\7\6\2\2\u0278\u0279\5\u00a6T\2\u0279\u027a\7\u008c"+
		"\2\2\u027as\3\2\2\2\u027b\u027c\7\22\2\2\u027c\u027d\t\3\2\2\u027d\u027e"+
		"\7\u008c\2\2\u027eu\3\2\2\2\u027f\u0280\7=\2\2\u0280\u0281\t\3\2\2\u0281"+
		"\u0282\7\u008c\2\2\u0282w\3\2\2\2\u0283\u0286\7o\2\2\u0284\u0287\5z>\2"+
		"\u0285\u0287\5|?\2\u0286\u0284\3\2\2\2\u0286\u0285\3\2\2\2\u0287y\3\2"+
		"\2\2\u0288\u0289\7\32\2\2\u0289\u028a\7\u008c\2\2\u028a{\3\2\2\2\u028b"+
		"\u028c\7W\2\2\u028c\u028d\7\u008c\2\2\u028d}\3\2\2\2\u028e\u0291\7}\2"+
		"\2\u028f\u0292\5\u0080A\2\u0290\u0292\5\u0082B\2\u0291\u028f\3\2\2\2\u0291"+
		"\u0290\3\2\2\2\u0292\177\3\2\2\2\u0293\u0294\7\63\2\2\u0294\u0295\5\u00ac"+
		"W\2\u0295\u0296\7\u008c\2\2\u0296\u0081\3\2\2\2\u0297\u0298\7A\2\2\u0298"+
		"\u0299\5\u0090I\2\u0299\u029a\7\u008c\2\2\u029a\u0083\3\2\2\2\u029b\u029c"+
		"\7L\2\2\u029c\u029d\7\b\2\2\u029d\u029e\5\u00aeX\2\u029e\u029f\5\u009a"+
		"N\2\u029f\u0085\3\2\2\2\u02a0\u02a4\7L\2\2\u02a1\u02a5\3\2\2\2\u02a2\u02a5"+
		"\7\35\2\2\u02a3\u02a5\7#\2\2\u02a4\u02a1\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a4"+
		"\u02a3\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a7\5\u009aN\2\u02a7\u0087"+
		"\3\2\2\2\u02a8\u02ad\5\u008aF\2\u02a9\u02aa\7\u0082\2\2\u02aa\u02ac\5"+
		"\u008aF\2\u02ab\u02a9\3\2\2\2\u02ac\u02af\3\2\2\2\u02ad\u02ab\3\2\2\2"+
		"\u02ad\u02ae\3\2\2\2\u02ae\u0089\3\2\2\2\u02af\u02ad\3\2\2\2\u02b0\u02bb"+
		"\5\u008cG\2\u02b1\u02b4\5\u009cO\2\u02b2\u02b3\7\u0085\2\2\u02b3\u02b5"+
		"\5\u00a4S\2\u02b4\u02b2\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b8\3\2\2"+
		"\2\u02b6\u02b7\7\u0082\2\2\u02b7\u02b9\5\u00a0Q\2\u02b8\u02b6\3\2\2\2"+
		"\u02b8\u02b9\3\2\2\2\u02b9\u02bb\3\2\2\2\u02ba\u02b0\3\2\2\2\u02ba\u02b1"+
		"\3\2\2\2\u02bb\u008b\3\2\2\2\u02bc\u02bd\n\4\2\2\u02bd\u008d\3\2\2\2\u02be"+
		"\u02bf\7\u0088\2\2\u02bf\u008f\3\2\2\2\u02c0\u02c1\7\u0087\2\2\u02c1\u0091"+
		"\3\2\2\2\u02c2\u02c3\7\u0088\2\2\u02c3\u0093\3\2\2\2\u02c4\u02c5\7\u0089"+
		"\2\2\u02c5\u0095\3\2\2\2\u02c6\u02c7\t\5\2\2\u02c7\u0097\3\2\2\2\u02c8"+
		"\u02c9\7\u008b\2\2\u02c9\u0099\3\2\2\2\u02ca\u02cc\n\6\2\2\u02cb\u02ca"+
		"\3\2\2\2\u02cc\u02cf\3\2\2\2\u02cd\u02cb\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce"+
		"\u02d0\3\2\2\2\u02cf\u02cd\3\2\2\2\u02d0\u02d1\7\u008c\2\2\u02d1\u009b"+
		"\3\2\2\2\u02d2\u02d3\7\u008d\2\2\u02d3\u009d\3\2\2\2\u02d4\u02d7\5\u00a4"+
		"S\2\u02d5\u02d6\7\u0085\2\2\u02d6\u02d8\5\u00a4S\2\u02d7\u02d5\3\2\2\2"+
		"\u02d7\u02d8\3\2\2\2\u02d8\u009f\3\2\2\2\u02d9\u02de\5\u009eP\2\u02da"+
		"\u02db\7\u0082\2\2\u02db\u02dd\5\u009eP\2\u02dc\u02da\3\2\2\2\u02dd\u02e0"+
		"\3\2\2\2\u02de\u02dc\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u00a1\3\2\2\2\u02e0"+
		"\u02de\3\2\2\2\u02e1\u02e2\7\u0086\2\2\u02e2\u02e3\6R\2\3\u02e3\u00a3"+
		"\3\2\2\2\u02e4\u02e5\7\u0086\2\2\u02e5\u02e6\6S\3\3\u02e6\u00a5\3\2\2"+
		"\2\u02e7\u02e8\7\u0086\2\2\u02e8\u02e9\6T\4\3\u02e9\u00a7\3\2\2\2\u02ea"+
		"\u02ed\5\u00a6T\2\u02eb\u02ec\7\u0085\2\2\u02ec\u02ee\5\u00a6T\2\u02ed"+
		"\u02eb\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u00a9\3\2\2\2\u02ef\u02f4\5\u00a8"+
		"U\2\u02f0\u02f1\7\u0082\2\2\u02f1\u02f3\5\u00a8U\2\u02f2\u02f0\3\2\2\2"+
		"\u02f3\u02f6\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u00ab"+
		"\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f7\u02f8\7\u0086\2\2\u02f8\u02f9\6W\5"+
		"\3\u02f9\u00ad\3\2\2\2\u02fa\u02fb\n\6\2\2\u02fb\u00af\3\2\2\2\u02fc\u02fd"+
		"\7\u0086\2\2\u02fd\u02fe\6Y\6\3\u02fe\u00b1\3\2\2\2\u02ff\u0302\7\30\2"+
		"\2\u0300\u0303\5\u00b4[\2\u0301\u0303\5\u00eav\2\u0302\u0300\3\2\2\2\u0302"+
		"\u0301\3\2\2\2\u0303\u00b3\3\2\2\2\u0304\u030c\5\u00b6\\\2\u0305\u030c"+
		"\5\u00b8]\2\u0306\u030c\5\u00ba^\2\u0307\u030c\5\u00be`\2\u0308\u030c"+
		"\5\u00ccg\2\u0309\u030c\5\u00dan\2\u030a\u030c\5\u00e8u\2\u030b\u0304"+
		"\3\2\2\2\u030b\u0305\3\2\2\2\u030b\u0306\3\2\2\2\u030b\u0307\3\2\2\2\u030b"+
		"\u0308\3\2\2\2\u030b\u0309\3\2\2\2\u030b\u030a\3\2\2\2\u030c\u00b5\3\2"+
		"\2\2\u030d\u030e\7\21\2\2\u030e\u030f\7\u008c\2\2\u030f\u00b7\3\2\2\2"+
		"\u0310\u0311\7\25\2\2\u0311\u0312\5\u00a4S\2\u0312\u0313\7\u008c\2\2\u0313"+
		"\u00b9\3\2\2\2\u0314\u0315\7\27\2\2\u0315\u0316\5\u00bc_\2\u0316\u00bb"+
		"\3\2\2\2\u0317\u0318\7\23\2\2\u0318\u0319\7G\2\2\u0319\u031a\7\u008c\2"+
		"\2\u031a\u00bd\3\2\2\2\u031b\u031c\79\2\2\u031c\u0321\7t\2\2\u031d\u0322"+
		"\5\u00c2b\2\u031e\u0322\5\u00c0a\2\u031f\u0322\5\u00c8e\2\u0320\u0322"+
		"\5\u00caf\2\u0321\u031d\3\2\2\2\u0321\u031e\3\2\2\2\u0321\u031f\3\2\2"+
		"\2\u0321\u0320\3\2\2\2\u0322\u00bf\3\2\2\2\u0323\u0324\7K\2\2\u0324\u0325"+
		"\5\u0092J\2\u0325\u0326\7\u008c\2\2\u0326\u00c1\3\2\2\2\u0327\u0328\7"+
		"J\2\2\u0328\u032b\5\u00aeX\2\u0329\u032c\5\u00c4c\2\u032a\u032c\5\u00c6"+
		"d\2\u032b\u0329\3\2\2\2\u032b\u032a\3\2\2\2\u032c\u00c3\3\2\2\2\u032d"+
		"\u032e\7\7\2\2\u032e\u032f\7\u008c\2\2\u032f\u00c5\3\2\2\2\u0330\u0331"+
		"\7e\2\2\u0331\u0332\7\u008c\2\2\u0332\u00c7\3\2\2\2\u0333\u0334\7`\2\2"+
		"\u0334\u0337\7\36\2\2\u0335\u0336\7d\2\2\u0336\u0338\5\u00aeX\2\u0337"+
		"\u0335\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u033a\7\u008c"+
		"\2\2\u033a\u00c9\3\2\2\2\u033b\u033c\7`\2\2\u033c\u033f\7n\2\2\u033d\u033e"+
		"\7d\2\2\u033e\u0340\5\u00aeX\2\u033f\u033d\3\2\2\2\u033f\u0340\3\2\2\2"+
		"\u0340\u0341\3\2\2\2\u0341\u0342\7\u008c\2\2\u0342\u00cb\3\2\2\2\u0343"+
		"\u0344\7;\2\2\u0344\u0349\7+\2\2\u0345\u034a\5\u00ceh\2\u0346\u034a\5"+
		"\u00d0i\2\u0347\u034a\5\u00d2j\2\u0348\u034a\5\u00d4k\2\u0349\u0345\3"+
		"\2\2\2\u0349\u0346\3\2\2\2\u0349\u0347\3\2\2\2\u0349\u0348\3\2\2\2\u034a"+
		"\u00cd\3\2\2\2\u034b\u034c\7\f\2\2\u034c\u034d\7\u008c\2\2\u034d\u00cf"+
		"\3\2\2\2\u034e\u034f\7\r\2\2\u034f\u0350\7\u008c\2\2\u0350\u00d1\3\2\2"+
		"\2\u0351\u0352\7\13\2\2\u0352\u0353\79\2\2\u0353\u0354\7t\2\2\u0354\u0355"+
		"\7\u008c\2\2\u0355\u00d3\3\2\2\2\u0356\u0357\7J\2\2\u0357\u035a\5\u00ae"+
		"X\2\u0358\u035b\5\u00d6l\2\u0359\u035b\5\u00d8m\2\u035a\u0358\3\2\2\2"+
		"\u035a\u0359\3\2\2\2\u035b\u00d5\3\2\2\2\u035c\u035d\7\7\2\2\u035d\u035e"+
		"\7\u008c\2\2\u035e\u00d7\3\2\2\2\u035f\u0360\7e\2\2\u0360\u0361\7\u008c"+
		"\2\2\u0361\u00d9\3\2\2\2\u0362\u036c\7J\2\2\u0363\u0364\5\u00aeX\2\u0364"+
		"\u0365\5\u00e0q\2\u0365\u036d\3\2\2\2\u0366\u0367\5\u00aeX\2\u0367\u0368"+
		"\5\u00dco\2\u0368\u036d\3\2\2\2\u0369\u036a\5\u00aeX\2\u036a\u036b\5\u00de"+
		"p\2\u036b\u036d\3\2\2\2\u036c\u0363\3\2\2\2\u036c\u0366\3\2\2\2\u036c"+
		"\u0369\3\2\2\2\u036d\u00db\3\2\2\2\u036e\u0371\7\66\2\2\u036f\u0372\5"+
		"\u00e4s\2\u0370\u0372\5\u00e6t\2\u0371\u036f\3\2\2\2\u0371\u0370\3\2\2"+
		"\2\u0372\u00dd\3\2\2\2\u0373\u0377\5\u00e2r\2\u0374\u0377\5\u00e4s\2\u0375"+
		"\u0377\5\u00e6t\2\u0376\u0373\3\2\2\2\u0376\u0374\3\2\2\2\u0376\u0375"+
		"\3\2\2\2\u0377\u00df\3\2\2\2\u0378\u0379\7R\2\2\u0379\u037a\7\u008c\2"+
		"\2\u037a\u00e1\3\2\2\2\u037b\u037f\7%\2\2\u037c\u037e\n\6\2\2\u037d\u037c"+
		"\3\2\2\2\u037e\u0381\3\2\2\2\u037f\u037d\3\2\2\2\u037f\u0380\3\2\2\2\u0380"+
		"\u0382\3\2\2\2\u0381\u037f\3\2\2\2\u0382\u0383\7\u008c\2\2\u0383\u00e3"+
		"\3\2\2\2\u0384\u0385\7R\2\2\u0385\u0386\5\u00aeX\2\u0386\u0387\7\u008c"+
		"\2\2\u0387\u00e5\3\2\2\2\u0388\u038c\7a\2\2\u0389\u038d\7-\2\2\u038a\u038d"+
		"\7\67\2\2\u038b\u038d\5\u00a4S\2\u038c\u0389\3\2\2\2\u038c\u038a\3\2\2"+
		"\2\u038c\u038b\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u038f\7\u008c\2\2\u038f"+
		"\u00e7\3\2\2\2\u0390\u0391\7f\2\2\u0391\u0392\5\u0090I\2\u0392\u0393\7"+
		"\u008c\2\2\u0393\u00e9\3\2\2\2\u0394\u0395\7{\2\2\u0395\u0396\5\u00ae"+
		"X\2\u0396\u0397\5\u00b4[\2\u0397\u00eb\3\2\2\2\u0398\u0399\7c\2\2\u0399"+
		"\u039a\5\u00f6|\2\u039a\u00ed\3\2\2\2\u039b\u039c\7{\2\2\u039c\u039d\5"+
		"\u00aeX\2\u039d\u03a1\7\u008c\2\2\u039e\u03a0\5\u00f2z\2\u039f\u039e\3"+
		"\2\2\2\u03a0\u03a3\3\2\2\2\u03a1\u039f\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2"+
		"\u03a5\3\2\2\2\u03a3\u03a1\3\2\2\2\u03a4\u03a6\5\u00f0y\2\u03a5\u03a4"+
		"\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u00ef\3\2\2\2\u03a7\u03a8\7,\2\2\u03a8"+
		"\u03a9\7\u008c\2\2\u03a9\u00f1\3\2\2\2\u03aa\u03ab\78\2\2\u03ab\u03ac"+
		"\7b\2\2\u03ac\u03ad\5\u0092J\2\u03ad\u03ae\5\u0090I\2\u03ae\u03af\7\u008c"+
		"\2\2\u03af\u00f3\3\2\2\2\u03b0\u03b1\7\5\2\2\u03b1\u03b2\5\u00f6|\2\u03b2"+
		"\u00f5\3\2\2\2\u03b3\u03b5\n\7\2\2\u03b4\u03b3\3\2\2\2\u03b5\u03b8\3\2"+
		"\2\2\u03b6\u03b4\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u00f7\3\2\2\2\u03b8"+
		"\u03b6\3\2\2\2\u03b9\u03ba\5\u00aeX\2\u03ba\u03bb\5\u00f6|\2\u03bb\u00f9"+
		"\3\2\2\2\u03bc\u03bd\7\66\2\2\u03bd\u03c8\5\u0088E\2\u03be\u03c9\5\u00fc"+
		"\177\2\u03bf\u03c9\5\u00fe\u0080\2\u03c0\u03c9\5\u0106\u0084\2\u03c1\u03c9"+
		"\5\u0110\u0089\2\u03c2\u03c9\5\u0112\u008a\2\u03c3\u03c9\5\u0114\u008b"+
		"\2\u03c4\u03c9\5\u0116\u008c\2\u03c5\u03c9\5\u0128\u0095\2\u03c6\u03c9"+
		"\5\u012a\u0096\2\u03c7\u03c9\7\u008c\2\2\u03c8\u03be\3\2\2\2\u03c8\u03bf"+
		"\3\2\2\2\u03c8\u03c0\3\2\2\2\u03c8\u03c1\3\2\2\2\u03c8\u03c2\3\2\2\2\u03c8"+
		"\u03c3\3\2\2\2\u03c8\u03c4\3\2\2\2\u03c8\u03c5\3\2\2\2\u03c8\u03c6\3\2"+
		"\2\2\u03c8\u03c7\3\2\2\2\u03c9\u00fb\3\2\2\2\u03ca\u03cb\7\20\2\2\u03cb"+
		"\u03cc\7\3\2\2\u03cc\u03cd\7\u008c\2\2\u03cd\u00fd\3\2\2\2\u03ce\u03d2"+
		"\7\33\2\2\u03cf\u03d3\5\u0100\u0081\2\u03d0\u03d3\5\u0102\u0082\2\u03d1"+
		"\u03d3\5\u0104\u0083\2\u03d2\u03cf\3\2\2\2\u03d2\u03d0\3\2\2\2\u03d2\u03d1"+
		"\3\2\2\2\u03d3\u00ff\3\2\2\2\u03d4\u03d5\7\6\2\2\u03d5\u03d6\5\u00a6T"+
		"\2\u03d6\u03d7\7\u008c\2\2\u03d7\u0101\3\2\2\2\u03d8\u03d9\7]\2\2\u03d9"+
		"\u03da\5\u00a6T\2\u03da\u03db\7\u008c\2\2\u03db\u0103\3\2\2\2\u03dc\u03dd"+
		"\7u\2\2\u03dd\u03de\5\u00aaV\2\u03de\u03df\7\u008c\2\2\u03df\u0105\3\2"+
		"\2\2\u03e0\u03e5\7\34\2\2\u03e1\u03e6\5\u0108\u0085\2\u03e2\u03e6\5\u010a"+
		"\u0086\2\u03e3\u03e6\5\u010c\u0087\2\u03e4\u03e6\5\u010e\u0088\2\u03e5"+
		"\u03e1\3\2\2\2\u03e5\u03e2\3\2\2\2\u03e5\u03e3\3\2\2\2\u03e5\u03e4\3\2"+
		"\2\2\u03e6\u0107\3\2\2\2\u03e7\u03e8\7\26\2\2\u03e8\u03eb\5\u0090I\2\u03e9"+
		"\u03ea\7{\2\2\u03ea\u03ec\5\u00aeX\2\u03eb\u03e9\3\2\2\2\u03eb\u03ec\3"+
		"\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03ee\7\u008c\2\2\u03ee\u0109\3\2\2\2"+
		"\u03ef\u03f2\7S\2\2\u03f0\u03f3\5\u0090I\2\u03f1\u03f3\7?\2\2\u03f2\u03f0"+
		"\3\2\2\2\u03f2\u03f1\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f5\7\u008c\2"+
		"\2\u03f5\u010b\3\2\2\2\u03f6\u03f7\7[\2\2\u03f7\u03f8\5\u00a2R\2\u03f8"+
		"\u03f9\7\u008c\2\2\u03f9\u010d\3\2\2\2\u03fa\u03fb\7q\2\2\u03fb\u03fc"+
		"\5\u0098M\2\u03fc\u03fd\7\u008c\2\2\u03fd\u010f\3\2\2\2\u03fe\u03ff\7"+
		"8\2\2\u03ff\u0400\7\t\2\2\u0400\u0401\5\u008eH\2\u0401\u0402\7\u008c\2"+
		"\2\u0402\u0111\3\2\2\2\u0403\u0409\7:\2\2\u0404\u040a\5\u0118\u008d\2"+
		"\u0405\u040a\5\u011a\u008e\2\u0406\u040a\5\u011c\u008f\2\u0407\u040a\5"+
		"\u011e\u0090\2\u0408\u040a\5\u0120\u0091\2\u0409\u0404\3\2\2\2\u0409\u0405"+
		"\3\2\2\2\u0409\u0406\3\2\2\2\u0409\u0407\3\2\2\2\u0409\u0408\3\2\2\2\u040a"+
		"\u0113\3\2\2\2\u040b\u040c\7>\2\2\u040c\u040d\7m\2\2\u040d\u040e\5\u00a4"+
		"S\2\u040e\u040f\7\u008c\2\2\u040f\u0115\3\2\2\2\u0410\u0411\7F\2\2\u0411"+
		"\u0412\5\u00a2R\2\u0412\u0413\7\u008c\2\2\u0413\u0117\3\2\2\2\u0414\u0415"+
		"\7\t\2\2\u0415\u0416\t\b\2\2\u0416\u0417\7\u008c\2\2\u0417\u0119\3\2\2"+
		"\2\u0418\u0419\7\n\2\2\u0419\u041a\7\u008b\2\2\u041a\u041b\7\u008c\2\2"+
		"\u041b\u011b\3\2\2\2\u041c\u0420\7.\2\2\u041d\u0421\5\u00b0Y\2\u041e\u0421"+
		"\7M\2\2\u041f\u0421\7P\2\2\u0420\u041d\3\2\2\2\u0420\u041e\3\2\2\2\u0420"+
		"\u041f\3\2\2\2\u0421\u0422\3\2\2\2\u0422\u0423\7\u008c\2\2\u0423\u011d"+
		"\3\2\2\2\u0424\u0425\7/\2\2\u0425\u0426\7\u0089\2\2\u0426\u0427\7\u008c"+
		"\2\2\u0427\u011f\3\2\2\2\u0428\u042e\7I\2\2\u0429\u042a\7\u008a\2\2\u042a"+
		"\u042f\7\u008c\2\2\u042b\u042f\5\u0122\u0092\2\u042c\u042f\5\u0124\u0093"+
		"\2\u042d\u042f\5\u0126\u0094\2\u042e\u0429\3\2\2\2\u042e\u042b\3\2\2\2"+
		"\u042e\u042c\3\2\2\2\u042e\u042d\3\2\2\2\u042f\u0121\3\2\2\2\u0430\u0434"+
		"\7^\2\2\u0431\u0435\5\u00a2R\2\u0432\u0433\7E\2\2\u0433\u0435\5\u00a4"+
		"S\2\u0434\u0431\3\2\2\2\u0434\u0432\3\2\2\2\u0435\u0436\3\2\2\2\u0436"+
		"\u0437\7\u008c\2\2\u0437\u0123\3\2\2\2\u0438\u0439\7_\2\2\u0439\u043a"+
		"\5\u00a2R\2\u043a\u043b\7\u008c\2\2\u043b\u0125\3\2\2\2\u043c\u043d\7"+
		"p\2\2\u043d\u043e\7\u008c\2\2\u043e\u0127\3\2\2\2\u043f\u0440\7{\2\2\u0440"+
		"\u0441\5\u00aeX\2\u0441\u0442\7\u008c\2\2\u0442\u0129\3\2\2\2\u0443\u044a"+
		"\7o\2\2\u0444\u044b\5\u012c\u0097\2\u0445\u044b\5\u012e\u0098\2\u0446"+
		"\u044b\5\u0130\u0099\2\u0447\u044b\5\u0132\u009a\2\u0448\u044b\5\u0134"+
		"\u009b\2\u0449\u044b\5\u0136\u009c\2\u044a\u0444\3\2\2\2\u044a\u0445\3"+
		"\2\2\2\u044a\u0446\3\2\2\2\u044a\u0447\3\2\2\2\u044a\u0448\3\2\2\2\u044a"+
		"\u0449\3\2\2\2\u044b\u012b\3\2\2\2\u044c\u044d\7\32\2\2\u044d\u044e\7"+
		"\u008c\2\2\u044e\u012d\3\2\2\2\u044f\u0450\7U\2\2\u0450\u0451\7\u008c"+
		"\2\2\u0451\u012f\3\2\2\2\u0452\u0453\7V\2\2\u0453\u0454\7M\2\2\u0454\u0455"+
		"\7\u008c\2\2\u0455\u0131\3\2\2\2\u0456\u0457\7W\2\2\u0457\u0458\7\u008c"+
		"\2\2\u0458\u0133\3\2\2\2\u0459\u045a\7X\2\2\u045a\u045b\7\u008c\2\2\u045b"+
		"\u0135\3\2\2\2\u045c\u045d\7Y\2\2\u045d\u045e\7\u008c\2\2\u045e\u0137"+
		"\3\2\2\2\u045f\u0466\7g\2\2\u0460\u0467\5\u013a\u009e\2\u0461\u0467\5"+
		"\u013c\u009f\2\u0462\u0467\5\u013e\u00a0\2\u0463\u0467\5\u0142\u00a2\2"+
		"\u0464\u0467\5\u0144\u00a3\2\u0465\u0467\5\u014a\u00a6\2\u0466\u0460\3"+
		"\2\2\2\u0466\u0461\3\2\2\2\u0466\u0462\3\2\2\2\u0466\u0463\3\2\2\2\u0466"+
		"\u0464\3\2\2\2\u0466\u0465\3\2\2\2\u0467\u0139\3\2\2\2\u0468\u0469\7\16"+
		"\2\2\u0469\u046a\7\u008c\2\2\u046a\u013b\3\2\2\2\u046b\u046c\7\"\2\2\u046c"+
		"\u046d\7 \2\2\u046d\u046e\7\u008c\2\2\u046e\u013d\3\2\2\2\u046f\u0470"+
		"\7B\2\2\u0470\u0471\5\u0140\u00a1\2\u0471\u013f\3\2\2\2\u0472\u0474\7"+
		"r\2\2\u0473\u0475\t\t\2\2\u0474\u0473\3\2\2\2\u0474\u0475\3\2\2\2\u0475"+
		"\u0476\3\2\2\2\u0476\u0477\7\u008c\2\2\u0477\u0141\3\2\2\2\u0478\u0479"+
		"\7b\2\2\u0479\u047c\5\u0092J\2\u047a\u047d\5\u0090I\2\u047b\u047d\5\u00ae"+
		"X\2\u047c\u047a\3\2\2\2\u047c\u047b\3\2\2\2\u047d\u047e\3\2\2\2\u047e"+
		"\u047f\7\u008c\2\2\u047f\u0143\3\2\2\2\u0480\u0481\7d\2\2\u0481\u0482"+
		"\5\u00aeX\2\u0482\u0483\5\u0096L\2\u0483\u0486\5\u00a2R\2\u0484\u0487"+
		"\5\u0146\u00a4\2\u0485\u0487\7\u008c\2\2\u0486\u0484\3\2\2\2\u0486\u0485"+
		"\3\2\2\2\u0487\u0145\3\2\2\2\u0488\u0489\7D\2\2\u0489\u048a\5\u0148\u00a5"+
		"\2\u048a\u0147\3\2\2\2\u048b\u048c\7\66\2\2\u048c\u048d\5\u0088E\2\u048d"+
		"\u048e\7\u008c\2\2\u048e\u0149\3\2\2\2\u048f\u0490\7i\2\2\u0490\u0491"+
		"\7\65\2\2\u0491\u0492\7\u008c\2\2\u0492\u014b\3\2\2\2@\u014d\u0152\u0155"+
		"\u015d\u0164\u017a\u0185\u018a\u0198\u01c4\u01db\u01f2\u0210\u0215\u021a"+
		"\u0232\u0234\u025b\u026f\u0275\u0286\u0291\u02a4\u02ad\u02b4\u02b8\u02ba"+
		"\u02cd\u02d7\u02de\u02ed\u02f4\u0302\u030b\u0321\u032b\u0337\u033f\u0349"+
		"\u035a\u036c\u0371\u0376\u037f\u038c\u03a1\u03a5\u03b6\u03c8\u03d2\u03e5"+
		"\u03eb\u03f2\u0409\u0420\u042e\u0434\u044a\u0466\u0474\u047c\u0486";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}