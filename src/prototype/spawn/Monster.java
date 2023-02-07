package prototype.spawn;

public abstract class Monster implements Cloneable
{
    private static int _id = 0;
    private String description;
    private char infoFromDB;
    private int id;
    private final int LOAD_TIME = 2000;

    public Monster(String description)
    {
        this.description = description;
        id = generateID();
        try
        {
            System.out.println("LOADING... " + this.getClass() + "(" + id + ")");
            // Long load time from database
            Thread.sleep(LOAD_TIME);
            infoFromDB =  (char)((int)(Math.random() * 26) + 'A');
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    public String getDescription()
    {
        return description;
    }

    protected Monster clone() throws CloneNotSupportedException
    {
        Monster monster = null;
        try
        {
            monster = (Monster)super.clone();
            monster.description = this.description;
            monster.infoFromDB = this.infoFromDB;
            monster.id = generateID();
        }
        catch (CloneNotSupportedException cnse)
        {
            cnse.printStackTrace(System.err);
        }
        return monster;
    }

    private static int generateID()
    {
        return _id++;
    }

    final Monster spawn()
    {
        try
        {
            return this.clone();
        }
        catch (CloneNotSupportedException cnse)
        {
            cnse.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "{MONSTER{" + description + ',' + infoFromDB + ',' + id + "}}";
    }
}
