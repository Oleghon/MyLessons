package com.othermaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsRunner {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        // хранит данные без порядка
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        // хранит данные в порядке добавления
        Map<Integer, String> treeMap = new TreeMap<>();
        // данные (пара "ключ-значение") автоматически сотрируются по ключу
        testMap(hashMap);
        testMap(linkedHashMap);
        testMap(treeMap);
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(39, "John");
        map.put(9, "Lena");
        map.put(46, "Dad");
        map.put(21, "Bob");
        map.put(8, "Kelly");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("--------------------------");
    }
}
