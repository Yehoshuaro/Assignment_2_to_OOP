public class Person {

    private int id;
    private String name;
    private String surname;

    public Person() {
        id = 1;
    }

    public Person(String name, String surname) {
        id = 1;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return String.format("ID %d: %s %s", id, name, surname);
    }
}