package com.foysal.fundamentalOfClass.nestedClass.innerClass;

public class Outer {
    //It is important to realize that an instance of Inner can be created only in the
    //context of  Outer class
    int outer_a = 10;
    static String test = "Test";
    void outer_test(){
        Inner inner = new Inner();
        inner.display();
    }
    class Inner{
        void display(){
            System.out.println("I am inner class");
            System.out.println("I can access outer class all properties static and non-static");
            System.out.println("Outer a = " + outer_a);
            System.out.println("static test = " + test);
           // outer_test(); it will make recursive call and stackOverflow error
        }
    }

    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.outer_test();
    }
}
