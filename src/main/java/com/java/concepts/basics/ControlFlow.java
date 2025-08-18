package com.java.concepts.basics;

public class ControlFlow {
    public static void main(String[] args){
        //If
        int age = 20;
        if (age >= 18) {
            System.out.println("You are eligible to vote."); // This will run
        }
        //If else
        int marks = 45;
        if (marks >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail"); // Runs because marks < 50
        }
        //Else if
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 60) {
            System.out.println("Grade B"); // Runs
        } else if (marks >= 40) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }
        //Switch
        int day = 3;
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break; // Runs
            case 4: System.out.println("Thursday"); break;
            default: System.out.println("Invalid day");
        }
        //For
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        //While
        int i = 1;
        while (i <= 3) {
            System.out.println("i = " + i);
            i++;
        }
        //Do while
        i = 5;
        do {
            System.out.println("Executed at least once. i = " + i);
            i++;
        } while (i < 5); // Runs once, then stops

        //For-each
        int[] numbers = {1, 2, 3, 4};

        for (int num : numbers) {
            System.out.println(num);
        }

        //Break
        for (i = 1; i <= 5; i++) {
            if (i == 3) break;
            System.out.println(i); // Prints 1, 2
        }

        //Continue
        for (i = 1; i <= 5; i++) {
            if (i == 3) continue;
            System.out.println(i); // Skips 3
        }

        //Return
        System.out.println("Start");

        if (true) {
            return; // Method ends here
        }

        // This line will never execute
        // System.out.println("End");
    }
}
