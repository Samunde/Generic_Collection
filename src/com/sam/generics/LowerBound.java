package com.sam.generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBound {
    public void useLowerBound() {
        List<? super Integer> integerList = new ArrayList<>();
        integerList.add(200);
        integerList.add(1000);

//        integerList.add(3.3);  // you cannot use double here
//                                  Because double is not the superclass of Integer

        for(Object num:integerList){
            System.out.println(num);
        }
    }
}
