// Generated from org/batfish/grammar/palo_alto/PaloAltoParser.g4 by ANTLR 4.7.2
package org.batfish.grammar.palo_alto;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PaloAltoParser}.
 */
public interface PaloAltoParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#palo_alto_configuration}.
	 * @param ctx the parse tree
	 */
	void enterPalo_alto_configuration(PaloAltoParser.Palo_alto_configurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#palo_alto_configuration}.
	 * @param ctx the parse tree
	 */
	void exitPalo_alto_configuration(PaloAltoParser.Palo_alto_configurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#delete_line}.
	 * @param ctx the parse tree
	 */
	void enterDelete_line(PaloAltoParser.Delete_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#delete_line}.
	 * @param ctx the parse tree
	 */
	void exitDelete_line(PaloAltoParser.Delete_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#delete_line_tail}.
	 * @param ctx the parse tree
	 */
	void enterDelete_line_tail(PaloAltoParser.Delete_line_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#delete_line_tail}.
	 * @param ctx the parse tree
	 */
	void exitDelete_line_tail(PaloAltoParser.Delete_line_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#move_line}.
	 * @param ctx the parse tree
	 */
	void enterMove_line(PaloAltoParser.Move_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#move_line}.
	 * @param ctx the parse tree
	 */
	void exitMove_line(PaloAltoParser.Move_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#move_src}.
	 * @param ctx the parse tree
	 */
	void enterMove_src(PaloAltoParser.Move_srcContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#move_src}.
	 * @param ctx the parse tree
	 */
	void exitMove_src(PaloAltoParser.Move_srcContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#move_src_element}.
	 * @param ctx the parse tree
	 */
	void enterMove_src_element(PaloAltoParser.Move_src_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#move_src_element}.
	 * @param ctx the parse tree
	 */
	void exitMove_src_element(PaloAltoParser.Move_src_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#move_action}.
	 * @param ctx the parse tree
	 */
	void enterMove_action(PaloAltoParser.Move_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#move_action}.
	 * @param ctx the parse tree
	 */
	void exitMove_action(PaloAltoParser.Move_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#newline}.
	 * @param ctx the parse tree
	 */
	void enterNewline(PaloAltoParser.NewlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#newline}.
	 * @param ctx the parse tree
	 */
	void exitNewline(PaloAltoParser.NewlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#s_null}.
	 * @param ctx the parse tree
	 */
	void enterS_null(PaloAltoParser.S_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#s_null}.
	 * @param ctx the parse tree
	 */
	void exitS_null(PaloAltoParser.S_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#set_line_config_devices}.
	 * @param ctx the parse tree
	 */
	void enterSet_line_config_devices(PaloAltoParser.Set_line_config_devicesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#set_line_config_devices}.
	 * @param ctx the parse tree
	 */
	void exitSet_line_config_devices(PaloAltoParser.Set_line_config_devicesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#set_line_config_general}.
	 * @param ctx the parse tree
	 */
	void enterSet_line_config_general(PaloAltoParser.Set_line_config_generalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#set_line_config_general}.
	 * @param ctx the parse tree
	 */
	void exitSet_line_config_general(PaloAltoParser.Set_line_config_generalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#statement_config_devices}.
	 * @param ctx the parse tree
	 */
	void enterStatement_config_devices(PaloAltoParser.Statement_config_devicesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#statement_config_devices}.
	 * @param ctx the parse tree
	 */
	void exitStatement_config_devices(PaloAltoParser.Statement_config_devicesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#statement_config_general}.
	 * @param ctx the parse tree
	 */
	void enterStatement_config_general(PaloAltoParser.Statement_config_generalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#statement_config_general}.
	 * @param ctx the parse tree
	 */
	void exitStatement_config_general(PaloAltoParser.Statement_config_generalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#statement_template}.
	 * @param ctx the parse tree
	 */
	void enterStatement_template(PaloAltoParser.Statement_templateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#statement_template}.
	 * @param ctx the parse tree
	 */
	void exitStatement_template(PaloAltoParser.Statement_templateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#statement_template_config}.
	 * @param ctx the parse tree
	 */
	void enterStatement_template_config(PaloAltoParser.Statement_template_configContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#statement_template_config}.
	 * @param ctx the parse tree
	 */
	void exitStatement_template_config(PaloAltoParser.Statement_template_configContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#statement_template_config_devices}.
	 * @param ctx the parse tree
	 */
	void enterStatement_template_config_devices(PaloAltoParser.Statement_template_config_devicesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#statement_template_config_devices}.
	 * @param ctx the parse tree
	 */
	void exitStatement_template_config_devices(PaloAltoParser.Statement_template_config_devicesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#statement_template_stack}.
	 * @param ctx the parse tree
	 */
	void enterStatement_template_stack(PaloAltoParser.Statement_template_stackContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#statement_template_stack}.
	 * @param ctx the parse tree
	 */
	void exitStatement_template_stack(PaloAltoParser.Statement_template_stackContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#set_line}.
	 * @param ctx the parse tree
	 */
	void enterSet_line(PaloAltoParser.Set_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#set_line}.
	 * @param ctx the parse tree
	 */
	void exitSet_line(PaloAltoParser.Set_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#set_line_template}.
	 * @param ctx the parse tree
	 */
	void enterSet_line_template(PaloAltoParser.Set_line_templateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#set_line_template}.
	 * @param ctx the parse tree
	 */
	void exitSet_line_template(PaloAltoParser.Set_line_templateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#set_line_template_stack}.
	 * @param ctx the parse tree
	 */
	void enterSet_line_template_stack(PaloAltoParser.Set_line_template_stackContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#set_line_template_stack}.
	 * @param ctx the parse tree
	 */
	void exitSet_line_template_stack(PaloAltoParser.Set_line_template_stackContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#set_line_device_group}.
	 * @param ctx the parse tree
	 */
	void enterSet_line_device_group(PaloAltoParser.Set_line_device_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#set_line_device_group}.
	 * @param ctx the parse tree
	 */
	void exitSet_line_device_group(PaloAltoParser.Set_line_device_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#set_line_readonly}.
	 * @param ctx the parse tree
	 */
	void enterSet_line_readonly(PaloAltoParser.Set_line_readonlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#set_line_readonly}.
	 * @param ctx the parse tree
	 */
	void exitSet_line_readonly(PaloAltoParser.Set_line_readonlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#set_line_response}.
	 * @param ctx the parse tree
	 */
	void enterSet_line_response(PaloAltoParser.Set_line_responseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#set_line_response}.
	 * @param ctx the parse tree
	 */
	void exitSet_line_response(PaloAltoParser.Set_line_responseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#statement_device_group}.
	 * @param ctx the parse tree
	 */
	void enterStatement_device_group(PaloAltoParser.Statement_device_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#statement_device_group}.
	 * @param ctx the parse tree
	 */
	void exitStatement_device_group(PaloAltoParser.Statement_device_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#set_line_tail}.
	 * @param ctx the parse tree
	 */
	void enterSet_line_tail(PaloAltoParser.Set_line_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#set_line_tail}.
	 * @param ctx the parse tree
	 */
	void exitSet_line_tail(PaloAltoParser.Set_line_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#s_policy}.
	 * @param ctx the parse tree
	 */
	void enterS_policy(PaloAltoParser.S_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#s_policy}.
	 * @param ctx the parse tree
	 */
	void exitS_policy(PaloAltoParser.S_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#s_policy_panorama}.
	 * @param ctx the parse tree
	 */
	void enterS_policy_panorama(PaloAltoParser.S_policy_panoramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#s_policy_panorama}.
	 * @param ctx the parse tree
	 */
	void exitS_policy_panorama(PaloAltoParser.S_policy_panoramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#s_policy_shared}.
	 * @param ctx the parse tree
	 */
	void enterS_policy_shared(PaloAltoParser.S_policy_sharedContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#s_policy_shared}.
	 * @param ctx the parse tree
	 */
	void exitS_policy_shared(PaloAltoParser.S_policy_sharedContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#s_address}.
	 * @param ctx the parse tree
	 */
	void enterS_address(PaloAltoParser.S_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#s_address}.
	 * @param ctx the parse tree
	 */
	void exitS_address(PaloAltoParser.S_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#s_address_definition}.
	 * @param ctx the parse tree
	 */
	void enterS_address_definition(PaloAltoParser.S_address_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#s_address_definition}.
	 * @param ctx the parse tree
	 */
	void exitS_address_definition(PaloAltoParser.S_address_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sa_description}.
	 * @param ctx the parse tree
	 */
	void enterSa_description(PaloAltoParser.Sa_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sa_description}.
	 * @param ctx the parse tree
	 */
	void exitSa_description(PaloAltoParser.Sa_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sa_fqdn}.
	 * @param ctx the parse tree
	 */
	void enterSa_fqdn(PaloAltoParser.Sa_fqdnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sa_fqdn}.
	 * @param ctx the parse tree
	 */
	void exitSa_fqdn(PaloAltoParser.Sa_fqdnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sa_ip_netmask}.
	 * @param ctx the parse tree
	 */
	void enterSa_ip_netmask(PaloAltoParser.Sa_ip_netmaskContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sa_ip_netmask}.
	 * @param ctx the parse tree
	 */
	void exitSa_ip_netmask(PaloAltoParser.Sa_ip_netmaskContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sa_ip_range}.
	 * @param ctx the parse tree
	 */
	void enterSa_ip_range(PaloAltoParser.Sa_ip_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sa_ip_range}.
	 * @param ctx the parse tree
	 */
	void exitSa_ip_range(PaloAltoParser.Sa_ip_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sa_tag}.
	 * @param ctx the parse tree
	 */
	void enterSa_tag(PaloAltoParser.Sa_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sa_tag}.
	 * @param ctx the parse tree
	 */
	void exitSa_tag(PaloAltoParser.Sa_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgp_asn}.
	 * @param ctx the parse tree
	 */
	void enterBgp_asn(PaloAltoParser.Bgp_asnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgp_asn}.
	 * @param ctx the parse tree
	 */
	void exitBgp_asn(PaloAltoParser.Bgp_asnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#null_rest_of_line}.
	 * @param ctx the parse tree
	 */
	void enterNull_rest_of_line(PaloAltoParser.Null_rest_of_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#null_rest_of_line}.
	 * @param ctx the parse tree
	 */
	void exitNull_rest_of_line(PaloAltoParser.Null_rest_of_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#interface_address}.
	 * @param ctx the parse tree
	 */
	void enterInterface_address(PaloAltoParser.Interface_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#interface_address}.
	 * @param ctx the parse tree
	 */
	void exitInterface_address(PaloAltoParser.Interface_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#interface_address_or_reference}.
	 * @param ctx the parse tree
	 */
	void enterInterface_address_or_reference(PaloAltoParser.Interface_address_or_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#interface_address_or_reference}.
	 * @param ctx the parse tree
	 */
	void exitInterface_address_or_reference(PaloAltoParser.Interface_address_or_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ip_address}.
	 * @param ctx the parse tree
	 */
	void enterIp_address(PaloAltoParser.Ip_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ip_address}.
	 * @param ctx the parse tree
	 */
	void exitIp_address(PaloAltoParser.Ip_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ip_address_or_slash32}.
	 * @param ctx the parse tree
	 */
	void enterIp_address_or_slash32(PaloAltoParser.Ip_address_or_slash32Context ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ip_address_or_slash32}.
	 * @param ctx the parse tree
	 */
	void exitIp_address_or_slash32(PaloAltoParser.Ip_address_or_slash32Context ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ip_prefix}.
	 * @param ctx the parse tree
	 */
	void enterIp_prefix(PaloAltoParser.Ip_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ip_prefix}.
	 * @param ctx the parse tree
	 */
	void exitIp_prefix(PaloAltoParser.Ip_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ip_range}.
	 * @param ctx the parse tree
	 */
	void enterIp_range(PaloAltoParser.Ip_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ip_range}.
	 * @param ctx the parse tree
	 */
	void exitIp_range(PaloAltoParser.Ip_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ip_prefix_list}.
	 * @param ctx the parse tree
	 */
	void enterIp_prefix_list(PaloAltoParser.Ip_prefix_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ip_prefix_list}.
	 * @param ctx the parse tree
	 */
	void exitIp_prefix_list(PaloAltoParser.Ip_prefix_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#src_or_dst_list}.
	 * @param ctx the parse tree
	 */
	void enterSrc_or_dst_list(PaloAltoParser.Src_or_dst_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#src_or_dst_list}.
	 * @param ctx the parse tree
	 */
	void exitSrc_or_dst_list(PaloAltoParser.Src_or_dst_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#src_or_dst_list_item}.
	 * @param ctx the parse tree
	 */
	void enterSrc_or_dst_list_item(PaloAltoParser.Src_or_dst_list_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#src_or_dst_list_item}.
	 * @param ctx the parse tree
	 */
	void exitSrc_or_dst_list_item(PaloAltoParser.Src_or_dst_list_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#port_number}.
	 * @param ctx the parse tree
	 */
	void enterPort_number(PaloAltoParser.Port_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#port_number}.
	 * @param ctx the parse tree
	 */
	void exitPort_number(PaloAltoParser.Port_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#port_or_range}.
	 * @param ctx the parse tree
	 */
	void enterPort_or_range(PaloAltoParser.Port_or_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#port_or_range}.
	 * @param ctx the parse tree
	 */
	void exitPort_or_range(PaloAltoParser.Port_or_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#uint8}.
	 * @param ctx the parse tree
	 */
	void enterUint8(PaloAltoParser.Uint8Context ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#uint8}.
	 * @param ctx the parse tree
	 */
	void exitUint8(PaloAltoParser.Uint8Context ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#uint16}.
	 * @param ctx the parse tree
	 */
	void enterUint16(PaloAltoParser.Uint16Context ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#uint16}.
	 * @param ctx the parse tree
	 */
	void exitUint16(PaloAltoParser.Uint16Context ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#uint32}.
	 * @param ctx the parse tree
	 */
	void enterUint32(PaloAltoParser.Uint32Context ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#uint32}.
	 * @param ctx the parse tree
	 */
	void exitUint32(PaloAltoParser.Uint32Context ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(PaloAltoParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(PaloAltoParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#variable_port_list}.
	 * @param ctx the parse tree
	 */
	void enterVariable_port_list(PaloAltoParser.Variable_port_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#variable_port_list}.
	 * @param ctx the parse tree
	 */
	void exitVariable_port_list(PaloAltoParser.Variable_port_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#variable_list}.
	 * @param ctx the parse tree
	 */
	void enterVariable_list(PaloAltoParser.Variable_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#variable_list}.
	 * @param ctx the parse tree
	 */
	void exitVariable_list(PaloAltoParser.Variable_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#variable_list_item}.
	 * @param ctx the parse tree
	 */
	void enterVariable_list_item(PaloAltoParser.Variable_list_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#variable_list_item}.
	 * @param ctx the parse tree
	 */
	void exitVariable_list_item(PaloAltoParser.Variable_list_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(PaloAltoParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(PaloAltoParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#vlan_tag}.
	 * @param ctx the parse tree
	 */
	void enterVlan_tag(PaloAltoParser.Vlan_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#vlan_tag}.
	 * @param ctx the parse tree
	 */
	void exitVlan_tag(PaloAltoParser.Vlan_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#yes_or_no}.
	 * @param ctx the parse tree
	 */
	void enterYes_or_no(PaloAltoParser.Yes_or_noContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#yes_or_no}.
	 * @param ctx the parse tree
	 */
	void exitYes_or_no(PaloAltoParser.Yes_or_noContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#tcp_or_udp}.
	 * @param ctx the parse tree
	 */
	void enterTcp_or_udp(PaloAltoParser.Tcp_or_udpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#tcp_or_udp}.
	 * @param ctx the parse tree
	 */
	void exitTcp_or_udp(PaloAltoParser.Tcp_or_udpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#s_address_group}.
	 * @param ctx the parse tree
	 */
	void enterS_address_group(PaloAltoParser.S_address_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#s_address_group}.
	 * @param ctx the parse tree
	 */
	void exitS_address_group(PaloAltoParser.S_address_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#s_address_group_definition}.
	 * @param ctx the parse tree
	 */
	void enterS_address_group_definition(PaloAltoParser.S_address_group_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#s_address_group_definition}.
	 * @param ctx the parse tree
	 */
	void exitS_address_group_definition(PaloAltoParser.S_address_group_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sag_description}.
	 * @param ctx the parse tree
	 */
	void enterSag_description(PaloAltoParser.Sag_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sag_description}.
	 * @param ctx the parse tree
	 */
	void exitSag_description(PaloAltoParser.Sag_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sag_dynamic}.
	 * @param ctx the parse tree
	 */
	void enterSag_dynamic(PaloAltoParser.Sag_dynamicContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sag_dynamic}.
	 * @param ctx the parse tree
	 */
	void exitSag_dynamic(PaloAltoParser.Sag_dynamicContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sagd_filter}.
	 * @param ctx the parse tree
	 */
	void enterSagd_filter(PaloAltoParser.Sagd_filterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sagd_filter}.
	 * @param ctx the parse tree
	 */
	void exitSagd_filter(PaloAltoParser.Sagd_filterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sag_static}.
	 * @param ctx the parse tree
	 */
	void enterSag_static(PaloAltoParser.Sag_staticContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sag_static}.
	 * @param ctx the parse tree
	 */
	void exitSag_static(PaloAltoParser.Sag_staticContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sag_tag}.
	 * @param ctx the parse tree
	 */
	void enterSag_tag(PaloAltoParser.Sag_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sag_tag}.
	 * @param ctx the parse tree
	 */
	void exitSag_tag(PaloAltoParser.Sag_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#s_application}.
	 * @param ctx the parse tree
	 */
	void enterS_application(PaloAltoParser.S_applicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#s_application}.
	 * @param ctx the parse tree
	 */
	void exitS_application(PaloAltoParser.S_applicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#s_application_definition}.
	 * @param ctx the parse tree
	 */
	void enterS_application_definition(PaloAltoParser.S_application_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#s_application_definition}.
	 * @param ctx the parse tree
	 */
	void exitS_application_definition(PaloAltoParser.S_application_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sapp_description}.
	 * @param ctx the parse tree
	 */
	void enterSapp_description(PaloAltoParser.Sapp_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sapp_description}.
	 * @param ctx the parse tree
	 */
	void exitSapp_description(PaloAltoParser.Sapp_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sapp_ignored}.
	 * @param ctx the parse tree
	 */
	void enterSapp_ignored(PaloAltoParser.Sapp_ignoredContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sapp_ignored}.
	 * @param ctx the parse tree
	 */
	void exitSapp_ignored(PaloAltoParser.Sapp_ignoredContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sapp_category}.
	 * @param ctx the parse tree
	 */
	void enterSapp_category(PaloAltoParser.Sapp_categoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sapp_category}.
	 * @param ctx the parse tree
	 */
	void exitSapp_category(PaloAltoParser.Sapp_categoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sapp_default_port}.
	 * @param ctx the parse tree
	 */
	void enterSapp_default_port(PaloAltoParser.Sapp_default_portContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sapp_default_port}.
	 * @param ctx the parse tree
	 */
	void exitSapp_default_port(PaloAltoParser.Sapp_default_portContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sapp_risk}.
	 * @param ctx the parse tree
	 */
	void enterSapp_risk(PaloAltoParser.Sapp_riskContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sapp_risk}.
	 * @param ctx the parse tree
	 */
	void exitSapp_risk(PaloAltoParser.Sapp_riskContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sapp_subcategory}.
	 * @param ctx the parse tree
	 */
	void enterSapp_subcategory(PaloAltoParser.Sapp_subcategoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sapp_subcategory}.
	 * @param ctx the parse tree
	 */
	void exitSapp_subcategory(PaloAltoParser.Sapp_subcategoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sapp_technology}.
	 * @param ctx the parse tree
	 */
	void enterSapp_technology(PaloAltoParser.Sapp_technologyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sapp_technology}.
	 * @param ctx the parse tree
	 */
	void exitSapp_technology(PaloAltoParser.Sapp_technologyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#s_application_group}.
	 * @param ctx the parse tree
	 */
	void enterS_application_group(PaloAltoParser.S_application_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#s_application_group}.
	 * @param ctx the parse tree
	 */
	void exitS_application_group(PaloAltoParser.S_application_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sappg_definition}.
	 * @param ctx the parse tree
	 */
	void enterSappg_definition(PaloAltoParser.Sappg_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sappg_definition}.
	 * @param ctx the parse tree
	 */
	void exitSappg_definition(PaloAltoParser.Sappg_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sappg_members}.
	 * @param ctx the parse tree
	 */
	void enterSappg_members(PaloAltoParser.Sappg_membersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sappg_members}.
	 * @param ctx the parse tree
	 */
	void exitSappg_members(PaloAltoParser.Sappg_membersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#s_application_filter}.
	 * @param ctx the parse tree
	 */
	void enterS_application_filter(PaloAltoParser.S_application_filterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#s_application_filter}.
	 * @param ctx the parse tree
	 */
	void exitS_application_filter(PaloAltoParser.S_application_filterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#saf_category}.
	 * @param ctx the parse tree
	 */
	void enterSaf_category(PaloAltoParser.Saf_categoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#saf_category}.
	 * @param ctx the parse tree
	 */
	void exitSaf_category(PaloAltoParser.Saf_categoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#saf_evasive}.
	 * @param ctx the parse tree
	 */
	void enterSaf_evasive(PaloAltoParser.Saf_evasiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#saf_evasive}.
	 * @param ctx the parse tree
	 */
	void exitSaf_evasive(PaloAltoParser.Saf_evasiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#saf_excessive_bandwidth_use}.
	 * @param ctx the parse tree
	 */
	void enterSaf_excessive_bandwidth_use(PaloAltoParser.Saf_excessive_bandwidth_useContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#saf_excessive_bandwidth_use}.
	 * @param ctx the parse tree
	 */
	void exitSaf_excessive_bandwidth_use(PaloAltoParser.Saf_excessive_bandwidth_useContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#saf_has_known_vulnerabilities}.
	 * @param ctx the parse tree
	 */
	void enterSaf_has_known_vulnerabilities(PaloAltoParser.Saf_has_known_vulnerabilitiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#saf_has_known_vulnerabilities}.
	 * @param ctx the parse tree
	 */
	void exitSaf_has_known_vulnerabilities(PaloAltoParser.Saf_has_known_vulnerabilitiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#saf_pervasive}.
	 * @param ctx the parse tree
	 */
	void enterSaf_pervasive(PaloAltoParser.Saf_pervasiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#saf_pervasive}.
	 * @param ctx the parse tree
	 */
	void exitSaf_pervasive(PaloAltoParser.Saf_pervasiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#saf_prone_to_misuse}.
	 * @param ctx the parse tree
	 */
	void enterSaf_prone_to_misuse(PaloAltoParser.Saf_prone_to_misuseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#saf_prone_to_misuse}.
	 * @param ctx the parse tree
	 */
	void exitSaf_prone_to_misuse(PaloAltoParser.Saf_prone_to_misuseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#saf_risk}.
	 * @param ctx the parse tree
	 */
	void enterSaf_risk(PaloAltoParser.Saf_riskContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#saf_risk}.
	 * @param ctx the parse tree
	 */
	void exitSaf_risk(PaloAltoParser.Saf_riskContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#saf_subcategory}.
	 * @param ctx the parse tree
	 */
	void enterSaf_subcategory(PaloAltoParser.Saf_subcategoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#saf_subcategory}.
	 * @param ctx the parse tree
	 */
	void exitSaf_subcategory(PaloAltoParser.Saf_subcategoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#saf_technology}.
	 * @param ctx the parse tree
	 */
	void enterSaf_technology(PaloAltoParser.Saf_technologyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#saf_technology}.
	 * @param ctx the parse tree
	 */
	void exitSaf_technology(PaloAltoParser.Saf_technologyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#saf_transfers_files}.
	 * @param ctx the parse tree
	 */
	void enterSaf_transfers_files(PaloAltoParser.Saf_transfers_filesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#saf_transfers_files}.
	 * @param ctx the parse tree
	 */
	void exitSaf_transfers_files(PaloAltoParser.Saf_transfers_filesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#saf_tunnels_other_apps}.
	 * @param ctx the parse tree
	 */
	void enterSaf_tunnels_other_apps(PaloAltoParser.Saf_tunnels_other_appsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#saf_tunnels_other_apps}.
	 * @param ctx the parse tree
	 */
	void exitSaf_tunnels_other_apps(PaloAltoParser.Saf_tunnels_other_appsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#saf_used_by_malware}.
	 * @param ctx the parse tree
	 */
	void enterSaf_used_by_malware(PaloAltoParser.Saf_used_by_malwareContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#saf_used_by_malware}.
	 * @param ctx the parse tree
	 */
	void exitSaf_used_by_malware(PaloAltoParser.Saf_used_by_malwareContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgp_local_pref}.
	 * @param ctx the parse tree
	 */
	void enterBgp_local_pref(PaloAltoParser.Bgp_local_prefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgp_local_pref}.
	 * @param ctx the parse tree
	 */
	void exitBgp_local_pref(PaloAltoParser.Bgp_local_prefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgp_peer_group_name}.
	 * @param ctx the parse tree
	 */
	void enterBgp_peer_group_name(PaloAltoParser.Bgp_peer_group_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgp_peer_group_name}.
	 * @param ctx the parse tree
	 */
	void exitBgp_peer_group_name(PaloAltoParser.Bgp_peer_group_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgp_peer_name}.
	 * @param ctx the parse tree
	 */
	void enterBgp_peer_name(PaloAltoParser.Bgp_peer_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgp_peer_name}.
	 * @param ctx the parse tree
	 */
	void exitBgp_peer_name(PaloAltoParser.Bgp_peer_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#vrp_bgp}.
	 * @param ctx the parse tree
	 */
	void enterVrp_bgp(PaloAltoParser.Vrp_bgpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#vrp_bgp}.
	 * @param ctx the parse tree
	 */
	void exitVrp_bgp(PaloAltoParser.Vrp_bgpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgp_enable}.
	 * @param ctx the parse tree
	 */
	void enterBgp_enable(PaloAltoParser.Bgp_enableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgp_enable}.
	 * @param ctx the parse tree
	 */
	void exitBgp_enable(PaloAltoParser.Bgp_enableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgp_install_route}.
	 * @param ctx the parse tree
	 */
	void enterBgp_install_route(PaloAltoParser.Bgp_install_routeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgp_install_route}.
	 * @param ctx the parse tree
	 */
	void exitBgp_install_route(PaloAltoParser.Bgp_install_routeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgp_local_as}.
	 * @param ctx the parse tree
	 */
	void enterBgp_local_as(PaloAltoParser.Bgp_local_asContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgp_local_as}.
	 * @param ctx the parse tree
	 */
	void exitBgp_local_as(PaloAltoParser.Bgp_local_asContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgp_null}.
	 * @param ctx the parse tree
	 */
	void enterBgp_null(PaloAltoParser.Bgp_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgp_null}.
	 * @param ctx the parse tree
	 */
	void exitBgp_null(PaloAltoParser.Bgp_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgp_peer_group}.
	 * @param ctx the parse tree
	 */
	void enterBgp_peer_group(PaloAltoParser.Bgp_peer_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgp_peer_group}.
	 * @param ctx the parse tree
	 */
	void exitBgp_peer_group(PaloAltoParser.Bgp_peer_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgp_redist_rules}.
	 * @param ctx the parse tree
	 */
	void enterBgp_redist_rules(PaloAltoParser.Bgp_redist_rulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgp_redist_rules}.
	 * @param ctx the parse tree
	 */
	void exitBgp_redist_rules(PaloAltoParser.Bgp_redist_rulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgppg_definition}.
	 * @param ctx the parse tree
	 */
	void enterBgppg_definition(PaloAltoParser.Bgppg_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgppg_definition}.
	 * @param ctx the parse tree
	 */
	void exitBgppg_definition(PaloAltoParser.Bgppg_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgppg_enable}.
	 * @param ctx the parse tree
	 */
	void enterBgppg_enable(PaloAltoParser.Bgppg_enableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgppg_enable}.
	 * @param ctx the parse tree
	 */
	void exitBgppg_enable(PaloAltoParser.Bgppg_enableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgppg_peer}.
	 * @param ctx the parse tree
	 */
	void enterBgppg_peer(PaloAltoParser.Bgppg_peerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgppg_peer}.
	 * @param ctx the parse tree
	 */
	void exitBgppg_peer(PaloAltoParser.Bgppg_peerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgppgp_bfd}.
	 * @param ctx the parse tree
	 */
	void enterBgppgp_bfd(PaloAltoParser.Bgppgp_bfdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgppgp_bfd}.
	 * @param ctx the parse tree
	 */
	void exitBgppgp_bfd(PaloAltoParser.Bgppgp_bfdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgppgp_connection_options}.
	 * @param ctx the parse tree
	 */
	void enterBgppgp_connection_options(PaloAltoParser.Bgppgp_connection_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgppgp_connection_options}.
	 * @param ctx the parse tree
	 */
	void exitBgppgp_connection_options(PaloAltoParser.Bgppgp_connection_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgppgp_co_incoming_bgp_connection}.
	 * @param ctx the parse tree
	 */
	void enterBgppgp_co_incoming_bgp_connection(PaloAltoParser.Bgppgp_co_incoming_bgp_connectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgppgp_co_incoming_bgp_connection}.
	 * @param ctx the parse tree
	 */
	void exitBgppgp_co_incoming_bgp_connection(PaloAltoParser.Bgppgp_co_incoming_bgp_connectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgppgp_coi_allow}.
	 * @param ctx the parse tree
	 */
	void enterBgppgp_coi_allow(PaloAltoParser.Bgppgp_coi_allowContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgppgp_coi_allow}.
	 * @param ctx the parse tree
	 */
	void exitBgppgp_coi_allow(PaloAltoParser.Bgppgp_coi_allowContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgppgp_coi_remote_port}.
	 * @param ctx the parse tree
	 */
	void enterBgppgp_coi_remote_port(PaloAltoParser.Bgppgp_coi_remote_portContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgppgp_coi_remote_port}.
	 * @param ctx the parse tree
	 */
	void exitBgppgp_coi_remote_port(PaloAltoParser.Bgppgp_coi_remote_portContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgppgp_co_multihop}.
	 * @param ctx the parse tree
	 */
	void enterBgppgp_co_multihop(PaloAltoParser.Bgppgp_co_multihopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgppgp_co_multihop}.
	 * @param ctx the parse tree
	 */
	void exitBgppgp_co_multihop(PaloAltoParser.Bgppgp_co_multihopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgppgp_co_null}.
	 * @param ctx the parse tree
	 */
	void enterBgppgp_co_null(PaloAltoParser.Bgppgp_co_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgppgp_co_null}.
	 * @param ctx the parse tree
	 */
	void exitBgppgp_co_null(PaloAltoParser.Bgppgp_co_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgppgp_co_outgoing_bgp_connection}.
	 * @param ctx the parse tree
	 */
	void enterBgppgp_co_outgoing_bgp_connection(PaloAltoParser.Bgppgp_co_outgoing_bgp_connectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgppgp_co_outgoing_bgp_connection}.
	 * @param ctx the parse tree
	 */
	void exitBgppgp_co_outgoing_bgp_connection(PaloAltoParser.Bgppgp_co_outgoing_bgp_connectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgppgp_coo_allow}.
	 * @param ctx the parse tree
	 */
	void enterBgppgp_coo_allow(PaloAltoParser.Bgppgp_coo_allowContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgppgp_coo_allow}.
	 * @param ctx the parse tree
	 */
	void exitBgppgp_coo_allow(PaloAltoParser.Bgppgp_coo_allowContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgppgp_coo_local_port}.
	 * @param ctx the parse tree
	 */
	void enterBgppgp_coo_local_port(PaloAltoParser.Bgppgp_coo_local_portContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgppgp_coo_local_port}.
	 * @param ctx the parse tree
	 */
	void exitBgppgp_coo_local_port(PaloAltoParser.Bgppgp_coo_local_portContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgppgp_enable}.
	 * @param ctx the parse tree
	 */
	void enterBgppgp_enable(PaloAltoParser.Bgppgp_enableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgppgp_enable}.
	 * @param ctx the parse tree
	 */
	void exitBgppgp_enable(PaloAltoParser.Bgppgp_enableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgppgp_enable_sender_side_loop_detection}.
	 * @param ctx the parse tree
	 */
	void enterBgppgp_enable_sender_side_loop_detection(PaloAltoParser.Bgppgp_enable_sender_side_loop_detectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgppgp_enable_sender_side_loop_detection}.
	 * @param ctx the parse tree
	 */
	void exitBgppgp_enable_sender_side_loop_detection(PaloAltoParser.Bgppgp_enable_sender_side_loop_detectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgppgp_local_address}.
	 * @param ctx the parse tree
	 */
	void enterBgppgp_local_address(PaloAltoParser.Bgppgp_local_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgppgp_local_address}.
	 * @param ctx the parse tree
	 */
	void exitBgppgp_local_address(PaloAltoParser.Bgppgp_local_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgppgp_max_prefixes}.
	 * @param ctx the parse tree
	 */
	void enterBgppgp_max_prefixes(PaloAltoParser.Bgppgp_max_prefixesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgppgp_max_prefixes}.
	 * @param ctx the parse tree
	 */
	void exitBgppgp_max_prefixes(PaloAltoParser.Bgppgp_max_prefixesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgppgp_la_interface}.
	 * @param ctx the parse tree
	 */
	void enterBgppgp_la_interface(PaloAltoParser.Bgppgp_la_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgppgp_la_interface}.
	 * @param ctx the parse tree
	 */
	void exitBgppgp_la_interface(PaloAltoParser.Bgppgp_la_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgppgp_la_ip}.
	 * @param ctx the parse tree
	 */
	void enterBgppgp_la_ip(PaloAltoParser.Bgppgp_la_ipContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgppgp_la_ip}.
	 * @param ctx the parse tree
	 */
	void exitBgppgp_la_ip(PaloAltoParser.Bgppgp_la_ipContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgppgp_peer_address}.
	 * @param ctx the parse tree
	 */
	void enterBgppgp_peer_address(PaloAltoParser.Bgppgp_peer_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgppgp_peer_address}.
	 * @param ctx the parse tree
	 */
	void exitBgppgp_peer_address(PaloAltoParser.Bgppgp_peer_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgppgp_peer_as}.
	 * @param ctx the parse tree
	 */
	void enterBgppgp_peer_as(PaloAltoParser.Bgppgp_peer_asContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgppgp_peer_as}.
	 * @param ctx the parse tree
	 */
	void exitBgppgp_peer_as(PaloAltoParser.Bgppgp_peer_asContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgppgp_reflector_client}.
	 * @param ctx the parse tree
	 */
	void enterBgppgp_reflector_client(PaloAltoParser.Bgppgp_reflector_clientContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgppgp_reflector_client}.
	 * @param ctx the parse tree
	 */
	void exitBgppgp_reflector_client(PaloAltoParser.Bgppgp_reflector_clientContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgppg_type}.
	 * @param ctx the parse tree
	 */
	void enterBgppg_type(PaloAltoParser.Bgppg_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgppg_type}.
	 * @param ctx the parse tree
	 */
	void exitBgppg_type(PaloAltoParser.Bgppg_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgppgt_ebgp}.
	 * @param ctx the parse tree
	 */
	void enterBgppgt_ebgp(PaloAltoParser.Bgppgt_ebgpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgppgt_ebgp}.
	 * @param ctx the parse tree
	 */
	void exitBgppgt_ebgp(PaloAltoParser.Bgppgt_ebgpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgppgte_export_nexthop}.
	 * @param ctx the parse tree
	 */
	void enterBgppgte_export_nexthop(PaloAltoParser.Bgppgte_export_nexthopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgppgte_export_nexthop}.
	 * @param ctx the parse tree
	 */
	void exitBgppgte_export_nexthop(PaloAltoParser.Bgppgte_export_nexthopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgppgte_import_nexthop}.
	 * @param ctx the parse tree
	 */
	void enterBgppgte_import_nexthop(PaloAltoParser.Bgppgte_import_nexthopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgppgte_import_nexthop}.
	 * @param ctx the parse tree
	 */
	void exitBgppgte_import_nexthop(PaloAltoParser.Bgppgte_import_nexthopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgppgte_remove_private_as}.
	 * @param ctx the parse tree
	 */
	void enterBgppgte_remove_private_as(PaloAltoParser.Bgppgte_remove_private_asContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgppgte_remove_private_as}.
	 * @param ctx the parse tree
	 */
	void exitBgppgte_remove_private_as(PaloAltoParser.Bgppgte_remove_private_asContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgppgt_ibgp}.
	 * @param ctx the parse tree
	 */
	void enterBgppgt_ibgp(PaloAltoParser.Bgppgt_ibgpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgppgt_ibgp}.
	 * @param ctx the parse tree
	 */
	void exitBgppgt_ibgp(PaloAltoParser.Bgppgt_ibgpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgp_policy}.
	 * @param ctx the parse tree
	 */
	void enterBgp_policy(PaloAltoParser.Bgp_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgp_policy}.
	 * @param ctx the parse tree
	 */
	void exitBgp_policy(PaloAltoParser.Bgp_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgpp_export}.
	 * @param ctx the parse tree
	 */
	void enterBgpp_export(PaloAltoParser.Bgpp_exportContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgpp_export}.
	 * @param ctx the parse tree
	 */
	void exitBgpp_export(PaloAltoParser.Bgpp_exportContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgpp_import}.
	 * @param ctx the parse tree
	 */
	void enterBgpp_import(PaloAltoParser.Bgpp_importContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgpp_import}.
	 * @param ctx the parse tree
	 */
	void exitBgpp_import(PaloAltoParser.Bgpp_importContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgp_reject_default_route}.
	 * @param ctx the parse tree
	 */
	void enterBgp_reject_default_route(PaloAltoParser.Bgp_reject_default_routeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgp_reject_default_route}.
	 * @param ctx the parse tree
	 */
	void exitBgp_reject_default_route(PaloAltoParser.Bgp_reject_default_routeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgp_router_id}.
	 * @param ctx the parse tree
	 */
	void enterBgp_router_id(PaloAltoParser.Bgp_router_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgp_router_id}.
	 * @param ctx the parse tree
	 */
	void exitBgp_router_id(PaloAltoParser.Bgp_router_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgp_routing_options}.
	 * @param ctx the parse tree
	 */
	void enterBgp_routing_options(PaloAltoParser.Bgp_routing_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgp_routing_options}.
	 * @param ctx the parse tree
	 */
	void exitBgp_routing_options(PaloAltoParser.Bgp_routing_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgpro_aggregate}.
	 * @param ctx the parse tree
	 */
	void enterBgpro_aggregate(PaloAltoParser.Bgpro_aggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgpro_aggregate}.
	 * @param ctx the parse tree
	 */
	void exitBgpro_aggregate(PaloAltoParser.Bgpro_aggregateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgproa_aggregate_med}.
	 * @param ctx the parse tree
	 */
	void enterBgproa_aggregate_med(PaloAltoParser.Bgproa_aggregate_medContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgproa_aggregate_med}.
	 * @param ctx the parse tree
	 */
	void exitBgproa_aggregate_med(PaloAltoParser.Bgproa_aggregate_medContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgpro_as_format}.
	 * @param ctx the parse tree
	 */
	void enterBgpro_as_format(PaloAltoParser.Bgpro_as_formatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgpro_as_format}.
	 * @param ctx the parse tree
	 */
	void exitBgpro_as_format(PaloAltoParser.Bgpro_as_formatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgpro_default_local_preference}.
	 * @param ctx the parse tree
	 */
	void enterBgpro_default_local_preference(PaloAltoParser.Bgpro_default_local_preferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgpro_default_local_preference}.
	 * @param ctx the parse tree
	 */
	void exitBgpro_default_local_preference(PaloAltoParser.Bgpro_default_local_preferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgpro_graceful_restart}.
	 * @param ctx the parse tree
	 */
	void enterBgpro_graceful_restart(PaloAltoParser.Bgpro_graceful_restartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgpro_graceful_restart}.
	 * @param ctx the parse tree
	 */
	void exitBgpro_graceful_restart(PaloAltoParser.Bgpro_graceful_restartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgprog_enable}.
	 * @param ctx the parse tree
	 */
	void enterBgprog_enable(PaloAltoParser.Bgprog_enableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgprog_enable}.
	 * @param ctx the parse tree
	 */
	void exitBgprog_enable(PaloAltoParser.Bgprog_enableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgpro_med}.
	 * @param ctx the parse tree
	 */
	void enterBgpro_med(PaloAltoParser.Bgpro_medContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgpro_med}.
	 * @param ctx the parse tree
	 */
	void exitBgpro_med(PaloAltoParser.Bgpro_medContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgprom_always_compare_med}.
	 * @param ctx the parse tree
	 */
	void enterBgprom_always_compare_med(PaloAltoParser.Bgprom_always_compare_medContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgprom_always_compare_med}.
	 * @param ctx the parse tree
	 */
	void exitBgprom_always_compare_med(PaloAltoParser.Bgprom_always_compare_medContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgprom_deterministic_med_comparison}.
	 * @param ctx the parse tree
	 */
	void enterBgprom_deterministic_med_comparison(PaloAltoParser.Bgprom_deterministic_med_comparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgprom_deterministic_med_comparison}.
	 * @param ctx the parse tree
	 */
	void exitBgprom_deterministic_med_comparison(PaloAltoParser.Bgprom_deterministic_med_comparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgpro_reflector_cluster_id}.
	 * @param ctx the parse tree
	 */
	void enterBgpro_reflector_cluster_id(PaloAltoParser.Bgpro_reflector_cluster_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgpro_reflector_cluster_id}.
	 * @param ctx the parse tree
	 */
	void exitBgpro_reflector_cluster_id(PaloAltoParser.Bgpro_reflector_cluster_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgprr_general}.
	 * @param ctx the parse tree
	 */
	void enterBgprr_general(PaloAltoParser.Bgprr_generalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgprr_general}.
	 * @param ctx the parse tree
	 */
	void exitBgprr_general(PaloAltoParser.Bgprr_generalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgprrg_address_family_identifier}.
	 * @param ctx the parse tree
	 */
	void enterBgprrg_address_family_identifier(PaloAltoParser.Bgprrg_address_family_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgprrg_address_family_identifier}.
	 * @param ctx the parse tree
	 */
	void exitBgprrg_address_family_identifier(PaloAltoParser.Bgprrg_address_family_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgprrg_enable}.
	 * @param ctx the parse tree
	 */
	void enterBgprrg_enable(PaloAltoParser.Bgprrg_enableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgprrg_enable}.
	 * @param ctx the parse tree
	 */
	void exitBgprrg_enable(PaloAltoParser.Bgprrg_enableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgprrg_route_table}.
	 * @param ctx the parse tree
	 */
	void enterBgprrg_route_table(PaloAltoParser.Bgprrg_route_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgprrg_route_table}.
	 * @param ctx the parse tree
	 */
	void exitBgprrg_route_table(PaloAltoParser.Bgprrg_route_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgprrg_set_origin}.
	 * @param ctx the parse tree
	 */
	void enterBgprrg_set_origin(PaloAltoParser.Bgprrg_set_originContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgprrg_set_origin}.
	 * @param ctx the parse tree
	 */
	void exitBgprrg_set_origin(PaloAltoParser.Bgprrg_set_originContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgprr_ip_address}.
	 * @param ctx the parse tree
	 */
	void enterBgprr_ip_address(PaloAltoParser.Bgprr_ip_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgprr_ip_address}.
	 * @param ctx the parse tree
	 */
	void exitBgprr_ip_address(PaloAltoParser.Bgprr_ip_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgprr_prefix}.
	 * @param ctx the parse tree
	 */
	void enterBgprr_prefix(PaloAltoParser.Bgprr_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgprr_prefix}.
	 * @param ctx the parse tree
	 */
	void exitBgprr_prefix(PaloAltoParser.Bgprr_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgprr_profile_name}.
	 * @param ctx the parse tree
	 */
	void enterBgprr_profile_name(PaloAltoParser.Bgprr_profile_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgprr_profile_name}.
	 * @param ctx the parse tree
	 */
	void exitBgprr_profile_name(PaloAltoParser.Bgprr_profile_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgp_med}.
	 * @param ctx the parse tree
	 */
	void enterBgp_med(PaloAltoParser.Bgp_medContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgp_med}.
	 * @param ctx the parse tree
	 */
	void exitBgp_med(PaloAltoParser.Bgp_medContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgp_weight}.
	 * @param ctx the parse tree
	 */
	void enterBgp_weight(PaloAltoParser.Bgp_weightContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgp_weight}.
	 * @param ctx the parse tree
	 */
	void exitBgp_weight(PaloAltoParser.Bgp_weightContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#bgp_policy_rule}.
	 * @param ctx the parse tree
	 */
	void enterBgp_policy_rule(PaloAltoParser.Bgp_policy_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#bgp_policy_rule}.
	 * @param ctx the parse tree
	 */
	void exitBgp_policy_rule(PaloAltoParser.Bgp_policy_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#pr_action}.
	 * @param ctx the parse tree
	 */
	void enterPr_action(PaloAltoParser.Pr_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#pr_action}.
	 * @param ctx the parse tree
	 */
	void exitPr_action(PaloAltoParser.Pr_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#pr_enable}.
	 * @param ctx the parse tree
	 */
	void enterPr_enable(PaloAltoParser.Pr_enableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#pr_enable}.
	 * @param ctx the parse tree
	 */
	void exitPr_enable(PaloAltoParser.Pr_enableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#pr_match}.
	 * @param ctx the parse tree
	 */
	void enterPr_match(PaloAltoParser.Pr_matchContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#pr_match}.
	 * @param ctx the parse tree
	 */
	void exitPr_match(PaloAltoParser.Pr_matchContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#pr_used_by}.
	 * @param ctx the parse tree
	 */
	void enterPr_used_by(PaloAltoParser.Pr_used_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#pr_used_by}.
	 * @param ctx the parse tree
	 */
	void exitPr_used_by(PaloAltoParser.Pr_used_byContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#pra_allow}.
	 * @param ctx the parse tree
	 */
	void enterPra_allow(PaloAltoParser.Pra_allowContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#pra_allow}.
	 * @param ctx the parse tree
	 */
	void exitPra_allow(PaloAltoParser.Pra_allowContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#pra_deny}.
	 * @param ctx the parse tree
	 */
	void enterPra_deny(PaloAltoParser.Pra_denyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#pra_deny}.
	 * @param ctx the parse tree
	 */
	void exitPra_deny(PaloAltoParser.Pra_denyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#praa_update}.
	 * @param ctx the parse tree
	 */
	void enterPraa_update(PaloAltoParser.Praa_updateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#praa_update}.
	 * @param ctx the parse tree
	 */
	void exitPraa_update(PaloAltoParser.Praa_updateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#praau_as_path}.
	 * @param ctx the parse tree
	 */
	void enterPraau_as_path(PaloAltoParser.Praau_as_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#praau_as_path}.
	 * @param ctx the parse tree
	 */
	void exitPraau_as_path(PaloAltoParser.Praau_as_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#praau_community}.
	 * @param ctx the parse tree
	 */
	void enterPraau_community(PaloAltoParser.Praau_communityContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#praau_community}.
	 * @param ctx the parse tree
	 */
	void exitPraau_community(PaloAltoParser.Praau_communityContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#praau_extended_community}.
	 * @param ctx the parse tree
	 */
	void enterPraau_extended_community(PaloAltoParser.Praau_extended_communityContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#praau_extended_community}.
	 * @param ctx the parse tree
	 */
	void exitPraau_extended_community(PaloAltoParser.Praau_extended_communityContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#praau_med}.
	 * @param ctx the parse tree
	 */
	void enterPraau_med(PaloAltoParser.Praau_medContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#praau_med}.
	 * @param ctx the parse tree
	 */
	void exitPraau_med(PaloAltoParser.Praau_medContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#praau_origin}.
	 * @param ctx the parse tree
	 */
	void enterPraau_origin(PaloAltoParser.Praau_originContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#praau_origin}.
	 * @param ctx the parse tree
	 */
	void exitPraau_origin(PaloAltoParser.Praau_originContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#praau_weight}.
	 * @param ctx the parse tree
	 */
	void enterPraau_weight(PaloAltoParser.Praau_weightContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#praau_weight}.
	 * @param ctx the parse tree
	 */
	void exitPraau_weight(PaloAltoParser.Praau_weightContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#prm_address_prefix}.
	 * @param ctx the parse tree
	 */
	void enterPrm_address_prefix(PaloAltoParser.Prm_address_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#prm_address_prefix}.
	 * @param ctx the parse tree
	 */
	void exitPrm_address_prefix(PaloAltoParser.Prm_address_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#prm_from_peer}.
	 * @param ctx the parse tree
	 */
	void enterPrm_from_peer(PaloAltoParser.Prm_from_peerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#prm_from_peer}.
	 * @param ctx the parse tree
	 */
	void exitPrm_from_peer(PaloAltoParser.Prm_from_peerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#s_deviceconfig}.
	 * @param ctx the parse tree
	 */
	void enterS_deviceconfig(PaloAltoParser.S_deviceconfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#s_deviceconfig}.
	 * @param ctx the parse tree
	 */
	void exitS_deviceconfig(PaloAltoParser.S_deviceconfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sd_null}.
	 * @param ctx the parse tree
	 */
	void enterSd_null(PaloAltoParser.Sd_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sd_null}.
	 * @param ctx the parse tree
	 */
	void exitSd_null(PaloAltoParser.Sd_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sd_system}.
	 * @param ctx the parse tree
	 */
	void enterSd_system(PaloAltoParser.Sd_systemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sd_system}.
	 * @param ctx the parse tree
	 */
	void exitSd_system(PaloAltoParser.Sd_systemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sds_default_gateway}.
	 * @param ctx the parse tree
	 */
	void enterSds_default_gateway(PaloAltoParser.Sds_default_gatewayContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sds_default_gateway}.
	 * @param ctx the parse tree
	 */
	void exitSds_default_gateway(PaloAltoParser.Sds_default_gatewayContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sds_dns_setting}.
	 * @param ctx the parse tree
	 */
	void enterSds_dns_setting(PaloAltoParser.Sds_dns_settingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sds_dns_setting}.
	 * @param ctx the parse tree
	 */
	void exitSds_dns_setting(PaloAltoParser.Sds_dns_settingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sds_domain}.
	 * @param ctx the parse tree
	 */
	void enterSds_domain(PaloAltoParser.Sds_domainContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sds_domain}.
	 * @param ctx the parse tree
	 */
	void exitSds_domain(PaloAltoParser.Sds_domainContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sds_hostname}.
	 * @param ctx the parse tree
	 */
	void enterSds_hostname(PaloAltoParser.Sds_hostnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sds_hostname}.
	 * @param ctx the parse tree
	 */
	void exitSds_hostname(PaloAltoParser.Sds_hostnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sds_ip_address}.
	 * @param ctx the parse tree
	 */
	void enterSds_ip_address(PaloAltoParser.Sds_ip_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sds_ip_address}.
	 * @param ctx the parse tree
	 */
	void exitSds_ip_address(PaloAltoParser.Sds_ip_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sds_netmask}.
	 * @param ctx the parse tree
	 */
	void enterSds_netmask(PaloAltoParser.Sds_netmaskContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sds_netmask}.
	 * @param ctx the parse tree
	 */
	void exitSds_netmask(PaloAltoParser.Sds_netmaskContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sds_ntp_servers}.
	 * @param ctx the parse tree
	 */
	void enterSds_ntp_servers(PaloAltoParser.Sds_ntp_serversContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sds_ntp_servers}.
	 * @param ctx the parse tree
	 */
	void exitSds_ntp_servers(PaloAltoParser.Sds_ntp_serversContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sds_null}.
	 * @param ctx the parse tree
	 */
	void enterSds_null(PaloAltoParser.Sds_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sds_null}.
	 * @param ctx the parse tree
	 */
	void exitSds_null(PaloAltoParser.Sds_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sdsd_servers}.
	 * @param ctx the parse tree
	 */
	void enterSdsd_servers(PaloAltoParser.Sdsd_serversContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sdsd_servers}.
	 * @param ctx the parse tree
	 */
	void exitSdsd_servers(PaloAltoParser.Sdsd_serversContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sdsn_ntp_server_address}.
	 * @param ctx the parse tree
	 */
	void enterSdsn_ntp_server_address(PaloAltoParser.Sdsn_ntp_server_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sdsn_ntp_server_address}.
	 * @param ctx the parse tree
	 */
	void exitSdsn_ntp_server_address(PaloAltoParser.Sdsn_ntp_server_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sdg_description}.
	 * @param ctx the parse tree
	 */
	void enterSdg_description(PaloAltoParser.Sdg_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sdg_description}.
	 * @param ctx the parse tree
	 */
	void exitSdg_description(PaloAltoParser.Sdg_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sdg_devices}.
	 * @param ctx the parse tree
	 */
	void enterSdg_devices(PaloAltoParser.Sdg_devicesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sdg_devices}.
	 * @param ctx the parse tree
	 */
	void exitSdg_devices(PaloAltoParser.Sdg_devicesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sdg_parent_dg}.
	 * @param ctx the parse tree
	 */
	void enterSdg_parent_dg(PaloAltoParser.Sdg_parent_dgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sdg_parent_dg}.
	 * @param ctx the parse tree
	 */
	void exitSdg_parent_dg(PaloAltoParser.Sdg_parent_dgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sdg_profile_group}.
	 * @param ctx the parse tree
	 */
	void enterSdg_profile_group(PaloAltoParser.Sdg_profile_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sdg_profile_group}.
	 * @param ctx the parse tree
	 */
	void exitSdg_profile_group(PaloAltoParser.Sdg_profile_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sdg_profiles}.
	 * @param ctx the parse tree
	 */
	void enterSdg_profiles(PaloAltoParser.Sdg_profilesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sdg_profiles}.
	 * @param ctx the parse tree
	 */
	void exitSdg_profiles(PaloAltoParser.Sdg_profilesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sdgd_vsys}.
	 * @param ctx the parse tree
	 */
	void enterSdgd_vsys(PaloAltoParser.Sdgd_vsysContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sdgd_vsys}.
	 * @param ctx the parse tree
	 */
	void exitSdgd_vsys(PaloAltoParser.Sdgd_vsysContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sn_interface}.
	 * @param ctx the parse tree
	 */
	void enterSn_interface(PaloAltoParser.Sn_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sn_interface}.
	 * @param ctx the parse tree
	 */
	void exitSn_interface(PaloAltoParser.Sn_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#if_common}.
	 * @param ctx the parse tree
	 */
	void enterIf_common(PaloAltoParser.If_commonContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#if_common}.
	 * @param ctx the parse tree
	 */
	void exitIf_common(PaloAltoParser.If_commonContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#if_comment}.
	 * @param ctx the parse tree
	 */
	void enterIf_comment(PaloAltoParser.If_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#if_comment}.
	 * @param ctx the parse tree
	 */
	void exitIf_comment(PaloAltoParser.If_commentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#if_tag}.
	 * @param ctx the parse tree
	 */
	void enterIf_tag(PaloAltoParser.If_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#if_tag}.
	 * @param ctx the parse tree
	 */
	void exitIf_tag(PaloAltoParser.If_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sni_aggregate_ethernet}.
	 * @param ctx the parse tree
	 */
	void enterSni_aggregate_ethernet(PaloAltoParser.Sni_aggregate_ethernetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sni_aggregate_ethernet}.
	 * @param ctx the parse tree
	 */
	void exitSni_aggregate_ethernet(PaloAltoParser.Sni_aggregate_ethernetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sni_aggregate_ethernet_definition}.
	 * @param ctx the parse tree
	 */
	void enterSni_aggregate_ethernet_definition(PaloAltoParser.Sni_aggregate_ethernet_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sni_aggregate_ethernet_definition}.
	 * @param ctx the parse tree
	 */
	void exitSni_aggregate_ethernet_definition(PaloAltoParser.Sni_aggregate_ethernet_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sni_ethernet}.
	 * @param ctx the parse tree
	 */
	void enterSni_ethernet(PaloAltoParser.Sni_ethernetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sni_ethernet}.
	 * @param ctx the parse tree
	 */
	void exitSni_ethernet(PaloAltoParser.Sni_ethernetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sni_ethernet_definition}.
	 * @param ctx the parse tree
	 */
	void enterSni_ethernet_definition(PaloAltoParser.Sni_ethernet_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sni_ethernet_definition}.
	 * @param ctx the parse tree
	 */
	void exitSni_ethernet_definition(PaloAltoParser.Sni_ethernet_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sni_loopback}.
	 * @param ctx the parse tree
	 */
	void enterSni_loopback(PaloAltoParser.Sni_loopbackContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sni_loopback}.
	 * @param ctx the parse tree
	 */
	void exitSni_loopback(PaloAltoParser.Sni_loopbackContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sni_tunnel}.
	 * @param ctx the parse tree
	 */
	void enterSni_tunnel(PaloAltoParser.Sni_tunnelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sni_tunnel}.
	 * @param ctx the parse tree
	 */
	void exitSni_tunnel(PaloAltoParser.Sni_tunnelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sni_vlan}.
	 * @param ctx the parse tree
	 */
	void enterSni_vlan(PaloAltoParser.Sni_vlanContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sni_vlan}.
	 * @param ctx the parse tree
	 */
	void exitSni_vlan(PaloAltoParser.Sni_vlanContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#snie_aggregate_group}.
	 * @param ctx the parse tree
	 */
	void enterSnie_aggregate_group(PaloAltoParser.Snie_aggregate_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#snie_aggregate_group}.
	 * @param ctx the parse tree
	 */
	void exitSnie_aggregate_group(PaloAltoParser.Snie_aggregate_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#snie_ha}.
	 * @param ctx the parse tree
	 */
	void enterSnie_ha(PaloAltoParser.Snie_haContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#snie_ha}.
	 * @param ctx the parse tree
	 */
	void exitSnie_ha(PaloAltoParser.Snie_haContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#snie_layer2}.
	 * @param ctx the parse tree
	 */
	void enterSnie_layer2(PaloAltoParser.Snie_layer2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#snie_layer2}.
	 * @param ctx the parse tree
	 */
	void exitSnie_layer2(PaloAltoParser.Snie_layer2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#snie_layer3}.
	 * @param ctx the parse tree
	 */
	void enterSnie_layer3(PaloAltoParser.Snie_layer3Context ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#snie_layer3}.
	 * @param ctx the parse tree
	 */
	void exitSnie_layer3(PaloAltoParser.Snie_layer3Context ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#snie_link_duplex}.
	 * @param ctx the parse tree
	 */
	void enterSnie_link_duplex(PaloAltoParser.Snie_link_duplexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#snie_link_duplex}.
	 * @param ctx the parse tree
	 */
	void exitSnie_link_duplex(PaloAltoParser.Snie_link_duplexContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#snie_link_speed}.
	 * @param ctx the parse tree
	 */
	void enterSnie_link_speed(PaloAltoParser.Snie_link_speedContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#snie_link_speed}.
	 * @param ctx the parse tree
	 */
	void exitSnie_link_speed(PaloAltoParser.Snie_link_speedContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#snie_link_state}.
	 * @param ctx the parse tree
	 */
	void enterSnie_link_state(PaloAltoParser.Snie_link_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#snie_link_state}.
	 * @param ctx the parse tree
	 */
	void exitSnie_link_state(PaloAltoParser.Snie_link_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#snie_tap}.
	 * @param ctx the parse tree
	 */
	void enterSnie_tap(PaloAltoParser.Snie_tapContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#snie_tap}.
	 * @param ctx the parse tree
	 */
	void exitSnie_tap(PaloAltoParser.Snie_tapContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#snie_virtual_wire}.
	 * @param ctx the parse tree
	 */
	void enterSnie_virtual_wire(PaloAltoParser.Snie_virtual_wireContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#snie_virtual_wire}.
	 * @param ctx the parse tree
	 */
	void exitSnie_virtual_wire(PaloAltoParser.Snie_virtual_wireContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sniel2_unit}.
	 * @param ctx the parse tree
	 */
	void enterSniel2_unit(PaloAltoParser.Sniel2_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sniel2_unit}.
	 * @param ctx the parse tree
	 */
	void exitSniel2_unit(PaloAltoParser.Sniel2_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sniel2_units}.
	 * @param ctx the parse tree
	 */
	void enterSniel2_units(PaloAltoParser.Sniel2_unitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sniel2_units}.
	 * @param ctx the parse tree
	 */
	void exitSniel2_units(PaloAltoParser.Sniel2_unitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sniel3_common}.
	 * @param ctx the parse tree
	 */
	void enterSniel3_common(PaloAltoParser.Sniel3_commonContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sniel3_common}.
	 * @param ctx the parse tree
	 */
	void exitSniel3_common(PaloAltoParser.Sniel3_commonContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sniel3_ip}.
	 * @param ctx the parse tree
	 */
	void enterSniel3_ip(PaloAltoParser.Sniel3_ipContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sniel3_ip}.
	 * @param ctx the parse tree
	 */
	void exitSniel3_ip(PaloAltoParser.Sniel3_ipContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sniel3_mtu}.
	 * @param ctx the parse tree
	 */
	void enterSniel3_mtu(PaloAltoParser.Sniel3_mtuContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sniel3_mtu}.
	 * @param ctx the parse tree
	 */
	void exitSniel3_mtu(PaloAltoParser.Sniel3_mtuContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sniel3_null}.
	 * @param ctx the parse tree
	 */
	void enterSniel3_null(PaloAltoParser.Sniel3_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sniel3_null}.
	 * @param ctx the parse tree
	 */
	void exitSniel3_null(PaloAltoParser.Sniel3_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sniel3_unit}.
	 * @param ctx the parse tree
	 */
	void enterSniel3_unit(PaloAltoParser.Sniel3_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sniel3_unit}.
	 * @param ctx the parse tree
	 */
	void exitSniel3_unit(PaloAltoParser.Sniel3_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sniel3_units}.
	 * @param ctx the parse tree
	 */
	void enterSniel3_units(PaloAltoParser.Sniel3_unitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sniel3_units}.
	 * @param ctx the parse tree
	 */
	void exitSniel3_units(PaloAltoParser.Sniel3_unitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#snil_ip}.
	 * @param ctx the parse tree
	 */
	void enterSnil_ip(PaloAltoParser.Snil_ipContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#snil_ip}.
	 * @param ctx the parse tree
	 */
	void exitSnil_ip(PaloAltoParser.Snil_ipContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#snil_unit}.
	 * @param ctx the parse tree
	 */
	void enterSnil_unit(PaloAltoParser.Snil_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#snil_unit}.
	 * @param ctx the parse tree
	 */
	void exitSnil_unit(PaloAltoParser.Snil_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#snil_units}.
	 * @param ctx the parse tree
	 */
	void enterSnil_units(PaloAltoParser.Snil_unitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#snil_units}.
	 * @param ctx the parse tree
	 */
	void exitSnil_units(PaloAltoParser.Snil_unitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#snit_unit}.
	 * @param ctx the parse tree
	 */
	void enterSnit_unit(PaloAltoParser.Snit_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#snit_unit}.
	 * @param ctx the parse tree
	 */
	void exitSnit_unit(PaloAltoParser.Snit_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#snit_units}.
	 * @param ctx the parse tree
	 */
	void enterSnit_units(PaloAltoParser.Snit_unitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#snit_units}.
	 * @param ctx the parse tree
	 */
	void exitSnit_units(PaloAltoParser.Snit_unitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sniv_unit}.
	 * @param ctx the parse tree
	 */
	void enterSniv_unit(PaloAltoParser.Sniv_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sniv_unit}.
	 * @param ctx the parse tree
	 */
	void exitSniv_unit(PaloAltoParser.Sniv_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sniv_units}.
	 * @param ctx the parse tree
	 */
	void enterSniv_units(PaloAltoParser.Sniv_unitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sniv_units}.
	 * @param ctx the parse tree
	 */
	void exitSniv_units(PaloAltoParser.Sniv_unitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#cp_authentication}.
	 * @param ctx the parse tree
	 */
	void enterCp_authentication(PaloAltoParser.Cp_authenticationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#cp_authentication}.
	 * @param ctx the parse tree
	 */
	void exitCp_authentication(PaloAltoParser.Cp_authenticationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#cp_dh_group}.
	 * @param ctx the parse tree
	 */
	void enterCp_dh_group(PaloAltoParser.Cp_dh_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#cp_dh_group}.
	 * @param ctx the parse tree
	 */
	void exitCp_dh_group(PaloAltoParser.Cp_dh_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#cp_encryption}.
	 * @param ctx the parse tree
	 */
	void enterCp_encryption(PaloAltoParser.Cp_encryptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#cp_encryption}.
	 * @param ctx the parse tree
	 */
	void exitCp_encryption(PaloAltoParser.Cp_encryptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#cp_encryption_algo}.
	 * @param ctx the parse tree
	 */
	void enterCp_encryption_algo(PaloAltoParser.Cp_encryption_algoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#cp_encryption_algo}.
	 * @param ctx the parse tree
	 */
	void exitCp_encryption_algo(PaloAltoParser.Cp_encryption_algoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#cp_hash}.
	 * @param ctx the parse tree
	 */
	void enterCp_hash(PaloAltoParser.Cp_hashContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#cp_hash}.
	 * @param ctx the parse tree
	 */
	void exitCp_hash(PaloAltoParser.Cp_hashContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#cp_lifetime}.
	 * @param ctx the parse tree
	 */
	void enterCp_lifetime(PaloAltoParser.Cp_lifetimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#cp_lifetime}.
	 * @param ctx the parse tree
	 */
	void exitCp_lifetime(PaloAltoParser.Cp_lifetimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#s_network}.
	 * @param ctx the parse tree
	 */
	void enterS_network(PaloAltoParser.S_networkContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#s_network}.
	 * @param ctx the parse tree
	 */
	void exitS_network(PaloAltoParser.S_networkContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sn_ike}.
	 * @param ctx the parse tree
	 */
	void enterSn_ike(PaloAltoParser.Sn_ikeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sn_ike}.
	 * @param ctx the parse tree
	 */
	void exitSn_ike(PaloAltoParser.Sn_ikeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sn_ike_crypto_profiles}.
	 * @param ctx the parse tree
	 */
	void enterSn_ike_crypto_profiles(PaloAltoParser.Sn_ike_crypto_profilesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sn_ike_crypto_profiles}.
	 * @param ctx the parse tree
	 */
	void exitSn_ike_crypto_profiles(PaloAltoParser.Sn_ike_crypto_profilesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sn_ike_gateway}.
	 * @param ctx the parse tree
	 */
	void enterSn_ike_gateway(PaloAltoParser.Sn_ike_gatewayContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sn_ike_gateway}.
	 * @param ctx the parse tree
	 */
	void exitSn_ike_gateway(PaloAltoParser.Sn_ike_gatewayContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sn_profiles}.
	 * @param ctx the parse tree
	 */
	void enterSn_profiles(PaloAltoParser.Sn_profilesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sn_profiles}.
	 * @param ctx the parse tree
	 */
	void exitSn_profiles(PaloAltoParser.Sn_profilesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sn_qos}.
	 * @param ctx the parse tree
	 */
	void enterSn_qos(PaloAltoParser.Sn_qosContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sn_qos}.
	 * @param ctx the parse tree
	 */
	void exitSn_qos(PaloAltoParser.Sn_qosContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sn_shared_gateway}.
	 * @param ctx the parse tree
	 */
	void enterSn_shared_gateway(PaloAltoParser.Sn_shared_gatewayContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sn_shared_gateway}.
	 * @param ctx the parse tree
	 */
	void exitSn_shared_gateway(PaloAltoParser.Sn_shared_gatewayContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sn_shared_gateway_definition}.
	 * @param ctx the parse tree
	 */
	void enterSn_shared_gateway_definition(PaloAltoParser.Sn_shared_gateway_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sn_shared_gateway_definition}.
	 * @param ctx the parse tree
	 */
	void exitSn_shared_gateway_definition(PaloAltoParser.Sn_shared_gateway_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#snsg_display_name}.
	 * @param ctx the parse tree
	 */
	void enterSnsg_display_name(PaloAltoParser.Snsg_display_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#snsg_display_name}.
	 * @param ctx the parse tree
	 */
	void exitSnsg_display_name(PaloAltoParser.Snsg_display_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#snsg_import}.
	 * @param ctx the parse tree
	 */
	void enterSnsg_import(PaloAltoParser.Snsg_importContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#snsg_import}.
	 * @param ctx the parse tree
	 */
	void exitSnsg_import(PaloAltoParser.Snsg_importContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#snsgi_interface}.
	 * @param ctx the parse tree
	 */
	void enterSnsgi_interface(PaloAltoParser.Snsgi_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#snsgi_interface}.
	 * @param ctx the parse tree
	 */
	void exitSnsgi_interface(PaloAltoParser.Snsgi_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#snsg_zone}.
	 * @param ctx the parse tree
	 */
	void enterSnsg_zone(PaloAltoParser.Snsg_zoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#snsg_zone}.
	 * @param ctx the parse tree
	 */
	void exitSnsg_zone(PaloAltoParser.Snsg_zoneContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#snsg_zone_definition}.
	 * @param ctx the parse tree
	 */
	void enterSnsg_zone_definition(PaloAltoParser.Snsg_zone_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#snsg_zone_definition}.
	 * @param ctx the parse tree
	 */
	void exitSnsg_zone_definition(PaloAltoParser.Snsg_zone_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#snsgz_network}.
	 * @param ctx the parse tree
	 */
	void enterSnsgz_network(PaloAltoParser.Snsgz_networkContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#snsgz_network}.
	 * @param ctx the parse tree
	 */
	void exitSnsgz_network(PaloAltoParser.Snsgz_networkContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#snsgzn_layer3}.
	 * @param ctx the parse tree
	 */
	void enterSnsgzn_layer3(PaloAltoParser.Snsgzn_layer3Context ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#snsgzn_layer3}.
	 * @param ctx the parse tree
	 */
	void exitSnsgzn_layer3(PaloAltoParser.Snsgzn_layer3Context ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#snicp_global_protect}.
	 * @param ctx the parse tree
	 */
	void enterSnicp_global_protect(PaloAltoParser.Snicp_global_protectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#snicp_global_protect}.
	 * @param ctx the parse tree
	 */
	void exitSnicp_global_protect(PaloAltoParser.Snicp_global_protectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#snicp_ike_crypto_profiles}.
	 * @param ctx the parse tree
	 */
	void enterSnicp_ike_crypto_profiles(PaloAltoParser.Snicp_ike_crypto_profilesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#snicp_ike_crypto_profiles}.
	 * @param ctx the parse tree
	 */
	void exitSnicp_ike_crypto_profiles(PaloAltoParser.Snicp_ike_crypto_profilesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#snicp_ipsec_crypto_profiles}.
	 * @param ctx the parse tree
	 */
	void enterSnicp_ipsec_crypto_profiles(PaloAltoParser.Snicp_ipsec_crypto_profilesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#snicp_ipsec_crypto_profiles}.
	 * @param ctx the parse tree
	 */
	void exitSnicp_ipsec_crypto_profiles(PaloAltoParser.Snicp_ipsec_crypto_profilesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ospf_interface_dead_counts}.
	 * @param ctx the parse tree
	 */
	void enterOspf_interface_dead_counts(PaloAltoParser.Ospf_interface_dead_countsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ospf_interface_dead_counts}.
	 * @param ctx the parse tree
	 */
	void exitOspf_interface_dead_counts(PaloAltoParser.Ospf_interface_dead_countsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ospf_interface_hello_interval}.
	 * @param ctx the parse tree
	 */
	void enterOspf_interface_hello_interval(PaloAltoParser.Ospf_interface_hello_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ospf_interface_hello_interval}.
	 * @param ctx the parse tree
	 */
	void exitOspf_interface_hello_interval(PaloAltoParser.Ospf_interface_hello_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ospf_interface_priority}.
	 * @param ctx the parse tree
	 */
	void enterOspf_interface_priority(PaloAltoParser.Ospf_interface_priorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ospf_interface_priority}.
	 * @param ctx the parse tree
	 */
	void exitOspf_interface_priority(PaloAltoParser.Ospf_interface_priorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ospf_interface_retransmit_interval}.
	 * @param ctx the parse tree
	 */
	void enterOspf_interface_retransmit_interval(PaloAltoParser.Ospf_interface_retransmit_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ospf_interface_retransmit_interval}.
	 * @param ctx the parse tree
	 */
	void exitOspf_interface_retransmit_interval(PaloAltoParser.Ospf_interface_retransmit_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ospf_interface_transit_delay}.
	 * @param ctx the parse tree
	 */
	void enterOspf_interface_transit_delay(PaloAltoParser.Ospf_interface_transit_delayContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ospf_interface_transit_delay}.
	 * @param ctx the parse tree
	 */
	void exitOspf_interface_transit_delay(PaloAltoParser.Ospf_interface_transit_delayContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ospf_metric}.
	 * @param ctx the parse tree
	 */
	void enterOspf_metric(PaloAltoParser.Ospf_metricContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ospf_metric}.
	 * @param ctx the parse tree
	 */
	void exitOspf_metric(PaloAltoParser.Ospf_metricContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#vrp_ospf}.
	 * @param ctx the parse tree
	 */
	void enterVrp_ospf(PaloAltoParser.Vrp_ospfContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#vrp_ospf}.
	 * @param ctx the parse tree
	 */
	void exitVrp_ospf(PaloAltoParser.Vrp_ospfContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ospf_area}.
	 * @param ctx the parse tree
	 */
	void enterOspf_area(PaloAltoParser.Ospf_areaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ospf_area}.
	 * @param ctx the parse tree
	 */
	void exitOspf_area(PaloAltoParser.Ospf_areaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ospfa_type}.
	 * @param ctx the parse tree
	 */
	void enterOspfa_type(PaloAltoParser.Ospfa_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ospfa_type}.
	 * @param ctx the parse tree
	 */
	void exitOspfa_type(PaloAltoParser.Ospfa_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ospf_enable}.
	 * @param ctx the parse tree
	 */
	void enterOspf_enable(PaloAltoParser.Ospf_enableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ospf_enable}.
	 * @param ctx the parse tree
	 */
	void exitOspf_enable(PaloAltoParser.Ospf_enableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ospf_graceful_restart}.
	 * @param ctx the parse tree
	 */
	void enterOspf_graceful_restart(PaloAltoParser.Ospf_graceful_restartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ospf_graceful_restart}.
	 * @param ctx the parse tree
	 */
	void exitOspf_graceful_restart(PaloAltoParser.Ospf_graceful_restartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ospf_null}.
	 * @param ctx the parse tree
	 */
	void enterOspf_null(PaloAltoParser.Ospf_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ospf_null}.
	 * @param ctx the parse tree
	 */
	void exitOspf_null(PaloAltoParser.Ospf_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ospf_reject_default_route}.
	 * @param ctx the parse tree
	 */
	void enterOspf_reject_default_route(PaloAltoParser.Ospf_reject_default_routeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ospf_reject_default_route}.
	 * @param ctx the parse tree
	 */
	void exitOspf_reject_default_route(PaloAltoParser.Ospf_reject_default_routeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ospf_router_id}.
	 * @param ctx the parse tree
	 */
	void enterOspf_router_id(PaloAltoParser.Ospf_router_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ospf_router_id}.
	 * @param ctx the parse tree
	 */
	void exitOspf_router_id(PaloAltoParser.Ospf_router_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ospfa_interface}.
	 * @param ctx the parse tree
	 */
	void enterOspfa_interface(PaloAltoParser.Ospfa_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ospfa_interface}.
	 * @param ctx the parse tree
	 */
	void exitOspfa_interface(PaloAltoParser.Ospfa_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ospfai_dead_counts}.
	 * @param ctx the parse tree
	 */
	void enterOspfai_dead_counts(PaloAltoParser.Ospfai_dead_countsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ospfai_dead_counts}.
	 * @param ctx the parse tree
	 */
	void exitOspfai_dead_counts(PaloAltoParser.Ospfai_dead_countsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ospfai_enable}.
	 * @param ctx the parse tree
	 */
	void enterOspfai_enable(PaloAltoParser.Ospfai_enableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ospfai_enable}.
	 * @param ctx the parse tree
	 */
	void exitOspfai_enable(PaloAltoParser.Ospfai_enableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ospfai_hello_interval}.
	 * @param ctx the parse tree
	 */
	void enterOspfai_hello_interval(PaloAltoParser.Ospfai_hello_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ospfai_hello_interval}.
	 * @param ctx the parse tree
	 */
	void exitOspfai_hello_interval(PaloAltoParser.Ospfai_hello_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ospfai_link_type}.
	 * @param ctx the parse tree
	 */
	void enterOspfai_link_type(PaloAltoParser.Ospfai_link_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ospfai_link_type}.
	 * @param ctx the parse tree
	 */
	void exitOspfai_link_type(PaloAltoParser.Ospfai_link_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ospfai_metric}.
	 * @param ctx the parse tree
	 */
	void enterOspfai_metric(PaloAltoParser.Ospfai_metricContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ospfai_metric}.
	 * @param ctx the parse tree
	 */
	void exitOspfai_metric(PaloAltoParser.Ospfai_metricContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ospfai_null}.
	 * @param ctx the parse tree
	 */
	void enterOspfai_null(PaloAltoParser.Ospfai_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ospfai_null}.
	 * @param ctx the parse tree
	 */
	void exitOspfai_null(PaloAltoParser.Ospfai_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ospfai_passive}.
	 * @param ctx the parse tree
	 */
	void enterOspfai_passive(PaloAltoParser.Ospfai_passiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ospfai_passive}.
	 * @param ctx the parse tree
	 */
	void exitOspfai_passive(PaloAltoParser.Ospfai_passiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ospfai_priority}.
	 * @param ctx the parse tree
	 */
	void enterOspfai_priority(PaloAltoParser.Ospfai_priorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ospfai_priority}.
	 * @param ctx the parse tree
	 */
	void exitOspfai_priority(PaloAltoParser.Ospfai_priorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ospfai_retransmit_interval}.
	 * @param ctx the parse tree
	 */
	void enterOspfai_retransmit_interval(PaloAltoParser.Ospfai_retransmit_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ospfai_retransmit_interval}.
	 * @param ctx the parse tree
	 */
	void exitOspfai_retransmit_interval(PaloAltoParser.Ospfai_retransmit_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ospfai_transit_delay}.
	 * @param ctx the parse tree
	 */
	void enterOspfai_transit_delay(PaloAltoParser.Ospfai_transit_delayContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ospfai_transit_delay}.
	 * @param ctx the parse tree
	 */
	void exitOspfai_transit_delay(PaloAltoParser.Ospfai_transit_delayContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ospfat_normal}.
	 * @param ctx the parse tree
	 */
	void enterOspfat_normal(PaloAltoParser.Ospfat_normalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ospfat_normal}.
	 * @param ctx the parse tree
	 */
	void exitOspfat_normal(PaloAltoParser.Ospfat_normalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ospfat_nssa}.
	 * @param ctx the parse tree
	 */
	void enterOspfat_nssa(PaloAltoParser.Ospfat_nssaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ospfat_nssa}.
	 * @param ctx the parse tree
	 */
	void exitOspfat_nssa(PaloAltoParser.Ospfat_nssaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ospfat_stub}.
	 * @param ctx the parse tree
	 */
	void enterOspfat_stub(PaloAltoParser.Ospfat_stubContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ospfat_stub}.
	 * @param ctx the parse tree
	 */
	void exitOspfat_stub(PaloAltoParser.Ospfat_stubContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ospfatn_accept_summary}.
	 * @param ctx the parse tree
	 */
	void enterOspfatn_accept_summary(PaloAltoParser.Ospfatn_accept_summaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ospfatn_accept_summary}.
	 * @param ctx the parse tree
	 */
	void exitOspfatn_accept_summary(PaloAltoParser.Ospfatn_accept_summaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ospfatn_default_route}.
	 * @param ctx the parse tree
	 */
	void enterOspfatn_default_route(PaloAltoParser.Ospfatn_default_routeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ospfatn_default_route}.
	 * @param ctx the parse tree
	 */
	void exitOspfatn_default_route(PaloAltoParser.Ospfatn_default_routeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ospfatndr_advertise}.
	 * @param ctx the parse tree
	 */
	void enterOspfatndr_advertise(PaloAltoParser.Ospfatndr_advertiseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ospfatndr_advertise}.
	 * @param ctx the parse tree
	 */
	void exitOspfatndr_advertise(PaloAltoParser.Ospfatndr_advertiseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ospfatndr_disable}.
	 * @param ctx the parse tree
	 */
	void enterOspfatndr_disable(PaloAltoParser.Ospfatndr_disableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ospfatndr_disable}.
	 * @param ctx the parse tree
	 */
	void exitOspfatndr_disable(PaloAltoParser.Ospfatndr_disableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ospfatndra_metric}.
	 * @param ctx the parse tree
	 */
	void enterOspfatndra_metric(PaloAltoParser.Ospfatndra_metricContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ospfatndra_metric}.
	 * @param ctx the parse tree
	 */
	void exitOspfatndra_metric(PaloAltoParser.Ospfatndra_metricContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ospfatndra_type}.
	 * @param ctx the parse tree
	 */
	void enterOspfatndra_type(PaloAltoParser.Ospfatndra_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ospfatndra_type}.
	 * @param ctx the parse tree
	 */
	void exitOspfatndra_type(PaloAltoParser.Ospfatndra_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ospfats_accept_summary}.
	 * @param ctx the parse tree
	 */
	void enterOspfats_accept_summary(PaloAltoParser.Ospfats_accept_summaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ospfats_accept_summary}.
	 * @param ctx the parse tree
	 */
	void exitOspfats_accept_summary(PaloAltoParser.Ospfats_accept_summaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ospfats_default_route}.
	 * @param ctx the parse tree
	 */
	void enterOspfats_default_route(PaloAltoParser.Ospfats_default_routeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ospfats_default_route}.
	 * @param ctx the parse tree
	 */
	void exitOspfats_default_route(PaloAltoParser.Ospfats_default_routeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ospfatsdr_advertise_metric}.
	 * @param ctx the parse tree
	 */
	void enterOspfatsdr_advertise_metric(PaloAltoParser.Ospfatsdr_advertise_metricContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ospfatsdr_advertise_metric}.
	 * @param ctx the parse tree
	 */
	void exitOspfatsdr_advertise_metric(PaloAltoParser.Ospfatsdr_advertise_metricContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ospfatsdr_disable}.
	 * @param ctx the parse tree
	 */
	void enterOspfatsdr_disable(PaloAltoParser.Ospfatsdr_disableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ospfatsdr_disable}.
	 * @param ctx the parse tree
	 */
	void exitOspfatsdr_disable(PaloAltoParser.Ospfatsdr_disableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ospfgr_enable}.
	 * @param ctx the parse tree
	 */
	void enterOspfgr_enable(PaloAltoParser.Ospfgr_enableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ospfgr_enable}.
	 * @param ctx the parse tree
	 */
	void exitOspfgr_enable(PaloAltoParser.Ospfgr_enableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ospfgr_helper_enable}.
	 * @param ctx the parse tree
	 */
	void enterOspfgr_helper_enable(PaloAltoParser.Ospfgr_helper_enableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ospfgr_helper_enable}.
	 * @param ctx the parse tree
	 */
	void exitOspfgr_helper_enable(PaloAltoParser.Ospfgr_helper_enableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ospfgr_strict_lsa_checking}.
	 * @param ctx the parse tree
	 */
	void enterOspfgr_strict_lsa_checking(PaloAltoParser.Ospfgr_strict_lsa_checkingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ospfgr_strict_lsa_checking}.
	 * @param ctx the parse tree
	 */
	void exitOspfgr_strict_lsa_checking(PaloAltoParser.Ospfgr_strict_lsa_checkingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#s_readonly}.
	 * @param ctx the parse tree
	 */
	void enterS_readonly(PaloAltoParser.S_readonlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#s_readonly}.
	 * @param ctx the parse tree
	 */
	void exitS_readonly(PaloAltoParser.S_readonlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sro_statement}.
	 * @param ctx the parse tree
	 */
	void enterSro_statement(PaloAltoParser.Sro_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sro_statement}.
	 * @param ctx the parse tree
	 */
	void exitSro_statement(PaloAltoParser.Sro_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sro_device_group}.
	 * @param ctx the parse tree
	 */
	void enterSro_device_group(PaloAltoParser.Sro_device_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sro_device_group}.
	 * @param ctx the parse tree
	 */
	void exitSro_device_group(PaloAltoParser.Sro_device_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sresp_result}.
	 * @param ctx the parse tree
	 */
	void enterSresp_result(PaloAltoParser.Sresp_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sresp_result}.
	 * @param ctx the parse tree
	 */
	void exitSresp_result(PaloAltoParser.Sresp_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srespr_devices}.
	 * @param ctx the parse tree
	 */
	void enterSrespr_devices(PaloAltoParser.Srespr_devicesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srespr_devices}.
	 * @param ctx the parse tree
	 */
	void exitSrespr_devices(PaloAltoParser.Srespr_devicesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sresprd_hostname}.
	 * @param ctx the parse tree
	 */
	void enterSresprd_hostname(PaloAltoParser.Sresprd_hostnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sresprd_hostname}.
	 * @param ctx the parse tree
	 */
	void exitSresprd_hostname(PaloAltoParser.Sresprd_hostnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#vrp_rip}.
	 * @param ctx the parse tree
	 */
	void enterVrp_rip(PaloAltoParser.Vrp_ripContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#vrp_rip}.
	 * @param ctx the parse tree
	 */
	void exitVrp_rip(PaloAltoParser.Vrp_ripContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#s_rulebase}.
	 * @param ctx the parse tree
	 */
	void enterS_rulebase(PaloAltoParser.S_rulebaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#s_rulebase}.
	 * @param ctx the parse tree
	 */
	void exitS_rulebase(PaloAltoParser.S_rulebaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#s_post_rulebase}.
	 * @param ctx the parse tree
	 */
	void enterS_post_rulebase(PaloAltoParser.S_post_rulebaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#s_post_rulebase}.
	 * @param ctx the parse tree
	 */
	void exitS_post_rulebase(PaloAltoParser.S_post_rulebaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#s_pre_rulebase}.
	 * @param ctx the parse tree
	 */
	void enterS_pre_rulebase(PaloAltoParser.S_pre_rulebaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#s_pre_rulebase}.
	 * @param ctx the parse tree
	 */
	void exitS_pre_rulebase(PaloAltoParser.S_pre_rulebaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#rulebase_inner}.
	 * @param ctx the parse tree
	 */
	void enterRulebase_inner(PaloAltoParser.Rulebase_innerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#rulebase_inner}.
	 * @param ctx the parse tree
	 */
	void exitRulebase_inner(PaloAltoParser.Rulebase_innerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sr_security}.
	 * @param ctx the parse tree
	 */
	void enterSr_security(PaloAltoParser.Sr_securityContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sr_security}.
	 * @param ctx the parse tree
	 */
	void exitSr_security(PaloAltoParser.Sr_securityContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sr_security_rules}.
	 * @param ctx the parse tree
	 */
	void enterSr_security_rules(PaloAltoParser.Sr_security_rulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sr_security_rules}.
	 * @param ctx the parse tree
	 */
	void exitSr_security_rules(PaloAltoParser.Sr_security_rulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srs_definition}.
	 * @param ctx the parse tree
	 */
	void enterSrs_definition(PaloAltoParser.Srs_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srs_definition}.
	 * @param ctx the parse tree
	 */
	void exitSrs_definition(PaloAltoParser.Srs_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srs_action}.
	 * @param ctx the parse tree
	 */
	void enterSrs_action(PaloAltoParser.Srs_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srs_action}.
	 * @param ctx the parse tree
	 */
	void exitSrs_action(PaloAltoParser.Srs_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srs_application}.
	 * @param ctx the parse tree
	 */
	void enterSrs_application(PaloAltoParser.Srs_applicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srs_application}.
	 * @param ctx the parse tree
	 */
	void exitSrs_application(PaloAltoParser.Srs_applicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srs_category}.
	 * @param ctx the parse tree
	 */
	void enterSrs_category(PaloAltoParser.Srs_categoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srs_category}.
	 * @param ctx the parse tree
	 */
	void exitSrs_category(PaloAltoParser.Srs_categoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srs_description}.
	 * @param ctx the parse tree
	 */
	void enterSrs_description(PaloAltoParser.Srs_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srs_description}.
	 * @param ctx the parse tree
	 */
	void exitSrs_description(PaloAltoParser.Srs_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srs_destination}.
	 * @param ctx the parse tree
	 */
	void enterSrs_destination(PaloAltoParser.Srs_destinationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srs_destination}.
	 * @param ctx the parse tree
	 */
	void exitSrs_destination(PaloAltoParser.Srs_destinationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srs_disabled}.
	 * @param ctx the parse tree
	 */
	void enterSrs_disabled(PaloAltoParser.Srs_disabledContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srs_disabled}.
	 * @param ctx the parse tree
	 */
	void exitSrs_disabled(PaloAltoParser.Srs_disabledContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srs_from}.
	 * @param ctx the parse tree
	 */
	void enterSrs_from(PaloAltoParser.Srs_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srs_from}.
	 * @param ctx the parse tree
	 */
	void exitSrs_from(PaloAltoParser.Srs_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srs_hip_profiles}.
	 * @param ctx the parse tree
	 */
	void enterSrs_hip_profiles(PaloAltoParser.Srs_hip_profilesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srs_hip_profiles}.
	 * @param ctx the parse tree
	 */
	void exitSrs_hip_profiles(PaloAltoParser.Srs_hip_profilesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srs_log_end}.
	 * @param ctx the parse tree
	 */
	void enterSrs_log_end(PaloAltoParser.Srs_log_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srs_log_end}.
	 * @param ctx the parse tree
	 */
	void exitSrs_log_end(PaloAltoParser.Srs_log_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srs_log_setting}.
	 * @param ctx the parse tree
	 */
	void enterSrs_log_setting(PaloAltoParser.Srs_log_settingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srs_log_setting}.
	 * @param ctx the parse tree
	 */
	void exitSrs_log_setting(PaloAltoParser.Srs_log_settingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srs_log_start}.
	 * @param ctx the parse tree
	 */
	void enterSrs_log_start(PaloAltoParser.Srs_log_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srs_log_start}.
	 * @param ctx the parse tree
	 */
	void exitSrs_log_start(PaloAltoParser.Srs_log_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srs_negate_destination}.
	 * @param ctx the parse tree
	 */
	void enterSrs_negate_destination(PaloAltoParser.Srs_negate_destinationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srs_negate_destination}.
	 * @param ctx the parse tree
	 */
	void exitSrs_negate_destination(PaloAltoParser.Srs_negate_destinationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srs_negate_source}.
	 * @param ctx the parse tree
	 */
	void enterSrs_negate_source(PaloAltoParser.Srs_negate_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srs_negate_source}.
	 * @param ctx the parse tree
	 */
	void exitSrs_negate_source(PaloAltoParser.Srs_negate_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srs_rule_type}.
	 * @param ctx the parse tree
	 */
	void enterSrs_rule_type(PaloAltoParser.Srs_rule_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srs_rule_type}.
	 * @param ctx the parse tree
	 */
	void exitSrs_rule_type(PaloAltoParser.Srs_rule_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srs_service}.
	 * @param ctx the parse tree
	 */
	void enterSrs_service(PaloAltoParser.Srs_serviceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srs_service}.
	 * @param ctx the parse tree
	 */
	void exitSrs_service(PaloAltoParser.Srs_serviceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srs_source}.
	 * @param ctx the parse tree
	 */
	void enterSrs_source(PaloAltoParser.Srs_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srs_source}.
	 * @param ctx the parse tree
	 */
	void exitSrs_source(PaloAltoParser.Srs_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srs_source_user}.
	 * @param ctx the parse tree
	 */
	void enterSrs_source_user(PaloAltoParser.Srs_source_userContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srs_source_user}.
	 * @param ctx the parse tree
	 */
	void exitSrs_source_user(PaloAltoParser.Srs_source_userContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srs_tag}.
	 * @param ctx the parse tree
	 */
	void enterSrs_tag(PaloAltoParser.Srs_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srs_tag}.
	 * @param ctx the parse tree
	 */
	void exitSrs_tag(PaloAltoParser.Srs_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srs_target}.
	 * @param ctx the parse tree
	 */
	void enterSrs_target(PaloAltoParser.Srs_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srs_target}.
	 * @param ctx the parse tree
	 */
	void exitSrs_target(PaloAltoParser.Srs_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srs_to}.
	 * @param ctx the parse tree
	 */
	void enterSrs_to(PaloAltoParser.Srs_toContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srs_to}.
	 * @param ctx the parse tree
	 */
	void exitSrs_to(PaloAltoParser.Srs_toContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sr_application_override}.
	 * @param ctx the parse tree
	 */
	void enterSr_application_override(PaloAltoParser.Sr_application_overrideContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sr_application_override}.
	 * @param ctx the parse tree
	 */
	void exitSr_application_override(PaloAltoParser.Sr_application_overrideContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sr_ao_rules}.
	 * @param ctx the parse tree
	 */
	void enterSr_ao_rules(PaloAltoParser.Sr_ao_rulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sr_ao_rules}.
	 * @param ctx the parse tree
	 */
	void exitSr_ao_rules(PaloAltoParser.Sr_ao_rulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srao_definition}.
	 * @param ctx the parse tree
	 */
	void enterSrao_definition(PaloAltoParser.Srao_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srao_definition}.
	 * @param ctx the parse tree
	 */
	void exitSrao_definition(PaloAltoParser.Srao_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srao_application}.
	 * @param ctx the parse tree
	 */
	void enterSrao_application(PaloAltoParser.Srao_applicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srao_application}.
	 * @param ctx the parse tree
	 */
	void exitSrao_application(PaloAltoParser.Srao_applicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srao_description}.
	 * @param ctx the parse tree
	 */
	void enterSrao_description(PaloAltoParser.Srao_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srao_description}.
	 * @param ctx the parse tree
	 */
	void exitSrao_description(PaloAltoParser.Srao_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srao_disabled}.
	 * @param ctx the parse tree
	 */
	void enterSrao_disabled(PaloAltoParser.Srao_disabledContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srao_disabled}.
	 * @param ctx the parse tree
	 */
	void exitSrao_disabled(PaloAltoParser.Srao_disabledContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srao_negate_destination}.
	 * @param ctx the parse tree
	 */
	void enterSrao_negate_destination(PaloAltoParser.Srao_negate_destinationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srao_negate_destination}.
	 * @param ctx the parse tree
	 */
	void exitSrao_negate_destination(PaloAltoParser.Srao_negate_destinationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srao_negate_source}.
	 * @param ctx the parse tree
	 */
	void enterSrao_negate_source(PaloAltoParser.Srao_negate_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srao_negate_source}.
	 * @param ctx the parse tree
	 */
	void exitSrao_negate_source(PaloAltoParser.Srao_negate_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srao_port}.
	 * @param ctx the parse tree
	 */
	void enterSrao_port(PaloAltoParser.Srao_portContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srao_port}.
	 * @param ctx the parse tree
	 */
	void exitSrao_port(PaloAltoParser.Srao_portContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srao_protocol}.
	 * @param ctx the parse tree
	 */
	void enterSrao_protocol(PaloAltoParser.Srao_protocolContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srao_protocol}.
	 * @param ctx the parse tree
	 */
	void exitSrao_protocol(PaloAltoParser.Srao_protocolContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srao_destination}.
	 * @param ctx the parse tree
	 */
	void enterSrao_destination(PaloAltoParser.Srao_destinationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srao_destination}.
	 * @param ctx the parse tree
	 */
	void exitSrao_destination(PaloAltoParser.Srao_destinationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srao_from}.
	 * @param ctx the parse tree
	 */
	void enterSrao_from(PaloAltoParser.Srao_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srao_from}.
	 * @param ctx the parse tree
	 */
	void exitSrao_from(PaloAltoParser.Srao_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srao_source}.
	 * @param ctx the parse tree
	 */
	void enterSrao_source(PaloAltoParser.Srao_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srao_source}.
	 * @param ctx the parse tree
	 */
	void exitSrao_source(PaloAltoParser.Srao_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srao_tag}.
	 * @param ctx the parse tree
	 */
	void enterSrao_tag(PaloAltoParser.Srao_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srao_tag}.
	 * @param ctx the parse tree
	 */
	void exitSrao_tag(PaloAltoParser.Srao_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srao_to}.
	 * @param ctx the parse tree
	 */
	void enterSrao_to(PaloAltoParser.Srao_toContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srao_to}.
	 * @param ctx the parse tree
	 */
	void exitSrao_to(PaloAltoParser.Srao_toContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sr_nat}.
	 * @param ctx the parse tree
	 */
	void enterSr_nat(PaloAltoParser.Sr_natContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sr_nat}.
	 * @param ctx the parse tree
	 */
	void exitSr_nat(PaloAltoParser.Sr_natContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sr_nat_rules}.
	 * @param ctx the parse tree
	 */
	void enterSr_nat_rules(PaloAltoParser.Sr_nat_rulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sr_nat_rules}.
	 * @param ctx the parse tree
	 */
	void exitSr_nat_rules(PaloAltoParser.Sr_nat_rulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srn_definition}.
	 * @param ctx the parse tree
	 */
	void enterSrn_definition(PaloAltoParser.Srn_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srn_definition}.
	 * @param ctx the parse tree
	 */
	void exitSrn_definition(PaloAltoParser.Srn_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srn_destination_translation}.
	 * @param ctx the parse tree
	 */
	void enterSrn_destination_translation(PaloAltoParser.Srn_destination_translationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srn_destination_translation}.
	 * @param ctx the parse tree
	 */
	void exitSrn_destination_translation(PaloAltoParser.Srn_destination_translationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srn_source_translation}.
	 * @param ctx the parse tree
	 */
	void enterSrn_source_translation(PaloAltoParser.Srn_source_translationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srn_source_translation}.
	 * @param ctx the parse tree
	 */
	void exitSrn_source_translation(PaloAltoParser.Srn_source_translationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srn_from}.
	 * @param ctx the parse tree
	 */
	void enterSrn_from(PaloAltoParser.Srn_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srn_from}.
	 * @param ctx the parse tree
	 */
	void exitSrn_from(PaloAltoParser.Srn_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srn_to}.
	 * @param ctx the parse tree
	 */
	void enterSrn_to(PaloAltoParser.Srn_toContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srn_to}.
	 * @param ctx the parse tree
	 */
	void exitSrn_to(PaloAltoParser.Srn_toContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srn_destination}.
	 * @param ctx the parse tree
	 */
	void enterSrn_destination(PaloAltoParser.Srn_destinationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srn_destination}.
	 * @param ctx the parse tree
	 */
	void exitSrn_destination(PaloAltoParser.Srn_destinationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srn_source}.
	 * @param ctx the parse tree
	 */
	void enterSrn_source(PaloAltoParser.Srn_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srn_source}.
	 * @param ctx the parse tree
	 */
	void exitSrn_source(PaloAltoParser.Srn_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srn_service}.
	 * @param ctx the parse tree
	 */
	void enterSrn_service(PaloAltoParser.Srn_serviceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srn_service}.
	 * @param ctx the parse tree
	 */
	void exitSrn_service(PaloAltoParser.Srn_serviceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srn_disabled}.
	 * @param ctx the parse tree
	 */
	void enterSrn_disabled(PaloAltoParser.Srn_disabledContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srn_disabled}.
	 * @param ctx the parse tree
	 */
	void exitSrn_disabled(PaloAltoParser.Srn_disabledContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srnst_dynamic_ip_and_port}.
	 * @param ctx the parse tree
	 */
	void enterSrnst_dynamic_ip_and_port(PaloAltoParser.Srnst_dynamic_ip_and_portContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srnst_dynamic_ip_and_port}.
	 * @param ctx the parse tree
	 */
	void exitSrnst_dynamic_ip_and_port(PaloAltoParser.Srnst_dynamic_ip_and_portContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srndt_translated_address}.
	 * @param ctx the parse tree
	 */
	void enterSrndt_translated_address(PaloAltoParser.Srndt_translated_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srndt_translated_address}.
	 * @param ctx the parse tree
	 */
	void exitSrndt_translated_address(PaloAltoParser.Srndt_translated_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srndt_translated_port}.
	 * @param ctx the parse tree
	 */
	void enterSrndt_translated_port(PaloAltoParser.Srndt_translated_portContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srndt_translated_port}.
	 * @param ctx the parse tree
	 */
	void exitSrndt_translated_port(PaloAltoParser.Srndt_translated_portContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#srnst_translated_address}.
	 * @param ctx the parse tree
	 */
	void enterSrnst_translated_address(PaloAltoParser.Srnst_translated_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#srnst_translated_address}.
	 * @param ctx the parse tree
	 */
	void exitSrnst_translated_address(PaloAltoParser.Srnst_translated_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#translated_address_list}.
	 * @param ctx the parse tree
	 */
	void enterTranslated_address_list(PaloAltoParser.Translated_address_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#translated_address_list}.
	 * @param ctx the parse tree
	 */
	void exitTranslated_address_list(PaloAltoParser.Translated_address_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#translated_address_list_item}.
	 * @param ctx the parse tree
	 */
	void enterTranslated_address_list_item(PaloAltoParser.Translated_address_list_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#translated_address_list_item}.
	 * @param ctx the parse tree
	 */
	void exitTranslated_address_list_item(PaloAltoParser.Translated_address_list_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#s_service}.
	 * @param ctx the parse tree
	 */
	void enterS_service(PaloAltoParser.S_serviceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#s_service}.
	 * @param ctx the parse tree
	 */
	void exitS_service(PaloAltoParser.S_serviceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#s_service_definition}.
	 * @param ctx the parse tree
	 */
	void enterS_service_definition(PaloAltoParser.S_service_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#s_service_definition}.
	 * @param ctx the parse tree
	 */
	void exitS_service_definition(PaloAltoParser.S_service_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sserv_description}.
	 * @param ctx the parse tree
	 */
	void enterSserv_description(PaloAltoParser.Sserv_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sserv_description}.
	 * @param ctx the parse tree
	 */
	void exitSserv_description(PaloAltoParser.Sserv_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sserv_port}.
	 * @param ctx the parse tree
	 */
	void enterSserv_port(PaloAltoParser.Sserv_portContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sserv_port}.
	 * @param ctx the parse tree
	 */
	void exitSserv_port(PaloAltoParser.Sserv_portContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sserv_protocol}.
	 * @param ctx the parse tree
	 */
	void enterSserv_protocol(PaloAltoParser.Sserv_protocolContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sserv_protocol}.
	 * @param ctx the parse tree
	 */
	void exitSserv_protocol(PaloAltoParser.Sserv_protocolContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sserv_source_port}.
	 * @param ctx the parse tree
	 */
	void enterSserv_source_port(PaloAltoParser.Sserv_source_portContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sserv_source_port}.
	 * @param ctx the parse tree
	 */
	void exitSserv_source_port(PaloAltoParser.Sserv_source_portContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sserv_tag}.
	 * @param ctx the parse tree
	 */
	void enterSserv_tag(PaloAltoParser.Sserv_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sserv_tag}.
	 * @param ctx the parse tree
	 */
	void exitSserv_tag(PaloAltoParser.Sserv_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#s_service_group}.
	 * @param ctx the parse tree
	 */
	void enterS_service_group(PaloAltoParser.S_service_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#s_service_group}.
	 * @param ctx the parse tree
	 */
	void exitS_service_group(PaloAltoParser.S_service_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#s_service_group_definition}.
	 * @param ctx the parse tree
	 */
	void enterS_service_group_definition(PaloAltoParser.S_service_group_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#s_service_group_definition}.
	 * @param ctx the parse tree
	 */
	void exitS_service_group_definition(PaloAltoParser.S_service_group_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sservgrp_members}.
	 * @param ctx the parse tree
	 */
	void enterSservgrp_members(PaloAltoParser.Sservgrp_membersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sservgrp_members}.
	 * @param ctx the parse tree
	 */
	void exitSservgrp_members(PaloAltoParser.Sservgrp_membersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#s_shared}.
	 * @param ctx the parse tree
	 */
	void enterS_shared(PaloAltoParser.S_sharedContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#s_shared}.
	 * @param ctx the parse tree
	 */
	void exitS_shared(PaloAltoParser.S_sharedContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ss_common}.
	 * @param ctx the parse tree
	 */
	void enterSs_common(PaloAltoParser.Ss_commonContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ss_common}.
	 * @param ctx the parse tree
	 */
	void exitSs_common(PaloAltoParser.Ss_commonContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#s_external_list}.
	 * @param ctx the parse tree
	 */
	void enterS_external_list(PaloAltoParser.S_external_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#s_external_list}.
	 * @param ctx the parse tree
	 */
	void exitS_external_list(PaloAltoParser.S_external_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sel_type}.
	 * @param ctx the parse tree
	 */
	void enterSel_type(PaloAltoParser.Sel_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sel_type}.
	 * @param ctx the parse tree
	 */
	void exitSel_type(PaloAltoParser.Sel_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#selt_ip}.
	 * @param ctx the parse tree
	 */
	void enterSelt_ip(PaloAltoParser.Selt_ipContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#selt_ip}.
	 * @param ctx the parse tree
	 */
	void exitSelt_ip(PaloAltoParser.Selt_ipContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#seltip_auth}.
	 * @param ctx the parse tree
	 */
	void enterSeltip_auth(PaloAltoParser.Seltip_authContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#seltip_auth}.
	 * @param ctx the parse tree
	 */
	void exitSeltip_auth(PaloAltoParser.Seltip_authContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#seltipa_username}.
	 * @param ctx the parse tree
	 */
	void enterSeltipa_username(PaloAltoParser.Seltipa_usernameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#seltipa_username}.
	 * @param ctx the parse tree
	 */
	void exitSeltipa_username(PaloAltoParser.Seltipa_usernameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#seltipa_password}.
	 * @param ctx the parse tree
	 */
	void enterSeltipa_password(PaloAltoParser.Seltipa_passwordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#seltipa_password}.
	 * @param ctx the parse tree
	 */
	void exitSeltipa_password(PaloAltoParser.Seltipa_passwordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#seltip_certificate_profile}.
	 * @param ctx the parse tree
	 */
	void enterSeltip_certificate_profile(PaloAltoParser.Seltip_certificate_profileContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#seltip_certificate_profile}.
	 * @param ctx the parse tree
	 */
	void exitSeltip_certificate_profile(PaloAltoParser.Seltip_certificate_profileContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#seltip_recurring}.
	 * @param ctx the parse tree
	 */
	void enterSeltip_recurring(PaloAltoParser.Seltip_recurringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#seltip_recurring}.
	 * @param ctx the parse tree
	 */
	void exitSeltip_recurring(PaloAltoParser.Seltip_recurringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#seltip_url}.
	 * @param ctx the parse tree
	 */
	void enterSeltip_url(PaloAltoParser.Seltip_urlContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#seltip_url}.
	 * @param ctx the parse tree
	 */
	void exitSeltip_url(PaloAltoParser.Seltip_urlContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#ss_null}.
	 * @param ctx the parse tree
	 */
	void enterSs_null(PaloAltoParser.Ss_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#ss_null}.
	 * @param ctx the parse tree
	 */
	void exitSs_null(PaloAltoParser.Ss_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#s_log_settings}.
	 * @param ctx the parse tree
	 */
	void enterS_log_settings(PaloAltoParser.S_log_settingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#s_log_settings}.
	 * @param ctx the parse tree
	 */
	void exitS_log_settings(PaloAltoParser.S_log_settingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sl_config}.
	 * @param ctx the parse tree
	 */
	void enterSl_config(PaloAltoParser.Sl_configContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sl_config}.
	 * @param ctx the parse tree
	 */
	void exitSl_config(PaloAltoParser.Sl_configContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sl_profiles}.
	 * @param ctx the parse tree
	 */
	void enterSl_profiles(PaloAltoParser.Sl_profilesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sl_profiles}.
	 * @param ctx the parse tree
	 */
	void exitSl_profiles(PaloAltoParser.Sl_profilesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sl_syslog}.
	 * @param ctx the parse tree
	 */
	void enterSl_syslog(PaloAltoParser.Sl_syslogContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sl_syslog}.
	 * @param ctx the parse tree
	 */
	void exitSl_syslog(PaloAltoParser.Sl_syslogContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sl_system}.
	 * @param ctx the parse tree
	 */
	void enterSl_system(PaloAltoParser.Sl_systemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sl_system}.
	 * @param ctx the parse tree
	 */
	void exitSl_system(PaloAltoParser.Sl_systemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sl_userid}.
	 * @param ctx the parse tree
	 */
	void enterSl_userid(PaloAltoParser.Sl_useridContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sl_userid}.
	 * @param ctx the parse tree
	 */
	void exitSl_userid(PaloAltoParser.Sl_useridContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sls_server}.
	 * @param ctx the parse tree
	 */
	void enterSls_server(PaloAltoParser.Sls_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sls_server}.
	 * @param ctx the parse tree
	 */
	void exitSls_server(PaloAltoParser.Sls_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#slss_facility}.
	 * @param ctx the parse tree
	 */
	void enterSlss_facility(PaloAltoParser.Slss_facilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#slss_facility}.
	 * @param ctx the parse tree
	 */
	void exitSlss_facility(PaloAltoParser.Slss_facilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#slss_format}.
	 * @param ctx the parse tree
	 */
	void enterSlss_format(PaloAltoParser.Slss_formatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#slss_format}.
	 * @param ctx the parse tree
	 */
	void exitSlss_format(PaloAltoParser.Slss_formatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#slss_port}.
	 * @param ctx the parse tree
	 */
	void enterSlss_port(PaloAltoParser.Slss_portContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#slss_port}.
	 * @param ctx the parse tree
	 */
	void exitSlss_port(PaloAltoParser.Slss_portContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#slss_server}.
	 * @param ctx the parse tree
	 */
	void enterSlss_server(PaloAltoParser.Slss_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#slss_server}.
	 * @param ctx the parse tree
	 */
	void exitSlss_server(PaloAltoParser.Slss_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#slss_transport}.
	 * @param ctx the parse tree
	 */
	void enterSlss_transport(PaloAltoParser.Slss_transportContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#slss_transport}.
	 * @param ctx the parse tree
	 */
	void exitSlss_transport(PaloAltoParser.Slss_transportContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#s_tag}.
	 * @param ctx the parse tree
	 */
	void enterS_tag(PaloAltoParser.S_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#s_tag}.
	 * @param ctx the parse tree
	 */
	void exitS_tag(PaloAltoParser.S_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#st_comments}.
	 * @param ctx the parse tree
	 */
	void enterSt_comments(PaloAltoParser.St_commentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#st_comments}.
	 * @param ctx the parse tree
	 */
	void exitSt_comments(PaloAltoParser.St_commentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#st_color}.
	 * @param ctx the parse tree
	 */
	void enterSt_color(PaloAltoParser.St_colorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#st_color}.
	 * @param ctx the parse tree
	 */
	void exitSt_color(PaloAltoParser.St_colorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#st_description}.
	 * @param ctx the parse tree
	 */
	void enterSt_description(PaloAltoParser.St_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#st_description}.
	 * @param ctx the parse tree
	 */
	void exitSt_description(PaloAltoParser.St_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sts_description}.
	 * @param ctx the parse tree
	 */
	void enterSts_description(PaloAltoParser.Sts_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sts_description}.
	 * @param ctx the parse tree
	 */
	void exitSts_description(PaloAltoParser.Sts_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sts_devices}.
	 * @param ctx the parse tree
	 */
	void enterSts_devices(PaloAltoParser.Sts_devicesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sts_devices}.
	 * @param ctx the parse tree
	 */
	void exitSts_devices(PaloAltoParser.Sts_devicesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sts_templates}.
	 * @param ctx the parse tree
	 */
	void enterSts_templates(PaloAltoParser.Sts_templatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sts_templates}.
	 * @param ctx the parse tree
	 */
	void exitSts_templates(PaloAltoParser.Sts_templatesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#protocol_ad}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_ad(PaloAltoParser.Protocol_adContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#protocol_ad}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_ad(PaloAltoParser.Protocol_adContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sn_virtual_router}.
	 * @param ctx the parse tree
	 */
	void enterSn_virtual_router(PaloAltoParser.Sn_virtual_routerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sn_virtual_router}.
	 * @param ctx the parse tree
	 */
	void exitSn_virtual_router(PaloAltoParser.Sn_virtual_routerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#vr_definition}.
	 * @param ctx the parse tree
	 */
	void enterVr_definition(PaloAltoParser.Vr_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#vr_definition}.
	 * @param ctx the parse tree
	 */
	void exitVr_definition(PaloAltoParser.Vr_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#vr_admin_dists}.
	 * @param ctx the parse tree
	 */
	void enterVr_admin_dists(PaloAltoParser.Vr_admin_distsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#vr_admin_dists}.
	 * @param ctx the parse tree
	 */
	void exitVr_admin_dists(PaloAltoParser.Vr_admin_distsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#vrad_ebgp}.
	 * @param ctx the parse tree
	 */
	void enterVrad_ebgp(PaloAltoParser.Vrad_ebgpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#vrad_ebgp}.
	 * @param ctx the parse tree
	 */
	void exitVrad_ebgp(PaloAltoParser.Vrad_ebgpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#vrad_ibgp}.
	 * @param ctx the parse tree
	 */
	void enterVrad_ibgp(PaloAltoParser.Vrad_ibgpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#vrad_ibgp}.
	 * @param ctx the parse tree
	 */
	void exitVrad_ibgp(PaloAltoParser.Vrad_ibgpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#vrad_ospf_int}.
	 * @param ctx the parse tree
	 */
	void enterVrad_ospf_int(PaloAltoParser.Vrad_ospf_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#vrad_ospf_int}.
	 * @param ctx the parse tree
	 */
	void exitVrad_ospf_int(PaloAltoParser.Vrad_ospf_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#vrad_ospf_ext}.
	 * @param ctx the parse tree
	 */
	void enterVrad_ospf_ext(PaloAltoParser.Vrad_ospf_extContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#vrad_ospf_ext}.
	 * @param ctx the parse tree
	 */
	void exitVrad_ospf_ext(PaloAltoParser.Vrad_ospf_extContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#vrad_ospfv3_int}.
	 * @param ctx the parse tree
	 */
	void enterVrad_ospfv3_int(PaloAltoParser.Vrad_ospfv3_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#vrad_ospfv3_int}.
	 * @param ctx the parse tree
	 */
	void exitVrad_ospfv3_int(PaloAltoParser.Vrad_ospfv3_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#vrad_ospfv3_ext}.
	 * @param ctx the parse tree
	 */
	void enterVrad_ospfv3_ext(PaloAltoParser.Vrad_ospfv3_extContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#vrad_ospfv3_ext}.
	 * @param ctx the parse tree
	 */
	void exitVrad_ospfv3_ext(PaloAltoParser.Vrad_ospfv3_extContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#vrad_rip}.
	 * @param ctx the parse tree
	 */
	void enterVrad_rip(PaloAltoParser.Vrad_ripContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#vrad_rip}.
	 * @param ctx the parse tree
	 */
	void exitVrad_rip(PaloAltoParser.Vrad_ripContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#vrad_static}.
	 * @param ctx the parse tree
	 */
	void enterVrad_static(PaloAltoParser.Vrad_staticContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#vrad_static}.
	 * @param ctx the parse tree
	 */
	void exitVrad_static(PaloAltoParser.Vrad_staticContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#vrad_static_ipv6}.
	 * @param ctx the parse tree
	 */
	void enterVrad_static_ipv6(PaloAltoParser.Vrad_static_ipv6Context ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#vrad_static_ipv6}.
	 * @param ctx the parse tree
	 */
	void exitVrad_static_ipv6(PaloAltoParser.Vrad_static_ipv6Context ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#vr_ecmp}.
	 * @param ctx the parse tree
	 */
	void enterVr_ecmp(PaloAltoParser.Vr_ecmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#vr_ecmp}.
	 * @param ctx the parse tree
	 */
	void exitVr_ecmp(PaloAltoParser.Vr_ecmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#vr_ecmp_enable}.
	 * @param ctx the parse tree
	 */
	void enterVr_ecmp_enable(PaloAltoParser.Vr_ecmp_enableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#vr_ecmp_enable}.
	 * @param ctx the parse tree
	 */
	void exitVr_ecmp_enable(PaloAltoParser.Vr_ecmp_enableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#vr_interface}.
	 * @param ctx the parse tree
	 */
	void enterVr_interface(PaloAltoParser.Vr_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#vr_interface}.
	 * @param ctx the parse tree
	 */
	void exitVr_interface(PaloAltoParser.Vr_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#vr_protocol}.
	 * @param ctx the parse tree
	 */
	void enterVr_protocol(PaloAltoParser.Vr_protocolContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#vr_protocol}.
	 * @param ctx the parse tree
	 */
	void exitVr_protocol(PaloAltoParser.Vr_protocolContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#vr_routing_table}.
	 * @param ctx the parse tree
	 */
	void enterVr_routing_table(PaloAltoParser.Vr_routing_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#vr_routing_table}.
	 * @param ctx the parse tree
	 */
	void exitVr_routing_table(PaloAltoParser.Vr_routing_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#vrrt_admin_dist}.
	 * @param ctx the parse tree
	 */
	void enterVrrt_admin_dist(PaloAltoParser.Vrrt_admin_distContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#vrrt_admin_dist}.
	 * @param ctx the parse tree
	 */
	void exitVrrt_admin_dist(PaloAltoParser.Vrrt_admin_distContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#vrrt_destination}.
	 * @param ctx the parse tree
	 */
	void enterVrrt_destination(PaloAltoParser.Vrrt_destinationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#vrrt_destination}.
	 * @param ctx the parse tree
	 */
	void exitVrrt_destination(PaloAltoParser.Vrrt_destinationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#vrrt_interface}.
	 * @param ctx the parse tree
	 */
	void enterVrrt_interface(PaloAltoParser.Vrrt_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#vrrt_interface}.
	 * @param ctx the parse tree
	 */
	void exitVrrt_interface(PaloAltoParser.Vrrt_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#vrrt_metric}.
	 * @param ctx the parse tree
	 */
	void enterVrrt_metric(PaloAltoParser.Vrrt_metricContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#vrrt_metric}.
	 * @param ctx the parse tree
	 */
	void exitVrrt_metric(PaloAltoParser.Vrrt_metricContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#vrrt_nexthop}.
	 * @param ctx the parse tree
	 */
	void enterVrrt_nexthop(PaloAltoParser.Vrrt_nexthopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#vrrt_nexthop}.
	 * @param ctx the parse tree
	 */
	void exitVrrt_nexthop(PaloAltoParser.Vrrt_nexthopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#vrrtn_ip}.
	 * @param ctx the parse tree
	 */
	void enterVrrtn_ip(PaloAltoParser.Vrrtn_ipContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#vrrtn_ip}.
	 * @param ctx the parse tree
	 */
	void exitVrrtn_ip(PaloAltoParser.Vrrtn_ipContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#vrrtn_next_vr}.
	 * @param ctx the parse tree
	 */
	void enterVrrtn_next_vr(PaloAltoParser.Vrrtn_next_vrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#vrrtn_next_vr}.
	 * @param ctx the parse tree
	 */
	void exitVrrtn_next_vr(PaloAltoParser.Vrrtn_next_vrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#redist_profile_priority}.
	 * @param ctx the parse tree
	 */
	void enterRedist_profile_priority(PaloAltoParser.Redist_profile_priorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#redist_profile_priority}.
	 * @param ctx the parse tree
	 */
	void exitRedist_profile_priority(PaloAltoParser.Redist_profile_priorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#vrp_redist_profile}.
	 * @param ctx the parse tree
	 */
	void enterVrp_redist_profile(PaloAltoParser.Vrp_redist_profileContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#vrp_redist_profile}.
	 * @param ctx the parse tree
	 */
	void exitVrp_redist_profile(PaloAltoParser.Vrp_redist_profileContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#vrprp_action}.
	 * @param ctx the parse tree
	 */
	void enterVrprp_action(PaloAltoParser.Vrprp_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#vrprp_action}.
	 * @param ctx the parse tree
	 */
	void exitVrprp_action(PaloAltoParser.Vrprp_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#vrprp_filter}.
	 * @param ctx the parse tree
	 */
	void enterVrprp_filter(PaloAltoParser.Vrprp_filterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#vrprp_filter}.
	 * @param ctx the parse tree
	 */
	void exitVrprp_filter(PaloAltoParser.Vrprp_filterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#vrprp_priority}.
	 * @param ctx the parse tree
	 */
	void enterVrprp_priority(PaloAltoParser.Vrprp_priorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#vrprp_priority}.
	 * @param ctx the parse tree
	 */
	void exitVrprp_priority(PaloAltoParser.Vrprp_priorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#vrprpf_destination}.
	 * @param ctx the parse tree
	 */
	void enterVrprpf_destination(PaloAltoParser.Vrprpf_destinationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#vrprpf_destination}.
	 * @param ctx the parse tree
	 */
	void exitVrprpf_destination(PaloAltoParser.Vrprpf_destinationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#vrprpf_type}.
	 * @param ctx the parse tree
	 */
	void enterVrprpf_type(PaloAltoParser.Vrprpf_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#vrprpf_type}.
	 * @param ctx the parse tree
	 */
	void exitVrprpf_type(PaloAltoParser.Vrprpf_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sn_virtual_wire}.
	 * @param ctx the parse tree
	 */
	void enterSn_virtual_wire(PaloAltoParser.Sn_virtual_wireContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sn_virtual_wire}.
	 * @param ctx the parse tree
	 */
	void exitSn_virtual_wire(PaloAltoParser.Sn_virtual_wireContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sn_vlan}.
	 * @param ctx the parse tree
	 */
	void enterSn_vlan(PaloAltoParser.Sn_vlanContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sn_vlan}.
	 * @param ctx the parse tree
	 */
	void exitSn_vlan(PaloAltoParser.Sn_vlanContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#s_vsys}.
	 * @param ctx the parse tree
	 */
	void enterS_vsys(PaloAltoParser.S_vsysContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#s_vsys}.
	 * @param ctx the parse tree
	 */
	void exitS_vsys(PaloAltoParser.S_vsysContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#s_vsys_definition}.
	 * @param ctx the parse tree
	 */
	void enterS_vsys_definition(PaloAltoParser.S_vsys_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#s_vsys_definition}.
	 * @param ctx the parse tree
	 */
	void exitS_vsys_definition(PaloAltoParser.S_vsys_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sv_import}.
	 * @param ctx the parse tree
	 */
	void enterSv_import(PaloAltoParser.Sv_importContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sv_import}.
	 * @param ctx the parse tree
	 */
	void exitSv_import(PaloAltoParser.Sv_importContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#svi_network}.
	 * @param ctx the parse tree
	 */
	void enterSvi_network(PaloAltoParser.Svi_networkContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#svi_network}.
	 * @param ctx the parse tree
	 */
	void exitSvi_network(PaloAltoParser.Svi_networkContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#svi_visible_vsys}.
	 * @param ctx the parse tree
	 */
	void enterSvi_visible_vsys(PaloAltoParser.Svi_visible_vsysContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#svi_visible_vsys}.
	 * @param ctx the parse tree
	 */
	void exitSvi_visible_vsys(PaloAltoParser.Svi_visible_vsysContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#svin_interface}.
	 * @param ctx the parse tree
	 */
	void enterSvin_interface(PaloAltoParser.Svin_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#svin_interface}.
	 * @param ctx the parse tree
	 */
	void exitSvin_interface(PaloAltoParser.Svin_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#s_zone}.
	 * @param ctx the parse tree
	 */
	void enterS_zone(PaloAltoParser.S_zoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#s_zone}.
	 * @param ctx the parse tree
	 */
	void exitS_zone(PaloAltoParser.S_zoneContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#s_zone_definition}.
	 * @param ctx the parse tree
	 */
	void enterS_zone_definition(PaloAltoParser.S_zone_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#s_zone_definition}.
	 * @param ctx the parse tree
	 */
	void exitS_zone_definition(PaloAltoParser.S_zone_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#sz_network}.
	 * @param ctx the parse tree
	 */
	void enterSz_network(PaloAltoParser.Sz_networkContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#sz_network}.
	 * @param ctx the parse tree
	 */
	void exitSz_network(PaloAltoParser.Sz_networkContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#szn_external}.
	 * @param ctx the parse tree
	 */
	void enterSzn_external(PaloAltoParser.Szn_externalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#szn_external}.
	 * @param ctx the parse tree
	 */
	void exitSzn_external(PaloAltoParser.Szn_externalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#szn_layer2}.
	 * @param ctx the parse tree
	 */
	void enterSzn_layer2(PaloAltoParser.Szn_layer2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#szn_layer2}.
	 * @param ctx the parse tree
	 */
	void exitSzn_layer2(PaloAltoParser.Szn_layer2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#szn_layer3}.
	 * @param ctx the parse tree
	 */
	void enterSzn_layer3(PaloAltoParser.Szn_layer3Context ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#szn_layer3}.
	 * @param ctx the parse tree
	 */
	void exitSzn_layer3(PaloAltoParser.Szn_layer3Context ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#szn_tap}.
	 * @param ctx the parse tree
	 */
	void enterSzn_tap(PaloAltoParser.Szn_tapContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#szn_tap}.
	 * @param ctx the parse tree
	 */
	void exitSzn_tap(PaloAltoParser.Szn_tapContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoParser#szn_virtual_wire}.
	 * @param ctx the parse tree
	 */
	void enterSzn_virtual_wire(PaloAltoParser.Szn_virtual_wireContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoParser#szn_virtual_wire}.
	 * @param ctx the parse tree
	 */
	void exitSzn_virtual_wire(PaloAltoParser.Szn_virtual_wireContext ctx);
}