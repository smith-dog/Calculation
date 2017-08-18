package com.hunter.cal;

import com.hunter.algorithm.Algorithm;
import com.hunter.algorithm.SimpleSelectionSort;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Travelsky on 2017/8/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
@Component
public class Calculation {
    //源数组
    private  static final List<int[]> minSourceList = new ArrayList<>();
    private  static final List<int[]> midSourceList = new ArrayList<>();
    private  static final List<int[]> maxSourceList = new ArrayList<>();

    //定义随机数组长度
    private static final int MIN_LENGTH = 5;
    private static final int MID_LENGTH = 10;
    private static final int MAX_LENGTH = 20000;

    //定义每个数字的大小
    private static final int NUMBER_LENGTH = 100;

    @Autowired
    @Qualifier("insertSort")
    Algorithm insertSort;

    @Autowired
    @Qualifier("bubbleSort")
    Algorithm bubbleSort;

    @Autowired
    @Qualifier("shellSort")
    Algorithm shellSort;

    @Autowired
    @Qualifier("simpleSelectionSort")
    Algorithm simpleSelectionSort;

    @Autowired
    @Qualifier("secondSelectionSort")
    Algorithm secondSelectionSort;

    @BeforeClass
    public static void init(){
        //加载容器，用到AOP
        //初始化源随机数组

        genOriginArray(minSourceList, MIN_LENGTH);
        genOriginArray(midSourceList, MID_LENGTH);
        genOriginArray(maxSourceList, MAX_LENGTH);
    }

    @Test
    public void testCal() {

        genArrayAndCal(insertSort);
        genArrayAndCal(shellSort);
        genArrayAndCal(bubbleSort);
        genArrayAndCal(simpleSelectionSort);
        genArrayAndCal(secondSelectionSort);

    }

    private void genArrayAndCal(Algorithm algorithm) {
        //生成随机的数组序列
        List<int[]> minList = genArray(minSourceList);
        List<int[]> midList = genArray(midSourceList);
        List<int[]> maxList = genArray(maxSourceList);
        algorithm.printName();
        //algorithm.calculate(minList);
        //minList.stream().forEach(ints -> System.out.println(Arrays.toString(ints)));
        //algorithm.calculate(midList);
        //midList.stream().forEach(ints -> System.out.println(Arrays.toString(ints)));
        algorithm.calculate(maxList);
        //maxList.stream().forEach(ints -> System.out.println(Arrays.toString(ints)));
    }

    /**
     * 从源数组中copy一个新数组
     * @return
     */
    private static List<int[]> genArray(List<int[]> originList) {
        List<int[]> copyList = new ArrayList<>();
        originList.stream().forEach(ints -> copyList.add(Arrays.copyOf(ints,ints.length)));
        return copyList;
    }

    /**
     * 原数组初始化方法
     * @param list
     * @param length
     */
    private static void genOriginArray(List<int[]> list,int length) {
        for(int i = 0; i < 10 ; i++) {
            int[] n = new int[length];
            for(int j = 0 ;j <length ; j++) {
                n[j] = (int)(Math.random()*NUMBER_LENGTH);
            }
            list.add(n);
        }
    }

    /**
     * 源数组初始化方法
     * @param length
     * @return
     */
    private static List genOriginArray(int length) {
        List<int[]> list = new ArrayList<>();
        genOriginArray(list,length);
        return list;
    }


    public void setInsertSort(Algorithm insertSort) {
        this.insertSort = insertSort;
    }

    public void setBubbleSort(Algorithm bubbleSort) {
        this.bubbleSort = bubbleSort;
    }

    public void setShellSort(Algorithm shellSort) {
        this.shellSort = shellSort;
    }

    public void setSimpleSelectionSort(SimpleSelectionSort simpleSelectionSort) {
        this.simpleSelectionSort = simpleSelectionSort;
    }
}


