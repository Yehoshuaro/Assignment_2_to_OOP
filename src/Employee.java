class Employee extends Person {

    private String position;

    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        this.position = position;
    }
    @Override
    public String toString() {
        return "Employee: " + super.toString() + ", Position: " + position;
    }
}