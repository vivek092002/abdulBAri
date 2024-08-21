package com.abdulbari.lambdaExpression;

interface MyLambda3{
    public void display(String st);
}

public class LambdaDemo1 {

    public static void revese(String st){
        StringBuffer str = new StringBuffer(st);
        str.reverse();
        System.out.println(str);
    }

    public static void main(String[] args) {
        MyLambda3 m = LambdaDemo1::revese;
       // MyLambda3 m = System.out::println;
        m.display("HELLO");
    }
}
