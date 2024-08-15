package com.abdulbari.exceptionHandling;

public class FinallBlock {

    static void meth1() throws Exception{
        try{
            throw new Exception();
        } finally {
            System.out.println("Final Mesaage");
        }
    }

    public static void main(String[] args) {
        try {
            meth1();
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
