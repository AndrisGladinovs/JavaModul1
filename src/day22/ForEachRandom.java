package day22;

public class ForEachRandom {
    public static void main(String[] args) {
        int arrLength = 10;
        int[] myArray = new int[arrLength];
        System.out.print("[ ");
        for (int element : myArray) {
            element = (int) (element + Math.random() * 100);
            System.out.print(element + ", ");
        }
        System.out.println("]");
    }
}
