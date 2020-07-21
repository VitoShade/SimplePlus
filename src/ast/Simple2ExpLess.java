package ast;

public class Simple2ExpLess extends Simple2Exp {

    Simple2Exp leftSide, rightSide;

    public Simple2ExpLess(Simple2Exp left, Simple2Exp right) {
        this.leftSide = left;
        this.rightSide = right;
    }
}
