package day06;

public class BobString {
    public static void main(String[] args) {
        String name = "Bob";
        System.out.println(helloName(name));

    }

    private static String helloName(String username) {

        return "Hello " + username + '!';
    }
}
