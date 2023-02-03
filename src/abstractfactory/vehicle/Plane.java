package abstractfactory.vehicle;

public abstract class Plane implements IVehicle
{
    private int maxPassengers;
    private int flightRange;
    private double maxFlightSpeed;

    public Plane(int maxPassengers, int flightRange, double maxFlightSpeed)
    {
        this.maxPassengers = maxPassengers;
        this.flightRange = flightRange;
        this.maxFlightSpeed = maxFlightSpeed;
    }

    @Override
    public void displayCharacteristics()
    {
        System.out.println("- Characteristics -");
        System.out.println("* Max number of passengers : " + maxPassengers);
        System.out.println("* Range of flight : " + flightRange);
        System.out.println("* Max flght speed : " + maxFlightSpeed);
    }
}
