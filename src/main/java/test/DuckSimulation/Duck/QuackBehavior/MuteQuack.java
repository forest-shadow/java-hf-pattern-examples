package test.DuckSimulation.Duck.QuackBehavior;

public class MuteQuack implements QuackBehavior {
  public void quack() {
    System.out.println("<< Silence >>");
  }
}