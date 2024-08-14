package com.abdulbari.innerClasses;

interface My{
     void display();
}

class Outer2{
    public void meth(){
        My m = new My() {
            @Override
            public void display() {
                System.out.println("Hello");
            }
        };
        m.display();
    }
}

public class anonymousInnerClass {
    public static void main(String[] args) {

    }
}
