package com.multithreading.semaphore;

import java.util.concurrent.*;

public class SemaphoreDemo {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(3);
        // при создании обьекта semaphore принимается аргумент в качестве
        // кол-во разрешений на взаимодействие потоков

        // acquire() метод начинает взаимодейсвовать с разрешением
        // release() метод отпускает одно разрешение
        // availablePermits() возвращает количество свободных решений
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Connection connection = Connection.getConnection();
        for (int i = 0; i < 10; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        connection.workSemaphore();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.DAYS);
    }
}

// Singleton pattern
class Connection {
    private static Connection connection = new Connection();
    private int connectionCount;
    private Semaphore semaphore = new Semaphore(10);


    private Connection() {

    }

    public static Connection getConnection() {
        return connection;
    }

    public void workSemaphore() throws InterruptedException {
       semaphore.acquire();
       try {
           doWork();
       } finally {
           semaphore.release();
       }
    }

    private void doWork() throws InterruptedException {
        synchronized (this) {
            connectionCount++;
            System.out.println(connectionCount);
        }
        Thread.sleep(5000);

        synchronized (this) {
            connectionCount--;
        }
    }
}