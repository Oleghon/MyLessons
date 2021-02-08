package com.beginer.abstractclass;

import com.beginer.object.Animal;
import com.beginer.object.Cat;
import com.beginer.object.Dog;

public class AbClDemo {
    public static void main(String[] args) {

        Cat cat = new Cat("musya");
        Dog dog = new Dog("Stan");
        Dog dog1 = new Dog("Stan");
        Dog dog2 = new Dog("Stan");
        Dog dog3 = new Dog("Stan");
        print(cat);
        print(dog);
        System.out.println(dog3.getId());

    }

    private static void print(Animal animal) {
        animal.eat();
    }
}
