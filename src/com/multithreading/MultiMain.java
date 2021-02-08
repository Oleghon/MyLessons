package com.multithreading;

public class MultiMain {
    public static void main(String[] args) throws InterruptedException {

//        MyThread myThread = new MyThread();
//        myThread.start();
//
//        MyThread myThread2 = new MyThread();
//        myThread2.start();
        Thread thread= new Thread(new Runner());
        thread.start();

        System.out.println("Hello from main");
    }
}
class Runner implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello thread " + i);
        }
    }
}

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello thread " + i);
        }
    }
}
