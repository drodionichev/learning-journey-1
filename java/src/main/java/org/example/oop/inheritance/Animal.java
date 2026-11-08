package org.example.oop.inheritance;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();

    public String getName() {
        return name;
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}