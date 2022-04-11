package hijava.oop;

import hijava.practice.Man;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Man> people = new ArrayList<>(9);

        for(int i = 0 ; i < 9 ; i++){
            Man m = new Man("김" + (i + 1) + "수");
            m.buyCoffee(1);
            people.add(m);
            System.out.println(people.get(i));
        }

    }
}
