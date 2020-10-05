package day20;

public class Excercise08_01 {
    public static void main(String[] args) {
        int[] art = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max;
        int min;
        int middle;
        int sum;
        calculateMax(art);
        calculateMin(art);
        calculateSum(art);
    }

    private static void calculateSum(int[] input) {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum = sum + input [i];
        }
        System.out.println("The sum is: ");
    }

    private static void calculateMin(int[] input) {
        int min = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] < input[i + 1]) {
                input[i] = min;
            }
            System.out.println("Min number is: " + min);
        }
    }

    private static void calculateMax(int[] input) {
        int max = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > input[i + 1]) {
                input[i] = max;
            }
            System.out.print("Max number is: " + max);

        }
    }
}


