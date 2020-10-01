package day09;

public class Peljmenj {
    public static void main(String[] args) {
        //happyPelmen();
        moduloThree();
        myLine(100);
    }

    private static void myLine(int i) {
        for (int j = 0; j < 100; j++) {

        }
    }


    private static void moduloThree() {
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.print(" " + i);


            }

        }
    }

        private static void happyPelmen() {
            for (int i = 1; i < 10; i++) {
                if (i == 5) {
                    System.out.println("Eto schastlivij pelmenj");
                    break;
                }
                System.out.println("Shag cikla" + i);
            }
        }
}


