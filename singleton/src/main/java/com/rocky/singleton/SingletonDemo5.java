package com.rocky.singleton;

/**
 * 双重检测锁实现
 * 这个模式将同步内容下方到if内部，提高了执行的效率
 * 不必每次获取对象时都进行同步，只有第一次才同步，创建了以后就没必要了
 *
 * 问题：由于编译器有花原因和JVM底层是内部模型原因，偶尔会出问题，不建议使用
 */
public class SingletonDemo5 {

    private static SingletonDemo5 instance = null;

    public static SingletonDemo5 getInstance() {
        if (instance == null) {
            SingletonDemo5 sc;
            synchronized (SingletonDemo5.class) {
                sc = instance;
                if (sc == null) {
                    synchronized (SingletonDemo5.class) {
                        if(sc == null) {
                            sc = new SingletonDemo5();
                        }
                    }
                    instance = sc;
                }
            }
        }
        return instance;
    }

    private SingletonDemo5() {

    }

}
