package observer.surveillance;

import observer.surveillance.observable.EventSpy;
import observer.surveillance.observable.EventThread;
import observer.surveillance.observer.Log;
import observer.surveillance.observer.Report;
import observer.surveillance.observer.Support;
import observer.surveillance.observer.TicketGenerator;

public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        EventThread eventThread = new EventThread((EventSpy)EventSpy.getObservable());
        eventThread.start();

        Log log = new Log(50);
        Report report = new Report();
        Support support = new Support();
        TicketGenerator ticketGenerator = new TicketGenerator();

        Thread.sleep(5000);

        EventSpy.getObservable().removeObserver(log);
        EventSpy.getObservable().removeObserver(report);
        EventSpy.getObservable().removeObserver(support);

        Thread.sleep(5000);
        eventThread.interrupt();
    }
}
