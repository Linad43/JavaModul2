package debug;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = newArrayListRandom(5, 0, 9);
        int chet = arrayList.stream()
                .filter(num -> num % 2 == 0)
                .max(Comparator.comparingInt(x -> x))
                .get();

        System.out.println(arrayList);

        System.out.println("  chet = " + chet);

        String text = "Привет, Александр, с праздником, с Новым Годом";
        System.out.println(text);
        char[] textChar = text.toCharArray();
        for (int i = 0; i < textChar.length; i++) {
            if (Character.isUpperCase(textChar[i])) {
                textChar[i] = Character.toLowerCase(textChar[i]);
            } else {
                textChar[i] = Character.toUpperCase(textChar[i]);
            }
        }
        text = String.valueOf(textChar);
        System.out.println(text);
    }

    public static ArrayList<Integer> newArrayListRandom(int count, int min, int max) {
        ArrayList<Integer> result = new ArrayList<>();
        Integer num;
        for (int i = 0; i < count; i++) {
            num = (int) Math.round((Math.random() * (max - min)) + min);
            result.add(num);
        }
        return result;
    }

    public static ArrayList<Integer> newArrayListRandom(int count) {
        return newArrayListRandom(count, 0, 100);
    }

    public static ArrayList<Integer> newArrayListRandom() {
        return newArrayListRandom(10);
    }
}
