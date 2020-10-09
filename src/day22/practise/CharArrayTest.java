package day22.practise;

public class CharArrayTest {
    public static void main(String[] args) {
        // print char array
        char[] data = new char[]{'a', 'y', '*', '§'};
        //printMeCharArray(data);
        //printMeCharArrayTwo(data);
        printMeCharArrayColour(data);
    }

    private static void printMeCharArrayColour(char[] input) {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
        System.out.print("Colourful chars" + "[ ");

        for (int i = 0; i < input.length - 1; i++) {
            if (i % 2 == 0) {
                System.out.print(ANSI_GREEN + (" " + input[i]) + ", " + ANSI_RESET);
            } else {
                System.out.print("" + input[i]);
            }
        }
        System.out.print(ANSI_YELLOW_BACKGROUND + input[input.length - 1] + ANSI_RESET);
        System.out.println(" ]");
    }
}

        /* private static void printMeCharArrayTwo (char[] arr){
        print char array without coma and point
        after last element

            System.out.print("Array without coma " + "[ ");
            for (int i = 0; i < arr.length - 1; i++) {
                System.out.print("" + arr[i] + ", ");
            }
            System.out.print(arr[arr.length - 1]);
            System.out.println(" ]");


        }

        private static void printMeCharArray ( char[] arr1){
            System.out.print("First option with coma " + "[ ");
            for (char element : arr1) {
                System.out.print(" " + element + ", ");

            }
            System.out.println("]");

        }
    }
*/