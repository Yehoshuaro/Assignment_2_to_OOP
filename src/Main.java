import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Employee johnLennon = new Employee("John", "Lennon", "Manager", 100000.0);
        Employee georgeHarrison = new Employee("George", "Harrison", "Musician", 50000.0);
        Student ringoStarr = new Student("Ringo", "Starr", 2.0);
        Student paulMcCartney = new Student("Paul", "McCartney", 4.0);

        List<Person> people = new ArrayList<>();
        people.add(johnLennon);
        people.add(georgeHarrison);
        people.add(ringoStarr);
        people.add(paulMcCartney);

        // сортировка
        people.sort((person1, person2) -> {
            double paymentAmount1 = person1.getPaymentAmount();
            double paymentAmount2 = person2.getPaymentAmount();
            return Double.compare(paymentAmount1, paymentAmount2);
        });

        for (Person person : people) {
            System.out.println(person);
        }
    }
}

