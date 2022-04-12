package hijava.practice;

public class Man {
    public static final int COFFEE = 3000;
    public static final int DONUT = 2500;
    private String name;
    private int amount;

    public static void main(String[] args) {
        Man hong = new Man("hong");
        Man john = new Man("john");

        hong.buyCoffee(2);
        hong.buyDonut(1);
        john.buyCoffee(1);
        john.buyDonut(2);
        System.out.println(hong);
        System.out.println(john);

    }
    public Man(){
        this.amount = 10000;
    }
    public Man(String name){
        this();
        this.name = name;
    }

    public void sayHello() {
        System.out.println("안녕하세요.");
        System.out.println("제 이름은 "+ this.getName() +"입니다.");
    }

    public void buyCoffee(int count){
        //this.amount -= COFFEE * count;
        this.subAmount(COFFEE, count);
    }
    public void buyDonut(int count){
        //this.amount -= DONUT * count;
        this.subAmount(DONUT, count);
    }
    private void subAmount(int price, int count){
        this.amount -= price * count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Man { " +
                name + "님의" +
                "잔액 = " + amount +
                " }";
    }
}
