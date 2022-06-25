package com.company.base.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("hello1 thread id = " + Thread.currentThread());
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello2 thread id = " + Thread.currentThread());
            }
        }).start();
        new NewThread().start();
        new Thread(new NewTask()).start();
        // Callable(带返回值的任务) 需要依附于FutureTask
        FutureTask<String> futureTask = new FutureTask<>(new NewTaskCall());
        new Thread(futureTask).start();
        // 阻塞的  等执行完才能获取到值
        System.out.println("hello5 thread id = " + futureTask.get());
        ThreadLoop threadLoop = new ThreadLoop();
//        threadLoop.start();
//        Thread.sleep(10);
//        threadLoop.interrupt();

        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    System.out.println("threadA  i = " + i);
                }
            }
        });

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    System.out.println("threadB  i = " + i);
                }
            }
        });

        threadA.start();
        // 等待A 执行完后，后面的线程再执行
        threadA.join();
        threadB.start();
        // 设置守护线程，主线程不必等待该线程执行完
        threadB.setDaemon(true);
        new NewThread().start();

    }
}
