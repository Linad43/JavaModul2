package interfaceLes;

public class Bird implements Swimmable, Flyable{
    String name;
    int age;

    public Bird(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void swim() {
        System.out.println("Птица не плавает, только редкие виды могут не надолго нырять за пищей");
        System.out.println("Хотя пингвины это птицы которые плавают");
    }

    @Override
    public void fly() {
        System.out.println("Птицы хорошо летают, в большинстве)");
    }
}
