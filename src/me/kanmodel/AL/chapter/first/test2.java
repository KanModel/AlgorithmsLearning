package me.kanmodel.AL.chapter.first;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Out;
import org.jetbrains.annotations.Contract;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: kgdwhsk
 * Date: 2017-07-05
 * Time: 10:35
 */
public class test2 {
    public static void main(String args[]){
        String a[] = {"ace", "zaa"};
        System.out.println(isSorted(a));
        System.out.println(System.getProperty("user.dir"));
        Cat.main(new String[]{"res\\in1.txt"
                , "res\\in2.txt"
                , "res\\out.txt"});
    }

    @Contract(pure = true)
    public static boolean isSorted (String[] a){
        for (int i = 1; i < a.length; i++){
            System.out.println(a[i - 1].compareTo(a[i]));
            if (a[i - 1].compareTo(a[i]) > 0){
                return false;
            }
        }
        return true;
    }
}

class Cat{
    public static void main(String[] args){
        Out out = new Out(args[args.length - 1]);
        for (int i = 0; i < args.length - 1; i++){
            In in = new In(args[i]);
            String s = in.readAll();
            out.println(s);
            in.close();
        }
        out.close();
    }
}
