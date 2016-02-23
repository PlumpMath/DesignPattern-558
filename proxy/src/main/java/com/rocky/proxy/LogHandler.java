package com.rocky.proxy;

public class LogHandler implements Runner {

    private Runner runner;

    public LogHandler(Runner runner) {
        this.runner = runner;
    }

    public void run() {
        System.out.println("The Runner start running.");
        runner.run();
        System.out.println("The Runner stop running.");
    }
}
