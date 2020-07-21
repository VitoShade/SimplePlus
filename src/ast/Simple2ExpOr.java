package ast;

public class Simple2ExpOr extends Simple2Exp {

    Simple2Exp leftSide, rightSide;

    public Simple2ExpOr(Simple2Exp leftSide, Simple2Exp rightSide) {

        this.leftSide = leftSide;
        this.rightSide = rightSide;

    }
}