package abstractfactory.vehicle.bombardier.plane;

import abstractfactory.vehicle.Plane;

public class CRJ1000 extends Plane
{
    public CRJ1000()
    {
        super(104, 1650, 0.835);
    }

    @Override
    public void displayAd()
    {
        System.out.println("The CRJ1000 has a wingspan of 26.17m and incorporates a redesigned wing-tip, " +
                "winglets and an optimised wing leading edge, in order to provide a lower lift-to-drag ratio and allow reduced approach speeds. ");
        System.out.println("The fuselage is of semi-monocoque design. The overall length is 39.15m.");
    }
}
