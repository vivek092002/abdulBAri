package com.abdulbari.innerClasses;

class Outer{
    int x = 10;

    //inner class
    class Inner{
        int y = 20;
        void innerDisplay(){
            System.out.println(x);
            System.out.println(y);
        }
    }

    void outerDisplay(){
        Inner i = new Inner();
        i.innerDisplay();
        System.out.println(i.y);
    }
}

public class Nested {
    public static void main(String[] args) {
        Outer ou = new Outer();
        ou.outerDisplay();

        //for calling inner class
        Outer.Inner i = new Outer().new Inner();
        i.innerDisplay();
    }
}
