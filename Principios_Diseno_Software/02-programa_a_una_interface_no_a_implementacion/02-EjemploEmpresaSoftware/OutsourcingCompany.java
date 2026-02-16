import java.util.List;

public class OutsourcingCompany extends Company {

    @Override
    public List<Employee> getEmployees() {
        return List.of(
                new Programmer(),
                new Tester()
        );
    }
}
