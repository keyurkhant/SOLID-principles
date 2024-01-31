package solid.bad.i;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("1", "Keyur", EmployeeType.DEVELOPER, 94000);
        User user2 = new User("2", "Khushal", EmployeeType.DEVELOPER, 120000);
        List<User> developerList = new ArrayList<>();
        developerList.add(user1);
        developerList.add(user2);
        IEmployee developer1 = new Developer(user1, 23000);
        IEmployee developer2 = new Developer(user2, 29000);

        IEmployee manager = new Manager(new User("3", "Vaidik", EmployeeType.MANAGER, 120000), 29000, developerList);

        System.out.println("Salary of developer 1: " + developer1.calculateSalary());
        System.out.println("Salary of developer 2: " + developer2.calculateSalary());

        System.out.println("Salary of Manager: " + manager.calculateSalary());

        User user2Update = new User("2", "Khushal", EmployeeType.DEVELOPER, 190000);

        developer2.updateProfile(user2Update);
        System.out.println("Salary of developer 2: " + developer2.calculateSalary());

    }
}
