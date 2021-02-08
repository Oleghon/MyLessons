package com.set;

import java.util.*;

public class SetMain {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        hashSet.add("Mike");
        hashSet.add("Kitty");
        hashSet.add("John");
        hashSet.add("Milly");

        System.out.println(hashSet.contains("John"));
        System.out.println(hashSet.contains("Jake"));
        // contains - булевый метод, проверяет сет на наличие
        // элемента и выдает булевый результат(true/false).
        // Лучше всего (более быстро) работает в HashSet

        System.out.println(hashSet.isEmpty());
        //isEmpty - булевый метод, проверяет пустой сет или нет
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();


        for(int i=0; i<5;i++){
            set1.add(i);
        }
        for(int i=2; i<8;i++){
            set2.add(i);
        }

        // обьединение множеств (union)
        Set<Integer>union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println(union);

        // пересичение множеств (intersection)
        Set<Integer>intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection);

        // разность множеств (difference)
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println(difference);

    }
}
