package viikko4.lab;

public class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        /* TODO validate */ 
        if (name.isBlank() || name == null || age < 0) {
            throw new IllegalArgumentException("Väärä arvo!");
        } 
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}