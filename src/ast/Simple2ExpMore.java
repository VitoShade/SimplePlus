package ast;

public class Simple2ExpMore extends Simple2Exp {

    Simple2Exp leftSide, rightSide;

    public Simple2ExpMore(Simple2Exp leftSide, Simple2Exp rightSide) {

        this.leftSide = leftSide;
        this.rightSide = rightSide;

    }
}
