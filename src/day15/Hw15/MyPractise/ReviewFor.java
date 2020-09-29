package day15.Hw15.MyPractise;

public class ReviewFor {
    public static void main(String[] args) {
        //System.out.println(CheckLetter("New York"));
        //System.out.println(CheckLetter("Boston"));
        //System.out.println(CheckLetter("Valley bay"));
        //System.out.println(CheckLetter("Brooklyn"));

        System.out.println(checkEasyWay("Germany"));
        System.out.println(checkEasyWay("Georgia"));
        System.out.println(checkEasyWay("Great Britain"));

    }

    private static boolean checkEasyWay(String country) {
        String output = "";

        if (country.substring(0, 3).contains("Ge")) {
            return  true;
        } else {
            return false;
        }
    }
    }

    /*private static boolean CheckLetter(String name) {
        String input = name.toLowerCase();
        if (name.toLowerCase().contains("b")) {
            return true;
        } else {
            return false;
        }
    }
}

     */
