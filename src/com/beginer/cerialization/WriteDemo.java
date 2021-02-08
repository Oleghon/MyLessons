package com.beginer.cerialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteDemo {
    public static void main(String[] args) {

        Person[] people = {new Person("Genchik"),
                new Person("Rimsha"),
                new Person("Perchik"),
                new Person("Boyko")};
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))) {
            //FileOutputStream fos = new FileOutputStream("people.bin");
            //класс FileOutputStream предназначенный для байтовой перезаписи данных
            //вне зависимости от вида данных

            //ObjectOutputStream oos = new ObjectOutputStream(fos);
            //ObjectOutputStream предназначен для записи объектов в файл
            // работает в связке с FileOutputStream для более быстрой записи

            oos.writeObject(people);
            //oos.close();
            // если объект класса ObjectOutputStream реализован в самом блоке try
            // то поток создаваемый этим объектом надо закрывать "вручную"
            // если объект реализован в "try-скобках" то его поток закрывается автоматом
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
