package day10.homework;

public class Task2 {
    public static void main(String[] args) {

        System.out.println(calculationsNechetnie(3, 17));
        System.out.println(calculationsNechetnie(6, 122));
        System.out.println(calculationsNechetnie(15, 4));
    }

    private static int calculationsNechetnie(int a, int b) {
        if (a % 2 !=0) {
            return a;
        } else if (b % 2 !=0) {
            return b;
        } else return -1;

    }

}
