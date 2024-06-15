package collection.hash;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        //ex1
        //==================================
        HashSet<String> setOne = new HashSet<>();
        HashSet<String> setTwo = new HashSet<>();
        setOne.add("red");
        setOne.add("orange");
        setOne.add("yellow");
        setOne.add("green");
        setOne.add("blue");
        setOne.add("indigo");
        setOne.add("violet");
        setTwo.add("red");
        setTwo.add("orange");
        setTwo.add("yellow");
        setTwo.add("green");
        setTwo.add("blue");
        setTwo.add("white");
        setTwo.add("black");
        System.out.println(setOne);
        System.out.println(setTwo);
        System.out.println(equals(setOne, setTwo));

        //ex2
        //==================================
        HashSet <Integer> setInt = newHashSetRandom();
        System.out.println(setInt);
        System.out.println(tzHashSet(setInt));
    }

    /**
     * Сраврение двух наборов, и сохранение набора с одинаковыми элементами
     *
     * @param set1 - первый набоо
     * @param set2 - второй набор
     * @param <T>  - параметр входного набора
     * @return - результирующий набор
     */
    public static <T> HashSet<T> equals(HashSet<T> set1, HashSet<T> set2) {
        HashSet<T> result = new HashSet<>();
        for (T element1 : set1) {
            for (T element2 : set2) {
                if (element1.equals(element2)) {
                    result.add(element1);
                }
            }
        }
        return result;
    }

    /**
     * Создание HashSet с случайными элементами
     *
     * @param count - кол-во элементов в наборе
     * @param min   - минимальное значение для элемента
     * @param max   - максимальное значение для элемента
     * @return - результирующий набор
     */
    public static HashSet<Integer> newHashSetRandom(int count, int min, int max) {
        HashSet<Integer> result = new HashSet<>();
        Integer num;
        for (int i = 0; i < count; i++) {
            num = (int) (Math.random() * (max - min)) + min;
            result.add(num);
        }
        return result;
    }
    public static HashSet<Integer> newHashSetRandom(int count){
        return newHashSetRandom(count, 0, 100);
    }
    public static HashSet<Integer> newHashSetRandom(){
        return newHashSetRandom(10);
    }


    /**
     * Вывод в консоль с соблюдением ТЗ
     *
     * @param set - входной набор
     */
    public static HashSet<Integer> tzHashSet(HashSet<Integer> set) {
        HashSet<Integer> result = new HashSet<>();
        for (Integer element : set) {
            if (element > 15 && element % 2 == 0) {
                result.add(element);
            } else {
                result.add(element/2);
            }
        }
        return result;
    }
}
