package abstractfactory.vehicle;

import abstractfactory.vehicle.bombardier.plane.CRJ1000;
import abstractfactory.vehicle.bombardier.plane.Global8000;
import abstractfactory.vehicle.bombardier.snowmobile.SkiDooExpeditionSport;
import abstractfactory.vehicle.bombardier.snowmobile.SkiDooRenegade;

public class BombardierFactory implements IVehicleFactory
{
    @Override
    public Snowmobile createSnowmobile(String model)
    {
        return switch (model) {
            case "SKIDOO_EXPEDITION_SPORT" -> new SkiDooExpeditionSport();
            case "SKIDOO_RENEGADE" -> new SkiDooRenegade();
            default -> null;
        };
    }

    @Override
    public Plane createPlane(String model)
    {
        return switch (model) {
            case "CRJ1000" -> new CRJ1000();
            case "GLOBAL8000" -> new Global8000();
            default -> null;
        };
    }
}
