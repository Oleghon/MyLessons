package com.hashmap.realization;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapMain {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        /*
        HashMap реализация:
        при вводе данных "ключ-значение"
        данные сохраняются в ячейке памяти массива соотвецтвенно выделеному индексу
         */
        hashMap.put("Ward", 89);
        hashMap.put("King", 2);
        hashMap.put("Fiona", 3);
        hashMap.put("SukaBlyat`", 4);
        /*
        реализация метода put:
        put(Key k, Value v)
           {
       1. hash(k) -> hash("Ward") = 2656852   - хєш-число(побайтовый код ключа "Ward")

       2. index = hash & (n - 1) = 4          - индекс который выделяется в массиве для хранения данных
         }
         индекс появляется из остатка от побайтового деления хэш-числа на (n - 1);
         если у разных хэшей-данных совпадает индекс они помещаются в одну ящейку ссылаясь
         друг на друга в порядке введения данных (на подобии ссылок в linkedList)
         n = 16 это количество ячеек по default в массиве хэш-мап;
       3.[0]
         [1]
         [2]
         [3]
         [4] -> ключ-"Ward"|хэщ-265852|значение-89|ссылка на другой элемент-> King|2306996|2|
         ...
         [16]

         */
        for (Map.Entry entry : hashMap.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
        /*
        реализация метода get:
        get(obj key) - уникальный ключ
        hash(key) - конвертация ключа в хэш-число
        index = hash & (n-1) - вычисление индекса
        данные находятся по полученому индексу
        если в ячейке памяти хранится несколько значений то
        данные находят с помощью контракта hashcode & equals сравнивая по хэшу-ключа
        и (в случае колизии) самому ключу
         */
        Set<String> set = new HashSet<>();
    }
}
