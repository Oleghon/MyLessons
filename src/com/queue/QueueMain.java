package com.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueMain {
    public static void main(String[] args) {
        Person person1 = new Person(1);
        Person person2 = new Person(2);
        Person person3 = new Person(3);
        Person person4 = new Person(4);

        Queue<Person> people = new ArrayBlockingQueue<Person>(10);
        //интерфейс queue (кью) работает по принципу "first in- first out"(fifo)
        people.add(person3);
        people.add(person2);
        people.add(person4);
        people.add(person1);

        // person3 -> person2-> person4-> person1

        System.out.println(people.remove());
        // в queue метод remove удаляет первый элемент очереди

        System.out.println(people.peek());
        // метод peek позволяет посмотреть первый элемент очереди без удаления

//        for (Person person: people){
//            System.out.println(person);
//        }
    }

}

class Person{
    private int id;

    public Person(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}
