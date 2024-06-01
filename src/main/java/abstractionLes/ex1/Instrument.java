package abstractionLes.ex1;

public abstract class Instrument {
    String name;

    public Instrument(String name) {
        this.name = name;
    }

    public abstract void play();

    public abstract void tune();

}
