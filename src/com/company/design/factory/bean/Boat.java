package com.company.design.factory.bean;

import com.company.design.factory.interfaces.MoveAble;

public class Boat implements MoveAble {
    @Override
    public void Move() {
        System.out.println("扬帆起航");
    }
}
