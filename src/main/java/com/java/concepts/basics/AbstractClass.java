package com.java.concepts.basics;

abstract class Vehicle1 {
    abstract void start(); // Abstract method (no body)

    void stop() { // Concrete method
        System.out.println("Vehicle has stopped.");
    }
}

// Concrete subclass
class Car5 extends Vehicle1 {
    @Override
    void start() {
        System.out.println("Car starts with a key.");
    }
}

// Another subclass
class Bike extends Vehicle1 {
    @Override
    void start() {
        System.out.println("Bike starts with a kick or button.");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Vehicle1 car = new Car5();
        car.start(); // Output: Car starts with a key.
        car.stop();  // Output: Vehicle has stopped.
        Vehicle1 bike = new Bike();
        bike.start(); // Output: Bike starts with a kick or button.
        bike.stop();  // Output: Vehicle has stopped.
    }
}

