package abstractfactory.vehicle.bombardier.snowmobile;

import abstractfactory.vehicle.Snowmobile;

public class SkiDooRenegade extends Snowmobile
{
    public SkiDooRenegade()
    {
        super(137, 16704);
    }

    @Override
    public void displayAd()
    {
        System.out.println("Built for the winter adventurer with longer tracks for more grip and added comfort.");
        System.out.println("Paired with several Rotax engine options, there’s a Renegade for every trail riders.");
    }
}
