package command.controller.command;

import command.controller.actor.IActor;

public class JumpCommand implements ICommand
{
    @Override
    public void execute(IActor actor)
    {
        actor.jump();
    }

    @Override
    public String toString()
    {
        return "JUMP";
    }
}
