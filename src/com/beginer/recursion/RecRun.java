package com.beginer.recursion;

public class RecRun {
    public static void main(String[] args) {

        System.out.println(fact(4));

    }

    private static void someMethod(int n) {
        //рекурсия - вызов метода внутри самого себя
        if (n == 0)
            return;

        System.out.println("Nani " + n);

        someMethod(n - 1);
    }

    private static int fact(int n) {
        // метод вычисляет факториал
        if (n == 1)
            return 1;

        return n * fact(n - 1);
    }


}
