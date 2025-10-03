package viikko4.lab;

public class Book {
    private String title, author;
    private Integer year;

    public Book(String t, String a, Integer y) {
        /* TODO */ 
        if (t.isBlank() || t == null || a.isBlank() || a == null || y <= 0) {
            throw new IllegalArgumentException("Kirjalle annettu vääriä arvoja");
        }
        this.title = t;
        this.author = a;
        this.year = y;
    }

    public String label() {
        /* TODO */ return String.format("%s: %s (%d)", author, title, year);
    }
}