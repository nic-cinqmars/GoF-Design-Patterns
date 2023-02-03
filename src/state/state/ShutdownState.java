package state.state;

public class ShutdownState implements IState
{
    @Override
    public IState sendCommand(int command)
    {
        return null;
    }

    @Override
    public void displayInfo()
    {
        System.out.println("- Current state : SHUTDOWN -");
    }

    @Override
    public void displayCommand()
    {
        System.out.println("[Command]");
        System.out.println("\t 1 - Close PC");
    }
}
