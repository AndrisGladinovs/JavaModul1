package day12;

public class Hello {
    public static void main(String[] args) {
// Given a string, return a new string made of 3 copies of the first 2 chars
// of the original string. The string may be any length.
// If there are fewer than 2 chars, use whatever is there.

        System.out.println(extraFront("Hello")); // HeHeHe
        System.out.println(extraFront("ab")); // ababab
        System.out.println(extraFront("H")); // HHH

    }

    private static String extraFront(String str) {
        if (str.length()<2) {
            return str + str + str;
        } else {
            return str.substring(0,2) + str.substring(0,2) + str.substring(0,2);
        }
    }
}
