package hijava.oop;

public class Son extends Mom{

    public Son(){
        super("아들이름");
    }
    public Son(String name){
        super("아들이름");
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void say() {
        System.out.println("엄마~");
    }

    public void ttt(){
        System.out.println("ttt");
    }
}
