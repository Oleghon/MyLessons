package com.hashmap.introduction;

import java.util.HashMap;
import java.util.Map;

public class HashMapRunner {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        // HashMap сохраняет данные в хаотичном порядке
        //без сортировки и т.п.
        hashMap.put(1, "one");
        hashMap.put(2, "two");
        hashMap.put(3, "three");
        hashMap.put(4, "four");

        System.out.println(hashMap.get(1));
        //get - возвращает значение по ключу. Если указаного ключа нету возвращает null
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            // Map.Entry - структура данных храннящая данные "ключ-значение"
            //entrySet - метод возвращает набор всех объектов класса Entry (пар "ключ-значение")
            // входящих в соотвецтвенный Map
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
