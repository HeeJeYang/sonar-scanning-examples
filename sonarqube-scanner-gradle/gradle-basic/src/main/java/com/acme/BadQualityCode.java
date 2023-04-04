package com.acme;

public class BadQualityCode {
    // 상수명을 소문자로 작성하여 규칙 위반
    public static final int bad_constant = 42;

    public static void main(String[] args) {
        // 변수명을 대문자로 작성하여 규칙 위반
        int X = 10;

        // for 루프 내에서 변수를 초기화하지 않고 사용하여 규칙 위반
        for (int i = 0; i < X; i++) {
            int someValue;
//            System.out.println("Loop iteration: " + i + ", uninitialized value: " + someValue);
        }

        // 빈 catch 블록 사용하여 규칙 위반
        try {
            int divisionResult = X / 0;
        } catch (ArithmeticException e) {
        }

        System.out.println("Main Test");
        // System.exit() 사용하여 규칙 위반
        System.exit(0);
    }

    // 미사용 메서드 생성하여 규칙 위반
    private static void unusedMethod() {
        System.out.println("This method is never used.");
    }

    // 인자가 없는 메서드에서 인자를 사용하여 규칙 위반
//    private static int addNumbers() {
//        int x = 3;
//        int y = 5;
//        return x + y + z;
//    }

    // 중복 코드 생성하여 규칙 위반
    private static void duplicateCode() {
        System.out.println("This is duplicate code.");
        System.out.println("This is duplicate code.");
        System.out.println("This is duplicate code.");
        System.out.println("This is duplicate code.");
        System.out.println("This is duplicate code.");
    }
}