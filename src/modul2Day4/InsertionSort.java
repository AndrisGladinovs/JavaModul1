package modul2Day4;

import java.util.Arrays;

public class InsertionSort {
    // int[] arr = {5, 17, 4, 30 }
    // nachinaem s elementom pod indeksom 1 (eto 17)
    // poluchaetsja (5,17, 4, 30)
    // sledujushuju knigu s nomerom 4 mi sravnivaem uzhe so vsemi elementami
    // poluchaetsja (4,5, 17,30)

    public static void main(String[] args) {
        System.out.println("Sortirovka massivov s pomoshju 'Sortirovka vstavka'");
        int[] array = {22, 100, 55, 38, 88, 7};
        insertionSortImperative(array);
        System.out.println(Arrays.toString(array));
    }

    private static void insertionSortImperative(int[] input) {
        for (int i = 1; i < input.length; i++) { // nachinaem v etoj sortirovke vsegda s 1 !!!!
            int newElement = input[i]; // vremenaja peremenaja, kotoraja hranit znachenie ot i
            int location = i - 1; // cikl nachalsja ne s nulja

            while (location >= 0 && input[location] > newElement) {
                input[location + 1] = input[location]; // postavili knigu sleva
                location = location - 1;
            }
            input[location + 1] = newElement;
        }

    }
}
