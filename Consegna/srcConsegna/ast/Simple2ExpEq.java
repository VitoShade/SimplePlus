package ast;

public class Simple2ExpEq extends Simple2Exp {

    Simple2Exp leftSide, rightSide;

    public Simple2ExpEq(Simple2Exp leftSide, Simple2Exp rightSide) {

        this.leftSide = leftSide;
        this.rightSide = rightSide;

    }
}