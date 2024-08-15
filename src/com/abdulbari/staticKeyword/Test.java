package com.abdulbari.staticKeyword;

class Test1{
    static int x = 10;
    int y = 20;
    void show(){
        System.out.println(x + " " + y);
    }
    static void display(){
        System.out.println(x);
    }
}

public class Test {
    public static void main(String[] args) {
        Test1 t = new Test1();
        t.show();
        t.x = 30;
        t.y = 25;

        Test1 t2 = new Test1();
        t2.show();
    }
}
