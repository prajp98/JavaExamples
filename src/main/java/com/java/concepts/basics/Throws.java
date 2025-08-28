package com.java.concepts.basics;
import java.io.*;

public class Throws {
    static void readFile() throws IOException {
        FileReader fr = new FileReader("nonexistent.txt"); // Checked Exception
        fr.read();
        fr.close();
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("File not found: " + e);
        }
    }
}

