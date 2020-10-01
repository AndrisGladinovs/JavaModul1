package Day4;

public class HomeworkCircle {
    public static void main(String[] args) {
        int r=5;
       findCircumference (r);
        findCircumference (7);
        findCircumference (10);
        int radiusFromKonstantin =100;
        findCircumference (radiusFromKonstantin);
    }

    private static void findCircumference(int radius) {
        // L= 2PI*R
        double l=2*Math.PI*radius;
        System.out.println(l);
    }

}
