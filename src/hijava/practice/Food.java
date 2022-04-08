package hijava.practice;

public class Food {
    String menu;
    int price;


    public Food(String menu, int price){
        this.menu = menu;
        this.price = price;

    }
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Food)) {
            return false;
        }
        Food c = (Food) o;

        return CharSequence.compare(menu, c.menu) == 0
                && Integer.compare(price, c.price) == 0;
    }


    public static void main(String[] args){
        Food pizza1 = new Food("cheese", 17_000);
        Food pizza2 = new Food("cheese", 17_000);
        Food pizza3 = new Food("정호석", 17_000);
        System.out.println(pizza1.equals(pizza2));
        System.out.println("pizza1 hash: " + pizza1.hashCode());
        System.out.println("pizza2 hash: " + pizza2.hashCode());
        System.out.println("정호석 hash: " + pizza3.hashCode());

    }
}
