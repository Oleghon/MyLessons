package com.iteable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableRun {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Iterator<Integer> iterator = list.iterator();
        // итератор абстрактно реализуется в цикле foreach
        // доступен практически во всех классах
        int idx = 0;

        while (iterator.hasNext()) {
            //в таком виде iterator равнозначен циклу foreach
            //преимущество такой реклизации в возможности
            // удалять элементы из коллекций
            System.out.println(iterator.next());

            if (idx == 1)
                iterator.remove();

            idx++;
        }

        System.out.println(list);

    }
}
