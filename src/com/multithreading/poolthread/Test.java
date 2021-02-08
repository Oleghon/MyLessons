package com.multithreading.poolthread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        //ExecutorService - басейн потоков = хранит кол-во создаваемых потоков;
        //Executors.newFixedThreadPool - метод принимающий в виде аргумента необходимое кол-во потоков;
        //

        for (int i = 0; i < 5; i++) {
            executorService.submit(new Work(i));
            //submit - метод принимающий задание

        }

        executorService.shutdown();
        // запускает басейн потоков; останавливает принятие "заданий" на обработку в "басейне"

        System.out.println("all tasks submitted");

        executorService.awaitTermination(1, TimeUnit.DAYS);
        //awaitTermination - устанавливает крайний срок завершения работы "басейна"

    }
}

class Work implements Runnable {
    private int id;

    public Work(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work " + id + " was completed");
    }
}