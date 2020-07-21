package ast;

import parser.Simple2BaseVisitor;
import parser.Simple2Parser;
import parser.Simple2Parser.BaseExpContext;
import parser.Simple2Parser.StatementContext;
import parser.Simple2Parser.AssignmentContext;
import parser.Simple2Parser.PrintContext;
import parser.Simple2Parser.DeletionContext;

import java.util.LinkedList;
import java.util.List;


public class Simple2VisitorImpl  extends Simple2BaseVisitor<Simple2ElementBase> {

    @Override
    public Simple2ElementBase visitBlock(Simple2Parser.BlockContext ctx){

        List<Simple2Stmt> children = new LinkedList<Simple2Stmt>();

        for(StatementContext stmtCtx : ctx.statement()) {
            children.add((Simple2Stmt) visitStatement(stmtCtx));
        }

        return new Simple2StmtBlock(children);
    }

    @Override
    public Simple2ElementBase visitStatement(StatementContext ctx) {
        return visit(ctx.getChild(0));
    }



    @Override
    public Simple2ElementBase visitDeclaration(Simple2Parser.DeclarationContext ctx){
        return visit(ctx.getChild(0));
    }

    @Override
    public Simple2ElementBase visitDecFun(Simple2Parser.DecFunContext ctx) {

        String type = ctx.type().getText();
        String id = ctx.ID().getText();
        List<Simple2Arg> args = new LinkedList<Simple2Arg>();

        for (Simple2Parser.ArgContext argCtx : ctx.args().arg()) {
            args.add ((Simple2Arg) visitArg(argCtx));
        }

        Simple2StmtBlock block = (Simple2StmtBlock) visitBlock(ctx.block());

        return new Simple2StmtDecFun(type, id, args, block);
    }



    public Simple2ElementBase visitRet(Simple2Parser.RetContext ctx) {

        Simple2Exp exp = null;
        if (ctx.exp() != null){
            exp = (Simple2Exp) visit(ctx.exp());
        }
        return new Simple2StmtRet(exp);
    }

    @Override
    public Simple2ElementBase visitArg(Simple2Parser.ArgContext ctx) {

        String id = ctx.ID().getText();
        String type = ctx.type().getText();
        String ref = null;

        if(ctx.ref() != null){
            ref = ctx.ref().getText();
        }

        return new Simple2Arg(type, id, ref);

    }


    @Override
    public Simple2ElementBase visitDecVar(Simple2Parser.DecVarContext ctx) {

        Simple2Exp exp = null;

        if(ctx.init().exp() != null) {
            exp = (Simple2Exp) visit(ctx.init().exp());
        }

        String id = ctx.ID().getText();
        String type = ctx.type().getText();
        return new Simple2StmtDecVar(type, id, exp);
    }

    @Override
    public Simple2ElementBase visitAssignment(AssignmentContext ctx) {

        Simple2Exp exp = (Simple2Exp) visit(ctx.exp());
        String id = ctx.ID().getText();

        return new Simple2StmtAssignment(id, exp);

    }

    @Override
    public Simple2ElementBase visitDeletion(DeletionContext ctx){

        return new Simple2StmtDelete(ctx.ID().getText());
    }

    @Override
    public Simple2ElementBase visitPrint(PrintContext ctx) {

        Simple2Exp exp = (Simple2Exp) visit(ctx.exp());

        return new Simple2StmtPrint(exp);
    }

    @Override
    public Simple2ElementBase visitIte(Simple2Parser.IteContext ctx) {
        Simple2Exp exp = ((Simple2Exp) visit(ctx.condition().exp()));
        Simple2StmtBlock block = ((Simple2StmtBlock) visitBlock(ctx.block()));
        Simple2Stmt el = null;
        if(ctx.el() != null){
            el = (Simple2Stmt) visit(ctx.el().getChild(0));
        }

        return new Simple2StmtIte(exp, block, el);

    }

    @Override
    public Simple2ElementBase visitCall(Simple2Parser.CallContext ctx){

        String id = ctx.ID().getText();
        List<Simple2Exp> exps = new LinkedList<Simple2Exp>();
        for(Simple2Parser.ExpContext expCtx : ctx.exp()) {
            exps.add((Simple2Exp) visit(expCtx));
        }

        return new Simple2StmtCall(id, exps);
    }

    @Override
    public Simple2ElementBase visitBaseExp(BaseExpContext ctx) {

        return visit(ctx.exp());
    }

    @Override
    public Simple2ElementBase visitNegExp(Simple2Parser.NegExpContext ctx) {

        return new Simple2ExpNeg ((Simple2Exp) visit(ctx.exp()));

    }

    @Override
    public Simple2ElementBase visitNotExp(Simple2Parser.NotExpContext ctx) {

        return new Simple2ExpNot ((Simple2Exp) visit(ctx.exp()));

    }

    @Override
    public Simple2ElementBase visitBinExp(Simple2Parser.BinExpContext ctx) {

        Simple2Exp left = (Simple2Exp) visit(ctx.left);

        Simple2Exp right = (Simple2Exp) visit(ctx.right);

        switch (ctx.op.getText()) {
            case "+": return new Simple2ExpSum(left, right);
            case "-": return new Simple2ExpDiff(left, right);
            case "*": return new Simple2ExpMult(left, right);
            case "/": return new Simple2ExpDiv(left, right);
            case "<": return new Simple2ExpLess(left,right);
            case "<=": return new Simple2ExpLessEq(left,right);
            case ">": return new Simple2ExpMore(left,right);
            case ">=": return new Simple2ExpMoreEq(left,right);
            case "==": return new Simple2ExpEq(left,right);
            case "!=": return new Simple2ExpNotEq(left, right);
            case "&&": return new Simple2ExpAnd(left, right);
            case "||": return new Simple2ExpOr(left, right);
            default: return null; //this should not happen
        }

    }

    // from here alone

    @Override
    public Simple2ElementBase visitCallExp(Simple2Parser.CallExpContext ctx){
        String id = ctx.call().ID().getText();
        List<Simple2Exp> exps = new LinkedList<Simple2Exp>();
        for(Simple2Parser.ExpContext expCtx : ctx.call().exp()) {
            exps.add((Simple2Exp) visit(expCtx));
        }

        return new Simple2ExpCall(id, exps);
    }


    @Override
    public Simple2ElementBase visitValExp(Simple2Parser.ValExpContext ctx) {

        return new Simple2ExpVal(Integer.parseInt(ctx.NUMBER().getText()));

    }

    @Override
    public Simple2ElementBase visitVarExp(Simple2Parser.VarExpContext ctx) {

        return new Simple2ExpVar(ctx.ID().getText());

    }

    @Override
    public Simple2ElementBase visitBoolExp(Simple2Parser.BoolExpContext ctx) {

        return new Simple2ExpBool(Boolean.parseBoolean(ctx.getText()));

    }



}
