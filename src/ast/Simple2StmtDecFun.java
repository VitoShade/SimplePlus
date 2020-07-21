package ast;

import parser.Simple2Exception;
import util_analysis.Environment;

import java.util.List;

public class Simple2StmtDecFun extends Simple2StmtDec{

    String type;
    String id;
    List<Simple2Arg> args;
    Simple2StmtBlock block;

    public Simple2StmtDecFun(String type, String id, List<Simple2Arg> args, Simple2StmtBlock block){
        this.type = type;
        this.id = id;
        this.args = args;
        this.block = block;
    }


    @Override
    protected void checkSemantic(Environment e) {

        if (e.contains(id)) {
            throw new Simple2Exception("False");
        }
        else {
            e.add(id);
            this.block.checkSemantic(e);
        }
    }
}

