package day5.homework;

public class Anketa {
    public static void main(String[] args) {

        String name = "Jack";
        String surname = "Brown";
        String city = "Boston";
        String country = "Usa";
        String email = "jack23@gmail.com";
        String mobile = "+1572290298008";
        char tabulator = '\t';

        //Опция первая вывода по строкам
        System.out.println("Name   " + "   " + name + "\n"
                + "Surname:  " + surname + "\n"
                + "City:   " + "  " + city + "\n"
                + "Country:  " + country + "\n"
                + "Email: " + tabulator + email + "\n"
                + "Mobile:   " + mobile + "\n");

        // Опция вторая вывода по строкам

        System.out.println("Буря мглою небо кроет"+System.lineSeparator()
                            + "Вихри снежные крутя."+ System.lineSeparator()
                            + "То как зверь она завоет,"+ System.lineSeparator()
                            + "То заплачет как дитя.");

    }
}
