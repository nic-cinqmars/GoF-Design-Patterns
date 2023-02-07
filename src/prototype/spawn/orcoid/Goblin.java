package prototype.spawn.orcoid;

import prototype.spawn.Monster;

public class Goblin extends Monster
{
    private String tribe;

    public Goblin(String tribe)
    {
        super("GOBLIN");
        this.tribe = tribe;
    }

    protected final Goblin clone() throws CloneNotSupportedException
    {
        Goblin goblin = null;
        try
        {
            goblin = (Goblin)super.clone();
            goblin.tribe = this.tribe;
        }
        catch (CloneNotSupportedException cnse)
        {
            cnse.printStackTrace(System.err);
        }
        return goblin;
    }

    @Override
    public String toString()
    {
        return super.toString() + "{GOBLIN{" + tribe + "}}";
    }
}
