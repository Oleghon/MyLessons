package com.stack;

import java.util.Stack;

public class StackRun {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // в классе stack работает принцип "first in - last out"(первый зашел- последний вышел);

        stack.push(5);
        stack.push(3);
        stack.push(1);
        stack.push(2);
        // метод push() добавляет элементы в стек

        System.out.println(stack.peek());
        // peek показывает последний элемент стека

        System.out.println(stack.empty());
        //empty() проверяет постой ли стек

        while (!stack.empty()){
            System.out.println(stack.pop());
            //метод pop() достает последний элемент из стека
        }


    }
}
