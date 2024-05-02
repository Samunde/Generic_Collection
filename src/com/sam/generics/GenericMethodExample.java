package com.sam.generics;

public class GenericMethodExample {
    public<T> void printValue(T value){
        System.out.println("Value: " + value);
    }

    public static <T> void staticDisplayData(T value){
        System.out.println("Value: " + value);
    }
    public <E> void printArray(E[] elements){
        for(E element : elements){
            System.out.println(element);
        }
    }
}
