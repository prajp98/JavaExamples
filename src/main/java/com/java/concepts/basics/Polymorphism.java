package com.java.concepts.basics;

// Compile-time Polymorphism (Overloading)
class MathUtils {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    //Error Case: Duplicate method signature
    // int add(int x, int y) { return x + y; }
    // Compilation error: method already defined
}

// Runtime Polymorphism (Overriding)
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        MathUtils math = new MathUtils();
        System.out.println(math.add(2, 3));
        System.out.println(math.add(2.5, 3.5));

        Animal a1 = new Dog();
        Animal a2 = new Cat();
        a1.sound(); // Dog barks
        a2.sound(); // Cat meows
    }
}
