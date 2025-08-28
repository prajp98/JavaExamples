package com.java.concepts.basics;

public class TryCatch {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block always executes!");
        }
        System.out.println("Program continues...");
    }
}
