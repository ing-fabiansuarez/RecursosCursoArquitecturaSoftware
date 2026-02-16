import java.util.List;

public class GameDevCompany extends Company {

    @Override
    public List<Employee> getEmployees() {
        return List.of(
                new Designer(),
                new Programmer()
        );
    }
}
