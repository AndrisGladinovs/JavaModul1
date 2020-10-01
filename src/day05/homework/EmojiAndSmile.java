package day05.homework;

public class EmojiAndSmile {
    public static void main(String[] args) {
        // 1. We find the simple emojies and symboles and dispay them on the screen

        String beginning = "This is the list of all required symbols:";
        System.out.println(beginning);

        char smile = '\u263A';
        System.out.println("Emoji smile " + smile);

        char phone = '\u260E';
        System.out.println("Phone sign " + phone);

        char paragraph = '\u00B6';
        System.out.println("Paragraph sign " + paragraph);

        char copyright = '\u00A9';
        System.out.println("Copyright " + copyright);

        char team = '\u2122';
        System.out.println("Team " + team);

        char ruble = '\u20BD';
        System.out.println("Rouble currency " + ruble);

        char euro = '\u20AC';
        System.out.println("Euro currency " + euro);

        char dollar = 36;
        System.out.println("Dollar currency " + dollar);

        char pisces = '\u2653';
        System.out.println("Pisces zodiak sign " + pisces);

        char chest1 = '\u2654';
        char chest2 = '\u2655';
        char chest3 = '\u2656';
        char chest4 = '\u2657';
        char chest5 = '\u2658';
        char chest6 = '\u2659';

        System.out.println("All chest symbols " + chest1 + chest2 + chest3 + chest4 + chest5);

    }
}
