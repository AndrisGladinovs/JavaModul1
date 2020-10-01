package Day4.TestirujuZadanija;

public class GermanijaProtivLatvii {
    //1. Задача узнать во сколько раз територия Германии больше Латвии.
    //2. Узнать соотношение Берлина по отношению к Риге, если в Берлине живёт 3_500_000 человек, а в Риге 800_000
    //3. Сколько процентов русскоязычных живёт в Берлине, если в Берлине живёт 3_500_000 человек, а русскоязычных из них примерно 300_000

    public static void main(String[] args) {
        double germanyTeritory = 357_386;
        double latviaTeritory = 64_589;
        calculationTeritory(germanyTeritory, latviaTeritory);
        people();
        calculationPeople(100,8);
        procenti();
    }

    private static void calculationTeritory(double de, double lv) {
        double result = de / lv;
        System.out.println("Соотношение площади Германии к площади Латвии составляет " + result);
    }

    public static void people() {
        double peopleBerlin = 3_500_000;
        double peopleRiga = 800_000;
        calculationPeople(peopleBerlin, peopleRiga);
    }

    private static void calculationPeople(double berlin, double riga) {
        double result2 = berlin / riga;
        System.out.println("Жителей в Берлине на " + result2 + "раз Больше, чем жителей Риги");

    }

    public static void procenti() {
        double berlinAll = 3_500_000;
        double rus_speaking = 300_000;
        percentRussians(berlinAll, rus_speaking);
    }

    private static void percentRussians(double all, double rus) {
        double result3 = (rus / all) * 100;
        int preciseStatsRus = (int) result3;
        System.out.println("В Берлине из всего населения  " + preciseStatsRus + "% русскоязычные");
    }
}
