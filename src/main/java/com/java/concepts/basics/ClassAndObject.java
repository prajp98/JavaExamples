package com.java.concepts.basics;

class Car{
    String brand;
    int speed;

    void drive(){
        System.out.println(brand+"  "+speed);
    }
}
public class ClassAndObject {
    public static void main(String[] args){
        Car car1 = new Car();
        car1.brand = "Tesla";
        car1.speed = 120;
        car1.drive();
    }
}
