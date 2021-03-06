package com.company.design.strategy.bean;

import com.company.design.strategy.interfaces.Comparator;

public class CatCompare implements Comparator<Cat> {

    @Override
    public int compare(Cat t1, Cat t2) {
        return Integer.compare(t1.getHeight()+t1.getWeight(), t2.getHeight()+t2.getWeight());
    }
}
