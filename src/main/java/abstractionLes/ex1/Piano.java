package abstractionLes.ex1;

public class Piano extends Instrument {
    public Piano(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("Игра на пианино " + name);
    }

    @Override
    public void tune() {
        System.out.println("Настройка пианино " + name);
    }
}
