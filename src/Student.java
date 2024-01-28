class Student extends Person {

    private double gpa;

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    // тут стипендию надо как-то добавить к "зарплате"
    private double calculatePaymentAmount() {
        if (gpa > 2.67) {
            return 36660.00;
        } else {
            return 0.0;
        }
    }

    @Override
    public String toString() {
        return "Student: " + super.toString() + ", GPA: " + gpa;
    }
}

