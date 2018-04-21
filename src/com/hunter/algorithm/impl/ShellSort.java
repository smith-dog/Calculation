package com.hunter.algorithm.impl;

import com.hunter.algorithm.Algorithm;

import java.util.List;

/**
 * Created by hunter on 2017/8/15.
 * 希尔排序，直接插入排序的改进版本，不稳定
 */
public class ShellSort implements Algorithm {
    @Override
    public void calculate(int[] intArray) {
        /*//外层循环，取步进数值
        //这里貌似犯了错误，内层只取了步进值作为循环，这样就少了一部分的数值，造成更多次的便利
        int temp;
        for(int stepNumber = intArray.length/2; stepNumber>=1; stepNumber /= 2) {
            //内层循环（插入排序）
            for (int i = 1; i < intArray.length/stepNumber; i++) {
                //第二个往前比对
                temp = intArray[i*stepNumber];
                int j = i - 1;
                while (j >= 0 && intArray[j*stepNumber] > temp) {
                    intArray[(j + 1)*stepNumber] = intArray[j*stepNumber];
                    j--;
                }
                intArray[(j + 1)*stepNumber] = temp;
            }
        }*/
        int j = 0;
        int temp = 0;
        for (int increment = intArray.length / 2; increment > 0; increment /= 2) {
            for (int i = increment; i < intArray.length; i++) {
                temp = intArray[i];
                for (j = i - increment; j >= 0; j -= increment) {
                    if (temp < intArray[j]) {
                        intArray[j + increment] = intArray[j];
                    } else {
                        break;
                    }
                }
                intArray[j + increment] = temp;
            }
        }
    }
}

