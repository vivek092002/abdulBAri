package com.abdulbari.exceptionHandling;

public class throwsKeyword {

    static int area(int l, int b) throws Exception{

        if (l < 0 || b < 0) {
            throw new Exception("dimensions can't be negative");
        }

        int a = l*b;
        return a;
    }

    public static void meth1() throws Exception{
        int ar = area(-10,2);
        System.out.println(ar);
    }

    public static void main(String[] args) {
        try {
            meth1();
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
