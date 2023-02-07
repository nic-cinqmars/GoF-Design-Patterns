package command;

import command.controller.Controller;
import command.controller.actor.BT7274;
import command.controller.actor.Drone;
import command.controller.command.DodgeCommand;
import command.controller.command.JumpCommand;
import command.controller.command.ShootCommand;

public class Main
{
    public static void main(String[] args)
    {
        Drone drone = new Drone();
        BT7274 bt = new BT7274();
        Controller controller = new Controller(bt);

        System.out.println("GAME MODE : NORMAL");

        System.out.println(controller);

        controller.play(Controller.Button.X);
        controller.play(Controller.Button.Y);
        controller.play(Controller.Button.A);
        controller.play(Controller.Button.B);

        System.out.println("\nGAME MODE : ADVENTURE");

        controller.setCommand(Controller.Button.Y);
        controller.setCommand(Controller.Button.B, new JumpCommand());

        System.out.println(controller);

        controller.play(Controller.Button.X);
        controller.play(Controller.Button.Y);
        controller.play(Controller.Button.A);
        controller.play(Controller.Button.B);

        System.out.println("\nGAME MODE: EXPLORATION");

        controller.setActor(drone);
        controller.resetCommands();
        controller.setCommand(Controller.Button.X, new DodgeCommand());
        controller.setCommand(Controller.Button.B, new ShootCommand());

        System.out.println(controller);

        controller.play(Controller.Button.X);
        controller.play(Controller.Button.Y);
        controller.play(Controller.Button.A);
        controller.play(Controller.Button.B);
    }
}
