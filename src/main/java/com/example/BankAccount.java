package com.example;

public class BankAccount {

    private float balance;

    public float getBalance() {
        return balance;
        
    }

    public void deposit(float amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }

        balance += amount;
    }

    public void withdraw(float amount) {

        if (amount > balance) {
            throw new IllegalArgumentException("Withdrawal amount exceeds balance");
           // return;
        }

        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }

        balance -= amount;
    }

}
