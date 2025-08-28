package com.java.concepts.basics;

public class Throw{
    static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above!");
        } else {
            System.out.println("Valid age: " + age);
        }
    }

    public static void main(String[] args) {
        validateAge(20);
        // validateAge(15); // Uncomment to see IllegalArgumentException
    }
}