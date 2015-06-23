package oracle.util.snippetjava01.duck;

public class MiniDuckSimulator {
    public MiniDuckSimulator() {
        super();
    }
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.peformQuack();
        mallard.performFly();
        
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPower());
        model.performFly();
    }
}
