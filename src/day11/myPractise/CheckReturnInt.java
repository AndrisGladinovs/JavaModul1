package day11.myPractise;

public class CheckReturnInt {
    public static void main(String[] args) {
        int a = 2;
        int b = 20;
        System.out.println(calculations(a, b));
    }

    private static int calculations(int start, int end) {
        int result = 0;
        for (int i = start; i < end; i++) {
            if (i % 2 == 0) {
                result = i;
            }

        }
        return result;
    }
}
