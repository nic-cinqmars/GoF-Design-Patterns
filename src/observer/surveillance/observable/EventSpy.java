package observer.surveillance.observable;

import observer.surveillance.Event;
import observer.surveillance.IObservable;
import observer.surveillance.IObserver;

import java.util.ArrayList;
import java.util.List;

public class EventSpy implements IObservable
{
    private List<IObserver> observers;
    private static IObservable observable;

    private EventSpy()
    {
        observers = new ArrayList<>();
    }

    public static IObservable getObservable()
    {
        if (observable == null)
        {
            observable = new EventSpy();
        }
        return observable;
    }

    public void alert(Event event)
    {
        for (IObserver observer : observers)
        {
            observer.alert(event);
        }
    }

    @Override
    public void addObserver(IObserver observer)
    {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer)
    {
        observers.remove(observer);
    }
}
