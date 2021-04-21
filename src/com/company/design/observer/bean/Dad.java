package com.company.design.observer.bean;

import com.company.design.observer.interfaces.Observer;

public class Dad implements Observer {

    private void dadCome() {
        System.out.println("奶爸准备就绪");
    }

    @Override
    public void wakeup(EventVo eventVo) {
        System.out.println(eventVo);
        dadCome();
    }
}
