package state.state;

public class UsingState implements IState
{
    @Override
    public IState sendCommand(int command)
    {
        if (command == 0)
            return new ShutdownState();
        else if (command == 1)
            return new AuthentificationState();
        else if (command == 2)
            return new OffState();
        return this;
    }

    @Override
    public void displayInfo()
    {
        System.out.println("- Current state : USING -");
    }

    @Override
    public void displayCommand()
    {
        System.out.println("[Commands]");
        System.out.println("\t 0 - Shutdown PC");
        System.out.println("\t 1 - Close session");
        System.out.println("\t 2 - Close PC");
    }
}
