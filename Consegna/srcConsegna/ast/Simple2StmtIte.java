package ast;

import util_analysis.Environment;

public class Simple2StmtIte extends Simple2Stmt{

    Simple2Exp condition;
    Simple2StmtBlock blockIf;
    Simple2Stmt blockElse;

    public Simple2StmtIte(Simple2Exp exp, Simple2StmtBlock block, Simple2Stmt el) {
       this.condition = exp;
       this.blockIf = block;
       this.blockElse = el;
    }

    @Override
    protected void checkSemantic(Environment e) {

        this.blockIf.checkSemantic(e);
        if (this.blockElse != null) {
            this.blockElse.checkSemantic(e);
        }
    }
}
