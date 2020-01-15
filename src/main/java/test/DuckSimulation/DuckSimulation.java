package test.DuckSimulation;

import test.DuckSimulation.Duck.*;
import test.DuckSimulation.Duck.FlyBehavior.*;

public class DuckSimulation 
{
    public static void main( String[] args )
    {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}