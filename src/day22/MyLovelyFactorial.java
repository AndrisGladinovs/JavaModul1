package day22;

public class MyLovelyFactorial {
    public static void main(String[] args) {
        System.out.println(getFactorial(7)); // 120 * 6 * 7
        System.out.println(getFactorial(5)); // result 120

        System.out.println(getFactorialRecursion(7));
        System.out.println(getFactorialRecursion(5));
    }

    private static int getFactorialRecursion(int number) {
        // 100 ! = 99! *100;
        // 7! = 6! *7;
        if (number < 1) {
            return 1;
        } else {
            return number * getFactorialRecursion(number - 1);
        }
    }

    private static int getFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}
