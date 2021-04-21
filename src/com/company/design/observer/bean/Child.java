package com.company.design.observer.bean;

import com.company.design.observer.interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察的对象。
 * 观察者需要实现观察的接口
 * 将观察者与被观察对象绑定（现在是直接作为被观察者的属性绑定）
 * 当被观察者执行某个方法后，调用所有观察者的是实现方法进行通知
 */
public class Child {

    private final List<Observer> observers = new ArrayList<>();
    {
        observers.add(new Dad());
        observers.add(new Mom());
        observers.add(new Dog());
    }
    private boolean isWakeUp = false;

    /**
     * 目前只是单纯的发出一个通知
     * 需要在写一个event类，发生的具体事件告诉观察者
     */
    public void wakeup() {
        isWakeUp = true;
        EventVo eventVo = new EventVo(this,0,"bed");
        for (Observer observer: observers) {
            observer.wakeup(eventVo);
        }
    }

    public boolean isWakeUp() {
        return isWakeUp;
    }

    public void setWakeUp(boolean wakeUp) {
        isWakeUp = wakeUp;
    }

    @Override
    public String toString() {
        return "Child{" +
                "isWakeUp=" + isWakeUp +
                '}';
    }
}
