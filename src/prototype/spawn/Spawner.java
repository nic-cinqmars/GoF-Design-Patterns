package prototype.spawn;

import java.util.Hashtable;

public abstract class Spawner
{
    private Hashtable<Class, Monster> monsters;

    Spawner()
    {
        monsters = new Hashtable<>();
        loadMonsters();
    }

    protected final void addMonster(Class type, Monster monster)
    {
        monsters.put(type, monster);
    }

    protected final Monster spawnMonster(Class type)
    {
        return monsters.get(type).spawn();
    }

    protected abstract void loadMonsters();
}
