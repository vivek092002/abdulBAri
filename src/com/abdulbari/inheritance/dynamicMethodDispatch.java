package com.abdulbari.inheritance;

class Super1{
    public void meth1(){
        System.out.println("Super Method1");
    }
    public void meth2(){
        System.out.println("Super Method2");
    }
}

class Sub1 extends Super1{
    @Override
    public void meth2(){
        System.out.println("Sub Method2");
    }

    public void meth3(){
        System.out.println("Sub Method3");
    }
}

public class dynamicMethodDispatch {
    public static void main(String[] args) {
       Super1 sp = new Sub1();
       sp.meth1();
       sp.meth2();
    }
}
