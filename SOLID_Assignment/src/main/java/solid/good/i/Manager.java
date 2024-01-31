package solid.good.i;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Manager implements IEmployee, IEmployeeManagement {

    User user;
    double allownce;

    List<User> developerList;

    Manager(User user, double allownce, List<User> developerList) {
        this.user = user;
        this.allownce = allownce;
        this.developerList = developerList;
    }
    @Override
    public double calculateSalary() {
        double salaryAllownce = ( user.getSalary() * 30 ) / 100;
        if(allownce <= salaryAllownce) {
            return user.getSalary() + salaryAllownce;
        } else {
            return user.getSalary() + allownce;
        }
    }

    @Override
    public List<User> hire(User user) {
        if(!developerList.contains(user)) {
            developerList.add(user);
        }
        return developerList;
    }

    @Override
    public boolean terminate(User user) {
        if(developerList.contains(user)) {
            developerList.remove(user);
            return true;
        }
        return false;
    }

    @Override
    public Map<User, String> generateReport() {
        Map<User, String> results = new HashMap<>();
        for(User user1: developerList) {
            if(user1.getSalary() <= 80000) {
                results.put(user1, user1.getDesignation().toString());
            }
        }
        return results;
    }

    @Override
    public void updateProfile(User user) {
        for(User user1: developerList) {
            if(user1.getId().equals(user.getId())) {
                int idx = developerList.indexOf(user1);
                developerList.remove(idx);
                developerList.add(user1);
            }
        }
    }
}
