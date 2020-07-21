package ast;

public class Simple2ExpSum extends Simple2Exp {

    Simple2Exp leftSide, rightSide;

    public Simple2ExpSum(Simple2Exp leftSide, Simple2Exp rightSide) {

        this.leftSide = leftSide;
        this.rightSide = rightSide;

    }
}
