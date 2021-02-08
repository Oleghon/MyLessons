package com.comparable;

import java.util.*;

public class ComparableRun {
    public static void main(String[] args) {

        List<Person> peopleList = new ArrayList<>();
        Set<Person> personSet = new TreeSet<>();

        addElements(peopleList);
        addElements(personSet);

        Collections.sort(peopleList);

        System.out.println(peopleList);
        System.out.println(personSet);

    }
    private static void addElements(Collection collection){
        collection.add(new Person(1, "vvdогш"));
        collection.add(new Person(4, "ROman Cergeevich"));
        collection.add(new Person(3, "Kolyфa"));
        collection.add(new Person(2, "vovaтсшл"));
    }
}
class Person implements Comparable<Person> {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(Person o) {
        if(this.name.length() > o.getName().length()){
            return 1;
        }else if(this.name.length() < o.getName().length()){
            return -1;
        }else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}