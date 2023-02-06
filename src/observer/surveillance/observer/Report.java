package observer.surveillance.observer;

import observer.surveillance.Event;
import observer.surveillance.IObserver;
import observer.surveillance.observable.EventSpy;

public class Report implements IObserver
{
    public Report()
    {
        EventSpy.getObservable().addObserver(this);
    }
    
    @Override
    public void alert(Event event)
    {
        System.out.println("REPORT : " + event.getDescription());
    }
}
