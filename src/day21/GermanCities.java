package day21;

public class GermanCities {
    public static void main(String[] args) {
        /* Напишите метод печати для 
        строкового массива (String[] germanCites) */

        String[] city = new String[]{"Berlin", "München", "Dresden", "Leipzig"};
        printMeCity(city);
    }

    private static void printMeCity(String[] city) {
        for (String str:city) {
            String output = str;
            System.out.print(str + ", ");
            
        }

    }
}

