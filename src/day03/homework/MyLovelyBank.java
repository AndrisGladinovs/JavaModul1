package day03.homework;

public class MyLovelyBank {
    public static void main(String[] args) {
        //Если клиент положил в банк 1000€ под 3,5%,
        // какая сумма будет его ждать через семь лет?


        double money= 1000;
        int year= 7;
        double interest= 3.5;
        bankAccount(1000,7,5.5);

    }

    private static void bankAccount(double money, int year, double intresssssssst) {
        double result = intresssssssst * year * money / 100 + money;
        System.out.println("Сумма в конце вклада " + result);
    }
}

