package day12;

public class Kontroljnaja {
    public static void main(String[] args) {
        int x = 4;
        int y = 14;
        int z = 7;
        int result = y % x + z;
        System.out.println(result);

        myMethod(10);

    }

    private static void myMethod(int b) {
        for (int i = 0; i < b; i += 2) {
            System.out.println(i);

        }
    }
}
