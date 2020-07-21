// Generated from /Users/marco/IdeaProjects/Assegnamento1/src/parser/Simple2.g4 by ANTLR 4.8
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Simple2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Simple2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Simple2Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Simple2Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Simple2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Simple2Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Simple2Parser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(Simple2Parser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Simple2Parser#decFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecFun(Simple2Parser.DecFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link Simple2Parser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(Simple2Parser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Simple2Parser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(Simple2Parser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link Simple2Parser#ret}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRet(Simple2Parser.RetContext ctx);
	/**
	 * Visit a parse tree produced by {@link Simple2Parser#decVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecVar(Simple2Parser.DecVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link Simple2Parser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(Simple2Parser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Simple2Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(Simple2Parser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Simple2Parser#deletion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeletion(Simple2Parser.DeletionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Simple2Parser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(Simple2Parser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link Simple2Parser#ite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIte(Simple2Parser.IteContext ctx);
	/**
	 * Visit a parse tree produced by {@link Simple2Parser#el}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEl(Simple2Parser.ElContext ctx);
	/**
	 * Visit a parse tree produced by {@link Simple2Parser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(Simple2Parser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Simple2Parser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(Simple2Parser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link Simple2Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(Simple2Parser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Simple2Parser#ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef(Simple2Parser.RefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code baseExp}
	 * labeled alternative in {@link Simple2Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseExp(Simple2Parser.BaseExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varExp}
	 * labeled alternative in {@link Simple2Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExp(Simple2Parser.VarExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binExp}
	 * labeled alternative in {@link Simple2Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinExp(Simple2Parser.BinExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valExp}
	 * labeled alternative in {@link Simple2Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValExp(Simple2Parser.ValExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negExp}
	 * labeled alternative in {@link Simple2Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegExp(Simple2Parser.NegExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callExp}
	 * labeled alternative in {@link Simple2Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExp(Simple2Parser.CallExpContext ctx);
}