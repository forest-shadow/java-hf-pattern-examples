package test.PizzaStoreDrive.PizzaStore;

import test.PizzaStoreDrive.Pizza.Pizza;

public abstract class PizzaStore {
  public Pizza orderPizza(String type) {
    Pizza pizza;
    pizza = createPizza(type);

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    
    return pizza;
  }

  abstract public Pizza createPizza(String type);
}