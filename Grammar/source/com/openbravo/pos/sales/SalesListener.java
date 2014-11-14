// Generated from Sales.g4 by ANTLR 4.4
package com.openbravo.pos.sales;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SalesParser}.
 */
public interface SalesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SalesParser#amount}.
	 * @param ctx the parse tree
	 */
	void enterAmount(@NotNull SalesParser.AmountContext ctx);
	/**
	 * Exit a parse tree produced by {@link SalesParser#amount}.
	 * @param ctx the parse tree
	 */
	void exitAmount(@NotNull SalesParser.AmountContext ctx);
	/**
	 * Enter a parse tree produced by {@link SalesParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(@NotNull SalesParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link SalesParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(@NotNull SalesParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link SalesParser#price}.
	 * @param ctx the parse tree
	 */
	void enterPrice(@NotNull SalesParser.PriceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SalesParser#price}.
	 * @param ctx the parse tree
	 */
	void exitPrice(@NotNull SalesParser.PriceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SalesParser#lines}.
	 * @param ctx the parse tree
	 */
	void enterLines(@NotNull SalesParser.LinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SalesParser#lines}.
	 * @param ctx the parse tree
	 */
	void exitLines(@NotNull SalesParser.LinesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SalesParser#article}.
	 * @param ctx the parse tree
	 */
	void enterArticle(@NotNull SalesParser.ArticleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SalesParser#article}.
	 * @param ctx the parse tree
	 */
	void exitArticle(@NotNull SalesParser.ArticleContext ctx);
}