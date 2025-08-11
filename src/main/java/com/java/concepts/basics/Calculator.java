package com.java.concepts.basics;

public class Calculator {

    public static void main(String[] args){

        System.out.println("Add 1 + 2 = "+add(1,2));
        //Type check error
        //int number = "Hello";
    }

    //public static int add(int a, int b{ - Syntax Error

    //Static *** Non-static methods cannot be referenced from a static context
    public static int add(int a, int b){
        return a+b;
    }
}
