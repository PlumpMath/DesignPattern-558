package com.rocky.singleton;

/**
 * 静态内部类实现方式
 * 1.外部类没有static属性，则避免了像饿汉式那样立即加载对象
 * 2.只有在真正调用getInstance的时候才会加载静态内部类，加载类时是线程安全的。
 *      Instance是static final的，保证了内存中只有一个这样的实例存在，
 *      而且只能被赋值一次，从而保证了线程安全性。
 * 3.兼顾了并发高效调用和延迟加载的优势。
 */
public class SingletonDemo3 {

    private SingletonDemo3(){}

    private static class Instance{
        private static final SingletonDemo3 singletonInstance = new SingletonDemo3();
    }

    public static SingletonDemo3 getInstance() {
        return Instance.singletonInstance;
    }

}
