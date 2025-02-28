package behavioural.strategypattern.strategy;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("queak queak...");
    }
}
