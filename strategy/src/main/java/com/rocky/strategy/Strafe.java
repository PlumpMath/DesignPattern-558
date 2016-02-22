package com.rocky.strategy;

/**
 * Created by Rocky on 2016/2/20.
 */
public class Strafe implements Launcher {

    public void launch(Shooter shooter) {
        shooter.shoot("strafe");
    }
}
