package com.abdulbari.exceptionHandling;
import java.io.*;
import java.rmi.server.ExportException;
import java.util.*;

public class ResourcesDemo {

    static FileInputStream fi;
    static Scanner sc;

    static void Divie() throws Exception{
        fi = new FileInputStream("/Users/JAVA/JAVApractice/src/Com/abdulbari/exceptionHandling/my.txt");
        try{
            sc = new Scanner(fi);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(a/b);
            System.out.println(a/c);
        } finally {
            fi.close();
            sc.close();
        }

    }

    public static void main(String[] args) throws Exception{
        try {
            Divie();
        } catch (Exception e){
            System.out.println(e);
        }

    }
}
