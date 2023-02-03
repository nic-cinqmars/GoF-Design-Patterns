package abstractfactory.vehicle.bombardier.plane;

import abstractfactory.vehicle.Plane;

public class Global8000 extends Plane
{
    public Global8000()
    {
        super(17, 7900, 0.90);
    }

    @Override
    public void displayAd()
    {
        System.out.println("The Global 8000 private jet is the flagship for a new era where the fastest speed, " +
                "the longest range and the smoothest ride converge in a single business aircraft with proven reliability and the healthiest, " +
                "best-connected cabin in the industry.");
    }
}
