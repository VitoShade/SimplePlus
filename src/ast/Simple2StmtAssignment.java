package ast;

import util_analysis.Environment;

public class Simple2StmtAssignment extends Simple2Stmt {
    String id;
    Simple2Exp exp;

    public Simple2StmtAssignment(String id, Simple2Exp exp) {
        this.id = id;
        this.exp = exp;
    }

    @Override
    protected void checkSemantic(Environment e) {

    }
}
