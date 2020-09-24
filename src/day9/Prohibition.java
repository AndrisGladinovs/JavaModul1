package day9;

public class Prohibition {
    public static void main(String[] args) {
        //ifIntroductionOne();
        ifIntroductionTwo();
        ifIntroductionThree();
        ifIntroductionFour();
    }

    private static void ifIntroductionFour() {
    }

    private static void ifIntroductionThree() {
        int age =18;
        if (age<16){
            System.out.println("Kategaricheski zapreshenno");
        }else if (age>=16 && age<18){
            System.out.println("Mozhno slabij alkogolj");
        }else {
            System.out.println("Mozhno prodavatj");
        }
    }

    private static void ifIntroductionTwo() {
        if (3<5){
            System.out.println("This is true");
        } else {
            System.out.println("This is false");
        }
    }
}
