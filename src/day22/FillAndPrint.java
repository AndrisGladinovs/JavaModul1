package day22;

public class FillAndPrint {
    public static void main(String[] args) {
        int[] example = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        myPrintIntArray(example);
    }

    public static void myPrintIntArray(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(" ," + input[i]);
        }
        System.out.println();
    }
}
