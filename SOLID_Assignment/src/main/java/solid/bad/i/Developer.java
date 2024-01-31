package solid.bad.i;

import java.util.List;
import java.util.Map;

public class Developer implements IEmployee {
    User user;
    double bonus;
    Developer(User user, double bonus) {
        this.bonus = bonus;
        this.user = user;
    }
    @Override
    public double calculateSalary() {
        double salaryBonus = ( user.getSalary() * 10 ) / 100;
        if(salaryBonus <= bonus) {
            return user.getSalary() + bonus;
        } else {
            return user.getSalary() + salaryBonus;
        }
    }

    @Override
    public List<User> hire(User user) {
        return null;
    }

    @Override
    public boolean terminate(User user) {
        return false;
    }

    @Override
    public Map<User, String> generateReport() {
        return null;
    }

    @Override
    public void updateProfile(User user1) {
        if(user1.getId().equals(user.getId())) {
            this.user = user1;
        }
    }
}
