package com.company.design.factory.abstractfactory;

import com.company.design.factory.abstractfactory.vo.ArmsVo;
import com.company.design.factory.abstractfactory.vo.FoodVo;
import com.company.design.factory.abstractfactory.vo.MountVo;

/**
 * 抽象工厂类
 */
public abstract class AbstractFactory {
    public abstract ArmsVo createArms();
    public abstract FoodVo createFood();
    public abstract MountVo createMount();
}
