package observer.surveillance;

public class Event
{
    private int emergencyLevel;
    private String description;

    public Event(int emergencyLevel, String description)
    {
        this.emergencyLevel = emergencyLevel;
        this.description = description;
    }

    public int getEmergencyLevel()
    {
        return emergencyLevel;
    }

    public String getDescription()
    {
        return description;
    }

    @Override
    public String toString() {
        return "Event{" +
                "emergencyLevel=" + emergencyLevel + ", " +
                "description=" + description +
                "}";
    }
}
