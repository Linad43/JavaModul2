package interfaceLes;

public class Human implements Swimmable, Flyable{
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void swim() {
        System.out.println("Человек может плавать различными способами");
    }

    @Override
    public void fly() {
        System.out.println("Человек летает в самолете, ну и в крайнем случае, можно приписать \"свободное падение\" ");
    }
}
