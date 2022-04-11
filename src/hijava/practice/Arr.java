package hijava.practice;

public class Arr {
    public static void main(String[] args) {
       // ex1();
       // ex2();
       // ex3();
       // ex4();
        ex5();

    }

    private static void ex5() {
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {1, 2, 3, 4, 5};
        //System.arraycopy(from, startIndex, to, startIndex, count)
        System.arraycopy(arr1,0, arr2, 2, 3);

        for (int a : arr2){
            System.out.println(a);
        }
    }

    private static void ex4() {
        Man arr3[] = new Man[9];
        for(int i = 0; i < arr3.length; i++){
            Man message =  new Man("김"+(i+1)+"수");
            arr3[i] = message;
        }
        Man arr4[] = new Man[9];
        for(int i = 0; i < arr3.length; i++){
            //arr4[i] = arr3[i];  //shallow copy (얕은 복사)
            arr4[i] = new Man(arr3[i].getName());   //deep copy (깊은 복사) - clone
        }

        arr3[0].setName("정호석");
        for (Man man : arr4){
            System.out.println(man);
        }
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
