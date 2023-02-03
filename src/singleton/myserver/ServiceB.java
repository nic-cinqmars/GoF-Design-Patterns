package singleton.myserver;

public class ServiceB extends Service implements IServiceB
{
    public ServiceB()
    {

    }

    @Override
    public void functionC()
    {
        MyServer.getInstance().defaultPrint("C");
    }

    @Override
    public void functionD()
    {
        MyServer.getInstance().publicPrint("D");
    }

    @Override
    public void functionE()
    {
        MyServer.getInstance().getServiceAInterface().functionA();
    }

    @Override
    public void functionF()
    {
        MyServer.getInstance().getServiceA().functionB();
    }
}
