package prototype.spawn.ghost;

import prototype.spawn.Monster;

public class Poltergeist extends Monster
{
    public enum Strength
    {
        WEAK,
        NORMAL,
        STRONG
    }

    private Strength strength;

    public Poltergeist(Strength strength)
    {
        super("POLTERGEIST");
        this.strength = strength;
    }

    protected final Poltergeist clone() throws CloneNotSupportedException
    {
        Poltergeist poltergeist = null;
        try
        {
            poltergeist = (Poltergeist) super.clone();
            poltergeist.strength = this.strength;
        }
        catch (CloneNotSupportedException cnse)
        {
            cnse.printStackTrace(System.err);
        }
        return poltergeist;
    }

    @Override
    public String toString()
    {
        return super.toString() + "{POLTERGEIST{" + strength + "}}";
    }
}
