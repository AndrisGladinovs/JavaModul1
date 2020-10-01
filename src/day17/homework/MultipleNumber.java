package day17.homework;

public class MultipleNumber {
    public static void main(String[] args) {
        //Даны целые числа A и B, где B > 0.
        // Вывести B раз число A.

        printNumbers(1, 5);
    }

    private static int printNumbers(int a, int B) {
        while (a <= B) {
            System.out.printf("%3d", a);
            B--;
        }
        return a;
    }
}
