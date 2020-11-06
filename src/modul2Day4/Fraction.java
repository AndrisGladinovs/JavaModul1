package modul2Day4;

public class Fraction {
    private int nomenator;
    private int deminator;

    public Fraction(int nomenator, int deminator) {
        this.nomenator = nomenator;
        this.deminator = deminator;
    }

    public int getNomenator() {
        return nomenator;
    }

    public int getDeminator() {
        return deminator;
    }

    Fraction(int nomenator){
        this.nomenator = nomenator;
        this.deminator = 1;



    }

    @Override
    public String toString() {
        return "Fraction(дробь){" +
                "nomenator(числитель)=" + nomenator +
                ", deminator=" + deminator +
                '}';
    }
}
