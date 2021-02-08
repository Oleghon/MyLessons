package com.beginer.cerialization;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = -1584593936419276637L;
    // serialVersionUID - автогенерируемая константа фиксирующая состояние класса
    //объекты которого будут записыватся. При изменении/дополнении класса константу
    // необходимо генерировать по новой
    private  int id;
    //private transient int id;
    //transient - ключ-слово при использовании которого при записи даннных
    // помеченое поле будет записано как нулевое(int,double... = 0; String=null)
    private String name;
    private static int incr = 1;



    public Person( String name) {
        id = incr++;
        this.name = name;
    }

    @Override
    public String toString() {
        return  id + " : " + name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
