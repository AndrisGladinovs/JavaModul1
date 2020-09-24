package day7;

public class LogicTask01 {
    public static void main(String[] args) {

        boolean electro= true;
        boolean internet = true;

        verySmartDoor(false, true, false); //-> true
        verySmartDoor(false, false, true); //-> true
        verySmartDoor(true, false, false); //-> true
        verySmartDoor(false, false, false); //-> false

    }

    private static void verySmartDoor(boolean b, boolean b1, boolean b2) {
    }


}


