package com.rocky.singleton;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * 第一部分：
 * 本事例表明通过反射的方式依然可以创建不同的实例，
 * 为了使单例模式代码更健壮，我们可以在构造器中抛出异常阻止创建多个实例,
 * 一般在实际应用中不需要考虑这种细节情况
 *
 * 第二部分：
 * 则演示通过反序列化创建不同对象，为阻止这一行为，通过添加readResolve（）方法强制返回之前存在对象
 */
public class Client4Demo6 {

    public static void main(String[] args) throws Exception{

        SingletonDemo6 demo = SingletonDemo6.getInstance();
        SingletonDemo6 demo1 = SingletonDemo6.getInstance();
        System.out.println(demo);
        System.out.println(demo1);

        /**
         * 第一部分
         * 通过反射访问构造器创建不同实例
         */
/*        Class<SingletonDemo6> clazz = SingletonDemo6.class;
        Constructor<SingletonDemo6> constructor = clazz.getDeclaredConstructor(null);
        constructor.setAccessible(true);

        SingletonDemo6 singletonDemo6 = constructor.newInstance();
        System.out.print(singletonDemo6);*/

        /**
         * 第二部分
         * 通过反序列化创建不同实例
         */
        FileOutputStream fos = new FileOutputStream("d:/\\sss.txt");
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(demo);
        os.close();
        fos.close();

        FileInputStream fis = new FileInputStream("d:/\\sss.txt");
        ObjectInputStream is = new ObjectInputStream(fis);
        SingletonDemo6 demo6 = (SingletonDemo6)is.readObject();
        System.out.print(demo6);
    }
}
