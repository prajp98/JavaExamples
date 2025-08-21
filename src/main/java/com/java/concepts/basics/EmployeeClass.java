package com.java.concepts.basics;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void work() {
        System.out.println(name + " is working.");
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, double salary, String department) {
        super(name, salary); // call Employee constructor
        this.department = department;
    }

    @Override
    void work() {
        System.out.println(name + " is managing the " + department + " department.");
    }
}

class Developer extends Employee {
    String language;

    Developer(String name, double salary, String language) {
        super(name, salary);
        this.language = language;
    }

    @Override
    void work() {
        System.out.println(name + " is coding in " + language + ".");
    }
}

public class EmployeeClass {
    public static void main(String[] args) {
        Manager m = new Manager("Alice", 90000, "HR");
        Developer d = new Developer("Bob", 80000, "Java");

        m.work();
        d.work();
    }
}

