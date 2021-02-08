package com.hashcodequals;

import java.util.*;

public class HashRunner {
    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();
        Set<Person> set = new HashSet<>();

        //HashCode делает быстрое сравнивание. Он срабатывает первым.
        // В случае когда метод не может выполнить проверку срабатывает метод equals
        // метод equals во время работы проходит все поля данных, сравнивает их
        // и выдает результат, что занимает много времени

//         Контракт HashCode() & equals()
//         1) У двух проверяемых объектов вызываем метод hashCode();
//
//         2.1)если хэши разные -> обьекты точно разные.
//         2.2)если хэши одинаковые(либо одинаковые объекты, либо колизия)->equals();
//
//         3)equals()-> выдает точный ответ
//
//         *колизия - случаи когда два разных объекта получили одинаковый хэш(hashcode)
//         *хэш - число в которое конвертируеться объект для сравнения во время работы hashcode

        Person person1 = new Person(1, "Molly");
        Person person2 = new Person(1, "Molly");

        map.put(person1, "123");
        map.put(person2, "1535");

        set.add(person1);
        set.add(person2);

        System.out.println(map);
        System.out.println(set);


    }
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
        return "Person " +
                "id= " + id +
                ", name= '" + name + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}

