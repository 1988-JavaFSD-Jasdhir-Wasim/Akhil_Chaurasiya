package com.task4;

public class Task2_SwapMethod {
	public static <T> void swap(T[] array) {
        if (array.length > 1) {
            T temp = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = temp;
        }
	}
	
	public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Before swap (Integer): " + java.util.Arrays.toString(intArray));
        swap(intArray);
        System.out.println("After swap (Integer): " + java.util.Arrays.toString(intArray));

      
        String[] strArray = {"Apple", "Banana", "Cherry", "Date"};
        System.out.println("Before swap (String): " + java.util.Arrays.toString(strArray));
        swap(strArray);
        System.out.println("After swap (String): " + java.util.Arrays.toString(strArray));
    }
	
}
