public class RedHeadDuck extends Duck{
    public RedHeadDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    @Override
    public void Display() {
        System.out.println("RED HEAD DUCK");
    }
}
