package org.example.oop.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shelter {
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void makeAllSounds() {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
