package me.kanmodel.AL.chapter.first;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: kgdwhsk
 * Date: 2017-06-23
 * Time: 22:52
 */
public class test1 {
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
