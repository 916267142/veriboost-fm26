// Generated from org/batfish/grammar/cumulus_interfaces/CumulusInterfacesParser.g4 by ANTLR 4.7.2
package org.batfish.grammar.cumulus_interfaces;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CumulusInterfacesParser}.
 */
public interface CumulusInterfacesParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#cumulus_interfaces_configuration}.
	 * @param ctx the parse tree
	 */
	void enterCumulus_interfaces_configuration(CumulusInterfacesParser.Cumulus_interfaces_configurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#cumulus_interfaces_configuration}.
	 * @param ctx the parse tree
	 */
	void exitCumulus_interfaces_configuration(CumulusInterfacesParser.Cumulus_interfaces_configurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CumulusInterfacesParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CumulusInterfacesParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#s_auto}.
	 * @param ctx the parse tree
	 */
	void enterS_auto(CumulusInterfacesParser.S_autoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#s_auto}.
	 * @param ctx the parse tree
	 */
	void exitS_auto(CumulusInterfacesParser.S_autoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#s_iface}.
	 * @param ctx the parse tree
	 */
	void enterS_iface(CumulusInterfacesParser.S_ifaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#s_iface}.
	 * @param ctx the parse tree
	 */
	void exitS_iface(CumulusInterfacesParser.S_ifaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#si_inet}.
	 * @param ctx the parse tree
	 */
	void enterSi_inet(CumulusInterfacesParser.Si_inetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#si_inet}.
	 * @param ctx the parse tree
	 */
	void exitSi_inet(CumulusInterfacesParser.Si_inetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#si_no_inet}.
	 * @param ctx the parse tree
	 */
	void enterSi_no_inet(CumulusInterfacesParser.Si_no_inetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#si_no_inet}.
	 * @param ctx the parse tree
	 */
	void exitSi_no_inet(CumulusInterfacesParser.Si_no_inetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#i_property}.
	 * @param ctx the parse tree
	 */
	void enterI_property(CumulusInterfacesParser.I_propertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#i_property}.
	 * @param ctx the parse tree
	 */
	void exitI_property(CumulusInterfacesParser.I_propertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#i_address}.
	 * @param ctx the parse tree
	 */
	void enterI_address(CumulusInterfacesParser.I_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#i_address}.
	 * @param ctx the parse tree
	 */
	void exitI_address(CumulusInterfacesParser.I_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#i_address_virtual}.
	 * @param ctx the parse tree
	 */
	void enterI_address_virtual(CumulusInterfacesParser.I_address_virtualContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#i_address_virtual}.
	 * @param ctx the parse tree
	 */
	void exitI_address_virtual(CumulusInterfacesParser.I_address_virtualContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#i_alias}.
	 * @param ctx the parse tree
	 */
	void enterI_alias(CumulusInterfacesParser.I_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#i_alias}.
	 * @param ctx the parse tree
	 */
	void exitI_alias(CumulusInterfacesParser.I_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#i_bond_lacp_bypass_allow}.
	 * @param ctx the parse tree
	 */
	void enterI_bond_lacp_bypass_allow(CumulusInterfacesParser.I_bond_lacp_bypass_allowContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#i_bond_lacp_bypass_allow}.
	 * @param ctx the parse tree
	 */
	void exitI_bond_lacp_bypass_allow(CumulusInterfacesParser.I_bond_lacp_bypass_allowContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#i_bond_lacp_rate}.
	 * @param ctx the parse tree
	 */
	void enterI_bond_lacp_rate(CumulusInterfacesParser.I_bond_lacp_rateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#i_bond_lacp_rate}.
	 * @param ctx the parse tree
	 */
	void exitI_bond_lacp_rate(CumulusInterfacesParser.I_bond_lacp_rateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#i_bond_master}.
	 * @param ctx the parse tree
	 */
	void enterI_bond_master(CumulusInterfacesParser.I_bond_masterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#i_bond_master}.
	 * @param ctx the parse tree
	 */
	void exitI_bond_master(CumulusInterfacesParser.I_bond_masterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#i_bond_miimon}.
	 * @param ctx the parse tree
	 */
	void enterI_bond_miimon(CumulusInterfacesParser.I_bond_miimonContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#i_bond_miimon}.
	 * @param ctx the parse tree
	 */
	void exitI_bond_miimon(CumulusInterfacesParser.I_bond_miimonContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#i_bond_min_links}.
	 * @param ctx the parse tree
	 */
	void enterI_bond_min_links(CumulusInterfacesParser.I_bond_min_linksContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#i_bond_min_links}.
	 * @param ctx the parse tree
	 */
	void exitI_bond_min_links(CumulusInterfacesParser.I_bond_min_linksContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#i_bond_mode}.
	 * @param ctx the parse tree
	 */
	void enterI_bond_mode(CumulusInterfacesParser.I_bond_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#i_bond_mode}.
	 * @param ctx the parse tree
	 */
	void exitI_bond_mode(CumulusInterfacesParser.I_bond_modeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#i_bond_slaves}.
	 * @param ctx the parse tree
	 */
	void enterI_bond_slaves(CumulusInterfacesParser.I_bond_slavesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#i_bond_slaves}.
	 * @param ctx the parse tree
	 */
	void exitI_bond_slaves(CumulusInterfacesParser.I_bond_slavesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#i_bond_xmit_hash_policy}.
	 * @param ctx the parse tree
	 */
	void enterI_bond_xmit_hash_policy(CumulusInterfacesParser.I_bond_xmit_hash_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#i_bond_xmit_hash_policy}.
	 * @param ctx the parse tree
	 */
	void exitI_bond_xmit_hash_policy(CumulusInterfacesParser.I_bond_xmit_hash_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#i_bridge_access}.
	 * @param ctx the parse tree
	 */
	void enterI_bridge_access(CumulusInterfacesParser.I_bridge_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#i_bridge_access}.
	 * @param ctx the parse tree
	 */
	void exitI_bridge_access(CumulusInterfacesParser.I_bridge_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#i_bridge_arp_nd_suppress}.
	 * @param ctx the parse tree
	 */
	void enterI_bridge_arp_nd_suppress(CumulusInterfacesParser.I_bridge_arp_nd_suppressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#i_bridge_arp_nd_suppress}.
	 * @param ctx the parse tree
	 */
	void exitI_bridge_arp_nd_suppress(CumulusInterfacesParser.I_bridge_arp_nd_suppressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#i_bridge_learning}.
	 * @param ctx the parse tree
	 */
	void enterI_bridge_learning(CumulusInterfacesParser.I_bridge_learningContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#i_bridge_learning}.
	 * @param ctx the parse tree
	 */
	void exitI_bridge_learning(CumulusInterfacesParser.I_bridge_learningContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#i_bridge_ports}.
	 * @param ctx the parse tree
	 */
	void enterI_bridge_ports(CumulusInterfacesParser.I_bridge_portsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#i_bridge_ports}.
	 * @param ctx the parse tree
	 */
	void exitI_bridge_ports(CumulusInterfacesParser.I_bridge_portsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#i_bridge_pvid}.
	 * @param ctx the parse tree
	 */
	void enterI_bridge_pvid(CumulusInterfacesParser.I_bridge_pvidContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#i_bridge_pvid}.
	 * @param ctx the parse tree
	 */
	void exitI_bridge_pvid(CumulusInterfacesParser.I_bridge_pvidContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#i_bridge_vids}.
	 * @param ctx the parse tree
	 */
	void enterI_bridge_vids(CumulusInterfacesParser.I_bridge_vidsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#i_bridge_vids}.
	 * @param ctx the parse tree
	 */
	void exitI_bridge_vids(CumulusInterfacesParser.I_bridge_vidsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#i_bridge_vlan_aware}.
	 * @param ctx the parse tree
	 */
	void enterI_bridge_vlan_aware(CumulusInterfacesParser.I_bridge_vlan_awareContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#i_bridge_vlan_aware}.
	 * @param ctx the parse tree
	 */
	void exitI_bridge_vlan_aware(CumulusInterfacesParser.I_bridge_vlan_awareContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#i_clag_id}.
	 * @param ctx the parse tree
	 */
	void enterI_clag_id(CumulusInterfacesParser.I_clag_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#i_clag_id}.
	 * @param ctx the parse tree
	 */
	void exitI_clag_id(CumulusInterfacesParser.I_clag_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#i_clagd_backup_ip}.
	 * @param ctx the parse tree
	 */
	void enterI_clagd_backup_ip(CumulusInterfacesParser.I_clagd_backup_ipContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#i_clagd_backup_ip}.
	 * @param ctx the parse tree
	 */
	void exitI_clagd_backup_ip(CumulusInterfacesParser.I_clagd_backup_ipContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#i_clagd_peer_ip}.
	 * @param ctx the parse tree
	 */
	void enterI_clagd_peer_ip(CumulusInterfacesParser.I_clagd_peer_ipContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#i_clagd_peer_ip}.
	 * @param ctx the parse tree
	 */
	void exitI_clagd_peer_ip(CumulusInterfacesParser.I_clagd_peer_ipContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#i_clagd_priority}.
	 * @param ctx the parse tree
	 */
	void enterI_clagd_priority(CumulusInterfacesParser.I_clagd_priorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#i_clagd_priority}.
	 * @param ctx the parse tree
	 */
	void exitI_clagd_priority(CumulusInterfacesParser.I_clagd_priorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#i_clagd_sys_mac}.
	 * @param ctx the parse tree
	 */
	void enterI_clagd_sys_mac(CumulusInterfacesParser.I_clagd_sys_macContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#i_clagd_sys_mac}.
	 * @param ctx the parse tree
	 */
	void exitI_clagd_sys_mac(CumulusInterfacesParser.I_clagd_sys_macContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#i_clagd_vxlan_anycast_ip}.
	 * @param ctx the parse tree
	 */
	void enterI_clagd_vxlan_anycast_ip(CumulusInterfacesParser.I_clagd_vxlan_anycast_ipContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#i_clagd_vxlan_anycast_ip}.
	 * @param ctx the parse tree
	 */
	void exitI_clagd_vxlan_anycast_ip(CumulusInterfacesParser.I_clagd_vxlan_anycast_ipContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#i_gateway}.
	 * @param ctx the parse tree
	 */
	void enterI_gateway(CumulusInterfacesParser.I_gatewayContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#i_gateway}.
	 * @param ctx the parse tree
	 */
	void exitI_gateway(CumulusInterfacesParser.I_gatewayContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#i_hwaddress}.
	 * @param ctx the parse tree
	 */
	void enterI_hwaddress(CumulusInterfacesParser.I_hwaddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#i_hwaddress}.
	 * @param ctx the parse tree
	 */
	void exitI_hwaddress(CumulusInterfacesParser.I_hwaddressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#i_link_speed}.
	 * @param ctx the parse tree
	 */
	void enterI_link_speed(CumulusInterfacesParser.I_link_speedContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#i_link_speed}.
	 * @param ctx the parse tree
	 */
	void exitI_link_speed(CumulusInterfacesParser.I_link_speedContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#i_link_autoneg}.
	 * @param ctx the parse tree
	 */
	void enterI_link_autoneg(CumulusInterfacesParser.I_link_autonegContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#i_link_autoneg}.
	 * @param ctx the parse tree
	 */
	void exitI_link_autoneg(CumulusInterfacesParser.I_link_autonegContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#i_mstpctl_bpduguard}.
	 * @param ctx the parse tree
	 */
	void enterI_mstpctl_bpduguard(CumulusInterfacesParser.I_mstpctl_bpduguardContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#i_mstpctl_bpduguard}.
	 * @param ctx the parse tree
	 */
	void exitI_mstpctl_bpduguard(CumulusInterfacesParser.I_mstpctl_bpduguardContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#i_mstpctl_portadminedge}.
	 * @param ctx the parse tree
	 */
	void enterI_mstpctl_portadminedge(CumulusInterfacesParser.I_mstpctl_portadminedgeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#i_mstpctl_portadminedge}.
	 * @param ctx the parse tree
	 */
	void exitI_mstpctl_portadminedge(CumulusInterfacesParser.I_mstpctl_portadminedgeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#i_mstpctl_portbpdufilter}.
	 * @param ctx the parse tree
	 */
	void enterI_mstpctl_portbpdufilter(CumulusInterfacesParser.I_mstpctl_portbpdufilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#i_mstpctl_portbpdufilter}.
	 * @param ctx the parse tree
	 */
	void exitI_mstpctl_portbpdufilter(CumulusInterfacesParser.I_mstpctl_portbpdufilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#i_mtu}.
	 * @param ctx the parse tree
	 */
	void enterI_mtu(CumulusInterfacesParser.I_mtuContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#i_mtu}.
	 * @param ctx the parse tree
	 */
	void exitI_mtu(CumulusInterfacesParser.I_mtuContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#i_post_up}.
	 * @param ctx the parse tree
	 */
	void enterI_post_up(CumulusInterfacesParser.I_post_upContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#i_post_up}.
	 * @param ctx the parse tree
	 */
	void exitI_post_up(CumulusInterfacesParser.I_post_upContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#ipu_ip}.
	 * @param ctx the parse tree
	 */
	void enterIpu_ip(CumulusInterfacesParser.Ipu_ipContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#ipu_ip}.
	 * @param ctx the parse tree
	 */
	void exitIpu_ip(CumulusInterfacesParser.Ipu_ipContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#ipui_link}.
	 * @param ctx the parse tree
	 */
	void enterIpui_link(CumulusInterfacesParser.Ipui_linkContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#ipui_link}.
	 * @param ctx the parse tree
	 */
	void exitIpui_link(CumulusInterfacesParser.Ipui_linkContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#ipuil_set}.
	 * @param ctx the parse tree
	 */
	void enterIpuil_set(CumulusInterfacesParser.Ipuil_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#ipuil_set}.
	 * @param ctx the parse tree
	 */
	void exitIpuil_set(CumulusInterfacesParser.Ipuil_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#ipui_route}.
	 * @param ctx the parse tree
	 */
	void enterIpui_route(CumulusInterfacesParser.Ipui_routeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#ipui_route}.
	 * @param ctx the parse tree
	 */
	void exitIpui_route(CumulusInterfacesParser.Ipui_routeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#ipuir_add}.
	 * @param ctx the parse tree
	 */
	void enterIpuir_add(CumulusInterfacesParser.Ipuir_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#ipuir_add}.
	 * @param ctx the parse tree
	 */
	void exitIpuir_add(CumulusInterfacesParser.Ipuir_addContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#i_vlan_id}.
	 * @param ctx the parse tree
	 */
	void enterI_vlan_id(CumulusInterfacesParser.I_vlan_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#i_vlan_id}.
	 * @param ctx the parse tree
	 */
	void exitI_vlan_id(CumulusInterfacesParser.I_vlan_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#i_vlan_raw_device}.
	 * @param ctx the parse tree
	 */
	void enterI_vlan_raw_device(CumulusInterfacesParser.I_vlan_raw_deviceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#i_vlan_raw_device}.
	 * @param ctx the parse tree
	 */
	void exitI_vlan_raw_device(CumulusInterfacesParser.I_vlan_raw_deviceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#i_vrf}.
	 * @param ctx the parse tree
	 */
	void enterI_vrf(CumulusInterfacesParser.I_vrfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#i_vrf}.
	 * @param ctx the parse tree
	 */
	void exitI_vrf(CumulusInterfacesParser.I_vrfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#i_vrf_table}.
	 * @param ctx the parse tree
	 */
	void enterI_vrf_table(CumulusInterfacesParser.I_vrf_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#i_vrf_table}.
	 * @param ctx the parse tree
	 */
	void exitI_vrf_table(CumulusInterfacesParser.I_vrf_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#i_vxlan_id}.
	 * @param ctx the parse tree
	 */
	void enterI_vxlan_id(CumulusInterfacesParser.I_vxlan_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#i_vxlan_id}.
	 * @param ctx the parse tree
	 */
	void exitI_vxlan_id(CumulusInterfacesParser.I_vxlan_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#i_vxlan_local_tunnel_ip}.
	 * @param ctx the parse tree
	 */
	void enterI_vxlan_local_tunnel_ip(CumulusInterfacesParser.I_vxlan_local_tunnel_ipContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#i_vxlan_local_tunnel_ip}.
	 * @param ctx the parse tree
	 */
	void exitI_vxlan_local_tunnel_ip(CumulusInterfacesParser.I_vxlan_local_tunnel_ipContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#interface_name}.
	 * @param ctx the parse tree
	 */
	void enterInterface_name(CumulusInterfacesParser.Interface_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#interface_name}.
	 * @param ctx the parse tree
	 */
	void exitInterface_name(CumulusInterfacesParser.Interface_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(CumulusInterfacesParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(CumulusInterfacesParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#number_or_range}.
	 * @param ctx the parse tree
	 */
	void enterNumber_or_range(CumulusInterfacesParser.Number_or_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#number_or_range}.
	 * @param ctx the parse tree
	 */
	void exitNumber_or_range(CumulusInterfacesParser.Number_or_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#address}.
	 * @param ctx the parse tree
	 */
	void enterAddress(CumulusInterfacesParser.AddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#address}.
	 * @param ctx the parse tree
	 */
	void exitAddress(CumulusInterfacesParser.AddressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterPrefix(CumulusInterfacesParser.PrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitPrefix(CumulusInterfacesParser.PrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#interface_address}.
	 * @param ctx the parse tree
	 */
	void enterInterface_address(CumulusInterfacesParser.Interface_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#interface_address}.
	 * @param ctx the parse tree
	 */
	void exitInterface_address(CumulusInterfacesParser.Interface_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#address6}.
	 * @param ctx the parse tree
	 */
	void enterAddress6(CumulusInterfacesParser.Address6Context ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#address6}.
	 * @param ctx the parse tree
	 */
	void exitAddress6(CumulusInterfacesParser.Address6Context ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#prefix6}.
	 * @param ctx the parse tree
	 */
	void enterPrefix6(CumulusInterfacesParser.Prefix6Context ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#prefix6}.
	 * @param ctx the parse tree
	 */
	void exitPrefix6(CumulusInterfacesParser.Prefix6Context ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#interface_address6}.
	 * @param ctx the parse tree
	 */
	void enterInterface_address6(CumulusInterfacesParser.Interface_address6Context ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#interface_address6}.
	 * @param ctx the parse tree
	 */
	void exitInterface_address6(CumulusInterfacesParser.Interface_address6Context ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#vlan_id}.
	 * @param ctx the parse tree
	 */
	void enterVlan_id(CumulusInterfacesParser.Vlan_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#vlan_id}.
	 * @param ctx the parse tree
	 */
	void exitVlan_id(CumulusInterfacesParser.Vlan_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#vrf_name}.
	 * @param ctx the parse tree
	 */
	void enterVrf_name(CumulusInterfacesParser.Vrf_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#vrf_name}.
	 * @param ctx the parse tree
	 */
	void exitVrf_name(CumulusInterfacesParser.Vrf_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#vrf_table_name}.
	 * @param ctx the parse tree
	 */
	void enterVrf_table_name(CumulusInterfacesParser.Vrf_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#vrf_table_name}.
	 * @param ctx the parse tree
	 */
	void exitVrf_table_name(CumulusInterfacesParser.Vrf_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusInterfacesParser#null_rest_of_line}.
	 * @param ctx the parse tree
	 */
	void enterNull_rest_of_line(CumulusInterfacesParser.Null_rest_of_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusInterfacesParser#null_rest_of_line}.
	 * @param ctx the parse tree
	 */
	void exitNull_rest_of_line(CumulusInterfacesParser.Null_rest_of_lineContext ctx);
}