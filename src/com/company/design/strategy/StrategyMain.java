package com.company.design.strategy;

import com.company.design.strategy.bean.Cat;
import com.company.design.strategy.bean.CatCompare;
import com.company.design.strategy.bean.Dog;
import com.company.design.strategy.bean.DogCompare;

import java.util.Arrays;

/**
 * 策略模式举例
 * 排序工具类，对各类数据类型进行排序，每种数据类型有自己的排序方式
 * 如果我们要进行排序，首先就需要把排序方式抽成一个接口，需要需要排序的数据类型去实现这个接口
 * 排序工具类只对实现了这个接口的类进行排序。
 * 这个接口最好使用泛型，用object的话可能会强转出错。
 * 实现了这个接口，代表这个类是可以排序的，默认用实现的方式进行排序（只有一种排序方式）
 *
 * 目前比较的方式是各自的类通过实现比较的接口去完成的。
 * 如果这个类的比较方式不只一种，可以随时新增其他的比较方式。
 * 那么需要把比较的方式也抽成一个接口，需要新增的比较方式去实现这个比较接口
 * 这个接口也是使用泛型，用各自类的属性进行自定义比较。
 *
 * 这样调用排序工具类的话，就可以把需要比较的数据和比较的方式都传递进去，高度解耦。
 */
public class StrategyMain {
    public static void main(String[] args) {
        Cat cat1 = new Cat(1,1);
        Cat cat2 = new Cat(6,6);
        Cat cat3 = new Cat(7,4);
        Cat cat4 = new Cat(5,11);
        Cat[] cats = {cat1,cat2,cat3,cat4};
        Dog[] dogs = {new Dog(1), new Dog(7), new Dog(5),new Dog(3)};
//        SorterUtils.sort(dogs);
        SorterUtils<Cat> sorterUtilsCat = new SorterUtils<>();
        sorterUtilsCat.sort(cats,new CatCompare());
        SorterUtils<Dog> sorterUtilsDog = new SorterUtils<>();
        sorterUtilsDog.sort(dogs,new DogCompare());
        System.out.println(Arrays.toString(cats));
    }
}
