package day09.homework;

public class Homework9_Task1 {
    public static void main(String[] args) {

        System.out.println(moreOrLess(5, 6)); // Get back the biggest unit -> 6
        System.out.println(moreOrLess(5, 5)); // If both digits are equal - return 0.
        System.out.println(moreOrLess(0, 100)); //  Get the biggest digit -> 100
    }

    private static int moreOrLess(int n1, int n2) {
        if (n1>n2){
            return n1;
        }
        else if (n1<n2){
            return n2;
        }
        else if (n1==n2){
            return 0;
        }
        else {
            return -1;
        }

    }
}
