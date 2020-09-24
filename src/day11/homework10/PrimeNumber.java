package day11.homework10;

public class PrimeNumber {
    public static void main(String[] args) {
        findPrimeNumber(1, 10);
    }

    private static void findPrimeNumber(int a, int b) {
        for (int i = a; i <= b; i++) {

            for (int j = 2; j < i; j++) {
                if (i % j == 0 ) {
                    System.out.println("Eto ne prajm " + i);

                }

            }

        }
    }
}
