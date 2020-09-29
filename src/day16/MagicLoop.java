package day16;

public class MagicLoop {
    public static void main(String[] args) {
        System.out.println(convertDecimaltoBinary(78));
    }

    private static String convertDecimaltoBinary(int decimal) {
        String output = "";
        int remainder; // ostatok
        while (decimal > 0) {
            remainder = decimal % 2;
            output = remainder + output;
            decimal = decimal /2;
        }

        return output;
    }
}
