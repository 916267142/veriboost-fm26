// Generated from org/batfish/grammar/cisco_nxos/CiscoNxosParser.g4 by ANTLR 4.7.2
package org.batfish.grammar.cisco_nxos;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CiscoNxosParser}.
 */
public interface CiscoNxosParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#cisco_nxos_configuration}.
	 * @param ctx the parse tree
	 */
	void enterCisco_nxos_configuration(CiscoNxosParser.Cisco_nxos_configurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#cisco_nxos_configuration}.
	 * @param ctx the parse tree
	 */
	void exitCisco_nxos_configuration(CiscoNxosParser.Cisco_nxos_configurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CiscoNxosParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CiscoNxosParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#s_banner}.
	 * @param ctx the parse tree
	 */
	void enterS_banner(CiscoNxosParser.S_bannerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#s_banner}.
	 * @param ctx the parse tree
	 */
	void exitS_banner(CiscoNxosParser.S_bannerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#banner_exec}.
	 * @param ctx the parse tree
	 */
	void enterBanner_exec(CiscoNxosParser.Banner_execContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#banner_exec}.
	 * @param ctx the parse tree
	 */
	void exitBanner_exec(CiscoNxosParser.Banner_execContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#banner_motd}.
	 * @param ctx the parse tree
	 */
	void enterBanner_motd(CiscoNxosParser.Banner_motdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#banner_motd}.
	 * @param ctx the parse tree
	 */
	void exitBanner_motd(CiscoNxosParser.Banner_motdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#s_boot}.
	 * @param ctx the parse tree
	 */
	void enterS_boot(CiscoNxosParser.S_bootContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#s_boot}.
	 * @param ctx the parse tree
	 */
	void exitS_boot(CiscoNxosParser.S_bootContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#boot_kickstart}.
	 * @param ctx the parse tree
	 */
	void enterBoot_kickstart(CiscoNxosParser.Boot_kickstartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#boot_kickstart}.
	 * @param ctx the parse tree
	 */
	void exitBoot_kickstart(CiscoNxosParser.Boot_kickstartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#boot_null}.
	 * @param ctx the parse tree
	 */
	void enterBoot_null(CiscoNxosParser.Boot_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#boot_null}.
	 * @param ctx the parse tree
	 */
	void exitBoot_null(CiscoNxosParser.Boot_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#boot_nxos}.
	 * @param ctx the parse tree
	 */
	void enterBoot_nxos(CiscoNxosParser.Boot_nxosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#boot_nxos}.
	 * @param ctx the parse tree
	 */
	void exitBoot_nxos(CiscoNxosParser.Boot_nxosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#boot_system}.
	 * @param ctx the parse tree
	 */
	void enterBoot_system(CiscoNxosParser.Boot_systemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#boot_system}.
	 * @param ctx the parse tree
	 */
	void exitBoot_system(CiscoNxosParser.Boot_systemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#s_control_plane}.
	 * @param ctx the parse tree
	 */
	void enterS_control_plane(CiscoNxosParser.S_control_planeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#s_control_plane}.
	 * @param ctx the parse tree
	 */
	void exitS_control_plane(CiscoNxosParser.S_control_planeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#cp_service_policy}.
	 * @param ctx the parse tree
	 */
	void enterCp_service_policy(CiscoNxosParser.Cp_service_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#cp_service_policy}.
	 * @param ctx the parse tree
	 */
	void exitCp_service_policy(CiscoNxosParser.Cp_service_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#s_hostname}.
	 * @param ctx the parse tree
	 */
	void enterS_hostname(CiscoNxosParser.S_hostnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#s_hostname}.
	 * @param ctx the parse tree
	 */
	void exitS_hostname(CiscoNxosParser.S_hostnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#s_ip}.
	 * @param ctx the parse tree
	 */
	void enterS_ip(CiscoNxosParser.S_ipContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#s_ip}.
	 * @param ctx the parse tree
	 */
	void exitS_ip(CiscoNxosParser.S_ipContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ip_domain_name}.
	 * @param ctx the parse tree
	 */
	void enterIp_domain_name(CiscoNxosParser.Ip_domain_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ip_domain_name}.
	 * @param ctx the parse tree
	 */
	void exitIp_domain_name(CiscoNxosParser.Ip_domain_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#domain_name}.
	 * @param ctx the parse tree
	 */
	void enterDomain_name(CiscoNxosParser.Domain_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#domain_name}.
	 * @param ctx the parse tree
	 */
	void exitDomain_name(CiscoNxosParser.Domain_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ip_name_server}.
	 * @param ctx the parse tree
	 */
	void enterIp_name_server(CiscoNxosParser.Ip_name_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ip_name_server}.
	 * @param ctx the parse tree
	 */
	void exitIp_name_server(CiscoNxosParser.Ip_name_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#name_server}.
	 * @param ctx the parse tree
	 */
	void enterName_server(CiscoNxosParser.Name_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#name_server}.
	 * @param ctx the parse tree
	 */
	void exitName_server(CiscoNxosParser.Name_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ip_null}.
	 * @param ctx the parse tree
	 */
	void enterIp_null(CiscoNxosParser.Ip_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ip_null}.
	 * @param ctx the parse tree
	 */
	void exitIp_null(CiscoNxosParser.Ip_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ip_pim}.
	 * @param ctx the parse tree
	 */
	void enterIp_pim(CiscoNxosParser.Ip_pimContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ip_pim}.
	 * @param ctx the parse tree
	 */
	void exitIp_pim(CiscoNxosParser.Ip_pimContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ipp_rp_address}.
	 * @param ctx the parse tree
	 */
	void enterIpp_rp_address(CiscoNxosParser.Ipp_rp_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ipp_rp_address}.
	 * @param ctx the parse tree
	 */
	void exitIpp_rp_address(CiscoNxosParser.Ipp_rp_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ipp_rp_candidate}.
	 * @param ctx the parse tree
	 */
	void enterIpp_rp_candidate(CiscoNxosParser.Ipp_rp_candidateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ipp_rp_candidate}.
	 * @param ctx the parse tree
	 */
	void exitIpp_rp_candidate(CiscoNxosParser.Ipp_rp_candidateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ip_sla}.
	 * @param ctx the parse tree
	 */
	void enterIp_sla(CiscoNxosParser.Ip_slaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ip_sla}.
	 * @param ctx the parse tree
	 */
	void exitIp_sla(CiscoNxosParser.Ip_slaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ip_sla_block}.
	 * @param ctx the parse tree
	 */
	void enterIp_sla_block(CiscoNxosParser.Ip_sla_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ip_sla_block}.
	 * @param ctx the parse tree
	 */
	void exitIp_sla_block(CiscoNxosParser.Ip_sla_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ip_sla_entry}.
	 * @param ctx the parse tree
	 */
	void enterIp_sla_entry(CiscoNxosParser.Ip_sla_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ip_sla_entry}.
	 * @param ctx the parse tree
	 */
	void exitIp_sla_entry(CiscoNxosParser.Ip_sla_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ip_sla_null}.
	 * @param ctx the parse tree
	 */
	void enterIp_sla_null(CiscoNxosParser.Ip_sla_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ip_sla_null}.
	 * @param ctx the parse tree
	 */
	void exitIp_sla_null(CiscoNxosParser.Ip_sla_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#s_ipv6}.
	 * @param ctx the parse tree
	 */
	void enterS_ipv6(CiscoNxosParser.S_ipv6Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#s_ipv6}.
	 * @param ctx the parse tree
	 */
	void exitS_ipv6(CiscoNxosParser.S_ipv6Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#s_key}.
	 * @param ctx the parse tree
	 */
	void enterS_key(CiscoNxosParser.S_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#s_key}.
	 * @param ctx the parse tree
	 */
	void exitS_key(CiscoNxosParser.S_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#key_chain}.
	 * @param ctx the parse tree
	 */
	void enterKey_chain(CiscoNxosParser.Key_chainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#key_chain}.
	 * @param ctx the parse tree
	 */
	void exitKey_chain(CiscoNxosParser.Key_chainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#kc_key}.
	 * @param ctx the parse tree
	 */
	void enterKc_key(CiscoNxosParser.Kc_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#kc_key}.
	 * @param ctx the parse tree
	 */
	void exitKc_key(CiscoNxosParser.Kc_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#kck_key_string}.
	 * @param ctx the parse tree
	 */
	void enterKck_key_string(CiscoNxosParser.Kck_key_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#kck_key_string}.
	 * @param ctx the parse tree
	 */
	void exitKck_key_string(CiscoNxosParser.Kck_key_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#key_string_text}.
	 * @param ctx the parse tree
	 */
	void enterKey_string_text(CiscoNxosParser.Key_string_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#key_string_text}.
	 * @param ctx the parse tree
	 */
	void exitKey_string_text(CiscoNxosParser.Key_string_textContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#s_null}.
	 * @param ctx the parse tree
	 */
	void enterS_null(CiscoNxosParser.S_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#s_null}.
	 * @param ctx the parse tree
	 */
	void exitS_null(CiscoNxosParser.S_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#s_no}.
	 * @param ctx the parse tree
	 */
	void enterS_no(CiscoNxosParser.S_noContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#s_no}.
	 * @param ctx the parse tree
	 */
	void exitS_no(CiscoNxosParser.S_noContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#no_null}.
	 * @param ctx the parse tree
	 */
	void enterNo_null(CiscoNxosParser.No_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#no_null}.
	 * @param ctx the parse tree
	 */
	void exitNo_null(CiscoNxosParser.No_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#no_system}.
	 * @param ctx the parse tree
	 */
	void enterNo_system(CiscoNxosParser.No_systemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#no_system}.
	 * @param ctx the parse tree
	 */
	void exitNo_system(CiscoNxosParser.No_systemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#no_sys_default}.
	 * @param ctx the parse tree
	 */
	void enterNo_sys_default(CiscoNxosParser.No_sys_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#no_sys_default}.
	 * @param ctx the parse tree
	 */
	void exitNo_sys_default(CiscoNxosParser.No_sys_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#no_sys_null}.
	 * @param ctx the parse tree
	 */
	void enterNo_sys_null(CiscoNxosParser.No_sys_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#no_sys_null}.
	 * @param ctx the parse tree
	 */
	void exitNo_sys_null(CiscoNxosParser.No_sys_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#no_sysd_switchport}.
	 * @param ctx the parse tree
	 */
	void enterNo_sysd_switchport(CiscoNxosParser.No_sysd_switchportContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#no_sysd_switchport}.
	 * @param ctx the parse tree
	 */
	void exitNo_sysd_switchport(CiscoNxosParser.No_sysd_switchportContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#no_sysds_shutdown}.
	 * @param ctx the parse tree
	 */
	void enterNo_sysds_shutdown(CiscoNxosParser.No_sysds_shutdownContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#no_sysds_shutdown}.
	 * @param ctx the parse tree
	 */
	void exitNo_sysds_shutdown(CiscoNxosParser.No_sysds_shutdownContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#no_sysds_switchport}.
	 * @param ctx the parse tree
	 */
	void enterNo_sysds_switchport(CiscoNxosParser.No_sysds_switchportContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#no_sysds_switchport}.
	 * @param ctx the parse tree
	 */
	void exitNo_sysds_switchport(CiscoNxosParser.No_sysds_switchportContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#s_nv}.
	 * @param ctx the parse tree
	 */
	void enterS_nv(CiscoNxosParser.S_nvContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#s_nv}.
	 * @param ctx the parse tree
	 */
	void exitS_nv(CiscoNxosParser.S_nvContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#s_role}.
	 * @param ctx the parse tree
	 */
	void enterS_role(CiscoNxosParser.S_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#s_role}.
	 * @param ctx the parse tree
	 */
	void exitS_role(CiscoNxosParser.S_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#role_name}.
	 * @param ctx the parse tree
	 */
	void enterRole_name(CiscoNxosParser.Role_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#role_name}.
	 * @param ctx the parse tree
	 */
	void exitRole_name(CiscoNxosParser.Role_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#role_null}.
	 * @param ctx the parse tree
	 */
	void enterRole_null(CiscoNxosParser.Role_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#role_null}.
	 * @param ctx the parse tree
	 */
	void exitRole_null(CiscoNxosParser.Role_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#s_router}.
	 * @param ctx the parse tree
	 */
	void enterS_router(CiscoNxosParser.S_routerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#s_router}.
	 * @param ctx the parse tree
	 */
	void exitS_router(CiscoNxosParser.S_routerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#s_system}.
	 * @param ctx the parse tree
	 */
	void enterS_system(CiscoNxosParser.S_systemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#s_system}.
	 * @param ctx the parse tree
	 */
	void exitS_system(CiscoNxosParser.S_systemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#sys_default}.
	 * @param ctx the parse tree
	 */
	void enterSys_default(CiscoNxosParser.Sys_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#sys_default}.
	 * @param ctx the parse tree
	 */
	void exitSys_default(CiscoNxosParser.Sys_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#sysd_switchport}.
	 * @param ctx the parse tree
	 */
	void enterSysd_switchport(CiscoNxosParser.Sysd_switchportContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#sysd_switchport}.
	 * @param ctx the parse tree
	 */
	void exitSysd_switchport(CiscoNxosParser.Sysd_switchportContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#sysds_shutdown}.
	 * @param ctx the parse tree
	 */
	void enterSysds_shutdown(CiscoNxosParser.Sysds_shutdownContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#sysds_shutdown}.
	 * @param ctx the parse tree
	 */
	void exitSysds_shutdown(CiscoNxosParser.Sysds_shutdownContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#sysds_switchport}.
	 * @param ctx the parse tree
	 */
	void enterSysds_switchport(CiscoNxosParser.Sysds_switchportContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#sysds_switchport}.
	 * @param ctx the parse tree
	 */
	void exitSysds_switchport(CiscoNxosParser.Sysds_switchportContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#sys_qos}.
	 * @param ctx the parse tree
	 */
	void enterSys_qos(CiscoNxosParser.Sys_qosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#sys_qos}.
	 * @param ctx the parse tree
	 */
	void exitSys_qos(CiscoNxosParser.Sys_qosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#sysqos_null}.
	 * @param ctx the parse tree
	 */
	void enterSysqos_null(CiscoNxosParser.Sysqos_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#sysqos_null}.
	 * @param ctx the parse tree
	 */
	void exitSysqos_null(CiscoNxosParser.Sysqos_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#sysqos_service_policy}.
	 * @param ctx the parse tree
	 */
	void enterSysqos_service_policy(CiscoNxosParser.Sysqos_service_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#sysqos_service_policy}.
	 * @param ctx the parse tree
	 */
	void exitSysqos_service_policy(CiscoNxosParser.Sysqos_service_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#sysqosspt_network_qos}.
	 * @param ctx the parse tree
	 */
	void enterSysqosspt_network_qos(CiscoNxosParser.Sysqosspt_network_qosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#sysqosspt_network_qos}.
	 * @param ctx the parse tree
	 */
	void exitSysqosspt_network_qos(CiscoNxosParser.Sysqosspt_network_qosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#sysqosspt_qos}.
	 * @param ctx the parse tree
	 */
	void enterSysqosspt_qos(CiscoNxosParser.Sysqosspt_qosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#sysqosspt_qos}.
	 * @param ctx the parse tree
	 */
	void exitSysqosspt_qos(CiscoNxosParser.Sysqosspt_qosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#sysqosspt_queueing}.
	 * @param ctx the parse tree
	 */
	void enterSysqosspt_queueing(CiscoNxosParser.Sysqosspt_queueingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#sysqosspt_queueing}.
	 * @param ctx the parse tree
	 */
	void exitSysqosspt_queueing(CiscoNxosParser.Sysqosspt_queueingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#s_track}.
	 * @param ctx the parse tree
	 */
	void enterS_track(CiscoNxosParser.S_trackContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#s_track}.
	 * @param ctx the parse tree
	 */
	void exitS_track(CiscoNxosParser.S_trackContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#track_interface}.
	 * @param ctx the parse tree
	 */
	void enterTrack_interface(CiscoNxosParser.Track_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#track_interface}.
	 * @param ctx the parse tree
	 */
	void exitTrack_interface(CiscoNxosParser.Track_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#track_ip}.
	 * @param ctx the parse tree
	 */
	void enterTrack_ip(CiscoNxosParser.Track_ipContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#track_ip}.
	 * @param ctx the parse tree
	 */
	void exitTrack_ip(CiscoNxosParser.Track_ipContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#track_ip_route}.
	 * @param ctx the parse tree
	 */
	void enterTrack_ip_route(CiscoNxosParser.Track_ip_routeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#track_ip_route}.
	 * @param ctx the parse tree
	 */
	void exitTrack_ip_route(CiscoNxosParser.Track_ip_routeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#tir_vrf}.
	 * @param ctx the parse tree
	 */
	void enterTir_vrf(CiscoNxosParser.Tir_vrfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#tir_vrf}.
	 * @param ctx the parse tree
	 */
	void exitTir_vrf(CiscoNxosParser.Tir_vrfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#track_ip_sla}.
	 * @param ctx the parse tree
	 */
	void enterTrack_ip_sla(CiscoNxosParser.Track_ip_slaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#track_ip_sla}.
	 * @param ctx the parse tree
	 */
	void exitTrack_ip_sla(CiscoNxosParser.Track_ip_slaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#s_version}.
	 * @param ctx the parse tree
	 */
	void enterS_version(CiscoNxosParser.S_versionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#s_version}.
	 * @param ctx the parse tree
	 */
	void exitS_version(CiscoNxosParser.S_versionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#bgp_asn}.
	 * @param ctx the parse tree
	 */
	void enterBgp_asn(CiscoNxosParser.Bgp_asnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#bgp_asn}.
	 * @param ctx the parse tree
	 */
	void exitBgp_asn(CiscoNxosParser.Bgp_asnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#bgp_asn_simple}.
	 * @param ctx the parse tree
	 */
	void enterBgp_asn_simple(CiscoNxosParser.Bgp_asn_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#bgp_asn_simple}.
	 * @param ctx the parse tree
	 */
	void exitBgp_asn_simple(CiscoNxosParser.Bgp_asn_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#bgp_asn_range}.
	 * @param ctx the parse tree
	 */
	void enterBgp_asn_range(CiscoNxosParser.Bgp_asn_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#bgp_asn_range}.
	 * @param ctx the parse tree
	 */
	void exitBgp_asn_range(CiscoNxosParser.Bgp_asn_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#bgp_asn_interval}.
	 * @param ctx the parse tree
	 */
	void enterBgp_asn_interval(CiscoNxosParser.Bgp_asn_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#bgp_asn_interval}.
	 * @param ctx the parse tree
	 */
	void exitBgp_asn_interval(CiscoNxosParser.Bgp_asn_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#both_export_import}.
	 * @param ctx the parse tree
	 */
	void enterBoth_export_import(CiscoNxosParser.Both_export_importContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#both_export_import}.
	 * @param ctx the parse tree
	 */
	void exitBoth_export_import(CiscoNxosParser.Both_export_importContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#cisco_nxos_password}.
	 * @param ctx the parse tree
	 */
	void enterCisco_nxos_password(CiscoNxosParser.Cisco_nxos_passwordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#cisco_nxos_password}.
	 * @param ctx the parse tree
	 */
	void exitCisco_nxos_password(CiscoNxosParser.Cisco_nxos_passwordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#class_map_cp_name}.
	 * @param ctx the parse tree
	 */
	void enterClass_map_cp_name(CiscoNxosParser.Class_map_cp_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#class_map_cp_name}.
	 * @param ctx the parse tree
	 */
	void exitClass_map_cp_name(CiscoNxosParser.Class_map_cp_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#class_map_network_qos_name}.
	 * @param ctx the parse tree
	 */
	void enterClass_map_network_qos_name(CiscoNxosParser.Class_map_network_qos_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#class_map_network_qos_name}.
	 * @param ctx the parse tree
	 */
	void exitClass_map_network_qos_name(CiscoNxosParser.Class_map_network_qos_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#class_map_qos_name}.
	 * @param ctx the parse tree
	 */
	void enterClass_map_qos_name(CiscoNxosParser.Class_map_qos_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#class_map_qos_name}.
	 * @param ctx the parse tree
	 */
	void exitClass_map_qos_name(CiscoNxosParser.Class_map_qos_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#class_map_queuing_name}.
	 * @param ctx the parse tree
	 */
	void enterClass_map_queuing_name(CiscoNxosParser.Class_map_queuing_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#class_map_queuing_name}.
	 * @param ctx the parse tree
	 */
	void exitClass_map_queuing_name(CiscoNxosParser.Class_map_queuing_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#double_quoted_string}.
	 * @param ctx the parse tree
	 */
	void enterDouble_quoted_string(CiscoNxosParser.Double_quoted_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#double_quoted_string}.
	 * @param ctx the parse tree
	 */
	void exitDouble_quoted_string(CiscoNxosParser.Double_quoted_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#fex_id}.
	 * @param ctx the parse tree
	 */
	void enterFex_id(CiscoNxosParser.Fex_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#fex_id}.
	 * @param ctx the parse tree
	 */
	void exitFex_id(CiscoNxosParser.Fex_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#generic_access_list_name}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_access_list_name(CiscoNxosParser.Generic_access_list_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#generic_access_list_name}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_access_list_name(CiscoNxosParser.Generic_access_list_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#group_name}.
	 * @param ctx the parse tree
	 */
	void enterGroup_name(CiscoNxosParser.Group_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#group_name}.
	 * @param ctx the parse tree
	 */
	void exitGroup_name(CiscoNxosParser.Group_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#hex_uint32}.
	 * @param ctx the parse tree
	 */
	void enterHex_uint32(CiscoNxosParser.Hex_uint32Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#hex_uint32}.
	 * @param ctx the parse tree
	 */
	void exitHex_uint32(CiscoNxosParser.Hex_uint32Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#hsrp_name}.
	 * @param ctx the parse tree
	 */
	void enterHsrp_name(CiscoNxosParser.Hsrp_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#hsrp_name}.
	 * @param ctx the parse tree
	 */
	void exitHsrp_name(CiscoNxosParser.Hsrp_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#interface_address}.
	 * @param ctx the parse tree
	 */
	void enterInterface_address(CiscoNxosParser.Interface_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#interface_address}.
	 * @param ctx the parse tree
	 */
	void exitInterface_address(CiscoNxosParser.Interface_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#interface_ipv6_address}.
	 * @param ctx the parse tree
	 */
	void enterInterface_ipv6_address(CiscoNxosParser.Interface_ipv6_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#interface_ipv6_address}.
	 * @param ctx the parse tree
	 */
	void exitInterface_ipv6_address(CiscoNxosParser.Interface_ipv6_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#interface_name}.
	 * @param ctx the parse tree
	 */
	void enterInterface_name(CiscoNxosParser.Interface_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#interface_name}.
	 * @param ctx the parse tree
	 */
	void exitInterface_name(CiscoNxosParser.Interface_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#interface_prefix}.
	 * @param ctx the parse tree
	 */
	void enterInterface_prefix(CiscoNxosParser.Interface_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#interface_prefix}.
	 * @param ctx the parse tree
	 */
	void exitInterface_prefix(CiscoNxosParser.Interface_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#interface_middle}.
	 * @param ctx the parse tree
	 */
	void enterInterface_middle(CiscoNxosParser.Interface_middleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#interface_middle}.
	 * @param ctx the parse tree
	 */
	void exitInterface_middle(CiscoNxosParser.Interface_middleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#interface_parent_suffix}.
	 * @param ctx the parse tree
	 */
	void enterInterface_parent_suffix(CiscoNxosParser.Interface_parent_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#interface_parent_suffix}.
	 * @param ctx the parse tree
	 */
	void exitInterface_parent_suffix(CiscoNxosParser.Interface_parent_suffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ip_access_list_name}.
	 * @param ctx the parse tree
	 */
	void enterIp_access_list_name(CiscoNxosParser.Ip_access_list_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ip_access_list_name}.
	 * @param ctx the parse tree
	 */
	void exitIp_access_list_name(CiscoNxosParser.Ip_access_list_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ip_address}.
	 * @param ctx the parse tree
	 */
	void enterIp_address(CiscoNxosParser.Ip_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ip_address}.
	 * @param ctx the parse tree
	 */
	void exitIp_address(CiscoNxosParser.Ip_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ip_as_path_access_list_name}.
	 * @param ctx the parse tree
	 */
	void enterIp_as_path_access_list_name(CiscoNxosParser.Ip_as_path_access_list_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ip_as_path_access_list_name}.
	 * @param ctx the parse tree
	 */
	void exitIp_as_path_access_list_name(CiscoNxosParser.Ip_as_path_access_list_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ip_community_list_name}.
	 * @param ctx the parse tree
	 */
	void enterIp_community_list_name(CiscoNxosParser.Ip_community_list_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ip_community_list_name}.
	 * @param ctx the parse tree
	 */
	void exitIp_community_list_name(CiscoNxosParser.Ip_community_list_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ip_prefix}.
	 * @param ctx the parse tree
	 */
	void enterIp_prefix(CiscoNxosParser.Ip_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ip_prefix}.
	 * @param ctx the parse tree
	 */
	void exitIp_prefix(CiscoNxosParser.Ip_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ip_prefix_list_description}.
	 * @param ctx the parse tree
	 */
	void enterIp_prefix_list_description(CiscoNxosParser.Ip_prefix_list_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ip_prefix_list_description}.
	 * @param ctx the parse tree
	 */
	void exitIp_prefix_list_description(CiscoNxosParser.Ip_prefix_list_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ip_prefix_list_name}.
	 * @param ctx the parse tree
	 */
	void enterIp_prefix_list_name(CiscoNxosParser.Ip_prefix_list_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ip_prefix_list_name}.
	 * @param ctx the parse tree
	 */
	void exitIp_prefix_list_name(CiscoNxosParser.Ip_prefix_list_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ip_prefix_list_line_number}.
	 * @param ctx the parse tree
	 */
	void enterIp_prefix_list_line_number(CiscoNxosParser.Ip_prefix_list_line_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ip_prefix_list_line_number}.
	 * @param ctx the parse tree
	 */
	void exitIp_prefix_list_line_number(CiscoNxosParser.Ip_prefix_list_line_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ipv6_address}.
	 * @param ctx the parse tree
	 */
	void enterIpv6_address(CiscoNxosParser.Ipv6_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ipv6_address}.
	 * @param ctx the parse tree
	 */
	void exitIpv6_address(CiscoNxosParser.Ipv6_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ipv6_prefix}.
	 * @param ctx the parse tree
	 */
	void enterIpv6_prefix(CiscoNxosParser.Ipv6_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ipv6_prefix}.
	 * @param ctx the parse tree
	 */
	void exitIpv6_prefix(CiscoNxosParser.Ipv6_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#key_chain_name}.
	 * @param ctx the parse tree
	 */
	void enterKey_chain_name(CiscoNxosParser.Key_chain_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#key_chain_name}.
	 * @param ctx the parse tree
	 */
	void exitKey_chain_name(CiscoNxosParser.Key_chain_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#line_action}.
	 * @param ctx the parse tree
	 */
	void enterLine_action(CiscoNxosParser.Line_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#line_action}.
	 * @param ctx the parse tree
	 */
	void exitLine_action(CiscoNxosParser.Line_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#literal_standard_community}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_standard_community(CiscoNxosParser.Literal_standard_communityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#literal_standard_community}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_standard_community(CiscoNxosParser.Literal_standard_communityContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#mac_access_list_name}.
	 * @param ctx the parse tree
	 */
	void enterMac_access_list_name(CiscoNxosParser.Mac_access_list_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#mac_access_list_name}.
	 * @param ctx the parse tree
	 */
	void exitMac_access_list_name(CiscoNxosParser.Mac_access_list_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#mac_address_literal}.
	 * @param ctx the parse tree
	 */
	void enterMac_address_literal(CiscoNxosParser.Mac_address_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#mac_address_literal}.
	 * @param ctx the parse tree
	 */
	void exitMac_address_literal(CiscoNxosParser.Mac_address_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#maximum_paths}.
	 * @param ctx the parse tree
	 */
	void enterMaximum_paths(CiscoNxosParser.Maximum_pathsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#maximum_paths}.
	 * @param ctx the parse tree
	 */
	void exitMaximum_paths(CiscoNxosParser.Maximum_pathsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#md5_string}.
	 * @param ctx the parse tree
	 */
	void enterMd5_string(CiscoNxosParser.Md5_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#md5_string}.
	 * @param ctx the parse tree
	 */
	void exitMd5_string(CiscoNxosParser.Md5_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#monitor_session_id}.
	 * @param ctx the parse tree
	 */
	void enterMonitor_session_id(CiscoNxosParser.Monitor_session_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#monitor_session_id}.
	 * @param ctx the parse tree
	 */
	void exitMonitor_session_id(CiscoNxosParser.Monitor_session_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#null_rest_of_line}.
	 * @param ctx the parse tree
	 */
	void enterNull_rest_of_line(CiscoNxosParser.Null_rest_of_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#null_rest_of_line}.
	 * @param ctx the parse tree
	 */
	void exitNull_rest_of_line(CiscoNxosParser.Null_rest_of_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#nve_interface_name}.
	 * @param ctx the parse tree
	 */
	void enterNve_interface_name(CiscoNxosParser.Nve_interface_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#nve_interface_name}.
	 * @param ctx the parse tree
	 */
	void exitNve_interface_name(CiscoNxosParser.Nve_interface_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ospf_area_default_cost}.
	 * @param ctx the parse tree
	 */
	void enterOspf_area_default_cost(CiscoNxosParser.Ospf_area_default_costContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ospf_area_default_cost}.
	 * @param ctx the parse tree
	 */
	void exitOspf_area_default_cost(CiscoNxosParser.Ospf_area_default_costContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ospf_area_id}.
	 * @param ctx the parse tree
	 */
	void enterOspf_area_id(CiscoNxosParser.Ospf_area_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ospf_area_id}.
	 * @param ctx the parse tree
	 */
	void exitOspf_area_id(CiscoNxosParser.Ospf_area_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ospf_area_range_cost}.
	 * @param ctx the parse tree
	 */
	void enterOspf_area_range_cost(CiscoNxosParser.Ospf_area_range_costContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ospf_area_range_cost}.
	 * @param ctx the parse tree
	 */
	void exitOspf_area_range_cost(CiscoNxosParser.Ospf_area_range_costContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ospf_max_metric_external_lsa}.
	 * @param ctx the parse tree
	 */
	void enterOspf_max_metric_external_lsa(CiscoNxosParser.Ospf_max_metric_external_lsaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ospf_max_metric_external_lsa}.
	 * @param ctx the parse tree
	 */
	void exitOspf_max_metric_external_lsa(CiscoNxosParser.Ospf_max_metric_external_lsaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ospf_on_startup_wait_period}.
	 * @param ctx the parse tree
	 */
	void enterOspf_on_startup_wait_period(CiscoNxosParser.Ospf_on_startup_wait_periodContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ospf_on_startup_wait_period}.
	 * @param ctx the parse tree
	 */
	void exitOspf_on_startup_wait_period(CiscoNxosParser.Ospf_on_startup_wait_periodContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ospf_priority}.
	 * @param ctx the parse tree
	 */
	void enterOspf_priority(CiscoNxosParser.Ospf_priorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ospf_priority}.
	 * @param ctx the parse tree
	 */
	void exitOspf_priority(CiscoNxosParser.Ospf_priorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ospf_ref_bw_gbps}.
	 * @param ctx the parse tree
	 */
	void enterOspf_ref_bw_gbps(CiscoNxosParser.Ospf_ref_bw_gbpsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ospf_ref_bw_gbps}.
	 * @param ctx the parse tree
	 */
	void exitOspf_ref_bw_gbps(CiscoNxosParser.Ospf_ref_bw_gbpsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ospf_ref_bw_mbps}.
	 * @param ctx the parse tree
	 */
	void enterOspf_ref_bw_mbps(CiscoNxosParser.Ospf_ref_bw_mbpsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ospf_ref_bw_mbps}.
	 * @param ctx the parse tree
	 */
	void exitOspf_ref_bw_mbps(CiscoNxosParser.Ospf_ref_bw_mbpsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#policy_map_cp_name}.
	 * @param ctx the parse tree
	 */
	void enterPolicy_map_cp_name(CiscoNxosParser.Policy_map_cp_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#policy_map_cp_name}.
	 * @param ctx the parse tree
	 */
	void exitPolicy_map_cp_name(CiscoNxosParser.Policy_map_cp_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#policy_map_network_qos_name}.
	 * @param ctx the parse tree
	 */
	void enterPolicy_map_network_qos_name(CiscoNxosParser.Policy_map_network_qos_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#policy_map_network_qos_name}.
	 * @param ctx the parse tree
	 */
	void exitPolicy_map_network_qos_name(CiscoNxosParser.Policy_map_network_qos_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#policy_map_qos_name}.
	 * @param ctx the parse tree
	 */
	void enterPolicy_map_qos_name(CiscoNxosParser.Policy_map_qos_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#policy_map_qos_name}.
	 * @param ctx the parse tree
	 */
	void exitPolicy_map_qos_name(CiscoNxosParser.Policy_map_qos_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#policy_map_queuing_name}.
	 * @param ctx the parse tree
	 */
	void enterPolicy_map_queuing_name(CiscoNxosParser.Policy_map_queuing_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#policy_map_queuing_name}.
	 * @param ctx the parse tree
	 */
	void exitPolicy_map_queuing_name(CiscoNxosParser.Policy_map_queuing_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#qos_group}.
	 * @param ctx the parse tree
	 */
	void enterQos_group(CiscoNxosParser.Qos_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#qos_group}.
	 * @param ctx the parse tree
	 */
	void exitQos_group(CiscoNxosParser.Qos_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#quoted_text}.
	 * @param ctx the parse tree
	 */
	void enterQuoted_text(CiscoNxosParser.Quoted_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#quoted_text}.
	 * @param ctx the parse tree
	 */
	void exitQuoted_text(CiscoNxosParser.Quoted_textContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#route_distinguisher}.
	 * @param ctx the parse tree
	 */
	void enterRoute_distinguisher(CiscoNxosParser.Route_distinguisherContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#route_distinguisher}.
	 * @param ctx the parse tree
	 */
	void exitRoute_distinguisher(CiscoNxosParser.Route_distinguisherContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#route_distinguisher_or_auto}.
	 * @param ctx the parse tree
	 */
	void enterRoute_distinguisher_or_auto(CiscoNxosParser.Route_distinguisher_or_autoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#route_distinguisher_or_auto}.
	 * @param ctx the parse tree
	 */
	void exitRoute_distinguisher_or_auto(CiscoNxosParser.Route_distinguisher_or_autoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#route_map_name}.
	 * @param ctx the parse tree
	 */
	void enterRoute_map_name(CiscoNxosParser.Route_map_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#route_map_name}.
	 * @param ctx the parse tree
	 */
	void exitRoute_map_name(CiscoNxosParser.Route_map_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#route_network}.
	 * @param ctx the parse tree
	 */
	void enterRoute_network(CiscoNxosParser.Route_networkContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#route_network}.
	 * @param ctx the parse tree
	 */
	void exitRoute_network(CiscoNxosParser.Route_networkContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#router_eigrp_process_tag}.
	 * @param ctx the parse tree
	 */
	void enterRouter_eigrp_process_tag(CiscoNxosParser.Router_eigrp_process_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#router_eigrp_process_tag}.
	 * @param ctx the parse tree
	 */
	void exitRouter_eigrp_process_tag(CiscoNxosParser.Router_eigrp_process_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#router_isis_process_tag}.
	 * @param ctx the parse tree
	 */
	void enterRouter_isis_process_tag(CiscoNxosParser.Router_isis_process_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#router_isis_process_tag}.
	 * @param ctx the parse tree
	 */
	void exitRouter_isis_process_tag(CiscoNxosParser.Router_isis_process_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#router_ospf_name}.
	 * @param ctx the parse tree
	 */
	void enterRouter_ospf_name(CiscoNxosParser.Router_ospf_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#router_ospf_name}.
	 * @param ctx the parse tree
	 */
	void exitRouter_ospf_name(CiscoNxosParser.Router_ospf_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#router_ospfv3_name}.
	 * @param ctx the parse tree
	 */
	void enterRouter_ospfv3_name(CiscoNxosParser.Router_ospfv3_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#router_ospfv3_name}.
	 * @param ctx the parse tree
	 */
	void exitRouter_ospfv3_name(CiscoNxosParser.Router_ospfv3_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#router_rip_process_id}.
	 * @param ctx the parse tree
	 */
	void enterRouter_rip_process_id(CiscoNxosParser.Router_rip_process_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#router_rip_process_id}.
	 * @param ctx the parse tree
	 */
	void exitRouter_rip_process_id(CiscoNxosParser.Router_rip_process_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#bgp_instance}.
	 * @param ctx the parse tree
	 */
	void enterBgp_instance(CiscoNxosParser.Bgp_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#bgp_instance}.
	 * @param ctx the parse tree
	 */
	void exitBgp_instance(CiscoNxosParser.Bgp_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#eigrp_instance}.
	 * @param ctx the parse tree
	 */
	void enterEigrp_instance(CiscoNxosParser.Eigrp_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#eigrp_instance}.
	 * @param ctx the parse tree
	 */
	void exitEigrp_instance(CiscoNxosParser.Eigrp_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#isis_instance}.
	 * @param ctx the parse tree
	 */
	void enterIsis_instance(CiscoNxosParser.Isis_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#isis_instance}.
	 * @param ctx the parse tree
	 */
	void exitIsis_instance(CiscoNxosParser.Isis_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ospf_instance}.
	 * @param ctx the parse tree
	 */
	void enterOspf_instance(CiscoNxosParser.Ospf_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ospf_instance}.
	 * @param ctx the parse tree
	 */
	void exitOspf_instance(CiscoNxosParser.Ospf_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ospfv3_instance}.
	 * @param ctx the parse tree
	 */
	void enterOspfv3_instance(CiscoNxosParser.Ospfv3_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ospfv3_instance}.
	 * @param ctx the parse tree
	 */
	void exitOspfv3_instance(CiscoNxosParser.Ospfv3_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#protocol_distance}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_distance(CiscoNxosParser.Protocol_distanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#protocol_distance}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_distance(CiscoNxosParser.Protocol_distanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rip_instance}.
	 * @param ctx the parse tree
	 */
	void enterRip_instance(CiscoNxosParser.Rip_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rip_instance}.
	 * @param ctx the parse tree
	 */
	void exitRip_instance(CiscoNxosParser.Rip_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#routing_instance_v4}.
	 * @param ctx the parse tree
	 */
	void enterRouting_instance_v4(CiscoNxosParser.Routing_instance_v4Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#routing_instance_v4}.
	 * @param ctx the parse tree
	 */
	void exitRouting_instance_v4(CiscoNxosParser.Routing_instance_v4Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#routing_instance_v6}.
	 * @param ctx the parse tree
	 */
	void enterRouting_instance_v6(CiscoNxosParser.Routing_instance_v6Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#routing_instance_v6}.
	 * @param ctx the parse tree
	 */
	void exitRouting_instance_v6(CiscoNxosParser.Routing_instance_v6Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#route_target}.
	 * @param ctx the parse tree
	 */
	void enterRoute_target(CiscoNxosParser.Route_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#route_target}.
	 * @param ctx the parse tree
	 */
	void exitRoute_target(CiscoNxosParser.Route_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#route_target_or_auto}.
	 * @param ctx the parse tree
	 */
	void enterRoute_target_or_auto(CiscoNxosParser.Route_target_or_autoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#route_target_or_auto}.
	 * @param ctx the parse tree
	 */
	void exitRoute_target_or_auto(CiscoNxosParser.Route_target_or_autoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#standard_community}.
	 * @param ctx the parse tree
	 */
	void enterStandard_community(CiscoNxosParser.Standard_communityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#standard_community}.
	 * @param ctx the parse tree
	 */
	void exitStandard_community(CiscoNxosParser.Standard_communityContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#subdomain_name}.
	 * @param ctx the parse tree
	 */
	void enterSubdomain_name(CiscoNxosParser.Subdomain_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#subdomain_name}.
	 * @param ctx the parse tree
	 */
	void exitSubdomain_name(CiscoNxosParser.Subdomain_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#subnet_mask}.
	 * @param ctx the parse tree
	 */
	void enterSubnet_mask(CiscoNxosParser.Subnet_maskContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#subnet_mask}.
	 * @param ctx the parse tree
	 */
	void exitSubnet_mask(CiscoNxosParser.Subnet_maskContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#tcp_port_number}.
	 * @param ctx the parse tree
	 */
	void enterTcp_port_number(CiscoNxosParser.Tcp_port_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#tcp_port_number}.
	 * @param ctx the parse tree
	 */
	void exitTcp_port_number(CiscoNxosParser.Tcp_port_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#template_name}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_name(CiscoNxosParser.Template_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#template_name}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_name(CiscoNxosParser.Template_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#track_object_number}.
	 * @param ctx the parse tree
	 */
	void enterTrack_object_number(CiscoNxosParser.Track_object_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#track_object_number}.
	 * @param ctx the parse tree
	 */
	void exitTrack_object_number(CiscoNxosParser.Track_object_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#uint8}.
	 * @param ctx the parse tree
	 */
	void enterUint8(CiscoNxosParser.Uint8Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#uint8}.
	 * @param ctx the parse tree
	 */
	void exitUint8(CiscoNxosParser.Uint8Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#uint16}.
	 * @param ctx the parse tree
	 */
	void enterUint16(CiscoNxosParser.Uint16Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#uint16}.
	 * @param ctx the parse tree
	 */
	void exitUint16(CiscoNxosParser.Uint16Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#uint32}.
	 * @param ctx the parse tree
	 */
	void enterUint32(CiscoNxosParser.Uint32Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#uint32}.
	 * @param ctx the parse tree
	 */
	void exitUint32(CiscoNxosParser.Uint32Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#uint8_range_set}.
	 * @param ctx the parse tree
	 */
	void enterUint8_range_set(CiscoNxosParser.Uint8_range_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#uint8_range_set}.
	 * @param ctx the parse tree
	 */
	void exitUint8_range_set(CiscoNxosParser.Uint8_range_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#uint8_range}.
	 * @param ctx the parse tree
	 */
	void enterUint8_range(CiscoNxosParser.Uint8_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#uint8_range}.
	 * @param ctx the parse tree
	 */
	void exitUint8_range(CiscoNxosParser.Uint8_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#user_name}.
	 * @param ctx the parse tree
	 */
	void enterUser_name(CiscoNxosParser.User_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#user_name}.
	 * @param ctx the parse tree
	 */
	void exitUser_name(CiscoNxosParser.User_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#user_password}.
	 * @param ctx the parse tree
	 */
	void enterUser_password(CiscoNxosParser.User_passwordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#user_password}.
	 * @param ctx the parse tree
	 */
	void exitUser_password(CiscoNxosParser.User_passwordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#unreserved_vlan_id}.
	 * @param ctx the parse tree
	 */
	void enterUnreserved_vlan_id(CiscoNxosParser.Unreserved_vlan_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#unreserved_vlan_id}.
	 * @param ctx the parse tree
	 */
	void exitUnreserved_vlan_id(CiscoNxosParser.Unreserved_vlan_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#unreserved_vlan_id_range}.
	 * @param ctx the parse tree
	 */
	void enterUnreserved_vlan_id_range(CiscoNxosParser.Unreserved_vlan_id_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#unreserved_vlan_id_range}.
	 * @param ctx the parse tree
	 */
	void exitUnreserved_vlan_id_range(CiscoNxosParser.Unreserved_vlan_id_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#unreserved_vlan_id_interval}.
	 * @param ctx the parse tree
	 */
	void enterUnreserved_vlan_id_interval(CiscoNxosParser.Unreserved_vlan_id_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#unreserved_vlan_id_interval}.
	 * @param ctx the parse tree
	 */
	void exitUnreserved_vlan_id_interval(CiscoNxosParser.Unreserved_vlan_id_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#vlan_id}.
	 * @param ctx the parse tree
	 */
	void enterVlan_id(CiscoNxosParser.Vlan_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#vlan_id}.
	 * @param ctx the parse tree
	 */
	void exitVlan_id(CiscoNxosParser.Vlan_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#vlan_id_range}.
	 * @param ctx the parse tree
	 */
	void enterVlan_id_range(CiscoNxosParser.Vlan_id_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#vlan_id_range}.
	 * @param ctx the parse tree
	 */
	void exitVlan_id_range(CiscoNxosParser.Vlan_id_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#vlan_id_interval}.
	 * @param ctx the parse tree
	 */
	void enterVlan_id_interval(CiscoNxosParser.Vlan_id_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#vlan_id_interval}.
	 * @param ctx the parse tree
	 */
	void exitVlan_id_interval(CiscoNxosParser.Vlan_id_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#vni_number}.
	 * @param ctx the parse tree
	 */
	void enterVni_number(CiscoNxosParser.Vni_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#vni_number}.
	 * @param ctx the parse tree
	 */
	void exitVni_number(CiscoNxosParser.Vni_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#vrf_name}.
	 * @param ctx the parse tree
	 */
	void enterVrf_name(CiscoNxosParser.Vrf_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#vrf_name}.
	 * @param ctx the parse tree
	 */
	void exitVrf_name(CiscoNxosParser.Vrf_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#vrf_non_default_name}.
	 * @param ctx the parse tree
	 */
	void enterVrf_non_default_name(CiscoNxosParser.Vrf_non_default_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#vrf_non_default_name}.
	 * @param ctx the parse tree
	 */
	void exitVrf_non_default_name(CiscoNxosParser.Vrf_non_default_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#aaa_group_name}.
	 * @param ctx the parse tree
	 */
	void enterAaa_group_name(CiscoNxosParser.Aaa_group_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#aaa_group_name}.
	 * @param ctx the parse tree
	 */
	void exitAaa_group_name(CiscoNxosParser.Aaa_group_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#aaag_deadtime_value}.
	 * @param ctx the parse tree
	 */
	void enterAaag_deadtime_value(CiscoNxosParser.Aaag_deadtime_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#aaag_deadtime_value}.
	 * @param ctx the parse tree
	 */
	void exitAaag_deadtime_value(CiscoNxosParser.Aaag_deadtime_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#s_aaa}.
	 * @param ctx the parse tree
	 */
	void enterS_aaa(CiscoNxosParser.S_aaaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#s_aaa}.
	 * @param ctx the parse tree
	 */
	void exitS_aaa(CiscoNxosParser.S_aaaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#aaa_group}.
	 * @param ctx the parse tree
	 */
	void enterAaa_group(CiscoNxosParser.Aaa_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#aaa_group}.
	 * @param ctx the parse tree
	 */
	void exitAaa_group(CiscoNxosParser.Aaa_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#aaag_radius}.
	 * @param ctx the parse tree
	 */
	void enterAaag_radius(CiscoNxosParser.Aaag_radiusContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#aaag_radius}.
	 * @param ctx the parse tree
	 */
	void exitAaag_radius(CiscoNxosParser.Aaag_radiusContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#aaagr_deadtime}.
	 * @param ctx the parse tree
	 */
	void enterAaagr_deadtime(CiscoNxosParser.Aaagr_deadtimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#aaagr_deadtime}.
	 * @param ctx the parse tree
	 */
	void exitAaagr_deadtime(CiscoNxosParser.Aaagr_deadtimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#aaagr_no}.
	 * @param ctx the parse tree
	 */
	void enterAaagr_no(CiscoNxosParser.Aaagr_noContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#aaagr_no}.
	 * @param ctx the parse tree
	 */
	void exitAaagr_no(CiscoNxosParser.Aaagr_noContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#aaagr_no_source_interface}.
	 * @param ctx the parse tree
	 */
	void enterAaagr_no_source_interface(CiscoNxosParser.Aaagr_no_source_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#aaagr_no_source_interface}.
	 * @param ctx the parse tree
	 */
	void exitAaagr_no_source_interface(CiscoNxosParser.Aaagr_no_source_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#aaagr_server}.
	 * @param ctx the parse tree
	 */
	void enterAaagr_server(CiscoNxosParser.Aaagr_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#aaagr_server}.
	 * @param ctx the parse tree
	 */
	void exitAaagr_server(CiscoNxosParser.Aaagr_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#aaagrs_dns}.
	 * @param ctx the parse tree
	 */
	void enterAaagrs_dns(CiscoNxosParser.Aaagrs_dnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#aaagrs_dns}.
	 * @param ctx the parse tree
	 */
	void exitAaagrs_dns(CiscoNxosParser.Aaagrs_dnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#aaagrs_ip4}.
	 * @param ctx the parse tree
	 */
	void enterAaagrs_ip4(CiscoNxosParser.Aaagrs_ip4Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#aaagrs_ip4}.
	 * @param ctx the parse tree
	 */
	void exitAaagrs_ip4(CiscoNxosParser.Aaagrs_ip4Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#aaagrs_ip6}.
	 * @param ctx the parse tree
	 */
	void enterAaagrs_ip6(CiscoNxosParser.Aaagrs_ip6Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#aaagrs_ip6}.
	 * @param ctx the parse tree
	 */
	void exitAaagrs_ip6(CiscoNxosParser.Aaagrs_ip6Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#aaagr_source_interface}.
	 * @param ctx the parse tree
	 */
	void enterAaagr_source_interface(CiscoNxosParser.Aaagr_source_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#aaagr_source_interface}.
	 * @param ctx the parse tree
	 */
	void exitAaagr_source_interface(CiscoNxosParser.Aaagr_source_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#aaagr_use_vrf}.
	 * @param ctx the parse tree
	 */
	void enterAaagr_use_vrf(CiscoNxosParser.Aaagr_use_vrfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#aaagr_use_vrf}.
	 * @param ctx the parse tree
	 */
	void exitAaagr_use_vrf(CiscoNxosParser.Aaagr_use_vrfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#aaag_tacacsp}.
	 * @param ctx the parse tree
	 */
	void enterAaag_tacacsp(CiscoNxosParser.Aaag_tacacspContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#aaag_tacacsp}.
	 * @param ctx the parse tree
	 */
	void exitAaag_tacacsp(CiscoNxosParser.Aaag_tacacspContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#aaagt_deadtime}.
	 * @param ctx the parse tree
	 */
	void enterAaagt_deadtime(CiscoNxosParser.Aaagt_deadtimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#aaagt_deadtime}.
	 * @param ctx the parse tree
	 */
	void exitAaagt_deadtime(CiscoNxosParser.Aaagt_deadtimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#aaagt_no}.
	 * @param ctx the parse tree
	 */
	void enterAaagt_no(CiscoNxosParser.Aaagt_noContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#aaagt_no}.
	 * @param ctx the parse tree
	 */
	void exitAaagt_no(CiscoNxosParser.Aaagt_noContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#aaagt_no_source_interface}.
	 * @param ctx the parse tree
	 */
	void enterAaagt_no_source_interface(CiscoNxosParser.Aaagt_no_source_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#aaagt_no_source_interface}.
	 * @param ctx the parse tree
	 */
	void exitAaagt_no_source_interface(CiscoNxosParser.Aaagt_no_source_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#aaagt_server}.
	 * @param ctx the parse tree
	 */
	void enterAaagt_server(CiscoNxosParser.Aaagt_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#aaagt_server}.
	 * @param ctx the parse tree
	 */
	void exitAaagt_server(CiscoNxosParser.Aaagt_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#aaagts_dns}.
	 * @param ctx the parse tree
	 */
	void enterAaagts_dns(CiscoNxosParser.Aaagts_dnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#aaagts_dns}.
	 * @param ctx the parse tree
	 */
	void exitAaagts_dns(CiscoNxosParser.Aaagts_dnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#aaagts_ip4}.
	 * @param ctx the parse tree
	 */
	void enterAaagts_ip4(CiscoNxosParser.Aaagts_ip4Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#aaagts_ip4}.
	 * @param ctx the parse tree
	 */
	void exitAaagts_ip4(CiscoNxosParser.Aaagts_ip4Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#aaagts_ip6}.
	 * @param ctx the parse tree
	 */
	void enterAaagts_ip6(CiscoNxosParser.Aaagts_ip6Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#aaagts_ip6}.
	 * @param ctx the parse tree
	 */
	void exitAaagts_ip6(CiscoNxosParser.Aaagts_ip6Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#aaagt_source_interface}.
	 * @param ctx the parse tree
	 */
	void enterAaagt_source_interface(CiscoNxosParser.Aaagt_source_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#aaagt_source_interface}.
	 * @param ctx the parse tree
	 */
	void exitAaagt_source_interface(CiscoNxosParser.Aaagt_source_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#aaagt_use_vrf}.
	 * @param ctx the parse tree
	 */
	void enterAaagt_use_vrf(CiscoNxosParser.Aaagt_use_vrfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#aaagt_use_vrf}.
	 * @param ctx the parse tree
	 */
	void exitAaagt_use_vrf(CiscoNxosParser.Aaagt_use_vrfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#aaa_accounting}.
	 * @param ctx the parse tree
	 */
	void enterAaa_accounting(CiscoNxosParser.Aaa_accountingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#aaa_accounting}.
	 * @param ctx the parse tree
	 */
	void exitAaa_accounting(CiscoNxosParser.Aaa_accountingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#aaa_accounting_default}.
	 * @param ctx the parse tree
	 */
	void enterAaa_accounting_default(CiscoNxosParser.Aaa_accounting_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#aaa_accounting_default}.
	 * @param ctx the parse tree
	 */
	void exitAaa_accounting_default(CiscoNxosParser.Aaa_accounting_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#aaa_authentication}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication(CiscoNxosParser.Aaa_authenticationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#aaa_authentication}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication(CiscoNxosParser.Aaa_authenticationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#aaa_authentication_login}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_login(CiscoNxosParser.Aaa_authentication_loginContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#aaa_authentication_login}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_login(CiscoNxosParser.Aaa_authentication_loginContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#aaa_authentication_login_default}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_login_default(CiscoNxosParser.Aaa_authentication_login_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#aaa_authentication_login_default}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_login_default(CiscoNxosParser.Aaa_authentication_login_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#aaa_authentication_login_error_enable}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_login_error_enable(CiscoNxosParser.Aaa_authentication_login_error_enableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#aaa_authentication_login_error_enable}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_login_error_enable(CiscoNxosParser.Aaa_authentication_login_error_enableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#aaa_authorization}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authorization(CiscoNxosParser.Aaa_authorizationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#aaa_authorization}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authorization(CiscoNxosParser.Aaa_authorizationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#aaa_authorization_commands}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authorization_commands(CiscoNxosParser.Aaa_authorization_commandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#aaa_authorization_commands}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authorization_commands(CiscoNxosParser.Aaa_authorization_commandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#aaa_authorization_commands_default}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authorization_commands_default(CiscoNxosParser.Aaa_authorization_commands_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#aaa_authorization_commands_default}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authorization_commands_default(CiscoNxosParser.Aaa_authorization_commands_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#aaa_authorization_config_commands}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authorization_config_commands(CiscoNxosParser.Aaa_authorization_config_commandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#aaa_authorization_config_commands}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authorization_config_commands(CiscoNxosParser.Aaa_authorization_config_commandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#aaa_authorization_config_commands_default}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authorization_config_commands_default(CiscoNxosParser.Aaa_authorization_config_commands_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#aaa_authorization_config_commands_default}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authorization_config_commands_default(CiscoNxosParser.Aaa_authorization_config_commands_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#dampen_igp_metric_interval}.
	 * @param ctx the parse tree
	 */
	void enterDampen_igp_metric_interval(CiscoNxosParser.Dampen_igp_metric_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#dampen_igp_metric_interval}.
	 * @param ctx the parse tree
	 */
	void exitDampen_igp_metric_interval(CiscoNxosParser.Dampen_igp_metric_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#decay_half_life}.
	 * @param ctx the parse tree
	 */
	void enterDecay_half_life(CiscoNxosParser.Decay_half_lifeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#decay_half_life}.
	 * @param ctx the parse tree
	 */
	void exitDecay_half_life(CiscoNxosParser.Decay_half_lifeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#start_reuse_val}.
	 * @param ctx the parse tree
	 */
	void enterStart_reuse_val(CiscoNxosParser.Start_reuse_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#start_reuse_val}.
	 * @param ctx the parse tree
	 */
	void exitStart_reuse_val(CiscoNxosParser.Start_reuse_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#start_suppress_val}.
	 * @param ctx the parse tree
	 */
	void enterStart_suppress_val(CiscoNxosParser.Start_suppress_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#start_suppress_val}.
	 * @param ctx the parse tree
	 */
	void exitStart_suppress_val(CiscoNxosParser.Start_suppress_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#router_bgp}.
	 * @param ctx the parse tree
	 */
	void enterRouter_bgp(CiscoNxosParser.Router_bgpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#router_bgp}.
	 * @param ctx the parse tree
	 */
	void exitRouter_bgp(CiscoNxosParser.Router_bgpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_proc_vrf_common}.
	 * @param ctx the parse tree
	 */
	void enterRb_proc_vrf_common(CiscoNxosParser.Rb_proc_vrf_commonContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_proc_vrf_common}.
	 * @param ctx the parse tree
	 */
	void exitRb_proc_vrf_common(CiscoNxosParser.Rb_proc_vrf_commonContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_address_family}.
	 * @param ctx the parse tree
	 */
	void enterRb_address_family(CiscoNxosParser.Rb_address_familyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_address_family}.
	 * @param ctx the parse tree
	 */
	void exitRb_address_family(CiscoNxosParser.Rb_address_familyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_af_ipv4}.
	 * @param ctx the parse tree
	 */
	void enterRb_af_ipv4(CiscoNxosParser.Rb_af_ipv4Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_af_ipv4}.
	 * @param ctx the parse tree
	 */
	void exitRb_af_ipv4(CiscoNxosParser.Rb_af_ipv4Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_af_ipv4_multicast}.
	 * @param ctx the parse tree
	 */
	void enterRb_af_ipv4_multicast(CiscoNxosParser.Rb_af_ipv4_multicastContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_af_ipv4_multicast}.
	 * @param ctx the parse tree
	 */
	void exitRb_af_ipv4_multicast(CiscoNxosParser.Rb_af_ipv4_multicastContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_af_ipv4_mvpn}.
	 * @param ctx the parse tree
	 */
	void enterRb_af_ipv4_mvpn(CiscoNxosParser.Rb_af_ipv4_mvpnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_af_ipv4_mvpn}.
	 * @param ctx the parse tree
	 */
	void exitRb_af_ipv4_mvpn(CiscoNxosParser.Rb_af_ipv4_mvpnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_af_ipv4_unicast}.
	 * @param ctx the parse tree
	 */
	void enterRb_af_ipv4_unicast(CiscoNxosParser.Rb_af_ipv4_unicastContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_af_ipv4_unicast}.
	 * @param ctx the parse tree
	 */
	void exitRb_af_ipv4_unicast(CiscoNxosParser.Rb_af_ipv4_unicastContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_af_ipv6}.
	 * @param ctx the parse tree
	 */
	void enterRb_af_ipv6(CiscoNxosParser.Rb_af_ipv6Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_af_ipv6}.
	 * @param ctx the parse tree
	 */
	void exitRb_af_ipv6(CiscoNxosParser.Rb_af_ipv6Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_af_ipv6_multicast}.
	 * @param ctx the parse tree
	 */
	void enterRb_af_ipv6_multicast(CiscoNxosParser.Rb_af_ipv6_multicastContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_af_ipv6_multicast}.
	 * @param ctx the parse tree
	 */
	void exitRb_af_ipv6_multicast(CiscoNxosParser.Rb_af_ipv6_multicastContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_af_ipv6_mvpn}.
	 * @param ctx the parse tree
	 */
	void enterRb_af_ipv6_mvpn(CiscoNxosParser.Rb_af_ipv6_mvpnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_af_ipv6_mvpn}.
	 * @param ctx the parse tree
	 */
	void exitRb_af_ipv6_mvpn(CiscoNxosParser.Rb_af_ipv6_mvpnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_af_ipv6_unicast}.
	 * @param ctx the parse tree
	 */
	void enterRb_af_ipv6_unicast(CiscoNxosParser.Rb_af_ipv6_unicastContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_af_ipv6_unicast}.
	 * @param ctx the parse tree
	 */
	void exitRb_af_ipv6_unicast(CiscoNxosParser.Rb_af_ipv6_unicastContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_af_l2vpn}.
	 * @param ctx the parse tree
	 */
	void enterRb_af_l2vpn(CiscoNxosParser.Rb_af_l2vpnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_af_l2vpn}.
	 * @param ctx the parse tree
	 */
	void exitRb_af_l2vpn(CiscoNxosParser.Rb_af_l2vpnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_afl2v_maximum_paths}.
	 * @param ctx the parse tree
	 */
	void enterRb_afl2v_maximum_paths(CiscoNxosParser.Rb_afl2v_maximum_pathsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_afl2v_maximum_paths}.
	 * @param ctx the parse tree
	 */
	void exitRb_afl2v_maximum_paths(CiscoNxosParser.Rb_afl2v_maximum_pathsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_afl2v_retain}.
	 * @param ctx the parse tree
	 */
	void enterRb_afl2v_retain(CiscoNxosParser.Rb_afl2v_retainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_afl2v_retain}.
	 * @param ctx the parse tree
	 */
	void exitRb_afl2v_retain(CiscoNxosParser.Rb_afl2v_retainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_af_link_state}.
	 * @param ctx the parse tree
	 */
	void enterRb_af_link_state(CiscoNxosParser.Rb_af_link_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_af_link_state}.
	 * @param ctx the parse tree
	 */
	void exitRb_af_link_state(CiscoNxosParser.Rb_af_link_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_af_vpnv4}.
	 * @param ctx the parse tree
	 */
	void enterRb_af_vpnv4(CiscoNxosParser.Rb_af_vpnv4Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_af_vpnv4}.
	 * @param ctx the parse tree
	 */
	void exitRb_af_vpnv4(CiscoNxosParser.Rb_af_vpnv4Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_af_vpnv6}.
	 * @param ctx the parse tree
	 */
	void enterRb_af_vpnv6(CiscoNxosParser.Rb_af_vpnv6Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_af_vpnv6}.
	 * @param ctx the parse tree
	 */
	void exitRb_af_vpnv6(CiscoNxosParser.Rb_af_vpnv6Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_af4_inner}.
	 * @param ctx the parse tree
	 */
	void enterRb_af4_inner(CiscoNxosParser.Rb_af4_innerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_af4_inner}.
	 * @param ctx the parse tree
	 */
	void exitRb_af4_inner(CiscoNxosParser.Rb_af4_innerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_af4_aggregate_address}.
	 * @param ctx the parse tree
	 */
	void enterRb_af4_aggregate_address(CiscoNxosParser.Rb_af4_aggregate_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_af4_aggregate_address}.
	 * @param ctx the parse tree
	 */
	void exitRb_af4_aggregate_address(CiscoNxosParser.Rb_af4_aggregate_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_af4_network}.
	 * @param ctx the parse tree
	 */
	void enterRb_af4_network(CiscoNxosParser.Rb_af4_networkContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_af4_network}.
	 * @param ctx the parse tree
	 */
	void exitRb_af4_network(CiscoNxosParser.Rb_af4_networkContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_af4_redistribute}.
	 * @param ctx the parse tree
	 */
	void enterRb_af4_redistribute(CiscoNxosParser.Rb_af4_redistributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_af4_redistribute}.
	 * @param ctx the parse tree
	 */
	void exitRb_af4_redistribute(CiscoNxosParser.Rb_af4_redistributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_af6_inner}.
	 * @param ctx the parse tree
	 */
	void enterRb_af6_inner(CiscoNxosParser.Rb_af6_innerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_af6_inner}.
	 * @param ctx the parse tree
	 */
	void exitRb_af6_inner(CiscoNxosParser.Rb_af6_innerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_af6_aggregate_address}.
	 * @param ctx the parse tree
	 */
	void enterRb_af6_aggregate_address(CiscoNxosParser.Rb_af6_aggregate_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_af6_aggregate_address}.
	 * @param ctx the parse tree
	 */
	void exitRb_af6_aggregate_address(CiscoNxosParser.Rb_af6_aggregate_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_af6_network}.
	 * @param ctx the parse tree
	 */
	void enterRb_af6_network(CiscoNxosParser.Rb_af6_networkContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_af6_network}.
	 * @param ctx the parse tree
	 */
	void exitRb_af6_network(CiscoNxosParser.Rb_af6_networkContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_af6_redistribute}.
	 * @param ctx the parse tree
	 */
	void enterRb_af6_redistribute(CiscoNxosParser.Rb_af6_redistributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_af6_redistribute}.
	 * @param ctx the parse tree
	 */
	void exitRb_af6_redistribute(CiscoNxosParser.Rb_af6_redistributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_afip_common}.
	 * @param ctx the parse tree
	 */
	void enterRb_afip_common(CiscoNxosParser.Rb_afip_commonContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_afip_common}.
	 * @param ctx the parse tree
	 */
	void exitRb_afip_common(CiscoNxosParser.Rb_afip_commonContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_afip_additional_paths}.
	 * @param ctx the parse tree
	 */
	void enterRb_afip_additional_paths(CiscoNxosParser.Rb_afip_additional_pathsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_afip_additional_paths}.
	 * @param ctx the parse tree
	 */
	void exitRb_afip_additional_paths(CiscoNxosParser.Rb_afip_additional_pathsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_afip_advertise}.
	 * @param ctx the parse tree
	 */
	void enterRb_afip_advertise(CiscoNxosParser.Rb_afip_advertiseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_afip_advertise}.
	 * @param ctx the parse tree
	 */
	void exitRb_afip_advertise(CiscoNxosParser.Rb_afip_advertiseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_afip_aa_tail}.
	 * @param ctx the parse tree
	 */
	void enterRb_afip_aa_tail(CiscoNxosParser.Rb_afip_aa_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_afip_aa_tail}.
	 * @param ctx the parse tree
	 */
	void exitRb_afip_aa_tail(CiscoNxosParser.Rb_afip_aa_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_afip_client_to_client}.
	 * @param ctx the parse tree
	 */
	void enterRb_afip_client_to_client(CiscoNxosParser.Rb_afip_client_to_clientContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_afip_client_to_client}.
	 * @param ctx the parse tree
	 */
	void exitRb_afip_client_to_client(CiscoNxosParser.Rb_afip_client_to_clientContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_afip_dampen_igp_metric}.
	 * @param ctx the parse tree
	 */
	void enterRb_afip_dampen_igp_metric(CiscoNxosParser.Rb_afip_dampen_igp_metricContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_afip_dampen_igp_metric}.
	 * @param ctx the parse tree
	 */
	void exitRb_afip_dampen_igp_metric(CiscoNxosParser.Rb_afip_dampen_igp_metricContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_afip_dampening}.
	 * @param ctx the parse tree
	 */
	void enterRb_afip_dampening(CiscoNxosParser.Rb_afip_dampeningContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_afip_dampening}.
	 * @param ctx the parse tree
	 */
	void exitRb_afip_dampening(CiscoNxosParser.Rb_afip_dampeningContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_afip_default_information}.
	 * @param ctx the parse tree
	 */
	void enterRb_afip_default_information(CiscoNxosParser.Rb_afip_default_informationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_afip_default_information}.
	 * @param ctx the parse tree
	 */
	void exitRb_afip_default_information(CiscoNxosParser.Rb_afip_default_informationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_afip_default_metric}.
	 * @param ctx the parse tree
	 */
	void enterRb_afip_default_metric(CiscoNxosParser.Rb_afip_default_metricContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_afip_default_metric}.
	 * @param ctx the parse tree
	 */
	void exitRb_afip_default_metric(CiscoNxosParser.Rb_afip_default_metricContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_afip_distance}.
	 * @param ctx the parse tree
	 */
	void enterRb_afip_distance(CiscoNxosParser.Rb_afip_distanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_afip_distance}.
	 * @param ctx the parse tree
	 */
	void exitRb_afip_distance(CiscoNxosParser.Rb_afip_distanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_afip_inject_map}.
	 * @param ctx the parse tree
	 */
	void enterRb_afip_inject_map(CiscoNxosParser.Rb_afip_inject_mapContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_afip_inject_map}.
	 * @param ctx the parse tree
	 */
	void exitRb_afip_inject_map(CiscoNxosParser.Rb_afip_inject_mapContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_afip_maximum_paths}.
	 * @param ctx the parse tree
	 */
	void enterRb_afip_maximum_paths(CiscoNxosParser.Rb_afip_maximum_pathsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_afip_maximum_paths}.
	 * @param ctx the parse tree
	 */
	void exitRb_afip_maximum_paths(CiscoNxosParser.Rb_afip_maximum_pathsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_afip_nexthop}.
	 * @param ctx the parse tree
	 */
	void enterRb_afip_nexthop(CiscoNxosParser.Rb_afip_nexthopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_afip_nexthop}.
	 * @param ctx the parse tree
	 */
	void exitRb_afip_nexthop(CiscoNxosParser.Rb_afip_nexthopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_afip_nexthop_route_map}.
	 * @param ctx the parse tree
	 */
	void enterRb_afip_nexthop_route_map(CiscoNxosParser.Rb_afip_nexthop_route_mapContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_afip_nexthop_route_map}.
	 * @param ctx the parse tree
	 */
	void exitRb_afip_nexthop_route_map(CiscoNxosParser.Rb_afip_nexthop_route_mapContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_afip_nexthop_trigger_delay}.
	 * @param ctx the parse tree
	 */
	void enterRb_afip_nexthop_trigger_delay(CiscoNxosParser.Rb_afip_nexthop_trigger_delayContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_afip_nexthop_trigger_delay}.
	 * @param ctx the parse tree
	 */
	void exitRb_afip_nexthop_trigger_delay(CiscoNxosParser.Rb_afip_nexthop_trigger_delayContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_afip_suppress_inactive}.
	 * @param ctx the parse tree
	 */
	void enterRb_afip_suppress_inactive(CiscoNxosParser.Rb_afip_suppress_inactiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_afip_suppress_inactive}.
	 * @param ctx the parse tree
	 */
	void exitRb_afip_suppress_inactive(CiscoNxosParser.Rb_afip_suppress_inactiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_afip_table_map}.
	 * @param ctx the parse tree
	 */
	void enterRb_afip_table_map(CiscoNxosParser.Rb_afip_table_mapContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_afip_table_map}.
	 * @param ctx the parse tree
	 */
	void exitRb_afip_table_map(CiscoNxosParser.Rb_afip_table_mapContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_afip_wait_igp_convergence}.
	 * @param ctx the parse tree
	 */
	void enterRb_afip_wait_igp_convergence(CiscoNxosParser.Rb_afip_wait_igp_convergenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_afip_wait_igp_convergence}.
	 * @param ctx the parse tree
	 */
	void exitRb_afip_wait_igp_convergence(CiscoNxosParser.Rb_afip_wait_igp_convergenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_bestpath}.
	 * @param ctx the parse tree
	 */
	void enterRb_bestpath(CiscoNxosParser.Rb_bestpathContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_bestpath}.
	 * @param ctx the parse tree
	 */
	void exitRb_bestpath(CiscoNxosParser.Rb_bestpathContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_cluster_id}.
	 * @param ctx the parse tree
	 */
	void enterRb_cluster_id(CiscoNxosParser.Rb_cluster_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_cluster_id}.
	 * @param ctx the parse tree
	 */
	void exitRb_cluster_id(CiscoNxosParser.Rb_cluster_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_confederation}.
	 * @param ctx the parse tree
	 */
	void enterRb_confederation(CiscoNxosParser.Rb_confederationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_confederation}.
	 * @param ctx the parse tree
	 */
	void exitRb_confederation(CiscoNxosParser.Rb_confederationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_confederation_identifier}.
	 * @param ctx the parse tree
	 */
	void enterRb_confederation_identifier(CiscoNxosParser.Rb_confederation_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_confederation_identifier}.
	 * @param ctx the parse tree
	 */
	void exitRb_confederation_identifier(CiscoNxosParser.Rb_confederation_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_confederation_peers}.
	 * @param ctx the parse tree
	 */
	void enterRb_confederation_peers(CiscoNxosParser.Rb_confederation_peersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_confederation_peers}.
	 * @param ctx the parse tree
	 */
	void exitRb_confederation_peers(CiscoNxosParser.Rb_confederation_peersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_enforce_first_as}.
	 * @param ctx the parse tree
	 */
	void enterRb_enforce_first_as(CiscoNxosParser.Rb_enforce_first_asContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_enforce_first_as}.
	 * @param ctx the parse tree
	 */
	void exitRb_enforce_first_as(CiscoNxosParser.Rb_enforce_first_asContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_event_history}.
	 * @param ctx the parse tree
	 */
	void enterRb_event_history(CiscoNxosParser.Rb_event_historyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_event_history}.
	 * @param ctx the parse tree
	 */
	void exitRb_event_history(CiscoNxosParser.Rb_event_historyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#event_history_buffer_size}.
	 * @param ctx the parse tree
	 */
	void enterEvent_history_buffer_size(CiscoNxosParser.Event_history_buffer_sizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#event_history_buffer_size}.
	 * @param ctx the parse tree
	 */
	void exitEvent_history_buffer_size(CiscoNxosParser.Event_history_buffer_sizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_fast_external_fallover}.
	 * @param ctx the parse tree
	 */
	void enterRb_fast_external_fallover(CiscoNxosParser.Rb_fast_external_falloverContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_fast_external_fallover}.
	 * @param ctx the parse tree
	 */
	void exitRb_fast_external_fallover(CiscoNxosParser.Rb_fast_external_falloverContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_flush_routes}.
	 * @param ctx the parse tree
	 */
	void enterRb_flush_routes(CiscoNxosParser.Rb_flush_routesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_flush_routes}.
	 * @param ctx the parse tree
	 */
	void exitRb_flush_routes(CiscoNxosParser.Rb_flush_routesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_graceful_restart}.
	 * @param ctx the parse tree
	 */
	void enterRb_graceful_restart(CiscoNxosParser.Rb_graceful_restartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_graceful_restart}.
	 * @param ctx the parse tree
	 */
	void exitRb_graceful_restart(CiscoNxosParser.Rb_graceful_restartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#restart_time}.
	 * @param ctx the parse tree
	 */
	void enterRestart_time(CiscoNxosParser.Restart_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#restart_time}.
	 * @param ctx the parse tree
	 */
	void exitRestart_time(CiscoNxosParser.Restart_timeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#stalepath_time}.
	 * @param ctx the parse tree
	 */
	void enterStalepath_time(CiscoNxosParser.Stalepath_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#stalepath_time}.
	 * @param ctx the parse tree
	 */
	void exitStalepath_time(CiscoNxosParser.Stalepath_timeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_graceful_restart_helper}.
	 * @param ctx the parse tree
	 */
	void enterRb_graceful_restart_helper(CiscoNxosParser.Rb_graceful_restart_helperContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_graceful_restart_helper}.
	 * @param ctx the parse tree
	 */
	void exitRb_graceful_restart_helper(CiscoNxosParser.Rb_graceful_restart_helperContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_log_neighbor_changes}.
	 * @param ctx the parse tree
	 */
	void enterRb_log_neighbor_changes(CiscoNxosParser.Rb_log_neighbor_changesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_log_neighbor_changes}.
	 * @param ctx the parse tree
	 */
	void exitRb_log_neighbor_changes(CiscoNxosParser.Rb_log_neighbor_changesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_isolate}.
	 * @param ctx the parse tree
	 */
	void enterRb_isolate(CiscoNxosParser.Rb_isolateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_isolate}.
	 * @param ctx the parse tree
	 */
	void exitRb_isolate(CiscoNxosParser.Rb_isolateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_maxas_limit}.
	 * @param ctx the parse tree
	 */
	void enterRb_maxas_limit(CiscoNxosParser.Rb_maxas_limitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_maxas_limit}.
	 * @param ctx the parse tree
	 */
	void exitRb_maxas_limit(CiscoNxosParser.Rb_maxas_limitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#maxas_limit}.
	 * @param ctx the parse tree
	 */
	void enterMaxas_limit(CiscoNxosParser.Maxas_limitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#maxas_limit}.
	 * @param ctx the parse tree
	 */
	void exitMaxas_limit(CiscoNxosParser.Maxas_limitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_neighbor}.
	 * @param ctx the parse tree
	 */
	void enterRb_neighbor(CiscoNxosParser.Rb_neighborContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_neighbor}.
	 * @param ctx the parse tree
	 */
	void exitRb_neighbor(CiscoNxosParser.Rb_neighborContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_inner}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_inner(CiscoNxosParser.Rb_n_innerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_inner}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_inner(CiscoNxosParser.Rb_n_innerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_common}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_common(CiscoNxosParser.Rb_n_commonContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_common}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_common(CiscoNxosParser.Rb_n_commonContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_address_family}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_address_family(CiscoNxosParser.Rb_n_address_familyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_address_family}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_address_family(CiscoNxosParser.Rb_n_address_familyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_af_inner}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_af_inner(CiscoNxosParser.Rb_n_af_innerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_af_inner}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_af_inner(CiscoNxosParser.Rb_n_af_innerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_af_advertise}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_af_advertise(CiscoNxosParser.Rb_n_af_advertiseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_af_advertise}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_af_advertise(CiscoNxosParser.Rb_n_af_advertiseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_af_advertise_map}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_af_advertise_map(CiscoNxosParser.Rb_n_af_advertise_mapContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_af_advertise_map}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_af_advertise_map(CiscoNxosParser.Rb_n_af_advertise_mapContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_advertisement_interval}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_advertisement_interval(CiscoNxosParser.Rb_n_advertisement_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_advertisement_interval}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_advertisement_interval(CiscoNxosParser.Rb_n_advertisement_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#advertisement_interval}.
	 * @param ctx the parse tree
	 */
	void enterAdvertisement_interval(CiscoNxosParser.Advertisement_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#advertisement_interval}.
	 * @param ctx the parse tree
	 */
	void exitAdvertisement_interval(CiscoNxosParser.Advertisement_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_af_allowas_in}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_af_allowas_in(CiscoNxosParser.Rb_n_af_allowas_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_af_allowas_in}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_af_allowas_in(CiscoNxosParser.Rb_n_af_allowas_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#allowas_in_max_occurrences}.
	 * @param ctx the parse tree
	 */
	void enterAllowas_in_max_occurrences(CiscoNxosParser.Allowas_in_max_occurrencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#allowas_in_max_occurrences}.
	 * @param ctx the parse tree
	 */
	void exitAllowas_in_max_occurrences(CiscoNxosParser.Allowas_in_max_occurrencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_af_as_override}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_af_as_override(CiscoNxosParser.Rb_n_af_as_overrideContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_af_as_override}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_af_as_override(CiscoNxosParser.Rb_n_af_as_overrideContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_af_capability}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_af_capability(CiscoNxosParser.Rb_n_af_capabilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_af_capability}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_af_capability(CiscoNxosParser.Rb_n_af_capabilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_af_default}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_af_default(CiscoNxosParser.Rb_n_af_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_af_default}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_af_default(CiscoNxosParser.Rb_n_af_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_af_default_originate}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_af_default_originate(CiscoNxosParser.Rb_n_af_default_originateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_af_default_originate}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_af_default_originate(CiscoNxosParser.Rb_n_af_default_originateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_af_disable_peer_as_check}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_af_disable_peer_as_check(CiscoNxosParser.Rb_n_af_disable_peer_as_checkContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_af_disable_peer_as_check}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_af_disable_peer_as_check(CiscoNxosParser.Rb_n_af_disable_peer_as_checkContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_af_filter_list}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_af_filter_list(CiscoNxosParser.Rb_n_af_filter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_af_filter_list}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_af_filter_list(CiscoNxosParser.Rb_n_af_filter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_af_inherit}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_af_inherit(CiscoNxosParser.Rb_n_af_inheritContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_af_inherit}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_af_inherit(CiscoNxosParser.Rb_n_af_inheritContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#inherit_sequence_number}.
	 * @param ctx the parse tree
	 */
	void enterInherit_sequence_number(CiscoNxosParser.Inherit_sequence_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#inherit_sequence_number}.
	 * @param ctx the parse tree
	 */
	void exitInherit_sequence_number(CiscoNxosParser.Inherit_sequence_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_af_maximum_prefix}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_af_maximum_prefix(CiscoNxosParser.Rb_n_af_maximum_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_af_maximum_prefix}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_af_maximum_prefix(CiscoNxosParser.Rb_n_af_maximum_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#threshold_percentage}.
	 * @param ctx the parse tree
	 */
	void enterThreshold_percentage(CiscoNxosParser.Threshold_percentageContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#threshold_percentage}.
	 * @param ctx the parse tree
	 */
	void exitThreshold_percentage(CiscoNxosParser.Threshold_percentageContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#restart_interval}.
	 * @param ctx the parse tree
	 */
	void enterRestart_interval(CiscoNxosParser.Restart_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#restart_interval}.
	 * @param ctx the parse tree
	 */
	void exitRestart_interval(CiscoNxosParser.Restart_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_af_next_hop_self}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_af_next_hop_self(CiscoNxosParser.Rb_n_af_next_hop_selfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_af_next_hop_self}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_af_next_hop_self(CiscoNxosParser.Rb_n_af_next_hop_selfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_af_next_hop_third_party}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_af_next_hop_third_party(CiscoNxosParser.Rb_n_af_next_hop_third_partyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_af_next_hop_third_party}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_af_next_hop_third_party(CiscoNxosParser.Rb_n_af_next_hop_third_partyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_af_no_default_originate}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_af_no_default_originate(CiscoNxosParser.Rb_n_af_no_default_originateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_af_no_default_originate}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_af_no_default_originate(CiscoNxosParser.Rb_n_af_no_default_originateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_af_prefix_list}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_af_prefix_list(CiscoNxosParser.Rb_n_af_prefix_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_af_prefix_list}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_af_prefix_list(CiscoNxosParser.Rb_n_af_prefix_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_af_route_map}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_af_route_map(CiscoNxosParser.Rb_n_af_route_mapContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_af_route_map}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_af_route_map(CiscoNxosParser.Rb_n_af_route_mapContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_af_route_reflector_client}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_af_route_reflector_client(CiscoNxosParser.Rb_n_af_route_reflector_clientContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_af_route_reflector_client}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_af_route_reflector_client(CiscoNxosParser.Rb_n_af_route_reflector_clientContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_af_send_community}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_af_send_community(CiscoNxosParser.Rb_n_af_send_communityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_af_send_community}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_af_send_community(CiscoNxosParser.Rb_n_af_send_communityContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_af_soft_reconfiguration}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_af_soft_reconfiguration(CiscoNxosParser.Rb_n_af_soft_reconfigurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_af_soft_reconfiguration}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_af_soft_reconfiguration(CiscoNxosParser.Rb_n_af_soft_reconfigurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_af_soo}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_af_soo(CiscoNxosParser.Rb_n_af_sooContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_af_soo}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_af_soo(CiscoNxosParser.Rb_n_af_sooContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_af_suppress_inactive}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_af_suppress_inactive(CiscoNxosParser.Rb_n_af_suppress_inactiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_af_suppress_inactive}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_af_suppress_inactive(CiscoNxosParser.Rb_n_af_suppress_inactiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_af_unsuppress_map}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_af_unsuppress_map(CiscoNxosParser.Rb_n_af_unsuppress_mapContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_af_unsuppress_map}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_af_unsuppress_map(CiscoNxosParser.Rb_n_af_unsuppress_mapContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_af_weight}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_af_weight(CiscoNxosParser.Rb_n_af_weightContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_af_weight}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_af_weight(CiscoNxosParser.Rb_n_af_weightContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_bfd}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_bfd(CiscoNxosParser.Rb_n_bfdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_bfd}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_bfd(CiscoNxosParser.Rb_n_bfdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_capability}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_capability(CiscoNxosParser.Rb_n_capabilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_capability}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_capability(CiscoNxosParser.Rb_n_capabilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_default}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_default(CiscoNxosParser.Rb_n_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_default}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_default(CiscoNxosParser.Rb_n_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_description}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_description(CiscoNxosParser.Rb_n_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_description}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_description(CiscoNxosParser.Rb_n_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#bgp_neighbor_description}.
	 * @param ctx the parse tree
	 */
	void enterBgp_neighbor_description(CiscoNxosParser.Bgp_neighbor_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#bgp_neighbor_description}.
	 * @param ctx the parse tree
	 */
	void exitBgp_neighbor_description(CiscoNxosParser.Bgp_neighbor_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_disable_connected_check}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_disable_connected_check(CiscoNxosParser.Rb_n_disable_connected_checkContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_disable_connected_check}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_disable_connected_check(CiscoNxosParser.Rb_n_disable_connected_checkContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_dont_capability_negotiate}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_dont_capability_negotiate(CiscoNxosParser.Rb_n_dont_capability_negotiateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_dont_capability_negotiate}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_dont_capability_negotiate(CiscoNxosParser.Rb_n_dont_capability_negotiateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_dynamic_capability}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_dynamic_capability(CiscoNxosParser.Rb_n_dynamic_capabilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_dynamic_capability}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_dynamic_capability(CiscoNxosParser.Rb_n_dynamic_capabilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_ebgp_multihop}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_ebgp_multihop(CiscoNxosParser.Rb_n_ebgp_multihopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_ebgp_multihop}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_ebgp_multihop(CiscoNxosParser.Rb_n_ebgp_multihopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ebgp_multihop_ttl}.
	 * @param ctx the parse tree
	 */
	void enterEbgp_multihop_ttl(CiscoNxosParser.Ebgp_multihop_ttlContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ebgp_multihop_ttl}.
	 * @param ctx the parse tree
	 */
	void exitEbgp_multihop_ttl(CiscoNxosParser.Ebgp_multihop_ttlContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_inherit}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_inherit(CiscoNxosParser.Rb_n_inheritContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_inherit}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_inherit(CiscoNxosParser.Rb_n_inheritContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_local_as}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_local_as(CiscoNxosParser.Rb_n_local_asContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_local_as}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_local_as(CiscoNxosParser.Rb_n_local_asContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_log_neighbor_changes}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_log_neighbor_changes(CiscoNxosParser.Rb_n_log_neighbor_changesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_log_neighbor_changes}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_log_neighbor_changes(CiscoNxosParser.Rb_n_log_neighbor_changesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_low_memory}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_low_memory(CiscoNxosParser.Rb_n_low_memoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_low_memory}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_low_memory(CiscoNxosParser.Rb_n_low_memoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_maximum_peers}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_maximum_peers(CiscoNxosParser.Rb_n_maximum_peersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_maximum_peers}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_maximum_peers(CiscoNxosParser.Rb_n_maximum_peersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#maximum_peers}.
	 * @param ctx the parse tree
	 */
	void enterMaximum_peers(CiscoNxosParser.Maximum_peersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#maximum_peers}.
	 * @param ctx the parse tree
	 */
	void exitMaximum_peers(CiscoNxosParser.Maximum_peersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_no}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_no(CiscoNxosParser.Rb_n_noContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_no}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_no(CiscoNxosParser.Rb_n_noContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_no_bfd}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_no_bfd(CiscoNxosParser.Rb_n_no_bfdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_no_bfd}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_no_bfd(CiscoNxosParser.Rb_n_no_bfdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_no_shutdown}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_no_shutdown(CiscoNxosParser.Rb_n_no_shutdownContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_no_shutdown}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_no_shutdown(CiscoNxosParser.Rb_n_no_shutdownContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_password}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_password(CiscoNxosParser.Rb_n_passwordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_password}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_password(CiscoNxosParser.Rb_n_passwordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_remote_as}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_remote_as(CiscoNxosParser.Rb_n_remote_asContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_remote_as}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_remote_as(CiscoNxosParser.Rb_n_remote_asContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_remove_private_as}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_remove_private_as(CiscoNxosParser.Rb_n_remove_private_asContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_remove_private_as}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_remove_private_as(CiscoNxosParser.Rb_n_remove_private_asContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_shutdown}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_shutdown(CiscoNxosParser.Rb_n_shutdownContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_shutdown}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_shutdown(CiscoNxosParser.Rb_n_shutdownContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_timers}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_timers(CiscoNxosParser.Rb_n_timersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_timers}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_timers(CiscoNxosParser.Rb_n_timersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#keepalive_interval}.
	 * @param ctx the parse tree
	 */
	void enterKeepalive_interval(CiscoNxosParser.Keepalive_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#keepalive_interval}.
	 * @param ctx the parse tree
	 */
	void exitKeepalive_interval(CiscoNxosParser.Keepalive_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#holdtime}.
	 * @param ctx the parse tree
	 */
	void enterHoldtime(CiscoNxosParser.HoldtimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#holdtime}.
	 * @param ctx the parse tree
	 */
	void exitHoldtime(CiscoNxosParser.HoldtimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_transport}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_transport(CiscoNxosParser.Rb_n_transportContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_transport}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_transport(CiscoNxosParser.Rb_n_transportContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_n_update_source}.
	 * @param ctx the parse tree
	 */
	void enterRb_n_update_source(CiscoNxosParser.Rb_n_update_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_n_update_source}.
	 * @param ctx the parse tree
	 */
	void exitRb_n_update_source(CiscoNxosParser.Rb_n_update_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_no_enforce_first_as}.
	 * @param ctx the parse tree
	 */
	void enterRb_no_enforce_first_as(CiscoNxosParser.Rb_no_enforce_first_asContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_no_enforce_first_as}.
	 * @param ctx the parse tree
	 */
	void exitRb_no_enforce_first_as(CiscoNxosParser.Rb_no_enforce_first_asContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_reconnect_interval}.
	 * @param ctx the parse tree
	 */
	void enterRb_reconnect_interval(CiscoNxosParser.Rb_reconnect_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_reconnect_interval}.
	 * @param ctx the parse tree
	 */
	void exitRb_reconnect_interval(CiscoNxosParser.Rb_reconnect_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#reconnect_interval}.
	 * @param ctx the parse tree
	 */
	void enterReconnect_interval(CiscoNxosParser.Reconnect_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#reconnect_interval}.
	 * @param ctx the parse tree
	 */
	void exitReconnect_interval(CiscoNxosParser.Reconnect_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_router_id}.
	 * @param ctx the parse tree
	 */
	void enterRb_router_id(CiscoNxosParser.Rb_router_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_router_id}.
	 * @param ctx the parse tree
	 */
	void exitRb_router_id(CiscoNxosParser.Rb_router_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_shutdown}.
	 * @param ctx the parse tree
	 */
	void enterRb_shutdown(CiscoNxosParser.Rb_shutdownContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_shutdown}.
	 * @param ctx the parse tree
	 */
	void exitRb_shutdown(CiscoNxosParser.Rb_shutdownContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_suppress_fib_pending}.
	 * @param ctx the parse tree
	 */
	void enterRb_suppress_fib_pending(CiscoNxosParser.Rb_suppress_fib_pendingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_suppress_fib_pending}.
	 * @param ctx the parse tree
	 */
	void exitRb_suppress_fib_pending(CiscoNxosParser.Rb_suppress_fib_pendingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_template}.
	 * @param ctx the parse tree
	 */
	void enterRb_template(CiscoNxosParser.Rb_templateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_template}.
	 * @param ctx the parse tree
	 */
	void exitRb_template(CiscoNxosParser.Rb_templateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_template_peer}.
	 * @param ctx the parse tree
	 */
	void enterRb_template_peer(CiscoNxosParser.Rb_template_peerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_template_peer}.
	 * @param ctx the parse tree
	 */
	void exitRb_template_peer(CiscoNxosParser.Rb_template_peerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_template_peer_policy}.
	 * @param ctx the parse tree
	 */
	void enterRb_template_peer_policy(CiscoNxosParser.Rb_template_peer_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_template_peer_policy}.
	 * @param ctx the parse tree
	 */
	void exitRb_template_peer_policy(CiscoNxosParser.Rb_template_peer_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_template_peer_session}.
	 * @param ctx the parse tree
	 */
	void enterRb_template_peer_session(CiscoNxosParser.Rb_template_peer_sessionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_template_peer_session}.
	 * @param ctx the parse tree
	 */
	void exitRb_template_peer_session(CiscoNxosParser.Rb_template_peer_sessionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_timers}.
	 * @param ctx the parse tree
	 */
	void enterRb_timers(CiscoNxosParser.Rb_timersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_timers}.
	 * @param ctx the parse tree
	 */
	void exitRb_timers(CiscoNxosParser.Rb_timersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_timers_bestpath_limit}.
	 * @param ctx the parse tree
	 */
	void enterRb_timers_bestpath_limit(CiscoNxosParser.Rb_timers_bestpath_limitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_timers_bestpath_limit}.
	 * @param ctx the parse tree
	 */
	void exitRb_timers_bestpath_limit(CiscoNxosParser.Rb_timers_bestpath_limitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#bestpath_timeout}.
	 * @param ctx the parse tree
	 */
	void enterBestpath_timeout(CiscoNxosParser.Bestpath_timeoutContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#bestpath_timeout}.
	 * @param ctx the parse tree
	 */
	void exitBestpath_timeout(CiscoNxosParser.Bestpath_timeoutContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_timers_bgp}.
	 * @param ctx the parse tree
	 */
	void enterRb_timers_bgp(CiscoNxosParser.Rb_timers_bgpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_timers_bgp}.
	 * @param ctx the parse tree
	 */
	void exitRb_timers_bgp(CiscoNxosParser.Rb_timers_bgpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_timers_prefix_peer_timeout}.
	 * @param ctx the parse tree
	 */
	void enterRb_timers_prefix_peer_timeout(CiscoNxosParser.Rb_timers_prefix_peer_timeoutContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_timers_prefix_peer_timeout}.
	 * @param ctx the parse tree
	 */
	void exitRb_timers_prefix_peer_timeout(CiscoNxosParser.Rb_timers_prefix_peer_timeoutContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#prefix_peer_timeout}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_peer_timeout(CiscoNxosParser.Prefix_peer_timeoutContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#prefix_peer_timeout}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_peer_timeout(CiscoNxosParser.Prefix_peer_timeoutContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_timers_prefix_peer_wait}.
	 * @param ctx the parse tree
	 */
	void enterRb_timers_prefix_peer_wait(CiscoNxosParser.Rb_timers_prefix_peer_waitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_timers_prefix_peer_wait}.
	 * @param ctx the parse tree
	 */
	void exitRb_timers_prefix_peer_wait(CiscoNxosParser.Rb_timers_prefix_peer_waitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#prefix_peer_wait_timer}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_peer_wait_timer(CiscoNxosParser.Prefix_peer_wait_timerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#prefix_peer_wait_timer}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_peer_wait_timer(CiscoNxosParser.Prefix_peer_wait_timerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_vrf}.
	 * @param ctx the parse tree
	 */
	void enterRb_vrf(CiscoNxosParser.Rb_vrfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_vrf}.
	 * @param ctx the parse tree
	 */
	void exitRb_vrf(CiscoNxosParser.Rb_vrfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_v_address_family}.
	 * @param ctx the parse tree
	 */
	void enterRb_v_address_family(CiscoNxosParser.Rb_v_address_familyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_v_address_family}.
	 * @param ctx the parse tree
	 */
	void exitRb_v_address_family(CiscoNxosParser.Rb_v_address_familyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_vaf_ipv4}.
	 * @param ctx the parse tree
	 */
	void enterRb_vaf_ipv4(CiscoNxosParser.Rb_vaf_ipv4Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_vaf_ipv4}.
	 * @param ctx the parse tree
	 */
	void exitRb_vaf_ipv4(CiscoNxosParser.Rb_vaf_ipv4Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_vaf_ipv6}.
	 * @param ctx the parse tree
	 */
	void enterRb_vaf_ipv6(CiscoNxosParser.Rb_vaf_ipv6Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_vaf_ipv6}.
	 * @param ctx the parse tree
	 */
	void exitRb_vaf_ipv6(CiscoNxosParser.Rb_vaf_ipv6Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rb_v_local_as}.
	 * @param ctx the parse tree
	 */
	void enterRb_v_local_as(CiscoNxosParser.Rb_v_local_asContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rb_v_local_as}.
	 * @param ctx the parse tree
	 */
	void exitRb_v_local_as(CiscoNxosParser.Rb_v_local_asContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#class_map_description}.
	 * @param ctx the parse tree
	 */
	void enterClass_map_description(CiscoNxosParser.Class_map_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#class_map_description}.
	 * @param ctx the parse tree
	 */
	void exitClass_map_description(CiscoNxosParser.Class_map_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#s_class_map}.
	 * @param ctx the parse tree
	 */
	void enterS_class_map(CiscoNxosParser.S_class_mapContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#s_class_map}.
	 * @param ctx the parse tree
	 */
	void exitS_class_map(CiscoNxosParser.S_class_mapContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#cm_type}.
	 * @param ctx the parse tree
	 */
	void enterCm_type(CiscoNxosParser.Cm_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#cm_type}.
	 * @param ctx the parse tree
	 */
	void exitCm_type(CiscoNxosParser.Cm_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#cmt_control_plane}.
	 * @param ctx the parse tree
	 */
	void enterCmt_control_plane(CiscoNxosParser.Cmt_control_planeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#cmt_control_plane}.
	 * @param ctx the parse tree
	 */
	void exitCmt_control_plane(CiscoNxosParser.Cmt_control_planeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#cmt_network_qos}.
	 * @param ctx the parse tree
	 */
	void enterCmt_network_qos(CiscoNxosParser.Cmt_network_qosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#cmt_network_qos}.
	 * @param ctx the parse tree
	 */
	void exitCmt_network_qos(CiscoNxosParser.Cmt_network_qosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#cmt_qos}.
	 * @param ctx the parse tree
	 */
	void enterCmt_qos(CiscoNxosParser.Cmt_qosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#cmt_qos}.
	 * @param ctx the parse tree
	 */
	void exitCmt_qos(CiscoNxosParser.Cmt_qosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#cmt_queuing}.
	 * @param ctx the parse tree
	 */
	void enterCmt_queuing(CiscoNxosParser.Cmt_queuingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#cmt_queuing}.
	 * @param ctx the parse tree
	 */
	void exitCmt_queuing(CiscoNxosParser.Cmt_queuingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#cm_control_plane}.
	 * @param ctx the parse tree
	 */
	void enterCm_control_plane(CiscoNxosParser.Cm_control_planeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#cm_control_plane}.
	 * @param ctx the parse tree
	 */
	void exitCm_control_plane(CiscoNxosParser.Cm_control_planeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#cmcp_match}.
	 * @param ctx the parse tree
	 */
	void enterCmcp_match(CiscoNxosParser.Cmcp_matchContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#cmcp_match}.
	 * @param ctx the parse tree
	 */
	void exitCmcp_match(CiscoNxosParser.Cmcp_matchContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#cmcpm_access_group}.
	 * @param ctx the parse tree
	 */
	void enterCmcpm_access_group(CiscoNxosParser.Cmcpm_access_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#cmcpm_access_group}.
	 * @param ctx the parse tree
	 */
	void exitCmcpm_access_group(CiscoNxosParser.Cmcpm_access_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#cmcpm_exception}.
	 * @param ctx the parse tree
	 */
	void enterCmcpm_exception(CiscoNxosParser.Cmcpm_exceptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#cmcpm_exception}.
	 * @param ctx the parse tree
	 */
	void exitCmcpm_exception(CiscoNxosParser.Cmcpm_exceptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#cmcpm_protocol}.
	 * @param ctx the parse tree
	 */
	void enterCmcpm_protocol(CiscoNxosParser.Cmcpm_protocolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#cmcpm_protocol}.
	 * @param ctx the parse tree
	 */
	void exitCmcpm_protocol(CiscoNxosParser.Cmcpm_protocolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#cm_network_qos}.
	 * @param ctx the parse tree
	 */
	void enterCm_network_qos(CiscoNxosParser.Cm_network_qosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#cm_network_qos}.
	 * @param ctx the parse tree
	 */
	void exitCm_network_qos(CiscoNxosParser.Cm_network_qosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#cmnq_description}.
	 * @param ctx the parse tree
	 */
	void enterCmnq_description(CiscoNxosParser.Cmnq_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#cmnq_description}.
	 * @param ctx the parse tree
	 */
	void exitCmnq_description(CiscoNxosParser.Cmnq_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#cmnq_match}.
	 * @param ctx the parse tree
	 */
	void enterCmnq_match(CiscoNxosParser.Cmnq_matchContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#cmnq_match}.
	 * @param ctx the parse tree
	 */
	void exitCmnq_match(CiscoNxosParser.Cmnq_matchContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#cmnqm_cos}.
	 * @param ctx the parse tree
	 */
	void enterCmnqm_cos(CiscoNxosParser.Cmnqm_cosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#cmnqm_cos}.
	 * @param ctx the parse tree
	 */
	void exitCmnqm_cos(CiscoNxosParser.Cmnqm_cosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#cmnqm_protocol}.
	 * @param ctx the parse tree
	 */
	void enterCmnqm_protocol(CiscoNxosParser.Cmnqm_protocolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#cmnqm_protocol}.
	 * @param ctx the parse tree
	 */
	void exitCmnqm_protocol(CiscoNxosParser.Cmnqm_protocolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#cmnqm_qos_group}.
	 * @param ctx the parse tree
	 */
	void enterCmnqm_qos_group(CiscoNxosParser.Cmnqm_qos_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#cmnqm_qos_group}.
	 * @param ctx the parse tree
	 */
	void exitCmnqm_qos_group(CiscoNxosParser.Cmnqm_qos_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#cm_qos}.
	 * @param ctx the parse tree
	 */
	void enterCm_qos(CiscoNxosParser.Cm_qosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#cm_qos}.
	 * @param ctx the parse tree
	 */
	void exitCm_qos(CiscoNxosParser.Cm_qosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#cmq_description}.
	 * @param ctx the parse tree
	 */
	void enterCmq_description(CiscoNxosParser.Cmq_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#cmq_description}.
	 * @param ctx the parse tree
	 */
	void exitCmq_description(CiscoNxosParser.Cmq_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#cmq_match}.
	 * @param ctx the parse tree
	 */
	void enterCmq_match(CiscoNxosParser.Cmq_matchContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#cmq_match}.
	 * @param ctx the parse tree
	 */
	void exitCmq_match(CiscoNxosParser.Cmq_matchContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#cmqm_dscp}.
	 * @param ctx the parse tree
	 */
	void enterCmqm_dscp(CiscoNxosParser.Cmqm_dscpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#cmqm_dscp}.
	 * @param ctx the parse tree
	 */
	void exitCmqm_dscp(CiscoNxosParser.Cmqm_dscpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#cmqm_precedence}.
	 * @param ctx the parse tree
	 */
	void enterCmqm_precedence(CiscoNxosParser.Cmqm_precedenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#cmqm_precedence}.
	 * @param ctx the parse tree
	 */
	void exitCmqm_precedence(CiscoNxosParser.Cmqm_precedenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#cm_queuing}.
	 * @param ctx the parse tree
	 */
	void enterCm_queuing(CiscoNxosParser.Cm_queuingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#cm_queuing}.
	 * @param ctx the parse tree
	 */
	void exitCm_queuing(CiscoNxosParser.Cm_queuingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#cmqu_match}.
	 * @param ctx the parse tree
	 */
	void enterCmqu_match(CiscoNxosParser.Cmqu_matchContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#cmqu_match}.
	 * @param ctx the parse tree
	 */
	void exitCmqu_match(CiscoNxosParser.Cmqu_matchContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#cmqum_cos}.
	 * @param ctx the parse tree
	 */
	void enterCmqum_cos(CiscoNxosParser.Cmqum_cosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#cmqum_cos}.
	 * @param ctx the parse tree
	 */
	void exitCmqum_cos(CiscoNxosParser.Cmqum_cosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#cmqum_qos_group}.
	 * @param ctx the parse tree
	 */
	void enterCmqum_qos_group(CiscoNxosParser.Cmqum_qos_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#cmqum_qos_group}.
	 * @param ctx the parse tree
	 */
	void exitCmqum_qos_group(CiscoNxosParser.Cmqum_qos_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ck_param}.
	 * @param ctx the parse tree
	 */
	void enterCk_param(CiscoNxosParser.Ck_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ck_param}.
	 * @param ctx the parse tree
	 */
	void exitCk_param(CiscoNxosParser.Ck_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#crypto_key}.
	 * @param ctx the parse tree
	 */
	void enterCrypto_key(CiscoNxosParser.Crypto_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#crypto_key}.
	 * @param ctx the parse tree
	 */
	void exitCrypto_key(CiscoNxosParser.Crypto_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#s_crypto}.
	 * @param ctx the parse tree
	 */
	void enterS_crypto(CiscoNxosParser.S_cryptoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#s_crypto}.
	 * @param ctx the parse tree
	 */
	void exitS_crypto(CiscoNxosParser.S_cryptoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#eigrp_asn}.
	 * @param ctx the parse tree
	 */
	void enterEigrp_asn(CiscoNxosParser.Eigrp_asnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#eigrp_asn}.
	 * @param ctx the parse tree
	 */
	void exitEigrp_asn(CiscoNxosParser.Eigrp_asnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#router_eigrp}.
	 * @param ctx the parse tree
	 */
	void enterRouter_eigrp(CiscoNxosParser.Router_eigrpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#router_eigrp}.
	 * @param ctx the parse tree
	 */
	void exitRouter_eigrp(CiscoNxosParser.Router_eigrpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#re_common}.
	 * @param ctx the parse tree
	 */
	void enterRe_common(CiscoNxosParser.Re_commonContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#re_common}.
	 * @param ctx the parse tree
	 */
	void exitRe_common(CiscoNxosParser.Re_commonContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#re_flush_routes}.
	 * @param ctx the parse tree
	 */
	void enterRe_flush_routes(CiscoNxosParser.Re_flush_routesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#re_flush_routes}.
	 * @param ctx the parse tree
	 */
	void exitRe_flush_routes(CiscoNxosParser.Re_flush_routesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#re_isolate}.
	 * @param ctx the parse tree
	 */
	void enterRe_isolate(CiscoNxosParser.Re_isolateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#re_isolate}.
	 * @param ctx the parse tree
	 */
	void exitRe_isolate(CiscoNxosParser.Re_isolateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#re_no}.
	 * @param ctx the parse tree
	 */
	void enterRe_no(CiscoNxosParser.Re_noContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#re_no}.
	 * @param ctx the parse tree
	 */
	void exitRe_no(CiscoNxosParser.Re_noContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#re_no_flush_routes}.
	 * @param ctx the parse tree
	 */
	void enterRe_no_flush_routes(CiscoNxosParser.Re_no_flush_routesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#re_no_flush_routes}.
	 * @param ctx the parse tree
	 */
	void exitRe_no_flush_routes(CiscoNxosParser.Re_no_flush_routesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#re_no_isolate}.
	 * @param ctx the parse tree
	 */
	void enterRe_no_isolate(CiscoNxosParser.Re_no_isolateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#re_no_isolate}.
	 * @param ctx the parse tree
	 */
	void exitRe_no_isolate(CiscoNxosParser.Re_no_isolateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#re_vrf}.
	 * @param ctx the parse tree
	 */
	void enterRe_vrf(CiscoNxosParser.Re_vrfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#re_vrf}.
	 * @param ctx the parse tree
	 */
	void exitRe_vrf(CiscoNxosParser.Re_vrfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rec_address_family}.
	 * @param ctx the parse tree
	 */
	void enterRec_address_family(CiscoNxosParser.Rec_address_familyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rec_address_family}.
	 * @param ctx the parse tree
	 */
	void exitRec_address_family(CiscoNxosParser.Rec_address_familyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#recaf_ipv4}.
	 * @param ctx the parse tree
	 */
	void enterRecaf_ipv4(CiscoNxosParser.Recaf_ipv4Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#recaf_ipv4}.
	 * @param ctx the parse tree
	 */
	void exitRecaf_ipv4(CiscoNxosParser.Recaf_ipv4Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#recaf_ipv4_inner}.
	 * @param ctx the parse tree
	 */
	void enterRecaf_ipv4_inner(CiscoNxosParser.Recaf_ipv4_innerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#recaf_ipv4_inner}.
	 * @param ctx the parse tree
	 */
	void exitRecaf_ipv4_inner(CiscoNxosParser.Recaf_ipv4_innerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#recaf_ipv6}.
	 * @param ctx the parse tree
	 */
	void enterRecaf_ipv6(CiscoNxosParser.Recaf_ipv6Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#recaf_ipv6}.
	 * @param ctx the parse tree
	 */
	void exitRecaf_ipv6(CiscoNxosParser.Recaf_ipv6Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#recaf_common}.
	 * @param ctx the parse tree
	 */
	void enterRecaf_common(CiscoNxosParser.Recaf_commonContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#recaf_common}.
	 * @param ctx the parse tree
	 */
	void exitRecaf_common(CiscoNxosParser.Recaf_commonContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#recaf_default_metric}.
	 * @param ctx the parse tree
	 */
	void enterRecaf_default_metric(CiscoNxosParser.Recaf_default_metricContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#recaf_default_metric}.
	 * @param ctx the parse tree
	 */
	void exitRecaf_default_metric(CiscoNxosParser.Recaf_default_metricContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#recaf_eigrp}.
	 * @param ctx the parse tree
	 */
	void enterRecaf_eigrp(CiscoNxosParser.Recaf_eigrpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#recaf_eigrp}.
	 * @param ctx the parse tree
	 */
	void exitRecaf_eigrp(CiscoNxosParser.Recaf_eigrpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#recaf_network}.
	 * @param ctx the parse tree
	 */
	void enterRecaf_network(CiscoNxosParser.Recaf_networkContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#recaf_network}.
	 * @param ctx the parse tree
	 */
	void exitRecaf_network(CiscoNxosParser.Recaf_networkContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#recaf_router_id}.
	 * @param ctx the parse tree
	 */
	void enterRecaf_router_id(CiscoNxosParser.Recaf_router_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#recaf_router_id}.
	 * @param ctx the parse tree
	 */
	void exitRecaf_router_id(CiscoNxosParser.Recaf_router_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#recaf4_redistribute}.
	 * @param ctx the parse tree
	 */
	void enterRecaf4_redistribute(CiscoNxosParser.Recaf4_redistributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#recaf4_redistribute}.
	 * @param ctx the parse tree
	 */
	void exitRecaf4_redistribute(CiscoNxosParser.Recaf4_redistributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#recaf6_redistribute}.
	 * @param ctx the parse tree
	 */
	void enterRecaf6_redistribute(CiscoNxosParser.Recaf6_redistributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#recaf6_redistribute}.
	 * @param ctx the parse tree
	 */
	void exitRecaf6_redistribute(CiscoNxosParser.Recaf6_redistributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rec_autonomous_system}.
	 * @param ctx the parse tree
	 */
	void enterRec_autonomous_system(CiscoNxosParser.Rec_autonomous_systemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rec_autonomous_system}.
	 * @param ctx the parse tree
	 */
	void exitRec_autonomous_system(CiscoNxosParser.Rec_autonomous_systemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rec_distance}.
	 * @param ctx the parse tree
	 */
	void enterRec_distance(CiscoNxosParser.Rec_distanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rec_distance}.
	 * @param ctx the parse tree
	 */
	void exitRec_distance(CiscoNxosParser.Rec_distanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rec_no}.
	 * @param ctx the parse tree
	 */
	void enterRec_no(CiscoNxosParser.Rec_noContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rec_no}.
	 * @param ctx the parse tree
	 */
	void exitRec_no(CiscoNxosParser.Rec_noContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rec_no_passive_interface}.
	 * @param ctx the parse tree
	 */
	void enterRec_no_passive_interface(CiscoNxosParser.Rec_no_passive_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rec_no_passive_interface}.
	 * @param ctx the parse tree
	 */
	void exitRec_no_passive_interface(CiscoNxosParser.Rec_no_passive_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rec_no_router_id}.
	 * @param ctx the parse tree
	 */
	void enterRec_no_router_id(CiscoNxosParser.Rec_no_router_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rec_no_router_id}.
	 * @param ctx the parse tree
	 */
	void exitRec_no_router_id(CiscoNxosParser.Rec_no_router_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rec_no_shutdown}.
	 * @param ctx the parse tree
	 */
	void enterRec_no_shutdown(CiscoNxosParser.Rec_no_shutdownContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rec_no_shutdown}.
	 * @param ctx the parse tree
	 */
	void exitRec_no_shutdown(CiscoNxosParser.Rec_no_shutdownContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rec_passive_interface}.
	 * @param ctx the parse tree
	 */
	void enterRec_passive_interface(CiscoNxosParser.Rec_passive_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rec_passive_interface}.
	 * @param ctx the parse tree
	 */
	void exitRec_passive_interface(CiscoNxosParser.Rec_passive_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rec_router_id}.
	 * @param ctx the parse tree
	 */
	void enterRec_router_id(CiscoNxosParser.Rec_router_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rec_router_id}.
	 * @param ctx the parse tree
	 */
	void exitRec_router_id(CiscoNxosParser.Rec_router_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rec_shutdown}.
	 * @param ctx the parse tree
	 */
	void enterRec_shutdown(CiscoNxosParser.Rec_shutdownContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rec_shutdown}.
	 * @param ctx the parse tree
	 */
	void exitRec_shutdown(CiscoNxosParser.Rec_shutdownContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#s_evpn}.
	 * @param ctx the parse tree
	 */
	void enterS_evpn(CiscoNxosParser.S_evpnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#s_evpn}.
	 * @param ctx the parse tree
	 */
	void exitS_evpn(CiscoNxosParser.S_evpnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ev_vni}.
	 * @param ctx the parse tree
	 */
	void enterEv_vni(CiscoNxosParser.Ev_vniContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ev_vni}.
	 * @param ctx the parse tree
	 */
	void exitEv_vni(CiscoNxosParser.Ev_vniContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#evv_rd}.
	 * @param ctx the parse tree
	 */
	void enterEvv_rd(CiscoNxosParser.Evv_rdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#evv_rd}.
	 * @param ctx the parse tree
	 */
	void exitEvv_rd(CiscoNxosParser.Evv_rdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#evv_route_target}.
	 * @param ctx the parse tree
	 */
	void enterEvv_route_target(CiscoNxosParser.Evv_route_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#evv_route_target}.
	 * @param ctx the parse tree
	 */
	void exitEvv_route_target(CiscoNxosParser.Evv_route_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#s_fex}.
	 * @param ctx the parse tree
	 */
	void enterS_fex(CiscoNxosParser.S_fexContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#s_fex}.
	 * @param ctx the parse tree
	 */
	void exitS_fex(CiscoNxosParser.S_fexContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#fex_description}.
	 * @param ctx the parse tree
	 */
	void enterFex_description(CiscoNxosParser.Fex_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#fex_description}.
	 * @param ctx the parse tree
	 */
	void exitFex_description(CiscoNxosParser.Fex_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#fex_no}.
	 * @param ctx the parse tree
	 */
	void enterFex_no(CiscoNxosParser.Fex_noContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#fex_no}.
	 * @param ctx the parse tree
	 */
	void exitFex_no(CiscoNxosParser.Fex_noContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#fex_no_description}.
	 * @param ctx the parse tree
	 */
	void enterFex_no_description(CiscoNxosParser.Fex_no_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#fex_no_description}.
	 * @param ctx the parse tree
	 */
	void exitFex_no_description(CiscoNxosParser.Fex_no_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#fex_pinning}.
	 * @param ctx the parse tree
	 */
	void enterFex_pinning(CiscoNxosParser.Fex_pinningContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#fex_pinning}.
	 * @param ctx the parse tree
	 */
	void exitFex_pinning(CiscoNxosParser.Fex_pinningContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#fex_pinning_max_links_values}.
	 * @param ctx the parse tree
	 */
	void enterFex_pinning_max_links_values(CiscoNxosParser.Fex_pinning_max_links_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#fex_pinning_max_links_values}.
	 * @param ctx the parse tree
	 */
	void exitFex_pinning_max_links_values(CiscoNxosParser.Fex_pinning_max_links_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#s_flow}.
	 * @param ctx the parse tree
	 */
	void enterS_flow(CiscoNxosParser.S_flowContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#s_flow}.
	 * @param ctx the parse tree
	 */
	void exitS_flow(CiscoNxosParser.S_flowContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#flow_exporter}.
	 * @param ctx the parse tree
	 */
	void enterFlow_exporter(CiscoNxosParser.Flow_exporterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#flow_exporter}.
	 * @param ctx the parse tree
	 */
	void exitFlow_exporter(CiscoNxosParser.Flow_exporterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#fe_name}.
	 * @param ctx the parse tree
	 */
	void enterFe_name(CiscoNxosParser.Fe_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#fe_name}.
	 * @param ctx the parse tree
	 */
	void exitFe_name(CiscoNxosParser.Fe_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#fe_null}.
	 * @param ctx the parse tree
	 */
	void enterFe_null(CiscoNxosParser.Fe_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#fe_null}.
	 * @param ctx the parse tree
	 */
	void exitFe_null(CiscoNxosParser.Fe_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#fe_source}.
	 * @param ctx the parse tree
	 */
	void enterFe_source(CiscoNxosParser.Fe_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#fe_source}.
	 * @param ctx the parse tree
	 */
	void exitFe_source(CiscoNxosParser.Fe_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#flow_monitor}.
	 * @param ctx the parse tree
	 */
	void enterFlow_monitor(CiscoNxosParser.Flow_monitorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#flow_monitor}.
	 * @param ctx the parse tree
	 */
	void exitFlow_monitor(CiscoNxosParser.Flow_monitorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#fm_exporter}.
	 * @param ctx the parse tree
	 */
	void enterFm_exporter(CiscoNxosParser.Fm_exporterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#fm_exporter}.
	 * @param ctx the parse tree
	 */
	void exitFm_exporter(CiscoNxosParser.Fm_exporterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#fm_name}.
	 * @param ctx the parse tree
	 */
	void enterFm_name(CiscoNxosParser.Fm_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#fm_name}.
	 * @param ctx the parse tree
	 */
	void exitFm_name(CiscoNxosParser.Fm_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#fm_null}.
	 * @param ctx the parse tree
	 */
	void enterFm_null(CiscoNxosParser.Fm_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#fm_null}.
	 * @param ctx the parse tree
	 */
	void exitFm_null(CiscoNxosParser.Fm_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#fm_record}.
	 * @param ctx the parse tree
	 */
	void enterFm_record(CiscoNxosParser.Fm_recordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#fm_record}.
	 * @param ctx the parse tree
	 */
	void exitFm_record(CiscoNxosParser.Fm_recordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#flow_record}.
	 * @param ctx the parse tree
	 */
	void enterFlow_record(CiscoNxosParser.Flow_recordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#flow_record}.
	 * @param ctx the parse tree
	 */
	void exitFlow_record(CiscoNxosParser.Flow_recordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#fr_name}.
	 * @param ctx the parse tree
	 */
	void enterFr_name(CiscoNxosParser.Fr_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#fr_name}.
	 * @param ctx the parse tree
	 */
	void exitFr_name(CiscoNxosParser.Fr_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#fr_null}.
	 * @param ctx the parse tree
	 */
	void enterFr_null(CiscoNxosParser.Fr_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#fr_null}.
	 * @param ctx the parse tree
	 */
	void exitFr_null(CiscoNxosParser.Fr_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#s_interface}.
	 * @param ctx the parse tree
	 */
	void enterS_interface(CiscoNxosParser.S_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#s_interface}.
	 * @param ctx the parse tree
	 */
	void exitS_interface(CiscoNxosParser.S_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#s_interface_breakout}.
	 * @param ctx the parse tree
	 */
	void enterS_interface_breakout(CiscoNxosParser.S_interface_breakoutContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#s_interface_breakout}.
	 * @param ctx the parse tree
	 */
	void exitS_interface_breakout(CiscoNxosParser.S_interface_breakoutContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#s_interface_nve}.
	 * @param ctx the parse tree
	 */
	void enterS_interface_nve(CiscoNxosParser.S_interface_nveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#s_interface_nve}.
	 * @param ctx the parse tree
	 */
	void exitS_interface_nve(CiscoNxosParser.S_interface_nveContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#s_interface_regular}.
	 * @param ctx the parse tree
	 */
	void enterS_interface_regular(CiscoNxosParser.S_interface_regularContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#s_interface_regular}.
	 * @param ctx the parse tree
	 */
	void exitS_interface_regular(CiscoNxosParser.S_interface_regularContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_autostate}.
	 * @param ctx the parse tree
	 */
	void enterI_autostate(CiscoNxosParser.I_autostateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_autostate}.
	 * @param ctx the parse tree
	 */
	void exitI_autostate(CiscoNxosParser.I_autostateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_bandwidth}.
	 * @param ctx the parse tree
	 */
	void enterI_bandwidth(CiscoNxosParser.I_bandwidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_bandwidth}.
	 * @param ctx the parse tree
	 */
	void exitI_bandwidth(CiscoNxosParser.I_bandwidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#interface_bandwidth_kbps}.
	 * @param ctx the parse tree
	 */
	void enterInterface_bandwidth_kbps(CiscoNxosParser.Interface_bandwidth_kbpsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#interface_bandwidth_kbps}.
	 * @param ctx the parse tree
	 */
	void exitInterface_bandwidth_kbps(CiscoNxosParser.Interface_bandwidth_kbpsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_channel_group}.
	 * @param ctx the parse tree
	 */
	void enterI_channel_group(CiscoNxosParser.I_channel_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_channel_group}.
	 * @param ctx the parse tree
	 */
	void exitI_channel_group(CiscoNxosParser.I_channel_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#channel_id}.
	 * @param ctx the parse tree
	 */
	void enterChannel_id(CiscoNxosParser.Channel_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#channel_id}.
	 * @param ctx the parse tree
	 */
	void exitChannel_id(CiscoNxosParser.Channel_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_delay}.
	 * @param ctx the parse tree
	 */
	void enterI_delay(CiscoNxosParser.I_delayContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_delay}.
	 * @param ctx the parse tree
	 */
	void exitI_delay(CiscoNxosParser.I_delayContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#interface_delay_10us}.
	 * @param ctx the parse tree
	 */
	void enterInterface_delay_10us(CiscoNxosParser.Interface_delay_10usContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#interface_delay_10us}.
	 * @param ctx the parse tree
	 */
	void exitInterface_delay_10us(CiscoNxosParser.Interface_delay_10usContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_description}.
	 * @param ctx the parse tree
	 */
	void enterI_description(CiscoNxosParser.I_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_description}.
	 * @param ctx the parse tree
	 */
	void exitI_description(CiscoNxosParser.I_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#interface_description}.
	 * @param ctx the parse tree
	 */
	void enterInterface_description(CiscoNxosParser.Interface_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#interface_description}.
	 * @param ctx the parse tree
	 */
	void exitInterface_description(CiscoNxosParser.Interface_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_encapsulation}.
	 * @param ctx the parse tree
	 */
	void enterI_encapsulation(CiscoNxosParser.I_encapsulationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_encapsulation}.
	 * @param ctx the parse tree
	 */
	void exitI_encapsulation(CiscoNxosParser.I_encapsulationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_hsrp}.
	 * @param ctx the parse tree
	 */
	void enterI_hsrp(CiscoNxosParser.I_hsrpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_hsrp}.
	 * @param ctx the parse tree
	 */
	void exitI_hsrp(CiscoNxosParser.I_hsrpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ih_bfd}.
	 * @param ctx the parse tree
	 */
	void enterIh_bfd(CiscoNxosParser.Ih_bfdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ih_bfd}.
	 * @param ctx the parse tree
	 */
	void exitIh_bfd(CiscoNxosParser.Ih_bfdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ih_delay}.
	 * @param ctx the parse tree
	 */
	void enterIh_delay(CiscoNxosParser.Ih_delayContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ih_delay}.
	 * @param ctx the parse tree
	 */
	void exitIh_delay(CiscoNxosParser.Ih_delayContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ihd_minimum}.
	 * @param ctx the parse tree
	 */
	void enterIhd_minimum(CiscoNxosParser.Ihd_minimumContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ihd_minimum}.
	 * @param ctx the parse tree
	 */
	void exitIhd_minimum(CiscoNxosParser.Ihd_minimumContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#hsrp_delay_minimum}.
	 * @param ctx the parse tree
	 */
	void enterHsrp_delay_minimum(CiscoNxosParser.Hsrp_delay_minimumContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#hsrp_delay_minimum}.
	 * @param ctx the parse tree
	 */
	void exitHsrp_delay_minimum(CiscoNxosParser.Hsrp_delay_minimumContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ihd_reload}.
	 * @param ctx the parse tree
	 */
	void enterIhd_reload(CiscoNxosParser.Ihd_reloadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ihd_reload}.
	 * @param ctx the parse tree
	 */
	void exitIhd_reload(CiscoNxosParser.Ihd_reloadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#hsrp_delay_reload}.
	 * @param ctx the parse tree
	 */
	void enterHsrp_delay_reload(CiscoNxosParser.Hsrp_delay_reloadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#hsrp_delay_reload}.
	 * @param ctx the parse tree
	 */
	void exitHsrp_delay_reload(CiscoNxosParser.Hsrp_delay_reloadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ih_group}.
	 * @param ctx the parse tree
	 */
	void enterIh_group(CiscoNxosParser.Ih_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ih_group}.
	 * @param ctx the parse tree
	 */
	void exitIh_group(CiscoNxosParser.Ih_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ihg_ipv4}.
	 * @param ctx the parse tree
	 */
	void enterIhg_ipv4(CiscoNxosParser.Ihg_ipv4Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ihg_ipv4}.
	 * @param ctx the parse tree
	 */
	void exitIhg_ipv4(CiscoNxosParser.Ihg_ipv4Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ihg_ipv6}.
	 * @param ctx the parse tree
	 */
	void enterIhg_ipv6(CiscoNxosParser.Ihg_ipv6Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ihg_ipv6}.
	 * @param ctx the parse tree
	 */
	void exitIhg_ipv6(CiscoNxosParser.Ihg_ipv6Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ihg_common}.
	 * @param ctx the parse tree
	 */
	void enterIhg_common(CiscoNxosParser.Ihg_commonContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ihg_common}.
	 * @param ctx the parse tree
	 */
	void exitIhg_common(CiscoNxosParser.Ihg_commonContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#hsrp_group_number}.
	 * @param ctx the parse tree
	 */
	void enterHsrp_group_number(CiscoNxosParser.Hsrp_group_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#hsrp_group_number}.
	 * @param ctx the parse tree
	 */
	void exitHsrp_group_number(CiscoNxosParser.Hsrp_group_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ihg_authentication}.
	 * @param ctx the parse tree
	 */
	void enterIhg_authentication(CiscoNxosParser.Ihg_authenticationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ihg_authentication}.
	 * @param ctx the parse tree
	 */
	void exitIhg_authentication(CiscoNxosParser.Ihg_authenticationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ihga_md5}.
	 * @param ctx the parse tree
	 */
	void enterIhga_md5(CiscoNxosParser.Ihga_md5Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ihga_md5}.
	 * @param ctx the parse tree
	 */
	void exitIhga_md5(CiscoNxosParser.Ihga_md5Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ihga_text}.
	 * @param ctx the parse tree
	 */
	void enterIhga_text(CiscoNxosParser.Ihga_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ihga_text}.
	 * @param ctx the parse tree
	 */
	void exitIhga_text(CiscoNxosParser.Ihga_textContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#hsrp_authentication_string}.
	 * @param ctx the parse tree
	 */
	void enterHsrp_authentication_string(CiscoNxosParser.Hsrp_authentication_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#hsrp_authentication_string}.
	 * @param ctx the parse tree
	 */
	void exitHsrp_authentication_string(CiscoNxosParser.Hsrp_authentication_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ihgam_key_chain}.
	 * @param ctx the parse tree
	 */
	void enterIhgam_key_chain(CiscoNxosParser.Ihgam_key_chainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ihgam_key_chain}.
	 * @param ctx the parse tree
	 */
	void exitIhgam_key_chain(CiscoNxosParser.Ihgam_key_chainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ihg_mac_address}.
	 * @param ctx the parse tree
	 */
	void enterIhg_mac_address(CiscoNxosParser.Ihg_mac_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ihg_mac_address}.
	 * @param ctx the parse tree
	 */
	void exitIhg_mac_address(CiscoNxosParser.Ihg_mac_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ihg_name}.
	 * @param ctx the parse tree
	 */
	void enterIhg_name(CiscoNxosParser.Ihg_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ihg_name}.
	 * @param ctx the parse tree
	 */
	void exitIhg_name(CiscoNxosParser.Ihg_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ihg_no}.
	 * @param ctx the parse tree
	 */
	void enterIhg_no(CiscoNxosParser.Ihg_noContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ihg_no}.
	 * @param ctx the parse tree
	 */
	void exitIhg_no(CiscoNxosParser.Ihg_noContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ihg_no_preempt}.
	 * @param ctx the parse tree
	 */
	void enterIhg_no_preempt(CiscoNxosParser.Ihg_no_preemptContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ihg_no_preempt}.
	 * @param ctx the parse tree
	 */
	void exitIhg_no_preempt(CiscoNxosParser.Ihg_no_preemptContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ihg_preempt}.
	 * @param ctx the parse tree
	 */
	void enterIhg_preempt(CiscoNxosParser.Ihg_preemptContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ihg_preempt}.
	 * @param ctx the parse tree
	 */
	void exitIhg_preempt(CiscoNxosParser.Ihg_preemptContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#hsrp_preempt_delay}.
	 * @param ctx the parse tree
	 */
	void enterHsrp_preempt_delay(CiscoNxosParser.Hsrp_preempt_delayContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#hsrp_preempt_delay}.
	 * @param ctx the parse tree
	 */
	void exitHsrp_preempt_delay(CiscoNxosParser.Hsrp_preempt_delayContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ihg_priority}.
	 * @param ctx the parse tree
	 */
	void enterIhg_priority(CiscoNxosParser.Ihg_priorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ihg_priority}.
	 * @param ctx the parse tree
	 */
	void exitIhg_priority(CiscoNxosParser.Ihg_priorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ihg_timers}.
	 * @param ctx the parse tree
	 */
	void enterIhg_timers(CiscoNxosParser.Ihg_timersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ihg_timers}.
	 * @param ctx the parse tree
	 */
	void exitIhg_timers(CiscoNxosParser.Ihg_timersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#hsrp_timers_hello_interval_s}.
	 * @param ctx the parse tree
	 */
	void enterHsrp_timers_hello_interval_s(CiscoNxosParser.Hsrp_timers_hello_interval_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#hsrp_timers_hello_interval_s}.
	 * @param ctx the parse tree
	 */
	void exitHsrp_timers_hello_interval_s(CiscoNxosParser.Hsrp_timers_hello_interval_sContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#hsrp_timers_hello_interval_ms}.
	 * @param ctx the parse tree
	 */
	void enterHsrp_timers_hello_interval_ms(CiscoNxosParser.Hsrp_timers_hello_interval_msContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#hsrp_timers_hello_interval_ms}.
	 * @param ctx the parse tree
	 */
	void exitHsrp_timers_hello_interval_ms(CiscoNxosParser.Hsrp_timers_hello_interval_msContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#hsrp_timers_hold_time_s}.
	 * @param ctx the parse tree
	 */
	void enterHsrp_timers_hold_time_s(CiscoNxosParser.Hsrp_timers_hold_time_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#hsrp_timers_hold_time_s}.
	 * @param ctx the parse tree
	 */
	void exitHsrp_timers_hold_time_s(CiscoNxosParser.Hsrp_timers_hold_time_sContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#hsrp_timers_hold_time_ms}.
	 * @param ctx the parse tree
	 */
	void enterHsrp_timers_hold_time_ms(CiscoNxosParser.Hsrp_timers_hold_time_msContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#hsrp_timers_hold_time_ms}.
	 * @param ctx the parse tree
	 */
	void exitHsrp_timers_hold_time_ms(CiscoNxosParser.Hsrp_timers_hold_time_msContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ihg_track}.
	 * @param ctx the parse tree
	 */
	void enterIhg_track(CiscoNxosParser.Ihg_trackContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ihg_track}.
	 * @param ctx the parse tree
	 */
	void exitIhg_track(CiscoNxosParser.Ihg_trackContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#hsrp_track_decrement}.
	 * @param ctx the parse tree
	 */
	void enterHsrp_track_decrement(CiscoNxosParser.Hsrp_track_decrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#hsrp_track_decrement}.
	 * @param ctx the parse tree
	 */
	void exitHsrp_track_decrement(CiscoNxosParser.Hsrp_track_decrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ihg4_ip}.
	 * @param ctx the parse tree
	 */
	void enterIhg4_ip(CiscoNxosParser.Ihg4_ipContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ihg4_ip}.
	 * @param ctx the parse tree
	 */
	void exitIhg4_ip(CiscoNxosParser.Ihg4_ipContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ihg6_ip}.
	 * @param ctx the parse tree
	 */
	void enterIhg6_ip(CiscoNxosParser.Ihg6_ipContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ihg6_ip}.
	 * @param ctx the parse tree
	 */
	void exitIhg6_ip(CiscoNxosParser.Ihg6_ipContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ihg6_ip_address}.
	 * @param ctx the parse tree
	 */
	void enterIhg6_ip_address(CiscoNxosParser.Ihg6_ip_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ihg6_ip_address}.
	 * @param ctx the parse tree
	 */
	void exitIhg6_ip_address(CiscoNxosParser.Ihg6_ip_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ihg6_ip_autoconfig}.
	 * @param ctx the parse tree
	 */
	void enterIhg6_ip_autoconfig(CiscoNxosParser.Ihg6_ip_autoconfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ihg6_ip_autoconfig}.
	 * @param ctx the parse tree
	 */
	void exitIhg6_ip_autoconfig(CiscoNxosParser.Ihg6_ip_autoconfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ih_version}.
	 * @param ctx the parse tree
	 */
	void enterIh_version(CiscoNxosParser.Ih_versionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ih_version}.
	 * @param ctx the parse tree
	 */
	void exitIh_version(CiscoNxosParser.Ih_versionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#hsrp_version}.
	 * @param ctx the parse tree
	 */
	void enterHsrp_version(CiscoNxosParser.Hsrp_versionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#hsrp_version}.
	 * @param ctx the parse tree
	 */
	void exitHsrp_version(CiscoNxosParser.Hsrp_versionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_ip}.
	 * @param ctx the parse tree
	 */
	void enterI_ip(CiscoNxosParser.I_ipContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_ip}.
	 * @param ctx the parse tree
	 */
	void exitI_ip(CiscoNxosParser.I_ipContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_ip_access_group}.
	 * @param ctx the parse tree
	 */
	void enterI_ip_access_group(CiscoNxosParser.I_ip_access_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_ip_access_group}.
	 * @param ctx the parse tree
	 */
	void exitI_ip_access_group(CiscoNxosParser.I_ip_access_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_ip_address}.
	 * @param ctx the parse tree
	 */
	void enterI_ip_address(CiscoNxosParser.I_ip_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_ip_address}.
	 * @param ctx the parse tree
	 */
	void exitI_ip_address(CiscoNxosParser.I_ip_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_ip_authentication}.
	 * @param ctx the parse tree
	 */
	void enterI_ip_authentication(CiscoNxosParser.I_ip_authenticationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_ip_authentication}.
	 * @param ctx the parse tree
	 */
	void exitI_ip_authentication(CiscoNxosParser.I_ip_authenticationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#iipa_key_chain}.
	 * @param ctx the parse tree
	 */
	void enterIipa_key_chain(CiscoNxosParser.Iipa_key_chainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#iipa_key_chain}.
	 * @param ctx the parse tree
	 */
	void exitIipa_key_chain(CiscoNxosParser.Iipa_key_chainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#iipa_mode}.
	 * @param ctx the parse tree
	 */
	void enterIipa_mode(CiscoNxosParser.Iipa_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#iipa_mode}.
	 * @param ctx the parse tree
	 */
	void exitIipa_mode(CiscoNxosParser.Iipa_modeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_ip_address_concrete}.
	 * @param ctx the parse tree
	 */
	void enterI_ip_address_concrete(CiscoNxosParser.I_ip_address_concreteContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_ip_address_concrete}.
	 * @param ctx the parse tree
	 */
	void exitI_ip_address_concrete(CiscoNxosParser.I_ip_address_concreteContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_ip_bandwidth}.
	 * @param ctx the parse tree
	 */
	void enterI_ip_bandwidth(CiscoNxosParser.I_ip_bandwidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_ip_bandwidth}.
	 * @param ctx the parse tree
	 */
	void exitI_ip_bandwidth(CiscoNxosParser.I_ip_bandwidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_ip_delay}.
	 * @param ctx the parse tree
	 */
	void enterI_ip_delay(CiscoNxosParser.I_ip_delayContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_ip_delay}.
	 * @param ctx the parse tree
	 */
	void exitI_ip_delay(CiscoNxosParser.I_ip_delayContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_ip_address_dhcp}.
	 * @param ctx the parse tree
	 */
	void enterI_ip_address_dhcp(CiscoNxosParser.I_ip_address_dhcpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_ip_address_dhcp}.
	 * @param ctx the parse tree
	 */
	void exitI_ip_address_dhcp(CiscoNxosParser.I_ip_address_dhcpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_ip_dhcp}.
	 * @param ctx the parse tree
	 */
	void enterI_ip_dhcp(CiscoNxosParser.I_ip_dhcpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_ip_dhcp}.
	 * @param ctx the parse tree
	 */
	void exitI_ip_dhcp(CiscoNxosParser.I_ip_dhcpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_ip_dhcp_relay}.
	 * @param ctx the parse tree
	 */
	void enterI_ip_dhcp_relay(CiscoNxosParser.I_ip_dhcp_relayContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_ip_dhcp_relay}.
	 * @param ctx the parse tree
	 */
	void exitI_ip_dhcp_relay(CiscoNxosParser.I_ip_dhcp_relayContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_ip_distribute_list}.
	 * @param ctx the parse tree
	 */
	void enterI_ip_distribute_list(CiscoNxosParser.I_ip_distribute_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_ip_distribute_list}.
	 * @param ctx the parse tree
	 */
	void exitI_ip_distribute_list(CiscoNxosParser.I_ip_distribute_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#iipdl_prefix_list}.
	 * @param ctx the parse tree
	 */
	void enterIipdl_prefix_list(CiscoNxosParser.Iipdl_prefix_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#iipdl_prefix_list}.
	 * @param ctx the parse tree
	 */
	void exitIipdl_prefix_list(CiscoNxosParser.Iipdl_prefix_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#iipdl_route_map}.
	 * @param ctx the parse tree
	 */
	void enterIipdl_route_map(CiscoNxosParser.Iipdl_route_mapContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#iipdl_route_map}.
	 * @param ctx the parse tree
	 */
	void exitIipdl_route_map(CiscoNxosParser.Iipdl_route_mapContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_ip_eigrp}.
	 * @param ctx the parse tree
	 */
	void enterI_ip_eigrp(CiscoNxosParser.I_ip_eigrpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_ip_eigrp}.
	 * @param ctx the parse tree
	 */
	void exitI_ip_eigrp(CiscoNxosParser.I_ip_eigrpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_ip_eigrp_bfd}.
	 * @param ctx the parse tree
	 */
	void enterI_ip_eigrp_bfd(CiscoNxosParser.I_ip_eigrp_bfdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_ip_eigrp_bfd}.
	 * @param ctx the parse tree
	 */
	void exitI_ip_eigrp_bfd(CiscoNxosParser.I_ip_eigrp_bfdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_ip_forward}.
	 * @param ctx the parse tree
	 */
	void enterI_ip_forward(CiscoNxosParser.I_ip_forwardContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_ip_forward}.
	 * @param ctx the parse tree
	 */
	void exitI_ip_forward(CiscoNxosParser.I_ip_forwardContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_ip_igmp}.
	 * @param ctx the parse tree
	 */
	void enterI_ip_igmp(CiscoNxosParser.I_ip_igmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_ip_igmp}.
	 * @param ctx the parse tree
	 */
	void exitI_ip_igmp(CiscoNxosParser.I_ip_igmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#iipi_access_group}.
	 * @param ctx the parse tree
	 */
	void enterIipi_access_group(CiscoNxosParser.Iipi_access_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#iipi_access_group}.
	 * @param ctx the parse tree
	 */
	void exitIipi_access_group(CiscoNxosParser.Iipi_access_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#iipi_null}.
	 * @param ctx the parse tree
	 */
	void enterIipi_null(CiscoNxosParser.Iipi_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#iipi_null}.
	 * @param ctx the parse tree
	 */
	void exitIipi_null(CiscoNxosParser.Iipi_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_ip_hello_interval}.
	 * @param ctx the parse tree
	 */
	void enterI_ip_hello_interval(CiscoNxosParser.I_ip_hello_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_ip_hello_interval}.
	 * @param ctx the parse tree
	 */
	void exitI_ip_hello_interval(CiscoNxosParser.I_ip_hello_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_ip_hold_time}.
	 * @param ctx the parse tree
	 */
	void enterI_ip_hold_time(CiscoNxosParser.I_ip_hold_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_ip_hold_time}.
	 * @param ctx the parse tree
	 */
	void exitI_ip_hold_time(CiscoNxosParser.I_ip_hold_timeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_ip_null}.
	 * @param ctx the parse tree
	 */
	void enterI_ip_null(CiscoNxosParser.I_ip_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_ip_null}.
	 * @param ctx the parse tree
	 */
	void exitI_ip_null(CiscoNxosParser.I_ip_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_ip_ospf}.
	 * @param ctx the parse tree
	 */
	void enterI_ip_ospf(CiscoNxosParser.I_ip_ospfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_ip_ospf}.
	 * @param ctx the parse tree
	 */
	void exitI_ip_ospf(CiscoNxosParser.I_ip_ospfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_ip_passive_interface}.
	 * @param ctx the parse tree
	 */
	void enterI_ip_passive_interface(CiscoNxosParser.I_ip_passive_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_ip_passive_interface}.
	 * @param ctx the parse tree
	 */
	void exitI_ip_passive_interface(CiscoNxosParser.I_ip_passive_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_ip_pim}.
	 * @param ctx the parse tree
	 */
	void enterI_ip_pim(CiscoNxosParser.I_ip_pimContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_ip_pim}.
	 * @param ctx the parse tree
	 */
	void exitI_ip_pim(CiscoNxosParser.I_ip_pimContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#iipp_hello_authentication}.
	 * @param ctx the parse tree
	 */
	void enterIipp_hello_authentication(CiscoNxosParser.Iipp_hello_authenticationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#iipp_hello_authentication}.
	 * @param ctx the parse tree
	 */
	void exitIipp_hello_authentication(CiscoNxosParser.Iipp_hello_authenticationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#iipp_jp_policy}.
	 * @param ctx the parse tree
	 */
	void enterIipp_jp_policy(CiscoNxosParser.Iipp_jp_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#iipp_jp_policy}.
	 * @param ctx the parse tree
	 */
	void exitIipp_jp_policy(CiscoNxosParser.Iipp_jp_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#iipp_jp_policy_prefix_list}.
	 * @param ctx the parse tree
	 */
	void enterIipp_jp_policy_prefix_list(CiscoNxosParser.Iipp_jp_policy_prefix_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#iipp_jp_policy_prefix_list}.
	 * @param ctx the parse tree
	 */
	void exitIipp_jp_policy_prefix_list(CiscoNxosParser.Iipp_jp_policy_prefix_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#iipp_jp_policy_route_map}.
	 * @param ctx the parse tree
	 */
	void enterIipp_jp_policy_route_map(CiscoNxosParser.Iipp_jp_policy_route_mapContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#iipp_jp_policy_route_map}.
	 * @param ctx the parse tree
	 */
	void exitIipp_jp_policy_route_map(CiscoNxosParser.Iipp_jp_policy_route_mapContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#iipp_neighbor_policy}.
	 * @param ctx the parse tree
	 */
	void enterIipp_neighbor_policy(CiscoNxosParser.Iipp_neighbor_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#iipp_neighbor_policy}.
	 * @param ctx the parse tree
	 */
	void exitIipp_neighbor_policy(CiscoNxosParser.Iipp_neighbor_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#iipp_neighbor_policy_prefix_list}.
	 * @param ctx the parse tree
	 */
	void enterIipp_neighbor_policy_prefix_list(CiscoNxosParser.Iipp_neighbor_policy_prefix_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#iipp_neighbor_policy_prefix_list}.
	 * @param ctx the parse tree
	 */
	void exitIipp_neighbor_policy_prefix_list(CiscoNxosParser.Iipp_neighbor_policy_prefix_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#iipp_neighbor_policy_route_map}.
	 * @param ctx the parse tree
	 */
	void enterIipp_neighbor_policy_route_map(CiscoNxosParser.Iipp_neighbor_policy_route_mapContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#iipp_neighbor_policy_route_map}.
	 * @param ctx the parse tree
	 */
	void exitIipp_neighbor_policy_route_map(CiscoNxosParser.Iipp_neighbor_policy_route_mapContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#iipp_null}.
	 * @param ctx the parse tree
	 */
	void enterIipp_null(CiscoNxosParser.Iipp_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#iipp_null}.
	 * @param ctx the parse tree
	 */
	void exitIipp_null(CiscoNxosParser.Iipp_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_ip_policy}.
	 * @param ctx the parse tree
	 */
	void enterI_ip_policy(CiscoNxosParser.I_ip_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_ip_policy}.
	 * @param ctx the parse tree
	 */
	void exitI_ip_policy(CiscoNxosParser.I_ip_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_ip_port}.
	 * @param ctx the parse tree
	 */
	void enterI_ip_port(CiscoNxosParser.I_ip_portContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_ip_port}.
	 * @param ctx the parse tree
	 */
	void exitI_ip_port(CiscoNxosParser.I_ip_portContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#iip_port_access_group}.
	 * @param ctx the parse tree
	 */
	void enterIip_port_access_group(CiscoNxosParser.Iip_port_access_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#iip_port_access_group}.
	 * @param ctx the parse tree
	 */
	void exitIip_port_access_group(CiscoNxosParser.Iip_port_access_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_ip_port_unreachable}.
	 * @param ctx the parse tree
	 */
	void enterI_ip_port_unreachable(CiscoNxosParser.I_ip_port_unreachableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_ip_port_unreachable}.
	 * @param ctx the parse tree
	 */
	void exitI_ip_port_unreachable(CiscoNxosParser.I_ip_port_unreachableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_ip_proxy_arp}.
	 * @param ctx the parse tree
	 */
	void enterI_ip_proxy_arp(CiscoNxosParser.I_ip_proxy_arpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_ip_proxy_arp}.
	 * @param ctx the parse tree
	 */
	void exitI_ip_proxy_arp(CiscoNxosParser.I_ip_proxy_arpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_ip_sticky_arp}.
	 * @param ctx the parse tree
	 */
	void enterI_ip_sticky_arp(CiscoNxosParser.I_ip_sticky_arpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_ip_sticky_arp}.
	 * @param ctx the parse tree
	 */
	void exitI_ip_sticky_arp(CiscoNxosParser.I_ip_sticky_arpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#iipo_authentication}.
	 * @param ctx the parse tree
	 */
	void enterIipo_authentication(CiscoNxosParser.Iipo_authenticationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#iipo_authentication}.
	 * @param ctx the parse tree
	 */
	void exitIipo_authentication(CiscoNxosParser.Iipo_authenticationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#iipoa_authentication}.
	 * @param ctx the parse tree
	 */
	void enterIipoa_authentication(CiscoNxosParser.Iipoa_authenticationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#iipoa_authentication}.
	 * @param ctx the parse tree
	 */
	void exitIipoa_authentication(CiscoNxosParser.Iipoa_authenticationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#iipoa_key_chain}.
	 * @param ctx the parse tree
	 */
	void enterIipoa_key_chain(CiscoNxosParser.Iipoa_key_chainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#iipoa_key_chain}.
	 * @param ctx the parse tree
	 */
	void exitIipoa_key_chain(CiscoNxosParser.Iipoa_key_chainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#iipoa_message_digest}.
	 * @param ctx the parse tree
	 */
	void enterIipoa_message_digest(CiscoNxosParser.Iipoa_message_digestContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#iipoa_message_digest}.
	 * @param ctx the parse tree
	 */
	void exitIipoa_message_digest(CiscoNxosParser.Iipoa_message_digestContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#iipoa_null}.
	 * @param ctx the parse tree
	 */
	void enterIipoa_null(CiscoNxosParser.Iipoa_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#iipoa_null}.
	 * @param ctx the parse tree
	 */
	void exitIipoa_null(CiscoNxosParser.Iipoa_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#iipo_bfd}.
	 * @param ctx the parse tree
	 */
	void enterIipo_bfd(CiscoNxosParser.Iipo_bfdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#iipo_bfd}.
	 * @param ctx the parse tree
	 */
	void exitIipo_bfd(CiscoNxosParser.Iipo_bfdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#iipo_cost}.
	 * @param ctx the parse tree
	 */
	void enterIipo_cost(CiscoNxosParser.Iipo_costContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#iipo_cost}.
	 * @param ctx the parse tree
	 */
	void exitIipo_cost(CiscoNxosParser.Iipo_costContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#interface_ospf_cost}.
	 * @param ctx the parse tree
	 */
	void enterInterface_ospf_cost(CiscoNxosParser.Interface_ospf_costContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#interface_ospf_cost}.
	 * @param ctx the parse tree
	 */
	void exitInterface_ospf_cost(CiscoNxosParser.Interface_ospf_costContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#iipo_dead_interval}.
	 * @param ctx the parse tree
	 */
	void enterIipo_dead_interval(CiscoNxosParser.Iipo_dead_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#iipo_dead_interval}.
	 * @param ctx the parse tree
	 */
	void exitIipo_dead_interval(CiscoNxosParser.Iipo_dead_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ospf_dead_interval}.
	 * @param ctx the parse tree
	 */
	void enterOspf_dead_interval(CiscoNxosParser.Ospf_dead_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ospf_dead_interval}.
	 * @param ctx the parse tree
	 */
	void exitOspf_dead_interval(CiscoNxosParser.Ospf_dead_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#iipo_hello_interval}.
	 * @param ctx the parse tree
	 */
	void enterIipo_hello_interval(CiscoNxosParser.Iipo_hello_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#iipo_hello_interval}.
	 * @param ctx the parse tree
	 */
	void exitIipo_hello_interval(CiscoNxosParser.Iipo_hello_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ospf_hello_interval}.
	 * @param ctx the parse tree
	 */
	void enterOspf_hello_interval(CiscoNxosParser.Ospf_hello_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ospf_hello_interval}.
	 * @param ctx the parse tree
	 */
	void exitOspf_hello_interval(CiscoNxosParser.Ospf_hello_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#iipo_message_digest_key}.
	 * @param ctx the parse tree
	 */
	void enterIipo_message_digest_key(CiscoNxosParser.Iipo_message_digest_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#iipo_message_digest_key}.
	 * @param ctx the parse tree
	 */
	void exitIipo_message_digest_key(CiscoNxosParser.Iipo_message_digest_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#iipo_network}.
	 * @param ctx the parse tree
	 */
	void enterIipo_network(CiscoNxosParser.Iipo_networkContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#iipo_network}.
	 * @param ctx the parse tree
	 */
	void exitIipo_network(CiscoNxosParser.Iipo_networkContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#iipo_passive_interface}.
	 * @param ctx the parse tree
	 */
	void enterIipo_passive_interface(CiscoNxosParser.Iipo_passive_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#iipo_passive_interface}.
	 * @param ctx the parse tree
	 */
	void exitIipo_passive_interface(CiscoNxosParser.Iipo_passive_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#iipo_priority}.
	 * @param ctx the parse tree
	 */
	void enterIipo_priority(CiscoNxosParser.Iipo_priorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#iipo_priority}.
	 * @param ctx the parse tree
	 */
	void exitIipo_priority(CiscoNxosParser.Iipo_priorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_ip_rip}.
	 * @param ctx the parse tree
	 */
	void enterI_ip_rip(CiscoNxosParser.I_ip_ripContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_ip_rip}.
	 * @param ctx the parse tree
	 */
	void exitI_ip_rip(CiscoNxosParser.I_ip_ripContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#iiprip_authentication}.
	 * @param ctx the parse tree
	 */
	void enterIiprip_authentication(CiscoNxosParser.Iiprip_authenticationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#iiprip_authentication}.
	 * @param ctx the parse tree
	 */
	void exitIiprip_authentication(CiscoNxosParser.Iiprip_authenticationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#iiprip_a_mode}.
	 * @param ctx the parse tree
	 */
	void enterIiprip_a_mode(CiscoNxosParser.Iiprip_a_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#iiprip_a_mode}.
	 * @param ctx the parse tree
	 */
	void exitIiprip_a_mode(CiscoNxosParser.Iiprip_a_modeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#iiprip_a_key_chain}.
	 * @param ctx the parse tree
	 */
	void enterIiprip_a_key_chain(CiscoNxosParser.Iiprip_a_key_chainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#iiprip_a_key_chain}.
	 * @param ctx the parse tree
	 */
	void exitIiprip_a_key_chain(CiscoNxosParser.Iiprip_a_key_chainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#iiprip_route_filter}.
	 * @param ctx the parse tree
	 */
	void enterIiprip_route_filter(CiscoNxosParser.Iiprip_route_filterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#iiprip_route_filter}.
	 * @param ctx the parse tree
	 */
	void exitIiprip_route_filter(CiscoNxosParser.Iiprip_route_filterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#iiprip_rf_prefix_list}.
	 * @param ctx the parse tree
	 */
	void enterIiprip_rf_prefix_list(CiscoNxosParser.Iiprip_rf_prefix_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#iiprip_rf_prefix_list}.
	 * @param ctx the parse tree
	 */
	void exitIiprip_rf_prefix_list(CiscoNxosParser.Iiprip_rf_prefix_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#iiprip_rf_route_map}.
	 * @param ctx the parse tree
	 */
	void enterIiprip_rf_route_map(CiscoNxosParser.Iiprip_rf_route_mapContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#iiprip_rf_route_map}.
	 * @param ctx the parse tree
	 */
	void exitIiprip_rf_route_map(CiscoNxosParser.Iiprip_rf_route_mapContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_ip_router}.
	 * @param ctx the parse tree
	 */
	void enterI_ip_router(CiscoNxosParser.I_ip_routerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_ip_router}.
	 * @param ctx the parse tree
	 */
	void exitI_ip_router(CiscoNxosParser.I_ip_routerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#iipr_eigrp}.
	 * @param ctx the parse tree
	 */
	void enterIipr_eigrp(CiscoNxosParser.Iipr_eigrpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#iipr_eigrp}.
	 * @param ctx the parse tree
	 */
	void exitIipr_eigrp(CiscoNxosParser.Iipr_eigrpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#iipr_ospf}.
	 * @param ctx the parse tree
	 */
	void enterIipr_ospf(CiscoNxosParser.Iipr_ospfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#iipr_ospf}.
	 * @param ctx the parse tree
	 */
	void exitIipr_ospf(CiscoNxosParser.Iipr_ospfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#iipr_rip}.
	 * @param ctx the parse tree
	 */
	void enterIipr_rip(CiscoNxosParser.Iipr_ripContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#iipr_rip}.
	 * @param ctx the parse tree
	 */
	void exitIipr_rip(CiscoNxosParser.Iipr_ripContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_ipv6}.
	 * @param ctx the parse tree
	 */
	void enterI_ipv6(CiscoNxosParser.I_ipv6Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_ipv6}.
	 * @param ctx the parse tree
	 */
	void exitI_ipv6(CiscoNxosParser.I_ipv6Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#iip6_address}.
	 * @param ctx the parse tree
	 */
	void enterIip6_address(CiscoNxosParser.Iip6_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#iip6_address}.
	 * @param ctx the parse tree
	 */
	void exitIip6_address(CiscoNxosParser.Iip6_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_ipv6_address_concrete}.
	 * @param ctx the parse tree
	 */
	void enterI_ipv6_address_concrete(CiscoNxosParser.I_ipv6_address_concreteContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_ipv6_address_concrete}.
	 * @param ctx the parse tree
	 */
	void exitI_ipv6_address_concrete(CiscoNxosParser.I_ipv6_address_concreteContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_ipv6_address_dhcp}.
	 * @param ctx the parse tree
	 */
	void enterI_ipv6_address_dhcp(CiscoNxosParser.I_ipv6_address_dhcpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_ipv6_address_dhcp}.
	 * @param ctx the parse tree
	 */
	void exitI_ipv6_address_dhcp(CiscoNxosParser.I_ipv6_address_dhcpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#iip6_null}.
	 * @param ctx the parse tree
	 */
	void enterIip6_null(CiscoNxosParser.Iip6_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#iip6_null}.
	 * @param ctx the parse tree
	 */
	void exitIip6_null(CiscoNxosParser.Iip6_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#iip6_router}.
	 * @param ctx the parse tree
	 */
	void enterIip6_router(CiscoNxosParser.Iip6_routerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#iip6_router}.
	 * @param ctx the parse tree
	 */
	void exitIip6_router(CiscoNxosParser.Iip6_routerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#iip6_traffic_filter}.
	 * @param ctx the parse tree
	 */
	void enterIip6_traffic_filter(CiscoNxosParser.Iip6_traffic_filterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#iip6_traffic_filter}.
	 * @param ctx the parse tree
	 */
	void exitIip6_traffic_filter(CiscoNxosParser.Iip6_traffic_filterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#iip6r_ospfv3}.
	 * @param ctx the parse tree
	 */
	void enterIip6r_ospfv3(CiscoNxosParser.Iip6r_ospfv3Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#iip6r_ospfv3}.
	 * @param ctx the parse tree
	 */
	void exitIip6r_ospfv3(CiscoNxosParser.Iip6r_ospfv3Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_lacp}.
	 * @param ctx the parse tree
	 */
	void enterI_lacp(CiscoNxosParser.I_lacpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_lacp}.
	 * @param ctx the parse tree
	 */
	void exitI_lacp(CiscoNxosParser.I_lacpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#il_min_links}.
	 * @param ctx the parse tree
	 */
	void enterIl_min_links(CiscoNxosParser.Il_min_linksContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#il_min_links}.
	 * @param ctx the parse tree
	 */
	void exitIl_min_links(CiscoNxosParser.Il_min_linksContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#min_links_number}.
	 * @param ctx the parse tree
	 */
	void enterMin_links_number(CiscoNxosParser.Min_links_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#min_links_number}.
	 * @param ctx the parse tree
	 */
	void exitMin_links_number(CiscoNxosParser.Min_links_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#il_null}.
	 * @param ctx the parse tree
	 */
	void enterIl_null(CiscoNxosParser.Il_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#il_null}.
	 * @param ctx the parse tree
	 */
	void exitIl_null(CiscoNxosParser.Il_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_mac_address}.
	 * @param ctx the parse tree
	 */
	void enterI_mac_address(CiscoNxosParser.I_mac_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_mac_address}.
	 * @param ctx the parse tree
	 */
	void exitI_mac_address(CiscoNxosParser.I_mac_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_mtu}.
	 * @param ctx the parse tree
	 */
	void enterI_mtu(CiscoNxosParser.I_mtuContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_mtu}.
	 * @param ctx the parse tree
	 */
	void exitI_mtu(CiscoNxosParser.I_mtuContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#interface_mtu}.
	 * @param ctx the parse tree
	 */
	void enterInterface_mtu(CiscoNxosParser.Interface_mtuContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#interface_mtu}.
	 * @param ctx the parse tree
	 */
	void exitInterface_mtu(CiscoNxosParser.Interface_mtuContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_no}.
	 * @param ctx the parse tree
	 */
	void enterI_no(CiscoNxosParser.I_noContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_no}.
	 * @param ctx the parse tree
	 */
	void exitI_no(CiscoNxosParser.I_noContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_no_autostate}.
	 * @param ctx the parse tree
	 */
	void enterI_no_autostate(CiscoNxosParser.I_no_autostateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_no_autostate}.
	 * @param ctx the parse tree
	 */
	void exitI_no_autostate(CiscoNxosParser.I_no_autostateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_no_bandwidth}.
	 * @param ctx the parse tree
	 */
	void enterI_no_bandwidth(CiscoNxosParser.I_no_bandwidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_no_bandwidth}.
	 * @param ctx the parse tree
	 */
	void exitI_no_bandwidth(CiscoNxosParser.I_no_bandwidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_no_bandwidth_inherit}.
	 * @param ctx the parse tree
	 */
	void enterI_no_bandwidth_inherit(CiscoNxosParser.I_no_bandwidth_inheritContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_no_bandwidth_inherit}.
	 * @param ctx the parse tree
	 */
	void exitI_no_bandwidth_inherit(CiscoNxosParser.I_no_bandwidth_inheritContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_no_bfd}.
	 * @param ctx the parse tree
	 */
	void enterI_no_bfd(CiscoNxosParser.I_no_bfdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_no_bfd}.
	 * @param ctx the parse tree
	 */
	void exitI_no_bfd(CiscoNxosParser.I_no_bfdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_no_description}.
	 * @param ctx the parse tree
	 */
	void enterI_no_description(CiscoNxosParser.I_no_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_no_description}.
	 * @param ctx the parse tree
	 */
	void exitI_no_description(CiscoNxosParser.I_no_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_no_ip}.
	 * @param ctx the parse tree
	 */
	void enterI_no_ip(CiscoNxosParser.I_no_ipContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_no_ip}.
	 * @param ctx the parse tree
	 */
	void exitI_no_ip(CiscoNxosParser.I_no_ipContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#inoip_null}.
	 * @param ctx the parse tree
	 */
	void enterInoip_null(CiscoNxosParser.Inoip_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#inoip_null}.
	 * @param ctx the parse tree
	 */
	void exitInoip_null(CiscoNxosParser.Inoip_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#inoip_forward}.
	 * @param ctx the parse tree
	 */
	void enterInoip_forward(CiscoNxosParser.Inoip_forwardContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#inoip_forward}.
	 * @param ctx the parse tree
	 */
	void exitInoip_forward(CiscoNxosParser.Inoip_forwardContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#inoip_ospf}.
	 * @param ctx the parse tree
	 */
	void enterInoip_ospf(CiscoNxosParser.Inoip_ospfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#inoip_ospf}.
	 * @param ctx the parse tree
	 */
	void exitInoip_ospf(CiscoNxosParser.Inoip_ospfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#inoip_proxy_arp}.
	 * @param ctx the parse tree
	 */
	void enterInoip_proxy_arp(CiscoNxosParser.Inoip_proxy_arpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#inoip_proxy_arp}.
	 * @param ctx the parse tree
	 */
	void exitInoip_proxy_arp(CiscoNxosParser.Inoip_proxy_arpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#inoipo_passive_interface}.
	 * @param ctx the parse tree
	 */
	void enterInoipo_passive_interface(CiscoNxosParser.Inoipo_passive_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#inoipo_passive_interface}.
	 * @param ctx the parse tree
	 */
	void exitInoipo_passive_interface(CiscoNxosParser.Inoipo_passive_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_no_ipv6}.
	 * @param ctx the parse tree
	 */
	void enterI_no_ipv6(CiscoNxosParser.I_no_ipv6Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_no_ipv6}.
	 * @param ctx the parse tree
	 */
	void exitI_no_ipv6(CiscoNxosParser.I_no_ipv6Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#inoip6_null}.
	 * @param ctx the parse tree
	 */
	void enterInoip6_null(CiscoNxosParser.Inoip6_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#inoip6_null}.
	 * @param ctx the parse tree
	 */
	void exitInoip6_null(CiscoNxosParser.Inoip6_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_no_mac_address}.
	 * @param ctx the parse tree
	 */
	void enterI_no_mac_address(CiscoNxosParser.I_no_mac_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_no_mac_address}.
	 * @param ctx the parse tree
	 */
	void exitI_no_mac_address(CiscoNxosParser.I_no_mac_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_no_null}.
	 * @param ctx the parse tree
	 */
	void enterI_no_null(CiscoNxosParser.I_no_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_no_null}.
	 * @param ctx the parse tree
	 */
	void exitI_no_null(CiscoNxosParser.I_no_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_no_shutdown}.
	 * @param ctx the parse tree
	 */
	void enterI_no_shutdown(CiscoNxosParser.I_no_shutdownContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_no_shutdown}.
	 * @param ctx the parse tree
	 */
	void exitI_no_shutdown(CiscoNxosParser.I_no_shutdownContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#inoshut}.
	 * @param ctx the parse tree
	 */
	void enterInoshut(CiscoNxosParser.InoshutContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#inoshut}.
	 * @param ctx the parse tree
	 */
	void exitInoshut(CiscoNxosParser.InoshutContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#inoshut_lan}.
	 * @param ctx the parse tree
	 */
	void enterInoshut_lan(CiscoNxosParser.Inoshut_lanContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#inoshut_lan}.
	 * @param ctx the parse tree
	 */
	void exitInoshut_lan(CiscoNxosParser.Inoshut_lanContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_no_switchport}.
	 * @param ctx the parse tree
	 */
	void enterI_no_switchport(CiscoNxosParser.I_no_switchportContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_no_switchport}.
	 * @param ctx the parse tree
	 */
	void exitI_no_switchport(CiscoNxosParser.I_no_switchportContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#inos_access}.
	 * @param ctx the parse tree
	 */
	void enterInos_access(CiscoNxosParser.Inos_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#inos_access}.
	 * @param ctx the parse tree
	 */
	void exitInos_access(CiscoNxosParser.Inos_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#inos_block}.
	 * @param ctx the parse tree
	 */
	void enterInos_block(CiscoNxosParser.Inos_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#inos_block}.
	 * @param ctx the parse tree
	 */
	void exitInos_block(CiscoNxosParser.Inos_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#inos_dot1q}.
	 * @param ctx the parse tree
	 */
	void enterInos_dot1q(CiscoNxosParser.Inos_dot1qContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#inos_dot1q}.
	 * @param ctx the parse tree
	 */
	void exitInos_dot1q(CiscoNxosParser.Inos_dot1qContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#inos_host}.
	 * @param ctx the parse tree
	 */
	void enterInos_host(CiscoNxosParser.Inos_hostContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#inos_host}.
	 * @param ctx the parse tree
	 */
	void exitInos_host(CiscoNxosParser.Inos_hostContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#inos_monitor}.
	 * @param ctx the parse tree
	 */
	void enterInos_monitor(CiscoNxosParser.Inos_monitorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#inos_monitor}.
	 * @param ctx the parse tree
	 */
	void exitInos_monitor(CiscoNxosParser.Inos_monitorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#inos_priority}.
	 * @param ctx the parse tree
	 */
	void enterInos_priority(CiscoNxosParser.Inos_priorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#inos_priority}.
	 * @param ctx the parse tree
	 */
	void exitInos_priority(CiscoNxosParser.Inos_priorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#inos_switchport}.
	 * @param ctx the parse tree
	 */
	void enterInos_switchport(CiscoNxosParser.Inos_switchportContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#inos_switchport}.
	 * @param ctx the parse tree
	 */
	void exitInos_switchport(CiscoNxosParser.Inos_switchportContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_null}.
	 * @param ctx the parse tree
	 */
	void enterI_null(CiscoNxosParser.I_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_null}.
	 * @param ctx the parse tree
	 */
	void exitI_null(CiscoNxosParser.I_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_ospfv3}.
	 * @param ctx the parse tree
	 */
	void enterI_ospfv3(CiscoNxosParser.I_ospfv3Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_ospfv3}.
	 * @param ctx the parse tree
	 */
	void exitI_ospfv3(CiscoNxosParser.I_ospfv3Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#io3_bfd}.
	 * @param ctx the parse tree
	 */
	void enterIo3_bfd(CiscoNxosParser.Io3_bfdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#io3_bfd}.
	 * @param ctx the parse tree
	 */
	void exitIo3_bfd(CiscoNxosParser.Io3_bfdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#io3_cost}.
	 * @param ctx the parse tree
	 */
	void enterIo3_cost(CiscoNxosParser.Io3_costContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#io3_cost}.
	 * @param ctx the parse tree
	 */
	void exitIo3_cost(CiscoNxosParser.Io3_costContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#io3_dead_interval}.
	 * @param ctx the parse tree
	 */
	void enterIo3_dead_interval(CiscoNxosParser.Io3_dead_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#io3_dead_interval}.
	 * @param ctx the parse tree
	 */
	void exitIo3_dead_interval(CiscoNxosParser.Io3_dead_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#io3_hello_interval}.
	 * @param ctx the parse tree
	 */
	void enterIo3_hello_interval(CiscoNxosParser.Io3_hello_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#io3_hello_interval}.
	 * @param ctx the parse tree
	 */
	void exitIo3_hello_interval(CiscoNxosParser.Io3_hello_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#io3_network}.
	 * @param ctx the parse tree
	 */
	void enterIo3_network(CiscoNxosParser.Io3_networkContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#io3_network}.
	 * @param ctx the parse tree
	 */
	void exitIo3_network(CiscoNxosParser.Io3_networkContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_private_vlan}.
	 * @param ctx the parse tree
	 */
	void enterI_private_vlan(CiscoNxosParser.I_private_vlanContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_private_vlan}.
	 * @param ctx the parse tree
	 */
	void exitI_private_vlan(CiscoNxosParser.I_private_vlanContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_service_policy}.
	 * @param ctx the parse tree
	 */
	void enterI_service_policy(CiscoNxosParser.I_service_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_service_policy}.
	 * @param ctx the parse tree
	 */
	void exitI_service_policy(CiscoNxosParser.I_service_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#isp_type}.
	 * @param ctx the parse tree
	 */
	void enterIsp_type(CiscoNxosParser.Isp_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#isp_type}.
	 * @param ctx the parse tree
	 */
	void exitIsp_type(CiscoNxosParser.Isp_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ispt_qos}.
	 * @param ctx the parse tree
	 */
	void enterIspt_qos(CiscoNxosParser.Ispt_qosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ispt_qos}.
	 * @param ctx the parse tree
	 */
	void exitIspt_qos(CiscoNxosParser.Ispt_qosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ispt_queuing}.
	 * @param ctx the parse tree
	 */
	void enterIspt_queuing(CiscoNxosParser.Ispt_queuingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ispt_queuing}.
	 * @param ctx the parse tree
	 */
	void exitIspt_queuing(CiscoNxosParser.Ispt_queuingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_shutdown}.
	 * @param ctx the parse tree
	 */
	void enterI_shutdown(CiscoNxosParser.I_shutdownContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_shutdown}.
	 * @param ctx the parse tree
	 */
	void exitI_shutdown(CiscoNxosParser.I_shutdownContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_speed}.
	 * @param ctx the parse tree
	 */
	void enterI_speed(CiscoNxosParser.I_speedContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_speed}.
	 * @param ctx the parse tree
	 */
	void exitI_speed(CiscoNxosParser.I_speedContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_speed_auto}.
	 * @param ctx the parse tree
	 */
	void enterI_speed_auto(CiscoNxosParser.I_speed_autoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_speed_auto}.
	 * @param ctx the parse tree
	 */
	void exitI_speed_auto(CiscoNxosParser.I_speed_autoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_speed_number}.
	 * @param ctx the parse tree
	 */
	void enterI_speed_number(CiscoNxosParser.I_speed_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_speed_number}.
	 * @param ctx the parse tree
	 */
	void exitI_speed_number(CiscoNxosParser.I_speed_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#interface_speed}.
	 * @param ctx the parse tree
	 */
	void enterInterface_speed(CiscoNxosParser.Interface_speedContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#interface_speed}.
	 * @param ctx the parse tree
	 */
	void exitInterface_speed(CiscoNxosParser.Interface_speedContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_switchport}.
	 * @param ctx the parse tree
	 */
	void enterI_switchport(CiscoNxosParser.I_switchportContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_switchport}.
	 * @param ctx the parse tree
	 */
	void exitI_switchport(CiscoNxosParser.I_switchportContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_switchport_access}.
	 * @param ctx the parse tree
	 */
	void enterI_switchport_access(CiscoNxosParser.I_switchport_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_switchport_access}.
	 * @param ctx the parse tree
	 */
	void exitI_switchport_access(CiscoNxosParser.I_switchport_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_switchport_mode}.
	 * @param ctx the parse tree
	 */
	void enterI_switchport_mode(CiscoNxosParser.I_switchport_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_switchport_mode}.
	 * @param ctx the parse tree
	 */
	void exitI_switchport_mode(CiscoNxosParser.I_switchport_modeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_switchport_mode_access}.
	 * @param ctx the parse tree
	 */
	void enterI_switchport_mode_access(CiscoNxosParser.I_switchport_mode_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_switchport_mode_access}.
	 * @param ctx the parse tree
	 */
	void exitI_switchport_mode_access(CiscoNxosParser.I_switchport_mode_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_switchport_mode_dot1q_tunnel}.
	 * @param ctx the parse tree
	 */
	void enterI_switchport_mode_dot1q_tunnel(CiscoNxosParser.I_switchport_mode_dot1q_tunnelContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_switchport_mode_dot1q_tunnel}.
	 * @param ctx the parse tree
	 */
	void exitI_switchport_mode_dot1q_tunnel(CiscoNxosParser.I_switchport_mode_dot1q_tunnelContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_switchport_mode_fex_fabric}.
	 * @param ctx the parse tree
	 */
	void enterI_switchport_mode_fex_fabric(CiscoNxosParser.I_switchport_mode_fex_fabricContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_switchport_mode_fex_fabric}.
	 * @param ctx the parse tree
	 */
	void exitI_switchport_mode_fex_fabric(CiscoNxosParser.I_switchport_mode_fex_fabricContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_switchport_mode_monitor}.
	 * @param ctx the parse tree
	 */
	void enterI_switchport_mode_monitor(CiscoNxosParser.I_switchport_mode_monitorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_switchport_mode_monitor}.
	 * @param ctx the parse tree
	 */
	void exitI_switchport_mode_monitor(CiscoNxosParser.I_switchport_mode_monitorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_switchport_mode_trunk}.
	 * @param ctx the parse tree
	 */
	void enterI_switchport_mode_trunk(CiscoNxosParser.I_switchport_mode_trunkContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_switchport_mode_trunk}.
	 * @param ctx the parse tree
	 */
	void exitI_switchport_mode_trunk(CiscoNxosParser.I_switchport_mode_trunkContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_switchport_monitor}.
	 * @param ctx the parse tree
	 */
	void enterI_switchport_monitor(CiscoNxosParser.I_switchport_monitorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_switchport_monitor}.
	 * @param ctx the parse tree
	 */
	void exitI_switchport_monitor(CiscoNxosParser.I_switchport_monitorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_switchport_switchport}.
	 * @param ctx the parse tree
	 */
	void enterI_switchport_switchport(CiscoNxosParser.I_switchport_switchportContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_switchport_switchport}.
	 * @param ctx the parse tree
	 */
	void exitI_switchport_switchport(CiscoNxosParser.I_switchport_switchportContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_switchport_trunk}.
	 * @param ctx the parse tree
	 */
	void enterI_switchport_trunk(CiscoNxosParser.I_switchport_trunkContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_switchport_trunk}.
	 * @param ctx the parse tree
	 */
	void exitI_switchport_trunk(CiscoNxosParser.I_switchport_trunkContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_switchport_trunk_allowed}.
	 * @param ctx the parse tree
	 */
	void enterI_switchport_trunk_allowed(CiscoNxosParser.I_switchport_trunk_allowedContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_switchport_trunk_allowed}.
	 * @param ctx the parse tree
	 */
	void exitI_switchport_trunk_allowed(CiscoNxosParser.I_switchport_trunk_allowedContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_switchport_trunk_native}.
	 * @param ctx the parse tree
	 */
	void enterI_switchport_trunk_native(CiscoNxosParser.I_switchport_trunk_nativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_switchport_trunk_native}.
	 * @param ctx the parse tree
	 */
	void exitI_switchport_trunk_native(CiscoNxosParser.I_switchport_trunk_nativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#i_vrf_member}.
	 * @param ctx the parse tree
	 */
	void enterI_vrf_member(CiscoNxosParser.I_vrf_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#i_vrf_member}.
	 * @param ctx the parse tree
	 */
	void exitI_vrf_member(CiscoNxosParser.I_vrf_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#interface_range}.
	 * @param ctx the parse tree
	 */
	void enterInterface_range(CiscoNxosParser.Interface_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#interface_range}.
	 * @param ctx the parse tree
	 */
	void exitInterface_range(CiscoNxosParser.Interface_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#nve_interface_range}.
	 * @param ctx the parse tree
	 */
	void enterNve_interface_range(CiscoNxosParser.Nve_interface_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#nve_interface_range}.
	 * @param ctx the parse tree
	 */
	void exitNve_interface_range(CiscoNxosParser.Nve_interface_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#nve_global}.
	 * @param ctx the parse tree
	 */
	void enterNve_global(CiscoNxosParser.Nve_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#nve_global}.
	 * @param ctx the parse tree
	 */
	void exitNve_global(CiscoNxosParser.Nve_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#nvg_ingress_replication}.
	 * @param ctx the parse tree
	 */
	void enterNvg_ingress_replication(CiscoNxosParser.Nvg_ingress_replicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#nvg_ingress_replication}.
	 * @param ctx the parse tree
	 */
	void exitNvg_ingress_replication(CiscoNxosParser.Nvg_ingress_replicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#nvg_mcast_group}.
	 * @param ctx the parse tree
	 */
	void enterNvg_mcast_group(CiscoNxosParser.Nvg_mcast_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#nvg_mcast_group}.
	 * @param ctx the parse tree
	 */
	void exitNvg_mcast_group(CiscoNxosParser.Nvg_mcast_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#nvg_suppress_arp}.
	 * @param ctx the parse tree
	 */
	void enterNvg_suppress_arp(CiscoNxosParser.Nvg_suppress_arpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#nvg_suppress_arp}.
	 * @param ctx the parse tree
	 */
	void exitNvg_suppress_arp(CiscoNxosParser.Nvg_suppress_arpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#nve_host_reachability}.
	 * @param ctx the parse tree
	 */
	void enterNve_host_reachability(CiscoNxosParser.Nve_host_reachabilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#nve_host_reachability}.
	 * @param ctx the parse tree
	 */
	void exitNve_host_reachability(CiscoNxosParser.Nve_host_reachabilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#nve_member}.
	 * @param ctx the parse tree
	 */
	void enterNve_member(CiscoNxosParser.Nve_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#nve_member}.
	 * @param ctx the parse tree
	 */
	void exitNve_member(CiscoNxosParser.Nve_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#nvm_ingress_replication}.
	 * @param ctx the parse tree
	 */
	void enterNvm_ingress_replication(CiscoNxosParser.Nvm_ingress_replicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#nvm_ingress_replication}.
	 * @param ctx the parse tree
	 */
	void exitNvm_ingress_replication(CiscoNxosParser.Nvm_ingress_replicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#nvm_mcast_group}.
	 * @param ctx the parse tree
	 */
	void enterNvm_mcast_group(CiscoNxosParser.Nvm_mcast_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#nvm_mcast_group}.
	 * @param ctx the parse tree
	 */
	void exitNvm_mcast_group(CiscoNxosParser.Nvm_mcast_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#nvm_peer_ip}.
	 * @param ctx the parse tree
	 */
	void enterNvm_peer_ip(CiscoNxosParser.Nvm_peer_ipContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#nvm_peer_ip}.
	 * @param ctx the parse tree
	 */
	void exitNvm_peer_ip(CiscoNxosParser.Nvm_peer_ipContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#nvm_peer_vtep}.
	 * @param ctx the parse tree
	 */
	void enterNvm_peer_vtep(CiscoNxosParser.Nvm_peer_vtepContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#nvm_peer_vtep}.
	 * @param ctx the parse tree
	 */
	void exitNvm_peer_vtep(CiscoNxosParser.Nvm_peer_vtepContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#nvm_spine_anycast_gateway}.
	 * @param ctx the parse tree
	 */
	void enterNvm_spine_anycast_gateway(CiscoNxosParser.Nvm_spine_anycast_gatewayContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#nvm_spine_anycast_gateway}.
	 * @param ctx the parse tree
	 */
	void exitNvm_spine_anycast_gateway(CiscoNxosParser.Nvm_spine_anycast_gatewayContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#nvm_suppress_arp}.
	 * @param ctx the parse tree
	 */
	void enterNvm_suppress_arp(CiscoNxosParser.Nvm_suppress_arpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#nvm_suppress_arp}.
	 * @param ctx the parse tree
	 */
	void exitNvm_suppress_arp(CiscoNxosParser.Nvm_suppress_arpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#nve_no}.
	 * @param ctx the parse tree
	 */
	void enterNve_no(CiscoNxosParser.Nve_noContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#nve_no}.
	 * @param ctx the parse tree
	 */
	void exitNve_no(CiscoNxosParser.Nve_noContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#nve_no_shutdown}.
	 * @param ctx the parse tree
	 */
	void enterNve_no_shutdown(CiscoNxosParser.Nve_no_shutdownContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#nve_no_shutdown}.
	 * @param ctx the parse tree
	 */
	void exitNve_no_shutdown(CiscoNxosParser.Nve_no_shutdownContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#nve_source_interface}.
	 * @param ctx the parse tree
	 */
	void enterNve_source_interface(CiscoNxosParser.Nve_source_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#nve_source_interface}.
	 * @param ctx the parse tree
	 */
	void exitNve_source_interface(CiscoNxosParser.Nve_source_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ip_access_list}.
	 * @param ctx the parse tree
	 */
	void enterIp_access_list(CiscoNxosParser.Ip_access_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ip_access_list}.
	 * @param ctx the parse tree
	 */
	void exitIp_access_list(CiscoNxosParser.Ip_access_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#acl_fragments}.
	 * @param ctx the parse tree
	 */
	void enterAcl_fragments(CiscoNxosParser.Acl_fragmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#acl_fragments}.
	 * @param ctx the parse tree
	 */
	void exitAcl_fragments(CiscoNxosParser.Acl_fragmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#acl_line}.
	 * @param ctx the parse tree
	 */
	void enterAcl_line(CiscoNxosParser.Acl_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#acl_line}.
	 * @param ctx the parse tree
	 */
	void exitAcl_line(CiscoNxosParser.Acl_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ip_access_list_line_number}.
	 * @param ctx the parse tree
	 */
	void enterIp_access_list_line_number(CiscoNxosParser.Ip_access_list_line_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ip_access_list_line_number}.
	 * @param ctx the parse tree
	 */
	void exitIp_access_list_line_number(CiscoNxosParser.Ip_access_list_line_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#acll_action}.
	 * @param ctx the parse tree
	 */
	void enterAcll_action(CiscoNxosParser.Acll_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#acll_action}.
	 * @param ctx the parse tree
	 */
	void exitAcll_action(CiscoNxosParser.Acll_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#aclla_l3}.
	 * @param ctx the parse tree
	 */
	void enterAclla_l3(CiscoNxosParser.Aclla_l3Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#aclla_l3}.
	 * @param ctx the parse tree
	 */
	void exitAclla_l3(CiscoNxosParser.Aclla_l3Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#acllal3_protocol_spec}.
	 * @param ctx the parse tree
	 */
	void enterAcllal3_protocol_spec(CiscoNxosParser.Acllal3_protocol_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#acllal3_protocol_spec}.
	 * @param ctx the parse tree
	 */
	void exitAcllal3_protocol_spec(CiscoNxosParser.Acllal3_protocol_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ip_protocol}.
	 * @param ctx the parse tree
	 */
	void enterIp_protocol(CiscoNxosParser.Ip_protocolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ip_protocol}.
	 * @param ctx the parse tree
	 */
	void exitIp_protocol(CiscoNxosParser.Ip_protocolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#acllal3_src_address}.
	 * @param ctx the parse tree
	 */
	void enterAcllal3_src_address(CiscoNxosParser.Acllal3_src_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#acllal3_src_address}.
	 * @param ctx the parse tree
	 */
	void exitAcllal3_src_address(CiscoNxosParser.Acllal3_src_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#acllal3_dst_address}.
	 * @param ctx the parse tree
	 */
	void enterAcllal3_dst_address(CiscoNxosParser.Acllal3_dst_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#acllal3_dst_address}.
	 * @param ctx the parse tree
	 */
	void exitAcllal3_dst_address(CiscoNxosParser.Acllal3_dst_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#acllal3_address_spec}.
	 * @param ctx the parse tree
	 */
	void enterAcllal3_address_spec(CiscoNxosParser.Acllal3_address_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#acllal3_address_spec}.
	 * @param ctx the parse tree
	 */
	void exitAcllal3_address_spec(CiscoNxosParser.Acllal3_address_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#acllal3_fragments}.
	 * @param ctx the parse tree
	 */
	void enterAcllal3_fragments(CiscoNxosParser.Acllal3_fragmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#acllal3_fragments}.
	 * @param ctx the parse tree
	 */
	void exitAcllal3_fragments(CiscoNxosParser.Acllal3_fragmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#acllal3_option}.
	 * @param ctx the parse tree
	 */
	void enterAcllal3_option(CiscoNxosParser.Acllal3_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#acllal3_option}.
	 * @param ctx the parse tree
	 */
	void exitAcllal3_option(CiscoNxosParser.Acllal3_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#acllal3o_dscp}.
	 * @param ctx the parse tree
	 */
	void enterAcllal3o_dscp(CiscoNxosParser.Acllal3o_dscpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#acllal3o_dscp}.
	 * @param ctx the parse tree
	 */
	void exitAcllal3o_dscp(CiscoNxosParser.Acllal3o_dscpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#dscp_spec}.
	 * @param ctx the parse tree
	 */
	void enterDscp_spec(CiscoNxosParser.Dscp_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#dscp_spec}.
	 * @param ctx the parse tree
	 */
	void exitDscp_spec(CiscoNxosParser.Dscp_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#dscp_number}.
	 * @param ctx the parse tree
	 */
	void enterDscp_number(CiscoNxosParser.Dscp_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#dscp_number}.
	 * @param ctx the parse tree
	 */
	void exitDscp_number(CiscoNxosParser.Dscp_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#acllal3o_log}.
	 * @param ctx the parse tree
	 */
	void enterAcllal3o_log(CiscoNxosParser.Acllal3o_logContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#acllal3o_log}.
	 * @param ctx the parse tree
	 */
	void exitAcllal3o_log(CiscoNxosParser.Acllal3o_logContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#acllal3o_packet_length}.
	 * @param ctx the parse tree
	 */
	void enterAcllal3o_packet_length(CiscoNxosParser.Acllal3o_packet_lengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#acllal3o_packet_length}.
	 * @param ctx the parse tree
	 */
	void exitAcllal3o_packet_length(CiscoNxosParser.Acllal3o_packet_lengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#acllal3o_packet_length_spec}.
	 * @param ctx the parse tree
	 */
	void enterAcllal3o_packet_length_spec(CiscoNxosParser.Acllal3o_packet_length_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#acllal3o_packet_length_spec}.
	 * @param ctx the parse tree
	 */
	void exitAcllal3o_packet_length_spec(CiscoNxosParser.Acllal3o_packet_length_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#acllal3o_precedence}.
	 * @param ctx the parse tree
	 */
	void enterAcllal3o_precedence(CiscoNxosParser.Acllal3o_precedenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#acllal3o_precedence}.
	 * @param ctx the parse tree
	 */
	void exitAcllal3o_precedence(CiscoNxosParser.Acllal3o_precedenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#precedence_number}.
	 * @param ctx the parse tree
	 */
	void enterPrecedence_number(CiscoNxosParser.Precedence_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#precedence_number}.
	 * @param ctx the parse tree
	 */
	void exitPrecedence_number(CiscoNxosParser.Precedence_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#acllal3o_ttl}.
	 * @param ctx the parse tree
	 */
	void enterAcllal3o_ttl(CiscoNxosParser.Acllal3o_ttlContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#acllal3o_ttl}.
	 * @param ctx the parse tree
	 */
	void exitAcllal3o_ttl(CiscoNxosParser.Acllal3o_ttlContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#packet_length}.
	 * @param ctx the parse tree
	 */
	void enterPacket_length(CiscoNxosParser.Packet_lengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#packet_length}.
	 * @param ctx the parse tree
	 */
	void exitPacket_length(CiscoNxosParser.Packet_lengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#aclla_l4}.
	 * @param ctx the parse tree
	 */
	void enterAclla_l4(CiscoNxosParser.Aclla_l4Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#aclla_l4}.
	 * @param ctx the parse tree
	 */
	void exitAclla_l4(CiscoNxosParser.Aclla_l4Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#acllal4_icmp}.
	 * @param ctx the parse tree
	 */
	void enterAcllal4_icmp(CiscoNxosParser.Acllal4_icmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#acllal4_icmp}.
	 * @param ctx the parse tree
	 */
	void exitAcllal4_icmp(CiscoNxosParser.Acllal4_icmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#acllal4icmp_option}.
	 * @param ctx the parse tree
	 */
	void enterAcllal4icmp_option(CiscoNxosParser.Acllal4icmp_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#acllal4icmp_option}.
	 * @param ctx the parse tree
	 */
	void exitAcllal4icmp_option(CiscoNxosParser.Acllal4icmp_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#acllal4_igmp}.
	 * @param ctx the parse tree
	 */
	void enterAcllal4_igmp(CiscoNxosParser.Acllal4_igmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#acllal4_igmp}.
	 * @param ctx the parse tree
	 */
	void exitAcllal4_igmp(CiscoNxosParser.Acllal4_igmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#acllal4igmp_option}.
	 * @param ctx the parse tree
	 */
	void enterAcllal4igmp_option(CiscoNxosParser.Acllal4igmp_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#acllal4igmp_option}.
	 * @param ctx the parse tree
	 */
	void exitAcllal4igmp_option(CiscoNxosParser.Acllal4igmp_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#igmp_message_type_number}.
	 * @param ctx the parse tree
	 */
	void enterIgmp_message_type_number(CiscoNxosParser.Igmp_message_type_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#igmp_message_type_number}.
	 * @param ctx the parse tree
	 */
	void exitIgmp_message_type_number(CiscoNxosParser.Igmp_message_type_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#acllal4_tcp}.
	 * @param ctx the parse tree
	 */
	void enterAcllal4_tcp(CiscoNxosParser.Acllal4_tcpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#acllal4_tcp}.
	 * @param ctx the parse tree
	 */
	void exitAcllal4_tcp(CiscoNxosParser.Acllal4_tcpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#acllal4tcp_source_port}.
	 * @param ctx the parse tree
	 */
	void enterAcllal4tcp_source_port(CiscoNxosParser.Acllal4tcp_source_portContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#acllal4tcp_source_port}.
	 * @param ctx the parse tree
	 */
	void exitAcllal4tcp_source_port(CiscoNxosParser.Acllal4tcp_source_portContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#acllal4tcp_destination_port}.
	 * @param ctx the parse tree
	 */
	void enterAcllal4tcp_destination_port(CiscoNxosParser.Acllal4tcp_destination_portContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#acllal4tcp_destination_port}.
	 * @param ctx the parse tree
	 */
	void exitAcllal4tcp_destination_port(CiscoNxosParser.Acllal4tcp_destination_portContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#acllal4tcp_port_spec}.
	 * @param ctx the parse tree
	 */
	void enterAcllal4tcp_port_spec(CiscoNxosParser.Acllal4tcp_port_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#acllal4tcp_port_spec}.
	 * @param ctx the parse tree
	 */
	void exitAcllal4tcp_port_spec(CiscoNxosParser.Acllal4tcp_port_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#acllal4tcp_port_spec_literal}.
	 * @param ctx the parse tree
	 */
	void enterAcllal4tcp_port_spec_literal(CiscoNxosParser.Acllal4tcp_port_spec_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#acllal4tcp_port_spec_literal}.
	 * @param ctx the parse tree
	 */
	void exitAcllal4tcp_port_spec_literal(CiscoNxosParser.Acllal4tcp_port_spec_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#acllal4tcp_port_spec_port_group}.
	 * @param ctx the parse tree
	 */
	void enterAcllal4tcp_port_spec_port_group(CiscoNxosParser.Acllal4tcp_port_spec_port_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#acllal4tcp_port_spec_port_group}.
	 * @param ctx the parse tree
	 */
	void exitAcllal4tcp_port_spec_port_group(CiscoNxosParser.Acllal4tcp_port_spec_port_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#tcp_port}.
	 * @param ctx the parse tree
	 */
	void enterTcp_port(CiscoNxosParser.Tcp_portContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#tcp_port}.
	 * @param ctx the parse tree
	 */
	void exitTcp_port(CiscoNxosParser.Tcp_portContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#acllal4tcp_option}.
	 * @param ctx the parse tree
	 */
	void enterAcllal4tcp_option(CiscoNxosParser.Acllal4tcp_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#acllal4tcp_option}.
	 * @param ctx the parse tree
	 */
	void exitAcllal4tcp_option(CiscoNxosParser.Acllal4tcp_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#acllal4tcpo_established}.
	 * @param ctx the parse tree
	 */
	void enterAcllal4tcpo_established(CiscoNxosParser.Acllal4tcpo_establishedContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#acllal4tcpo_established}.
	 * @param ctx the parse tree
	 */
	void exitAcllal4tcpo_established(CiscoNxosParser.Acllal4tcpo_establishedContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#acllal4tcpo_flags}.
	 * @param ctx the parse tree
	 */
	void enterAcllal4tcpo_flags(CiscoNxosParser.Acllal4tcpo_flagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#acllal4tcpo_flags}.
	 * @param ctx the parse tree
	 */
	void exitAcllal4tcpo_flags(CiscoNxosParser.Acllal4tcpo_flagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#acllal4tcpo_http_method}.
	 * @param ctx the parse tree
	 */
	void enterAcllal4tcpo_http_method(CiscoNxosParser.Acllal4tcpo_http_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#acllal4tcpo_http_method}.
	 * @param ctx the parse tree
	 */
	void exitAcllal4tcpo_http_method(CiscoNxosParser.Acllal4tcpo_http_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#http_method_number}.
	 * @param ctx the parse tree
	 */
	void enterHttp_method_number(CiscoNxosParser.Http_method_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#http_method_number}.
	 * @param ctx the parse tree
	 */
	void exitHttp_method_number(CiscoNxosParser.Http_method_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#acllal4tcpo_tcp_flags_mask}.
	 * @param ctx the parse tree
	 */
	void enterAcllal4tcpo_tcp_flags_mask(CiscoNxosParser.Acllal4tcpo_tcp_flags_maskContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#acllal4tcpo_tcp_flags_mask}.
	 * @param ctx the parse tree
	 */
	void exitAcllal4tcpo_tcp_flags_mask(CiscoNxosParser.Acllal4tcpo_tcp_flags_maskContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#tcp_flags_mask}.
	 * @param ctx the parse tree
	 */
	void enterTcp_flags_mask(CiscoNxosParser.Tcp_flags_maskContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#tcp_flags_mask}.
	 * @param ctx the parse tree
	 */
	void exitTcp_flags_mask(CiscoNxosParser.Tcp_flags_maskContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#acllal4tcpo_tcp_option_length}.
	 * @param ctx the parse tree
	 */
	void enterAcllal4tcpo_tcp_option_length(CiscoNxosParser.Acllal4tcpo_tcp_option_lengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#acllal4tcpo_tcp_option_length}.
	 * @param ctx the parse tree
	 */
	void exitAcllal4tcpo_tcp_option_length(CiscoNxosParser.Acllal4tcpo_tcp_option_lengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#tcp_option_length}.
	 * @param ctx the parse tree
	 */
	void enterTcp_option_length(CiscoNxosParser.Tcp_option_lengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#tcp_option_length}.
	 * @param ctx the parse tree
	 */
	void exitTcp_option_length(CiscoNxosParser.Tcp_option_lengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#acllal4_udp}.
	 * @param ctx the parse tree
	 */
	void enterAcllal4_udp(CiscoNxosParser.Acllal4_udpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#acllal4_udp}.
	 * @param ctx the parse tree
	 */
	void exitAcllal4_udp(CiscoNxosParser.Acllal4_udpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#acllal4udp_source_port}.
	 * @param ctx the parse tree
	 */
	void enterAcllal4udp_source_port(CiscoNxosParser.Acllal4udp_source_portContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#acllal4udp_source_port}.
	 * @param ctx the parse tree
	 */
	void exitAcllal4udp_source_port(CiscoNxosParser.Acllal4udp_source_portContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#acllal4udp_destination_port}.
	 * @param ctx the parse tree
	 */
	void enterAcllal4udp_destination_port(CiscoNxosParser.Acllal4udp_destination_portContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#acllal4udp_destination_port}.
	 * @param ctx the parse tree
	 */
	void exitAcllal4udp_destination_port(CiscoNxosParser.Acllal4udp_destination_portContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#acllal4udp_port_spec}.
	 * @param ctx the parse tree
	 */
	void enterAcllal4udp_port_spec(CiscoNxosParser.Acllal4udp_port_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#acllal4udp_port_spec}.
	 * @param ctx the parse tree
	 */
	void exitAcllal4udp_port_spec(CiscoNxosParser.Acllal4udp_port_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#acllal4udp_port_spec_literal}.
	 * @param ctx the parse tree
	 */
	void enterAcllal4udp_port_spec_literal(CiscoNxosParser.Acllal4udp_port_spec_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#acllal4udp_port_spec_literal}.
	 * @param ctx the parse tree
	 */
	void exitAcllal4udp_port_spec_literal(CiscoNxosParser.Acllal4udp_port_spec_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#acllal4udp_port_spec_port_group}.
	 * @param ctx the parse tree
	 */
	void enterAcllal4udp_port_spec_port_group(CiscoNxosParser.Acllal4udp_port_spec_port_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#acllal4udp_port_spec_port_group}.
	 * @param ctx the parse tree
	 */
	void exitAcllal4udp_port_spec_port_group(CiscoNxosParser.Acllal4udp_port_spec_port_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#udp_port}.
	 * @param ctx the parse tree
	 */
	void enterUdp_port(CiscoNxosParser.Udp_portContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#udp_port}.
	 * @param ctx the parse tree
	 */
	void exitUdp_port(CiscoNxosParser.Udp_portContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#udp_port_number}.
	 * @param ctx the parse tree
	 */
	void enterUdp_port_number(CiscoNxosParser.Udp_port_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#udp_port_number}.
	 * @param ctx the parse tree
	 */
	void exitUdp_port_number(CiscoNxosParser.Udp_port_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#acllal4udp_option}.
	 * @param ctx the parse tree
	 */
	void enterAcllal4udp_option(CiscoNxosParser.Acllal4udp_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#acllal4udp_option}.
	 * @param ctx the parse tree
	 */
	void exitAcllal4udp_option(CiscoNxosParser.Acllal4udp_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#acllal4udpo_nve}.
	 * @param ctx the parse tree
	 */
	void enterAcllal4udpo_nve(CiscoNxosParser.Acllal4udpo_nveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#acllal4udpo_nve}.
	 * @param ctx the parse tree
	 */
	void exitAcllal4udpo_nve(CiscoNxosParser.Acllal4udpo_nveContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#acll_remark}.
	 * @param ctx the parse tree
	 */
	void enterAcll_remark(CiscoNxosParser.Acll_remarkContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#acll_remark}.
	 * @param ctx the parse tree
	 */
	void exitAcll_remark(CiscoNxosParser.Acll_remarkContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#acl_null}.
	 * @param ctx the parse tree
	 */
	void enterAcl_null(CiscoNxosParser.Acl_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#acl_null}.
	 * @param ctx the parse tree
	 */
	void exitAcl_null(CiscoNxosParser.Acl_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ip_as_path_access_list}.
	 * @param ctx the parse tree
	 */
	void enterIp_as_path_access_list(CiscoNxosParser.Ip_as_path_access_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ip_as_path_access_list}.
	 * @param ctx the parse tree
	 */
	void exitIp_as_path_access_list(CiscoNxosParser.Ip_as_path_access_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ip_as_path_access_list_seq}.
	 * @param ctx the parse tree
	 */
	void enterIp_as_path_access_list_seq(CiscoNxosParser.Ip_as_path_access_list_seqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ip_as_path_access_list_seq}.
	 * @param ctx the parse tree
	 */
	void exitIp_as_path_access_list_seq(CiscoNxosParser.Ip_as_path_access_list_seqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#as_path_regex}.
	 * @param ctx the parse tree
	 */
	void enterAs_path_regex(CiscoNxosParser.As_path_regexContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#as_path_regex}.
	 * @param ctx the parse tree
	 */
	void exitAs_path_regex(CiscoNxosParser.As_path_regexContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ip_community_list}.
	 * @param ctx the parse tree
	 */
	void enterIp_community_list(CiscoNxosParser.Ip_community_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ip_community_list}.
	 * @param ctx the parse tree
	 */
	void exitIp_community_list(CiscoNxosParser.Ip_community_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#icl_expanded}.
	 * @param ctx the parse tree
	 */
	void enterIcl_expanded(CiscoNxosParser.Icl_expandedContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#icl_expanded}.
	 * @param ctx the parse tree
	 */
	void exitIcl_expanded(CiscoNxosParser.Icl_expandedContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#icl_standard}.
	 * @param ctx the parse tree
	 */
	void enterIcl_standard(CiscoNxosParser.Icl_standardContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#icl_standard}.
	 * @param ctx the parse tree
	 */
	void exitIcl_standard(CiscoNxosParser.Icl_standardContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ip_community_list_seq}.
	 * @param ctx the parse tree
	 */
	void enterIp_community_list_seq(CiscoNxosParser.Ip_community_list_seqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ip_community_list_seq}.
	 * @param ctx the parse tree
	 */
	void exitIp_community_list_seq(CiscoNxosParser.Ip_community_list_seqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ip_prefix_list}.
	 * @param ctx the parse tree
	 */
	void enterIp_prefix_list(CiscoNxosParser.Ip_prefix_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ip_prefix_list}.
	 * @param ctx the parse tree
	 */
	void exitIp_prefix_list(CiscoNxosParser.Ip_prefix_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#pl_action}.
	 * @param ctx the parse tree
	 */
	void enterPl_action(CiscoNxosParser.Pl_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#pl_action}.
	 * @param ctx the parse tree
	 */
	void exitPl_action(CiscoNxosParser.Pl_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ip_prefix_list_line_prefix_length}.
	 * @param ctx the parse tree
	 */
	void enterIp_prefix_list_line_prefix_length(CiscoNxosParser.Ip_prefix_list_line_prefix_lengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ip_prefix_list_line_prefix_length}.
	 * @param ctx the parse tree
	 */
	void exitIp_prefix_list_line_prefix_length(CiscoNxosParser.Ip_prefix_list_line_prefix_lengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#pl_description}.
	 * @param ctx the parse tree
	 */
	void enterPl_description(CiscoNxosParser.Pl_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#pl_description}.
	 * @param ctx the parse tree
	 */
	void exitPl_description(CiscoNxosParser.Pl_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ipv6_access_list}.
	 * @param ctx the parse tree
	 */
	void enterIpv6_access_list(CiscoNxosParser.Ipv6_access_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ipv6_access_list}.
	 * @param ctx the parse tree
	 */
	void exitIpv6_access_list(CiscoNxosParser.Ipv6_access_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#acl6_null}.
	 * @param ctx the parse tree
	 */
	void enterAcl6_null(CiscoNxosParser.Acl6_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#acl6_null}.
	 * @param ctx the parse tree
	 */
	void exitAcl6_null(CiscoNxosParser.Acl6_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ipv6_prefix_list}.
	 * @param ctx the parse tree
	 */
	void enterIpv6_prefix_list(CiscoNxosParser.Ipv6_prefix_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ipv6_prefix_list}.
	 * @param ctx the parse tree
	 */
	void exitIpv6_prefix_list(CiscoNxosParser.Ipv6_prefix_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#pl6_action}.
	 * @param ctx the parse tree
	 */
	void enterPl6_action(CiscoNxosParser.Pl6_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#pl6_action}.
	 * @param ctx the parse tree
	 */
	void exitPl6_action(CiscoNxosParser.Pl6_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ipv6_prefix_list_line_prefix_length}.
	 * @param ctx the parse tree
	 */
	void enterIpv6_prefix_list_line_prefix_length(CiscoNxosParser.Ipv6_prefix_list_line_prefix_lengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ipv6_prefix_list_line_prefix_length}.
	 * @param ctx the parse tree
	 */
	void exitIpv6_prefix_list_line_prefix_length(CiscoNxosParser.Ipv6_prefix_list_line_prefix_lengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#pl6_description}.
	 * @param ctx the parse tree
	 */
	void enterPl6_description(CiscoNxosParser.Pl6_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#pl6_description}.
	 * @param ctx the parse tree
	 */
	void exitPl6_description(CiscoNxosParser.Pl6_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#line_logout_warning}.
	 * @param ctx the parse tree
	 */
	void enterLine_logout_warning(CiscoNxosParser.Line_logout_warningContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#line_logout_warning}.
	 * @param ctx the parse tree
	 */
	void exitLine_logout_warning(CiscoNxosParser.Line_logout_warningContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#line_session_limit}.
	 * @param ctx the parse tree
	 */
	void enterLine_session_limit(CiscoNxosParser.Line_session_limitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#line_session_limit}.
	 * @param ctx the parse tree
	 */
	void exitLine_session_limit(CiscoNxosParser.Line_session_limitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#line_timeout}.
	 * @param ctx the parse tree
	 */
	void enterLine_timeout(CiscoNxosParser.Line_timeoutContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#line_timeout}.
	 * @param ctx the parse tree
	 */
	void exitLine_timeout(CiscoNxosParser.Line_timeoutContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#s_line}.
	 * @param ctx the parse tree
	 */
	void enterS_line(CiscoNxosParser.S_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#s_line}.
	 * @param ctx the parse tree
	 */
	void exitS_line(CiscoNxosParser.S_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#line_console}.
	 * @param ctx the parse tree
	 */
	void enterLine_console(CiscoNxosParser.Line_consoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#line_console}.
	 * @param ctx the parse tree
	 */
	void exitLine_console(CiscoNxosParser.Line_consoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#lc_exec_timeout}.
	 * @param ctx the parse tree
	 */
	void enterLc_exec_timeout(CiscoNxosParser.Lc_exec_timeoutContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#lc_exec_timeout}.
	 * @param ctx the parse tree
	 */
	void exitLc_exec_timeout(CiscoNxosParser.Lc_exec_timeoutContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#line_vty}.
	 * @param ctx the parse tree
	 */
	void enterLine_vty(CiscoNxosParser.Line_vtyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#line_vty}.
	 * @param ctx the parse tree
	 */
	void exitLine_vty(CiscoNxosParser.Line_vtyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#lv_absolute_timeout}.
	 * @param ctx the parse tree
	 */
	void enterLv_absolute_timeout(CiscoNxosParser.Lv_absolute_timeoutContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#lv_absolute_timeout}.
	 * @param ctx the parse tree
	 */
	void exitLv_absolute_timeout(CiscoNxosParser.Lv_absolute_timeoutContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#lv_access_class}.
	 * @param ctx the parse tree
	 */
	void enterLv_access_class(CiscoNxosParser.Lv_access_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#lv_access_class}.
	 * @param ctx the parse tree
	 */
	void exitLv_access_class(CiscoNxosParser.Lv_access_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#lv_exec_timeout}.
	 * @param ctx the parse tree
	 */
	void enterLv_exec_timeout(CiscoNxosParser.Lv_exec_timeoutContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#lv_exec_timeout}.
	 * @param ctx the parse tree
	 */
	void exitLv_exec_timeout(CiscoNxosParser.Lv_exec_timeoutContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#lv_ipv6}.
	 * @param ctx the parse tree
	 */
	void enterLv_ipv6(CiscoNxosParser.Lv_ipv6Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#lv_ipv6}.
	 * @param ctx the parse tree
	 */
	void exitLv_ipv6(CiscoNxosParser.Lv_ipv6Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#lv6_access_class}.
	 * @param ctx the parse tree
	 */
	void enterLv6_access_class(CiscoNxosParser.Lv6_access_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#lv6_access_class}.
	 * @param ctx the parse tree
	 */
	void exitLv6_access_class(CiscoNxosParser.Lv6_access_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#lv_logout_warning}.
	 * @param ctx the parse tree
	 */
	void enterLv_logout_warning(CiscoNxosParser.Lv_logout_warningContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#lv_logout_warning}.
	 * @param ctx the parse tree
	 */
	void exitLv_logout_warning(CiscoNxosParser.Lv_logout_warningContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#lv_session_limit}.
	 * @param ctx the parse tree
	 */
	void enterLv_session_limit(CiscoNxosParser.Lv_session_limitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#lv_session_limit}.
	 * @param ctx the parse tree
	 */
	void exitLv_session_limit(CiscoNxosParser.Lv_session_limitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#s_logging}.
	 * @param ctx the parse tree
	 */
	void enterS_logging(CiscoNxosParser.S_loggingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#s_logging}.
	 * @param ctx the parse tree
	 */
	void exitS_logging(CiscoNxosParser.S_loggingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#logging_server}.
	 * @param ctx the parse tree
	 */
	void enterLogging_server(CiscoNxosParser.Logging_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#logging_server}.
	 * @param ctx the parse tree
	 */
	void exitLogging_server(CiscoNxosParser.Logging_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#logging_host}.
	 * @param ctx the parse tree
	 */
	void enterLogging_host(CiscoNxosParser.Logging_hostContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#logging_host}.
	 * @param ctx the parse tree
	 */
	void exitLogging_host(CiscoNxosParser.Logging_hostContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#logging_level}.
	 * @param ctx the parse tree
	 */
	void enterLogging_level(CiscoNxosParser.Logging_levelContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#logging_level}.
	 * @param ctx the parse tree
	 */
	void exitLogging_level(CiscoNxosParser.Logging_levelContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ls_port}.
	 * @param ctx the parse tree
	 */
	void enterLs_port(CiscoNxosParser.Ls_portContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ls_port}.
	 * @param ctx the parse tree
	 */
	void exitLs_port(CiscoNxosParser.Ls_portContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ls_secure}.
	 * @param ctx the parse tree
	 */
	void enterLs_secure(CiscoNxosParser.Ls_secureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ls_secure}.
	 * @param ctx the parse tree
	 */
	void exitLs_secure(CiscoNxosParser.Ls_secureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#trustpoint_name}.
	 * @param ctx the parse tree
	 */
	void enterTrustpoint_name(CiscoNxosParser.Trustpoint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#trustpoint_name}.
	 * @param ctx the parse tree
	 */
	void exitTrustpoint_name(CiscoNxosParser.Trustpoint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ls_facility}.
	 * @param ctx the parse tree
	 */
	void enterLs_facility(CiscoNxosParser.Ls_facilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ls_facility}.
	 * @param ctx the parse tree
	 */
	void exitLs_facility(CiscoNxosParser.Ls_facilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ls_use_vrf}.
	 * @param ctx the parse tree
	 */
	void enterLs_use_vrf(CiscoNxosParser.Ls_use_vrfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ls_use_vrf}.
	 * @param ctx the parse tree
	 */
	void exitLs_use_vrf(CiscoNxosParser.Ls_use_vrfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#logging_source_interface}.
	 * @param ctx the parse tree
	 */
	void enterLogging_source_interface(CiscoNxosParser.Logging_source_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#logging_source_interface}.
	 * @param ctx the parse tree
	 */
	void exitLogging_source_interface(CiscoNxosParser.Logging_source_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#s_mac}.
	 * @param ctx the parse tree
	 */
	void enterS_mac(CiscoNxosParser.S_macContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#s_mac}.
	 * @param ctx the parse tree
	 */
	void exitS_mac(CiscoNxosParser.S_macContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#mac_access_list}.
	 * @param ctx the parse tree
	 */
	void enterMac_access_list(CiscoNxosParser.Mac_access_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#mac_access_list}.
	 * @param ctx the parse tree
	 */
	void exitMac_access_list(CiscoNxosParser.Mac_access_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#macl_line}.
	 * @param ctx the parse tree
	 */
	void enterMacl_line(CiscoNxosParser.Macl_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#macl_line}.
	 * @param ctx the parse tree
	 */
	void exitMacl_line(CiscoNxosParser.Macl_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#macll_action}.
	 * @param ctx the parse tree
	 */
	void enterMacll_action(CiscoNxosParser.Macll_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#macll_action}.
	 * @param ctx the parse tree
	 */
	void exitMacll_action(CiscoNxosParser.Macll_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#maclla_address_spec}.
	 * @param ctx the parse tree
	 */
	void enterMaclla_address_spec(CiscoNxosParser.Maclla_address_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#maclla_address_spec}.
	 * @param ctx the parse tree
	 */
	void exitMaclla_address_spec(CiscoNxosParser.Maclla_address_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#maclla_dst_address_spec}.
	 * @param ctx the parse tree
	 */
	void enterMaclla_dst_address_spec(CiscoNxosParser.Maclla_dst_address_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#maclla_dst_address_spec}.
	 * @param ctx the parse tree
	 */
	void exitMaclla_dst_address_spec(CiscoNxosParser.Maclla_dst_address_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#maclla_src_address_spec}.
	 * @param ctx the parse tree
	 */
	void enterMaclla_src_address_spec(CiscoNxosParser.Maclla_src_address_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#maclla_src_address_spec}.
	 * @param ctx the parse tree
	 */
	void exitMaclla_src_address_spec(CiscoNxosParser.Maclla_src_address_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#maclla_protocol_spec}.
	 * @param ctx the parse tree
	 */
	void enterMaclla_protocol_spec(CiscoNxosParser.Maclla_protocol_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#maclla_protocol_spec}.
	 * @param ctx the parse tree
	 */
	void exitMaclla_protocol_spec(CiscoNxosParser.Maclla_protocol_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#s_monitor}.
	 * @param ctx the parse tree
	 */
	void enterS_monitor(CiscoNxosParser.S_monitorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#s_monitor}.
	 * @param ctx the parse tree
	 */
	void exitS_monitor(CiscoNxosParser.S_monitorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#monitor_session}.
	 * @param ctx the parse tree
	 */
	void enterMonitor_session(CiscoNxosParser.Monitor_sessionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#monitor_session}.
	 * @param ctx the parse tree
	 */
	void exitMonitor_session(CiscoNxosParser.Monitor_sessionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#monitor_session_description}.
	 * @param ctx the parse tree
	 */
	void enterMonitor_session_description(CiscoNxosParser.Monitor_session_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#monitor_session_description}.
	 * @param ctx the parse tree
	 */
	void exitMonitor_session_description(CiscoNxosParser.Monitor_session_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#monitor_session_destination}.
	 * @param ctx the parse tree
	 */
	void enterMonitor_session_destination(CiscoNxosParser.Monitor_session_destinationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#monitor_session_destination}.
	 * @param ctx the parse tree
	 */
	void exitMonitor_session_destination(CiscoNxosParser.Monitor_session_destinationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#monitor_session_no}.
	 * @param ctx the parse tree
	 */
	void enterMonitor_session_no(CiscoNxosParser.Monitor_session_noContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#monitor_session_no}.
	 * @param ctx the parse tree
	 */
	void exitMonitor_session_no(CiscoNxosParser.Monitor_session_noContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#monitor_session_no_shut}.
	 * @param ctx the parse tree
	 */
	void enterMonitor_session_no_shut(CiscoNxosParser.Monitor_session_no_shutContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#monitor_session_no_shut}.
	 * @param ctx the parse tree
	 */
	void exitMonitor_session_no_shut(CiscoNxosParser.Monitor_session_no_shutContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#monitor_session_source}.
	 * @param ctx the parse tree
	 */
	void enterMonitor_session_source(CiscoNxosParser.Monitor_session_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#monitor_session_source}.
	 * @param ctx the parse tree
	 */
	void exitMonitor_session_source(CiscoNxosParser.Monitor_session_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#monitor_session_source_interface}.
	 * @param ctx the parse tree
	 */
	void enterMonitor_session_source_interface(CiscoNxosParser.Monitor_session_source_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#monitor_session_source_interface}.
	 * @param ctx the parse tree
	 */
	void exitMonitor_session_source_interface(CiscoNxosParser.Monitor_session_source_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#monitor_session_source_vlan}.
	 * @param ctx the parse tree
	 */
	void enterMonitor_session_source_vlan(CiscoNxosParser.Monitor_session_source_vlanContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#monitor_session_source_vlan}.
	 * @param ctx the parse tree
	 */
	void exitMonitor_session_source_vlan(CiscoNxosParser.Monitor_session_source_vlanContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ntp_poll_interval}.
	 * @param ctx the parse tree
	 */
	void enterNtp_poll_interval(CiscoNxosParser.Ntp_poll_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ntp_poll_interval}.
	 * @param ctx the parse tree
	 */
	void exitNtp_poll_interval(CiscoNxosParser.Ntp_poll_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#s_ntp}.
	 * @param ctx the parse tree
	 */
	void enterS_ntp(CiscoNxosParser.S_ntpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#s_ntp}.
	 * @param ctx the parse tree
	 */
	void exitS_ntp(CiscoNxosParser.S_ntpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ntp_access_group}.
	 * @param ctx the parse tree
	 */
	void enterNtp_access_group(CiscoNxosParser.Ntp_access_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ntp_access_group}.
	 * @param ctx the parse tree
	 */
	void exitNtp_access_group(CiscoNxosParser.Ntp_access_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ntp_authenticate}.
	 * @param ctx the parse tree
	 */
	void enterNtp_authenticate(CiscoNxosParser.Ntp_authenticateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ntp_authenticate}.
	 * @param ctx the parse tree
	 */
	void exitNtp_authenticate(CiscoNxosParser.Ntp_authenticateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ntp_authentication_key}.
	 * @param ctx the parse tree
	 */
	void enterNtp_authentication_key(CiscoNxosParser.Ntp_authentication_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ntp_authentication_key}.
	 * @param ctx the parse tree
	 */
	void exitNtp_authentication_key(CiscoNxosParser.Ntp_authentication_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#md5_string_type}.
	 * @param ctx the parse tree
	 */
	void enterMd5_string_type(CiscoNxosParser.Md5_string_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#md5_string_type}.
	 * @param ctx the parse tree
	 */
	void exitMd5_string_type(CiscoNxosParser.Md5_string_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ntp_authentication_key_number}.
	 * @param ctx the parse tree
	 */
	void enterNtp_authentication_key_number(CiscoNxosParser.Ntp_authentication_key_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ntp_authentication_key_number}.
	 * @param ctx the parse tree
	 */
	void exitNtp_authentication_key_number(CiscoNxosParser.Ntp_authentication_key_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ntpag_match_all}.
	 * @param ctx the parse tree
	 */
	void enterNtpag_match_all(CiscoNxosParser.Ntpag_match_allContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ntpag_match_all}.
	 * @param ctx the parse tree
	 */
	void exitNtpag_match_all(CiscoNxosParser.Ntpag_match_allContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ntpag_peer}.
	 * @param ctx the parse tree
	 */
	void enterNtpag_peer(CiscoNxosParser.Ntpag_peerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ntpag_peer}.
	 * @param ctx the parse tree
	 */
	void exitNtpag_peer(CiscoNxosParser.Ntpag_peerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ntpag_query_only}.
	 * @param ctx the parse tree
	 */
	void enterNtpag_query_only(CiscoNxosParser.Ntpag_query_onlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ntpag_query_only}.
	 * @param ctx the parse tree
	 */
	void exitNtpag_query_only(CiscoNxosParser.Ntpag_query_onlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ntpag_serve}.
	 * @param ctx the parse tree
	 */
	void enterNtpag_serve(CiscoNxosParser.Ntpag_serveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ntpag_serve}.
	 * @param ctx the parse tree
	 */
	void exitNtpag_serve(CiscoNxosParser.Ntpag_serveContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ntpag_serve_only}.
	 * @param ctx the parse tree
	 */
	void enterNtpag_serve_only(CiscoNxosParser.Ntpag_serve_onlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ntpag_serve_only}.
	 * @param ctx the parse tree
	 */
	void exitNtpag_serve_only(CiscoNxosParser.Ntpag_serve_onlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ntp_commit}.
	 * @param ctx the parse tree
	 */
	void enterNtp_commit(CiscoNxosParser.Ntp_commitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ntp_commit}.
	 * @param ctx the parse tree
	 */
	void exitNtp_commit(CiscoNxosParser.Ntp_commitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ntp_distribute}.
	 * @param ctx the parse tree
	 */
	void enterNtp_distribute(CiscoNxosParser.Ntp_distributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ntp_distribute}.
	 * @param ctx the parse tree
	 */
	void exitNtp_distribute(CiscoNxosParser.Ntp_distributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ntp_peer}.
	 * @param ctx the parse tree
	 */
	void enterNtp_peer(CiscoNxosParser.Ntp_peerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ntp_peer}.
	 * @param ctx the parse tree
	 */
	void exitNtp_peer(CiscoNxosParser.Ntp_peerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ntp_host}.
	 * @param ctx the parse tree
	 */
	void enterNtp_host(CiscoNxosParser.Ntp_hostContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ntp_host}.
	 * @param ctx the parse tree
	 */
	void exitNtp_host(CiscoNxosParser.Ntp_hostContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ntp_server}.
	 * @param ctx the parse tree
	 */
	void enterNtp_server(CiscoNxosParser.Ntp_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ntp_server}.
	 * @param ctx the parse tree
	 */
	void exitNtp_server(CiscoNxosParser.Ntp_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ntps_key}.
	 * @param ctx the parse tree
	 */
	void enterNtps_key(CiscoNxosParser.Ntps_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ntps_key}.
	 * @param ctx the parse tree
	 */
	void exitNtps_key(CiscoNxosParser.Ntps_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ntps_maxpoll}.
	 * @param ctx the parse tree
	 */
	void enterNtps_maxpoll(CiscoNxosParser.Ntps_maxpollContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ntps_maxpoll}.
	 * @param ctx the parse tree
	 */
	void exitNtps_maxpoll(CiscoNxosParser.Ntps_maxpollContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ntps_minpoll}.
	 * @param ctx the parse tree
	 */
	void enterNtps_minpoll(CiscoNxosParser.Ntps_minpollContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ntps_minpoll}.
	 * @param ctx the parse tree
	 */
	void exitNtps_minpoll(CiscoNxosParser.Ntps_minpollContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ntps_prefer}.
	 * @param ctx the parse tree
	 */
	void enterNtps_prefer(CiscoNxosParser.Ntps_preferContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ntps_prefer}.
	 * @param ctx the parse tree
	 */
	void exitNtps_prefer(CiscoNxosParser.Ntps_preferContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ntps_use_vrf}.
	 * @param ctx the parse tree
	 */
	void enterNtps_use_vrf(CiscoNxosParser.Ntps_use_vrfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ntps_use_vrf}.
	 * @param ctx the parse tree
	 */
	void exitNtps_use_vrf(CiscoNxosParser.Ntps_use_vrfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ntp_source_interface}.
	 * @param ctx the parse tree
	 */
	void enterNtp_source_interface(CiscoNxosParser.Ntp_source_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ntp_source_interface}.
	 * @param ctx the parse tree
	 */
	void exitNtp_source_interface(CiscoNxosParser.Ntp_source_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#s_object_group}.
	 * @param ctx the parse tree
	 */
	void enterS_object_group(CiscoNxosParser.S_object_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#s_object_group}.
	 * @param ctx the parse tree
	 */
	void exitS_object_group(CiscoNxosParser.S_object_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#og_ip}.
	 * @param ctx the parse tree
	 */
	void enterOg_ip(CiscoNxosParser.Og_ipContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#og_ip}.
	 * @param ctx the parse tree
	 */
	void exitOg_ip(CiscoNxosParser.Og_ipContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ogip_address}.
	 * @param ctx the parse tree
	 */
	void enterOgip_address(CiscoNxosParser.Ogip_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ogip_address}.
	 * @param ctx the parse tree
	 */
	void exitOgip_address(CiscoNxosParser.Ogip_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#object_group_name}.
	 * @param ctx the parse tree
	 */
	void enterObject_group_name(CiscoNxosParser.Object_group_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#object_group_name}.
	 * @param ctx the parse tree
	 */
	void exitObject_group_name(CiscoNxosParser.Object_group_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ogipa_line}.
	 * @param ctx the parse tree
	 */
	void enterOgipa_line(CiscoNxosParser.Ogipa_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ogipa_line}.
	 * @param ctx the parse tree
	 */
	void exitOgipa_line(CiscoNxosParser.Ogipa_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#object_group_sequence}.
	 * @param ctx the parse tree
	 */
	void enterObject_group_sequence(CiscoNxosParser.Object_group_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#object_group_sequence}.
	 * @param ctx the parse tree
	 */
	void exitObject_group_sequence(CiscoNxosParser.Object_group_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#router_ospf}.
	 * @param ctx the parse tree
	 */
	void enterRouter_ospf(CiscoNxosParser.Router_ospfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#router_ospf}.
	 * @param ctx the parse tree
	 */
	void exitRouter_ospf(CiscoNxosParser.Router_ospfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro_common}.
	 * @param ctx the parse tree
	 */
	void enterRo_common(CiscoNxosParser.Ro_commonContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro_common}.
	 * @param ctx the parse tree
	 */
	void exitRo_common(CiscoNxosParser.Ro_commonContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro_area}.
	 * @param ctx the parse tree
	 */
	void enterRo_area(CiscoNxosParser.Ro_areaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro_area}.
	 * @param ctx the parse tree
	 */
	void exitRo_area(CiscoNxosParser.Ro_areaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#roa_authentication}.
	 * @param ctx the parse tree
	 */
	void enterRoa_authentication(CiscoNxosParser.Roa_authenticationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#roa_authentication}.
	 * @param ctx the parse tree
	 */
	void exitRoa_authentication(CiscoNxosParser.Roa_authenticationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#roa_default_cost}.
	 * @param ctx the parse tree
	 */
	void enterRoa_default_cost(CiscoNxosParser.Roa_default_costContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#roa_default_cost}.
	 * @param ctx the parse tree
	 */
	void exitRoa_default_cost(CiscoNxosParser.Roa_default_costContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#roa_filter_list}.
	 * @param ctx the parse tree
	 */
	void enterRoa_filter_list(CiscoNxosParser.Roa_filter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#roa_filter_list}.
	 * @param ctx the parse tree
	 */
	void exitRoa_filter_list(CiscoNxosParser.Roa_filter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#roa_nssa}.
	 * @param ctx the parse tree
	 */
	void enterRoa_nssa(CiscoNxosParser.Roa_nssaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#roa_nssa}.
	 * @param ctx the parse tree
	 */
	void exitRoa_nssa(CiscoNxosParser.Roa_nssaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#roa_range}.
	 * @param ctx the parse tree
	 */
	void enterRoa_range(CiscoNxosParser.Roa_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#roa_range}.
	 * @param ctx the parse tree
	 */
	void exitRoa_range(CiscoNxosParser.Roa_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#roa_stub}.
	 * @param ctx the parse tree
	 */
	void enterRoa_stub(CiscoNxosParser.Roa_stubContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#roa_stub}.
	 * @param ctx the parse tree
	 */
	void exitRoa_stub(CiscoNxosParser.Roa_stubContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#roa_virtual_link}.
	 * @param ctx the parse tree
	 */
	void enterRoa_virtual_link(CiscoNxosParser.Roa_virtual_linkContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#roa_virtual_link}.
	 * @param ctx the parse tree
	 */
	void exitRoa_virtual_link(CiscoNxosParser.Roa_virtual_linkContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro_auto_cost}.
	 * @param ctx the parse tree
	 */
	void enterRo_auto_cost(CiscoNxosParser.Ro_auto_costContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro_auto_cost}.
	 * @param ctx the parse tree
	 */
	void exitRo_auto_cost(CiscoNxosParser.Ro_auto_costContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro_bfd}.
	 * @param ctx the parse tree
	 */
	void enterRo_bfd(CiscoNxosParser.Ro_bfdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro_bfd}.
	 * @param ctx the parse tree
	 */
	void exitRo_bfd(CiscoNxosParser.Ro_bfdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro_default_information}.
	 * @param ctx the parse tree
	 */
	void enterRo_default_information(CiscoNxosParser.Ro_default_informationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro_default_information}.
	 * @param ctx the parse tree
	 */
	void exitRo_default_information(CiscoNxosParser.Ro_default_informationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro_distance}.
	 * @param ctx the parse tree
	 */
	void enterRo_distance(CiscoNxosParser.Ro_distanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro_distance}.
	 * @param ctx the parse tree
	 */
	void exitRo_distance(CiscoNxosParser.Ro_distanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro_graceful_restart}.
	 * @param ctx the parse tree
	 */
	void enterRo_graceful_restart(CiscoNxosParser.Ro_graceful_restartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro_graceful_restart}.
	 * @param ctx the parse tree
	 */
	void exitRo_graceful_restart(CiscoNxosParser.Ro_graceful_restartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rogr_graceful_restart}.
	 * @param ctx the parse tree
	 */
	void enterRogr_graceful_restart(CiscoNxosParser.Rogr_graceful_restartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rogr_graceful_restart}.
	 * @param ctx the parse tree
	 */
	void exitRogr_graceful_restart(CiscoNxosParser.Rogr_graceful_restartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rogr_null}.
	 * @param ctx the parse tree
	 */
	void enterRogr_null(CiscoNxosParser.Rogr_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rogr_null}.
	 * @param ctx the parse tree
	 */
	void exitRogr_null(CiscoNxosParser.Rogr_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro_log_adjacency_changes}.
	 * @param ctx the parse tree
	 */
	void enterRo_log_adjacency_changes(CiscoNxosParser.Ro_log_adjacency_changesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro_log_adjacency_changes}.
	 * @param ctx the parse tree
	 */
	void exitRo_log_adjacency_changes(CiscoNxosParser.Ro_log_adjacency_changesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro_max_metric}.
	 * @param ctx the parse tree
	 */
	void enterRo_max_metric(CiscoNxosParser.Ro_max_metricContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro_max_metric}.
	 * @param ctx the parse tree
	 */
	void exitRo_max_metric(CiscoNxosParser.Ro_max_metricContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#max_metric_summary_lsa}.
	 * @param ctx the parse tree
	 */
	void enterMax_metric_summary_lsa(CiscoNxosParser.Max_metric_summary_lsaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#max_metric_summary_lsa}.
	 * @param ctx the parse tree
	 */
	void exitMax_metric_summary_lsa(CiscoNxosParser.Max_metric_summary_lsaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro_name_lookup}.
	 * @param ctx the parse tree
	 */
	void enterRo_name_lookup(CiscoNxosParser.Ro_name_lookupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro_name_lookup}.
	 * @param ctx the parse tree
	 */
	void exitRo_name_lookup(CiscoNxosParser.Ro_name_lookupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro_network}.
	 * @param ctx the parse tree
	 */
	void enterRo_network(CiscoNxosParser.Ro_networkContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro_network}.
	 * @param ctx the parse tree
	 */
	void exitRo_network(CiscoNxosParser.Ro_networkContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro_passive_interface}.
	 * @param ctx the parse tree
	 */
	void enterRo_passive_interface(CiscoNxosParser.Ro_passive_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro_passive_interface}.
	 * @param ctx the parse tree
	 */
	void exitRo_passive_interface(CiscoNxosParser.Ro_passive_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro_redistribute}.
	 * @param ctx the parse tree
	 */
	void enterRo_redistribute(CiscoNxosParser.Ro_redistributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro_redistribute}.
	 * @param ctx the parse tree
	 */
	void exitRo_redistribute(CiscoNxosParser.Ro_redistributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ror_null}.
	 * @param ctx the parse tree
	 */
	void enterRor_null(CiscoNxosParser.Ror_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ror_null}.
	 * @param ctx the parse tree
	 */
	void exitRor_null(CiscoNxosParser.Ror_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ror_redistribute_route_map}.
	 * @param ctx the parse tree
	 */
	void enterRor_redistribute_route_map(CiscoNxosParser.Ror_redistribute_route_mapContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ror_redistribute_route_map}.
	 * @param ctx the parse tree
	 */
	void exitRor_redistribute_route_map(CiscoNxosParser.Ror_redistribute_route_mapContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro_router_id}.
	 * @param ctx the parse tree
	 */
	void enterRo_router_id(CiscoNxosParser.Ro_router_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro_router_id}.
	 * @param ctx the parse tree
	 */
	void exitRo_router_id(CiscoNxosParser.Ro_router_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro_summary_address}.
	 * @param ctx the parse tree
	 */
	void enterRo_summary_address(CiscoNxosParser.Ro_summary_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro_summary_address}.
	 * @param ctx the parse tree
	 */
	void exitRo_summary_address(CiscoNxosParser.Ro_summary_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro_timers}.
	 * @param ctx the parse tree
	 */
	void enterRo_timers(CiscoNxosParser.Ro_timersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro_timers}.
	 * @param ctx the parse tree
	 */
	void exitRo_timers(CiscoNxosParser.Ro_timersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rot_lsa_arrival}.
	 * @param ctx the parse tree
	 */
	void enterRot_lsa_arrival(CiscoNxosParser.Rot_lsa_arrivalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rot_lsa_arrival}.
	 * @param ctx the parse tree
	 */
	void exitRot_lsa_arrival(CiscoNxosParser.Rot_lsa_arrivalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#lsa_arrival_interval}.
	 * @param ctx the parse tree
	 */
	void enterLsa_arrival_interval(CiscoNxosParser.Lsa_arrival_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#lsa_arrival_interval}.
	 * @param ctx the parse tree
	 */
	void exitLsa_arrival_interval(CiscoNxosParser.Lsa_arrival_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rot_lsa_group_pacing}.
	 * @param ctx the parse tree
	 */
	void enterRot_lsa_group_pacing(CiscoNxosParser.Rot_lsa_group_pacingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rot_lsa_group_pacing}.
	 * @param ctx the parse tree
	 */
	void exitRot_lsa_group_pacing(CiscoNxosParser.Rot_lsa_group_pacingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#lsa_group_pacing_interval}.
	 * @param ctx the parse tree
	 */
	void enterLsa_group_pacing_interval(CiscoNxosParser.Lsa_group_pacing_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#lsa_group_pacing_interval}.
	 * @param ctx the parse tree
	 */
	void exitLsa_group_pacing_interval(CiscoNxosParser.Lsa_group_pacing_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rot_throttle}.
	 * @param ctx the parse tree
	 */
	void enterRot_throttle(CiscoNxosParser.Rot_throttleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rot_throttle}.
	 * @param ctx the parse tree
	 */
	void exitRot_throttle(CiscoNxosParser.Rot_throttleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rott_lsa}.
	 * @param ctx the parse tree
	 */
	void enterRott_lsa(CiscoNxosParser.Rott_lsaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rott_lsa}.
	 * @param ctx the parse tree
	 */
	void exitRott_lsa(CiscoNxosParser.Rott_lsaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#lsa_start_interval}.
	 * @param ctx the parse tree
	 */
	void enterLsa_start_interval(CiscoNxosParser.Lsa_start_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#lsa_start_interval}.
	 * @param ctx the parse tree
	 */
	void exitLsa_start_interval(CiscoNxosParser.Lsa_start_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#lsa_hold_interval}.
	 * @param ctx the parse tree
	 */
	void enterLsa_hold_interval(CiscoNxosParser.Lsa_hold_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#lsa_hold_interval}.
	 * @param ctx the parse tree
	 */
	void exitLsa_hold_interval(CiscoNxosParser.Lsa_hold_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#lsa_max_interval}.
	 * @param ctx the parse tree
	 */
	void enterLsa_max_interval(CiscoNxosParser.Lsa_max_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#lsa_max_interval}.
	 * @param ctx the parse tree
	 */
	void exitLsa_max_interval(CiscoNxosParser.Lsa_max_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rott_null}.
	 * @param ctx the parse tree
	 */
	void enterRott_null(CiscoNxosParser.Rott_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rott_null}.
	 * @param ctx the parse tree
	 */
	void exitRott_null(CiscoNxosParser.Rott_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro_vrf}.
	 * @param ctx the parse tree
	 */
	void enterRo_vrf(CiscoNxosParser.Ro_vrfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro_vrf}.
	 * @param ctx the parse tree
	 */
	void exitRo_vrf(CiscoNxosParser.Ro_vrfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ospfv3_default_metric}.
	 * @param ctx the parse tree
	 */
	void enterOspfv3_default_metric(CiscoNxosParser.Ospfv3_default_metricContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ospfv3_default_metric}.
	 * @param ctx the parse tree
	 */
	void exitOspfv3_default_metric(CiscoNxosParser.Ospfv3_default_metricContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ospfv3_lsa_arrival_interval}.
	 * @param ctx the parse tree
	 */
	void enterOspfv3_lsa_arrival_interval(CiscoNxosParser.Ospfv3_lsa_arrival_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ospfv3_lsa_arrival_interval}.
	 * @param ctx the parse tree
	 */
	void exitOspfv3_lsa_arrival_interval(CiscoNxosParser.Ospfv3_lsa_arrival_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ospfv3_lsa_group_pacing_interval}.
	 * @param ctx the parse tree
	 */
	void enterOspfv3_lsa_group_pacing_interval(CiscoNxosParser.Ospfv3_lsa_group_pacing_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ospfv3_lsa_group_pacing_interval}.
	 * @param ctx the parse tree
	 */
	void exitOspfv3_lsa_group_pacing_interval(CiscoNxosParser.Ospfv3_lsa_group_pacing_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ospfv3_max_lsa_count}.
	 * @param ctx the parse tree
	 */
	void enterOspfv3_max_lsa_count(CiscoNxosParser.Ospfv3_max_lsa_countContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ospfv3_max_lsa_count}.
	 * @param ctx the parse tree
	 */
	void exitOspfv3_max_lsa_count(CiscoNxosParser.Ospfv3_max_lsa_countContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ospfv3_maximum_prefix_num}.
	 * @param ctx the parse tree
	 */
	void enterOspfv3_maximum_prefix_num(CiscoNxosParser.Ospfv3_maximum_prefix_numContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ospfv3_maximum_prefix_num}.
	 * @param ctx the parse tree
	 */
	void exitOspfv3_maximum_prefix_num(CiscoNxosParser.Ospfv3_maximum_prefix_numContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ospfv3_spf_time}.
	 * @param ctx the parse tree
	 */
	void enterOspfv3_spf_time(CiscoNxosParser.Ospfv3_spf_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ospfv3_spf_time}.
	 * @param ctx the parse tree
	 */
	void exitOspfv3_spf_time(CiscoNxosParser.Ospfv3_spf_timeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ospfv3_throttle_lsa_start}.
	 * @param ctx the parse tree
	 */
	void enterOspfv3_throttle_lsa_start(CiscoNxosParser.Ospfv3_throttle_lsa_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ospfv3_throttle_lsa_start}.
	 * @param ctx the parse tree
	 */
	void exitOspfv3_throttle_lsa_start(CiscoNxosParser.Ospfv3_throttle_lsa_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ospfv3_throttle_lsa_hold}.
	 * @param ctx the parse tree
	 */
	void enterOspfv3_throttle_lsa_hold(CiscoNxosParser.Ospfv3_throttle_lsa_holdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ospfv3_throttle_lsa_hold}.
	 * @param ctx the parse tree
	 */
	void exitOspfv3_throttle_lsa_hold(CiscoNxosParser.Ospfv3_throttle_lsa_holdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ospfv3_throttle_lsa_max}.
	 * @param ctx the parse tree
	 */
	void enterOspfv3_throttle_lsa_max(CiscoNxosParser.Ospfv3_throttle_lsa_maxContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ospfv3_throttle_lsa_max}.
	 * @param ctx the parse tree
	 */
	void exitOspfv3_throttle_lsa_max(CiscoNxosParser.Ospfv3_throttle_lsa_maxContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ospfv3_virtual_link_interval}.
	 * @param ctx the parse tree
	 */
	void enterOspfv3_virtual_link_interval(CiscoNxosParser.Ospfv3_virtual_link_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ospfv3_virtual_link_interval}.
	 * @param ctx the parse tree
	 */
	void exitOspfv3_virtual_link_interval(CiscoNxosParser.Ospfv3_virtual_link_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ospfv3_virtual_link_tx_delay}.
	 * @param ctx the parse tree
	 */
	void enterOspfv3_virtual_link_tx_delay(CiscoNxosParser.Ospfv3_virtual_link_tx_delayContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ospfv3_virtual_link_tx_delay}.
	 * @param ctx the parse tree
	 */
	void exitOspfv3_virtual_link_tx_delay(CiscoNxosParser.Ospfv3_virtual_link_tx_delayContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#router_ospfv3}.
	 * @param ctx the parse tree
	 */
	void enterRouter_ospfv3(CiscoNxosParser.Router_ospfv3Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#router_ospfv3}.
	 * @param ctx the parse tree
	 */
	void exitRouter_ospfv3(CiscoNxosParser.Router_ospfv3Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3_common}.
	 * @param ctx the parse tree
	 */
	void enterRo3_common(CiscoNxosParser.Ro3_commonContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3_common}.
	 * @param ctx the parse tree
	 */
	void exitRo3_common(CiscoNxosParser.Ro3_commonContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3_address_family}.
	 * @param ctx the parse tree
	 */
	void enterRo3_address_family(CiscoNxosParser.Ro3_address_familyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3_address_family}.
	 * @param ctx the parse tree
	 */
	void exitRo3_address_family(CiscoNxosParser.Ro3_address_familyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3_af6_area}.
	 * @param ctx the parse tree
	 */
	void enterRo3_af6_area(CiscoNxosParser.Ro3_af6_areaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3_af6_area}.
	 * @param ctx the parse tree
	 */
	void exitRo3_af6_area(CiscoNxosParser.Ro3_af6_areaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3_af6_a_default_cost}.
	 * @param ctx the parse tree
	 */
	void enterRo3_af6_a_default_cost(CiscoNxosParser.Ro3_af6_a_default_costContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3_af6_a_default_cost}.
	 * @param ctx the parse tree
	 */
	void exitRo3_af6_a_default_cost(CiscoNxosParser.Ro3_af6_a_default_costContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3_af6_a_filter_list}.
	 * @param ctx the parse tree
	 */
	void enterRo3_af6_a_filter_list(CiscoNxosParser.Ro3_af6_a_filter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3_af6_a_filter_list}.
	 * @param ctx the parse tree
	 */
	void exitRo3_af6_a_filter_list(CiscoNxosParser.Ro3_af6_a_filter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3_af6_a_range}.
	 * @param ctx the parse tree
	 */
	void enterRo3_af6_a_range(CiscoNxosParser.Ro3_af6_a_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3_af6_a_range}.
	 * @param ctx the parse tree
	 */
	void exitRo3_af6_a_range(CiscoNxosParser.Ro3_af6_a_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3_af6_default_information}.
	 * @param ctx the parse tree
	 */
	void enterRo3_af6_default_information(CiscoNxosParser.Ro3_af6_default_informationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3_af6_default_information}.
	 * @param ctx the parse tree
	 */
	void exitRo3_af6_default_information(CiscoNxosParser.Ro3_af6_default_informationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3_af6_default_metric}.
	 * @param ctx the parse tree
	 */
	void enterRo3_af6_default_metric(CiscoNxosParser.Ro3_af6_default_metricContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3_af6_default_metric}.
	 * @param ctx the parse tree
	 */
	void exitRo3_af6_default_metric(CiscoNxosParser.Ro3_af6_default_metricContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3_af6_distance}.
	 * @param ctx the parse tree
	 */
	void enterRo3_af6_distance(CiscoNxosParser.Ro3_af6_distanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3_af6_distance}.
	 * @param ctx the parse tree
	 */
	void exitRo3_af6_distance(CiscoNxosParser.Ro3_af6_distanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3_af6_maximum_paths}.
	 * @param ctx the parse tree
	 */
	void enterRo3_af6_maximum_paths(CiscoNxosParser.Ro3_af6_maximum_pathsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3_af6_maximum_paths}.
	 * @param ctx the parse tree
	 */
	void exitRo3_af6_maximum_paths(CiscoNxosParser.Ro3_af6_maximum_pathsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3_af6_redistribute}.
	 * @param ctx the parse tree
	 */
	void enterRo3_af6_redistribute(CiscoNxosParser.Ro3_af6_redistributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3_af6_redistribute}.
	 * @param ctx the parse tree
	 */
	void exitRo3_af6_redistribute(CiscoNxosParser.Ro3_af6_redistributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3_af6_rd_maximum_prefix}.
	 * @param ctx the parse tree
	 */
	void enterRo3_af6_rd_maximum_prefix(CiscoNxosParser.Ro3_af6_rd_maximum_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3_af6_rd_maximum_prefix}.
	 * @param ctx the parse tree
	 */
	void exitRo3_af6_rd_maximum_prefix(CiscoNxosParser.Ro3_af6_rd_maximum_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3_af6_rd_routing_instance}.
	 * @param ctx the parse tree
	 */
	void enterRo3_af6_rd_routing_instance(CiscoNxosParser.Ro3_af6_rd_routing_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3_af6_rd_routing_instance}.
	 * @param ctx the parse tree
	 */
	void exitRo3_af6_rd_routing_instance(CiscoNxosParser.Ro3_af6_rd_routing_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3_af6_summary_address}.
	 * @param ctx the parse tree
	 */
	void enterRo3_af6_summary_address(CiscoNxosParser.Ro3_af6_summary_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3_af6_summary_address}.
	 * @param ctx the parse tree
	 */
	void exitRo3_af6_summary_address(CiscoNxosParser.Ro3_af6_summary_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3_af6_table_map}.
	 * @param ctx the parse tree
	 */
	void enterRo3_af6_table_map(CiscoNxosParser.Ro3_af6_table_mapContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3_af6_table_map}.
	 * @param ctx the parse tree
	 */
	void exitRo3_af6_table_map(CiscoNxosParser.Ro3_af6_table_mapContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3_af6_timers}.
	 * @param ctx the parse tree
	 */
	void enterRo3_af6_timers(CiscoNxosParser.Ro3_af6_timersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3_af6_timers}.
	 * @param ctx the parse tree
	 */
	void exitRo3_af6_timers(CiscoNxosParser.Ro3_af6_timersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3_area}.
	 * @param ctx the parse tree
	 */
	void enterRo3_area(CiscoNxosParser.Ro3_areaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3_area}.
	 * @param ctx the parse tree
	 */
	void exitRo3_area(CiscoNxosParser.Ro3_areaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3a_authentication}.
	 * @param ctx the parse tree
	 */
	void enterRo3a_authentication(CiscoNxosParser.Ro3a_authenticationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3a_authentication}.
	 * @param ctx the parse tree
	 */
	void exitRo3a_authentication(CiscoNxosParser.Ro3a_authenticationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3a_nssa}.
	 * @param ctx the parse tree
	 */
	void enterRo3a_nssa(CiscoNxosParser.Ro3a_nssaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3a_nssa}.
	 * @param ctx the parse tree
	 */
	void exitRo3a_nssa(CiscoNxosParser.Ro3a_nssaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3a_nssa_nssa}.
	 * @param ctx the parse tree
	 */
	void enterRo3a_nssa_nssa(CiscoNxosParser.Ro3a_nssa_nssaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3a_nssa_nssa}.
	 * @param ctx the parse tree
	 */
	void exitRo3a_nssa_nssa(CiscoNxosParser.Ro3a_nssa_nssaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3a_nssa_translate}.
	 * @param ctx the parse tree
	 */
	void enterRo3a_nssa_translate(CiscoNxosParser.Ro3a_nssa_translateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3a_nssa_translate}.
	 * @param ctx the parse tree
	 */
	void exitRo3a_nssa_translate(CiscoNxosParser.Ro3a_nssa_translateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3a_nssa_other}.
	 * @param ctx the parse tree
	 */
	void enterRo3a_nssa_other(CiscoNxosParser.Ro3a_nssa_otherContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3a_nssa_other}.
	 * @param ctx the parse tree
	 */
	void exitRo3a_nssa_other(CiscoNxosParser.Ro3a_nssa_otherContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3a_nssa_o_default_information_originate}.
	 * @param ctx the parse tree
	 */
	void enterRo3a_nssa_o_default_information_originate(CiscoNxosParser.Ro3a_nssa_o_default_information_originateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3a_nssa_o_default_information_originate}.
	 * @param ctx the parse tree
	 */
	void exitRo3a_nssa_o_default_information_originate(CiscoNxosParser.Ro3a_nssa_o_default_information_originateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3a_nssa_o_no_redistribution}.
	 * @param ctx the parse tree
	 */
	void enterRo3a_nssa_o_no_redistribution(CiscoNxosParser.Ro3a_nssa_o_no_redistributionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3a_nssa_o_no_redistribution}.
	 * @param ctx the parse tree
	 */
	void exitRo3a_nssa_o_no_redistribution(CiscoNxosParser.Ro3a_nssa_o_no_redistributionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3a_nssa_o_no_summary}.
	 * @param ctx the parse tree
	 */
	void enterRo3a_nssa_o_no_summary(CiscoNxosParser.Ro3a_nssa_o_no_summaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3a_nssa_o_no_summary}.
	 * @param ctx the parse tree
	 */
	void exitRo3a_nssa_o_no_summary(CiscoNxosParser.Ro3a_nssa_o_no_summaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3a_stub}.
	 * @param ctx the parse tree
	 */
	void enterRo3a_stub(CiscoNxosParser.Ro3a_stubContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3a_stub}.
	 * @param ctx the parse tree
	 */
	void exitRo3a_stub(CiscoNxosParser.Ro3a_stubContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3a_virtual_link}.
	 * @param ctx the parse tree
	 */
	void enterRo3a_virtual_link(CiscoNxosParser.Ro3a_virtual_linkContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3a_virtual_link}.
	 * @param ctx the parse tree
	 */
	void exitRo3a_virtual_link(CiscoNxosParser.Ro3a_virtual_linkContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3a_vl_dead_interval}.
	 * @param ctx the parse tree
	 */
	void enterRo3a_vl_dead_interval(CiscoNxosParser.Ro3a_vl_dead_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3a_vl_dead_interval}.
	 * @param ctx the parse tree
	 */
	void exitRo3a_vl_dead_interval(CiscoNxosParser.Ro3a_vl_dead_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3a_vl_hello_interval}.
	 * @param ctx the parse tree
	 */
	void enterRo3a_vl_hello_interval(CiscoNxosParser.Ro3a_vl_hello_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3a_vl_hello_interval}.
	 * @param ctx the parse tree
	 */
	void exitRo3a_vl_hello_interval(CiscoNxosParser.Ro3a_vl_hello_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3a_vl_retransmit_interval}.
	 * @param ctx the parse tree
	 */
	void enterRo3a_vl_retransmit_interval(CiscoNxosParser.Ro3a_vl_retransmit_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3a_vl_retransmit_interval}.
	 * @param ctx the parse tree
	 */
	void exitRo3a_vl_retransmit_interval(CiscoNxosParser.Ro3a_vl_retransmit_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3a_vl_transmit_delay}.
	 * @param ctx the parse tree
	 */
	void enterRo3a_vl_transmit_delay(CiscoNxosParser.Ro3a_vl_transmit_delayContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3a_vl_transmit_delay}.
	 * @param ctx the parse tree
	 */
	void exitRo3a_vl_transmit_delay(CiscoNxosParser.Ro3a_vl_transmit_delayContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3_auto_cost}.
	 * @param ctx the parse tree
	 */
	void enterRo3_auto_cost(CiscoNxosParser.Ro3_auto_costContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3_auto_cost}.
	 * @param ctx the parse tree
	 */
	void exitRo3_auto_cost(CiscoNxosParser.Ro3_auto_costContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3_bfd}.
	 * @param ctx the parse tree
	 */
	void enterRo3_bfd(CiscoNxosParser.Ro3_bfdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3_bfd}.
	 * @param ctx the parse tree
	 */
	void exitRo3_bfd(CiscoNxosParser.Ro3_bfdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3_discard_route}.
	 * @param ctx the parse tree
	 */
	void enterRo3_discard_route(CiscoNxosParser.Ro3_discard_routeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3_discard_route}.
	 * @param ctx the parse tree
	 */
	void exitRo3_discard_route(CiscoNxosParser.Ro3_discard_routeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3_flush_routes}.
	 * @param ctx the parse tree
	 */
	void enterRo3_flush_routes(CiscoNxosParser.Ro3_flush_routesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3_flush_routes}.
	 * @param ctx the parse tree
	 */
	void exitRo3_flush_routes(CiscoNxosParser.Ro3_flush_routesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3_graceful_restart}.
	 * @param ctx the parse tree
	 */
	void enterRo3_graceful_restart(CiscoNxosParser.Ro3_graceful_restartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3_graceful_restart}.
	 * @param ctx the parse tree
	 */
	void exitRo3_graceful_restart(CiscoNxosParser.Ro3_graceful_restartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3_gr_graceful_restart}.
	 * @param ctx the parse tree
	 */
	void enterRo3_gr_graceful_restart(CiscoNxosParser.Ro3_gr_graceful_restartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3_gr_graceful_restart}.
	 * @param ctx the parse tree
	 */
	void exitRo3_gr_graceful_restart(CiscoNxosParser.Ro3_gr_graceful_restartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3_gr_null}.
	 * @param ctx the parse tree
	 */
	void enterRo3_gr_null(CiscoNxosParser.Ro3_gr_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3_gr_null}.
	 * @param ctx the parse tree
	 */
	void exitRo3_gr_null(CiscoNxosParser.Ro3_gr_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3_isolate}.
	 * @param ctx the parse tree
	 */
	void enterRo3_isolate(CiscoNxosParser.Ro3_isolateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3_isolate}.
	 * @param ctx the parse tree
	 */
	void exitRo3_isolate(CiscoNxosParser.Ro3_isolateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3_log_adjacency_changes}.
	 * @param ctx the parse tree
	 */
	void enterRo3_log_adjacency_changes(CiscoNxosParser.Ro3_log_adjacency_changesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3_log_adjacency_changes}.
	 * @param ctx the parse tree
	 */
	void exitRo3_log_adjacency_changes(CiscoNxosParser.Ro3_log_adjacency_changesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3_max_lsa}.
	 * @param ctx the parse tree
	 */
	void enterRo3_max_lsa(CiscoNxosParser.Ro3_max_lsaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3_max_lsa}.
	 * @param ctx the parse tree
	 */
	void exitRo3_max_lsa(CiscoNxosParser.Ro3_max_lsaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3_max_metric}.
	 * @param ctx the parse tree
	 */
	void enterRo3_max_metric(CiscoNxosParser.Ro3_max_metricContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3_max_metric}.
	 * @param ctx the parse tree
	 */
	void exitRo3_max_metric(CiscoNxosParser.Ro3_max_metricContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3_name_lookup}.
	 * @param ctx the parse tree
	 */
	void enterRo3_name_lookup(CiscoNxosParser.Ro3_name_lookupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3_name_lookup}.
	 * @param ctx the parse tree
	 */
	void exitRo3_name_lookup(CiscoNxosParser.Ro3_name_lookupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3_passive_interface}.
	 * @param ctx the parse tree
	 */
	void enterRo3_passive_interface(CiscoNxosParser.Ro3_passive_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3_passive_interface}.
	 * @param ctx the parse tree
	 */
	void exitRo3_passive_interface(CiscoNxosParser.Ro3_passive_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3_router_id}.
	 * @param ctx the parse tree
	 */
	void enterRo3_router_id(CiscoNxosParser.Ro3_router_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3_router_id}.
	 * @param ctx the parse tree
	 */
	void exitRo3_router_id(CiscoNxosParser.Ro3_router_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3_shutdown}.
	 * @param ctx the parse tree
	 */
	void enterRo3_shutdown(CiscoNxosParser.Ro3_shutdownContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3_shutdown}.
	 * @param ctx the parse tree
	 */
	void exitRo3_shutdown(CiscoNxosParser.Ro3_shutdownContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3_timers}.
	 * @param ctx the parse tree
	 */
	void enterRo3_timers(CiscoNxosParser.Ro3_timersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3_timers}.
	 * @param ctx the parse tree
	 */
	void exitRo3_timers(CiscoNxosParser.Ro3_timersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3_tim_lsa_arrival}.
	 * @param ctx the parse tree
	 */
	void enterRo3_tim_lsa_arrival(CiscoNxosParser.Ro3_tim_lsa_arrivalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3_tim_lsa_arrival}.
	 * @param ctx the parse tree
	 */
	void exitRo3_tim_lsa_arrival(CiscoNxosParser.Ro3_tim_lsa_arrivalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3_tim_lsa_group_pacing}.
	 * @param ctx the parse tree
	 */
	void enterRo3_tim_lsa_group_pacing(CiscoNxosParser.Ro3_tim_lsa_group_pacingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3_tim_lsa_group_pacing}.
	 * @param ctx the parse tree
	 */
	void exitRo3_tim_lsa_group_pacing(CiscoNxosParser.Ro3_tim_lsa_group_pacingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3_tim_throttle}.
	 * @param ctx the parse tree
	 */
	void enterRo3_tim_throttle(CiscoNxosParser.Ro3_tim_throttleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3_tim_throttle}.
	 * @param ctx the parse tree
	 */
	void exitRo3_tim_throttle(CiscoNxosParser.Ro3_tim_throttleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3_summary_address}.
	 * @param ctx the parse tree
	 */
	void enterRo3_summary_address(CiscoNxosParser.Ro3_summary_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3_summary_address}.
	 * @param ctx the parse tree
	 */
	void exitRo3_summary_address(CiscoNxosParser.Ro3_summary_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ro3_vrf}.
	 * @param ctx the parse tree
	 */
	void enterRo3_vrf(CiscoNxosParser.Ro3_vrfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ro3_vrf}.
	 * @param ctx the parse tree
	 */
	void exitRo3_vrf(CiscoNxosParser.Ro3_vrfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#policy_map_description}.
	 * @param ctx the parse tree
	 */
	void enterPolicy_map_description(CiscoNxosParser.Policy_map_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#policy_map_description}.
	 * @param ctx the parse tree
	 */
	void exitPolicy_map_description(CiscoNxosParser.Policy_map_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#s_policy_map}.
	 * @param ctx the parse tree
	 */
	void enterS_policy_map(CiscoNxosParser.S_policy_mapContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#s_policy_map}.
	 * @param ctx the parse tree
	 */
	void exitS_policy_map(CiscoNxosParser.S_policy_mapContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#pm_type}.
	 * @param ctx the parse tree
	 */
	void enterPm_type(CiscoNxosParser.Pm_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#pm_type}.
	 * @param ctx the parse tree
	 */
	void exitPm_type(CiscoNxosParser.Pm_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#pmt_control_plane}.
	 * @param ctx the parse tree
	 */
	void enterPmt_control_plane(CiscoNxosParser.Pmt_control_planeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#pmt_control_plane}.
	 * @param ctx the parse tree
	 */
	void exitPmt_control_plane(CiscoNxosParser.Pmt_control_planeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#pmt_network_qos}.
	 * @param ctx the parse tree
	 */
	void enterPmt_network_qos(CiscoNxosParser.Pmt_network_qosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#pmt_network_qos}.
	 * @param ctx the parse tree
	 */
	void exitPmt_network_qos(CiscoNxosParser.Pmt_network_qosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#pmt_qos}.
	 * @param ctx the parse tree
	 */
	void enterPmt_qos(CiscoNxosParser.Pmt_qosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#pmt_qos}.
	 * @param ctx the parse tree
	 */
	void exitPmt_qos(CiscoNxosParser.Pmt_qosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#pmt_queuing}.
	 * @param ctx the parse tree
	 */
	void enterPmt_queuing(CiscoNxosParser.Pmt_queuingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#pmt_queuing}.
	 * @param ctx the parse tree
	 */
	void exitPmt_queuing(CiscoNxosParser.Pmt_queuingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#pm_control_plane}.
	 * @param ctx the parse tree
	 */
	void enterPm_control_plane(CiscoNxosParser.Pm_control_planeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#pm_control_plane}.
	 * @param ctx the parse tree
	 */
	void exitPm_control_plane(CiscoNxosParser.Pm_control_planeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#pmcp_class}.
	 * @param ctx the parse tree
	 */
	void enterPmcp_class(CiscoNxosParser.Pmcp_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#pmcp_class}.
	 * @param ctx the parse tree
	 */
	void exitPmcp_class(CiscoNxosParser.Pmcp_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#pmcpc_police}.
	 * @param ctx the parse tree
	 */
	void enterPmcpc_police(CiscoNxosParser.Pmcpc_policeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#pmcpc_police}.
	 * @param ctx the parse tree
	 */
	void exitPmcpc_police(CiscoNxosParser.Pmcpc_policeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#pmcpc_set}.
	 * @param ctx the parse tree
	 */
	void enterPmcpc_set(CiscoNxosParser.Pmcpc_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#pmcpc_set}.
	 * @param ctx the parse tree
	 */
	void exitPmcpc_set(CiscoNxosParser.Pmcpc_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#pm_network_qos}.
	 * @param ctx the parse tree
	 */
	void enterPm_network_qos(CiscoNxosParser.Pm_network_qosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#pm_network_qos}.
	 * @param ctx the parse tree
	 */
	void exitPm_network_qos(CiscoNxosParser.Pm_network_qosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#pmnq_class}.
	 * @param ctx the parse tree
	 */
	void enterPmnq_class(CiscoNxosParser.Pmnq_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#pmnq_class}.
	 * @param ctx the parse tree
	 */
	void exitPmnq_class(CiscoNxosParser.Pmnq_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#pmnqc_mtu}.
	 * @param ctx the parse tree
	 */
	void enterPmnqc_mtu(CiscoNxosParser.Pmnqc_mtuContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#pmnqc_mtu}.
	 * @param ctx the parse tree
	 */
	void exitPmnqc_mtu(CiscoNxosParser.Pmnqc_mtuContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#pmnqc_no}.
	 * @param ctx the parse tree
	 */
	void enterPmnqc_no(CiscoNxosParser.Pmnqc_noContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#pmnqc_no}.
	 * @param ctx the parse tree
	 */
	void exitPmnqc_no(CiscoNxosParser.Pmnqc_noContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#pmnqc_no_null}.
	 * @param ctx the parse tree
	 */
	void enterPmnqc_no_null(CiscoNxosParser.Pmnqc_no_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#pmnqc_no_null}.
	 * @param ctx the parse tree
	 */
	void exitPmnqc_no_null(CiscoNxosParser.Pmnqc_no_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#pmnqc_null}.
	 * @param ctx the parse tree
	 */
	void enterPmnqc_null(CiscoNxosParser.Pmnqc_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#pmnqc_null}.
	 * @param ctx the parse tree
	 */
	void exitPmnqc_null(CiscoNxosParser.Pmnqc_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#pmnq_description}.
	 * @param ctx the parse tree
	 */
	void enterPmnq_description(CiscoNxosParser.Pmnq_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#pmnq_description}.
	 * @param ctx the parse tree
	 */
	void exitPmnq_description(CiscoNxosParser.Pmnq_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#qos_mtu}.
	 * @param ctx the parse tree
	 */
	void enterQos_mtu(CiscoNxosParser.Qos_mtuContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#qos_mtu}.
	 * @param ctx the parse tree
	 */
	void exitQos_mtu(CiscoNxosParser.Qos_mtuContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#pm_qos}.
	 * @param ctx the parse tree
	 */
	void enterPm_qos(CiscoNxosParser.Pm_qosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#pm_qos}.
	 * @param ctx the parse tree
	 */
	void exitPm_qos(CiscoNxosParser.Pm_qosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#pmq_class}.
	 * @param ctx the parse tree
	 */
	void enterPmq_class(CiscoNxosParser.Pmq_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#pmq_class}.
	 * @param ctx the parse tree
	 */
	void exitPmq_class(CiscoNxosParser.Pmq_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#pmqc_set}.
	 * @param ctx the parse tree
	 */
	void enterPmqc_set(CiscoNxosParser.Pmqc_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#pmqc_set}.
	 * @param ctx the parse tree
	 */
	void exitPmqc_set(CiscoNxosParser.Pmqc_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#pmqcs_qos_group}.
	 * @param ctx the parse tree
	 */
	void enterPmqcs_qos_group(CiscoNxosParser.Pmqcs_qos_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#pmqcs_qos_group}.
	 * @param ctx the parse tree
	 */
	void exitPmqcs_qos_group(CiscoNxosParser.Pmqcs_qos_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#pmq_description}.
	 * @param ctx the parse tree
	 */
	void enterPmq_description(CiscoNxosParser.Pmq_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#pmq_description}.
	 * @param ctx the parse tree
	 */
	void exitPmq_description(CiscoNxosParser.Pmq_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#pm_queuing}.
	 * @param ctx the parse tree
	 */
	void enterPm_queuing(CiscoNxosParser.Pm_queuingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#pm_queuing}.
	 * @param ctx the parse tree
	 */
	void exitPm_queuing(CiscoNxosParser.Pm_queuingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#pmqu_class}.
	 * @param ctx the parse tree
	 */
	void enterPmqu_class(CiscoNxosParser.Pmqu_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#pmqu_class}.
	 * @param ctx the parse tree
	 */
	void exitPmqu_class(CiscoNxosParser.Pmqu_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#pmquc_null}.
	 * @param ctx the parse tree
	 */
	void enterPmquc_null(CiscoNxosParser.Pmquc_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#pmquc_null}.
	 * @param ctx the parse tree
	 */
	void exitPmquc_null(CiscoNxosParser.Pmquc_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rip_metric}.
	 * @param ctx the parse tree
	 */
	void enterRip_metric(CiscoNxosParser.Rip_metricContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rip_metric}.
	 * @param ctx the parse tree
	 */
	void exitRip_metric(CiscoNxosParser.Rip_metricContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rip_garbage_period}.
	 * @param ctx the parse tree
	 */
	void enterRip_garbage_period(CiscoNxosParser.Rip_garbage_periodContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rip_garbage_period}.
	 * @param ctx the parse tree
	 */
	void exitRip_garbage_period(CiscoNxosParser.Rip_garbage_periodContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rip_holddown_period}.
	 * @param ctx the parse tree
	 */
	void enterRip_holddown_period(CiscoNxosParser.Rip_holddown_periodContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rip_holddown_period}.
	 * @param ctx the parse tree
	 */
	void exitRip_holddown_period(CiscoNxosParser.Rip_holddown_periodContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rip_timeout_period}.
	 * @param ctx the parse tree
	 */
	void enterRip_timeout_period(CiscoNxosParser.Rip_timeout_periodContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rip_timeout_period}.
	 * @param ctx the parse tree
	 */
	void exitRip_timeout_period(CiscoNxosParser.Rip_timeout_periodContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rip_update_period}.
	 * @param ctx the parse tree
	 */
	void enterRip_update_period(CiscoNxosParser.Rip_update_periodContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rip_update_period}.
	 * @param ctx the parse tree
	 */
	void exitRip_update_period(CiscoNxosParser.Rip_update_periodContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#router_rip}.
	 * @param ctx the parse tree
	 */
	void enterRouter_rip(CiscoNxosParser.Router_ripContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#router_rip}.
	 * @param ctx the parse tree
	 */
	void exitRouter_rip(CiscoNxosParser.Router_ripContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rr_flush_routes}.
	 * @param ctx the parse tree
	 */
	void enterRr_flush_routes(CiscoNxosParser.Rr_flush_routesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rr_flush_routes}.
	 * @param ctx the parse tree
	 */
	void exitRr_flush_routes(CiscoNxosParser.Rr_flush_routesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rr_isolate}.
	 * @param ctx the parse tree
	 */
	void enterRr_isolate(CiscoNxosParser.Rr_isolateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rr_isolate}.
	 * @param ctx the parse tree
	 */
	void exitRr_isolate(CiscoNxosParser.Rr_isolateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rr_metric}.
	 * @param ctx the parse tree
	 */
	void enterRr_metric(CiscoNxosParser.Rr_metricContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rr_metric}.
	 * @param ctx the parse tree
	 */
	void exitRr_metric(CiscoNxosParser.Rr_metricContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rr_no}.
	 * @param ctx the parse tree
	 */
	void enterRr_no(CiscoNxosParser.Rr_noContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rr_no}.
	 * @param ctx the parse tree
	 */
	void exitRr_no(CiscoNxosParser.Rr_noContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rr_no_flush_routes}.
	 * @param ctx the parse tree
	 */
	void enterRr_no_flush_routes(CiscoNxosParser.Rr_no_flush_routesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rr_no_flush_routes}.
	 * @param ctx the parse tree
	 */
	void exitRr_no_flush_routes(CiscoNxosParser.Rr_no_flush_routesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rr_no_isolate}.
	 * @param ctx the parse tree
	 */
	void enterRr_no_isolate(CiscoNxosParser.Rr_no_isolateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rr_no_isolate}.
	 * @param ctx the parse tree
	 */
	void exitRr_no_isolate(CiscoNxosParser.Rr_no_isolateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rr_vrf}.
	 * @param ctx the parse tree
	 */
	void enterRr_vrf(CiscoNxosParser.Rr_vrfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rr_vrf}.
	 * @param ctx the parse tree
	 */
	void exitRr_vrf(CiscoNxosParser.Rr_vrfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rrv_address_family}.
	 * @param ctx the parse tree
	 */
	void enterRrv_address_family(CiscoNxosParser.Rrv_address_familyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rrv_address_family}.
	 * @param ctx the parse tree
	 */
	void exitRrv_address_family(CiscoNxosParser.Rrv_address_familyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rrv_af4}.
	 * @param ctx the parse tree
	 */
	void enterRrv_af4(CiscoNxosParser.Rrv_af4Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rrv_af4}.
	 * @param ctx the parse tree
	 */
	void exitRrv_af4(CiscoNxosParser.Rrv_af4Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rrv_af4_default_information}.
	 * @param ctx the parse tree
	 */
	void enterRrv_af4_default_information(CiscoNxosParser.Rrv_af4_default_informationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rrv_af4_default_information}.
	 * @param ctx the parse tree
	 */
	void exitRrv_af4_default_information(CiscoNxosParser.Rrv_af4_default_informationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rrv_af4_default_metric}.
	 * @param ctx the parse tree
	 */
	void enterRrv_af4_default_metric(CiscoNxosParser.Rrv_af4_default_metricContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rrv_af4_default_metric}.
	 * @param ctx the parse tree
	 */
	void exitRrv_af4_default_metric(CiscoNxosParser.Rrv_af4_default_metricContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rrv_af4_distance}.
	 * @param ctx the parse tree
	 */
	void enterRrv_af4_distance(CiscoNxosParser.Rrv_af4_distanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rrv_af4_distance}.
	 * @param ctx the parse tree
	 */
	void exitRrv_af4_distance(CiscoNxosParser.Rrv_af4_distanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rrv_af4_maximum_paths}.
	 * @param ctx the parse tree
	 */
	void enterRrv_af4_maximum_paths(CiscoNxosParser.Rrv_af4_maximum_pathsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rrv_af4_maximum_paths}.
	 * @param ctx the parse tree
	 */
	void exitRrv_af4_maximum_paths(CiscoNxosParser.Rrv_af4_maximum_pathsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rrv_af4_redistribute}.
	 * @param ctx the parse tree
	 */
	void enterRrv_af4_redistribute(CiscoNxosParser.Rrv_af4_redistributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rrv_af4_redistribute}.
	 * @param ctx the parse tree
	 */
	void exitRrv_af4_redistribute(CiscoNxosParser.Rrv_af4_redistributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rrv_af4_timers}.
	 * @param ctx the parse tree
	 */
	void enterRrv_af4_timers(CiscoNxosParser.Rrv_af4_timersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rrv_af4_timers}.
	 * @param ctx the parse tree
	 */
	void exitRrv_af4_timers(CiscoNxosParser.Rrv_af4_timersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rrv_af6}.
	 * @param ctx the parse tree
	 */
	void enterRrv_af6(CiscoNxosParser.Rrv_af6Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rrv_af6}.
	 * @param ctx the parse tree
	 */
	void exitRrv_af6(CiscoNxosParser.Rrv_af6Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rrv_af6_default_information}.
	 * @param ctx the parse tree
	 */
	void enterRrv_af6_default_information(CiscoNxosParser.Rrv_af6_default_informationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rrv_af6_default_information}.
	 * @param ctx the parse tree
	 */
	void exitRrv_af6_default_information(CiscoNxosParser.Rrv_af6_default_informationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rrv_af6_default_metric}.
	 * @param ctx the parse tree
	 */
	void enterRrv_af6_default_metric(CiscoNxosParser.Rrv_af6_default_metricContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rrv_af6_default_metric}.
	 * @param ctx the parse tree
	 */
	void exitRrv_af6_default_metric(CiscoNxosParser.Rrv_af6_default_metricContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rrv_af6_distance}.
	 * @param ctx the parse tree
	 */
	void enterRrv_af6_distance(CiscoNxosParser.Rrv_af6_distanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rrv_af6_distance}.
	 * @param ctx the parse tree
	 */
	void exitRrv_af6_distance(CiscoNxosParser.Rrv_af6_distanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rrv_af6_maximum_paths}.
	 * @param ctx the parse tree
	 */
	void enterRrv_af6_maximum_paths(CiscoNxosParser.Rrv_af6_maximum_pathsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rrv_af6_maximum_paths}.
	 * @param ctx the parse tree
	 */
	void exitRrv_af6_maximum_paths(CiscoNxosParser.Rrv_af6_maximum_pathsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rrv_af6_redistribute}.
	 * @param ctx the parse tree
	 */
	void enterRrv_af6_redistribute(CiscoNxosParser.Rrv_af6_redistributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rrv_af6_redistribute}.
	 * @param ctx the parse tree
	 */
	void exitRrv_af6_redistribute(CiscoNxosParser.Rrv_af6_redistributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rrv_af6_timers}.
	 * @param ctx the parse tree
	 */
	void enterRrv_af6_timers(CiscoNxosParser.Rrv_af6_timersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rrv_af6_timers}.
	 * @param ctx the parse tree
	 */
	void exitRrv_af6_timers(CiscoNxosParser.Rrv_af6_timersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rrv_no}.
	 * @param ctx the parse tree
	 */
	void enterRrv_no(CiscoNxosParser.Rrv_noContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rrv_no}.
	 * @param ctx the parse tree
	 */
	void exitRrv_no(CiscoNxosParser.Rrv_noContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rrv_no_shutdown}.
	 * @param ctx the parse tree
	 */
	void enterRrv_no_shutdown(CiscoNxosParser.Rrv_no_shutdownContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rrv_no_shutdown}.
	 * @param ctx the parse tree
	 */
	void exitRrv_no_shutdown(CiscoNxosParser.Rrv_no_shutdownContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rrv_shutdown}.
	 * @param ctx the parse tree
	 */
	void enterRrv_shutdown(CiscoNxosParser.Rrv_shutdownContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rrv_shutdown}.
	 * @param ctx the parse tree
	 */
	void exitRrv_shutdown(CiscoNxosParser.Rrv_shutdownContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#s_route_map}.
	 * @param ctx the parse tree
	 */
	void enterS_route_map(CiscoNxosParser.S_route_mapContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#s_route_map}.
	 * @param ctx the parse tree
	 */
	void exitS_route_map(CiscoNxosParser.S_route_mapContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#route_map_entry}.
	 * @param ctx the parse tree
	 */
	void enterRoute_map_entry(CiscoNxosParser.Route_map_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#route_map_entry}.
	 * @param ctx the parse tree
	 */
	void exitRoute_map_entry(CiscoNxosParser.Route_map_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#route_map_sequence}.
	 * @param ctx the parse tree
	 */
	void enterRoute_map_sequence(CiscoNxosParser.Route_map_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#route_map_sequence}.
	 * @param ctx the parse tree
	 */
	void exitRoute_map_sequence(CiscoNxosParser.Route_map_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rm_continue}.
	 * @param ctx the parse tree
	 */
	void enterRm_continue(CiscoNxosParser.Rm_continueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rm_continue}.
	 * @param ctx the parse tree
	 */
	void exitRm_continue(CiscoNxosParser.Rm_continueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rm_description}.
	 * @param ctx the parse tree
	 */
	void enterRm_description(CiscoNxosParser.Rm_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rm_description}.
	 * @param ctx the parse tree
	 */
	void exitRm_description(CiscoNxosParser.Rm_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#route_map_description}.
	 * @param ctx the parse tree
	 */
	void enterRoute_map_description(CiscoNxosParser.Route_map_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#route_map_description}.
	 * @param ctx the parse tree
	 */
	void exitRoute_map_description(CiscoNxosParser.Route_map_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rm_match}.
	 * @param ctx the parse tree
	 */
	void enterRm_match(CiscoNxosParser.Rm_matchContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rm_match}.
	 * @param ctx the parse tree
	 */
	void exitRm_match(CiscoNxosParser.Rm_matchContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rmm_as_number}.
	 * @param ctx the parse tree
	 */
	void enterRmm_as_number(CiscoNxosParser.Rmm_as_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rmm_as_number}.
	 * @param ctx the parse tree
	 */
	void exitRmm_as_number(CiscoNxosParser.Rmm_as_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rmm_as_path}.
	 * @param ctx the parse tree
	 */
	void enterRmm_as_path(CiscoNxosParser.Rmm_as_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rmm_as_path}.
	 * @param ctx the parse tree
	 */
	void exitRmm_as_path(CiscoNxosParser.Rmm_as_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rmm_community}.
	 * @param ctx the parse tree
	 */
	void enterRmm_community(CiscoNxosParser.Rmm_communityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rmm_community}.
	 * @param ctx the parse tree
	 */
	void exitRmm_community(CiscoNxosParser.Rmm_communityContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rmm_interface}.
	 * @param ctx the parse tree
	 */
	void enterRmm_interface(CiscoNxosParser.Rmm_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rmm_interface}.
	 * @param ctx the parse tree
	 */
	void exitRmm_interface(CiscoNxosParser.Rmm_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rmm_ip}.
	 * @param ctx the parse tree
	 */
	void enterRmm_ip(CiscoNxosParser.Rmm_ipContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rmm_ip}.
	 * @param ctx the parse tree
	 */
	void exitRmm_ip(CiscoNxosParser.Rmm_ipContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rmmip_address}.
	 * @param ctx the parse tree
	 */
	void enterRmmip_address(CiscoNxosParser.Rmmip_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rmmip_address}.
	 * @param ctx the parse tree
	 */
	void exitRmmip_address(CiscoNxosParser.Rmmip_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rmmipa_pbr}.
	 * @param ctx the parse tree
	 */
	void enterRmmipa_pbr(CiscoNxosParser.Rmmipa_pbrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rmmipa_pbr}.
	 * @param ctx the parse tree
	 */
	void exitRmmipa_pbr(CiscoNxosParser.Rmmipa_pbrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rmmipa_prefix_list}.
	 * @param ctx the parse tree
	 */
	void enterRmmipa_prefix_list(CiscoNxosParser.Rmmipa_prefix_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rmmipa_prefix_list}.
	 * @param ctx the parse tree
	 */
	void exitRmmipa_prefix_list(CiscoNxosParser.Rmmipa_prefix_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rmm_ipv6}.
	 * @param ctx the parse tree
	 */
	void enterRmm_ipv6(CiscoNxosParser.Rmm_ipv6Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rmm_ipv6}.
	 * @param ctx the parse tree
	 */
	void exitRmm_ipv6(CiscoNxosParser.Rmm_ipv6Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rmmip6_address}.
	 * @param ctx the parse tree
	 */
	void enterRmmip6_address(CiscoNxosParser.Rmmip6_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rmmip6_address}.
	 * @param ctx the parse tree
	 */
	void exitRmmip6_address(CiscoNxosParser.Rmmip6_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rmmip6a_pbr}.
	 * @param ctx the parse tree
	 */
	void enterRmmip6a_pbr(CiscoNxosParser.Rmmip6a_pbrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rmmip6a_pbr}.
	 * @param ctx the parse tree
	 */
	void exitRmmip6a_pbr(CiscoNxosParser.Rmmip6a_pbrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rmmip6a_prefix_list}.
	 * @param ctx the parse tree
	 */
	void enterRmmip6a_prefix_list(CiscoNxosParser.Rmmip6a_prefix_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rmmip6a_prefix_list}.
	 * @param ctx the parse tree
	 */
	void exitRmmip6a_prefix_list(CiscoNxosParser.Rmmip6a_prefix_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rmm_metric}.
	 * @param ctx the parse tree
	 */
	void enterRmm_metric(CiscoNxosParser.Rmm_metricContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rmm_metric}.
	 * @param ctx the parse tree
	 */
	void exitRmm_metric(CiscoNxosParser.Rmm_metricContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rmm_route_type}.
	 * @param ctx the parse tree
	 */
	void enterRmm_route_type(CiscoNxosParser.Rmm_route_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rmm_route_type}.
	 * @param ctx the parse tree
	 */
	void exitRmm_route_type(CiscoNxosParser.Rmm_route_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rmm_source_protocol}.
	 * @param ctx the parse tree
	 */
	void enterRmm_source_protocol(CiscoNxosParser.Rmm_source_protocolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rmm_source_protocol}.
	 * @param ctx the parse tree
	 */
	void exitRmm_source_protocol(CiscoNxosParser.Rmm_source_protocolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#protocol_instance_name}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_instance_name(CiscoNxosParser.Protocol_instance_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#protocol_instance_name}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_instance_name(CiscoNxosParser.Protocol_instance_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rmm_tag}.
	 * @param ctx the parse tree
	 */
	void enterRmm_tag(CiscoNxosParser.Rmm_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rmm_tag}.
	 * @param ctx the parse tree
	 */
	void exitRmm_tag(CiscoNxosParser.Rmm_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rmm_vlan}.
	 * @param ctx the parse tree
	 */
	void enterRmm_vlan(CiscoNxosParser.Rmm_vlanContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rmm_vlan}.
	 * @param ctx the parse tree
	 */
	void exitRmm_vlan(CiscoNxosParser.Rmm_vlanContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rm_set}.
	 * @param ctx the parse tree
	 */
	void enterRm_set(CiscoNxosParser.Rm_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rm_set}.
	 * @param ctx the parse tree
	 */
	void exitRm_set(CiscoNxosParser.Rm_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rms_as_path_prepend}.
	 * @param ctx the parse tree
	 */
	void enterRms_as_path_prepend(CiscoNxosParser.Rms_as_path_prependContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rms_as_path_prepend}.
	 * @param ctx the parse tree
	 */
	void exitRms_as_path_prepend(CiscoNxosParser.Rms_as_path_prependContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rmsapp_last_as}.
	 * @param ctx the parse tree
	 */
	void enterRmsapp_last_as(CiscoNxosParser.Rmsapp_last_asContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rmsapp_last_as}.
	 * @param ctx the parse tree
	 */
	void exitRmsapp_last_as(CiscoNxosParser.Rmsapp_last_asContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#last_as_num_prepends}.
	 * @param ctx the parse tree
	 */
	void enterLast_as_num_prepends(CiscoNxosParser.Last_as_num_prependsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#last_as_num_prepends}.
	 * @param ctx the parse tree
	 */
	void exitLast_as_num_prepends(CiscoNxosParser.Last_as_num_prependsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rmsapp_literal}.
	 * @param ctx the parse tree
	 */
	void enterRmsapp_literal(CiscoNxosParser.Rmsapp_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rmsapp_literal}.
	 * @param ctx the parse tree
	 */
	void exitRmsapp_literal(CiscoNxosParser.Rmsapp_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rms_comm_list}.
	 * @param ctx the parse tree
	 */
	void enterRms_comm_list(CiscoNxosParser.Rms_comm_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rms_comm_list}.
	 * @param ctx the parse tree
	 */
	void exitRms_comm_list(CiscoNxosParser.Rms_comm_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rms_community}.
	 * @param ctx the parse tree
	 */
	void enterRms_community(CiscoNxosParser.Rms_communityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rms_community}.
	 * @param ctx the parse tree
	 */
	void exitRms_community(CiscoNxosParser.Rms_communityContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rms_ip}.
	 * @param ctx the parse tree
	 */
	void enterRms_ip(CiscoNxosParser.Rms_ipContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rms_ip}.
	 * @param ctx the parse tree
	 */
	void exitRms_ip(CiscoNxosParser.Rms_ipContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rmsip_next_hop}.
	 * @param ctx the parse tree
	 */
	void enterRmsip_next_hop(CiscoNxosParser.Rmsip_next_hopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rmsip_next_hop}.
	 * @param ctx the parse tree
	 */
	void exitRmsip_next_hop(CiscoNxosParser.Rmsip_next_hopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rmsipnh_literal}.
	 * @param ctx the parse tree
	 */
	void enterRmsipnh_literal(CiscoNxosParser.Rmsipnh_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rmsipnh_literal}.
	 * @param ctx the parse tree
	 */
	void exitRmsipnh_literal(CiscoNxosParser.Rmsipnh_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rmsipnh_unchanged}.
	 * @param ctx the parse tree
	 */
	void enterRmsipnh_unchanged(CiscoNxosParser.Rmsipnh_unchangedContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rmsipnh_unchanged}.
	 * @param ctx the parse tree
	 */
	void exitRmsipnh_unchanged(CiscoNxosParser.Rmsipnh_unchangedContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rms_ipv6}.
	 * @param ctx the parse tree
	 */
	void enterRms_ipv6(CiscoNxosParser.Rms_ipv6Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rms_ipv6}.
	 * @param ctx the parse tree
	 */
	void exitRms_ipv6(CiscoNxosParser.Rms_ipv6Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rms_local_preference}.
	 * @param ctx the parse tree
	 */
	void enterRms_local_preference(CiscoNxosParser.Rms_local_preferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rms_local_preference}.
	 * @param ctx the parse tree
	 */
	void exitRms_local_preference(CiscoNxosParser.Rms_local_preferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rms_metric}.
	 * @param ctx the parse tree
	 */
	void enterRms_metric(CiscoNxosParser.Rms_metricContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rms_metric}.
	 * @param ctx the parse tree
	 */
	void exitRms_metric(CiscoNxosParser.Rms_metricContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rms_metric_type}.
	 * @param ctx the parse tree
	 */
	void enterRms_metric_type(CiscoNxosParser.Rms_metric_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rms_metric_type}.
	 * @param ctx the parse tree
	 */
	void exitRms_metric_type(CiscoNxosParser.Rms_metric_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rms_origin}.
	 * @param ctx the parse tree
	 */
	void enterRms_origin(CiscoNxosParser.Rms_originContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rms_origin}.
	 * @param ctx the parse tree
	 */
	void exitRms_origin(CiscoNxosParser.Rms_originContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rms_tag}.
	 * @param ctx the parse tree
	 */
	void enterRms_tag(CiscoNxosParser.Rms_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rms_tag}.
	 * @param ctx the parse tree
	 */
	void exitRms_tag(CiscoNxosParser.Rms_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#rms_weight}.
	 * @param ctx the parse tree
	 */
	void enterRms_weight(CiscoNxosParser.Rms_weightContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#rms_weight}.
	 * @param ctx the parse tree
	 */
	void exitRms_weight(CiscoNxosParser.Rms_weightContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#route_map_pbr_statistics}.
	 * @param ctx the parse tree
	 */
	void enterRoute_map_pbr_statistics(CiscoNxosParser.Route_map_pbr_statisticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#route_map_pbr_statistics}.
	 * @param ctx the parse tree
	 */
	void exitRoute_map_pbr_statistics(CiscoNxosParser.Route_map_pbr_statisticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#s_snmp_server}.
	 * @param ctx the parse tree
	 */
	void enterS_snmp_server(CiscoNxosParser.S_snmp_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#s_snmp_server}.
	 * @param ctx the parse tree
	 */
	void exitS_snmp_server(CiscoNxosParser.S_snmp_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#snmps_community}.
	 * @param ctx the parse tree
	 */
	void enterSnmps_community(CiscoNxosParser.Snmps_communityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#snmps_community}.
	 * @param ctx the parse tree
	 */
	void exitSnmps_community(CiscoNxosParser.Snmps_communityContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#snmp_community}.
	 * @param ctx the parse tree
	 */
	void enterSnmp_community(CiscoNxosParser.Snmp_communityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#snmp_community}.
	 * @param ctx the parse tree
	 */
	void exitSnmp_community(CiscoNxosParser.Snmp_communityContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#snmps_community_group}.
	 * @param ctx the parse tree
	 */
	void enterSnmps_community_group(CiscoNxosParser.Snmps_community_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#snmps_community_group}.
	 * @param ctx the parse tree
	 */
	void exitSnmps_community_group(CiscoNxosParser.Snmps_community_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#snmps_community_use_acl}.
	 * @param ctx the parse tree
	 */
	void enterSnmps_community_use_acl(CiscoNxosParser.Snmps_community_use_aclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#snmps_community_use_acl}.
	 * @param ctx the parse tree
	 */
	void exitSnmps_community_use_acl(CiscoNxosParser.Snmps_community_use_aclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#snmps_community_use_ipv4acl}.
	 * @param ctx the parse tree
	 */
	void enterSnmps_community_use_ipv4acl(CiscoNxosParser.Snmps_community_use_ipv4aclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#snmps_community_use_ipv4acl}.
	 * @param ctx the parse tree
	 */
	void exitSnmps_community_use_ipv4acl(CiscoNxosParser.Snmps_community_use_ipv4aclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#snmps_community_use_ipv6acl}.
	 * @param ctx the parse tree
	 */
	void enterSnmps_community_use_ipv6acl(CiscoNxosParser.Snmps_community_use_ipv6aclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#snmps_community_use_ipv6acl}.
	 * @param ctx the parse tree
	 */
	void exitSnmps_community_use_ipv6acl(CiscoNxosParser.Snmps_community_use_ipv6aclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#snmps_contact}.
	 * @param ctx the parse tree
	 */
	void enterSnmps_contact(CiscoNxosParser.Snmps_contactContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#snmps_contact}.
	 * @param ctx the parse tree
	 */
	void exitSnmps_contact(CiscoNxosParser.Snmps_contactContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#snmps_location}.
	 * @param ctx the parse tree
	 */
	void enterSnmps_location(CiscoNxosParser.Snmps_locationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#snmps_location}.
	 * @param ctx the parse tree
	 */
	void exitSnmps_location(CiscoNxosParser.Snmps_locationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#snmps_enable}.
	 * @param ctx the parse tree
	 */
	void enterSnmps_enable(CiscoNxosParser.Snmps_enableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#snmps_enable}.
	 * @param ctx the parse tree
	 */
	void exitSnmps_enable(CiscoNxosParser.Snmps_enableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#snmps_host}.
	 * @param ctx the parse tree
	 */
	void enterSnmps_host(CiscoNxosParser.Snmps_hostContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#snmps_host}.
	 * @param ctx the parse tree
	 */
	void exitSnmps_host(CiscoNxosParser.Snmps_hostContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#snmp_server_host}.
	 * @param ctx the parse tree
	 */
	void enterSnmp_server_host(CiscoNxosParser.Snmp_server_hostContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#snmp_server_host}.
	 * @param ctx the parse tree
	 */
	void exitSnmp_server_host(CiscoNxosParser.Snmp_server_hostContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#snmpsh_source_interface}.
	 * @param ctx the parse tree
	 */
	void enterSnmpsh_source_interface(CiscoNxosParser.Snmpsh_source_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#snmpsh_source_interface}.
	 * @param ctx the parse tree
	 */
	void exitSnmpsh_source_interface(CiscoNxosParser.Snmpsh_source_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#snmpsh_traps}.
	 * @param ctx the parse tree
	 */
	void enterSnmpsh_traps(CiscoNxosParser.Snmpsh_trapsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#snmpsh_traps}.
	 * @param ctx the parse tree
	 */
	void exitSnmpsh_traps(CiscoNxosParser.Snmpsh_trapsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#snmp_version}.
	 * @param ctx the parse tree
	 */
	void enterSnmp_version(CiscoNxosParser.Snmp_versionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#snmp_version}.
	 * @param ctx the parse tree
	 */
	void exitSnmp_version(CiscoNxosParser.Snmp_versionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#snmpsh_use_vrf}.
	 * @param ctx the parse tree
	 */
	void enterSnmpsh_use_vrf(CiscoNxosParser.Snmpsh_use_vrfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#snmpsh_use_vrf}.
	 * @param ctx the parse tree
	 */
	void exitSnmpsh_use_vrf(CiscoNxosParser.Snmpsh_use_vrfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#snmps_source_interface}.
	 * @param ctx the parse tree
	 */
	void enterSnmps_source_interface(CiscoNxosParser.Snmps_source_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#snmps_source_interface}.
	 * @param ctx the parse tree
	 */
	void exitSnmps_source_interface(CiscoNxosParser.Snmps_source_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#snmpssi_informs}.
	 * @param ctx the parse tree
	 */
	void enterSnmpssi_informs(CiscoNxosParser.Snmpssi_informsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#snmpssi_informs}.
	 * @param ctx the parse tree
	 */
	void exitSnmpssi_informs(CiscoNxosParser.Snmpssi_informsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#snmpssi_traps}.
	 * @param ctx the parse tree
	 */
	void enterSnmpssi_traps(CiscoNxosParser.Snmpssi_trapsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#snmpssi_traps}.
	 * @param ctx the parse tree
	 */
	void exitSnmpssi_traps(CiscoNxosParser.Snmpssi_trapsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#snmps_user}.
	 * @param ctx the parse tree
	 */
	void enterSnmps_user(CiscoNxosParser.Snmps_userContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#snmps_user}.
	 * @param ctx the parse tree
	 */
	void exitSnmps_user(CiscoNxosParser.Snmps_userContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#snmpsu_auth}.
	 * @param ctx the parse tree
	 */
	void enterSnmpsu_auth(CiscoNxosParser.Snmpsu_authContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#snmpsu_auth}.
	 * @param ctx the parse tree
	 */
	void exitSnmpsu_auth(CiscoNxosParser.Snmpsu_authContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#privacy_password}.
	 * @param ctx the parse tree
	 */
	void enterPrivacy_password(CiscoNxosParser.Privacy_passwordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#privacy_password}.
	 * @param ctx the parse tree
	 */
	void exitPrivacy_password(CiscoNxosParser.Privacy_passwordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ip_route}.
	 * @param ctx the parse tree
	 */
	void enterIp_route(CiscoNxosParser.Ip_routeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ip_route}.
	 * @param ctx the parse tree
	 */
	void exitIp_route(CiscoNxosParser.Ip_routeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ip_route_network}.
	 * @param ctx the parse tree
	 */
	void enterIp_route_network(CiscoNxosParser.Ip_route_networkContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ip_route_network}.
	 * @param ctx the parse tree
	 */
	void exitIp_route_network(CiscoNxosParser.Ip_route_networkContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#static_route_name}.
	 * @param ctx the parse tree
	 */
	void enterStatic_route_name(CiscoNxosParser.Static_route_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#static_route_name}.
	 * @param ctx the parse tree
	 */
	void exitStatic_route_name(CiscoNxosParser.Static_route_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ip_route_static}.
	 * @param ctx the parse tree
	 */
	void enterIp_route_static(CiscoNxosParser.Ip_route_staticContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ip_route_static}.
	 * @param ctx the parse tree
	 */
	void exitIp_route_static(CiscoNxosParser.Ip_route_staticContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#s_tacacs_server}.
	 * @param ctx the parse tree
	 */
	void enterS_tacacs_server(CiscoNxosParser.S_tacacs_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#s_tacacs_server}.
	 * @param ctx the parse tree
	 */
	void exitS_tacacs_server(CiscoNxosParser.S_tacacs_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ts_host}.
	 * @param ctx the parse tree
	 */
	void enterTs_host(CiscoNxosParser.Ts_hostContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ts_host}.
	 * @param ctx the parse tree
	 */
	void exitTs_host(CiscoNxosParser.Ts_hostContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ts_host_key}.
	 * @param ctx the parse tree
	 */
	void enterTs_host_key(CiscoNxosParser.Ts_host_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ts_host_key}.
	 * @param ctx the parse tree
	 */
	void exitTs_host_key(CiscoNxosParser.Ts_host_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ts_host_port}.
	 * @param ctx the parse tree
	 */
	void enterTs_host_port(CiscoNxosParser.Ts_host_portContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ts_host_port}.
	 * @param ctx the parse tree
	 */
	void exitTs_host_port(CiscoNxosParser.Ts_host_portContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ts_host_timeout}.
	 * @param ctx the parse tree
	 */
	void enterTs_host_timeout(CiscoNxosParser.Ts_host_timeoutContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ts_host_timeout}.
	 * @param ctx the parse tree
	 */
	void exitTs_host_timeout(CiscoNxosParser.Ts_host_timeoutContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ts_host_single_connection}.
	 * @param ctx the parse tree
	 */
	void enterTs_host_single_connection(CiscoNxosParser.Ts_host_single_connectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ts_host_single_connection}.
	 * @param ctx the parse tree
	 */
	void exitTs_host_single_connection(CiscoNxosParser.Ts_host_single_connectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#tacas_server_timeout_s}.
	 * @param ctx the parse tree
	 */
	void enterTacas_server_timeout_s(CiscoNxosParser.Tacas_server_timeout_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#tacas_server_timeout_s}.
	 * @param ctx the parse tree
	 */
	void exitTacas_server_timeout_s(CiscoNxosParser.Tacas_server_timeout_sContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#tacacs_server_host}.
	 * @param ctx the parse tree
	 */
	void enterTacacs_server_host(CiscoNxosParser.Tacacs_server_hostContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#tacacs_server_host}.
	 * @param ctx the parse tree
	 */
	void exitTacacs_server_host(CiscoNxosParser.Tacacs_server_hostContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ts_null}.
	 * @param ctx the parse tree
	 */
	void enterTs_null(CiscoNxosParser.Ts_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ts_null}.
	 * @param ctx the parse tree
	 */
	void exitTs_null(CiscoNxosParser.Ts_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ip_tacacs}.
	 * @param ctx the parse tree
	 */
	void enterIp_tacacs(CiscoNxosParser.Ip_tacacsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ip_tacacs}.
	 * @param ctx the parse tree
	 */
	void exitIp_tacacs(CiscoNxosParser.Ip_tacacsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#ipt_source_interface}.
	 * @param ctx the parse tree
	 */
	void enterIpt_source_interface(CiscoNxosParser.Ipt_source_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#ipt_source_interface}.
	 * @param ctx the parse tree
	 */
	void exitIpt_source_interface(CiscoNxosParser.Ipt_source_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#vdc_id}.
	 * @param ctx the parse tree
	 */
	void enterVdc_id(CiscoNxosParser.Vdc_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#vdc_id}.
	 * @param ctx the parse tree
	 */
	void exitVdc_id(CiscoNxosParser.Vdc_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#vdc_name}.
	 * @param ctx the parse tree
	 */
	void enterVdc_name(CiscoNxosParser.Vdc_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#vdc_name}.
	 * @param ctx the parse tree
	 */
	void exitVdc_name(CiscoNxosParser.Vdc_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#s_vdc}.
	 * @param ctx the parse tree
	 */
	void enterS_vdc(CiscoNxosParser.S_vdcContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#s_vdc}.
	 * @param ctx the parse tree
	 */
	void exitS_vdc(CiscoNxosParser.S_vdcContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#vdc_allow}.
	 * @param ctx the parse tree
	 */
	void enterVdc_allow(CiscoNxosParser.Vdc_allowContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#vdc_allow}.
	 * @param ctx the parse tree
	 */
	void exitVdc_allow(CiscoNxosParser.Vdc_allowContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#vdc_limit_resource}.
	 * @param ctx the parse tree
	 */
	void enterVdc_limit_resource(CiscoNxosParser.Vdc_limit_resourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#vdc_limit_resource}.
	 * @param ctx the parse tree
	 */
	void exitVdc_limit_resource(CiscoNxosParser.Vdc_limit_resourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#s_vlan}.
	 * @param ctx the parse tree
	 */
	void enterS_vlan(CiscoNxosParser.S_vlanContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#s_vlan}.
	 * @param ctx the parse tree
	 */
	void exitS_vlan(CiscoNxosParser.S_vlanContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#vlan_configuration}.
	 * @param ctx the parse tree
	 */
	void enterVlan_configuration(CiscoNxosParser.Vlan_configurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#vlan_configuration}.
	 * @param ctx the parse tree
	 */
	void exitVlan_configuration(CiscoNxosParser.Vlan_configurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#vlanc_null}.
	 * @param ctx the parse tree
	 */
	void enterVlanc_null(CiscoNxosParser.Vlanc_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#vlanc_null}.
	 * @param ctx the parse tree
	 */
	void exitVlanc_null(CiscoNxosParser.Vlanc_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#vlan_null}.
	 * @param ctx the parse tree
	 */
	void enterVlan_null(CiscoNxosParser.Vlan_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#vlan_null}.
	 * @param ctx the parse tree
	 */
	void exitVlan_null(CiscoNxosParser.Vlan_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#vlan_vlan}.
	 * @param ctx the parse tree
	 */
	void enterVlan_vlan(CiscoNxosParser.Vlan_vlanContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#vlan_vlan}.
	 * @param ctx the parse tree
	 */
	void exitVlan_vlan(CiscoNxosParser.Vlan_vlanContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#vv_null}.
	 * @param ctx the parse tree
	 */
	void enterVv_null(CiscoNxosParser.Vv_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#vv_null}.
	 * @param ctx the parse tree
	 */
	void exitVv_null(CiscoNxosParser.Vv_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#vv_vn_segment}.
	 * @param ctx the parse tree
	 */
	void enterVv_vn_segment(CiscoNxosParser.Vv_vn_segmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#vv_vn_segment}.
	 * @param ctx the parse tree
	 */
	void exitVv_vn_segment(CiscoNxosParser.Vv_vn_segmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#s_vrf_context}.
	 * @param ctx the parse tree
	 */
	void enterS_vrf_context(CiscoNxosParser.S_vrf_contextContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#s_vrf_context}.
	 * @param ctx the parse tree
	 */
	void exitS_vrf_context(CiscoNxosParser.S_vrf_contextContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#vc_address_family}.
	 * @param ctx the parse tree
	 */
	void enterVc_address_family(CiscoNxosParser.Vc_address_familyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#vc_address_family}.
	 * @param ctx the parse tree
	 */
	void exitVc_address_family(CiscoNxosParser.Vc_address_familyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#vcaf4u_null}.
	 * @param ctx the parse tree
	 */
	void enterVcaf4u_null(CiscoNxosParser.Vcaf4u_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#vcaf4u_null}.
	 * @param ctx the parse tree
	 */
	void exitVcaf4u_null(CiscoNxosParser.Vcaf4u_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#vcaf4u_route_target}.
	 * @param ctx the parse tree
	 */
	void enterVcaf4u_route_target(CiscoNxosParser.Vcaf4u_route_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#vcaf4u_route_target}.
	 * @param ctx the parse tree
	 */
	void exitVcaf4u_route_target(CiscoNxosParser.Vcaf4u_route_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#vcaf6u_null}.
	 * @param ctx the parse tree
	 */
	void enterVcaf6u_null(CiscoNxosParser.Vcaf6u_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#vcaf6u_null}.
	 * @param ctx the parse tree
	 */
	void exitVcaf6u_null(CiscoNxosParser.Vcaf6u_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#vcaf6u_route_target}.
	 * @param ctx the parse tree
	 */
	void enterVcaf6u_route_target(CiscoNxosParser.Vcaf6u_route_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#vcaf6u_route_target}.
	 * @param ctx the parse tree
	 */
	void exitVcaf6u_route_target(CiscoNxosParser.Vcaf6u_route_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#vc_ip}.
	 * @param ctx the parse tree
	 */
	void enterVc_ip(CiscoNxosParser.Vc_ipContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#vc_ip}.
	 * @param ctx the parse tree
	 */
	void exitVc_ip(CiscoNxosParser.Vc_ipContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#vc_ip_null}.
	 * @param ctx the parse tree
	 */
	void enterVc_ip_null(CiscoNxosParser.Vc_ip_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#vc_ip_null}.
	 * @param ctx the parse tree
	 */
	void exitVc_ip_null(CiscoNxosParser.Vc_ip_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#vc_no}.
	 * @param ctx the parse tree
	 */
	void enterVc_no(CiscoNxosParser.Vc_noContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#vc_no}.
	 * @param ctx the parse tree
	 */
	void exitVc_no(CiscoNxosParser.Vc_noContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#vc_no_shutdown}.
	 * @param ctx the parse tree
	 */
	void enterVc_no_shutdown(CiscoNxosParser.Vc_no_shutdownContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#vc_no_shutdown}.
	 * @param ctx the parse tree
	 */
	void exitVc_no_shutdown(CiscoNxosParser.Vc_no_shutdownContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#vc_null}.
	 * @param ctx the parse tree
	 */
	void enterVc_null(CiscoNxosParser.Vc_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#vc_null}.
	 * @param ctx the parse tree
	 */
	void exitVc_null(CiscoNxosParser.Vc_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#vc_rd}.
	 * @param ctx the parse tree
	 */
	void enterVc_rd(CiscoNxosParser.Vc_rdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#vc_rd}.
	 * @param ctx the parse tree
	 */
	void exitVc_rd(CiscoNxosParser.Vc_rdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#vc_shutdown}.
	 * @param ctx the parse tree
	 */
	void enterVc_shutdown(CiscoNxosParser.Vc_shutdownContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#vc_shutdown}.
	 * @param ctx the parse tree
	 */
	void exitVc_shutdown(CiscoNxosParser.Vc_shutdownContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoNxosParser#vc_vni}.
	 * @param ctx the parse tree
	 */
	void enterVc_vni(CiscoNxosParser.Vc_vniContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoNxosParser#vc_vni}.
	 * @param ctx the parse tree
	 */
	void exitVc_vni(CiscoNxosParser.Vc_vniContext ctx);
}