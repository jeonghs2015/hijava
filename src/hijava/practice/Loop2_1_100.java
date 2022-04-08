package hijava.practice;

public class Loop2_1_100 {

    public static void main(String[] args) {
        //sumByWhile();
        sumByFor();

    }
    private static void sumByWhile(){
        int i = 0;
        int j = 0;
        while(++i < 101){
            if(i % 2 == 0)
                continue;

            j += i;
            System.out.println("j의 값은 = " + j);
            System.out.println("i의 값은 = " + i);
            System.out.println("------------------ ");
        }
    }

    private static void sumByFor(){
        int total = 0;
        for(int i = 1;i<101;i++){
            total = total + i;
            System.out.println("현재 i 의 값은 = " + i);
            System.out.println("total 값은 = " + total);
            System.out.println("------------------ ");

        }
    }
}
