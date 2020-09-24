package day12.homework;

public class StringStartWithMetode {
    public static void main(String[] args) {
        String example = "Drive when it is green";
        System.out.println(test(example));
    }

    private static boolean test(String sentence) {
        if (sentence.startsWith("Diving")) {
            return true;
        } else {
            return false;
        }
    }
}
