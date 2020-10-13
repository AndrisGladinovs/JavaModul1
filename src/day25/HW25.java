package day25;

public class HW25 {
    public static void main(String[] args) {
        //chartAt
        // Возвращает один символ по указанному индексу в строке.
        // Индекс (месторасположение символа) начинается с нуля.

                String s = "This is a test String";
                char result = s.charAt(6);
                System.out.println("CharAt result char: " + result);
// codePointAd (int index) возвращает значения символа строки в таблице Unicode.
// Отсчет начинается с нуля. Returns int number

        System.out.println(getcodePointAd(s)); // index 3 simvola 115

        // codePointBefore - This method returns the Unicode code point value before the given index.
        String str = "Java lesson";
        int output = str.codePointBefore(1);
        System.out.println("codePointBefore int Unicode result is empty space: " + output);

        // concat - combination of two strings is returned
        String example = "Gfg";
        example = example.concat("! is the best.");
        System.out.println(example); // result Gfg! is the best

        // equalsIgnoreCase - boolean true if the both Strings are equal.
        // doe not matter if they are upper or lowercase

        String hw1 = "This is Java";
        String hw2 = "this is java";
        String hw3 = "THIS iS JAVA";
        boolean retval1 = hw2.equalsIgnoreCase(hw1);
        boolean retval2 = hw2.equalsIgnoreCase(hw3);

        // prints the return value
        System.out.println("str2 is equal to str1 = " + retval1);
        System.out.println("str2 is equal to str3 = " + retval2);


        // contains - Return boolean Value: true if this string contains
        // the specified sequence of char values, false otherwise.

        // endsWith

        String str1 = new String("This is a test String");
        String str2 = new String("Test ABC");
        boolean var1 = str1.endsWith("String");
        boolean var2 = str1.endsWith("ABC");
        boolean var3 = str2.endsWith("String");
        boolean var4 = str2.endsWith("ABC");
        System.out.println("str1 ends with String: "+ var1);
        System.out.println("str1 ends with ABC: "+ var2);
        System.out.println("str2 ends with String: "+ var3);
        System.out.println("str2 ends with ABC: "+ var4);


        // compareToIgnoreCase - Сравнивает 2 строки String лексикографически
        // и возвращает 0, если они равны.
        // Этой функции неважно большие буквы или маленькие. В этом случае результат тоже будет равен 0 (строки равны)
         String test1 = "Hello World";
         String test2 = "hEllo worlD";
         if (test1.compareToIgnoreCase(test2) == 0) {
             System.out.println("compareToIgnoreCase. The both Strings are equal");
         } else {
             System.out.println("Strings are NOT equal!");
         }
    }

    private static int getcodePointAd(String str) {
        int result = str.codePointAt(3);
        return result;
    }
}

