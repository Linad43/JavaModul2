package interfaceLes;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Роман", 21);
        Fish fish = new Fish("Немо", 1);
        Bird bird = new Bird("Кеша", 3);

        human.swim();
        human.fly();
        System.out.println();

        fish.swim();
        System.out.println();

        bird.swim();
        bird.fly();
    }
}
