package day6.mypractise;

public class BobToReturn {
    public static void main(String[] args) {

        String name = "Bob";
        System.out.println(helloName(name));
        System.out.println(helloName("Alice"));
        System.out.println(helloName("X"));
    }

    private static String helloName(String username) {

        return "Hello " + username + "!";

    }


}
