package com.java.concepts.basics;

class Car1{
    String brand;
    int year;
}
class Car2 {
    String brand;
    int year;

    // Parameterized constructor
    Car2(String b, int y) {
        brand = b;
        year = y;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

class Car3 {
    String brand;
    int year;

    // Default constructor
    Car3() {
        brand = "Unknown";
        year = 0;
    }

    // Parameterized constructor
    Car3(String b, int y) {
        brand = b;
        year = y;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}
public class Constructors {
    public static void main(String[] args){
        //Default
        Car1 car1 = new Car1();  // default constructor called
        System.out.println(car1.brand); // null
        System.out.println(car1.year);  // 0

        //Parameterized
        Car2 car2 = new Car2("Tesla", 2022);
        car2.displayDetails(); // Brand: Tesla, Year: 2022

        //Constructor overloading
        Car3 car3 = new Car3();                  // calls default constructor
        Car3 car4 = new Car3("Tesla", 2022);     // calls parameterized constructor

        car3.displayDetails(); // Brand: Unknown, Year: 0
        car4.displayDetails(); // Brand: Tesla, Year: 2022
    }
}
