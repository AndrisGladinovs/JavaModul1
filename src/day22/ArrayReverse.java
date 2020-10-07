package day22;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = new int[]{100, 99, 98, 97};
        int[] arr3 = new int[]{10, 20, 30, 40, 50};
        FillAndPrint.myPrintIntArray(arrayReverse(arr1));
        FillAndPrint.myPrintIntArray(arrayReverse(arr2));
        arrayReverse(arr3);
    }

    private static int[] arrayReverse(int[] input) {
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            output[output.length - 1 - i] = input[i];

        }
        return output;
    }
}
