package day26;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text;
        System.out.println("Do you love Katjusha? ");
        text = input.nextLine();
        int percent;
        System.out.println("For how many percent from 1-100? ");
        percent = input.nextInt();
        input.close();

        System.out.println("He said : " + text);
        System.out.println("You love Katjusha for " + percent + "%");
        System.out.println("y/n");


    }
}
