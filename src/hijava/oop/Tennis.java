package hijava.oop;

public class Tennis extends NetSport{
    @Override
    public void serve() {
        System.out.println("red team Service!");
    }

    @Override
    public void hit() {
        System.out.println("blue team Stroke!!!");
    }

    @Override
    public void score() {
        System.out.println("blue team point 1 Get!!!");
    }
}
