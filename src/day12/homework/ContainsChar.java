package day12.homework;

public class ContainsChar {
    public static void main(String[] args) {
        // public boolean contains(CharSequence s)
        //The contains() method returns true if and only
        // this string contains the specified sequence of char values.
        // Return Value: true if this string contains the specified sequence of char values,
        // false otherwise

        System.out.println(exampleCharsequence("Hello")); //true
        System.out.println(exampleCharsequence("Marschmello")); //true
        System.out.println(exampleCharsequence("Berlin")); //true
    }

    private static boolean exampleCharsequence(String word) {
        if (word.contains("ello")) {
            return true;
        } else {
            return false;
        }
    }

}
