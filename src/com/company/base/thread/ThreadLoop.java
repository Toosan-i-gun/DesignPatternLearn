package com.company.base.thread;

public class ThreadLoop extends Thread {
    @Override
    public void run() {
        super.run();
        // 状态变为打断时，结束循环
        // 如果run方法在Runnable里，则用下面的方式获取
        // Thread.currentThread().isInterrupted();
        while (!isInterrupted()) {
            System.out.println("hello16 thread id = " + Thread.currentThread().getName());
        }

    }
}
