package fileToWork;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileName = null;
        Scanner scanner = new Scanner(System.in);
        out: while (true) {
            System.out.println("Программа для добавления текста в файл");
            if (fileName == null){
                fileName = changeNameFile();
            }
            System.out.println("Файл " + fileName);
            System.out.println("1. Добавить текст в файл");
            System.out.println("2. Очистить файл и добавить текст в файл");
            System.out.println("3. Изменить имя файла");
            System.out.println("\n0. Выход");
            switch (scanner.nextInt()){
                case 1:
                    stringToFile(fileName, true);
                    break;
                case 2:
                    stringToFile(fileName, false);
                    break;
                case 3:
                    fileName = changeNameFile();
                    break;
                case 0:
                    System.out.println("Файл создан");
                    break out;
            }


        }
    }
    public static void stringToFile(String fileName, boolean append){
        System.out.println("Вводите данные для записи");
        String text = new Scanner(System.in).nextLine();
        try (FileWriter file = new FileWriter(fileName, append) ) {
            file.write(text + "\n");
            System.out.println("Текст успешно записан");
        } catch (IOException e) {
            System.out.println("Текст не записан");
            System.out.println(e);
        }
    }
    public static String changeNameFile(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название файла: ");
        return scanner.nextLine();
    }
}
