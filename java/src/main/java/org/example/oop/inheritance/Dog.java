package org.example.oop.inheritance;

public class Dog extends Animal implements Performer {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + ": Woof!");
    }

    @Override
    public void doTrick() {
        System.out.println(getName() + " gives a paw");
    }
}
