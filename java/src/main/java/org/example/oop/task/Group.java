package org.example.oop.task;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
