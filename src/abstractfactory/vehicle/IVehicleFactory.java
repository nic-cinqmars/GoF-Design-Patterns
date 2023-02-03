package abstractfactory.vehicle;

public interface IVehicleFactory
{
    Snowmobile createSnowmobile(String model);
    Plane createPlane(String model);
}
