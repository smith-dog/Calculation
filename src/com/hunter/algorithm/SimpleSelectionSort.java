package com.hunter.algorithm;

import java.util.List;

/**
 * Created by hunter on 2017/8/16.
 */
public class SimpleSelectionSort implements Algorithm{

    @Override
    public void calculate(int[] intArray) {
        //简单选择排序
        //第一层，每次循环后减少一层
        for(int i = 0; i<intArray.length; i++) {
            int temp = intArray[i];
            //遍历最小的数，与第一个数交换
            for(int j = i+1; j<intArray.length; j++) {
                if(intArray[i]>intArray[j]) {
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                    temp = intArray[i];
                }
            }
        }
    }
}
