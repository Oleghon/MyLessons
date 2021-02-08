package com.multithreading.synchronize;

public class Test {
    private int counter;

    public static void main(String[] args) throws InterruptedException {
        Test test = new Test();
        // при использавнии synchronized необходим обьект
        // в java у каждого обьекта существует монитор.
        // монитор в один момент времени находится только у одного потока
        // монитор не явным образом используется вовремя выполнения synchronized
        // если не указывать на обьект сихронизации то по дэфолту synchronized
        // указывает на обьект this(в данном случае test)
        test.doWork();

    }

    public /*synchronized*/ void increment() {
        // ключевое слово synchronized может определять методы
        // при запуске нескольких потоков с использованием
        // синхронизированого метода,
        // только один поток может исполнять тело метода пока остальные ждут
        synchronized (this) {
            //в случае использования synchronized в блоке надо указать обьект синхронизации
            // синхронизируется только исполнение блока
            counter++;
        }
    }

    public void doWork() throws InterruptedException {

        /*
        1: 100 -> 101 -> 101
        2: 100 -> 101 -> 101
         */
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++)
                    increment();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++)
                    increment();
            }
        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        // метод join останавливает основной поток(main)
        // до того момента пока поток который вызывает метод не закончит работу

        System.out.println(counter);
    }
}
