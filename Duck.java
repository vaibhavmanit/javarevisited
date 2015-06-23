package oracle.util.snippetjava01.duck;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;
    public Duck() {
        super();
    }
    
    public abstract void display();
    public void performFly(){
        flyBehaviour.fly();
    }
    public void peformQuack(){
        quackBehaviour.quack();
    }
    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
