package singleton;

import singleton.myserver.MyServer;

public class Main
{
    public static void main(String[] args)
    {
        MyServer.getInstance().publicPrint("main");
        MyServer.getInstance().getServiceAInterface().functionA();
        MyServer.getInstance().getServiceBInterface().functionC();
        MyServer.getInstance().getServiceBInterface().functionD();
        MyServer.getInstance().getServiceBInterface().functionE();
        MyServer.getInstance().getServiceBInterface().functionF();
    }
}

