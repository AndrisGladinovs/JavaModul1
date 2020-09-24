package day11.Homework11;

public class Hw11Task2 {
    public static void main(String[] args) {
        //Дано заданное число n.
        // Верните тру, если n находится в диапазоне от 1 до 10
        // Остальные опции b = true верните true, если число n <= 1 || n>=10

        System.out.println(in1To10(5, false)); // true
        System.out.println(in1To10(11, false)); // false
        System.out.println(in1To10(11, true)); // true
    }

    private static boolean in1To10(int n, boolean b) {
        if (n >= 1 && n <= 10) {
            return true;
        } else if (n <= 1 || n >=10 && b == true) {
            return true;
        }
        else return false;
    }
}
