package day17;

public class ReviewCasting {
    public static void main(String[] args) {
        intToChar();
        charToInt();
        StringToChar();
        StringToInt();
        intToString();
        charToString();
        magicChar();
    }

    private static void magicChar() {
        char c1 = 'b';
        System.out.println(c1); // prosto bukva
        System.out.println(c1 + ""); //
        System.out.println(c1 + c1); // skladivaet indeksi
        System.out.println(c1 + 10); // int c1 +10
        System.out.println(c1 + "" + c1); // bb

    }

    private static void charToString() {
        char c1 = 125;
        String s1 = String.valueOf(c1);
        String s2 = "" + c1;
        String s3 = "";
        s3 += c1;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

    private static void intToString() {
        int x = 25;
        String x25= String.valueOf(x);
        System.out.println(x25);
    }

    private static void StringToInt() {
        String hm = "Vasilij";
        String database = "1975";
        int newDatabase = Integer.parseInt(database);
    }

    private static void StringToChar() {
        String hm = "Vasilij";
        char c1= hm.charAt(0);
        System.out.println(0);
    }

    private static void charToInt() {
        char c1 = 'u';
        char c2 = '\u039A';
        char c3 = 100;
        int x = c1; // char to Int
        short s = (short) c2;
        byte b = (byte) c3;
        double d = c1;
        System.out.println(x);
        System.out.println("" + c2); // char to String
    }

    private static void intToChar() {
        int x = 90;
        char c = (char) x;
        System.out.println(c);
    }
}
