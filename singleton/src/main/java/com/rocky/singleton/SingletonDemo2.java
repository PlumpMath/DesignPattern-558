package com.rocky.singleton;

/*
* 懒汉式
* 资源利用率高，但是每次获取实例都要同步，并发效率低
* */
public class SingletonDemo2 {

    //类初始化时不初始化对象（延迟加载，用的时候才创建）
    private static SingletonDemo2 instance;

    private SingletonDemo2(){}

    //方法同步，调用效率低
    public static synchronized SingletonDemo2 getInstance() {
        if (instance == null){
            instance = new SingletonDemo2();
        }
        return instance;

    }
}
