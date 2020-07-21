package ast;

public class Simple2ExpDiv extends Simple2Exp{

    Simple2Exp leftSide, rightSide;

    public Simple2ExpDiv(Simple2Exp leftSide, Simple2Exp rightSide) {

        this.leftSide = leftSide;
        this.rightSide = rightSide;

    }
}
