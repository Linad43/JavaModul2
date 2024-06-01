package abstractionLes.ex2;

public abstract class Bird {
    String name;
    int flySpeed;

    public Bird(String name, int flySpeed) {
        this.name = name;
        this.flySpeed = flySpeed;
    }

    public abstract void fly();

    public abstract void makeSound();
}
