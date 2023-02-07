package command.controller.command;

import command.controller.actor.IActor;

public interface ICommand
{
    void execute(IActor actor);
}
