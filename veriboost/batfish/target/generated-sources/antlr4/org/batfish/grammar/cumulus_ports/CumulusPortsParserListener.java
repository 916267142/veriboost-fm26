// Generated from org/batfish/grammar/cumulus_ports/CumulusPortsParser.g4 by ANTLR 4.7.2
package org.batfish.grammar.cumulus_ports;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CumulusPortsParser}.
 */
public interface CumulusPortsParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CumulusPortsParser#cumulus_ports_configuration}.
	 * @param ctx the parse tree
	 */
	void enterCumulus_ports_configuration(CumulusPortsParser.Cumulus_ports_configurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusPortsParser#cumulus_ports_configuration}.
	 * @param ctx the parse tree
	 */
	void exitCumulus_ports_configuration(CumulusPortsParser.Cumulus_ports_configurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusPortsParser#port_definition}.
	 * @param ctx the parse tree
	 */
	void enterPort_definition(CumulusPortsParser.Port_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusPortsParser#port_definition}.
	 * @param ctx the parse tree
	 */
	void exitPort_definition(CumulusPortsParser.Port_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusPortsParser#breakout}.
	 * @param ctx the parse tree
	 */
	void enterBreakout(CumulusPortsParser.BreakoutContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusPortsParser#breakout}.
	 * @param ctx the parse tree
	 */
	void exitBreakout(CumulusPortsParser.BreakoutContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusPortsParser#disabled}.
	 * @param ctx the parse tree
	 */
	void enterDisabled(CumulusPortsParser.DisabledContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusPortsParser#disabled}.
	 * @param ctx the parse tree
	 */
	void exitDisabled(CumulusPortsParser.DisabledContext ctx);
	/**
	 * Enter a parse tree produced by {@link CumulusPortsParser#speed}.
	 * @param ctx the parse tree
	 */
	void enterSpeed(CumulusPortsParser.SpeedContext ctx);
	/**
	 * Exit a parse tree produced by {@link CumulusPortsParser#speed}.
	 * @param ctx the parse tree
	 */
	void exitSpeed(CumulusPortsParser.SpeedContext ctx);
}