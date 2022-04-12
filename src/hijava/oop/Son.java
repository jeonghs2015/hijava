package hijava.oop;

public class Son extends Mom{
    @Override
    protected void eat() {
        super.eat();
    }

    @Override
    protected void say() {
        System.out.println("엄마~");
    }
}
