package com.beginer.anonimclass;

public class ACDemo {
    public static void main(String[] args) {

        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("eat");
            }
        };

        ableToEat.eat();
    }
}

interface AbleToEat{
    public void eat();
}

