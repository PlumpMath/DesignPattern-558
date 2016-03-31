package com.rocky.singleton;

import java.lang.reflect.Constructor;

/**
 * 本事例表明通过反射的方式依然可以创建不同的实例，
 * 为了使单例模式代码更健壮，我们可以在构造器中抛出异常阻止创建多个实例,
 * 一般在实际应用中不需要考虑这种细节情况
 */
public class Client4Demo6 {

    public static void main(String[] args) throws Exception{
        SingletonDemo6 demo = SingletonDemo6.getInstance();
        SingletonDemo6 demo1 = SingletonDemo6.getInstance();
        System.out.println(demo);
        System.out.println(demo1);

        Class<SingletonDemo6> clazz = SingletonDemo6.class;
        Constructor<SingletonDemo6> constructor = clazz.getDeclaredConstructor(null);
        constructor.setAccessible(true);

        SingletonDemo6 singletonDemo6 = constructor.newInstance();
        System.out.print(singletonDemo6);
    }
}
