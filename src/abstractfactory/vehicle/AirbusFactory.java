package abstractfactory.vehicle;

import abstractfactory.vehicle.airbus.plane.A220_300;
import abstractfactory.vehicle.airbus.plane.A380;

public class AirbusFactory implements IVehicleFactory
{
    @Override
    public Snowmobile createSnowmobile(String model)
    {
        return null;
    }

    @Override
    public Plane createPlane(String model)
    {
        return switch (model) {
            case "A380" -> new A380();
            case "A220_300" -> new A220_300();
            default -> null;
        };
    }
}
