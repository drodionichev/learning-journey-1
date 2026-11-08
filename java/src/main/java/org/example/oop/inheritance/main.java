package org.example.oop.inheritance;

class Main {
    public static void main(String[] args) {
        // Create shelter
        Shelter shelter = new Shelter();
        // Create animals
        Dog dog = new Dog("Rex");
        Cat cat = new Cat ("Murka");
        Parrot parrot = new Parrot ("Kesha");
        // Give animals to a shelter
        shelter.addAnimal(cat);
        shelter.addAnimal(dog);
        shelter.addAnimal(parrot);
        // Sounds
        shelter.makeAllSounds();

        // Create circus
        Circus circus = new Circus();
        // Create performer robot
        Robot robot = new Robot();
        // Give performer to a circus
        circus.addPerformer(dog);
        circus.addPerformer(parrot);
        circus.addPerformer(robot);
        // Show
        circus.startShow();


    }
}