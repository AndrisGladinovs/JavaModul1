package day06.mypractise;

public class Task2WordMiddle {
    public static void main(String[] args) {

        System.out.println(makeOutWord("<<>>", "Yay"));
        System.out.println(makeOutWord("<<>>", "WooHoo"));
        System.out.println(makeOutWord("[[]]", "word"));
    }

    private static String makeOutWord(String symbol, String word) {

        return symbol.substring(0, 2) + word + symbol.substring(2);

    }
}
