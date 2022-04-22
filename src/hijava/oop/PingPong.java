package hijava.oop;

public class PingPong extends NetSport {

    @Override
    public void serve() {
        System.out.println("red team Service!");
    }

    @Override
    public void hit() {
        System.out.println("blue team Smash!!!");
    }

    @Override
    public void score() {
        System.out.println("blue team point 1 Get!!!");
    }
}
