package org.example.oop.task;

public class Student {
    private String name;
    private String group;

    public Student(String name, String group) {
        this.name = name;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student name: " + name + ", Group: " + group;
    }
}
