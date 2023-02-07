package prototype.spawn.ghost;

import prototype.spawn.Monster;

public class Ectoplasm extends Monster
{
    public enum Color
    {
        WHITE,
        GRAY,
        BLACK
    }

    private Color color;

    public Ectoplasm(Color color)
    {
        super("ECTOPLASM");
        this.color = color;
    }

    protected final Ectoplasm clone() throws CloneNotSupportedException
    {
        Ectoplasm ectoplasm = null;
        try
        {
            ectoplasm = (Ectoplasm) super.clone();
            ectoplasm.color = this.color;
        }
        catch (CloneNotSupportedException cnse)
        {
            cnse.printStackTrace(System.err);
        }
        return ectoplasm;
    }

    @Override
    public String toString()
    {
        return super.toString() + "{ECTOPLASM{" + color + "}}";
    }
}
