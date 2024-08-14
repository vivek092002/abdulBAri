package com.abdulbari.interfaces;

interface test{
    void meth1();
    void meth2();
}

class test2 implements test{

    @Override
    public void meth1(){
        System.out.println("Meth1 of class test2");
    }
    @Override
    public void meth2(){
        System.out.println("Meth2 of class test2");
    }
    public void meth3(){
        System.out.println("Meth3 of class test2");
    }
}

public class interfacePractice {
    public static void main(String[] args) {
        test t = new test2() ;
    }
}
