package org.example.oop.task;

public class Programmer {
    private String name;
    private String company;
    private String position;

    public Programmer(String name, String company) {
        this.name = name;
        this.company = company;
        this.position = "intern";
    }

    public String getPosition() {
        return position;
    }

    public void work() {
        position = switch (position) {
            case "intern" -> "junior";
            case "junior" -> "middle";
            case "middle" -> "senior";
            case "senior" -> "lead";
            case "lead" -> "lead";
            default -> position;
        };
    }
}
