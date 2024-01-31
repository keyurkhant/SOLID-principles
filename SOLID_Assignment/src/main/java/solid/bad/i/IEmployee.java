package solid.bad.i;

import java.util.List;
import java.util.Map;

public interface IEmployee {
    double calculateSalary();
    List<User> hire(User user);
    boolean terminate(User user);
    Map<User, String> generateReport();
    void updateProfile(User user);
}
