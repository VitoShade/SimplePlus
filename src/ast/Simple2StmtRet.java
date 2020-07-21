package ast;

import util_analysis.Environment;

public class Simple2StmtRet extends Simple2Stmt {

    Simple2Exp exp;

    public Simple2StmtRet(Simple2Exp exp) {
        this.exp = exp;
    }

    @Override
    protected void checkSemantic(Environment e) {

    }
}
