package lambda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(-5);
        integerList.add(8);
        integerList.add(1);
        integerList.add(-11);

        Calculate sumInt = list -> {
            int result = 0;
            for (int element : list) {
                if (isPositiv(element)) {
                    result += element;
                }
            }
            return result;
        };

        System.out.println(sumInt.cal(integerList));


        List<String> stringList = new ArrayList<>();
        stringList.add("first");
        stringList.add("second");
        stringList.add("third");
        stringList.add("fourth");
        stringList.add("fifth");

        StringLength length = list -> {
            String result = list.getFirst();
            for (String element : list) {
                if (element.length() > result.length()) {
                    result = element;
                }
            }
            return result;
        };

        System.out.println(length.maxLength(stringList));
    }

    public static boolean isPositiv(int num) {
        return num > 0;
    }
}

interface Calculate {
    int cal(List<Integer> list);
}
interface StringLength{
    String maxLength(List<String> list);
}