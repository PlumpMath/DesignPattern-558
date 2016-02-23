package com.rocky.dynamic.proxy;

import com.rocky.proxy.Runner;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    private Runner runner;

    public MyInvocationHandler(Runner runner) {
        super();
        this.runner = runner;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("myInvocationHandler start...");
        method.invoke(runner, new Object[]{});
        System.out.println("myInvocationHandler stop...");
        return runner;
    }
}
