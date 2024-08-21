package com.abdulbari.lambdaExpression;

interface MyLambda1{

    public int display(int x, int y);
    /*
    for string single parameter
        public void display(String str);

     */
}

public class paramsLambda {
    public static void main(String[] args) {
        MyLambda1 m = (a,b)->{
            return a+b;
        };
        System.out.println(m.display(10,20));
       /*
       //for string
        MyLambda1 m = (s)->{
            System.out.println(s);
        };
        m.display("Hello world");

        */
    }
}
