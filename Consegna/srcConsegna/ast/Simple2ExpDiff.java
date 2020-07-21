package ast;

public class Simple2ExpDiff extends Simple2Exp {

    Simple2Exp leftSide, rightSide;

    public Simple2ExpDiff(Simple2Exp leftSide, Simple2Exp rightSide) {

        this.leftSide = leftSide;
        this.rightSide = rightSide;

    }
}
