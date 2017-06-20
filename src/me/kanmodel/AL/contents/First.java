package me.kanmodel.AL.contents;

import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.StdOut;

import static me.kanmodel.AL.assist.getRandomArray;

/**
 * Created by kgdwhsk on 2017/6/20.
 * 第一个算法
 */
public class First {
    /**
     * 二分法示例
     * 随机生成2个数组
     * b为白名单
     * a的元素在b中不存在时输出
     * @param args 输入
     */
    public static void main(String args[]){
        int[] a = getRandomArray(10 ,false ,true, 10);
        System.out.println();
        int[] b = getRandomArray(10 ,false ,true, 10);
        System.out.println();
        for (int i = 0; i < 10; i++){
            int key = a[i];
            if (BinarySearch.indexOf(b, key) < 0){
                StdOut.println(key);
            }
        }
    }
}
