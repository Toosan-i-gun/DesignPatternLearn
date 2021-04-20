package com.company.design.strategy.bean;

import com.company.design.strategy.interfaces.Comparator;

public class DogCompare implements Comparator<Dog> {

    @Override
    public int compare(Dog t1, Dog t2) {
        return Integer.compare(t1.getAge(), t2.getAge());
    }
}
