package test.DuckSimulation.Duck;

import test.DuckSimulation.Duck.FlyBehavior.FlyNoWay;
import test.DuckSimulation.Duck.QuackBehavior.Quack;

public class ModelDuck extends Duck {
  public ModelDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Quack();
  }

  public void display() {
    System.out.println("I'm a model duck");
  }
}