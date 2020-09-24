package day10.homework;

public class Task3Modulo11 {
    public static void main(String[] args) {
        // Напишите программу, которая находит числа кратные 11 между a и b.

        System.out.println(calculateModulo11(11, 33));
        System.out.println(calculateModulo11(4, 253));
        System.out.println(calculateModulo11(44, 111));
    }

    private static int calculateModulo11(int a, int b) {
        if (a % 11 == 0 ) {
            return  a;
        } else if (b % 11 == 0) {
            return b;
        } else return -1;

    }
}
