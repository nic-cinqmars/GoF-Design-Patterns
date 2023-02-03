package state;

import state.state.IState;
import state.state.OffState;

public class OperatingSystem
{
    private IState currentState;

    public OperatingSystem()
    {
        currentState = new OffState();
    }

    public void displayInfo()
    {
        currentState.displayInfo();
    }

    public void displayCommand()
    {
        currentState.displayCommand();
    }

    public void sendCommand(int command)
    {
        IState newState = currentState.sendCommand(command);
        if (newState != null)
            changeState(newState);
    }

    private void changeState(IState newState)
    {
        if (newState != currentState)
        {
            currentState = newState;
        }
    }
}
