package prototype.spawn;

import prototype.spawn.orcoid.Goblin;
import prototype.spawn.orcoid.Orc;

public class SpawnerOrcoid extends Spawner
{
    @Override
    protected void loadMonsters()
    {
        addMonster(Goblin.class, new Goblin("Goff"));
        addMonster(Orc.class, new Orc());
    }

    public Orc spawnOrc()
    {
        return (Orc)spawnMonster(Orc.class);
    }

    public Goblin spawnGoblin()
    {
        return (Goblin)spawnMonster(Goblin.class);
    }
}
