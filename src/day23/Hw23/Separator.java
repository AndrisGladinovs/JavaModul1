package day23.Hw23;

public class Separator {
    public static void main(String[] args) {

        System.out.println(repeatSeparator("Word", "X", 3)); //→"WordXWordXWord"
        System.out.println(repeatSeparator("This", "And", 2)); //→"ThisAndThis"
        System.out.println(repeatSeparator("This", "And", 1)); //→"This
    }

    private static String repeatSeparator(String word, String separator, int number) {
        String output = "";
        for (int i = 0; i < number; i++) {
            output = output + word + separator;
        }
        return output;
    }
}