package exceptionLes;

public class Main {
    public static void main(String[] args) {


        // Проверка первого задания
        System.out.println("Проверка первого задания\n");

        for (int i = 0; i <= 10; i++) {
            try {
                exceptionInt((int) (Math.random() * 100));
            } catch (Exception e) {
                System.out.println(e);
            }
        }


        System.out.println("\n\nПроверка второго задания\n");
        String text = "В тексте 12 есть число";
        for (int i = 0; i < 2; i++) {
            try {
                checkNumInString(text);
            } catch (Exception e) {
                System.out.println(e);
            }
            if (checkNumInStringBool(text)) {
                System.out.println("В тексте есть число");
            } else {
                System.out.println("В тексте числа нет");
            }
            text = "В тексте нет числа";
        }


        System.out.println("\n\nПроверка своего решения\n");
        text = "В те3ксте есть цифра";
        for (int i = 0; i < 2; i++) {
            if (checkIntInString(text)) {
                System.out.println("В тексте есть цифра");
            } else {
                System.out.println("В тексте цифры нет");
            }
            text = "В тексте нет цифры";
        }

    }

    //ex1
    //===========================================

    /**
     * Задание 1 по ТЗ
     *
     * @param num - входные данные
     */

    public static void exceptionInt(int num) throws Exception {
        if (num % 2 != 0) {
            throw new Exception("Введенное число не четное (" + num + ")");
        }
        System.out.println("Введенное число: " + num);
    }

    //ex2
    //===========================================

    /**
     * Задание 2 по ТЗ
     *
     * @param inText - принимающая строка
     */

    public static void checkNumInString(String inText) throws Exception {
        String[] bufText = inText.split(" ");
        for (String text : bufText) {
            try {
                Double.valueOf(text);
            } catch (Exception e) {
                continue;
            }
            throw new Exception("В тексте есть число!\n" + inText);
        }
        System.out.println("В тексте отсутствуют числа\n" + inText);
    }

    /**
     * Задание 2 по моему мнению, корректное
     *
     * @param inText - входная строка
     * @return - true при наличии числа, false при отсутствии числа в строке
     */

    public static boolean checkNumInStringBool(String inText) {
        String[] bufText = inText.split(" ");
        for (String text : bufText) {
            try {
                Double.valueOf(text);
            } catch (Exception e) {
                continue;
            }
            return true;
        }
        return false;
    }

    /**
     * Метод на наличие цифры в тексте или слове
     *
     * @param inText - входной текст
     * @return - true/false - это наличие/отсутствие цифры в тексте
     */

    public static boolean checkIntInString(String inText) {
        char[] ALL_NUM = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        char[] bufText = inText.toCharArray();
        for (char text : bufText) {
            for (char num : ALL_NUM) {
                if (text == num) {
                    return true;
                }
            }
        }
        return false;
    }

}

