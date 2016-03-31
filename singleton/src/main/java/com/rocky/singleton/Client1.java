package com.rocky.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * 本事例用于测试每种单例创建方式的效率
 *
 *
 */
public class Client1 {

    public static void main(String[] args) throws Exception{
        int threadNum = 10;
        //同步辅助类，在完成一组正在其他线程中执行的操作前，他允许一个或多个线程一直等待，也就是main线程会一直等待其他线程都执行完毕
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);

        long start = System.currentTimeMillis();

        for (int i = 0; i < threadNum; i++) {

            new Thread(new Runnable() {
                public void run() {
                    for (int j = 0; j < 100000; j++) {
                        SingletonDemo1 singletonDemo1 = SingletonDemo1.getInstance();
                    }
                    //当前线程调用此方法则计数器减一
                    countDownLatch.countDown();
                }
            }).start();
        }
        //调用此方法会一直阻塞当前线程（也就是main线程），知道计数器的值为零
        countDownLatch.await();
        long end = System.currentTimeMillis();
        System.out.print("time--" + (end - start));
    }
}
