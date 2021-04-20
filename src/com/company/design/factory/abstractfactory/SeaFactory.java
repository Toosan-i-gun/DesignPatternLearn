package com.company.design.factory.abstractfactory;

import com.company.design.factory.abstractfactory.vo.*;

public class SeaFactory extends AbstractFactory{

    @Override
    public ArmsVo createArms() {
        return new Torpedo();
    }

    @Override
    public FoodVo createFood() {
        return new Fruit();
    }

    @Override
    public MountVo createMount() {
        return new Boat();
    }
}
