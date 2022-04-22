package hijava.oop;

public abstract class SoftWare {
    public abstract void plan();
    public abstract void develop();
    public abstract void release();

    void product() { // 자식들에게 쓸수 있게 할때 앞에 생략합니다. -> 기본 접근자
        plan();
        develop();
        release();
    }
}
