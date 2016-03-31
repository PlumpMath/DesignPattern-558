package com.rocky.singleton;

public class SingletonDemo6 {

    private static SingletonDemo6 instance;

    private SingletonDemo6(){
        if (instance != null){
            throw new RuntimeException();
        }
    }

    //方法同步，调用效率低
    public static synchronized SingletonDemo6 getInstance() {
        if (instance == null){
            instance = new SingletonDemo6();
        }
        return instance;

    }
}
