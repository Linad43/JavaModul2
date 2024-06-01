package inheritance;

public class Main {
    public static void main(String[] args) {
        Footballer footballer = new Footballer("Lem", "Best", 27, 19);
        HockeyPlayer hockeyPlayer = new HockeyPlayer("Sem", "BestOfTheBest", 27, 43);
        Skier skier = new Skier("Den", "Lider", 27, 1900);

        footballer.info();
        footballer.scoringGoals();
        System.out.println();

        hockeyPlayer.info();
        hockeyPlayer.scoringGoals();
        System.out.println();

        skier.info();
        skier.traveledDistance();
    }
}
