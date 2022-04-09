package hijava.practice;

public class School {
    public static void main(String[] args) {
        Score korean = new Score();
        korean.setSubject("국어");
        korean.setScore(90);
        korean.prof = "교수님";
        Student jeong = new Student();
        jeong.setTel("010-1234-5678");


        Score english = new Score("영어", 96);
        Score science = new Score("과학");
        //String kor = korean.toString();
        System.out.println(korean);
        System.out.println(korean.prof);
        System.out.println(english);
        System.out.println(science);
        System.out.println(jeong);

    }
}
