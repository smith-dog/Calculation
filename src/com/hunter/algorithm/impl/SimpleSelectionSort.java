package com.hunter.algorithm.impl;

import com.hunter.algorithm.Algorithm;

import java.util.List;

/**
 * Created by hunter on 2017/8/16.
 */
public class SimpleSelectionSort implements Algorithm {

    @Override
    public void calculate(int[] intArray) {
        //简单选择排序
        //第一层，每次循环后减少一层
        for (int i = 0; i < intArray.length; i++) {
            int temp = intArray[i];
            int minFlag = i;
            //遍历最小的数，与第一个数交换
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[minFlag] > intArray[j]) {
                    minFlag = j;
                }
            }
            if (i != minFlag) {
                intArray[i] = intArray[minFlag];
                intArray[minFlag] = temp;
                temp = intArray[i];
            }
        }
    }
}
