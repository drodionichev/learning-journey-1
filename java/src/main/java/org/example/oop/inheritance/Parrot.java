package org.example.oop.inheritance;

public class Parrot extends Animal implements Performer {
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + ": Hello!");
    }

    @Override
    public void doTrick() {
            System.out.println(getName() + " gives a kiss");
        }
    }

