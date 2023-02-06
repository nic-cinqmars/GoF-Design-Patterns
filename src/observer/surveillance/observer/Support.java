package observer.surveillance.observer;

import observer.surveillance.Event;
import observer.surveillance.IObserver;
import observer.surveillance.observable.EventSpy;

public class Support implements IObserver
{
    public Support()
    {
        EventSpy.getObservable().addObserver(this);
    }

    @Override
    public void alert(Event event)
    {
        if (event.getEmergencyLevel() > 90)
        {
            System.out.println("EMERGENCY SUPPORT : " + event);
        }
    }
}
