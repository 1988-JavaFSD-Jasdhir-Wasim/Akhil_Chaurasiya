package com.task.day3;

public class Task2_TypeSafeContainer<T> {
    private T item;

    public void set(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }

    public static void main(String[] args) {

        Task2_TypeSafeContainer<Integer> intContainer = new Task2_TypeSafeContainer<>();
        intContainer.set(123);
        System.out.println("Integer Container: " + intContainer.get());

        Task2_TypeSafeContainer<String> stringContainer = new Task2_TypeSafeContainer<>();
        stringContainer.set("Hello");
        System.out.println("String Container: " + stringContainer.get());
    }
}

