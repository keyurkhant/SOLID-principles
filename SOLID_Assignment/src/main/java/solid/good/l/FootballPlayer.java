package solid.good.l;

public class FootballPlayer extends Player {
    private int goalsScored;
    public FootballPlayer(String id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public void setId(String id) {
        super.setId(id);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    public int getGoalsScored() {
        return goalsScored;
    }
}
