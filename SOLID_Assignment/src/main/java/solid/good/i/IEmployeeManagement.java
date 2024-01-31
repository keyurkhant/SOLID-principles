package solid.good.i;

import java.util.List;
import java.util.Map;

public interface IEmployeeManagement {
    List<User> hire(User user);
    boolean terminate(User user);
    Map<User, String> generateReport();
}
