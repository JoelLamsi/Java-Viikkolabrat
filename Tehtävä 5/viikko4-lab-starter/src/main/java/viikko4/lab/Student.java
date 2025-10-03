package viikko4.lab;

public class Student {
    private String name;
    private Integer credits;

    public Student(String n, Integer c) {
        /* TODO */ 
        if (n.isBlank() || n == null || c < 0 || c == null) {
            throw new IllegalArgumentException("Opiskelijalle annettu virheellisiä arvoja");
        }
        this.name = n;
        this.credits = c;
    }

    public String getName() {
        return name;
    }

    public Integer getCredits() {
        return credits;
    }
}