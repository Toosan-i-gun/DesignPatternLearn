package com.company.design.singleton;

/**
 * 枚举单例
 * 不仅可以解决线程同步问题，还能防止反序列化
 * 无敌
 */
public enum SingletonModeV8 {

    INSTANCE;

    public void printLog() {
        System.out.println("hello world!!");
    }

}
