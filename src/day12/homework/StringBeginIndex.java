package day12.homework;

public class StringBeginIndex {
    public static void main(String[] args) {
        //returns a new string that is a substring of this string.
        // The substring begins with the character at the specified index
        // and extends to the end of this string or up to endIndex – 1, if the second argument is given.
        // Important:beginIndex − the begin index, inclusive.
        // Important: endIndex − the end index, exclusive.

        String str = "Our lesson starts in 40 minutes";
        System.out.println(test(str));
    }

    private static String test(String beginIndex) {
        return beginIndex.substring(4, 11);

    }
}
