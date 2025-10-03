package viikko4.lab;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        /* TODO validate */ 
        if (name.isBlank() || name == null) {
            throw new IllegalArgumentException("Väärä arvo!");
        }
        this.name = name;
    }

    public abstract String sound();
}