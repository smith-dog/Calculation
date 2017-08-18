package com.hunter.algorithm;

import java.util.List;

/**
 * Created by Travelsky on 2017/8/6.
 * 算法接口类
 *
 */
public interface Algorithm {

    public void calculate(int[] intArray);

    default void calculate(List<int[]> list) {
        list.stream().forEach(ints -> calculate(ints));
    }

}
