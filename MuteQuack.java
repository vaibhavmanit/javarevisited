package oracle.util.snippetjava01.duck;

public class MuteQuack implements QuackBehaviour {
    public MuteQuack() {
        super();
    }

    public void quack() {
        System.out.println("<<Silence>>");
    }
}
