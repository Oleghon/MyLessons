package com.beginer.вложеныйКласс;

public class ElectroCar {

    private int id;
// нестатический вложеный класс
    // имеет доступ к переменным и методам класса в который вложен
    private class Motor {
        public void startMotor() {
            System.out.println("Motor start");
        }
    }

// статический вложенный класс
    //имеет доступ к статическим полям класса в который вложен
    //имеет возможность создавать свои объекты в маине
    private static class Battery{
        public void charge(){
            System.out.println("Battery charging");
        }
    }
    public ElectroCar(int id) {
        this.id = id;
    }

    public void start() {
        Motor motor = new Motor();
        motor.startMotor();
        System.out.println("Electrocar " + id + " is starting...");
int x =5;
        class SomeClass{
         public void somr(){
             System.out.println(id);
             System.out.println(x);
         }
        }
    }
}
