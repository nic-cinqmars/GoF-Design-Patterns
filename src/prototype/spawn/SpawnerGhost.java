package prototype.spawn;

import prototype.spawn.ghost.Ectoplasm;
import prototype.spawn.ghost.Orb;
import prototype.spawn.ghost.Poltergeist;

public class SpawnerGhost extends Spawner
{
    @Override
    protected void loadMonsters()
    {
        addMonster(Ectoplasm.class, new Ectoplasm(Ectoplasm.Color.WHITE));
        addMonster(Orb.class, new Orb(10.5f));
        addMonster(Poltergeist.class, new Poltergeist(Poltergeist.Strength.STRONG));
    }

    public Ectoplasm spawnEctoplasm()
    {
        return (Ectoplasm)spawnMonster(Ectoplasm.class);
    }

    public Orb spawnOrb()
    {
        return (Orb)spawnMonster(Orb.class);
    }

    public Poltergeist spawnPoltergeist()
    {
        return (Poltergeist)spawnMonster(Poltergeist.class);
    }
}
