package modul2Day4;

public class Book {
    private static int exemplar = 0;
    private String title;
    private String author;
    private String isbn;
    private int page;
    private int year;

    public Book(String title, String author, String isbn, int page, int year) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.page = page;
        this.year = year;
    }

    public Book(String title, String author, String isbn, int page) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.page = page;
    }

    public static int getExemplar() {
        return exemplar;
    }

    public static void setExemplar(int exemplar) {
        Book.exemplar = exemplar;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
