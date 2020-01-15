package test.DuckSimulation.Duck;

import test.DuckSimulation.Duck.FlyBehavior.FlyBehavior;
import test.DuckSimulation.Duck.QuackBehavior.QuackBehavior;

public abstract class Duck {
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;

  public Duck() {}

  public abstract void display();

  public void setFlyBehavior(FlyBehavior fb) {
    flyBehavior = fb;
  }

  public void setQuackBehavior(QuackBehavior qb) {
    quackBehavior = qb;
  }

  public void performFly() {
    flyBehavior.fly();
  }

  public void performQuack() {
    quackBehavior.quack();
  }

  public void swim() {
    System.out.println("All ducks float, even decoys!");
  }
}