package com.foysal.fundamentalOfClass;

public class Varargs {
    public void test(int... v) {
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Varargs v = new Varargs();
        v.test(1);
        v.test(1, 2, 3, 4, 5);
    }
}
