package com.company.design.factory.abstractfactory.vo;

import com.company.design.factory.interfaces.MoveAble;

public class Plane extends MountVo {

    @Override
    public void move() {
        System.out.println("芜湖起飞");
    }
}
