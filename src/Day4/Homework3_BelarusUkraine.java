package Day4;

public class Homework3_BelarusUkraine {
    public static void main(String[] args) {
        double belarus = 207_595;
        double ukraine = 603_628;
        rate(belarus, ukraine);
        double moscow=2511;
        double berlin=891;
        rate(moscow,berlin);
    }

    private static void rate(double s1, double s2) {
        System.out.println("Sootnoshenie ploshadej mezhdu BLR i UKR "+s1/s2);
    }
}
