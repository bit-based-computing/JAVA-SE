package com.foysal.fundamentalOfClass;

public class Constructor {

    String name;
    int age;
    String gender;

    // It can be tedious to initialize all of the variables in a class each time an instance is created
    // Constructors look a little strange because they have no return type, not even void
    // constructor name is like class name
    // constructor name is like class name
    Constructor(){
        name = "Foysal";
        age = 24;
        gender = "Male";
    }

    // Constructor Overloading
    // parameterized constructors
    // this refer to the current object
    Constructor(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    Constructor(String name){
        this.name = name;
    }
    Constructor(int age){
        this.age = age;
    }
    Constructor(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return "name: " + name + "\nage: " + age + "\ngender: " + gender;
    }
    public static void main(String[] args) {
        Constructor c1 = new Constructor();
        Constructor c2 = new Constructor("Name",20,"Male");
        System.out.println(c1);
        System.out.println(c2);
    }

}
