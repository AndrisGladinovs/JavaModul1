package day20;

public class DoubleRandomArray {
    public static void main(String[] args) {
        double min = 5.00;
        double max = 10.00;
        double[] arr = createDoubleArray(min, max);
        myPrintDoubleArray (arr);

    }

    private static void myPrintDoubleArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");

        }

    }

    private static double[] createDoubleArray(double min, double max) {
        int size = (int) (Math.random() * 10);
        double[] output = new double [size];
        for (double i = 0; i < size; i++) {
            double myRandomTemp = (((max - min) * Math.random() + 1) + min);
            output [(int) i] = myRandomTemp;
        }
        return output;
    }
}
