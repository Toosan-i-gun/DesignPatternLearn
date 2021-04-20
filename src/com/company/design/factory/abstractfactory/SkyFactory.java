package com.company.design.factory.abstractfactory;

import com.company.design.factory.abstractfactory.vo.*;

public class SkyFactory extends AbstractFactory{

    @Override
    public ArmsVo createArms() {
        return new Missile();
    }

    @Override
    public FoodVo createFood() {
        return new Water();
    }

    @Override
    public MountVo createMount() {
        return new Plane();
    }
}
