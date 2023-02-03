package state.state;

public interface IState
{
    IState sendCommand(int command);

    void displayInfo();

    void displayCommand();
}
