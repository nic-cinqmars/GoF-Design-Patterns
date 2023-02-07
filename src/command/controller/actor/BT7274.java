package command.controller.actor;

public class BT7274 implements IActor
{
    @Override
    public void jump()
    {
        System.out.println("BT7274-JUMP");
    }

    @Override
    public void shoot()
    {
        System.out.println("BT7274-SHOOT");
    }

    @Override
    public void dodge()
    {
        System.out.println("BT7274-DODGE");
    }

    @Override
    public void changeWeapon()
    {
        System.out.println("BT7274-CHANGE_WEAPON");
    }
}
