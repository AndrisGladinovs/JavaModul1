package day8;

public class SwitchCoffee {
    public static void main(String[] args) {
        int button = 5; // nomer knopki v vanding machine
        vendingMachine(button);
    }

    public static void coffeeWithMilk (){
        System.out.println("Hot vater is boiling");
        System.out.println("Coffee is splitting");
        System.out.println("Adding milk");
    }

    private static void vendingMachine(int customerChoose) {
        switch (customerChoose) {
            case 1:
                System.out.println("Coffee Americano is in process");
                break;
            case 2:
                System.out.println("Hot water is in process");
                break;
            case 3:
                System.out.println("Coffee Espresso is in process");
                break;
            case 4:
                System.out.println("Hot chocolate is in process");
                break;
            case 5:
                coffeeWithMilk();
                break;
            default:
                System.out.println("Please try again," + "an option number" + customerChoose + "is temporary unavailable");
                break;

        }
        System.out.println("Task completed!");
    }

}
