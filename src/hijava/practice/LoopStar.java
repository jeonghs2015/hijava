package hijava.practice;

public class LoopStar {
    public static void main(String[] args) {
        //makeStar();
        //two99dan();
        ggoggal();
    }

    private static void ggoggal(){
        for(int i = 1;i <= 4;i++){

            for(int j = 1;j <= 4-i;j++){
                System.out.print(' ');
            }

            for(int j = 1; j <= 2 * i - 1; j++ ){
                System.out.print('*');
            }

            System.out.println();
        }


    }

    private static void two99dan(){
            for (int i = 1; i < 10; i++) {
                if(i % 2 == 0) {
                    for (int j = 1; j < 10; j++) {
                        System.out.println(i + " * " + j + " = " + j * j);
                    }
                    System.out.println("----------------------");
                }
            }
    }
    private static void makeStar(){
        int line = 10;
        for(int i = 1;i <= line ; i++){
            for(int j = 1;j <= line - i; j++){
                System.out.print(' ');
            }
            for(int k = 1;k <= i;k++){
                System.out.print("*");
            }
            System.out.println();

        }

    }

}
