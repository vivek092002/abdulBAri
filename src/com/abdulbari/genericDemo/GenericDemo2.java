package com.abdulbari.genericDemo;

public class GenericDemo2 {
    public static void main(String[] args) {
        Object[] obj = new Object[3];

        obj[0] = "HI";
        obj[1] = "Kumar";
        obj[2] = new char[10];

        String str;
        for (int i = 0; i < 3; i++) {
            str = (String)obj[i];
            System.out.println(str);
        }


    }
}
