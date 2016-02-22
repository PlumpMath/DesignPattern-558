package com.rocky.strategy;

/**
 * Created by Rocky on 2016/2/20.
 */
public class FiringInBursts implements Launcher{

    public void launch(Shooter shooter) {
        shooter.shoot("firing in bursts");
    }
}
