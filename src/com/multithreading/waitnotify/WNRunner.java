package com.multithreading.waitnotify;

import java.util.Scanner;

public class WNRunner {
    public static void main(String[] args) throws InterruptedException {
        WaitAndNotify wn = new WaitAndNotify();


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();


    }
}

class WaitAndNotify {
    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("Producer thread started...");
            wait();
            // 1 - отдаем intrinsic lock(отдает монитор другому потоку);
            // 2 - ждем вызова notify();
            // метод wait() вызывается только внутри синхронизованых блоков
            // на обьекте "this"(default), чтобы метод работал
            // на обьекте синхронизации надо указывать явно
            // пример: synchronized (object){ object.wait(); }

            // метод принимает аргументы на ввод в виде милисек.
            System.out.println("Producer thread resumed...");

        }
    }

    public void consumer()throws InterruptedException {
        Thread.sleep(2000);
        Scanner scanner = new Scanner(System.in);

        synchronized (this){
            System.out.println("Waiting for return key pressed");
            scanner.nextLine();
            notify();
            // метод останавливает метод wait() но не возвращает
            // монитор потоку вызывающему метод wait()
            // при окончании работы потока с notify запускается поток с wait
            // при коректном использовании wait & notify
            // синхронизация должна быть реализована на одном обьекте
        }

    }
}