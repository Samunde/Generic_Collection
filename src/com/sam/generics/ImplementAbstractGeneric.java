package com.sam.generics;

public class ImplementAbstractGeneric<U> extends AbstractGenericClass<U>{

    @Override
    void printStrings(U s) {
        System.out.println("Your data is: " + s);

    }

    @Override
    void printBooleans(Boolean s) {
        System.out.println("Your data is: " + s);

    }

    @Override
    void printDoubles(U s) {
        System.out.println("Your data is: " + s);

    }

    @Override
    void printFloats(Object s) {
        System.out.println("Your data is: " + s);

    }
}
