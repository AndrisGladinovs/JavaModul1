package day11.Homework11;

public class Hw11Task1 {
    public static void main(String[] args) {
        /*Given 2 ints, a and b, return their sum.
          However, sums in the range 10..19 inclusive, are forbidden,
          so in that case just return 20. */

        System.out.println(sortaSum(3, 4)); //→7
        System.out.println(sortaSum(9, 4)); //→20
        System.out.println(sortaSum(10, 11)); //→21
    }

    private static int sortaSum(int a, int b) {
        if (a + b > 10 && a + b <= 19) {
            return 20;
        } else return a + b;
    }


}


