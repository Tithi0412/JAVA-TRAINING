package com.ey.gst.dao.service;

public class Person {
    // Member variables
    private String name;
    private int age;

//     Default constructor
    public Person() {
//        name = "hi";
//        age = 0;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
       age=99; return age;
    }

    public static void main(String[] args) {
        // Creating an instance of Person using the default constructor
        Person person = new Person();

        // Accessing member variables using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
