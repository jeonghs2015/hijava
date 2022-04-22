package hijava.oop;

import hijava.practice.Man;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        netsport();
        //animal();
        //weight();
        // al();
        // momAndSon();
        //koreanAndAmerican();
        // eatTest();
        /*AbstSuper sp = new AbstChild();
        int i = 5;
        int j =10;
        System.out.println("min = " + sp.min(i, j));
        System.out.println("max = " + sp.max(i, j));*/

    }

    private static void netsport() {
        NetSport pp = new PingPong();
        NetSport te = new Tennis();
        NetSport vb = new VolleyBall();
        System.out.println("PingPong");
        pp.play();
        System.out.println("--------------------");
        System.out.println("Tennis");
        te.play();
        System.out.println("--------------------");
        System.out.println("VolleyBall");
        vb.play();
        System.out.println("--------------------");
    }

    private static void animal(){
        Animal dog = new Dog();
        Animal cat = new Cat();
        barkAnimal(dog);
        barkAnimal(cat);
    }

    private static void barkAnimal(Animal ani) {
        ani.bark();
    }

    private static void weight(){
        Weight guen = new Guen();
        Weight pound = new Pound();
        int cnt = 5;
        System.out.println("Guen = " + guen.getGram(cnt));
        System.out.println("Pound = " + pound.getGram(cnt));
    }

    private static void eatTest() {
        Man korean = new Korean("홍길동");
        American american = new American("John");

        eat(american);
        eat(korean);

    }

    private static void eat(Man m){
        if(m instanceof Korean){
            ((Korean)m).eatRice();
        } else if(m instanceof American){
            ((American)m).eatBread();
        } else{
            System.out.println("해당 인스턴스가 없습니다!");
        }
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
