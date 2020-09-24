package day11.myPractise;

public class EvenNumbers {
    public static void main(String[] args) {
        // Najto chetnie chisla
        // Najti nechetnie chisla
        int start = 1;
        int end = 50;
        findEven(start, end);


    }

    private static void findEven(int start, int end) {
        for (int i = start; i < end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }
    }
}
