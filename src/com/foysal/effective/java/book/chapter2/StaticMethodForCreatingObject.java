package com.foysal.effective.java.book.chapter2;

public class StaticMethodForCreatingObject {

    // static factory method instead of constructors
    /*
            A class can provide a public static factory method, which is
        simply a static method that returns an instance of the class
     */

    public static Boolean valueOf(boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }

    public static StaticMethodForCreatingObject getInstance(){
        return new StaticMethodForCreatingObject();
    }

    public static void main(String[] args) {
        Boolean b1 = Boolean.TRUE;
        Boolean b2 = Boolean.FALSE;
        Boolean b3 = StaticMethodForCreatingObject.valueOf(false);
        StaticMethodForCreatingObject staticMethodForCreatingObject = StaticMethodForCreatingObject.getInstance();
        StaticMethodForCreatingObject staticMethodForCreatingObject1 = new StaticMethodForCreatingObject();
        if (b1 == b2) {
            System.out.println("Same reference");
        }
        if (Boolean.logicalOr(b1.booleanValue(), b2.booleanValue())) {
            System.out.println("All are true");
        } else {
            System.out.println("The are not equal");
        }

        if (b2 == b3) {
            System.out.println("b2 and b3 are same object reference");
        }

    }
}
