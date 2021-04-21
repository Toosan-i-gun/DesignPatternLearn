package com.company.design.observer.bean;

import com.company.design.observer.interfaces.Observer;

public class Dog implements Observer {
    private void dogCome() {
        System.out.println("狗狗一脸懵逼");
    }

    @Override
    public void wakeup(EventVo eventVo) {
        System.out.println(eventVo);
        dogCome();
    }
}
