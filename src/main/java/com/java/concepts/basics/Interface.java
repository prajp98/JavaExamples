package com.java.concepts.basics;

// Interface
interface Animal1 {
    void sound(); // abstract method
    void eat();   // abstract method
}

// Class implementing the interface
class Dog1 implements Animal1 {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats bones");
    }
}

class Cat1 implements Animal1 {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }

    @Override
    public void eat() {
        System.out.println("Cat drinks milk");
    }
}

public class Interface {
    public static void main(String[] args) {
        Animal1 dog = new Dog1();
        dog.sound(); // Output: Dog barks
        dog.eat();   // Output: Dog eats bones

        Animal1 cat = new Cat1();
        cat.sound(); // Output: Cat meows
        cat.eat();   // Output: Cat drinks milk
    }
}

