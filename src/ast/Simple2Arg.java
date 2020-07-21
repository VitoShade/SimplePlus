package ast;

public class Simple2Arg extends Simple2ElementBase{

    String type;
    String id;
    String ref;

    public Simple2Arg(String type, String id, String ref) {
        this.type = type;
        this.id = id;
        this.ref = ref;
    }
}
