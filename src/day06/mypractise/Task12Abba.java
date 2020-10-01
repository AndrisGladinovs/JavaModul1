package day6.mypractise;

public class Task12Abba {
    public static void main(String[] args) {

        System.out.println(makeAbba("Hi", "Bye"));
        System.out.println(makeAbba("Yo", "Alice"));
        System.out.println(makeAbba("What", "Up"));
    }

    private static String makeAbba(String a, String b) {

        return a+b+b+a;
    }


}
