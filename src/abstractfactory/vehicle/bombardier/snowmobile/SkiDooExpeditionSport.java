package abstractfactory.vehicle.bombardier.snowmobile;

import abstractfactory.vehicle.Snowmobile;

public class SkiDooExpeditionSport extends Snowmobile
{
    public SkiDooExpeditionSport()
    {
        super(154, 10654);
    }

    @Override
    public void displayAd()
    {
        System.out.println("On- or Off-trail, Ski-Doo Expedition models pack incredible versatility and capability into one sled. ");
        System.out.println("Work at the cottage one hour, start a new adventure the next.");
    }
}
