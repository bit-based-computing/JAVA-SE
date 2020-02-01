package com.foysal.fundamentalOfClass;

public class TestClass {
    // A class is a template for an object
    // An object is an instance of a class
    // The data, or variables, defined within a class are called instance variables
    // Collectively, the methods and variables defined within a class are called members of the class
    // main() method only exist(need) in the starting point of program

    // instance variable example
    public String name;
    public String gender;
    public int age;

    @Override // override java existence to string method
    public String toString(){
        return "name: " + name + "\nage: " + age + "\ngender: " + gender ;
    }

    public static void main(String[] args) {
        // Create Object
        TestClass testObject = new TestClass();

        // Access Object members
        testObject.name = "Foysal";
        testObject.gender = "Male";
        testObject.age = 24;
        System.out.println(testObject); // it call testObject.toString() method

    }
}
