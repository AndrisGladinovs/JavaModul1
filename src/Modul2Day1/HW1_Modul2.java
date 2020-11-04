package Modul2Day1;

public class HW1_Modul2 {
    /* Create methods for arrays[] with primitive dataTypes:
int, double, byte, char, long
print, create, add element, delete element, update element
use overloading */

    public static void main(String[] args) {
        int size = 8;
        int[] arrInt = new int[size];
        createArray(arrInt);
        printArray(arrInt);
        addNewElement(arrInt, 3, 7);
        printArray(arrInt);
        printArray(deleteElementArray(arrInt, 4));
        printArray(arrInt);

    }

    private static int[] deleteElementArray(int[] arr, int index) {
        int[] output = new int[arr.length - 1];
        for (int i = 0; i < index; i++) {
            output[i] = arr[i];
        }
        for (int i = index; i < output.length; i++) {
            output[i] = arr[i + 1];
        }
        return output;
    }

    private static int[] addNewElement(int[] arr, int index, int newElement) {
        //1. Create int[] output which is for +1 bigger as arr.length
        // 2. Fill output[] with int numbers from arr[] ( output[] = input [])
        // 3. The third element in new array change to number 7
        // 4. Return the new[] output
        int newArraySize = arr.length + 1;
        int[] output = new int[newArraySize];
        for (int i = 0; i < arr.length; i++) {
            output[i] = arr[i];
        }
        output[index] = newElement;
        return output;
    }


    private void printArray(int[] arr) {
        for (int element : arr) {
            System.out.println(element + ", ");
        }
        System.out.println();
    }

    private int[] createArray(int[] arr) {
        // fill currently empty array with random numbers form 1 to 100
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.random() * 100;

        }
        return arr;
    }

}
