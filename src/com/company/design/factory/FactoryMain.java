package com.company.design.factory;

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
        MoveAble moveAble = new PlaneFactory().create();
        moveAble.Move();
    }
}
