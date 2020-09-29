package day15.Hw15.MyPractise;

public class TernarOperators {
    public static void main(String[] args) {
        double kelvin = -273;
        String result;
        result = (kelvin > 0) ? "positive" : "negative";
        System.out.println(kelvin + " is " + result);
    }
}
