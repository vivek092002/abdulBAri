package com.abdulbari.methods;

public class callingMethods {
    int max(int a, int b){
        if (a>b){
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        callingMethods cm = new callingMethods();
        int a = 10, b = 9, c;
        c = cm.max(a,b);
        System.out.println(c);
    }
}
