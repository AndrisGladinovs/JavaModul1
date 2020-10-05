package day20;

public class MyRandomArray {
    public static void main(String[] args) {
        int min = 50;
        int max = 150;
        int[] arr = createRandomArray(min, max);
    }

    private static int[] createRandomArray(int min, int max) {
        int size = (int) (Math.random() * 10);
        int[] output = new int[size];
        for (int i = 0; i < size; i++) {
            int myRandomTemp = (int) (((max - min) * Math.random() + 1) + min);
            output[i] = myRandomTemp;

        }
        return output;
    }
}
