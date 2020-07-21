package ast;

import util_analysis.Environment;

import java.util.List;

public class Simple2StmtBlock extends Simple2Stmt{

    List<Simple2Stmt> children;

    public Simple2StmtBlock(List<Simple2Stmt> children) {
        this.children = children;
    }

    public void checkSemantic(Environment e){

        e.openScope();

        if (children != null){
            for (Simple2Stmt el: children){
                    el.checkSemantic(e);
            }

        }

        e.closeScope();

    }

}
