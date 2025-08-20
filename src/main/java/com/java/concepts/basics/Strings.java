package com.java.concepts.basics;

public class Strings {
    public static void main(String[] args){
        //String Literal
        String str = "Hello";
        System.out.println(str);
        //new
        String s1 = new String("Java");
        String s2 = new String("Java");
        System.out.println(s1 == s2);   // false (different objects in heap)
        System.out.println(s1.equals(s2)); // true (compares content)

        //Immutable
        String s3 = "Hello";
        s3.concat(" World");
        System.out.println(s3); // Output: Hello (unchanged)

        String newStr = s3.concat(" World");
        System.out.println(newStr); // Output: Hello World

        String s = "Java Programming";
        System.out.println(s.length());          // 16
        System.out.println(s.charAt(5));         // P
        System.out.println(s.toLowerCase());     // java programming
        System.out.println(s.toUpperCase());     // JAVA PROGRAMMING
        System.out.println(s.indexOf("a"));      // 1
        System.out.println(s.lastIndexOf("a"));  // 11
        System.out.println(s.substring(5));      // Programming
        System.out.println(s.substring(0, 4));   // Java
        System.out.println(s.replace("Java", "C++")); // C++ Programming
        System.out.println(s.contains("Pro"));   // true
        System.out.println(s.startsWith("Java"));// true
        System.out.println(s.endsWith("ing"));   // true
        System.out.println(s.equals("java programming")); // false
        System.out.println(s.equalsIgnoreCase("java programming")); // true
        System.out.println(s.trim());            // removes leading/trailing spaces

        //Comparison
        s1 = "Java";
        s2 = "Java";
        s3 = new String("Java");

        System.out.println(s1 == s2);     // true
        System.out.println(s1 == s3);     // false
        System.out.println(s1.equals(s3));// true

        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb); // Hello World

        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.append(" Java");
        System.out.println(sb1); // Hello Java

    }
}
