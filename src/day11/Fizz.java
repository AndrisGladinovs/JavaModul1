package day11;

public class Fizz {
    public static void main(String[] args) {
        System.out.println(fizzString("fig")); //→ "Fizz"
        System.out.println(fizzString("dib")); //→ "Buzz"
        System.out.println(fizzString("fib")); //→ "FizzBuzz"
    }

    private static String fizzString(String str) {
        if (str.startsWith("f") && (str.endsWith("b"))){
            return "FizzBuzz";
        } else if (str.startsWith("f")) {
            return "Fizz";
        } else if (str.endsWith("b")) {
            return "Buzz";
        } else {
            return str;
        }

    }
}
