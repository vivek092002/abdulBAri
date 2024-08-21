package com.abdulbari.lambdaExpression;

interface MyLambda2{
    public void display();
}

class UseLambda{
    public void callLambda(MyLambda2 m){
        m.display();
    }
}

class Demo2{
    public void method1(){
        UseLambda ul = new UseLambda();
        ul.callLambda(()->{
            System.out.println("HI");
        });
    }
}

class Demo{
    int temp = 10;
    public void method1(){
        int count = 0;
        MyLambda2 m = ()->{
            int x = 0;
            System.out.println("HI");
            System.out.println("Bye" + x);
            System.out.println(temp++);
            System.out.println(count);
        };
        m.display();
    }
}

public class lamDemo {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.method1();
    }
}
