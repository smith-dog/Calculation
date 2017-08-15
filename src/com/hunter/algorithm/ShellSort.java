package com.hunter.algorithm;

import java.util.List;

/**
 * Created by Travelsky on 2017/8/15.
 * 希尔排序，直接插入排序的改进版本，不稳定
 */
public class ShellSort implements Algorithm{
    @Override
    public void calculate(int[] intArray) {
        //取中位，并将序列分为几分继续迭代

        //遍历直至为1
        /*for(int initLength = intArray.length/2;initLength>1;initLength=initLength/2) {
            //插入排序
            for(int i=initLength;i<intArray.length;i++) {
                int j = i;
                int temp = intArray[j];
                if (intArray[j] < intArray[j - initLength]) {
                    while (j - initLength >= 0 && temp < intArray[j - initLength]) {
                        //移动法
                        intArray[j] = intArray[j - initLength];
                        j -= initLength;
                    }
                    intArray[j] = temp;
                }
            }

        }*/

        int i,j;
        int r,temp;
        for(r = intArray.length/2;r>=1;r/=2) {
            for(i=r;i<intArray.length;i++) {
                temp = intArray[i];
                j=i-r;
                //优化
                //和前一个比较，若比前一个小则继续向前比较，直到比前一个大或者相等为止，或者
                while(j>=0 && temp<intArray[j]) {
                    intArray[j+r] = intArray[j];
                    j-=r;
                }
                intArray[j+r] = temp;
            }
        }
    }
}

