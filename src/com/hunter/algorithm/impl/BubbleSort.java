package com.hunter.algorithm.impl;


import com.hunter.algorithm.Algorithm;

/**
 * 冒泡排序,效率低下，时间复杂度为N^2
 * Created by hunter on 2017/8/7.
 */
public class BubbleSort implements Algorithm {

    @Override
    public void calculate(int[] intArray) {
        //遍历所有的数值
        //每次遍历递减，因为最大值已经减一,已经排序完第一个数
        for (int i = intArray.length - 1; i > 0; i--) {
            //内部循环，循历俩俩相邻的数，若前面的数比后面的大，则交换
            for (int j = 0; j < i; j++) {
                if (intArray[j + 1] < intArray[j]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }
    }

}
