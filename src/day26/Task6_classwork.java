package day26;

public class Task6_classwork {
    public static void main(String[] args) {
        //1 . probezhatj ciklom po vsem simvolam
        //2. najti tochku vhoda, mestorospolozhenie star "*"
        // 3. Proveritj esli star i-1 i star i+1 ravni, to vernutj true

        System.out.println(sameStarChar("xy*yzz")); //→true
        System.out.println(sameStarChar("xy*zzz")); //→false
        System.out.println(sameStarChar("*xa*az")); //→true
    }

    private static boolean sameStarChar(String input) {
        char star = '*';
        for (int i = 0; i < input.length(); i++) {
            if ((i == 0 || i == input.length() - 1) && input.charAt(i) == star) {
                return false;
            } else if (input.charAt(i) == star && input.charAt(i - 1) != input.charAt(i + 1)) {
                return false;
            }

        }
        return true;
    }
}
