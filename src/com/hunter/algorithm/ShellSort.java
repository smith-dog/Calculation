package com.hunter.algorithm;

import java.util.List;

/**
 * Created by Travelsky on 2017/8/15.
 * 希尔排序，直接插入排序的改进版本，不稳定
 */
public class ShellSort implements Algorithm{
    @Override
    public void calculate(int[] intArray) {
        /*//外层循环，取步进数值
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
                // System.out.println("i:" + i);
                temp = intArray[i];
                for (j = i - increment; j >= 0; j -= increment) {
                    // System.out.println("j:" + j);
                    // System.out.println("temp:" + temp);
                    // System.out.println("data[" + j + "]:" + data[j]);
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

