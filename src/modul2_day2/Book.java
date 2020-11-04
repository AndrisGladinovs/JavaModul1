package modul2_day2;

public class Book {
    String name;
    String author;
    int year;

    public Book (String bookAuthor, String bookName, int bookYear) {
        author = bookAuthor;
        name = bookName;
        year = bookYear;
        displayInfo();
    }

    private void displayInfo() {
        System.out.println("Author: " + author);
        System.out.println("Book name: " + name);
        System.out.println("Published year: " + year);
    }
    class AllBooks {
        public static void main(String[] args) {
            Book number1 = new Book("Leo Tolstoy", "War and Peace", 1865);
            number1.displayInfo();
            System.out.println();
            Book number2 = new Book("Jane Austen", "Pride and Prejudice", 1813);
            number2.displayInfo();
            System.out.println();
            Book number3 = new Book("Dante", "Inferno", 1861);
            number3.displayInfo();
            System.out.println();
            Book number4 = new Book("Joshua Bloch", "Effective Java", 2017);
            number4.displayInfo();
            System.out.println();

        }
    }
}
