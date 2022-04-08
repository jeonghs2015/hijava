package hijava.practice;

public class Loop1 {
    public static void main(String[] args) {
        int i = 0;

        while(i++ < 10){
            if(i % 2 == 0)
                continue;
            System.out.println("현재 값은 " + i);
        }
    }
}
