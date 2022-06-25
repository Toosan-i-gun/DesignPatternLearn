package com.company.base.thread;

public class NewTask implements Runnable{
    @Override
    public void run() {
        System.out.println("hello4 thread id = " + Thread.currentThread());
    }
}
