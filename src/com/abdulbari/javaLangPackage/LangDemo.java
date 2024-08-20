package com.abdulbari.javaLangPackage;

import java.lang.Object;

public class LangDemo {
    public static void main(String[] args) {
        Object obj = new Object();
        Object obj2 = new Object();

        System.out.println(obj.equals(obj2));  // this calls toString method
    }
}
