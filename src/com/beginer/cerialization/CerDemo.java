package com.beginer.cerialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class CerDemo {
    public static void main(String[] args) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("people.bin"))) {
           // FileInputStream fis = new FileInputStream("people.bin");
           // ObjectInputStream objectInputStream = new ObjectInputStream(fis);


           Person[] persons = (Person[]) objectInputStream.readObject();
            System.out.println(Arrays.toString(persons));

          //  objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
