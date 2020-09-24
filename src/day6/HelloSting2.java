package day6;

public class HelloSting2 {
    public static void main(String[] args) {
        String poema = "Я памятник-воздвиг себе нерукотворный";
        int dlinna = poema.length();
        System.out.println(dlinna);
        String preview = poema.substring(0, 10); //pokazatj pervie 10 simvolov
        System.out.println(preview + "...");
        String endPoema = poema.substring(dlinna - 10);//pokazatj 10 imvolov s konca
        System.out.println(endPoema);

        char test = poema.charAt(0);
        System.out.println(test);

        char test2 = poema.charAt(dlinna - 1);
        System.out.println(test2);
    }
}
