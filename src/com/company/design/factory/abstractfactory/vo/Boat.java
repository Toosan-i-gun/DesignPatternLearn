package com.company.design.factory.abstractfactory.vo;

import com.company.design.factory.interfaces.MoveAble;

public class Boat extends MountVo {

    @Override
    public void move() {
        System.out.println("扬帆起航");

    }
}
