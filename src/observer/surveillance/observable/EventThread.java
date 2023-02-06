package observer.surveillance.observable;

import observer.surveillance.Event;

public class EventThread extends Thread
{
    private EventSpy spy;

    private final String[] EVENT_DESCRIPTIONS = { "Fire", "Water leak", "Power outage", "Strike", "Major break" };

    public EventThread(EventSpy spy)
    {
        this.spy = spy;
    }

    @Override
    public void run()
    {
        while(!isInterrupted())
        {
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                System.out.println("EventThread stopped.");
                return;
            }

            spy.alert(new Event((int)(Math.random() * 100),
                    EVENT_DESCRIPTIONS[(int)(Math.random() * EVENT_DESCRIPTIONS.length)]));
        }
    }
}
