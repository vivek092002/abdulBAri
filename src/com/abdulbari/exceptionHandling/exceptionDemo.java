package com.abdulbari.exceptionHandling;

public class exceptionDemo {
    public static void main(String[] args) {
        int[] A = {0,1,2,3,4};
        int c;
        try {
            try {
               c = A[1] / A[0];
               System.out.println("Result is : " + c);
            } catch (ArithmeticException e) {
               System.out.println("Denominator is zero");
            }

            System.out.println(A[5]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Out of Bound");
        }

        System.out.println("BYE");
    }
}
