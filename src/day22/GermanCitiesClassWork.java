package day22;

public class GermanCitiesClassWork {
    public static void main(String[] args) {
        String[] myCities = new String[]
                {
                        "Berlin",
                        "München",
                        "Dresden",
                        "Hamburg",
                        "Potsdam"
                };
        //System.out.println(Arrays.toString(myCities));
        //myPrintStringArray(myCities);
        myPrintForI(myCities);
    }

    private static void myPrintForI(String[] arr) {
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
        System.out.print("[ ");
        for (int i = 0; i < arr.length - 1; i++) {
            if (i % 2 == 0) {
                System.out.print(ANSI_RED + arr[i] + ", " + ANSI_RESET);
            } else
                System.out.print(ANSI_GREEN + arr[i] + ", " + ANSI_RESET);
        }
        System.out.print(ANSI_YELLOW_BACKGROUND + arr[arr.length - 1] + ANSI_RESET);
        System.out.println(" ]");
    }

}

    /*private static void myPrintStringArray(String[] input) {
        System.out.print("[ ");
        for (String element : input) {
            System.out.print(element + ", ");
        }
        System.out.println("]"); */



