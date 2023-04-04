package com.acme;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
public class App {
    public static void main(String[] args) {
        App example = new App();
        example.readFile();
    }

    public void readFile() {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("file.txt");
            int data = inputStream.read();
            while (data != -1) {
                System.out.print((char) data);
                data = inputStream.read();
            }
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        } finally {
            // Bug: Missing try-catch block around close() method, which can throw an IOException
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void printMessage(String message) {
        System.out.println(message);
        System.out.println(message);
    }

    public int addNumbers(int a, int b) {
        int result = a + b;
        return result;
    }

    public void unusedMethod() {
        System.out.println("This method is not used.");
    }

    public String getGreeting() {
        return "Hello world.";
    }

    public boolean checkCredentials(String user, String password) {
        // Bug: Potential null pointer exception
        if (user.isEmpty()) {
            return false;
        }

        // Vulnerability: Hardcoded password
        String hardcodedPassword = "secret123";
        return password.equals(hardcodedPassword);
    }
}