package com.abdulbari.methods;

public class methodPractice {
    public static void main(String[] args) {
        int a= 10;
        int b = 8, c;
        c = max(a,b);
        System.out.println(c);
    }
    static int max(int a, int b){
        if (a>b){
            return a;
        }else {
            return b;
        }
    }
}
