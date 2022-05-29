package hijava.oop;
//추상클래스 생성
public class WebSite extends SoftWare{
    @Override
    public void plan() {
        System.out.println("Site 기획");
    }

    @Override
    public void develop() {
        System.out.println("Site 개발");
    }

    @Override
    public void release() {
        System.out.println("Site 출시(deploy 배포)출시");
    }
}