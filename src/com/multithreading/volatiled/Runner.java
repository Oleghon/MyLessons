package com.multithreading.volatiled;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        myThread.shutDown();
    }
}

class MyThread extends Thread {
    private volatile boolean running = true;
    //ключ- слово volatile необходимо когда
    // одна преременная делится между несколькими потоками
    //переменная кэшируется не в памяти ядра а в общей
    public void run() {
        while (running) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutDown(){
        this.running = false;
    }
}