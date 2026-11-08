package org.example.oop.inheritance;
import java.util.ArrayList;
import java.util.List;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + ": meow!");
    }
}
