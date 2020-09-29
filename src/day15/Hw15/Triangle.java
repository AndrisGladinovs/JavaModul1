package day15.Hw15;

public class Triangle {
    public static void main(String[] args) {

        String star = "*";
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(star);

            }
            for (int k = 1; k < -3; k--) {
                for (int l = 1; l < -3 ; l++) {
                    System.out.println(star);

                }
            }
            System.out.println();
        }
         {

        }
    }
}

