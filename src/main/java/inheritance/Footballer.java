package inheritance;

public class Footballer extends Sportsman {
    private int goals;

    public Footballer(String name, String team, int age, int goals) {
        super(name, team, age);
        this.goals = goals;
    }

    public void scoringGoals() {
        System.out.println("Результат игрока " + this.getName() + " - " + this.getGoals() + " забитых мячей");
    }

    @Override
    public String toString() {
        return "Футболист " + super.toString();
    }

    public void info() {
        System.out.println(this);
    }

    public int getGoals() {
        return goals;
    }
}
