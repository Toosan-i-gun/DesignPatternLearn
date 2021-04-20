package com.company.design.factory;

import com.company.design.factory.abstractfactory.AbstractFactory;
import com.company.design.factory.abstractfactory.LandFactory;
import com.company.design.factory.abstractfactory.SeaFactory;
import com.company.design.factory.abstractfactory.SkyFactory;
import com.company.design.factory.abstractfactory.vo.ArmsVo;
import com.company.design.factory.abstractfactory.vo.FoodVo;
import com.company.design.factory.abstractfactory.vo.MountVo;
import com.company.design.factory.bean.Plane;
import com.company.design.factory.factoryvo.CarFactory;
import com.company.design.factory.factoryvo.PlaneFactory;
import com.company.design.factory.interfaces.MoveAble;

/**
 * 工厂模式
 * 1.定制类的生成。生成具有相同属性的类，如交通工具。
 *  定义一个交通工具特有的行为接口，实现了这个接口的类，我们都认为他是交通工具
 * 2.定制生成过程。飞机、小车、船获取的方式不同。可能由权限、金钱等各种因素影响。
 *  定义一个简单的工厂模式，来定制某类交通工具的生产过程
 */
public class FactoryMain {
    public static void main(String[] args) {
        /*
         * 这里返回一个MoveAble接口，有些不明白，如果这个交通工具有自己特有的一些功能，那么生产的类如何去调用呢？
         * 之前学习抽象类和接口时，有一句话，动词用接口拓展，名词用抽象继承实现。
         * 这里感觉用抽象类会好一点吧？
         *
         * 之后的抽象工厂应该就是这么考虑的，等抽象工厂时再分析一下
         */
//        MoveAble moveAble = new PlaneFactory().create();
//        moveAble.Move();

        /*
         * 抽象工厂类
         */
//        AbstractFactory soldier = new SkyFactory();
//        AbstractFactory soldier = new LandFactory();
        AbstractFactory soldier = new SeaFactory();

        FoodVo food = soldier.createFood();
        ArmsVo arms = soldier.createArms();
        MountVo mount = soldier.createMount();
        food.eat();
        arms.attack();
        mount.move();
    }
}
