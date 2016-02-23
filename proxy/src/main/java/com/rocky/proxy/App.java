package com.rocky.proxy;

public class App
{
    public static void main( String[] args )
    {
        Runner p = new People();
        Runner timeHandler = new TimeHandler(p);
        Runner logHandler = new LogHandler(timeHandler);
        logHandler.run();
    }

}
