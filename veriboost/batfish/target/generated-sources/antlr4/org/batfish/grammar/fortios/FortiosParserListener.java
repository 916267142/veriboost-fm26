// Generated from org/batfish/grammar/fortios/FortiosParser.g4 by ANTLR 4.7.2
package org.batfish.grammar.fortios;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FortiosParser}.
 */
public interface FortiosParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FortiosParser#fortios_configuration}.
	 * @param ctx the parse tree
	 */
	void enterFortios_configuration(FortiosParser.Fortios_configurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#fortios_configuration}.
	 * @param ctx the parse tree
	 */
	void exitFortios_configuration(FortiosParser.Fortios_configurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(FortiosParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(FortiosParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#s_config}.
	 * @param ctx the parse tree
	 */
	void enterS_config(FortiosParser.S_configContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#s_config}.
	 * @param ctx the parse tree
	 */
	void exitS_config(FortiosParser.S_configContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cf_address}.
	 * @param ctx the parse tree
	 */
	void enterCf_address(FortiosParser.Cf_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cf_address}.
	 * @param ctx the parse tree
	 */
	void exitCf_address(FortiosParser.Cf_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfa}.
	 * @param ctx the parse tree
	 */
	void enterCfa(FortiosParser.CfaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfa}.
	 * @param ctx the parse tree
	 */
	void exitCfa(FortiosParser.CfaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfa_rename}.
	 * @param ctx the parse tree
	 */
	void enterCfa_rename(FortiosParser.Cfa_renameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfa_rename}.
	 * @param ctx the parse tree
	 */
	void exitCfa_rename(FortiosParser.Cfa_renameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfa_edit}.
	 * @param ctx the parse tree
	 */
	void enterCfa_edit(FortiosParser.Cfa_editContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfa_edit}.
	 * @param ctx the parse tree
	 */
	void exitCfa_edit(FortiosParser.Cfa_editContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfae}.
	 * @param ctx the parse tree
	 */
	void enterCfae(FortiosParser.CfaeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfae}.
	 * @param ctx the parse tree
	 */
	void exitCfae(FortiosParser.CfaeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfa_set_singletons}.
	 * @param ctx the parse tree
	 */
	void enterCfa_set_singletons(FortiosParser.Cfa_set_singletonsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfa_set_singletons}.
	 * @param ctx the parse tree
	 */
	void exitCfa_set_singletons(FortiosParser.Cfa_set_singletonsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfa_set_allow_routing}.
	 * @param ctx the parse tree
	 */
	void enterCfa_set_allow_routing(FortiosParser.Cfa_set_allow_routingContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfa_set_allow_routing}.
	 * @param ctx the parse tree
	 */
	void exitCfa_set_allow_routing(FortiosParser.Cfa_set_allow_routingContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfa_set_associated_interface}.
	 * @param ctx the parse tree
	 */
	void enterCfa_set_associated_interface(FortiosParser.Cfa_set_associated_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfa_set_associated_interface}.
	 * @param ctx the parse tree
	 */
	void exitCfa_set_associated_interface(FortiosParser.Cfa_set_associated_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfa_set_comment}.
	 * @param ctx the parse tree
	 */
	void enterCfa_set_comment(FortiosParser.Cfa_set_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfa_set_comment}.
	 * @param ctx the parse tree
	 */
	void exitCfa_set_comment(FortiosParser.Cfa_set_commentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfa_set_end_ip}.
	 * @param ctx the parse tree
	 */
	void enterCfa_set_end_ip(FortiosParser.Cfa_set_end_ipContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfa_set_end_ip}.
	 * @param ctx the parse tree
	 */
	void exitCfa_set_end_ip(FortiosParser.Cfa_set_end_ipContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfa_set_interface}.
	 * @param ctx the parse tree
	 */
	void enterCfa_set_interface(FortiosParser.Cfa_set_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfa_set_interface}.
	 * @param ctx the parse tree
	 */
	void exitCfa_set_interface(FortiosParser.Cfa_set_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfa_set_fabric_object}.
	 * @param ctx the parse tree
	 */
	void enterCfa_set_fabric_object(FortiosParser.Cfa_set_fabric_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfa_set_fabric_object}.
	 * @param ctx the parse tree
	 */
	void exitCfa_set_fabric_object(FortiosParser.Cfa_set_fabric_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfa_set_start_ip}.
	 * @param ctx the parse tree
	 */
	void enterCfa_set_start_ip(FortiosParser.Cfa_set_start_ipContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfa_set_start_ip}.
	 * @param ctx the parse tree
	 */
	void exitCfa_set_start_ip(FortiosParser.Cfa_set_start_ipContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfa_set_subnet}.
	 * @param ctx the parse tree
	 */
	void enterCfa_set_subnet(FortiosParser.Cfa_set_subnetContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfa_set_subnet}.
	 * @param ctx the parse tree
	 */
	void exitCfa_set_subnet(FortiosParser.Cfa_set_subnetContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfa_set_type}.
	 * @param ctx the parse tree
	 */
	void enterCfa_set_type(FortiosParser.Cfa_set_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfa_set_type}.
	 * @param ctx the parse tree
	 */
	void exitCfa_set_type(FortiosParser.Cfa_set_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfa_set_wildcard}.
	 * @param ctx the parse tree
	 */
	void enterCfa_set_wildcard(FortiosParser.Cfa_set_wildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfa_set_wildcard}.
	 * @param ctx the parse tree
	 */
	void exitCfa_set_wildcard(FortiosParser.Cfa_set_wildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfa_set_null}.
	 * @param ctx the parse tree
	 */
	void enterCfa_set_null(FortiosParser.Cfa_set_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfa_set_null}.
	 * @param ctx the parse tree
	 */
	void exitCfa_set_null(FortiosParser.Cfa_set_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#address_type}.
	 * @param ctx the parse tree
	 */
	void enterAddress_type(FortiosParser.Address_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#address_type}.
	 * @param ctx the parse tree
	 */
	void exitAddress_type(FortiosParser.Address_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#address_name}.
	 * @param ctx the parse tree
	 */
	void enterAddress_name(FortiosParser.Address_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#address_name}.
	 * @param ctx the parse tree
	 */
	void exitAddress_name(FortiosParser.Address_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#double_quoted_string}.
	 * @param ctx the parse tree
	 */
	void enterDouble_quoted_string(FortiosParser.Double_quoted_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#double_quoted_string}.
	 * @param ctx the parse tree
	 */
	void exitDouble_quoted_string(FortiosParser.Double_quoted_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#single_quoted_string}.
	 * @param ctx the parse tree
	 */
	void enterSingle_quoted_string(FortiosParser.Single_quoted_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#single_quoted_string}.
	 * @param ctx the parse tree
	 */
	void exitSingle_quoted_string(FortiosParser.Single_quoted_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#interface_or_zone_name}.
	 * @param ctx the parse tree
	 */
	void enterInterface_or_zone_name(FortiosParser.Interface_or_zone_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#interface_or_zone_name}.
	 * @param ctx the parse tree
	 */
	void exitInterface_or_zone_name(FortiosParser.Interface_or_zone_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#interface_names}.
	 * @param ctx the parse tree
	 */
	void enterInterface_names(FortiosParser.Interface_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#interface_names}.
	 * @param ctx the parse tree
	 */
	void exitInterface_names(FortiosParser.Interface_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#quoted_text}.
	 * @param ctx the parse tree
	 */
	void enterQuoted_text(FortiosParser.Quoted_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#quoted_text}.
	 * @param ctx the parse tree
	 */
	void exitQuoted_text(FortiosParser.Quoted_textContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#ip_address}.
	 * @param ctx the parse tree
	 */
	void enterIp_address(FortiosParser.Ip_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#ip_address}.
	 * @param ctx the parse tree
	 */
	void exitIp_address(FortiosParser.Ip_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#subnet_mask}.
	 * @param ctx the parse tree
	 */
	void enterSubnet_mask(FortiosParser.Subnet_maskContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#subnet_mask}.
	 * @param ctx the parse tree
	 */
	void exitSubnet_mask(FortiosParser.Subnet_maskContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#ip_prefix}.
	 * @param ctx the parse tree
	 */
	void enterIp_prefix(FortiosParser.Ip_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#ip_prefix}.
	 * @param ctx the parse tree
	 */
	void exitIp_prefix(FortiosParser.Ip_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#ip_address_with_mask_or_prefix}.
	 * @param ctx the parse tree
	 */
	void enterIp_address_with_mask_or_prefix(FortiosParser.Ip_address_with_mask_or_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#ip_address_with_mask_or_prefix}.
	 * @param ctx the parse tree
	 */
	void exitIp_address_with_mask_or_prefix(FortiosParser.Ip_address_with_mask_or_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#ip_wildcard}.
	 * @param ctx the parse tree
	 */
	void enterIp_wildcard(FortiosParser.Ip_wildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#ip_wildcard}.
	 * @param ctx the parse tree
	 */
	void exitIp_wildcard(FortiosParser.Ip_wildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#ipv6_address}.
	 * @param ctx the parse tree
	 */
	void enterIpv6_address(FortiosParser.Ipv6_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#ipv6_address}.
	 * @param ctx the parse tree
	 */
	void exitIpv6_address(FortiosParser.Ipv6_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#ipv6_prefix}.
	 * @param ctx the parse tree
	 */
	void enterIpv6_prefix(FortiosParser.Ipv6_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#ipv6_prefix}.
	 * @param ctx the parse tree
	 */
	void exitIpv6_prefix(FortiosParser.Ipv6_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#mac_address_literal}.
	 * @param ctx the parse tree
	 */
	void enterMac_address_literal(FortiosParser.Mac_address_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#mac_address_literal}.
	 * @param ctx the parse tree
	 */
	void exitMac_address_literal(FortiosParser.Mac_address_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#newline}.
	 * @param ctx the parse tree
	 */
	void enterNewline(FortiosParser.NewlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#newline}.
	 * @param ctx the parse tree
	 */
	void exitNewline(FortiosParser.NewlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#null_rest_of_line}.
	 * @param ctx the parse tree
	 */
	void enterNull_rest_of_line(FortiosParser.Null_rest_of_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#null_rest_of_line}.
	 * @param ctx the parse tree
	 */
	void exitNull_rest_of_line(FortiosParser.Null_rest_of_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#uint8}.
	 * @param ctx the parse tree
	 */
	void enterUint8(FortiosParser.Uint8Context ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#uint8}.
	 * @param ctx the parse tree
	 */
	void exitUint8(FortiosParser.Uint8Context ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#uint16}.
	 * @param ctx the parse tree
	 */
	void enterUint16(FortiosParser.Uint16Context ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#uint16}.
	 * @param ctx the parse tree
	 */
	void exitUint16(FortiosParser.Uint16Context ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#uint32}.
	 * @param ctx the parse tree
	 */
	void enterUint32(FortiosParser.Uint32Context ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#uint32}.
	 * @param ctx the parse tree
	 */
	void exitUint32(FortiosParser.Uint32Context ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(FortiosParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(FortiosParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#str}.
	 * @param ctx the parse tree
	 */
	void enterStr(FortiosParser.StrContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#str}.
	 * @param ctx the parse tree
	 */
	void exitStr(FortiosParser.StrContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#str_content}.
	 * @param ctx the parse tree
	 */
	void enterStr_content(FortiosParser.Str_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#str_content}.
	 * @param ctx the parse tree
	 */
	void exitStr_content(FortiosParser.Str_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#enable_or_disable}.
	 * @param ctx the parse tree
	 */
	void enterEnable_or_disable(FortiosParser.Enable_or_disableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#enable_or_disable}.
	 * @param ctx the parse tree
	 */
	void exitEnable_or_disable(FortiosParser.Enable_or_disableContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#up_or_down}.
	 * @param ctx the parse tree
	 */
	void enterUp_or_down(FortiosParser.Up_or_downContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#up_or_down}.
	 * @param ctx the parse tree
	 */
	void exitUp_or_down(FortiosParser.Up_or_downContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#port_range}.
	 * @param ctx the parse tree
	 */
	void enterPort_range(FortiosParser.Port_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#port_range}.
	 * @param ctx the parse tree
	 */
	void exitPort_range(FortiosParser.Port_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#allow_or_deny}.
	 * @param ctx the parse tree
	 */
	void enterAllow_or_deny(FortiosParser.Allow_or_denyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#allow_or_deny}.
	 * @param ctx the parse tree
	 */
	void exitAllow_or_deny(FortiosParser.Allow_or_denyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#c_firewall}.
	 * @param ctx the parse tree
	 */
	void enterC_firewall(FortiosParser.C_firewallContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#c_firewall}.
	 * @param ctx the parse tree
	 */
	void exitC_firewall(FortiosParser.C_firewallContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cs_interface}.
	 * @param ctx the parse tree
	 */
	void enterCs_interface(FortiosParser.Cs_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cs_interface}.
	 * @param ctx the parse tree
	 */
	void exitCs_interface(FortiosParser.Cs_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#csi_edit}.
	 * @param ctx the parse tree
	 */
	void enterCsi_edit(FortiosParser.Csi_editContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#csi_edit}.
	 * @param ctx the parse tree
	 */
	void exitCsi_edit(FortiosParser.Csi_editContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#csie}.
	 * @param ctx the parse tree
	 */
	void enterCsie(FortiosParser.CsieContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#csie}.
	 * @param ctx the parse tree
	 */
	void exitCsie(FortiosParser.CsieContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#csi_set_singletons}.
	 * @param ctx the parse tree
	 */
	void enterCsi_set_singletons(FortiosParser.Csi_set_singletonsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#csi_set_singletons}.
	 * @param ctx the parse tree
	 */
	void exitCsi_set_singletons(FortiosParser.Csi_set_singletonsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#csi_set_alias}.
	 * @param ctx the parse tree
	 */
	void enterCsi_set_alias(FortiosParser.Csi_set_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#csi_set_alias}.
	 * @param ctx the parse tree
	 */
	void exitCsi_set_alias(FortiosParser.Csi_set_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#csi_set_description}.
	 * @param ctx the parse tree
	 */
	void enterCsi_set_description(FortiosParser.Csi_set_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#csi_set_description}.
	 * @param ctx the parse tree
	 */
	void exitCsi_set_description(FortiosParser.Csi_set_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#csi_set_ip}.
	 * @param ctx the parse tree
	 */
	void enterCsi_set_ip(FortiosParser.Csi_set_ipContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#csi_set_ip}.
	 * @param ctx the parse tree
	 */
	void exitCsi_set_ip(FortiosParser.Csi_set_ipContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#csi_set_mtu}.
	 * @param ctx the parse tree
	 */
	void enterCsi_set_mtu(FortiosParser.Csi_set_mtuContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#csi_set_mtu}.
	 * @param ctx the parse tree
	 */
	void exitCsi_set_mtu(FortiosParser.Csi_set_mtuContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#csi_set_mtu_override}.
	 * @param ctx the parse tree
	 */
	void enterCsi_set_mtu_override(FortiosParser.Csi_set_mtu_overrideContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#csi_set_mtu_override}.
	 * @param ctx the parse tree
	 */
	void exitCsi_set_mtu_override(FortiosParser.Csi_set_mtu_overrideContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#csi_set_status}.
	 * @param ctx the parse tree
	 */
	void enterCsi_set_status(FortiosParser.Csi_set_statusContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#csi_set_status}.
	 * @param ctx the parse tree
	 */
	void exitCsi_set_status(FortiosParser.Csi_set_statusContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#csi_set_type}.
	 * @param ctx the parse tree
	 */
	void enterCsi_set_type(FortiosParser.Csi_set_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#csi_set_type}.
	 * @param ctx the parse tree
	 */
	void exitCsi_set_type(FortiosParser.Csi_set_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#csi_set_vdom}.
	 * @param ctx the parse tree
	 */
	void enterCsi_set_vdom(FortiosParser.Csi_set_vdomContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#csi_set_vdom}.
	 * @param ctx the parse tree
	 */
	void exitCsi_set_vdom(FortiosParser.Csi_set_vdomContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#csi_set_vrf}.
	 * @param ctx the parse tree
	 */
	void enterCsi_set_vrf(FortiosParser.Csi_set_vrfContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#csi_set_vrf}.
	 * @param ctx the parse tree
	 */
	void exitCsi_set_vrf(FortiosParser.Csi_set_vrfContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#csi_set_null}.
	 * @param ctx the parse tree
	 */
	void enterCsi_set_null(FortiosParser.Csi_set_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#csi_set_null}.
	 * @param ctx the parse tree
	 */
	void exitCsi_set_null(FortiosParser.Csi_set_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#mtu}.
	 * @param ctx the parse tree
	 */
	void enterMtu(FortiosParser.MtuContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#mtu}.
	 * @param ctx the parse tree
	 */
	void exitMtu(FortiosParser.MtuContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#vrf}.
	 * @param ctx the parse tree
	 */
	void enterVrf(FortiosParser.VrfContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#vrf}.
	 * @param ctx the parse tree
	 */
	void exitVrf(FortiosParser.VrfContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#interface_type}.
	 * @param ctx the parse tree
	 */
	void enterInterface_type(FortiosParser.Interface_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#interface_type}.
	 * @param ctx the parse tree
	 */
	void exitInterface_type(FortiosParser.Interface_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#interface_alias}.
	 * @param ctx the parse tree
	 */
	void enterInterface_alias(FortiosParser.Interface_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#interface_alias}.
	 * @param ctx the parse tree
	 */
	void exitInterface_alias(FortiosParser.Interface_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#interface_name}.
	 * @param ctx the parse tree
	 */
	void enterInterface_name(FortiosParser.Interface_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#interface_name}.
	 * @param ctx the parse tree
	 */
	void exitInterface_name(FortiosParser.Interface_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cf_policy}.
	 * @param ctx the parse tree
	 */
	void enterCf_policy(FortiosParser.Cf_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cf_policy}.
	 * @param ctx the parse tree
	 */
	void exitCf_policy(FortiosParser.Cf_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfp_edit}.
	 * @param ctx the parse tree
	 */
	void enterCfp_edit(FortiosParser.Cfp_editContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfp_edit}.
	 * @param ctx the parse tree
	 */
	void exitCfp_edit(FortiosParser.Cfp_editContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfpe}.
	 * @param ctx the parse tree
	 */
	void enterCfpe(FortiosParser.CfpeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfpe}.
	 * @param ctx the parse tree
	 */
	void exitCfpe(FortiosParser.CfpeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfp_set_singletons}.
	 * @param ctx the parse tree
	 */
	void enterCfp_set_singletons(FortiosParser.Cfp_set_singletonsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfp_set_singletons}.
	 * @param ctx the parse tree
	 */
	void exitCfp_set_singletons(FortiosParser.Cfp_set_singletonsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfp_set_action}.
	 * @param ctx the parse tree
	 */
	void enterCfp_set_action(FortiosParser.Cfp_set_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfp_set_action}.
	 * @param ctx the parse tree
	 */
	void exitCfp_set_action(FortiosParser.Cfp_set_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfp_set_comments}.
	 * @param ctx the parse tree
	 */
	void enterCfp_set_comments(FortiosParser.Cfp_set_commentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfp_set_comments}.
	 * @param ctx the parse tree
	 */
	void exitCfp_set_comments(FortiosParser.Cfp_set_commentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfp_set_name}.
	 * @param ctx the parse tree
	 */
	void enterCfp_set_name(FortiosParser.Cfp_set_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfp_set_name}.
	 * @param ctx the parse tree
	 */
	void exitCfp_set_name(FortiosParser.Cfp_set_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfp_set_status}.
	 * @param ctx the parse tree
	 */
	void enterCfp_set_status(FortiosParser.Cfp_set_statusContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfp_set_status}.
	 * @param ctx the parse tree
	 */
	void exitCfp_set_status(FortiosParser.Cfp_set_statusContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfp_set_lists}.
	 * @param ctx the parse tree
	 */
	void enterCfp_set_lists(FortiosParser.Cfp_set_listsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfp_set_lists}.
	 * @param ctx the parse tree
	 */
	void exitCfp_set_lists(FortiosParser.Cfp_set_listsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfp_set_dstaddr}.
	 * @param ctx the parse tree
	 */
	void enterCfp_set_dstaddr(FortiosParser.Cfp_set_dstaddrContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfp_set_dstaddr}.
	 * @param ctx the parse tree
	 */
	void exitCfp_set_dstaddr(FortiosParser.Cfp_set_dstaddrContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfp_set_srcaddr}.
	 * @param ctx the parse tree
	 */
	void enterCfp_set_srcaddr(FortiosParser.Cfp_set_srcaddrContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfp_set_srcaddr}.
	 * @param ctx the parse tree
	 */
	void exitCfp_set_srcaddr(FortiosParser.Cfp_set_srcaddrContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfp_set_service}.
	 * @param ctx the parse tree
	 */
	void enterCfp_set_service(FortiosParser.Cfp_set_serviceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfp_set_service}.
	 * @param ctx the parse tree
	 */
	void exitCfp_set_service(FortiosParser.Cfp_set_serviceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfp_set_dstintf}.
	 * @param ctx the parse tree
	 */
	void enterCfp_set_dstintf(FortiosParser.Cfp_set_dstintfContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfp_set_dstintf}.
	 * @param ctx the parse tree
	 */
	void exitCfp_set_dstintf(FortiosParser.Cfp_set_dstintfContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfp_set_srcintf}.
	 * @param ctx the parse tree
	 */
	void enterCfp_set_srcintf(FortiosParser.Cfp_set_srcintfContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfp_set_srcintf}.
	 * @param ctx the parse tree
	 */
	void exitCfp_set_srcintf(FortiosParser.Cfp_set_srcintfContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfp_append}.
	 * @param ctx the parse tree
	 */
	void enterCfp_append(FortiosParser.Cfp_appendContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfp_append}.
	 * @param ctx the parse tree
	 */
	void exitCfp_append(FortiosParser.Cfp_appendContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfp_append_dstaddr}.
	 * @param ctx the parse tree
	 */
	void enterCfp_append_dstaddr(FortiosParser.Cfp_append_dstaddrContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfp_append_dstaddr}.
	 * @param ctx the parse tree
	 */
	void exitCfp_append_dstaddr(FortiosParser.Cfp_append_dstaddrContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfp_append_srcaddr}.
	 * @param ctx the parse tree
	 */
	void enterCfp_append_srcaddr(FortiosParser.Cfp_append_srcaddrContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfp_append_srcaddr}.
	 * @param ctx the parse tree
	 */
	void exitCfp_append_srcaddr(FortiosParser.Cfp_append_srcaddrContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfp_append_service}.
	 * @param ctx the parse tree
	 */
	void enterCfp_append_service(FortiosParser.Cfp_append_serviceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfp_append_service}.
	 * @param ctx the parse tree
	 */
	void exitCfp_append_service(FortiosParser.Cfp_append_serviceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfp_append_dstintf}.
	 * @param ctx the parse tree
	 */
	void enterCfp_append_dstintf(FortiosParser.Cfp_append_dstintfContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfp_append_dstintf}.
	 * @param ctx the parse tree
	 */
	void exitCfp_append_dstintf(FortiosParser.Cfp_append_dstintfContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfp_append_srcintf}.
	 * @param ctx the parse tree
	 */
	void enterCfp_append_srcintf(FortiosParser.Cfp_append_srcintfContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfp_append_srcintf}.
	 * @param ctx the parse tree
	 */
	void exitCfp_append_srcintf(FortiosParser.Cfp_append_srcintfContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#policy_name}.
	 * @param ctx the parse tree
	 */
	void enterPolicy_name(FortiosParser.Policy_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#policy_name}.
	 * @param ctx the parse tree
	 */
	void exitPolicy_name(FortiosParser.Policy_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#policy_status}.
	 * @param ctx the parse tree
	 */
	void enterPolicy_status(FortiosParser.Policy_statusContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#policy_status}.
	 * @param ctx the parse tree
	 */
	void exitPolicy_status(FortiosParser.Policy_statusContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#policy_number}.
	 * @param ctx the parse tree
	 */
	void enterPolicy_number(FortiosParser.Policy_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#policy_number}.
	 * @param ctx the parse tree
	 */
	void exitPolicy_number(FortiosParser.Policy_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#policy_action}.
	 * @param ctx the parse tree
	 */
	void enterPolicy_action(FortiosParser.Policy_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#policy_action}.
	 * @param ctx the parse tree
	 */
	void exitPolicy_action(FortiosParser.Policy_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#address_names}.
	 * @param ctx the parse tree
	 */
	void enterAddress_names(FortiosParser.Address_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#address_names}.
	 * @param ctx the parse tree
	 */
	void exitAddress_names(FortiosParser.Address_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#service_names}.
	 * @param ctx the parse tree
	 */
	void enterService_names(FortiosParser.Service_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#service_names}.
	 * @param ctx the parse tree
	 */
	void exitService_names(FortiosParser.Service_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#interface_or_zone_names}.
	 * @param ctx the parse tree
	 */
	void enterInterface_or_zone_names(FortiosParser.Interface_or_zone_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#interface_or_zone_names}.
	 * @param ctx the parse tree
	 */
	void exitInterface_or_zone_names(FortiosParser.Interface_or_zone_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cf_service}.
	 * @param ctx the parse tree
	 */
	void enterCf_service(FortiosParser.Cf_serviceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cf_service}.
	 * @param ctx the parse tree
	 */
	void exitCf_service(FortiosParser.Cf_serviceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfs_custom}.
	 * @param ctx the parse tree
	 */
	void enterCfs_custom(FortiosParser.Cfs_customContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfs_custom}.
	 * @param ctx the parse tree
	 */
	void exitCfs_custom(FortiosParser.Cfs_customContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfsc}.
	 * @param ctx the parse tree
	 */
	void enterCfsc(FortiosParser.CfscContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfsc}.
	 * @param ctx the parse tree
	 */
	void exitCfsc(FortiosParser.CfscContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfsc_rename}.
	 * @param ctx the parse tree
	 */
	void enterCfsc_rename(FortiosParser.Cfsc_renameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfsc_rename}.
	 * @param ctx the parse tree
	 */
	void exitCfsc_rename(FortiosParser.Cfsc_renameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfsc_edit}.
	 * @param ctx the parse tree
	 */
	void enterCfsc_edit(FortiosParser.Cfsc_editContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfsc_edit}.
	 * @param ctx the parse tree
	 */
	void exitCfsc_edit(FortiosParser.Cfsc_editContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfsce}.
	 * @param ctx the parse tree
	 */
	void enterCfsce(FortiosParser.CfsceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfsce}.
	 * @param ctx the parse tree
	 */
	void exitCfsce(FortiosParser.CfsceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfsc_set_singletons}.
	 * @param ctx the parse tree
	 */
	void enterCfsc_set_singletons(FortiosParser.Cfsc_set_singletonsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfsc_set_singletons}.
	 * @param ctx the parse tree
	 */
	void exitCfsc_set_singletons(FortiosParser.Cfsc_set_singletonsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfsc_set_comment}.
	 * @param ctx the parse tree
	 */
	void enterCfsc_set_comment(FortiosParser.Cfsc_set_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfsc_set_comment}.
	 * @param ctx the parse tree
	 */
	void exitCfsc_set_comment(FortiosParser.Cfsc_set_commentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfsc_set_icmpcode}.
	 * @param ctx the parse tree
	 */
	void enterCfsc_set_icmpcode(FortiosParser.Cfsc_set_icmpcodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfsc_set_icmpcode}.
	 * @param ctx the parse tree
	 */
	void exitCfsc_set_icmpcode(FortiosParser.Cfsc_set_icmpcodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfsc_set_icmptype}.
	 * @param ctx the parse tree
	 */
	void enterCfsc_set_icmptype(FortiosParser.Cfsc_set_icmptypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfsc_set_icmptype}.
	 * @param ctx the parse tree
	 */
	void exitCfsc_set_icmptype(FortiosParser.Cfsc_set_icmptypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfsc_set_protocol}.
	 * @param ctx the parse tree
	 */
	void enterCfsc_set_protocol(FortiosParser.Cfsc_set_protocolContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfsc_set_protocol}.
	 * @param ctx the parse tree
	 */
	void exitCfsc_set_protocol(FortiosParser.Cfsc_set_protocolContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfsc_set_protocol_number}.
	 * @param ctx the parse tree
	 */
	void enterCfsc_set_protocol_number(FortiosParser.Cfsc_set_protocol_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfsc_set_protocol_number}.
	 * @param ctx the parse tree
	 */
	void exitCfsc_set_protocol_number(FortiosParser.Cfsc_set_protocol_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfsc_set_sctp_portrange}.
	 * @param ctx the parse tree
	 */
	void enterCfsc_set_sctp_portrange(FortiosParser.Cfsc_set_sctp_portrangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfsc_set_sctp_portrange}.
	 * @param ctx the parse tree
	 */
	void exitCfsc_set_sctp_portrange(FortiosParser.Cfsc_set_sctp_portrangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfsc_set_tcp_portrange}.
	 * @param ctx the parse tree
	 */
	void enterCfsc_set_tcp_portrange(FortiosParser.Cfsc_set_tcp_portrangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfsc_set_tcp_portrange}.
	 * @param ctx the parse tree
	 */
	void exitCfsc_set_tcp_portrange(FortiosParser.Cfsc_set_tcp_portrangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cfsc_set_udp_portrange}.
	 * @param ctx the parse tree
	 */
	void enterCfsc_set_udp_portrange(FortiosParser.Cfsc_set_udp_portrangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cfsc_set_udp_portrange}.
	 * @param ctx the parse tree
	 */
	void exitCfsc_set_udp_portrange(FortiosParser.Cfsc_set_udp_portrangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#service_name}.
	 * @param ctx the parse tree
	 */
	void enterService_name(FortiosParser.Service_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#service_name}.
	 * @param ctx the parse tree
	 */
	void exitService_name(FortiosParser.Service_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#service_protocol}.
	 * @param ctx the parse tree
	 */
	void enterService_protocol(FortiosParser.Service_protocolContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#service_protocol}.
	 * @param ctx the parse tree
	 */
	void exitService_protocol(FortiosParser.Service_protocolContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#service_port_ranges}.
	 * @param ctx the parse tree
	 */
	void enterService_port_ranges(FortiosParser.Service_port_rangesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#service_port_ranges}.
	 * @param ctx the parse tree
	 */
	void exitService_port_ranges(FortiosParser.Service_port_rangesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#service_port_range}.
	 * @param ctx the parse tree
	 */
	void enterService_port_range(FortiosParser.Service_port_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#service_port_range}.
	 * @param ctx the parse tree
	 */
	void exitService_port_range(FortiosParser.Service_port_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#ip_protocol_number}.
	 * @param ctx the parse tree
	 */
	void enterIp_protocol_number(FortiosParser.Ip_protocol_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#ip_protocol_number}.
	 * @param ctx the parse tree
	 */
	void exitIp_protocol_number(FortiosParser.Ip_protocol_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#c_system}.
	 * @param ctx the parse tree
	 */
	void enterC_system(FortiosParser.C_systemContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#c_system}.
	 * @param ctx the parse tree
	 */
	void exitC_system(FortiosParser.C_systemContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cs_global}.
	 * @param ctx the parse tree
	 */
	void enterCs_global(FortiosParser.Cs_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cs_global}.
	 * @param ctx the parse tree
	 */
	void exitCs_global(FortiosParser.Cs_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#csg}.
	 * @param ctx the parse tree
	 */
	void enterCsg(FortiosParser.CsgContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#csg}.
	 * @param ctx the parse tree
	 */
	void exitCsg(FortiosParser.CsgContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#csg_hostname}.
	 * @param ctx the parse tree
	 */
	void enterCsg_hostname(FortiosParser.Csg_hostnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#csg_hostname}.
	 * @param ctx the parse tree
	 */
	void exitCsg_hostname(FortiosParser.Csg_hostnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#device_hostname}.
	 * @param ctx the parse tree
	 */
	void enterDevice_hostname(FortiosParser.Device_hostnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#device_hostname}.
	 * @param ctx the parse tree
	 */
	void exitDevice_hostname(FortiosParser.Device_hostnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cs_replacemsg}.
	 * @param ctx the parse tree
	 */
	void enterCs_replacemsg(FortiosParser.Cs_replacemsgContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cs_replacemsg}.
	 * @param ctx the parse tree
	 */
	void exitCs_replacemsg(FortiosParser.Cs_replacemsgContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#replacemsg_major_type}.
	 * @param ctx the parse tree
	 */
	void enterReplacemsg_major_type(FortiosParser.Replacemsg_major_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#replacemsg_major_type}.
	 * @param ctx the parse tree
	 */
	void exitReplacemsg_major_type(FortiosParser.Replacemsg_major_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#replacemsg_minor_type}.
	 * @param ctx the parse tree
	 */
	void enterReplacemsg_minor_type(FortiosParser.Replacemsg_minor_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#replacemsg_minor_type}.
	 * @param ctx the parse tree
	 */
	void exitReplacemsg_minor_type(FortiosParser.Replacemsg_minor_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#csr}.
	 * @param ctx the parse tree
	 */
	void enterCsr(FortiosParser.CsrContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#csr}.
	 * @param ctx the parse tree
	 */
	void exitCsr(FortiosParser.CsrContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#csr_set_buffer}.
	 * @param ctx the parse tree
	 */
	void enterCsr_set_buffer(FortiosParser.Csr_set_bufferContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#csr_set_buffer}.
	 * @param ctx the parse tree
	 */
	void exitCsr_set_buffer(FortiosParser.Csr_set_bufferContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#csr_unset_buffer}.
	 * @param ctx the parse tree
	 */
	void enterCsr_unset_buffer(FortiosParser.Csr_unset_bufferContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#csr_unset_buffer}.
	 * @param ctx the parse tree
	 */
	void exitCsr_unset_buffer(FortiosParser.Csr_unset_bufferContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#cs_zone}.
	 * @param ctx the parse tree
	 */
	void enterCs_zone(FortiosParser.Cs_zoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#cs_zone}.
	 * @param ctx the parse tree
	 */
	void exitCs_zone(FortiosParser.Cs_zoneContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#csz}.
	 * @param ctx the parse tree
	 */
	void enterCsz(FortiosParser.CszContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#csz}.
	 * @param ctx the parse tree
	 */
	void exitCsz(FortiosParser.CszContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#csz_edit}.
	 * @param ctx the parse tree
	 */
	void enterCsz_edit(FortiosParser.Csz_editContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#csz_edit}.
	 * @param ctx the parse tree
	 */
	void exitCsz_edit(FortiosParser.Csz_editContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#csz_rename}.
	 * @param ctx the parse tree
	 */
	void enterCsz_rename(FortiosParser.Csz_renameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#csz_rename}.
	 * @param ctx the parse tree
	 */
	void exitCsz_rename(FortiosParser.Csz_renameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#csze}.
	 * @param ctx the parse tree
	 */
	void enterCsze(FortiosParser.CszeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#csze}.
	 * @param ctx the parse tree
	 */
	void exitCsze(FortiosParser.CszeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#csz_set_singletons}.
	 * @param ctx the parse tree
	 */
	void enterCsz_set_singletons(FortiosParser.Csz_set_singletonsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#csz_set_singletons}.
	 * @param ctx the parse tree
	 */
	void exitCsz_set_singletons(FortiosParser.Csz_set_singletonsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#csz_set_description}.
	 * @param ctx the parse tree
	 */
	void enterCsz_set_description(FortiosParser.Csz_set_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#csz_set_description}.
	 * @param ctx the parse tree
	 */
	void exitCsz_set_description(FortiosParser.Csz_set_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#csz_set_intrazone}.
	 * @param ctx the parse tree
	 */
	void enterCsz_set_intrazone(FortiosParser.Csz_set_intrazoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#csz_set_intrazone}.
	 * @param ctx the parse tree
	 */
	void exitCsz_set_intrazone(FortiosParser.Csz_set_intrazoneContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#csz_set_interface}.
	 * @param ctx the parse tree
	 */
	void enterCsz_set_interface(FortiosParser.Csz_set_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#csz_set_interface}.
	 * @param ctx the parse tree
	 */
	void exitCsz_set_interface(FortiosParser.Csz_set_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#csz_append_interface}.
	 * @param ctx the parse tree
	 */
	void enterCsz_append_interface(FortiosParser.Csz_append_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#csz_append_interface}.
	 * @param ctx the parse tree
	 */
	void exitCsz_append_interface(FortiosParser.Csz_append_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FortiosParser#zone_name}.
	 * @param ctx the parse tree
	 */
	void enterZone_name(FortiosParser.Zone_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FortiosParser#zone_name}.
	 * @param ctx the parse tree
	 */
	void exitZone_name(FortiosParser.Zone_nameContext ctx);
}