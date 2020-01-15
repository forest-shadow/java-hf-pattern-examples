package test.DuckSimulation.Duck;

import test.DuckSimulation.Duck.QuackBehavior.Quack;
import test.DuckSimulation.Duck.FlyBehavior.FlyWithWings;


public class MallardDuck extends Duck {
  public MallardDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  public void display() {
    System.out.println("I'm a real Mallard duck");
  }
}