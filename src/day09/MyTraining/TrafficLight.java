package day9.MyTraining;

public class TrafficLight {
    public static void main(String[] args) {
        // Напишите программу для машины на светофоре.
        // Что делать, если горит красный, жёлтый или зелёный свет.

        String str = "purple";


        if (str.contains("red")) {
            System.out.println("Red- dont, drive!");
        }
        else if (str.contains("yellow")) {
            System.out.println("Yellow - be ready");
        }
        else if (str.contains("green")) {
            System.out.println("Green - GO!");
        }
        else {
            System.out.println("Input incorrect. Please try again");
        }

    }
}
