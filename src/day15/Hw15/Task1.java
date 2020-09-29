package day15.Hw15;

public class Task1 {
    public static void main(String[] args) {
        // Sdelatj treugoljnik iz zvezdochek
        String star = "*";
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(star);

            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <=5 ; j++) {
                System.out.print(star);

            }
            System.out.println();
        }
    }
}
