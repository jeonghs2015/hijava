package hijava.practice;

import java.time.Clock;

public class Cbvr {
    int m = 3;
    String st = "test";
    public static void main(String[] args) {
       /* int i = 1;
        System.out.println("i1 = " + i);
        change1(i);
        System.out.println("i2 = " + i);*/

        Cbvr cb = new Cbvr();
        System.out.println("cb1 = " + cb.st);
        change2(cb);
        System.out.println("cb2 = " + cb.st);
    }

    public static void change2(Cbvr cb){
        cb.st = cb.st + "100";
    }

    public static void change1(int x){
        System.out.println("x = " + x);
        x = 100;
    }


}
