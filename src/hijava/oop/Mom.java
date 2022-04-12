package hijava.oop;

public class Mom {
    protected String name;

    public Mom(String name){
        this.name = name;
    }
    
    public Mom(){
        this("엄마이름");
        //this.name = "엄마이름";
    }

    public String getName(){
        return this.name;
    }
    
    public void eat(){
        System.out.println("냠냠");
    }
    
    public void say(){
        System.out.println("밥먹어라~");
    }
}
