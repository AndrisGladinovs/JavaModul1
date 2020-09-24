package day10.homework;

public class Task1ChetnieChisla {
    public static void main(String[] args) {
        // Напишите программу, которая находит чётные числа между a и b.
        // Решение с помощью случайных чисел и числа b = 8, заданного пользователем

        double a = Math.random();
        double b = 8;
        System.out.println(calculationRandom(a, b));

    }

    private static double calculationRandom(double a, double b) {

        if (a % 2 == 0) {
            return a;
        } else if (b % 2 == 0) {
            return b;
        } else return -1;
        // -1 в этом случае означает, что четных чисел не нашли.
        // К сожалению не могу вывести строчку с предложением String.
        // Всегда String подчеркивает красным
    }
}
