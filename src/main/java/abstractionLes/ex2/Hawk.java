package abstractionLes.ex2;

public class Hawk extends Bird{
    public Hawk(String name, int flySpeed) {
        super(name, flySpeed);
    }

    @Override
    public void fly() {
        System.out.println("Hawk, a name " + name + " is fly, fly speed: " + flySpeed);
    }

    @Override
    public void makeSound() {
        System.out.println("Hawk, a name " + name + " sings");
    }
}
