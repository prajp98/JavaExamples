package com.java.concepts.basics;

class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

public class CustomException {
    static void withdraw(int amount) throws InvalidAmountException {
        if (amount < 0) {
            throw new InvalidAmountException("Withdrawal amount cannot be negative");
        } else {
            System.out.println("Withdrawn: " + amount);
        }
    }

    public static void main(String[] args) {
        try {
            withdraw(-100);
        } catch (InvalidAmountException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}

