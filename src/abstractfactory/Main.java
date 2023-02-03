package abstractfactory;

import abstractfactory.vehicle.AirbusFactory;
import abstractfactory.vehicle.BombardierFactory;
import abstractfactory.vehicle.IVehicle;
import abstractfactory.vehicle.IVehicleFactory;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<IVehicle> myVehicles = new ArrayList<>();
        IVehicleFactory factory;

        factory = new AirbusFactory();
        myVehicles.add(factory.createPlane("A380"));
        myVehicles.add(factory.createPlane("A220_300"));

        factory = new BombardierFactory();
        myVehicles.add(factory.createPlane("CRJ1000"));
        myVehicles.add(factory.createPlane("GLOBAL8000"));
        myVehicles.add(factory.createSnowmobile("SKIDOO_EXPEDITION_SPORT"));
        myVehicles.add(factory.createSnowmobile("SKIDOO_RENEGADE"));

        for (IVehicle vehicle : myVehicles)
        {
            vehicle.displayCharacteristics();
            vehicle.displayAd();
            System.out.println();
        }
    }
}
