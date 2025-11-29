// Generated from org/batfish/grammar/palo_alto_nested/PaloAltoNestedParser.g4 by ANTLR 4.7.2
package org.batfish.grammar.palo_alto_nested;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PaloAltoNestedParser}.
 */
public interface PaloAltoNestedParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PaloAltoNestedParser#braced_clause}.
	 * @param ctx the parse tree
	 */
	void enterBraced_clause(PaloAltoNestedParser.Braced_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoNestedParser#braced_clause}.
	 * @param ctx the parse tree
	 */
	void exitBraced_clause(PaloAltoNestedParser.Braced_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoNestedParser#bracketed_clause}.
	 * @param ctx the parse tree
	 */
	void enterBracketed_clause(PaloAltoNestedParser.Bracketed_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoNestedParser#bracketed_clause}.
	 * @param ctx the parse tree
	 */
	void exitBracketed_clause(PaloAltoNestedParser.Bracketed_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoNestedParser#palo_alto_nested_configuration}.
	 * @param ctx the parse tree
	 */
	void enterPalo_alto_nested_configuration(PaloAltoNestedParser.Palo_alto_nested_configurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoNestedParser#palo_alto_nested_configuration}.
	 * @param ctx the parse tree
	 */
	void exitPalo_alto_nested_configuration(PaloAltoNestedParser.Palo_alto_nested_configurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoNestedParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PaloAltoNestedParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoNestedParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PaloAltoNestedParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoNestedParser#terminator}.
	 * @param ctx the parse tree
	 */
	void enterTerminator(PaloAltoNestedParser.TerminatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoNestedParser#terminator}.
	 * @param ctx the parse tree
	 */
	void exitTerminator(PaloAltoNestedParser.TerminatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PaloAltoNestedParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(PaloAltoNestedParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PaloAltoNestedParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(PaloAltoNestedParser.WordContext ctx);
}