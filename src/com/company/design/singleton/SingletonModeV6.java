package com.company.design.singleton;

/**
 * 懒汉式 单例   什么时候用，什么时候进行初始化。
 * 缺点：虽然解决了需要用的时候进行实例化，但是会带来线程不安全的问题
 * 为了解决线程不安全的问题，可以通过加锁 synchronized解决，但效率也会下降
 * 为了调高效率，尝试减少锁定得代码块提高效率，但是没有把判空和创建一体化判断。锁与没加无异
 * 于是进行双重判空
 * 至此，懒汉式才算得上是完美了
 */
public class SingletonModeV6 {

    // 这里加上volatile 是为了防止JIT语句重排时，可能发生INSTANCE未初始化就进行返回了。
    private static volatile SingletonModeV6 INSTANCE;

    private SingletonModeV6() {
    }

    public static SingletonModeV6 getInstance() {
        // 外层这个判空是有意义的，减少了很大部分获取锁进行判断的场景，提高了效率
        if (null == INSTANCE) {
            synchronized (SingletonModeV6.class) {
                // 如果外层为空，进来后再判断一次，如果已经创建了就不执行了
                // （对于里面来说外层的判空没有加锁，存在外层为空，内层不为空的情况，外层的判断纯粹为了提高效率）
                if (null == INSTANCE) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new SingletonModeV6();
                }
            }
        }
        return INSTANCE;
    }

    public void printLog() {
        System.out.println("hello world!!");
    }
}
