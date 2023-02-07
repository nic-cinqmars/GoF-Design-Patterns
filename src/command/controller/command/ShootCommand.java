package command.controller.command;

import command.controller.actor.IActor;

public class ShootCommand implements ICommand
{
    @Override
    public void execute(IActor actor)
    {
        actor.shoot();
    }

    @Override
    public String toString()
    {
        return "SHOOT";
    }
}
