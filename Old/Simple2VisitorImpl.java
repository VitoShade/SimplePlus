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

        List<Simple2Stmt> inside = new LinkedList<Simple2Stmt>();

        for(Simple2Parser.InsideContext insCtx : ctx.inside()) {
            inside.add ((Simple2Stmt) visit(insCtx));
        }

        return new Simple2StmtDecFun(type, id, args, inside);
    }

    @Override
    public Simple2ElementBase visitInside(Simple2Parser.InsideContext ctx){

        return visit(ctx.getChild(0));
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
        return new Simple2Arg(type, id);

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
    public Simple2ElementBase visitBaseExp(BaseExpContext ctx) {

        return visit(ctx.exp());
    }

    @Override
    public Simple2ElementBase visitNegExp(Simple2Parser.NegExpContext ctx) {

        return new Simple2ExpNeg ((Simple2Exp) visit(ctx.exp()));

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
            default: return null; //this should not happen
        }

    }

    // from here alone

    @Override
    public Simple2ElementBase visitValExp(Simple2Parser.ValExpContext ctx) {

        return new Simple2ExpVal(Integer.parseInt(ctx.NUMBER().getText()));

    }

    @Override
    public Simple2ElementBase visitVarExp(Simple2Parser.VarExpContext ctx) {

        return new Simple2ExpVar(ctx.ID().getText());

    }



}
