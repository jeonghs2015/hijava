package hijava.practice;

public class Arr {
    public static void main(String[] args) {
       // ex1();
       // ex2();
        ex3();

    }

    private static void ex3() {
        Man arr3[] = new Man[9];
        for(int i = 0; i < arr3.length; i++){
            Man message =  new Man("김"+(i+1)+"수");
            arr3[i] = message;
            //System.out.println(i + " 반 = " + arr3[i]);
        }
        for (Man man : arr3){
            System.out.println(man);
        }
    }

    private static void ex2() {
        String[] arr2 = new String[100];
        for(int i = 0; i < arr2.length;i++){
            arr2[i] = "나는 숫자"+(i+1)+"입니다";
            System.out.println("["+i+"] - "+arr2[i]);
        }
    }


    private static int ex1(){
        int arr1[] = new int[100];
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = i + 1;
            System.out.println("["+i+"] = "+ arr1[i]);
        }
        return 0;
    }
}
