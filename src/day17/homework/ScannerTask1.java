package day17.homework;

import java.util.Scanner;

public class ScannerTask1 {
    public static void main(String[] args) {
         mySystem();
    }

    private static void mySystem() {
        String name = "";
        String surname = "";
        String sex, email = "";
        int age = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Amazon. What is your name?");
        name = input.next();
        System.out.println("Please enter your surname");
        surname =input.next();
        System.out.println(" Are you man or women? Please write m or w");
        sex = input.next();
        System.out.println("Enter your age");
        age = input.nextInt();
        System.out.println("Last but not least. Please enter your Email");
        email = input.next();
        input.close();
        System.out.println("Thanky you! Please check your provided data");
        System.out.println(name + " " + surname + " " + sex + " " + age + " ");
        System.out.println(email);



    }
}
