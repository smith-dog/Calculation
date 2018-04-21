package com.hunter.algorithm.impl;

import com.hunter.algorithm.Algorithm;
import com.sun.deploy.util.ArrayUtil;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 优化过的快速排序，与普通快排有所不同
 * 1序列长度小于8采用插入排序
 * 2基准值三位取中
 * Created by hunter on 2017/8/19.
 */
public class BetterQuickSort implements Algorithm {
    @Override
    public void calculate(int[] intArray) {
        //当序列分割到一定程度的时候，采取插入排序
        //基准值采用三位取中
        //相同元素聚合
        //尾递归优化

    }

    @Test
    public void test() {
    }

    class ListNode {
        int val;
        ListNode nextNode;

        ListNode(int val) {
            this.val = val;
            this.nextNode = null;
        }
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        while (listNode.nextNode != null) {
            arrayList.add(listNode.val);
            listNode = listNode.nextNode;
        }
        Collections.reverse(arrayList);
        return arrayList;

    }


}
