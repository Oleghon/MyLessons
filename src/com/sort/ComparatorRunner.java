package com.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorRunner {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("doggy");
        animals.add("cat");
        animals.add("cow");
        animals.add("frogs");
        animals.add("bird");

        //Collections.sort(animals);
        // метод Collections.sort(лист)- сортирует данные колекции по лексикаграфическому порядку

        Collections.sort(animals, new StringLengthComparator());
        //перегруженый методCollections.sort(лист, класс с имплементацией Comparator)
        // - сортирует данные колекции в порядке указаном в методе compare();
        System.out.println(animals);

        List<Integer> numbers = new ArrayList<>();

        numbers.add(9);
        numbers.add(7);
        numbers.add(25);
        numbers.add(3);
        numbers.add(12);

        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return -1;
                } else if (o1 < o2) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        //для реализации метода compare() можно воспользаваться анонимным классом
        System.out.println(numbers);

        List<Person> people = new ArrayList<>();
        people.add(new Person(1, "Goga"));
        people.add(new Person(2, "Liza"));
        people.add(new Person(3, "Roma"));

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getId() > o2.getId()) {
                    return -1;
                } else if (o1.getId() < o2.getId()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(people);
    }
}

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else {
            return 0;
        }
    }
    /*
    реализация compare:
    если о1 > o2 => 1;
    если о1 < o2 => -1;
    если о1 == o2 => 0;
пример:
    compare(2,1) => 1
    compare(5,6) => -1
    compare(3,3) => 0
     */
}

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\n' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

