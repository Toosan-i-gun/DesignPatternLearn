package com.company.design.factory.bean;

import com.company.design.factory.interfaces.MoveAble;

public class Plane implements MoveAble {

    @Override
    public void Move() {
        System.out.println("芜湖起飞");
    }
}
