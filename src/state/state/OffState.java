package state.state;

public class OffState implements IState
{
    @Override
    public IState sendCommand(int command)
    {
        if (command == 0)
            return new StartingState();
        return this;
    }

    @Override
    public void displayInfo()
    {
        System.out.println("- Current state : OFF -");
    }

    @Override
    public void displayCommand()
    {
        System.out.println("[Command]");
        System.out.println("\t 0 - Start PC");
    }
}
