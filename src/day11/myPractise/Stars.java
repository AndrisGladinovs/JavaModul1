package day11.myPractise;

public class Stars {
    public static void main(String[] args) {
        // Sdelatj piramidu iz zvjozdochek

        int amountLines =7;
        startTriangle(amountLines);
    }

    private static void startTriangle(int a) {
        String result = "*";
        for (int i = 0; i < a; i++) {
            result = result + i++;
            System.out.println(result);

        }
    }
}
