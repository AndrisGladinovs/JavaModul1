package day22.practise;

public class ChangeDataPositions {
    public static void main(String[] args) {
        // change a and b with each other
        int a = 5;
        int b = 3;
        System.out.println("a: " + a + " , b: " + b);
        // easy way with THIRD variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a: " + a + " , b: " + b);
        // change step by step
        a = a + b; // a = 8
        b = a - b; // b = 5
        a = a - b; // a = 3
        System.out.println("a: " + a + " , b: " + b);
        // change with just one action
        a = a + b - (b = a);
        System.out.println("a: " + a + " , b: " + b);
        // using XOR
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
        System.out.println("a: " + a + " , b: " + b);
    }
}
