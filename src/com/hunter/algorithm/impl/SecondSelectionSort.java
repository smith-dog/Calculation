package com.hunter.algorithm.impl;

import com.hunter.algorithm.Algorithm;

/**
 * Created by hunter on 2017/8/16.
 */
public class SecondSelectionSort implements Algorithm {
    @Override
    public void calculate(int[] intArray) {
        //简单选择排序
        //第一层，每次循环后减少一层
        for (int i = 0; i < intArray.length / 2; i++) {
            //如果前后大小不一，先交换
            if (intArray[i] > intArray[intArray.length - i - 1]) {
                int temp = intArray[i];
                intArray[i] = intArray[intArray.length - i - 1];
                intArray[intArray.length - i - 1] = temp;
            }

            int minTemp = intArray[i];
            int maxTemp = intArray[intArray.length - i - 1];
            //遍历最小的数和最大的数，与第一个数交换
            for (int j = i + 1; j <= intArray.length - (i + 1); j++) {
                if (intArray[i] > intArray[j]) {
                    intArray[i] = intArray[j];
                    intArray[j] = minTemp;
                    minTemp = intArray[i];
                }
                if (intArray[intArray.length - i - 1] < intArray[j]) {
                    intArray[intArray.length - i - 1] = intArray[j];
                    intArray[j] = maxTemp;
                    maxTemp = intArray[intArray.length - i - 1];
                }

            }
        }
    }
}
