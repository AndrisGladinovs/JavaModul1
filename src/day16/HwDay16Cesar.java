package day16;

public class HwDay16Cesar {
    public static void main(String[] args) {
        enigmaCaesar("Съешь же ещё этих мягких французских булок, да выпей чаю.");
    }

    private static void enigmaCaesar(String text) {
        String output = "";
        text = text.toLowerCase();
        int change = 3;
        for (int i = 0; i < text.length(); i++) {
            char myChar = text.charAt(i); // from String to char

            int myChartInt = 0 + myChar; // char to int code

            int mySecretCharInt = myChartInt + change; // +3 for old code
            char secretChar = (char) mySecretCharInt; //
            System.out.print("" + secretChar);

        }
    }

}





