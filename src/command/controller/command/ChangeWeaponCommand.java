package command.controller.command;

import command.controller.actor.IActor;

public class ChangeWeaponCommand implements ICommand
{
    @Override
    public void execute(IActor actor)
    {
        actor.changeWeapon();
    }

    @Override
    public String toString()
    {
        return "CHANGE_WEAPON";
    }
}
