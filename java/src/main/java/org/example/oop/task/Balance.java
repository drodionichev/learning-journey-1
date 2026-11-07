package org.example.oop.task;

public class Balance {
    private int left;
    private int right;

    public Balance(){
        this(0,0);
    }

    public Balance(int left, int right) {
        if (left < 0 || right < 0) {
            throw new IllegalArgumentException("The amount must be positive or equal to zero");
        }
        this.left = left;
        this.right = right;
    }

    public void addRight(int amount){
        validateAmount(amount);
        right += amount;
    }

    public void addLeft(int amount){
        validateAmount(amount);
        left += amount;
    }

    public String getSituation(){
        if(right == left){
            return "=";
        } else if (right > left) {
            return "r";
        } else {
            return "l";
        }
    }
    private void validateAmount(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("The amount must be positive");
        }
    }
}
