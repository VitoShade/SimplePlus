package ast;

import util_analysis.Environment;

public class Simple2StmtPrint extends Simple2Stmt {

    private Simple2Exp exp;

    public Simple2StmtPrint(Simple2Exp exp) {
        this.exp = exp;
    }

    @Override
    protected void checkSemantic(Environment e) {

    }
}
