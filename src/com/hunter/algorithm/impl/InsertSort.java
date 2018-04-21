package com.hunter.algorithm.impl;

import com.hunter.algorithm.Algorithm;

import java.util.List;

/**
 * 插入排序，在数量少的情况下非常快
 * Created by hunter on 2017/8/6.
 */
public class InsertSort implements Algorithm {

    @Override
    public void calculate(int[] intArray) {
        //设置中间变量
        int temp;
        //由左边第二位开始迭代
        for (int i = 1; i < intArray.length; i++) {
            temp = intArray[i];
            int j = i - 1;
            while (j >= 0 && intArray[j] > temp) {
                intArray[j + 1] = intArray[j];
                j--;
            }
            intArray[j + 1] = temp;
        }
    }
}
