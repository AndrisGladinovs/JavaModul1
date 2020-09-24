package day11.homework10;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(checkLeapYear(2020));
    }

    private static boolean checkLeapYear(int year) {
        if (year % 4 == 0) {
            return true;
        } else return false;

    }
}
