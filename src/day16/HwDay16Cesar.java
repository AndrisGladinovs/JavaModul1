package day16;

public class HwDay16Cesar {
    public static void main(String[] args) {
        enigmaCaesar("Съешь же ещё этих мягких французских булок, да выпей чаю.");
    }

    private static void enigmaCaesar(String text) {
        String output = "";
        int change = 3;
        for (int i = 0; i < text.length(); i++) {
            char myChar = text.charAt(i); // from String to char
            System.out.println(0 + myChar); // get each char code number
            int myChartInt = myChar; // char code to int code
            System.out.println(myChartInt);
            int mySecretCharInt = myChartInt + change; // +3 for old code
            System.out.print(" " + mySecretCharInt);
            String newText = String.valueOf(mySecretCharInt); // new int +3 code back to String
            System.out.println("Новое предложение " + newText);

        }
    }

}





