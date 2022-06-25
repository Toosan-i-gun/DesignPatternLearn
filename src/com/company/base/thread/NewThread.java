package com.company.base.thread;

public class NewThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("hello3 thread id = " + Thread.currentThread());
    }
}
