package hijava.practice;

public class Prime {
    public static void main(String[] args) {
        int total = 0;

        for(int num = 2; num <= 100; num++){

            if (isPrime(num))
                total += num;
            else
                System.out.println(num + " is Not Prime Number!!");

        }

        System.out.println("Total is " + total);
    }

    //소수를 찾아내는 함수
    private static boolean isPrime(int num) {
        for(int j = 2; j < num; j++){
            if(num % j == 0){
                return false;
            }
        }
        return true;
    }
}
