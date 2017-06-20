package me.kanmodel.AL;

import java.util.Arrays;

/**
 * Created by kgdwhsk on 2017/6/20.
 *
 */
public class assist {

    /**
     *
     * @param amount 数组元素个数
     * @param showOriginalArray 是否输出数组
     * @param showSortedArray 是否输出整理后的数组
     * @param range 从1到range的范围生成数组
     * @return 一维数组
     */
    public static int[] getRandomArray(int amount , boolean showOriginalArray , boolean showSortedArray ,int range){
        int[] a = new int[amount];
        for (int i = 0; i < amount; i++){
//            a[i] = (int) Math.round(Math.random() * range);四舍五入
            a[i] = (int) Math.ceil(Math.random() * range);//取整
        }
        if (showOriginalArray) {
            for (int ai:a) {
                System.out.print(ai + " ");
            }
        }
        System.out.println();
        Arrays.sort(a);
        if (showSortedArray){
            for (int ai:a) {
                System.out.print(ai + " ");
            }
        }
        return a;
    }

    /**
     *
     * @param amount 数组元素个数
     * @param showOriginalArray 是否输出数组
     * @param showSortedArray 是否输出整理后的数组
     * @return 一维数组
     */
    public static int[] getRandomArray(int amount,  boolean showOriginalArray , boolean showSortedArray){
        return getRandomArray(amount, showOriginalArray, showSortedArray, 100);
    }

    /**
     * 产生一个1-100指定个数的一维数组
     * @param amount 一维数组的个数
     * @return 一个随机一维数组
     */
    public static int[] getRandomArray(int amount){
        return getRandomArray(amount, true, true);
    }

    /**
     * 产生一个1-100指10个元素的一维数组
     * @return 一维数组
     */
    public static int[] getRandomArray(){
        return getRandomArray(10);
    }
}
