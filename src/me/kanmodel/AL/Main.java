package me.kanmodel.AL;

import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import me.kanmodel.AL.contents.First;

import java.lang.reflect.Array;
import java.util.Arrays;

import static me.kanmodel.AL.assist.getRandomArray;

public class Main {

    /**
     * 测试用
     * @param args 输入
     */
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

//        System.out.println(StdIn.isEmpty());
//        System.out.println(2.0e2);
//        System.out.println(2.0e-6 * 100000000.1);
//        System.out.println((1 + 2.236) / 2);
//        System.out.println((4.1 >= 4));
//        System.out.println(1 + 2 + "3");
        System.out.println(Integer.toBinaryString(10));
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
}
