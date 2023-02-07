package command.controller.actor;

public class Drone implements IActor
{
    @Override
    public void jump()
    {
        System.out.println("DRONE-JUMP");
    }

    @Override
    public void shoot()
    {
        System.out.println("DRONE-SHOOT");
    }

    @Override
    public void dodge()
    {
        System.out.println("DRONE-DODGE");
    }

    @Override
    public void changeWeapon()
    {
        System.out.println("DRONE-CHANGE_WEAPON");
    }
}
