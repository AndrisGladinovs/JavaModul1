package day02;

public class Rezept {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int e = 4;
        int d = 5;
        menu1(b,c,d);
        menu2(a);
        menu3(e,d);
    }

    public static void menu1(int b, int c, int d) {
        System.out.println("Rezuljtat perwogo menju rawen - "+(b+c+d));
    }


    public static void menu2(int a) {
        System.out.println("Rezuljtat vtorogo menju rawen - "+(a*a));
    }

    public static void menu3(int e, int d) {
        System.out.println("Rezuljtat tretjego rawen - "+(e+(e*d)));
    }
}
