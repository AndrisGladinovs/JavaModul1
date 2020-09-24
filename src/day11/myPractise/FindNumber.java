package day11.myPractise;

public class FindNumber {
    public static void main(String[] args) {
        for (int i = 0; i < 3000; i++) {
            if (i % 32 == 30 && i % 58 == 44){
                System.out.print(i + ", ");
            }

        }
    }
}
