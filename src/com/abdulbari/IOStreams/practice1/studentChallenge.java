package com.abdulbari.IOStreams.practice1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class studentChallenge {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("/Users/JAVA/JAVApractice/src/com/abdulbari/IOStreams/practice1/source.txt");
        } catch (IOException e) {
            System.out.println("FIle Not Found");
        }

        try {
            fos = new FileOutputStream("/Users/JAVA/JAVApractice/src/com/abdulbari/IOStreams/practice1/source2.txt");
        } catch (IOException e) {
            System.out.println("File Not Found");
        }

        int b;
        while ((b = fis.read())!=-1) {
            if (b>=65 || b<=90){
                fos.write(b+32);
            } else {
                fos.write(b);
            }
        }
        fis.close();
        fos.close();
    }
}
