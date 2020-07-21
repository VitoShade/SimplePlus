package ast;

import java.util.List;

public class Simple2ExpCall extends Simple2Exp {

    String id;
    List<Simple2Exp> exps;

    public Simple2ExpCall(String id, List<Simple2Exp> exps) {
        this.id = id;
        this.exps = exps;
    }
}
