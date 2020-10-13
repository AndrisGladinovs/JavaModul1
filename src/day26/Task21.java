package day26;

public class Task21 {
    public static void main(String[] args) {
        System.out.println(wordEnds("abcXY123XYijk", "XY")); //→ "c13i"
        System.out.println(wordEnds("XY123XY", "XY")); //→ "13"
        System.out.println(wordEnds("XY1XY", "XY")); //→ "11"
        // 1. cikl
        // 2. Najti mesta v pervom stringe, gde vstrechaetsja nash pattern wordStr
        // 3. Obrashaemsja k elementam do i elementam posle
        // 4. Konkatiniruem i vozvrashhaem otvet
    }

    private static String wordEnds(String str1, String wordStr) {
        String output = "";
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == wordStr.charAt(0) && str1.charAt(i + 1) == wordStr.charAt(1)) {
                if (i > 0) {
                    output = output + str1.charAt(i - 1);
                }
                if (i < str1.length() - 3) {
                    output = output + str1.charAt(i + 2);
                }
            }

        }
        return output;
    }
}
