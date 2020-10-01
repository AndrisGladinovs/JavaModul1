package day09.MyTraining;

public class SpeedAndPenalty {
    public static void main(String[] args) {

        int speed = 145;
        if (speed<=50){
            System.out.println("Everything is ok. ");
        }
        else if (speed<=65){
            System.out.println("5 mint talk with policeman");
        }
        else if (speed<=100){
            System.out.println("40 € penalty");
        }
        else if (speed<=130){
            System.out.println("500 € penalty");
        }
        else {
            System.out.println("1000 € penalty and licence confiscation for 3 years");
        }
    }
}
