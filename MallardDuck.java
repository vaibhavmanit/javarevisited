package oracle.util.snippetjava01.duck;

public class MallardDuck extends Duck {
    public MallardDuck() {
        super();
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    public void display() {
        System.out.println("Mallard Duck");
    }
}
