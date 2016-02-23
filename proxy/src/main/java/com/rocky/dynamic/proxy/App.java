package com.rocky.dynamic.proxy;

import com.rocky.proxy.People;
import com.rocky.proxy.Runner;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class App {

    public static void main(String[] args) {
        Runner runner = new People();
        InvocationHandler invocationHandler = new MyInvocationHandler(runner);
        Runner proxy = (Runner)Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                runner.getClass().getInterfaces(), invocationHandler);
        proxy.run();
    }

}
