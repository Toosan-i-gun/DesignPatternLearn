package com.company.design.singleton;

/**
 * 单例模式调试主程序
 * 推荐使用V1,V7,V8写法
 */
public class SingletonModeMain {

    public static void main(String[] args) {
//        SingletonModeV1 singletonModeV1 = SingletonModeV1.getInstance();
//        SingletonModeV1 singletonModeV2 = SingletonModeV1.getInstance();
//        singletonModeV1.printLog();

        // 验证线程是否安全
//        for (int i = 0; i < 100; i++) {
//            new Thread(() -> System.out.println("111"+ SingletonModeV8.INSTANCE.hashCode())).start();
//        }
//        SingletonModeV8.INSTANCE.printLog();
        SingletonModeV7.getInstance().printLog();
    }
}
