package com.company.design.factory.bean;

import com.company.design.factory.interfaces.MoveAble;

public class Car implements MoveAble {
    @Override
    public void Move() {
        System.out.println("风驰电掣");
    }
}
