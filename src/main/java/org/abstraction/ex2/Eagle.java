package org.abstraction.ex2;

public class Eagle extends Bird{
    public Eagle(String name, int flySpeed) {
        super(name, flySpeed);
    }

    @Override
    public void fly() {
        System.out.println("Eagle, a name " + name + " is fly, fly speed: " + flySpeed);
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle, a name " + name + " sings");
    }
}
