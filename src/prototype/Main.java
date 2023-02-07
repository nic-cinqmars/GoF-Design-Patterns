package prototype;

import prototype.spawn.Monster;
import prototype.spawn.SpawnerGhost;
import prototype.spawn.SpawnerOrcoid;
import prototype.spawn.ghost.Ectoplasm;
import prototype.spawn.ghost.Orb;
import prototype.spawn.ghost.Poltergeist;
import prototype.spawn.orcoid.Goblin;
import prototype.spawn.orcoid.Orc;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        generateTribe();
        generateTribeClone();

        generateGhosts();
        generateGhostsClone();
    }

    private static void generateTribe()
    {
        ArrayList<Monster> tribe = new ArrayList<>();

        for (int i = 0; i < 5; i++)
        {
            tribe.add(new Orc());
        }
        for (int i = 0; i < 3; i++)
        {
            tribe.add(new Goblin("Evil Sunz"));
        }

        for(Monster orcoid : tribe)
        {
            System.out.println(orcoid);
        }
    }

    private static void generateTribeClone()
    {
        SpawnerOrcoid spawner = new SpawnerOrcoid();
        ArrayList<Monster> tribe = new ArrayList<>();

        Orc orc = spawner.spawnOrc();
        System.out.println(orc.getClass());
        System.out.println(orc);

        for (int i = 0; i < 1000; i++)
        {
            tribe.add(spawner.spawnOrc());
        }
        for (int i = 0; i < 5000; i++)
        {
            tribe.add(spawner.spawnGoblin());
        }

        for (Monster orcoid : tribe)
        {
            System.out.println(orcoid);
        }
    }

    private static void generateGhosts()
    {
        ArrayList<Monster> ghosts = new ArrayList<>();

        for (int i = 0; i < 5; i++)
        {
            ghosts.add(new Ectoplasm(Ectoplasm.Color.BLACK));
        }
        for (int i = 0; i < 3; i++)
        {
            ghosts.add(new Orb(5.2f));
        }
        for (int i = 0; i < 2; i++)
        {
            ghosts.add(new Poltergeist(Poltergeist.Strength.WEAK));
        }

        for(Monster ghost : ghosts)
        {
            System.out.println(ghost);
        }
    }

    private static void generateGhostsClone()
    {
        SpawnerGhost spawner = new SpawnerGhost();
        ArrayList<Monster> ghosts = new ArrayList<>();

        Ectoplasm ectoplasm = spawner.spawnEctoplasm();
        System.out.println(ectoplasm.getClass());
        System.out.println(ectoplasm);

        for (int i = 0; i < 1000; i++)
        {
            ghosts.add(spawner.spawnEctoplasm());
        }
        for (int i = 0; i < 5000; i++)
        {
            ghosts.add(spawner.spawnOrb());
        }
        for (int i = 0; i < 3000; i++)
        {
            ghosts.add(spawner.spawnPoltergeist());
        }

        for (Monster ghost : ghosts)
        {
            System.out.println(ghost);
        }
    }
}
