package ast;

import parser.Simple2Exception;
import util_analysis.Environment;

public class Simple2StmtDecVar extends Simple2StmtDec {

    private String type;
    private String id;
    Simple2Exp exp;

    public Simple2StmtDecVar(String type, String id, Simple2Exp exp){
        this.type = type;
        this.id = id;
        this.exp = exp;
    }

    @Override
    protected void checkSemantic(Environment e) {
        if (e.containsVariable(id)) {
            throw new Simple2Exception("False");
        }
        e.addVariable(id);
    }
}
