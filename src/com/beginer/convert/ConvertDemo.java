package com.beginer.convert;

public class ConvertDemo {
    public static void main(String[] args) {
        // upCasting - восходящее преобразование
        // обьект animal может реализовать методы класса Animal
        // если метод переопределен в классе Dog
        // то будет то будет реализовываться переопределение
        Animal animal = new Dog();

        // еще вариант upCast
        Dog dog = new Dog();
        Animal animal2 = dog;

        //downCasting - нисходящее переобразование
        //обьект dog2 может реализовать методы класса Dog
        // и открытые методы класса Animal

        Dog dog2 = (Dog) animal;
        dog2.eat();

        // порой downCast может привести к ошибке из-за
        // того что не всегда можно делать прямой downcast
        Animal animal3 = new Animal();
        Dog dog3 = (Dog) animal3;

    }
}

class Animal {
    public void eat() {
        System.out.println("animal eating");
    }

    public void sleep() {
        System.out.println("sleep");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("dog eating meat");
    }

    public void burk() {
        System.out.println("wof-wof");
    }
}