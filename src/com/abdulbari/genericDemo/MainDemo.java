package com.abdulbari.genericDemo;

public class MainDemo<T>{

    //defining generic
    T data[] = (T[]) new Object[3];

    public static void main(String[] args) {
        MainDemo<String> gd = new MainDemo();
        gd.data[0] = "HI";
        gd.data[1] = "bye";

        String str = gd.data[0];
        System.out.println(str);
    }
}
