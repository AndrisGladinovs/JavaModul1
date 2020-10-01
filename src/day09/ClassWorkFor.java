package day09;

public class ClassWorkFor {
    public static void main(String[] args) {
        int lines = 10;
        //triangle(lines);
        //simpleString();

        //System.out.println("Itogovij vivod " + sum(2, 4));
        System.out.println("Itogovij vivod " + sum(0, 10));
    }

    private static int sum(int a, int b) {
        int result = 0;
        for (int i = a; i <= b; i=i+1) {
            result = result + i;
            System.out.println("Vremennij vivod rezuljtata " + result);
        }
        return result;
    }

    private static void simpleString() {
        String text = "One word ";
        text = text + "two";
        System.out.println(text);
    }

    private static void triangle(int number) {
        String star = "*";
        String line = "";
        for (int i = 0; i < number; i++) {
            System.out.println(line);
            //line = line + star;
            line += star;
            System.out.println(line);

        }
    }
}
