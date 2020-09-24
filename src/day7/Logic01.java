package day7;

import jdk.internal.dynalink.support.AutoDiscovery;

public class Logic01 {

    public static void main(String[] args) {
// zadacha 1
        System.out.println(smartDepositBox(true, false)); //-> true
        System.out.println(smartDepositBox(false, true)); //-> true
        System.out.println(smartDepositBox(false, false)); //-> false

        split();

        System.out.println(smartDepositBoxVersionTwo(true, false));
        System.out.println(smartDepositBoxVersionTwo(false, true));
        System.out.println(smartDepositBoxVersionTwo(false, false));
        System.out.println(smartDepositBoxVersionTwo(true, true));

        split();

        boolean mamaPermission = true;
        boolean papaPermission = false;
        boolean omaPermission = true;

        SmartDepositBoxVersionThree(true, false, true);


        System.out.println(bigBadaBoom(true, true));
        System.out.println(bigBadaBoom(false, false));
        System.out.println(bigBadaBoom(true, false));
    }

    private static boolean bigBadaBoom(boolean captain1, boolean captain2) {
        return captain1 && captain2;
    }

    private static boolean SmartDepositBoxVersionThree(boolean mamaPermission, boolean papaPermission, boolean omaPermission) {

        return mamaPermission && papaPermission || omaPermission;
    }

    private static boolean smartDepositBoxVersionTwo(boolean b, boolean b1) {
        return b & b1;
    }

    private static void split() {
        System.out.println("_______________");
    }

    private static boolean smartDepositBox(boolean b1, boolean b2) {
        boolean c = b1 || b2;
        return c;
    }
}
