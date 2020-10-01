package day06.mypractise;

public class Task3FirstPartOnly {

    public static void main(String[] args) {

        System.out.println(firstHalf("WooHoo"));
        System.out.println(firstHalf("HelloThere"));
        System.out.println(firstHalf("abcdef"));

    }

    private static String firstHalf(String word) {

        return word.substring(0, word.length()/2);

    }
}
