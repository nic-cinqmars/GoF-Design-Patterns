package abstractfactory.vehicle;

public abstract class Snowmobile implements IVehicle
{
    private int trackLength;
    private int MSRP;

    public Snowmobile(int trackLength, int MSRP)
    {
        this.trackLength = trackLength;
        this.MSRP = MSRP;
    }

    @Override
    public void displayCharacteristics()
    {
        System.out.println("- Characteristics -");
        System.out.println("* Track length : " + trackLength);
        System.out.println("* Manufacturer's suggested retail price : " + MSRP);
    }
}
