package day11.myPractise;

public class NotEvenNumbers {
    public static void main(String[] args) {
        int start = 1;
        int end = 30;
        notEven(start, end);
    }

    private static void notEven(int start, int end) {
        for (int i = start; i < end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + ", ");
            }

        }
    }
}
