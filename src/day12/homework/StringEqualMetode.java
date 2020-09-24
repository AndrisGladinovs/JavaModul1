package day12.homework;

public class StringEqualMetode {
    public static void main(String[] args) {
        // Java - String equals() Method
        // The result is true if and only if the argument is not null and is a String object
        // that represents the same sequence of characters as this object.

        String a = "London is a capital of Great Britain";
        String b = "Holidays are till the 1st of October";
        String c = "London is a capital of Great Britain";
        System.out.println(example(a,b,c));
    }

    private static Boolean example(String a, String b, String c) {

        if (a.equals(b)) {
            return true;
        } else if (b.equals(c)) {
            return true;
        } else if (c.equals(a)) {
            return true;
        } else {
            return false;
        }
    }
}


