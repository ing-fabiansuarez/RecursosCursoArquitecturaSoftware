import java.util.List;
import java.util.ArrayList;

public class Company {

    public void createSoftware() {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Designer());
        employees.add(new Programmer());
        employees.add(new Tester());

        for (Employee e : employees) {
            e.doWork();
        }
    }
}