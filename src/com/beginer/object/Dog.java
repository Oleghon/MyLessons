package com.beginer.object;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Dog "+getName()+" eat meat");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleep");
    }

    @Override
    void makeSound() {
        System.out.println("wof-wof");
    }

}
