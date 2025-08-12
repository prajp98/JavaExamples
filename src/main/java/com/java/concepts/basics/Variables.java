package com.java.concepts.basics;

public class Variables {

    int instanceVar;
    static int shared;

    int value;

    public static void main(String[] args){
        Variables v = new Variables();
        v.method();
        // No error
        System.out.println("Instance variable "+v.instanceVar);

        Variables v2 = new Variables();
        v.increment();
        v2.increment();
        System.out.println("Static variable "+Variables.shared);

        final int DAYS_IN_WEEK = 7;
        System.out.println(DAYS_IN_WEEK);

        // Wrong usage:
        // DAYS_IN_WEEK = 8;
        // ERROR: cannot assign a value to final variable DAYS_IN_WEEK

        v.display();
    }

    public void method(){
        //Error - might not have been initialized
        //int x;
        int x=10;
        System.out.println("Local variable "+x);
    }

    public void increment(){
        shared++;
    }

    public void display(){
        int value=20;
        System.out.println(value);
        System.out.println(this.value);
    }
}
