package com.company.design.factory.abstractfactory;

import com.company.design.factory.abstractfactory.vo.*;

public class LandFactory extends AbstractFactory{

    @Override
    public ArmsVo createArms() {
        return new Shell();
    }

    @Override
    public FoodVo createFood() {
        return new Rice();
    }

    @Override
    public MountVo createMount() {
        return new Car();
    }
}
