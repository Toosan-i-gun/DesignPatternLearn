package com.company.design.observer.bean;

import com.company.design.observer.interfaces.Observer;

public class Mom implements Observer {

    private void momCome() {
        System.out.println("亲妈准备就绪");
    }

    @Override
    public void wakeup(EventVo eventVo) {
        System.out.println(eventVo);
        momCome();
    }
}
