package singleton.myserver;

public class ServiceA extends Service implements IServiceA
{
    public ServiceA()
    {

    }

    @Override
    public void functionA()
    {
        MyServer.getInstance().defaultPrint("A");
    }

    public void functionB()
    {
        MyServer.getInstance().publicPrint("B");
    }
}
