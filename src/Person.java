public class Person {

    private int id;
    private String name;
    private String surname;

    public Person(String name, String surname) {
        id = 1;
        this.name = name;
        this.surname = surname;
    }
    // те методы были не нужны в дальнейшем, я их убрал

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Surname: " + surname;
    }

    public double getPaymentAmount() {
        return 0.0;
    }
}


// наконец разобрался с синтаксисом