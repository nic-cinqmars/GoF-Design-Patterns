package observer.surveillance.observer;

import observer.surveillance.Event;
import observer.surveillance.IObserver;
import observer.surveillance.observable.EventSpy;

public class TicketGenerator implements IObserver
{
    public TicketGenerator()
    {
        EventSpy.getObservable().addObserver(this);
    }

    @Override
    public void alert(Event event)
    {
        if (event.getDescription().equals("Major break"))
        {
            System.out.println("OPENING TICKET : " + event);

        }
    }
}
