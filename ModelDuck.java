package oracle.util.snippetjava01.duck;

public class ModelDuck extends Duck {
    public ModelDuck() {
        super();
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
