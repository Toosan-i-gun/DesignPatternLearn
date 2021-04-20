package com.company.design.strategy.interfaces;

/**
 * 如果要进行比较，那就必须实现这个比较的接口 (这个接口决定能不能进行比较)
 * @param <T> 指定比较的数据类型
 */
public interface Comparable<T> {
    int compareTo(T o);
}
