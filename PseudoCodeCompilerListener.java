// Generated from PseudoCodeCompiler.g4 by ANTLR 4.10.1
 import java.util.*;import java.util.ArrayList; import java.util.Scanner;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PseudoCodeCompilerParser}.
 */
public interface PseudoCodeCompilerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PseudoCodeCompilerParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(PseudoCodeCompilerParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeCompilerParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(PseudoCodeCompilerParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeCompilerParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(PseudoCodeCompilerParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeCompilerParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(PseudoCodeCompilerParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeCompilerParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(PseudoCodeCompilerParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeCompilerParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(PseudoCodeCompilerParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeCompilerParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(PseudoCodeCompilerParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeCompilerParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(PseudoCodeCompilerParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeCompilerParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(PseudoCodeCompilerParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeCompilerParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(PseudoCodeCompilerParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeCompilerParser#atribution}.
	 * @param ctx the parse tree
	 */
	void enterAtribution(PseudoCodeCompilerParser.AtributionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeCompilerParser#atribution}.
	 * @param ctx the parse tree
	 */
	void exitAtribution(PseudoCodeCompilerParser.AtributionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeCompilerParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(PseudoCodeCompilerParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeCompilerParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(PseudoCodeCompilerParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeCompilerParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(PseudoCodeCompilerParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeCompilerParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(PseudoCodeCompilerParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeCompilerParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(PseudoCodeCompilerParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeCompilerParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(PseudoCodeCompilerParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeCompilerParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(PseudoCodeCompilerParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeCompilerParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(PseudoCodeCompilerParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeCompilerParser#basicOp}.
	 * @param ctx the parse tree
	 */
	void enterBasicOp(PseudoCodeCompilerParser.BasicOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeCompilerParser#basicOp}.
	 * @param ctx the parse tree
	 */
	void exitBasicOp(PseudoCodeCompilerParser.BasicOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeCompilerParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(PseudoCodeCompilerParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeCompilerParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(PseudoCodeCompilerParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeCompilerParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(PseudoCodeCompilerParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeCompilerParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(PseudoCodeCompilerParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeCompilerParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(PseudoCodeCompilerParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeCompilerParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(PseudoCodeCompilerParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeCompilerParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(PseudoCodeCompilerParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeCompilerParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(PseudoCodeCompilerParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeCompilerParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(PseudoCodeCompilerParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeCompilerParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(PseudoCodeCompilerParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeCompilerParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(PseudoCodeCompilerParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeCompilerParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(PseudoCodeCompilerParser.ElseContext ctx);
}