package com.sam.generics;

//public class MyRunner {
//    public static void main(String[] args) {
//// initialize the class with Integer data
//        DemoClass dObj = new DemoClass();
//        dObj.genericsMethod(25); // passing int
//        dObj.genericsMethod("Per Scholas"); // passing String
//        dObj.genericsMethod(2563.5); // passing float
//        dObj.genericsMethod('H'); // passing Char
//
//    }}

public class MyRunner {
    public static void main(String[] args) {
        // initialize generic class
        // with String and Integer data
        GMultipleDataType<String,String,String>obj=new GMultipleDataType<>();
        System.out.println(obj.toString());

        GMultipleDataType<String, Integer,Character> mobj = new GMultipleDataType('J',"Per Scholas", 11025);

        System.out.println(mobj.toString());


        // initialize generic class
        // with String and String data
        GMultipleDataType<String, String,String> mobj2 = new GMultipleDataType("Per Scholas", "Non profit","Welcome");
        System.out.println(mobj2.getValueOne());
        System.out.println(mobj2.getValueTwo());
        System.out.println(mobj2.getValueThree());
    }
}

