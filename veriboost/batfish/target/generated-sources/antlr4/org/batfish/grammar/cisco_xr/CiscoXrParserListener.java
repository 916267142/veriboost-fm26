// Generated from org/batfish/grammar/cisco_xr/CiscoXrParser.g4 by ANTLR 4.7.2
package org.batfish.grammar.cisco_xr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CiscoXrParser}.
 */
public interface CiscoXrParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cisco_xr_configuration}.
	 * @param ctx the parse tree
	 */
	void enterCisco_xr_configuration(CiscoXrParser.Cisco_xr_configurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cisco_xr_configuration}.
	 * @param ctx the parse tree
	 */
	void exitCisco_xr_configuration(CiscoXrParser.Cisco_xr_configurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CiscoXrParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CiscoXrParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_ipv4}.
	 * @param ctx the parse tree
	 */
	void enterS_ipv4(CiscoXrParser.S_ipv4Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_ipv4}.
	 * @param ctx the parse tree
	 */
	void exitS_ipv4(CiscoXrParser.S_ipv4Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_ipv6}.
	 * @param ctx the parse tree
	 */
	void enterS_ipv6(CiscoXrParser.S_ipv6Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_ipv6}.
	 * @param ctx the parse tree
	 */
	void exitS_ipv6(CiscoXrParser.S_ipv6Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_no}.
	 * @param ctx the parse tree
	 */
	void enterS_no(CiscoXrParser.S_noContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_no}.
	 * @param ctx the parse tree
	 */
	void exitS_no(CiscoXrParser.S_noContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#no_ipv4}.
	 * @param ctx the parse tree
	 */
	void enterNo_ipv4(CiscoXrParser.No_ipv4Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#no_ipv4}.
	 * @param ctx the parse tree
	 */
	void exitNo_ipv4(CiscoXrParser.No_ipv4Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#no_ipv6}.
	 * @param ctx the parse tree
	 */
	void enterNo_ipv6(CiscoXrParser.No_ipv6Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#no_ipv6}.
	 * @param ctx the parse tree
	 */
	void exitNo_ipv6(CiscoXrParser.No_ipv6Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#address_aiimgp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterAddress_aiimgp_stanza(CiscoXrParser.Address_aiimgp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#address_aiimgp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitAddress_aiimgp_stanza(CiscoXrParser.Address_aiimgp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#address_family_multicast_stanza}.
	 * @param ctx the parse tree
	 */
	void enterAddress_family_multicast_stanza(CiscoXrParser.Address_family_multicast_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#address_family_multicast_stanza}.
	 * @param ctx the parse tree
	 */
	void exitAddress_family_multicast_stanza(CiscoXrParser.Address_family_multicast_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#address_family_multicast_tail}.
	 * @param ctx the parse tree
	 */
	void enterAddress_family_multicast_tail(CiscoXrParser.Address_family_multicast_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#address_family_multicast_tail}.
	 * @param ctx the parse tree
	 */
	void exitAddress_family_multicast_tail(CiscoXrParser.Address_family_multicast_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ags_null}.
	 * @param ctx the parse tree
	 */
	void enterAgs_null(CiscoXrParser.Ags_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ags_null}.
	 * @param ctx the parse tree
	 */
	void exitAgs_null(CiscoXrParser.Ags_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aiimgp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterAiimgp_stanza(CiscoXrParser.Aiimgp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aiimgp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitAiimgp_stanza(CiscoXrParser.Aiimgp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#al_null}.
	 * @param ctx the parse tree
	 */
	void enterAl_null(CiscoXrParser.Al_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#al_null}.
	 * @param ctx the parse tree
	 */
	void exitAl_null(CiscoXrParser.Al_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#allow_iimgp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterAllow_iimgp_stanza(CiscoXrParser.Allow_iimgp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#allow_iimgp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitAllow_iimgp_stanza(CiscoXrParser.Allow_iimgp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#allowed_ip}.
	 * @param ctx the parse tree
	 */
	void enterAllowed_ip(CiscoXrParser.Allowed_ipContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#allowed_ip}.
	 * @param ctx the parse tree
	 */
	void exitAllowed_ip(CiscoXrParser.Allowed_ipContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ap_null}.
	 * @param ctx the parse tree
	 */
	void enterAp_null(CiscoXrParser.Ap_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ap_null}.
	 * @param ctx the parse tree
	 */
	void exitAp_null(CiscoXrParser.Ap_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ap_regulatory_domain_profile}.
	 * @param ctx the parse tree
	 */
	void enterAp_regulatory_domain_profile(CiscoXrParser.Ap_regulatory_domain_profileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ap_regulatory_domain_profile}.
	 * @param ctx the parse tree
	 */
	void exitAp_regulatory_domain_profile(CiscoXrParser.Ap_regulatory_domain_profileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ap_system_profile}.
	 * @param ctx the parse tree
	 */
	void enterAp_system_profile(CiscoXrParser.Ap_system_profileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ap_system_profile}.
	 * @param ctx the parse tree
	 */
	void exitAp_system_profile(CiscoXrParser.Ap_system_profileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#apg_null}.
	 * @param ctx the parse tree
	 */
	void enterApg_null(CiscoXrParser.Apg_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#apg_null}.
	 * @param ctx the parse tree
	 */
	void exitApg_null(CiscoXrParser.Apg_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#apn_null}.
	 * @param ctx the parse tree
	 */
	void enterApn_null(CiscoXrParser.Apn_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#apn_null}.
	 * @param ctx the parse tree
	 */
	void exitApn_null(CiscoXrParser.Apn_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aprdp_null}.
	 * @param ctx the parse tree
	 */
	void enterAprdp_null(CiscoXrParser.Aprdp_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aprdp_null}.
	 * @param ctx the parse tree
	 */
	void exitAprdp_null(CiscoXrParser.Aprdp_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#apsp_null}.
	 * @param ctx the parse tree
	 */
	void enterApsp_null(CiscoXrParser.Apsp_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#apsp_null}.
	 * @param ctx the parse tree
	 */
	void exitApsp_null(CiscoXrParser.Apsp_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#archive_log}.
	 * @param ctx the parse tree
	 */
	void enterArchive_log(CiscoXrParser.Archive_logContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#archive_log}.
	 * @param ctx the parse tree
	 */
	void exitArchive_log(CiscoXrParser.Archive_logContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#archive_null}.
	 * @param ctx the parse tree
	 */
	void enterArchive_null(CiscoXrParser.Archive_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#archive_null}.
	 * @param ctx the parse tree
	 */
	void exitArchive_null(CiscoXrParser.Archive_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#av_null}.
	 * @param ctx the parse tree
	 */
	void enterAv_null(CiscoXrParser.Av_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#av_null}.
	 * @param ctx the parse tree
	 */
	void exitAv_null(CiscoXrParser.Av_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#bfd_null}.
	 * @param ctx the parse tree
	 */
	void enterBfd_null(CiscoXrParser.Bfd_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#bfd_null}.
	 * @param ctx the parse tree
	 */
	void exitBfd_null(CiscoXrParser.Bfd_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#bfd_template_null}.
	 * @param ctx the parse tree
	 */
	void enterBfd_template_null(CiscoXrParser.Bfd_template_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#bfd_template_null}.
	 * @param ctx the parse tree
	 */
	void exitBfd_template_null(CiscoXrParser.Bfd_template_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#configure_maintenance}.
	 * @param ctx the parse tree
	 */
	void enterConfigure_maintenance(CiscoXrParser.Configure_maintenanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#configure_maintenance}.
	 * @param ctx the parse tree
	 */
	void exitConfigure_maintenance(CiscoXrParser.Configure_maintenanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#configure_maintenance_null}.
	 * @param ctx the parse tree
	 */
	void enterConfigure_maintenance_null(CiscoXrParser.Configure_maintenance_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#configure_maintenance_null}.
	 * @param ctx the parse tree
	 */
	void exitConfigure_maintenance_null(CiscoXrParser.Configure_maintenance_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#configure_maintenance_router}.
	 * @param ctx the parse tree
	 */
	void enterConfigure_maintenance_router(CiscoXrParser.Configure_maintenance_routerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#configure_maintenance_router}.
	 * @param ctx the parse tree
	 */
	void exitConfigure_maintenance_router(CiscoXrParser.Configure_maintenance_routerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#configure_maintenance_router_null}.
	 * @param ctx the parse tree
	 */
	void enterConfigure_maintenance_router_null(CiscoXrParser.Configure_maintenance_router_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#configure_maintenance_router_null}.
	 * @param ctx the parse tree
	 */
	void exitConfigure_maintenance_router_null(CiscoXrParser.Configure_maintenance_router_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#configure_null}.
	 * @param ctx the parse tree
	 */
	void enterConfigure_null(CiscoXrParser.Configure_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#configure_null}.
	 * @param ctx the parse tree
	 */
	void exitConfigure_null(CiscoXrParser.Configure_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cops_listener}.
	 * @param ctx the parse tree
	 */
	void enterCops_listener(CiscoXrParser.Cops_listenerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cops_listener}.
	 * @param ctx the parse tree
	 */
	void exitCops_listener(CiscoXrParser.Cops_listenerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#copsl_access_list}.
	 * @param ctx the parse tree
	 */
	void enterCopsl_access_list(CiscoXrParser.Copsl_access_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#copsl_access_list}.
	 * @param ctx the parse tree
	 */
	void exitCopsl_access_list(CiscoXrParser.Copsl_access_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cp_ip_access_group}.
	 * @param ctx the parse tree
	 */
	void enterCp_ip_access_group(CiscoXrParser.Cp_ip_access_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cp_ip_access_group}.
	 * @param ctx the parse tree
	 */
	void exitCp_ip_access_group(CiscoXrParser.Cp_ip_access_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cp_ip_flow}.
	 * @param ctx the parse tree
	 */
	void enterCp_ip_flow(CiscoXrParser.Cp_ip_flowContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cp_ip_flow}.
	 * @param ctx the parse tree
	 */
	void exitCp_ip_flow(CiscoXrParser.Cp_ip_flowContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cp_management_plane}.
	 * @param ctx the parse tree
	 */
	void enterCp_management_plane(CiscoXrParser.Cp_management_planeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cp_management_plane}.
	 * @param ctx the parse tree
	 */
	void exitCp_management_plane(CiscoXrParser.Cp_management_planeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cp_null}.
	 * @param ctx the parse tree
	 */
	void enterCp_null(CiscoXrParser.Cp_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cp_null}.
	 * @param ctx the parse tree
	 */
	void exitCp_null(CiscoXrParser.Cp_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cp_service_policy}.
	 * @param ctx the parse tree
	 */
	void enterCp_service_policy(CiscoXrParser.Cp_service_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cp_service_policy}.
	 * @param ctx the parse tree
	 */
	void exitCp_service_policy(CiscoXrParser.Cp_service_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cps_null}.
	 * @param ctx the parse tree
	 */
	void enterCps_null(CiscoXrParser.Cps_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cps_null}.
	 * @param ctx the parse tree
	 */
	void exitCps_null(CiscoXrParser.Cps_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cqg_null}.
	 * @param ctx the parse tree
	 */
	void enterCqg_null(CiscoXrParser.Cqg_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cqg_null}.
	 * @param ctx the parse tree
	 */
	void exitCqg_null(CiscoXrParser.Cqg_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cmf_null}.
	 * @param ctx the parse tree
	 */
	void enterCmf_null(CiscoXrParser.Cmf_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cmf_null}.
	 * @param ctx the parse tree
	 */
	void exitCmf_null(CiscoXrParser.Cmf_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ctlf_null}.
	 * @param ctx the parse tree
	 */
	void enterCtlf_null(CiscoXrParser.Ctlf_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ctlf_null}.
	 * @param ctx the parse tree
	 */
	void exitCtlf_null(CiscoXrParser.Ctlf_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#d11_null}.
	 * @param ctx the parse tree
	 */
	void enterD11_null(CiscoXrParser.D11_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#d11_null}.
	 * @param ctx the parse tree
	 */
	void exitD11_null(CiscoXrParser.D11_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#daemon_null}.
	 * @param ctx the parse tree
	 */
	void enterDaemon_null(CiscoXrParser.Daemon_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#daemon_null}.
	 * @param ctx the parse tree
	 */
	void exitDaemon_null(CiscoXrParser.Daemon_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#dapr_null}.
	 * @param ctx the parse tree
	 */
	void enterDapr_null(CiscoXrParser.Dapr_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#dapr_null}.
	 * @param ctx the parse tree
	 */
	void exitDapr_null(CiscoXrParser.Dapr_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#dapr_webvpn}.
	 * @param ctx the parse tree
	 */
	void enterDapr_webvpn(CiscoXrParser.Dapr_webvpnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#dapr_webvpn}.
	 * @param ctx the parse tree
	 */
	void exitDapr_webvpn(CiscoXrParser.Dapr_webvpnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#daprw_null}.
	 * @param ctx the parse tree
	 */
	void enterDaprw_null(CiscoXrParser.Daprw_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#daprw_null}.
	 * @param ctx the parse tree
	 */
	void exitDaprw_null(CiscoXrParser.Daprw_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#del_stanza}.
	 * @param ctx the parse tree
	 */
	void enterDel_stanza(CiscoXrParser.Del_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#del_stanza}.
	 * @param ctx the parse tree
	 */
	void exitDel_stanza(CiscoXrParser.Del_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#dhcp_null}.
	 * @param ctx the parse tree
	 */
	void enterDhcp_null(CiscoXrParser.Dhcp_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#dhcp_null}.
	 * @param ctx the parse tree
	 */
	void exitDhcp_null(CiscoXrParser.Dhcp_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#dhcp_profile}.
	 * @param ctx the parse tree
	 */
	void enterDhcp_profile(CiscoXrParser.Dhcp_profileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#dhcp_profile}.
	 * @param ctx the parse tree
	 */
	void exitDhcp_profile(CiscoXrParser.Dhcp_profileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#dhcp_profile_null}.
	 * @param ctx the parse tree
	 */
	void enterDhcp_profile_null(CiscoXrParser.Dhcp_profile_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#dhcp_profile_null}.
	 * @param ctx the parse tree
	 */
	void exitDhcp_profile_null(CiscoXrParser.Dhcp_profile_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#dialer_group}.
	 * @param ctx the parse tree
	 */
	void enterDialer_group(CiscoXrParser.Dialer_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#dialer_group}.
	 * @param ctx the parse tree
	 */
	void exitDialer_group(CiscoXrParser.Dialer_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#dialer_group_null}.
	 * @param ctx the parse tree
	 */
	void enterDialer_group_null(CiscoXrParser.Dialer_group_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#dialer_group_null}.
	 * @param ctx the parse tree
	 */
	void exitDialer_group_null(CiscoXrParser.Dialer_group_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#dialer_null}.
	 * @param ctx the parse tree
	 */
	void enterDialer_null(CiscoXrParser.Dialer_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#dialer_null}.
	 * @param ctx the parse tree
	 */
	void exitDialer_null(CiscoXrParser.Dialer_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#domain_lookup}.
	 * @param ctx the parse tree
	 */
	void enterDomain_lookup(CiscoXrParser.Domain_lookupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#domain_lookup}.
	 * @param ctx the parse tree
	 */
	void exitDomain_lookup(CiscoXrParser.Domain_lookupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#domain_name}.
	 * @param ctx the parse tree
	 */
	void enterDomain_name(CiscoXrParser.Domain_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#domain_name}.
	 * @param ctx the parse tree
	 */
	void exitDomain_name(CiscoXrParser.Domain_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#domain_name_server}.
	 * @param ctx the parse tree
	 */
	void enterDomain_name_server(CiscoXrParser.Domain_name_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#domain_name_server}.
	 * @param ctx the parse tree
	 */
	void exitDomain_name_server(CiscoXrParser.Domain_name_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#dspf_null}.
	 * @param ctx the parse tree
	 */
	void enterDspf_null(CiscoXrParser.Dspf_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#dspf_null}.
	 * @param ctx the parse tree
	 */
	void exitDspf_null(CiscoXrParser.Dspf_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ednt_null}.
	 * @param ctx the parse tree
	 */
	void enterEdnt_null(CiscoXrParser.Ednt_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ednt_null}.
	 * @param ctx the parse tree
	 */
	void exitEdnt_null(CiscoXrParser.Ednt_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#eh_null}.
	 * @param ctx the parse tree
	 */
	void enterEh_null(CiscoXrParser.Eh_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#eh_null}.
	 * @param ctx the parse tree
	 */
	void exitEh_null(CiscoXrParser.Eh_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#enable_null}.
	 * @param ctx the parse tree
	 */
	void enterEnable_null(CiscoXrParser.Enable_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#enable_null}.
	 * @param ctx the parse tree
	 */
	void exitEnable_null(CiscoXrParser.Enable_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#enable_password}.
	 * @param ctx the parse tree
	 */
	void enterEnable_password(CiscoXrParser.Enable_passwordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#enable_password}.
	 * @param ctx the parse tree
	 */
	void exitEnable_password(CiscoXrParser.Enable_passwordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#enable_secret}.
	 * @param ctx the parse tree
	 */
	void enterEnable_secret(CiscoXrParser.Enable_secretContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#enable_secret}.
	 * @param ctx the parse tree
	 */
	void exitEnable_secret(CiscoXrParser.Enable_secretContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ep_cisco_encryption}.
	 * @param ctx the parse tree
	 */
	void enterEp_cisco_encryption(CiscoXrParser.Ep_cisco_encryptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ep_cisco_encryption}.
	 * @param ctx the parse tree
	 */
	void exitEp_cisco_encryption(CiscoXrParser.Ep_cisco_encryptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ep_plaintext}.
	 * @param ctx the parse tree
	 */
	void enterEp_plaintext(CiscoXrParser.Ep_plaintextContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ep_plaintext}.
	 * @param ctx the parse tree
	 */
	void exitEp_plaintext(CiscoXrParser.Ep_plaintextContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ep_sha512}.
	 * @param ctx the parse tree
	 */
	void enterEp_sha512(CiscoXrParser.Ep_sha512Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ep_sha512}.
	 * @param ctx the parse tree
	 */
	void exitEp_sha512(CiscoXrParser.Ep_sha512Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#event_null}.
	 * @param ctx the parse tree
	 */
	void enterEvent_null(CiscoXrParser.Event_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#event_null}.
	 * @param ctx the parse tree
	 */
	void exitEvent_null(CiscoXrParser.Event_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#failover_lan}.
	 * @param ctx the parse tree
	 */
	void enterFailover_lan(CiscoXrParser.Failover_lanContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#failover_lan}.
	 * @param ctx the parse tree
	 */
	void exitFailover_lan(CiscoXrParser.Failover_lanContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#failover_lan_tail}.
	 * @param ctx the parse tree
	 */
	void enterFailover_lan_tail(CiscoXrParser.Failover_lan_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#failover_lan_tail}.
	 * @param ctx the parse tree
	 */
	void exitFailover_lan_tail(CiscoXrParser.Failover_lan_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#failover_link}.
	 * @param ctx the parse tree
	 */
	void enterFailover_link(CiscoXrParser.Failover_linkContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#failover_link}.
	 * @param ctx the parse tree
	 */
	void exitFailover_link(CiscoXrParser.Failover_linkContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#failover_interface}.
	 * @param ctx the parse tree
	 */
	void enterFailover_interface(CiscoXrParser.Failover_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#failover_interface}.
	 * @param ctx the parse tree
	 */
	void exitFailover_interface(CiscoXrParser.Failover_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#flan_interface}.
	 * @param ctx the parse tree
	 */
	void enterFlan_interface(CiscoXrParser.Flan_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#flan_interface}.
	 * @param ctx the parse tree
	 */
	void exitFlan_interface(CiscoXrParser.Flan_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#flan_unit}.
	 * @param ctx the parse tree
	 */
	void enterFlan_unit(CiscoXrParser.Flan_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#flan_unit}.
	 * @param ctx the parse tree
	 */
	void exitFlan_unit(CiscoXrParser.Flan_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#flow_null}.
	 * @param ctx the parse tree
	 */
	void enterFlow_null(CiscoXrParser.Flow_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#flow_null}.
	 * @param ctx the parse tree
	 */
	void exitFlow_null(CiscoXrParser.Flow_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#flow_version}.
	 * @param ctx the parse tree
	 */
	void enterFlow_version(CiscoXrParser.Flow_versionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#flow_version}.
	 * @param ctx the parse tree
	 */
	void exitFlow_version(CiscoXrParser.Flow_versionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#flowv_null}.
	 * @param ctx the parse tree
	 */
	void enterFlowv_null(CiscoXrParser.Flowv_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#flowv_null}.
	 * @param ctx the parse tree
	 */
	void exitFlowv_null(CiscoXrParser.Flowv_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#gae_null}.
	 * @param ctx the parse tree
	 */
	void enterGae_null(CiscoXrParser.Gae_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#gae_null}.
	 * @param ctx the parse tree
	 */
	void exitGae_null(CiscoXrParser.Gae_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#gk_null}.
	 * @param ctx the parse tree
	 */
	void enterGk_null(CiscoXrParser.Gk_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#gk_null}.
	 * @param ctx the parse tree
	 */
	void exitGk_null(CiscoXrParser.Gk_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#gpsec_null}.
	 * @param ctx the parse tree
	 */
	void enterGpsec_null(CiscoXrParser.Gpsec_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#gpsec_null}.
	 * @param ctx the parse tree
	 */
	void exitGpsec_null(CiscoXrParser.Gpsec_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#hardware_null}.
	 * @param ctx the parse tree
	 */
	void enterHardware_null(CiscoXrParser.Hardware_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#hardware_null}.
	 * @param ctx the parse tree
	 */
	void exitHardware_null(CiscoXrParser.Hardware_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ids_ap_classification_rule}.
	 * @param ctx the parse tree
	 */
	void enterIds_ap_classification_rule(CiscoXrParser.Ids_ap_classification_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ids_ap_classification_rule}.
	 * @param ctx the parse tree
	 */
	void exitIds_ap_classification_rule(CiscoXrParser.Ids_ap_classification_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ids_ap_classification_rule_null}.
	 * @param ctx the parse tree
	 */
	void enterIds_ap_classification_rule_null(CiscoXrParser.Ids_ap_classification_rule_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ids_ap_classification_rule_null}.
	 * @param ctx the parse tree
	 */
	void exitIds_ap_classification_rule_null(CiscoXrParser.Ids_ap_classification_rule_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ids_ap_rule_matching}.
	 * @param ctx the parse tree
	 */
	void enterIds_ap_rule_matching(CiscoXrParser.Ids_ap_rule_matchingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ids_ap_rule_matching}.
	 * @param ctx the parse tree
	 */
	void exitIds_ap_rule_matching(CiscoXrParser.Ids_ap_rule_matchingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ids_ap_rule_matching_null}.
	 * @param ctx the parse tree
	 */
	void enterIds_ap_rule_matching_null(CiscoXrParser.Ids_ap_rule_matching_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ids_ap_rule_matching_null}.
	 * @param ctx the parse tree
	 */
	void exitIds_ap_rule_matching_null(CiscoXrParser.Ids_ap_rule_matching_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ids_dos_profile}.
	 * @param ctx the parse tree
	 */
	void enterIds_dos_profile(CiscoXrParser.Ids_dos_profileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ids_dos_profile}.
	 * @param ctx the parse tree
	 */
	void exitIds_dos_profile(CiscoXrParser.Ids_dos_profileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ids_dos_profile_null}.
	 * @param ctx the parse tree
	 */
	void enterIds_dos_profile_null(CiscoXrParser.Ids_dos_profile_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ids_dos_profile_null}.
	 * @param ctx the parse tree
	 */
	void exitIds_dos_profile_null(CiscoXrParser.Ids_dos_profile_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ids_general_profile}.
	 * @param ctx the parse tree
	 */
	void enterIds_general_profile(CiscoXrParser.Ids_general_profileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ids_general_profile}.
	 * @param ctx the parse tree
	 */
	void exitIds_general_profile(CiscoXrParser.Ids_general_profileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ids_general_profile_null}.
	 * @param ctx the parse tree
	 */
	void enterIds_general_profile_null(CiscoXrParser.Ids_general_profile_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ids_general_profile_null}.
	 * @param ctx the parse tree
	 */
	void exitIds_general_profile_null(CiscoXrParser.Ids_general_profile_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ids_impersonation_profile}.
	 * @param ctx the parse tree
	 */
	void enterIds_impersonation_profile(CiscoXrParser.Ids_impersonation_profileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ids_impersonation_profile}.
	 * @param ctx the parse tree
	 */
	void exitIds_impersonation_profile(CiscoXrParser.Ids_impersonation_profileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ids_impersonation_profile_null}.
	 * @param ctx the parse tree
	 */
	void enterIds_impersonation_profile_null(CiscoXrParser.Ids_impersonation_profile_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ids_impersonation_profile_null}.
	 * @param ctx the parse tree
	 */
	void exitIds_impersonation_profile_null(CiscoXrParser.Ids_impersonation_profile_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ids_null}.
	 * @param ctx the parse tree
	 */
	void enterIds_null(CiscoXrParser.Ids_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ids_null}.
	 * @param ctx the parse tree
	 */
	void exitIds_null(CiscoXrParser.Ids_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ids_profile}.
	 * @param ctx the parse tree
	 */
	void enterIds_profile(CiscoXrParser.Ids_profileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ids_profile}.
	 * @param ctx the parse tree
	 */
	void exitIds_profile(CiscoXrParser.Ids_profileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ids_profile_null}.
	 * @param ctx the parse tree
	 */
	void enterIds_profile_null(CiscoXrParser.Ids_profile_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ids_profile_null}.
	 * @param ctx the parse tree
	 */
	void exitIds_profile_null(CiscoXrParser.Ids_profile_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ids_signature_matching_profile}.
	 * @param ctx the parse tree
	 */
	void enterIds_signature_matching_profile(CiscoXrParser.Ids_signature_matching_profileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ids_signature_matching_profile}.
	 * @param ctx the parse tree
	 */
	void exitIds_signature_matching_profile(CiscoXrParser.Ids_signature_matching_profileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ids_signature_matching_profile_null}.
	 * @param ctx the parse tree
	 */
	void enterIds_signature_matching_profile_null(CiscoXrParser.Ids_signature_matching_profile_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ids_signature_matching_profile_null}.
	 * @param ctx the parse tree
	 */
	void exitIds_signature_matching_profile_null(CiscoXrParser.Ids_signature_matching_profile_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ids_unauthorized_device_profile}.
	 * @param ctx the parse tree
	 */
	void enterIds_unauthorized_device_profile(CiscoXrParser.Ids_unauthorized_device_profileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ids_unauthorized_device_profile}.
	 * @param ctx the parse tree
	 */
	void exitIds_unauthorized_device_profile(CiscoXrParser.Ids_unauthorized_device_profileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ids_unauthorized_device_profile_null}.
	 * @param ctx the parse tree
	 */
	void enterIds_unauthorized_device_profile_null(CiscoXrParser.Ids_unauthorized_device_profile_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ids_unauthorized_device_profile_null}.
	 * @param ctx the parse tree
	 */
	void exitIds_unauthorized_device_profile_null(CiscoXrParser.Ids_unauthorized_device_profile_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ids_wms_general_profile}.
	 * @param ctx the parse tree
	 */
	void enterIds_wms_general_profile(CiscoXrParser.Ids_wms_general_profileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ids_wms_general_profile}.
	 * @param ctx the parse tree
	 */
	void exitIds_wms_general_profile(CiscoXrParser.Ids_wms_general_profileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ids_wms_general_profile_null}.
	 * @param ctx the parse tree
	 */
	void enterIds_wms_general_profile_null(CiscoXrParser.Ids_wms_general_profile_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ids_wms_general_profile_null}.
	 * @param ctx the parse tree
	 */
	void exitIds_wms_general_profile_null(CiscoXrParser.Ids_wms_general_profile_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ifmap_null}.
	 * @param ctx the parse tree
	 */
	void enterIfmap_null(CiscoXrParser.Ifmap_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ifmap_null}.
	 * @param ctx the parse tree
	 */
	void exitIfmap_null(CiscoXrParser.Ifmap_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#iimgp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterIimgp_stanza(CiscoXrParser.Iimgp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#iimgp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitIimgp_stanza(CiscoXrParser.Iimgp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#imgp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterImgp_stanza(CiscoXrParser.Imgp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#imgp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitImgp_stanza(CiscoXrParser.Imgp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#inband_mgp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterInband_mgp_stanza(CiscoXrParser.Inband_mgp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#inband_mgp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitInband_mgp_stanza(CiscoXrParser.Inband_mgp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#interface_imgp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterInterface_imgp_stanza(CiscoXrParser.Interface_imgp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#interface_imgp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitInterface_imgp_stanza(CiscoXrParser.Interface_imgp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#interface_multicast_stanza}.
	 * @param ctx the parse tree
	 */
	void enterInterface_multicast_stanza(CiscoXrParser.Interface_multicast_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#interface_multicast_stanza}.
	 * @param ctx the parse tree
	 */
	void exitInterface_multicast_stanza(CiscoXrParser.Interface_multicast_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#interface_multicast_tail}.
	 * @param ctx the parse tree
	 */
	void enterInterface_multicast_tail(CiscoXrParser.Interface_multicast_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#interface_multicast_tail}.
	 * @param ctx the parse tree
	 */
	void exitInterface_multicast_tail(CiscoXrParser.Interface_multicast_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ip_as_path_regex_mode_stanza}.
	 * @param ctx the parse tree
	 */
	void enterIp_as_path_regex_mode_stanza(CiscoXrParser.Ip_as_path_regex_mode_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ip_as_path_regex_mode_stanza}.
	 * @param ctx the parse tree
	 */
	void exitIp_as_path_regex_mode_stanza(CiscoXrParser.Ip_as_path_regex_mode_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ip_dhcp_null}.
	 * @param ctx the parse tree
	 */
	void enterIp_dhcp_null(CiscoXrParser.Ip_dhcp_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ip_dhcp_null}.
	 * @param ctx the parse tree
	 */
	void exitIp_dhcp_null(CiscoXrParser.Ip_dhcp_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ip_dhcp_pool}.
	 * @param ctx the parse tree
	 */
	void enterIp_dhcp_pool(CiscoXrParser.Ip_dhcp_poolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ip_dhcp_pool}.
	 * @param ctx the parse tree
	 */
	void exitIp_dhcp_pool(CiscoXrParser.Ip_dhcp_poolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ip_dhcp_pool_null}.
	 * @param ctx the parse tree
	 */
	void enterIp_dhcp_pool_null(CiscoXrParser.Ip_dhcp_pool_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ip_dhcp_pool_null}.
	 * @param ctx the parse tree
	 */
	void exitIp_dhcp_pool_null(CiscoXrParser.Ip_dhcp_pool_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ip_dhcp_relay}.
	 * @param ctx the parse tree
	 */
	void enterIp_dhcp_relay(CiscoXrParser.Ip_dhcp_relayContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ip_dhcp_relay}.
	 * @param ctx the parse tree
	 */
	void exitIp_dhcp_relay(CiscoXrParser.Ip_dhcp_relayContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ip_dhcp_relay_null}.
	 * @param ctx the parse tree
	 */
	void enterIp_dhcp_relay_null(CiscoXrParser.Ip_dhcp_relay_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ip_dhcp_relay_null}.
	 * @param ctx the parse tree
	 */
	void exitIp_dhcp_relay_null(CiscoXrParser.Ip_dhcp_relay_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ip_dhcp_relay_server}.
	 * @param ctx the parse tree
	 */
	void enterIp_dhcp_relay_server(CiscoXrParser.Ip_dhcp_relay_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ip_dhcp_relay_server}.
	 * @param ctx the parse tree
	 */
	void exitIp_dhcp_relay_server(CiscoXrParser.Ip_dhcp_relay_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ip_domain_lookup}.
	 * @param ctx the parse tree
	 */
	void enterIp_domain_lookup(CiscoXrParser.Ip_domain_lookupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ip_domain_lookup}.
	 * @param ctx the parse tree
	 */
	void exitIp_domain_lookup(CiscoXrParser.Ip_domain_lookupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ip_domain_name}.
	 * @param ctx the parse tree
	 */
	void enterIp_domain_name(CiscoXrParser.Ip_domain_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ip_domain_name}.
	 * @param ctx the parse tree
	 */
	void exitIp_domain_name(CiscoXrParser.Ip_domain_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ip_domain_null}.
	 * @param ctx the parse tree
	 */
	void enterIp_domain_null(CiscoXrParser.Ip_domain_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ip_domain_null}.
	 * @param ctx the parse tree
	 */
	void exitIp_domain_null(CiscoXrParser.Ip_domain_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ip_probe_null}.
	 * @param ctx the parse tree
	 */
	void enterIp_probe_null(CiscoXrParser.Ip_probe_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ip_probe_null}.
	 * @param ctx the parse tree
	 */
	void exitIp_probe_null(CiscoXrParser.Ip_probe_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ip_route_stanza}.
	 * @param ctx the parse tree
	 */
	void enterIp_route_stanza(CiscoXrParser.Ip_route_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ip_route_stanza}.
	 * @param ctx the parse tree
	 */
	void exitIp_route_stanza(CiscoXrParser.Ip_route_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ip_route_tail}.
	 * @param ctx the parse tree
	 */
	void enterIp_route_tail(CiscoXrParser.Ip_route_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ip_route_tail}.
	 * @param ctx the parse tree
	 */
	void exitIp_route_tail(CiscoXrParser.Ip_route_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ip_sla_null}.
	 * @param ctx the parse tree
	 */
	void enterIp_sla_null(CiscoXrParser.Ip_sla_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ip_sla_null}.
	 * @param ctx the parse tree
	 */
	void exitIp_sla_null(CiscoXrParser.Ip_sla_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ip_ssh_null}.
	 * @param ctx the parse tree
	 */
	void enterIp_ssh_null(CiscoXrParser.Ip_ssh_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ip_ssh_null}.
	 * @param ctx the parse tree
	 */
	void exitIp_ssh_null(CiscoXrParser.Ip_ssh_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ip_ssh_pubkey_chain}.
	 * @param ctx the parse tree
	 */
	void enterIp_ssh_pubkey_chain(CiscoXrParser.Ip_ssh_pubkey_chainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ip_ssh_pubkey_chain}.
	 * @param ctx the parse tree
	 */
	void exitIp_ssh_pubkey_chain(CiscoXrParser.Ip_ssh_pubkey_chainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ip_ssh_version}.
	 * @param ctx the parse tree
	 */
	void enterIp_ssh_version(CiscoXrParser.Ip_ssh_versionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ip_ssh_version}.
	 * @param ctx the parse tree
	 */
	void exitIp_ssh_version(CiscoXrParser.Ip_ssh_versionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ipc_association}.
	 * @param ctx the parse tree
	 */
	void enterIpc_association(CiscoXrParser.Ipc_associationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ipc_association}.
	 * @param ctx the parse tree
	 */
	void exitIpc_association(CiscoXrParser.Ipc_associationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ipca_null}.
	 * @param ctx the parse tree
	 */
	void enterIpca_null(CiscoXrParser.Ipca_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ipca_null}.
	 * @param ctx the parse tree
	 */
	void exitIpca_null(CiscoXrParser.Ipca_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ipdg_address}.
	 * @param ctx the parse tree
	 */
	void enterIpdg_address(CiscoXrParser.Ipdg_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ipdg_address}.
	 * @param ctx the parse tree
	 */
	void exitIpdg_address(CiscoXrParser.Ipdg_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ipdg_null}.
	 * @param ctx the parse tree
	 */
	void enterIpdg_null(CiscoXrParser.Ipdg_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ipdg_null}.
	 * @param ctx the parse tree
	 */
	void exitIpdg_null(CiscoXrParser.Ipdg_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ispla_operation}.
	 * @param ctx the parse tree
	 */
	void enterIspla_operation(CiscoXrParser.Ispla_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ispla_operation}.
	 * @param ctx the parse tree
	 */
	void exitIspla_operation(CiscoXrParser.Ispla_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ipsla_reaction}.
	 * @param ctx the parse tree
	 */
	void enterIpsla_reaction(CiscoXrParser.Ipsla_reactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ipsla_reaction}.
	 * @param ctx the parse tree
	 */
	void exitIpsla_reaction(CiscoXrParser.Ipsla_reactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ipsla_responder}.
	 * @param ctx the parse tree
	 */
	void enterIpsla_responder(CiscoXrParser.Ipsla_responderContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ipsla_responder}.
	 * @param ctx the parse tree
	 */
	void exitIpsla_responder(CiscoXrParser.Ipsla_responderContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ipsla_schedule}.
	 * @param ctx the parse tree
	 */
	void enterIpsla_schedule(CiscoXrParser.Ipsla_scheduleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ipsla_schedule}.
	 * @param ctx the parse tree
	 */
	void exitIpsla_schedule(CiscoXrParser.Ipsla_scheduleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ipslao_type}.
	 * @param ctx the parse tree
	 */
	void enterIpslao_type(CiscoXrParser.Ipslao_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ipslao_type}.
	 * @param ctx the parse tree
	 */
	void exitIpslao_type(CiscoXrParser.Ipslao_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ipslaot_null}.
	 * @param ctx the parse tree
	 */
	void enterIpslaot_null(CiscoXrParser.Ipslaot_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ipslaot_null}.
	 * @param ctx the parse tree
	 */
	void exitIpslaot_null(CiscoXrParser.Ipslaot_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ipslaot_statistics}.
	 * @param ctx the parse tree
	 */
	void enterIpslaot_statistics(CiscoXrParser.Ipslaot_statisticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ipslaot_statistics}.
	 * @param ctx the parse tree
	 */
	void exitIpslaot_statistics(CiscoXrParser.Ipslaot_statisticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ipslaots_null}.
	 * @param ctx the parse tree
	 */
	void enterIpslaots_null(CiscoXrParser.Ipslaots_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ipslaots_null}.
	 * @param ctx the parse tree
	 */
	void exitIpslaots_null(CiscoXrParser.Ipslaots_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ipslar_react}.
	 * @param ctx the parse tree
	 */
	void enterIpslar_react(CiscoXrParser.Ipslar_reactContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ipslar_react}.
	 * @param ctx the parse tree
	 */
	void exitIpslar_react(CiscoXrParser.Ipslar_reactContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ipslarp_null}.
	 * @param ctx the parse tree
	 */
	void enterIpslarp_null(CiscoXrParser.Ipslarp_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ipslarp_null}.
	 * @param ctx the parse tree
	 */
	void exitIpslarp_null(CiscoXrParser.Ipslarp_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ispalrr_null}.
	 * @param ctx the parse tree
	 */
	void enterIspalrr_null(CiscoXrParser.Ispalrr_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ispalrr_null}.
	 * @param ctx the parse tree
	 */
	void exitIspalrr_null(CiscoXrParser.Ispalrr_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ipslas_null}.
	 * @param ctx the parse tree
	 */
	void enterIpslas_null(CiscoXrParser.Ipslas_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ipslas_null}.
	 * @param ctx the parse tree
	 */
	void exitIpslas_null(CiscoXrParser.Ipslas_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#l2_null}.
	 * @param ctx the parse tree
	 */
	void enterL2_null(CiscoXrParser.L2_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#l2_null}.
	 * @param ctx the parse tree
	 */
	void exitL2_null(CiscoXrParser.L2_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#l2tpc_null}.
	 * @param ctx the parse tree
	 */
	void enterL2tpc_null(CiscoXrParser.L2tpc_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#l2tpc_null}.
	 * @param ctx the parse tree
	 */
	void exitL2tpc_null(CiscoXrParser.L2tpc_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#l2vpn_bridge_group}.
	 * @param ctx the parse tree
	 */
	void enterL2vpn_bridge_group(CiscoXrParser.L2vpn_bridge_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#l2vpn_bridge_group}.
	 * @param ctx the parse tree
	 */
	void exitL2vpn_bridge_group(CiscoXrParser.L2vpn_bridge_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#l2vpn_logging}.
	 * @param ctx the parse tree
	 */
	void enterL2vpn_logging(CiscoXrParser.L2vpn_loggingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#l2vpn_logging}.
	 * @param ctx the parse tree
	 */
	void exitL2vpn_logging(CiscoXrParser.L2vpn_loggingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#l2vpn_xconnect}.
	 * @param ctx the parse tree
	 */
	void enterL2vpn_xconnect(CiscoXrParser.L2vpn_xconnectContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#l2vpn_xconnect}.
	 * @param ctx the parse tree
	 */
	void exitL2vpn_xconnect(CiscoXrParser.L2vpn_xconnectContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#l2vpn_xconnect_p2p}.
	 * @param ctx the parse tree
	 */
	void enterL2vpn_xconnect_p2p(CiscoXrParser.L2vpn_xconnect_p2pContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#l2vpn_xconnect_p2p}.
	 * @param ctx the parse tree
	 */
	void exitL2vpn_xconnect_p2p(CiscoXrParser.L2vpn_xconnect_p2pContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#lbg_bridge_domain}.
	 * @param ctx the parse tree
	 */
	void enterLbg_bridge_domain(CiscoXrParser.Lbg_bridge_domainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#lbg_bridge_domain}.
	 * @param ctx the parse tree
	 */
	void exitLbg_bridge_domain(CiscoXrParser.Lbg_bridge_domainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#lbgbd_mac}.
	 * @param ctx the parse tree
	 */
	void enterLbgbd_mac(CiscoXrParser.Lbgbd_macContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#lbgbd_mac}.
	 * @param ctx the parse tree
	 */
	void exitLbgbd_mac(CiscoXrParser.Lbgbd_macContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#lbgbd_null}.
	 * @param ctx the parse tree
	 */
	void enterLbgbd_null(CiscoXrParser.Lbgbd_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#lbgbd_null}.
	 * @param ctx the parse tree
	 */
	void exitLbgbd_null(CiscoXrParser.Lbgbd_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#lbgbd_vfi}.
	 * @param ctx the parse tree
	 */
	void enterLbgbd_vfi(CiscoXrParser.Lbgbd_vfiContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#lbgbd_vfi}.
	 * @param ctx the parse tree
	 */
	void exitLbgbd_vfi(CiscoXrParser.Lbgbd_vfiContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#lbgbdm_limit}.
	 * @param ctx the parse tree
	 */
	void enterLbgbdm_limit(CiscoXrParser.Lbgbdm_limitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#lbgbdm_limit}.
	 * @param ctx the parse tree
	 */
	void exitLbgbdm_limit(CiscoXrParser.Lbgbdm_limitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#lbgbdml_null}.
	 * @param ctx the parse tree
	 */
	void enterLbgbdml_null(CiscoXrParser.Lbgbdml_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#lbgbdml_null}.
	 * @param ctx the parse tree
	 */
	void exitLbgbdml_null(CiscoXrParser.Lbgbdml_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#lbgbdv_null}.
	 * @param ctx the parse tree
	 */
	void enterLbgbdv_null(CiscoXrParser.Lbgbdv_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#lbgbdv_null}.
	 * @param ctx the parse tree
	 */
	void exitLbgbdv_null(CiscoXrParser.Lbgbdv_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#license_null}.
	 * @param ctx the parse tree
	 */
	void enterLicense_null(CiscoXrParser.License_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#license_null}.
	 * @param ctx the parse tree
	 */
	void exitLicense_null(CiscoXrParser.License_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#lpts_null}.
	 * @param ctx the parse tree
	 */
	void enterLpts_null(CiscoXrParser.Lpts_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#lpts_null}.
	 * @param ctx the parse tree
	 */
	void exitLpts_null(CiscoXrParser.Lpts_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#lxp_neighbor}.
	 * @param ctx the parse tree
	 */
	void enterLxp_neighbor(CiscoXrParser.Lxp_neighborContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#lxp_neighbor}.
	 * @param ctx the parse tree
	 */
	void exitLxp_neighbor(CiscoXrParser.Lxp_neighborContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#lxp_null}.
	 * @param ctx the parse tree
	 */
	void enterLxp_null(CiscoXrParser.Lxp_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#lxp_null}.
	 * @param ctx the parse tree
	 */
	void exitLxp_null(CiscoXrParser.Lxp_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#lxpn_null}.
	 * @param ctx the parse tree
	 */
	void enterLxpn_null(CiscoXrParser.Lxpn_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#lxpn_null}.
	 * @param ctx the parse tree
	 */
	void exitLxpn_null(CiscoXrParser.Lxpn_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#lxpn_l2tp}.
	 * @param ctx the parse tree
	 */
	void enterLxpn_l2tp(CiscoXrParser.Lxpn_l2tpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#lxpn_l2tp}.
	 * @param ctx the parse tree
	 */
	void exitLxpn_l2tp(CiscoXrParser.Lxpn_l2tpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#lxpnl_null}.
	 * @param ctx the parse tree
	 */
	void enterLxpnl_null(CiscoXrParser.Lxpnl_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#lxpnl_null}.
	 * @param ctx the parse tree
	 */
	void exitLxpnl_null(CiscoXrParser.Lxpnl_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#map_class_null}.
	 * @param ctx the parse tree
	 */
	void enterMap_class_null(CiscoXrParser.Map_class_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#map_class_null}.
	 * @param ctx the parse tree
	 */
	void exitMap_class_null(CiscoXrParser.Map_class_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#management_api}.
	 * @param ctx the parse tree
	 */
	void enterManagement_api(CiscoXrParser.Management_apiContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#management_api}.
	 * @param ctx the parse tree
	 */
	void exitManagement_api(CiscoXrParser.Management_apiContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#management_api_null}.
	 * @param ctx the parse tree
	 */
	void enterManagement_api_null(CiscoXrParser.Management_api_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#management_api_null}.
	 * @param ctx the parse tree
	 */
	void exitManagement_api_null(CiscoXrParser.Management_api_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#management_api_vrf}.
	 * @param ctx the parse tree
	 */
	void enterManagement_api_vrf(CiscoXrParser.Management_api_vrfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#management_api_vrf}.
	 * @param ctx the parse tree
	 */
	void exitManagement_api_vrf(CiscoXrParser.Management_api_vrfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#management_api_vrf_null}.
	 * @param ctx the parse tree
	 */
	void enterManagement_api_vrf_null(CiscoXrParser.Management_api_vrf_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#management_api_vrf_null}.
	 * @param ctx the parse tree
	 */
	void exitManagement_api_vrf_null(CiscoXrParser.Management_api_vrf_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#management_console}.
	 * @param ctx the parse tree
	 */
	void enterManagement_console(CiscoXrParser.Management_consoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#management_console}.
	 * @param ctx the parse tree
	 */
	void exitManagement_console(CiscoXrParser.Management_consoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#management_console_null}.
	 * @param ctx the parse tree
	 */
	void enterManagement_console_null(CiscoXrParser.Management_console_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#management_console_null}.
	 * @param ctx the parse tree
	 */
	void exitManagement_console_null(CiscoXrParser.Management_console_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#management_egress_interface_selection}.
	 * @param ctx the parse tree
	 */
	void enterManagement_egress_interface_selection(CiscoXrParser.Management_egress_interface_selectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#management_egress_interface_selection}.
	 * @param ctx the parse tree
	 */
	void exitManagement_egress_interface_selection(CiscoXrParser.Management_egress_interface_selectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#management_egress_interface_selection_null}.
	 * @param ctx the parse tree
	 */
	void enterManagement_egress_interface_selection_null(CiscoXrParser.Management_egress_interface_selection_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#management_egress_interface_selection_null}.
	 * @param ctx the parse tree
	 */
	void exitManagement_egress_interface_selection_null(CiscoXrParser.Management_egress_interface_selection_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#management_ssh}.
	 * @param ctx the parse tree
	 */
	void enterManagement_ssh(CiscoXrParser.Management_sshContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#management_ssh}.
	 * @param ctx the parse tree
	 */
	void exitManagement_ssh(CiscoXrParser.Management_sshContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#management_ssh_ip_access_group}.
	 * @param ctx the parse tree
	 */
	void enterManagement_ssh_ip_access_group(CiscoXrParser.Management_ssh_ip_access_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#management_ssh_ip_access_group}.
	 * @param ctx the parse tree
	 */
	void exitManagement_ssh_ip_access_group(CiscoXrParser.Management_ssh_ip_access_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#management_ssh_null}.
	 * @param ctx the parse tree
	 */
	void enterManagement_ssh_null(CiscoXrParser.Management_ssh_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#management_ssh_null}.
	 * @param ctx the parse tree
	 */
	void exitManagement_ssh_null(CiscoXrParser.Management_ssh_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#management_telnet}.
	 * @param ctx the parse tree
	 */
	void enterManagement_telnet(CiscoXrParser.Management_telnetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#management_telnet}.
	 * @param ctx the parse tree
	 */
	void exitManagement_telnet(CiscoXrParser.Management_telnetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#management_telnet_ip_access_group}.
	 * @param ctx the parse tree
	 */
	void enterManagement_telnet_ip_access_group(CiscoXrParser.Management_telnet_ip_access_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#management_telnet_ip_access_group}.
	 * @param ctx the parse tree
	 */
	void exitManagement_telnet_ip_access_group(CiscoXrParser.Management_telnet_ip_access_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#management_telnet_null}.
	 * @param ctx the parse tree
	 */
	void enterManagement_telnet_null(CiscoXrParser.Management_telnet_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#management_telnet_null}.
	 * @param ctx the parse tree
	 */
	void exitManagement_telnet_null(CiscoXrParser.Management_telnet_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#mgp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterMgp_stanza(CiscoXrParser.Mgp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#mgp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitMgp_stanza(CiscoXrParser.Mgp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#monitor_destination}.
	 * @param ctx the parse tree
	 */
	void enterMonitor_destination(CiscoXrParser.Monitor_destinationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#monitor_destination}.
	 * @param ctx the parse tree
	 */
	void exitMonitor_destination(CiscoXrParser.Monitor_destinationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#monitor_destination_null}.
	 * @param ctx the parse tree
	 */
	void enterMonitor_destination_null(CiscoXrParser.Monitor_destination_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#monitor_destination_null}.
	 * @param ctx the parse tree
	 */
	void exitMonitor_destination_null(CiscoXrParser.Monitor_destination_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#monitor_null}.
	 * @param ctx the parse tree
	 */
	void enterMonitor_null(CiscoXrParser.Monitor_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#monitor_null}.
	 * @param ctx the parse tree
	 */
	void exitMonitor_null(CiscoXrParser.Monitor_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#monitor_session_null}.
	 * @param ctx the parse tree
	 */
	void enterMonitor_session_null(CiscoXrParser.Monitor_session_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#monitor_session_null}.
	 * @param ctx the parse tree
	 */
	void exitMonitor_session_null(CiscoXrParser.Monitor_session_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#mp_null}.
	 * @param ctx the parse tree
	 */
	void enterMp_null(CiscoXrParser.Mp_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#mp_null}.
	 * @param ctx the parse tree
	 */
	void exitMp_null(CiscoXrParser.Mp_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#mt_null}.
	 * @param ctx the parse tree
	 */
	void enterMt_null(CiscoXrParser.Mt_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#mt_null}.
	 * @param ctx the parse tree
	 */
	void exitMt_null(CiscoXrParser.Mt_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#multicast_routing_stanza}.
	 * @param ctx the parse tree
	 */
	void enterMulticast_routing_stanza(CiscoXrParser.Multicast_routing_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#multicast_routing_stanza}.
	 * @param ctx the parse tree
	 */
	void exitMulticast_routing_stanza(CiscoXrParser.Multicast_routing_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#no_aaa_group_server_stanza}.
	 * @param ctx the parse tree
	 */
	void enterNo_aaa_group_server_stanza(CiscoXrParser.No_aaa_group_server_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#no_aaa_group_server_stanza}.
	 * @param ctx the parse tree
	 */
	void exitNo_aaa_group_server_stanza(CiscoXrParser.No_aaa_group_server_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#no_failover}.
	 * @param ctx the parse tree
	 */
	void enterNo_failover(CiscoXrParser.No_failoverContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#no_failover}.
	 * @param ctx the parse tree
	 */
	void exitNo_failover(CiscoXrParser.No_failoverContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#null_af_multicast_tail}.
	 * @param ctx the parse tree
	 */
	void enterNull_af_multicast_tail(CiscoXrParser.Null_af_multicast_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#null_af_multicast_tail}.
	 * @param ctx the parse tree
	 */
	void exitNull_af_multicast_tail(CiscoXrParser.Null_af_multicast_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#vrfd_af_null}.
	 * @param ctx the parse tree
	 */
	void enterVrfd_af_null(CiscoXrParser.Vrfd_af_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#vrfd_af_null}.
	 * @param ctx the parse tree
	 */
	void exitVrfd_af_null(CiscoXrParser.Vrfd_af_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#null_imgp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterNull_imgp_stanza(CiscoXrParser.Null_imgp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#null_imgp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitNull_imgp_stanza(CiscoXrParser.Null_imgp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#nv_satellite}.
	 * @param ctx the parse tree
	 */
	void enterNv_satellite(CiscoXrParser.Nv_satelliteContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#nv_satellite}.
	 * @param ctx the parse tree
	 */
	void exitNv_satellite(CiscoXrParser.Nv_satelliteContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#nvs_null}.
	 * @param ctx the parse tree
	 */
	void enterNvs_null(CiscoXrParser.Nvs_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#nvs_null}.
	 * @param ctx the parse tree
	 */
	void exitNvs_null(CiscoXrParser.Nvs_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#of_null}.
	 * @param ctx the parse tree
	 */
	void enterOf_null(CiscoXrParser.Of_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#of_null}.
	 * @param ctx the parse tree
	 */
	void exitOf_null(CiscoXrParser.Of_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#peer_sa_filter}.
	 * @param ctx the parse tree
	 */
	void enterPeer_sa_filter(CiscoXrParser.Peer_sa_filterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#peer_sa_filter}.
	 * @param ctx the parse tree
	 */
	void exitPeer_sa_filter(CiscoXrParser.Peer_sa_filterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#peer_stanza}.
	 * @param ctx the parse tree
	 */
	void enterPeer_stanza(CiscoXrParser.Peer_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#peer_stanza}.
	 * @param ctx the parse tree
	 */
	void exitPeer_stanza(CiscoXrParser.Peer_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#phone_proxy_null}.
	 * @param ctx the parse tree
	 */
	void enterPhone_proxy_null(CiscoXrParser.Phone_proxy_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#phone_proxy_null}.
	 * @param ctx the parse tree
	 */
	void exitPhone_proxy_null(CiscoXrParser.Phone_proxy_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#qm_length}.
	 * @param ctx the parse tree
	 */
	void enterQm_length(CiscoXrParser.Qm_lengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#qm_length}.
	 * @param ctx the parse tree
	 */
	void exitQm_length(CiscoXrParser.Qm_lengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#qm_streaming}.
	 * @param ctx the parse tree
	 */
	void enterQm_streaming(CiscoXrParser.Qm_streamingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#qm_streaming}.
	 * @param ctx the parse tree
	 */
	void exitQm_streaming(CiscoXrParser.Qm_streamingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#qms_null}.
	 * @param ctx the parse tree
	 */
	void enterQms_null(CiscoXrParser.Qms_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#qms_null}.
	 * @param ctx the parse tree
	 */
	void exitQms_null(CiscoXrParser.Qms_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#redundancy_linecard_group}.
	 * @param ctx the parse tree
	 */
	void enterRedundancy_linecard_group(CiscoXrParser.Redundancy_linecard_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#redundancy_linecard_group}.
	 * @param ctx the parse tree
	 */
	void exitRedundancy_linecard_group(CiscoXrParser.Redundancy_linecard_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#redundancy_main_cpu}.
	 * @param ctx the parse tree
	 */
	void enterRedundancy_main_cpu(CiscoXrParser.Redundancy_main_cpuContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#redundancy_main_cpu}.
	 * @param ctx the parse tree
	 */
	void exitRedundancy_main_cpu(CiscoXrParser.Redundancy_main_cpuContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#redundancy_main_cpu_null}.
	 * @param ctx the parse tree
	 */
	void enterRedundancy_main_cpu_null(CiscoXrParser.Redundancy_main_cpu_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#redundancy_main_cpu_null}.
	 * @param ctx the parse tree
	 */
	void exitRedundancy_main_cpu_null(CiscoXrParser.Redundancy_main_cpu_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#redundancy_null}.
	 * @param ctx the parse tree
	 */
	void enterRedundancy_null(CiscoXrParser.Redundancy_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#redundancy_null}.
	 * @param ctx the parse tree
	 */
	void exitRedundancy_null(CiscoXrParser.Redundancy_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#rf_arm_profile}.
	 * @param ctx the parse tree
	 */
	void enterRf_arm_profile(CiscoXrParser.Rf_arm_profileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#rf_arm_profile}.
	 * @param ctx the parse tree
	 */
	void exitRf_arm_profile(CiscoXrParser.Rf_arm_profileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#rf_arm_profile_null}.
	 * @param ctx the parse tree
	 */
	void enterRf_arm_profile_null(CiscoXrParser.Rf_arm_profile_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#rf_arm_profile_null}.
	 * @param ctx the parse tree
	 */
	void exitRf_arm_profile_null(CiscoXrParser.Rf_arm_profile_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#rf_null}.
	 * @param ctx the parse tree
	 */
	void enterRf_null(CiscoXrParser.Rf_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#rf_null}.
	 * @param ctx the parse tree
	 */
	void exitRf_null(CiscoXrParser.Rf_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#rf_dot11a_radio_profile}.
	 * @param ctx the parse tree
	 */
	void enterRf_dot11a_radio_profile(CiscoXrParser.Rf_dot11a_radio_profileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#rf_dot11a_radio_profile}.
	 * @param ctx the parse tree
	 */
	void exitRf_dot11a_radio_profile(CiscoXrParser.Rf_dot11a_radio_profileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#rf_dot11a_radio_profile_null}.
	 * @param ctx the parse tree
	 */
	void enterRf_dot11a_radio_profile_null(CiscoXrParser.Rf_dot11a_radio_profile_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#rf_dot11a_radio_profile_null}.
	 * @param ctx the parse tree
	 */
	void exitRf_dot11a_radio_profile_null(CiscoXrParser.Rf_dot11a_radio_profile_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#rf_dot11g_radio_profile}.
	 * @param ctx the parse tree
	 */
	void enterRf_dot11g_radio_profile(CiscoXrParser.Rf_dot11g_radio_profileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#rf_dot11g_radio_profile}.
	 * @param ctx the parse tree
	 */
	void exitRf_dot11g_radio_profile(CiscoXrParser.Rf_dot11g_radio_profileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#rf_dot11g_radio_profile_null}.
	 * @param ctx the parse tree
	 */
	void enterRf_dot11g_radio_profile_null(CiscoXrParser.Rf_dot11g_radio_profile_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#rf_dot11g_radio_profile_null}.
	 * @param ctx the parse tree
	 */
	void exitRf_dot11g_radio_profile_null(CiscoXrParser.Rf_dot11g_radio_profile_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#rlcg_null}.
	 * @param ctx the parse tree
	 */
	void enterRlcg_null(CiscoXrParser.Rlcg_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#rlcg_null}.
	 * @param ctx the parse tree
	 */
	void exitRlcg_null(CiscoXrParser.Rlcg_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#rmc_null}.
	 * @param ctx the parse tree
	 */
	void enterRmc_null(CiscoXrParser.Rmc_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#rmc_null}.
	 * @param ctx the parse tree
	 */
	void exitRmc_null(CiscoXrParser.Rmc_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#role_null}.
	 * @param ctx the parse tree
	 */
	void enterRole_null(CiscoXrParser.Role_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#role_null}.
	 * @param ctx the parse tree
	 */
	void exitRole_null(CiscoXrParser.Role_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#route_tail}.
	 * @param ctx the parse tree
	 */
	void enterRoute_tail(CiscoXrParser.Route_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#route_tail}.
	 * @param ctx the parse tree
	 */
	void exitRoute_tail(CiscoXrParser.Route_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#router_multicast_stanza}.
	 * @param ctx the parse tree
	 */
	void enterRouter_multicast_stanza(CiscoXrParser.Router_multicast_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#router_multicast_stanza}.
	 * @param ctx the parse tree
	 */
	void exitRouter_multicast_stanza(CiscoXrParser.Router_multicast_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#router_multicast_tail}.
	 * @param ctx the parse tree
	 */
	void enterRouter_multicast_tail(CiscoXrParser.Router_multicast_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#router_multicast_tail}.
	 * @param ctx the parse tree
	 */
	void exitRouter_multicast_tail(CiscoXrParser.Router_multicast_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_access_line}.
	 * @param ctx the parse tree
	 */
	void enterS_access_line(CiscoXrParser.S_access_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_access_line}.
	 * @param ctx the parse tree
	 */
	void exitS_access_line(CiscoXrParser.S_access_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_airgroupservice}.
	 * @param ctx the parse tree
	 */
	void enterS_airgroupservice(CiscoXrParser.S_airgroupserviceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_airgroupservice}.
	 * @param ctx the parse tree
	 */
	void exitS_airgroupservice(CiscoXrParser.S_airgroupserviceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_ap}.
	 * @param ctx the parse tree
	 */
	void enterS_ap(CiscoXrParser.S_apContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_ap}.
	 * @param ctx the parse tree
	 */
	void exitS_ap(CiscoXrParser.S_apContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_ap_group}.
	 * @param ctx the parse tree
	 */
	void enterS_ap_group(CiscoXrParser.S_ap_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_ap_group}.
	 * @param ctx the parse tree
	 */
	void exitS_ap_group(CiscoXrParser.S_ap_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_ap_name}.
	 * @param ctx the parse tree
	 */
	void enterS_ap_name(CiscoXrParser.S_ap_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_ap_name}.
	 * @param ctx the parse tree
	 */
	void exitS_ap_name(CiscoXrParser.S_ap_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_application}.
	 * @param ctx the parse tree
	 */
	void enterS_application(CiscoXrParser.S_applicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_application}.
	 * @param ctx the parse tree
	 */
	void exitS_application(CiscoXrParser.S_applicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_application_var}.
	 * @param ctx the parse tree
	 */
	void enterS_application_var(CiscoXrParser.S_application_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_application_var}.
	 * @param ctx the parse tree
	 */
	void exitS_application_var(CiscoXrParser.S_application_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_archive}.
	 * @param ctx the parse tree
	 */
	void enterS_archive(CiscoXrParser.S_archiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_archive}.
	 * @param ctx the parse tree
	 */
	void exitS_archive(CiscoXrParser.S_archiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_authentication}.
	 * @param ctx the parse tree
	 */
	void enterS_authentication(CiscoXrParser.S_authenticationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_authentication}.
	 * @param ctx the parse tree
	 */
	void exitS_authentication(CiscoXrParser.S_authenticationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_banner_ios}.
	 * @param ctx the parse tree
	 */
	void enterS_banner_ios(CiscoXrParser.S_banner_iosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_banner_ios}.
	 * @param ctx the parse tree
	 */
	void exitS_banner_ios(CiscoXrParser.S_banner_iosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ios_banner_header}.
	 * @param ctx the parse tree
	 */
	void enterIos_banner_header(CiscoXrParser.Ios_banner_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ios_banner_header}.
	 * @param ctx the parse tree
	 */
	void exitIos_banner_header(CiscoXrParser.Ios_banner_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_bfd}.
	 * @param ctx the parse tree
	 */
	void enterS_bfd(CiscoXrParser.S_bfdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_bfd}.
	 * @param ctx the parse tree
	 */
	void exitS_bfd(CiscoXrParser.S_bfdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_bfd_template}.
	 * @param ctx the parse tree
	 */
	void enterS_bfd_template(CiscoXrParser.S_bfd_templateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_bfd_template}.
	 * @param ctx the parse tree
	 */
	void exitS_bfd_template(CiscoXrParser.S_bfd_templateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_cluster}.
	 * @param ctx the parse tree
	 */
	void enterS_cluster(CiscoXrParser.S_clusterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_cluster}.
	 * @param ctx the parse tree
	 */
	void exitS_cluster(CiscoXrParser.S_clusterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_call_manager_fallback}.
	 * @param ctx the parse tree
	 */
	void enterS_call_manager_fallback(CiscoXrParser.S_call_manager_fallbackContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_call_manager_fallback}.
	 * @param ctx the parse tree
	 */
	void exitS_call_manager_fallback(CiscoXrParser.S_call_manager_fallbackContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_configure}.
	 * @param ctx the parse tree
	 */
	void enterS_configure(CiscoXrParser.S_configureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_configure}.
	 * @param ctx the parse tree
	 */
	void exitS_configure(CiscoXrParser.S_configureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_control_plane}.
	 * @param ctx the parse tree
	 */
	void enterS_control_plane(CiscoXrParser.S_control_planeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_control_plane}.
	 * @param ctx the parse tree
	 */
	void exitS_control_plane(CiscoXrParser.S_control_planeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_control_plane_tail}.
	 * @param ctx the parse tree
	 */
	void enterS_control_plane_tail(CiscoXrParser.S_control_plane_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_control_plane_tail}.
	 * @param ctx the parse tree
	 */
	void exitS_control_plane_tail(CiscoXrParser.S_control_plane_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_control_plane_security}.
	 * @param ctx the parse tree
	 */
	void enterS_control_plane_security(CiscoXrParser.S_control_plane_securityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_control_plane_security}.
	 * @param ctx the parse tree
	 */
	void exitS_control_plane_security(CiscoXrParser.S_control_plane_securityContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_cops}.
	 * @param ctx the parse tree
	 */
	void enterS_cops(CiscoXrParser.S_copsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_cops}.
	 * @param ctx the parse tree
	 */
	void exitS_cops(CiscoXrParser.S_copsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_cos_queue_group}.
	 * @param ctx the parse tree
	 */
	void enterS_cos_queue_group(CiscoXrParser.S_cos_queue_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_cos_queue_group}.
	 * @param ctx the parse tree
	 */
	void exitS_cos_queue_group(CiscoXrParser.S_cos_queue_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_ctl_file}.
	 * @param ctx the parse tree
	 */
	void enterS_ctl_file(CiscoXrParser.S_ctl_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_ctl_file}.
	 * @param ctx the parse tree
	 */
	void exitS_ctl_file(CiscoXrParser.S_ctl_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_daemon}.
	 * @param ctx the parse tree
	 */
	void enterS_daemon(CiscoXrParser.S_daemonContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_daemon}.
	 * @param ctx the parse tree
	 */
	void exitS_daemon(CiscoXrParser.S_daemonContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_dhcp}.
	 * @param ctx the parse tree
	 */
	void enterS_dhcp(CiscoXrParser.S_dhcpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_dhcp}.
	 * @param ctx the parse tree
	 */
	void exitS_dhcp(CiscoXrParser.S_dhcpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_dialer}.
	 * @param ctx the parse tree
	 */
	void enterS_dialer(CiscoXrParser.S_dialerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_dialer}.
	 * @param ctx the parse tree
	 */
	void exitS_dialer(CiscoXrParser.S_dialerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_dial_peer}.
	 * @param ctx the parse tree
	 */
	void enterS_dial_peer(CiscoXrParser.S_dial_peerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_dial_peer}.
	 * @param ctx the parse tree
	 */
	void exitS_dial_peer(CiscoXrParser.S_dial_peerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_domain}.
	 * @param ctx the parse tree
	 */
	void enterS_domain(CiscoXrParser.S_domainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_domain}.
	 * @param ctx the parse tree
	 */
	void exitS_domain(CiscoXrParser.S_domainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_domain_name}.
	 * @param ctx the parse tree
	 */
	void enterS_domain_name(CiscoXrParser.S_domain_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_domain_name}.
	 * @param ctx the parse tree
	 */
	void exitS_domain_name(CiscoXrParser.S_domain_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_dot11}.
	 * @param ctx the parse tree
	 */
	void enterS_dot11(CiscoXrParser.S_dot11Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_dot11}.
	 * @param ctx the parse tree
	 */
	void exitS_dot11(CiscoXrParser.S_dot11Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_dspfarm}.
	 * @param ctx the parse tree
	 */
	void enterS_dspfarm(CiscoXrParser.S_dspfarmContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_dspfarm}.
	 * @param ctx the parse tree
	 */
	void exitS_dspfarm(CiscoXrParser.S_dspfarmContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_dynamic_access_policy_record}.
	 * @param ctx the parse tree
	 */
	void enterS_dynamic_access_policy_record(CiscoXrParser.S_dynamic_access_policy_recordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_dynamic_access_policy_record}.
	 * @param ctx the parse tree
	 */
	void exitS_dynamic_access_policy_record(CiscoXrParser.S_dynamic_access_policy_recordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_enable}.
	 * @param ctx the parse tree
	 */
	void enterS_enable(CiscoXrParser.S_enableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_enable}.
	 * @param ctx the parse tree
	 */
	void exitS_enable(CiscoXrParser.S_enableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_ephone_dn_template}.
	 * @param ctx the parse tree
	 */
	void enterS_ephone_dn_template(CiscoXrParser.S_ephone_dn_templateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_ephone_dn_template}.
	 * @param ctx the parse tree
	 */
	void exitS_ephone_dn_template(CiscoXrParser.S_ephone_dn_templateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_event}.
	 * @param ctx the parse tree
	 */
	void enterS_event(CiscoXrParser.S_eventContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_event}.
	 * @param ctx the parse tree
	 */
	void exitS_event(CiscoXrParser.S_eventContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_event_handler}.
	 * @param ctx the parse tree
	 */
	void enterS_event_handler(CiscoXrParser.S_event_handlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_event_handler}.
	 * @param ctx the parse tree
	 */
	void exitS_event_handler(CiscoXrParser.S_event_handlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_failover}.
	 * @param ctx the parse tree
	 */
	void enterS_failover(CiscoXrParser.S_failoverContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_failover}.
	 * @param ctx the parse tree
	 */
	void exitS_failover(CiscoXrParser.S_failoverContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_failover_tail}.
	 * @param ctx the parse tree
	 */
	void enterS_failover_tail(CiscoXrParser.S_failover_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_failover_tail}.
	 * @param ctx the parse tree
	 */
	void exitS_failover_tail(CiscoXrParser.S_failover_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_flow}.
	 * @param ctx the parse tree
	 */
	void enterS_flow(CiscoXrParser.S_flowContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_flow}.
	 * @param ctx the parse tree
	 */
	void exitS_flow(CiscoXrParser.S_flowContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_flow_sampler_map}.
	 * @param ctx the parse tree
	 */
	void enterS_flow_sampler_map(CiscoXrParser.S_flow_sampler_mapContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_flow_sampler_map}.
	 * @param ctx the parse tree
	 */
	void exitS_flow_sampler_map(CiscoXrParser.S_flow_sampler_mapContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#fsm_mode}.
	 * @param ctx the parse tree
	 */
	void enterFsm_mode(CiscoXrParser.Fsm_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#fsm_mode}.
	 * @param ctx the parse tree
	 */
	void exitFsm_mode(CiscoXrParser.Fsm_modeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_gatekeeper}.
	 * @param ctx the parse tree
	 */
	void enterS_gatekeeper(CiscoXrParser.S_gatekeeperContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_gatekeeper}.
	 * @param ctx the parse tree
	 */
	void exitS_gatekeeper(CiscoXrParser.S_gatekeeperContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_global_port_security}.
	 * @param ctx the parse tree
	 */
	void enterS_global_port_security(CiscoXrParser.S_global_port_securityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_global_port_security}.
	 * @param ctx the parse tree
	 */
	void exitS_global_port_security(CiscoXrParser.S_global_port_securityContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_guest_access_email}.
	 * @param ctx the parse tree
	 */
	void enterS_guest_access_email(CiscoXrParser.S_guest_access_emailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_guest_access_email}.
	 * @param ctx the parse tree
	 */
	void exitS_guest_access_email(CiscoXrParser.S_guest_access_emailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_hardware}.
	 * @param ctx the parse tree
	 */
	void enterS_hardware(CiscoXrParser.S_hardwareContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_hardware}.
	 * @param ctx the parse tree
	 */
	void exitS_hardware(CiscoXrParser.S_hardwareContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_hostname}.
	 * @param ctx the parse tree
	 */
	void enterS_hostname(CiscoXrParser.S_hostnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_hostname}.
	 * @param ctx the parse tree
	 */
	void exitS_hostname(CiscoXrParser.S_hostnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_ids}.
	 * @param ctx the parse tree
	 */
	void enterS_ids(CiscoXrParser.S_idsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_ids}.
	 * @param ctx the parse tree
	 */
	void exitS_ids(CiscoXrParser.S_idsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_ifmap}.
	 * @param ctx the parse tree
	 */
	void enterS_ifmap(CiscoXrParser.S_ifmapContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_ifmap}.
	 * @param ctx the parse tree
	 */
	void exitS_ifmap(CiscoXrParser.S_ifmapContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_interface_line}.
	 * @param ctx the parse tree
	 */
	void enterS_interface_line(CiscoXrParser.S_interface_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_interface_line}.
	 * @param ctx the parse tree
	 */
	void exitS_interface_line(CiscoXrParser.S_interface_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_ip_default_gateway}.
	 * @param ctx the parse tree
	 */
	void enterS_ip_default_gateway(CiscoXrParser.S_ip_default_gatewayContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_ip_default_gateway}.
	 * @param ctx the parse tree
	 */
	void exitS_ip_default_gateway(CiscoXrParser.S_ip_default_gatewayContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_ip_dhcp}.
	 * @param ctx the parse tree
	 */
	void enterS_ip_dhcp(CiscoXrParser.S_ip_dhcpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_ip_dhcp}.
	 * @param ctx the parse tree
	 */
	void exitS_ip_dhcp(CiscoXrParser.S_ip_dhcpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_ip_domain}.
	 * @param ctx the parse tree
	 */
	void enterS_ip_domain(CiscoXrParser.S_ip_domainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_ip_domain}.
	 * @param ctx the parse tree
	 */
	void exitS_ip_domain(CiscoXrParser.S_ip_domainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_ip_domain_name}.
	 * @param ctx the parse tree
	 */
	void enterS_ip_domain_name(CiscoXrParser.S_ip_domain_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_ip_domain_name}.
	 * @param ctx the parse tree
	 */
	void exitS_ip_domain_name(CiscoXrParser.S_ip_domain_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_ip_name_server}.
	 * @param ctx the parse tree
	 */
	void enterS_ip_name_server(CiscoXrParser.S_ip_name_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_ip_name_server}.
	 * @param ctx the parse tree
	 */
	void exitS_ip_name_server(CiscoXrParser.S_ip_name_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_ip_nbar}.
	 * @param ctx the parse tree
	 */
	void enterS_ip_nbar(CiscoXrParser.S_ip_nbarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_ip_nbar}.
	 * @param ctx the parse tree
	 */
	void exitS_ip_nbar(CiscoXrParser.S_ip_nbarContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_ip_probe}.
	 * @param ctx the parse tree
	 */
	void enterS_ip_probe(CiscoXrParser.S_ip_probeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_ip_probe}.
	 * @param ctx the parse tree
	 */
	void exitS_ip_probe(CiscoXrParser.S_ip_probeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_ip_route_mos}.
	 * @param ctx the parse tree
	 */
	void enterS_ip_route_mos(CiscoXrParser.S_ip_route_mosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_ip_route_mos}.
	 * @param ctx the parse tree
	 */
	void exitS_ip_route_mos(CiscoXrParser.S_ip_route_mosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_ip_sla}.
	 * @param ctx the parse tree
	 */
	void enterS_ip_sla(CiscoXrParser.S_ip_slaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_ip_sla}.
	 * @param ctx the parse tree
	 */
	void exitS_ip_sla(CiscoXrParser.S_ip_slaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_ip_source_route}.
	 * @param ctx the parse tree
	 */
	void enterS_ip_source_route(CiscoXrParser.S_ip_source_routeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_ip_source_route}.
	 * @param ctx the parse tree
	 */
	void exitS_ip_source_route(CiscoXrParser.S_ip_source_routeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_ip_ssh}.
	 * @param ctx the parse tree
	 */
	void enterS_ip_ssh(CiscoXrParser.S_ip_sshContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_ip_ssh}.
	 * @param ctx the parse tree
	 */
	void exitS_ip_ssh(CiscoXrParser.S_ip_sshContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_ip_tacacs_source_interface}.
	 * @param ctx the parse tree
	 */
	void enterS_ip_tacacs_source_interface(CiscoXrParser.S_ip_tacacs_source_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_ip_tacacs_source_interface}.
	 * @param ctx the parse tree
	 */
	void exitS_ip_tacacs_source_interface(CiscoXrParser.S_ip_tacacs_source_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_ip_wccp}.
	 * @param ctx the parse tree
	 */
	void enterS_ip_wccp(CiscoXrParser.S_ip_wccpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_ip_wccp}.
	 * @param ctx the parse tree
	 */
	void exitS_ip_wccp(CiscoXrParser.S_ip_wccpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_ipc}.
	 * @param ctx the parse tree
	 */
	void enterS_ipc(CiscoXrParser.S_ipcContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_ipc}.
	 * @param ctx the parse tree
	 */
	void exitS_ipc(CiscoXrParser.S_ipcContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_ipsla}.
	 * @param ctx the parse tree
	 */
	void enterS_ipsla(CiscoXrParser.S_ipslaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_ipsla}.
	 * @param ctx the parse tree
	 */
	void exitS_ipsla(CiscoXrParser.S_ipslaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_l2}.
	 * @param ctx the parse tree
	 */
	void enterS_l2(CiscoXrParser.S_l2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_l2}.
	 * @param ctx the parse tree
	 */
	void exitS_l2(CiscoXrParser.S_l2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_l2tp_class}.
	 * @param ctx the parse tree
	 */
	void enterS_l2tp_class(CiscoXrParser.S_l2tp_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_l2tp_class}.
	 * @param ctx the parse tree
	 */
	void exitS_l2tp_class(CiscoXrParser.S_l2tp_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_l2vpn}.
	 * @param ctx the parse tree
	 */
	void enterS_l2vpn(CiscoXrParser.S_l2vpnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_l2vpn}.
	 * @param ctx the parse tree
	 */
	void exitS_l2vpn(CiscoXrParser.S_l2vpnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_license}.
	 * @param ctx the parse tree
	 */
	void enterS_license(CiscoXrParser.S_licenseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_license}.
	 * @param ctx the parse tree
	 */
	void exitS_license(CiscoXrParser.S_licenseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_lpts}.
	 * @param ctx the parse tree
	 */
	void enterS_lpts(CiscoXrParser.S_lptsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_lpts}.
	 * @param ctx the parse tree
	 */
	void exitS_lpts(CiscoXrParser.S_lptsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_management}.
	 * @param ctx the parse tree
	 */
	void enterS_management(CiscoXrParser.S_managementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_management}.
	 * @param ctx the parse tree
	 */
	void exitS_management(CiscoXrParser.S_managementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_map_class}.
	 * @param ctx the parse tree
	 */
	void enterS_map_class(CiscoXrParser.S_map_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_map_class}.
	 * @param ctx the parse tree
	 */
	void exitS_map_class(CiscoXrParser.S_map_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_media_termination}.
	 * @param ctx the parse tree
	 */
	void enterS_media_termination(CiscoXrParser.S_media_terminationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_media_termination}.
	 * @param ctx the parse tree
	 */
	void exitS_media_termination(CiscoXrParser.S_media_terminationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_monitor}.
	 * @param ctx the parse tree
	 */
	void enterS_monitor(CiscoXrParser.S_monitorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_monitor}.
	 * @param ctx the parse tree
	 */
	void exitS_monitor(CiscoXrParser.S_monitorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_monitor_session}.
	 * @param ctx the parse tree
	 */
	void enterS_monitor_session(CiscoXrParser.S_monitor_sessionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_monitor_session}.
	 * @param ctx the parse tree
	 */
	void exitS_monitor_session(CiscoXrParser.S_monitor_sessionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_name}.
	 * @param ctx the parse tree
	 */
	void enterS_name(CiscoXrParser.S_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_name}.
	 * @param ctx the parse tree
	 */
	void exitS_name(CiscoXrParser.S_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_no_bfd}.
	 * @param ctx the parse tree
	 */
	void enterS_no_bfd(CiscoXrParser.S_no_bfdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_no_bfd}.
	 * @param ctx the parse tree
	 */
	void exitS_no_bfd(CiscoXrParser.S_no_bfdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_no_enable}.
	 * @param ctx the parse tree
	 */
	void enterS_no_enable(CiscoXrParser.S_no_enableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_no_enable}.
	 * @param ctx the parse tree
	 */
	void exitS_no_enable(CiscoXrParser.S_no_enableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_nv}.
	 * @param ctx the parse tree
	 */
	void enterS_nv(CiscoXrParser.S_nvContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_nv}.
	 * @param ctx the parse tree
	 */
	void exitS_nv(CiscoXrParser.S_nvContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_openflow}.
	 * @param ctx the parse tree
	 */
	void enterS_openflow(CiscoXrParser.S_openflowContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_openflow}.
	 * @param ctx the parse tree
	 */
	void exitS_openflow(CiscoXrParser.S_openflowContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_passwd}.
	 * @param ctx the parse tree
	 */
	void enterS_passwd(CiscoXrParser.S_passwdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_passwd}.
	 * @param ctx the parse tree
	 */
	void exitS_passwd(CiscoXrParser.S_passwdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_phone_proxy}.
	 * @param ctx the parse tree
	 */
	void enterS_phone_proxy(CiscoXrParser.S_phone_proxyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_phone_proxy}.
	 * @param ctx the parse tree
	 */
	void exitS_phone_proxy(CiscoXrParser.S_phone_proxyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_privilege}.
	 * @param ctx the parse tree
	 */
	void enterS_privilege(CiscoXrParser.S_privilegeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_privilege}.
	 * @param ctx the parse tree
	 */
	void exitS_privilege(CiscoXrParser.S_privilegeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_process_max_time}.
	 * @param ctx the parse tree
	 */
	void enterS_process_max_time(CiscoXrParser.S_process_max_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_process_max_time}.
	 * @param ctx the parse tree
	 */
	void exitS_process_max_time(CiscoXrParser.S_process_max_timeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_queue_monitor}.
	 * @param ctx the parse tree
	 */
	void enterS_queue_monitor(CiscoXrParser.S_queue_monitorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_queue_monitor}.
	 * @param ctx the parse tree
	 */
	void exitS_queue_monitor(CiscoXrParser.S_queue_monitorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_radius_server}.
	 * @param ctx the parse tree
	 */
	void enterS_radius_server(CiscoXrParser.S_radius_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_radius_server}.
	 * @param ctx the parse tree
	 */
	void exitS_radius_server(CiscoXrParser.S_radius_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_redundancy}.
	 * @param ctx the parse tree
	 */
	void enterS_redundancy(CiscoXrParser.S_redundancyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_redundancy}.
	 * @param ctx the parse tree
	 */
	void exitS_redundancy(CiscoXrParser.S_redundancyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_rf}.
	 * @param ctx the parse tree
	 */
	void enterS_rf(CiscoXrParser.S_rfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_rf}.
	 * @param ctx the parse tree
	 */
	void exitS_rf(CiscoXrParser.S_rfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_role}.
	 * @param ctx the parse tree
	 */
	void enterS_role(CiscoXrParser.S_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_role}.
	 * @param ctx the parse tree
	 */
	void exitS_role(CiscoXrParser.S_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_route}.
	 * @param ctx the parse tree
	 */
	void enterS_route(CiscoXrParser.S_routeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_route}.
	 * @param ctx the parse tree
	 */
	void exitS_route(CiscoXrParser.S_routeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_router_vrrp}.
	 * @param ctx the parse tree
	 */
	void enterS_router_vrrp(CiscoXrParser.S_router_vrrpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_router_vrrp}.
	 * @param ctx the parse tree
	 */
	void exitS_router_vrrp(CiscoXrParser.S_router_vrrpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_sccp}.
	 * @param ctx the parse tree
	 */
	void enterS_sccp(CiscoXrParser.S_sccpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_sccp}.
	 * @param ctx the parse tree
	 */
	void exitS_sccp(CiscoXrParser.S_sccpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_service}.
	 * @param ctx the parse tree
	 */
	void enterS_service(CiscoXrParser.S_serviceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_service}.
	 * @param ctx the parse tree
	 */
	void exitS_service(CiscoXrParser.S_serviceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_service_policy_global}.
	 * @param ctx the parse tree
	 */
	void enterS_service_policy_global(CiscoXrParser.S_service_policy_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_service_policy_global}.
	 * @param ctx the parse tree
	 */
	void exitS_service_policy_global(CiscoXrParser.S_service_policy_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_sip_ua}.
	 * @param ctx the parse tree
	 */
	void enterS_sip_ua(CiscoXrParser.S_sip_uaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_sip_ua}.
	 * @param ctx the parse tree
	 */
	void exitS_sip_ua(CiscoXrParser.S_sip_uaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_sntp}.
	 * @param ctx the parse tree
	 */
	void enterS_sntp(CiscoXrParser.S_sntpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_sntp}.
	 * @param ctx the parse tree
	 */
	void exitS_sntp(CiscoXrParser.S_sntpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_spanning_tree}.
	 * @param ctx the parse tree
	 */
	void enterS_spanning_tree(CiscoXrParser.S_spanning_treeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_spanning_tree}.
	 * @param ctx the parse tree
	 */
	void exitS_spanning_tree(CiscoXrParser.S_spanning_treeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_ssh}.
	 * @param ctx the parse tree
	 */
	void enterS_ssh(CiscoXrParser.S_sshContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_ssh}.
	 * @param ctx the parse tree
	 */
	void exitS_ssh(CiscoXrParser.S_sshContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_statistics}.
	 * @param ctx the parse tree
	 */
	void enterS_statistics(CiscoXrParser.S_statisticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_statistics}.
	 * @param ctx the parse tree
	 */
	void exitS_statistics(CiscoXrParser.S_statisticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_stcapp}.
	 * @param ctx the parse tree
	 */
	void enterS_stcapp(CiscoXrParser.S_stcappContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_stcapp}.
	 * @param ctx the parse tree
	 */
	void exitS_stcapp(CiscoXrParser.S_stcappContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_switchport}.
	 * @param ctx the parse tree
	 */
	void enterS_switchport(CiscoXrParser.S_switchportContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_switchport}.
	 * @param ctx the parse tree
	 */
	void exitS_switchport(CiscoXrParser.S_switchportContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_system}.
	 * @param ctx the parse tree
	 */
	void enterS_system(CiscoXrParser.S_systemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_system}.
	 * @param ctx the parse tree
	 */
	void exitS_system(CiscoXrParser.S_systemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_system_inner}.
	 * @param ctx the parse tree
	 */
	void enterS_system_inner(CiscoXrParser.S_system_innerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_system_inner}.
	 * @param ctx the parse tree
	 */
	void exitS_system_inner(CiscoXrParser.S_system_innerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_system_service_policy}.
	 * @param ctx the parse tree
	 */
	void enterS_system_service_policy(CiscoXrParser.S_system_service_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_system_service_policy}.
	 * @param ctx the parse tree
	 */
	void exitS_system_service_policy(CiscoXrParser.S_system_service_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_tacacs}.
	 * @param ctx the parse tree
	 */
	void enterS_tacacs(CiscoXrParser.S_tacacsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_tacacs}.
	 * @param ctx the parse tree
	 */
	void exitS_tacacs(CiscoXrParser.S_tacacsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_tacacs_server}.
	 * @param ctx the parse tree
	 */
	void enterS_tacacs_server(CiscoXrParser.S_tacacs_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_tacacs_server}.
	 * @param ctx the parse tree
	 */
	void exitS_tacacs_server(CiscoXrParser.S_tacacs_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_tap}.
	 * @param ctx the parse tree
	 */
	void enterS_tap(CiscoXrParser.S_tapContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_tap}.
	 * @param ctx the parse tree
	 */
	void exitS_tap(CiscoXrParser.S_tapContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_telephony_service}.
	 * @param ctx the parse tree
	 */
	void enterS_telephony_service(CiscoXrParser.S_telephony_serviceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_telephony_service}.
	 * @param ctx the parse tree
	 */
	void exitS_telephony_service(CiscoXrParser.S_telephony_serviceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_template}.
	 * @param ctx the parse tree
	 */
	void enterS_template(CiscoXrParser.S_templateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_template}.
	 * @param ctx the parse tree
	 */
	void exitS_template(CiscoXrParser.S_templateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_time_range}.
	 * @param ctx the parse tree
	 */
	void enterS_time_range(CiscoXrParser.S_time_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_time_range}.
	 * @param ctx the parse tree
	 */
	void exitS_time_range(CiscoXrParser.S_time_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_track}.
	 * @param ctx the parse tree
	 */
	void enterS_track(CiscoXrParser.S_trackContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_track}.
	 * @param ctx the parse tree
	 */
	void exitS_track(CiscoXrParser.S_trackContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_tunnel_group}.
	 * @param ctx the parse tree
	 */
	void enterS_tunnel_group(CiscoXrParser.S_tunnel_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_tunnel_group}.
	 * @param ctx the parse tree
	 */
	void exitS_tunnel_group(CiscoXrParser.S_tunnel_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_user_role}.
	 * @param ctx the parse tree
	 */
	void enterS_user_role(CiscoXrParser.S_user_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_user_role}.
	 * @param ctx the parse tree
	 */
	void exitS_user_role(CiscoXrParser.S_user_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_username}.
	 * @param ctx the parse tree
	 */
	void enterS_username(CiscoXrParser.S_usernameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_username}.
	 * @param ctx the parse tree
	 */
	void exitS_username(CiscoXrParser.S_usernameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_username_attributes}.
	 * @param ctx the parse tree
	 */
	void enterS_username_attributes(CiscoXrParser.S_username_attributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_username_attributes}.
	 * @param ctx the parse tree
	 */
	void exitS_username_attributes(CiscoXrParser.S_username_attributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_vlan_cisco}.
	 * @param ctx the parse tree
	 */
	void enterS_vlan_cisco(CiscoXrParser.S_vlan_ciscoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_vlan_cisco}.
	 * @param ctx the parse tree
	 */
	void exitS_vlan_cisco(CiscoXrParser.S_vlan_ciscoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_vlan_internal_cisco}.
	 * @param ctx the parse tree
	 */
	void enterS_vlan_internal_cisco(CiscoXrParser.S_vlan_internal_ciscoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_vlan_internal_cisco}.
	 * @param ctx the parse tree
	 */
	void exitS_vlan_internal_cisco(CiscoXrParser.S_vlan_internal_ciscoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_vlan_name}.
	 * @param ctx the parse tree
	 */
	void enterS_vlan_name(CiscoXrParser.S_vlan_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_vlan_name}.
	 * @param ctx the parse tree
	 */
	void exitS_vlan_name(CiscoXrParser.S_vlan_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_voice}.
	 * @param ctx the parse tree
	 */
	void enterS_voice(CiscoXrParser.S_voiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_voice}.
	 * @param ctx the parse tree
	 */
	void exitS_voice(CiscoXrParser.S_voiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_voice_card}.
	 * @param ctx the parse tree
	 */
	void enterS_voice_card(CiscoXrParser.S_voice_cardContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_voice_card}.
	 * @param ctx the parse tree
	 */
	void exitS_voice_card(CiscoXrParser.S_voice_cardContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_voice_port}.
	 * @param ctx the parse tree
	 */
	void enterS_voice_port(CiscoXrParser.S_voice_portContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_voice_port}.
	 * @param ctx the parse tree
	 */
	void exitS_voice_port(CiscoXrParser.S_voice_portContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_vpc}.
	 * @param ctx the parse tree
	 */
	void enterS_vpc(CiscoXrParser.S_vpcContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_vpc}.
	 * @param ctx the parse tree
	 */
	void exitS_vpc(CiscoXrParser.S_vpcContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_vpdn_group}.
	 * @param ctx the parse tree
	 */
	void enterS_vpdn_group(CiscoXrParser.S_vpdn_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_vpdn_group}.
	 * @param ctx the parse tree
	 */
	void exitS_vpdn_group(CiscoXrParser.S_vpdn_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_vpn}.
	 * @param ctx the parse tree
	 */
	void enterS_vpn(CiscoXrParser.S_vpnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_vpn}.
	 * @param ctx the parse tree
	 */
	void exitS_vpn(CiscoXrParser.S_vpnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_vpn_dialer}.
	 * @param ctx the parse tree
	 */
	void enterS_vpn_dialer(CiscoXrParser.S_vpn_dialerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_vpn_dialer}.
	 * @param ctx the parse tree
	 */
	void exitS_vpn_dialer(CiscoXrParser.S_vpn_dialerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_vrf_definition}.
	 * @param ctx the parse tree
	 */
	void enterS_vrf_definition(CiscoXrParser.S_vrf_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_vrf_definition}.
	 * @param ctx the parse tree
	 */
	void exitS_vrf_definition(CiscoXrParser.S_vrf_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_web_server}.
	 * @param ctx the parse tree
	 */
	void enterS_web_server(CiscoXrParser.S_web_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_web_server}.
	 * @param ctx the parse tree
	 */
	void exitS_web_server(CiscoXrParser.S_web_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_webvpn}.
	 * @param ctx the parse tree
	 */
	void enterS_webvpn(CiscoXrParser.S_webvpnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_webvpn}.
	 * @param ctx the parse tree
	 */
	void exitS_webvpn(CiscoXrParser.S_webvpnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_wlan}.
	 * @param ctx the parse tree
	 */
	void enterS_wlan(CiscoXrParser.S_wlanContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_wlan}.
	 * @param ctx the parse tree
	 */
	void exitS_wlan(CiscoXrParser.S_wlanContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_wsma}.
	 * @param ctx the parse tree
	 */
	void enterS_wsma(CiscoXrParser.S_wsmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_wsma}.
	 * @param ctx the parse tree
	 */
	void exitS_wsma(CiscoXrParser.S_wsmaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_xconnect_logging}.
	 * @param ctx the parse tree
	 */
	void enterS_xconnect_logging(CiscoXrParser.S_xconnect_loggingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_xconnect_logging}.
	 * @param ctx the parse tree
	 */
	void exitS_xconnect_logging(CiscoXrParser.S_xconnect_loggingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#sccp_null}.
	 * @param ctx the parse tree
	 */
	void enterSccp_null(CiscoXrParser.Sccp_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#sccp_null}.
	 * @param ctx the parse tree
	 */
	void exitSccp_null(CiscoXrParser.Sccp_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#sd_null}.
	 * @param ctx the parse tree
	 */
	void enterSd_null(CiscoXrParser.Sd_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#sd_null}.
	 * @param ctx the parse tree
	 */
	void exitSd_null(CiscoXrParser.Sd_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#sd_switchport}.
	 * @param ctx the parse tree
	 */
	void enterSd_switchport(CiscoXrParser.Sd_switchportContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#sd_switchport}.
	 * @param ctx the parse tree
	 */
	void exitSd_switchport(CiscoXrParser.Sd_switchportContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#sd_switchport_blank}.
	 * @param ctx the parse tree
	 */
	void enterSd_switchport_blank(CiscoXrParser.Sd_switchport_blankContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#sd_switchport_blank}.
	 * @param ctx the parse tree
	 */
	void exitSd_switchport_blank(CiscoXrParser.Sd_switchport_blankContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#sd_switchport_null}.
	 * @param ctx the parse tree
	 */
	void enterSd_switchport_null(CiscoXrParser.Sd_switchport_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#sd_switchport_null}.
	 * @param ctx the parse tree
	 */
	void exitSd_switchport_null(CiscoXrParser.Sd_switchport_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#sd_switchport_shutdown}.
	 * @param ctx the parse tree
	 */
	void enterSd_switchport_shutdown(CiscoXrParser.Sd_switchport_shutdownContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#sd_switchport_shutdown}.
	 * @param ctx the parse tree
	 */
	void exitSd_switchport_shutdown(CiscoXrParser.Sd_switchport_shutdownContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#sip_ua_null}.
	 * @param ctx the parse tree
	 */
	void enterSip_ua_null(CiscoXrParser.Sip_ua_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#sip_ua_null}.
	 * @param ctx the parse tree
	 */
	void exitSip_ua_null(CiscoXrParser.Sip_ua_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#sntp_server}.
	 * @param ctx the parse tree
	 */
	void enterSntp_server(CiscoXrParser.Sntp_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#sntp_server}.
	 * @param ctx the parse tree
	 */
	void exitSntp_server(CiscoXrParser.Sntp_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#spanning_tree_mst}.
	 * @param ctx the parse tree
	 */
	void enterSpanning_tree_mst(CiscoXrParser.Spanning_tree_mstContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#spanning_tree_mst}.
	 * @param ctx the parse tree
	 */
	void exitSpanning_tree_mst(CiscoXrParser.Spanning_tree_mstContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#spanning_tree_mst_null}.
	 * @param ctx the parse tree
	 */
	void enterSpanning_tree_mst_null(CiscoXrParser.Spanning_tree_mst_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#spanning_tree_mst_null}.
	 * @param ctx the parse tree
	 */
	void exitSpanning_tree_mst_null(CiscoXrParser.Spanning_tree_mst_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#spanning_tree_portfast}.
	 * @param ctx the parse tree
	 */
	void enterSpanning_tree_portfast(CiscoXrParser.Spanning_tree_portfastContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#spanning_tree_portfast}.
	 * @param ctx the parse tree
	 */
	void exitSpanning_tree_portfast(CiscoXrParser.Spanning_tree_portfastContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#spanning_tree_pseudo_information}.
	 * @param ctx the parse tree
	 */
	void enterSpanning_tree_pseudo_information(CiscoXrParser.Spanning_tree_pseudo_informationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#spanning_tree_pseudo_information}.
	 * @param ctx the parse tree
	 */
	void exitSpanning_tree_pseudo_information(CiscoXrParser.Spanning_tree_pseudo_informationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#spanning_tree_null}.
	 * @param ctx the parse tree
	 */
	void enterSpanning_tree_null(CiscoXrParser.Spanning_tree_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#spanning_tree_null}.
	 * @param ctx the parse tree
	 */
	void exitSpanning_tree_null(CiscoXrParser.Spanning_tree_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#spti_null}.
	 * @param ctx the parse tree
	 */
	void enterSpti_null(CiscoXrParser.Spti_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#spti_null}.
	 * @param ctx the parse tree
	 */
	void exitSpti_null(CiscoXrParser.Spti_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#srlg_interface_numeric_stanza}.
	 * @param ctx the parse tree
	 */
	void enterSrlg_interface_numeric_stanza(CiscoXrParser.Srlg_interface_numeric_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#srlg_interface_numeric_stanza}.
	 * @param ctx the parse tree
	 */
	void exitSrlg_interface_numeric_stanza(CiscoXrParser.Srlg_interface_numeric_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#srlg_interface_stanza}.
	 * @param ctx the parse tree
	 */
	void enterSrlg_interface_stanza(CiscoXrParser.Srlg_interface_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#srlg_interface_stanza}.
	 * @param ctx the parse tree
	 */
	void exitSrlg_interface_stanza(CiscoXrParser.Srlg_interface_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#srlg_stanza}.
	 * @param ctx the parse tree
	 */
	void enterSrlg_stanza(CiscoXrParser.Srlg_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#srlg_stanza}.
	 * @param ctx the parse tree
	 */
	void exitSrlg_stanza(CiscoXrParser.Srlg_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ssh_access_group}.
	 * @param ctx the parse tree
	 */
	void enterSsh_access_group(CiscoXrParser.Ssh_access_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ssh_access_group}.
	 * @param ctx the parse tree
	 */
	void exitSsh_access_group(CiscoXrParser.Ssh_access_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ssh_client}.
	 * @param ctx the parse tree
	 */
	void enterSsh_client(CiscoXrParser.Ssh_clientContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ssh_client}.
	 * @param ctx the parse tree
	 */
	void exitSsh_client(CiscoXrParser.Ssh_clientContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ssh_null}.
	 * @param ctx the parse tree
	 */
	void enterSsh_null(CiscoXrParser.Ssh_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ssh_null}.
	 * @param ctx the parse tree
	 */
	void exitSsh_null(CiscoXrParser.Ssh_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ssh_server}.
	 * @param ctx the parse tree
	 */
	void enterSsh_server(CiscoXrParser.Ssh_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ssh_server}.
	 * @param ctx the parse tree
	 */
	void exitSsh_server(CiscoXrParser.Ssh_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ssh_timeout}.
	 * @param ctx the parse tree
	 */
	void enterSsh_timeout(CiscoXrParser.Ssh_timeoutContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ssh_timeout}.
	 * @param ctx the parse tree
	 */
	void exitSsh_timeout(CiscoXrParser.Ssh_timeoutContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#stanza}.
	 * @param ctx the parse tree
	 */
	void enterStanza(CiscoXrParser.StanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#stanza}.
	 * @param ctx the parse tree
	 */
	void exitStanza(CiscoXrParser.StanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#statistics_null}.
	 * @param ctx the parse tree
	 */
	void enterStatistics_null(CiscoXrParser.Statistics_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#statistics_null}.
	 * @param ctx the parse tree
	 */
	void exitStatistics_null(CiscoXrParser.Statistics_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#switching_mode_stanza}.
	 * @param ctx the parse tree
	 */
	void enterSwitching_mode_stanza(CiscoXrParser.Switching_mode_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#switching_mode_stanza}.
	 * @param ctx the parse tree
	 */
	void exitSwitching_mode_stanza(CiscoXrParser.Switching_mode_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#system_default}.
	 * @param ctx the parse tree
	 */
	void enterSystem_default(CiscoXrParser.System_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#system_default}.
	 * @param ctx the parse tree
	 */
	void exitSystem_default(CiscoXrParser.System_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#system_null}.
	 * @param ctx the parse tree
	 */
	void enterSystem_null(CiscoXrParser.System_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#system_null}.
	 * @param ctx the parse tree
	 */
	void exitSystem_null(CiscoXrParser.System_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#system_qos}.
	 * @param ctx the parse tree
	 */
	void enterSystem_qos(CiscoXrParser.System_qosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#system_qos}.
	 * @param ctx the parse tree
	 */
	void exitSystem_qos(CiscoXrParser.System_qosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#system_qos_null}.
	 * @param ctx the parse tree
	 */
	void enterSystem_qos_null(CiscoXrParser.System_qos_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#system_qos_null}.
	 * @param ctx the parse tree
	 */
	void exitSystem_qos_null(CiscoXrParser.System_qos_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#t_null}.
	 * @param ctx the parse tree
	 */
	void enterT_null(CiscoXrParser.T_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#t_null}.
	 * @param ctx the parse tree
	 */
	void exitT_null(CiscoXrParser.T_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#t_server}.
	 * @param ctx the parse tree
	 */
	void enterT_server(CiscoXrParser.T_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#t_server}.
	 * @param ctx the parse tree
	 */
	void exitT_server(CiscoXrParser.T_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#t_server_address}.
	 * @param ctx the parse tree
	 */
	void enterT_server_address(CiscoXrParser.T_server_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#t_server_address}.
	 * @param ctx the parse tree
	 */
	void exitT_server_address(CiscoXrParser.T_server_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#t_server_null}.
	 * @param ctx the parse tree
	 */
	void enterT_server_null(CiscoXrParser.T_server_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#t_server_null}.
	 * @param ctx the parse tree
	 */
	void exitT_server_null(CiscoXrParser.T_server_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#t_key}.
	 * @param ctx the parse tree
	 */
	void enterT_key(CiscoXrParser.T_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#t_key}.
	 * @param ctx the parse tree
	 */
	void exitT_key(CiscoXrParser.T_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#t_source_interface}.
	 * @param ctx the parse tree
	 */
	void enterT_source_interface(CiscoXrParser.T_source_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#t_source_interface}.
	 * @param ctx the parse tree
	 */
	void exitT_source_interface(CiscoXrParser.T_source_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#tap_null}.
	 * @param ctx the parse tree
	 */
	void enterTap_null(CiscoXrParser.Tap_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#tap_null}.
	 * @param ctx the parse tree
	 */
	void exitTap_null(CiscoXrParser.Tap_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#telephony_service_null}.
	 * @param ctx the parse tree
	 */
	void enterTelephony_service_null(CiscoXrParser.Telephony_service_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#telephony_service_null}.
	 * @param ctx the parse tree
	 */
	void exitTelephony_service_null(CiscoXrParser.Telephony_service_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#template_null}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_null(CiscoXrParser.Template_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#template_null}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_null(CiscoXrParser.Template_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#tg_null}.
	 * @param ctx the parse tree
	 */
	void enterTg_null(CiscoXrParser.Tg_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#tg_null}.
	 * @param ctx the parse tree
	 */
	void exitTg_null(CiscoXrParser.Tg_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#tr_null}.
	 * @param ctx the parse tree
	 */
	void enterTr_null(CiscoXrParser.Tr_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#tr_null}.
	 * @param ctx the parse tree
	 */
	void exitTr_null(CiscoXrParser.Tr_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#track_block}.
	 * @param ctx the parse tree
	 */
	void enterTrack_block(CiscoXrParser.Track_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#track_block}.
	 * @param ctx the parse tree
	 */
	void exitTrack_block(CiscoXrParser.Track_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#track_block_null}.
	 * @param ctx the parse tree
	 */
	void enterTrack_block_null(CiscoXrParser.Track_block_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#track_block_null}.
	 * @param ctx the parse tree
	 */
	void exitTrack_block_null(CiscoXrParser.Track_block_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#track_block_type_null}.
	 * @param ctx the parse tree
	 */
	void enterTrack_block_type_null(CiscoXrParser.Track_block_type_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#track_block_type_null}.
	 * @param ctx the parse tree
	 */
	void exitTrack_block_type_null(CiscoXrParser.Track_block_type_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#track_interface}.
	 * @param ctx the parse tree
	 */
	void enterTrack_interface(CiscoXrParser.Track_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#track_interface}.
	 * @param ctx the parse tree
	 */
	void exitTrack_interface(CiscoXrParser.Track_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#track_list}.
	 * @param ctx the parse tree
	 */
	void enterTrack_list(CiscoXrParser.Track_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#track_list}.
	 * @param ctx the parse tree
	 */
	void exitTrack_list(CiscoXrParser.Track_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#track_list_null}.
	 * @param ctx the parse tree
	 */
	void enterTrack_list_null(CiscoXrParser.Track_list_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#track_list_null}.
	 * @param ctx the parse tree
	 */
	void exitTrack_list_null(CiscoXrParser.Track_list_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ts_common}.
	 * @param ctx the parse tree
	 */
	void enterTs_common(CiscoXrParser.Ts_commonContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ts_common}.
	 * @param ctx the parse tree
	 */
	void exitTs_common(CiscoXrParser.Ts_commonContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ts_host}.
	 * @param ctx the parse tree
	 */
	void enterTs_host(CiscoXrParser.Ts_hostContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ts_host}.
	 * @param ctx the parse tree
	 */
	void exitTs_host(CiscoXrParser.Ts_hostContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ts_null}.
	 * @param ctx the parse tree
	 */
	void enterTs_null(CiscoXrParser.Ts_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ts_null}.
	 * @param ctx the parse tree
	 */
	void exitTs_null(CiscoXrParser.Ts_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#vi_address_family}.
	 * @param ctx the parse tree
	 */
	void enterVi_address_family(CiscoXrParser.Vi_address_familyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#vi_address_family}.
	 * @param ctx the parse tree
	 */
	void exitVi_address_family(CiscoXrParser.Vi_address_familyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#u}.
	 * @param ctx the parse tree
	 */
	void enterU(CiscoXrParser.UContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#u}.
	 * @param ctx the parse tree
	 */
	void exitU(CiscoXrParser.UContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#u_encrypted_password}.
	 * @param ctx the parse tree
	 */
	void enterU_encrypted_password(CiscoXrParser.U_encrypted_passwordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#u_encrypted_password}.
	 * @param ctx the parse tree
	 */
	void exitU_encrypted_password(CiscoXrParser.U_encrypted_passwordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#u_nohangup}.
	 * @param ctx the parse tree
	 */
	void enterU_nohangup(CiscoXrParser.U_nohangupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#u_nohangup}.
	 * @param ctx the parse tree
	 */
	void exitU_nohangup(CiscoXrParser.U_nohangupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#u_passphrase}.
	 * @param ctx the parse tree
	 */
	void enterU_passphrase(CiscoXrParser.U_passphraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#u_passphrase}.
	 * @param ctx the parse tree
	 */
	void exitU_passphrase(CiscoXrParser.U_passphraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#u_password}.
	 * @param ctx the parse tree
	 */
	void enterU_password(CiscoXrParser.U_passwordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#u_password}.
	 * @param ctx the parse tree
	 */
	void exitU_password(CiscoXrParser.U_passwordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#u_privilege}.
	 * @param ctx the parse tree
	 */
	void enterU_privilege(CiscoXrParser.U_privilegeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#u_privilege}.
	 * @param ctx the parse tree
	 */
	void exitU_privilege(CiscoXrParser.U_privilegeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#u_role}.
	 * @param ctx the parse tree
	 */
	void enterU_role(CiscoXrParser.U_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#u_role}.
	 * @param ctx the parse tree
	 */
	void exitU_role(CiscoXrParser.U_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ua_null}.
	 * @param ctx the parse tree
	 */
	void enterUa_null(CiscoXrParser.Ua_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ua_null}.
	 * @param ctx the parse tree
	 */
	void exitUa_null(CiscoXrParser.Ua_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#up_cisco_xr}.
	 * @param ctx the parse tree
	 */
	void enterUp_cisco_xr(CiscoXrParser.Up_cisco_xrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#up_cisco_xr}.
	 * @param ctx the parse tree
	 */
	void exitUp_cisco_xr(CiscoXrParser.Up_cisco_xrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#up_cisco_xr_tail}.
	 * @param ctx the parse tree
	 */
	void enterUp_cisco_xr_tail(CiscoXrParser.Up_cisco_xr_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#up_cisco_xr_tail}.
	 * @param ctx the parse tree
	 */
	void exitUp_cisco_xr_tail(CiscoXrParser.Up_cisco_xr_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ur_access_list}.
	 * @param ctx the parse tree
	 */
	void enterUr_access_list(CiscoXrParser.Ur_access_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ur_access_list}.
	 * @param ctx the parse tree
	 */
	void exitUr_access_list(CiscoXrParser.Ur_access_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ur_null}.
	 * @param ctx the parse tree
	 */
	void enterUr_null(CiscoXrParser.Ur_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ur_null}.
	 * @param ctx the parse tree
	 */
	void exitUr_null(CiscoXrParser.Ur_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#vc_null}.
	 * @param ctx the parse tree
	 */
	void enterVc_null(CiscoXrParser.Vc_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#vc_null}.
	 * @param ctx the parse tree
	 */
	void exitVc_null(CiscoXrParser.Vc_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#viaf_vrrp}.
	 * @param ctx the parse tree
	 */
	void enterViaf_vrrp(CiscoXrParser.Viaf_vrrpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#viaf_vrrp}.
	 * @param ctx the parse tree
	 */
	void exitViaf_vrrp(CiscoXrParser.Viaf_vrrpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#viafv_address}.
	 * @param ctx the parse tree
	 */
	void enterViafv_address(CiscoXrParser.Viafv_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#viafv_address}.
	 * @param ctx the parse tree
	 */
	void exitViafv_address(CiscoXrParser.Viafv_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#viafv_null}.
	 * @param ctx the parse tree
	 */
	void enterViafv_null(CiscoXrParser.Viafv_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#viafv_null}.
	 * @param ctx the parse tree
	 */
	void exitViafv_null(CiscoXrParser.Viafv_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#viafv_preempt}.
	 * @param ctx the parse tree
	 */
	void enterViafv_preempt(CiscoXrParser.Viafv_preemptContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#viafv_preempt}.
	 * @param ctx the parse tree
	 */
	void exitViafv_preempt(CiscoXrParser.Viafv_preemptContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#viafv_priority}.
	 * @param ctx the parse tree
	 */
	void enterViafv_priority(CiscoXrParser.Viafv_priorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#viafv_priority}.
	 * @param ctx the parse tree
	 */
	void exitViafv_priority(CiscoXrParser.Viafv_priorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#vlan_vn_segment}.
	 * @param ctx the parse tree
	 */
	void enterVlan_vn_segment(CiscoXrParser.Vlan_vn_segmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#vlan_vn_segment}.
	 * @param ctx the parse tree
	 */
	void exitVlan_vn_segment(CiscoXrParser.Vlan_vn_segmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#vlan_null}.
	 * @param ctx the parse tree
	 */
	void enterVlan_null(CiscoXrParser.Vlan_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#vlan_null}.
	 * @param ctx the parse tree
	 */
	void exitVlan_null(CiscoXrParser.Vlan_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#voice_class}.
	 * @param ctx the parse tree
	 */
	void enterVoice_class(CiscoXrParser.Voice_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#voice_class}.
	 * @param ctx the parse tree
	 */
	void exitVoice_class(CiscoXrParser.Voice_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#voice_class_codec}.
	 * @param ctx the parse tree
	 */
	void enterVoice_class_codec(CiscoXrParser.Voice_class_codecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#voice_class_codec}.
	 * @param ctx the parse tree
	 */
	void exitVoice_class_codec(CiscoXrParser.Voice_class_codecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#voice_class_codec_null}.
	 * @param ctx the parse tree
	 */
	void enterVoice_class_codec_null(CiscoXrParser.Voice_class_codec_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#voice_class_codec_null}.
	 * @param ctx the parse tree
	 */
	void exitVoice_class_codec_null(CiscoXrParser.Voice_class_codec_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#voice_class_dpg}.
	 * @param ctx the parse tree
	 */
	void enterVoice_class_dpg(CiscoXrParser.Voice_class_dpgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#voice_class_dpg}.
	 * @param ctx the parse tree
	 */
	void exitVoice_class_dpg(CiscoXrParser.Voice_class_dpgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#voice_class_dpg_null}.
	 * @param ctx the parse tree
	 */
	void enterVoice_class_dpg_null(CiscoXrParser.Voice_class_dpg_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#voice_class_dpg_null}.
	 * @param ctx the parse tree
	 */
	void exitVoice_class_dpg_null(CiscoXrParser.Voice_class_dpg_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#voice_class_e164}.
	 * @param ctx the parse tree
	 */
	void enterVoice_class_e164(CiscoXrParser.Voice_class_e164Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#voice_class_e164}.
	 * @param ctx the parse tree
	 */
	void exitVoice_class_e164(CiscoXrParser.Voice_class_e164Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#voice_class_e164_null}.
	 * @param ctx the parse tree
	 */
	void enterVoice_class_e164_null(CiscoXrParser.Voice_class_e164_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#voice_class_e164_null}.
	 * @param ctx the parse tree
	 */
	void exitVoice_class_e164_null(CiscoXrParser.Voice_class_e164_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#voice_class_h323}.
	 * @param ctx the parse tree
	 */
	void enterVoice_class_h323(CiscoXrParser.Voice_class_h323Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#voice_class_h323}.
	 * @param ctx the parse tree
	 */
	void exitVoice_class_h323(CiscoXrParser.Voice_class_h323Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#voice_class_h323_null}.
	 * @param ctx the parse tree
	 */
	void enterVoice_class_h323_null(CiscoXrParser.Voice_class_h323_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#voice_class_h323_null}.
	 * @param ctx the parse tree
	 */
	void exitVoice_class_h323_null(CiscoXrParser.Voice_class_h323_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#voice_class_server_group}.
	 * @param ctx the parse tree
	 */
	void enterVoice_class_server_group(CiscoXrParser.Voice_class_server_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#voice_class_server_group}.
	 * @param ctx the parse tree
	 */
	void exitVoice_class_server_group(CiscoXrParser.Voice_class_server_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#voice_class_server_group_null}.
	 * @param ctx the parse tree
	 */
	void enterVoice_class_server_group_null(CiscoXrParser.Voice_class_server_group_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#voice_class_server_group_null}.
	 * @param ctx the parse tree
	 */
	void exitVoice_class_server_group_null(CiscoXrParser.Voice_class_server_group_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#voice_class_sip_profiles}.
	 * @param ctx the parse tree
	 */
	void enterVoice_class_sip_profiles(CiscoXrParser.Voice_class_sip_profilesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#voice_class_sip_profiles}.
	 * @param ctx the parse tree
	 */
	void exitVoice_class_sip_profiles(CiscoXrParser.Voice_class_sip_profilesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#voice_class_sip_profiles_null}.
	 * @param ctx the parse tree
	 */
	void enterVoice_class_sip_profiles_null(CiscoXrParser.Voice_class_sip_profiles_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#voice_class_sip_profiles_null}.
	 * @param ctx the parse tree
	 */
	void exitVoice_class_sip_profiles_null(CiscoXrParser.Voice_class_sip_profiles_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#voice_class_uri}.
	 * @param ctx the parse tree
	 */
	void enterVoice_class_uri(CiscoXrParser.Voice_class_uriContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#voice_class_uri}.
	 * @param ctx the parse tree
	 */
	void exitVoice_class_uri(CiscoXrParser.Voice_class_uriContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#voice_null}.
	 * @param ctx the parse tree
	 */
	void enterVoice_null(CiscoXrParser.Voice_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#voice_null}.
	 * @param ctx the parse tree
	 */
	void exitVoice_null(CiscoXrParser.Voice_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#voice_service}.
	 * @param ctx the parse tree
	 */
	void enterVoice_service(CiscoXrParser.Voice_serviceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#voice_service}.
	 * @param ctx the parse tree
	 */
	void exitVoice_service(CiscoXrParser.Voice_serviceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#voice_service_voip}.
	 * @param ctx the parse tree
	 */
	void enterVoice_service_voip(CiscoXrParser.Voice_service_voipContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#voice_service_voip}.
	 * @param ctx the parse tree
	 */
	void exitVoice_service_voip(CiscoXrParser.Voice_service_voipContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#voice_service_voip_h323}.
	 * @param ctx the parse tree
	 */
	void enterVoice_service_voip_h323(CiscoXrParser.Voice_service_voip_h323Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#voice_service_voip_h323}.
	 * @param ctx the parse tree
	 */
	void exitVoice_service_voip_h323(CiscoXrParser.Voice_service_voip_h323Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#voice_service_voip_h323_null}.
	 * @param ctx the parse tree
	 */
	void enterVoice_service_voip_h323_null(CiscoXrParser.Voice_service_voip_h323_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#voice_service_voip_h323_null}.
	 * @param ctx the parse tree
	 */
	void exitVoice_service_voip_h323_null(CiscoXrParser.Voice_service_voip_h323_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#voice_service_voip_ip_address_trusted_list}.
	 * @param ctx the parse tree
	 */
	void enterVoice_service_voip_ip_address_trusted_list(CiscoXrParser.Voice_service_voip_ip_address_trusted_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#voice_service_voip_ip_address_trusted_list}.
	 * @param ctx the parse tree
	 */
	void exitVoice_service_voip_ip_address_trusted_list(CiscoXrParser.Voice_service_voip_ip_address_trusted_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#voice_service_voip_ip_address_trusted_list_null}.
	 * @param ctx the parse tree
	 */
	void enterVoice_service_voip_ip_address_trusted_list_null(CiscoXrParser.Voice_service_voip_ip_address_trusted_list_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#voice_service_voip_ip_address_trusted_list_null}.
	 * @param ctx the parse tree
	 */
	void exitVoice_service_voip_ip_address_trusted_list_null(CiscoXrParser.Voice_service_voip_ip_address_trusted_list_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#voice_service_voip_null}.
	 * @param ctx the parse tree
	 */
	void enterVoice_service_voip_null(CiscoXrParser.Voice_service_voip_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#voice_service_voip_null}.
	 * @param ctx the parse tree
	 */
	void exitVoice_service_voip_null(CiscoXrParser.Voice_service_voip_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#voice_service_voip_sip}.
	 * @param ctx the parse tree
	 */
	void enterVoice_service_voip_sip(CiscoXrParser.Voice_service_voip_sipContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#voice_service_voip_sip}.
	 * @param ctx the parse tree
	 */
	void exitVoice_service_voip_sip(CiscoXrParser.Voice_service_voip_sipContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#voice_service_voip_sip_null}.
	 * @param ctx the parse tree
	 */
	void enterVoice_service_voip_sip_null(CiscoXrParser.Voice_service_voip_sip_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#voice_service_voip_sip_null}.
	 * @param ctx the parse tree
	 */
	void exitVoice_service_voip_sip_null(CiscoXrParser.Voice_service_voip_sip_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#voice_translation_profile}.
	 * @param ctx the parse tree
	 */
	void enterVoice_translation_profile(CiscoXrParser.Voice_translation_profileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#voice_translation_profile}.
	 * @param ctx the parse tree
	 */
	void exitVoice_translation_profile(CiscoXrParser.Voice_translation_profileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#voice_translation_profile_null}.
	 * @param ctx the parse tree
	 */
	void enterVoice_translation_profile_null(CiscoXrParser.Voice_translation_profile_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#voice_translation_profile_null}.
	 * @param ctx the parse tree
	 */
	void exitVoice_translation_profile_null(CiscoXrParser.Voice_translation_profile_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#voice_translation_rule}.
	 * @param ctx the parse tree
	 */
	void enterVoice_translation_rule(CiscoXrParser.Voice_translation_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#voice_translation_rule}.
	 * @param ctx the parse tree
	 */
	void exitVoice_translation_rule(CiscoXrParser.Voice_translation_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#voice_translation_rule_null}.
	 * @param ctx the parse tree
	 */
	void enterVoice_translation_rule_null(CiscoXrParser.Voice_translation_rule_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#voice_translation_rule_null}.
	 * @param ctx the parse tree
	 */
	void exitVoice_translation_rule_null(CiscoXrParser.Voice_translation_rule_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#vp_null}.
	 * @param ctx the parse tree
	 */
	void enterVp_null(CiscoXrParser.Vp_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#vp_null}.
	 * @param ctx the parse tree
	 */
	void exitVp_null(CiscoXrParser.Vp_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#vpc_null}.
	 * @param ctx the parse tree
	 */
	void enterVpc_null(CiscoXrParser.Vpc_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#vpc_null}.
	 * @param ctx the parse tree
	 */
	void exitVpc_null(CiscoXrParser.Vpc_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#vpdng_accept_dialin}.
	 * @param ctx the parse tree
	 */
	void enterVpdng_accept_dialin(CiscoXrParser.Vpdng_accept_dialinContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#vpdng_accept_dialin}.
	 * @param ctx the parse tree
	 */
	void exitVpdng_accept_dialin(CiscoXrParser.Vpdng_accept_dialinContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#vpdng_null}.
	 * @param ctx the parse tree
	 */
	void enterVpdng_null(CiscoXrParser.Vpdng_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#vpdng_null}.
	 * @param ctx the parse tree
	 */
	void exitVpdng_null(CiscoXrParser.Vpdng_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#vpdnga_null}.
	 * @param ctx the parse tree
	 */
	void enterVpdnga_null(CiscoXrParser.Vpdnga_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#vpdnga_null}.
	 * @param ctx the parse tree
	 */
	void exitVpdnga_null(CiscoXrParser.Vpdnga_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#vpn_dialer_null}.
	 * @param ctx the parse tree
	 */
	void enterVpn_dialer_null(CiscoXrParser.Vpn_dialer_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#vpn_dialer_null}.
	 * @param ctx the parse tree
	 */
	void exitVpn_dialer_null(CiscoXrParser.Vpn_dialer_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#vpn_null}.
	 * @param ctx the parse tree
	 */
	void enterVpn_null(CiscoXrParser.Vpn_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#vpn_null}.
	 * @param ctx the parse tree
	 */
	void exitVpn_null(CiscoXrParser.Vpn_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#vrfc_address_family}.
	 * @param ctx the parse tree
	 */
	void enterVrfc_address_family(CiscoXrParser.Vrfc_address_familyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#vrfc_address_family}.
	 * @param ctx the parse tree
	 */
	void exitVrfc_address_family(CiscoXrParser.Vrfc_address_familyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#vrfc_ip_route}.
	 * @param ctx the parse tree
	 */
	void enterVrfc_ip_route(CiscoXrParser.Vrfc_ip_routeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#vrfc_ip_route}.
	 * @param ctx the parse tree
	 */
	void exitVrfc_ip_route(CiscoXrParser.Vrfc_ip_routeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#vrfc_rd}.
	 * @param ctx the parse tree
	 */
	void enterVrfc_rd(CiscoXrParser.Vrfc_rdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#vrfc_rd}.
	 * @param ctx the parse tree
	 */
	void exitVrfc_rd(CiscoXrParser.Vrfc_rdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#vrfc_route_target}.
	 * @param ctx the parse tree
	 */
	void enterVrfc_route_target(CiscoXrParser.Vrfc_route_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#vrfc_route_target}.
	 * @param ctx the parse tree
	 */
	void exitVrfc_route_target(CiscoXrParser.Vrfc_route_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#vrfc_shutdown}.
	 * @param ctx the parse tree
	 */
	void enterVrfc_shutdown(CiscoXrParser.Vrfc_shutdownContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#vrfc_shutdown}.
	 * @param ctx the parse tree
	 */
	void exitVrfc_shutdown(CiscoXrParser.Vrfc_shutdownContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#vrfc_vni}.
	 * @param ctx the parse tree
	 */
	void enterVrfc_vni(CiscoXrParser.Vrfc_vniContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#vrfc_vni}.
	 * @param ctx the parse tree
	 */
	void exitVrfc_vni(CiscoXrParser.Vrfc_vniContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#vrfc_null}.
	 * @param ctx the parse tree
	 */
	void enterVrfc_null(CiscoXrParser.Vrfc_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#vrfc_null}.
	 * @param ctx the parse tree
	 */
	void exitVrfc_null(CiscoXrParser.Vrfc_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#vrfd_address_family}.
	 * @param ctx the parse tree
	 */
	void enterVrfd_address_family(CiscoXrParser.Vrfd_address_familyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#vrfd_address_family}.
	 * @param ctx the parse tree
	 */
	void exitVrfd_address_family(CiscoXrParser.Vrfd_address_familyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#vrfd_description}.
	 * @param ctx the parse tree
	 */
	void enterVrfd_description(CiscoXrParser.Vrfd_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#vrfd_description}.
	 * @param ctx the parse tree
	 */
	void exitVrfd_description(CiscoXrParser.Vrfd_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#vrfd_rd}.
	 * @param ctx the parse tree
	 */
	void enterVrfd_rd(CiscoXrParser.Vrfd_rdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#vrfd_rd}.
	 * @param ctx the parse tree
	 */
	void exitVrfd_rd(CiscoXrParser.Vrfd_rdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#vrfd_null}.
	 * @param ctx the parse tree
	 */
	void enterVrfd_null(CiscoXrParser.Vrfd_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#vrfd_null}.
	 * @param ctx the parse tree
	 */
	void exitVrfd_null(CiscoXrParser.Vrfd_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#vrrp_interface}.
	 * @param ctx the parse tree
	 */
	void enterVrrp_interface(CiscoXrParser.Vrrp_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#vrrp_interface}.
	 * @param ctx the parse tree
	 */
	void exitVrrp_interface(CiscoXrParser.Vrrp_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#wccp_id}.
	 * @param ctx the parse tree
	 */
	void enterWccp_id(CiscoXrParser.Wccp_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#wccp_id}.
	 * @param ctx the parse tree
	 */
	void exitWccp_id(CiscoXrParser.Wccp_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#wccp_null}.
	 * @param ctx the parse tree
	 */
	void enterWccp_null(CiscoXrParser.Wccp_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#wccp_null}.
	 * @param ctx the parse tree
	 */
	void exitWccp_null(CiscoXrParser.Wccp_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#web_server_null}.
	 * @param ctx the parse tree
	 */
	void enterWeb_server_null(CiscoXrParser.Web_server_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#web_server_null}.
	 * @param ctx the parse tree
	 */
	void exitWeb_server_null(CiscoXrParser.Web_server_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#webvpn_null}.
	 * @param ctx the parse tree
	 */
	void enterWebvpn_null(CiscoXrParser.Webvpn_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#webvpn_null}.
	 * @param ctx the parse tree
	 */
	void exitWebvpn_null(CiscoXrParser.Webvpn_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#wlan_null}.
	 * @param ctx the parse tree
	 */
	void enterWlan_null(CiscoXrParser.Wlan_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#wlan_null}.
	 * @param ctx the parse tree
	 */
	void exitWlan_null(CiscoXrParser.Wlan_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#wlan_ssid_profile}.
	 * @param ctx the parse tree
	 */
	void enterWlan_ssid_profile(CiscoXrParser.Wlan_ssid_profileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#wlan_ssid_profile}.
	 * @param ctx the parse tree
	 */
	void exitWlan_ssid_profile(CiscoXrParser.Wlan_ssid_profileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#wlan_ssid_profile_null}.
	 * @param ctx the parse tree
	 */
	void enterWlan_ssid_profile_null(CiscoXrParser.Wlan_ssid_profile_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#wlan_ssid_profile_null}.
	 * @param ctx the parse tree
	 */
	void exitWlan_ssid_profile_null(CiscoXrParser.Wlan_ssid_profile_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#wlan_virtual_ap}.
	 * @param ctx the parse tree
	 */
	void enterWlan_virtual_ap(CiscoXrParser.Wlan_virtual_apContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#wlan_virtual_ap}.
	 * @param ctx the parse tree
	 */
	void exitWlan_virtual_ap(CiscoXrParser.Wlan_virtual_apContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#wlan_virtual_ap_null}.
	 * @param ctx the parse tree
	 */
	void enterWlan_virtual_ap_null(CiscoXrParser.Wlan_virtual_ap_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#wlan_virtual_ap_null}.
	 * @param ctx the parse tree
	 */
	void exitWlan_virtual_ap_null(CiscoXrParser.Wlan_virtual_ap_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#wsma_null}.
	 * @param ctx the parse tree
	 */
	void enterWsma_null(CiscoXrParser.Wsma_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#wsma_null}.
	 * @param ctx the parse tree
	 */
	void exitWsma_null(CiscoXrParser.Wsma_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#access_list_action}.
	 * @param ctx the parse tree
	 */
	void enterAccess_list_action(CiscoXrParser.Access_list_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#access_list_action}.
	 * @param ctx the parse tree
	 */
	void exitAccess_list_action(CiscoXrParser.Access_list_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#address_family_footer}.
	 * @param ctx the parse tree
	 */
	void enterAddress_family_footer(CiscoXrParser.Address_family_footerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#address_family_footer}.
	 * @param ctx the parse tree
	 */
	void exitAddress_family_footer(CiscoXrParser.Address_family_footerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#asn_dotted}.
	 * @param ctx the parse tree
	 */
	void enterAsn_dotted(CiscoXrParser.Asn_dottedContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#asn_dotted}.
	 * @param ctx the parse tree
	 */
	void exitAsn_dotted(CiscoXrParser.Asn_dottedContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#bgp_asn}.
	 * @param ctx the parse tree
	 */
	void enterBgp_asn(CiscoXrParser.Bgp_asnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#bgp_asn}.
	 * @param ctx the parse tree
	 */
	void exitBgp_asn(CiscoXrParser.Bgp_asnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#community}.
	 * @param ctx the parse tree
	 */
	void enterCommunity(CiscoXrParser.CommunityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#community}.
	 * @param ctx the parse tree
	 */
	void exitCommunity(CiscoXrParser.CommunityContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#description_line}.
	 * @param ctx the parse tree
	 */
	void enterDescription_line(CiscoXrParser.Description_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#description_line}.
	 * @param ctx the parse tree
	 */
	void exitDescription_line(CiscoXrParser.Description_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#double_quoted_string}.
	 * @param ctx the parse tree
	 */
	void enterDouble_quoted_string(CiscoXrParser.Double_quoted_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#double_quoted_string}.
	 * @param ctx the parse tree
	 */
	void exitDouble_quoted_string(CiscoXrParser.Double_quoted_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#dscp_type}.
	 * @param ctx the parse tree
	 */
	void enterDscp_type(CiscoXrParser.Dscp_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#dscp_type}.
	 * @param ctx the parse tree
	 */
	void exitDscp_type(CiscoXrParser.Dscp_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ec_literal}.
	 * @param ctx the parse tree
	 */
	void enterEc_literal(CiscoXrParser.Ec_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ec_literal}.
	 * @param ctx the parse tree
	 */
	void exitEc_literal(CiscoXrParser.Ec_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#eigrp_metric}.
	 * @param ctx the parse tree
	 */
	void enterEigrp_metric(CiscoXrParser.Eigrp_metricContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#eigrp_metric}.
	 * @param ctx the parse tree
	 */
	void exitEigrp_metric(CiscoXrParser.Eigrp_metricContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#exit_line}.
	 * @param ctx the parse tree
	 */
	void enterExit_line(CiscoXrParser.Exit_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#exit_line}.
	 * @param ctx the parse tree
	 */
	void exitExit_line(CiscoXrParser.Exit_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#extended_community}.
	 * @param ctx the parse tree
	 */
	void enterExtended_community(CiscoXrParser.Extended_communityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#extended_community}.
	 * @param ctx the parse tree
	 */
	void exitExtended_community(CiscoXrParser.Extended_communityContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#hash_comment}.
	 * @param ctx the parse tree
	 */
	void enterHash_comment(CiscoXrParser.Hash_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#hash_comment}.
	 * @param ctx the parse tree
	 */
	void exitHash_comment(CiscoXrParser.Hash_commentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#icmp_object_type}.
	 * @param ctx the parse tree
	 */
	void enterIcmp_object_type(CiscoXrParser.Icmp_object_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#icmp_object_type}.
	 * @param ctx the parse tree
	 */
	void exitIcmp_object_type(CiscoXrParser.Icmp_object_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#int_expr}.
	 * @param ctx the parse tree
	 */
	void enterInt_expr(CiscoXrParser.Int_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#int_expr}.
	 * @param ctx the parse tree
	 */
	void exitInt_expr(CiscoXrParser.Int_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#interface_name}.
	 * @param ctx the parse tree
	 */
	void enterInterface_name(CiscoXrParser.Interface_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#interface_name}.
	 * @param ctx the parse tree
	 */
	void exitInterface_name(CiscoXrParser.Interface_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#interface_name_unstructured}.
	 * @param ctx the parse tree
	 */
	void enterInterface_name_unstructured(CiscoXrParser.Interface_name_unstructuredContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#interface_name_unstructured}.
	 * @param ctx the parse tree
	 */
	void exitInterface_name_unstructured(CiscoXrParser.Interface_name_unstructuredContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ios_delimited_banner}.
	 * @param ctx the parse tree
	 */
	void enterIos_delimited_banner(CiscoXrParser.Ios_delimited_bannerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ios_delimited_banner}.
	 * @param ctx the parse tree
	 */
	void exitIos_delimited_banner(CiscoXrParser.Ios_delimited_bannerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ip_hostname}.
	 * @param ctx the parse tree
	 */
	void enterIp_hostname(CiscoXrParser.Ip_hostnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ip_hostname}.
	 * @param ctx the parse tree
	 */
	void exitIp_hostname(CiscoXrParser.Ip_hostnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#isis_level}.
	 * @param ctx the parse tree
	 */
	void enterIsis_level(CiscoXrParser.Isis_levelContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#isis_level}.
	 * @param ctx the parse tree
	 */
	void exitIsis_level(CiscoXrParser.Isis_levelContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#line_type}.
	 * @param ctx the parse tree
	 */
	void enterLine_type(CiscoXrParser.Line_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#line_type}.
	 * @param ctx the parse tree
	 */
	void exitLine_type(CiscoXrParser.Line_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#netservice_alg}.
	 * @param ctx the parse tree
	 */
	void enterNetservice_alg(CiscoXrParser.Netservice_algContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#netservice_alg}.
	 * @param ctx the parse tree
	 */
	void exitNetservice_alg(CiscoXrParser.Netservice_algContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#null_rest_of_line}.
	 * @param ctx the parse tree
	 */
	void enterNull_rest_of_line(CiscoXrParser.Null_rest_of_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#null_rest_of_line}.
	 * @param ctx the parse tree
	 */
	void exitNull_rest_of_line(CiscoXrParser.Null_rest_of_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ospf_route_type}.
	 * @param ctx the parse tree
	 */
	void enterOspf_route_type(CiscoXrParser.Ospf_route_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ospf_route_type}.
	 * @param ctx the parse tree
	 */
	void exitOspf_route_type(CiscoXrParser.Ospf_route_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#port_specifier}.
	 * @param ctx the parse tree
	 */
	void enterPort_specifier(CiscoXrParser.Port_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#port_specifier}.
	 * @param ctx the parse tree
	 */
	void exitPort_specifier(CiscoXrParser.Port_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#port}.
	 * @param ctx the parse tree
	 */
	void enterPort(CiscoXrParser.PortContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#port}.
	 * @param ctx the parse tree
	 */
	void exitPort(CiscoXrParser.PortContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#prefix_set_elem}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_set_elem(CiscoXrParser.Prefix_set_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#prefix_set_elem}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_set_elem(CiscoXrParser.Prefix_set_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#protocol}.
	 * @param ctx the parse tree
	 */
	void enterProtocol(CiscoXrParser.ProtocolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#protocol}.
	 * @param ctx the parse tree
	 */
	void exitProtocol(CiscoXrParser.ProtocolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(CiscoXrParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(CiscoXrParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#route_distinguisher}.
	 * @param ctx the parse tree
	 */
	void enterRoute_distinguisher(CiscoXrParser.Route_distinguisherContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#route_distinguisher}.
	 * @param ctx the parse tree
	 */
	void exitRoute_distinguisher(CiscoXrParser.Route_distinguisherContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#route_target}.
	 * @param ctx the parse tree
	 */
	void enterRoute_target(CiscoXrParser.Route_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#route_target}.
	 * @param ctx the parse tree
	 */
	void exitRoute_target(CiscoXrParser.Route_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#route_policy_params_list}.
	 * @param ctx the parse tree
	 */
	void enterRoute_policy_params_list(CiscoXrParser.Route_policy_params_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#route_policy_params_list}.
	 * @param ctx the parse tree
	 */
	void exitRoute_policy_params_list(CiscoXrParser.Route_policy_params_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#community_set_elem}.
	 * @param ctx the parse tree
	 */
	void enterCommunity_set_elem(CiscoXrParser.Community_set_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#community_set_elem}.
	 * @param ctx the parse tree
	 */
	void exitCommunity_set_elem(CiscoXrParser.Community_set_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#community_set_elem_half}.
	 * @param ctx the parse tree
	 */
	void enterCommunity_set_elem_half(CiscoXrParser.Community_set_elem_halfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#community_set_elem_half}.
	 * @param ctx the parse tree
	 */
	void exitCommunity_set_elem_half(CiscoXrParser.Community_set_elem_halfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#rp_subrange}.
	 * @param ctx the parse tree
	 */
	void enterRp_subrange(CiscoXrParser.Rp_subrangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#rp_subrange}.
	 * @param ctx the parse tree
	 */
	void exitRp_subrange(CiscoXrParser.Rp_subrangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#service_group_protocol}.
	 * @param ctx the parse tree
	 */
	void enterService_group_protocol(CiscoXrParser.Service_group_protocolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#service_group_protocol}.
	 * @param ctx the parse tree
	 */
	void exitService_group_protocol(CiscoXrParser.Service_group_protocolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#service_specifier}.
	 * @param ctx the parse tree
	 */
	void enterService_specifier(CiscoXrParser.Service_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#service_specifier}.
	 * @param ctx the parse tree
	 */
	void exitService_specifier(CiscoXrParser.Service_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#service_specifier_icmp}.
	 * @param ctx the parse tree
	 */
	void enterService_specifier_icmp(CiscoXrParser.Service_specifier_icmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#service_specifier_icmp}.
	 * @param ctx the parse tree
	 */
	void exitService_specifier_icmp(CiscoXrParser.Service_specifier_icmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#service_specifier_protocol}.
	 * @param ctx the parse tree
	 */
	void enterService_specifier_protocol(CiscoXrParser.Service_specifier_protocolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#service_specifier_protocol}.
	 * @param ctx the parse tree
	 */
	void exitService_specifier_protocol(CiscoXrParser.Service_specifier_protocolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#service_specifier_tcp_udp}.
	 * @param ctx the parse tree
	 */
	void enterService_specifier_tcp_udp(CiscoXrParser.Service_specifier_tcp_udpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#service_specifier_tcp_udp}.
	 * @param ctx the parse tree
	 */
	void exitService_specifier_tcp_udp(CiscoXrParser.Service_specifier_tcp_udpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#subrange}.
	 * @param ctx the parse tree
	 */
	void enterSubrange(CiscoXrParser.SubrangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#subrange}.
	 * @param ctx the parse tree
	 */
	void exitSubrange(CiscoXrParser.SubrangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#switchport_trunk_encapsulation}.
	 * @param ctx the parse tree
	 */
	void enterSwitchport_trunk_encapsulation(CiscoXrParser.Switchport_trunk_encapsulationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#switchport_trunk_encapsulation}.
	 * @param ctx the parse tree
	 */
	void exitSwitchport_trunk_encapsulation(CiscoXrParser.Switchport_trunk_encapsulationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#uint16}.
	 * @param ctx the parse tree
	 */
	void enterUint16(CiscoXrParser.Uint16Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#uint16}.
	 * @param ctx the parse tree
	 */
	void exitUint16(CiscoXrParser.Uint16Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#uint32}.
	 * @param ctx the parse tree
	 */
	void enterUint32(CiscoXrParser.Uint32Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#uint32}.
	 * @param ctx the parse tree
	 */
	void exitUint32(CiscoXrParser.Uint32Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(CiscoXrParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(CiscoXrParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#variable_aclname}.
	 * @param ctx the parse tree
	 */
	void enterVariable_aclname(CiscoXrParser.Variable_aclnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#variable_aclname}.
	 * @param ctx the parse tree
	 */
	void exitVariable_aclname(CiscoXrParser.Variable_aclnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#variable_community_name}.
	 * @param ctx the parse tree
	 */
	void enterVariable_community_name(CiscoXrParser.Variable_community_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#variable_community_name}.
	 * @param ctx the parse tree
	 */
	void exitVariable_community_name(CiscoXrParser.Variable_community_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#variable_distribute_list}.
	 * @param ctx the parse tree
	 */
	void enterVariable_distribute_list(CiscoXrParser.Variable_distribute_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#variable_distribute_list}.
	 * @param ctx the parse tree
	 */
	void exitVariable_distribute_list(CiscoXrParser.Variable_distribute_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#variable_hostname}.
	 * @param ctx the parse tree
	 */
	void enterVariable_hostname(CiscoXrParser.Variable_hostnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#variable_hostname}.
	 * @param ctx the parse tree
	 */
	void exitVariable_hostname(CiscoXrParser.Variable_hostnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#variable_interface_name}.
	 * @param ctx the parse tree
	 */
	void enterVariable_interface_name(CiscoXrParser.Variable_interface_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#variable_interface_name}.
	 * @param ctx the parse tree
	 */
	void exitVariable_interface_name(CiscoXrParser.Variable_interface_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#variable_max_metric}.
	 * @param ctx the parse tree
	 */
	void enterVariable_max_metric(CiscoXrParser.Variable_max_metricContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#variable_max_metric}.
	 * @param ctx the parse tree
	 */
	void exitVariable_max_metric(CiscoXrParser.Variable_max_metricContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#variable_permissive}.
	 * @param ctx the parse tree
	 */
	void enterVariable_permissive(CiscoXrParser.Variable_permissiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#variable_permissive}.
	 * @param ctx the parse tree
	 */
	void exitVariable_permissive(CiscoXrParser.Variable_permissiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#variable_secret}.
	 * @param ctx the parse tree
	 */
	void enterVariable_secret(CiscoXrParser.Variable_secretContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#variable_secret}.
	 * @param ctx the parse tree
	 */
	void exitVariable_secret(CiscoXrParser.Variable_secretContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#variable_group_id}.
	 * @param ctx the parse tree
	 */
	void enterVariable_group_id(CiscoXrParser.Variable_group_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#variable_group_id}.
	 * @param ctx the parse tree
	 */
	void exitVariable_group_id(CiscoXrParser.Variable_group_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#variable_vlan}.
	 * @param ctx the parse tree
	 */
	void enterVariable_vlan(CiscoXrParser.Variable_vlanContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#variable_vlan}.
	 * @param ctx the parse tree
	 */
	void exitVariable_vlan(CiscoXrParser.Variable_vlanContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#vlan_id}.
	 * @param ctx the parse tree
	 */
	void enterVlan_id(CiscoXrParser.Vlan_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#vlan_id}.
	 * @param ctx the parse tree
	 */
	void exitVlan_id(CiscoXrParser.Vlan_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_accounting}.
	 * @param ctx the parse tree
	 */
	void enterAaa_accounting(CiscoXrParser.Aaa_accountingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_accounting}.
	 * @param ctx the parse tree
	 */
	void exitAaa_accounting(CiscoXrParser.Aaa_accountingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_accounting_commands_line}.
	 * @param ctx the parse tree
	 */
	void enterAaa_accounting_commands_line(CiscoXrParser.Aaa_accounting_commands_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_accounting_commands_line}.
	 * @param ctx the parse tree
	 */
	void exitAaa_accounting_commands_line(CiscoXrParser.Aaa_accounting_commands_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_accounting_commands_stanza}.
	 * @param ctx the parse tree
	 */
	void enterAaa_accounting_commands_stanza(CiscoXrParser.Aaa_accounting_commands_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_accounting_commands_stanza}.
	 * @param ctx the parse tree
	 */
	void exitAaa_accounting_commands_stanza(CiscoXrParser.Aaa_accounting_commands_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_accounting_connection_line}.
	 * @param ctx the parse tree
	 */
	void enterAaa_accounting_connection_line(CiscoXrParser.Aaa_accounting_connection_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_accounting_connection_line}.
	 * @param ctx the parse tree
	 */
	void exitAaa_accounting_connection_line(CiscoXrParser.Aaa_accounting_connection_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_accounting_connection_stanza}.
	 * @param ctx the parse tree
	 */
	void enterAaa_accounting_connection_stanza(CiscoXrParser.Aaa_accounting_connection_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_accounting_connection_stanza}.
	 * @param ctx the parse tree
	 */
	void exitAaa_accounting_connection_stanza(CiscoXrParser.Aaa_accounting_connection_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_accounting_default}.
	 * @param ctx the parse tree
	 */
	void enterAaa_accounting_default(CiscoXrParser.Aaa_accounting_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_accounting_default}.
	 * @param ctx the parse tree
	 */
	void exitAaa_accounting_default(CiscoXrParser.Aaa_accounting_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_accounting_default_group}.
	 * @param ctx the parse tree
	 */
	void enterAaa_accounting_default_group(CiscoXrParser.Aaa_accounting_default_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_accounting_default_group}.
	 * @param ctx the parse tree
	 */
	void exitAaa_accounting_default_group(CiscoXrParser.Aaa_accounting_default_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_accounting_default_local}.
	 * @param ctx the parse tree
	 */
	void enterAaa_accounting_default_local(CiscoXrParser.Aaa_accounting_default_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_accounting_default_local}.
	 * @param ctx the parse tree
	 */
	void exitAaa_accounting_default_local(CiscoXrParser.Aaa_accounting_default_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_accounting_delay_start}.
	 * @param ctx the parse tree
	 */
	void enterAaa_accounting_delay_start(CiscoXrParser.Aaa_accounting_delay_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_accounting_delay_start}.
	 * @param ctx the parse tree
	 */
	void exitAaa_accounting_delay_start(CiscoXrParser.Aaa_accounting_delay_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_accounting_exec_line}.
	 * @param ctx the parse tree
	 */
	void enterAaa_accounting_exec_line(CiscoXrParser.Aaa_accounting_exec_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_accounting_exec_line}.
	 * @param ctx the parse tree
	 */
	void exitAaa_accounting_exec_line(CiscoXrParser.Aaa_accounting_exec_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_accounting_exec_stanza}.
	 * @param ctx the parse tree
	 */
	void enterAaa_accounting_exec_stanza(CiscoXrParser.Aaa_accounting_exec_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_accounting_exec_stanza}.
	 * @param ctx the parse tree
	 */
	void exitAaa_accounting_exec_stanza(CiscoXrParser.Aaa_accounting_exec_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_accounting_identity}.
	 * @param ctx the parse tree
	 */
	void enterAaa_accounting_identity(CiscoXrParser.Aaa_accounting_identityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_accounting_identity}.
	 * @param ctx the parse tree
	 */
	void exitAaa_accounting_identity(CiscoXrParser.Aaa_accounting_identityContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_accounting_method}.
	 * @param ctx the parse tree
	 */
	void enterAaa_accounting_method(CiscoXrParser.Aaa_accounting_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_accounting_method}.
	 * @param ctx the parse tree
	 */
	void exitAaa_accounting_method(CiscoXrParser.Aaa_accounting_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_accounting_method_none}.
	 * @param ctx the parse tree
	 */
	void enterAaa_accounting_method_none(CiscoXrParser.Aaa_accounting_method_noneContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_accounting_method_none}.
	 * @param ctx the parse tree
	 */
	void exitAaa_accounting_method_none(CiscoXrParser.Aaa_accounting_method_noneContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_accounting_method_start_stop}.
	 * @param ctx the parse tree
	 */
	void enterAaa_accounting_method_start_stop(CiscoXrParser.Aaa_accounting_method_start_stopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_accounting_method_start_stop}.
	 * @param ctx the parse tree
	 */
	void exitAaa_accounting_method_start_stop(CiscoXrParser.Aaa_accounting_method_start_stopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_accounting_method_stop_only}.
	 * @param ctx the parse tree
	 */
	void enterAaa_accounting_method_stop_only(CiscoXrParser.Aaa_accounting_method_stop_onlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_accounting_method_stop_only}.
	 * @param ctx the parse tree
	 */
	void exitAaa_accounting_method_stop_only(CiscoXrParser.Aaa_accounting_method_stop_onlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_accounting_method_wait_start}.
	 * @param ctx the parse tree
	 */
	void enterAaa_accounting_method_wait_start(CiscoXrParser.Aaa_accounting_method_wait_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_accounting_method_wait_start}.
	 * @param ctx the parse tree
	 */
	void exitAaa_accounting_method_wait_start(CiscoXrParser.Aaa_accounting_method_wait_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_accounting_method_target}.
	 * @param ctx the parse tree
	 */
	void enterAaa_accounting_method_target(CiscoXrParser.Aaa_accounting_method_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_accounting_method_target}.
	 * @param ctx the parse tree
	 */
	void exitAaa_accounting_method_target(CiscoXrParser.Aaa_accounting_method_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_accounting_nested}.
	 * @param ctx the parse tree
	 */
	void enterAaa_accounting_nested(CiscoXrParser.Aaa_accounting_nestedContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_accounting_nested}.
	 * @param ctx the parse tree
	 */
	void exitAaa_accounting_nested(CiscoXrParser.Aaa_accounting_nestedContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_accounting_network_line}.
	 * @param ctx the parse tree
	 */
	void enterAaa_accounting_network_line(CiscoXrParser.Aaa_accounting_network_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_accounting_network_line}.
	 * @param ctx the parse tree
	 */
	void exitAaa_accounting_network_line(CiscoXrParser.Aaa_accounting_network_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_accounting_network_stanza}.
	 * @param ctx the parse tree
	 */
	void enterAaa_accounting_network_stanza(CiscoXrParser.Aaa_accounting_network_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_accounting_network_stanza}.
	 * @param ctx the parse tree
	 */
	void exitAaa_accounting_network_stanza(CiscoXrParser.Aaa_accounting_network_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_accounting_send}.
	 * @param ctx the parse tree
	 */
	void enterAaa_accounting_send(CiscoXrParser.Aaa_accounting_sendContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_accounting_send}.
	 * @param ctx the parse tree
	 */
	void exitAaa_accounting_send(CiscoXrParser.Aaa_accounting_sendContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_accounting_send_counters}.
	 * @param ctx the parse tree
	 */
	void enterAaa_accounting_send_counters(CiscoXrParser.Aaa_accounting_send_countersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_accounting_send_counters}.
	 * @param ctx the parse tree
	 */
	void exitAaa_accounting_send_counters(CiscoXrParser.Aaa_accounting_send_countersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_accounting_send_stop_record}.
	 * @param ctx the parse tree
	 */
	void enterAaa_accounting_send_stop_record(CiscoXrParser.Aaa_accounting_send_stop_recordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_accounting_send_stop_record}.
	 * @param ctx the parse tree
	 */
	void exitAaa_accounting_send_stop_record(CiscoXrParser.Aaa_accounting_send_stop_recordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_accounting_system_line}.
	 * @param ctx the parse tree
	 */
	void enterAaa_accounting_system_line(CiscoXrParser.Aaa_accounting_system_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_accounting_system_line}.
	 * @param ctx the parse tree
	 */
	void exitAaa_accounting_system_line(CiscoXrParser.Aaa_accounting_system_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_accounting_system_stanza}.
	 * @param ctx the parse tree
	 */
	void enterAaa_accounting_system_stanza(CiscoXrParser.Aaa_accounting_system_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_accounting_system_stanza}.
	 * @param ctx the parse tree
	 */
	void exitAaa_accounting_system_stanza(CiscoXrParser.Aaa_accounting_system_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_accounting_update}.
	 * @param ctx the parse tree
	 */
	void enterAaa_accounting_update(CiscoXrParser.Aaa_accounting_updateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_accounting_update}.
	 * @param ctx the parse tree
	 */
	void exitAaa_accounting_update(CiscoXrParser.Aaa_accounting_updateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication(CiscoXrParser.Aaa_authenticationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication(CiscoXrParser.Aaa_authenticationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_banner}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_banner(CiscoXrParser.Aaa_authentication_bannerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_banner}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_banner(CiscoXrParser.Aaa_authentication_bannerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_captive_portal}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_captive_portal(CiscoXrParser.Aaa_authentication_captive_portalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_captive_portal}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_captive_portal(CiscoXrParser.Aaa_authentication_captive_portalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_captive_portal_null}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_captive_portal_null(CiscoXrParser.Aaa_authentication_captive_portal_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_captive_portal_null}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_captive_portal_null(CiscoXrParser.Aaa_authentication_captive_portal_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_dot1x}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_dot1x(CiscoXrParser.Aaa_authentication_dot1xContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_dot1x}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_dot1x(CiscoXrParser.Aaa_authentication_dot1xContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_dot1x_null}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_dot1x_null(CiscoXrParser.Aaa_authentication_dot1x_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_dot1x_null}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_dot1x_null(CiscoXrParser.Aaa_authentication_dot1x_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_enable}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_enable(CiscoXrParser.Aaa_authentication_enableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_enable}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_enable(CiscoXrParser.Aaa_authentication_enableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_include}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_include(CiscoXrParser.Aaa_authentication_includeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_include}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_include(CiscoXrParser.Aaa_authentication_includeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_list_method}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_list_method(CiscoXrParser.Aaa_authentication_list_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_list_method}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_list_method(CiscoXrParser.Aaa_authentication_list_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_list_method_fallback}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_list_method_fallback(CiscoXrParser.Aaa_authentication_list_method_fallbackContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_list_method_fallback}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_list_method_fallback(CiscoXrParser.Aaa_authentication_list_method_fallbackContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_list_method_group}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_list_method_group(CiscoXrParser.Aaa_authentication_list_method_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_list_method_group}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_list_method_group(CiscoXrParser.Aaa_authentication_list_method_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_list_method_group_ios}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_list_method_group_ios(CiscoXrParser.Aaa_authentication_list_method_group_iosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_list_method_group_ios}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_list_method_group_ios(CiscoXrParser.Aaa_authentication_list_method_group_iosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_list_method_group_additional}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_list_method_group_additional(CiscoXrParser.Aaa_authentication_list_method_group_additionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_list_method_group_additional}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_list_method_group_additional(CiscoXrParser.Aaa_authentication_list_method_group_additionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_list_method_if_needed}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_list_method_if_needed(CiscoXrParser.Aaa_authentication_list_method_if_neededContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_list_method_if_needed}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_list_method_if_needed(CiscoXrParser.Aaa_authentication_list_method_if_neededContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_list_method_ios}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_list_method_ios(CiscoXrParser.Aaa_authentication_list_method_iosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_list_method_ios}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_list_method_ios(CiscoXrParser.Aaa_authentication_list_method_iosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_list_method_radius}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_list_method_radius(CiscoXrParser.Aaa_authentication_list_method_radiusContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_list_method_radius}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_list_method_radius(CiscoXrParser.Aaa_authentication_list_method_radiusContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_list_method_tacacs_local}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_list_method_tacacs_local(CiscoXrParser.Aaa_authentication_list_method_tacacs_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_list_method_tacacs_local}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_list_method_tacacs_local(CiscoXrParser.Aaa_authentication_list_method_tacacs_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_list_method_tacacs_plus}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_list_method_tacacs_plus(CiscoXrParser.Aaa_authentication_list_method_tacacs_plusContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_list_method_tacacs_plus}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_list_method_tacacs_plus(CiscoXrParser.Aaa_authentication_list_method_tacacs_plusContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_login}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_login(CiscoXrParser.Aaa_authentication_loginContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_login}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_login(CiscoXrParser.Aaa_authentication_loginContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_login_ascii_authentication}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_login_ascii_authentication(CiscoXrParser.Aaa_authentication_login_ascii_authenticationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_login_ascii_authentication}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_login_ascii_authentication(CiscoXrParser.Aaa_authentication_login_ascii_authenticationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_login_chap}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_login_chap(CiscoXrParser.Aaa_authentication_login_chapContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_login_chap}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_login_chap(CiscoXrParser.Aaa_authentication_login_chapContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_login_error_enable}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_login_error_enable(CiscoXrParser.Aaa_authentication_login_error_enableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_login_error_enable}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_login_error_enable(CiscoXrParser.Aaa_authentication_login_error_enableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_login_invalid_username_log}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_login_invalid_username_log(CiscoXrParser.Aaa_authentication_login_invalid_username_logContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_login_invalid_username_log}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_login_invalid_username_log(CiscoXrParser.Aaa_authentication_login_invalid_username_logContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_login_list}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_login_list(CiscoXrParser.Aaa_authentication_login_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_login_list}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_login_list(CiscoXrParser.Aaa_authentication_login_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_login_mschap}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_login_mschap(CiscoXrParser.Aaa_authentication_login_mschapContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_login_mschap}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_login_mschap(CiscoXrParser.Aaa_authentication_login_mschapContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_login_mschapv2}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_login_mschapv2(CiscoXrParser.Aaa_authentication_login_mschapv2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_login_mschapv2}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_login_mschapv2(CiscoXrParser.Aaa_authentication_login_mschapv2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_login_privilege_mode}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_login_privilege_mode(CiscoXrParser.Aaa_authentication_login_privilege_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_login_privilege_mode}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_login_privilege_mode(CiscoXrParser.Aaa_authentication_login_privilege_modeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_mac}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_mac(CiscoXrParser.Aaa_authentication_macContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_mac}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_mac(CiscoXrParser.Aaa_authentication_macContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_mac_null}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_mac_null(CiscoXrParser.Aaa_authentication_mac_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_mac_null}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_mac_null(CiscoXrParser.Aaa_authentication_mac_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_mgmt}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_mgmt(CiscoXrParser.Aaa_authentication_mgmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_mgmt}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_mgmt(CiscoXrParser.Aaa_authentication_mgmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_mgmt_null}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_mgmt_null(CiscoXrParser.Aaa_authentication_mgmt_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_mgmt_null}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_mgmt_null(CiscoXrParser.Aaa_authentication_mgmt_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_policy}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_policy(CiscoXrParser.Aaa_authentication_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_policy}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_policy(CiscoXrParser.Aaa_authentication_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_ppp}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_ppp(CiscoXrParser.Aaa_authentication_pppContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_ppp}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_ppp(CiscoXrParser.Aaa_authentication_pppContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_server}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_server(CiscoXrParser.Aaa_authentication_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_server}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_server(CiscoXrParser.Aaa_authentication_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_server_radius}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_server_radius(CiscoXrParser.Aaa_authentication_server_radiusContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_server_radius}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_server_radius(CiscoXrParser.Aaa_authentication_server_radiusContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_server_radius_null}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_server_radius_null(CiscoXrParser.Aaa_authentication_server_radius_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_server_radius_null}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_server_radius_null(CiscoXrParser.Aaa_authentication_server_radius_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_server_tacacs}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_server_tacacs(CiscoXrParser.Aaa_authentication_server_tacacsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_server_tacacs}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_server_tacacs(CiscoXrParser.Aaa_authentication_server_tacacsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_server_tacacs_null}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_server_tacacs_null(CiscoXrParser.Aaa_authentication_server_tacacs_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_server_tacacs_null}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_server_tacacs_null(CiscoXrParser.Aaa_authentication_server_tacacs_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_stateful_dot1x}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_stateful_dot1x(CiscoXrParser.Aaa_authentication_stateful_dot1xContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_stateful_dot1x}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_stateful_dot1x(CiscoXrParser.Aaa_authentication_stateful_dot1xContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_stateful_kerberos}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_stateful_kerberos(CiscoXrParser.Aaa_authentication_stateful_kerberosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_stateful_kerberos}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_stateful_kerberos(CiscoXrParser.Aaa_authentication_stateful_kerberosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_stateful_ntlm}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_stateful_ntlm(CiscoXrParser.Aaa_authentication_stateful_ntlmContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_stateful_ntlm}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_stateful_ntlm(CiscoXrParser.Aaa_authentication_stateful_ntlmContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_username_prompt}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_username_prompt(CiscoXrParser.Aaa_authentication_username_promptContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_username_prompt}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_username_prompt(CiscoXrParser.Aaa_authentication_username_promptContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_vpn}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_vpn(CiscoXrParser.Aaa_authentication_vpnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_vpn}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_vpn(CiscoXrParser.Aaa_authentication_vpnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_wired}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_wired(CiscoXrParser.Aaa_authentication_wiredContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_wired}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_wired(CiscoXrParser.Aaa_authentication_wiredContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authentication_wispr}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authentication_wispr(CiscoXrParser.Aaa_authentication_wisprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authentication_wispr}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authentication_wispr(CiscoXrParser.Aaa_authentication_wisprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authorization}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authorization(CiscoXrParser.Aaa_authorizationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authorization}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authorization(CiscoXrParser.Aaa_authorizationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authorization_auth_proxy}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authorization_auth_proxy(CiscoXrParser.Aaa_authorization_auth_proxyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authorization_auth_proxy}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authorization_auth_proxy(CiscoXrParser.Aaa_authorization_auth_proxyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authorization_commands}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authorization_commands(CiscoXrParser.Aaa_authorization_commandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authorization_commands}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authorization_commands(CiscoXrParser.Aaa_authorization_commandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authorization_config_commands}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authorization_config_commands(CiscoXrParser.Aaa_authorization_config_commandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authorization_config_commands}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authorization_config_commands(CiscoXrParser.Aaa_authorization_config_commandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authorization_console}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authorization_console(CiscoXrParser.Aaa_authorization_consoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authorization_console}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authorization_console(CiscoXrParser.Aaa_authorization_consoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authorization_exec}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authorization_exec(CiscoXrParser.Aaa_authorization_execContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authorization_exec}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authorization_exec(CiscoXrParser.Aaa_authorization_execContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authorization_include}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authorization_include(CiscoXrParser.Aaa_authorization_includeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authorization_include}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authorization_include(CiscoXrParser.Aaa_authorization_includeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authorization_method}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authorization_method(CiscoXrParser.Aaa_authorization_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authorization_method}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authorization_method(CiscoXrParser.Aaa_authorization_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authorization_network}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authorization_network(CiscoXrParser.Aaa_authorization_networkContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authorization_network}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authorization_network(CiscoXrParser.Aaa_authorization_networkContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authorization_reverse_access}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authorization_reverse_access(CiscoXrParser.Aaa_authorization_reverse_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authorization_reverse_access}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authorization_reverse_access(CiscoXrParser.Aaa_authorization_reverse_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authorization_ssh_certificate}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authorization_ssh_certificate(CiscoXrParser.Aaa_authorization_ssh_certificateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authorization_ssh_certificate}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authorization_ssh_certificate(CiscoXrParser.Aaa_authorization_ssh_certificateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_authorization_ssh_publickey}.
	 * @param ctx the parse tree
	 */
	void enterAaa_authorization_ssh_publickey(CiscoXrParser.Aaa_authorization_ssh_publickeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_authorization_ssh_publickey}.
	 * @param ctx the parse tree
	 */
	void exitAaa_authorization_ssh_publickey(CiscoXrParser.Aaa_authorization_ssh_publickeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_bandwidth_contract}.
	 * @param ctx the parse tree
	 */
	void enterAaa_bandwidth_contract(CiscoXrParser.Aaa_bandwidth_contractContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_bandwidth_contract}.
	 * @param ctx the parse tree
	 */
	void exitAaa_bandwidth_contract(CiscoXrParser.Aaa_bandwidth_contractContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_default_taskgroup}.
	 * @param ctx the parse tree
	 */
	void enterAaa_default_taskgroup(CiscoXrParser.Aaa_default_taskgroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_default_taskgroup}.
	 * @param ctx the parse tree
	 */
	void exitAaa_default_taskgroup(CiscoXrParser.Aaa_default_taskgroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_derivation_rules}.
	 * @param ctx the parse tree
	 */
	void enterAaa_derivation_rules(CiscoXrParser.Aaa_derivation_rulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_derivation_rules}.
	 * @param ctx the parse tree
	 */
	void exitAaa_derivation_rules(CiscoXrParser.Aaa_derivation_rulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_derivation_rules_null}.
	 * @param ctx the parse tree
	 */
	void enterAaa_derivation_rules_null(CiscoXrParser.Aaa_derivation_rules_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_derivation_rules_null}.
	 * @param ctx the parse tree
	 */
	void exitAaa_derivation_rules_null(CiscoXrParser.Aaa_derivation_rules_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_group}.
	 * @param ctx the parse tree
	 */
	void enterAaa_group(CiscoXrParser.Aaa_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_group}.
	 * @param ctx the parse tree
	 */
	void exitAaa_group(CiscoXrParser.Aaa_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_group_deadtime}.
	 * @param ctx the parse tree
	 */
	void enterAaa_group_deadtime(CiscoXrParser.Aaa_group_deadtimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_group_deadtime}.
	 * @param ctx the parse tree
	 */
	void exitAaa_group_deadtime(CiscoXrParser.Aaa_group_deadtimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_group_ip_tacacs}.
	 * @param ctx the parse tree
	 */
	void enterAaa_group_ip_tacacs(CiscoXrParser.Aaa_group_ip_tacacsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_group_ip_tacacs}.
	 * @param ctx the parse tree
	 */
	void exitAaa_group_ip_tacacs(CiscoXrParser.Aaa_group_ip_tacacsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_group_ip_vrf}.
	 * @param ctx the parse tree
	 */
	void enterAaa_group_ip_vrf(CiscoXrParser.Aaa_group_ip_vrfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_group_ip_vrf}.
	 * @param ctx the parse tree
	 */
	void exitAaa_group_ip_vrf(CiscoXrParser.Aaa_group_ip_vrfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_group_no_source_interface}.
	 * @param ctx the parse tree
	 */
	void enterAaa_group_no_source_interface(CiscoXrParser.Aaa_group_no_source_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_group_no_source_interface}.
	 * @param ctx the parse tree
	 */
	void exitAaa_group_no_source_interface(CiscoXrParser.Aaa_group_no_source_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_group_server}.
	 * @param ctx the parse tree
	 */
	void enterAaa_group_server(CiscoXrParser.Aaa_group_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_group_server}.
	 * @param ctx the parse tree
	 */
	void exitAaa_group_server(CiscoXrParser.Aaa_group_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_group_server_private}.
	 * @param ctx the parse tree
	 */
	void enterAaa_group_server_private(CiscoXrParser.Aaa_group_server_privateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_group_server_private}.
	 * @param ctx the parse tree
	 */
	void exitAaa_group_server_private(CiscoXrParser.Aaa_group_server_privateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_group_source_interface}.
	 * @param ctx the parse tree
	 */
	void enterAaa_group_source_interface(CiscoXrParser.Aaa_group_source_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_group_source_interface}.
	 * @param ctx the parse tree
	 */
	void exitAaa_group_source_interface(CiscoXrParser.Aaa_group_source_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_group_use_vrf}.
	 * @param ctx the parse tree
	 */
	void enterAaa_group_use_vrf(CiscoXrParser.Aaa_group_use_vrfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_group_use_vrf}.
	 * @param ctx the parse tree
	 */
	void exitAaa_group_use_vrf(CiscoXrParser.Aaa_group_use_vrfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_group_vrf}.
	 * @param ctx the parse tree
	 */
	void enterAaa_group_vrf(CiscoXrParser.Aaa_group_vrfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_group_vrf}.
	 * @param ctx the parse tree
	 */
	void exitAaa_group_vrf(CiscoXrParser.Aaa_group_vrfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_new_model}.
	 * @param ctx the parse tree
	 */
	void enterAaa_new_model(CiscoXrParser.Aaa_new_modelContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_new_model}.
	 * @param ctx the parse tree
	 */
	void exitAaa_new_model(CiscoXrParser.Aaa_new_modelContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_password_policy}.
	 * @param ctx the parse tree
	 */
	void enterAaa_password_policy(CiscoXrParser.Aaa_password_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_password_policy}.
	 * @param ctx the parse tree
	 */
	void exitAaa_password_policy(CiscoXrParser.Aaa_password_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_profile}.
	 * @param ctx the parse tree
	 */
	void enterAaa_profile(CiscoXrParser.Aaa_profileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_profile}.
	 * @param ctx the parse tree
	 */
	void exitAaa_profile(CiscoXrParser.Aaa_profileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_profile_null}.
	 * @param ctx the parse tree
	 */
	void enterAaa_profile_null(CiscoXrParser.Aaa_profile_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_profile_null}.
	 * @param ctx the parse tree
	 */
	void exitAaa_profile_null(CiscoXrParser.Aaa_profile_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_rfc_3576_server}.
	 * @param ctx the parse tree
	 */
	void enterAaa_rfc_3576_server(CiscoXrParser.Aaa_rfc_3576_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_rfc_3576_server}.
	 * @param ctx the parse tree
	 */
	void exitAaa_rfc_3576_server(CiscoXrParser.Aaa_rfc_3576_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_server}.
	 * @param ctx the parse tree
	 */
	void enterAaa_server(CiscoXrParser.Aaa_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_server}.
	 * @param ctx the parse tree
	 */
	void exitAaa_server(CiscoXrParser.Aaa_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_server_auth_type}.
	 * @param ctx the parse tree
	 */
	void enterAaa_server_auth_type(CiscoXrParser.Aaa_server_auth_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_server_auth_type}.
	 * @param ctx the parse tree
	 */
	void exitAaa_server_auth_type(CiscoXrParser.Aaa_server_auth_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_server_client}.
	 * @param ctx the parse tree
	 */
	void enterAaa_server_client(CiscoXrParser.Aaa_server_clientContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_server_client}.
	 * @param ctx the parse tree
	 */
	void exitAaa_server_client(CiscoXrParser.Aaa_server_clientContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_server_ignore}.
	 * @param ctx the parse tree
	 */
	void enterAaa_server_ignore(CiscoXrParser.Aaa_server_ignoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_server_ignore}.
	 * @param ctx the parse tree
	 */
	void exitAaa_server_ignore(CiscoXrParser.Aaa_server_ignoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_server_port}.
	 * @param ctx the parse tree
	 */
	void enterAaa_server_port(CiscoXrParser.Aaa_server_portContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_server_port}.
	 * @param ctx the parse tree
	 */
	void exitAaa_server_port(CiscoXrParser.Aaa_server_portContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_server_group}.
	 * @param ctx the parse tree
	 */
	void enterAaa_server_group(CiscoXrParser.Aaa_server_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_server_group}.
	 * @param ctx the parse tree
	 */
	void exitAaa_server_group(CiscoXrParser.Aaa_server_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_server_group_null}.
	 * @param ctx the parse tree
	 */
	void enterAaa_server_group_null(CiscoXrParser.Aaa_server_group_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_server_group_null}.
	 * @param ctx the parse tree
	 */
	void exitAaa_server_group_null(CiscoXrParser.Aaa_server_group_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_session_id}.
	 * @param ctx the parse tree
	 */
	void enterAaa_session_id(CiscoXrParser.Aaa_session_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_session_id}.
	 * @param ctx the parse tree
	 */
	void exitAaa_session_id(CiscoXrParser.Aaa_session_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaa_user}.
	 * @param ctx the parse tree
	 */
	void enterAaa_user(CiscoXrParser.Aaa_userContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaa_user}.
	 * @param ctx the parse tree
	 */
	void exitAaa_user(CiscoXrParser.Aaa_userContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaaac_action_type}.
	 * @param ctx the parse tree
	 */
	void enterAaaac_action_type(CiscoXrParser.Aaaac_action_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaaac_action_type}.
	 * @param ctx the parse tree
	 */
	void exitAaaac_action_type(CiscoXrParser.Aaaac_action_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaaac_group}.
	 * @param ctx the parse tree
	 */
	void enterAaaac_group(CiscoXrParser.Aaaac_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaaac_group}.
	 * @param ctx the parse tree
	 */
	void exitAaaac_group(CiscoXrParser.Aaaac_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaaas_action_type}.
	 * @param ctx the parse tree
	 */
	void enterAaaas_action_type(CiscoXrParser.Aaaas_action_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaaas_action_type}.
	 * @param ctx the parse tree
	 */
	void exitAaaas_action_type(CiscoXrParser.Aaaas_action_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aaaas_group}.
	 * @param ctx the parse tree
	 */
	void enterAaaas_group(CiscoXrParser.Aaaas_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aaaas_group}.
	 * @param ctx the parse tree
	 */
	void exitAaaas_group(CiscoXrParser.Aaaas_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#null_aaa_substanza}.
	 * @param ctx the parse tree
	 */
	void enterNull_aaa_substanza(CiscoXrParser.Null_aaa_substanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#null_aaa_substanza}.
	 * @param ctx the parse tree
	 */
	void exitNull_aaa_substanza(CiscoXrParser.Null_aaa_substanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_aaa}.
	 * @param ctx the parse tree
	 */
	void enterS_aaa(CiscoXrParser.S_aaaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_aaa}.
	 * @param ctx the parse tree
	 */
	void exitS_aaa(CiscoXrParser.S_aaaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ipv4_access_list}.
	 * @param ctx the parse tree
	 */
	void enterIpv4_access_list(CiscoXrParser.Ipv4_access_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ipv4_access_list}.
	 * @param ctx the parse tree
	 */
	void exitIpv4_access_list(CiscoXrParser.Ipv4_access_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ipv6_access_list}.
	 * @param ctx the parse tree
	 */
	void enterIpv6_access_list(CiscoXrParser.Ipv6_access_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ipv6_access_list}.
	 * @param ctx the parse tree
	 */
	void exitIpv6_access_list(CiscoXrParser.Ipv6_access_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#no_ipv4_access_list}.
	 * @param ctx the parse tree
	 */
	void enterNo_ipv4_access_list(CiscoXrParser.No_ipv4_access_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#no_ipv4_access_list}.
	 * @param ctx the parse tree
	 */
	void exitNo_ipv4_access_list(CiscoXrParser.No_ipv4_access_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#no_ipv6_access_list}.
	 * @param ctx the parse tree
	 */
	void enterNo_ipv6_access_list(CiscoXrParser.No_ipv6_access_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#no_ipv6_access_list}.
	 * @param ctx the parse tree
	 */
	void exitNo_ipv6_access_list(CiscoXrParser.No_ipv6_access_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#access_list_ip_range}.
	 * @param ctx the parse tree
	 */
	void enterAccess_list_ip_range(CiscoXrParser.Access_list_ip_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#access_list_ip_range}.
	 * @param ctx the parse tree
	 */
	void exitAccess_list_ip_range(CiscoXrParser.Access_list_ip_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#access_list_ip6_range}.
	 * @param ctx the parse tree
	 */
	void enterAccess_list_ip6_range(CiscoXrParser.Access_list_ip6_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#access_list_ip6_range}.
	 * @param ctx the parse tree
	 */
	void exitAccess_list_ip6_range(CiscoXrParser.Access_list_ip6_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#access_list_mac_range}.
	 * @param ctx the parse tree
	 */
	void enterAccess_list_mac_range(CiscoXrParser.Access_list_mac_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#access_list_mac_range}.
	 * @param ctx the parse tree
	 */
	void exitAccess_list_mac_range(CiscoXrParser.Access_list_mac_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#appletalk_access_list_null_tail}.
	 * @param ctx the parse tree
	 */
	void enterAppletalk_access_list_null_tail(CiscoXrParser.Appletalk_access_list_null_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#appletalk_access_list_null_tail}.
	 * @param ctx the parse tree
	 */
	void exitAppletalk_access_list_null_tail(CiscoXrParser.Appletalk_access_list_null_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#appletalk_access_list_stanza}.
	 * @param ctx the parse tree
	 */
	void enterAppletalk_access_list_stanza(CiscoXrParser.Appletalk_access_list_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#appletalk_access_list_stanza}.
	 * @param ctx the parse tree
	 */
	void exitAppletalk_access_list_stanza(CiscoXrParser.Appletalk_access_list_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#as_path_set_elem}.
	 * @param ctx the parse tree
	 */
	void enterAs_path_set_elem(CiscoXrParser.As_path_set_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#as_path_set_elem}.
	 * @param ctx the parse tree
	 */
	void exitAs_path_set_elem(CiscoXrParser.As_path_set_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aspse_ios_regex}.
	 * @param ctx the parse tree
	 */
	void enterAspse_ios_regex(CiscoXrParser.Aspse_ios_regexContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aspse_ios_regex}.
	 * @param ctx the parse tree
	 */
	void exitAspse_ios_regex(CiscoXrParser.Aspse_ios_regexContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aspse_passes_through}.
	 * @param ctx the parse tree
	 */
	void enterAspse_passes_through(CiscoXrParser.Aspse_passes_throughContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aspse_passes_through}.
	 * @param ctx the parse tree
	 */
	void exitAspse_passes_through(CiscoXrParser.Aspse_passes_throughContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#as_path_set_stanza}.
	 * @param ctx the parse tree
	 */
	void enterAs_path_set_stanza(CiscoXrParser.As_path_set_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#as_path_set_stanza}.
	 * @param ctx the parse tree
	 */
	void exitAs_path_set_stanza(CiscoXrParser.As_path_set_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#bandwidth_irs_stanza}.
	 * @param ctx the parse tree
	 */
	void enterBandwidth_irs_stanza(CiscoXrParser.Bandwidth_irs_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#bandwidth_irs_stanza}.
	 * @param ctx the parse tree
	 */
	void exitBandwidth_irs_stanza(CiscoXrParser.Bandwidth_irs_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#community_set_stanza}.
	 * @param ctx the parse tree
	 */
	void enterCommunity_set_stanza(CiscoXrParser.Community_set_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#community_set_stanza}.
	 * @param ctx the parse tree
	 */
	void exitCommunity_set_stanza(CiscoXrParser.Community_set_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#community_set_elem_list}.
	 * @param ctx the parse tree
	 */
	void enterCommunity_set_elem_list(CiscoXrParser.Community_set_elem_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#community_set_elem_list}.
	 * @param ctx the parse tree
	 */
	void exitCommunity_set_elem_list(CiscoXrParser.Community_set_elem_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#etype}.
	 * @param ctx the parse tree
	 */
	void enterEtype(CiscoXrParser.EtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#etype}.
	 * @param ctx the parse tree
	 */
	void exitEtype(CiscoXrParser.EtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#extended_access_list_additional_feature}.
	 * @param ctx the parse tree
	 */
	void enterExtended_access_list_additional_feature(CiscoXrParser.Extended_access_list_additional_featureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#extended_access_list_additional_feature}.
	 * @param ctx the parse tree
	 */
	void exitExtended_access_list_additional_feature(CiscoXrParser.Extended_access_list_additional_featureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#eacl_feature_udf}.
	 * @param ctx the parse tree
	 */
	void enterEacl_feature_udf(CiscoXrParser.Eacl_feature_udfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#eacl_feature_udf}.
	 * @param ctx the parse tree
	 */
	void exitEacl_feature_udf(CiscoXrParser.Eacl_feature_udfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#extended_access_list_null_tail}.
	 * @param ctx the parse tree
	 */
	void enterExtended_access_list_null_tail(CiscoXrParser.Extended_access_list_null_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#extended_access_list_null_tail}.
	 * @param ctx the parse tree
	 */
	void exitExtended_access_list_null_tail(CiscoXrParser.Extended_access_list_null_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#extended_access_list_tail}.
	 * @param ctx the parse tree
	 */
	void enterExtended_access_list_tail(CiscoXrParser.Extended_access_list_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#extended_access_list_tail}.
	 * @param ctx the parse tree
	 */
	void exitExtended_access_list_tail(CiscoXrParser.Extended_access_list_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#extended_ipv6_access_list_tail}.
	 * @param ctx the parse tree
	 */
	void enterExtended_ipv6_access_list_tail(CiscoXrParser.Extended_ipv6_access_list_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#extended_ipv6_access_list_tail}.
	 * @param ctx the parse tree
	 */
	void exitExtended_ipv6_access_list_tail(CiscoXrParser.Extended_ipv6_access_list_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#interface_rs_stanza}.
	 * @param ctx the parse tree
	 */
	void enterInterface_rs_stanza(CiscoXrParser.Interface_rs_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#interface_rs_stanza}.
	 * @param ctx the parse tree
	 */
	void exitInterface_rs_stanza(CiscoXrParser.Interface_rs_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ip_prefix_list_stanza}.
	 * @param ctx the parse tree
	 */
	void enterIp_prefix_list_stanza(CiscoXrParser.Ip_prefix_list_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ip_prefix_list_stanza}.
	 * @param ctx the parse tree
	 */
	void exitIp_prefix_list_stanza(CiscoXrParser.Ip_prefix_list_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ipv6_prefix_list_stanza}.
	 * @param ctx the parse tree
	 */
	void enterIpv6_prefix_list_stanza(CiscoXrParser.Ipv6_prefix_list_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ipv6_prefix_list_stanza}.
	 * @param ctx the parse tree
	 */
	void exitIpv6_prefix_list_stanza(CiscoXrParser.Ipv6_prefix_list_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ip_prefix_list_null_tail}.
	 * @param ctx the parse tree
	 */
	void enterIp_prefix_list_null_tail(CiscoXrParser.Ip_prefix_list_null_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ip_prefix_list_null_tail}.
	 * @param ctx the parse tree
	 */
	void exitIp_prefix_list_null_tail(CiscoXrParser.Ip_prefix_list_null_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ip_prefix_list_tail}.
	 * @param ctx the parse tree
	 */
	void enterIp_prefix_list_tail(CiscoXrParser.Ip_prefix_list_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ip_prefix_list_tail}.
	 * @param ctx the parse tree
	 */
	void exitIp_prefix_list_tail(CiscoXrParser.Ip_prefix_list_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ipacleth_line}.
	 * @param ctx the parse tree
	 */
	void enterIpacleth_line(CiscoXrParser.Ipacleth_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ipacleth_line}.
	 * @param ctx the parse tree
	 */
	void exitIpacleth_line(CiscoXrParser.Ipacleth_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ipacleth_range}.
	 * @param ctx the parse tree
	 */
	void enterIpacleth_range(CiscoXrParser.Ipacleth_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ipacleth_range}.
	 * @param ctx the parse tree
	 */
	void exitIpacleth_range(CiscoXrParser.Ipacleth_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ipaclsession_ip_range}.
	 * @param ctx the parse tree
	 */
	void enterIpaclsession_ip_range(CiscoXrParser.Ipaclsession_ip_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ipaclsession_ip_range}.
	 * @param ctx the parse tree
	 */
	void exitIpaclsession_ip_range(CiscoXrParser.Ipaclsession_ip_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ipaclsession_ip6_range}.
	 * @param ctx the parse tree
	 */
	void enterIpaclsession_ip6_range(CiscoXrParser.Ipaclsession_ip6_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ipaclsession_ip6_range}.
	 * @param ctx the parse tree
	 */
	void exitIpaclsession_ip6_range(CiscoXrParser.Ipaclsession_ip6_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ipv6_prefix_list_tail}.
	 * @param ctx the parse tree
	 */
	void enterIpv6_prefix_list_tail(CiscoXrParser.Ipv6_prefix_list_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ipv6_prefix_list_tail}.
	 * @param ctx the parse tree
	 */
	void exitIpv6_prefix_list_tail(CiscoXrParser.Ipv6_prefix_list_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ipx_sap_access_list_null_tail}.
	 * @param ctx the parse tree
	 */
	void enterIpx_sap_access_list_null_tail(CiscoXrParser.Ipx_sap_access_list_null_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ipx_sap_access_list_null_tail}.
	 * @param ctx the parse tree
	 */
	void exitIpx_sap_access_list_null_tail(CiscoXrParser.Ipx_sap_access_list_null_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ipx_sap_access_list_stanza}.
	 * @param ctx the parse tree
	 */
	void enterIpx_sap_access_list_stanza(CiscoXrParser.Ipx_sap_access_list_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ipx_sap_access_list_stanza}.
	 * @param ctx the parse tree
	 */
	void exitIpx_sap_access_list_stanza(CiscoXrParser.Ipx_sap_access_list_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#irs_stanza}.
	 * @param ctx the parse tree
	 */
	void enterIrs_stanza(CiscoXrParser.Irs_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#irs_stanza}.
	 * @param ctx the parse tree
	 */
	void exitIrs_stanza(CiscoXrParser.Irs_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#mac_access_list_additional_feature}.
	 * @param ctx the parse tree
	 */
	void enterMac_access_list_additional_feature(CiscoXrParser.Mac_access_list_additional_featureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#mac_access_list_additional_feature}.
	 * @param ctx the parse tree
	 */
	void exitMac_access_list_additional_feature(CiscoXrParser.Mac_access_list_additional_featureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#netdestination_description}.
	 * @param ctx the parse tree
	 */
	void enterNetdestination_description(CiscoXrParser.Netdestination_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#netdestination_description}.
	 * @param ctx the parse tree
	 */
	void exitNetdestination_description(CiscoXrParser.Netdestination_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#netdestination_host}.
	 * @param ctx the parse tree
	 */
	void enterNetdestination_host(CiscoXrParser.Netdestination_hostContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#netdestination_host}.
	 * @param ctx the parse tree
	 */
	void exitNetdestination_host(CiscoXrParser.Netdestination_hostContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#netdestination_invert}.
	 * @param ctx the parse tree
	 */
	void enterNetdestination_invert(CiscoXrParser.Netdestination_invertContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#netdestination_invert}.
	 * @param ctx the parse tree
	 */
	void exitNetdestination_invert(CiscoXrParser.Netdestination_invertContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#netdestination_name}.
	 * @param ctx the parse tree
	 */
	void enterNetdestination_name(CiscoXrParser.Netdestination_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#netdestination_name}.
	 * @param ctx the parse tree
	 */
	void exitNetdestination_name(CiscoXrParser.Netdestination_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#netdestination_network}.
	 * @param ctx the parse tree
	 */
	void enterNetdestination_network(CiscoXrParser.Netdestination_networkContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#netdestination_network}.
	 * @param ctx the parse tree
	 */
	void exitNetdestination_network(CiscoXrParser.Netdestination_networkContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#netdestination6_description}.
	 * @param ctx the parse tree
	 */
	void enterNetdestination6_description(CiscoXrParser.Netdestination6_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#netdestination6_description}.
	 * @param ctx the parse tree
	 */
	void exitNetdestination6_description(CiscoXrParser.Netdestination6_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#netdestination6_host}.
	 * @param ctx the parse tree
	 */
	void enterNetdestination6_host(CiscoXrParser.Netdestination6_hostContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#netdestination6_host}.
	 * @param ctx the parse tree
	 */
	void exitNetdestination6_host(CiscoXrParser.Netdestination6_hostContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#netdestination6_invert}.
	 * @param ctx the parse tree
	 */
	void enterNetdestination6_invert(CiscoXrParser.Netdestination6_invertContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#netdestination6_invert}.
	 * @param ctx the parse tree
	 */
	void exitNetdestination6_invert(CiscoXrParser.Netdestination6_invertContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#netdestination6_name}.
	 * @param ctx the parse tree
	 */
	void enterNetdestination6_name(CiscoXrParser.Netdestination6_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#netdestination6_name}.
	 * @param ctx the parse tree
	 */
	void exitNetdestination6_name(CiscoXrParser.Netdestination6_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#netdestination6_network}.
	 * @param ctx the parse tree
	 */
	void enterNetdestination6_network(CiscoXrParser.Netdestination6_networkContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#netdestination6_network}.
	 * @param ctx the parse tree
	 */
	void exitNetdestination6_network(CiscoXrParser.Netdestination6_networkContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#netservice_icmpv6_specifier}.
	 * @param ctx the parse tree
	 */
	void enterNetservice_icmpv6_specifier(CiscoXrParser.Netservice_icmpv6_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#netservice_icmpv6_specifier}.
	 * @param ctx the parse tree
	 */
	void exitNetservice_icmpv6_specifier(CiscoXrParser.Netservice_icmpv6_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#netservice_port_specifier}.
	 * @param ctx the parse tree
	 */
	void enterNetservice_port_specifier(CiscoXrParser.Netservice_port_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#netservice_port_specifier}.
	 * @param ctx the parse tree
	 */
	void exitNetservice_port_specifier(CiscoXrParser.Netservice_port_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#no_ip_prefix_list_stanza}.
	 * @param ctx the parse tree
	 */
	void enterNo_ip_prefix_list_stanza(CiscoXrParser.No_ip_prefix_list_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#no_ip_prefix_list_stanza}.
	 * @param ctx the parse tree
	 */
	void exitNo_ip_prefix_list_stanza(CiscoXrParser.No_ip_prefix_list_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#null_as_path_regex}.
	 * @param ctx the parse tree
	 */
	void enterNull_as_path_regex(CiscoXrParser.Null_as_path_regexContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#null_as_path_regex}.
	 * @param ctx the parse tree
	 */
	void exitNull_as_path_regex(CiscoXrParser.Null_as_path_regexContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#null_irs_stanza}.
	 * @param ctx the parse tree
	 */
	void enterNull_irs_stanza(CiscoXrParser.Null_irs_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#null_irs_stanza}.
	 * @param ctx the parse tree
	 */
	void exitNull_irs_stanza(CiscoXrParser.Null_irs_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#null_rs_stanza}.
	 * @param ctx the parse tree
	 */
	void enterNull_rs_stanza(CiscoXrParser.Null_rs_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#null_rs_stanza}.
	 * @param ctx the parse tree
	 */
	void exitNull_rs_stanza(CiscoXrParser.Null_rs_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#prefix_set_stanza}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_set_stanza(CiscoXrParser.Prefix_set_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#prefix_set_stanza}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_set_stanza(CiscoXrParser.Prefix_set_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#prefix_set_elem_list}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_set_elem_list(CiscoXrParser.Prefix_set_elem_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#prefix_set_elem_list}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_set_elem_list(CiscoXrParser.Prefix_set_elem_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#protocol_type_code_access_list_null_tail}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_type_code_access_list_null_tail(CiscoXrParser.Protocol_type_code_access_list_null_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#protocol_type_code_access_list_null_tail}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_type_code_access_list_null_tail(CiscoXrParser.Protocol_type_code_access_list_null_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#protocol_type_code_access_list_stanza}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_type_code_access_list_stanza(CiscoXrParser.Protocol_type_code_access_list_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#protocol_type_code_access_list_stanza}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_type_code_access_list_stanza(CiscoXrParser.Protocol_type_code_access_list_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#rs_stanza}.
	 * @param ctx the parse tree
	 */
	void enterRs_stanza(CiscoXrParser.Rs_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#rs_stanza}.
	 * @param ctx the parse tree
	 */
	void exitRs_stanza(CiscoXrParser.Rs_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#rsvp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterRsvp_stanza(CiscoXrParser.Rsvp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#rsvp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitRsvp_stanza(CiscoXrParser.Rsvp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_arp_access_list_extended}.
	 * @param ctx the parse tree
	 */
	void enterS_arp_access_list_extended(CiscoXrParser.S_arp_access_list_extendedContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_arp_access_list_extended}.
	 * @param ctx the parse tree
	 */
	void exitS_arp_access_list_extended(CiscoXrParser.S_arp_access_list_extendedContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_arp_access_list_extended_tail}.
	 * @param ctx the parse tree
	 */
	void enterS_arp_access_list_extended_tail(CiscoXrParser.S_arp_access_list_extended_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_arp_access_list_extended_tail}.
	 * @param ctx the parse tree
	 */
	void exitS_arp_access_list_extended_tail(CiscoXrParser.S_arp_access_list_extended_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_ethernet_services}.
	 * @param ctx the parse tree
	 */
	void enterS_ethernet_services(CiscoXrParser.S_ethernet_servicesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_ethernet_services}.
	 * @param ctx the parse tree
	 */
	void exitS_ethernet_services(CiscoXrParser.S_ethernet_servicesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_ethernet_services_tail}.
	 * @param ctx the parse tree
	 */
	void enterS_ethernet_services_tail(CiscoXrParser.S_ethernet_services_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_ethernet_services_tail}.
	 * @param ctx the parse tree
	 */
	void exitS_ethernet_services_tail(CiscoXrParser.S_ethernet_services_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_ip_access_list_eth}.
	 * @param ctx the parse tree
	 */
	void enterS_ip_access_list_eth(CiscoXrParser.S_ip_access_list_ethContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_ip_access_list_eth}.
	 * @param ctx the parse tree
	 */
	void exitS_ip_access_list_eth(CiscoXrParser.S_ip_access_list_ethContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_mac_access_list}.
	 * @param ctx the parse tree
	 */
	void enterS_mac_access_list(CiscoXrParser.S_mac_access_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_mac_access_list}.
	 * @param ctx the parse tree
	 */
	void exitS_mac_access_list(CiscoXrParser.S_mac_access_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_mac_access_list_extended}.
	 * @param ctx the parse tree
	 */
	void enterS_mac_access_list_extended(CiscoXrParser.S_mac_access_list_extendedContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_mac_access_list_extended}.
	 * @param ctx the parse tree
	 */
	void exitS_mac_access_list_extended(CiscoXrParser.S_mac_access_list_extendedContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_mac_access_list_extended_tail}.
	 * @param ctx the parse tree
	 */
	void enterS_mac_access_list_extended_tail(CiscoXrParser.S_mac_access_list_extended_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_mac_access_list_extended_tail}.
	 * @param ctx the parse tree
	 */
	void exitS_mac_access_list_extended_tail(CiscoXrParser.S_mac_access_list_extended_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_netdestination}.
	 * @param ctx the parse tree
	 */
	void enterS_netdestination(CiscoXrParser.S_netdestinationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_netdestination}.
	 * @param ctx the parse tree
	 */
	void exitS_netdestination(CiscoXrParser.S_netdestinationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_netdestination6}.
	 * @param ctx the parse tree
	 */
	void enterS_netdestination6(CiscoXrParser.S_netdestination6Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_netdestination6}.
	 * @param ctx the parse tree
	 */
	void exitS_netdestination6(CiscoXrParser.S_netdestination6Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_netservice}.
	 * @param ctx the parse tree
	 */
	void enterS_netservice(CiscoXrParser.S_netserviceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_netservice}.
	 * @param ctx the parse tree
	 */
	void exitS_netservice(CiscoXrParser.S_netserviceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#variable_community_list}.
	 * @param ctx the parse tree
	 */
	void enterVariable_community_list(CiscoXrParser.Variable_community_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#variable_community_list}.
	 * @param ctx the parse tree
	 */
	void exitVariable_community_list(CiscoXrParser.Variable_community_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#xr_mac_specifier}.
	 * @param ctx the parse tree
	 */
	void enterXr_mac_specifier(CiscoXrParser.Xr_mac_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#xr_mac_specifier}.
	 * @param ctx the parse tree
	 */
	void exitXr_mac_specifier(CiscoXrParser.Xr_mac_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#activate_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterActivate_bgp_tail(CiscoXrParser.Activate_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#activate_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitActivate_bgp_tail(CiscoXrParser.Activate_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#address_family_header}.
	 * @param ctx the parse tree
	 */
	void enterAddress_family_header(CiscoXrParser.Address_family_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#address_family_header}.
	 * @param ctx the parse tree
	 */
	void exitAddress_family_header(CiscoXrParser.Address_family_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#bgp_address_family}.
	 * @param ctx the parse tree
	 */
	void enterBgp_address_family(CiscoXrParser.Bgp_address_familyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#bgp_address_family}.
	 * @param ctx the parse tree
	 */
	void exitBgp_address_family(CiscoXrParser.Bgp_address_familyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#address_family_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void enterAddress_family_rb_stanza(CiscoXrParser.Address_family_rb_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#address_family_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void exitAddress_family_rb_stanza(CiscoXrParser.Address_family_rb_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#address_family_enable_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void enterAddress_family_enable_rb_stanza(CiscoXrParser.Address_family_enable_rb_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#address_family_enable_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void exitAddress_family_enable_rb_stanza(CiscoXrParser.Address_family_enable_rb_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#af_group_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void enterAf_group_rb_stanza(CiscoXrParser.Af_group_rb_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#af_group_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void exitAf_group_rb_stanza(CiscoXrParser.Af_group_rb_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#aggregate_address_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_address_rb_stanza(CiscoXrParser.Aggregate_address_rb_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#aggregate_address_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_address_rb_stanza(CiscoXrParser.Aggregate_address_rb_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#additional_paths_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void enterAdditional_paths_rb_stanza(CiscoXrParser.Additional_paths_rb_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#additional_paths_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void exitAdditional_paths_rb_stanza(CiscoXrParser.Additional_paths_rb_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#additional_paths_receive_xr_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void enterAdditional_paths_receive_xr_rb_stanza(CiscoXrParser.Additional_paths_receive_xr_rb_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#additional_paths_receive_xr_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void exitAdditional_paths_receive_xr_rb_stanza(CiscoXrParser.Additional_paths_receive_xr_rb_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#additional_paths_selection_xr_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void enterAdditional_paths_selection_xr_rb_stanza(CiscoXrParser.Additional_paths_selection_xr_rb_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#additional_paths_selection_xr_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void exitAdditional_paths_selection_xr_rb_stanza(CiscoXrParser.Additional_paths_selection_xr_rb_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#additional_paths_send_xr_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void enterAdditional_paths_send_xr_rb_stanza(CiscoXrParser.Additional_paths_send_xr_rb_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#additional_paths_send_xr_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void exitAdditional_paths_send_xr_rb_stanza(CiscoXrParser.Additional_paths_send_xr_rb_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#advertise_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterAdvertise_bgp_tail(CiscoXrParser.Advertise_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#advertise_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitAdvertise_bgp_tail(CiscoXrParser.Advertise_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#allowas_in_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterAllowas_in_bgp_tail(CiscoXrParser.Allowas_in_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#allowas_in_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitAllowas_in_bgp_tail(CiscoXrParser.Allowas_in_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#always_compare_med_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void enterAlways_compare_med_rb_stanza(CiscoXrParser.Always_compare_med_rb_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#always_compare_med_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void exitAlways_compare_med_rb_stanza(CiscoXrParser.Always_compare_med_rb_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#as_override_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterAs_override_bgp_tail(CiscoXrParser.As_override_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#as_override_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitAs_override_bgp_tail(CiscoXrParser.As_override_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#as_path_multipath_relax_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void enterAs_path_multipath_relax_rb_stanza(CiscoXrParser.As_path_multipath_relax_rb_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#as_path_multipath_relax_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void exitAs_path_multipath_relax_rb_stanza(CiscoXrParser.As_path_multipath_relax_rb_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#auto_summary_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterAuto_summary_bgp_tail(CiscoXrParser.Auto_summary_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#auto_summary_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitAuto_summary_bgp_tail(CiscoXrParser.Auto_summary_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#bgp_advertise_inactive_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void enterBgp_advertise_inactive_rb_stanza(CiscoXrParser.Bgp_advertise_inactive_rb_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#bgp_advertise_inactive_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void exitBgp_advertise_inactive_rb_stanza(CiscoXrParser.Bgp_advertise_inactive_rb_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#bgp_confederation_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void enterBgp_confederation_rb_stanza(CiscoXrParser.Bgp_confederation_rb_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#bgp_confederation_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void exitBgp_confederation_rb_stanza(CiscoXrParser.Bgp_confederation_rb_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#bgp_listen_range_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void enterBgp_listen_range_rb_stanza(CiscoXrParser.Bgp_listen_range_rb_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#bgp_listen_range_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void exitBgp_listen_range_rb_stanza(CiscoXrParser.Bgp_listen_range_rb_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#bgp_maxas_limit_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void enterBgp_maxas_limit_rb_stanza(CiscoXrParser.Bgp_maxas_limit_rb_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#bgp_maxas_limit_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void exitBgp_maxas_limit_rb_stanza(CiscoXrParser.Bgp_maxas_limit_rb_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#bgp_redistribute_internal_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void enterBgp_redistribute_internal_rb_stanza(CiscoXrParser.Bgp_redistribute_internal_rb_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#bgp_redistribute_internal_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void exitBgp_redistribute_internal_rb_stanza(CiscoXrParser.Bgp_redistribute_internal_rb_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#bgp_scan_time_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterBgp_scan_time_bgp_tail(CiscoXrParser.Bgp_scan_time_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#bgp_scan_time_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitBgp_scan_time_bgp_tail(CiscoXrParser.Bgp_scan_time_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterBgp_tail(CiscoXrParser.Bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitBgp_tail(CiscoXrParser.Bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cluster_id_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterCluster_id_bgp_tail(CiscoXrParser.Cluster_id_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cluster_id_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitCluster_id_bgp_tail(CiscoXrParser.Cluster_id_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cluster_id_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void enterCluster_id_rb_stanza(CiscoXrParser.Cluster_id_rb_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cluster_id_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void exitCluster_id_rb_stanza(CiscoXrParser.Cluster_id_rb_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#compare_routerid_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void enterCompare_routerid_rb_stanza(CiscoXrParser.Compare_routerid_rb_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#compare_routerid_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void exitCompare_routerid_rb_stanza(CiscoXrParser.Compare_routerid_rb_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#default_information_originate_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void enterDefault_information_originate_rb_stanza(CiscoXrParser.Default_information_originate_rb_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#default_information_originate_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void exitDefault_information_originate_rb_stanza(CiscoXrParser.Default_information_originate_rb_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#default_metric_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterDefault_metric_bgp_tail(CiscoXrParser.Default_metric_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#default_metric_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitDefault_metric_bgp_tail(CiscoXrParser.Default_metric_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#default_originate_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterDefault_originate_bgp_tail(CiscoXrParser.Default_originate_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#default_originate_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitDefault_originate_bgp_tail(CiscoXrParser.Default_originate_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#default_shutdown_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterDefault_shutdown_bgp_tail(CiscoXrParser.Default_shutdown_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#default_shutdown_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitDefault_shutdown_bgp_tail(CiscoXrParser.Default_shutdown_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#description_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterDescription_bgp_tail(CiscoXrParser.Description_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#description_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitDescription_bgp_tail(CiscoXrParser.Description_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#distribute_list_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterDistribute_list_bgp_tail(CiscoXrParser.Distribute_list_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#distribute_list_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitDistribute_list_bgp_tail(CiscoXrParser.Distribute_list_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ebgp_multihop_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterEbgp_multihop_bgp_tail(CiscoXrParser.Ebgp_multihop_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ebgp_multihop_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitEbgp_multihop_bgp_tail(CiscoXrParser.Ebgp_multihop_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#empty_neighbor_block_address_family}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_neighbor_block_address_family(CiscoXrParser.Empty_neighbor_block_address_familyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#empty_neighbor_block_address_family}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_neighbor_block_address_family(CiscoXrParser.Empty_neighbor_block_address_familyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#inherit_peer_policy_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterInherit_peer_policy_bgp_tail(CiscoXrParser.Inherit_peer_policy_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#inherit_peer_policy_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitInherit_peer_policy_bgp_tail(CiscoXrParser.Inherit_peer_policy_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#inherit_peer_session_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterInherit_peer_session_bgp_tail(CiscoXrParser.Inherit_peer_session_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#inherit_peer_session_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitInherit_peer_session_bgp_tail(CiscoXrParser.Inherit_peer_session_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#local_as_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterLocal_as_bgp_tail(CiscoXrParser.Local_as_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#local_as_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitLocal_as_bgp_tail(CiscoXrParser.Local_as_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#maximum_peers_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterMaximum_peers_bgp_tail(CiscoXrParser.Maximum_peers_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#maximum_peers_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitMaximum_peers_bgp_tail(CiscoXrParser.Maximum_peers_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#maximum_paths_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterMaximum_paths_bgp_tail(CiscoXrParser.Maximum_paths_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#maximum_paths_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitMaximum_paths_bgp_tail(CiscoXrParser.Maximum_paths_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#maximum_prefix_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterMaximum_prefix_bgp_tail(CiscoXrParser.Maximum_prefix_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#maximum_prefix_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitMaximum_prefix_bgp_tail(CiscoXrParser.Maximum_prefix_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#neighbor_block_address_family}.
	 * @param ctx the parse tree
	 */
	void enterNeighbor_block_address_family(CiscoXrParser.Neighbor_block_address_familyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#neighbor_block_address_family}.
	 * @param ctx the parse tree
	 */
	void exitNeighbor_block_address_family(CiscoXrParser.Neighbor_block_address_familyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#neighbor_block_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void enterNeighbor_block_rb_stanza(CiscoXrParser.Neighbor_block_rb_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#neighbor_block_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void exitNeighbor_block_rb_stanza(CiscoXrParser.Neighbor_block_rb_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#neighbor_group_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void enterNeighbor_group_rb_stanza(CiscoXrParser.Neighbor_group_rb_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#neighbor_group_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void exitNeighbor_group_rb_stanza(CiscoXrParser.Neighbor_group_rb_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#network_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterNetwork_bgp_tail(CiscoXrParser.Network_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#network_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitNetwork_bgp_tail(CiscoXrParser.Network_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#network6_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterNetwork6_bgp_tail(CiscoXrParser.Network6_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#network6_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitNetwork6_bgp_tail(CiscoXrParser.Network6_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#next_hop_self_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterNext_hop_self_bgp_tail(CiscoXrParser.Next_hop_self_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#next_hop_self_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitNext_hop_self_bgp_tail(CiscoXrParser.Next_hop_self_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#vrf_block_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void enterVrf_block_rb_stanza(CiscoXrParser.Vrf_block_rb_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#vrf_block_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void exitVrf_block_rb_stanza(CiscoXrParser.Vrf_block_rb_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#no_bgp_enforce_first_as_stanza}.
	 * @param ctx the parse tree
	 */
	void enterNo_bgp_enforce_first_as_stanza(CiscoXrParser.No_bgp_enforce_first_as_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#no_bgp_enforce_first_as_stanza}.
	 * @param ctx the parse tree
	 */
	void exitNo_bgp_enforce_first_as_stanza(CiscoXrParser.No_bgp_enforce_first_as_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#no_neighbor_activate_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void enterNo_neighbor_activate_rb_stanza(CiscoXrParser.No_neighbor_activate_rb_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#no_neighbor_activate_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void exitNo_neighbor_activate_rb_stanza(CiscoXrParser.No_neighbor_activate_rb_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#no_neighbor_shutdown_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void enterNo_neighbor_shutdown_rb_stanza(CiscoXrParser.No_neighbor_shutdown_rb_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#no_neighbor_shutdown_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void exitNo_neighbor_shutdown_rb_stanza(CiscoXrParser.No_neighbor_shutdown_rb_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#no_network_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterNo_network_bgp_tail(CiscoXrParser.No_network_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#no_network_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitNo_network_bgp_tail(CiscoXrParser.No_network_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#no_redistribute_connected_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void enterNo_redistribute_connected_rb_stanza(CiscoXrParser.No_redistribute_connected_rb_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#no_redistribute_connected_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void exitNo_redistribute_connected_rb_stanza(CiscoXrParser.No_redistribute_connected_rb_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#no_shutdown_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void enterNo_shutdown_rb_stanza(CiscoXrParser.No_shutdown_rb_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#no_shutdown_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void exitNo_shutdown_rb_stanza(CiscoXrParser.No_shutdown_rb_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#null_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterNull_bgp_tail(CiscoXrParser.Null_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#null_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitNull_bgp_tail(CiscoXrParser.Null_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#null_no_neighbor_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void enterNull_no_neighbor_rb_stanza(CiscoXrParser.Null_no_neighbor_rb_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#null_no_neighbor_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void exitNull_no_neighbor_rb_stanza(CiscoXrParser.Null_no_neighbor_rb_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#peer_group_assignment_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void enterPeer_group_assignment_rb_stanza(CiscoXrParser.Peer_group_assignment_rb_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#peer_group_assignment_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void exitPeer_group_assignment_rb_stanza(CiscoXrParser.Peer_group_assignment_rb_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#peer_group_creation_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void enterPeer_group_creation_rb_stanza(CiscoXrParser.Peer_group_creation_rb_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#peer_group_creation_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void exitPeer_group_creation_rb_stanza(CiscoXrParser.Peer_group_creation_rb_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#prefix_list_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_list_bgp_tail(CiscoXrParser.Prefix_list_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#prefix_list_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_list_bgp_tail(CiscoXrParser.Prefix_list_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#remote_as_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterRemote_as_bgp_tail(CiscoXrParser.Remote_as_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#remote_as_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitRemote_as_bgp_tail(CiscoXrParser.Remote_as_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#remove_private_as_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterRemove_private_as_bgp_tail(CiscoXrParser.Remove_private_as_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#remove_private_as_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitRemove_private_as_bgp_tail(CiscoXrParser.Remove_private_as_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#route_policy_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterRoute_policy_bgp_tail(CiscoXrParser.Route_policy_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#route_policy_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitRoute_policy_bgp_tail(CiscoXrParser.Route_policy_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#route_reflector_client_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterRoute_reflector_client_bgp_tail(CiscoXrParser.Route_reflector_client_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#route_reflector_client_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitRoute_reflector_client_bgp_tail(CiscoXrParser.Route_reflector_client_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#redistribute_aggregate_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterRedistribute_aggregate_bgp_tail(CiscoXrParser.Redistribute_aggregate_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#redistribute_aggregate_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitRedistribute_aggregate_bgp_tail(CiscoXrParser.Redistribute_aggregate_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#redistribute_connected_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterRedistribute_connected_bgp_tail(CiscoXrParser.Redistribute_connected_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#redistribute_connected_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitRedistribute_connected_bgp_tail(CiscoXrParser.Redistribute_connected_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#redistribute_eigrp_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterRedistribute_eigrp_bgp_tail(CiscoXrParser.Redistribute_eigrp_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#redistribute_eigrp_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitRedistribute_eigrp_bgp_tail(CiscoXrParser.Redistribute_eigrp_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#redistribute_ospf_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterRedistribute_ospf_bgp_tail(CiscoXrParser.Redistribute_ospf_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#redistribute_ospf_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitRedistribute_ospf_bgp_tail(CiscoXrParser.Redistribute_ospf_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#redistribute_ospfv3_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterRedistribute_ospfv3_bgp_tail(CiscoXrParser.Redistribute_ospfv3_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#redistribute_ospfv3_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitRedistribute_ospfv3_bgp_tail(CiscoXrParser.Redistribute_ospfv3_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#redistribute_rip_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterRedistribute_rip_bgp_tail(CiscoXrParser.Redistribute_rip_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#redistribute_rip_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitRedistribute_rip_bgp_tail(CiscoXrParser.Redistribute_rip_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#redistribute_static_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterRedistribute_static_bgp_tail(CiscoXrParser.Redistribute_static_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#redistribute_static_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitRedistribute_static_bgp_tail(CiscoXrParser.Redistribute_static_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#router_bgp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterRouter_bgp_stanza(CiscoXrParser.Router_bgp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#router_bgp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitRouter_bgp_stanza(CiscoXrParser.Router_bgp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#router_bgp_stanza_tail}.
	 * @param ctx the parse tree
	 */
	void enterRouter_bgp_stanza_tail(CiscoXrParser.Router_bgp_stanza_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#router_bgp_stanza_tail}.
	 * @param ctx the parse tree
	 */
	void exitRouter_bgp_stanza_tail(CiscoXrParser.Router_bgp_stanza_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#router_id_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterRouter_id_bgp_tail(CiscoXrParser.Router_id_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#router_id_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitRouter_id_bgp_tail(CiscoXrParser.Router_id_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#router_id_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void enterRouter_id_rb_stanza(CiscoXrParser.Router_id_rb_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#router_id_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void exitRouter_id_rb_stanza(CiscoXrParser.Router_id_rb_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#send_community_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterSend_community_bgp_tail(CiscoXrParser.Send_community_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#send_community_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitSend_community_bgp_tail(CiscoXrParser.Send_community_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#session_group_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void enterSession_group_rb_stanza(CiscoXrParser.Session_group_rb_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#session_group_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void exitSession_group_rb_stanza(CiscoXrParser.Session_group_rb_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#shutdown_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterShutdown_bgp_tail(CiscoXrParser.Shutdown_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#shutdown_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitShutdown_bgp_tail(CiscoXrParser.Shutdown_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#subnet_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterSubnet_bgp_tail(CiscoXrParser.Subnet_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#subnet_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitSubnet_bgp_tail(CiscoXrParser.Subnet_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#template_peer_address_family}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_peer_address_family(CiscoXrParser.Template_peer_address_familyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#template_peer_address_family}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_peer_address_family(CiscoXrParser.Template_peer_address_familyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#template_peer_policy_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_peer_policy_rb_stanza(CiscoXrParser.Template_peer_policy_rb_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#template_peer_policy_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_peer_policy_rb_stanza(CiscoXrParser.Template_peer_policy_rb_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#template_peer_session_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_peer_session_rb_stanza(CiscoXrParser.Template_peer_session_rb_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#template_peer_session_rb_stanza}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_peer_session_rb_stanza(CiscoXrParser.Template_peer_session_rb_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#update_source_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_source_bgp_tail(CiscoXrParser.Update_source_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#update_source_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_source_bgp_tail(CiscoXrParser.Update_source_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#use_af_group_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterUse_af_group_bgp_tail(CiscoXrParser.Use_af_group_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#use_af_group_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitUse_af_group_bgp_tail(CiscoXrParser.Use_af_group_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#use_neighbor_group_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterUse_neighbor_group_bgp_tail(CiscoXrParser.Use_neighbor_group_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#use_neighbor_group_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitUse_neighbor_group_bgp_tail(CiscoXrParser.Use_neighbor_group_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#use_session_group_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterUse_session_group_bgp_tail(CiscoXrParser.Use_session_group_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#use_session_group_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitUse_session_group_bgp_tail(CiscoXrParser.Use_session_group_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#weight_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void enterWeight_bgp_tail(CiscoXrParser.Weight_bgp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#weight_bgp_tail}.
	 * @param ctx the parse tree
	 */
	void exitWeight_bgp_tail(CiscoXrParser.Weight_bgp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cc_certificate_chain}.
	 * @param ctx the parse tree
	 */
	void enterCc_certificate_chain(CiscoXrParser.Cc_certificate_chainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cc_certificate_chain}.
	 * @param ctx the parse tree
	 */
	void exitCc_certificate_chain(CiscoXrParser.Cc_certificate_chainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cc_lookup}.
	 * @param ctx the parse tree
	 */
	void enterCc_lookup(CiscoXrParser.Cc_lookupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cc_lookup}.
	 * @param ctx the parse tree
	 */
	void exitCc_lookup(CiscoXrParser.Cc_lookupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cc_server}.
	 * @param ctx the parse tree
	 */
	void enterCc_server(CiscoXrParser.Cc_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cc_server}.
	 * @param ctx the parse tree
	 */
	void exitCc_server(CiscoXrParser.Cc_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cc_trustpoint}.
	 * @param ctx the parse tree
	 */
	void enterCc_trustpoint(CiscoXrParser.Cc_trustpointContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cc_trustpoint}.
	 * @param ctx the parse tree
	 */
	void exitCc_trustpoint(CiscoXrParser.Cc_trustpointContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cc_trustpool}.
	 * @param ctx the parse tree
	 */
	void enterCc_trustpool(CiscoXrParser.Cc_trustpoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cc_trustpool}.
	 * @param ctx the parse tree
	 */
	void exitCc_trustpool(CiscoXrParser.Cc_trustpoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cccc_certificate}.
	 * @param ctx the parse tree
	 */
	void enterCccc_certificate(CiscoXrParser.Cccc_certificateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cccc_certificate}.
	 * @param ctx the parse tree
	 */
	void exitCccc_certificate(CiscoXrParser.Cccc_certificateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ccs_null}.
	 * @param ctx the parse tree
	 */
	void enterCcs_null(CiscoXrParser.Ccs_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ccs_null}.
	 * @param ctx the parse tree
	 */
	void exitCcs_null(CiscoXrParser.Ccs_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cctpoint_null}.
	 * @param ctx the parse tree
	 */
	void enterCctpoint_null(CiscoXrParser.Cctpoint_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cctpoint_null}.
	 * @param ctx the parse tree
	 */
	void exitCctpoint_null(CiscoXrParser.Cctpoint_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cctpool_null}.
	 * @param ctx the parse tree
	 */
	void enterCctpool_null(CiscoXrParser.Cctpool_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cctpool_null}.
	 * @param ctx the parse tree
	 */
	void exitCctpool_null(CiscoXrParser.Cctpool_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cd_match_address}.
	 * @param ctx the parse tree
	 */
	void enterCd_match_address(CiscoXrParser.Cd_match_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cd_match_address}.
	 * @param ctx the parse tree
	 */
	void exitCd_match_address(CiscoXrParser.Cd_match_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cd_null}.
	 * @param ctx the parse tree
	 */
	void enterCd_null(CiscoXrParser.Cd_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cd_null}.
	 * @param ctx the parse tree
	 */
	void exitCd_null(CiscoXrParser.Cd_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cd_set}.
	 * @param ctx the parse tree
	 */
	void enterCd_set(CiscoXrParser.Cd_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cd_set}.
	 * @param ctx the parse tree
	 */
	void exitCd_set(CiscoXrParser.Cd_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cd_set_isakmp_profile}.
	 * @param ctx the parse tree
	 */
	void enterCd_set_isakmp_profile(CiscoXrParser.Cd_set_isakmp_profileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cd_set_isakmp_profile}.
	 * @param ctx the parse tree
	 */
	void exitCd_set_isakmp_profile(CiscoXrParser.Cd_set_isakmp_profileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cd_set_null}.
	 * @param ctx the parse tree
	 */
	void enterCd_set_null(CiscoXrParser.Cd_set_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cd_set_null}.
	 * @param ctx the parse tree
	 */
	void exitCd_set_null(CiscoXrParser.Cd_set_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cd_set_peer}.
	 * @param ctx the parse tree
	 */
	void enterCd_set_peer(CiscoXrParser.Cd_set_peerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cd_set_peer}.
	 * @param ctx the parse tree
	 */
	void exitCd_set_peer(CiscoXrParser.Cd_set_peerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cd_set_pfs}.
	 * @param ctx the parse tree
	 */
	void enterCd_set_pfs(CiscoXrParser.Cd_set_pfsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cd_set_pfs}.
	 * @param ctx the parse tree
	 */
	void exitCd_set_pfs(CiscoXrParser.Cd_set_pfsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cd_set_transform_set}.
	 * @param ctx the parse tree
	 */
	void enterCd_set_transform_set(CiscoXrParser.Cd_set_transform_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cd_set_transform_set}.
	 * @param ctx the parse tree
	 */
	void exitCd_set_transform_set(CiscoXrParser.Cd_set_transform_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#certificate}.
	 * @param ctx the parse tree
	 */
	void enterCertificate(CiscoXrParser.CertificateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#certificate}.
	 * @param ctx the parse tree
	 */
	void exitCertificate(CiscoXrParser.CertificateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cg_null}.
	 * @param ctx the parse tree
	 */
	void enterCg_null(CiscoXrParser.Cg_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cg_null}.
	 * @param ctx the parse tree
	 */
	void exitCg_null(CiscoXrParser.Cg_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ci1_null}.
	 * @param ctx the parse tree
	 */
	void enterCi1_null(CiscoXrParser.Ci1_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ci1_null}.
	 * @param ctx the parse tree
	 */
	void exitCi1_null(CiscoXrParser.Ci1_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ci1_policy}.
	 * @param ctx the parse tree
	 */
	void enterCi1_policy(CiscoXrParser.Ci1_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ci1_policy}.
	 * @param ctx the parse tree
	 */
	void exitCi1_policy(CiscoXrParser.Ci1_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ci1p_null}.
	 * @param ctx the parse tree
	 */
	void enterCi1p_null(CiscoXrParser.Ci1p_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ci1p_null}.
	 * @param ctx the parse tree
	 */
	void exitCi1p_null(CiscoXrParser.Ci1p_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ci2_keyring}.
	 * @param ctx the parse tree
	 */
	void enterCi2_keyring(CiscoXrParser.Ci2_keyringContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ci2_keyring}.
	 * @param ctx the parse tree
	 */
	void exitCi2_keyring(CiscoXrParser.Ci2_keyringContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ci2_null}.
	 * @param ctx the parse tree
	 */
	void enterCi2_null(CiscoXrParser.Ci2_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ci2_null}.
	 * @param ctx the parse tree
	 */
	void exitCi2_null(CiscoXrParser.Ci2_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ci2_policy}.
	 * @param ctx the parse tree
	 */
	void enterCi2_policy(CiscoXrParser.Ci2_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ci2_policy}.
	 * @param ctx the parse tree
	 */
	void exitCi2_policy(CiscoXrParser.Ci2_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ci2_profile}.
	 * @param ctx the parse tree
	 */
	void enterCi2_profile(CiscoXrParser.Ci2_profileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ci2_profile}.
	 * @param ctx the parse tree
	 */
	void exitCi2_profile(CiscoXrParser.Ci2_profileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ci2_proposal}.
	 * @param ctx the parse tree
	 */
	void enterCi2_proposal(CiscoXrParser.Ci2_proposalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ci2_proposal}.
	 * @param ctx the parse tree
	 */
	void exitCi2_proposal(CiscoXrParser.Ci2_proposalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ci2k_peer}.
	 * @param ctx the parse tree
	 */
	void enterCi2k_peer(CiscoXrParser.Ci2k_peerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ci2k_peer}.
	 * @param ctx the parse tree
	 */
	void exitCi2k_peer(CiscoXrParser.Ci2k_peerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ci2kp_null}.
	 * @param ctx the parse tree
	 */
	void enterCi2kp_null(CiscoXrParser.Ci2kp_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ci2kp_null}.
	 * @param ctx the parse tree
	 */
	void exitCi2kp_null(CiscoXrParser.Ci2kp_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ci2pol_null}.
	 * @param ctx the parse tree
	 */
	void enterCi2pol_null(CiscoXrParser.Ci2pol_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ci2pol_null}.
	 * @param ctx the parse tree
	 */
	void exitCi2pol_null(CiscoXrParser.Ci2pol_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ci2prf_null}.
	 * @param ctx the parse tree
	 */
	void enterCi2prf_null(CiscoXrParser.Ci2prf_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ci2prf_null}.
	 * @param ctx the parse tree
	 */
	void exitCi2prf_null(CiscoXrParser.Ci2prf_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ci2prp_null}.
	 * @param ctx the parse tree
	 */
	void enterCi2prp_null(CiscoXrParser.Ci2prp_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ci2prp_null}.
	 * @param ctx the parse tree
	 */
	void exitCi2prp_null(CiscoXrParser.Ci2prp_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cip_ikev2}.
	 * @param ctx the parse tree
	 */
	void enterCip_ikev2(CiscoXrParser.Cip_ikev2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cip_ikev2}.
	 * @param ctx the parse tree
	 */
	void exitCip_ikev2(CiscoXrParser.Cip_ikev2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cip_null}.
	 * @param ctx the parse tree
	 */
	void enterCip_null(CiscoXrParser.Cip_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cip_null}.
	 * @param ctx the parse tree
	 */
	void exitCip_null(CiscoXrParser.Cip_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cip_profile}.
	 * @param ctx the parse tree
	 */
	void enterCip_profile(CiscoXrParser.Cip_profileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cip_profile}.
	 * @param ctx the parse tree
	 */
	void exitCip_profile(CiscoXrParser.Cip_profileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cip_transform_set}.
	 * @param ctx the parse tree
	 */
	void enterCip_transform_set(CiscoXrParser.Cip_transform_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cip_transform_set}.
	 * @param ctx the parse tree
	 */
	void exitCip_transform_set(CiscoXrParser.Cip_transform_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cipi2_ipsec_proposal}.
	 * @param ctx the parse tree
	 */
	void enterCipi2_ipsec_proposal(CiscoXrParser.Cipi2_ipsec_proposalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cipi2_ipsec_proposal}.
	 * @param ctx the parse tree
	 */
	void exitCipi2_ipsec_proposal(CiscoXrParser.Cipi2_ipsec_proposalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cipi2ip_null}.
	 * @param ctx the parse tree
	 */
	void enterCipi2ip_null(CiscoXrParser.Cipi2ip_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cipi2ip_null}.
	 * @param ctx the parse tree
	 */
	void exitCipi2ip_null(CiscoXrParser.Cipi2ip_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cipprf_set}.
	 * @param ctx the parse tree
	 */
	void enterCipprf_set(CiscoXrParser.Cipprf_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cipprf_set}.
	 * @param ctx the parse tree
	 */
	void exitCipprf_set(CiscoXrParser.Cipprf_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cipprf_set_isakmp_profile}.
	 * @param ctx the parse tree
	 */
	void enterCipprf_set_isakmp_profile(CiscoXrParser.Cipprf_set_isakmp_profileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cipprf_set_isakmp_profile}.
	 * @param ctx the parse tree
	 */
	void exitCipprf_set_isakmp_profile(CiscoXrParser.Cipprf_set_isakmp_profileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cipprf_set_null}.
	 * @param ctx the parse tree
	 */
	void enterCipprf_set_null(CiscoXrParser.Cipprf_set_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cipprf_set_null}.
	 * @param ctx the parse tree
	 */
	void exitCipprf_set_null(CiscoXrParser.Cipprf_set_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cipprf_set_pfs}.
	 * @param ctx the parse tree
	 */
	void enterCipprf_set_pfs(CiscoXrParser.Cipprf_set_pfsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cipprf_set_pfs}.
	 * @param ctx the parse tree
	 */
	void exitCipprf_set_pfs(CiscoXrParser.Cipprf_set_pfsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cipprf_set_transform_set}.
	 * @param ctx the parse tree
	 */
	void enterCipprf_set_transform_set(CiscoXrParser.Cipprf_set_transform_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cipprf_set_transform_set}.
	 * @param ctx the parse tree
	 */
	void exitCipprf_set_transform_set(CiscoXrParser.Cipprf_set_transform_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cipt_mode}.
	 * @param ctx the parse tree
	 */
	void enterCipt_mode(CiscoXrParser.Cipt_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cipt_mode}.
	 * @param ctx the parse tree
	 */
	void exitCipt_mode(CiscoXrParser.Cipt_modeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cis_key}.
	 * @param ctx the parse tree
	 */
	void enterCis_key(CiscoXrParser.Cis_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cis_key}.
	 * @param ctx the parse tree
	 */
	void exitCis_key(CiscoXrParser.Cis_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cis_null}.
	 * @param ctx the parse tree
	 */
	void enterCis_null(CiscoXrParser.Cis_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cis_null}.
	 * @param ctx the parse tree
	 */
	void exitCis_null(CiscoXrParser.Cis_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cis_policy}.
	 * @param ctx the parse tree
	 */
	void enterCis_policy(CiscoXrParser.Cis_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cis_policy}.
	 * @param ctx the parse tree
	 */
	void exitCis_policy(CiscoXrParser.Cis_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cis_profile}.
	 * @param ctx the parse tree
	 */
	void enterCis_profile(CiscoXrParser.Cis_profileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cis_profile}.
	 * @param ctx the parse tree
	 */
	void exitCis_profile(CiscoXrParser.Cis_profileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cispol_authentication}.
	 * @param ctx the parse tree
	 */
	void enterCispol_authentication(CiscoXrParser.Cispol_authenticationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cispol_authentication}.
	 * @param ctx the parse tree
	 */
	void exitCispol_authentication(CiscoXrParser.Cispol_authenticationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cispol_encryption}.
	 * @param ctx the parse tree
	 */
	void enterCispol_encryption(CiscoXrParser.Cispol_encryptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cispol_encryption}.
	 * @param ctx the parse tree
	 */
	void exitCispol_encryption(CiscoXrParser.Cispol_encryptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cispol_group}.
	 * @param ctx the parse tree
	 */
	void enterCispol_group(CiscoXrParser.Cispol_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cispol_group}.
	 * @param ctx the parse tree
	 */
	void exitCispol_group(CiscoXrParser.Cispol_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cispol_hash}.
	 * @param ctx the parse tree
	 */
	void enterCispol_hash(CiscoXrParser.Cispol_hashContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cispol_hash}.
	 * @param ctx the parse tree
	 */
	void exitCispol_hash(CiscoXrParser.Cispol_hashContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cispol_lifetime}.
	 * @param ctx the parse tree
	 */
	void enterCispol_lifetime(CiscoXrParser.Cispol_lifetimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cispol_lifetime}.
	 * @param ctx the parse tree
	 */
	void exitCispol_lifetime(CiscoXrParser.Cispol_lifetimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cispol_null}.
	 * @param ctx the parse tree
	 */
	void enterCispol_null(CiscoXrParser.Cispol_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cispol_null}.
	 * @param ctx the parse tree
	 */
	void exitCispol_null(CiscoXrParser.Cispol_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cisprf_keyring}.
	 * @param ctx the parse tree
	 */
	void enterCisprf_keyring(CiscoXrParser.Cisprf_keyringContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cisprf_keyring}.
	 * @param ctx the parse tree
	 */
	void exitCisprf_keyring(CiscoXrParser.Cisprf_keyringContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cisprf_local_address}.
	 * @param ctx the parse tree
	 */
	void enterCisprf_local_address(CiscoXrParser.Cisprf_local_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cisprf_local_address}.
	 * @param ctx the parse tree
	 */
	void exitCisprf_local_address(CiscoXrParser.Cisprf_local_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cisprf_match}.
	 * @param ctx the parse tree
	 */
	void enterCisprf_match(CiscoXrParser.Cisprf_matchContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cisprf_match}.
	 * @param ctx the parse tree
	 */
	void exitCisprf_match(CiscoXrParser.Cisprf_matchContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cisprf_null}.
	 * @param ctx the parse tree
	 */
	void enterCisprf_null(CiscoXrParser.Cisprf_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cisprf_null}.
	 * @param ctx the parse tree
	 */
	void exitCisprf_null(CiscoXrParser.Cisprf_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cisprf_self_identity}.
	 * @param ctx the parse tree
	 */
	void enterCisprf_self_identity(CiscoXrParser.Cisprf_self_identityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cisprf_self_identity}.
	 * @param ctx the parse tree
	 */
	void exitCisprf_self_identity(CiscoXrParser.Cisprf_self_identityContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ck_null}.
	 * @param ctx the parse tree
	 */
	void enterCk_null(CiscoXrParser.Ck_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ck_null}.
	 * @param ctx the parse tree
	 */
	void exitCk_null(CiscoXrParser.Ck_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ck_pubkey_chain}.
	 * @param ctx the parse tree
	 */
	void enterCk_pubkey_chain(CiscoXrParser.Ck_pubkey_chainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ck_pubkey_chain}.
	 * @param ctx the parse tree
	 */
	void exitCk_pubkey_chain(CiscoXrParser.Ck_pubkey_chainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ckp_named_key}.
	 * @param ctx the parse tree
	 */
	void enterCkp_named_key(CiscoXrParser.Ckp_named_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ckp_named_key}.
	 * @param ctx the parse tree
	 */
	void exitCkp_named_key(CiscoXrParser.Ckp_named_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ckpn_address}.
	 * @param ctx the parse tree
	 */
	void enterCkpn_address(CiscoXrParser.Ckpn_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ckpn_address}.
	 * @param ctx the parse tree
	 */
	void exitCkpn_address(CiscoXrParser.Ckpn_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ckpn_key_string}.
	 * @param ctx the parse tree
	 */
	void enterCkpn_key_string(CiscoXrParser.Ckpn_key_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ckpn_key_string}.
	 * @param ctx the parse tree
	 */
	void exitCkpn_key_string(CiscoXrParser.Ckpn_key_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ckr_local_address}.
	 * @param ctx the parse tree
	 */
	void enterCkr_local_address(CiscoXrParser.Ckr_local_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ckr_local_address}.
	 * @param ctx the parse tree
	 */
	void exitCkr_local_address(CiscoXrParser.Ckr_local_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ckr_psk}.
	 * @param ctx the parse tree
	 */
	void enterCkr_psk(CiscoXrParser.Ckr_pskContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ckr_psk}.
	 * @param ctx the parse tree
	 */
	void exitCkr_psk(CiscoXrParser.Ckr_pskContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cpki_certificate_chain}.
	 * @param ctx the parse tree
	 */
	void enterCpki_certificate_chain(CiscoXrParser.Cpki_certificate_chainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cpki_certificate_chain}.
	 * @param ctx the parse tree
	 */
	void exitCpki_certificate_chain(CiscoXrParser.Cpki_certificate_chainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cpki_null}.
	 * @param ctx the parse tree
	 */
	void enterCpki_null(CiscoXrParser.Cpki_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cpki_null}.
	 * @param ctx the parse tree
	 */
	void exitCpki_null(CiscoXrParser.Cpki_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cpki_server}.
	 * @param ctx the parse tree
	 */
	void enterCpki_server(CiscoXrParser.Cpki_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cpki_server}.
	 * @param ctx the parse tree
	 */
	void exitCpki_server(CiscoXrParser.Cpki_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cpki_trustpoint}.
	 * @param ctx the parse tree
	 */
	void enterCpki_trustpoint(CiscoXrParser.Cpki_trustpointContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cpki_trustpoint}.
	 * @param ctx the parse tree
	 */
	void exitCpki_trustpoint(CiscoXrParser.Cpki_trustpointContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cpkicc_certificate}.
	 * @param ctx the parse tree
	 */
	void enterCpkicc_certificate(CiscoXrParser.Cpkicc_certificateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cpkicc_certificate}.
	 * @param ctx the parse tree
	 */
	void exitCpkicc_certificate(CiscoXrParser.Cpkicc_certificateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cpkis_null}.
	 * @param ctx the parse tree
	 */
	void enterCpkis_null(CiscoXrParser.Cpkis_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cpkis_null}.
	 * @param ctx the parse tree
	 */
	void exitCpkis_null(CiscoXrParser.Cpkis_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cpkit_null}.
	 * @param ctx the parse tree
	 */
	void enterCpkit_null(CiscoXrParser.Cpkit_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cpkit_null}.
	 * @param ctx the parse tree
	 */
	void exitCpkit_null(CiscoXrParser.Cpkit_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#crypto_ca}.
	 * @param ctx the parse tree
	 */
	void enterCrypto_ca(CiscoXrParser.Crypto_caContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#crypto_ca}.
	 * @param ctx the parse tree
	 */
	void exitCrypto_ca(CiscoXrParser.Crypto_caContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#crypto_csr_params}.
	 * @param ctx the parse tree
	 */
	void enterCrypto_csr_params(CiscoXrParser.Crypto_csr_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#crypto_csr_params}.
	 * @param ctx the parse tree
	 */
	void exitCrypto_csr_params(CiscoXrParser.Crypto_csr_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#crypto_dynamic_map}.
	 * @param ctx the parse tree
	 */
	void enterCrypto_dynamic_map(CiscoXrParser.Crypto_dynamic_mapContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#crypto_dynamic_map}.
	 * @param ctx the parse tree
	 */
	void exitCrypto_dynamic_map(CiscoXrParser.Crypto_dynamic_mapContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#crypto_dynamic_map_null}.
	 * @param ctx the parse tree
	 */
	void enterCrypto_dynamic_map_null(CiscoXrParser.Crypto_dynamic_map_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#crypto_dynamic_map_null}.
	 * @param ctx the parse tree
	 */
	void exitCrypto_dynamic_map_null(CiscoXrParser.Crypto_dynamic_map_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#crypto_engine}.
	 * @param ctx the parse tree
	 */
	void enterCrypto_engine(CiscoXrParser.Crypto_engineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#crypto_engine}.
	 * @param ctx the parse tree
	 */
	void exitCrypto_engine(CiscoXrParser.Crypto_engineContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#crypto_gdoi}.
	 * @param ctx the parse tree
	 */
	void enterCrypto_gdoi(CiscoXrParser.Crypto_gdoiContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#crypto_gdoi}.
	 * @param ctx the parse tree
	 */
	void exitCrypto_gdoi(CiscoXrParser.Crypto_gdoiContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#crypto_ikev1}.
	 * @param ctx the parse tree
	 */
	void enterCrypto_ikev1(CiscoXrParser.Crypto_ikev1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#crypto_ikev1}.
	 * @param ctx the parse tree
	 */
	void exitCrypto_ikev1(CiscoXrParser.Crypto_ikev1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#crypto_ikev2}.
	 * @param ctx the parse tree
	 */
	void enterCrypto_ikev2(CiscoXrParser.Crypto_ikev2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#crypto_ikev2}.
	 * @param ctx the parse tree
	 */
	void exitCrypto_ikev2(CiscoXrParser.Crypto_ikev2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#crypto_ipsec}.
	 * @param ctx the parse tree
	 */
	void enterCrypto_ipsec(CiscoXrParser.Crypto_ipsecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#crypto_ipsec}.
	 * @param ctx the parse tree
	 */
	void exitCrypto_ipsec(CiscoXrParser.Crypto_ipsecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#crypto_isakmp}.
	 * @param ctx the parse tree
	 */
	void enterCrypto_isakmp(CiscoXrParser.Crypto_isakmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#crypto_isakmp}.
	 * @param ctx the parse tree
	 */
	void exitCrypto_isakmp(CiscoXrParser.Crypto_isakmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#crypto_key}.
	 * @param ctx the parse tree
	 */
	void enterCrypto_key(CiscoXrParser.Crypto_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#crypto_key}.
	 * @param ctx the parse tree
	 */
	void exitCrypto_key(CiscoXrParser.Crypto_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#crypto_keyring}.
	 * @param ctx the parse tree
	 */
	void enterCrypto_keyring(CiscoXrParser.Crypto_keyringContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#crypto_keyring}.
	 * @param ctx the parse tree
	 */
	void exitCrypto_keyring(CiscoXrParser.Crypto_keyringContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#crypto_map}.
	 * @param ctx the parse tree
	 */
	void enterCrypto_map(CiscoXrParser.Crypto_mapContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#crypto_map}.
	 * @param ctx the parse tree
	 */
	void exitCrypto_map(CiscoXrParser.Crypto_mapContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#crypto_map_null}.
	 * @param ctx the parse tree
	 */
	void enterCrypto_map_null(CiscoXrParser.Crypto_map_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#crypto_map_null}.
	 * @param ctx the parse tree
	 */
	void exitCrypto_map_null(CiscoXrParser.Crypto_map_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#crypto_map_tail}.
	 * @param ctx the parse tree
	 */
	void enterCrypto_map_tail(CiscoXrParser.Crypto_map_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#crypto_map_tail}.
	 * @param ctx the parse tree
	 */
	void exitCrypto_map_tail(CiscoXrParser.Crypto_map_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#crypto_map_t_g_null}.
	 * @param ctx the parse tree
	 */
	void enterCrypto_map_t_g_null(CiscoXrParser.Crypto_map_t_g_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#crypto_map_t_g_null}.
	 * @param ctx the parse tree
	 */
	void exitCrypto_map_t_g_null(CiscoXrParser.Crypto_map_t_g_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#crypto_map_t_gdoi}.
	 * @param ctx the parse tree
	 */
	void enterCrypto_map_t_gdoi(CiscoXrParser.Crypto_map_t_gdoiContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#crypto_map_t_gdoi}.
	 * @param ctx the parse tree
	 */
	void exitCrypto_map_t_gdoi(CiscoXrParser.Crypto_map_t_gdoiContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#crypto_map_t_ii_match_address}.
	 * @param ctx the parse tree
	 */
	void enterCrypto_map_t_ii_match_address(CiscoXrParser.Crypto_map_t_ii_match_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#crypto_map_t_ii_match_address}.
	 * @param ctx the parse tree
	 */
	void exitCrypto_map_t_ii_match_address(CiscoXrParser.Crypto_map_t_ii_match_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#crypto_map_t_ii_null}.
	 * @param ctx the parse tree
	 */
	void enterCrypto_map_t_ii_null(CiscoXrParser.Crypto_map_t_ii_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#crypto_map_t_ii_null}.
	 * @param ctx the parse tree
	 */
	void exitCrypto_map_t_ii_null(CiscoXrParser.Crypto_map_t_ii_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#crypto_map_t_ii_set}.
	 * @param ctx the parse tree
	 */
	void enterCrypto_map_t_ii_set(CiscoXrParser.Crypto_map_t_ii_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#crypto_map_t_ii_set}.
	 * @param ctx the parse tree
	 */
	void exitCrypto_map_t_ii_set(CiscoXrParser.Crypto_map_t_ii_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#crypto_map_t_ii_set_isakmp_profile}.
	 * @param ctx the parse tree
	 */
	void enterCrypto_map_t_ii_set_isakmp_profile(CiscoXrParser.Crypto_map_t_ii_set_isakmp_profileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#crypto_map_t_ii_set_isakmp_profile}.
	 * @param ctx the parse tree
	 */
	void exitCrypto_map_t_ii_set_isakmp_profile(CiscoXrParser.Crypto_map_t_ii_set_isakmp_profileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#crypto_map_t_ii_set_null}.
	 * @param ctx the parse tree
	 */
	void enterCrypto_map_t_ii_set_null(CiscoXrParser.Crypto_map_t_ii_set_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#crypto_map_t_ii_set_null}.
	 * @param ctx the parse tree
	 */
	void exitCrypto_map_t_ii_set_null(CiscoXrParser.Crypto_map_t_ii_set_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#crypto_map_t_ii_set_peer}.
	 * @param ctx the parse tree
	 */
	void enterCrypto_map_t_ii_set_peer(CiscoXrParser.Crypto_map_t_ii_set_peerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#crypto_map_t_ii_set_peer}.
	 * @param ctx the parse tree
	 */
	void exitCrypto_map_t_ii_set_peer(CiscoXrParser.Crypto_map_t_ii_set_peerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#crypto_map_t_ii_set_pfs}.
	 * @param ctx the parse tree
	 */
	void enterCrypto_map_t_ii_set_pfs(CiscoXrParser.Crypto_map_t_ii_set_pfsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#crypto_map_t_ii_set_pfs}.
	 * @param ctx the parse tree
	 */
	void exitCrypto_map_t_ii_set_pfs(CiscoXrParser.Crypto_map_t_ii_set_pfsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#crypto_map_t_ii_set_transform_set}.
	 * @param ctx the parse tree
	 */
	void enterCrypto_map_t_ii_set_transform_set(CiscoXrParser.Crypto_map_t_ii_set_transform_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#crypto_map_t_ii_set_transform_set}.
	 * @param ctx the parse tree
	 */
	void exitCrypto_map_t_ii_set_transform_set(CiscoXrParser.Crypto_map_t_ii_set_transform_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#crypto_map_t_ipsec_isakmp}.
	 * @param ctx the parse tree
	 */
	void enterCrypto_map_t_ipsec_isakmp(CiscoXrParser.Crypto_map_t_ipsec_isakmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#crypto_map_t_ipsec_isakmp}.
	 * @param ctx the parse tree
	 */
	void exitCrypto_map_t_ipsec_isakmp(CiscoXrParser.Crypto_map_t_ipsec_isakmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#crypto_map_t_null}.
	 * @param ctx the parse tree
	 */
	void enterCrypto_map_t_null(CiscoXrParser.Crypto_map_t_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#crypto_map_t_null}.
	 * @param ctx the parse tree
	 */
	void exitCrypto_map_t_null(CiscoXrParser.Crypto_map_t_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#crypto_pki}.
	 * @param ctx the parse tree
	 */
	void enterCrypto_pki(CiscoXrParser.Crypto_pkiContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#crypto_pki}.
	 * @param ctx the parse tree
	 */
	void exitCrypto_pki(CiscoXrParser.Crypto_pkiContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#dh_group}.
	 * @param ctx the parse tree
	 */
	void enterDh_group(CiscoXrParser.Dh_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#dh_group}.
	 * @param ctx the parse tree
	 */
	void exitDh_group(CiscoXrParser.Dh_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#key_key}.
	 * @param ctx the parse tree
	 */
	void enterKey_key(CiscoXrParser.Key_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#key_key}.
	 * @param ctx the parse tree
	 */
	void exitKey_key(CiscoXrParser.Key_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#kk_null}.
	 * @param ctx the parse tree
	 */
	void enterKk_null(CiscoXrParser.Kk_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#kk_null}.
	 * @param ctx the parse tree
	 */
	void exitKk_null(CiscoXrParser.Kk_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ike_encryption}.
	 * @param ctx the parse tree
	 */
	void enterIke_encryption(CiscoXrParser.Ike_encryptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ike_encryption}.
	 * @param ctx the parse tree
	 */
	void exitIke_encryption(CiscoXrParser.Ike_encryptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ipsec_authentication}.
	 * @param ctx the parse tree
	 */
	void enterIpsec_authentication(CiscoXrParser.Ipsec_authenticationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ipsec_authentication}.
	 * @param ctx the parse tree
	 */
	void exitIpsec_authentication(CiscoXrParser.Ipsec_authenticationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ipsec_encryption}.
	 * @param ctx the parse tree
	 */
	void enterIpsec_encryption(CiscoXrParser.Ipsec_encryptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ipsec_encryption}.
	 * @param ctx the parse tree
	 */
	void exitIpsec_encryption(CiscoXrParser.Ipsec_encryptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_crypto}.
	 * @param ctx the parse tree
	 */
	void enterS_crypto(CiscoXrParser.S_cryptoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_crypto}.
	 * @param ctx the parse tree
	 */
	void exitS_crypto(CiscoXrParser.S_cryptoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_key}.
	 * @param ctx the parse tree
	 */
	void enterS_key(CiscoXrParser.S_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_key}.
	 * @param ctx the parse tree
	 */
	void exitS_key(CiscoXrParser.S_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#call_home_null}.
	 * @param ctx the parse tree
	 */
	void enterCall_home_null(CiscoXrParser.Call_home_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#call_home_null}.
	 * @param ctx the parse tree
	 */
	void exitCall_home_null(CiscoXrParser.Call_home_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#call_home_profile}.
	 * @param ctx the parse tree
	 */
	void enterCall_home_profile(CiscoXrParser.Call_home_profileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#call_home_profile}.
	 * @param ctx the parse tree
	 */
	void exitCall_home_profile(CiscoXrParser.Call_home_profileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#call_home_profile_null}.
	 * @param ctx the parse tree
	 */
	void enterCall_home_profile_null(CiscoXrParser.Call_home_profile_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#call_home_profile_null}.
	 * @param ctx the parse tree
	 */
	void exitCall_home_profile_null(CiscoXrParser.Call_home_profile_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#callhome_destination_profile}.
	 * @param ctx the parse tree
	 */
	void enterCallhome_destination_profile(CiscoXrParser.Callhome_destination_profileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#callhome_destination_profile}.
	 * @param ctx the parse tree
	 */
	void exitCallhome_destination_profile(CiscoXrParser.Callhome_destination_profileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#callhome_destination_profile_alert_group}.
	 * @param ctx the parse tree
	 */
	void enterCallhome_destination_profile_alert_group(CiscoXrParser.Callhome_destination_profile_alert_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#callhome_destination_profile_alert_group}.
	 * @param ctx the parse tree
	 */
	void exitCallhome_destination_profile_alert_group(CiscoXrParser.Callhome_destination_profile_alert_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#callhome_destination_profile_email_addr}.
	 * @param ctx the parse tree
	 */
	void enterCallhome_destination_profile_email_addr(CiscoXrParser.Callhome_destination_profile_email_addrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#callhome_destination_profile_email_addr}.
	 * @param ctx the parse tree
	 */
	void exitCallhome_destination_profile_email_addr(CiscoXrParser.Callhome_destination_profile_email_addrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#callhome_destination_profile_message_level}.
	 * @param ctx the parse tree
	 */
	void enterCallhome_destination_profile_message_level(CiscoXrParser.Callhome_destination_profile_message_levelContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#callhome_destination_profile_message_level}.
	 * @param ctx the parse tree
	 */
	void exitCallhome_destination_profile_message_level(CiscoXrParser.Callhome_destination_profile_message_levelContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#callhome_destination_profile_message_size}.
	 * @param ctx the parse tree
	 */
	void enterCallhome_destination_profile_message_size(CiscoXrParser.Callhome_destination_profile_message_sizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#callhome_destination_profile_message_size}.
	 * @param ctx the parse tree
	 */
	void exitCallhome_destination_profile_message_size(CiscoXrParser.Callhome_destination_profile_message_sizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#callhome_destination_profile_format}.
	 * @param ctx the parse tree
	 */
	void enterCallhome_destination_profile_format(CiscoXrParser.Callhome_destination_profile_formatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#callhome_destination_profile_format}.
	 * @param ctx the parse tree
	 */
	void exitCallhome_destination_profile_format(CiscoXrParser.Callhome_destination_profile_formatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#callhome_destination_profile_transport_method}.
	 * @param ctx the parse tree
	 */
	void enterCallhome_destination_profile_transport_method(CiscoXrParser.Callhome_destination_profile_transport_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#callhome_destination_profile_transport_method}.
	 * @param ctx the parse tree
	 */
	void exitCallhome_destination_profile_transport_method(CiscoXrParser.Callhome_destination_profile_transport_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#callhome_diagnostic_signature}.
	 * @param ctx the parse tree
	 */
	void enterCallhome_diagnostic_signature(CiscoXrParser.Callhome_diagnostic_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#callhome_diagnostic_signature}.
	 * @param ctx the parse tree
	 */
	void exitCallhome_diagnostic_signature(CiscoXrParser.Callhome_diagnostic_signatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#callhome_diagnostic_signature_null}.
	 * @param ctx the parse tree
	 */
	void enterCallhome_diagnostic_signature_null(CiscoXrParser.Callhome_diagnostic_signature_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#callhome_diagnostic_signature_null}.
	 * @param ctx the parse tree
	 */
	void exitCallhome_diagnostic_signature_null(CiscoXrParser.Callhome_diagnostic_signature_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#callhome_email_contact}.
	 * @param ctx the parse tree
	 */
	void enterCallhome_email_contact(CiscoXrParser.Callhome_email_contactContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#callhome_email_contact}.
	 * @param ctx the parse tree
	 */
	void exitCallhome_email_contact(CiscoXrParser.Callhome_email_contactContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#callhome_enable}.
	 * @param ctx the parse tree
	 */
	void enterCallhome_enable(CiscoXrParser.Callhome_enableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#callhome_enable}.
	 * @param ctx the parse tree
	 */
	void exitCallhome_enable(CiscoXrParser.Callhome_enableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#callhome_null}.
	 * @param ctx the parse tree
	 */
	void enterCallhome_null(CiscoXrParser.Callhome_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#callhome_null}.
	 * @param ctx the parse tree
	 */
	void exitCallhome_null(CiscoXrParser.Callhome_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#callhome_phone_contact}.
	 * @param ctx the parse tree
	 */
	void enterCallhome_phone_contact(CiscoXrParser.Callhome_phone_contactContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#callhome_phone_contact}.
	 * @param ctx the parse tree
	 */
	void exitCallhome_phone_contact(CiscoXrParser.Callhome_phone_contactContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#callhome_streetaddress}.
	 * @param ctx the parse tree
	 */
	void enterCallhome_streetaddress(CiscoXrParser.Callhome_streetaddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#callhome_streetaddress}.
	 * @param ctx the parse tree
	 */
	void exitCallhome_streetaddress(CiscoXrParser.Callhome_streetaddressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#callhome_switch_priority}.
	 * @param ctx the parse tree
	 */
	void enterCallhome_switch_priority(CiscoXrParser.Callhome_switch_priorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#callhome_switch_priority}.
	 * @param ctx the parse tree
	 */
	void exitCallhome_switch_priority(CiscoXrParser.Callhome_switch_priorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#callhome_transport}.
	 * @param ctx the parse tree
	 */
	void enterCallhome_transport(CiscoXrParser.Callhome_transportContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#callhome_transport}.
	 * @param ctx the parse tree
	 */
	void exitCallhome_transport(CiscoXrParser.Callhome_transportContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#callhome_transport_email}.
	 * @param ctx the parse tree
	 */
	void enterCallhome_transport_email(CiscoXrParser.Callhome_transport_emailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#callhome_transport_email}.
	 * @param ctx the parse tree
	 */
	void exitCallhome_transport_email(CiscoXrParser.Callhome_transport_emailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#callhome_transport_email_from}.
	 * @param ctx the parse tree
	 */
	void enterCallhome_transport_email_from(CiscoXrParser.Callhome_transport_email_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#callhome_transport_email_from}.
	 * @param ctx the parse tree
	 */
	void exitCallhome_transport_email_from(CiscoXrParser.Callhome_transport_email_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#callhome_transport_email_reply_to}.
	 * @param ctx the parse tree
	 */
	void enterCallhome_transport_email_reply_to(CiscoXrParser.Callhome_transport_email_reply_toContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#callhome_transport_email_reply_to}.
	 * @param ctx the parse tree
	 */
	void exitCallhome_transport_email_reply_to(CiscoXrParser.Callhome_transport_email_reply_toContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#callhome_transport_email_smtp_server}.
	 * @param ctx the parse tree
	 */
	void enterCallhome_transport_email_smtp_server(CiscoXrParser.Callhome_transport_email_smtp_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#callhome_transport_email_smtp_server}.
	 * @param ctx the parse tree
	 */
	void exitCallhome_transport_email_smtp_server(CiscoXrParser.Callhome_transport_email_smtp_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_call_home}.
	 * @param ctx the parse tree
	 */
	void enterS_call_home(CiscoXrParser.S_call_homeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_call_home}.
	 * @param ctx the parse tree
	 */
	void exitS_call_home(CiscoXrParser.S_call_homeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_callhome}.
	 * @param ctx the parse tree
	 */
	void enterS_callhome(CiscoXrParser.S_callhomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_callhome}.
	 * @param ctx the parse tree
	 */
	void exitS_callhome(CiscoXrParser.S_callhomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#re_classic}.
	 * @param ctx the parse tree
	 */
	void enterRe_classic(CiscoXrParser.Re_classicContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#re_classic}.
	 * @param ctx the parse tree
	 */
	void exitRe_classic(CiscoXrParser.Re_classicContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#re_classic_tail}.
	 * @param ctx the parse tree
	 */
	void enterRe_classic_tail(CiscoXrParser.Re_classic_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#re_classic_tail}.
	 * @param ctx the parse tree
	 */
	void exitRe_classic_tail(CiscoXrParser.Re_classic_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#re_default_metric}.
	 * @param ctx the parse tree
	 */
	void enterRe_default_metric(CiscoXrParser.Re_default_metricContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#re_default_metric}.
	 * @param ctx the parse tree
	 */
	void exitRe_default_metric(CiscoXrParser.Re_default_metricContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#re_distribute_list}.
	 * @param ctx the parse tree
	 */
	void enterRe_distribute_list(CiscoXrParser.Re_distribute_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#re_distribute_list}.
	 * @param ctx the parse tree
	 */
	void exitRe_distribute_list(CiscoXrParser.Re_distribute_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#re_eigrp_null}.
	 * @param ctx the parse tree
	 */
	void enterRe_eigrp_null(CiscoXrParser.Re_eigrp_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#re_eigrp_null}.
	 * @param ctx the parse tree
	 */
	void exitRe_eigrp_null(CiscoXrParser.Re_eigrp_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#re_eigrp_router_id}.
	 * @param ctx the parse tree
	 */
	void enterRe_eigrp_router_id(CiscoXrParser.Re_eigrp_router_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#re_eigrp_router_id}.
	 * @param ctx the parse tree
	 */
	void exitRe_eigrp_router_id(CiscoXrParser.Re_eigrp_router_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#re_named}.
	 * @param ctx the parse tree
	 */
	void enterRe_named(CiscoXrParser.Re_namedContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#re_named}.
	 * @param ctx the parse tree
	 */
	void exitRe_named(CiscoXrParser.Re_namedContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#re_named_tail}.
	 * @param ctx the parse tree
	 */
	void enterRe_named_tail(CiscoXrParser.Re_named_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#re_named_tail}.
	 * @param ctx the parse tree
	 */
	void exitRe_named_tail(CiscoXrParser.Re_named_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#re_network}.
	 * @param ctx the parse tree
	 */
	void enterRe_network(CiscoXrParser.Re_networkContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#re_network}.
	 * @param ctx the parse tree
	 */
	void exitRe_network(CiscoXrParser.Re_networkContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#re_passive_interface}.
	 * @param ctx the parse tree
	 */
	void enterRe_passive_interface(CiscoXrParser.Re_passive_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#re_passive_interface}.
	 * @param ctx the parse tree
	 */
	void exitRe_passive_interface(CiscoXrParser.Re_passive_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#re_passive_interface_default}.
	 * @param ctx the parse tree
	 */
	void enterRe_passive_interface_default(CiscoXrParser.Re_passive_interface_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#re_passive_interface_default}.
	 * @param ctx the parse tree
	 */
	void exitRe_passive_interface_default(CiscoXrParser.Re_passive_interface_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#re_redistribute}.
	 * @param ctx the parse tree
	 */
	void enterRe_redistribute(CiscoXrParser.Re_redistributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#re_redistribute}.
	 * @param ctx the parse tree
	 */
	void exitRe_redistribute(CiscoXrParser.Re_redistributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#re_redistribute_bgp}.
	 * @param ctx the parse tree
	 */
	void enterRe_redistribute_bgp(CiscoXrParser.Re_redistribute_bgpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#re_redistribute_bgp}.
	 * @param ctx the parse tree
	 */
	void exitRe_redistribute_bgp(CiscoXrParser.Re_redistribute_bgpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#re_redistribute_connected}.
	 * @param ctx the parse tree
	 */
	void enterRe_redistribute_connected(CiscoXrParser.Re_redistribute_connectedContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#re_redistribute_connected}.
	 * @param ctx the parse tree
	 */
	void exitRe_redistribute_connected(CiscoXrParser.Re_redistribute_connectedContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#re_redistribute_eigrp}.
	 * @param ctx the parse tree
	 */
	void enterRe_redistribute_eigrp(CiscoXrParser.Re_redistribute_eigrpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#re_redistribute_eigrp}.
	 * @param ctx the parse tree
	 */
	void exitRe_redistribute_eigrp(CiscoXrParser.Re_redistribute_eigrpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#re_redistribute_isis}.
	 * @param ctx the parse tree
	 */
	void enterRe_redistribute_isis(CiscoXrParser.Re_redistribute_isisContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#re_redistribute_isis}.
	 * @param ctx the parse tree
	 */
	void exitRe_redistribute_isis(CiscoXrParser.Re_redistribute_isisContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#re_redistribute_ospf}.
	 * @param ctx the parse tree
	 */
	void enterRe_redistribute_ospf(CiscoXrParser.Re_redistribute_ospfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#re_redistribute_ospf}.
	 * @param ctx the parse tree
	 */
	void exitRe_redistribute_ospf(CiscoXrParser.Re_redistribute_ospfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#re_redistribute_rip}.
	 * @param ctx the parse tree
	 */
	void enterRe_redistribute_rip(CiscoXrParser.Re_redistribute_ripContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#re_redistribute_rip}.
	 * @param ctx the parse tree
	 */
	void exitRe_redistribute_rip(CiscoXrParser.Re_redistribute_ripContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#re_redistribute_static}.
	 * @param ctx the parse tree
	 */
	void enterRe_redistribute_static(CiscoXrParser.Re_redistribute_staticContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#re_redistribute_static}.
	 * @param ctx the parse tree
	 */
	void exitRe_redistribute_static(CiscoXrParser.Re_redistribute_staticContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#re_topology_base}.
	 * @param ctx the parse tree
	 */
	void enterRe_topology_base(CiscoXrParser.Re_topology_baseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#re_topology_base}.
	 * @param ctx the parse tree
	 */
	void exitRe_topology_base(CiscoXrParser.Re_topology_baseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#re_topology_name}.
	 * @param ctx the parse tree
	 */
	void enterRe_topology_name(CiscoXrParser.Re_topology_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#re_topology_name}.
	 * @param ctx the parse tree
	 */
	void exitRe_topology_name(CiscoXrParser.Re_topology_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#reaf_interface}.
	 * @param ctx the parse tree
	 */
	void enterReaf_interface(CiscoXrParser.Reaf_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#reaf_interface}.
	 * @param ctx the parse tree
	 */
	void exitReaf_interface(CiscoXrParser.Reaf_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#reaf_interface_default}.
	 * @param ctx the parse tree
	 */
	void enterReaf_interface_default(CiscoXrParser.Reaf_interface_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#reaf_interface_default}.
	 * @param ctx the parse tree
	 */
	void exitReaf_interface_default(CiscoXrParser.Reaf_interface_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#reaf_interface_null}.
	 * @param ctx the parse tree
	 */
	void enterReaf_interface_null(CiscoXrParser.Reaf_interface_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#reaf_interface_null}.
	 * @param ctx the parse tree
	 */
	void exitReaf_interface_null(CiscoXrParser.Reaf_interface_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#reaf_interface_tail}.
	 * @param ctx the parse tree
	 */
	void enterReaf_interface_tail(CiscoXrParser.Reaf_interface_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#reaf_interface_tail}.
	 * @param ctx the parse tree
	 */
	void exitReaf_interface_tail(CiscoXrParser.Reaf_interface_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#reaf_topology_tail}.
	 * @param ctx the parse tree
	 */
	void enterReaf_topology_tail(CiscoXrParser.Reaf_topology_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#reaf_topology_tail}.
	 * @param ctx the parse tree
	 */
	void exitReaf_topology_tail(CiscoXrParser.Reaf_topology_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#reaf_topology}.
	 * @param ctx the parse tree
	 */
	void enterReaf_topology(CiscoXrParser.Reaf_topologyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#reaf_topology}.
	 * @param ctx the parse tree
	 */
	void exitReaf_topology(CiscoXrParser.Reaf_topologyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#reaf_topology_null}.
	 * @param ctx the parse tree
	 */
	void enterReaf_topology_null(CiscoXrParser.Reaf_topology_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#reaf_topology_null}.
	 * @param ctx the parse tree
	 */
	void exitReaf_topology_null(CiscoXrParser.Reaf_topology_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#reafi_passive_interface}.
	 * @param ctx the parse tree
	 */
	void enterReafi_passive_interface(CiscoXrParser.Reafi_passive_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#reafi_passive_interface}.
	 * @param ctx the parse tree
	 */
	void exitReafi_passive_interface(CiscoXrParser.Reafi_passive_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#rec_address_family}.
	 * @param ctx the parse tree
	 */
	void enterRec_address_family(CiscoXrParser.Rec_address_familyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#rec_address_family}.
	 * @param ctx the parse tree
	 */
	void exitRec_address_family(CiscoXrParser.Rec_address_familyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#re_autonomous_system}.
	 * @param ctx the parse tree
	 */
	void enterRe_autonomous_system(CiscoXrParser.Re_autonomous_systemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#re_autonomous_system}.
	 * @param ctx the parse tree
	 */
	void exitRe_autonomous_system(CiscoXrParser.Re_autonomous_systemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#rec_address_family_null}.
	 * @param ctx the parse tree
	 */
	void enterRec_address_family_null(CiscoXrParser.Rec_address_family_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#rec_address_family_null}.
	 * @param ctx the parse tree
	 */
	void exitRec_address_family_null(CiscoXrParser.Rec_address_family_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#rec_address_family_tail}.
	 * @param ctx the parse tree
	 */
	void enterRec_address_family_tail(CiscoXrParser.Rec_address_family_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#rec_address_family_tail}.
	 * @param ctx the parse tree
	 */
	void exitRec_address_family_tail(CiscoXrParser.Rec_address_family_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#rec_metric_weights}.
	 * @param ctx the parse tree
	 */
	void enterRec_metric_weights(CiscoXrParser.Rec_metric_weightsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#rec_metric_weights}.
	 * @param ctx the parse tree
	 */
	void exitRec_metric_weights(CiscoXrParser.Rec_metric_weightsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#rec_null}.
	 * @param ctx the parse tree
	 */
	void enterRec_null(CiscoXrParser.Rec_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#rec_null}.
	 * @param ctx the parse tree
	 */
	void exitRec_null(CiscoXrParser.Rec_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ren_address_family}.
	 * @param ctx the parse tree
	 */
	void enterRen_address_family(CiscoXrParser.Ren_address_familyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ren_address_family}.
	 * @param ctx the parse tree
	 */
	void exitRen_address_family(CiscoXrParser.Ren_address_familyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ren_address_family_null}.
	 * @param ctx the parse tree
	 */
	void enterRen_address_family_null(CiscoXrParser.Ren_address_family_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ren_address_family_null}.
	 * @param ctx the parse tree
	 */
	void exitRen_address_family_null(CiscoXrParser.Ren_address_family_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ren_address_family_tail}.
	 * @param ctx the parse tree
	 */
	void enterRen_address_family_tail(CiscoXrParser.Ren_address_family_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ren_address_family_tail}.
	 * @param ctx the parse tree
	 */
	void exitRen_address_family_tail(CiscoXrParser.Ren_address_family_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ren_metric_weights}.
	 * @param ctx the parse tree
	 */
	void enterRen_metric_weights(CiscoXrParser.Ren_metric_weightsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ren_metric_weights}.
	 * @param ctx the parse tree
	 */
	void exitRen_metric_weights(CiscoXrParser.Ren_metric_weightsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ren_null}.
	 * @param ctx the parse tree
	 */
	void enterRen_null(CiscoXrParser.Ren_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ren_null}.
	 * @param ctx the parse tree
	 */
	void exitRen_null(CiscoXrParser.Ren_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ren_service_family}.
	 * @param ctx the parse tree
	 */
	void enterRen_service_family(CiscoXrParser.Ren_service_familyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ren_service_family}.
	 * @param ctx the parse tree
	 */
	void exitRen_service_family(CiscoXrParser.Ren_service_familyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ren_service_family_null}.
	 * @param ctx the parse tree
	 */
	void enterRen_service_family_null(CiscoXrParser.Ren_service_family_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ren_service_family_null}.
	 * @param ctx the parse tree
	 */
	void exitRen_service_family_null(CiscoXrParser.Ren_service_family_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ren_service_family_tail}.
	 * @param ctx the parse tree
	 */
	void enterRen_service_family_tail(CiscoXrParser.Ren_service_family_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ren_service_family_tail}.
	 * @param ctx the parse tree
	 */
	void exitRen_service_family_tail(CiscoXrParser.Ren_service_family_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#resf_interface}.
	 * @param ctx the parse tree
	 */
	void enterResf_interface(CiscoXrParser.Resf_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#resf_interface}.
	 * @param ctx the parse tree
	 */
	void exitResf_interface(CiscoXrParser.Resf_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#resf_interface_default}.
	 * @param ctx the parse tree
	 */
	void enterResf_interface_default(CiscoXrParser.Resf_interface_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#resf_interface_default}.
	 * @param ctx the parse tree
	 */
	void exitResf_interface_default(CiscoXrParser.Resf_interface_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#resf_interface_null}.
	 * @param ctx the parse tree
	 */
	void enterResf_interface_null(CiscoXrParser.Resf_interface_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#resf_interface_null}.
	 * @param ctx the parse tree
	 */
	void exitResf_interface_null(CiscoXrParser.Resf_interface_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#resf_interface_tail}.
	 * @param ctx the parse tree
	 */
	void enterResf_interface_tail(CiscoXrParser.Resf_interface_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#resf_interface_tail}.
	 * @param ctx the parse tree
	 */
	void exitResf_interface_tail(CiscoXrParser.Resf_interface_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#resf_null}.
	 * @param ctx the parse tree
	 */
	void enterResf_null(CiscoXrParser.Resf_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#resf_null}.
	 * @param ctx the parse tree
	 */
	void exitResf_null(CiscoXrParser.Resf_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#resf_topology_tail}.
	 * @param ctx the parse tree
	 */
	void enterResf_topology_tail(CiscoXrParser.Resf_topology_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#resf_topology_tail}.
	 * @param ctx the parse tree
	 */
	void exitResf_topology_tail(CiscoXrParser.Resf_topology_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#resf_topology_null}.
	 * @param ctx the parse tree
	 */
	void enterResf_topology_null(CiscoXrParser.Resf_topology_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#resf_topology_null}.
	 * @param ctx the parse tree
	 */
	void exitResf_topology_null(CiscoXrParser.Resf_topology_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#resf_footer}.
	 * @param ctx the parse tree
	 */
	void enterResf_footer(CiscoXrParser.Resf_footerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#resf_footer}.
	 * @param ctx the parse tree
	 */
	void exitResf_footer(CiscoXrParser.Resf_footerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#resf_topology}.
	 * @param ctx the parse tree
	 */
	void enterResf_topology(CiscoXrParser.Resf_topologyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#resf_topology}.
	 * @param ctx the parse tree
	 */
	void exitResf_topology(CiscoXrParser.Resf_topologyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_router_eigrp}.
	 * @param ctx the parse tree
	 */
	void enterS_router_eigrp(CiscoXrParser.S_router_eigrpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_router_eigrp}.
	 * @param ctx the parse tree
	 */
	void exitS_router_eigrp(CiscoXrParser.S_router_eigrpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_extcommunity_set}.
	 * @param ctx the parse tree
	 */
	void enterS_extcommunity_set(CiscoXrParser.S_extcommunity_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_extcommunity_set}.
	 * @param ctx the parse tree
	 */
	void exitS_extcommunity_set(CiscoXrParser.S_extcommunity_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#extcommunity_set_rt}.
	 * @param ctx the parse tree
	 */
	void enterExtcommunity_set_rt(CiscoXrParser.Extcommunity_set_rtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#extcommunity_set_rt}.
	 * @param ctx the parse tree
	 */
	void exitExtcommunity_set_rt(CiscoXrParser.Extcommunity_set_rtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#extcommunity_set_rt_elem_lines}.
	 * @param ctx the parse tree
	 */
	void enterExtcommunity_set_rt_elem_lines(CiscoXrParser.Extcommunity_set_rt_elem_linesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#extcommunity_set_rt_elem_lines}.
	 * @param ctx the parse tree
	 */
	void exitExtcommunity_set_rt_elem_lines(CiscoXrParser.Extcommunity_set_rt_elem_linesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#extcommunity_set_rt_elem}.
	 * @param ctx the parse tree
	 */
	void enterExtcommunity_set_rt_elem(CiscoXrParser.Extcommunity_set_rt_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#extcommunity_set_rt_elem}.
	 * @param ctx the parse tree
	 */
	void exitExtcommunity_set_rt_elem(CiscoXrParser.Extcommunity_set_rt_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#extcommunity_set_rt_elem_as_dot_colon}.
	 * @param ctx the parse tree
	 */
	void enterExtcommunity_set_rt_elem_as_dot_colon(CiscoXrParser.Extcommunity_set_rt_elem_as_dot_colonContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#extcommunity_set_rt_elem_as_dot_colon}.
	 * @param ctx the parse tree
	 */
	void exitExtcommunity_set_rt_elem_as_dot_colon(CiscoXrParser.Extcommunity_set_rt_elem_as_dot_colonContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#extcommunity_set_rt_elem_colon}.
	 * @param ctx the parse tree
	 */
	void enterExtcommunity_set_rt_elem_colon(CiscoXrParser.Extcommunity_set_rt_elem_colonContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#extcommunity_set_rt_elem_colon}.
	 * @param ctx the parse tree
	 */
	void exitExtcommunity_set_rt_elem_colon(CiscoXrParser.Extcommunity_set_rt_elem_colonContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#extcommunity_set_rt_elem_16}.
	 * @param ctx the parse tree
	 */
	void enterExtcommunity_set_rt_elem_16(CiscoXrParser.Extcommunity_set_rt_elem_16Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#extcommunity_set_rt_elem_16}.
	 * @param ctx the parse tree
	 */
	void exitExtcommunity_set_rt_elem_16(CiscoXrParser.Extcommunity_set_rt_elem_16Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#extcommunity_set_rt_elem_32}.
	 * @param ctx the parse tree
	 */
	void enterExtcommunity_set_rt_elem_32(CiscoXrParser.Extcommunity_set_rt_elem_32Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#extcommunity_set_rt_elem_32}.
	 * @param ctx the parse tree
	 */
	void exitExtcommunity_set_rt_elem_32(CiscoXrParser.Extcommunity_set_rt_elem_32Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#router_hsrp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterRouter_hsrp_stanza(CiscoXrParser.Router_hsrp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#router_hsrp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitRouter_hsrp_stanza(CiscoXrParser.Router_hsrp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#router_hsrp_if}.
	 * @param ctx the parse tree
	 */
	void enterRouter_hsrp_if(CiscoXrParser.Router_hsrp_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#router_hsrp_if}.
	 * @param ctx the parse tree
	 */
	void exitRouter_hsrp_if(CiscoXrParser.Router_hsrp_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#router_hsrp_if_af}.
	 * @param ctx the parse tree
	 */
	void enterRouter_hsrp_if_af(CiscoXrParser.Router_hsrp_if_afContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#router_hsrp_if_af}.
	 * @param ctx the parse tree
	 */
	void exitRouter_hsrp_if_af(CiscoXrParser.Router_hsrp_if_afContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#router_hsrp_if_af_tail}.
	 * @param ctx the parse tree
	 */
	void enterRouter_hsrp_if_af_tail(CiscoXrParser.Router_hsrp_if_af_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#router_hsrp_if_af_tail}.
	 * @param ctx the parse tree
	 */
	void exitRouter_hsrp_if_af_tail(CiscoXrParser.Router_hsrp_if_af_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#null_block}.
	 * @param ctx the parse tree
	 */
	void enterNull_block(CiscoXrParser.Null_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#null_block}.
	 * @param ctx the parse tree
	 */
	void exitNull_block(CiscoXrParser.Null_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#null_inner}.
	 * @param ctx the parse tree
	 */
	void enterNull_inner(CiscoXrParser.Null_innerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#null_inner}.
	 * @param ctx the parse tree
	 */
	void exitNull_inner(CiscoXrParser.Null_innerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#null_single}.
	 * @param ctx the parse tree
	 */
	void enterNull_single(CiscoXrParser.Null_singleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#null_single}.
	 * @param ctx the parse tree
	 */
	void exitNull_single(CiscoXrParser.Null_singleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#null_no}.
	 * @param ctx the parse tree
	 */
	void enterNull_no(CiscoXrParser.Null_noContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#null_no}.
	 * @param ctx the parse tree
	 */
	void exitNull_no(CiscoXrParser.Null_noContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_null}.
	 * @param ctx the parse tree
	 */
	void enterS_null(CiscoXrParser.S_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_null}.
	 * @param ctx the parse tree
	 */
	void exitS_null(CiscoXrParser.S_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_autostate}.
	 * @param ctx the parse tree
	 */
	void enterIf_autostate(CiscoXrParser.If_autostateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_autostate}.
	 * @param ctx the parse tree
	 */
	void exitIf_autostate(CiscoXrParser.If_autostateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_bandwidth}.
	 * @param ctx the parse tree
	 */
	void enterIf_bandwidth(CiscoXrParser.If_bandwidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_bandwidth}.
	 * @param ctx the parse tree
	 */
	void exitIf_bandwidth(CiscoXrParser.If_bandwidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_bfd}.
	 * @param ctx the parse tree
	 */
	void enterIf_bfd(CiscoXrParser.If_bfdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_bfd}.
	 * @param ctx the parse tree
	 */
	void exitIf_bfd(CiscoXrParser.If_bfdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_bfd_authentication}.
	 * @param ctx the parse tree
	 */
	void enterIf_bfd_authentication(CiscoXrParser.If_bfd_authenticationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_bfd_authentication}.
	 * @param ctx the parse tree
	 */
	void exitIf_bfd_authentication(CiscoXrParser.If_bfd_authenticationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_bfd_echo}.
	 * @param ctx the parse tree
	 */
	void enterIf_bfd_echo(CiscoXrParser.If_bfd_echoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_bfd_echo}.
	 * @param ctx the parse tree
	 */
	void exitIf_bfd_echo(CiscoXrParser.If_bfd_echoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_bfd_echo_rx_interval}.
	 * @param ctx the parse tree
	 */
	void enterIf_bfd_echo_rx_interval(CiscoXrParser.If_bfd_echo_rx_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_bfd_echo_rx_interval}.
	 * @param ctx the parse tree
	 */
	void exitIf_bfd_echo_rx_interval(CiscoXrParser.If_bfd_echo_rx_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_bfd_interval}.
	 * @param ctx the parse tree
	 */
	void enterIf_bfd_interval(CiscoXrParser.If_bfd_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_bfd_interval}.
	 * @param ctx the parse tree
	 */
	void exitIf_bfd_interval(CiscoXrParser.If_bfd_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_bfd_neighbor}.
	 * @param ctx the parse tree
	 */
	void enterIf_bfd_neighbor(CiscoXrParser.If_bfd_neighborContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_bfd_neighbor}.
	 * @param ctx the parse tree
	 */
	void exitIf_bfd_neighbor(CiscoXrParser.If_bfd_neighborContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_bfd_optimize}.
	 * @param ctx the parse tree
	 */
	void enterIf_bfd_optimize(CiscoXrParser.If_bfd_optimizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_bfd_optimize}.
	 * @param ctx the parse tree
	 */
	void exitIf_bfd_optimize(CiscoXrParser.If_bfd_optimizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_bfd_template}.
	 * @param ctx the parse tree
	 */
	void enterIf_bfd_template(CiscoXrParser.If_bfd_templateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_bfd_template}.
	 * @param ctx the parse tree
	 */
	void exitIf_bfd_template(CiscoXrParser.If_bfd_templateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_bundle}.
	 * @param ctx the parse tree
	 */
	void enterIf_bundle(CiscoXrParser.If_bundleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_bundle}.
	 * @param ctx the parse tree
	 */
	void exitIf_bundle(CiscoXrParser.If_bundleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_bundle_id}.
	 * @param ctx the parse tree
	 */
	void enterIf_bundle_id(CiscoXrParser.If_bundle_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_bundle_id}.
	 * @param ctx the parse tree
	 */
	void exitIf_bundle_id(CiscoXrParser.If_bundle_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_bundle_null}.
	 * @param ctx the parse tree
	 */
	void enterIf_bundle_null(CiscoXrParser.If_bundle_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_bundle_null}.
	 * @param ctx the parse tree
	 */
	void exitIf_bundle_null(CiscoXrParser.If_bundle_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_channel_group}.
	 * @param ctx the parse tree
	 */
	void enterIf_channel_group(CiscoXrParser.If_channel_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_channel_group}.
	 * @param ctx the parse tree
	 */
	void exitIf_channel_group(CiscoXrParser.If_channel_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_crypto_map}.
	 * @param ctx the parse tree
	 */
	void enterIf_crypto_map(CiscoXrParser.If_crypto_mapContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_crypto_map}.
	 * @param ctx the parse tree
	 */
	void exitIf_crypto_map(CiscoXrParser.If_crypto_mapContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_default_gw}.
	 * @param ctx the parse tree
	 */
	void enterIf_default_gw(CiscoXrParser.If_default_gwContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_default_gw}.
	 * @param ctx the parse tree
	 */
	void exitIf_default_gw(CiscoXrParser.If_default_gwContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_description}.
	 * @param ctx the parse tree
	 */
	void enterIf_description(CiscoXrParser.If_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_description}.
	 * @param ctx the parse tree
	 */
	void exitIf_description(CiscoXrParser.If_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_delay}.
	 * @param ctx the parse tree
	 */
	void enterIf_delay(CiscoXrParser.If_delayContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_delay}.
	 * @param ctx the parse tree
	 */
	void exitIf_delay(CiscoXrParser.If_delayContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_flow_sampler}.
	 * @param ctx the parse tree
	 */
	void enterIf_flow_sampler(CiscoXrParser.If_flow_samplerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_flow_sampler}.
	 * @param ctx the parse tree
	 */
	void exitIf_flow_sampler(CiscoXrParser.If_flow_samplerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_hsrp}.
	 * @param ctx the parse tree
	 */
	void enterIf_hsrp(CiscoXrParser.If_hsrpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_hsrp}.
	 * @param ctx the parse tree
	 */
	void exitIf_hsrp(CiscoXrParser.If_hsrpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_hsrp_ip_address}.
	 * @param ctx the parse tree
	 */
	void enterIf_hsrp_ip_address(CiscoXrParser.If_hsrp_ip_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_hsrp_ip_address}.
	 * @param ctx the parse tree
	 */
	void exitIf_hsrp_ip_address(CiscoXrParser.If_hsrp_ip_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_hsrp_null}.
	 * @param ctx the parse tree
	 */
	void enterIf_hsrp_null(CiscoXrParser.If_hsrp_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_hsrp_null}.
	 * @param ctx the parse tree
	 */
	void exitIf_hsrp_null(CiscoXrParser.If_hsrp_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_hsrp_preempt}.
	 * @param ctx the parse tree
	 */
	void enterIf_hsrp_preempt(CiscoXrParser.If_hsrp_preemptContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_hsrp_preempt}.
	 * @param ctx the parse tree
	 */
	void exitIf_hsrp_preempt(CiscoXrParser.If_hsrp_preemptContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_hsrp_priority}.
	 * @param ctx the parse tree
	 */
	void enterIf_hsrp_priority(CiscoXrParser.If_hsrp_priorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_hsrp_priority}.
	 * @param ctx the parse tree
	 */
	void exitIf_hsrp_priority(CiscoXrParser.If_hsrp_priorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_hsrp_track}.
	 * @param ctx the parse tree
	 */
	void enterIf_hsrp_track(CiscoXrParser.If_hsrp_trackContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_hsrp_track}.
	 * @param ctx the parse tree
	 */
	void exitIf_hsrp_track(CiscoXrParser.If_hsrp_trackContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_hsrp6}.
	 * @param ctx the parse tree
	 */
	void enterIf_hsrp6(CiscoXrParser.If_hsrp6Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_hsrp6}.
	 * @param ctx the parse tree
	 */
	void exitIf_hsrp6(CiscoXrParser.If_hsrp6Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_hsrp6_ip_address}.
	 * @param ctx the parse tree
	 */
	void enterIf_hsrp6_ip_address(CiscoXrParser.If_hsrp6_ip_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_hsrp6_ip_address}.
	 * @param ctx the parse tree
	 */
	void exitIf_hsrp6_ip_address(CiscoXrParser.If_hsrp6_ip_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_access_group}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_access_group(CiscoXrParser.If_ip_access_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_access_group}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_access_group(CiscoXrParser.If_ip_access_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_address}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_address(CiscoXrParser.If_ip_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_address}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_address(CiscoXrParser.If_ip_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_address_dhcp}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_address_dhcp(CiscoXrParser.If_ip_address_dhcpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_address_dhcp}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_address_dhcp(CiscoXrParser.If_ip_address_dhcpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_address_secondary}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_address_secondary(CiscoXrParser.If_ip_address_secondaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_address_secondary}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_address_secondary(CiscoXrParser.If_ip_address_secondaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_authentication}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_authentication(CiscoXrParser.If_ip_authenticationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_authentication}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_authentication(CiscoXrParser.If_ip_authenticationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_auth_key_chain}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_auth_key_chain(CiscoXrParser.If_ip_auth_key_chainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_auth_key_chain}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_auth_key_chain(CiscoXrParser.If_ip_auth_key_chainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_auth_mode}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_auth_mode(CiscoXrParser.If_ip_auth_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_auth_mode}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_auth_mode(CiscoXrParser.If_ip_auth_modeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_dhcp}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_dhcp(CiscoXrParser.If_ip_dhcpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_dhcp}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_dhcp(CiscoXrParser.If_ip_dhcpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_flow_monitor}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_flow_monitor(CiscoXrParser.If_ip_flow_monitorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_flow_monitor}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_flow_monitor(CiscoXrParser.If_ip_flow_monitorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_forward}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_forward(CiscoXrParser.If_ip_forwardContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_forward}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_forward(CiscoXrParser.If_ip_forwardContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_hello_interval}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_hello_interval(CiscoXrParser.If_ip_hello_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_hello_interval}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_hello_interval(CiscoXrParser.If_ip_hello_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_helper_address}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_helper_address(CiscoXrParser.If_ip_helper_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_helper_address}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_helper_address(CiscoXrParser.If_ip_helper_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_hold_time}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_hold_time(CiscoXrParser.If_ip_hold_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_hold_time}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_hold_time(CiscoXrParser.If_ip_hold_timeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_inband_access_group}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_inband_access_group(CiscoXrParser.If_ip_inband_access_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_inband_access_group}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_inband_access_group(CiscoXrParser.If_ip_inband_access_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_igmp}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_igmp(CiscoXrParser.If_ip_igmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_igmp}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_igmp(CiscoXrParser.If_ip_igmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_nat_inside}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_nat_inside(CiscoXrParser.If_ip_nat_insideContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_nat_inside}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_nat_inside(CiscoXrParser.If_ip_nat_insideContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_nat_outside}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_nat_outside(CiscoXrParser.If_ip_nat_outsideContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_nat_outside}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_nat_outside(CiscoXrParser.If_ip_nat_outsideContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_nbar}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_nbar(CiscoXrParser.If_ip_nbarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_nbar}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_nbar(CiscoXrParser.If_ip_nbarContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_ospf_area}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_ospf_area(CiscoXrParser.If_ip_ospf_areaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_ospf_area}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_ospf_area(CiscoXrParser.If_ip_ospf_areaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_ospf_cost}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_ospf_cost(CiscoXrParser.If_ip_ospf_costContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_ospf_cost}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_ospf_cost(CiscoXrParser.If_ip_ospf_costContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_ospf_dead_interval}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_ospf_dead_interval(CiscoXrParser.If_ip_ospf_dead_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_ospf_dead_interval}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_ospf_dead_interval(CiscoXrParser.If_ip_ospf_dead_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_ospf_dead_interval_minimal}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_ospf_dead_interval_minimal(CiscoXrParser.If_ip_ospf_dead_interval_minimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_ospf_dead_interval_minimal}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_ospf_dead_interval_minimal(CiscoXrParser.If_ip_ospf_dead_interval_minimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_ospf_hello_interval}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_ospf_hello_interval(CiscoXrParser.If_ip_ospf_hello_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_ospf_hello_interval}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_ospf_hello_interval(CiscoXrParser.If_ip_ospf_hello_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_ospf_network}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_ospf_network(CiscoXrParser.If_ip_ospf_networkContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_ospf_network}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_ospf_network(CiscoXrParser.If_ip_ospf_networkContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_ospf_passive_interface}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_ospf_passive_interface(CiscoXrParser.If_ip_ospf_passive_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_ospf_passive_interface}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_ospf_passive_interface(CiscoXrParser.If_ip_ospf_passive_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_ospf_shutdown}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_ospf_shutdown(CiscoXrParser.If_ip_ospf_shutdownContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_ospf_shutdown}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_ospf_shutdown(CiscoXrParser.If_ip_ospf_shutdownContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_passive_interface_eigrp}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_passive_interface_eigrp(CiscoXrParser.If_ip_passive_interface_eigrpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_passive_interface_eigrp}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_passive_interface_eigrp(CiscoXrParser.If_ip_passive_interface_eigrpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_pim_neighbor_filter}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_pim_neighbor_filter(CiscoXrParser.If_ip_pim_neighbor_filterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_pim_neighbor_filter}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_pim_neighbor_filter(CiscoXrParser.If_ip_pim_neighbor_filterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_proxy_arp}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_proxy_arp(CiscoXrParser.If_ip_proxy_arpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_proxy_arp}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_proxy_arp(CiscoXrParser.If_ip_proxy_arpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_router_isis}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_router_isis(CiscoXrParser.If_ip_router_isisContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_router_isis}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_router_isis(CiscoXrParser.If_ip_router_isisContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_router_ospf_area}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_router_ospf_area(CiscoXrParser.If_ip_router_ospf_areaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_router_ospf_area}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_router_ospf_area(CiscoXrParser.If_ip_router_ospf_areaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_rtp}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_rtp(CiscoXrParser.If_ip_rtpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_rtp}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_rtp(CiscoXrParser.If_ip_rtpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_sticky_arp}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_sticky_arp(CiscoXrParser.If_ip_sticky_arpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_sticky_arp}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_sticky_arp(CiscoXrParser.If_ip_sticky_arpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_summary_address}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_summary_address(CiscoXrParser.If_ip_summary_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_summary_address}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_summary_address(CiscoXrParser.If_ip_summary_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_tcp}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_tcp(CiscoXrParser.If_ip_tcpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_tcp}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_tcp(CiscoXrParser.If_ip_tcpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_tcp_adjust_mss}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_tcp_adjust_mss(CiscoXrParser.If_ip_tcp_adjust_mssContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_tcp_adjust_mss}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_tcp_adjust_mss(CiscoXrParser.If_ip_tcp_adjust_mssContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_tcp_compression_connections}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_tcp_compression_connections(CiscoXrParser.If_ip_tcp_compression_connectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_tcp_compression_connections}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_tcp_compression_connections(CiscoXrParser.If_ip_tcp_compression_connectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_tcp_header_compression}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_tcp_header_compression(CiscoXrParser.If_ip_tcp_header_compressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_tcp_header_compression}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_tcp_header_compression(CiscoXrParser.If_ip_tcp_header_compressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_verify}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_verify(CiscoXrParser.If_ip_verifyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_verify}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_verify(CiscoXrParser.If_ip_verifyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_virtual_router}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_virtual_router(CiscoXrParser.If_ip_virtual_routerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_virtual_router}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_virtual_router(CiscoXrParser.If_ip_virtual_routerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_vrf_autoclassify}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_vrf_autoclassify(CiscoXrParser.If_ip_vrf_autoclassifyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_vrf_autoclassify}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_vrf_autoclassify(CiscoXrParser.If_ip_vrf_autoclassifyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_vrf_forwarding}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_vrf_forwarding(CiscoXrParser.If_ip_vrf_forwardingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_vrf_forwarding}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_vrf_forwarding(CiscoXrParser.If_ip_vrf_forwardingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_vrf_receive}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_vrf_receive(CiscoXrParser.If_ip_vrf_receiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_vrf_receive}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_vrf_receive(CiscoXrParser.If_ip_vrf_receiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ip_vrf_select}.
	 * @param ctx the parse tree
	 */
	void enterIf_ip_vrf_select(CiscoXrParser.If_ip_vrf_selectContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ip_vrf_select}.
	 * @param ctx the parse tree
	 */
	void exitIf_ip_vrf_select(CiscoXrParser.If_ip_vrf_selectContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ipv6}.
	 * @param ctx the parse tree
	 */
	void enterIf_ipv6(CiscoXrParser.If_ipv6Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ipv6}.
	 * @param ctx the parse tree
	 */
	void exitIf_ipv6(CiscoXrParser.If_ipv6Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ipv6_inner}.
	 * @param ctx the parse tree
	 */
	void enterIf_ipv6_inner(CiscoXrParser.If_ipv6_innerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ipv6_inner}.
	 * @param ctx the parse tree
	 */
	void exitIf_ipv6_inner(CiscoXrParser.If_ipv6_innerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ipv6_enable}.
	 * @param ctx the parse tree
	 */
	void enterIf_ipv6_enable(CiscoXrParser.If_ipv6_enableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ipv6_enable}.
	 * @param ctx the parse tree
	 */
	void exitIf_ipv6_enable(CiscoXrParser.If_ipv6_enableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_ipv6_traffic_filter}.
	 * @param ctx the parse tree
	 */
	void enterIf_ipv6_traffic_filter(CiscoXrParser.If_ipv6_traffic_filterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_ipv6_traffic_filter}.
	 * @param ctx the parse tree
	 */
	void exitIf_ipv6_traffic_filter(CiscoXrParser.If_ipv6_traffic_filterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_isis_circuit_type}.
	 * @param ctx the parse tree
	 */
	void enterIf_isis_circuit_type(CiscoXrParser.If_isis_circuit_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_isis_circuit_type}.
	 * @param ctx the parse tree
	 */
	void exitIf_isis_circuit_type(CiscoXrParser.If_isis_circuit_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_isis_enable}.
	 * @param ctx the parse tree
	 */
	void enterIf_isis_enable(CiscoXrParser.If_isis_enableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_isis_enable}.
	 * @param ctx the parse tree
	 */
	void exitIf_isis_enable(CiscoXrParser.If_isis_enableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_isis_hello_interval}.
	 * @param ctx the parse tree
	 */
	void enterIf_isis_hello_interval(CiscoXrParser.If_isis_hello_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_isis_hello_interval}.
	 * @param ctx the parse tree
	 */
	void exitIf_isis_hello_interval(CiscoXrParser.If_isis_hello_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_isis_metric}.
	 * @param ctx the parse tree
	 */
	void enterIf_isis_metric(CiscoXrParser.If_isis_metricContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_isis_metric}.
	 * @param ctx the parse tree
	 */
	void exitIf_isis_metric(CiscoXrParser.If_isis_metricContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_isis_network}.
	 * @param ctx the parse tree
	 */
	void enterIf_isis_network(CiscoXrParser.If_isis_networkContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_isis_network}.
	 * @param ctx the parse tree
	 */
	void exitIf_isis_network(CiscoXrParser.If_isis_networkContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_isis_passive}.
	 * @param ctx the parse tree
	 */
	void enterIf_isis_passive(CiscoXrParser.If_isis_passiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_isis_passive}.
	 * @param ctx the parse tree
	 */
	void exitIf_isis_passive(CiscoXrParser.If_isis_passiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_isis_tag}.
	 * @param ctx the parse tree
	 */
	void enterIf_isis_tag(CiscoXrParser.If_isis_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_isis_tag}.
	 * @param ctx the parse tree
	 */
	void exitIf_isis_tag(CiscoXrParser.If_isis_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_load_interval}.
	 * @param ctx the parse tree
	 */
	void enterIf_load_interval(CiscoXrParser.If_load_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_load_interval}.
	 * @param ctx the parse tree
	 */
	void exitIf_load_interval(CiscoXrParser.If_load_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_mtu}.
	 * @param ctx the parse tree
	 */
	void enterIf_mtu(CiscoXrParser.If_mtuContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_mtu}.
	 * @param ctx the parse tree
	 */
	void exitIf_mtu(CiscoXrParser.If_mtuContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_no_bfd}.
	 * @param ctx the parse tree
	 */
	void enterIf_no_bfd(CiscoXrParser.If_no_bfdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_no_bfd}.
	 * @param ctx the parse tree
	 */
	void exitIf_no_bfd(CiscoXrParser.If_no_bfdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_no_ip_address}.
	 * @param ctx the parse tree
	 */
	void enterIf_no_ip_address(CiscoXrParser.If_no_ip_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_no_ip_address}.
	 * @param ctx the parse tree
	 */
	void exitIf_no_ip_address(CiscoXrParser.If_no_ip_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_no_routing_dynamic}.
	 * @param ctx the parse tree
	 */
	void enterIf_no_routing_dynamic(CiscoXrParser.If_no_routing_dynamicContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_no_routing_dynamic}.
	 * @param ctx the parse tree
	 */
	void exitIf_no_routing_dynamic(CiscoXrParser.If_no_routing_dynamicContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_null_block}.
	 * @param ctx the parse tree
	 */
	void enterIf_null_block(CiscoXrParser.If_null_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_null_block}.
	 * @param ctx the parse tree
	 */
	void exitIf_null_block(CiscoXrParser.If_null_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_null_inner}.
	 * @param ctx the parse tree
	 */
	void enterIf_null_inner(CiscoXrParser.If_null_innerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_null_inner}.
	 * @param ctx the parse tree
	 */
	void exitIf_null_inner(CiscoXrParser.If_null_innerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_null_single}.
	 * @param ctx the parse tree
	 */
	void enterIf_null_single(CiscoXrParser.If_null_singleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_null_single}.
	 * @param ctx the parse tree
	 */
	void exitIf_null_single(CiscoXrParser.If_null_singleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_port_security}.
	 * @param ctx the parse tree
	 */
	void enterIf_port_security(CiscoXrParser.If_port_securityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_port_security}.
	 * @param ctx the parse tree
	 */
	void exitIf_port_security(CiscoXrParser.If_port_securityContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_private_vlan}.
	 * @param ctx the parse tree
	 */
	void enterIf_private_vlan(CiscoXrParser.If_private_vlanContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_private_vlan}.
	 * @param ctx the parse tree
	 */
	void exitIf_private_vlan(CiscoXrParser.If_private_vlanContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_routing_dynamic}.
	 * @param ctx the parse tree
	 */
	void enterIf_routing_dynamic(CiscoXrParser.If_routing_dynamicContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_routing_dynamic}.
	 * @param ctx the parse tree
	 */
	void exitIf_routing_dynamic(CiscoXrParser.If_routing_dynamicContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_service_instance}.
	 * @param ctx the parse tree
	 */
	void enterIf_service_instance(CiscoXrParser.If_service_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_service_instance}.
	 * @param ctx the parse tree
	 */
	void exitIf_service_instance(CiscoXrParser.If_service_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_si_inner}.
	 * @param ctx the parse tree
	 */
	void enterIf_si_inner(CiscoXrParser.If_si_innerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_si_inner}.
	 * @param ctx the parse tree
	 */
	void exitIf_si_inner(CiscoXrParser.If_si_innerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_si_bridge_domain}.
	 * @param ctx the parse tree
	 */
	void enterIf_si_bridge_domain(CiscoXrParser.If_si_bridge_domainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_si_bridge_domain}.
	 * @param ctx the parse tree
	 */
	void exitIf_si_bridge_domain(CiscoXrParser.If_si_bridge_domainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_si_encapsulation}.
	 * @param ctx the parse tree
	 */
	void enterIf_si_encapsulation(CiscoXrParser.If_si_encapsulationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_si_encapsulation}.
	 * @param ctx the parse tree
	 */
	void exitIf_si_encapsulation(CiscoXrParser.If_si_encapsulationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_si_l2protocol}.
	 * @param ctx the parse tree
	 */
	void enterIf_si_l2protocol(CiscoXrParser.If_si_l2protocolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_si_l2protocol}.
	 * @param ctx the parse tree
	 */
	void exitIf_si_l2protocol(CiscoXrParser.If_si_l2protocolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_si_no_bridge_domain}.
	 * @param ctx the parse tree
	 */
	void enterIf_si_no_bridge_domain(CiscoXrParser.If_si_no_bridge_domainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_si_no_bridge_domain}.
	 * @param ctx the parse tree
	 */
	void exitIf_si_no_bridge_domain(CiscoXrParser.If_si_no_bridge_domainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_si_rewrite}.
	 * @param ctx the parse tree
	 */
	void enterIf_si_rewrite(CiscoXrParser.If_si_rewriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_si_rewrite}.
	 * @param ctx the parse tree
	 */
	void exitIf_si_rewrite(CiscoXrParser.If_si_rewriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_si_service_policy}.
	 * @param ctx the parse tree
	 */
	void enterIf_si_service_policy(CiscoXrParser.If_si_service_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_si_service_policy}.
	 * @param ctx the parse tree
	 */
	void exitIf_si_service_policy(CiscoXrParser.If_si_service_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_spanning_tree}.
	 * @param ctx the parse tree
	 */
	void enterIf_spanning_tree(CiscoXrParser.If_spanning_treeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_spanning_tree}.
	 * @param ctx the parse tree
	 */
	void exitIf_spanning_tree(CiscoXrParser.If_spanning_treeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_speed_auto}.
	 * @param ctx the parse tree
	 */
	void enterIf_speed_auto(CiscoXrParser.If_speed_autoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_speed_auto}.
	 * @param ctx the parse tree
	 */
	void exitIf_speed_auto(CiscoXrParser.If_speed_autoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_speed_ios}.
	 * @param ctx the parse tree
	 */
	void enterIf_speed_ios(CiscoXrParser.If_speed_iosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_speed_ios}.
	 * @param ctx the parse tree
	 */
	void exitIf_speed_ios(CiscoXrParser.If_speed_iosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_speed_ios_dot11radio}.
	 * @param ctx the parse tree
	 */
	void enterIf_speed_ios_dot11radio(CiscoXrParser.If_speed_ios_dot11radioContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_speed_ios_dot11radio}.
	 * @param ctx the parse tree
	 */
	void exitIf_speed_ios_dot11radio(CiscoXrParser.If_speed_ios_dot11radioContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_st_null}.
	 * @param ctx the parse tree
	 */
	void enterIf_st_null(CiscoXrParser.If_st_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_st_null}.
	 * @param ctx the parse tree
	 */
	void exitIf_st_null(CiscoXrParser.If_st_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_st_portfast}.
	 * @param ctx the parse tree
	 */
	void enterIf_st_portfast(CiscoXrParser.If_st_portfastContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_st_portfast}.
	 * @param ctx the parse tree
	 */
	void exitIf_st_portfast(CiscoXrParser.If_st_portfastContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_port_security_null}.
	 * @param ctx the parse tree
	 */
	void enterIf_port_security_null(CiscoXrParser.If_port_security_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_port_security_null}.
	 * @param ctx the parse tree
	 */
	void exitIf_port_security_null(CiscoXrParser.If_port_security_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_service_policy}.
	 * @param ctx the parse tree
	 */
	void enterIf_service_policy(CiscoXrParser.If_service_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_service_policy}.
	 * @param ctx the parse tree
	 */
	void exitIf_service_policy(CiscoXrParser.If_service_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_shutdown}.
	 * @param ctx the parse tree
	 */
	void enterIf_shutdown(CiscoXrParser.If_shutdownContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_shutdown}.
	 * @param ctx the parse tree
	 */
	void exitIf_shutdown(CiscoXrParser.If_shutdownContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_standby}.
	 * @param ctx the parse tree
	 */
	void enterIf_standby(CiscoXrParser.If_standbyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_standby}.
	 * @param ctx the parse tree
	 */
	void exitIf_standby(CiscoXrParser.If_standbyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#standby_group}.
	 * @param ctx the parse tree
	 */
	void enterStandby_group(CiscoXrParser.Standby_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#standby_group}.
	 * @param ctx the parse tree
	 */
	void exitStandby_group(CiscoXrParser.Standby_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#standby_group_authentication}.
	 * @param ctx the parse tree
	 */
	void enterStandby_group_authentication(CiscoXrParser.Standby_group_authenticationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#standby_group_authentication}.
	 * @param ctx the parse tree
	 */
	void exitStandby_group_authentication(CiscoXrParser.Standby_group_authenticationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#standby_group_ip}.
	 * @param ctx the parse tree
	 */
	void enterStandby_group_ip(CiscoXrParser.Standby_group_ipContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#standby_group_ip}.
	 * @param ctx the parse tree
	 */
	void exitStandby_group_ip(CiscoXrParser.Standby_group_ipContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#standby_group_preempt}.
	 * @param ctx the parse tree
	 */
	void enterStandby_group_preempt(CiscoXrParser.Standby_group_preemptContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#standby_group_preempt}.
	 * @param ctx the parse tree
	 */
	void exitStandby_group_preempt(CiscoXrParser.Standby_group_preemptContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#standby_group_preempt_delay}.
	 * @param ctx the parse tree
	 */
	void enterStandby_group_preempt_delay(CiscoXrParser.Standby_group_preempt_delayContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#standby_group_preempt_delay}.
	 * @param ctx the parse tree
	 */
	void exitStandby_group_preempt_delay(CiscoXrParser.Standby_group_preempt_delayContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#standby_group_priority}.
	 * @param ctx the parse tree
	 */
	void enterStandby_group_priority(CiscoXrParser.Standby_group_priorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#standby_group_priority}.
	 * @param ctx the parse tree
	 */
	void exitStandby_group_priority(CiscoXrParser.Standby_group_priorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#standby_group_timers}.
	 * @param ctx the parse tree
	 */
	void enterStandby_group_timers(CiscoXrParser.Standby_group_timersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#standby_group_timers}.
	 * @param ctx the parse tree
	 */
	void exitStandby_group_timers(CiscoXrParser.Standby_group_timersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#standby_group_track}.
	 * @param ctx the parse tree
	 */
	void enterStandby_group_track(CiscoXrParser.Standby_group_trackContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#standby_group_track}.
	 * @param ctx the parse tree
	 */
	void exitStandby_group_track(CiscoXrParser.Standby_group_trackContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#track_action}.
	 * @param ctx the parse tree
	 */
	void enterTrack_action(CiscoXrParser.Track_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#track_action}.
	 * @param ctx the parse tree
	 */
	void exitTrack_action(CiscoXrParser.Track_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#track_action_decrement}.
	 * @param ctx the parse tree
	 */
	void enterTrack_action_decrement(CiscoXrParser.Track_action_decrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#track_action_decrement}.
	 * @param ctx the parse tree
	 */
	void exitTrack_action_decrement(CiscoXrParser.Track_action_decrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#standby_version}.
	 * @param ctx the parse tree
	 */
	void enterStandby_version(CiscoXrParser.Standby_versionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#standby_version}.
	 * @param ctx the parse tree
	 */
	void exitStandby_version(CiscoXrParser.Standby_versionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_switchport}.
	 * @param ctx the parse tree
	 */
	void enterIf_switchport(CiscoXrParser.If_switchportContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_switchport}.
	 * @param ctx the parse tree
	 */
	void exitIf_switchport(CiscoXrParser.If_switchportContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_switchport_access}.
	 * @param ctx the parse tree
	 */
	void enterIf_switchport_access(CiscoXrParser.If_switchport_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_switchport_access}.
	 * @param ctx the parse tree
	 */
	void exitIf_switchport_access(CiscoXrParser.If_switchport_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_switchport_mode}.
	 * @param ctx the parse tree
	 */
	void enterIf_switchport_mode(CiscoXrParser.If_switchport_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_switchport_mode}.
	 * @param ctx the parse tree
	 */
	void exitIf_switchport_mode(CiscoXrParser.If_switchport_modeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_switchport_mode_monitor}.
	 * @param ctx the parse tree
	 */
	void enterIf_switchport_mode_monitor(CiscoXrParser.If_switchport_mode_monitorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_switchport_mode_monitor}.
	 * @param ctx the parse tree
	 */
	void exitIf_switchport_mode_monitor(CiscoXrParser.If_switchport_mode_monitorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_switchport_private_vlan_association}.
	 * @param ctx the parse tree
	 */
	void enterIf_switchport_private_vlan_association(CiscoXrParser.If_switchport_private_vlan_associationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_switchport_private_vlan_association}.
	 * @param ctx the parse tree
	 */
	void exitIf_switchport_private_vlan_association(CiscoXrParser.If_switchport_private_vlan_associationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_switchport_private_vlan_host_association}.
	 * @param ctx the parse tree
	 */
	void enterIf_switchport_private_vlan_host_association(CiscoXrParser.If_switchport_private_vlan_host_associationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_switchport_private_vlan_host_association}.
	 * @param ctx the parse tree
	 */
	void exitIf_switchport_private_vlan_host_association(CiscoXrParser.If_switchport_private_vlan_host_associationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_switchport_private_vlan_mapping}.
	 * @param ctx the parse tree
	 */
	void enterIf_switchport_private_vlan_mapping(CiscoXrParser.If_switchport_private_vlan_mappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_switchport_private_vlan_mapping}.
	 * @param ctx the parse tree
	 */
	void exitIf_switchport_private_vlan_mapping(CiscoXrParser.If_switchport_private_vlan_mappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_switchport_trunk_allowed}.
	 * @param ctx the parse tree
	 */
	void enterIf_switchport_trunk_allowed(CiscoXrParser.If_switchport_trunk_allowedContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_switchport_trunk_allowed}.
	 * @param ctx the parse tree
	 */
	void exitIf_switchport_trunk_allowed(CiscoXrParser.If_switchport_trunk_allowedContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_switchport_trunk_encapsulation}.
	 * @param ctx the parse tree
	 */
	void enterIf_switchport_trunk_encapsulation(CiscoXrParser.If_switchport_trunk_encapsulationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_switchport_trunk_encapsulation}.
	 * @param ctx the parse tree
	 */
	void exitIf_switchport_trunk_encapsulation(CiscoXrParser.If_switchport_trunk_encapsulationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_switchport_trunk_native}.
	 * @param ctx the parse tree
	 */
	void enterIf_switchport_trunk_native(CiscoXrParser.If_switchport_trunk_nativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_switchport_trunk_native}.
	 * @param ctx the parse tree
	 */
	void exitIf_switchport_trunk_native(CiscoXrParser.If_switchport_trunk_nativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_tunnel}.
	 * @param ctx the parse tree
	 */
	void enterIf_tunnel(CiscoXrParser.If_tunnelContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_tunnel}.
	 * @param ctx the parse tree
	 */
	void exitIf_tunnel(CiscoXrParser.If_tunnelContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_vlan}.
	 * @param ctx the parse tree
	 */
	void enterIf_vlan(CiscoXrParser.If_vlanContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_vlan}.
	 * @param ctx the parse tree
	 */
	void exitIf_vlan(CiscoXrParser.If_vlanContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_vrf}.
	 * @param ctx the parse tree
	 */
	void enterIf_vrf(CiscoXrParser.If_vrfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_vrf}.
	 * @param ctx the parse tree
	 */
	void exitIf_vrf(CiscoXrParser.If_vrfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_vrf_member}.
	 * @param ctx the parse tree
	 */
	void enterIf_vrf_member(CiscoXrParser.If_vrf_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_vrf_member}.
	 * @param ctx the parse tree
	 */
	void exitIf_vrf_member(CiscoXrParser.If_vrf_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_vrrp}.
	 * @param ctx the parse tree
	 */
	void enterIf_vrrp(CiscoXrParser.If_vrrpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_vrrp}.
	 * @param ctx the parse tree
	 */
	void exitIf_vrrp(CiscoXrParser.If_vrrpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_vrrpno}.
	 * @param ctx the parse tree
	 */
	void enterIf_vrrpno(CiscoXrParser.If_vrrpnoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_vrrpno}.
	 * @param ctx the parse tree
	 */
	void exitIf_vrrpno(CiscoXrParser.If_vrrpnoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ifvrrpno_preempt}.
	 * @param ctx the parse tree
	 */
	void enterIfvrrpno_preempt(CiscoXrParser.Ifvrrpno_preemptContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ifvrrpno_preempt}.
	 * @param ctx the parse tree
	 */
	void exitIfvrrpno_preempt(CiscoXrParser.Ifvrrpno_preemptContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ifdhcp_null}.
	 * @param ctx the parse tree
	 */
	void enterIfdhcp_null(CiscoXrParser.Ifdhcp_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ifdhcp_null}.
	 * @param ctx the parse tree
	 */
	void exitIfdhcp_null(CiscoXrParser.Ifdhcp_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ifdhcp_relay}.
	 * @param ctx the parse tree
	 */
	void enterIfdhcp_relay(CiscoXrParser.Ifdhcp_relayContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ifdhcp_relay}.
	 * @param ctx the parse tree
	 */
	void exitIfdhcp_relay(CiscoXrParser.Ifdhcp_relayContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ifdhcpr_address}.
	 * @param ctx the parse tree
	 */
	void enterIfdhcpr_address(CiscoXrParser.Ifdhcpr_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ifdhcpr_address}.
	 * @param ctx the parse tree
	 */
	void exitIfdhcpr_address(CiscoXrParser.Ifdhcpr_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ifdhcpr_client}.
	 * @param ctx the parse tree
	 */
	void enterIfdhcpr_client(CiscoXrParser.Ifdhcpr_clientContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ifdhcpr_client}.
	 * @param ctx the parse tree
	 */
	void exitIfdhcpr_client(CiscoXrParser.Ifdhcpr_clientContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ifdhcpr_null}.
	 * @param ctx the parse tree
	 */
	void enterIfdhcpr_null(CiscoXrParser.Ifdhcpr_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ifdhcpr_null}.
	 * @param ctx the parse tree
	 */
	void exitIfdhcpr_null(CiscoXrParser.Ifdhcpr_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ifigmp_access_group}.
	 * @param ctx the parse tree
	 */
	void enterIfigmp_access_group(CiscoXrParser.Ifigmp_access_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ifigmp_access_group}.
	 * @param ctx the parse tree
	 */
	void exitIfigmp_access_group(CiscoXrParser.Ifigmp_access_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ifigmp_host_proxy}.
	 * @param ctx the parse tree
	 */
	void enterIfigmp_host_proxy(CiscoXrParser.Ifigmp_host_proxyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ifigmp_host_proxy}.
	 * @param ctx the parse tree
	 */
	void exitIfigmp_host_proxy(CiscoXrParser.Ifigmp_host_proxyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ifigmphp_access_list}.
	 * @param ctx the parse tree
	 */
	void enterIfigmphp_access_list(CiscoXrParser.Ifigmphp_access_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ifigmphp_access_list}.
	 * @param ctx the parse tree
	 */
	void exitIfigmphp_access_list(CiscoXrParser.Ifigmphp_access_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ifigmphp_null}.
	 * @param ctx the parse tree
	 */
	void enterIfigmphp_null(CiscoXrParser.Ifigmphp_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ifigmphp_null}.
	 * @param ctx the parse tree
	 */
	void exitIfigmphp_null(CiscoXrParser.Ifigmphp_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ifigmp_null}.
	 * @param ctx the parse tree
	 */
	void enterIfigmp_null(CiscoXrParser.Ifigmp_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ifigmp_null}.
	 * @param ctx the parse tree
	 */
	void exitIfigmp_null(CiscoXrParser.Ifigmp_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ifigmp_static_group}.
	 * @param ctx the parse tree
	 */
	void enterIfigmp_static_group(CiscoXrParser.Ifigmp_static_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ifigmp_static_group}.
	 * @param ctx the parse tree
	 */
	void exitIfigmp_static_group(CiscoXrParser.Ifigmp_static_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ifigmpsg_acl}.
	 * @param ctx the parse tree
	 */
	void enterIfigmpsg_acl(CiscoXrParser.Ifigmpsg_aclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ifigmpsg_acl}.
	 * @param ctx the parse tree
	 */
	void exitIfigmpsg_acl(CiscoXrParser.Ifigmpsg_aclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ifigmpsg_null}.
	 * @param ctx the parse tree
	 */
	void enterIfigmpsg_null(CiscoXrParser.Ifigmpsg_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ifigmpsg_null}.
	 * @param ctx the parse tree
	 */
	void exitIfigmpsg_null(CiscoXrParser.Ifigmpsg_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#iftunnel_bandwidth}.
	 * @param ctx the parse tree
	 */
	void enterIftunnel_bandwidth(CiscoXrParser.Iftunnel_bandwidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#iftunnel_bandwidth}.
	 * @param ctx the parse tree
	 */
	void exitIftunnel_bandwidth(CiscoXrParser.Iftunnel_bandwidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#iftunnel_destination}.
	 * @param ctx the parse tree
	 */
	void enterIftunnel_destination(CiscoXrParser.Iftunnel_destinationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#iftunnel_destination}.
	 * @param ctx the parse tree
	 */
	void exitIftunnel_destination(CiscoXrParser.Iftunnel_destinationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#iftunnel_key}.
	 * @param ctx the parse tree
	 */
	void enterIftunnel_key(CiscoXrParser.Iftunnel_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#iftunnel_key}.
	 * @param ctx the parse tree
	 */
	void exitIftunnel_key(CiscoXrParser.Iftunnel_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#iftunnel_mode}.
	 * @param ctx the parse tree
	 */
	void enterIftunnel_mode(CiscoXrParser.Iftunnel_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#iftunnel_mode}.
	 * @param ctx the parse tree
	 */
	void exitIftunnel_mode(CiscoXrParser.Iftunnel_modeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#iftunnel_path_mtu_discovery}.
	 * @param ctx the parse tree
	 */
	void enterIftunnel_path_mtu_discovery(CiscoXrParser.Iftunnel_path_mtu_discoveryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#iftunnel_path_mtu_discovery}.
	 * @param ctx the parse tree
	 */
	void exitIftunnel_path_mtu_discovery(CiscoXrParser.Iftunnel_path_mtu_discoveryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#iftunnel_protection}.
	 * @param ctx the parse tree
	 */
	void enterIftunnel_protection(CiscoXrParser.Iftunnel_protectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#iftunnel_protection}.
	 * @param ctx the parse tree
	 */
	void exitIftunnel_protection(CiscoXrParser.Iftunnel_protectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#iftunnel_source}.
	 * @param ctx the parse tree
	 */
	void enterIftunnel_source(CiscoXrParser.Iftunnel_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#iftunnel_source}.
	 * @param ctx the parse tree
	 */
	void exitIftunnel_source(CiscoXrParser.Iftunnel_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ifvrrp_authentication}.
	 * @param ctx the parse tree
	 */
	void enterIfvrrp_authentication(CiscoXrParser.Ifvrrp_authenticationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ifvrrp_authentication}.
	 * @param ctx the parse tree
	 */
	void exitIfvrrp_authentication(CiscoXrParser.Ifvrrp_authenticationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ifvrrp_description}.
	 * @param ctx the parse tree
	 */
	void enterIfvrrp_description(CiscoXrParser.Ifvrrp_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ifvrrp_description}.
	 * @param ctx the parse tree
	 */
	void exitIfvrrp_description(CiscoXrParser.Ifvrrp_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ifvrrp_ip}.
	 * @param ctx the parse tree
	 */
	void enterIfvrrp_ip(CiscoXrParser.Ifvrrp_ipContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ifvrrp_ip}.
	 * @param ctx the parse tree
	 */
	void exitIfvrrp_ip(CiscoXrParser.Ifvrrp_ipContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ifvrrp_ip_secondary}.
	 * @param ctx the parse tree
	 */
	void enterIfvrrp_ip_secondary(CiscoXrParser.Ifvrrp_ip_secondaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ifvrrp_ip_secondary}.
	 * @param ctx the parse tree
	 */
	void exitIfvrrp_ip_secondary(CiscoXrParser.Ifvrrp_ip_secondaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ifvrrp_ipv6}.
	 * @param ctx the parse tree
	 */
	void enterIfvrrp_ipv6(CiscoXrParser.Ifvrrp_ipv6Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ifvrrp_ipv6}.
	 * @param ctx the parse tree
	 */
	void exitIfvrrp_ipv6(CiscoXrParser.Ifvrrp_ipv6Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ifvrrp_preempt}.
	 * @param ctx the parse tree
	 */
	void enterIfvrrp_preempt(CiscoXrParser.Ifvrrp_preemptContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ifvrrp_preempt}.
	 * @param ctx the parse tree
	 */
	void exitIfvrrp_preempt(CiscoXrParser.Ifvrrp_preemptContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ifvrrp_priority}.
	 * @param ctx the parse tree
	 */
	void enterIfvrrp_priority(CiscoXrParser.Ifvrrp_priorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ifvrrp_priority}.
	 * @param ctx the parse tree
	 */
	void exitIfvrrp_priority(CiscoXrParser.Ifvrrp_priorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_interface}.
	 * @param ctx the parse tree
	 */
	void enterS_interface(CiscoXrParser.S_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_interface}.
	 * @param ctx the parse tree
	 */
	void exitS_interface(CiscoXrParser.S_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_inner}.
	 * @param ctx the parse tree
	 */
	void enterIf_inner(CiscoXrParser.If_innerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_inner}.
	 * @param ctx the parse tree
	 */
	void exitIf_inner(CiscoXrParser.If_innerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#address_family_iis_stanza}.
	 * @param ctx the parse tree
	 */
	void enterAddress_family_iis_stanza(CiscoXrParser.Address_family_iis_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#address_family_iis_stanza}.
	 * @param ctx the parse tree
	 */
	void exitAddress_family_iis_stanza(CiscoXrParser.Address_family_iis_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#address_family_is_stanza}.
	 * @param ctx the parse tree
	 */
	void enterAddress_family_is_stanza(CiscoXrParser.Address_family_is_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#address_family_is_stanza}.
	 * @param ctx the parse tree
	 */
	void exitAddress_family_is_stanza(CiscoXrParser.Address_family_is_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#advertise_is_stanza}.
	 * @param ctx the parse tree
	 */
	void enterAdvertise_is_stanza(CiscoXrParser.Advertise_is_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#advertise_is_stanza}.
	 * @param ctx the parse tree
	 */
	void exitAdvertise_is_stanza(CiscoXrParser.Advertise_is_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#circuit_type_iis_stanza}.
	 * @param ctx the parse tree
	 */
	void enterCircuit_type_iis_stanza(CiscoXrParser.Circuit_type_iis_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#circuit_type_iis_stanza}.
	 * @param ctx the parse tree
	 */
	void exitCircuit_type_iis_stanza(CiscoXrParser.Circuit_type_iis_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#common_iis_stanza}.
	 * @param ctx the parse tree
	 */
	void enterCommon_iis_stanza(CiscoXrParser.Common_iis_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#common_iis_stanza}.
	 * @param ctx the parse tree
	 */
	void exitCommon_iis_stanza(CiscoXrParser.Common_iis_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#common_is_stanza}.
	 * @param ctx the parse tree
	 */
	void enterCommon_is_stanza(CiscoXrParser.Common_is_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#common_is_stanza}.
	 * @param ctx the parse tree
	 */
	void exitCommon_is_stanza(CiscoXrParser.Common_is_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#distribute_list_is_stanza}.
	 * @param ctx the parse tree
	 */
	void enterDistribute_list_is_stanza(CiscoXrParser.Distribute_list_is_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#distribute_list_is_stanza}.
	 * @param ctx the parse tree
	 */
	void exitDistribute_list_is_stanza(CiscoXrParser.Distribute_list_is_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#iis_stanza}.
	 * @param ctx the parse tree
	 */
	void enterIis_stanza(CiscoXrParser.Iis_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#iis_stanza}.
	 * @param ctx the parse tree
	 */
	void exitIis_stanza(CiscoXrParser.Iis_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#interface_is_stanza}.
	 * @param ctx the parse tree
	 */
	void enterInterface_is_stanza(CiscoXrParser.Interface_is_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#interface_is_stanza}.
	 * @param ctx the parse tree
	 */
	void exitInterface_is_stanza(CiscoXrParser.Interface_is_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#is_stanza}.
	 * @param ctx the parse tree
	 */
	void enterIs_stanza(CiscoXrParser.Is_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#is_stanza}.
	 * @param ctx the parse tree
	 */
	void exitIs_stanza(CiscoXrParser.Is_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#is_type_is_stanza}.
	 * @param ctx the parse tree
	 */
	void enterIs_type_is_stanza(CiscoXrParser.Is_type_is_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#is_type_is_stanza}.
	 * @param ctx the parse tree
	 */
	void exitIs_type_is_stanza(CiscoXrParser.Is_type_is_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#isaf_stanza}.
	 * @param ctx the parse tree
	 */
	void enterIsaf_stanza(CiscoXrParser.Isaf_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#isaf_stanza}.
	 * @param ctx the parse tree
	 */
	void exitIsaf_stanza(CiscoXrParser.Isaf_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#metric_iis_stanza}.
	 * @param ctx the parse tree
	 */
	void enterMetric_iis_stanza(CiscoXrParser.Metric_iis_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#metric_iis_stanza}.
	 * @param ctx the parse tree
	 */
	void exitMetric_iis_stanza(CiscoXrParser.Metric_iis_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#metric_is_stanza}.
	 * @param ctx the parse tree
	 */
	void enterMetric_is_stanza(CiscoXrParser.Metric_is_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#metric_is_stanza}.
	 * @param ctx the parse tree
	 */
	void exitMetric_is_stanza(CiscoXrParser.Metric_is_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#metric_style_is_stanza}.
	 * @param ctx the parse tree
	 */
	void enterMetric_style_is_stanza(CiscoXrParser.Metric_style_is_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#metric_style_is_stanza}.
	 * @param ctx the parse tree
	 */
	void exitMetric_style_is_stanza(CiscoXrParser.Metric_style_is_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#net_is_stanza}.
	 * @param ctx the parse tree
	 */
	void enterNet_is_stanza(CiscoXrParser.Net_is_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#net_is_stanza}.
	 * @param ctx the parse tree
	 */
	void exitNet_is_stanza(CiscoXrParser.Net_is_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#null_iis_stanza}.
	 * @param ctx the parse tree
	 */
	void enterNull_iis_stanza(CiscoXrParser.Null_iis_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#null_iis_stanza}.
	 * @param ctx the parse tree
	 */
	void exitNull_iis_stanza(CiscoXrParser.Null_iis_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#null_is_stanza}.
	 * @param ctx the parse tree
	 */
	void enterNull_is_stanza(CiscoXrParser.Null_is_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#null_is_stanza}.
	 * @param ctx the parse tree
	 */
	void exitNull_is_stanza(CiscoXrParser.Null_is_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#passive_iis_stanza}.
	 * @param ctx the parse tree
	 */
	void enterPassive_iis_stanza(CiscoXrParser.Passive_iis_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#passive_iis_stanza}.
	 * @param ctx the parse tree
	 */
	void exitPassive_iis_stanza(CiscoXrParser.Passive_iis_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#passive_interface_default_is_stanza}.
	 * @param ctx the parse tree
	 */
	void enterPassive_interface_default_is_stanza(CiscoXrParser.Passive_interface_default_is_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#passive_interface_default_is_stanza}.
	 * @param ctx the parse tree
	 */
	void exitPassive_interface_default_is_stanza(CiscoXrParser.Passive_interface_default_is_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#passive_interface_is_stanza}.
	 * @param ctx the parse tree
	 */
	void enterPassive_interface_is_stanza(CiscoXrParser.Passive_interface_is_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#passive_interface_is_stanza}.
	 * @param ctx the parse tree
	 */
	void exitPassive_interface_is_stanza(CiscoXrParser.Passive_interface_is_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#suppressed_iis_stanza}.
	 * @param ctx the parse tree
	 */
	void enterSuppressed_iis_stanza(CiscoXrParser.Suppressed_iis_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#suppressed_iis_stanza}.
	 * @param ctx the parse tree
	 */
	void exitSuppressed_iis_stanza(CiscoXrParser.Suppressed_iis_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#redistribute_connected_is_stanza}.
	 * @param ctx the parse tree
	 */
	void enterRedistribute_connected_is_stanza(CiscoXrParser.Redistribute_connected_is_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#redistribute_connected_is_stanza}.
	 * @param ctx the parse tree
	 */
	void exitRedistribute_connected_is_stanza(CiscoXrParser.Redistribute_connected_is_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#redistribute_eigrp_is_stanza_null}.
	 * @param ctx the parse tree
	 */
	void enterRedistribute_eigrp_is_stanza_null(CiscoXrParser.Redistribute_eigrp_is_stanza_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#redistribute_eigrp_is_stanza_null}.
	 * @param ctx the parse tree
	 */
	void exitRedistribute_eigrp_is_stanza_null(CiscoXrParser.Redistribute_eigrp_is_stanza_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#redistribute_static_is_stanza}.
	 * @param ctx the parse tree
	 */
	void enterRedistribute_static_is_stanza(CiscoXrParser.Redistribute_static_is_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#redistribute_static_is_stanza}.
	 * @param ctx the parse tree
	 */
	void exitRedistribute_static_is_stanza(CiscoXrParser.Redistribute_static_is_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#router_isis_stanza}.
	 * @param ctx the parse tree
	 */
	void enterRouter_isis_stanza(CiscoXrParser.Router_isis_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#router_isis_stanza}.
	 * @param ctx the parse tree
	 */
	void exitRouter_isis_stanza(CiscoXrParser.Router_isis_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#shutdown_iis_stanza}.
	 * @param ctx the parse tree
	 */
	void enterShutdown_iis_stanza(CiscoXrParser.Shutdown_iis_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#shutdown_iis_stanza}.
	 * @param ctx the parse tree
	 */
	void exitShutdown_iis_stanza(CiscoXrParser.Shutdown_iis_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#summary_address_is_stanza}.
	 * @param ctx the parse tree
	 */
	void enterSummary_address_is_stanza(CiscoXrParser.Summary_address_is_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#summary_address_is_stanza}.
	 * @param ctx the parse tree
	 */
	void exitSummary_address_is_stanza(CiscoXrParser.Summary_address_is_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#l_access_class}.
	 * @param ctx the parse tree
	 */
	void enterL_access_class(CiscoXrParser.L_access_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#l_access_class}.
	 * @param ctx the parse tree
	 */
	void exitL_access_class(CiscoXrParser.L_access_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#l_accounting}.
	 * @param ctx the parse tree
	 */
	void enterL_accounting(CiscoXrParser.L_accountingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#l_accounting}.
	 * @param ctx the parse tree
	 */
	void exitL_accounting(CiscoXrParser.L_accountingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#l_exec_timeout}.
	 * @param ctx the parse tree
	 */
	void enterL_exec_timeout(CiscoXrParser.L_exec_timeoutContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#l_exec_timeout}.
	 * @param ctx the parse tree
	 */
	void exitL_exec_timeout(CiscoXrParser.L_exec_timeoutContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#l_length}.
	 * @param ctx the parse tree
	 */
	void enterL_length(CiscoXrParser.L_lengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#l_length}.
	 * @param ctx the parse tree
	 */
	void exitL_length(CiscoXrParser.L_lengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#l_login}.
	 * @param ctx the parse tree
	 */
	void enterL_login(CiscoXrParser.L_loginContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#l_login}.
	 * @param ctx the parse tree
	 */
	void exitL_login(CiscoXrParser.L_loginContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#l_login_authentication}.
	 * @param ctx the parse tree
	 */
	void enterL_login_authentication(CiscoXrParser.L_login_authenticationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#l_login_authentication}.
	 * @param ctx the parse tree
	 */
	void exitL_login_authentication(CiscoXrParser.L_login_authenticationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#l_login_local}.
	 * @param ctx the parse tree
	 */
	void enterL_login_local(CiscoXrParser.L_login_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#l_login_local}.
	 * @param ctx the parse tree
	 */
	void exitL_login_local(CiscoXrParser.L_login_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#l_null}.
	 * @param ctx the parse tree
	 */
	void enterL_null(CiscoXrParser.L_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#l_null}.
	 * @param ctx the parse tree
	 */
	void exitL_null(CiscoXrParser.L_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#l_script}.
	 * @param ctx the parse tree
	 */
	void enterL_script(CiscoXrParser.L_scriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#l_script}.
	 * @param ctx the parse tree
	 */
	void exitL_script(CiscoXrParser.L_scriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#l_transport}.
	 * @param ctx the parse tree
	 */
	void enterL_transport(CiscoXrParser.L_transportContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#l_transport}.
	 * @param ctx the parse tree
	 */
	void exitL_transport(CiscoXrParser.L_transportContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#l_vacant_message}.
	 * @param ctx the parse tree
	 */
	void enterL_vacant_message(CiscoXrParser.L_vacant_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#l_vacant_message}.
	 * @param ctx the parse tree
	 */
	void exitL_vacant_message(CiscoXrParser.L_vacant_messageContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_line}.
	 * @param ctx the parse tree
	 */
	void enterS_line(CiscoXrParser.S_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_line}.
	 * @param ctx the parse tree
	 */
	void exitS_line(CiscoXrParser.S_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#logging_address}.
	 * @param ctx the parse tree
	 */
	void enterLogging_address(CiscoXrParser.Logging_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#logging_address}.
	 * @param ctx the parse tree
	 */
	void exitLogging_address(CiscoXrParser.Logging_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#logging_archive}.
	 * @param ctx the parse tree
	 */
	void enterLogging_archive(CiscoXrParser.Logging_archiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#logging_archive}.
	 * @param ctx the parse tree
	 */
	void exitLogging_archive(CiscoXrParser.Logging_archiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#logging_archive_null}.
	 * @param ctx the parse tree
	 */
	void enterLogging_archive_null(CiscoXrParser.Logging_archive_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#logging_archive_null}.
	 * @param ctx the parse tree
	 */
	void exitLogging_archive_null(CiscoXrParser.Logging_archive_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#logging_buffered}.
	 * @param ctx the parse tree
	 */
	void enterLogging_buffered(CiscoXrParser.Logging_bufferedContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#logging_buffered}.
	 * @param ctx the parse tree
	 */
	void exitLogging_buffered(CiscoXrParser.Logging_bufferedContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#logging_common}.
	 * @param ctx the parse tree
	 */
	void enterLogging_common(CiscoXrParser.Logging_commonContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#logging_common}.
	 * @param ctx the parse tree
	 */
	void exitLogging_common(CiscoXrParser.Logging_commonContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#logging_console}.
	 * @param ctx the parse tree
	 */
	void enterLogging_console(CiscoXrParser.Logging_consoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#logging_console}.
	 * @param ctx the parse tree
	 */
	void exitLogging_console(CiscoXrParser.Logging_consoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#logging_device_id}.
	 * @param ctx the parse tree
	 */
	void enterLogging_device_id(CiscoXrParser.Logging_device_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#logging_device_id}.
	 * @param ctx the parse tree
	 */
	void exitLogging_device_id(CiscoXrParser.Logging_device_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#logging_enable}.
	 * @param ctx the parse tree
	 */
	void enterLogging_enable(CiscoXrParser.Logging_enableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#logging_enable}.
	 * @param ctx the parse tree
	 */
	void exitLogging_enable(CiscoXrParser.Logging_enableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#logging_format}.
	 * @param ctx the parse tree
	 */
	void enterLogging_format(CiscoXrParser.Logging_formatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#logging_format}.
	 * @param ctx the parse tree
	 */
	void exitLogging_format(CiscoXrParser.Logging_formatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#logging_host}.
	 * @param ctx the parse tree
	 */
	void enterLogging_host(CiscoXrParser.Logging_hostContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#logging_host}.
	 * @param ctx the parse tree
	 */
	void exitLogging_host(CiscoXrParser.Logging_hostContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#logging_message}.
	 * @param ctx the parse tree
	 */
	void enterLogging_message(CiscoXrParser.Logging_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#logging_message}.
	 * @param ctx the parse tree
	 */
	void exitLogging_message(CiscoXrParser.Logging_messageContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#logging_null}.
	 * @param ctx the parse tree
	 */
	void enterLogging_null(CiscoXrParser.Logging_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#logging_null}.
	 * @param ctx the parse tree
	 */
	void exitLogging_null(CiscoXrParser.Logging_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#logging_on}.
	 * @param ctx the parse tree
	 */
	void enterLogging_on(CiscoXrParser.Logging_onContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#logging_on}.
	 * @param ctx the parse tree
	 */
	void exitLogging_on(CiscoXrParser.Logging_onContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#logging_queue}.
	 * @param ctx the parse tree
	 */
	void enterLogging_queue(CiscoXrParser.Logging_queueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#logging_queue}.
	 * @param ctx the parse tree
	 */
	void exitLogging_queue(CiscoXrParser.Logging_queueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#logging_severity}.
	 * @param ctx the parse tree
	 */
	void enterLogging_severity(CiscoXrParser.Logging_severityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#logging_severity}.
	 * @param ctx the parse tree
	 */
	void exitLogging_severity(CiscoXrParser.Logging_severityContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#logging_server}.
	 * @param ctx the parse tree
	 */
	void enterLogging_server(CiscoXrParser.Logging_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#logging_server}.
	 * @param ctx the parse tree
	 */
	void exitLogging_server(CiscoXrParser.Logging_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#logging_source_interface}.
	 * @param ctx the parse tree
	 */
	void enterLogging_source_interface(CiscoXrParser.Logging_source_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#logging_source_interface}.
	 * @param ctx the parse tree
	 */
	void exitLogging_source_interface(CiscoXrParser.Logging_source_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#logging_suppress}.
	 * @param ctx the parse tree
	 */
	void enterLogging_suppress(CiscoXrParser.Logging_suppressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#logging_suppress}.
	 * @param ctx the parse tree
	 */
	void exitLogging_suppress(CiscoXrParser.Logging_suppressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#logging_suppress_null}.
	 * @param ctx the parse tree
	 */
	void enterLogging_suppress_null(CiscoXrParser.Logging_suppress_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#logging_suppress_null}.
	 * @param ctx the parse tree
	 */
	void exitLogging_suppress_null(CiscoXrParser.Logging_suppress_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#logging_trap}.
	 * @param ctx the parse tree
	 */
	void enterLogging_trap(CiscoXrParser.Logging_trapContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#logging_trap}.
	 * @param ctx the parse tree
	 */
	void exitLogging_trap(CiscoXrParser.Logging_trapContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#logging_vrf}.
	 * @param ctx the parse tree
	 */
	void enterLogging_vrf(CiscoXrParser.Logging_vrfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#logging_vrf}.
	 * @param ctx the parse tree
	 */
	void exitLogging_vrf(CiscoXrParser.Logging_vrfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_logging}.
	 * @param ctx the parse tree
	 */
	void enterS_logging(CiscoXrParser.S_loggingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_logging}.
	 * @param ctx the parse tree
	 */
	void exitS_logging(CiscoXrParser.S_loggingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#mldp_address_family}.
	 * @param ctx the parse tree
	 */
	void enterMldp_address_family(CiscoXrParser.Mldp_address_familyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#mldp_address_family}.
	 * @param ctx the parse tree
	 */
	void exitMldp_address_family(CiscoXrParser.Mldp_address_familyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#mldp_interface}.
	 * @param ctx the parse tree
	 */
	void enterMldp_interface(CiscoXrParser.Mldp_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#mldp_interface}.
	 * @param ctx the parse tree
	 */
	void exitMldp_interface(CiscoXrParser.Mldp_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#mldp_log}.
	 * @param ctx the parse tree
	 */
	void enterMldp_log(CiscoXrParser.Mldp_logContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#mldp_log}.
	 * @param ctx the parse tree
	 */
	void exitMldp_log(CiscoXrParser.Mldp_logContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#mldp_neighbor}.
	 * @param ctx the parse tree
	 */
	void enterMldp_neighbor(CiscoXrParser.Mldp_neighborContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#mldp_neighbor}.
	 * @param ctx the parse tree
	 */
	void exitMldp_neighbor(CiscoXrParser.Mldp_neighborContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#mldp_null}.
	 * @param ctx the parse tree
	 */
	void enterMldp_null(CiscoXrParser.Mldp_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#mldp_null}.
	 * @param ctx the parse tree
	 */
	void exitMldp_null(CiscoXrParser.Mldp_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#mldp_session_protection}.
	 * @param ctx the parse tree
	 */
	void enterMldp_session_protection(CiscoXrParser.Mldp_session_protectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#mldp_session_protection}.
	 * @param ctx the parse tree
	 */
	void exitMldp_session_protection(CiscoXrParser.Mldp_session_protectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#mldp_router_id}.
	 * @param ctx the parse tree
	 */
	void enterMldp_router_id(CiscoXrParser.Mldp_router_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#mldp_router_id}.
	 * @param ctx the parse tree
	 */
	void exitMldp_router_id(CiscoXrParser.Mldp_router_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#mldpaf_label}.
	 * @param ctx the parse tree
	 */
	void enterMldpaf_label(CiscoXrParser.Mldpaf_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#mldpaf_label}.
	 * @param ctx the parse tree
	 */
	void exitMldpaf_label(CiscoXrParser.Mldpaf_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#mldpaf_null}.
	 * @param ctx the parse tree
	 */
	void enterMldpaf_null(CiscoXrParser.Mldpaf_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#mldpaf_null}.
	 * @param ctx the parse tree
	 */
	void exitMldpaf_null(CiscoXrParser.Mldpaf_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#mldpafl_local}.
	 * @param ctx the parse tree
	 */
	void enterMldpafl_local(CiscoXrParser.Mldpafl_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#mldpafl_local}.
	 * @param ctx the parse tree
	 */
	void exitMldpafl_local(CiscoXrParser.Mldpafl_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#mldpafll_advertise}.
	 * @param ctx the parse tree
	 */
	void enterMldpafll_advertise(CiscoXrParser.Mldpafll_advertiseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#mldpafll_advertise}.
	 * @param ctx the parse tree
	 */
	void exitMldpafll_advertise(CiscoXrParser.Mldpafll_advertiseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#mldpafll_null}.
	 * @param ctx the parse tree
	 */
	void enterMldpafll_null(CiscoXrParser.Mldpafll_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#mldpafll_null}.
	 * @param ctx the parse tree
	 */
	void exitMldpafll_null(CiscoXrParser.Mldpafll_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#mldpaflla_null}.
	 * @param ctx the parse tree
	 */
	void enterMldpaflla_null(CiscoXrParser.Mldpaflla_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#mldpaflla_null}.
	 * @param ctx the parse tree
	 */
	void exitMldpaflla_null(CiscoXrParser.Mldpaflla_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#mlpdl_null}.
	 * @param ctx the parse tree
	 */
	void enterMlpdl_null(CiscoXrParser.Mlpdl_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#mlpdl_null}.
	 * @param ctx the parse tree
	 */
	void exitMlpdl_null(CiscoXrParser.Mlpdl_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#mldpn_null}.
	 * @param ctx the parse tree
	 */
	void enterMldpn_null(CiscoXrParser.Mldpn_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#mldpn_null}.
	 * @param ctx the parse tree
	 */
	void exitMldpn_null(CiscoXrParser.Mldpn_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_mpls_ldp}.
	 * @param ctx the parse tree
	 */
	void enterS_mpls_ldp(CiscoXrParser.S_mpls_ldpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_mpls_ldp}.
	 * @param ctx the parse tree
	 */
	void exitS_mpls_ldp(CiscoXrParser.S_mpls_ldpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_mpls_label_range}.
	 * @param ctx the parse tree
	 */
	void enterS_mpls_label_range(CiscoXrParser.S_mpls_label_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_mpls_label_range}.
	 * @param ctx the parse tree
	 */
	void exitS_mpls_label_range(CiscoXrParser.S_mpls_label_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_mpls_traffic_eng}.
	 * @param ctx the parse tree
	 */
	void enterS_mpls_traffic_eng(CiscoXrParser.S_mpls_traffic_engContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_mpls_traffic_eng}.
	 * @param ctx the parse tree
	 */
	void exitS_mpls_traffic_eng(CiscoXrParser.S_mpls_traffic_engContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#mte_attribute_set}.
	 * @param ctx the parse tree
	 */
	void enterMte_attribute_set(CiscoXrParser.Mte_attribute_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#mte_attribute_set}.
	 * @param ctx the parse tree
	 */
	void exitMte_attribute_set(CiscoXrParser.Mte_attribute_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#mte_auto_tunnel}.
	 * @param ctx the parse tree
	 */
	void enterMte_auto_tunnel(CiscoXrParser.Mte_auto_tunnelContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#mte_auto_tunnel}.
	 * @param ctx the parse tree
	 */
	void exitMte_auto_tunnel(CiscoXrParser.Mte_auto_tunnelContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#mte_interface}.
	 * @param ctx the parse tree
	 */
	void enterMte_interface(CiscoXrParser.Mte_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#mte_interface}.
	 * @param ctx the parse tree
	 */
	void exitMte_interface(CiscoXrParser.Mte_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#mte_null}.
	 * @param ctx the parse tree
	 */
	void enterMte_null(CiscoXrParser.Mte_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#mte_null}.
	 * @param ctx the parse tree
	 */
	void exitMte_null(CiscoXrParser.Mte_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#mte_soft_preemption}.
	 * @param ctx the parse tree
	 */
	void enterMte_soft_preemption(CiscoXrParser.Mte_soft_preemptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#mte_soft_preemption}.
	 * @param ctx the parse tree
	 */
	void exitMte_soft_preemption(CiscoXrParser.Mte_soft_preemptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#mteas_null}.
	 * @param ctx the parse tree
	 */
	void enterMteas_null(CiscoXrParser.Mteas_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#mteas_null}.
	 * @param ctx the parse tree
	 */
	void exitMteas_null(CiscoXrParser.Mteas_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#mteat_null}.
	 * @param ctx the parse tree
	 */
	void enterMteat_null(CiscoXrParser.Mteat_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#mteat_null}.
	 * @param ctx the parse tree
	 */
	void exitMteat_null(CiscoXrParser.Mteat_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#mtei_auto_tunnel}.
	 * @param ctx the parse tree
	 */
	void enterMtei_auto_tunnel(CiscoXrParser.Mtei_auto_tunnelContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#mtei_auto_tunnel}.
	 * @param ctx the parse tree
	 */
	void exitMtei_auto_tunnel(CiscoXrParser.Mtei_auto_tunnelContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#mtei_null}.
	 * @param ctx the parse tree
	 */
	void enterMtei_null(CiscoXrParser.Mtei_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#mtei_null}.
	 * @param ctx the parse tree
	 */
	void exitMtei_null(CiscoXrParser.Mtei_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#mteiat_null}.
	 * @param ctx the parse tree
	 */
	void enterMteiat_null(CiscoXrParser.Mteiat_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#mteiat_null}.
	 * @param ctx the parse tree
	 */
	void exitMteiat_null(CiscoXrParser.Mteiat_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#mtes_null}.
	 * @param ctx the parse tree
	 */
	void enterMtes_null(CiscoXrParser.Mtes_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#mtes_null}.
	 * @param ctx the parse tree
	 */
	void exitMtes_null(CiscoXrParser.Mtes_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ntp_access_group}.
	 * @param ctx the parse tree
	 */
	void enterNtp_access_group(CiscoXrParser.Ntp_access_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ntp_access_group}.
	 * @param ctx the parse tree
	 */
	void exitNtp_access_group(CiscoXrParser.Ntp_access_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ntp_authenticate}.
	 * @param ctx the parse tree
	 */
	void enterNtp_authenticate(CiscoXrParser.Ntp_authenticateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ntp_authenticate}.
	 * @param ctx the parse tree
	 */
	void exitNtp_authenticate(CiscoXrParser.Ntp_authenticateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ntp_authentication}.
	 * @param ctx the parse tree
	 */
	void enterNtp_authentication(CiscoXrParser.Ntp_authenticationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ntp_authentication}.
	 * @param ctx the parse tree
	 */
	void exitNtp_authentication(CiscoXrParser.Ntp_authenticationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ntp_clock_period}.
	 * @param ctx the parse tree
	 */
	void enterNtp_clock_period(CiscoXrParser.Ntp_clock_periodContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ntp_clock_period}.
	 * @param ctx the parse tree
	 */
	void exitNtp_clock_period(CiscoXrParser.Ntp_clock_periodContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ntp_commit}.
	 * @param ctx the parse tree
	 */
	void enterNtp_commit(CiscoXrParser.Ntp_commitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ntp_commit}.
	 * @param ctx the parse tree
	 */
	void exitNtp_commit(CiscoXrParser.Ntp_commitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ntp_common}.
	 * @param ctx the parse tree
	 */
	void enterNtp_common(CiscoXrParser.Ntp_commonContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ntp_common}.
	 * @param ctx the parse tree
	 */
	void exitNtp_common(CiscoXrParser.Ntp_commonContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ntp_distribute}.
	 * @param ctx the parse tree
	 */
	void enterNtp_distribute(CiscoXrParser.Ntp_distributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ntp_distribute}.
	 * @param ctx the parse tree
	 */
	void exitNtp_distribute(CiscoXrParser.Ntp_distributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ntp_logging}.
	 * @param ctx the parse tree
	 */
	void enterNtp_logging(CiscoXrParser.Ntp_loggingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ntp_logging}.
	 * @param ctx the parse tree
	 */
	void exitNtp_logging(CiscoXrParser.Ntp_loggingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ntp_max_associations}.
	 * @param ctx the parse tree
	 */
	void enterNtp_max_associations(CiscoXrParser.Ntp_max_associationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ntp_max_associations}.
	 * @param ctx the parse tree
	 */
	void exitNtp_max_associations(CiscoXrParser.Ntp_max_associationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ntp_master}.
	 * @param ctx the parse tree
	 */
	void enterNtp_master(CiscoXrParser.Ntp_masterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ntp_master}.
	 * @param ctx the parse tree
	 */
	void exitNtp_master(CiscoXrParser.Ntp_masterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ntp_null}.
	 * @param ctx the parse tree
	 */
	void enterNtp_null(CiscoXrParser.Ntp_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ntp_null}.
	 * @param ctx the parse tree
	 */
	void exitNtp_null(CiscoXrParser.Ntp_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ntp_peer}.
	 * @param ctx the parse tree
	 */
	void enterNtp_peer(CiscoXrParser.Ntp_peerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ntp_peer}.
	 * @param ctx the parse tree
	 */
	void exitNtp_peer(CiscoXrParser.Ntp_peerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ntp_server}.
	 * @param ctx the parse tree
	 */
	void enterNtp_server(CiscoXrParser.Ntp_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ntp_server}.
	 * @param ctx the parse tree
	 */
	void exitNtp_server(CiscoXrParser.Ntp_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ntp_source}.
	 * @param ctx the parse tree
	 */
	void enterNtp_source(CiscoXrParser.Ntp_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ntp_source}.
	 * @param ctx the parse tree
	 */
	void exitNtp_source(CiscoXrParser.Ntp_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ntp_source_interface}.
	 * @param ctx the parse tree
	 */
	void enterNtp_source_interface(CiscoXrParser.Ntp_source_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ntp_source_interface}.
	 * @param ctx the parse tree
	 */
	void exitNtp_source_interface(CiscoXrParser.Ntp_source_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ntp_trusted_key}.
	 * @param ctx the parse tree
	 */
	void enterNtp_trusted_key(CiscoXrParser.Ntp_trusted_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ntp_trusted_key}.
	 * @param ctx the parse tree
	 */
	void exitNtp_trusted_key(CiscoXrParser.Ntp_trusted_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ntp_update_calendar}.
	 * @param ctx the parse tree
	 */
	void enterNtp_update_calendar(CiscoXrParser.Ntp_update_calendarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ntp_update_calendar}.
	 * @param ctx the parse tree
	 */
	void exitNtp_update_calendar(CiscoXrParser.Ntp_update_calendarContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_ntp}.
	 * @param ctx the parse tree
	 */
	void enterS_ntp(CiscoXrParser.S_ntpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_ntp}.
	 * @param ctx the parse tree
	 */
	void exitS_ntp(CiscoXrParser.S_ntpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ro_address_family}.
	 * @param ctx the parse tree
	 */
	void enterRo_address_family(CiscoXrParser.Ro_address_familyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ro_address_family}.
	 * @param ctx the parse tree
	 */
	void exitRo_address_family(CiscoXrParser.Ro_address_familyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ro_area}.
	 * @param ctx the parse tree
	 */
	void enterRo_area(CiscoXrParser.Ro_areaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ro_area}.
	 * @param ctx the parse tree
	 */
	void exitRo_area(CiscoXrParser.Ro_areaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ro_area_default_cost}.
	 * @param ctx the parse tree
	 */
	void enterRo_area_default_cost(CiscoXrParser.Ro_area_default_costContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ro_area_default_cost}.
	 * @param ctx the parse tree
	 */
	void exitRo_area_default_cost(CiscoXrParser.Ro_area_default_costContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ro_area_filterlist}.
	 * @param ctx the parse tree
	 */
	void enterRo_area_filterlist(CiscoXrParser.Ro_area_filterlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ro_area_filterlist}.
	 * @param ctx the parse tree
	 */
	void exitRo_area_filterlist(CiscoXrParser.Ro_area_filterlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ro_area_nssa}.
	 * @param ctx the parse tree
	 */
	void enterRo_area_nssa(CiscoXrParser.Ro_area_nssaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ro_area_nssa}.
	 * @param ctx the parse tree
	 */
	void exitRo_area_nssa(CiscoXrParser.Ro_area_nssaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ro_area_range}.
	 * @param ctx the parse tree
	 */
	void enterRo_area_range(CiscoXrParser.Ro_area_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ro_area_range}.
	 * @param ctx the parse tree
	 */
	void exitRo_area_range(CiscoXrParser.Ro_area_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ro_area_stub}.
	 * @param ctx the parse tree
	 */
	void enterRo_area_stub(CiscoXrParser.Ro_area_stubContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ro_area_stub}.
	 * @param ctx the parse tree
	 */
	void exitRo_area_stub(CiscoXrParser.Ro_area_stubContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ro_authentication}.
	 * @param ctx the parse tree
	 */
	void enterRo_authentication(CiscoXrParser.Ro_authenticationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ro_authentication}.
	 * @param ctx the parse tree
	 */
	void exitRo_authentication(CiscoXrParser.Ro_authenticationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ro_auto_cost}.
	 * @param ctx the parse tree
	 */
	void enterRo_auto_cost(CiscoXrParser.Ro_auto_costContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ro_auto_cost}.
	 * @param ctx the parse tree
	 */
	void exitRo_auto_cost(CiscoXrParser.Ro_auto_costContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ro_common}.
	 * @param ctx the parse tree
	 */
	void enterRo_common(CiscoXrParser.Ro_commonContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ro_common}.
	 * @param ctx the parse tree
	 */
	void exitRo_common(CiscoXrParser.Ro_commonContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ro_default_information}.
	 * @param ctx the parse tree
	 */
	void enterRo_default_information(CiscoXrParser.Ro_default_informationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ro_default_information}.
	 * @param ctx the parse tree
	 */
	void exitRo_default_information(CiscoXrParser.Ro_default_informationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ro_default_metric}.
	 * @param ctx the parse tree
	 */
	void enterRo_default_metric(CiscoXrParser.Ro_default_metricContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ro_default_metric}.
	 * @param ctx the parse tree
	 */
	void exitRo_default_metric(CiscoXrParser.Ro_default_metricContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ro_distance}.
	 * @param ctx the parse tree
	 */
	void enterRo_distance(CiscoXrParser.Ro_distanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ro_distance}.
	 * @param ctx the parse tree
	 */
	void exitRo_distance(CiscoXrParser.Ro_distanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ro_distribute_list}.
	 * @param ctx the parse tree
	 */
	void enterRo_distribute_list(CiscoXrParser.Ro_distribute_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ro_distribute_list}.
	 * @param ctx the parse tree
	 */
	void exitRo_distribute_list(CiscoXrParser.Ro_distribute_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ro_max_metric}.
	 * @param ctx the parse tree
	 */
	void enterRo_max_metric(CiscoXrParser.Ro_max_metricContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ro_max_metric}.
	 * @param ctx the parse tree
	 */
	void exitRo_max_metric(CiscoXrParser.Ro_max_metricContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ro_maximum_paths}.
	 * @param ctx the parse tree
	 */
	void enterRo_maximum_paths(CiscoXrParser.Ro_maximum_pathsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ro_maximum_paths}.
	 * @param ctx the parse tree
	 */
	void exitRo_maximum_paths(CiscoXrParser.Ro_maximum_pathsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ro_network}.
	 * @param ctx the parse tree
	 */
	void enterRo_network(CiscoXrParser.Ro_networkContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ro_network}.
	 * @param ctx the parse tree
	 */
	void exitRo_network(CiscoXrParser.Ro_networkContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ro_nssa}.
	 * @param ctx the parse tree
	 */
	void enterRo_nssa(CiscoXrParser.Ro_nssaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ro_nssa}.
	 * @param ctx the parse tree
	 */
	void exitRo_nssa(CiscoXrParser.Ro_nssaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ro_null}.
	 * @param ctx the parse tree
	 */
	void enterRo_null(CiscoXrParser.Ro_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ro_null}.
	 * @param ctx the parse tree
	 */
	void exitRo_null(CiscoXrParser.Ro_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ro_rfc1583_compatibility}.
	 * @param ctx the parse tree
	 */
	void enterRo_rfc1583_compatibility(CiscoXrParser.Ro_rfc1583_compatibilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ro_rfc1583_compatibility}.
	 * @param ctx the parse tree
	 */
	void exitRo_rfc1583_compatibility(CiscoXrParser.Ro_rfc1583_compatibilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ro_passive_interface_default}.
	 * @param ctx the parse tree
	 */
	void enterRo_passive_interface_default(CiscoXrParser.Ro_passive_interface_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ro_passive_interface_default}.
	 * @param ctx the parse tree
	 */
	void exitRo_passive_interface_default(CiscoXrParser.Ro_passive_interface_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ro_passive_interface}.
	 * @param ctx the parse tree
	 */
	void enterRo_passive_interface(CiscoXrParser.Ro_passive_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ro_passive_interface}.
	 * @param ctx the parse tree
	 */
	void exitRo_passive_interface(CiscoXrParser.Ro_passive_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ro_redistribute_bgp_cisco_xr}.
	 * @param ctx the parse tree
	 */
	void enterRo_redistribute_bgp_cisco_xr(CiscoXrParser.Ro_redistribute_bgp_cisco_xrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ro_redistribute_bgp_cisco_xr}.
	 * @param ctx the parse tree
	 */
	void exitRo_redistribute_bgp_cisco_xr(CiscoXrParser.Ro_redistribute_bgp_cisco_xrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ro_redistribute_connected}.
	 * @param ctx the parse tree
	 */
	void enterRo_redistribute_connected(CiscoXrParser.Ro_redistribute_connectedContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ro_redistribute_connected}.
	 * @param ctx the parse tree
	 */
	void exitRo_redistribute_connected(CiscoXrParser.Ro_redistribute_connectedContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ro_redistribute_eigrp}.
	 * @param ctx the parse tree
	 */
	void enterRo_redistribute_eigrp(CiscoXrParser.Ro_redistribute_eigrpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ro_redistribute_eigrp}.
	 * @param ctx the parse tree
	 */
	void exitRo_redistribute_eigrp(CiscoXrParser.Ro_redistribute_eigrpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ro_redistribute_ospf_null}.
	 * @param ctx the parse tree
	 */
	void enterRo_redistribute_ospf_null(CiscoXrParser.Ro_redistribute_ospf_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ro_redistribute_ospf_null}.
	 * @param ctx the parse tree
	 */
	void exitRo_redistribute_ospf_null(CiscoXrParser.Ro_redistribute_ospf_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ro_redistribute_rip}.
	 * @param ctx the parse tree
	 */
	void enterRo_redistribute_rip(CiscoXrParser.Ro_redistribute_ripContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ro_redistribute_rip}.
	 * @param ctx the parse tree
	 */
	void exitRo_redistribute_rip(CiscoXrParser.Ro_redistribute_ripContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ro_redistribute_static}.
	 * @param ctx the parse tree
	 */
	void enterRo_redistribute_static(CiscoXrParser.Ro_redistribute_staticContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ro_redistribute_static}.
	 * @param ctx the parse tree
	 */
	void exitRo_redistribute_static(CiscoXrParser.Ro_redistribute_staticContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ro_router_id}.
	 * @param ctx the parse tree
	 */
	void enterRo_router_id(CiscoXrParser.Ro_router_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ro_router_id}.
	 * @param ctx the parse tree
	 */
	void exitRo_router_id(CiscoXrParser.Ro_router_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ro_summary_address}.
	 * @param ctx the parse tree
	 */
	void enterRo_summary_address(CiscoXrParser.Ro_summary_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ro_summary_address}.
	 * @param ctx the parse tree
	 */
	void exitRo_summary_address(CiscoXrParser.Ro_summary_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ro_vrf}.
	 * @param ctx the parse tree
	 */
	void enterRo_vrf(CiscoXrParser.Ro_vrfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ro_vrf}.
	 * @param ctx the parse tree
	 */
	void exitRo_vrf(CiscoXrParser.Ro_vrfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ro6_area}.
	 * @param ctx the parse tree
	 */
	void enterRo6_area(CiscoXrParser.Ro6_areaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ro6_area}.
	 * @param ctx the parse tree
	 */
	void exitRo6_area(CiscoXrParser.Ro6_areaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ro6_auto_cost}.
	 * @param ctx the parse tree
	 */
	void enterRo6_auto_cost(CiscoXrParser.Ro6_auto_costContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ro6_auto_cost}.
	 * @param ctx the parse tree
	 */
	void exitRo6_auto_cost(CiscoXrParser.Ro6_auto_costContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ro6_default_information}.
	 * @param ctx the parse tree
	 */
	void enterRo6_default_information(CiscoXrParser.Ro6_default_informationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ro6_default_information}.
	 * @param ctx the parse tree
	 */
	void exitRo6_default_information(CiscoXrParser.Ro6_default_informationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ro6_distance}.
	 * @param ctx the parse tree
	 */
	void enterRo6_distance(CiscoXrParser.Ro6_distanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ro6_distance}.
	 * @param ctx the parse tree
	 */
	void exitRo6_distance(CiscoXrParser.Ro6_distanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ro6_distribute_list}.
	 * @param ctx the parse tree
	 */
	void enterRo6_distribute_list(CiscoXrParser.Ro6_distribute_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ro6_distribute_list}.
	 * @param ctx the parse tree
	 */
	void exitRo6_distribute_list(CiscoXrParser.Ro6_distribute_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ro6_log_adjacency_changes}.
	 * @param ctx the parse tree
	 */
	void enterRo6_log_adjacency_changes(CiscoXrParser.Ro6_log_adjacency_changesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ro6_log_adjacency_changes}.
	 * @param ctx the parse tree
	 */
	void exitRo6_log_adjacency_changes(CiscoXrParser.Ro6_log_adjacency_changesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ro6_maximum_paths}.
	 * @param ctx the parse tree
	 */
	void enterRo6_maximum_paths(CiscoXrParser.Ro6_maximum_pathsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ro6_maximum_paths}.
	 * @param ctx the parse tree
	 */
	void exitRo6_maximum_paths(CiscoXrParser.Ro6_maximum_pathsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ro6_null}.
	 * @param ctx the parse tree
	 */
	void enterRo6_null(CiscoXrParser.Ro6_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ro6_null}.
	 * @param ctx the parse tree
	 */
	void exitRo6_null(CiscoXrParser.Ro6_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ro6_passive_interface}.
	 * @param ctx the parse tree
	 */
	void enterRo6_passive_interface(CiscoXrParser.Ro6_passive_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ro6_passive_interface}.
	 * @param ctx the parse tree
	 */
	void exitRo6_passive_interface(CiscoXrParser.Ro6_passive_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ro6_router_id}.
	 * @param ctx the parse tree
	 */
	void enterRo6_router_id(CiscoXrParser.Ro6_router_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ro6_router_id}.
	 * @param ctx the parse tree
	 */
	void exitRo6_router_id(CiscoXrParser.Ro6_router_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ro6_redistribute}.
	 * @param ctx the parse tree
	 */
	void enterRo6_redistribute(CiscoXrParser.Ro6_redistributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ro6_redistribute}.
	 * @param ctx the parse tree
	 */
	void exitRo6_redistribute(CiscoXrParser.Ro6_redistributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#roa_cost}.
	 * @param ctx the parse tree
	 */
	void enterRoa_cost(CiscoXrParser.Roa_costContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#roa_cost}.
	 * @param ctx the parse tree
	 */
	void exitRoa_cost(CiscoXrParser.Roa_costContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#roa_interface}.
	 * @param ctx the parse tree
	 */
	void enterRoa_interface(CiscoXrParser.Roa_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#roa_interface}.
	 * @param ctx the parse tree
	 */
	void exitRoa_interface(CiscoXrParser.Roa_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#roa_range}.
	 * @param ctx the parse tree
	 */
	void enterRoa_range(CiscoXrParser.Roa_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#roa_range}.
	 * @param ctx the parse tree
	 */
	void exitRoa_range(CiscoXrParser.Roa_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#roa_network_null}.
	 * @param ctx the parse tree
	 */
	void enterRoa_network_null(CiscoXrParser.Roa_network_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#roa_network_null}.
	 * @param ctx the parse tree
	 */
	void exitRoa_network_null(CiscoXrParser.Roa_network_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#roi_cost}.
	 * @param ctx the parse tree
	 */
	void enterRoi_cost(CiscoXrParser.Roi_costContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#roi_cost}.
	 * @param ctx the parse tree
	 */
	void exitRoi_cost(CiscoXrParser.Roi_costContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#roi_network}.
	 * @param ctx the parse tree
	 */
	void enterRoi_network(CiscoXrParser.Roi_networkContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#roi_network}.
	 * @param ctx the parse tree
	 */
	void exitRoi_network(CiscoXrParser.Roi_networkContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#roi_passive}.
	 * @param ctx the parse tree
	 */
	void enterRoi_passive(CiscoXrParser.Roi_passiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#roi_passive}.
	 * @param ctx the parse tree
	 */
	void exitRoi_passive(CiscoXrParser.Roi_passiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#roi_priority}.
	 * @param ctx the parse tree
	 */
	void enterRoi_priority(CiscoXrParser.Roi_priorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#roi_priority}.
	 * @param ctx the parse tree
	 */
	void exitRoi_priority(CiscoXrParser.Roi_priorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#rov3_address_family}.
	 * @param ctx the parse tree
	 */
	void enterRov3_address_family(CiscoXrParser.Rov3_address_familyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#rov3_address_family}.
	 * @param ctx the parse tree
	 */
	void exitRov3_address_family(CiscoXrParser.Rov3_address_familyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#rov3_common}.
	 * @param ctx the parse tree
	 */
	void enterRov3_common(CiscoXrParser.Rov3_commonContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#rov3_common}.
	 * @param ctx the parse tree
	 */
	void exitRov3_common(CiscoXrParser.Rov3_commonContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#rov3_null}.
	 * @param ctx the parse tree
	 */
	void enterRov3_null(CiscoXrParser.Rov3_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#rov3_null}.
	 * @param ctx the parse tree
	 */
	void exitRov3_null(CiscoXrParser.Rov3_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_ipv6_router_ospf}.
	 * @param ctx the parse tree
	 */
	void enterS_ipv6_router_ospf(CiscoXrParser.S_ipv6_router_ospfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_ipv6_router_ospf}.
	 * @param ctx the parse tree
	 */
	void exitS_ipv6_router_ospf(CiscoXrParser.S_ipv6_router_ospfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_router_ospf}.
	 * @param ctx the parse tree
	 */
	void enterS_router_ospf(CiscoXrParser.S_router_ospfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_router_ospf}.
	 * @param ctx the parse tree
	 */
	void exitS_router_ospf(CiscoXrParser.S_router_ospfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_router_ospfv3}.
	 * @param ctx the parse tree
	 */
	void enterS_router_ospfv3(CiscoXrParser.S_router_ospfv3Context ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_router_ospfv3}.
	 * @param ctx the parse tree
	 */
	void exitS_router_ospfv3(CiscoXrParser.S_router_ospfv3Context ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ip_pim_tail}.
	 * @param ctx the parse tree
	 */
	void enterIp_pim_tail(CiscoXrParser.Ip_pim_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ip_pim_tail}.
	 * @param ctx the parse tree
	 */
	void exitIp_pim_tail(CiscoXrParser.Ip_pim_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#pim_accept_register}.
	 * @param ctx the parse tree
	 */
	void enterPim_accept_register(CiscoXrParser.Pim_accept_registerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#pim_accept_register}.
	 * @param ctx the parse tree
	 */
	void exitPim_accept_register(CiscoXrParser.Pim_accept_registerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#pim_accept_rp}.
	 * @param ctx the parse tree
	 */
	void enterPim_accept_rp(CiscoXrParser.Pim_accept_rpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#pim_accept_rp}.
	 * @param ctx the parse tree
	 */
	void exitPim_accept_rp(CiscoXrParser.Pim_accept_rpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#pim_null}.
	 * @param ctx the parse tree
	 */
	void enterPim_null(CiscoXrParser.Pim_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#pim_null}.
	 * @param ctx the parse tree
	 */
	void exitPim_null(CiscoXrParser.Pim_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#pim_rp_address}.
	 * @param ctx the parse tree
	 */
	void enterPim_rp_address(CiscoXrParser.Pim_rp_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#pim_rp_address}.
	 * @param ctx the parse tree
	 */
	void exitPim_rp_address(CiscoXrParser.Pim_rp_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#pim_rp_announce_filter}.
	 * @param ctx the parse tree
	 */
	void enterPim_rp_announce_filter(CiscoXrParser.Pim_rp_announce_filterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#pim_rp_announce_filter}.
	 * @param ctx the parse tree
	 */
	void exitPim_rp_announce_filter(CiscoXrParser.Pim_rp_announce_filterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#pim_rp_candidate}.
	 * @param ctx the parse tree
	 */
	void enterPim_rp_candidate(CiscoXrParser.Pim_rp_candidateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#pim_rp_candidate}.
	 * @param ctx the parse tree
	 */
	void exitPim_rp_candidate(CiscoXrParser.Pim_rp_candidateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#pim_send_rp_announce}.
	 * @param ctx the parse tree
	 */
	void enterPim_send_rp_announce(CiscoXrParser.Pim_send_rp_announceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#pim_send_rp_announce}.
	 * @param ctx the parse tree
	 */
	void exitPim_send_rp_announce(CiscoXrParser.Pim_send_rp_announceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#pim_spt_threshold}.
	 * @param ctx the parse tree
	 */
	void enterPim_spt_threshold(CiscoXrParser.Pim_spt_thresholdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#pim_spt_threshold}.
	 * @param ctx the parse tree
	 */
	void exitPim_spt_threshold(CiscoXrParser.Pim_spt_thresholdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#pim_ssm}.
	 * @param ctx the parse tree
	 */
	void enterPim_ssm(CiscoXrParser.Pim_ssmContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#pim_ssm}.
	 * @param ctx the parse tree
	 */
	void exitPim_ssm(CiscoXrParser.Pim_ssmContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_ip_pim}.
	 * @param ctx the parse tree
	 */
	void enterS_ip_pim(CiscoXrParser.S_ip_pimContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_ip_pim}.
	 * @param ctx the parse tree
	 */
	void exitS_ip_pim(CiscoXrParser.S_ip_pimContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cm_end_class_map}.
	 * @param ctx the parse tree
	 */
	void enterCm_end_class_map(CiscoXrParser.Cm_end_class_mapContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cm_end_class_map}.
	 * @param ctx the parse tree
	 */
	void exitCm_end_class_map(CiscoXrParser.Cm_end_class_mapContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cm_ios_inspect}.
	 * @param ctx the parse tree
	 */
	void enterCm_ios_inspect(CiscoXrParser.Cm_ios_inspectContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cm_ios_inspect}.
	 * @param ctx the parse tree
	 */
	void exitCm_ios_inspect(CiscoXrParser.Cm_ios_inspectContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cm_iosi_match}.
	 * @param ctx the parse tree
	 */
	void enterCm_iosi_match(CiscoXrParser.Cm_iosi_matchContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cm_iosi_match}.
	 * @param ctx the parse tree
	 */
	void exitCm_iosi_match(CiscoXrParser.Cm_iosi_matchContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cm_iosim_access_group}.
	 * @param ctx the parse tree
	 */
	void enterCm_iosim_access_group(CiscoXrParser.Cm_iosim_access_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cm_iosim_access_group}.
	 * @param ctx the parse tree
	 */
	void exitCm_iosim_access_group(CiscoXrParser.Cm_iosim_access_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cm_iosim_protocol}.
	 * @param ctx the parse tree
	 */
	void enterCm_iosim_protocol(CiscoXrParser.Cm_iosim_protocolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cm_iosim_protocol}.
	 * @param ctx the parse tree
	 */
	void exitCm_iosim_protocol(CiscoXrParser.Cm_iosim_protocolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cm_iosim_req_resp}.
	 * @param ctx the parse tree
	 */
	void enterCm_iosim_req_resp(CiscoXrParser.Cm_iosim_req_respContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cm_iosim_req_resp}.
	 * @param ctx the parse tree
	 */
	void exitCm_iosim_req_resp(CiscoXrParser.Cm_iosim_req_respContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cm_iosim_request}.
	 * @param ctx the parse tree
	 */
	void enterCm_iosim_request(CiscoXrParser.Cm_iosim_requestContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cm_iosim_request}.
	 * @param ctx the parse tree
	 */
	void exitCm_iosim_request(CiscoXrParser.Cm_iosim_requestContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cm_iosim_response}.
	 * @param ctx the parse tree
	 */
	void enterCm_iosim_response(CiscoXrParser.Cm_iosim_responseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cm_iosim_response}.
	 * @param ctx the parse tree
	 */
	void exitCm_iosim_response(CiscoXrParser.Cm_iosim_responseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cm_match}.
	 * @param ctx the parse tree
	 */
	void enterCm_match(CiscoXrParser.Cm_matchContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cm_match}.
	 * @param ctx the parse tree
	 */
	void exitCm_match(CiscoXrParser.Cm_matchContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cmm_access_group}.
	 * @param ctx the parse tree
	 */
	void enterCmm_access_group(CiscoXrParser.Cmm_access_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cmm_access_group}.
	 * @param ctx the parse tree
	 */
	void exitCmm_access_group(CiscoXrParser.Cmm_access_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cmm_access_list}.
	 * @param ctx the parse tree
	 */
	void enterCmm_access_list(CiscoXrParser.Cmm_access_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cmm_access_list}.
	 * @param ctx the parse tree
	 */
	void exitCmm_access_list(CiscoXrParser.Cmm_access_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cmm_activated_service_template}.
	 * @param ctx the parse tree
	 */
	void enterCmm_activated_service_template(CiscoXrParser.Cmm_activated_service_templateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cmm_activated_service_template}.
	 * @param ctx the parse tree
	 */
	void exitCmm_activated_service_template(CiscoXrParser.Cmm_activated_service_templateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cmm_any}.
	 * @param ctx the parse tree
	 */
	void enterCmm_any(CiscoXrParser.Cmm_anyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cmm_any}.
	 * @param ctx the parse tree
	 */
	void exitCmm_any(CiscoXrParser.Cmm_anyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cmm_authorization_status}.
	 * @param ctx the parse tree
	 */
	void enterCmm_authorization_status(CiscoXrParser.Cmm_authorization_statusContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cmm_authorization_status}.
	 * @param ctx the parse tree
	 */
	void exitCmm_authorization_status(CiscoXrParser.Cmm_authorization_statusContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cmm_class_map}.
	 * @param ctx the parse tree
	 */
	void enterCmm_class_map(CiscoXrParser.Cmm_class_mapContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cmm_class_map}.
	 * @param ctx the parse tree
	 */
	void exitCmm_class_map(CiscoXrParser.Cmm_class_mapContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cmm_cos}.
	 * @param ctx the parse tree
	 */
	void enterCmm_cos(CiscoXrParser.Cmm_cosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cmm_cos}.
	 * @param ctx the parse tree
	 */
	void exitCmm_cos(CiscoXrParser.Cmm_cosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cmm_default_inspection_traffic}.
	 * @param ctx the parse tree
	 */
	void enterCmm_default_inspection_traffic(CiscoXrParser.Cmm_default_inspection_trafficContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cmm_default_inspection_traffic}.
	 * @param ctx the parse tree
	 */
	void exitCmm_default_inspection_traffic(CiscoXrParser.Cmm_default_inspection_trafficContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cmm_dscp}.
	 * @param ctx the parse tree
	 */
	void enterCmm_dscp(CiscoXrParser.Cmm_dscpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cmm_dscp}.
	 * @param ctx the parse tree
	 */
	void exitCmm_dscp(CiscoXrParser.Cmm_dscpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cmm_exception}.
	 * @param ctx the parse tree
	 */
	void enterCmm_exception(CiscoXrParser.Cmm_exceptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cmm_exception}.
	 * @param ctx the parse tree
	 */
	void exitCmm_exception(CiscoXrParser.Cmm_exceptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cmm_method}.
	 * @param ctx the parse tree
	 */
	void enterCmm_method(CiscoXrParser.Cmm_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cmm_method}.
	 * @param ctx the parse tree
	 */
	void exitCmm_method(CiscoXrParser.Cmm_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cmm_mpls}.
	 * @param ctx the parse tree
	 */
	void enterCmm_mpls(CiscoXrParser.Cmm_mplsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cmm_mpls}.
	 * @param ctx the parse tree
	 */
	void exitCmm_mpls(CiscoXrParser.Cmm_mplsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cmm_non_client_nrt}.
	 * @param ctx the parse tree
	 */
	void enterCmm_non_client_nrt(CiscoXrParser.Cmm_non_client_nrtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cmm_non_client_nrt}.
	 * @param ctx the parse tree
	 */
	void exitCmm_non_client_nrt(CiscoXrParser.Cmm_non_client_nrtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cmm_port}.
	 * @param ctx the parse tree
	 */
	void enterCmm_port(CiscoXrParser.Cmm_portContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cmm_port}.
	 * @param ctx the parse tree
	 */
	void exitCmm_port(CiscoXrParser.Cmm_portContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cmm_precedence}.
	 * @param ctx the parse tree
	 */
	void enterCmm_precedence(CiscoXrParser.Cmm_precedenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cmm_precedence}.
	 * @param ctx the parse tree
	 */
	void exitCmm_precedence(CiscoXrParser.Cmm_precedenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cmm_protocol}.
	 * @param ctx the parse tree
	 */
	void enterCmm_protocol(CiscoXrParser.Cmm_protocolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cmm_protocol}.
	 * @param ctx the parse tree
	 */
	void exitCmm_protocol(CiscoXrParser.Cmm_protocolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cmm_qos_group}.
	 * @param ctx the parse tree
	 */
	void enterCmm_qos_group(CiscoXrParser.Cmm_qos_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cmm_qos_group}.
	 * @param ctx the parse tree
	 */
	void exitCmm_qos_group(CiscoXrParser.Cmm_qos_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cmm_redirect}.
	 * @param ctx the parse tree
	 */
	void enterCmm_redirect(CiscoXrParser.Cmm_redirectContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cmm_redirect}.
	 * @param ctx the parse tree
	 */
	void exitCmm_redirect(CiscoXrParser.Cmm_redirectContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cmm_result_type}.
	 * @param ctx the parse tree
	 */
	void enterCmm_result_type(CiscoXrParser.Cmm_result_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cmm_result_type}.
	 * @param ctx the parse tree
	 */
	void exitCmm_result_type(CiscoXrParser.Cmm_result_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#cmm_service_template}.
	 * @param ctx the parse tree
	 */
	void enterCmm_service_template(CiscoXrParser.Cmm_service_templateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#cmm_service_template}.
	 * @param ctx the parse tree
	 */
	void exitCmm_service_template(CiscoXrParser.Cmm_service_templateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#color_setter}.
	 * @param ctx the parse tree
	 */
	void enterColor_setter(CiscoXrParser.Color_setterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#color_setter}.
	 * @param ctx the parse tree
	 */
	void exitColor_setter(CiscoXrParser.Color_setterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#inspect_protocol}.
	 * @param ctx the parse tree
	 */
	void enterInspect_protocol(CiscoXrParser.Inspect_protocolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#inspect_protocol}.
	 * @param ctx the parse tree
	 */
	void exitInspect_protocol(CiscoXrParser.Inspect_protocolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#match_semantics}.
	 * @param ctx the parse tree
	 */
	void enterMatch_semantics(CiscoXrParser.Match_semanticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#match_semantics}.
	 * @param ctx the parse tree
	 */
	void exitMatch_semantics(CiscoXrParser.Match_semanticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#o_network}.
	 * @param ctx the parse tree
	 */
	void enterO_network(CiscoXrParser.O_networkContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#o_network}.
	 * @param ctx the parse tree
	 */
	void exitO_network(CiscoXrParser.O_networkContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#o_service}.
	 * @param ctx the parse tree
	 */
	void enterO_service(CiscoXrParser.O_serviceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#o_service}.
	 * @param ctx the parse tree
	 */
	void exitO_service(CiscoXrParser.O_serviceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ogg_icmp_type}.
	 * @param ctx the parse tree
	 */
	void enterOgg_icmp_type(CiscoXrParser.Ogg_icmp_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ogg_icmp_type}.
	 * @param ctx the parse tree
	 */
	void exitOgg_icmp_type(CiscoXrParser.Ogg_icmp_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#oggit_group_object}.
	 * @param ctx the parse tree
	 */
	void enterOggit_group_object(CiscoXrParser.Oggit_group_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#oggit_group_object}.
	 * @param ctx the parse tree
	 */
	void exitOggit_group_object(CiscoXrParser.Oggit_group_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ogg_network}.
	 * @param ctx the parse tree
	 */
	void enterOgg_network(CiscoXrParser.Ogg_networkContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ogg_network}.
	 * @param ctx the parse tree
	 */
	void exitOgg_network(CiscoXrParser.Ogg_networkContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#oggn_group_object}.
	 * @param ctx the parse tree
	 */
	void enterOggn_group_object(CiscoXrParser.Oggn_group_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#oggn_group_object}.
	 * @param ctx the parse tree
	 */
	void exitOggn_group_object(CiscoXrParser.Oggn_group_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ogg_protocol}.
	 * @param ctx the parse tree
	 */
	void enterOgg_protocol(CiscoXrParser.Ogg_protocolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ogg_protocol}.
	 * @param ctx the parse tree
	 */
	void exitOgg_protocol(CiscoXrParser.Ogg_protocolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#oggp_group_object}.
	 * @param ctx the parse tree
	 */
	void enterOggp_group_object(CiscoXrParser.Oggp_group_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#oggp_group_object}.
	 * @param ctx the parse tree
	 */
	void exitOggp_group_object(CiscoXrParser.Oggp_group_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ogg_service}.
	 * @param ctx the parse tree
	 */
	void enterOgg_service(CiscoXrParser.Ogg_serviceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ogg_service}.
	 * @param ctx the parse tree
	 */
	void exitOgg_service(CiscoXrParser.Ogg_serviceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#oggs_group_object}.
	 * @param ctx the parse tree
	 */
	void enterOggs_group_object(CiscoXrParser.Oggs_group_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#oggs_group_object}.
	 * @param ctx the parse tree
	 */
	void exitOggs_group_object(CiscoXrParser.Oggs_group_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#og_description}.
	 * @param ctx the parse tree
	 */
	void enterOg_description(CiscoXrParser.Og_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#og_description}.
	 * @param ctx the parse tree
	 */
	void exitOg_description(CiscoXrParser.Og_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#og_group}.
	 * @param ctx the parse tree
	 */
	void enterOg_group(CiscoXrParser.Og_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#og_group}.
	 * @param ctx the parse tree
	 */
	void exitOg_group(CiscoXrParser.Og_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#og_icmp_type}.
	 * @param ctx the parse tree
	 */
	void enterOg_icmp_type(CiscoXrParser.Og_icmp_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#og_icmp_type}.
	 * @param ctx the parse tree
	 */
	void exitOg_icmp_type(CiscoXrParser.Og_icmp_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#og_ip_address}.
	 * @param ctx the parse tree
	 */
	void enterOg_ip_address(CiscoXrParser.Og_ip_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#og_ip_address}.
	 * @param ctx the parse tree
	 */
	void exitOg_ip_address(CiscoXrParser.Og_ip_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#og_network}.
	 * @param ctx the parse tree
	 */
	void enterOg_network(CiscoXrParser.Og_networkContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#og_network}.
	 * @param ctx the parse tree
	 */
	void exitOg_network(CiscoXrParser.Og_networkContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#og_protocol}.
	 * @param ctx the parse tree
	 */
	void enterOg_protocol(CiscoXrParser.Og_protocolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#og_protocol}.
	 * @param ctx the parse tree
	 */
	void exitOg_protocol(CiscoXrParser.Og_protocolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#og_service}.
	 * @param ctx the parse tree
	 */
	void enterOg_service(CiscoXrParser.Og_serviceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#og_service}.
	 * @param ctx the parse tree
	 */
	void exitOg_service(CiscoXrParser.Og_serviceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#og_user}.
	 * @param ctx the parse tree
	 */
	void enterOg_user(CiscoXrParser.Og_userContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#og_user}.
	 * @param ctx the parse tree
	 */
	void exitOg_user(CiscoXrParser.Og_userContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ogipa_host_info}.
	 * @param ctx the parse tree
	 */
	void enterOgipa_host_info(CiscoXrParser.Ogipa_host_infoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ogipa_host_info}.
	 * @param ctx the parse tree
	 */
	void exitOgipa_host_info(CiscoXrParser.Ogipa_host_infoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ogipa_ip_addresses}.
	 * @param ctx the parse tree
	 */
	void enterOgipa_ip_addresses(CiscoXrParser.Ogipa_ip_addressesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ogipa_ip_addresses}.
	 * @param ctx the parse tree
	 */
	void exitOgipa_ip_addresses(CiscoXrParser.Ogipa_ip_addressesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ogit_description}.
	 * @param ctx the parse tree
	 */
	void enterOgit_description(CiscoXrParser.Ogit_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ogit_description}.
	 * @param ctx the parse tree
	 */
	void exitOgit_description(CiscoXrParser.Ogit_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ogit_group_object}.
	 * @param ctx the parse tree
	 */
	void enterOgit_group_object(CiscoXrParser.Ogit_group_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ogit_group_object}.
	 * @param ctx the parse tree
	 */
	void exitOgit_group_object(CiscoXrParser.Ogit_group_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ogit_icmp_object}.
	 * @param ctx the parse tree
	 */
	void enterOgit_icmp_object(CiscoXrParser.Ogit_icmp_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ogit_icmp_object}.
	 * @param ctx the parse tree
	 */
	void exitOgit_icmp_object(CiscoXrParser.Ogit_icmp_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ogn_description}.
	 * @param ctx the parse tree
	 */
	void enterOgn_description(CiscoXrParser.Ogn_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ogn_description}.
	 * @param ctx the parse tree
	 */
	void exitOgn_description(CiscoXrParser.Ogn_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ogn_group_object}.
	 * @param ctx the parse tree
	 */
	void enterOgn_group_object(CiscoXrParser.Ogn_group_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ogn_group_object}.
	 * @param ctx the parse tree
	 */
	void exitOgn_group_object(CiscoXrParser.Ogn_group_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ogn_host_ip}.
	 * @param ctx the parse tree
	 */
	void enterOgn_host_ip(CiscoXrParser.Ogn_host_ipContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ogn_host_ip}.
	 * @param ctx the parse tree
	 */
	void exitOgn_host_ip(CiscoXrParser.Ogn_host_ipContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ogn_ip_with_mask}.
	 * @param ctx the parse tree
	 */
	void enterOgn_ip_with_mask(CiscoXrParser.Ogn_ip_with_maskContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ogn_ip_with_mask}.
	 * @param ctx the parse tree
	 */
	void exitOgn_ip_with_mask(CiscoXrParser.Ogn_ip_with_maskContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ogn_network_object}.
	 * @param ctx the parse tree
	 */
	void enterOgn_network_object(CiscoXrParser.Ogn_network_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ogn_network_object}.
	 * @param ctx the parse tree
	 */
	void exitOgn_network_object(CiscoXrParser.Ogn_network_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ogp_description}.
	 * @param ctx the parse tree
	 */
	void enterOgp_description(CiscoXrParser.Ogp_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ogp_description}.
	 * @param ctx the parse tree
	 */
	void exitOgp_description(CiscoXrParser.Ogp_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ogp_group_object}.
	 * @param ctx the parse tree
	 */
	void enterOgp_group_object(CiscoXrParser.Ogp_group_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ogp_group_object}.
	 * @param ctx the parse tree
	 */
	void exitOgp_group_object(CiscoXrParser.Ogp_group_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ogp_protocol_object}.
	 * @param ctx the parse tree
	 */
	void enterOgp_protocol_object(CiscoXrParser.Ogp_protocol_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ogp_protocol_object}.
	 * @param ctx the parse tree
	 */
	void exitOgp_protocol_object(CiscoXrParser.Ogp_protocol_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ogs_description}.
	 * @param ctx the parse tree
	 */
	void enterOgs_description(CiscoXrParser.Ogs_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ogs_description}.
	 * @param ctx the parse tree
	 */
	void exitOgs_description(CiscoXrParser.Ogs_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ogs_group_object}.
	 * @param ctx the parse tree
	 */
	void enterOgs_group_object(CiscoXrParser.Ogs_group_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ogs_group_object}.
	 * @param ctx the parse tree
	 */
	void exitOgs_group_object(CiscoXrParser.Ogs_group_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ogs_icmp}.
	 * @param ctx the parse tree
	 */
	void enterOgs_icmp(CiscoXrParser.Ogs_icmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ogs_icmp}.
	 * @param ctx the parse tree
	 */
	void exitOgs_icmp(CiscoXrParser.Ogs_icmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ogs_service_object}.
	 * @param ctx the parse tree
	 */
	void enterOgs_service_object(CiscoXrParser.Ogs_service_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ogs_service_object}.
	 * @param ctx the parse tree
	 */
	void exitOgs_service_object(CiscoXrParser.Ogs_service_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ogs_tcp}.
	 * @param ctx the parse tree
	 */
	void enterOgs_tcp(CiscoXrParser.Ogs_tcpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ogs_tcp}.
	 * @param ctx the parse tree
	 */
	void exitOgs_tcp(CiscoXrParser.Ogs_tcpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ogs_udp}.
	 * @param ctx the parse tree
	 */
	void enterOgs_udp(CiscoXrParser.Ogs_udpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ogs_udp}.
	 * @param ctx the parse tree
	 */
	void exitOgs_udp(CiscoXrParser.Ogs_udpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ogs_port_object}.
	 * @param ctx the parse tree
	 */
	void enterOgs_port_object(CiscoXrParser.Ogs_port_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ogs_port_object}.
	 * @param ctx the parse tree
	 */
	void exitOgs_port_object(CiscoXrParser.Ogs_port_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ogu_description}.
	 * @param ctx the parse tree
	 */
	void enterOgu_description(CiscoXrParser.Ogu_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ogu_description}.
	 * @param ctx the parse tree
	 */
	void exitOgu_description(CiscoXrParser.Ogu_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ogu_group_object}.
	 * @param ctx the parse tree
	 */
	void enterOgu_group_object(CiscoXrParser.Ogu_group_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ogu_group_object}.
	 * @param ctx the parse tree
	 */
	void exitOgu_group_object(CiscoXrParser.Ogu_group_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ogu_user}.
	 * @param ctx the parse tree
	 */
	void enterOgu_user(CiscoXrParser.Ogu_userContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ogu_user}.
	 * @param ctx the parse tree
	 */
	void exitOgu_user(CiscoXrParser.Ogu_userContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ogu_user_group}.
	 * @param ctx the parse tree
	 */
	void enterOgu_user_group(CiscoXrParser.Ogu_user_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ogu_user_group}.
	 * @param ctx the parse tree
	 */
	void exitOgu_user_group(CiscoXrParser.Ogu_user_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#on_description}.
	 * @param ctx the parse tree
	 */
	void enterOn_description(CiscoXrParser.On_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#on_description}.
	 * @param ctx the parse tree
	 */
	void exitOn_description(CiscoXrParser.On_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#on_fqdn}.
	 * @param ctx the parse tree
	 */
	void enterOn_fqdn(CiscoXrParser.On_fqdnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#on_fqdn}.
	 * @param ctx the parse tree
	 */
	void exitOn_fqdn(CiscoXrParser.On_fqdnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#on_host}.
	 * @param ctx the parse tree
	 */
	void enterOn_host(CiscoXrParser.On_hostContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#on_host}.
	 * @param ctx the parse tree
	 */
	void exitOn_host(CiscoXrParser.On_hostContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#on_range}.
	 * @param ctx the parse tree
	 */
	void enterOn_range(CiscoXrParser.On_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#on_range}.
	 * @param ctx the parse tree
	 */
	void exitOn_range(CiscoXrParser.On_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#on_subnet}.
	 * @param ctx the parse tree
	 */
	void enterOn_subnet(CiscoXrParser.On_subnetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#on_subnet}.
	 * @param ctx the parse tree
	 */
	void exitOn_subnet(CiscoXrParser.On_subnetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#on_group}.
	 * @param ctx the parse tree
	 */
	void enterOn_group(CiscoXrParser.On_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#on_group}.
	 * @param ctx the parse tree
	 */
	void exitOn_group(CiscoXrParser.On_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#os_description}.
	 * @param ctx the parse tree
	 */
	void enterOs_description(CiscoXrParser.Os_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#os_description}.
	 * @param ctx the parse tree
	 */
	void exitOs_description(CiscoXrParser.Os_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#os_service}.
	 * @param ctx the parse tree
	 */
	void enterOs_service(CiscoXrParser.Os_serviceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#os_service}.
	 * @param ctx the parse tree
	 */
	void exitOs_service(CiscoXrParser.Os_serviceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#pm_end_policy_map}.
	 * @param ctx the parse tree
	 */
	void enterPm_end_policy_map(CiscoXrParser.Pm_end_policy_mapContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#pm_end_policy_map}.
	 * @param ctx the parse tree
	 */
	void exitPm_end_policy_map(CiscoXrParser.Pm_end_policy_mapContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#pm_type_accounting}.
	 * @param ctx the parse tree
	 */
	void enterPm_type_accounting(CiscoXrParser.Pm_type_accountingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#pm_type_accounting}.
	 * @param ctx the parse tree
	 */
	void exitPm_type_accounting(CiscoXrParser.Pm_type_accountingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#pm_type_null_tail}.
	 * @param ctx the parse tree
	 */
	void enterPm_type_null_tail(CiscoXrParser.Pm_type_null_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#pm_type_null_tail}.
	 * @param ctx the parse tree
	 */
	void exitPm_type_null_tail(CiscoXrParser.Pm_type_null_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#pm_type_control_subscriber}.
	 * @param ctx the parse tree
	 */
	void enterPm_type_control_subscriber(CiscoXrParser.Pm_type_control_subscriberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#pm_type_control_subscriber}.
	 * @param ctx the parse tree
	 */
	void exitPm_type_control_subscriber(CiscoXrParser.Pm_type_control_subscriberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#pm_type_pbr}.
	 * @param ctx the parse tree
	 */
	void enterPm_type_pbr(CiscoXrParser.Pm_type_pbrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#pm_type_pbr}.
	 * @param ctx the parse tree
	 */
	void exitPm_type_pbr(CiscoXrParser.Pm_type_pbrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#pm_type_performance_traffic}.
	 * @param ctx the parse tree
	 */
	void enterPm_type_performance_traffic(CiscoXrParser.Pm_type_performance_trafficContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#pm_type_performance_traffic}.
	 * @param ctx the parse tree
	 */
	void exitPm_type_performance_traffic(CiscoXrParser.Pm_type_performance_trafficContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#pm_type_qos}.
	 * @param ctx the parse tree
	 */
	void enterPm_type_qos(CiscoXrParser.Pm_type_qosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#pm_type_qos}.
	 * @param ctx the parse tree
	 */
	void exitPm_type_qos(CiscoXrParser.Pm_type_qosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#pm_type_redirect}.
	 * @param ctx the parse tree
	 */
	void enterPm_type_redirect(CiscoXrParser.Pm_type_redirectContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#pm_type_redirect}.
	 * @param ctx the parse tree
	 */
	void exitPm_type_redirect(CiscoXrParser.Pm_type_redirectContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#pm_type_traffic}.
	 * @param ctx the parse tree
	 */
	void enterPm_type_traffic(CiscoXrParser.Pm_type_trafficContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#pm_type_traffic}.
	 * @param ctx the parse tree
	 */
	void exitPm_type_traffic(CiscoXrParser.Pm_type_trafficContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#pmtcs_event}.
	 * @param ctx the parse tree
	 */
	void enterPmtcs_event(CiscoXrParser.Pmtcs_eventContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#pmtcs_event}.
	 * @param ctx the parse tree
	 */
	void exitPmtcs_event(CiscoXrParser.Pmtcs_eventContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#pmtcse_class}.
	 * @param ctx the parse tree
	 */
	void enterPmtcse_class(CiscoXrParser.Pmtcse_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#pmtcse_class}.
	 * @param ctx the parse tree
	 */
	void exitPmtcse_class(CiscoXrParser.Pmtcse_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#pmtcsec_do}.
	 * @param ctx the parse tree
	 */
	void enterPmtcsec_do(CiscoXrParser.Pmtcsec_doContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#pmtcsec_do}.
	 * @param ctx the parse tree
	 */
	void exitPmtcsec_do(CiscoXrParser.Pmtcsec_doContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#pmtcsec_tail}.
	 * @param ctx the parse tree
	 */
	void enterPmtcsec_tail(CiscoXrParser.Pmtcsec_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#pmtcsec_tail}.
	 * @param ctx the parse tree
	 */
	void exitPmtcsec_tail(CiscoXrParser.Pmtcsec_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#pmtcsec_activate}.
	 * @param ctx the parse tree
	 */
	void enterPmtcsec_activate(CiscoXrParser.Pmtcsec_activateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#pmtcsec_activate}.
	 * @param ctx the parse tree
	 */
	void exitPmtcsec_activate(CiscoXrParser.Pmtcsec_activateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#pmtcsec_null}.
	 * @param ctx the parse tree
	 */
	void enterPmtcsec_null(CiscoXrParser.Pmtcsec_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#pmtcsec_null}.
	 * @param ctx the parse tree
	 */
	void exitPmtcsec_null(CiscoXrParser.Pmtcsec_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#qm_null}.
	 * @param ctx the parse tree
	 */
	void enterQm_null(CiscoXrParser.Qm_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#qm_null}.
	 * @param ctx the parse tree
	 */
	void exitQm_null(CiscoXrParser.Qm_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_class_map}.
	 * @param ctx the parse tree
	 */
	void enterS_class_map(CiscoXrParser.S_class_mapContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_class_map}.
	 * @param ctx the parse tree
	 */
	void exitS_class_map(CiscoXrParser.S_class_mapContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_class_map_ios}.
	 * @param ctx the parse tree
	 */
	void enterS_class_map_ios(CiscoXrParser.S_class_map_iosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_class_map_ios}.
	 * @param ctx the parse tree
	 */
	void exitS_class_map_ios(CiscoXrParser.S_class_map_iosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_object}.
	 * @param ctx the parse tree
	 */
	void enterS_object(CiscoXrParser.S_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_object}.
	 * @param ctx the parse tree
	 */
	void exitS_object(CiscoXrParser.S_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_object_group}.
	 * @param ctx the parse tree
	 */
	void enterS_object_group(CiscoXrParser.S_object_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_object_group}.
	 * @param ctx the parse tree
	 */
	void exitS_object_group(CiscoXrParser.S_object_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_policy_map}.
	 * @param ctx the parse tree
	 */
	void enterS_policy_map(CiscoXrParser.S_policy_mapContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_policy_map}.
	 * @param ctx the parse tree
	 */
	void exitS_policy_map(CiscoXrParser.S_policy_mapContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_qos_mapping}.
	 * @param ctx the parse tree
	 */
	void enterS_qos_mapping(CiscoXrParser.S_qos_mappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_qos_mapping}.
	 * @param ctx the parse tree
	 */
	void exitS_qos_mapping(CiscoXrParser.S_qos_mappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_service_template}.
	 * @param ctx the parse tree
	 */
	void enterS_service_template(CiscoXrParser.S_service_templateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_service_template}.
	 * @param ctx the parse tree
	 */
	void exitS_service_template(CiscoXrParser.S_service_templateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_table_map}.
	 * @param ctx the parse tree
	 */
	void enterS_table_map(CiscoXrParser.S_table_mapContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_table_map}.
	 * @param ctx the parse tree
	 */
	void exitS_table_map(CiscoXrParser.S_table_mapContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#st_access_group}.
	 * @param ctx the parse tree
	 */
	void enterSt_access_group(CiscoXrParser.St_access_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#st_access_group}.
	 * @param ctx the parse tree
	 */
	void exitSt_access_group(CiscoXrParser.St_access_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#st_description}.
	 * @param ctx the parse tree
	 */
	void enterSt_description(CiscoXrParser.St_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#st_description}.
	 * @param ctx the parse tree
	 */
	void exitSt_description(CiscoXrParser.St_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#st_inactivity_timer}.
	 * @param ctx the parse tree
	 */
	void enterSt_inactivity_timer(CiscoXrParser.St_inactivity_timerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#st_inactivity_timer}.
	 * @param ctx the parse tree
	 */
	void exitSt_inactivity_timer(CiscoXrParser.St_inactivity_timerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#st_linksec}.
	 * @param ctx the parse tree
	 */
	void enterSt_linksec(CiscoXrParser.St_linksecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#st_linksec}.
	 * @param ctx the parse tree
	 */
	void exitSt_linksec(CiscoXrParser.St_linksecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#st_tag}.
	 * @param ctx the parse tree
	 */
	void enterSt_tag(CiscoXrParser.St_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#st_tag}.
	 * @param ctx the parse tree
	 */
	void exitSt_tag(CiscoXrParser.St_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#st_vlan}.
	 * @param ctx the parse tree
	 */
	void enterSt_vlan(CiscoXrParser.St_vlanContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#st_vlan}.
	 * @param ctx the parse tree
	 */
	void exitSt_vlan(CiscoXrParser.St_vlanContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#st_voice_vlan}.
	 * @param ctx the parse tree
	 */
	void enterSt_voice_vlan(CiscoXrParser.St_voice_vlanContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#st_voice_vlan}.
	 * @param ctx the parse tree
	 */
	void exitSt_voice_vlan(CiscoXrParser.St_voice_vlanContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#table_map_null}.
	 * @param ctx the parse tree
	 */
	void enterTable_map_null(CiscoXrParser.Table_map_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#table_map_null}.
	 * @param ctx the parse tree
	 */
	void exitTable_map_null(CiscoXrParser.Table_map_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#variable_policy_map_header}.
	 * @param ctx the parse tree
	 */
	void enterVariable_policy_map_header(CiscoXrParser.Variable_policy_map_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#variable_policy_map_header}.
	 * @param ctx the parse tree
	 */
	void exitVariable_policy_map_header(CiscoXrParser.Variable_policy_map_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#rr_default_metric}.
	 * @param ctx the parse tree
	 */
	void enterRr_default_metric(CiscoXrParser.Rr_default_metricContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#rr_default_metric}.
	 * @param ctx the parse tree
	 */
	void exitRr_default_metric(CiscoXrParser.Rr_default_metricContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#rr_default_information}.
	 * @param ctx the parse tree
	 */
	void enterRr_default_information(CiscoXrParser.Rr_default_informationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#rr_default_information}.
	 * @param ctx the parse tree
	 */
	void exitRr_default_information(CiscoXrParser.Rr_default_informationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#rr_distance}.
	 * @param ctx the parse tree
	 */
	void enterRr_distance(CiscoXrParser.Rr_distanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#rr_distance}.
	 * @param ctx the parse tree
	 */
	void exitRr_distance(CiscoXrParser.Rr_distanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#rr_distribute_list}.
	 * @param ctx the parse tree
	 */
	void enterRr_distribute_list(CiscoXrParser.Rr_distribute_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#rr_distribute_list}.
	 * @param ctx the parse tree
	 */
	void exitRr_distribute_list(CiscoXrParser.Rr_distribute_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#rr_network}.
	 * @param ctx the parse tree
	 */
	void enterRr_network(CiscoXrParser.Rr_networkContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#rr_network}.
	 * @param ctx the parse tree
	 */
	void exitRr_network(CiscoXrParser.Rr_networkContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#rr_null}.
	 * @param ctx the parse tree
	 */
	void enterRr_null(CiscoXrParser.Rr_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#rr_null}.
	 * @param ctx the parse tree
	 */
	void exitRr_null(CiscoXrParser.Rr_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#rr_passive_interface}.
	 * @param ctx the parse tree
	 */
	void enterRr_passive_interface(CiscoXrParser.Rr_passive_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#rr_passive_interface}.
	 * @param ctx the parse tree
	 */
	void exitRr_passive_interface(CiscoXrParser.Rr_passive_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#rr_passive_interface_default}.
	 * @param ctx the parse tree
	 */
	void enterRr_passive_interface_default(CiscoXrParser.Rr_passive_interface_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#rr_passive_interface_default}.
	 * @param ctx the parse tree
	 */
	void exitRr_passive_interface_default(CiscoXrParser.Rr_passive_interface_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#rr_redistribute}.
	 * @param ctx the parse tree
	 */
	void enterRr_redistribute(CiscoXrParser.Rr_redistributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#rr_redistribute}.
	 * @param ctx the parse tree
	 */
	void exitRr_redistribute(CiscoXrParser.Rr_redistributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_router_rip}.
	 * @param ctx the parse tree
	 */
	void enterS_router_rip(CiscoXrParser.S_router_ripContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_router_rip}.
	 * @param ctx the parse tree
	 */
	void exitS_router_rip(CiscoXrParser.S_router_ripContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#apply_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterApply_rp_stanza(CiscoXrParser.Apply_rp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#apply_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitApply_rp_stanza(CiscoXrParser.Apply_rp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#as_expr}.
	 * @param ctx the parse tree
	 */
	void enterAs_expr(CiscoXrParser.As_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#as_expr}.
	 * @param ctx the parse tree
	 */
	void exitAs_expr(CiscoXrParser.As_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#as_path_set_expr}.
	 * @param ctx the parse tree
	 */
	void enterAs_path_set_expr(CiscoXrParser.As_path_set_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#as_path_set_expr}.
	 * @param ctx the parse tree
	 */
	void exitAs_path_set_expr(CiscoXrParser.As_path_set_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#as_path_set_inline}.
	 * @param ctx the parse tree
	 */
	void enterAs_path_set_inline(CiscoXrParser.As_path_set_inlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#as_path_set_inline}.
	 * @param ctx the parse tree
	 */
	void exitAs_path_set_inline(CiscoXrParser.As_path_set_inlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#as_range_expr}.
	 * @param ctx the parse tree
	 */
	void enterAs_range_expr(CiscoXrParser.As_range_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#as_range_expr}.
	 * @param ctx the parse tree
	 */
	void exitAs_range_expr(CiscoXrParser.As_range_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#boolean_and_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_and_rp_stanza(CiscoXrParser.Boolean_and_rp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#boolean_and_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_and_rp_stanza(CiscoXrParser.Boolean_and_rp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#boolean_apply_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_apply_rp_stanza(CiscoXrParser.Boolean_apply_rp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#boolean_apply_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_apply_rp_stanza(CiscoXrParser.Boolean_apply_rp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#boolean_as_path_in_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_as_path_in_rp_stanza(CiscoXrParser.Boolean_as_path_in_rp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#boolean_as_path_in_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_as_path_in_rp_stanza(CiscoXrParser.Boolean_as_path_in_rp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#boolean_as_path_is_local_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_as_path_is_local_rp_stanza(CiscoXrParser.Boolean_as_path_is_local_rp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#boolean_as_path_is_local_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_as_path_is_local_rp_stanza(CiscoXrParser.Boolean_as_path_is_local_rp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#boolean_as_path_neighbor_is_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_as_path_neighbor_is_rp_stanza(CiscoXrParser.Boolean_as_path_neighbor_is_rp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#boolean_as_path_neighbor_is_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_as_path_neighbor_is_rp_stanza(CiscoXrParser.Boolean_as_path_neighbor_is_rp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#boolean_as_path_originates_from_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_as_path_originates_from_rp_stanza(CiscoXrParser.Boolean_as_path_originates_from_rp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#boolean_as_path_originates_from_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_as_path_originates_from_rp_stanza(CiscoXrParser.Boolean_as_path_originates_from_rp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#boolean_as_path_passes_through_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_as_path_passes_through_rp_stanza(CiscoXrParser.Boolean_as_path_passes_through_rp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#boolean_as_path_passes_through_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_as_path_passes_through_rp_stanza(CiscoXrParser.Boolean_as_path_passes_through_rp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#boolean_community_matches_any_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_community_matches_any_rp_stanza(CiscoXrParser.Boolean_community_matches_any_rp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#boolean_community_matches_any_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_community_matches_any_rp_stanza(CiscoXrParser.Boolean_community_matches_any_rp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#boolean_community_matches_every_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_community_matches_every_rp_stanza(CiscoXrParser.Boolean_community_matches_every_rp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#boolean_community_matches_every_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_community_matches_every_rp_stanza(CiscoXrParser.Boolean_community_matches_every_rp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#boolean_destination_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_destination_rp_stanza(CiscoXrParser.Boolean_destination_rp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#boolean_destination_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_destination_rp_stanza(CiscoXrParser.Boolean_destination_rp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#boolean_local_preference_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_local_preference_rp_stanza(CiscoXrParser.Boolean_local_preference_rp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#boolean_local_preference_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_local_preference_rp_stanza(CiscoXrParser.Boolean_local_preference_rp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#boolean_med_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_med_rp_stanza(CiscoXrParser.Boolean_med_rp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#boolean_med_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_med_rp_stanza(CiscoXrParser.Boolean_med_rp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#boolean_next_hop_in_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_next_hop_in_rp_stanza(CiscoXrParser.Boolean_next_hop_in_rp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#boolean_next_hop_in_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_next_hop_in_rp_stanza(CiscoXrParser.Boolean_next_hop_in_rp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#boolean_not_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_not_rp_stanza(CiscoXrParser.Boolean_not_rp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#boolean_not_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_not_rp_stanza(CiscoXrParser.Boolean_not_rp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#boolean_rib_has_route_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_rib_has_route_rp_stanza(CiscoXrParser.Boolean_rib_has_route_rp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#boolean_rib_has_route_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_rib_has_route_rp_stanza(CiscoXrParser.Boolean_rib_has_route_rp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#boolean_route_type_is_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_route_type_is_rp_stanza(CiscoXrParser.Boolean_route_type_is_rp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#boolean_route_type_is_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_route_type_is_rp_stanza(CiscoXrParser.Boolean_route_type_is_rp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#boolean_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_rp_stanza(CiscoXrParser.Boolean_rp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#boolean_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_rp_stanza(CiscoXrParser.Boolean_rp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#boolean_simple_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_simple_rp_stanza(CiscoXrParser.Boolean_simple_rp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#boolean_simple_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_simple_rp_stanza(CiscoXrParser.Boolean_simple_rp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#boolean_tag_is_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_tag_is_rp_stanza(CiscoXrParser.Boolean_tag_is_rp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#boolean_tag_is_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_tag_is_rp_stanza(CiscoXrParser.Boolean_tag_is_rp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#delete_community_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterDelete_community_rp_stanza(CiscoXrParser.Delete_community_rp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#delete_community_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitDelete_community_rp_stanza(CiscoXrParser.Delete_community_rp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#disposition_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterDisposition_rp_stanza(CiscoXrParser.Disposition_rp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#disposition_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitDisposition_rp_stanza(CiscoXrParser.Disposition_rp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#elseif_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterElseif_rp_stanza(CiscoXrParser.Elseif_rp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#elseif_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitElseif_rp_stanza(CiscoXrParser.Elseif_rp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#else_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterElse_rp_stanza(CiscoXrParser.Else_rp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#else_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitElse_rp_stanza(CiscoXrParser.Else_rp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#if_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterIf_rp_stanza(CiscoXrParser.If_rp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#if_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitIf_rp_stanza(CiscoXrParser.If_rp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#int_comp}.
	 * @param ctx the parse tree
	 */
	void enterInt_comp(CiscoXrParser.Int_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#int_comp}.
	 * @param ctx the parse tree
	 */
	void exitInt_comp(CiscoXrParser.Int_compContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#isis_level_expr}.
	 * @param ctx the parse tree
	 */
	void enterIsis_level_expr(CiscoXrParser.Isis_level_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#isis_level_expr}.
	 * @param ctx the parse tree
	 */
	void exitIsis_level_expr(CiscoXrParser.Isis_level_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#origin_expr}.
	 * @param ctx the parse tree
	 */
	void enterOrigin_expr(CiscoXrParser.Origin_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#origin_expr}.
	 * @param ctx the parse tree
	 */
	void exitOrigin_expr(CiscoXrParser.Origin_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#origin_expr_literal}.
	 * @param ctx the parse tree
	 */
	void enterOrigin_expr_literal(CiscoXrParser.Origin_expr_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#origin_expr_literal}.
	 * @param ctx the parse tree
	 */
	void exitOrigin_expr_literal(CiscoXrParser.Origin_expr_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#prepend_as_path_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterPrepend_as_path_rp_stanza(CiscoXrParser.Prepend_as_path_rp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#prepend_as_path_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitPrepend_as_path_rp_stanza(CiscoXrParser.Prepend_as_path_rp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#route_policy_stanza}.
	 * @param ctx the parse tree
	 */
	void enterRoute_policy_stanza(CiscoXrParser.Route_policy_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#route_policy_stanza}.
	 * @param ctx the parse tree
	 */
	void exitRoute_policy_stanza(CiscoXrParser.Route_policy_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#rp_community_set}.
	 * @param ctx the parse tree
	 */
	void enterRp_community_set(CiscoXrParser.Rp_community_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#rp_community_set}.
	 * @param ctx the parse tree
	 */
	void exitRp_community_set(CiscoXrParser.Rp_community_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#rp_extcommunity_set_rt}.
	 * @param ctx the parse tree
	 */
	void enterRp_extcommunity_set_rt(CiscoXrParser.Rp_extcommunity_set_rtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#rp_extcommunity_set_rt}.
	 * @param ctx the parse tree
	 */
	void exitRp_extcommunity_set_rt(CiscoXrParser.Rp_extcommunity_set_rtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#rp_isis_metric_type}.
	 * @param ctx the parse tree
	 */
	void enterRp_isis_metric_type(CiscoXrParser.Rp_isis_metric_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#rp_isis_metric_type}.
	 * @param ctx the parse tree
	 */
	void exitRp_isis_metric_type(CiscoXrParser.Rp_isis_metric_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#rp_metric_type}.
	 * @param ctx the parse tree
	 */
	void enterRp_metric_type(CiscoXrParser.Rp_metric_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#rp_metric_type}.
	 * @param ctx the parse tree
	 */
	void exitRp_metric_type(CiscoXrParser.Rp_metric_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#rp_ospf_metric_type}.
	 * @param ctx the parse tree
	 */
	void enterRp_ospf_metric_type(CiscoXrParser.Rp_ospf_metric_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#rp_ospf_metric_type}.
	 * @param ctx the parse tree
	 */
	void exitRp_ospf_metric_type(CiscoXrParser.Rp_ospf_metric_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#rp_prefix_set}.
	 * @param ctx the parse tree
	 */
	void enterRp_prefix_set(CiscoXrParser.Rp_prefix_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#rp_prefix_set}.
	 * @param ctx the parse tree
	 */
	void exitRp_prefix_set(CiscoXrParser.Rp_prefix_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#rp_route_type}.
	 * @param ctx the parse tree
	 */
	void enterRp_route_type(CiscoXrParser.Rp_route_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#rp_route_type}.
	 * @param ctx the parse tree
	 */
	void exitRp_route_type(CiscoXrParser.Rp_route_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#rp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterRp_stanza(CiscoXrParser.Rp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#rp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitRp_stanza(CiscoXrParser.Rp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#set_community_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterSet_community_rp_stanza(CiscoXrParser.Set_community_rp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#set_community_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitSet_community_rp_stanza(CiscoXrParser.Set_community_rp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#set_extcommunity_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterSet_extcommunity_rp_stanza(CiscoXrParser.Set_extcommunity_rp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#set_extcommunity_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitSet_extcommunity_rp_stanza(CiscoXrParser.Set_extcommunity_rp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#set_extcommunity_rt}.
	 * @param ctx the parse tree
	 */
	void enterSet_extcommunity_rt(CiscoXrParser.Set_extcommunity_rtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#set_extcommunity_rt}.
	 * @param ctx the parse tree
	 */
	void exitSet_extcommunity_rt(CiscoXrParser.Set_extcommunity_rtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#set_isis_metric_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterSet_isis_metric_rp_stanza(CiscoXrParser.Set_isis_metric_rp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#set_isis_metric_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitSet_isis_metric_rp_stanza(CiscoXrParser.Set_isis_metric_rp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#set_level_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterSet_level_rp_stanza(CiscoXrParser.Set_level_rp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#set_level_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitSet_level_rp_stanza(CiscoXrParser.Set_level_rp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#set_local_preference_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterSet_local_preference_rp_stanza(CiscoXrParser.Set_local_preference_rp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#set_local_preference_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitSet_local_preference_rp_stanza(CiscoXrParser.Set_local_preference_rp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#set_med_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterSet_med_rp_stanza(CiscoXrParser.Set_med_rp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#set_med_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitSet_med_rp_stanza(CiscoXrParser.Set_med_rp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#set_metric_type_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterSet_metric_type_rp_stanza(CiscoXrParser.Set_metric_type_rp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#set_metric_type_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitSet_metric_type_rp_stanza(CiscoXrParser.Set_metric_type_rp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#set_next_hop_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterSet_next_hop_rp_stanza(CiscoXrParser.Set_next_hop_rp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#set_next_hop_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitSet_next_hop_rp_stanza(CiscoXrParser.Set_next_hop_rp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#set_next_hop_self_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterSet_next_hop_self_rp_stanza(CiscoXrParser.Set_next_hop_self_rp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#set_next_hop_self_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitSet_next_hop_self_rp_stanza(CiscoXrParser.Set_next_hop_self_rp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#set_origin_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterSet_origin_rp_stanza(CiscoXrParser.Set_origin_rp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#set_origin_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitSet_origin_rp_stanza(CiscoXrParser.Set_origin_rp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#set_path_selection_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterSet_path_selection_rp_stanza(CiscoXrParser.Set_path_selection_rp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#set_path_selection_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitSet_path_selection_rp_stanza(CiscoXrParser.Set_path_selection_rp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#set_tag_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterSet_tag_rp_stanza(CiscoXrParser.Set_tag_rp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#set_tag_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitSet_tag_rp_stanza(CiscoXrParser.Set_tag_rp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#set_weight_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterSet_weight_rp_stanza(CiscoXrParser.Set_weight_rp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#set_weight_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitSet_weight_rp_stanza(CiscoXrParser.Set_weight_rp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#set_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void enterSet_rp_stanza(CiscoXrParser.Set_rp_stanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#set_rp_stanza}.
	 * @param ctx the parse tree
	 */
	void exitSet_rp_stanza(CiscoXrParser.Set_rp_stanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#snmp_file_transfer_protocol}.
	 * @param ctx the parse tree
	 */
	void enterSnmp_file_transfer_protocol(CiscoXrParser.Snmp_file_transfer_protocolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#snmp_file_transfer_protocol}.
	 * @param ctx the parse tree
	 */
	void exitSnmp_file_transfer_protocol(CiscoXrParser.Snmp_file_transfer_protocolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_snmp_server}.
	 * @param ctx the parse tree
	 */
	void enterS_snmp_server(CiscoXrParser.S_snmp_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_snmp_server}.
	 * @param ctx the parse tree
	 */
	void exitS_snmp_server(CiscoXrParser.S_snmp_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ss_community}.
	 * @param ctx the parse tree
	 */
	void enterSs_community(CiscoXrParser.Ss_communityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ss_community}.
	 * @param ctx the parse tree
	 */
	void exitSs_community(CiscoXrParser.Ss_communityContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ss_enable_mib_null}.
	 * @param ctx the parse tree
	 */
	void enterSs_enable_mib_null(CiscoXrParser.Ss_enable_mib_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ss_enable_mib_null}.
	 * @param ctx the parse tree
	 */
	void exitSs_enable_mib_null(CiscoXrParser.Ss_enable_mib_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ss_enable_trap}.
	 * @param ctx the parse tree
	 */
	void enterSs_enable_trap(CiscoXrParser.Ss_enable_trapContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ss_enable_trap}.
	 * @param ctx the parse tree
	 */
	void exitSs_enable_trap(CiscoXrParser.Ss_enable_trapContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ss_enable_traps}.
	 * @param ctx the parse tree
	 */
	void enterSs_enable_traps(CiscoXrParser.Ss_enable_trapsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ss_enable_traps}.
	 * @param ctx the parse tree
	 */
	void exitSs_enable_traps(CiscoXrParser.Ss_enable_trapsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ss_file_transfer}.
	 * @param ctx the parse tree
	 */
	void enterSs_file_transfer(CiscoXrParser.Ss_file_transferContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ss_file_transfer}.
	 * @param ctx the parse tree
	 */
	void exitSs_file_transfer(CiscoXrParser.Ss_file_transferContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ss_host}.
	 * @param ctx the parse tree
	 */
	void enterSs_host(CiscoXrParser.Ss_hostContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ss_host}.
	 * @param ctx the parse tree
	 */
	void exitSs_host(CiscoXrParser.Ss_hostContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ss_host_informs}.
	 * @param ctx the parse tree
	 */
	void enterSs_host_informs(CiscoXrParser.Ss_host_informsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ss_host_informs}.
	 * @param ctx the parse tree
	 */
	void exitSs_host_informs(CiscoXrParser.Ss_host_informsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ss_host_traps}.
	 * @param ctx the parse tree
	 */
	void enterSs_host_traps(CiscoXrParser.Ss_host_trapsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ss_host_traps}.
	 * @param ctx the parse tree
	 */
	void exitSs_host_traps(CiscoXrParser.Ss_host_trapsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ss_host_use_vrf}.
	 * @param ctx the parse tree
	 */
	void enterSs_host_use_vrf(CiscoXrParser.Ss_host_use_vrfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ss_host_use_vrf}.
	 * @param ctx the parse tree
	 */
	void exitSs_host_use_vrf(CiscoXrParser.Ss_host_use_vrfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ss_host_version}.
	 * @param ctx the parse tree
	 */
	void enterSs_host_version(CiscoXrParser.Ss_host_versionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ss_host_version}.
	 * @param ctx the parse tree
	 */
	void exitSs_host_version(CiscoXrParser.Ss_host_versionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ss_mib}.
	 * @param ctx the parse tree
	 */
	void enterSs_mib(CiscoXrParser.Ss_mibContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ss_mib}.
	 * @param ctx the parse tree
	 */
	void exitSs_mib(CiscoXrParser.Ss_mibContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ss_null}.
	 * @param ctx the parse tree
	 */
	void enterSs_null(CiscoXrParser.Ss_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ss_null}.
	 * @param ctx the parse tree
	 */
	void exitSs_null(CiscoXrParser.Ss_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ss_source_interface}.
	 * @param ctx the parse tree
	 */
	void enterSs_source_interface(CiscoXrParser.Ss_source_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ss_source_interface}.
	 * @param ctx the parse tree
	 */
	void exitSs_source_interface(CiscoXrParser.Ss_source_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ss_tftp_server_list}.
	 * @param ctx the parse tree
	 */
	void enterSs_tftp_server_list(CiscoXrParser.Ss_tftp_server_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ss_tftp_server_list}.
	 * @param ctx the parse tree
	 */
	void exitSs_tftp_server_list(CiscoXrParser.Ss_tftp_server_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ss_trap_source}.
	 * @param ctx the parse tree
	 */
	void enterSs_trap_source(CiscoXrParser.Ss_trap_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ss_trap_source}.
	 * @param ctx the parse tree
	 */
	void exitSs_trap_source(CiscoXrParser.Ss_trap_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ssc_access_control}.
	 * @param ctx the parse tree
	 */
	void enterSsc_access_control(CiscoXrParser.Ssc_access_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ssc_access_control}.
	 * @param ctx the parse tree
	 */
	void exitSsc_access_control(CiscoXrParser.Ssc_access_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ssc_group}.
	 * @param ctx the parse tree
	 */
	void enterSsc_group(CiscoXrParser.Ssc_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ssc_group}.
	 * @param ctx the parse tree
	 */
	void exitSsc_group(CiscoXrParser.Ssc_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ssc_use_ipv4_acl}.
	 * @param ctx the parse tree
	 */
	void enterSsc_use_ipv4_acl(CiscoXrParser.Ssc_use_ipv4_aclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ssc_use_ipv4_acl}.
	 * @param ctx the parse tree
	 */
	void exitSsc_use_ipv4_acl(CiscoXrParser.Ssc_use_ipv4_aclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#ssc_use_ipv6_acl}.
	 * @param ctx the parse tree
	 */
	void enterSsc_use_ipv6_acl(CiscoXrParser.Ssc_use_ipv6_aclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#ssc_use_ipv6_acl}.
	 * @param ctx the parse tree
	 */
	void exitSsc_use_ipv6_acl(CiscoXrParser.Ssc_use_ipv6_aclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#variable_snmp}.
	 * @param ctx the parse tree
	 */
	void enterVariable_snmp(CiscoXrParser.Variable_snmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#variable_snmp}.
	 * @param ctx the parse tree
	 */
	void exitVariable_snmp(CiscoXrParser.Variable_snmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#variable_snmp_host}.
	 * @param ctx the parse tree
	 */
	void enterVariable_snmp_host(CiscoXrParser.Variable_snmp_hostContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#variable_snmp_host}.
	 * @param ctx the parse tree
	 */
	void exitVariable_snmp_host(CiscoXrParser.Variable_snmp_hostContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#rs_address_family}.
	 * @param ctx the parse tree
	 */
	void enterRs_address_family(CiscoXrParser.Rs_address_familyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#rs_address_family}.
	 * @param ctx the parse tree
	 */
	void exitRs_address_family(CiscoXrParser.Rs_address_familyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#rs_route}.
	 * @param ctx the parse tree
	 */
	void enterRs_route(CiscoXrParser.Rs_routeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#rs_route}.
	 * @param ctx the parse tree
	 */
	void exitRs_route(CiscoXrParser.Rs_routeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#rs_vrf}.
	 * @param ctx the parse tree
	 */
	void enterRs_vrf(CiscoXrParser.Rs_vrfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#rs_vrf}.
	 * @param ctx the parse tree
	 */
	void exitRs_vrf(CiscoXrParser.Rs_vrfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CiscoXrParser#s_router_static}.
	 * @param ctx the parse tree
	 */
	void enterS_router_static(CiscoXrParser.S_router_staticContext ctx);
	/**
	 * Exit a parse tree produced by {@link CiscoXrParser#s_router_static}.
	 * @param ctx the parse tree
	 */
	void exitS_router_static(CiscoXrParser.S_router_staticContext ctx);
}