package com.beginer.enums;


public class EDemo {
    public static void main(String[] args) {
        SomeEnum animal = SomeEnum.CAT;

        switch (animal){
            case DOG:
                System.out.println("dog");
                break;
            case CAT:
                System.out.println("cat");
                break;
            case FROG:
                System.out.println("frog");
            default:
                System.out.println("is not animal");
        }
        Season summer = Season.SUMMER;
        System.out.println(summer instanceof Enum);
        // instanceof - проверка на отношение константы к классу.
        // Возвращает булевый результат

        System.out.println(summer.name());
        //name - метод возвращает название самой константы


       Season sum =  Season.valueOf("SUMMER");
        System.out.println(sum);

        System.out.println(sum.ordinal());
        // ordinal - метод возвращает индекс константы в enum-классе
    }
}
