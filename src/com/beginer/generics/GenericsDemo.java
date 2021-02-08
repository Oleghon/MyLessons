package com.beginer.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {
    public static void main(String[] args) {
        /////////////////////// java 5 ////////////////////////
        List animals = new ArrayList();
        animals.add("cat");
        animals.add("frog");
        animals.add("dog");
        // пример downCast
        // в строковую переменную вкладывается
        // значение листа animals под индексом 1
        // при этом по иерархии происходит downCast
        String animal = (String) animals.get(1);
        System.out.println(animal);

        ////////////////////////// с дженериками /////////////////////////////

        //Дженерики (или обобщения) - это параметризованные типы.
        //Параметризованные типы позволяют объявлять классы,
        // интерфейсы и методы, где тип данных, которыми они оперируют,
        // указан в виде параметра
        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("frog");
        animals2.add("dog");


        String animal2 = animals2.get(2);

        //////////////////////// java 7 //////////////////////////
        List<String> animals3 = new ArrayList<>();


    }
}
