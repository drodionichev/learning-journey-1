package org.example.oop.task;

public class Payer {
    private String surname;
    private String name;
    private String address;
    private String cardNumber;

    public Payer(String surname, String name, String address, String cardNumber) {
        this.surname = surname;
        this.name = name;
        this.address = address;
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "{Payer: " + surname + " " + name + ", address: " + address + ", card: " + cardNumber + "}";
    }
}
