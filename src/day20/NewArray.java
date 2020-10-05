package day20;

public class NewArray {
    public static void main(String[] args) {

        //myNewTypeArrayInt();
        int[] source = new int[]{1, 2, 3};
        int[] copy = getMeArrayCopy(source);
        System.out.println(copy[2]);

    }

    private static int[] getMeArrayCopy(int[] input) {
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = input[i];
        }

        return output;
    }

    private static void myNewTypeArrayInt() {
        int a = 10;
        int b = 50;
        int[] myNewArray = new int[]{a, b};
        int[] anotherArray = new int[10]; // 10 mest no poka pustoj avtobus po 0
        int[] thirdArray = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] secondArray = myNewArray;
        System.out.println(myNewArray[0]); // raspechatatj 1 element massiva "a"
        System.out.println(myNewArray[myNewArray.length - 1]);

        secondArray[1] = secondArray[1] + 100;
        System.out.println(secondArray[1]);
    }
}
