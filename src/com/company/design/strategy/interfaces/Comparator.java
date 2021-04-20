package com.company.design.strategy.interfaces;

/**
 * 如果需要新增比较的方式，实现该接口 （这个接口决定比较的方式）
 * @param <T> 需要比较的数据类型
 */
public interface Comparator<T> {
    int compare(T t1, T t2);
}
