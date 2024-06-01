package inheritance;

public class Skier extends Sportsman {
    private int distance;

    public Skier(String name, String team, int age, int distance) {
        super(name, team, age);
        this.distance = distance;
    }

    public void traveledDistance() {
        System.out.println("Результат игрока " + this.getName() + " - " + this.getDistance() + " метров пройденной дистанции на лыжах");
    }

    @Override
    public String toString() {
        return "Лыжник " + super.toString();
    }

    public void info() {
        System.out.println(this);
    }

    public int getDistance() {
        return distance;
    }
}
