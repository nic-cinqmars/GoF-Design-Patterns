package prototype.spawn.orcoid;

import prototype.spawn.Monster;

public class Orc extends Monster
{
    private int numTeeth;

    public Orc()
    {
        super("ORC");
        numTeeth = 30;
    }

    protected final Orc clone() throws CloneNotSupportedException
    {
        Orc orc = null;
        try
        {
            orc = (Orc)super.clone();
            orc.numTeeth = this.numTeeth;
        }
        catch (CloneNotSupportedException cnse)
        {
            cnse.printStackTrace(System.err);
        }
        return orc;
    }

    @Override
    public String toString()
    {
        return super.toString() + "{ORC{" + numTeeth + "}}";
    }
}
