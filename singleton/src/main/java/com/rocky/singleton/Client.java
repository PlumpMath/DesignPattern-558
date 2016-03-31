package com.rocky.singleton;

public class Client {

    public static void main(String[] args) {
        SingletonDemo5 singletonDemo = SingletonDemo5.getInstance();
        SingletonDemo5 singletonDemo1 = SingletonDemo5.getInstance();
        System.out.println(singletonDemo);
        System.out.println(singletonDemo1);

    }
}
