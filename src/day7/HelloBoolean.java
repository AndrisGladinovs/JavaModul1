package day7;

public class HelloBoolean {
    public static void main(String[] args) {
        boolean a = true;
        boolean b, c;
        b = false;

        c = a & b; // logicheskoe and    ampersant znachenija  (konjuncija dejstvie) vzrivateli primer dva oficera (oba dolzh i bith true)
        System.out.println("a & b: " + c);

        c = a | b; // logicheskoe "ili" pipeline (disjungcija) ili mama dast ili papa dast denjgi (odin mozhet bitj true)
        System.out.println("a | b: " + c);

         // c = a ˆ b;  iskljuchiteljnoe edinstvennoe ili     ili edem k babushke ili v Alpi sto-to odno)

        c = a != b; // a neravno b        a!=b (a raven vsegda protivopolozhnosti b)

    }

    private static void itroductionBoolean() {

        int a = 1;
        int b = 2;
        System.out.println(a > 2);
        System.out.println(a < 2);

        System.out.println(a != b); // a neravno b
        System.out.println(a == b); // a ravno b
        itroductionBoolean();
    }

}
