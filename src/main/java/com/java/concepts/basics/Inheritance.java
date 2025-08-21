package com.java.concepts.basics;

class Vehicle{
    int speed = 50;

    void drive(){
        System.out.println("Speed is "+speed);
    }
}

class Car4 extends Vehicle{
    int gear = 5;

    void display(){
        System.out.println("Car with " + gear + " gears, running at " + speed + " km/h.");
    }

    @Override
    void drive(){
        System.out.println("Car is driving safely at speed " + speed);
    }
}
public class Inheritance {
    public static void main(String[] args){
        Car4 car = new Car4();
        car.drive();
        car.display();

        Vehicle v = new Car4();
        v.drive();
        //v.display(); Error
    }

}
