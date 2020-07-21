package ast;

import util_analysis.Environment;

import java.util.List;

public class Simple2StmtCall extends Simple2Stmt {

    String id;
    List<Simple2Exp> exps;

    public Simple2StmtCall(String id, List<Simple2Exp> exps){
        this.id = id;
        this.exps = exps;
    }


    @Override
    protected void checkSemantic(Environment e) {

    }
}
