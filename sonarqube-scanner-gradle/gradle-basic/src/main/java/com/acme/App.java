package com.acme;

public class App {
    public static void main(String[] args) {
        SonarQubeExample example = new SonarQubeExample();
        example.printMessage("Hello World");
        example.printMessage("Hello World");
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
}
