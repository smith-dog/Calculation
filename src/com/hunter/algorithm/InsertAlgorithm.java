package com.hunter.algorithm;

import java.util.List;

/**
 * Created by Travelsky on 2017/8/6.
 */
public class InsertAlgorithm implements Algorithm{

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
