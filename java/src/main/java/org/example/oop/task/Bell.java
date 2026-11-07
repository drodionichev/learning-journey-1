package org.example.oop.task;

public class Bell {
    private boolean nextIsDing = true;

    public void sound() {
        if (nextIsDing) {
            System.out.println("Ding");
        } else {
            System.out.println("Dong");
        }
        nextIsDing = !nextIsDing;
    }
}
