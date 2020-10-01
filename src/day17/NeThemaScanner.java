package day17;

import java.util.Scanner;

public class NeThemaScanner {
    public static void main(String[] args) {
        myScanner();

    }

    private static void myScanner() {
        Scanner input = new Scanner(System.in);
        int old;
        System.out.println("How old are you?");
        old = input.nextInt();
        if (old < 18) {
            System.out.println("Call your parents");
        } else {
            System.out.println("Welcome to the website");
        }
        input.close();
    }
}
