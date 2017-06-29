package me.kanmodel.AL.chapter.first;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;
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
import static me.kanmodel.AL.chapter.first.test1.doAdd;

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
        //18
        System.out.println(mystery(2, 25));
        System.out.println(mystery(3, 11));
        //19
        Fibonacci.main(args);
        //20 todo 非递归使用
        System.out.println(lnN(3));
        //21
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

    public static double lnN(int n){
        int result = 1;
        for (int i = 1; i < n+1; i++){
            result *= i;
        }
        System.out.println(result);
        return Math.log(result);
    }

    public static int mystery(int a, int b){
        if (b == 0) return 0;
        if (b % 2 == 0) return mystery(a + a, b / 2);
        return mystery(a + a, b / 2) + a;
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

    /**
     *
     * @param a 加数字符串1
     * @param b 加数字符串2
     * @return 结果字符串
     * 分析：
     * 1、取得两个字符串的长度
     * 2、把两个的长度做比较，并得出较长的长度，及较短的长度
     * 3、把长度较短的加数字符串，在左面补0，使之与较长的字符串一样长
     * 4、从最高位，一个个数的取出来相加，当然首先得转换为整型
     * 5、设置进位，如果两个数相加及加上进位大于等于10，并且这不是最左边一个字符相加，相加结果等于
     *    （取出1＋取出2＋进位）－10，并把进位设为1；如果没有大于10，就把进位设为0，如些循环，把
     *    相加的结果以字符串的形式结合起来，就得到最后的结果
     *
     *    转自http://blog.csdn.net/fenglibing/article/details/1756773
     */
    public static String doAdd(String a,String b)
    {
        String str="";
        int lenA=a.length();
        int lenB=b.length();
        int maxLen=(lenA>lenB) ? lenA : lenB;
        int minLen=(lenA<lenB) ? lenA : lenB;
        String strTmp="";
        for(int i=maxLen-minLen;i>0;i--)
        {
            strTmp+="0";
        }
        //把长度调整到相同
        if(maxLen==lenA)
        {
            b=strTmp+b;
        }else
            a=strTmp+a;
        int JW=0;//进位
        for(int i=maxLen-1;i>=0;i--)
        {
            int tempA=Integer.parseInt(String.valueOf(a.charAt(i)));
            int tempB=Integer.parseInt(String.valueOf(b.charAt(i)));
            int temp;
            if(tempA+tempB+JW>=10 && i!=0)
            {
                temp=tempA+tempB+JW-10;
                JW=1;
            }
            else
            {
                temp=tempA+tempB+JW;
                JW=0;
            }
            str=String.valueOf(temp)+str;
        }
        return str;
    }
}

/**
 * 19斐波那契
 */
class Fibonacci{
    private static ArrayList<Long> list = new ArrayList<>();
    private static ArrayList<String> slist = new ArrayList<>();

    public static String F2(int N){
        if (N < slist.size()){
            return slist.get(N);
        }else {
            if (N == 0) {
                slist.add(String.valueOf(0));
                return slist.get(0);
            }
            if (N == 1){
                slist.add(String.valueOf(1));
                return slist.get(1);
            }
        }
//        slist.add((F2(N - 1) + F2(N - 2)));
        slist.add(doAdd(F2(N - 1), F2(N - 2)));
        return slist.get(N);
    }

    /**
     * 第一个版本，会超出Long类型上限
     * @param N 斐波那契数列第N个数
     * @return 斐波那契数列第N个数
     */
    public static long F1(int N){
        if (N < list.size()){
            return list.get(N);
        }else {
            if (N == 0) {
                list.add((long) 0);
                return 0;
            }
            if (N == 1){
                list.add((long) 1);
                return 1;
            }
        }
        list.add((F1(N - 1) + F1(N - 2)));
        return list.get(N);
    }

    public static long FO(int N){
        if (N == 0) return 0;
        if (N == 1) return 1;
        return FO(N - 1) + FO(N - 2);
    }

    public static void main(String[] args){
        for (int N = 0; N < 100; N++)
            System.out.println(N + " " + F2(N));
//            System.out.println(N + " " + F1(N));
//            StdOut.println(N + " " + FO(N));
//        System.out.println(F2(1005));
    }
}

class casualTest{
    public static void main(String args[]){
        String s = doAdd("723453243455535634535252345234677576252241234123523453664563634", "623453243455535634535252345234677576252241234123523453664563634");
        System.out.println(s);
        System.out.println(25 / 2);
        System.out.println(3 / 2);
        System.out.println(1 / 2);

        double sum = 0;
        int cnt = 0;
        while (!StdIn.isEmpty()){
            sum += StdIn.readDouble();
            cnt++;
        }
        double avg = sum / cnt;
        StdOut.printf("平均值： %.5f\n", avg);
    }
}

//import java.util.Arrays;
/**
 * 矩阵的直接三角分解 ，调用示例：
 *
 * DirectDecomposition dd = new DirectDecomposition(data);//data为一个二维double数组，代替一个矩阵
 *
 * double[][] l = dd.getL();//获取L
 *
 * double[][] u = dd.getU();//获取U
 *
 * @author 清雨季
 */
class DoolittleDecomposition {
    private double[][] data;
    private double[][] l;
    private double[][] u;
    private int n;
    /**
     * 创建一个n阶的矩阵
     *
     * @param data
     */
    public DoolittleDecomposition(double[][] data) {
        if (data == null || data.length == 0 || data.length != data[0].length) {
            throw new RuntimeException("不是一个方阵");
        }
        this.data = data;
        n = data.length;
        l = new double[n][n];
        u = new double[n][n];
        countLU();
    }
    protected void countLU() {
        for (int i = 0; i < n; i++) {// 第一步，计算L的第一列和U的第一行：U1i=A1i,Li1=Ai1/U11
            u[0][i] = data[0][i];
            l[i][0] = data[i][0] / u[0][0];
        }
        //计算U的第r行，L的第r列元素
        //uri=ari-Σ(k=1->r-1)lrkuki    (i=r,r+1,...,n)
        //lir=air-Σ(k=1->r-1)likukr    (i=r+1,r+2,...,n且r≠n)
        for (int r = 1; r < n; r++) {
            for (int i = r; i < n; i++) {
                u[r][i] = data[r][i] - sumLrkUki(r, i);
                if(i==r) l[r][r]=1;
                else if(r==n) l[n][n]=1;
                else l[i][r] = (data[i][r] - sumLikUkr(r, i)) / u[r][r];
            }
        }
    }
    /**
     * 求和：Lrk*Uki 对k求和：1<=k<=r-1
     *
     * @param r
     * @param i
     * @return
     */
    private double sumLrkUki(int r, int i) {
        double re = 0.0;
        for (int k = 0; k < r; k++) {
            re += l[r][k] * u[k][i];
        }
        return re;
    }
    private double sumLikUkr(int r, int i) {
        double re = 0.0;
        for (int k = 0; k < r; k++) {
            re += l[i][k] * u[k][r];
        }
        return re;
    }
    public double[][] getData() {
        return data;
    }
    public double[][] getL() {
        return l;
    }
    public double[][] getU() {
        return u;
    }
    public static void main(String[] args) {
        double[][] data= {
                {1,2,6},
                {2,5,15},
                {6,15,46},
        };
        DoolittleDecomposition dd = new DoolittleDecomposition(data);
        double[][] l = dd.getL();
        double[][] u = dd.getU();
        int n = l.length;
        System.out.println("L阵：");
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(u[i]));
        }
        System.out.println("---------------------");
        System.out.println("U阵：");
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(l[i]));
        }
    }
}

