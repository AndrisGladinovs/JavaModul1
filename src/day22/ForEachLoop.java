package day22;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        System.out.print("Printed array " + " [ ");
        for (int element : arr) {
            System.out.print(element + ", ");
        }
        System.out.println("]");


    }
}
