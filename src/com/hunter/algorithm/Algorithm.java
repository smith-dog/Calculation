package com.hunter.algorithm;

import java.util.List;

/**
 * Created by hunter on 2017/8/6.
 * 算法接口类
 */
public interface Algorithm {

    public void calculate(int[] intArray);

    default void printName() {
        System.out.println(this.getClass().getCanonicalName());
    }

    default void calculate(List<int[]> list) {
        list.stream().forEach(ints -> calculate(ints));
    }

}
