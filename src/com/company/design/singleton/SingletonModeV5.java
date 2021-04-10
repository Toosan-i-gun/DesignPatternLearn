package com.company.design.singleton;

/**
 * 懒汉式 单例   什么时候用，什么时候进行初始化。
 * 缺点：虽然解决了需要用的时候进行实例化，但是会带来线程不安全的问题
 * 为了解决线程不安全的问题，可以通过加锁 synchronized解决，但效率也会下降
 * 为了调高效率，尝试减少锁定得代码块提高效率，但是没有把判空和创建一体化判断。锁与没加无异 与V3版本一样，不能使用
 * 于是进行双重判空
 */
public class SingletonModeV5 {

    private static SingletonModeV5 INSTANCE;

    private SingletonModeV5() {
    }

    public static SingletonModeV5 getInstance() {
        // 这个判空在多线程下可能会出现问题
        if (null == INSTANCE) {
            synchronized (SingletonModeV5.class) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new SingletonModeV5();
            }
        }
        return INSTANCE;
    }

    public void printLog() {
        System.out.println("hello world!!");
    }
}
