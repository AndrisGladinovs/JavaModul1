package day08;

public class CoffeeMachine {
    public static void latte() {
        System.out.println("--------");
        System.out.println("We have created lette for you");
        milk(40);
        water(60);
        coffee(50);

    }

    public static void cappuccino() {
        System.out.println("--------");
        System.out.println("We have created cappuccino for you");
        milk(30);
        water(40);
        coffee(20);

    }

    public static void americano() {
        System.out.println("--------");
        System.out.println("We have created americano for you");
        milk(0);
        water(40);
        coffee(10);

    }

    public static void water(int ml) {
        System.out.printf("Added %d ml of water \n", ml);
    }

    private static void milk(int ml) {
        System.out.printf("Added %d ml of milk \n", ml);
    }

    private static void coffee(int ml) {
        System.out.printf("Added %d ml of coffee \n", ml);
    }
}
