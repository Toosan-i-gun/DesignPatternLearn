package com.company.design.strategy;

import com.company.design.strategy.interfaces.Comparator;

/**
 * 对不同数据类型进行比较
 * @param <T> 数据类型
 */
public class SorterUtils<T> {

    /**
     * 排序
     * @param arr 需要排序的数据数组
     * @param comparator 该数据类型的排序方式
     */
    public  void sort(T[] arr, Comparator<T> comparator) {
        for (int i = 0; i < arr.length; i++) {
            int minPoint = i;
            for (int j = i + 1; j < arr.length; j++) {
                minPoint = comparator.compare(arr[j],arr[i]) < 0  ? j : minPoint;
            }
            swap(arr, i, minPoint);
        }
    }

     void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
