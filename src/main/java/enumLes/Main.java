package enumLes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Alphabet alphabet;

    public static void main(String[] args) {
        //ex1
        //========================================
        System.out.println("Позиция буквы английского алфавита");
        String input;
        while (true) {
            System.out.println("Введите одну английскую букву");
            input = new Scanner(System.in).nextLine();
            if (input.length() == 1) {
                input = input.toUpperCase();
                try {
                    System.out.println(Alphabet.valueOf(input).ordinal());
                } catch (Exception e) {
                    System.out.println("Неверный ввод");
                    continue;
                }
                break;
            }
        }
        //ex2
        //=======================================
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Keith", 27, Person.Gender.MALE));
        persons.add(new Person("Jonathan", 20, Person.Gender.MALE));
        persons.add(new Person("Cheryl", 19, Person.Gender.FEMALE));
        persons.add(new Person("Arthur", 26, Person.Gender.MALE));
        persons.add(new Person("Gloria", 20, Person.Gender.FEMALE));
        persons.add(new Person("Victoria", 31, Person.Gender.FEMALE));
        persons.add(new Person("Wayne", 23, Person.Gender.MALE));
        persons.add(new Person("Jessica", 18, Person.Gender.FEMALE));
        persons.add(new Person("James", 29, Person.Gender.MALE));
        persons.add(new Person("Jeremy", 30, Person.Gender.MALE));

        printPerson(persons, Person.Gender.FEMALE);
    }

    enum Alphabet {
        A, B, C, D, E, F, G, H, I, J, K, L, M,
        N, O, P, Q, R, S, T, U, V, W, X, Y, Z
    }
    public static void printPerson(ArrayList<Person> array, Person.Gender gen){
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i).gender.equals(gen)){
                System.out.println(array.get(i));
            }
        }
    }

}
