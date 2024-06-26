package abstractionLes;

import abstractionLes.ex1.*;
import abstractionLes.ex2.*;

public class Main {
    public static void main(String[] args) {

        //ex1
        //----------------------------------------------------
        Instrument guitar = new Guitar("Stratocaster");
        Instrument piano = new Piano("Marshal");
        Guitar guitar1 = new Guitar("Fender");
        guitar.tune();
        guitar.play();
        System.out.println();

        guitar1.tune();
        guitar1.play();
        System.out.println();

        piano.tune();
        piano.play();
        System.out.println();

        //ex2
        //----------------------------------------------------
        Bird eagle = new Eagle("bird1", 10);
        Bird hawk = new Hawk("bird2", 15);

        eagle.fly();
        eagle.makeSound();
        System.out.println();

        hawk.makeSound();
        hawk.fly();
    }
}