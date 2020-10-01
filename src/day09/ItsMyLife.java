package day09;

public class ItsMyLife {
    public static void main(String[] args) {

        loop();
        forIntroductionOne();
        forIntroductionTwo();
    }

    private static void forIntroductionTwo() {
        for (int i = 0; i < 10; i=i+2) {
            System.out.println("Step " + i);

        }
    }

    private static void forIntroductionOne() {
        int a=0;
        for (int i = 0; i < 10; i++) {
            a++;
        }
        for (int i = 0; i < 20; i++) {
            a++;
        }
        System.out.println(a);
    }

    private static void loop() {
        int workWeekDays = 5;
        int j=0;
        //budem rabotatj poka ne zakonchitsja vtoroe uslovie
        j=j+1;
        //nachalo, uslovie, shag
        for (int i = 0; i < workWeekDays; i++) {


        System.out.println("________");
        System.out.println("Novij denj");
        System.out.println("Vstaju v 6 utra");
        System.out.println("Na zavod v 8");
        System.out.println("Doma snova v 18:00");
        System.out.println("Smotrju dva chasa Netflix");
        System.out.println("Sigareta s sosedom");
        System.out.println("Denj podhodit k koncu");
        System.out.println("Idu spatj");
        System.out.println("_________");
        }
    }
}
