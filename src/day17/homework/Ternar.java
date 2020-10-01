package day17.homework;

public class Ternar {
    public static void main(String[] args) {
        System.out.println(getMeMax(15, 5)); //→15
        System.out.println(getMeMax(4, 16)); //→16
        System.out.println(getMeMax(20, 100)); //→100

        System.out.println(getMeMin(15, 45)); //→ 15
        System.out.println(getMeMin(44, 16)); //→ 16
        System.out.println(getMeMin(200, 100)); //→ 100

        System.out.println(myFirstCompareTo("Berlin", "Moscow")); //→ "Berlin"
        System.out.println(myFirstCompareTo("Minsk", "Moscow")); //→ "Minsk"
        System.out.println(myFirstCompareTo("Kyiv", "Paris")); //→ "Kyiv"
        System.out.println(myFirstCompareTo("Могилёв", "Потсдам")); //→ "Могилёв"
    }

    private static String myFirstCompareTo(String str1, String str2) {
        String output = "";
        if (str1.charAt(0) < str2. charAt(0)) {
            return output + str1 ;
        } else if (str1.charAt(0) > str2. charAt(0)) {
            return output + str2;
        } else if (str1.charAt(1) < str2.charAt(1)) {
            return output + str1;
        } else {
            return output;
        }
    }

    private static int getMeMin(int a, int b) {
        int result = 0;
        result = (a < b) ? a : b;
        result = (a > b) ? b : a;
        return  result;
    }

    private static int getMeMax(int a, int b) {
        int result = 0;
        result = (a > b) ? a : b;
        result = (a < b) ? b : a;
        return  result;
    }
}
