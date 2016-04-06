package com.rocky.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SingletonDemo6 implements Serializable{

    private static SingletonDemo6 instance;

    private SingletonDemo6(){
        //此处通过非空校验可以防止通过反射调用私有构造器创建实例
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

    //反序列化时如果定义了readResolve(）则直接返回此方法指定的对象。而不需要再单独创建对象
    private Object readResolve() throws ObjectStreamException{
        return instance;
    }
}
