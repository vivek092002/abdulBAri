package com.abdulbari.javaDoc.annoDemo;

abstract class Parent{
    abstract public void display();
}

class Child extends Parent{

    @Override
    public void display(){

    }
}

class OldClass{
    public void display(){
        System.out.println("HEllO");
    }
    @Deprecated
    public void show(){
        System.out.println("HI");
    }
}

public class annoDemo {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {


        OldClass oc = new OldClass();
        oc.show();

    }
}
