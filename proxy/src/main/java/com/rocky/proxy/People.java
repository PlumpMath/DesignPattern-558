package com.rocky.proxy;

public class People implements Runner {

    public void run() {
        System.out.println("I am running.");
        try{
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
