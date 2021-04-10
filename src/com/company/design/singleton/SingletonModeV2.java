package com.company.design.singleton;

/**
 * 饿汉式 单例
 * 类加载到内存之后就会实例化一个单例，JVM保证线程安全(类加载一次)
 * 缺点：不管你用不用到，类加载完成后就会完成实例化  (为了解决这个缺点，就出现了懒汉式，进行懒加载)
 */
public class SingletonModeV2 {

    private static final SingletonModeV2 INSTANCE;

    static {
        INSTANCE = new SingletonModeV2();
    }

    private SingletonModeV2() {
    }

    public static SingletonModeV2 getInstance() {
        return INSTANCE;
    }

    public void printLog() {
        System.out.println("hello world!!");
    }
}
