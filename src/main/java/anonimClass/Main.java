package anonimClass;

public class Main {
    public static void main(String[] args) {
        Printable printable1 = new Printable() {
            @Override
            public void print() {
                System.out.println("Первый вариант");
            }
        };
        Printable printable2 = new Printable() {
            @Override
            public void print() {
                System.out.println("Второй вариант");
            }
        };
        Printable printable3 = new Printable() {
            @Override
            public void print() {
                System.out.println("Третий вариант");
            }
        };

        printable1.print();
        printable2.print();
        printable3.print();


        Concationble concationble1 = new Concationble() {
            @Override
            public String concat(String text1, String text2) {
                return text1 + text2;
            }
        };
        Concationble concationble2 = new Concationble() {
            @Override
            public String concat(String text1, String text2) {
                return text2 + text1;
            }
        };

        System.out.println(concationble1.concat(" first ", "second"));
        System.out.println(concationble2.concat(" first ", "second"));
    }
}
