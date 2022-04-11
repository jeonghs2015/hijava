package hijava.practice;

public class doubleArr {
    public static void main(String[] args) {
        arr1();
    }

    private static void arr1() {
        String[][] alphabet = new String[2][26];
        char ca = 'A';
        for(int i = 0; i < alphabet.length ; i++){
            for(int j = 0 ; j < alphabet[i].length; j++,ca++){

                if(ca > 90 && ca < 98)
                    ca += 6;

                    System.out.print(ca);

            }
            System.out.println();
        }
    }

}
