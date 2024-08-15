package com.abdulbari.exceptionHandling;

public class programPractice {
    public static void main(String[] args) {
        int a, b, c;
        a = 10;
        b = 0;
        try {
            c = a/b;
            System.out.println("Result is : " + c);
        } catch (ArithmeticException e ){
            System.out.println("Division by zero");
        }
        System.out.println("BYE");
    }
}
