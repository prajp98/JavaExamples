package com.java.concepts.basics;

public class Operators {
    public static void main(String[] args){
        //Arithmetic
        int a = 10, b = 3;
        System.out.println("Addition: " + (a + b));       // 13
        System.out.println("Subtraction: " + (a - b));    // 7
        System.out.println("Multiplication: " + (a * b)); // 30
        System.out.println("Division: " + (a / b));       // 3 (integer division)
        System.out.println("Remainder: " + (a % b));

        //Unary
        int s = 5;
        System.out.println(++s); // Pre-increment → 6
        System.out.println(s++); // Post-increment → 6 (then x becomes 7)
        System.out.println(s);   // 7
        System.out.println(-s);  // -7
        System.out.println(--s); // Pre-decrement
        System.out.println(s--); // Post-decrement
        System.out.println(!(s > 5)); // false

        //Assignment
        int c = 10;
        c += 5; // 15
        c *= 2; // 30
        c -= 20; // 10
        c /= 5; // 2
        c %= 2; // 1
        System.out.println(c);

        //Relational
        int x = 5, y = 10;
        System.out.println(x > y);  // false
        System.out.println(x < y);  // true
        System.out.println(x >= y);  // false
        System.out.println(x <= y);  // true
        System.out.println(x == 5); // true
        System.out.println(x != 5); // false

        String s1 = new String("Java");
        String s2 = new String("Java");

        System.out.println(s1 == s2);       // false (compares references)
        System.out.println(s1.equals(s2));  // true (compares values)

        //Logical
        boolean p = true, q = false;
        System.out.println(p && q); // false
        System.out.println(p || q); // true
        System.out.println(!p);     // false

        //Bitwise
        System.out.println(a & b); // 1  (0101 & 0011 = 0001)
        System.out.println(a | b); // 7  (0101 | 0011 = 0111)
        System.out.println(a ^ b); // 6  (0101 ^ 0011 = 0110)
        System.out.println(~a);    // -6 (bitwise NOT)
        System.out.println(a>>1);
        System.out.println(a<<1);
        System.out.println(a>>>1);

        int t = -8;
        System.out.println(t >> 2);  // -2 (sign bit preserved)
        System.out.println(t >>> 2); // large positive number (fills with 0s)


        //Ternary
        int n = 10;
        String result = (n % 2 == 0) ? "Even" : "Odd";
        System.out.println(result); // Even




    }
}
