package streamAPI2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = newArrayListRandom(400, 0, 10);
        int chet = arrayList.stream()
                .filter(num -> num % 2 == 0)
                .reduce((x, y) -> x + y)
                .get();
        int nechet = arrayList.stream()
                .filter(num -> num % 2 != 0)
                .reduce((x, y) -> x + y)
                .get();

        System.out.println(arrayList);

        System.out.println("  chet = " + chet);
        System.out.println("nechet = " + nechet);

        arrayList.stream()
                .distinct()
                .forEach(x -> System.out.print(x + " "));

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
