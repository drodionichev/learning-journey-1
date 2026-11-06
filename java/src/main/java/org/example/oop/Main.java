package org.example.oop;

class Main {
    public static void main(String[] args) {
        Operation tv = new Operation("tv", 1000, true);
        System.out.println("Их категория: " + tv.getCategory());

        Operation salary = new Operation("job", 1000, true);
        System.out.println("Их категория: " + salary.getCategory() + ", " + "Их зарплата: " + salary.isIncome());

        Operation taxi = new Operation("drive", 50000, false);
        System.out.println("Их категория: " + taxi.getCategory() + ", " + "Их зарплата: " +  taxi.getAmount() + ", " + "Есть доход: " + taxi.isIncome());

//      Operation taxi2 = new Operation("drive", -50000, false);

        Wallet myWallet = new Wallet();
        Wallet momWallet = new Wallet();

        myWallet.addIncome(20000);
        myWallet.addIncome(5000);
        momWallet.addIncome(1000);

        System.out.println(myWallet.getBalance());
        System.out.println(momWallet.getBalance());

        Wallet dadWallet = new Wallet(5000);
        dadWallet.addIncome(1000);
        System.out.println(dadWallet.getBalance());

//        Wallet sisterWallet = new Wallet(-1000);

        Wallet madamWallet = new Wallet(20000);
        madamWallet.addExpense(300);
        madamWallet.addExpense(1500);
        System.out.println(madamWallet.getBalance());

        Wallet broWallet = new Wallet(1000);
        broWallet.addExpense(1500);

        System.out.println(broWallet.getBalance());
    }
}