package com.multithreading.patterns;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class PattRun {


    public static void main(String[] args) throws InterruptedException {

        ProduserConsumer pc = new ProduserConsumer();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consumer();
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

class ProduserConsumer {
    private Queue<Integer> queue = new LinkedList<>();
    private final int limit = 10;
    private final Object lock = new Object();
    //обьект синхронизации должен быть константным

    public void produce() throws InterruptedException {
        int value = 0;

        while (true) {
            synchronized (lock) {
                while (queue.size() == limit) {
                    // цикл while здесь используеться для повторной проверки
                    //если использавать if то синхронизация может не правильно сработать
                    //что приведет к безконечному добавлению элементов в список
                    lock.wait();
                }
                queue.offer(value++);
                lock.notify();
            }
        }
    }

    public void consumer() throws InterruptedException {
        while (true) {
            synchronized (lock) {
                while (queue.size() == 0) {
                    lock.wait();
                }
                int value = queue.poll();
                System.out.println(value);
                System.out.println("Queue size is: " + queue.size());
                lock.notify();
            }
            Thread.sleep(1000);
        }
    }
}
