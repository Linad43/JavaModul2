package org.abstraction.ex1;

public class Guitar extends Instrument {
    public Guitar(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("Игра на гитаре " + name);
    }

    @Override
    public void tune() {
        System.out.println("Настройка гитары " + name);
    }
}
