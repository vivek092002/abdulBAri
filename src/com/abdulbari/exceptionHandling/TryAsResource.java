package com.abdulbari.exceptionHandling;

import java.io.FileInputStream;
import java.util.Scanner;

public class TryAsResource {

    static void Divide() throws Exception {
        try(FileInputStream fi = new FileInputStream("/Users/JAVA/JAVApractice/src/Com/abdulbari/exceptionHandling/my.txt"); Scanner sc = new Scanner(fi)){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(a/b);
            System.out.println(a/c);

        }
    }

    public static void main(String[] args) throws Exception{
        try {
            Divide();
        } catch (Exception e){
            System.out.println(e);
        }

    }
}
