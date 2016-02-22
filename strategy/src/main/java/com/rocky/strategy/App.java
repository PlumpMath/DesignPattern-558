package com.rocky.strategy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Launcher launcher = new FiringInBursts();
        Gun gun = new Gun();
        launcher.launch(gun);

        launcher = new Strafe();
        Artillery artillery = new Artillery();
        launcher.launch(artillery);
    }
}
