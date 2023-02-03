package singleton.myserver;

public class MyServer
{
    private static MyServer instance;

    private ServiceA serviceA;
    private ServiceB serviceB;

    private MyServer()
    {
        serviceA = new ServiceA();
        serviceB = new ServiceB();
    }

    void defaultPrint(String m)
    {
        System.out.println("defaultPrint : " + m);
    }

    public void publicPrint(String m)
    {
        System.out.println("publicPrint : " + m);
    }

    public static MyServer getInstance()
    {
        if (instance == null)
        {
            instance = new MyServer();
        }
        return instance;
    }

    public IServiceA getServiceAInterface()
    {
        return serviceA;
    }

    public IServiceB getServiceBInterface()
    {
        return serviceB;
    }

    ServiceA getServiceA()
    {
        return serviceA;
    }
}
