package day5.homework;

public class NumberPiAndFunctions {
    //Задание. Взять из библиотеки Java число PI и:
    //*окрулить его до потолка
    //*округлить его вниз
    //*округлить его математически
    //*округлённое математическое число вывести на экран целым числом инт (число без точки и дальнейшей цифрой)
    public static void main(String[] args) {
        double number=Math.PI;
        System.out.println(number);
        playwithfunctions(number);
        fromDoubleMakeInt();
    }

    private static void playwithfunctions(double number) {
        double ceilresult=Math.ceil(number);
        System.out.println(ceilresult);
        double floorResult=Math.floor(number);
        System.out.println(floorResult);
        double roundResult=Math.round(number);
        System.out.println(roundResult);
    }

    private static void fromDoubleMakeInt() {
        double PI=Math.PI;
        int newPI=(int)PI;
        System.out.println(newPI);
    }

}

