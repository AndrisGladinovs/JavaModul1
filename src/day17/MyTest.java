package day17;

public class MyTest {
    public static void main(String[] args) {
        magicChar();
    }

    private static void magicChar() {
        char c1 = 'y';
        System.out.println(c1);
        System.out.println(c1 + "");
        System.out.println(c1 + c1 + "");
        System.out.println('y' + 'y');
        System.out.println("y" + "y");
        System.out.println("" + c1 * c1);
        String temp = "" + c1 * c1;
        System.out.println(temp);
        System.out.println(c1 + 0);
    }
}
