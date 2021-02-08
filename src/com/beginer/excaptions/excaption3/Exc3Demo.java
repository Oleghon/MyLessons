package com.beginer.excaptions.excaption3;

import java.util.Scanner;

public class Exc3Demo {
    public static void main(String[] args) {
        // Checked exception (compile time exception)  = исключения в работе программы
        //Unchecked exception (runtime exception) = ошибка в работе программы
        Scanner scanner = new Scanner(System.in);
        boolean truth = true;

        while (truth) {
            System.out.println("input x:");
            int x = scanner.nextInt();
            System.out.println("input y:");
            int y = scanner.nextInt();
            try {
                // Пример unchecked exc
                System.out.println(x / y);
                truth = false;
            } catch (ArithmeticException e) {
                e.printStackTrace();
                scanner.nextLine();
            }
        }
        System.out.println("end try/catch");
    }
}
