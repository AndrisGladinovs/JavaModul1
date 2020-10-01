package day08;

public class MyFirstCalendar {
    public static void main(String[] args) {

        String month = "april";
        System.out.println(getMeMonthNumber(month));
    }

    private static int getMeMonthNumber(String month) {
        month = month.substring(0, 1).toUpperCase() + month.substring(1).toLowerCase();
        int result = 0;
        switch (month) {
            case "January":
                result = 1;
                break;
            case "February":
                result = 2;
                break;
            case "March":
                result = 3;
                break;
            case "April":
                result = 4;
                break;
            case "May":
                result = 5;
                break;
            case "June":
                result = 6;
                break;
            case "July":
                result = 7;
                break;
            case "August":
                result = 8;
                break;
            case "September":
                result = 9;
                break;
            case "October":
                result = 10;
                break;
            case "Novemeber":
                result = 11;
                break;
            case "December":
                result = 12;
                break;
            default:
                result = -1;
                break;

        }

        return result;

    }
}
