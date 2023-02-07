package prototype.spawn.ghost;

import prototype.spawn.Monster;

public class Orb extends Monster
{
    private double speed;

    public Orb(double speed)
    {
        super("ORB");
        this.speed = speed;
    }

    protected final Orb clone() throws CloneNotSupportedException
    {
        Orb orb = null;
        try
        {
            orb = (Orb) super.clone();
            orb.speed = this.speed;
        }
        catch (CloneNotSupportedException cnse)
        {
            cnse.printStackTrace(System.err);
        }
        return orb;
    }

    @Override
    public String toString()
    {
        return super.toString() + "{ORB{" + speed  + " m/s}}";
    }
}
