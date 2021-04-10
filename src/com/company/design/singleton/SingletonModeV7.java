package com.company.design.singleton;

/**
 * 静态内部类单例方式
 * 内部类只有被用的时候才会类加载，且只会加载一次。这样就保证了懒加载和线程安全
 * 完美 推荐使用
 */
public class SingletonModeV7 {

    private SingletonModeV7() {
    }

    private static class SingletonModeV7Holder {
        private final static SingletonModeV7 INSTANCE = new SingletonModeV7();
    }

    public static SingletonModeV7 getInstance() {
        return SingletonModeV7Holder.INSTANCE;
    }

    public void printLog() {
        System.out.println("hello world!!");
    }
}
