package com.company.design.observer;

import com.company.design.observer.bean.Child;

/**
 * observer
 * listener
 * callback
 * hook
 */
public class ObserverMain {
    public static void main(String[] args) {
        Child child = new Child();
        // 通知所有观察者
        child.wakeup();
    }
}
