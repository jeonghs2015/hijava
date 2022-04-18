package hijava.oop;

import hijava.practice.Man;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // al();
        momAndSon();
        //koreanAndAmerican();

    }

    private static void koreanAndAmerican() {
        Man korean = new Korean("홍길동");
        American american = new American("John");

        sayHi(korean);
        sayHi(american);

       // korean.sayHello();
       // american.sayHello();
        // dfdf
    }

    private static void sayHi(Man man) {
        man.sayHello();
    }

    private static void momAndSon() {
        Mom mom = new Mom();
        Mom son = new Son();

        mom.say();
        son.say();
        eat(mom);
        eat(son);
    }

    private static void eat(Mom m){
        if(m instanceof Son)
            m = (Son)m;

        if(m instanceof Son) {
            System.out.println("먹어라 아들~");
        }else if (m instanceof Mom){
            System.out.println("드세요 엄마~");
        } else {
            System.out.println("누구신진 모르겠지만 드세요~");
        }
    }

    private static void al() {
        ArrayList<Man> people = new ArrayList<>(9);

        for(int i = 0 ; i < 9 ; i++){
            Man m = new Man("김" + (i + 1) + "수");
            m.buyCoffee(1);
            people.add(m);
            System.out.println(people.get(i));
        }
    }
}
