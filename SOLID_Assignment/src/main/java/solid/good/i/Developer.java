package solid.good.i;

public class Developer implements IEmployee{
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
    public void updateProfile(User user1) {
        if(user1.getId().equals(user.getId())) {
            this.user = user1;
        }
    }
}
