package day05.homework;

public class BankandMoney {
    public static void main(String[] args) {

        //Сколько денег получит Вася через 2 года, если вложил 2000 евро под 3.5 % годовых.

        calculateDeposit(2, 2000, 3.5);

    }

    private static void calculateDeposit(int years, int money, double percentage) {
        // Узнаем точную цифру процента депосита перед умножением на деньги и года
        int k = 100;
        double resultPercentage = percentage / k;
        System.out.println("Точная сумма процентной ставки " + resultPercentage);

        // Узнаем сколько денег получит

        double calculationsDeposit = money + (money * years * resultPercentage);
        System.out.println("Через 2 года получит " + calculationsDeposit +"€");

        int calculationsFinal= (int)calculationsDeposit;
        System.out.println("Точное целое число возврата "+calculationsFinal+"€");
    }
}
