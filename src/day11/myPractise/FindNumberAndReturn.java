package day11.myPractise;

public class FindNumberAndReturn {
    public static void main(String[] args) {
        int a = 10;
        int b = 62;
        System.out.println(numberReturn(a, b));
    }

    private static String numberReturn(int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            if (i % 2 != 0) {
                result = result + " " + i;
            }

        }
        return result;
    }
}
