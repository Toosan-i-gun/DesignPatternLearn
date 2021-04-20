package com.company.design.factory.factoryvo;

import com.company.design.factory.bean.Boat;
import com.company.design.factory.bean.Plane;
import com.company.design.factory.interfaces.MoveAble;

public class BoatFactory {
    public MoveAble create() {
        // 可以对生产小车做一系列条件判断，或者其他属性的初始化啥的。
        // TODO doSomethings
        System.out.println("get a boat successful");
        return new Boat();
    }
}
