package com.rocky.proxy.staticProxy;

public class TimeHandler implements Runner {

    private Runner runner;

    public TimeHandler(Runner runner) {
        this.runner = runner;
    }

    public void run() {
        System.out.println(System.currentTimeMillis());
        runner.run();
        System.out.println(System.currentTimeMillis());
    }
}
