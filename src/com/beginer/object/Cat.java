package com.beginer.object;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("cat eat fish");
    }

    @Override
    public void sleep() {
        System.out.println("cat sleep");
    }

    @Override
    void makeSound() {
        System.out.println("mau-mau");
    }
}
