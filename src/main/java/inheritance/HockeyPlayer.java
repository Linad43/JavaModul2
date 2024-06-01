package inheritance;

public class HockeyPlayer extends Sportsman {
    private int goals;

    public HockeyPlayer(String name, String team, int age, int goals) {
        super(name, team, age);
        this.goals = goals;
    }

    public void scoringGoals() {
        System.out.println("Результат игрока " + this.getName() + " - " + this.getGoals() + " забитых шайб");
    }

    @Override
    public String toString() {
        return "Хоккеист " + super.toString();
    }

    public void info() {
        System.out.println(this);
    }

    public int getGoals() {
        return goals;
    }
}
