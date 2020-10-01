package day05.homework;

public class Krug {
    public static void main(String[] args) {
        int r = 5;
        findCircumreference(r);
        findCircumreference(8);
        findCircumreference(10);
        int radiusfromSven = 10;
        findCircumreference(radiusfromSven);
    }

    private static void findCircumreference(int r) {
        int k=100;

        double resultCircum = 2 * Math.PI * r;
        System.out.println("1. resultCircum: " + resultCircum); //получилось большое число. Нужно оставить 2 цифры после запятой

        double myNewResult = resultCircum * 100;
        System.out.println("2. myNewResult:  " + myNewResult);

        double result = (int) myNewResult;
        System.out.println("3. result int:   " + result);

        double finalresult = result / k;
        System.out.println("4. final result: " + finalresult+System.lineSeparator());


    }
}
