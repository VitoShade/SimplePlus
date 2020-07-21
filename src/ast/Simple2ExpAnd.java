package ast;

public class Simple2ExpAnd extends Simple2Exp {

    Simple2Exp leftSide, rightSide;

    public Simple2ExpAnd(Simple2Exp leftSide, Simple2Exp rightSide) {

        this.leftSide = leftSide;
        this.rightSide = rightSide;

    }
}
