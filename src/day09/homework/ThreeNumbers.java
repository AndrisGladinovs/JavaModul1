package day9.homework;

public class ThreeNumbers {
    public static void main(String[] args) {

        System.out.println(mySum(5, 6, 5)); // to return 6
        System.out.println(mySum(5, 6, 7)); // to return ->18
        System.out.println(mySum(0, 0, 0)); // to return ->0
        System.out.println(mySum(0, -5, 5)); // to return ->-1
    }

    private static int mySum(int n1, int n2, int n3) {
        int sum = n1 + n2 + n3;

        if (n1 == n3) {
            return n2;
        } else if (n1 + n2 + n3 == 0) {
            return -1;
        } else {
            return sum;
        }
    }

}
