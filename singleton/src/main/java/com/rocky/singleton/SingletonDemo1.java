package com.rocky.singleton;

/**
 * 饿汉式
 * 会在类初始化时直接创建实例，因为虚拟机只会装载一次该类，
 * 所以在调用getInstance时不会发生并发访问问题，因此可以省略synchronized关键字
 *
 * 问题：如果只是加载本类，而不是要调用getInstance，会造成资源浪费
 */
public class SingletonDemo1 {
    private static SingletonDemo1 instance = new SingletonDemo1();

    //私有化构造器
    private SingletonDemo1(){

    }

    //外部访问只能通过此方法
    public static SingletonDemo1 getInstance() {
        return instance;
    }
}
