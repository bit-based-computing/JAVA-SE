package com.foysal.dataTypes;

public class PrimitiveTypes {
    public static void main(String[] args) {
        // Integers all of this are signed
        // Java does not support unsigned
            long longNumber = 922337207; // 64 bit
            int intNumber = 2147483647; // 32 bit
            short shortNumber = 32767; // 16 bit
            byte byteNumber = 127; // 8 bit
            System.out.println("-----------------Printing Integer number------------");
            System.out.println(longNumber);
            System.out.println(intNumber);
            System.out.println(Short.toUnsignedInt(shortNumber));
            System.out.println(byteNumber);

        // Floating-point numbers
            double doubleNumber = 1000.32; // 64 bit
            float floatNumber = 100; // 32 bit
            System.out.println("-----------------Printing float number------------");
            System.out.println(doubleNumber);
            System.out.println(floatNumber);

        // Characters
            char charter = 'A'; // 16 bit
            char charterA = 65;
            System.out.println("------------------Printing Character type variable -------");
            System.out.println(charter);
            System.out.println(charterA);

        // Boolean
            Boolean isTrue = true;
            Boolean isFalse = false;
            System.out.println("------------------Printing Boolean type variable -------");
            System.out.println(isTrue);
            System.out.println(isFalse);
    }
}
