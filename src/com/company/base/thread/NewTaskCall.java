package com.company.base.thread;

import java.util.concurrent.Callable;

public class NewTaskCall implements Callable<String> {
    @Override
    public String call() throws Exception {
        return Thread.currentThread()+"";
    }
}
