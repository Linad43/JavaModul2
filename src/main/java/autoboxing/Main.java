package autoboxing;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        //Не уверен по заданию, но с таким списком методов
        //можно играть в игру быки и коровы
        //ex1
        //=======================================

        Scanner scanner = new Scanner(System.in);
        String word = "game";
        String writtenWord = null;
        int bulls, cows;
        System.out.println("Загадано англ слово из 4-х букв, играем в быки и коровы");
        System.out.println("бык это полное совпвдение, корова есть совпадение но место не то");
        System.out.println("Ваш вариант:");
        while (true) {
            writtenWord = scanner.nextLine();
            bulls = matchElementAndIndex(stringToString(word), stringToString(writtenWord));
            cows = matchElementNotIndex(stringToString(word), stringToString(writtenWord)) - bulls;
            System.out.println("быки: " + bulls + " коровы: " + cows);
            if (matchElementAndIndex(stringToString(word), stringToString(writtenWord)) == word.toCharArray().length) {
                break;
            }
        }
        System.out.println("Вы выиграли");


        //ex2
        //======================================
        String[] numbers = new String[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = String.valueOf(i);
        }
        toStrin(numbers);
        swap(numbers, "1", "8");
        toStrin(numbers);
    }

    //ex1
    //================================================

    /**
     * Количество совпадений по содержанию и индексу
     *
     * @param array1
     * @param array2
     * @param <T>
     * @return
     */
    public static <T> int matchElementAndIndex(T[] array1, T[] array2) {
        int matches = 0;
        for (int i = 0; i < Math.min(array1.length, array2.length); i++) {
            if (array1[i].equals(array2[i])) {
                matches++;
            }
        }
        return matches;
    }

    /**
     * Наличие совпадений по содержанию и индексу
     *
     * @param array1
     * @param array2
     * @param <T>
     * @return
     */
    public static <T> boolean matchElementAndIndexBool(T[] array1, T[] array2) {
        for (int i = 0; i < Math.min(array1.length, array2.length); i++) {
            if (array1[i].equals(array2[i])) {
                return true;
            }
        }
        return false;
    }

    /**
     * Количество совпадений между двумя массивами,
     * не учитывая индексы элементов
     * Корректно работает если в обоих массивах все элементы уникальны
     *
     * @param array1
     * @param array2
     * @param <T>
     * @return
     */
    public static <T> int matchElementNotIndex(T[] array1, T[] array2) {
        int matches = 0;
        out:
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    matches++;
                    continue out;
                }
            }
        }
        return matches;
    }

    /**
     * Наличие совпадений между двумя массивами,
     * не учитывая индексы элементов
     *
     * @param array1
     * @param array2
     * @param <T>
     * @return
     */
    public static <T> boolean matchElementNotIndexBool(T[] array1, T[] array2) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String[] stringToString(String text) {
        String[] arrtext = new String[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arrtext[i] = String.valueOf(text.charAt(i));
        }
        return arrtext;
    }

    //ex2
    //================================================
    public static <T> T[] swap(T[] arr, int i, int j) {
        if (i > arr.length || i < 0 || j < 0 || j > arr.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        T buf = arr[i];
        arr[i] = arr[j];
        arr[j] = buf;
        return arr;
    }

    public static <T> T[] swap(T[] arr, T i, T j) throws Exception {
        int indexI = -1;
        for (int k = 0; k < arr.length; k++) {
            if (arr[k].equals(i)) {
                indexI = k;
                break;
            }
        }
        int indexJ = -1;
        for (int k = 0; k < arr.length; k++) {
            if (arr[k].equals(j)) {
                indexJ = k;
                break;
            }
        }
        if (indexI == -1 || indexJ == -1) {
            throw new Exception("Not found element in array");
        }
        return swap(arr, indexI, indexJ);
    }
    public static <T> void toStrin(T[] array){
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length-1]);
    }
}
