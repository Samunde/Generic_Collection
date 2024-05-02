package com.sam.generics;

abstract class AbstractGenericClass <T>{
   public <T> void printNumbers(T n){
       System.out.println("The number is: " +n);
   }
   abstract void printStrings(T s);
   abstract void printBooleans(Boolean s);
   abstract void printDoubles(T s);
   abstract void printFloats(T s);


}
