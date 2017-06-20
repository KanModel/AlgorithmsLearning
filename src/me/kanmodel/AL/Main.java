package me.kanmodel.AL;

import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.StdOut;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        System.out.println("验证p q最大公因数：");
//        System.out.println(gcd(77,22));
//        System.out.println(gcd(22,77));
//        double a[] = new double[3];
//        System.out.println(a[1]);
//        for (double aa : a)
//            System.out.println(aa);
//        Math.abs(3);
        StdOut.println(233);
        int[] a = getRandomArray(10 ,false ,true);
        System.out.println();
        int[] b = getRandomArray(10 ,false ,true);
        System.out.println();
        for (int i = 0; i < 10; i++){
            int key = a[i];
            if (BinarySearch.rank(key, b) < 0){
                StdOut.println(key);
            }
        }
    }

    /**
     * 欧几里德算法
     * 求最大公因数
     * @param p 数1
     * @param q 数2
     * @return 最大公因数
     */
    public static int gcd(int p, int q){
        if (q == 0) return p;
        int r = p % q;
        return gcd(q ,r);
    }

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
            a[i] = (int) Math.round(Math.random() * range);
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
     * @return
     */
    public static int[] getRandomArray(){
        return getRandomArray(10);
    }
}
