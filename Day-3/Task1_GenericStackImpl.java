package com.task.day3;

import java.util.ArrayList;

public class Task1_GenericStackImpl<T> {
    private ArrayList<T> stackList;
  
    public Task1_GenericStackImpl() {
        stackList = new ArrayList<>();
    }

    public void push(T item) {
        stackList.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stackList.remove(stackList.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stackList.get(stackList.size() - 1);
    }

    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    public int size() {
        return stackList.size();
    }

    public static void main(String[] args) {

        Task1_GenericStackImpl<Integer> stack = new Task1_GenericStackImpl<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack size: " + stack.size());
        System.out.println("Top element (peek): " + stack.peek());
        System.out.println("Pop element: " + stack.pop());
        System.out.println("Stack size after pop: " + stack.size());
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}