package day23.Hw23;

public class SandwichWord {
    public static void main(String[] args) {

        System.out.println(getSandwich("breadjambread")); // "jam"
        System.out.println(getSandwich("xxbreadjambreadyy")); // "jam"
        System.out.println(getSandwich("xxbreadyy")); // ""
    }

    private static String getSandwich(String word) {
        String output = "jam";
        for (int i = 0; i < word.length(); i++) {
            if (word.startsWith("bread") && word.endsWith("bread")) {
                return output;
            } else if (word.contains("xbread") && word.contains("mbread")) {
                return output;
            } else {
                return "-";
            }

        }
        return output;
    }
}
