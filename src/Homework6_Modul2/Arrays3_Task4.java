package Homework6_Modul2;

import java.util.Arrays;

public class Arrays3_Task4 {
    public static void main(String[] args) {
        /* after 3 must follow 4  */

        System.out.println(Arrays.toString(fix34(1, 3, 1, 4))); // → [1, 3, 4, 1]
        System.out.println(Arrays.toString(fix34(1, 3, 1, 4, 4, 3, 1))); // → [1, 3, 4, 1, 1, 3, 4]
        System.out.println(Arrays.toString(fix34(3, 2, 2, 4))); // → [3, 4, 2, 2]
    }

    private static int[] fix34(int... args) {
        // perestavljaem cifru 4 posle cifri 3 v etom zhe massive.
        // vozvrashaem massiv args []

        for (int i = 0; i < args.length; i++) {
            if (args[i] == 3) {  // nashli cifru 3
                for (int j = i; j < args.length; j++) {
                    if (args[j] == 4) { //ishem daljshe i nashli cifru 4
                        int tmp = args[i + 1]; // stavim cifru 4 na mesto args[i+1]
                        args[i + 1] = 4;
                        args[j] = tmp;

                    }
                }
            }
        }
        return args;
    }
}
