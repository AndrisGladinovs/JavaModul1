package day09;

public class HelloIf {
    public static void main(String[] args) {
        ifIntroductionFor();

        boolean permission=true;
        if (permission==true){
            System.out.println("You can go to summer camp");
        }
        else {
                System.out.println("All summer at home!");
            }
    }

    private static void ifIntroductionFor() {
        if(true){
            System.out.println("Alles ist gut");
        }
    }
}
