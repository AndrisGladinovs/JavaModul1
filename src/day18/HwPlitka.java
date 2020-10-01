package day18;

public class HwPlitka {
    public static void main(String[] args) {
        /*
1. Узнать плошадь комнаты и размер 1 плитки
2. Расчитать количество целых и отпилиных плиток для опции 1
3. Расчитать количество целых и отпилиных плиток для опции 2
4. Расчитать цену за работу и цену за материалы
         */
        double dlinaKomnati = 7.0;
        double shirinaKomnati = 5.0;
        double shirinaP = 0.2;
        double dlinaP = 0.3;
        int hourRate = 27; // 27 euro v chas
        double plitkaPrice = 2.50; // cena za 1 plitku

        System.out.println(getWorkerPrice(dlinaKomnati, shirinaKomnati, hourRate));
        System.out.println(option1(dlinaKomnati, shirinaKomnati, shirinaP, dlinaP, plitkaPrice));
        System.out.println(option2(dlinaKomnati, shirinaKomnati, shirinaP, dlinaP, plitkaPrice));

    }

    private static String getWorkerPrice(double dlinaKomnati, double shirinaKomnati, int hourRate) {
        double workerPrice = dlinaKomnati * shirinaKomnati * (hourRate * 19 / 100);
        return "Услуги мастера будут стоить " + workerPrice + " €";

    }

    private static String option2(double dlinaKomnati, double shirinaKomnati, double shirinaP, double dlinaP, double plitkaPrice) {
        // вертикально - идём от больше стороны стены к меньшей

        double roomShortSide = shirinaKomnati / shirinaP;
        int plitkiShortSide = (int) roomShortSide;
        int shortSideAllPlitki = (int) Math.ceil(roomShortSide);
        double roomLongSide = dlinaKomnati / dlinaP;
        int plitkiLongSide = (int) Math.floor(roomLongSide);
        int longSideAllPlitki = (int) Math.ceil(roomLongSide);
        int totalCeliePlitki2 = plitkiLongSide * plitkiShortSide;
        int totalPlitkiAmount2 = longSideAllPlitki * shortSideAllPlitki;
        int totalcuttedPlitki2 = totalPlitkiAmount2 - totalCeliePlitki2;
        double materialPrice2 = totalPlitkiAmount2 * plitkaPrice;
        return "Во втором случае надо  " + totalPlitkiAmount2 + " плиток, из них " + totalCeliePlitki2
                + " целых и " + totalcuttedPlitki2 + " порезанных." +
                " Затраты на плитку " + materialPrice2 + " €";

    }

    private static String option1(double dlinaKomnati, double shirinaKomnati, double shirinaP, double dlinaP, double plitkaPrice) {
        //Расчитываем горизонтально -
        // плитка идёт от меньшей стороны комнаты

        double roomShortSide = shirinaKomnati / dlinaP; // 16.66 - Количество плиток по ширине комнаты
        int plitkiShortSide = (int) roomShortSide; // 16 - Количество целых плиток short side wall
        int shortSideAllPlitki = (int) Math.ceil(roomShortSide); // 17 - Общее количество плиток in short side wall
        double roomLongSide = dlinaKomnati / shirinaP; // 35 - количество плитки по длинной стороне
        int plitkiLongSide = (int) Math.floor(roomLongSide); // 35 - Количество целых плиток long side
        int longSideAllPlitki = (int) Math.ceil(roomLongSide); // 35 - Общее количество плиток long side wall
        int totalCeliePlitki = plitkiLongSide * plitkiShortSide; // общеe количество целых плитки = Math.floor(плитки длина комнаты) * Math.floor (плитки ширина комнаты)
        int totalPlitkiAmount = longSideAllPlitki * shortSideAllPlitki; // общеe количество всех потраченных плиток = Math.ceil(длина комнаты) * Math.ceil(ширина комнаты)
        int totalcuttedPlitki = totalPlitkiAmount - totalCeliePlitki; // Количество отпилиных /порезанных плиток = Все плитки - все целые плитки;
        double materialPrice = totalPlitkiAmount * plitkaPrice;

        return "В первом случае надо " + totalPlitkiAmount + " плиток, из них " + totalCeliePlitki
                + " целых и " + totalcuttedPlitki + " порезанных." +
                " Затраты на плитку " + materialPrice + " €";

    }
}






