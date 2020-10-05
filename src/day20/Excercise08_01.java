package day20;

public class Excercise08_01 {
    public static void main(String[] args) {
        int[] art = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max;
        int min;
        int middle;
        int sum;
        System.out.println(calculateMax(art) + " max number");
        System.out.println(calculateMin(art) + " min number");
        System.out.println(calculateSum(art) + " sum of array variables");
        System.out.println(calculateMiddle(art) + " average number of array");
    }

    private static double calculateMiddle(int[] arr) {
        double average = 0.0;
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i] ;
            average = sum / arr.length;
        }
        return average;
    }

    private static int calculateSum(int[] input) {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum = sum + input[i];
        }
        return sum;
    }

    private static int calculateMin(int[] input) {
        int min = input[0];
        for (int i = 0; i < input.length; i++) {
            min = Math.min(min, input[i]);
        }
        return min;
    }

    private static int calculateMax(int[] input) {
        int max = input[0];
        for (int i = 0; i < input.length; i++) {
            max = Math.max(max, input[i]);
        }
        return max;
    }
}





