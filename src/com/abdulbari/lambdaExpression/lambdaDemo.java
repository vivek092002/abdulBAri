package com.abdulbari.lambdaExpression;

@FunctionalInterface
interface MyLambda{
    public void Display();
}
/*
class My implements MyLambda{
    @Override
    public void Display() {
        System.out.println("Hello World");
    }
}
*/

public class lambdaDemo {
    public static void main(String[] args) {
        /*
        MyLambda m = new MyLambda() {
            @Override
            public void Display() {

            }
        };
        m.Display();
         */
        //instead of this call the method this way
        MyLambda m = ()->{
            System.out.println("Hello World");
        };
        m.Display();
    }
}
