package com.company.design.strategy.bean;

import com.company.design.strategy.interfaces.Comparable;

public class Cat implements Comparable<Cat> {

    private int weight;
    private int height;

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

    public int compareTo(Cat o) {
        return Integer.compare(this.weight, o.weight);
    }
}
