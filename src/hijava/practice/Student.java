package hijava.practice;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Student {
    private String name;
    private int age;
    private String stuNo;
    private String address;
    private String tel;
    private String email;

//생성자 함수
    public Student(){

    }
    public Student(String name){
        this.name = name;
    }
//--------------------------------
// 나이 getter, setter
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//---------------------------------
//주소 getter, setter
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
//---------------------------------
//전화번호 getter, setter
//010-1111-2222 -> 010-****-****
    public String getTel() {
        if(this.tel == null){
            return tel;
        }else{
            return tel.substring(0, tel.length() - 4);
        }

    }

    public void setTel(String tel) {
        this.tel = tel;
    }
//---------------------------------
//이메일 getter, setter
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
//---------------------------------
//학번 getter, setter
    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }
// toString 메소드
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", stuNo='" + stuNo + '\'' +
                ", address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
