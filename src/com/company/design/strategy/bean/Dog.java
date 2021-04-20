package com.company.design.strategy.bean;

import com.company.design.strategy.interfaces.Comparable;

public class Dog implements Comparable<Dog> {
    private int age;

    public Dog(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Dog o) {
        return Integer.compare(this.age, o.age);
    }
}
