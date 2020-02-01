package com.foysal.fundamentalOfClass.keyword;

public class StaticKeyWord {
    // They can only directly call other static methods of their class.
    // They can only directly access static variables of their class.
    // They cannot refer to this or super in any way.
    // Static block run once when the class is first loaded.
    // static method can be call without creating Object

    static int a = 5;
    static int b ;
    static void showStatic(){
        System.out.println("a = " + a );
        System.out.println(("b = " + b));
    }
    static{
        System.out.println("Static block initialize, when the class is first loaded.");
        b = a * 5;
    }

    public static void main(String[] args) {
        showStatic();
    }

}
