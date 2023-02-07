package command.controller.command;

import command.controller.actor.IActor;

public class DodgeCommand implements ICommand
{
    @Override
    public void execute(IActor actor)
    {
        actor.dodge();
    }

    @Override
    public String toString()
    {
        return "DODGE";
    }
}
