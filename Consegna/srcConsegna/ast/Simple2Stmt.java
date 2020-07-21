package ast;

import util_analysis.Environment;

public abstract class Simple2Stmt extends Simple2ElementBase {
    protected abstract void checkSemantic(Environment e);
}
