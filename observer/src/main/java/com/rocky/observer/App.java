package com.rocky.observer;

/**
 *分别采用两种方式实现事件监听
 */
public class App 
{
    public static void main(String[] args) {
        //自定义button模拟java awt事件监听机制
        Button b = new Button();
        b.addActionListener(new MyActionListener());
        b.addActionListener(new MyActionListener2());
        b.buttonPressed();

        //亲自继承实现java awt接口实现事件监听
        new TestFrame().launch();
    }
}
