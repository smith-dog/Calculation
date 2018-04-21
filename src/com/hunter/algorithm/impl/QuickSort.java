package com.hunter.algorithm.impl;

import com.hunter.algorithm.Algorithm;

/**
 * 快速排序实现，随机大的情况下非常快，时间复杂度
 * Created by hunter on 2017/8/19.
 */
public class QuickSort implements Algorithm {
    @Override
    public void calculate(int[] intArray) {
        cal(intArray, 0, intArray.length - 1);
    }

    private void cal(int[] intArray, int start, int end) {
        //选择快排的基准
        //选择基准,取第一个数
        int benchmark = start;
        //建立哨兵
        int i = start + 1;
        int j = end;
        if (j <= i) {
            return;
        }
        //哨兵J开始移动
        while (i != j) {
            //没有冲突的话，那么比对J与基准
            while (intArray[j] >= intArray[benchmark] && i < j)
                j--;
            //再找右边的
            while (intArray[i] <= intArray[benchmark] && i < j)
                i++;
            if (intArray[i] > intArray[benchmark]) {
                int temp = intArray[i];
                intArray[i] = intArray[j];
                intArray[j] = temp;
            }
        }
        //哨兵i开始移动
        int temp = intArray[i];
        intArray[i] = intArray[benchmark];
        intArray[benchmark] = temp;
        benchmark = i;
        cal(intArray, start, benchmark - 1);
        cal(intArray, benchmark + 1, end);
    }
}
