package com.abdulbari.inheritance;

class Parent{
    Parent(){
        System.out.println("Non Param of Parent");
    }
    Parent(int x){
        System.out.println("Param of Parent " + x);
    }
}

class Child extends Parent{
    Child(){
        System.out.println("Non Param of Child");
    }
    Child(int y){
        System.out.println("Param of Child " + y);
    }
    Child(int x, int y){
        super(x);
        System.out.println("2 param of child " + y);
    }
}

public class paraConstructorInheritence {
    public static void main(String[] args) {
        Child c1 = new Child(11,10);
    }
}
