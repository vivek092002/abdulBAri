package com.abdulbari.inheritance;

class Super{
    public void display(){
        System.out.println("Super class Display");
    }
}

class Sub extends Super{
    @Override
    public void display(){
        System.out.println("Sub class Display");
    }
}

public class OverRiding {
    public static void main(String[] args) {
        Super sup = new Super();
        sup.display();
        Sub su = new Sub();
        su.display();

        Super sup1= new Sub();
        sup1.display();
    }
}
