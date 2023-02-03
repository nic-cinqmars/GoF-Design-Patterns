package state.state;

public class AuthentificationState implements IState
{
    @Override
    public IState sendCommand(int command)
    {
        if (command == 0)
            return new OffState();
        else if (command == 1)
            return new ShutdownState();
        else if (command == 2)
            return new UsingState();
        return this;
    }

    @Override
    public void displayInfo()
    {
        System.out.println("- Current state : AUTHENTIFICATION -");
    }

    @Override
    public void displayCommand()
    {
        System.out.println("[Commands]");
        System.out.println("\t 0 - Close PC");
        System.out.println("\t 1 - Shutdown PC");
        System.out.println("\t 2 - Authentification");
    }
}
