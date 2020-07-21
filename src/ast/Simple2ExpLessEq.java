package ast;

public class Simple2ExpLessEq extends Simple2Exp {

    Simple2Exp leftSide, rightSide;

    public Simple2ExpLessEq(Simple2Exp leftSide, Simple2Exp rightSide) {

        this.leftSide = leftSide;
        this.rightSide = rightSide;

    }
}
