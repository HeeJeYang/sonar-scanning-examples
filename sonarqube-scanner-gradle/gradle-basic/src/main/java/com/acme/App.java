package com.acme;

public class App {
    public static void main(String[] args) {
        App example = new App();
        example.printMessage("Hello World");
        example.printMessage("Hello World");
        example.checkCredentials(null, "password");
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