package org.example.oop.task;

class Main {
    public static void main(String[] args) {
        Bell kitchen = new Bell();
        Bell door = new Bell();

        kitchen.sound();
        kitchen.sound();
        kitchen.sound();
        kitchen.sound();
        door.sound();

        Balance Wallet = new Balance(0,0);
        System.out.println(Wallet.getSituation());

        Programmer Anna = new Programmer("anna", "Umschool");
        System.out.println(Anna.getPosition());
        Anna.work();
        Anna.work();
        System.out.println(Anna.getPosition());
        Anna.work();
        System.out.println(Anna.getPosition());
        Anna.work();
        System.out.println(Anna.getPosition());
        Anna.work();
        System.out.println(Anna.getPosition());
    }
}