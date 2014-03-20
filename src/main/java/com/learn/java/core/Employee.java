package com.learn.java.core;

public class Employee {
    private String name;
    private int age;

    public Employee(String name, int age){
        this.age = age;
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    // Static Initializer Block
    static {
        System.out.println(" -- 1. Static Initializer Block: Show up while the class is loaded.");
    }

    // Initializer Block
    {
        System.out.println(" -- 2. Initializer Block: Show up for every object created.");
    }

}
