package com.linkedlist;

public class Test {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(10);
        System.out.println(myLinkedList);
        myLinkedList.remove(2);
        System.out.println(myLinkedList.get(2));
    }
}
