package com.abdulbari.IOStreams.practice1;

import java.io.*;

public class ByteDemo {
    public static void main(String[] args) throws Exception{
        byte b[] = {'a','b','c','d','e','f','g','h','i','j'};
        ByteArrayInputStream bis = new ByteArrayInputStream(b);

/*
        //first form of printing the stream

        int x ;
        while ((x = bis.read()) != -1){
            System.out.println((char) x);
        }
        bis.close();

 */
        //second form of printing
        String str = new String(bis.readAllBytes());
        System.out.println(str);
        bis.close();

    }
}
