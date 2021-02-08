package com.beginer.wildcard;

import java.util.ArrayList;
import java.util.List;

public class WCDemo {
    public static void main(String[] args) {
        List<Animal> listAnimal = new ArrayList<>();
        listAnimal.add(new Animal(2));
        listAnimal.add(new Dog(1));
        test(listAnimal);

        List<Dog> dogList= new ArrayList<>();
        dogList.add(new Dog(1));
        dogList.add(new Dog(3));

        test(dogList);
    }
    // wildcard - это генерик с помощью которого можно
    // обобщить вводные параметры колекции
    private static void test (List<? extends Animal> list){

        for(Animal animal: list){
            System.out.println(animal);
        }
    }


}

class Animal {
private int id;

    public Animal(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return  String.valueOf(id);
    }
}

class Dog extends Animal {
    public Dog(int id) {
        super(id);
    }
}
