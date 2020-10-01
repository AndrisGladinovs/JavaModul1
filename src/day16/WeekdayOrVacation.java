package day16;

public class WeekdayOrVacation {
    public static void main(String[] args) {
        System.out.println(alarmClock(1, false)); //→"7:00"
        System.out.println(alarmClock(5, false)); //→"7:00"
        System.out.println(alarmClock(0, false)); //→"10:00"
    }

    private static String alarmClock(int day, boolean vacation) {
        String output = "";
        if (day >= 1 && day <= 5) {
            return "7:00";
        } else if (vacation || day == 0 || day == 6) {
            return "10:00";
        } else return output;
    }
}
