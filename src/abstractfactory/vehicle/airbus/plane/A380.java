package abstractfactory.vehicle.airbus.plane;

import abstractfactory.vehicle.Plane;

public class A380 extends Plane
{
    public A380()
    {
        super(853, 15200, 0.93);
    }

    @Override
    public void displayAd()
    {
        System.out.println("The A380 has set a new standard for the global aviation industry.");
        System.out.println("Not only did it usher in a new era for passenger comfort, " +
                "the A380 also raised the bar for environmental standards with its low fuel consumption per passenger and low noise levels – " +
                "as well as reduced CO2 and NOx emissions, which has been passed on to future aircraft generations. ");
    }
}
