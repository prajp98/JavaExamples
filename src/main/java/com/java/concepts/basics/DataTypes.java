package com.java.concepts.basics;

public class DataTypes {
    public static void main(String[] args){

        byte age = 25;
        // out of range of byte
        // Error: possible lossy conversion from int to byte
        // byte age1 = 128;
        System.out.println(age);

        // -128 due to overflow
        byte age1 = (byte) 128;
        System.out.println(age1);


        short year = 2025;

        int number = 140000000;

        long distance = 3000000000L;

        float price = 99.99f;

        double pi = 3.14159265359;

        //Double to float incompatible types
        //float wrong = 99.99;

        char letter = 'A';

        boolean yes = true;

        String name = "John";

        int[] numbers = {1,2,3,4};
        int[] numbers1 = new int[10];
        numbers1[0] = 1;

        // Type casting - Small to large - Implicit
        int num = 100;
        long bigNum = num;

        //Large to small - Explicit
        double p = 10.99;
        float x = (float) p;

        final int MAX_USERS = 100;
        // Error: cannot assign a value to final variable
        // MAX_USERS = 101;

        int uninitialized;
        //  Error: variable uninitialized might not have been initialized
        // System.out.println(uninitialized);

        class Demo {
            int x;       // defaults to 0
            boolean b;   // defaults to false
            String s;    // defaults to null

            void show() {
                System.out.println(x); // 0
                System.out.println(b); // false
                System.out.println(s); // null
            }
        }

        Demo demoObject = new Demo();
        demoObject.show();

        int a = 10;
        Integer obj = Integer.valueOf(a); // Boxing
        int b = obj.intValue();           // Unboxing

        Integer autoBox = a; // Auto-boxing
        int autoUnbox = autoBox; // Auto-unboxing








    }


}
