package day10.homework;

public class Task4Years {
    public static void main(String[] args) {

        System.out.println(years(2000, 2001));
        System.out.println(years(2003, 2004));
        System.out.println(years(2006, 2007));
    }

    private static int years(int a, int b) {
        if (a % 4 == 0) {
            return a;
        } else if (b % 4 == 0) {
            return b;
        } else return 0;

    }
}