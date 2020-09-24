package day10.homework;

public class SecretNumberString {
    public static void main(String[] args) {
        System.out.println(excercise(3000));
    }

    private static String excercise(int range) {
        String result = "";
        for (int i = 0; i < range; i++) {
            if (i %32 == 30 && i % 58 == 44) {
                result += " "+i;
            }

        }
        return result;
    }
}
