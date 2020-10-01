package Day04.TestirujuZadanija;

public class NajtiPloshadjKruga {
    public static void main(String[] args) {
        int radius = 6;
        calculation(radius);
        //findCircumFerence(radius:10);
        // findCircumFerence(radius:12);
        // int newRadiusCustomer= 100;
    }

    private static void calculation(int radius) {
        double squareofcircle= 2 * Math.PI*radius;
        System.out.println(squareofcircle);

        //ответ получилось 37.69911184307752.
        // Много цифр после запятой.
        // Задача оставить только целые числа и убрать всё, что стоит после запятой

        int result=(int) squareofcircle;
        System.out.println(result);

    }
}
