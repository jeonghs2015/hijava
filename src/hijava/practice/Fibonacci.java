package hijava.practice;

import java.util.Arrays;

public class Fibonacci {

    public static void main(String[] args) {
        int inum = 10;
        for(int i = 0;i <= inum;i++){
            System.out.print(fibo(i) + "  ");

        }

    }
    private static int fibo(int num){
        // 1번 방법
        if(num <= 1) return num;
        return fibo(num - 1) + fibo(num - 2);
        // 2번 방법
        // if(num > 1)
        //  return fibo(num - 1) + fibo(num - 2);
        // else
        //  return num;
    }
}
