package day06.mypractise;

public class WithoutFisrtLetter {

    public static void main(String[] args) {

        System.out.println(nonStart("Hello", "There"));
        System.out.println(nonStart("java", "code"));
        System.out.println(nonStart("shotl", "java"));
    }

    private static String nonStart(String s1, String s2) {

        return s1.substring(1) + s2.substring(1); // Must to get lose first letter in each word + comes substatination
    }
}
