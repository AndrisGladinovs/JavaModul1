package day22.practise;

public class PrintChar {
    public static void main(String[] args) {
        char [] arr = new char [] {'a', 'j', '%', '&'};
        getMePrintedChar(arr);
        printCharWithoutComa(arr);
}

    private static void printCharWithoutComa(char[] arr) {
        //print char array without coma
        // after last element

        System.out.print("Array without coma " + "[ ");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print("" + arr[i] + ", ");
        }
        System.out.print(arr[arr.length - 1]);
        System.out.println(" ]");
    }

    private static void getMePrintedChar(char[] arr) {
        System.out.print("First option with coma " + "[ ");
        for (char element : arr) {
            System.out.print(" " + element + ", ");

        }
        System.out.println("]");
    }
    }
