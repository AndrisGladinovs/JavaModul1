package day11.homework10;

public class Homework1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 100;
        //findEven(a, b);
        System.out.println(findEvenNumber(a, b));

    }

    private static String findEvenNumber(int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                result = result + " " + i;
            }

        }
        return result;
    }
}











