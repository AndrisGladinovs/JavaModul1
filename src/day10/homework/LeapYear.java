package day10.homework;

public class LeapYear {
    public static void main(String[] args) {
        //Напишите программу, которая проверяет год на високосность. Кратный четырём.

        System.out.println(getLeapYear(1900));

    }

    private static boolean getLeapYear(int a) {
        /*Год високосный, если он делится на четыре без остатка,
        но если он делится на 100 без остатка, это не високосный год.
        Однако, если он делится без остатка на 400, это високосный год
         */

        if (a % 400 == 0) {
            return true;

        } else if (a % 100 == 0) {
            return false;
        } else if (a % 4 == 0) {
            return true;
        }
        return false;
    }
}