package command.controller;

import command.controller.actor.IActor;
import command.controller.command.*;

import java.util.Arrays;

public class Controller
{
    public enum Button
    {
        X,
        Y,
        A,
        B;
    }

    private ICommand[] commands;
    private IActor actor;

    public Controller(IActor actor)
    {
        this.actor = actor;
        commands = new ICommand[Button.values().length];
        resetCommands();
    }

    public void resetCommands()
    {
        commands[Button.X.ordinal()] = new JumpCommand();
        commands[Button.Y.ordinal()] = new ShootCommand();
        commands[Button.A.ordinal()] = new DodgeCommand();
        commands[Button.B.ordinal()] = new ChangeWeaponCommand();
    }

    public void setActor(IActor actor)
    {
        this.actor = actor;
    }

    public void setCommand(Button button, ICommand command)
    {
        commands[button.ordinal()] = command;
    }

    public void setCommand(Button button)
    {
        commands[button.ordinal()] = null;
    }

    public void play(Button button)
    {
        if (commands[button.ordinal()] != null)
            commands[button.ordinal()].execute(actor);
    }

    @Override
    public String toString() {
        return "Controller{" +
                "\n\t[X] {" + commands[Button.X.ordinal()] + "}" +
                "\n\t[Y] {" + commands[Button.Y.ordinal()] + "}" +
                "\n\t[A] {" + commands[Button.A.ordinal()] + "}" +
                "\n\t[B] {" + commands[Button.B.ordinal()] + "}" +
                "\n}";
    }
}
