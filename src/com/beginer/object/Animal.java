package com.beginer.object;

public abstract class Animal {
    private int id;
    private String name;
    private static int constId = 1;

    public Animal(String name) {
        id = constId++;
        this.name = name;
    }

    public void eat() {
        System.out.println("animal " + getName() + " eat");
    }

    public void sleep() {
        System.out.println("animal sleep");
    }

    abstract void makeSound();

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static int getConstId() {
        return constId;
    }
}
