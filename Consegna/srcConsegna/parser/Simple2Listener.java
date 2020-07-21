// Generated from /Users/marco/IdeaProjects/Assegnamento1/src/parser/Simple2.g4 by ANTLR 4.8
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Simple2Parser}.
 */
public interface Simple2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Simple2Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Simple2Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Simple2Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Simple2Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Simple2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Simple2Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Simple2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Simple2Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Simple2Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(Simple2Parser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Simple2Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(Simple2Parser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Simple2Parser#decFun}.
	 * @param ctx the parse tree
	 */
	void enterDecFun(Simple2Parser.DecFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link Simple2Parser#decFun}.
	 * @param ctx the parse tree
	 */
	void exitDecFun(Simple2Parser.DecFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link Simple2Parser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(Simple2Parser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Simple2Parser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(Simple2Parser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Simple2Parser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(Simple2Parser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Simple2Parser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(Simple2Parser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Simple2Parser#ret}.
	 * @param ctx the parse tree
	 */
	void enterRet(Simple2Parser.RetContext ctx);
	/**
	 * Exit a parse tree produced by {@link Simple2Parser#ret}.
	 * @param ctx the parse tree
	 */
	void exitRet(Simple2Parser.RetContext ctx);
	/**
	 * Enter a parse tree produced by {@link Simple2Parser#decVar}.
	 * @param ctx the parse tree
	 */
	void enterDecVar(Simple2Parser.DecVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link Simple2Parser#decVar}.
	 * @param ctx the parse tree
	 */
	void exitDecVar(Simple2Parser.DecVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link Simple2Parser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(Simple2Parser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Simple2Parser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(Simple2Parser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link Simple2Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Simple2Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Simple2Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Simple2Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Simple2Parser#deletion}.
	 * @param ctx the parse tree
	 */
	void enterDeletion(Simple2Parser.DeletionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Simple2Parser#deletion}.
	 * @param ctx the parse tree
	 */
	void exitDeletion(Simple2Parser.DeletionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Simple2Parser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(Simple2Parser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link Simple2Parser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(Simple2Parser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link Simple2Parser#ite}.
	 * @param ctx the parse tree
	 */
	void enterIte(Simple2Parser.IteContext ctx);
	/**
	 * Exit a parse tree produced by {@link Simple2Parser#ite}.
	 * @param ctx the parse tree
	 */
	void exitIte(Simple2Parser.IteContext ctx);
	/**
	 * Enter a parse tree produced by {@link Simple2Parser#el}.
	 * @param ctx the parse tree
	 */
	void enterEl(Simple2Parser.ElContext ctx);
	/**
	 * Exit a parse tree produced by {@link Simple2Parser#el}.
	 * @param ctx the parse tree
	 */
	void exitEl(Simple2Parser.ElContext ctx);
	/**
	 * Enter a parse tree produced by {@link Simple2Parser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(Simple2Parser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Simple2Parser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(Simple2Parser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Simple2Parser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(Simple2Parser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link Simple2Parser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(Simple2Parser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link Simple2Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(Simple2Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Simple2Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(Simple2Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Simple2Parser#ref}.
	 * @param ctx the parse tree
	 */
	void enterRef(Simple2Parser.RefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Simple2Parser#ref}.
	 * @param ctx the parse tree
	 */
	void exitRef(Simple2Parser.RefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code baseExp}
	 * labeled alternative in {@link Simple2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBaseExp(Simple2Parser.BaseExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code baseExp}
	 * labeled alternative in {@link Simple2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBaseExp(Simple2Parser.BaseExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varExp}
	 * labeled alternative in {@link Simple2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterVarExp(Simple2Parser.VarExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varExp}
	 * labeled alternative in {@link Simple2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitVarExp(Simple2Parser.VarExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binExp}
	 * labeled alternative in {@link Simple2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBinExp(Simple2Parser.BinExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binExp}
	 * labeled alternative in {@link Simple2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBinExp(Simple2Parser.BinExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valExp}
	 * labeled alternative in {@link Simple2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterValExp(Simple2Parser.ValExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valExp}
	 * labeled alternative in {@link Simple2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitValExp(Simple2Parser.ValExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negExp}
	 * labeled alternative in {@link Simple2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNegExp(Simple2Parser.NegExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negExp}
	 * labeled alternative in {@link Simple2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNegExp(Simple2Parser.NegExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callExp}
	 * labeled alternative in {@link Simple2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterCallExp(Simple2Parser.CallExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callExp}
	 * labeled alternative in {@link Simple2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitCallExp(Simple2Parser.CallExpContext ctx);
}