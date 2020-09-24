package day13;

public class MyPassword {
    public static void main(String[] args) {
        // Create password with 10 digits.
        // Must to have
        // At least: 1 big, 1 small letter and 1 extra symbol

        String examplePassword = "Rubik2@two";
        generatePassword(10);
    }

    private static void generatePassword(int userInput) {
        String result = "";
        for (int i = 0; i < userInput; i++) {
            int min = 48; // begin of the numbers
            int max = 122; //end of all small latein/English letters
            char password= (char) ((Math.random() * (max - min)+1) + min);
            result = result + password;

        }
        System.out.println(result);
    }
}
