package streamAPI;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("first");
        arrayList.add("second");
        arrayList.add("third");
        arrayList.add("fourth");
        arrayList.add("fifth");

        System.out.println(countString(arrayList, "f"));

        ArrayList<Person> listPerson = new ArrayList<>();
        listPerson.add(new Person("Freddie", 51));
        listPerson.add(new Person("John", 21));
        listPerson.add(new Person("Harry", 42));
        listPerson.add(new Person("Adam", 19));
        listPerson.add(new Person("Aidan", 34));
        listPerson.add(new Person("Joe", 33));
        listPerson.add(new Person("Evan", 20));
        listPerson.add(new Person("Alex", 29));
        listPerson.add(new Person("Benjamin", 18));
        listPerson.add(new Person("Oscar", 21));
        System.out.println();

        listPerson
                .stream()
                .filter(person -> person.age > 30)
                .sorted(Comparator.comparingInt(person -> person.age))
                .forEach(System.out::println);
        //System.out.println(listPerson);
    }

    public static long countString(ArrayList<String> list, String letter) {
        return list
                .stream()
                .filter(text -> String.valueOf(text.charAt(0)).equals(letter))
                .count();
    }
}
