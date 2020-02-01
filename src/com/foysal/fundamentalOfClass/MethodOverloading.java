package com.foysal.fundamentalOfClass;

public class MethodOverloading {

    //Method overloading is one of the ways that Java supports polymorphism
    //Thus, overloaded methods must differ in the type and/or number of their parameters
    //While overloaded methods may have different return types, the
    //return type alone is insufficient to distinguish two versions of a method
    //must different parameter or parameter type

    public static void method(){
        System.out.println("No parameters");
    }
    public static void method(int a){
        System.out.println("An integer parameter");
    }
    public static void method(double a){
        System.out.println("A double parameter");
    }
    public static void method(String a){
        System.out.println("A string parameter");
    }

    public static void main(String[] args) {
        // static method can be call without creating Object
        method();
        method(10);
        method(10.2);
        method("Testing");
    }
}
