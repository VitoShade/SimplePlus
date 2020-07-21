package ast;

public class Simple2ExpNotEq extends Simple2Exp {

    Simple2Exp leftSide, rightSide;

    public Simple2ExpNotEq(Simple2Exp leftSide, Simple2Exp rightSide) {

        this.leftSide = leftSide;
        this.rightSide = rightSide;

    }
}