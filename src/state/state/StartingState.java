package state.state;

public class StartingState implements IState
{
    @Override
    public IState sendCommand(int command)
    {
        if (command == 0)
            return new OffState();
        else if (command == 1)
            return new AuthentificationState();
        return this;
    }

    @Override
    public void displayInfo()
    {
        System.out.println("- Current state : STARTING -");
    }

    @Override
    public void displayCommand()
    {
        System.out.println("[Commands]");
        System.out.println("\t 0 - Close PC");
        System.out.println("\t 1 - CTRL+ALT+DEL");
    }
}
