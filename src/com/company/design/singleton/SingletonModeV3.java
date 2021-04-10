package com.company.design.singleton;

/**
 * 懒汉式 单例   什么时候用，什么时候进行初始化。
 * 缺点：虽然解决了需要用的时候进行实例化，但是会带来线程不安全的问题
 */
public class SingletonModeV3 {

    private static SingletonModeV3 INSTANCE;

    private SingletonModeV3() {
    }

    public static SingletonModeV3 getInstance() {
        // 这个判空在多线程下可能会出现问题
        if (null == INSTANCE) {
            INSTANCE = new SingletonModeV3();
        }
        return INSTANCE;
    }

    public void printLog() {
        System.out.println("hello world!!");
    }
}
