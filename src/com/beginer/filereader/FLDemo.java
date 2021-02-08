package com.beginer.filereader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class FLDemo {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        //константная переменная separator - разделитель
        // адаптируется под определенную среду разработки


        String path = separator + "Users" + separator + "Admin"
                + separator + "Desktop" + separator + "text.txt";
// переменная путь к файлу на рабочем столе
        File file = new File(path);

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());

        }
        //////////////////////////////////////////////////////////


        // при использовании текстового файла внутри проекта путь прописывать не надо
        File file2 = new File("text2");

        // считывание файла в массив строк
        scanner = new Scanner(file2);
        String line = scanner.nextLine();
        String[] strings = line.split(" ");
        System.out.println(Arrays.toString(strings));

        // считывание файла в массив чисел
        int[] numbers = new int[3];
        int counter = 0;

        for (String number : strings) {
            numbers[counter++] = Integer.parseInt(number);
        }

        System.out.println(Arrays.toString(numbers));
        scanner.close();
    }
}
