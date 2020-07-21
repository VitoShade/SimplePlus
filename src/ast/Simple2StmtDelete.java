package ast;

import util_analysis.Environment;

public class Simple2StmtDelete extends Simple2Stmt{

    private String id;

    public Simple2StmtDelete(String id) {
        this.id = id;
    }

    @Override
    protected void checkSemantic(Environment e) {

    }
}
