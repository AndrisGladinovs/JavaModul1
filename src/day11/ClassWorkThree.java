package day11;

public class ClassWorkThree {
    public static void main(String[] args) {
        // нужно написать алгоритм вывода на экран всех возможных комбинаций
        // 3-х натуральных чисел до 36 с определенными условиями:
        //1. необходимо использовать вложенные циклы 2. x <= y <= z
        //3. xyz = 36
        threeNumbers();
    }

    private static void threeNumbers() {
        int count = 1;

        for (int x = 1; x <36 ; x++) {
            for (int y = x; y <=36 ; y++) {
                for (int z = y; z <=36 ; z++) {
                    if (x * y * z ==36) {
                        System.out.println(count + ". Varianti gde " + "x =" + x
                                + ", y = "+ y
                        + " , z" + z);
                        count ++;
                    }

                }

            }

        }
    }
}
