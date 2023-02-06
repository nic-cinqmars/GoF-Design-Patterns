package observer.surveillance.observer;

import observer.surveillance.Event;
import observer.surveillance.IObserver;
import observer.surveillance.observable.EventSpy;

public class Log implements IObserver
{
    private final int LOG_LEVEL;

    public Log(int logLevel)
    {
        EventSpy.getObservable().addObserver(this);
        LOG_LEVEL = logLevel;
    }

    @Override
    public void alert(Event event)
    {
        if (event.getEmergencyLevel() > LOG_LEVEL)
        {
            System.out.println("LOG : " + event);
        }
    }
}
