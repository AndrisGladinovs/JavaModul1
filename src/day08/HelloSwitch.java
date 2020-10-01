package day08;

public class HelloSwitch {
    public static void main(String[] args) {

        int schoolNote = 2;
        System.out.println(schoolNote);
        System.out.println(bonus(schoolNote));
    }

    private static String bonus(int note) {
        String output = "";
        switch (note) {
            case 5:
                output = "Will buy a bike";
                break;
            case 4:
                output = "GoPro7";
                break;
            case 3:
                output = "No award";
                break;
            case 2:
                output = "1h lost and a have bad mood";
                break;
            case 1:
                output = "Better dont ask me";
                break;
            default:
                output = "Please check again. This output doesnt excist";
                break;


        }
        return output;
    }

}
