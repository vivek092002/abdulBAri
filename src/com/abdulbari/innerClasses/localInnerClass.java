package com.abdulbari.innerClasses;

class Outer1{
    void outerdisplay(){
        class Inner1{
            void innerdisplay(){
                System.out.println("Hello");
            }
        }

        Inner1 i = new Inner1();
        i.innerdisplay();
    }
}

public class localInnerClass {
    public static void main(String[] args) {
        Outer1 i = new Outer1();
        i.outerdisplay();
    }
}
