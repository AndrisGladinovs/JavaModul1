package day11.Homework11;

public class Hw11Task3 {
    public static void main(String[] args) {
        // Верните true, если заданное неотрицательное число кратно 3 или 5,
        // но не обоим сразу.

        System.out.println(old35(3)); //→true
        System.out.println(old35(10)); //→true
        System.out.println(old35(15)); //→false
    }

    private static boolean old35(int n) {
        if (n % 3 == 0 ^ n % 5 == 0) {
            return true;
        }
        else if (n % 3 ==0 && n % 5 ==0) {
            return false;
        } else return false;
    }
}
