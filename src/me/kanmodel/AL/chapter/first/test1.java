package me.kanmodel.AL.chapter.first;

import edu.princeton.cs.algs4.ST;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;

import static java.security.AccessController.doPrivileged;
import static me.kanmodel.AL.assist.getRandomArray;
import static me.kanmodel.AL.assist.showArray;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: kgdwhsk
 * Date: 2017-06-23
 * Time: 22:52
 */
public class test1 {
    /**
     * 第一章第一节各种测试
     * @param args nothing
     */
    public static void main(String args[]){
        //1
        System.out.println( (0 + 15) / 2 );
        System.out.println( 2.0e-6 * 100000000.1 );
        System.out.println( true && false || true && true );
        //2
        System.out.println( (1 + 2.236) / 2 );
        System.out.println( 1 + 2 + 3 + 4.0);
        System.out.println( 4.1 >= 4);
        System.out.println( 1 + 2 + "3");
        //3
        int t3[] = {3, 3 , 1};
        testEqual3(t3);
        //5
        double x = 0.1;
        double y = -0.3;
        System.out.println( x < 1 && x > 0 && y < 1 && y > 0 ? true : false);
        //6
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++){
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
        //8
        System.out.println((char) ('a' + 4));
        //9
        stringToBinary();
        //14
        System.out.println(lg(255));
        System.out.println(Math.log(256) / Math.log(2));
        //15
        showArray(histogram(getRandomArray(20, false, true, 10), 10));
        //16
        System.out.println(exRl(6));
        //anything else
        System.out.println(-.01);
//        stdDrawTest1();
//        stdDrawTest2();
//        stdDrawTest3();
//        int N = 100;
//        StdDraw.setXscale(0, N);
//        StdDraw.setYscale(0, N * N);
//        StdDraw.setPenRadius(.01);
//        StdDraw.circle(.5, .5, 0.1);
        boolean bl[][] = {{true, false}, {true ,true}, {true ,true, false}, {true ,true, false}};
        System.out.println(bl.length + " " + bl[1].length);
        System.out.println(doPrivileged((PrivilegedAction<String>) () -> System.getProperty("user.name")));
        new Thread( () -> System.out.println("In Java8, Lambda expression rocks !!") ).start();
    }

    public static int[] histogram(int[] a, int M){
        int[] b = new int[M];
        int count = 0;
        for (int i = 0; i < M; i++){
            int sumTemp = 0;
            for (int amount : a){
                if (amount == i){
                    sumTemp++;
                }
            }
            b[i] = sumTemp;
            count += sumTemp;
        }
        System.out.println(count);
        return b;
    }

    @NotNull
    public static String exRl(int n){
        if (n <= 0) return  "";
        return exRl(n - 3) + exRl(n - 2) + n;
    }

    /**
     *
     * @param N 对数的真数
     * @return log2的结果
     */
    @Contract(pure = true)
    public static int lg(int N){
        int temp = 1;
        for (int i = 0; i < N; i++){
            for (int j = 0; j < i; j++){
                temp *= 2;
                if (temp > N){
                    return i - 1;
                }
            }
            temp = 1;
        }
        return 0;
    }

    public static void testEqual3(int args[]){
//        if (args[0] == args[1]){
//            if (args[1] == args[2]){
//                System.out.println("equal");
//            }else {
//                System.out.println("not equal");
//            }
//        }else {
//            System.out.println("not equal");
//        }
//        if (args[0] == args[1]){
//            if (args[1] == args[2]){
//                System.out.println("equal");
//                return;
//            }
//        }
//        System.out.println("not equal");
        System.out.println( args[0] == args[1] ? args[1] == args[2] ? "equal" : "not equal" : "not equal");
//        System.out.println( args[0] == args[1] ? (args[1] == args[2] ? "equal" : "not equal") : "not equal");
    }

    public static void stringToBinary(int N){
        String s = "";
        for (int n = N; n > 0; n /= 2){
            s = (n % 2) + s;
        }
        System.out.println(s);
    }

    public static void stringToBinary(){
        stringToBinary(10);
    }

    public static void stdDrawTest1(){
        int N = 100;
        StdDraw.setXscale(0, N);
        StdDraw.setYscale(0, N * N);
        StdDraw.setPenRadius(.01);
        for (int i = 1; i <= N; i++){
            StdDraw.point(i, i);
            StdDraw.point(i, i * i);
            StdDraw.point(i, i * Math.log(i));
        }
    }

    public static void stdDrawTest2(){
        int N = 50;
        double[] a = new double[N];
        for (int i = 0; i < N ; i++){
//            a[i] = StdRandom.random();
            a[i] = StdRandom.uniform();
        }
        for (int i = 0; i < N; i++){
            double x = 1.0 * i / N;
            double y = a[i] / 2.0;
            double rw = 0.5 / N;
            double rh = a[i] / 2.0;
            StdDraw.filledRectangle(x, y, rw, rh);
        }
    }

    public static void stdDrawTest3(){
        int N = 50;
        double[] a = new double[N];
        for (int i = 0; i < N; i++){
            a[i] = StdRandom.uniform();
        }
        Arrays.sort(a);
        for (int i = 0; i < N; i++){
            double x = 1.0 * i / N;
            double y = a[i] / 2.0;
            double rw = 0.5 / N;
            double rh = a[i] / 2.0;
            StdDraw.filledRectangle(x, y, rw, rh);
        }
    }
}

/**
 * 19斐波那契
 */
class Fibonacci{
    private static ArrayList<Integer> list = new ArrayList<>();
    public static long F(int N){//todo 斐波那契数列完善
        if (N < list.size()){
            if (N - 1 <= 0) {
                return 0;
            }
            return list.get(N - 1) + list.get(N - 2);
        }else {
            if (N == 0) {
                list.add(0);
                return 0;
            }
            if (N == 1){
                list.add(1);
                return 1;
            }
        }
        return F(N - 1) + F(N - 2);
    }
    public static long FO(int N){
        if (N == 0) return 0;
        if (N == 1) return 1;
        return FO(N - 1) + FO(N - 2);
    }
    public static void main(String[] args){
        for (int N = 0; N < 100; N++)
//            StdOut.println(N + " " + F(N));
            StdOut.println(N + " " + FO(N));
    }
}
