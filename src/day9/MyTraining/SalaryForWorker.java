package day9.MyTraining;

public class SalaryForWorker {
    public static void main(String[] args) {

        //Напишите программу выдачи денег работнику с учётом надбавки за стаж
        // если базовая зарплата 500$.
        // За 3 года работы надбавка 10%
        // за 5 лет работы надбавка 50%
        // за 10 лет работы надбавка 100%
        // за 15 лет работы надбавка 150%.

        int mainSalary = 500;
        int yearExperience = 11;

        System.out.println("Your salary is " + calculationMethod(mainSalary, yearExperience) + "€");
    }

    private static double calculationMethod(int salary, int experience) {
        double result = 0.0;
        if (experience == 3) {
            result = salary * 1.1;
        } else if (experience <= 5) {
            result = salary * 1.5;
        } else if (experience <= 10) {
            result = salary * 2.0;
        } else if (experience <= 15) {
            result = salary * 2.5;
        }
        return result;
    }


}
