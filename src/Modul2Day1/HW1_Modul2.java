package Modul2Day1;

import java.util.Arrays;

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
        addNewElement(arrInt, 7);
        printArray(addNewElement(arrInt, 7));
        deleteElementArray(arrInt, 4);
        printArray(arrInt);

        System.out.println();

        double[] doubleArr = new double[size];
        createArray(doubleArr);
        printArray(doubleArr);
        printArray(addNewElement(doubleArr, 8.55));
        printArray(deleteElementArray(doubleArr, 2));

        System.out.println();

        char[] charArr = new char[size];
        createArray(charArr);
        printArray(charArr);
        printArray(addNewElement(charArr, '%'));
        printArray(deleteElementArray(charArr, 5));

    }

    private static void createArray(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) (Math.random() * 100);
        }
    }

    private static int[] deleteElementArray(int[] arr, int index) {
        int[] output = new int[arr.length - 1];
        for (int i = 0; i < index; i++) {
            output[i] = arr[i];
        }
        for (int i = index + 1; i < output.length; i++) {
            output[i] = arr[i];
        }
        return output;
    }

    public static double[] deleteElementArray(double[] arr, int index) {
        double[] output = new double[arr.length - 1];
        for (int i = 0; i < index; i++) {
            output[i] = arr[i];
        }
        for (int i = index + 1; i < output.length; i++) {
            output[i] = arr[i];
        }

        return output;
    }

    public static char[] deleteElementArray(char[] arr, int index) {
        char[] output = new char[arr.length - 1];
        for (int i = 0; i < index; i++) {
            output[i] = arr[i];
        }
        for (int i = index + 1; i < output.length; i++) {
            output[i] = arr[i];
        }
        return output;
    }


    private static int[] addNewElement(int[] arr, int newElement) {
        //1. Create int[] output which is for +1 bigger as arr.length
        // 2. Fill output[] with int numbers from arr[] ( output[] = input [])
        // 3. The third element in new array change to number 7
        // 4. Return the new[] output
        int newArraySize = arr.length + 1;
        int[] output = new int[newArraySize];
        for (int i = 0; i < arr.length; i++) {
            output[i] = arr[i];
        }
        output[output.length - 1] = newElement;
        return output;
    }

    public static double[] addNewElement(double[] arr, double newElement) {
        double[] doubleOutput = new double[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            doubleOutput[i] = arr[i];
        }
        doubleOutput[arr.length - 1] = newElement;
        return doubleOutput;
    }

    public static char[] addNewElement(char[] arr, char newElement) {
        char[] output = new char[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            output[i] = arr[i];
        }
        output[arr.length - 1] = newElement;
        return output;
    }

    private static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void printArray(double[] arr) {
        for (double element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void printArray(char[] arr) {
        for (char element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static void createArray(int[] arr) {
        // fill currently empty array with random numbers form 1 to 100
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
    }

    public static void createArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
    }

}
