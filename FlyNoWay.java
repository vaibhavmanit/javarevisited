package oracle.util.snippetjava01.duck;

public class FlyNoWay implements FlyBehaviour {
    public FlyNoWay() {
        super();
    }

    public void fly() {
        System.out.println("I can't fly");
    }
}
