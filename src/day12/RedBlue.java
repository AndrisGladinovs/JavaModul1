package day12;

public class RedBlue {
    public static void main(String[] args) {

        System.out.println(seeColor("redxx")); //→"red"
        System.out.println(seeColor("xxred")); //→""
        System.out.println(seeColor("blueTimes")); // →"blue"
    }

    private static String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        } else if (str.substring(0, 4).equals("blue")) {
            return "blue";
        } else {
            return "";
        }
    }
}
