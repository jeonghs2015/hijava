package hijava.practice;

public class Oper {
    public static void main(String[] args) {
        int i = 0;
        System.out.println(i);
        i++;
        System.out.println(i);
        i--;
        System.out.println(i);
        System.out.println(i++);
        System.out.println(++i);
        System.out.println(--i);
        System.out.println(--i);
        System.out.println(--i);
        // 비트 연산자
        System.out.println(5&10);   //AND
        System.out.println(5|10);   //OR
        System.out.println(5^10);   //XOR
        System.out.println("reversal : "+~(-5));   //reversal
        System.out.println(5<<2);   //<< 쉬프트 연산자
        System.out.println(5>>2);   //>> 쉬프트 연산자
        System.out.println(5>>>2);   //>>> 쉬프트 연산자

        String s = (i > 0) ? "양수" : "음수";
        System.out.println(s);
    }
}
