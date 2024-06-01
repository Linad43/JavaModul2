package inheritance;

public class Sportsman {
    private String name;
    private String team;
    private int age;

    public Sportsman(String name, String team, int age) {
        this.name = name;
        this.team = team;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return  name +
                ", играет в команде " + team +
                ", ему " + age +
                " лет";
    }
    public void info(){
        System.out.println(this);
    }
}
