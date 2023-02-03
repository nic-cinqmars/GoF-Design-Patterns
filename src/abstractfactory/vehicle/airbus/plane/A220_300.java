package abstractfactory.vehicle.airbus.plane;

import abstractfactory.vehicle.Plane;

public class A220_300 extends Plane
{
    public A220_300()
    {
        super(160, 6112, 0.82);
    }

    @Override
    public void displayAd()
    {
        System.out.println("Welcome to the Airbus A220-300!");
        System.out.println("\t- A reduced environmental footprint");
        System.out.println("\t- WiFi equipped cabins");
        System.out.println("\t- A new standard of on board comfort");
    }
}
