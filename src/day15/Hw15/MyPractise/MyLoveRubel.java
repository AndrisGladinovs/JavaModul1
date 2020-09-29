package day15.Hw15.MyPractise;

public class MyLoveRubel {
    public static void main(String[] args) {
        printSumInRub(0, 50);
    }

    private static void printSumInRub(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.println(i + " " + rightRussianWord(i));

        }
    }

    private static String rightRussianWord(int number) {
        String output = "";
        String input = String.valueOf(number);
        String lastSymbol = "" + input.charAt(input.length() - 1);
        int lastDigit = Integer.parseInt(lastSymbol);
        if (lastDigit == 1) {
            output = "рубль";
        } else if (number >= 11 && number <= 14 || lastDigit == 0 || lastDigit >= 5 && lastDigit <= 9) {
            output = "рублей";

        } else if (lastDigit == 2 && number != 12 || lastDigit == 3 && number != 13 || lastDigit == 4 && number != 14) {
            output = "рубля";
        }
        return output;
    }
}
