public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){}

    void PerformFly(){
        flyBehavior.fly();
    }

    void PerformQuick(){
        quackBehavior.quack();
    }

    public abstract void Display();
}
