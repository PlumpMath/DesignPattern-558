package com.rocky.singleton;

/**
 * 枚举实现方式
 * 优点：实现简单
 *      枚举本身就是单例模式。由JVM冲根本上提供保障。避免通过反射和反序列化的漏洞
 * 缺点：无延迟加载
 */
public enum SingletonDemo4 {
    //定义一个枚举的元素，它代表了Singleton的一个实例
    //这个枚举元素本身就是单例对象
    INSTANCE;

    //添加自己需要的操作
    public void singletonOperation() {

    }
}