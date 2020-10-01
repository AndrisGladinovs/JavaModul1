package day6.mypractise;

public class Task8 {
    public static void main(String[] args) {

        System.out.println(lastChars("last", "chars"));
        System.out.println(lastChars("yo", "java"));

    }

    private static String lastChars(String firstWord, String secondWord) {

        int secondLenght = secondWord.length();
        char lastDigit = secondWord.charAt(secondLenght - 1);

        return firstWord.substring(0, 1) + lastDigit;

    }

}
