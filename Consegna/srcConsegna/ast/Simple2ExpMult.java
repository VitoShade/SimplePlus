package ast;

public class Simple2ExpMult extends Simple2Exp {

    Simple2Exp leftSide, rightSide;

    public Simple2ExpMult(Simple2Exp leftSide, Simple2Exp rightSide) {

        this.leftSide = leftSide;
        this.rightSide = rightSide;

    }
}
