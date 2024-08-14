package com.abdulbari.abstractClass;

abstract class Super{
    public Super() {
        System.out.println("Super Constructor");
    }
    public void meht1(){
        System.out.println("Super Method1");
    }

    abstract public void meth2();
}

class Sub extends Super{

    @Override
    public void meth2(){
        System.out.println("Sub Method2");
    }
}


public class abstractClassExample {
    public static void main(String[] args) {
        Super sp = new Sub();
    }
}
