package map;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "one");
        hashMap.put(2, "two");
        hashMap.put(3, "three");
        hashMap.put(4, "four");
        hashMap.put(5, "five");

        printKey(hashMap);
        System.out.println();

        printNewMap(hashMap);
    }

    public static <T, K> void printKey(HashMap<T, K> hashMap) {
        for (T key : hashMap.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();
    }

    public static void printNewMap(HashMap<Integer, String> hashMap) {
        for (Integer key : hashMap.keySet()) {
            if (hashMap.get(key).length() > 3) {
                System.out.println(key + " " + hashMap.get(key));
            }
        }
        System.out.println();
    }
}
