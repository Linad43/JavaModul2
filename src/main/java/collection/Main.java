package collection;

import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("red");
        color.add("blue");
        color.add("green");

        System.out.println(color);
        System.out.println(findArrayListBool(color,"blu"));
        System.out.println(findArrayListInt(color,"blu"));

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        System.out.println(numbers);
        firstToEnd(numbers);
        System.out.println(numbers);

    }

    /**
     * Поиск элемента в ArrayList по ТЗ
     *
     * @param arrayList - где производим поиск
     * @param target    - искомое
     * @param <T>       - тип списка
     * @return - true/false - найдено/не найдено
     */
    public static <T> boolean findArrayListBool(ArrayList<T> arrayList, T target) {
        for (T element : arrayList) {
            if (element.equals(target)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Поиск элемента в ArrayList мой вариант
     *
     * @param arrayList - где производим поиск
     * @param target    - искомое
     * @param <T>       - тип списка
     * @return - индекс числа в коллексии иначе (-1)
     */
    public static <T> int findArrayListInt(ArrayList<T> arrayList, T target) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).equals(target)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Первый элемент на последний, а последний на первый
     * @param linkedList
     * @return
     * @param <T>
     */
    public static <T> LinkedList<T> firstToEnd(LinkedList<T> linkedList) {
        T buf = linkedList.getFirst();
        linkedList.removeFirst();
        linkedList.addFirst(linkedList.getLast());
        linkedList.removeLast();
        linkedList.addLast(buf);
        return linkedList;
    }
}
